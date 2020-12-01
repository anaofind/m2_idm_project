/*
 * generated by Xtext 2.23.0
 */
grammar InternalMLRegression;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package m2.idm.project.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package m2.idm.project.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import m2.idm.project.services.MLRegressionGrammarAccess;

}

@parser::members {

 	private MLRegressionGrammarAccess grammarAccess;

    public InternalMLRegressionParser(TokenStream input, MLRegressionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MLRegression";
   	}

   	@Override
   	protected MLRegressionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMLRegression
entryRuleMLRegression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMLRegressionRule()); }
	iv_ruleMLRegression=ruleMLRegression
	{ $current=$iv_ruleMLRegression.current; }
	EOF;

// Rule MLRegression
ruleMLRegression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getDatasetDatasetParserRuleCall_0_0());
				}
				lv_dataset_0_0=ruleDataset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"dataset",
						lv_dataset_0_0,
						"m2.idm.project.MLRegression.Dataset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_1_0());
				}
				lv_evaluation_1_0=ruleEvaluationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"evaluation",
						lv_evaluation_1_0,
						"m2.idm.project.MLRegression.EvaluationType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_2_0());
				}
				lv_vars_2_0=ruleVariables
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"vars",
						lv_vars_2_0,
						"m2.idm.project.MLRegression.Variables");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_3_0());
				}
				lv_calculate_3_0=ruleCalculate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"calculate",
						lv_calculate_3_0,
						"m2.idm.project.MLRegression.Calculate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_4_0());
				}
				lv_algo_4_0=ruleAlgo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"algo",
						lv_algo_4_0,
						"m2.idm.project.MLRegression.Algo");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCalculate
entryRuleCalculate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCalculateRule()); }
	iv_ruleCalculate=ruleCalculate
	{ $current=$iv_ruleCalculate.current; }
	EOF;

// Rule Calculate
ruleCalculate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='calculate'
		{
			newLeafNode(otherlv_0, grammarAccess.getCalculateAccess().getCalculateKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getCalculateAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCalculateAccess().getCalculateTypeCalculateTypeParserRuleCall_2_0());
				}
				lv_calculateType_2_0=ruleCalculateType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCalculateRule());
					}
					set(
						$current,
						"calculateType",
						lv_calculateType_2_0,
						"m2.idm.project.MLRegression.CalculateType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getCalculateAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleCalculateType
entryRuleCalculateType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCalculateTypeRule()); }
	iv_ruleCalculateType=ruleCalculateType
	{ $current=$iv_ruleCalculateType.current.getText(); }
	EOF;

// Rule CalculateType
ruleCalculateType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMinErrorParserRuleCall_0());
		}
		this_MinError_0=ruleMinError
		{
			$current.merge(this_MinError_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMinSquaredErrorParserRuleCall_1());
		}
		this_MinSquaredError_1=ruleMinSquaredError
		{
			$current.merge(this_MinSquaredError_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCalculateTypeAccess().getSumsSquaredErrorParserRuleCall_2());
		}
		this_SumsSquaredError_2=ruleSumsSquaredError
		{
			$current.merge(this_SumsSquaredError_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataset
entryRuleDataset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatasetRule()); }
	iv_ruleDataset=ruleDataset
	{ $current=$iv_ruleDataset.current; }
	EOF;

// Rule Dataset
ruleDataset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_dataset_0_0='import'
				{
					newLeafNode(lv_dataset_0_0, grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasetRule());
					}
					setWithLastConsumed($current, "dataset", lv_dataset_0_0, "import");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDatasetAccess().getDataStringValueParserRuleCall_1_0());
				}
				lv_data_1_0=ruleStringValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatasetRule());
					}
					set(
						$current,
						"data",
						lv_data_1_0,
						"m2.idm.project.MLRegression.StringValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getDatasetAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleEvaluationType
entryRuleEvaluationType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvaluationTypeRule()); }
	iv_ruleEvaluationType=ruleEvaluationType
	{ $current=$iv_ruleEvaluationType.current; }
	EOF;

