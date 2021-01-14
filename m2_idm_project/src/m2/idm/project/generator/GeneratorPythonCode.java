package m2.idm.project.generator;


import java.util.*;
import m2.idm.project.mLRegression.*;

public class GeneratorPythonCode {
	//Liste contenant les codes générés dans le bon ordre
	private List<String> codeOrdonne = new ArrayList<String>();

	private String datasVar = "datas";
	private String algoVar = "algo";
	private String predictiveCols = "predictive_cols", targetCols = "target_cols", 
			Xtrain = "X_train", Xtest = "X_test", 
			Ytrain = "Y_train", Ytest = "Y_test", YPred = "predict", 
			resVar="res";
	String ln1 = "leftNumpy1", ln2 = "leftNumpy2"; //ln = leftNumpy

	String predVar = "predVars", targetVar = "targetVars";
	private boolean isCrosssValidation = false;
	double testPercent = 0.0;

	/**
	 * generate python code
	 * @param ml the ml object
	 * @return the python code
	 */
	public String generate(MLRegression ml) {
		String pythonCode = "";

		Dataset dataset = ml.getDataset();
		this.generateDatasetCode(dataset);

		Variables listVar = ml.getVars();
		this.generateVarsCode(listVar);

		EvaluationType evalType = ml.getEvaluation();
		Algo algoToApply = ml.getAlgo();
		Calculate whatToCalculate = ml.getCalculate();
		this.generateEvaluationTypeCode(evalType, algoToApply, whatToCalculate);

		this.codeOrdonne.add("print(" + this.resVar  + ")");

		for (String line : this.codeOrdonne) {
			pythonCode += line + "\n";
		}

		//Construct python code from content of the list (codeOrdonne)
		return pythonCode;
	}

	private void generateDatasetCode(Dataset ds) {
		String importPart = "import pandas as pd";
		this.codeOrdonne.add(0, importPart);
		String pathData = ds.getDataPath();
		String separator = ds.getSeparator();
		if (separator == null) {
			separator = ",";
		}
		String code =  this.datasVar + "=" + "pd.read_csv(\"" + pathData + "\"" + ",sep=\"" + separator + "\")";
		this.codeOrdonne.add(code);
	}

	private void generateVarsCode(Variables vars) {
		String codePred = "", codeTarget = "";
		String codeColsPred = "";
		String codeColsTarg = "";
		List<String> predVars;
		List<String> targVars;
		
		if(vars != null) {
			predVars = vars.getPredictives().getPredVar();
			targVars = vars.getTargets().getTargetVar();

			codeColsPred = this.predictiveCols  + "=[\"" + predVars.get(0)  + "\"";
			for (int i = 1; i<predVars.size(); i++) {
				codeColsPred += ",\"" +predVars.get(i) + "\"";

			}
			codeColsPred += "]";

			codeColsTarg = this.targetCols  + "=[\"" + targVars.get(0)  + "\"";
			for (int i = 1; i<targVars.size(); i++) {
				codeColsTarg += ",\"" +targVars.get(i) + "\"";

			}
			codeColsTarg += "]";

		} else { //repartition non définie on fixe testPercent = 20%
			String codeListColumns = "cols=" + this.datasVar + "." + "columns.values";
			this.codeOrdonne.add(codeListColumns);
			
			codeColsPred = this.predictiveCols + "=" + "cols[0:(len(cols)-1)]";
			codeColsTarg = this.targetCols + "=" + "[cols[-1]]";
		}
		
		this.codeOrdonne.add(codeColsPred);
		this.codeOrdonne.add(codeColsTarg);
		
		codePred = this.predVar + "=" + this.datasVar + "[" + this.predictiveCols + "]";
		codeTarget = this.targetVar + "=" + this.datasVar + "[" + this.targetCols + "]";
		
		this.codeOrdonne.add(codeTarget);
		this.codeOrdonne.add(codePred);
	}

	private void generateEvaluationTypeCode(EvaluationType evalT, Algo algo, Calculate calculate) {
		this.isCrosssValidation = (evalT instanceof CrossValidation);
		if(!isCrosssValidation) {
			this.generatePartitionCode(evalT, algo, calculate);
		} else {
			this.generateCrossVCode(evalT, algo, calculate);
		}
	}

	private void generatePartitionCode(EvaluationType evalT, Algo algo, Calculate calculate) {
		this.generateAlgoCode(algo);
		
		String importPart = "from sklearn.model_selection import train_test_split";
		this.codeOrdonne.add(0, importPart);
		/*String code = this.trainPart + "," + this.testPart + "=" + "train_test_split" + "("
		//		+ this.pathDataset + "," + "test_size" + "=" + ((Partition)evalT).getTest() + ")";
		//this.codeOrdonne.add(code);*/

		//garde la valeur des repartitions pour génération future du code
		NumericValue testValue = ((Partition)evalT).getTest();
		this.testPercent = this.getNumberValue(testValue);
		//this.testPercent = Double.valueOf(((Partition)evalT).getTest())/100;

		//partition des variables connue donc on peut split
		String codePartition = this.Xtrain + "," + this.Xtest  + "," + this.Ytrain + "," + this.Ytest + "=" + "train_test_split" + "("
				+ this.predVar + "," + this.targetVar + "," + "test_size" + "=" + this.testPercent + ")";
		this.codeOrdonne.add(codePartition);
		
		//fit code
		String fitCode = this.algoVar +".fit" + "(" + this.Xtrain + "," + this.Ytrain + ")";
		this.codeOrdonne.add(fitCode);

		String predictCode = this.YPred + "=" + this.algoVar + ".predict" + "(" + this.Xtest + ")";
		this.codeOrdonne.add(predictCode);
		
		this.generateCalculateCode(calculate);
	}

