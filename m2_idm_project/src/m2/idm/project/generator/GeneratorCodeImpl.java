package m2.idm.project.generator;

import m2.idm.project.mLRegression.*;

import java.util.*;

/**
 * generator code impl
 * @author anaofind
 */
public abstract class GeneratorCodeImpl implements GeneratorCode{

	/**
	 * list of implements
	 */
	private List<String> codeImplement = new ArrayList<String>();
	
	/**
	 * the code of body
	 */
	private List<String> codeBody = new ArrayList<String>();
		
	/**
	 * the vars
	 */
	protected String varDatas = "datas";
	protected String varAlgo = "algo";
	protected String varPredict = "predict", varRes = "result";
	protected String varColsPred = "pred_cols", varColsTarget = "target_cols";
	
	private boolean isCrossValidation = false;
	
	@Override
	public String generate(MLRegression ml) {
		Dataset dataset = ml.getDataset();
		Variables listVar = ml.getVars();
		EvaluationType evalType = ml.getEvaluation();
		Algo algoToApply = ml.getAlgo();
		Calculate whatToCalculate = ml.getCalculate();
		Loop loop = ml.getLoop();
		
		// know if is cross validation
		this.isCrossValidation = (evalType instanceof CrossValidation);
		
		// generate dataset code
		this.generateDatasetCode(dataset);
		
		// generate start loop code
		this.generateStartLoopCode(loop);
		int iLineStartLoop = this.codeBody.size();
		
		// generate vars code
		this.generateVarsCode(listVar);
		
		// generate evaluation type code
		this.generateEvaluationTypeCode(evalType, algoToApply, whatToCalculate);
		
		// generate the showing result code
		this.generateShowResultCode();
		
		// generate end loop code
		int iLineEndLoop = this.codeBody.size()-1;
		for (int i = iLineStartLoop; i<=iLineEndLoop; i++) {
			this.codeBody.set(i, "\t" + this.codeBody.get(i));
		}
		this.generateEndLoopCode();
		
		// generate all implements
		String code = "";
		for (String line : this.codeImplement) {
			code += line + "\n";
		}
		
		// generate code body
		for (String line : this.codeBody) {
			code += line + "\n";
		}
		
		//return code
		return code;
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
	public void generateEvaluationTypeCode(EvaluationType evalType, Algo algoToApply, Calculate whatToCalculate) {
		if (this.isCrossValidation) {
			CrossValidation crossValidation = (CrossValidation) evalType;
			this.generateCrossVCode(crossValidation, algoToApply, whatToCalculate);
		} else {
			Partition partition = (Partition) evalType;
			this.generatePartitionCode(partition, algoToApply, whatToCalculate);	
		}
	}
	
	/**
	 * generate start loop code
	 * @param loop the loop
	 */
	public abstract void generateStartLoopCode(Loop loop);
	
	/**
	 * generate end loop code
	 */
	public abstract void generateEndLoopCode();
	
	/**
	 * generate partition code
	 * @param partition the partition 
	 * @param algo the algo
	 * @param calculate the calculate
	 */
	public abstract void generatePartitionCode(Partition partition, Algo algo, Calculate calculate);
	
	
	/**
	 * generate cross validation code
	 * @param crossValidation the cross validation 
	 * @param algo the algo
	 * @param calculate the calculate
	 */
	public abstract void generateCrossVCode(CrossValidation crossValidation, Algo algo, Calculate calculate);
	
	/**
	 * generate show result code
	 */
	public abstract void generateShowResultCode();
	
	/**
	 * add import code
	 * @param importCode the import code
	 */
	protected void addImportCode(String importCode) {
		this.codeImplement.add(importCode);
	}
	
	/**
	 * add line code
	 * @param lineCode the line code
	 */
	protected void addLineCode(String lineCode) {
		this.codeBody.add(lineCode);
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
	
	/**
	 * is cross validation
	 * @return boolean
	 */
	protected boolean isCrossValidation() {
		return this.isCrossValidation;
	}
}