// Rule EvaluationType
ruleEvaluationType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEvaluationTypeAccess().getPartitionParserRuleCall_0());
		}
		this_Partition_0=rulePartition
		{
			$current = $this_Partition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEvaluationTypeAccess().getCrossValidationParserRuleCall_1());
		}
		this_CrossValidation_1=ruleCrossValidation
		{
			$current = $this_CrossValidation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePartition
entryRulePartition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartitionRule()); }
	iv_rulePartition=rulePartition
	{ $current=$iv_rulePartition.current; }
	EOF;

// Rule Partition
rulePartition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='partition'
		{
			newLeafNode(otherlv_0, grammarAccess.getPartitionAccess().getPartitionKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPartitionAccess().getTrainNumericValueParserRuleCall_2_0());
				}
				lv_train_2_0=ruleNumericValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartitionRule());
					}
					set(
						$current,
						"train",
						lv_train_2_0,
						"m2.idm.project.MLRegression.NumericValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getPartitionAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_4_0());
				}
				lv_test_4_0=ruleNumericValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartitionRule());
					}
					set(
						$current,
						"test",
						lv_test_4_0,
						"m2.idm.project.MLRegression.NumericValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getPartitionAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleCrossValidation
entryRuleCrossValidation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCrossValidationRule()); }
	iv_ruleCrossValidation=ruleCrossValidation
	{ $current=$iv_ruleCrossValidation.current; }
	EOF;

// Rule CrossValidation
ruleCrossValidation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='cross_validation'
		{
			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCrossValidationAccess().getKIntegerValueParserRuleCall_2_0());
				}
				lv_k_2_0=ruleIntegerValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCrossValidationRule());
					}
					set(
						$current,
						"k",
						lv_k_2_0,
						"m2.idm.project.MLRegression.IntegerValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getCrossValidationAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleVariables
entryRuleVariables returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariablesRule()); }
	iv_ruleVariables=ruleVariables
	{ $current=$iv_ruleVariables.current; }
	EOF;

// Rule Variables
ruleVariables returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getVariablesAccess().getPredictivesListePredictiveVarParserRuleCall_0_0());
				}
				lv_predictives_0_0=ruleListePredictiveVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariablesRule());
					}
					set(
						$current,
						"predictives",
						lv_predictives_0_0,
						"m2.idm.project.MLRegression.ListePredictiveVar");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVariablesAccess().getTargetsTargetVarParserRuleCall_1_0());
				}
				lv_targets_1_0=ruleTargetVar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariablesRule());
					}
					set(
						$current,
						"targets",
						lv_targets_1_0,
						"m2.idm.project.MLRegression.TargetVar");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleListePredictiveVar
entryRuleListePredictiveVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListePredictiveVarRule()); }
	iv_ruleListePredictiveVar=ruleListePredictiveVar
	{ $current=$iv_ruleListePredictiveVar.current; }
	EOF;

// Rule ListePredictiveVar
ruleListePredictiveVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='predictive_vars'
		{
			newLeafNode(otherlv_0, grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getListePredictiveVarAccess().getColonKeyword_1());
		}
		(
			(
				lv_vars_2_0=RULE_STRING
				{
					newLeafNode(lv_vars_2_0, grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListePredictiveVarRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0());
			}
			(
				(
					lv_vars_4_0=RULE_STRING
					{
						newLeafNode(lv_vars_4_0, grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getListePredictiveVarRule());
						}
						addWithLastConsumed(
							$current,
							"vars",
							lv_vars_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getListePredictiveVarAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleTargetVar
entryRuleTargetVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetVarRule()); }
	iv_ruleTargetVar=ruleTargetVar
	{ $current=$iv_ruleTargetVar.current; }
	EOF;

// Rule TargetVar
ruleTargetVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='target_var'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetVarAccess().getTarget_varKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTargetVarAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTargetVarAccess().getVarStringValueParserRuleCall_2_0());
				}
				lv_var_2_0=ruleStringValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTargetVarRule());
					}
					set(
						$current,
						"var",
						lv_var_2_0,
						"m2.idm.project.MLRegression.StringValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTargetVarAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleAlgo
entryRuleAlgo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlgoRule()); }
	iv_ruleAlgo=ruleAlgo
	{ $current=$iv_ruleAlgo.current; }
	EOF;