	private double getNumberValue(NumericValue numeric) {
		double value = 0;
		if (numeric instanceof FLOAT) {
			int i = ((FLOAT) numeric).getValue();
			int d = ((FLOAT) numeric).getDecimal();
			value = i + ((double)d/(Math.pow(10, String.valueOf(d).length())));
		} else {
			double f = this.getNumberValue(((PERCENT) numeric).getFloat());
			value = f/100;
		}
		return value;
	}

	//Todo
	private void generateCrossVCode(EvaluationType evalT, Algo algo, Calculate calculate) {
		this.generateAlgoCode(algo);
		this.generateCalculateCode(calculate);

		String calculateType = this.getScoringCalculate(calculate);

		CrossValidation crossValidation = (CrossValidation)evalT; 
		int k = crossValidation.getK();
		String importSvmCode = "from sklearn import svm";
		String importCrossValidate = "from sklearn.model_selection import cross_val_score";
		this.codeOrdonne.add(0, importCrossValidate);
		this.codeOrdonne.add(0, importSvmCode);
		String codeScore = this.resVar + "=cross_val_score(" + this.algoVar + "," + this.predVar + "," + this.targetVar + ",scoring=\"" + calculateType + "\",cv=" + k + ")";
		this.codeOrdonne.add(codeScore);
	}

	private void generateCalculateCode(Calculate wtc) { //wtc = whatToCalculate
		String calculate = wtc.getCalculateType();
		String importCode = "";
		switch (calculate) {
		case "mean_absolute_error" :
			importCode = "from sklearn.metrics import mean_absolute_error";
			break;
		case "mean_squared_error" :
			importCode = "from sklearn.metrics import mean_squared_error";
			break;
		case "median_absolute_error" :
			importCode = "from sklearn.metrics import median_absolute_error";
			break;
		}
		if (importCode != "") {
			this.codeOrdonne.add(0, importCode);
			if (! this.isCrosssValidation) {
				this.codeOrdonne.add(this.codePartTwo(calculate));	
			}
		}
	}

	private String getScoringCalculate(Calculate calculate) {
		switch (calculate.getCalculateType()) {
		case "mean_absolute_error" :
			return "neg_mean_absolute_error";
		case "mean_squared_error" :
			return "neg_mean_squared_error";
		case "median_absolute_error" :
			return "neg_median_absolute_error";
		}

		return "neg_mean_squared_error";
	}

	/*
	 * Bout de code commun à whatToCalculate donc créa d'une fonction privée
	 * */
	private String codePartTwo(String fonctionToCall) {
		String code = this.resVar + "=" + fonctionToCall + "(" + this.Ytest + "," + this.YPred + ")";
		return code;
	}

	private void generateAlgoCode(Algo algoToApply) {
		String importNP = "import numpy as np";
		this.codeOrdonne.add(0, importNP);

		//		AlgoType algoType = algoToApply.getAlgo();
		//		if(algoType instanceof LineRegress) {
		//			this.generateLRCode(algoType);
		//		} else if(algoType instanceof SVR) {
		//			this.generateSVRCode(algoType);
		//		} else if(algoType instanceof DecisionTreeRegressor) {
		//			this.generateDTRCode(algoType);
		//		}

		String algoType = algoToApply.getAlgo();

		switch (algoType) {
		case "line_regress" :
			this.generateLRCode();
			break;
		case "decision_tree_regressor" :
			this.generateDTRCode();
			break;
		case "svr": 
			this.generateSVRCode();
			break;
		}
	}

	private void generateLRCode() {
		String importPart = "from sklearn import linear_model";
		this.codeOrdonne.add(0, importPart);

		//Creation d'un objet regressor
		String codeObjetReg = this.algoVar + "=" + "linear_model.LinearRegression" + "(" + ")";
		this.codeOrdonne.add(codeObjetReg);
	}

	private void generateDTRCode() {
		String importPart = "from sklearn.tree import DecisionTreeRegressor";
		this.codeOrdonne.add(0, importPart);

		//Creation d'un objet regressor
		String codeObjetReg = this.algoVar + "=" + "DecisionTreeRegressor" + "(" + ")";
		this.codeOrdonne.add(codeObjetReg);
	}

	private void generateSVRCode() {
		String importPart = "from sklearn.svm import SVR";
		this.codeOrdonne.add(0, importPart);

		// conversion de la targetVar en tableau à une dimension
		String codeConvertTargetVar = this.targetVar + "=" + this.targetVar + ".values.ravel()";
		this.codeOrdonne.add(codeConvertTargetVar);
		
		//Creation d'un objet regressor
		String codeObjetReg = this.algoVar + "=" + "SVR" + "(" + ")";
		this.codeOrdonne.add(codeObjetReg);
	}
}