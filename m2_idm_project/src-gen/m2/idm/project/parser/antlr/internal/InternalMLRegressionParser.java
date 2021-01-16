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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'target_language'", "':'", "';'", "'python'", "'Python'", "'PYTHON'", "'r'", "'R'", "'import'", "'partition'", "'cross_validation'", "'predictive_vars'", "','", "'target_vars'", "'calculate'", "'algorithm'", "'line_regress'", "'decision_tree_regressor'", "'svr'", "'mean_absolute_error'", "'mean_squared_error'", "'median_absolute_error'", "'.'", "'%'"
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
    public static final int T__34=34;
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
        	return "Model";
       	}

       	@Override
       	protected MLRegressionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMLRegression.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMLRegression.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMLRegression.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMLRegression.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_languageTarget_0_0= ruleLanguageTarget ) )? ( (lv_ml_1_0= ruleMLRegression ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_languageTarget_0_0 = null;

        EObject lv_ml_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:77:2: ( ( ( (lv_languageTarget_0_0= ruleLanguageTarget ) )? ( (lv_ml_1_0= ruleMLRegression ) ) ) )
            // InternalMLRegression.g:78:2: ( ( (lv_languageTarget_0_0= ruleLanguageTarget ) )? ( (lv_ml_1_0= ruleMLRegression ) ) )
            {
            // InternalMLRegression.g:78:2: ( ( (lv_languageTarget_0_0= ruleLanguageTarget ) )? ( (lv_ml_1_0= ruleMLRegression ) ) )
            // InternalMLRegression.g:79:3: ( (lv_languageTarget_0_0= ruleLanguageTarget ) )? ( (lv_ml_1_0= ruleMLRegression ) )
            {
            // InternalMLRegression.g:79:3: ( (lv_languageTarget_0_0= ruleLanguageTarget ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:80:4: (lv_languageTarget_0_0= ruleLanguageTarget )
                    {
                    // InternalMLRegression.g:80:4: (lv_languageTarget_0_0= ruleLanguageTarget )
                    // InternalMLRegression.g:81:5: lv_languageTarget_0_0= ruleLanguageTarget
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getLanguageTargetLanguageTargetParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_languageTarget_0_0=ruleLanguageTarget();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"languageTarget",
                    						lv_languageTarget_0_0,
                    						"m2.idm.project.MLRegression.LanguageTarget");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMLRegression.g:98:3: ( (lv_ml_1_0= ruleMLRegression ) )
            // InternalMLRegression.g:99:4: (lv_ml_1_0= ruleMLRegression )
            {
            // InternalMLRegression.g:99:4: (lv_ml_1_0= ruleMLRegression )
            // InternalMLRegression.g:100:5: lv_ml_1_0= ruleMLRegression
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMlMLRegressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ml_1_0=ruleMLRegression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"ml",
            						lv_ml_1_0,
            						"m2.idm.project.MLRegression.MLRegression");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLanguageTarget"
    // InternalMLRegression.g:121:1: entryRuleLanguageTarget returns [EObject current=null] : iv_ruleLanguageTarget= ruleLanguageTarget EOF ;
    public final EObject entryRuleLanguageTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageTarget = null;


        try {
            // InternalMLRegression.g:121:55: (iv_ruleLanguageTarget= ruleLanguageTarget EOF )
            // InternalMLRegression.g:122:2: iv_ruleLanguageTarget= ruleLanguageTarget EOF
            {
             newCompositeNode(grammarAccess.getLanguageTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageTarget=ruleLanguageTarget();

            state._fsp--;

             current =iv_ruleLanguageTarget; 
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
    // $ANTLR end "entryRuleLanguageTarget"


    // $ANTLR start "ruleLanguageTarget"
    // InternalMLRegression.g:128:1: ruleLanguageTarget returns [EObject current=null] : (otherlv_0= 'target_language' otherlv_1= ':' ( ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleLanguageTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_language_2_1 = null;

        AntlrDatatypeRuleToken lv_language_2_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:134:2: ( (otherlv_0= 'target_language' otherlv_1= ':' ( ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:135:2: (otherlv_0= 'target_language' otherlv_1= ':' ( ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:135:2: (otherlv_0= 'target_language' otherlv_1= ':' ( ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) ) ) otherlv_3= ';' )
            // InternalMLRegression.g:136:3: otherlv_0= 'target_language' otherlv_1= ':' ( ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageTargetAccess().getTarget_languageKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageTargetAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:144:3: ( ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) ) )
            // InternalMLRegression.g:145:4: ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) )
            {
            // InternalMLRegression.g:145:4: ( (lv_language_2_1= rulePython | lv_language_2_2= ruleR ) )
            // InternalMLRegression.g:146:5: (lv_language_2_1= rulePython | lv_language_2_2= ruleR )
            {
            // InternalMLRegression.g:146:5: (lv_language_2_1= rulePython | lv_language_2_2= ruleR )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMLRegression.g:147:6: lv_language_2_1= rulePython
                    {

                    						newCompositeNode(grammarAccess.getLanguageTargetAccess().getLanguagePythonParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_language_2_1=rulePython();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLanguageTargetRule());
                    						}
                    						set(
                    							current,
                    							"language",
                    							lv_language_2_1,
                    							"m2.idm.project.MLRegression.Python");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:163:6: lv_language_2_2= ruleR
                    {

                    						newCompositeNode(grammarAccess.getLanguageTargetAccess().getLanguageRParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_6);
                    lv_language_2_2=ruleR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLanguageTargetRule());
                    						}
                    						set(
                    							current,
                    							"language",
                    							lv_language_2_2,
                    							"m2.idm.project.MLRegression.R");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLanguageTargetAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLanguageTarget"


    // $ANTLR start "entryRulePython"
    // InternalMLRegression.g:189:1: entryRulePython returns [String current=null] : iv_rulePython= rulePython EOF ;
    public final String entryRulePython() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePython = null;


        try {
            // InternalMLRegression.g:189:46: (iv_rulePython= rulePython EOF )
            // InternalMLRegression.g:190:2: iv_rulePython= rulePython EOF
            {
             newCompositeNode(grammarAccess.getPythonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePython=rulePython();

            state._fsp--;

             current =iv_rulePython.getText(); 
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
    // $ANTLR end "entryRulePython"


    // $ANTLR start "rulePython"
    // InternalMLRegression.g:196:1: rulePython returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'python' | kw= 'Python' | kw= 'PYTHON' ) ;
    public final AntlrDatatypeRuleToken rulePython() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:202:2: ( (kw= 'python' | kw= 'Python' | kw= 'PYTHON' ) )
            // InternalMLRegression.g:203:2: (kw= 'python' | kw= 'Python' | kw= 'PYTHON' )
            {
            // InternalMLRegression.g:203:2: (kw= 'python' | kw= 'Python' | kw= 'PYTHON' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMLRegression.g:204:3: kw= 'python'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPythonAccess().getPythonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:210:3: kw= 'Python'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPythonAccess().getPythonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:216:3: kw= 'PYTHON'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPythonAccess().getPYTHONKeyword_2());
                    		

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
    // $ANTLR end "rulePython"


    // $ANTLR start "entryRuleR"
    // InternalMLRegression.g:225:1: entryRuleR returns [String current=null] : iv_ruleR= ruleR EOF ;
    public final String entryRuleR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleR = null;


        try {
            // InternalMLRegression.g:225:41: (iv_ruleR= ruleR EOF )
            // InternalMLRegression.g:226:2: iv_ruleR= ruleR EOF
            {
             newCompositeNode(grammarAccess.getRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleR=ruleR();

            state._fsp--;

             current =iv_ruleR.getText(); 
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
    // $ANTLR end "entryRuleR"


    // $ANTLR start "ruleR"
    // InternalMLRegression.g:232:1: ruleR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'r' | kw= 'R' ) ;
    public final AntlrDatatypeRuleToken ruleR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:238:2: ( (kw= 'r' | kw= 'R' ) )
            // InternalMLRegression.g:239:2: (kw= 'r' | kw= 'R' )
            {
            // InternalMLRegression.g:239:2: (kw= 'r' | kw= 'R' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:240:3: kw= 'r'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRAccess().getRKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:246:3: kw= 'R'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRAccess().getRKeyword_1());
                    		

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
    // $ANTLR end "ruleR"


    // $ANTLR start "entryRuleMLRegression"
    // InternalMLRegression.g:255:1: entryRuleMLRegression returns [EObject current=null] : iv_ruleMLRegression= ruleMLRegression EOF ;
    public final EObject entryRuleMLRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLRegression = null;


        try {
            // InternalMLRegression.g:255:53: (iv_ruleMLRegression= ruleMLRegression EOF )
            // InternalMLRegression.g:256:2: iv_ruleMLRegression= ruleMLRegression EOF
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
    // InternalMLRegression.g:262:1: ruleMLRegression returns [EObject current=null] : ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) ) ;
    public final EObject ruleMLRegression() throws RecognitionException {
        EObject current = null;

        EObject lv_dataset_0_0 = null;

        EObject lv_vars_1_0 = null;

        EObject lv_evaluation_2_0 = null;

        EObject lv_algo_3_0 = null;

        EObject lv_calculate_4_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:268:2: ( ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) ) )
            // InternalMLRegression.g:269:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) )
            {
            // InternalMLRegression.g:269:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) ) )
            // InternalMLRegression.g:270:3: ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_vars_1_0= ruleVariables ) )? ( (lv_evaluation_2_0= ruleEvaluationType ) ) ( (lv_algo_3_0= ruleAlgo ) ) ( (lv_calculate_4_0= ruleCalculate ) )
            {
            // InternalMLRegression.g:270:3: ( (lv_dataset_0_0= ruleDataset ) )
            // InternalMLRegression.g:271:4: (lv_dataset_0_0= ruleDataset )
            {
            // InternalMLRegression.g:271:4: (lv_dataset_0_0= ruleDataset )
            // InternalMLRegression.g:272:5: lv_dataset_0_0= ruleDataset
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getDatasetDatasetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalMLRegression.g:289:3: ( (lv_vars_1_0= ruleVariables ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMLRegression.g:290:4: (lv_vars_1_0= ruleVariables )
                    {
                    // InternalMLRegression.g:290:4: (lv_vars_1_0= ruleVariables )
                    // InternalMLRegression.g:291:5: lv_vars_1_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
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

            // InternalMLRegression.g:308:3: ( (lv_evaluation_2_0= ruleEvaluationType ) )
            // InternalMLRegression.g:309:4: (lv_evaluation_2_0= ruleEvaluationType )
            {
            // InternalMLRegression.g:309:4: (lv_evaluation_2_0= ruleEvaluationType )
            // InternalMLRegression.g:310:5: lv_evaluation_2_0= ruleEvaluationType
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalMLRegression.g:327:3: ( (lv_algo_3_0= ruleAlgo ) )
            // InternalMLRegression.g:328:4: (lv_algo_3_0= ruleAlgo )
            {
            // InternalMLRegression.g:328:4: (lv_algo_3_0= ruleAlgo )
            // InternalMLRegression.g:329:5: lv_algo_3_0= ruleAlgo
            {

            					newCompositeNode(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalMLRegression.g:346:3: ( (lv_calculate_4_0= ruleCalculate ) )
            // InternalMLRegression.g:347:4: (lv_calculate_4_0= ruleCalculate )
            {
            // InternalMLRegression.g:347:4: (lv_calculate_4_0= ruleCalculate )
            // InternalMLRegression.g:348:5: lv_calculate_4_0= ruleCalculate
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
    // InternalMLRegression.g:369:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalMLRegression.g:369:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalMLRegression.g:370:2: iv_ruleDataset= ruleDataset EOF
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
    // InternalMLRegression.g:376:1: ruleDataset returns [EObject current=null] : (otherlv_0= 'import' ( (lv_dataPath_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dataPath_1_0=null;
        Token lv_separator_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLRegression.g:382:2: ( (otherlv_0= 'import' ( (lv_dataPath_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalMLRegression.g:383:2: (otherlv_0= 'import' ( (lv_dataPath_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalMLRegression.g:383:2: (otherlv_0= 'import' ( (lv_dataPath_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalMLRegression.g:384:3: otherlv_0= 'import' ( (lv_dataPath_1_0= RULE_STRING ) ) ( (lv_separator_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getImportKeyword_0());
            		
            // InternalMLRegression.g:388:3: ( (lv_dataPath_1_0= RULE_STRING ) )
            // InternalMLRegression.g:389:4: (lv_dataPath_1_0= RULE_STRING )
            {
            // InternalMLRegression.g:389:4: (lv_dataPath_1_0= RULE_STRING )
            // InternalMLRegression.g:390:5: lv_dataPath_1_0= RULE_STRING
            {
            lv_dataPath_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_dataPath_1_0, grammarAccess.getDatasetAccess().getDataPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataPath",
            						lv_dataPath_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMLRegression.g:406:3: ( (lv_separator_2_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMLRegression.g:407:4: (lv_separator_2_0= RULE_STRING )
                    {
                    // InternalMLRegression.g:407:4: (lv_separator_2_0= RULE_STRING )
                    // InternalMLRegression.g:408:5: lv_separator_2_0= RULE_STRING
                    {
                    lv_separator_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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
    // InternalMLRegression.g:432:1: entryRuleEvaluationType returns [EObject current=null] : iv_ruleEvaluationType= ruleEvaluationType EOF ;
    public final EObject entryRuleEvaluationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationType = null;


        try {
            // InternalMLRegression.g:432:55: (iv_ruleEvaluationType= ruleEvaluationType EOF )
            // InternalMLRegression.g:433:2: iv_ruleEvaluationType= ruleEvaluationType EOF
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
    // InternalMLRegression.g:439:1: ruleEvaluationType returns [EObject current=null] : (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation ) ;
    public final EObject ruleEvaluationType() throws RecognitionException {
        EObject current = null;

        EObject this_Partition_0 = null;

        EObject this_CrossValidation_1 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:445:2: ( (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation ) )
            // InternalMLRegression.g:446:2: (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation )
            {
            // InternalMLRegression.g:446:2: (this_Partition_0= rulePartition | this_CrossValidation_1= ruleCrossValidation )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMLRegression.g:447:3: this_Partition_0= rulePartition
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
                    // InternalMLRegression.g:456:3: this_CrossValidation_1= ruleCrossValidation
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
    // InternalMLRegression.g:468:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalMLRegression.g:468:50: (iv_rulePartition= rulePartition EOF )
            // InternalMLRegression.g:469:2: iv_rulePartition= rulePartition EOF
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
    // InternalMLRegression.g:475:1: rulePartition returns [EObject current=null] : (otherlv_0= 'partition' otherlv_1= ':' ( (lv_test_2_0= ruleNumericValue ) ) otherlv_3= ';' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_test_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:481:2: ( (otherlv_0= 'partition' otherlv_1= ':' ( (lv_test_2_0= ruleNumericValue ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:482:2: (otherlv_0= 'partition' otherlv_1= ':' ( (lv_test_2_0= ruleNumericValue ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:482:2: (otherlv_0= 'partition' otherlv_1= ':' ( (lv_test_2_0= ruleNumericValue ) ) otherlv_3= ';' )
            // InternalMLRegression.g:483:3: otherlv_0= 'partition' otherlv_1= ':' ( (lv_test_2_0= ruleNumericValue ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPartitionAccess().getPartitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:491:3: ( (lv_test_2_0= ruleNumericValue ) )
            // InternalMLRegression.g:492:4: (lv_test_2_0= ruleNumericValue )
            {
            // InternalMLRegression.g:492:4: (lv_test_2_0= ruleNumericValue )
            // InternalMLRegression.g:493:5: lv_test_2_0= ruleNumericValue
            {

            					newCompositeNode(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_test_2_0=ruleNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartitionRule());
            					}
            					set(
            						current,
            						"test",
            						lv_test_2_0,
            						"m2.idm.project.MLRegression.NumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPartitionAccess().getSemicolonKeyword_3());
            		

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
    // InternalMLRegression.g:518:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMLRegression.g:518:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMLRegression.g:519:2: iv_ruleCrossValidation= ruleCrossValidation EOF
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
    // InternalMLRegression.g:525:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_k_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLRegression.g:531:2: ( (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:532:2: (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:532:2: (otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= RULE_INT ) ) otherlv_3= ';' )
            // InternalMLRegression.g:533:3: otherlv_0= 'cross_validation' otherlv_1= ':' ( (lv_k_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossValidationAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:541:3: ( (lv_k_2_0= RULE_INT ) )
            // InternalMLRegression.g:542:4: (lv_k_2_0= RULE_INT )
            {
            // InternalMLRegression.g:542:4: (lv_k_2_0= RULE_INT )
            // InternalMLRegression.g:543:5: lv_k_2_0= RULE_INT
            {
            lv_k_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_k_2_0, grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrossValidationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"k",
            						lv_k_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // InternalMLRegression.g:567:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalMLRegression.g:567:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalMLRegression.g:568:2: iv_ruleVariables= ruleVariables EOF
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
    // InternalMLRegression.g:574:1: ruleVariables returns [EObject current=null] : ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject lv_predictives_0_0 = null;

        EObject lv_targets_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:580:2: ( ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) ) )
            // InternalMLRegression.g:581:2: ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) )
            {
            // InternalMLRegression.g:581:2: ( ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) ) )
            // InternalMLRegression.g:582:3: ( (lv_predictives_0_0= ruleListePredictiveVar ) ) ( (lv_targets_1_0= ruleTargetVar ) )
            {
            // InternalMLRegression.g:582:3: ( (lv_predictives_0_0= ruleListePredictiveVar ) )
            // InternalMLRegression.g:583:4: (lv_predictives_0_0= ruleListePredictiveVar )
            {
            // InternalMLRegression.g:583:4: (lv_predictives_0_0= ruleListePredictiveVar )
            // InternalMLRegression.g:584:5: lv_predictives_0_0= ruleListePredictiveVar
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getPredictivesListePredictiveVarParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalMLRegression.g:601:3: ( (lv_targets_1_0= ruleTargetVar ) )
            // InternalMLRegression.g:602:4: (lv_targets_1_0= ruleTargetVar )
            {
            // InternalMLRegression.g:602:4: (lv_targets_1_0= ruleTargetVar )
            // InternalMLRegression.g:603:5: lv_targets_1_0= ruleTargetVar
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
    // InternalMLRegression.g:624:1: entryRuleListePredictiveVar returns [EObject current=null] : iv_ruleListePredictiveVar= ruleListePredictiveVar EOF ;
    public final EObject entryRuleListePredictiveVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListePredictiveVar = null;


        try {
            // InternalMLRegression.g:624:59: (iv_ruleListePredictiveVar= ruleListePredictiveVar EOF )
            // InternalMLRegression.g:625:2: iv_ruleListePredictiveVar= ruleListePredictiveVar EOF
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
    // InternalMLRegression.g:631:1: ruleListePredictiveVar returns [EObject current=null] : (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) ;
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
            // InternalMLRegression.g:637:2: ( (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) )
            // InternalMLRegression.g:638:2: (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            {
            // InternalMLRegression.g:638:2: (otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            // InternalMLRegression.g:639:3: otherlv_0= 'predictive_vars' otherlv_1= ':' ( (lv_predVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getListePredictiveVarAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:647:3: ( (lv_predVar_2_0= RULE_STRING ) )
            // InternalMLRegression.g:648:4: (lv_predVar_2_0= RULE_STRING )
            {
            // InternalMLRegression.g:648:4: (lv_predVar_2_0= RULE_STRING )
            // InternalMLRegression.g:649:5: lv_predVar_2_0= RULE_STRING
            {
            lv_predVar_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalMLRegression.g:665:3: (otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMLRegression.g:666:4: otherlv_3= ',' ( (lv_predVar_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMLRegression.g:670:4: ( (lv_predVar_4_0= RULE_STRING ) )
            	    // InternalMLRegression.g:671:5: (lv_predVar_4_0= RULE_STRING )
            	    {
            	    // InternalMLRegression.g:671:5: (lv_predVar_4_0= RULE_STRING )
            	    // InternalMLRegression.g:672:6: lv_predVar_4_0= RULE_STRING
            	    {
            	    lv_predVar_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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
            	    break loop8;
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
    // InternalMLRegression.g:697:1: entryRuleTargetVar returns [EObject current=null] : iv_ruleTargetVar= ruleTargetVar EOF ;
    public final EObject entryRuleTargetVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetVar = null;


        try {
            // InternalMLRegression.g:697:50: (iv_ruleTargetVar= ruleTargetVar EOF )
            // InternalMLRegression.g:698:2: iv_ruleTargetVar= ruleTargetVar EOF
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
    // InternalMLRegression.g:704:1: ruleTargetVar returns [EObject current=null] : (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) ;
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
            // InternalMLRegression.g:710:2: ( (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' ) )
            // InternalMLRegression.g:711:2: (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            {
            // InternalMLRegression.g:711:2: (otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';' )
            // InternalMLRegression.g:712:3: otherlv_0= 'target_vars' otherlv_1= ':' ( (lv_targetVar_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetVarAccess().getTarget_varsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetVarAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:720:3: ( (lv_targetVar_2_0= RULE_STRING ) )
            // InternalMLRegression.g:721:4: (lv_targetVar_2_0= RULE_STRING )
            {
            // InternalMLRegression.g:721:4: (lv_targetVar_2_0= RULE_STRING )
            // InternalMLRegression.g:722:5: lv_targetVar_2_0= RULE_STRING
            {
            lv_targetVar_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalMLRegression.g:738:3: (otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMLRegression.g:739:4: otherlv_3= ',' ( (lv_targetVar_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTargetVarAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMLRegression.g:743:4: ( (lv_targetVar_4_0= RULE_STRING ) )
            	    // InternalMLRegression.g:744:5: (lv_targetVar_4_0= RULE_STRING )
            	    {
            	    // InternalMLRegression.g:744:5: (lv_targetVar_4_0= RULE_STRING )
            	    // InternalMLRegression.g:745:6: lv_targetVar_4_0= RULE_STRING
            	    {
            	    lv_targetVar_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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
    // InternalMLRegression.g:770:1: entryRuleCalculate returns [EObject current=null] : iv_ruleCalculate= ruleCalculate EOF ;
    public final EObject entryRuleCalculate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculate = null;


        try {
            // InternalMLRegression.g:770:50: (iv_ruleCalculate= ruleCalculate EOF )
            // InternalMLRegression.g:771:2: iv_ruleCalculate= ruleCalculate EOF
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
    // InternalMLRegression.g:777:1: ruleCalculate returns [EObject current=null] : (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' ) ;
    public final EObject ruleCalculate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_calculateType_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:783:2: ( (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:784:2: (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:784:2: (otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';' )
            // InternalMLRegression.g:785:3: otherlv_0= 'calculate' otherlv_1= ':' ( (lv_calculateType_2_0= ruleCalculateType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCalculateAccess().getCalculateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCalculateAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:793:3: ( (lv_calculateType_2_0= ruleCalculateType ) )
            // InternalMLRegression.g:794:4: (lv_calculateType_2_0= ruleCalculateType )
            {
            // InternalMLRegression.g:794:4: (lv_calculateType_2_0= ruleCalculateType )
            // InternalMLRegression.g:795:5: lv_calculateType_2_0= ruleCalculateType
            {

            					newCompositeNode(grammarAccess.getCalculateAccess().getCalculateTypeCalculateTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:820:1: entryRuleCalculateType returns [String current=null] : iv_ruleCalculateType= ruleCalculateType EOF ;
    public final String entryRuleCalculateType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCalculateType = null;


        try {
            // InternalMLRegression.g:820:53: (iv_ruleCalculateType= ruleCalculateType EOF )
            // InternalMLRegression.g:821:2: iv_ruleCalculateType= ruleCalculateType EOF
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
    // InternalMLRegression.g:827:1: ruleCalculateType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError ) ;
    public final AntlrDatatypeRuleToken ruleCalculateType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MeanAbsoluteError_0 = null;

        AntlrDatatypeRuleToken this_MeanSquaredError_1 = null;

        AntlrDatatypeRuleToken this_MedianAbsoluteError_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:833:2: ( (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError ) )
            // InternalMLRegression.g:834:2: (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError )
            {
            // InternalMLRegression.g:834:2: (this_MeanAbsoluteError_0= ruleMeanAbsoluteError | this_MeanSquaredError_1= ruleMeanSquaredError | this_MedianAbsoluteError_2= ruleMedianAbsoluteError )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMLRegression.g:835:3: this_MeanAbsoluteError_0= ruleMeanAbsoluteError
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
                    // InternalMLRegression.g:846:3: this_MeanSquaredError_1= ruleMeanSquaredError
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
                    // InternalMLRegression.g:857:3: this_MedianAbsoluteError_2= ruleMedianAbsoluteError
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
    // InternalMLRegression.g:871:1: entryRuleAlgo returns [EObject current=null] : iv_ruleAlgo= ruleAlgo EOF ;
    public final EObject entryRuleAlgo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgo = null;


        try {
            // InternalMLRegression.g:871:45: (iv_ruleAlgo= ruleAlgo EOF )
            // InternalMLRegression.g:872:2: iv_ruleAlgo= ruleAlgo EOF
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
    // InternalMLRegression.g:878:1: ruleAlgo returns [EObject current=null] : (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' ) ;
    public final EObject ruleAlgo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_algo_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:884:2: ( (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' ) )
            // InternalMLRegression.g:885:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' )
            {
            // InternalMLRegression.g:885:2: (otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';' )
            // InternalMLRegression.g:886:3: otherlv_0= 'algorithm' otherlv_1= ':' ( (lv_algo_2_0= ruleAlgoType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgoAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgoAccess().getColonKeyword_1());
            		
            // InternalMLRegression.g:894:3: ( (lv_algo_2_0= ruleAlgoType ) )
            // InternalMLRegression.g:895:4: (lv_algo_2_0= ruleAlgoType )
            {
            // InternalMLRegression.g:895:4: (lv_algo_2_0= ruleAlgoType )
            // InternalMLRegression.g:896:5: lv_algo_2_0= ruleAlgoType
            {

            					newCompositeNode(grammarAccess.getAlgoAccess().getAlgoAlgoTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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


    // $ANTLR start "entryRuleAlgoType"
    // InternalMLRegression.g:921:1: entryRuleAlgoType returns [String current=null] : iv_ruleAlgoType= ruleAlgoType EOF ;
    public final String entryRuleAlgoType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlgoType = null;


        try {
            // InternalMLRegression.g:921:48: (iv_ruleAlgoType= ruleAlgoType EOF )
            // InternalMLRegression.g:922:2: iv_ruleAlgoType= ruleAlgoType EOF
            {
             newCompositeNode(grammarAccess.getAlgoTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgoType=ruleAlgoType();

            state._fsp--;

             current =iv_ruleAlgoType.getText(); 
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
    // InternalMLRegression.g:928:1: ruleAlgoType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor ) ;
    public final AntlrDatatypeRuleToken ruleAlgoType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LineRegress_0 = null;

        AntlrDatatypeRuleToken this_SVR_1 = null;

        AntlrDatatypeRuleToken this_DecisionTreeRegressor_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:934:2: ( (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor ) )
            // InternalMLRegression.g:935:2: (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor )
            {
            // InternalMLRegression.g:935:2: (this_LineRegress_0= ruleLineRegress | this_SVR_1= ruleSVR | this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMLRegression.g:936:3: this_LineRegress_0= ruleLineRegress
                    {

                    			newCompositeNode(grammarAccess.getAlgoTypeAccess().getLineRegressParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineRegress_0=ruleLineRegress();

                    state._fsp--;


                    			current.merge(this_LineRegress_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:947:3: this_SVR_1= ruleSVR
                    {

                    			newCompositeNode(grammarAccess.getAlgoTypeAccess().getSVRParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVR_1=ruleSVR();

                    state._fsp--;


                    			current.merge(this_SVR_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:958:3: this_DecisionTreeRegressor_2= ruleDecisionTreeRegressor
                    {

                    			newCompositeNode(grammarAccess.getAlgoTypeAccess().getDecisionTreeRegressorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecisionTreeRegressor_2=ruleDecisionTreeRegressor();

                    state._fsp--;


                    			current.merge(this_DecisionTreeRegressor_2);
                    		

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
    // InternalMLRegression.g:972:1: entryRuleLineRegress returns [String current=null] : iv_ruleLineRegress= ruleLineRegress EOF ;
    public final String entryRuleLineRegress() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineRegress = null;


        try {
            // InternalMLRegression.g:972:51: (iv_ruleLineRegress= ruleLineRegress EOF )
            // InternalMLRegression.g:973:2: iv_ruleLineRegress= ruleLineRegress EOF
            {
             newCompositeNode(grammarAccess.getLineRegressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineRegress=ruleLineRegress();

            state._fsp--;

             current =iv_ruleLineRegress.getText(); 
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
    // InternalMLRegression.g:979:1: ruleLineRegress returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'line_regress' ;
    public final AntlrDatatypeRuleToken ruleLineRegress() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:985:2: (kw= 'line_regress' )
            // InternalMLRegression.g:986:2: kw= 'line_regress'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLineRegressAccess().getLine_regressKeyword());
            	

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
    // InternalMLRegression.g:994:1: entryRuleDecisionTreeRegressor returns [String current=null] : iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF ;
    public final String entryRuleDecisionTreeRegressor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecisionTreeRegressor = null;


        try {
            // InternalMLRegression.g:994:61: (iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF )
            // InternalMLRegression.g:995:2: iv_ruleDecisionTreeRegressor= ruleDecisionTreeRegressor EOF
            {
             newCompositeNode(grammarAccess.getDecisionTreeRegressorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionTreeRegressor=ruleDecisionTreeRegressor();

            state._fsp--;

             current =iv_ruleDecisionTreeRegressor.getText(); 
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
    // InternalMLRegression.g:1001:1: ruleDecisionTreeRegressor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'decision_tree_regressor' ;
    public final AntlrDatatypeRuleToken ruleDecisionTreeRegressor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1007:2: (kw= 'decision_tree_regressor' )
            // InternalMLRegression.g:1008:2: kw= 'decision_tree_regressor'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword());
            	

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
    // InternalMLRegression.g:1016:1: entryRuleSVR returns [String current=null] : iv_ruleSVR= ruleSVR EOF ;
    public final String entryRuleSVR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSVR = null;


        try {
            // InternalMLRegression.g:1016:43: (iv_ruleSVR= ruleSVR EOF )
            // InternalMLRegression.g:1017:2: iv_ruleSVR= ruleSVR EOF
            {
             newCompositeNode(grammarAccess.getSVRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVR=ruleSVR();

            state._fsp--;

             current =iv_ruleSVR.getText(); 
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
    // InternalMLRegression.g:1023:1: ruleSVR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'svr' ;
    public final AntlrDatatypeRuleToken ruleSVR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1029:2: (kw= 'svr' )
            // InternalMLRegression.g:1030:2: kw= 'svr'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSVRAccess().getSvrKeyword());
            	

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
    // InternalMLRegression.g:1038:1: entryRuleMeanAbsoluteError returns [String current=null] : iv_ruleMeanAbsoluteError= ruleMeanAbsoluteError EOF ;
    public final String entryRuleMeanAbsoluteError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanAbsoluteError = null;


        try {
            // InternalMLRegression.g:1038:57: (iv_ruleMeanAbsoluteError= ruleMeanAbsoluteError EOF )
            // InternalMLRegression.g:1039:2: iv_ruleMeanAbsoluteError= ruleMeanAbsoluteError EOF
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
    // InternalMLRegression.g:1045:1: ruleMeanAbsoluteError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mean_absolute_error' ;
    public final AntlrDatatypeRuleToken ruleMeanAbsoluteError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1051:2: (kw= 'mean_absolute_error' )
            // InternalMLRegression.g:1052:2: kw= 'mean_absolute_error'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMeanAbsoluteErrorAccess().getMean_absolute_errorKeyword());
            	

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
    // InternalMLRegression.g:1060:1: entryRuleMeanSquaredError returns [String current=null] : iv_ruleMeanSquaredError= ruleMeanSquaredError EOF ;
    public final String entryRuleMeanSquaredError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMeanSquaredError = null;


        try {
            // InternalMLRegression.g:1060:56: (iv_ruleMeanSquaredError= ruleMeanSquaredError EOF )
            // InternalMLRegression.g:1061:2: iv_ruleMeanSquaredError= ruleMeanSquaredError EOF
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
    // InternalMLRegression.g:1067:1: ruleMeanSquaredError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mean_squared_error' ;
    public final AntlrDatatypeRuleToken ruleMeanSquaredError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1073:2: (kw= 'mean_squared_error' )
            // InternalMLRegression.g:1074:2: kw= 'mean_squared_error'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMeanSquaredErrorAccess().getMean_squared_errorKeyword());
            	

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
    // InternalMLRegression.g:1082:1: entryRuleMedianAbsoluteError returns [String current=null] : iv_ruleMedianAbsoluteError= ruleMedianAbsoluteError EOF ;
    public final String entryRuleMedianAbsoluteError() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMedianAbsoluteError = null;


        try {
            // InternalMLRegression.g:1082:59: (iv_ruleMedianAbsoluteError= ruleMedianAbsoluteError EOF )
            // InternalMLRegression.g:1083:2: iv_ruleMedianAbsoluteError= ruleMedianAbsoluteError EOF
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
    // InternalMLRegression.g:1089:1: ruleMedianAbsoluteError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'median_absolute_error' ;
    public final AntlrDatatypeRuleToken ruleMedianAbsoluteError() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1095:2: (kw= 'median_absolute_error' )
            // InternalMLRegression.g:1096:2: kw= 'median_absolute_error'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMedianAbsoluteErrorAccess().getMedian_absolute_errorKeyword());
            	

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


    // $ANTLR start "entryRuleNumericValue"
    // InternalMLRegression.g:1104:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalMLRegression.g:1104:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalMLRegression.g:1105:2: iv_ruleNumericValue= ruleNumericValue EOF
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
    // InternalMLRegression.g:1111:1: ruleNumericValue returns [EObject current=null] : (this_FLOAT_0= ruleFLOAT | this_PERCENT_1= rulePERCENT ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject this_FLOAT_0 = null;

        EObject this_PERCENT_1 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:1117:2: ( (this_FLOAT_0= ruleFLOAT | this_PERCENT_1= rulePERCENT ) )
            // InternalMLRegression.g:1118:2: (this_FLOAT_0= ruleFLOAT | this_PERCENT_1= rulePERCENT )
            {
            // InternalMLRegression.g:1118:2: (this_FLOAT_0= ruleFLOAT | this_PERCENT_1= rulePERCENT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==RULE_INT) ) {
                        int LA12_5 = input.LA(4);

                        if ( (LA12_5==EOF||LA12_5==13) ) {
                            alt12=1;
                        }
                        else if ( (LA12_5==34) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 13:
                    {
                    alt12=1;
                    }
                    break;
                case 34:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMLRegression.g:1119:3: this_FLOAT_0= ruleFLOAT
                    {

                    			newCompositeNode(grammarAccess.getNumericValueAccess().getFLOATParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLOAT_0=ruleFLOAT();

                    state._fsp--;


                    			current = this_FLOAT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:1128:3: this_PERCENT_1= rulePERCENT
                    {

                    			newCompositeNode(grammarAccess.getNumericValueAccess().getPERCENTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PERCENT_1=rulePERCENT();

                    state._fsp--;


                    			current = this_PERCENT_1;
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


    // $ANTLR start "entryRuleFLOAT"
    // InternalMLRegression.g:1140:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // InternalMLRegression.g:1140:46: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMLRegression.g:1141:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalMLRegression.g:1147:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalMLRegression.g:1153:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) )
            // InternalMLRegression.g:1154:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            {
            // InternalMLRegression.g:1154:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            // InternalMLRegression.g:1155:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            {
            // InternalMLRegression.g:1155:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMLRegression.g:1156:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMLRegression.g:1156:4: (lv_value_0_0= RULE_INT )
            // InternalMLRegression.g:1157:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            // InternalMLRegression.g:1173:3: (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMLRegression.g:1174:4: otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMLRegression.g:1178:4: ( (lv_decimal_2_0= RULE_INT ) )
                    // InternalMLRegression.g:1179:5: (lv_decimal_2_0= RULE_INT )
                    {
                    // InternalMLRegression.g:1179:5: (lv_decimal_2_0= RULE_INT )
                    // InternalMLRegression.g:1180:6: lv_decimal_2_0= RULE_INT
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
    // InternalMLRegression.g:1201:1: entryRulePERCENT returns [EObject current=null] : iv_rulePERCENT= rulePERCENT EOF ;
    public final EObject entryRulePERCENT() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePERCENT = null;


        try {
            // InternalMLRegression.g:1201:48: (iv_rulePERCENT= rulePERCENT EOF )
            // InternalMLRegression.g:1202:2: iv_rulePERCENT= rulePERCENT EOF
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
    // InternalMLRegression.g:1208:1: rulePERCENT returns [EObject current=null] : ( ( (lv_float_0_0= ruleFLOAT ) ) otherlv_1= '%' ) ;
    public final EObject rulePERCENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_float_0_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:1214:2: ( ( ( (lv_float_0_0= ruleFLOAT ) ) otherlv_1= '%' ) )
            // InternalMLRegression.g:1215:2: ( ( (lv_float_0_0= ruleFLOAT ) ) otherlv_1= '%' )
            {
            // InternalMLRegression.g:1215:2: ( ( (lv_float_0_0= ruleFLOAT ) ) otherlv_1= '%' )
            // InternalMLRegression.g:1216:3: ( (lv_float_0_0= ruleFLOAT ) ) otherlv_1= '%'
            {
            // InternalMLRegression.g:1216:3: ( (lv_float_0_0= ruleFLOAT ) )
            // InternalMLRegression.g:1217:4: (lv_float_0_0= ruleFLOAT )
            {
            // InternalMLRegression.g:1217:4: (lv_float_0_0= ruleFLOAT )
            // InternalMLRegression.g:1218:5: lv_float_0_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getPERCENTAccess().getFloatFLOATParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_float_0_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPERCENTRule());
            					}
            					set(
            						current,
            						"float",
            						lv_float_0_0,
            						"m2.idm.project.MLRegression.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});

}