// Rule Algo
ruleAlgo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='algorithm'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlgoAccess().getAlgorithmKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getAlgoAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlgoAccess().getAlgoAlgoMLParserRuleCall_2_0());
				}
				lv_algo_2_0=ruleAlgoML
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlgoRule());
					}
					set(
						$current,
						"algo",
						lv_algo_2_0,
						"m2.idm.project.MLRegression.AlgoML");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getAlgoAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleAlgoML
entryRuleAlgoML returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlgoMLRule()); }
	iv_ruleAlgoML=ruleAlgoML
	{ $current=$iv_ruleAlgoML.current; }
	EOF;

// Rule AlgoML
ruleAlgoML returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAlgoMLAccess().getLineRegressParserRuleCall_0());
		}
		this_LineRegress_0=ruleLineRegress
		{
			$current = $this_LineRegress_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAlgoMLAccess().getSVRParserRuleCall_1());
		}
		this_SVR_1=ruleSVR
		{
			$current = $this_SVR_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAlgoMLAccess().getDecisionTreeRegressorParserRuleCall_2());
		}
		this_DecisionTreeRegressor_2=ruleDecisionTreeRegressor
		{
			$current = $this_DecisionTreeRegressor_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLineRegress
entryRuleLineRegress returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLineRegressRule()); }
	iv_ruleLineRegress=ruleLineRegress
	{ $current=$iv_ruleLineRegress.current; }
	EOF;

// Rule LineRegress
ruleLineRegress returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='line_regress'
		{
			newLeafNode(otherlv_0, grammarAccess.getLineRegressAccess().getLine_regressKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getLineRegressAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_columns_2_0=RULE_STRING
				{
					newLeafNode(lv_columns_2_0, grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLineRegressRule());
					}
					addWithLastConsumed(
						$current,
						"columns",
						lv_columns_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getLineRegressAccess().getCommaKeyword_3_0());
			}
			(
				(
					lv_columns_4_0=RULE_STRING
					{
						newLeafNode(lv_columns_4_0, grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLineRegressRule());
						}
						addWithLastConsumed(
							$current,
							"columns",
							lv_columns_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleDecisionTreeRegressor
entryRuleDecisionTreeRegressor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecisionTreeRegressorRule()); }
	iv_ruleDecisionTreeRegressor=ruleDecisionTreeRegressor
	{ $current=$iv_ruleDecisionTreeRegressor.current; }
	EOF;

// Rule DecisionTreeRegressor
ruleDecisionTreeRegressor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='decision_tree_regressor'
		{
			newLeafNode(otherlv_0, grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_rand_2_0=RULE_INT
				{
					newLeafNode(lv_rand_2_0, grammarAccess.getDecisionTreeRegressorAccess().getRandINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecisionTreeRegressorRule());
					}
					setWithLastConsumed(
						$current,
						"rand",
						lv_rand_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getDecisionTreeRegressorAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleSVR
entryRuleSVR returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSVRRule()); }
	iv_ruleSVR=ruleSVR
	{ $current=$iv_ruleSVR.current; }
	EOF;

// Rule SVR
ruleSVR returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='svr'
		{
			newLeafNode(otherlv_0, grammarAccess.getSVRAccess().getSvrKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSVRAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_param_2_0=RULE_ID
				{
					newLeafNode(lv_param_2_0, grammarAccess.getSVRAccess().getParamIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSVRRule());
					}
					setWithLastConsumed(
						$current,
						"param",
						lv_param_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSVRAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleMinError
entryRuleMinError returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMinErrorRule()); }
	iv_ruleMinError=ruleMinError
	{ $current=$iv_ruleMinError.current.getText(); }
	EOF;

// Rule MinError
ruleMinError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='min_error'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getMinErrorAccess().getMin_errorKeyword());
	}
;

// Entry rule entryRuleMinSquaredError
entryRuleMinSquaredError returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMinSquaredErrorRule()); }
	iv_ruleMinSquaredError=ruleMinSquaredError
	{ $current=$iv_ruleMinSquaredError.current.getText(); }
	EOF;

