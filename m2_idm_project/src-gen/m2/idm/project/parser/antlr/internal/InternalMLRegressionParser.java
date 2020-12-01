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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'calculate'", "':'", "';'", "'import'", "'partition'", "','", "'cross_validation'", "'predictive_vars'", "'target_var'", "'algorithm'", "'line_regress'", "'('", "')'", "'decision_tree_regressor'", "'svr'", "'min_error'", "'min_square_error'", "'sums_square_error'", "'.'", "'%'", "'false'", "'true'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    // InternalMLRegression.g:71:1: ruleMLRegression returns [EObject current=null] : ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_evaluation_1_0= ruleEvaluationType ) ) ( (lv_vars_2_0= ruleVariables ) )? ( (lv_calculate_3_0= ruleCalculate ) ) ( (lv_algo_4_0= ruleAlgo ) ) ) ;
    public final EObject ruleMLRegression() throws RecognitionException {
        EObject current = null;

        EObject lv_dataset_0_0 = null;

        EObject lv_evaluation_1_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_calculate_3_0 = null;

        EObject lv_algo_4_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:77:2: ( ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_evaluation_1_0= ruleEvaluationType ) ) ( (lv_vars_2_0= ruleVariables ) )? ( (lv_calculate_3_0= ruleCalculate ) ) ( (lv_algo_4_0= ruleAlgo ) ) ) )
            // InternalMLRegression.g:78:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_evaluation_1_0= ruleEvaluationType ) ) ( (lv_vars_2_0= ruleVariables ) )? ( (lv_calculate_3_0= ruleCalculate ) ) ( (lv_algo_4_0= ruleAlgo ) ) )
            {
            // InternalMLRegression.g:78:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_evaluation_1_0= ruleEvaluationType ) ) ( (lv_vars_2_0= ruleVariables ) )? ( (lv_calculate_3_0= ruleCalculate ) ) ( (lv_algo_4_0= ruleAlgo ) ) )
            // InternalMLRegression.g:79:3: ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_evaluation_1_0= ruleEvaluationType ) ) ( (lv_vars_2_0= ruleVariables ) )? ( (lv_calculate_3_0= ruleCalculate ) ) ( (lv_algo_4_0= ruleAlgo ) )
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

            // InternalMLRegression.g:98:3: ( (lv_evaluation_1_0= ruleEvaluationType ) )
            // InternalMLRegression.g:99:4: (lv_evaluation_1_0= ruleEvaluationType )
            {
            // InternalMLRegression.g:99:4: (lv_evaluation_1_0= ruleEvaluationType )
            // InternalMLRegression.g:100:5: lv_evaluation_1_0= ruleEvaluationType
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_evaluation_1_0=ruleEvaluationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
            					}
            					set(
            						current,
            						"evaluation",
            						lv_evaluation_1_0,
            						"m2.idm.project.MLRegression.EvaluationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLRegression.g:117:3: ( (lv_vars_2_0= ruleVariables ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:118:4: (lv_vars_2_0= ruleVariables )
                    {
                    // InternalMLRegression.g:118:4: (lv_vars_2_0= ruleVariables )
                    // InternalMLRegression.g:119:5: lv_vars_2_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_vars_2_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
                    					}
                    					set(
                    						current,
                    						"vars",
                    						lv_vars_2_0,
                    						"m2.idm.project.MLRegression.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMLRegression.g:136:3: ( (lv_calculate_3_0= ruleCalculate ) )
            // InternalMLRegression.g:137:4: (lv_calculate_3_0= ruleCalculate )
            {
            // InternalMLRegression.g:137:4: (lv_calculate_3_0= ruleCalculate )
            // InternalMLRegression.g:138:5: lv_calculate_3_0= ruleCalculate
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_calculate_3_0=ruleCalculate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
            					}
            					set(
            						current,
            						"calculate",
            						lv_calculate_3_0,
            						"m2.idm.project.MLRegression.Calculate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLRegression.g:155:3: ( (lv_algo_4_0= ruleAlgo ) )
            // InternalMLRegression.g:156:4: (lv_algo_4_0= ruleAlgo )
            {
            // InternalMLRegression.g:156:4: (lv_algo_4_0= ruleAlgo )
            // InternalMLRegression.g:157:5: lv_algo_4_0= ruleAlgo
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_algo_4_0=ruleAlgo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
            					}
            					set(
            						current,
            						"algo",
            						lv_algo_4_0,
            						"m2.idm.project.MLRegression.Algo");
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


    // $ANTLR start "entryRuleCalculate"
    // InternalMLRegression.g:178:1: entryRuleCalculate returns [EObject current=null] : iv_ruleCalculate= ruleCalculate EOF ;
    public final EObject entryRuleCalculate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculate = null;


        try {
            // InternalMLRegression.g:178:50: (iv_ruleCalculate= ruleCalculate EOF )
            // InternalMLRegression.g:179:2: iv_ruleCalculate= ruleCalculate EOF
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
    // InternalMLRegression.g:185:1: ruleCalculate returns [EObject current=null] : (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' ) ;
    public final EObject ruleCalculate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_calculateType_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:191:2: ( (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:192:2: (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:192:2: (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' )
            // InternalMLRegression.g:193:3: otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCalculateAccess().getCalculateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCalculateAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:201:3: ( (lv_calculateType_2_0= ruleCalculateType ) )
            // InternalMLRegression.g:202:4: (lv_calculateType_2_0= ruleCalculateType )
            {
            // InternalMLRegression.g:202:4: (lv_calculateType_2_0= ruleCalculateType )
            // InternalMLRegression.g:203:5: lv_calculateType_2_0= ruleCalculateType
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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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
    // InternalMLRegression.g:228:1: entryRuleCalculateType returns [String current=null] : iv_ruleCalculateType= ruleCalculateType EOF ;
    public final String entryRuleCalculateType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCalculateType = null;


        try {
            // InternalMLRegression.g:228:53: (iv_ruleCalculateType= ruleCalculateType EOF )
            // InternalMLRegression.g:229:2: iv_ruleCalculateType= ruleCalculateType EOF
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
    // InternalMLRegression.g:235:1: ruleCalculateType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MinError_0= ruleMinError | this_MinSquaredError_1= ruleMinSquaredError | this_SumsSquaredError_2= ruleSumsSquaredError ) ;
    public final AntlrDatatypeRuleToken ruleCalculateType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MinError_0 = null;

        AntlrDatatypeRuleToken this_MinSquaredError_1 = null;

        AntlrDatatypeRuleToken this_SumsSquaredError_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:241:2: ( (this_MinError_0= ruleMinError | this_MinSquaredError_1= ruleMinSquaredError | this_SumsSquaredError_2= ruleSumsSquaredError ) )
            // InternalMLRegression.g:242:2: (this_MinError_0= ruleMinError | this_MinSquaredError_1= ruleMinSquaredError | this_SumsSquaredError_2= ruleSumsSquaredError )
            {
            // InternalMLRegression.g:242:2: (this_MinError_0= ruleMinError | this_MinSquaredError_1= ruleMinSquaredError | this_SumsSquaredError_2= ruleSumsSquaredError )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMLRegression.g:243:3: this_MinError_0= ruleMinError
                    {

                    			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMinErrorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinError_0=ruleMinError();

                    state._fsp--;


                    			current.merge(this_MinError_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:254:3: this_MinSquaredError_1= ruleMinSquaredError
                    {

                    			newCompositeNode(grammarAccess.getCalculateTypeAccess().getMinSquaredErrorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinSquaredError_1=ruleMinSquaredError();

                    state._fsp--;


                    			current.merge(this_MinSquaredError_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:265:3: this_SumsSquaredError_2= ruleSumsSquaredError
                    {

                    			newCompositeNode(grammarAccess.getCalculateTypeAccess().getSumsSquaredErrorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumsSquaredError_2=ruleSumsSquaredError();

                    state._fsp--;


                    			current.merge(this_SumsSquaredError_2);
                    		

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


    // $ANTLR start "entryRuleDataset"
    // InternalMLRegression.g:279:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalMLRegression.g:279:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalMLRegression.g:280:2: iv_ruleDataset= ruleDataset EOF
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
    // InternalMLRegression.g:286:1: ruleDataset returns [EObject current=null] : ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token lv_dataset_0_0=null;
        Token otherlv_2=null;
        EObject lv_data_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:292:2: ( ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' ) )
            // InternalMLRegression.g:293:2: ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' )
            {
            // InternalMLRegression.g:293:2: ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' )
            // InternalMLRegression.g:294:3: ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';'
            {
            // InternalMLRegression.g:294:3: ( (lv_dataset_0_0= 'import' ) )
            // InternalMLRegression.g:295:4: (lv_dataset_0_0= 'import' )
            {
            // InternalMLRegression.g:295:4: (lv_dataset_0_0= 'import' )
            // InternalMLRegression.g:296:5: lv_dataset_0_0= 'import'
            {
            lv_dataset_0_0=(Token)match(input,14,FOLLOW_9); 

            					newLeafNode(lv_dataset_0_0, grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetRule());
            					}
            					setWithLastConsumed(current, "dataset", lv_dataset_0_0, "import");
            				

            }


            }

            // InternalMLRegression.g:308:3: ( (lv_data_1_0= ruleStringValue ) )
            // InternalMLRegression.g:309:4: (lv_data_1_0= ruleStringValue )
            {
            // InternalMLRegression.g:309:4: (lv_data_1_0= ruleStringValue )
            // InternalMLRegression.g:310:5: lv_data_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getDataStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_data_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasetRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_1_0,
            						"m2.idm.project.MLRegression.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetAccess().getSemicolonKeyword_2());
            		

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
    // InternalMLRegression.g:335:1: entryRuleEvaluationType returns [EObject current=null] : iv_ruleEvaluationType= ruleEvaluationType EOF ;
    public final EObject entryRuleEvaluationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationType = null;


        try {
            // InternalMLRegression.g:335:55: (iv_ruleEvaluationType= ruleEvaluationType EOF )
            // InternalMLRegression.g:336:2: iv_ruleEvaluationType= ruleEvaluationType EOF
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
    // InternalMLRegression.g:342:1: ruleEvaluationType returns [EObject current=null] : (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation ) ;
    public final EObject ruleEvaluationType() throws RecognitionException {
        EObject current = null;

        EObject this_Partition_0 = null;

        EObject this_CrossValidation_1 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:348:2: ( (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation ) )
            // InternalMLRegression.g:349:2: (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation )
            {
            // InternalMLRegression.g:349:2: (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMLRegression.g:350:3: this_Partition_0= rulePartition
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
                    // InternalMLRegression.g:359:3: this_CrossValidation_1= ruleCrossValidation
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
    // InternalMLRegression.g:371:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalMLRegression.g:371:50: (iv_rulePartition= rulePartition EOF )
            // InternalMLRegression.g:372:2: iv_rulePartition= rulePartition EOF
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
    // InternalMLRegression.g:378:1: rulePartition returns [EObject current=null] : (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= ruleNumericValue ) ) otherlv_3= ',' ( (lv_test_4_0= ruleNumericValue ) ) otherlv_5= ';' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_train_2_0 = null;

        EObject lv_test_4_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:384:2: ( (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= ruleNumericValue ) ) otherlv_3= ',' ( (lv_test_4_0= ruleNumericValue ) ) otherlv_5= ';' ) )
            // InternalMLRegression.g:385:2: (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= ruleNumericValue ) ) otherlv_3= ',' ( (lv_test_4_0= ruleNumericValue ) ) otherlv_5= ';' )
            {
            // InternalMLRegression.g:385:2: (otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= ruleNumericValue ) ) otherlv_3= ',' ( (lv_test_4_0= ruleNumericValue ) ) otherlv_5= ';' )
            // InternalMLRegression.g:386:3: otherlv_0= 'partition' otherlv_1= ':' ( (lv_train_2_0= ruleNumericValue ) ) otherlv_3= ',' ( (lv_test_4_0= ruleNumericValue ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPartitionAccess().getPartitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:394:3: ( (lv_train_2_0= ruleNumericValue ) )
            // InternalMLRegression.g:395:4: (lv_train_2_0= ruleNumericValue )
            {
            // InternalMLRegression.g:395:4: (lv_train_2_0= ruleNumericValue )
            // InternalMLRegression.g:396:5: lv_train_2_0= ruleNumericValue
            {

            					newCompositeNode(grammarAccess.getPartitionAccess().getTrainNumericValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_train_2_0=ruleNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartitionRule());
            					}
            					set(
            						current,
            						"train",
            						lv_train_2_0,
            						"m2.idm.project.MLRegression.NumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPartitionAccess().getCommaKeyword_3());
            		
            // InternalMLRegression.g:417:3: ( (lv_test_4_0= ruleNumericValue ) )
            // InternalMLRegression.g:418:4: (lv_test_4_0= ruleNumericValue )
            {
            // InternalMLRegression.g:418:4: (lv_test_4_0= ruleNumericValue )
            // InternalMLRegression.g:419:5: lv_test_4_0= ruleNumericValue
            {

            					newCompositeNode(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_test_4_0=ruleNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartitionRule());
            					}
            					set(
            						current,
            						"test",
            						lv_test_4_0,
            						"m2.idm.project.MLRegression.NumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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
    // InternalMLRegression.g:444:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMLRegression.g:444:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMLRegression.g:445:2: iv_ruleCrossValidation= ruleCrossValidation EOF
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
    // InternalMLRegression.g:451:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= ruleIntegerValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_k_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:457:2: ( (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= ruleIntegerValue ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:458:2: (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= ruleIntegerValue ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:458:2: (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= ruleIntegerValue ) ) otherlv_3= ';' )
            // InternalMLRegression.g:459:3: otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= ruleIntegerValue ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:467:3: ( (lv_k_2_0= ruleIntegerValue ) )
            // InternalMLRegression.g:468:4: (lv_k_2_0= ruleIntegerValue )
            {
            // InternalMLRegression.g:468:4: (lv_k_2_0= ruleIntegerValue )
            // InternalMLRegression.g:469:5: lv_k_2_0= ruleIntegerValue
            {

            					newCompositeNode(grammarAccess.getCrossValidationAccess().getKIntegerValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_k_2_0=ruleIntegerValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrossValidationRule());
            					}
            					set(
            						current,
            						"k",
            						lv_k_2_0,
            						"m2.idm.project.MLRegression.IntegerValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCrossValidationAccess().getSemicolonKeyword_3());
            		

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
    // InternalMLRegression.g:494:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalMLRegression.g:494:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalMLRegression.g:495:2: iv_ruleVariables= ruleVariables EOF
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
    // InternalMLRegression.g:501:1: ruleVariables returns [EObject current=null] : ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject lv_predictives_0_0 = null;

        EObject lv_targets_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:507:2: ( ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) ) )
            // InternalMLRegression.g:508:2: ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) )
            {
            // InternalMLRegression.g:508:2: ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) )
            // InternalMLRegression.g:509:3: ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) )
            {
            // InternalMLRegression.g:509:3: ( (lv_predictives_0_0= ruleListePredictiveVar ) )
            // InternalMLRegression.g:510:4: (lv_predictives_0_0= ruleListePredictiveVar )
            {
            // InternalMLRegression.g:510:4: (lv_predictives_0_0= ruleListePredictiveVar )
            // InternalMLRegression.g:511:5: lv_predictives_0_0= ruleListePredictiveVar
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getPredictivesListePredictiveVarParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalMLRegression.g:528:3: ( (lv_targets_1_0= ruleTargetVar ) )
            // InternalMLRegression.g:529:4: (lv_targets_1_0= ruleTargetVar )
            {
            // InternalMLRegression.g:529:4: (lv_targets_1_0= ruleTargetVar )
            // InternalMLRegression.g:530:5: lv_targets_1_0= ruleTargetVar
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
    // InternalMLRegression.g:551:1: entryRuleListePredictiveVar returns [EObject current=null] : iv_ruleListePredictiveVar= ruleListePredictiveVar EOF ;
    public final EObject entryRuleListePredictiveVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListePredictiveVar = null;


        try {
            // InternalMLRegression.g:551:59: (iv_ruleListePredictiveVar= ruleListePredictiveVar EOF )
            // InternalMLRegression.g:552:2: iv_ruleListePredictiveVar= ruleListePredictiveVar EOF
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
    // InternalMLRegression.g:558:1: ruleListePredictiveVar returns [EObject current=null] : (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_vars_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleListePredictiveVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        Token lv_vars_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMLRegression.g:564:2: ( (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_vars_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) )
            // InternalMLRegression.g:565:2: (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_vars_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            {
            // InternalMLRegression.g:565:2: (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_vars_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            // InternalMLRegression.g:566:3: otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_vars_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_STRING ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getListePredictiveVarAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:574:3: ( (lv_vars_2_0= RULE_STRING ) )
            // InternalMLRegression.g:575:4: (lv_vars_2_0= RULE_STRING )
            {
            // InternalMLRegression.g:575:4: (lv_vars_2_0= RULE_STRING )
            // InternalMLRegression.g:576:5: lv_vars_2_0= RULE_STRING
            {
            lv_vars_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_vars_2_0, grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListePredictiveVarRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMLRegression.g:592:3: (otherlv_3= ',' ( (lv_vars_4_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMLRegression.g:593:4: otherlv_3= ',' ( (lv_vars_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMLRegression.g:597:4: ( (lv_vars_4_0= RULE_STRING ) )
            	    // InternalMLRegression.g:598:5: (lv_vars_4_0= RULE_STRING )
            	    {
            	    // InternalMLRegression.g:598:5: (lv_vars_4_0= RULE_STRING )
            	    // InternalMLRegression.g:599:6: lv_vars_4_0= RULE_STRING
            	    {
            	    lv_vars_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    						newLeafNode(lv_vars_4_0, grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListePredictiveVarRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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
    // InternalMLRegression.g:624:1: entryRuleTargetVar returns [EObject current=null] : iv_ruleTargetVar= ruleTargetVar EOF ;
    public final EObject entryRuleTargetVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetVar = null;


        try {
            // InternalMLRegression.g:624:50: (iv_ruleTargetVar= ruleTargetVar EOF )
            // InternalMLRegression.g:625:2: iv_ruleTargetVar= ruleTargetVar EOF
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
    // InternalMLRegression.g:631:1: ruleTargetVar returns [EObject current=null] : (otherlv_0= 'target_var' otherlv_1= ':' ( (lv_var_2_0= ruleStringValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleTargetVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:637:2: ( (otherlv_0= 'target_var' otherlv_1= ':' ( (lv_var_2_0= ruleStringValue ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:638:2: (otherlv_0= 'target_var' otherlv_1= ':' ( (lv_var_2_0= ruleStringValue ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:638:2: (otherlv_0= 'target_var' otherlv_1= ':' ( (lv_var_2_0= ruleStringValue ) ) otherlv_3= ';' )
            // InternalMLRegression.g:639:3: otherlv_0= 'target_var' otherlv_1= ':' ( (lv_var_2_0= ruleStringValue ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetVarAccess().getTarget_varKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetVarAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:647:3: ( (lv_var_2_0= ruleStringValue ) )
            // InternalMLRegression.g:648:4: (lv_var_2_0= ruleStringValue )
            {
            // InternalMLRegression.g:648:4: (lv_var_2_0= ruleStringValue )
            // InternalMLRegression.g:649:5: lv_var_2_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getTargetVarAccess().getVarStringValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_var_2_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetVarRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"m2.idm.project.MLRegression.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTargetVarAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleAlgo"
    // InternalMLRegression.g:674:1: entryRuleAlgo returns [EObject current=null] : iv_ruleAlgo= ruleAlgo EOF ;
    public final EObject entryRuleAlgo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgo = null;


        try {
            // InternalMLRegression.g:674:45: (iv_ruleAlgo= ruleAlgo EOF )
            // InternalMLRegression.g:675:2: iv_ruleAlgo= ruleAlgo EOF
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
    // InternalMLRegression.g:681:1: ruleAlgo returns [EObject current=null] : (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoML ) ) otherlv_3= ';' ) ;
    public final EObject ruleAlgo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_algo_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:687:2: ( (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoML ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:688:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoML ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:688:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoML ) ) otherlv_3= ';' )
            // InternalMLRegression.g:689:3: otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoML ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgoAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgoAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:697:3: ( (lv_algo_2_0= ruleAlgoML ) )
            // InternalMLRegression.g:698:4: (lv_algo_2_0= ruleAlgoML )
            {
            // InternalMLRegression.g:698:4: (lv_algo_2_0= ruleAlgoML )
            // InternalMLRegression.g:699:5: lv_algo_2_0= ruleAlgoML
            {

            					newCompositeNode(grammarAccess.getAlgoAccess().getAlgoAlgoMLParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_algo_2_0=ruleAlgoML();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgoRule());
            					}
            					set(
            						current,
            						"algo",
            						lv_algo_2_0,
            						"m2.idm.project.MLRegression.AlgoML");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAlgoML"
    // InternalMLRegression.g:724:1: entryRuleAlgoML returns [EObject current=null] : iv_ruleAlgoML= ruleAlgoML EOF ;
    public final EObject entryRuleAlgoML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgoML = null;


        try {
            // InternalMLRegression.g:724:47: (iv_ruleAlgoML= ruleAlgoML EOF )
            // InternalMLRegression.g:725:2: iv_ruleAlgoML= ruleAlgoML EOF
            {
             newCompositeNode(grammarAccess.getAlgoMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgoML=ruleAlgoML();

            state._fsp--;

             current =iv_ruleAlgoML; 
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
    // $ANTLR end "entryRuleAlgoML"


    // $ANTLR start "ruleAlgoML"
    // InternalMLRegression.g:731:1: ruleAlgoML returns [EObject current=null] : (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor ) ;
    public final EObject ruleAlgoML() throws RecognitionException {
        EObject current = null;

        EObject this_LineRegress_0 = null;

        EObject this_SVR_1 = null;

        EObject this_DecisionTreeRegressor_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:737:2: ( (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor ) )
            // InternalMLRegression.g:738:2: (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor )
            {
            // InternalMLRegression.g:738:2: (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMLRegression.g:739:3: this_LineRegress_0= ruleLineRegress
                    {

                    			newCompositeNode(grammarAccess.getAlgoMLAccess().getLineRegressParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineRegress_0=ruleLineRegress();

                    state._fsp--;


                    			current = this_LineRegress_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:748:3: this_SVR_1= ruleSVR
                    {

                    			newCompositeNode(grammarAccess.getAlgoMLAccess().getSVRParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVR_1=ruleSVR();

                    state._fsp--;


                    			current = this_SVR_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:757:3: this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor
                    {

                    			newCompositeNode(grammarAccess.getAlgoMLAccess().getDecisionTreeRegressorParserRuleCall_2());
                    		
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
    // $ANTLR end "ruleAlgoML"


    // $ANTLR start "entryRuleLineRegress"
    // InternalMLRegression.g:769:1: entryRuleLineRegress returns [EObject current=null] : iv_ruleLineRegress= ruleLineRegress EOF ;
    public final EObject entryRuleLineRegress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineRegress = null;


        try {
            // InternalMLRegression.g:769:52: (iv_ruleLineRegress= ruleLineRegress EOF )
            // InternalMLRegression.g:770:2: iv_ruleLineRegress= ruleLineRegress EOF
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
    // InternalMLRegression.g:776:1: ruleLineRegress returns [EObject current=null] : (otherlv_0= 'line_regress' otherlv_1= '(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleLineRegress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_columns_2_0=null;
        Token otherlv_3=null;
        Token lv_columns_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMLRegression.g:782:2: ( (otherlv_0= 'line_regress' otherlv_1= '(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' ) )
            // InternalMLRegression.g:783:2: (otherlv_0= 'line_regress' otherlv_1= '(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            {
            // InternalMLRegression.g:783:2: (otherlv_0= 'line_regress' otherlv_1= '(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')' )
            // InternalMLRegression.g:784:3: otherlv_0= 'line_regress' otherlv_1= '(' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getLineRegressAccess().getLine_regressKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLineRegressAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMLRegression.g:792:3: ( (lv_columns_2_0= RULE_STRING ) )
            // InternalMLRegression.g:793:4: (lv_columns_2_0= RULE_STRING )
            {
            // InternalMLRegression.g:793:4: (lv_columns_2_0= RULE_STRING )
            // InternalMLRegression.g:794:5: lv_columns_2_0= RULE_STRING
            {
            lv_columns_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_columns_2_0, grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRegressRule());
            					}
            					addWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMLRegression.g:810:3: (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMLRegression.g:811:4: otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLineRegressAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMLRegression.g:815:4: ( (lv_columns_4_0= RULE_STRING ) )
            	    // InternalMLRegression.g:816:5: (lv_columns_4_0= RULE_STRING )
            	    {
            	    // InternalMLRegression.g:816:5: (lv_columns_4_0= RULE_STRING )
            	    // InternalMLRegression.g:817:6: lv_columns_4_0= RULE_STRING
            	    {
            	    lv_columns_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    						newLeafNode(lv_columns_4_0, grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLineRegressRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalMLRegression.g:842:1: entryRuleDecisionTreeRegressor returns [EObject current=null] : iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF ;
    public final EObject entryRuleDecisionTreeRegressor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionTreeRegressor = null;


        try {
            // InternalMLRegression.g:842:62: (iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF )
            // InternalMLRegression.g:843:2: iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF
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
    // InternalMLRegression.g:849:1: ruleDecisionTreeRegressor returns [EObject current=null] : (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleDecisionTreeRegressor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rand_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLRegression.g:855:2: ( (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalMLRegression.g:856:2: (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalMLRegression.g:856:2: (otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalMLRegression.g:857:3: otherlv_0= 'decision_tree_regressor' otherlv_1= '(' ( (lv_rand_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMLRegression.g:865:3: ( (lv_rand_2_0= RULE_INT ) )
            // InternalMLRegression.g:866:4: (lv_rand_2_0= RULE_INT )
            {
            // InternalMLRegression.g:866:4: (lv_rand_2_0= RULE_INT )
            // InternalMLRegression.g:867:5: lv_rand_2_0= RULE_INT
            {
            lv_rand_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMLRegression.g:891:1: entryRuleSVR returns [EObject current=null] : iv_ruleSVR= ruleSVR EOF ;
    public final EObject entryRuleSVR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVR = null;


        try {
            // InternalMLRegression.g:891:44: (iv_ruleSVR= ruleSVR EOF )
            // InternalMLRegression.g:892:2: iv_ruleSVR= ruleSVR EOF
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
    // InternalMLRegression.g:898:1: ruleSVR returns [EObject current=null] : (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleSVR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_param_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLRegression.g:904:2: ( (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalMLRegression.g:905:2: (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalMLRegression.g:905:2: (otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalMLRegression.g:906:3: otherlv_0= 'svr' otherlv_1= '(' ( (lv_param_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSVRAccess().getSvrKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSVRAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMLRegression.g:914:3: ( (lv_param_2_0= RULE_ID ) )
            // InternalMLRegression.g:915:4: (lv_param_2_0= RULE_ID )
            {
            // InternalMLRegression.g:915:4: (lv_param_2_0= RULE_ID )
            // InternalMLRegression.g:916:5: lv_param_2_0= RULE_ID
            {
            lv_param_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMinError"
    // InternalMLRegression.g:940:1: entryRuleMinError returns [String current=null] : iv_ruleMinError= ruleMinError EOF ;
    public final String entryRuleMinError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinError = null;


        try {
            // InternalMLRegression.g:940:48: (iv_ruleMinError= ruleMinError EOF )
            // InternalMLRegression.g:941:2: iv_ruleMinError= ruleMinError EOF
            {
             newCompositeNode(grammarAccess.getMinErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinError=ruleMinError();

            state._fsp--;

             current =iv_ruleMinError.getText(); 
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
    // $ANTLR end "entryRuleMinError"


    // $ANTLR start "ruleMinError"
    // InternalMLRegression.g:947:1: ruleMinError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'min_error' ;
    public final AntlrDatatypeRuleToken ruleMinError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:953:2: (kw= 'min_error' )
            // InternalMLRegression.g:954:2: kw= 'min_error'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMinErrorAccess().getMin_errorKeyword());
            	

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
    // $ANTLR end "ruleMinError"


    // $ANTLR start "entryRuleMinSquaredError"
    // InternalMLRegression.g:962:1: entryRuleMinSquaredError returns [String current=null] : iv_ruleMinSquaredError= ruleMinSquaredError EOF ;
    public final String entryRuleMinSquaredError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinSquaredError = null;


        try {
            // InternalMLRegression.g:962:55: (iv_ruleMinSquaredError= ruleMinSquaredError EOF )
            // InternalMLRegression.g:963:2: iv_ruleMinSquaredError= ruleMinSquaredError EOF
            {
             newCompositeNode(grammarAccess.getMinSquaredErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinSquaredError=ruleMinSquaredError();

            state._fsp--;

             current =iv_ruleMinSquaredError.getText(); 
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
    // $ANTLR end "entryRuleMinSquaredError"


    // $ANTLR start "ruleMinSquaredError"
    // InternalMLRegression.g:969:1: ruleMinSquaredError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'min_square_error' ;
    public final AntlrDatatypeRuleToken ruleMinSquaredError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:975:2: (kw= 'min_square_error' )
            // InternalMLRegression.g:976:2: kw= 'min_square_error'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMinSquaredErrorAccess().getMin_square_errorKeyword());
            	

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
    // $ANTLR end "ruleMinSquaredError"


    // $ANTLR start "entryRuleSumsSquaredError"
    // InternalMLRegression.g:984:1: entryRuleSumsSquaredError returns [String current=null] : iv_ruleSumsSquaredError= ruleSumsSquaredError EOF ;
    public final String entryRuleSumsSquaredError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSumsSquaredError = null;


        try {
            // InternalMLRegression.g:984:56: (iv_ruleSumsSquaredError= ruleSumsSquaredError EOF )
            // InternalMLRegression.g:985:2: iv_ruleSumsSquaredError= ruleSumsSquaredError EOF
            {
             newCompositeNode(grammarAccess.getSumsSquaredErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumsSquaredError=ruleSumsSquaredError();

            state._fsp--;

             current =iv_ruleSumsSquaredError.getText(); 
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
    // $ANTLR end "entryRuleSumsSquaredError"


    // $ANTLR start "ruleSumsSquaredError"
    // InternalMLRegression.g:991:1: ruleSumsSquaredError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'sums_square_error' ;
    public final AntlrDatatypeRuleToken ruleSumsSquaredError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:997:2: (kw= 'sums_square_error' )
            // InternalMLRegression.g:998:2: kw= 'sums_square_error'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSumsSquaredErrorAccess().getSums_square_errorKeyword());
            	

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
    // $ANTLR end "ruleSumsSquaredError"


    // $ANTLR start "entryRuleStringValue"
    // InternalMLRegression.g:1006:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalMLRegression.g:1006:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMLRegression.g:1007:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMLRegression.g:1013:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1019:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMLRegression.g:1020:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMLRegression.g:1020:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMLRegression.g:1021:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMLRegression.g:1021:3: (lv_value_0_0= RULE_STRING )
            // InternalMLRegression.g:1022:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumericValue"
    // InternalMLRegression.g:1041:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalMLRegression.g:1041:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalMLRegression.g:1042:2: iv_ruleNumericValue= ruleNumericValue EOF
            {
             newCompositeNode(grammarAccess.getNumericValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericValue=ruleNumericValue();

            state._fsp--;

             current =iv_ruleNumericValue; 
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
    // $ANTLR end "entryRuleNumericValue"


    // $ANTLR start "ruleNumericValue"
    // InternalMLRegression.g:1048:1: ruleNumericValue returns [EObject current=null] : (this_NumberValue_0= ruleNumberValue | this_PercentValue_1= rulePercentValue ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumberValue_0 = null;

        EObject this_PercentValue_1 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:1054:2: ( (this_NumberValue_0= ruleNumberValue | this_PercentValue_1= rulePercentValue ) )
            // InternalMLRegression.g:1055:2: (this_NumberValue_0= ruleNumberValue | this_PercentValue_1= rulePercentValue )
            {
            // InternalMLRegression.g:1055:2: (this_NumberValue_0= ruleNumberValue | this_PercentValue_1= rulePercentValue )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMLRegression.g:1056:3: this_NumberValue_0= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getNumericValueAccess().getNumberValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_0=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:1065:3: this_PercentValue_1= rulePercentValue
                    {

                    			newCompositeNode(grammarAccess.getNumericValueAccess().getPercentValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PercentValue_1=rulePercentValue();

                    state._fsp--;


                    			current = this_PercentValue_1;
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
    // $ANTLR end "ruleNumericValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalMLRegression.g:1077:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalMLRegression.g:1077:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalMLRegression.g:1078:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalMLRegression.g:1084:1: ruleNumberValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1090:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? ) )
            // InternalMLRegression.g:1091:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? )
            {
            // InternalMLRegression.g:1091:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? )
            // InternalMLRegression.g:1092:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )?
            {
            // InternalMLRegression.g:1092:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMLRegression.g:1093:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMLRegression.g:1093:4: (lv_value_0_0= RULE_INT )
            // InternalMLRegression.g:1094:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_value_0_0, grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMLRegression.g:1110:3: (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMLRegression.g:1111:4: otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )*
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberValueAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMLRegression.g:1115:4: ( (lv_decimal_2_0= RULE_INT ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_INT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMLRegression.g:1116:5: (lv_decimal_2_0= RULE_INT )
                    	    {
                    	    // InternalMLRegression.g:1116:5: (lv_decimal_2_0= RULE_INT )
                    	    // InternalMLRegression.g:1117:6: lv_decimal_2_0= RULE_INT
                    	    {
                    	    lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    	    						newLeafNode(lv_decimal_2_0, grammarAccess.getNumberValueAccess().getDecimalINTTerminalRuleCall_1_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getNumberValueRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"decimal",
                    	    							lv_decimal_2_0,
                    	    							"org.eclipse.xtext.common.Terminals.INT");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalMLRegression.g:1138:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalMLRegression.g:1138:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalMLRegression.g:1139:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalMLRegression.g:1145:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1151:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMLRegression.g:1152:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMLRegression.g:1152:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMLRegression.g:1153:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMLRegression.g:1153:3: (lv_value_0_0= RULE_INT )
            // InternalMLRegression.g:1154:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRulePercentValue"
    // InternalMLRegression.g:1173:1: entryRulePercentValue returns [EObject current=null] : iv_rulePercentValue= rulePercentValue EOF ;
    public final EObject entryRulePercentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentValue = null;


        try {
            // InternalMLRegression.g:1173:53: (iv_rulePercentValue= rulePercentValue EOF )
            // InternalMLRegression.g:1174:2: iv_rulePercentValue= rulePercentValue EOF
            {
             newCompositeNode(grammarAccess.getPercentValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePercentValue=rulePercentValue();

            state._fsp--;

             current =iv_rulePercentValue; 
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
    // $ANTLR end "entryRulePercentValue"


    // $ANTLR start "rulePercentValue"
    // InternalMLRegression.g:1180:1: rulePercentValue returns [EObject current=null] : (this_NumberValue_0= ruleNumberValue otherlv_1= '%' ) ;
    public final EObject rulePercentValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_NumberValue_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:1186:2: ( (this_NumberValue_0= ruleNumberValue otherlv_1= '%' ) )
            // InternalMLRegression.g:1187:2: (this_NumberValue_0= ruleNumberValue otherlv_1= '%' )
            {
            // InternalMLRegression.g:1187:2: (this_NumberValue_0= ruleNumberValue otherlv_1= '%' )
            // InternalMLRegression.g:1188:3: this_NumberValue_0= ruleNumberValue otherlv_1= '%'
            {

            			newCompositeNode(grammarAccess.getPercentValueAccess().getNumberValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_NumberValue_0=ruleNumberValue();

            state._fsp--;


            			current = this_NumberValue_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPercentValueAccess().getPercentSignKeyword_1());
            		

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
    // $ANTLR end "rulePercentValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalMLRegression.g:1204:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalMLRegression.g:1204:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalMLRegression.g:1205:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalMLRegression.g:1211:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1217:2: ( ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) ) )
            // InternalMLRegression.g:1218:2: ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) )
            {
            // InternalMLRegression.g:1218:2: ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) )
            // InternalMLRegression.g:1219:3: ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) )
            {
            // InternalMLRegression.g:1219:3: ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) )
            // InternalMLRegression.g:1220:4: (lv_value_0_1= 'false' | lv_value_0_2= 'true' )
            {
            // InternalMLRegression.g:1220:4: (lv_value_0_1= 'false' | lv_value_0_2= 'true' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMLRegression.g:1221:5: lv_value_0_1= 'false'
                    {
                    lv_value_0_1=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:1232:5: lv_value_0_2= 'true'
                    {
                    lv_value_0_2=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBooleanValue"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\2\3\2\uffff\1\3";
    static final String dfa_3s = "\1\5\1\15\1\5\2\uffff\1\5";
    static final String dfa_4s = "\1\5\2\36\2\uffff\1\36";
    static final String dfa_5s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\2\uffff\1\3\14\uffff\1\2\1\4",
            "\1\5\7\uffff\1\3\2\uffff\1\3\15\uffff\1\4",
            "",
            "",
            "\1\5\7\uffff\1\3\2\uffff\1\3\15\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1055:2: (this_NumberValue_0= ruleNumberValue | this_PercentValue_1= rulePercentValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});

}