/*
 * generated by Xtext 2.23.0
 */
package m2.idm.project.serializer;

import com.google.inject.Inject;
import java.util.Set;
import m2.idm.project.mLRegression.Algo;
import m2.idm.project.mLRegression.BooleanValue;
import m2.idm.project.mLRegression.Calculate;
import m2.idm.project.mLRegression.CrossValidation;
import m2.idm.project.mLRegression.Dataset;
import m2.idm.project.mLRegression.DecisionTreeRegressor;
import m2.idm.project.mLRegression.FLOAT;
import m2.idm.project.mLRegression.LineRegress;
import m2.idm.project.mLRegression.ListePredictiveVar;
import m2.idm.project.mLRegression.MLRegression;
import m2.idm.project.mLRegression.MLRegressionPackage;
import m2.idm.project.mLRegression.PERCENT;
import m2.idm.project.mLRegression.Partition;
import m2.idm.project.mLRegression.SVR;
import m2.idm.project.mLRegression.TargetVar;
import m2.idm.project.mLRegression.Variables;
import m2.idm.project.services.MLRegressionGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MLRegressionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MLRegressionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MLRegressionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MLRegressionPackage.ALGO:
				sequence_Algo(context, (Algo) semanticObject); 
				return; 
			case MLRegressionPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case MLRegressionPackage.CALCULATE:
				sequence_Calculate(context, (Calculate) semanticObject); 
				return; 
			case MLRegressionPackage.CROSS_VALIDATION:
				sequence_CrossValidation(context, (CrossValidation) semanticObject); 
				return; 
			case MLRegressionPackage.DATASET:
				sequence_Dataset(context, (Dataset) semanticObject); 
				return; 
			case MLRegressionPackage.DECISION_TREE_REGRESSOR:
				sequence_DecisionTreeRegressor(context, (DecisionTreeRegressor) semanticObject); 
				return; 
			case MLRegressionPackage.FLOAT:
				sequence_FLOAT(context, (FLOAT) semanticObject); 
				return; 
			case MLRegressionPackage.LINE_REGRESS:
				sequence_LineRegress(context, (LineRegress) semanticObject); 
				return; 
			case MLRegressionPackage.LISTE_PREDICTIVE_VAR:
				sequence_ListePredictiveVar(context, (ListePredictiveVar) semanticObject); 
				return; 
			case MLRegressionPackage.ML_REGRESSION:
				sequence_MLRegression(context, (MLRegression) semanticObject); 
				return; 
			case MLRegressionPackage.PERCENT:
				sequence_PERCENT(context, (PERCENT) semanticObject); 
				return; 
			case MLRegressionPackage.PARTITION:
				sequence_Partition(context, (Partition) semanticObject); 
				return; 
			case MLRegressionPackage.SVR:
				sequence_SVR(context, (SVR) semanticObject); 
				return; 
			case MLRegressionPackage.TARGET_VAR:
				sequence_TargetVar(context, (TargetVar) semanticObject); 
				return; 
			case MLRegressionPackage.VARIABLES:
				sequence_Variables(context, (Variables) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Algo returns Algo
	 *
	 * Constraint:
	 *     (algo=AlgoType leftSidePredict=ID)
	 */
	protected void sequence_Algo(ISerializationContext context, Algo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.ALGO__ALGO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.ALGO__ALGO));
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.ALGO__LEFT_SIDE_PREDICT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.ALGO__LEFT_SIDE_PREDICT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlgoAccess().getAlgoAlgoTypeParserRuleCall_2_0(), semanticObject.getAlgo());
		feeder.accept(grammarAccess.getAlgoAccess().getLeftSidePredictIDTerminalRuleCall_4_0(), semanticObject.getLeftSidePredict());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BooleanValue returns BooleanValue
	 *
	 * Constraint:
	 *     (value='false' | value='true')
	 */
	protected void sequence_BooleanValue(ISerializationContext context, BooleanValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Calculate returns Calculate
	 *
	 * Constraint:
	 *     calculateType=CalculateType
	 */
	protected void sequence_Calculate(ISerializationContext context, Calculate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.CALCULATE__CALCULATE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.CALCULATE__CALCULATE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCalculateAccess().getCalculateTypeCalculateTypeParserRuleCall_2_0(), semanticObject.getCalculateType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EvaluationType returns CrossValidation
	 *     CrossValidation returns CrossValidation
	 *
	 * Constraint:
	 *     k=INT
	 */
	protected void sequence_CrossValidation(ISerializationContext context, CrossValidation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.CROSS_VALIDATION__K) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.CROSS_VALIDATION__K));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0(), semanticObject.getK());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dataset returns Dataset
	 *
	 * Constraint:
	 *     (dataPath=STRING separator=STRING?)
	 */
	protected void sequence_Dataset(ISerializationContext context, Dataset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AlgoType returns DecisionTreeRegressor
	 *     DecisionTreeRegressor returns DecisionTreeRegressor
	 *
	 * Constraint:
	 *     rand=INT
	 */
	protected void sequence_DecisionTreeRegressor(ISerializationContext context, DecisionTreeRegressor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.DECISION_TREE_REGRESSOR__RAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.DECISION_TREE_REGRESSOR__RAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDecisionTreeRegressorAccess().getRandINTTerminalRuleCall_2_0(), semanticObject.getRand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NumericValue returns FLOAT
	 *     FLOAT returns FLOAT
	 *
	 * Constraint:
	 *     (value=INT decimal=INT?)
	 */
	protected void sequence_FLOAT(ISerializationContext context, FLOAT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AlgoType returns LineRegress
	 *     LineRegress returns LineRegress
	 *
	 * Constraint:
	 *     rand=INT
	 */
	protected void sequence_LineRegress(ISerializationContext context, LineRegress semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.LINE_REGRESS__RAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.LINE_REGRESS__RAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLineRegressAccess().getRandINTTerminalRuleCall_2_0(), semanticObject.getRand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ListePredictiveVar returns ListePredictiveVar
	 *
	 * Constraint:
	 *     (predVar+=STRING predVar+=STRING*)
	 */
	protected void sequence_ListePredictiveVar(ISerializationContext context, ListePredictiveVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MLRegression returns MLRegression
	 *
	 * Constraint:
	 *     (dataset=Dataset vars=Variables? evaluation=EvaluationType algo=Algo calculate=Calculate)
	 */
	protected void sequence_MLRegression(ISerializationContext context, MLRegression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NumericValue returns PERCENT
	 *     PERCENT returns PERCENT
	 *
	 * Constraint:
	 *     float=FLOAT
	 */
	protected void sequence_PERCENT(ISerializationContext context, PERCENT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.PERCENT__FLOAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.PERCENT__FLOAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPERCENTAccess().getFloatFLOATParserRuleCall_0_0(), semanticObject.getFloat());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EvaluationType returns Partition
	 *     Partition returns Partition
	 *
	 * Constraint:
	 *     test=NumericValue
	 */
	protected void sequence_Partition(ISerializationContext context, Partition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.PARTITION__TEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.PARTITION__TEST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_2_0(), semanticObject.getTest());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AlgoType returns SVR
	 *     SVR returns SVR
	 *
	 * Constraint:
	 *     param=ID
	 */
	protected void sequence_SVR(ISerializationContext context, SVR semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.SVR__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.SVR__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSVRAccess().getParamIDTerminalRuleCall_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TargetVar returns TargetVar
	 *
	 * Constraint:
	 *     (targetVar+=STRING targetVar+=STRING*)
	 */
	protected void sequence_TargetVar(ISerializationContext context, TargetVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variables returns Variables
	 *
	 * Constraint:
	 *     (predictives=ListePredictiveVar targets=TargetVar)
	 */
	protected void sequence_Variables(ISerializationContext context, Variables semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.VARIABLES__PREDICTIVES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.VARIABLES__PREDICTIVES));
			if (transientValues.isValueTransient(semanticObject, MLRegressionPackage.Literals.VARIABLES__TARGETS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLRegressionPackage.Literals.VARIABLES__TARGETS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariablesAccess().getPredictivesListePredictiveVarParserRuleCall_0_0(), semanticObject.getPredictives());
		feeder.accept(grammarAccess.getVariablesAccess().getTargetsTargetVarParserRuleCall_1_0(), semanticObject.getTargets());
		feeder.finish();
	}
	
	
}