// Rule MinSquaredError
ruleMinSquaredError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='min_square_error'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getMinSquaredErrorAccess().getMin_square_errorKeyword());
	}
;

// Entry rule entryRuleSumsSquaredError
entryRuleSumsSquaredError returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSumsSquaredErrorRule()); }
	iv_ruleSumsSquaredError=ruleSumsSquaredError
	{ $current=$iv_ruleSumsSquaredError.current.getText(); }
	EOF;

// Rule SumsSquaredError
ruleSumsSquaredError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='sums_square_error'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSumsSquaredErrorAccess().getSums_square_errorKeyword());
	}
;

// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	iv_ruleStringValue=ruleStringValue
	{ $current=$iv_ruleStringValue.current; }
	EOF;

// Rule StringValue
ruleStringValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleNumericValue
entryRuleNumericValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumericValueRule()); }
	iv_ruleNumericValue=ruleNumericValue
	{ $current=$iv_ruleNumericValue.current; }
	EOF;

// Rule NumericValue
ruleNumericValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNumericValueAccess().getNumberValueParserRuleCall_0());
		}
		this_NumberValue_0=ruleNumberValue
		{
			$current = $this_NumberValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNumericValueAccess().getPercentValueParserRuleCall_1());
		}
		this_PercentValue_1=rulePercentValue
		{
			$current = $this_PercentValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNumberValue
entryRuleNumberValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberValueRule()); }
	iv_ruleNumberValue=ruleNumberValue
	{ $current=$iv_ruleNumberValue.current; }
	EOF;

// Rule NumberValue
ruleNumberValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_0=RULE_INT
				{
					newLeafNode(lv_value_0_0, grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumberValueRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_1='.'
			{
				newLeafNode(otherlv_1, grammarAccess.getNumberValueAccess().getFullStopKeyword_1_0());
			}
			(
				(
					lv_decimal_2_0=RULE_INT
					{
						newLeafNode(lv_decimal_2_0, grammarAccess.getNumberValueAccess().getDecimalINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNumberValueRule());
						}
						addWithLastConsumed(
							$current,
							"decimal",
							lv_decimal_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleIntegerValue
entryRuleIntegerValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerValueRule()); }
	iv_ruleIntegerValue=ruleIntegerValue
	{ $current=$iv_ruleIntegerValue.current; }
	EOF;

// Rule IntegerValue
ruleIntegerValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntegerValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRulePercentValue
entryRulePercentValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPercentValueRule()); }
	iv_rulePercentValue=rulePercentValue
	{ $current=$iv_rulePercentValue.current; }
	EOF;

// Rule PercentValue
rulePercentValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPercentValueAccess().getNumberValueParserRuleCall_0());
		}
		this_NumberValue_0=ruleNumberValue
		{
			$current = $this_NumberValue_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1='%'
		{
			newLeafNode(otherlv_1, grammarAccess.getPercentValueAccess().getPercentSignKeyword_1());
		}
	)
;

// Entry rule entryRuleBooleanValue
entryRuleBooleanValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanValueRule()); }
	iv_ruleBooleanValue=ruleBooleanValue
	{ $current=$iv_ruleBooleanValue.current; }
	EOF;

// Rule BooleanValue
ruleBooleanValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_1='false'
				{
					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanValueRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_1, null);
				}
				    |
				lv_value_0_2='true'
				{
					newLeafNode(lv_value_0_2, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanValueRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_2, null);
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
