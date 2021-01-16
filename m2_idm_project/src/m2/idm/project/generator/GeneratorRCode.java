package m2.idm.project.generator;

import java.util.List;

import m2.idm.project.mLRegression.Algo;
import m2.idm.project.mLRegression.Calculate;
import m2.idm.project.mLRegression.Dataset;
import m2.idm.project.mLRegression.EvaluationType;
import m2.idm.project.mLRegression.Variables;


/**
 * generator r code
 * @author anaofind
 */
public class GeneratorRCode extends GeneratorCodeImpl{
	
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
			
			colsPredictiveCode = this.varPredictiveCols  + "=c(\"" + predictCols.get(0)  + "\"";
			for (int i = 1; i<predictCols.size(); i++) {
				colsPredictiveCode += ",\"" +predictCols.get(i) + "\"";

			}
			colsPredictiveCode += ")";

			colsTargetCode = this.varTargetCols  + "=c(\"" + targetCols.get(0)  + "\"";
			for (int i = 1; i<targetCols.size(); i++) {
				colsTargetCode += ",\"" +targetCols.get(i) + "\"";

			}
			colsTargetCode += ")";
		} else {
			String colsCode = "cols=colnames(" + this.varDatas + ")";
			colsPredictiveCode = this.varPredictiveCols + "=cols[-nrow(datas)+1]";
			colsTargetCode = this.varTargetCols + "=cols[nrow(datas)-1]";
			
			this.addLineCode(colsCode);
		}
		
		String codePred = this.varPred + "=" + this.varDatas + "[" + this.varPredictiveCols + "]";
		String codeTarget = this.varTarget + "=" + this.varDatas + "[" + this.varTargetCols + "]";
		
		this.addLineCode(colsPredictiveCode);
		this.addLineCode(colsTargetCode);
		this.addLineCode(codePred);
		this.addLineCode(codeTarget);
	}

	@Override
	public void generateEvaluationTypeCode(EvaluationType evalType, Algo algoToApply, Calculate whatToCalculate) {
		// TODO Auto-generated method stub
		
	}

}
