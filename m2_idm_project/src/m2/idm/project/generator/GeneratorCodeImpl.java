package m2.idm.project.generator;

import m2.idm.project.mLRegression.*;

import java.util.*;

/**
 * generator code impl
 * @author anaofind
 */
public abstract class GeneratorCodeImpl implements GeneratorCode{

	/**
	 * the list of code
	 */
	private List<String> codeOrdonee = new ArrayList<String>();
	
	/**
	 * the vars
	 */
	protected String varRes = "result", varDatas = "datas";
	protected String varAlgo = "algo";
	protected String varPredictiveCols = "predictive_cols", varTargetCols = "target_cols", 
			varXtrain = "X_train", varXtest = "X_test", 
			varYtrain = "Y_train", varYtest = "Y_test", varYPred = "predict";

	protected String varPred = "preds", varTarget = "targs";
	
	
	protected double testPercent = 0.0;
	
	@Override
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
		
		String codeRes = "print(" + this.varRes + ")";
		this.codeOrdonee.add(codeRes);
		
		for (String line : this.codeOrdonee) {
			pythonCode += line + "\n";
		}

		//Construct python code from content of the list (codeOrdonne)
		return pythonCode;
	}

	/**
	 * generate dataset code
	 */
	public abstract void generateDatasetCode(Dataset dataset);
	
	
	/**
	 * generate vars code
	 */
	public abstract void generateVarsCode(Variables vars);
	
	/**
	 * generate evaluation type code
	 * @param evalType the evaluation type
	 * @param algoToApply the algo
	 * @param whatToCalculate the calculate
	 */
	public abstract void generateEvaluationTypeCode(EvaluationType evalType, Algo algoToApply, Calculate whatToCalculate);
	
	/**
	 * add import code
	 * @param importCode the import code
	 */
	protected void addImportCode(String importCode) {
		this.codeOrdonee.add(0, importCode);
	}
	
	/**
	 * add line code
	 * @param lineCode the line code
	 */
	protected void addLineCode(String lineCode) {
		this.codeOrdonee.add(lineCode);
	}
	
	/**
	 * get the number value
	 * @param numeric the numeric
	 * @return the number value
	 */
	protected double getNumberValue(NumericValue numeric) {
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
}
