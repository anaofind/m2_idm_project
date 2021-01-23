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
    	return "Model";
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

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getModelAccess().getLanguageTargetLanguageTargetParserRuleCall_0_0());
				}
				lv_languageTarget_0_0=ruleLanguageTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"languageTarget",
						lv_languageTarget_0_0,
						"m2.idm.project.MLRegression.LanguageTarget");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getMlMLRegressionParserRuleCall_1_0());
				}
				lv_ml_1_0=ruleMLRegression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"ml",
						lv_ml_1_0,
						"m2.idm.project.MLRegression.MLRegression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLanguageTarget
entryRuleLanguageTarget returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageTargetRule()); }
	iv_ruleLanguageTarget=ruleLanguageTarget
	{ $current=$iv_ruleLanguageTarget.current; }
	EOF;

// Rule LanguageTarget
ruleLanguageTarget returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='target_language'
		{
			newLeafNode(otherlv_0, grammarAccess.getLanguageTargetAccess().getTarget_languageKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getLanguageTargetAccess().getColonKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getLanguageTargetAccess().getLanguagePythonParserRuleCall_2_0_0());
					}
					lv_language_2_1=rulePython
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLanguageTargetRule());
						}
						set(
							$current,
							"language",
							lv_language_2_1,
							"m2.idm.project.MLRegression.Python");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getLanguageTargetAccess().getLanguageRParserRuleCall_2_0_1());
					}
					lv_language_2_2=ruleR
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLanguageTargetRule());
						}
						set(
							$current,
							"language",
							lv_language_2_2,
							"m2.idm.project.MLRegression.R");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getLanguageTargetAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRulePython
entryRulePython returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPythonRule()); }
	iv_rulePython=rulePython
	{ $current=$iv_rulePython.current.getText(); }
	EOF;

// Rule Python
rulePython returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='python'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPythonAccess().getPythonKeyword_0());
		}
		    |
		kw='Python'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPythonAccess().getPythonKeyword_1());
		}
		    |
		kw='PYTHON'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPythonAccess().getPYTHONKeyword_2());
		}
	)
;

// Entry rule entryRuleR
entryRuleR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRRule()); }
	iv_ruleR=ruleR
	{ $current=$iv_ruleR.current.getText(); }
	EOF;

// Rule R
ruleR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='r'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRAccess().getRKeyword_0());
		}
		    |
		kw='R'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRAccess().getRKeyword_1());
		}
	)
;

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
					newCompositeNode(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_1_0());
				}
				lv_vars_1_0=ruleVariables
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"vars",
						lv_vars_1_0,
						"m2.idm.project.MLRegression.Variables");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_2_0());
				}
				lv_evaluation_2_0=ruleEvaluationType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"evaluation",
						lv_evaluation_2_0,
						"m2.idm.project.MLRegression.EvaluationType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_3_0());
				}
				lv_algo_3_0=ruleAlgo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"algo",
						lv_algo_3_0,
						"m2.idm.project.MLRegression.Algo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_4_0());
				}
				lv_calculate_4_0=ruleCalculate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"calculate",
						lv_calculate_4_0,
						"m2.idm.project.MLRegression.Calculate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMLRegressionAccess().getLoopLoopParserRuleCall_5_0());
				}
				lv_loop_5_0=ruleLoop
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMLRegressionRule());
					}
					set(
						$current,
						"loop",
						lv_loop_5_0,
						"m2.idm.project.MLRegression.Loop");
					afterParserOrEnumRuleCall();
				}
			)
		)?
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
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getImportKeyword_0());
		}
		(
			(
				lv_dataPath_1_0=RULE_STRING
				{
					newLeafNode(lv_dataPath_1_0, grammarAccess.getDatasetAccess().getDataPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasetRule());
					}
					setWithLastConsumed(
						$current,
						"dataPath",
						lv_dataPath_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_separator_2_0=RULE_STRING
				{
					newLeafNode(lv_separator_2_0, grammarAccess.getDatasetAccess().getSeparatorSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasetRule());
					}
					setWithLastConsumed(
						$current,
						"separator",
						lv_separator_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getDatasetAccess().getSemicolonKeyword_3());
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
					newCompositeNode(grammarAccess.getVariablesAccess().getPredictivesPredictiveVarsParserRuleCall_0_0());
				}
				lv_predictives_0_0=rulePredictiveVars
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariablesRule());
					}
					set(
						$current,
						"predictives",
						lv_predictives_0_0,
						"m2.idm.project.MLRegression.PredictiveVars");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVariablesAccess().getTargetsTargetVarsParserRuleCall_1_0());
				}
				lv_targets_1_0=ruleTargetVars
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariablesRule());
					}
					set(
						$current,
						"targets",
						lv_targets_1_0,
						"m2.idm.project.MLRegression.TargetVars");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePredictiveVars
entryRulePredictiveVars returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredictiveVarsRule()); }
	iv_rulePredictiveVars=rulePredictiveVars
	{ $current=$iv_rulePredictiveVars.current; }
	EOF;

// Rule PredictiveVars
rulePredictiveVars returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='predictive_vars'
		{
			newLeafNode(otherlv_0, grammarAccess.getPredictiveVarsAccess().getPredictive_varsKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPredictiveVarsAccess().getColonKeyword_1());
		}
		(
			(
				lv_predVar_2_0=RULE_STRING
				{
					newLeafNode(lv_predVar_2_0, grammarAccess.getPredictiveVarsAccess().getPredVarSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPredictiveVarsRule());
					}
					addWithLastConsumed(
						$current,
						"predVar",
						lv_predVar_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getPredictiveVarsAccess().getCommaKeyword_3_0());
			}
			(
				(
					lv_predVar_4_0=RULE_STRING
					{
						newLeafNode(lv_predVar_4_0, grammarAccess.getPredictiveVarsAccess().getPredVarSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPredictiveVarsRule());
						}
						addWithLastConsumed(
							$current,
							"predVar",
							lv_predVar_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getPredictiveVarsAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleTargetVars
entryRuleTargetVars returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetVarsRule()); }
	iv_ruleTargetVars=ruleTargetVars
	{ $current=$iv_ruleTargetVars.current; }
	EOF;

// Rule TargetVars
ruleTargetVars returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='target_vars'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetVarsAccess().getTarget_varsKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTargetVarsAccess().getColonKeyword_1());
		}
		(
			(
				lv_targetVar_2_0=RULE_STRING
				{
					newLeafNode(lv_targetVar_2_0, grammarAccess.getTargetVarsAccess().getTargetVarSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTargetVarsRule());
					}
					addWithLastConsumed(
						$current,
						"targetVar",
						lv_targetVar_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getTargetVarsAccess().getCommaKeyword_3_0());
			}
			(
				(
					lv_targetVar_4_0=RULE_STRING
					{
						newLeafNode(lv_targetVar_4_0, grammarAccess.getTargetVarsAccess().getTargetVarSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTargetVarsRule());
						}
						addWithLastConsumed(
							$current,
							"targetVar",
							lv_targetVar_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTargetVarsAccess().getSemicolonKeyword_4());
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
					newCompositeNode(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_2_0());
				}
				lv_test_2_0=ruleNumericValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartitionRule());
					}
					set(
						$current,
						"test",
						lv_test_2_0,
						"m2.idm.project.MLRegression.NumericValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getPartitionAccess().getSemicolonKeyword_3());
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
				lv_k_2_0=RULE_INT
				{
					newLeafNode(lv_k_2_0, grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCrossValidationRule());
					}
					setWithLastConsumed(
						$current,
						"k",
						lv_k_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getCrossValidationAccess().getSemicolonKeyword_3());
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
					newCompositeNode(grammarAccess.getAlgoAccess().getAlgoAlgoTypeParserRuleCall_2_0());
				}
				lv_algo_2_0=ruleAlgoType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlgoRule());
					}
					set(
						$current,
						"algo",
						lv_algo_2_0,
						"m2.idm.project.MLRegression.AlgoType");
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

// Entry rule entryRuleAlgoType
entryRuleAlgoType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAlgoTypeRule()); }
	iv_ruleAlgoType=ruleAlgoType
	{ $current=$iv_ruleAlgoType.current.getText(); }
	EOF;

// Rule AlgoType
ruleAlgoType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAlgoTypeAccess().getLineRegressParserRuleCall_0());
		}
		this_LineRegress_0=ruleLineRegress
		{
			$current.merge(this_LineRegress_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAlgoTypeAccess().getSVRParserRuleCall_1());
		}
		this_SVR_1=ruleSVR
		{
			$current.merge(this_SVR_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAlgoTypeAccess().getDecisionTreeRegressorParserRuleCall_2());
		}
		this_DecisionTreeRegressor_2=ruleDecisionTreeRegressor
		{
			$current.merge(this_DecisionTreeRegressor_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLineRegress
entryRuleLineRegress returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLineRegressRule()); }
	iv_ruleLineRegress=ruleLineRegress
	{ $current=$iv_ruleLineRegress.current.getText(); }
	EOF;

// Rule LineRegress
ruleLineRegress returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='line_regress'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getLineRegressAccess().getLine_regressKeyword());
	}
;

// Entry rule entryRuleDecisionTreeRegressor
entryRuleDecisionTreeRegressor returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDecisionTreeRegressorRule()); }
	iv_ruleDecisionTreeRegressor=ruleDecisionTreeRegressor
	{ $current=$iv_ruleDecisionTreeRegressor.current.getText(); }
	EOF;

