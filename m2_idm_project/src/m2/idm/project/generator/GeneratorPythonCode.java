package m2.idm.project.generator;


import java.util.*;
import m2.idm.project.mLRegression.*;

public class GeneratorPythonCode extends GeneratorCodeImpl{
	
	private String varPred = "preds", varTarget = "targs", varTrainPred = "pred_train", varTestPred = "pred_test", varTrainTarget = "target_train", varTestTarget = "target_test";
	
	@Override
	public String getExtension() {
		return "py";
	}

	@Override
	public void generateDatasetCode(Dataset ds) {
		String importPart = "import pandas as pd";
		this.addImportCode(importPart);
		String pathData = ds.getDataPath();
		String separator = ds.getSeparator();
		if (separator == null) {
			separator = ",";
		}
		String code =  this.varDatas + "=" + "pd.read_csv(\"" + pathData + "\"" + ",sep=\"" + separator + "\")";
		this.addLineCode(code);
	}

	@Override
	public void generateVarsCode(Variables vars) {
		String codePred = "", codeTarget = "";
		String codeColsPred = "";
		String codeColsTarg = "";
		List<String> predictCols;
		List<String> targetCols;
		
		if(vars != null) {
			predictCols = vars.getPredictives().getPredVar();
			targetCols = vars.getTargets().getTargetVar();

			codeColsPred = this.varColsPred  + "=[\"" + predictCols.get(0)  + "\"";
			for (int i = 1; i<predictCols.size(); i++) {
				codeColsPred += ",\"" +predictCols.get(i) + "\"";

			}
			codeColsPred += "]";

			codeColsTarg = this.varColsTarget  + "=[\"" + targetCols.get(0)  + "\"";
			for (int i = 1; i<targetCols.size(); i++) {
				codeColsTarg += ",\"" +targetCols.get(i) + "\"";

			}
			codeColsTarg += "]";

		} else { //repartition non définie on fixe testPercent = 20%
			String codeListColumns = "cols=" + this.varDatas + "." + "columns.values";
			this.addLineCode(codeListColumns);
			
			codeColsPred = this.varColsPred + "=" + "cols[0:(len(cols)-1)]";
			codeColsTarg = this.varColsTarget + "=" + "[cols[-1]]";
		}
		
		this.addLineCode(codeColsPred);
		this.addLineCode(codeColsTarg);
		
		codePred = this.varPred + "=" + this.varDatas + "[" + this.varColsPred + "]";
		codeTarget = this.varTarget + "=" + this.varDatas + "[" + this.varColsTarget + "]";
		
		this.addLineCode(codeTarget);
		this.addLineCode(codePred);
	}
	
	@Override
	public void generateStartLoopCode(Loop loop) {
		int i = 1;
		if (loop != null) {
			i = loop.getI();
		}
		String codeStartLoop = "for i in range(" + i + "):";
		this.addLineCode(codeStartLoop);
	}

	@Override
	public void generateEndLoopCode() {
	}
	
	@Override
	public void generatePartitionCode(Partition partition, Algo algo, Calculate calculate) {
		this.generateAlgoCode(algo);
		
		String importPart = "from sklearn.model_selection import train_test_split";
		this.addImportCode(importPart);

		//garde la valeur des repartitions pour génération future du code
		NumericValue testValue = partition.getTest();
		double testPercent = this.getNumberValue(testValue);

		//partition des variables connue donc on peut split
		String codePartition = this.varTrainPred + "," + this.varTestPred  + "," + this.varTrainTarget + "," + this.varTestTarget + "=" + "train_test_split" + "("
				+ this.varPred + "," + this.varTarget + "," + "test_size" + "=" + testPercent + ")";
		this.addLineCode(codePartition);
		
		//fit code
		String fitCode = this.varAlgo +".fit" + "(" + this.varTrainPred + "," + this.varTrainTarget + ")";
		this.addLineCode(fitCode);

		String predictCode = this.varPredict + "=" + this.varAlgo + ".predict" + "(" + this.varTestPred + ")";
		this.addLineCode(predictCode);
		
		this.generateCalculateCode(calculate);
	}

	@Override
	public void generateCrossVCode(CrossValidation crossValidation, Algo algo, Calculate calculate) {
		this.generateAlgoCode(algo);
		this.generateCalculateCode(calculate);

		String calculateType = this.getScoringCalculate(calculate);

		int k = crossValidation.getK();
		String importSvmCode = "from sklearn import svm";
		String importCrossValidate = "from sklearn.model_selection import cross_val_score";
		this.addImportCode(importCrossValidate);
		this.addImportCode(importSvmCode);
		String codeScore = this.varRes + "=cross_val_score(" + this.varAlgo + "," + this.varPred + "," + this.varTarget + ",scoring=\"" + calculateType + "\",cv=" + k + ")";
		this.addLineCode(codeScore);
	}

	@Override
	public void generateShowResultCode() {
		String codeRes = "print(" + this.varRes + ")";
		this.addLineCode(codeRes);
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
			this.addImportCode(importCode);
			if (! this.isCrossValidation()) {
				this.addLineCode(this.codePartTwo(calculate));	
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
		String code = this.varRes + "=" + fonctionToCall + "(" + this.varTestTarget + "," + this.varPredict + ")";
		return code;
	}

	private void generateAlgoCode(Algo algoToApply) {
		String importNP = "import numpy as np";
		this.addImportCode(importNP);

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
		this.addImportCode(importPart);

		//Creation d'un objet regressor
		String codeObjetReg = this.varAlgo + "=" + "linear_model.LinearRegression" + "(" + ")";
		this.addLineCode(codeObjetReg);
	}

	private void generateDTRCode() {
		String importPart = "from sklearn.tree import DecisionTreeRegressor";
		this.addImportCode(importPart);

		//Creation d'un objet regressor
		String codeObjetReg = this.varAlgo + "=" + "DecisionTreeRegressor" + "(" + ")";
		this.addLineCode(codeObjetReg);
	}

	private void generateSVRCode() {
		String importPart = "from sklearn.svm import SVR";
		this.addImportCode(importPart);

		// conversion de la targetVar en tableau à une dimension
		String codeConvertTargetVar = this.varTarget + "=" + this.varTarget + ".values.ravel()";
		this.addLineCode(codeConvertTargetVar);
		
		//Creation d'un objet regressor
		String codeObjetReg = this.varAlgo + "=" + "SVR" + "(" + ")";
		this.addLineCode(codeObjetReg);
	}
}