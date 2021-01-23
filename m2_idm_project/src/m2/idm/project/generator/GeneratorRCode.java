package m2.idm.project.generator;

import java.util.List;

import m2.idm.project.mLRegression.Algo;
import m2.idm.project.mLRegression.Calculate;
import m2.idm.project.mLRegression.CrossValidation;
import m2.idm.project.mLRegression.Dataset;
import m2.idm.project.mLRegression.Loop;
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
	private String varFormula = "formula";
	private String varTrainsControl = "trains_control";
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
	public void generateStartLoopCode(Loop loop) {
		int i = 1;
		if (loop != null) {
			i = loop.getI();
		}
		String codeStartLoop = "for(i in 1:" + i + "){";
		this.addLineCode(codeStartLoop);
	}

	@Override
	public void generateEndLoopCode() {
		this.addLineCode("}");
	}

	@Override
	public void generatePartitionCode(Partition partition, Algo algo, Calculate calculate) {
		double trainPercent = 1-this.getNumberValue(partition.getTest());
		String spliterCode = "spliter=initial_split(" + this.varDatas + ",prop=" + trainPercent + ")";

		String trainCode =  this.varTrains + "=training(spliter)";
		String testCode =  this.varTests + "=testing(spliter)";

		this.addImportCode("library(rsample)");

		this.addLineCode(spliterCode);
		this.addLineCode(trainCode);
		this.addLineCode(testCode);

		this.generateCodeFormula();

		this.generateCodeAlgo(algo);

		String predictCode = this.varPredict + "=predict(" + this.varModel + "," + this.varTests + ")";
		this.addLineCode(predictCode);

		this.generateCodeCalculate(calculate);
	}

	@Override
	public void generateCrossVCode(CrossValidation crossValidation, Algo algo, Calculate calculate) {
		this.addImportCode("library(caret,warn.conflicts=FALSE)");
		
		this.generateCodeFormula();
		
		String codeTrainsControl = this.varTrainsControl + "=trainControl(method=\"cv\",number=" + crossValidation.getK() + ",savePredictions=TRUE)"; 
		this.addLineCode(codeTrainsControl);
		
		this.generateCodeAlgo(algo);
		
		String predictCode = this.varPredict + "=" + this.varModel + "$pred$pred";
		this.addLineCode(predictCode);
		
		this.generateCodeCalculate(calculate);
		
	}

	@Override
	public void generateShowResultCode() {
		String codeResult = "print(" + this.varRes + ")";
		this.addLineCode(codeResult);
	}

	private void generateCodeFormula() {
		String codePredictFormula = "predict_formula=paste(" + this.varColsPred + ",collapse=\"+\")";
		String codeTargetFormula = "target_formula=paste(" + this.varColsTarget + ",collapse=\"+\")";
		String codeFormula = this.varFormula + "=as.formula(paste(paste(target_formula,\"~\"),predict_formula))";

		this.addLineCode(codePredictFormula);
		this.addLineCode(codeTargetFormula);
		this.addLineCode(codeFormula);
	}

	private void generateCodeAlgo(Algo algo) {
		String codeModel = "";
		String function = "";
		switch (algo.getAlgo()) {
		case "line_regress" : 
			function = "lm";
			break;
		case "decision_tree_regressor" :
			this.addImportCode("library(rpart)");
			function = "rpart";
			break;
		case "svr": 
			if (this.isCrossValidation()) {
				function = "svmLinear";
			} else {
				this.addImportCode("library(e1071)");
				function = "svm";
			}
			break;
		}
		if (this.isCrossValidation()) {
			codeModel = this.varModel + "=train(" + this.varFormula + ",data=" +  this.varDatas + ", method=\"" + function + "\",trControl=" + this.varTrainsControl + ")";
		} else {
			codeModel = this.varModel + "=" + function + "(" + this.varFormula + "," + this.varTrains + ")";
		}
		
		this.addLineCode(codeModel);
	}
	
	private void generateCodeCalculate(Calculate calculate) {
		String function = "";
		String codeCalculate = "";
		String codeYtrue = "";
		String codeYPred = "";
		if (this.isCrossValidation()) {
			codeYtrue = "as.matrix(" + this.varModel + "$pred$obs)";
			codeYPred = "as.matrix(" + this.varPredict +")";
		} else {
			codeYtrue = "as.matrix(" + this.varTests + "[" + this.varColsTarget + "])";
			codeYPred = this.varPredict;
		}
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
