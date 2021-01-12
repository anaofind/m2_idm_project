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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMLRegressionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'partition'", "':'", "','", "'cross_validation'", "'('", "')'", "'predictive_vars'", "'target_vars'", "'calculate'", "'algorithm'", "'line_regress()'", "'='", "'predict'", "'()'", "'decision_tree_regressor'", "'svr'", "'mean_absolute_error'", "'mean_square_error'", "'median_absolute_error'", "'.'", "'%'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMLRegressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMLRegressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMLRegressionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMLRegression.g"; }



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




    // $ANTLR start "entryRuleMLRegression"
    // InternalMLRegression.g:64:1: entryRuleMLRegression returns [EObject current=null] : iv_ruleMLRegression= ruleMLRegression EOF ;
    public final EObject entryRuleMLRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLRegression = null;


        try {
            // InternalMLRegression.g:64:53: (iv_ruleMLRegression= ruleMLRegression EOF )
            // InternalMLRegression.g:65:2: iv_ruleMLRegression= ruleMLRegression EOF
            {
             newCompositeNode(grammarAccess.getMLRegressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLRegression=ruleMLRegression();

            state._fsp--;

             current =iv_ruleMLRegression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMLRegression"


    // $ANTLR start "ruleMLRegression"
    // InternalMLRegression.g:71:1: ruleMLRegression returns [EObject current=null] : ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) ) ;
    public final EObject ruleMLRegression() throws RecognitionException {
        EObject current = null;

        EObject lv_dataset_0_0 = null;

        EObject lv_vars_1_0 = null;

        EObject lv_evaluation_2_0 = null;

        EObject lv_algo_3_0 = null;

        EObject lv_calculate_4_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:77:2: ( ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) ) )
            // InternalMLRegression.g:78:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) )
            {
            // InternalMLRegression.g:78:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) )
            // InternalMLRegression.g:79:3: ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) )
            {
            // InternalMLRegression.g:79:3: ( (lv_dataset_0_0= ruleDataset ) )
            // InternalMLRegression.g:80:4: (lv_dataset_0_0= ruleDataset )
            {
            // InternalMLRegression.g:80:4: (lv_dataset_0_0= ruleDataset )
            // InternalMLRegression.g:81:5: lv_dataset_0_0= ruleDataset
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getDatasetDatasetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_dataset_0_0=ruleDataset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
            					}
            					set(
            						current,
            						"dataset",
            						lv_dataset_0_0,
            						"m2.idm.project.MLRegression.Dataset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLRegression.g:98:3: ( (lv_vars_1_0= ruleVariables ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:99:4: (lv_vars_1_0= ruleVariables )
                    {
                    // InternalMLRegression.g:99:4: (lv_vars_1_0= ruleVariables )
                    // InternalMLRegression.g:100:5: lv_vars_1_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_vars_1_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
                    					}
                    					set(
                    						current,
                    						"vars",
                    						lv_vars_1_0,
                    						"m2.idm.project.MLRegression.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMLRegression.g:117:3: ( (lv_evaluation_2_0= ruleEvaluationType ) )
            // InternalMLRegression.g:118:4: (lv_evaluation_2_0= ruleEvaluationType )
            {
            // InternalMLRegression.g:118:4: (lv_evaluation_2_0= ruleEvaluationType )
            // InternalMLRegression.g:119:5: lv_evaluation_2_0= ruleEvaluationType
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_evaluation_2_0=ruleEvaluationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
            					}
            					set(
            						current,
            						"evaluation",
            						lv_evaluation_2_0,
            						"m2.idm.project.MLRegression.EvaluationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLRegression.g:136:3: ( (lv_algo_3_0= ruleAlgo ) )
            // InternalMLRegression.g:137:4: (lv_algo_3_0= ruleAlgo )
            {
            // InternalMLRegression.g:137:4: (lv_algo_3_0= ruleAlgo )
            // InternalMLRegression.g:138:5: lv_algo_3_0= ruleAlgo
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_algo_3_0=ruleAlgo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
            					}
            					set(
            						current,
            						"algo",
            						lv_algo_3_0,
            						"m2.idm.project.MLRegression.Algo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLRegression.g:155:3: ( (lv_calculate_4_0= ruleCalculate ) )
            // InternalMLRegression.g:156:4: (lv_calculate_4_0= ruleCalculate )
            {
            // InternalMLRegression.g:156:4: (lv_calculate_4_0= ruleCalculate )
            // InternalMLRegression.g:157:5: lv_calculate_4_0= ruleCalculate
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_calculate_4_0=ruleCalculate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
            					}
            					set(
            						current,
            						"calculate",
            						lv_calculate_4_0,
            						"m2.idm.project.MLRegression.Calculate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLRegression"


    // $ANTLR start "entryRuleDataset"
    // InternalMLRegression.g:178:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalMLRegression.g:178:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalMLRegression.g:179:2: iv_ruleDataset= ruleDataset EOF
            {
             newCompositeNode(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataset=ruleDataset();

            state._fsp--;

             current =iv_ruleDataset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataset"


    // $ANTLR start "ruleDataset"
    // InternalMLRegression.g:185:1: ruleDataset returns [EObject current=null] : (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_1_0=null;
        Token lv_separator_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLRegression.g:191:2: ( (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalMLRegression.g:192:2: (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalMLRegression.g:192:2: (otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalMLRegression.g:193:3: otherlv_0= 'import' ( (lv_data_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getImportKeyword_0());
            		
            // InternalMLRegression.g:197:3: ( (lv_data_1_0= RULE_STRING ) )
            // InternalMLRegression.g:198:4: (lv_data_1_0= RULE_STRING )
            {
            // InternalMLRegression.g:198:4: (lv_data_1_0= RULE_STRING )
            // InternalMLRegression.g:199:5: lv_data_1_0= RULE_STRING
            {
            lv_data_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_data_1_0, grammarAccess.getDatasetAccess().getDataSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"data",
            						lv_data_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMLRegression.g:215:3: ( (lv_separator_2_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMLRegression.g:216:4: (lv_separator_2_0= RULE_STRING )
                    {
                    // InternalMLRegression.g:216:4: (lv_separator_2_0= RULE_STRING )
                    // InternalMLRegression.g:217:5: lv_separator_2_0= RULE_STRING
                    {
                    lv_separator_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    					newLeafNode(lv_separator_2_0, grammarAccess.getDatasetAccess().getSeparatorSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatasetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"separator",
                    						lv_separator_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasetAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataset"


    // $ANTLR start "entryRuleEvaluationType"
    // InternalMLRegression.g:241:1: entryRuleEvaluationType returns [EObject current=null] : iv_ruleEvaluationType= ruleEvaluationType EOF ;
    public final EObject entryRuleEvaluationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationType = null;


        try {
            // InternalMLRegression.g:241:55: (iv_ruleEvaluationType= ruleEvaluationType EOF )
            // InternalMLRegression.g:242:2: iv_ruleEvaluationType= ruleEvaluationType EOF
            {
             newCompositeNode(grammarAccess.getEvaluationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluationType=ruleEvaluationType();

            state._fsp--;

             current =iv_ruleEvaluationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluationType"


    // $ANTLR start "ruleEvaluationType"
    // InternalMLRegression.g:248:1: ruleEvaluationType returns [EObject current=null] : (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation ) ;
    public final EObject ruleEvaluationType() throws RecognitionException {
        EObject current = null;

        EObject this_Partition_0 = null;

        EObject this_CrossValidation_1 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:254:2: ( (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation ) )
            // InternalMLRegression.g:255:2: (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation )
            {
            // InternalMLRegression.g:255:2: (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMLRegression.g:256:3: this_Partition_0= rulePartition
                    {

                    			newCompositeNode(grammarAccess.getEvaluationTypeAccess().getPartitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Partition_0=rulePartition();

                    state._fsp--;


                    			current = this_Partition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:265:3: this_CrossValidation_1= ruleCrossValidation
                    {

                    			newCompositeNode(grammarAccess.getEvaluationTypeAccess().getCrossValidationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossValidation_1=ruleCrossValidation();

                    state._fsp--;


                    			current = this_CrossValidation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluationType"


    // $ANTLR start "entryRulePartition"
    // InternalMLRegression.g:277:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalMLRegression.g:277:50: (iv_rulePartition= rulePartition EOF )
            // InternalMLRegression.g:278:2: iv_rulePartition= rulePartition EOF
            {
             newCompositeNode(grammarAccess.getPartitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartition=rulePartition();

            state._fsp--;

             current =iv_rulePartition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartition"


    // $ANTLR start "rulePartition"
    // InternalMLRegression.g:284:1: rulePartition returns [EObject current=null] : (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_test_4_0= RULE_INT ) ) otherlv_5= ';' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_train_2_0=null;
        Token otherlv_3=null;
        Token lv_test_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMLRegression.g:290:2: ( (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_test_4_0= RULE_INT ) ) otherlv_5= ';' ) )
            // InternalMLRegression.g:291:2: (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_test_4_0= RULE_INT ) ) otherlv_5= ';' )
            {
            // InternalMLRegression.g:291:2: (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_test_4_0= RULE_INT ) ) otherlv_5= ';' )
            // InternalMLRegression.g:292:3: otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_test_4_0= RULE_INT ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPartitionAccess().getPartitionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:300:3: ( (lv_train_2_0= RULE_INT ) )
            // InternalMLRegression.g:301:4: (lv_train_2_0= RULE_INT )
            {
            // InternalMLRegression.g:301:4: (lv_train_2_0= RULE_INT )
            // InternalMLRegression.g:302:5: lv_train_2_0= RULE_INT
            {
            lv_train_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_train_2_0, grammarAccess.getPartitionAccess().getTrainINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"train",
            						lv_train_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPartitionAccess().getCommaKeyword_3());
            		
            // InternalMLRegression.g:322:3: ( (lv_test_4_0= RULE_INT ) )
            // InternalMLRegression.g:323:4: (lv_test_4_0= RULE_INT )
            {
            // InternalMLRegression.g:323:4: (lv_test_4_0= RULE_INT )
            // InternalMLRegression.g:324:5: lv_test_4_0= RULE_INT
            {
            lv_test_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_test_4_0, grammarAccess.getPartitionAccess().getTestINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"test",
            						lv_test_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPartitionAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartition"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMLRegression.g:348:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMLRegression.g:348:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMLRegression.g:349:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMLRegression.g:355:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'cross_validation' otherlv_1= '(' ( (lv_c_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_randomState_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_c_2_0=null;
        Token otherlv_3=null;
        Token lv_randomState_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMLRegression.g:361:2: ( (otherlv_0= 'cross_validation' otherlv_1= '(' ( (lv_c_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_randomState_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalMLRegression.g:362:2: (otherlv_0= 'cross_validation' otherlv_1= '(' ( (lv_c_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_randomState_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalMLRegression.g:362:2: (otherlv_0= 'cross_validation' otherlv_1= '(' ( (lv_c_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_randomState_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalMLRegression.g:363:3: otherlv_0= 'cross_validation' otherlv_1= '(' ( (lv_c_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_randomState_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMLRegression.g:371:3: ( (lv_c_2_0= RULE_INT ) )
            // InternalMLRegression.g:372:4: (lv_c_2_0= RULE_INT )
            {
            // InternalMLRegression.g:372:4: (lv_c_2_0= RULE_INT )
            // InternalMLRegression.g:373:5: lv_c_2_0= RULE_INT
            {
            lv_c_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_c_2_0, grammarAccess.getCrossValidationAccess().getCINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrossValidationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"c",
            						lv_c_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCrossValidationAccess().getCommaKeyword_3());
            		
            // InternalMLRegression.g:393:3: ( (lv_randomState_4_0= RULE_INT ) )
            // InternalMLRegression.g:394:4: (lv_randomState_4_0= RULE_INT )
            {
            // InternalMLRegression.g:394:4: (lv_randomState_4_0= RULE_INT )
            // InternalMLRegression.g:395:5: lv_randomState_4_0= RULE_INT
            {
            lv_randomState_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_randomState_4_0, grammarAccess.getCrossValidationAccess().getRandomStateINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrossValidationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"randomState",
            						lv_randomState_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getCrossValidationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCrossValidationAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleVariables"
    // InternalMLRegression.g:423:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalMLRegression.g:423:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalMLRegression.g:424:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalMLRegression.g:430:1: ruleVariables returns [EObject current=null] : ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject lv_predictives_0_0 = null;

        EObject lv_targets_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:436:2: ( ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) ) )
            // InternalMLRegression.g:437:2: ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) )
            {
            // InternalMLRegression.g:437:2: ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) )
            // InternalMLRegression.g:438:3: ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) )
            {
            // InternalMLRegression.g:438:3: ( (lv_predictives_0_0= ruleListePredictiveVar ) )
            // InternalMLRegression.g:439:4: (lv_predictives_0_0= ruleListePredictiveVar )
            {
            // InternalMLRegression.g:439:4: (lv_predictives_0_0= ruleListePredictiveVar )
            // InternalMLRegression.g:440:5: lv_predictives_0_0= ruleListePredictiveVar
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getPredictivesListePredictiveVarParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_predictives_0_0=ruleListePredictiveVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"predictives",
            						lv_predictives_0_0,
            						"m2.idm.project.MLRegression.ListePredictiveVar");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLRegression.g:457:3: ( (lv_targets_1_0= ruleTargetVar ) )
            // InternalMLRegression.g:458:4: (lv_targets_1_0= ruleTargetVar )
            {
            // InternalMLRegression.g:458:4: (lv_targets_1_0= ruleTargetVar )
            // InternalMLRegression.g:459:5: lv_targets_1_0= ruleTargetVar
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getTargetsTargetVarParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_targets_1_0=ruleTargetVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"targets",
            						lv_targets_1_0,
            						"m2.idm.project.MLRegression.TargetVar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleListePredictiveVar"
    // InternalMLRegression.g:480:1: entryRuleListePredictiveVar returns [EObject current=null] : iv_ruleListePredictiveVar= ruleListePredictiveVar EOF ;
    public final EObject entryRuleListePredictiveVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListePredictiveVar = null;


        try {
            // InternalMLRegression.g:480:59: (iv_ruleListePredictiveVar= ruleListePredictiveVar EOF )
            // InternalMLRegression.g:481:2: iv_ruleListePredictiveVar= ruleListePredictiveVar EOF
            {
             newCompositeNode(grammarAccess.getListePredictiveVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListePredictiveVar=ruleListePredictiveVar();

            state._fsp--;

             current =iv_ruleListePredictiveVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListePredictiveVar"


    // $ANTLR start "ruleListePredictiveVar"
    // InternalMLRegression.g:487:1: ruleListePredictiveVar returns [EObject current=null] : (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleListePredictiveVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_predVar_2_0=null;
        Token otherlv_3=null;
        Token lv_predVar_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMLRegression.g:493:2: ( (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) )
            // InternalMLRegression.g:494:2: (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            {
            // InternalMLRegression.g:494:2: (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            // InternalMLRegression.g:495:3: otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getListePredictiveVarAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:503:3: ( (lv_predVar_2_0= RULE_STRING ) )
            // InternalMLRegression.g:504:4: (lv_predVar_2_0= RULE_STRING )
            {
            // InternalMLRegression.g:504:4: (lv_predVar_2_0= RULE_STRING )
            // InternalMLRegression.g:505:5: lv_predVar_2_0= RULE_STRING
            {
            lv_predVar_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_predVar_2_0, grammarAccess.getListePredictiveVarAccess().getPredVarSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListePredictiveVarRule());
            					}
            					addWithLastConsumed(
            						current,
            						"predVar",
            						lv_predVar_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMLRegression.g:521:3: (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMLRegression.g:522:4: otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMLRegression.g:526:4: ( (lv_predVar_4_0= RULE_STRING ) )
            	    // InternalMLRegression.g:527:5: (lv_predVar_4_0= RULE_STRING )
            	    {
            	    // InternalMLRegression.g:527:5: (lv_predVar_4_0= RULE_STRING )
            	    // InternalMLRegression.g:528:6: lv_predVar_4_0= RULE_STRING
            	    {
            	    lv_predVar_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    						newLeafNode(lv_predVar_4_0, grammarAccess.getListePredictiveVarAccess().getPredVarSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListePredictiveVarRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"predVar",
            	    							lv_predVar_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getListePredictiveVarAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListePredictiveVar"


    // $ANTLR start "entryRuleTargetVar"
    // InternalMLRegression.g:553:1: entryRuleTargetVar returns [EObject current=null] : iv_ruleTargetVar= ruleTargetVar EOF ;
    public final EObject entryRuleTargetVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetVar = null;


        try {
            // InternalMLRegression.g:553:50: (iv_ruleTargetVar= ruleTargetVar EOF )
            // InternalMLRegression.g:554:2: iv_ruleTargetVar= ruleTargetVar EOF
            {
             newCompositeNode(grammarAccess.getTargetVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetVar=ruleTargetVar();

            state._fsp--;

             current =iv_ruleTargetVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetVar"


    // $ANTLR start "ruleTargetVar"
    // InternalMLRegression.g:560:1: ruleTargetVar returns [EObject current=null] : (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleTargetVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_targetVar_2_0=null;
        Token otherlv_3=null;
        Token lv_targetVar_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMLRegression.g:566:2: ( (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) )
            // InternalMLRegression.g:567:2: (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            {
            // InternalMLRegression.g:567:2: (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            // InternalMLRegression.g:568:3: otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetVarAccess().getTarget_varsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetVarAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:576:3: ( (lv_targetVar_2_0= RULE_STRING ) )
            // InternalMLRegression.g:577:4: (lv_targetVar_2_0= RULE_STRING )
            {
            // InternalMLRegression.g:577:4: (lv_targetVar_2_0= RULE_STRING )
            // InternalMLRegression.g:578:5: lv_targetVar_2_0= RULE_STRING
            {
            lv_targetVar_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_targetVar_2_0, grammarAccess.getTargetVarAccess().getTargetVarSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetVarRule());
            					}
            					addWithLastConsumed(
            						current,
            						"targetVar",
            						lv_targetVar_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMLRegression.g:594:3: (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMLRegression.g:595:4: otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTargetVarAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMLRegression.g:599:4: ( (lv_targetVar_4_0= RULE_STRING ) )
            	    // InternalMLRegression.g:600:5: (lv_targetVar_4_0= RULE_STRING )
            	    {
            	    // InternalMLRegression.g:600:5: (lv_targetVar_4_0= RULE_STRING )
            	    // InternalMLRegression.g:601:6: lv_targetVar_4_0= RULE_STRING
            	    {
            	    lv_targetVar_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    						newLeafNode(lv_targetVar_4_0, grammarAccess.getTargetVarAccess().getTargetVarSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTargetVarRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"targetVar",
            	    							lv_targetVar_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTargetVarAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetVar"


    // $ANTLR start "entryRuleCalculate"
    // InternalMLRegression.g:626:1: entryRuleCalculate returns [EObject current=null] : iv_ruleCalculate= ruleCalculate EOF ;
    public final EObject entryRuleCalculate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculate = null;


        try {
            // InternalMLRegression.g:626:50: (iv_ruleCalculate= ruleCalculate EOF )
            // InternalMLRegression.g:627:2: iv_ruleCalculate= ruleCalculate EOF
            {
             newCompositeNode(grammarAccess.getCalculateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculate=ruleCalculate();

            state._fsp--;

             current =iv_ruleCalculate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculate"


    // $ANTLR start "ruleCalculate"
    // InternalMLRegression.g:633:1: ruleCalculate returns [EObject current=null] : (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' ) ;
    public final EObject ruleCalculate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_calculateType_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:639:2: ( (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:640:2: (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:640:2: (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' )
            // InternalMLRegression.g:641:3: otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCalculateAccess().getCalculateKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCalculateAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:649:3: ( (lv_calculateType_2_0= ruleCalculateType ) )
            // InternalMLRegression.g:650:4: (lv_calculateType_2_0= ruleCalculateType )
            {
            // InternalMLRegression.g:650:4: (lv_calculateType_2_0= ruleCalculateType )
            // InternalMLRegression.g:651:5: lv_calculateType_2_0= ruleCalculateType
            {

            					newCompositeNode(grammarAccess.getCalculateAccess().getCalculateTypeCalculateTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_calculateType_2_0=ruleCalculateType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalculateRule());
            					}
            					set(
            						current,
            						"calculateType",
            						lv_calculateType_2_0,
            						"m2.idm.project.MLRegression.CalculateType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCalculateAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculate"


    // $ANTLR start "entryRuleCalculateType"
    // InternalMLRegression.g:676:1: entryRuleCalculateType returns [String current=null] : iv_ruleCalculateType= ruleCalculateType EOF ;
    public final String entryRuleCalculateType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCalculateType = null;


        try {
            // InternalMLRegression.g:676:53: (iv_ruleCalculateType= ruleCalculateType EOF )
            // InternalMLRegression.g:677:2: iv_ruleCalculateType= ruleCalculateType EOF
            {
             newCompositeNode(grammarAccess.getCalculateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculateType=ruleCalculateType();

            state._fsp--;

             current =iv_ruleCalculateType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculateType"


    // $ANTLR start "ruleCalculateType"
    // InternalMLRegression.g:683:1: ruleCalculateType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError ) ;
    public final AntlrDatatypeRuleToken ruleCalculateType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MeanAbsoluteError_0 = null;

        AntlrDatatypeRuleToken this_MeanSquaredError_1 = null;

        AntlrDatatypeRuleToken this_MedianAbsoluteError_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:689:2: ( (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError ) )
            // InternalMLRegression.g:690:2: (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError )
            {
            // InternalMLRegression.g:690:2: (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMLRegression.g:691:3: this_MeanAbsoluteError_0= ruleMeanAbsoluteError
                    {

                    			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMeanAbsoluteErrorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeanAbsoluteError_0=ruleMeanAbsoluteError();

                    state._fsp--;


                    			current.merge(this_MeanAbsoluteError_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:702:3: this_MeanSquaredError_1= ruleMeanSquaredError
                    {

                    			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMeanSquaredErrorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeanSquaredError_1=ruleMeanSquaredError();

                    state._fsp--;


                    			current.merge(this_MeanSquaredError_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:713:3: this_MedianAbsoluteError_2= ruleMedianAbsoluteError
                    {

                    			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMedianAbsoluteErrorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MedianAbsoluteError_2=ruleMedianAbsoluteError();

                    state._fsp--;


                    			current.merge(this_MedianAbsoluteError_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculateType"


    // $ANTLR start "entryRuleAlgo"
    // InternalMLRegression.g:727:1: entryRuleAlgo returns [EObject current=null] : iv_ruleAlgo= ruleAlgo EOF ;
    public final EObject entryRuleAlgo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgo = null;


        try {
            // InternalMLRegression.g:727:45: (iv_ruleAlgo= ruleAlgo EOF )
            // InternalMLRegression.g:728:2: iv_ruleAlgo= ruleAlgo EOF
            {
             newCompositeNode(grammarAccess.getAlgoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgo=ruleAlgo();

            state._fsp--;

             current =iv_ruleAlgo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgo"


    // $ANTLR start "ruleAlgo"
    // InternalMLRegression.g:734:1: ruleAlgo returns [EObject current=null] : (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' ) ;
    public final EObject ruleAlgo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_algo_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:740:2: ( (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:741:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:741:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' )
            // InternalMLRegression.g:742:3: otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgoAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgoAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:750:3: ( (lv_algo_2_0= ruleAlgoType ) )
            // InternalMLRegression.g:751:4: (lv_algo_2_0= ruleAlgoType )
            {
            // InternalMLRegression.g:751:4: (lv_algo_2_0= ruleAlgoType )
            // InternalMLRegression.g:752:5: lv_algo_2_0= ruleAlgoType
            {

            					newCompositeNode(grammarAccess.getAlgoAccess().getAlgoAlgoTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_algo_2_0=ruleAlgoType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgoRule());
            					}
            					set(
            						current,
            						"algo",
            						lv_algo_2_0,
            						"m2.idm.project.MLRegression.AlgoType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgoAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgo"


    // $ANTLR start "entryRuleAlgoType"
    // InternalMLRegression.g:777:1: entryRuleAlgoType returns [EObject current=null] : iv_ruleAlgoType= ruleAlgoType EOF ;
    public final EObject entryRuleAlgoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgoType = null;


        try {
            // InternalMLRegression.g:777:49: (iv_ruleAlgoType= ruleAlgoType EOF )
            // InternalMLRegression.g:778:2: iv_ruleAlgoType= ruleAlgoType EOF
            {
             newCompositeNode(grammarAccess.getAlgoTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgoType=ruleAlgoType();

            state._fsp--;

             current =iv_ruleAlgoType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgoType"


    // $ANTLR start "ruleAlgoType"
    // InternalMLRegression.g:784:1: ruleAlgoType returns [EObject current=null] : (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor ) ;
    public final EObject ruleAlgoType() throws RecognitionException {
        EObject current = null;

        EObject this_LineRegress_0 = null;

        EObject this_SVR_1 = null;

        EObject this_DecisionTreeRegressor_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:790:2: ( (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor ) )
            // InternalMLRegression.g:791:2: (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor )
            {
            // InternalMLRegression.g:791:2: (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMLRegression.g:792:3: this_LineRegress_0= ruleLineRegress
                    {

                    			newCompositeNode(grammarAccess.getAlgoTypeAccess().getLineRegressParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineRegress_0=ruleLineRegress();

                    state._fsp--;


                    			current = this_LineRegress_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:801:3: this_SVR_1= ruleSVR
                    {

                    			newCompositeNode(grammarAccess.getAlgoTypeAccess().getSVRParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVR_1=ruleSVR();

                    state._fsp--;


                    			current = this_SVR_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:810:3: this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor
                    {

                    			newCompositeNode(grammarAccess.getAlgoTypeAccess().getDecisionTreeRegressorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecisionTreeRegressor_2=ruleDecisionTreeRegressor();

                    state._fsp--;


                    			current = this_DecisionTreeRegressor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgoType"


    // $ANTLR start "entryRuleLineRegress"
    // InternalMLRegression.g:822:1: entryRuleLineRegress returns [EObject current=null] : iv_ruleLineRegress= ruleLineRegress EOF ;
    public final EObject entryRuleLineRegress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineRegress = null;


        try {
            // InternalMLRegression.g:822:52: (iv_ruleLineRegress= ruleLineRegress EOF )
            // InternalMLRegression.g:823:2: iv_ruleLineRegress= ruleLineRegress EOF
            {
             newCompositeNode(grammarAccess.getLineRegressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineRegress=ruleLineRegress();

            state._fsp--;

             current =iv_ruleLineRegress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineRegress"


    // $ANTLR start "ruleLineRegress"
    // InternalMLRegression.g:829:1: ruleLineRegress returns [EObject current=null] : (otherlv_0= 'line_regress()' otherlv_1= ',' ( (lv_leftSidePredict_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'predict' otherlv_5= '()' ) ;
    public final EObject ruleLineRegress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_leftSidePredict_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMLRegression.g:835:2: ( (otherlv_0= 'line_regress()' otherlv_1= ',' ( (lv_leftSidePredict_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'predict' otherlv_5= '()' ) )
            // InternalMLRegression.g:836:2: (otherlv_0= 'line_regress()' otherlv_1= ',' ( (lv_leftSidePredict_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'predict' otherlv_5= '()' )
            {
            // InternalMLRegression.g:836:2: (otherlv_0= 'line_regress()' otherlv_1= ',' ( (lv_leftSidePredict_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'predict' otherlv_5= '()' )
            // InternalMLRegression.g:837:3: otherlv_0= 'line_regress()' otherlv_1= ',' ( (lv_leftSidePredict_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'predict' otherlv_5= '()'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLineRegressAccess().getLine_regressKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLineRegressAccess().getCommaKeyword_1());
            		
            // InternalMLRegression.g:845:3: ( (lv_leftSidePredict_2_0= RULE_ID ) )
            // InternalMLRegression.g:846:4: (lv_leftSidePredict_2_0= RULE_ID )
            {
            // InternalMLRegression.g:846:4: (lv_leftSidePredict_2_0= RULE_ID )
            // InternalMLRegression.g:847:5: lv_leftSidePredict_2_0= RULE_ID
            {
            lv_leftSidePredict_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_leftSidePredict_2_0, grammarAccess.getLineRegressAccess().getLeftSidePredictIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRegressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"leftSidePredict",
            						lv_leftSidePredict_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLineRegressAccess().getEqualsSignKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getLineRegressAccess().getPredictKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLineRegressAccess().getLeftParenthesisRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineRegress"


    // $ANTLR start "entryRuleDecisionTreeRegressor"
    // InternalMLRegression.g:879:1: entryRuleDecisionTreeRegressor returns [EObject current=null] : iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF ;
    public final EObject entryRuleDecisionTreeRegressor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionTreeRegressor = null;


        try {
            // InternalMLRegression.g:879:62: (iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF )
            // InternalMLRegression.g:880:2: iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF
            {
             newCompositeNode(grammarAccess.getDecisionTreeRegressorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionTreeRegressor=ruleDecisionTreeRegressor();

            state._fsp--;

             current =iv_ruleDecisionTreeRegressor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecisionTreeRegressor"


    // $ANTLR start "ruleDecisionTreeRegressor"
    // InternalMLRegression.g:886:1: ruleDecisionTreeRegressor returns [EObject current=null] : (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleDecisionTreeRegressor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rand_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLRegression.g:892:2: ( (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalMLRegression.g:893:2: (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalMLRegression.g:893:2: (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalMLRegression.g:894:3: otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMLRegression.g:902:3: ( (lv_rand_2_0= RULE_INT ) )
            // InternalMLRegression.g:903:4: (lv_rand_2_0= RULE_INT )
            {
            // InternalMLRegression.g:903:4: (lv_rand_2_0= RULE_INT )
            // InternalMLRegression.g:904:5: lv_rand_2_0= RULE_INT
            {
            lv_rand_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_rand_2_0, grammarAccess.getDecisionTreeRegressorAccess().getRandINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecisionTreeRegressorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rand",
            						lv_rand_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDecisionTreeRegressorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecisionTreeRegressor"


    // $ANTLR start "entryRuleSVR"
    // InternalMLRegression.g:928:1: entryRuleSVR returns [EObject current=null] : iv_ruleSVR= ruleSVR EOF ;
    public final EObject entryRuleSVR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVR = null;


        try {
            // InternalMLRegression.g:928:44: (iv_ruleSVR= ruleSVR EOF )
            // InternalMLRegression.g:929:2: iv_ruleSVR= ruleSVR EOF
            {
             newCompositeNode(grammarAccess.getSVRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVR=ruleSVR();

            state._fsp--;

             current =iv_ruleSVR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSVR"


    // $ANTLR start "ruleSVR"
    // InternalMLRegression.g:935:1: ruleSVR returns [EObject current=null] : (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleSVR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_param_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLRegression.g:941:2: ( (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalMLRegression.g:942:2: (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalMLRegression.g:942:2: (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalMLRegression.g:943:3: otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSVRAccess().getSvrKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSVRAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMLRegression.g:951:3: ( (lv_param_2_0= RULE_ID ) )
            // InternalMLRegression.g:952:4: (lv_param_2_0= RULE_ID )
            {
            // InternalMLRegression.g:952:4: (lv_param_2_0= RULE_ID )
            // InternalMLRegression.g:953:5: lv_param_2_0= RULE_ID
            {
            lv_param_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_param_2_0, grammarAccess.getSVRAccess().getParamIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSVRRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSVRAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVR"


    // $ANTLR start "entryRuleMeanAbsoluteError"
    // InternalMLRegression.g:977:1: entryRuleMeanAbsoluteError returns [String current=null] : iv_ruleMeanAbsoluteError= ruleMeanAbsoluteError EOF ;
    public final String entryRuleMeanAbsoluteError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanAbsoluteError = null;


        try {
            // InternalMLRegression.g:977:57: (iv_ruleMeanAbsoluteError= ruleMeanAbsoluteError EOF )
            // InternalMLRegression.g:978:2: iv_ruleMeanAbsoluteError= ruleMeanAbsoluteError EOF
            {
             newCompositeNode(grammarAccess.getMeanAbsoluteErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeanAbsoluteError=ruleMeanAbsoluteError();

            state._fsp--;

             current =iv_ruleMeanAbsoluteError.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeanAbsoluteError"


    // $ANTLR start "ruleMeanAbsoluteError"
    // InternalMLRegression.g:984:1: ruleMeanAbsoluteError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mean_absolute_error' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleMeanAbsoluteError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:990:2: ( (kw= 'mean_absolute_error' kw= '()' ) )
            // InternalMLRegression.g:991:2: (kw= 'mean_absolute_error' kw= '()' )
            {
            // InternalMLRegression.g:991:2: (kw= 'mean_absolute_error' kw= '()' )
            // InternalMLRegression.g:992:3: kw= 'mean_absolute_error' kw= '()'
            {
            kw=(Token)match(input,29,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMeanAbsoluteErrorAccess().getMean_absolute_errorKeyword_0());
            		
            kw=(Token)match(input,26,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMeanAbsoluteErrorAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeanAbsoluteError"


    // $ANTLR start "entryRuleMeanSquaredError"
    // InternalMLRegression.g:1006:1: entryRuleMeanSquaredError returns [String current=null] : iv_ruleMeanSquaredError= ruleMeanSquaredError EOF ;
    public final String entryRuleMeanSquaredError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanSquaredError = null;


        try {
            // InternalMLRegression.g:1006:56: (iv_ruleMeanSquaredError= ruleMeanSquaredError EOF )
            // InternalMLRegression.g:1007:2: iv_ruleMeanSquaredError= ruleMeanSquaredError EOF
            {
             newCompositeNode(grammarAccess.getMeanSquaredErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeanSquaredError=ruleMeanSquaredError();

            state._fsp--;

             current =iv_ruleMeanSquaredError.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeanSquaredError"


    // $ANTLR start "ruleMeanSquaredError"
    // InternalMLRegression.g:1013:1: ruleMeanSquaredError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mean_square_error' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleMeanSquaredError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1019:2: ( (kw= 'mean_square_error' kw= '()' ) )
            // InternalMLRegression.g:1020:2: (kw= 'mean_square_error' kw= '()' )
            {
            // InternalMLRegression.g:1020:2: (kw= 'mean_square_error' kw= '()' )
            // InternalMLRegression.g:1021:3: kw= 'mean_square_error' kw= '()'
            {
            kw=(Token)match(input,30,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMeanSquaredErrorAccess().getMean_square_errorKeyword_0());
            		
            kw=(Token)match(input,26,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMeanSquaredErrorAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeanSquaredError"


    // $ANTLR start "entryRuleMedianAbsoluteError"
    // InternalMLRegression.g:1035:1: entryRuleMedianAbsoluteError returns [String current=null] : iv_ruleMedianAbsoluteError= ruleMedianAbsoluteError EOF ;
    public final String entryRuleMedianAbsoluteError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMedianAbsoluteError = null;


        try {
            // InternalMLRegression.g:1035:59: (iv_ruleMedianAbsoluteError= ruleMedianAbsoluteError EOF )
            // InternalMLRegression.g:1036:2: iv_ruleMedianAbsoluteError= ruleMedianAbsoluteError EOF
            {
             newCompositeNode(grammarAccess.getMedianAbsoluteErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMedianAbsoluteError=ruleMedianAbsoluteError();

            state._fsp--;

             current =iv_ruleMedianAbsoluteError.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedianAbsoluteError"


    // $ANTLR start "ruleMedianAbsoluteError"
    // InternalMLRegression.g:1042:1: ruleMedianAbsoluteError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'median_absolute_error' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleMedianAbsoluteError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1048:2: ( (kw= 'median_absolute_error' kw= '()' ) )
            // InternalMLRegression.g:1049:2: (kw= 'median_absolute_error' kw= '()' )
            {
            // InternalMLRegression.g:1049:2: (kw= 'median_absolute_error' kw= '()' )
            // InternalMLRegression.g:1050:3: kw= 'median_absolute_error' kw= '()'
            {
            kw=(Token)match(input,31,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMedianAbsoluteErrorAccess().getMedian_absolute_errorKeyword_0());
            		
            kw=(Token)match(input,26,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMedianAbsoluteErrorAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedianAbsoluteError"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMLRegression.g:1064:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // InternalMLRegression.g:1064:46: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMLRegression.g:1065:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMLRegression.g:1071:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1077:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) )
            // InternalMLRegression.g:1078:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            {
            // InternalMLRegression.g:1078:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            // InternalMLRegression.g:1079:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            {
            // InternalMLRegression.g:1079:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMLRegression.g:1080:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMLRegression.g:1080:4: (lv_value_0_0= RULE_INT )
            // InternalMLRegression.g:1081:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_value_0_0, grammarAccess.getFLOATAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFLOATRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMLRegression.g:1097:3: (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMLRegression.g:1098:4: otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMLRegression.g:1102:4: ( (lv_decimal_2_0= RULE_INT ) )
                    // InternalMLRegression.g:1103:5: (lv_decimal_2_0= RULE_INT )
                    {
                    // InternalMLRegression.g:1103:5: (lv_decimal_2_0= RULE_INT )
                    // InternalMLRegression.g:1104:6: lv_decimal_2_0= RULE_INT
                    {
                    lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_decimal_2_0, grammarAccess.getFLOATAccess().getDecimalINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFLOATRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"decimal",
                    							lv_decimal_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRulePERCENT"
    // InternalMLRegression.g:1125:1: entryRulePERCENT returns [EObject current=null] : iv_rulePERCENT= rulePERCENT EOF ;
    public final EObject entryRulePERCENT() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePERCENT = null;


        try {
            // InternalMLRegression.g:1125:48: (iv_rulePERCENT= rulePERCENT EOF )
            // InternalMLRegression.g:1126:2: iv_rulePERCENT= rulePERCENT EOF
            {
             newCompositeNode(grammarAccess.getPERCENTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePERCENT=rulePERCENT();

            state._fsp--;

             current =iv_rulePERCENT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePERCENT"


    // $ANTLR start "rulePERCENT"
    // InternalMLRegression.g:1132:1: rulePERCENT returns [EObject current=null] : (this_FLOAT_0= ruleFLOAT otherlv_1= '%' ) ;
    public final EObject rulePERCENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_FLOAT_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:1138:2: ( (this_FLOAT_0= ruleFLOAT otherlv_1= '%' ) )
            // InternalMLRegression.g:1139:2: (this_FLOAT_0= ruleFLOAT otherlv_1= '%' )
            {
            // InternalMLRegression.g:1139:2: (this_FLOAT_0= ruleFLOAT otherlv_1= '%' )
            // InternalMLRegression.g:1140:3: this_FLOAT_0= ruleFLOAT otherlv_1= '%'
            {

            			newCompositeNode(grammarAccess.getPERCENTAccess().getFLOATParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            			current = this_FLOAT_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPERCENTAccess().getPercentSignKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePERCENT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});

}