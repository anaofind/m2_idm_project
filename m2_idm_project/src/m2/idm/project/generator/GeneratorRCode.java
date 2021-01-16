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
		String code = this.varDatas + "=read.csv(file=\"" + dataset.getDataPath() + "\")";
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
		String testCode =  this.varTests + "=test_datas=testing(spliter)";
				
		String codePredictFormula = "predict_formula=paste(" + this.varColsPred + ",collapse=\"+\")";
		String codeTargetFormula = "target_formula=paste(" + this.varColsTarget + ",collapse=\"+\")";
		String codeFormula = "formula=as.formula(paste(paste(target_formula,\"~\"),predict_formula))";
		String codeModel = this.varModel + "= lm(formula," + this.varTrains + ")";
		this.addImportCode("library(rsample)");
		
		this.addLineCode(spliterCode);
		this.addLineCode(trainCode);
		this.addLineCode(testCode);
		this.addLineCode(codePredictFormula);
		this.addLineCode(codeTargetFormula);
		this.addLineCode(codeFormula);
		this.addLineCode(codeModel);
	}

	@Override
	public void generateCrossVCode(CrossValidation crossValidation, Algo algo, Calculate calculate) {
//		String codePred = this.varPred + "=" + this.varDatas + "[" + this.varColsPred + "]";
//		String codeTarget = this.varTarget + "=" + this.varDatas + "[" + this.varColsTarget + "]";
		this.addImportCode("library(DAAG)");
	}

	@Override
	public void generateShowResultCode() {
		// TODO Auto-generated method stub
		
	}

	private void generateCodeAlgo(Algo algo) {
		
	}
}
