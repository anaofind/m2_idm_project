package m2.idm.project.generator;

import java.util.List;

import m2.idm.project.mLRegression.Algo;
import m2.idm.project.mLRegression.Calculate;
import m2.idm.project.mLRegression.CrossValidation;
import m2.idm.project.mLRegression.Dataset;
import m2.idm.project.mLRegression.Partition;
import m2.idm.project.mLRegression.Variables;


/**
 * generator r code
 * @author anaofind
 */
public class GeneratorRCode extends GeneratorCodeImpl{
	
	/**
	 * the vars
	 */
	private String varTrains = "trains", varTests = "tests";
	private String varModel = "model";
	
	@Override
	public String getExtension() {
		return "r";
	}

	@Override
	public void generateDatasetCode(Dataset dataset) {
		String separator = dataset.getSeparator();
		if (separator == null) {
			separator = ",";
		}
		String code = this.varDatas + "=read.csv(file=\"" + dataset.getDataPath() + "\",sep=\"" + separator + "\")";
		this.addLineCode(code);
	}

	@Override
	public void generateVarsCode(Variables vars) {
		String colsPredictiveCode = "";
		String colsTargetCode = "";

		if (vars != null) {
			List<String> predictCols = vars.getPredictives().getPredVar();
			List<String> targetCols = vars.getTargets().getTargetVar();
			
			colsPredictiveCode = this.varColsPred  + "=c(\"" + predictCols.get(0)  + "\"";
			for (int i = 1; i<predictCols.size(); i++) {
				colsPredictiveCode += ",\"" +predictCols.get(i) + "\"";

			}
			colsPredictiveCode += ")";

			colsTargetCode = this.varColsTarget  + "=c(\"" + targetCols.get(0)  + "\"";
			for (int i = 1; i<targetCols.size(); i++) {
				colsTargetCode += ",\"" +targetCols.get(i) + "\"";

			}
			colsTargetCode += ")";
		} else {
			String colsCode = "cols=colnames(" + this.varDatas + ")";
			colsPredictiveCode = this.varColsPred + "=cols[-nrow(datas)+1]";
			colsTargetCode = this.varColsTarget + "=cols[nrow(datas)-1]";
			
			this.addLineCode(colsCode);
		}
		
		this.addLineCode(colsPredictiveCode);
		this.addLineCode(colsTargetCode);
	}

	@Override
	public void generatePartitionCode(Partition partition, Algo algo, Calculate calculate) {
		double trainPercent = 1-this.getNumberValue(partition.getTest());
		String spliterCode = "spliter=initial_split(" + this.varDatas + ",prop=" + trainPercent + ")";
		
		String trainCode =  this.varTrains + "=training(spliter)";
		String testCode =  this.varTests + "=testing(spliter)";
				
		String codePredictFormula = "predict_formula=paste(" + this.varColsPred + ",collapse=\"+\")";
		String codeTargetFormula = "target_formula=paste(" + this.varColsTarget + ",collapse=\"+\")";
		String codeFormula = "formula=as.formula(paste(paste(target_formula,\"~\"),predict_formula))";
		
		this.addImportCode("library(rsample)");
		
		this.addLineCode(spliterCode);
		this.addLineCode(trainCode);
		this.addLineCode(testCode);
		this.addLineCode(codePredictFormula);
		this.addLineCode(codeTargetFormula);
		this.addLineCode(codeFormula);
		
		this.generateCodeAlgo(algo);
		
		String predictCode = this.varPredict + "=predict(" + this.varModel + "," + this.varTests + ")";
		this.addLineCode(predictCode);
		
		this.generateCodeCalculate(calculate);
	}

	@Override
	public void generateCrossVCode(CrossValidation crossValidation, Algo algo, Calculate calculate) {
//		String codePred = this.varPred + "=" + this.varDatas + "[" + this.varColsPred + "]";
//		String codeTarget = this.varTarget + "=" + this.varDatas + "[" + this.varColsTarget + "]";
		this.addImportCode("library(DAAG)");
	}

	@Override
	public void generateShowResultCode() {
		String codeResult = "print(" + this.varRes + ")";
		this.addLineCode(codeResult);
	}

	private void generateCodeAlgo(Algo algo) {
		String codeModel = "";
		switch (algo.getAlgo()) {
		case "line_regress" :
			codeModel = this.varModel + "=lm(formula," + this.varTrains + ")";
			break;
		case "decision_tree_regressor" :
			this.addImportCode("library(rpart)");
			codeModel = this.varModel + "=rpart(formula," + this.varTrains + ")";
			break;
		case "svr": 
			this.addImportCode("library(e1071)");
			codeModel = this.varModel + "=svm(formula," + this.varTrains + ")";
			break;
		}
		this.addLineCode(codeModel);
	}
	
	private void generateCodeCalculate(Calculate calculate) {
		String function = "";
		String codeCalculate = "";
		String codeYtrue = "as.matrix(" + this.varTests + "[" + this.varColsTarget + "])";
		String codeYPred = this.varPredict; 
		switch (calculate.getCalculateType()) {
		case "mean_absolute_error" :
			this.addImportCode("library(gencve)");
			function = "mae";
			codeCalculate = this.varRes + "=" + function + "(" +  codeYtrue + "," + codeYPred + ")";
			break;
		case "mean_squared_error" :
			this.addImportCode("library(gencve)");
			function = "mse";
			codeCalculate = this.varRes + "=" + function + "(" +  codeYtrue + "," + codeYPred + ")";
			break;
		case "median_absolute_error" :
			this.addImportCode("library(MLmetrics,warn.conflicts=FALSE)");
			function = "MedianAE";
			codeCalculate = this.varRes + "=" + function + "(" +  codeYPred + "," + codeYtrue + ")";
			break;
		}
		this.addLineCode(codeCalculate);
	}
}