// Rule DecisionTreeRegressor
ruleDecisionTreeRegressor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='decision_tree_regressor'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword());
	}
;

// Entry rule entryRuleSVR
entryRuleSVR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSVRRule()); }
	iv_ruleSVR=ruleSVR
	{ $current=$iv_ruleSVR.current.getText(); }
	EOF;

// Rule SVR
ruleSVR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='svr'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSVRAccess().getSvrKeyword());
	}
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
			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMeanAbsoluteErrorParserRuleCall_0());
		}
		this_MeanAbsoluteError_0=ruleMeanAbsoluteError
		{
			$current.merge(this_MeanAbsoluteError_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMeanSquaredErrorParserRuleCall_1());
		}
		this_MeanSquaredError_1=ruleMeanSquaredError
		{
			$current.merge(this_MeanSquaredError_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMedianAbsoluteErrorParserRuleCall_2());
		}
		this_MedianAbsoluteError_2=ruleMedianAbsoluteError
		{
			$current.merge(this_MedianAbsoluteError_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMeanAbsoluteError
entryRuleMeanAbsoluteError returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMeanAbsoluteErrorRule()); }
	iv_ruleMeanAbsoluteError=ruleMeanAbsoluteError
	{ $current=$iv_ruleMeanAbsoluteError.current.getText(); }
	EOF;

// Rule MeanAbsoluteError
ruleMeanAbsoluteError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='mean_absolute_error'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getMeanAbsoluteErrorAccess().getMean_absolute_errorKeyword());
	}
;

// Entry rule entryRuleMeanSquaredError
entryRuleMeanSquaredError returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMeanSquaredErrorRule()); }
	iv_ruleMeanSquaredError=ruleMeanSquaredError
	{ $current=$iv_ruleMeanSquaredError.current.getText(); }
	EOF;

// Rule MeanSquaredError
ruleMeanSquaredError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='mean_squared_error'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getMeanSquaredErrorAccess().getMean_squared_errorKeyword());
	}
;

// Entry rule entryRuleMedianAbsoluteError
entryRuleMedianAbsoluteError returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMedianAbsoluteErrorRule()); }
	iv_ruleMedianAbsoluteError=ruleMedianAbsoluteError
	{ $current=$iv_ruleMedianAbsoluteError.current.getText(); }
	EOF;

// Rule MedianAbsoluteError
ruleMedianAbsoluteError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='median_absolute_error'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getMedianAbsoluteErrorAccess().getMedian_absolute_errorKeyword());
	}
;

// Entry rule entryRuleLoop
entryRuleLoop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopRule()); }
	iv_ruleLoop=ruleLoop
	{ $current=$iv_ruleLoop.current; }
	EOF;

// Rule Loop
ruleLoop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Loop'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getColonKeyword_1());
		}
		(
			(
				lv_i_2_0=RULE_INT
				{
					newLeafNode(lv_i_2_0, grammarAccess.getLoopAccess().getIINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLoopRule());
					}
					setWithLastConsumed(
						$current,
						"i",
						lv_i_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getSemicolonKeyword_3());
		}
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
			newCompositeNode(grammarAccess.getNumericValueAccess().getFLOATParserRuleCall_0());
		}
		this_FLOAT_0=ruleFLOAT
		{
			$current = $this_FLOAT_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNumericValueAccess().getPERCENTParserRuleCall_1());
		}
		this_PERCENT_1=rulePERCENT
		{
			$current = $this_PERCENT_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFLOAT
entryRuleFLOAT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFLOATRule()); }
	iv_ruleFLOAT=ruleFLOAT
	{ $current=$iv_ruleFLOAT.current; }
	EOF;

// Rule FLOAT
ruleFLOAT returns [EObject current=null]
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
					newLeafNode(lv_value_0_0, grammarAccess.getFLOATAccess().getValueINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFLOATRule());
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
				newLeafNode(otherlv_1, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0());
			}
			(
				(
					lv_decimal_2_0=RULE_INT
					{
						newLeafNode(lv_decimal_2_0, grammarAccess.getFLOATAccess().getDecimalINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFLOATRule());
						}
						setWithLastConsumed(
							$current,
							"decimal",
							lv_decimal_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePERCENT
entryRulePERCENT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPERCENTRule()); }
	iv_rulePERCENT=rulePERCENT
	{ $current=$iv_rulePERCENT.current; }
	EOF;

// Rule PERCENT
rulePERCENT returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getPERCENTAccess().getFloatFLOATParserRuleCall_0_0());
				}
				lv_float_0_0=ruleFLOAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPERCENTRule());
					}
					set(
						$current,
						"float",
						lv_float_0_0,
						"m2.idm.project.MLRegression.FLOAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='%'
		{
			newLeafNode(otherlv_1, grammarAccess.getPERCENTAccess().getPercentSignKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
