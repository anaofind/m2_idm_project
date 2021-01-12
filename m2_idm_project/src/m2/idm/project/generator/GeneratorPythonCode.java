package m2.idm.project.generator;


import java.util.*;
import m2.idm.project.mLRegression.*;

public class GeneratorPythonCode {
	//Liste contenant les codes générés dans le bon ordre
	private List<String> codeOrdonne = new ArrayList<String>();

	private String pathDataset = "pathDataset";
	private String Xtrain = "X_train", Xtest = "X_test", 
			Ytrain = "Y_train", Ytest = "Y_test", YPred, 
			res="res", CLF="clf", score = "score";
	String ln1 = "leftNumpy1", ln2 = "leftNumpy2"; //ln = leftNumpy
	
	String predVar = "predVars", targetVar = "targetVars";
	double testPercent = 0.0;
	
	private String separator = ",";
	
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
		this.generateEvaluationTypeCode(evalType);

		Algo algoToApply = ml.getAlgo();
		this.generateAlgoCode(algoToApply);

		Calculate whatToCalculate = ml.getCalculate();
		this.generateCalculateCode(whatToCalculate);

		for (String line : this.codeOrdonne) {
			pythonCode += line + "\n";
		}

		//Construct python code from content of the list (codeOrdonne)
		return pythonCode;
	}
	
	private void generateDatasetCode(Dataset ds) {
		String importPart = "import pandas as pd";
		this.codeOrdonne.add(0, importPart);
		this.pathDataset = ds.getData();
		String separator = ds.getSeparator();
		if (separator != null) {
			this.separator = separator;
		}
		//String code =  pathDataset + "=" + "pd.read_csv(" + ds.getData().getValue() + ")";
		//this.codeOrdonne.add(code);
	}

	private void generateVarsCode(Variables vars) {
		String codePred = "", codeTarget = "";

		if(vars != null) {
			codePred = this.predVar + "=" + "pd.read_csv" + "(\"" + this.pathDataset + "\"," + "sep=" + "\"" + this.separator + "\"," +  
					"header=0" + "," + "usecols" + "=["; 
			List<String> predVars = vars.getPredictives().getPredVar();
			codePred += "\""+ predVars.get(0) + "\"";
			for (int i = 1; i<predVars.size(); i++) {
				codePred += ",\"" +predVars.get(i) + "\"";

			}
			codePred += "])";

			this.codeOrdonne.add(codePred);
			codeTarget = this.targetVar + "=" + "pd.read_csv" + "(\"" + this.pathDataset + "\"," + "sep=" + "\"" + this.separator + "\"," +
					"header=0" + "," + "usecols" + "=[";

			List<String> targVars = vars.getTargets().getTargetVar();
			codeTarget += "\""+ targVars.get(0) + "\"";
			for (int i = 1; i<targVars.size(); i++) {
				codeTarget += ",\"" +targVars.get(i) + "\"";

			}
			codeTarget += "])";

			this.codeOrdonne.add(codeTarget);
		} else { //repartition non définie on fixe testPercent = 20%

		}
	}
	
	private void generateEvaluationTypeCode(EvaluationType evalT) {
		if(evalT instanceof Partition) {
			this.generatePartitionCode(evalT);
		} else if(evalT instanceof CrossValidation) {
			this.generateCrossVCode(evalT);
		}
	}

	private void generatePartitionCode(EvaluationType evalT) {
		String importPart = "from sklearn.model_selection import train_test_split";
		this.codeOrdonne.add(0, importPart);
		/*String code = this.trainPart + "," + this.testPart + "=" + "train_test_split" + "("
		//		+ this.pathDataset + "," + "test_size" + "=" + ((Partition)evalT).getTest() + ")";
		//this.codeOrdonne.add(code);*/

		//garde la valeur des repartitions pour génération future du code
		this.testPercent = Double.valueOf(((Partition)evalT).getTest())/100;
		
		//partition des variables connue donc on peut split
		String codePartition = this.Xtrain + "," + this.Xtest  + "," + this.Ytrain + "," + this.Ytest + "=" + "train_test_split" + "("
				+ this.predVar + "," + this.targetVar + "," + "test_size" + "=" + this.testPercent + ")";
		this.codeOrdonne.add(codePartition);
	}

	//Todo
	private void generateCrossVCode(EvaluationType evalT) {
		CrossValidation crossValidation = (CrossValidation)evalT; 
		int c = crossValidation.getC();
		int randomState = crossValidation.getRandomState();
		String importSvmCode = "from sklearn import svm";
		String importCrossValidate = "from sklearn.model_selection import cross_validate";
		this.codeOrdonne.add(0, importCrossValidate);
		this.codeOrdonne.add(0, importSvmCode);
		String codeSvm = this.CLF + "=svm.SVC(kernel='linear', C=" + c + ", random_state=" + randomState + ")";
		String codeScore = this.score + "=cross_validate(" + this.CLF + "," + this.predVar + "," + this.targetVar + ")";
		this.codeOrdonne.add(codeSvm);
		this.codeOrdonne.add(codeScore);
	}

	private void generateCalculateCode(Calculate wtc) { //wtc = whatToCalculate
		String code = this.res + "=";
		switch (wtc.getCalculateType()) {
		case "mean_absolute_error()" :
			code+=this.generateMAECode();
			break;
		case "mean_square_error()" :
			code+=this.generateMSECode();
			break;
		case "median_absolute_error()" :
			code+=this.generateMEACode();
			break;
		}
		this.codeOrdonne.add(code);
		this.codeOrdonne.add("print(" + this.res + ")");
	}

	private String generateMAECode() { //mean absolute error
		String importPart = "from sklearn.metrics import mean_absolute_error";
		this.codeOrdonne.add(0, importPart);
		return this.codePartTwo("mean_absolute_error");
	}

	private String generateMSECode() { //ct = calculateType
		String importPart = "from sklearn.metrics import mean_squared_error";
		this.codeOrdonne.add(0, importPart);
		return this.codePartTwo("mean_squared_error");
	}

	private String generateMEACode() { //median absolute error
		String importPart = "from sklearn.metrics import median_absolute_error";
		this.codeOrdonne.add(0, importPart);
		return this.codePartTwo("median_absolute_error");
	}

	/*
	 * Bout de code commun à whatToCalculate donc créa d'une fonction privée
	 * */
	private String codePartTwo(String fonctionToCall) {
		String code = fonctionToCall + "(" + this.Ytest + "," + this.YPred + ")";
		return code;
	}

	private void generateAlgoCode(Algo algoToApply) {
		if(algoToApply.getAlgo() instanceof LineRegress) {
			this.generateLRCode(algoToApply.getAlgo());
		} else if(algoToApply.getAlgo() instanceof SVR) {
			this.generateSVRCode(algoToApply.getAlgo());
		} else if(algoToApply.getAlgo() instanceof DecisionTreeRegressor) {
			this.generateDTRCode(algoToApply.getAlgo());
		}
	}

	private void generateLRCode(AlgoType toApply) {
		String importNP = "import numpy as np";
		this.codeOrdonne.add(0, importNP);
		String importPart = "from sklearn import linear_model";
		this.codeOrdonne.add(0, importPart);

		//Creation d'un objet regressor
		String leftReg = "regr";
		String codeObjetReg = leftReg + "=" + "linear_model.LinearRegression" + "(" + ")";
		this.codeOrdonne.add(codeObjetReg);

		//fit code
		String fitCode = leftReg +".fit" + "(" + this.Xtrain + "," + this.Ytrain + ")";
		this.codeOrdonne.add(fitCode);

		//predict code generation
		this.YPred = ((LineRegress)toApply).getLeftSidePredict();
		String predictCode = ((LineRegress)toApply).getLeftSidePredict() + "=" + leftReg + ".predict" + "(" + this.Xtest + ")";
		this.codeOrdonne.add(predictCode);
	}

	private void generateDTRCode(AlgoType toApply) {

	}

	private void generateSVRCode(AlgoType toApply) {

	}
}