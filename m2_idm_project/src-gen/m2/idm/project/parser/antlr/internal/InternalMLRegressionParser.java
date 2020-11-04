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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'learning'", "'training'", "'cross_validation'", "'predict'", "'{'", "'}'", "'target'", "'return'", "'.'", "'%'", "'false'", "'true'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalMLRegression.g:71:1: ruleMLRegression returns [EObject current=null] : ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_learningType_1_0= ruleLearningType ) )? ( (lv_vars_2_0= ruleVariables ) ) ( (lv_returnType_3_0= ruleReturnType ) )? ) ;
    public final EObject ruleMLRegression() throws RecognitionException {
        EObject current = null;

        EObject lv_dataset_0_0 = null;

        EObject lv_learningType_1_0 = null;

        EObject lv_vars_2_0 = null;

        EObject lv_returnType_3_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:77:2: ( ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_learningType_1_0= ruleLearningType ) )? ( (lv_vars_2_0= ruleVariables ) ) ( (lv_returnType_3_0= ruleReturnType ) )? ) )
            // InternalMLRegression.g:78:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_learningType_1_0= ruleLearningType ) )? ( (lv_vars_2_0= ruleVariables ) ) ( (lv_returnType_3_0= ruleReturnType ) )? )
            {
            // InternalMLRegression.g:78:2: ( ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_learningType_1_0= ruleLearningType ) )? ( (lv_vars_2_0= ruleVariables ) ) ( (lv_returnType_3_0= ruleReturnType ) )? )
            // InternalMLRegression.g:79:3: ( (lv_dataset_0_0= ruleDataset ) ) ( (lv_learningType_1_0= ruleLearningType ) )? ( (lv_vars_2_0= ruleVariables ) ) ( (lv_returnType_3_0= ruleReturnType ) )?
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

            // InternalMLRegression.g:98:3: ( (lv_learningType_1_0= ruleLearningType ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:99:4: (lv_learningType_1_0= ruleLearningType )
                    {
                    // InternalMLRegression.g:99:4: (lv_learningType_1_0= ruleLearningType )
                    // InternalMLRegression.g:100:5: lv_learningType_1_0= ruleLearningType
                    {

                    					newCompositeNode(grammarAccess.getMLRegressionAccess().getLearningTypeLearningTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_learningType_1_0=ruleLearningType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
                    					}
                    					set(
                    						current,
                    						"learningType",
                    						lv_learningType_1_0,
                    						"m2.idm.project.MLRegression.LearningType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMLRegression.g:117:3: ( (lv_vars_2_0= ruleVariables ) )
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

            // InternalMLRegression.g:136:3: ( (lv_returnType_3_0= ruleReturnType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMLRegression.g:137:4: (lv_returnType_3_0= ruleReturnType )
                    {
                    // InternalMLRegression.g:137:4: (lv_returnType_3_0= ruleReturnType )
                    // InternalMLRegression.g:138:5: lv_returnType_3_0= ruleReturnType
                    {

                    					newCompositeNode(grammarAccess.getMLRegressionAccess().getReturnTypeReturnTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_returnType_3_0=ruleReturnType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMLRegressionRule());
                    					}
                    					set(
                    						current,
                    						"returnType",
                    						lv_returnType_3_0,
                    						"m2.idm.project.MLRegression.ReturnType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMLRegression"


    // $ANTLR start "entryRuleDataset"
    // InternalMLRegression.g:159:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalMLRegression.g:159:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalMLRegression.g:160:2: iv_ruleDataset= ruleDataset EOF
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
    // InternalMLRegression.g:166:1: ruleDataset returns [EObject current=null] : ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token lv_dataset_0_0=null;
        Token otherlv_2=null;
        EObject lv_data_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:172:2: ( ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' ) )
            // InternalMLRegression.g:173:2: ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' )
            {
            // InternalMLRegression.g:173:2: ( ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';' )
            // InternalMLRegression.g:174:3: ( (lv_dataset_0_0= 'import' ) ) ( (lv_data_1_0= ruleStringValue ) ) otherlv_2= ';'
            {
            // InternalMLRegression.g:174:3: ( (lv_dataset_0_0= 'import' ) )
            // InternalMLRegression.g:175:4: (lv_dataset_0_0= 'import' )
            {
            // InternalMLRegression.g:175:4: (lv_dataset_0_0= 'import' )
            // InternalMLRegression.g:176:5: lv_dataset_0_0= 'import'
            {
            lv_dataset_0_0=(Token)match(input,11,FOLLOW_5); 

            					newLeafNode(lv_dataset_0_0, grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetRule());
            					}
            					setWithLastConsumed(current, "dataset", lv_dataset_0_0, "import");
            				

            }


            }

            // InternalMLRegression.g:188:3: ( (lv_data_1_0= ruleStringValue ) )
            // InternalMLRegression.g:189:4: (lv_data_1_0= ruleStringValue )
            {
            // InternalMLRegression.g:189:4: (lv_data_1_0= ruleStringValue )
            // InternalMLRegression.g:190:5: lv_data_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getDatasetAccess().getDataStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLearningType"
    // InternalMLRegression.g:215:1: entryRuleLearningType returns [EObject current=null] : iv_ruleLearningType= ruleLearningType EOF ;
    public final EObject entryRuleLearningType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLearningType = null;


        try {
            // InternalMLRegression.g:215:53: (iv_ruleLearningType= ruleLearningType EOF )
            // InternalMLRegression.g:216:2: iv_ruleLearningType= ruleLearningType EOF
            {
             newCompositeNode(grammarAccess.getLearningTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLearningType=ruleLearningType();

            state._fsp--;

             current =iv_ruleLearningType; 
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
    // $ANTLR end "entryRuleLearningType"


    // $ANTLR start "ruleLearningType"
    // InternalMLRegression.g:222:1: ruleLearningType returns [EObject current=null] : (otherlv_0= 'learning' ( ( (lv_training_1_0= ruleTraining ) ) | ( (lv_crossValidation_2_0= ruleCrossValidation ) ) ) ) ;
    public final EObject ruleLearningType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_training_1_0 = null;

        AntlrDatatypeRuleToken lv_crossValidation_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:228:2: ( (otherlv_0= 'learning' ( ( (lv_training_1_0= ruleTraining ) ) | ( (lv_crossValidation_2_0= ruleCrossValidation ) ) ) ) )
            // InternalMLRegression.g:229:2: (otherlv_0= 'learning' ( ( (lv_training_1_0= ruleTraining ) ) | ( (lv_crossValidation_2_0= ruleCrossValidation ) ) ) )
            {
            // InternalMLRegression.g:229:2: (otherlv_0= 'learning' ( ( (lv_training_1_0= ruleTraining ) ) | ( (lv_crossValidation_2_0= ruleCrossValidation ) ) ) )
            // InternalMLRegression.g:230:3: otherlv_0= 'learning' ( ( (lv_training_1_0= ruleTraining ) ) | ( (lv_crossValidation_2_0= ruleCrossValidation ) ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLearningTypeAccess().getLearningKeyword_0());
            		
            // InternalMLRegression.g:234:3: ( ( (lv_training_1_0= ruleTraining ) ) | ( (lv_crossValidation_2_0= ruleCrossValidation ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMLRegression.g:235:4: ( (lv_training_1_0= ruleTraining ) )
                    {
                    // InternalMLRegression.g:235:4: ( (lv_training_1_0= ruleTraining ) )
                    // InternalMLRegression.g:236:5: (lv_training_1_0= ruleTraining )
                    {
                    // InternalMLRegression.g:236:5: (lv_training_1_0= ruleTraining )
                    // InternalMLRegression.g:237:6: lv_training_1_0= ruleTraining
                    {

                    						newCompositeNode(grammarAccess.getLearningTypeAccess().getTrainingTrainingParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_training_1_0=ruleTraining();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLearningTypeRule());
                    						}
                    						set(
                    							current,
                    							"training",
                    							lv_training_1_0,
                    							"m2.idm.project.MLRegression.Training");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:255:4: ( (lv_crossValidation_2_0= ruleCrossValidation ) )
                    {
                    // InternalMLRegression.g:255:4: ( (lv_crossValidation_2_0= ruleCrossValidation ) )
                    // InternalMLRegression.g:256:5: (lv_crossValidation_2_0= ruleCrossValidation )
                    {
                    // InternalMLRegression.g:256:5: (lv_crossValidation_2_0= ruleCrossValidation )
                    // InternalMLRegression.g:257:6: lv_crossValidation_2_0= ruleCrossValidation
                    {

                    						newCompositeNode(grammarAccess.getLearningTypeAccess().getCrossValidationCrossValidationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_crossValidation_2_0=ruleCrossValidation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLearningTypeRule());
                    						}
                    						set(
                    							current,
                    							"crossValidation",
                    							lv_crossValidation_2_0,
                    							"m2.idm.project.MLRegression.CrossValidation");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleLearningType"


    // $ANTLR start "entryRuleTraining"
    // InternalMLRegression.g:279:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalMLRegression.g:279:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalMLRegression.g:280:2: iv_ruleTraining= ruleTraining EOF
            {
             newCompositeNode(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraining=ruleTraining();

            state._fsp--;

             current =iv_ruleTraining; 
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
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalMLRegression.g:286:1: ruleTraining returns [EObject current=null] : (otherlv_0= 'training' ( ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleTraining() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_training_1_1 = null;

        EObject lv_training_1_2 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:292:2: ( (otherlv_0= 'training' ( ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) ) ) otherlv_2= ';' ) )
            // InternalMLRegression.g:293:2: (otherlv_0= 'training' ( ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) ) ) otherlv_2= ';' )
            {
            // InternalMLRegression.g:293:2: (otherlv_0= 'training' ( ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) ) ) otherlv_2= ';' )
            // InternalMLRegression.g:294:3: otherlv_0= 'training' ( ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainingAccess().getTrainingKeyword_0());
            		
            // InternalMLRegression.g:298:3: ( ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) ) )
            // InternalMLRegression.g:299:4: ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) )
            {
            // InternalMLRegression.g:299:4: ( (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue ) )
            // InternalMLRegression.g:300:5: (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue )
            {
            // InternalMLRegression.g:300:5: (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:301:6: lv_training_1_1= ruleNumberValue
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getTrainingNumberValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_training_1_1=ruleNumberValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"training",
                    							lv_training_1_1,
                    							"m2.idm.project.MLRegression.NumberValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:317:6: lv_training_1_2= rulePercentValue
                    {

                    						newCompositeNode(grammarAccess.getTrainingAccess().getTrainingPercentValueParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_6);
                    lv_training_1_2=rulePercentValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingRule());
                    						}
                    						set(
                    							current,
                    							"training",
                    							lv_training_1_2,
                    							"m2.idm.project.MLRegression.PercentValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainingAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMLRegression.g:343:1: entryRuleCrossValidation returns [String current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final String entryRuleCrossValidation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCrossValidation = null;


        try {
            // InternalMLRegression.g:343:55: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMLRegression.g:344:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation.getText(); 
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
    // InternalMLRegression.g:350:1: ruleCrossValidation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'cross_validation' ;
    public final AntlrDatatypeRuleToken ruleCrossValidation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMLRegression.g:356:2: (kw= 'cross_validation' )
            // InternalMLRegression.g:357:2: kw= 'cross_validation'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCrossValidationAccess().getCross_validationKeyword());
            	

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
    // InternalMLRegression.g:365:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalMLRegression.g:365:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalMLRegression.g:366:2: iv_ruleVariables= ruleVariables EOF
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
    // InternalMLRegression.g:372:1: ruleVariables returns [EObject current=null] : ( ( (lv_predictives_0_0= rulePredictives ) ) ( (lv_targets_1_0= ruleTargets ) ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject lv_predictives_0_0 = null;

        EObject lv_targets_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:378:2: ( ( ( (lv_predictives_0_0= rulePredictives ) ) ( (lv_targets_1_0= ruleTargets ) ) ) )
            // InternalMLRegression.g:379:2: ( ( (lv_predictives_0_0= rulePredictives ) ) ( (lv_targets_1_0= ruleTargets ) ) )
            {
            // InternalMLRegression.g:379:2: ( ( (lv_predictives_0_0= rulePredictives ) ) ( (lv_targets_1_0= ruleTargets ) ) )
            // InternalMLRegression.g:380:3: ( (lv_predictives_0_0= rulePredictives ) ) ( (lv_targets_1_0= ruleTargets ) )
            {
            // InternalMLRegression.g:380:3: ( (lv_predictives_0_0= rulePredictives ) )
            // InternalMLRegression.g:381:4: (lv_predictives_0_0= rulePredictives )
            {
            // InternalMLRegression.g:381:4: (lv_predictives_0_0= rulePredictives )
            // InternalMLRegression.g:382:5: lv_predictives_0_0= rulePredictives
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getPredictivesPredictivesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_predictives_0_0=rulePredictives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"predictives",
            						lv_predictives_0_0,
            						"m2.idm.project.MLRegression.Predictives");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMLRegression.g:399:3: ( (lv_targets_1_0= ruleTargets ) )
            // InternalMLRegression.g:400:4: (lv_targets_1_0= ruleTargets )
            {
            // InternalMLRegression.g:400:4: (lv_targets_1_0= ruleTargets )
            // InternalMLRegression.g:401:5: lv_targets_1_0= ruleTargets
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getTargetsTargetsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_targets_1_0=ruleTargets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"targets",
            						lv_targets_1_0,
            						"m2.idm.project.MLRegression.Targets");
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


    // $ANTLR start "entryRulePredictives"
    // InternalMLRegression.g:422:1: entryRulePredictives returns [EObject current=null] : iv_rulePredictives= rulePredictives EOF ;
    public final EObject entryRulePredictives() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictives = null;


        try {
            // InternalMLRegression.g:422:52: (iv_rulePredictives= rulePredictives EOF )
            // InternalMLRegression.g:423:2: iv_rulePredictives= rulePredictives EOF
            {
             newCompositeNode(grammarAccess.getPredictivesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictives=rulePredictives();

            state._fsp--;

             current =iv_rulePredictives; 
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
    // $ANTLR end "entryRulePredictives"


    // $ANTLR start "rulePredictives"
    // InternalMLRegression.g:429:1: rulePredictives returns [EObject current=null] : (otherlv_0= 'predict' otherlv_1= '{' ( (lv_vars_2_0= ruleVar ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject rulePredictives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:435:2: ( (otherlv_0= 'predict' otherlv_1= '{' ( (lv_vars_2_0= ruleVar ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalMLRegression.g:436:2: (otherlv_0= 'predict' otherlv_1= '{' ( (lv_vars_2_0= ruleVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalMLRegression.g:436:2: (otherlv_0= 'predict' otherlv_1= '{' ( (lv_vars_2_0= ruleVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalMLRegression.g:437:3: otherlv_0= 'predict' otherlv_1= '{' ( (lv_vars_2_0= ruleVar ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPredictivesAccess().getPredictKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPredictivesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMLRegression.g:445:3: ( (lv_vars_2_0= ruleVar ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMLRegression.g:446:4: (lv_vars_2_0= ruleVar )
            	    {
            	    // InternalMLRegression.g:446:4: (lv_vars_2_0= ruleVar )
            	    // InternalMLRegression.g:447:5: lv_vars_2_0= ruleVar
            	    {

            	    					newCompositeNode(grammarAccess.getPredictivesAccess().getVarsVarParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_vars_2_0=ruleVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPredictivesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_2_0,
            	    						"m2.idm.project.MLRegression.Var");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPredictivesAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPredictivesAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "rulePredictives"


    // $ANTLR start "entryRuleTargets"
    // InternalMLRegression.g:476:1: entryRuleTargets returns [EObject current=null] : iv_ruleTargets= ruleTargets EOF ;
    public final EObject entryRuleTargets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargets = null;


        try {
            // InternalMLRegression.g:476:48: (iv_ruleTargets= ruleTargets EOF )
            // InternalMLRegression.g:477:2: iv_ruleTargets= ruleTargets EOF
            {
             newCompositeNode(grammarAccess.getTargetsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargets=ruleTargets();

            state._fsp--;

             current =iv_ruleTargets; 
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
    // $ANTLR end "entryRuleTargets"


    // $ANTLR start "ruleTargets"
    // InternalMLRegression.g:483:1: ruleTargets returns [EObject current=null] : (otherlv_0= 'target' ( (lv_var_1_0= ruleVar ) ) otherlv_2= ';' ) ;
    public final EObject ruleTargets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:489:2: ( (otherlv_0= 'target' ( (lv_var_1_0= ruleVar ) ) otherlv_2= ';' ) )
            // InternalMLRegression.g:490:2: (otherlv_0= 'target' ( (lv_var_1_0= ruleVar ) ) otherlv_2= ';' )
            {
            // InternalMLRegression.g:490:2: (otherlv_0= 'target' ( (lv_var_1_0= ruleVar ) ) otherlv_2= ';' )
            // InternalMLRegression.g:491:3: otherlv_0= 'target' ( (lv_var_1_0= ruleVar ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetsAccess().getTargetKeyword_0());
            		
            // InternalMLRegression.g:495:3: ( (lv_var_1_0= ruleVar ) )
            // InternalMLRegression.g:496:4: (lv_var_1_0= ruleVar )
            {
            // InternalMLRegression.g:496:4: (lv_var_1_0= ruleVar )
            // InternalMLRegression.g:497:5: lv_var_1_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getTargetsAccess().getVarVarParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_var_1_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetsRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"m2.idm.project.MLRegression.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetsAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleTargets"


    // $ANTLR start "entryRuleVar"
    // InternalMLRegression.g:522:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMLRegression.g:522:44: (iv_ruleVar= ruleVar EOF )
            // InternalMLRegression.g:523:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMLRegression.g:529:1: ruleVar returns [EObject current=null] : ( (lv_nameVar_0_0= ruleStringValue ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        EObject lv_nameVar_0_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:535:2: ( ( (lv_nameVar_0_0= ruleStringValue ) ) )
            // InternalMLRegression.g:536:2: ( (lv_nameVar_0_0= ruleStringValue ) )
            {
            // InternalMLRegression.g:536:2: ( (lv_nameVar_0_0= ruleStringValue ) )
            // InternalMLRegression.g:537:3: (lv_nameVar_0_0= ruleStringValue )
            {
            // InternalMLRegression.g:537:3: (lv_nameVar_0_0= ruleStringValue )
            // InternalMLRegression.g:538:4: lv_nameVar_0_0= ruleStringValue
            {

            				newCompositeNode(grammarAccess.getVarAccess().getNameVarStringValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nameVar_0_0=ruleStringValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVarRule());
            				}
            				set(
            					current,
            					"nameVar",
            					lv_nameVar_0_0,
            					"m2.idm.project.MLRegression.StringValue");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleReturnType"
    // InternalMLRegression.g:558:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // InternalMLRegression.g:558:51: (iv_ruleReturnType= ruleReturnType EOF )
            // InternalMLRegression.g:559:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
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
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalMLRegression.g:565:1: ruleReturnType returns [EObject current=null] : (otherlv_0= 'return' ( (lv_nameReturn_1_0= ruleStringValue ) ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nameReturn_1_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:571:2: ( (otherlv_0= 'return' ( (lv_nameReturn_1_0= ruleStringValue ) ) ) )
            // InternalMLRegression.g:572:2: (otherlv_0= 'return' ( (lv_nameReturn_1_0= ruleStringValue ) ) )
            {
            // InternalMLRegression.g:572:2: (otherlv_0= 'return' ( (lv_nameReturn_1_0= ruleStringValue ) ) )
            // InternalMLRegression.g:573:3: otherlv_0= 'return' ( (lv_nameReturn_1_0= ruleStringValue ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnTypeAccess().getReturnKeyword_0());
            		
            // InternalMLRegression.g:577:3: ( (lv_nameReturn_1_0= ruleStringValue ) )
            // InternalMLRegression.g:578:4: (lv_nameReturn_1_0= ruleStringValue )
            {
            // InternalMLRegression.g:578:4: (lv_nameReturn_1_0= ruleStringValue )
            // InternalMLRegression.g:579:5: lv_nameReturn_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getReturnTypeAccess().getNameReturnStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nameReturn_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnTypeRule());
            					}
            					set(
            						current,
            						"nameReturn",
            						lv_nameReturn_1_0,
            						"m2.idm.project.MLRegression.StringValue");
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
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleStringValue"
    // InternalMLRegression.g:600:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalMLRegression.g:600:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMLRegression.g:601:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalMLRegression.g:607:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMLRegression.g:613:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMLRegression.g:614:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMLRegression.g:614:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMLRegression.g:615:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMLRegression.g:615:3: (lv_value_0_0= RULE_STRING )
            // InternalMLRegression.g:616:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleNumberValue"
    // InternalMLRegression.g:635:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalMLRegression.g:635:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalMLRegression.g:636:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalMLRegression.g:642:1: ruleNumberValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalMLRegression.g:648:2: ( ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? ) )
            // InternalMLRegression.g:649:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? )
            {
            // InternalMLRegression.g:649:2: ( ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )? )
            // InternalMLRegression.g:650:3: ( (lv_value_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )?
            {
            // InternalMLRegression.g:650:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMLRegression.g:651:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMLRegression.g:651:4: (lv_value_0_0= RULE_INT )
            // InternalMLRegression.g:652:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            // InternalMLRegression.g:668:3: (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMLRegression.g:669:4: otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )*
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberValueAccess().getFullStopKeyword_1_0());
                    			
                    // InternalMLRegression.g:673:4: ( (lv_decimal_2_0= RULE_INT ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMLRegression.g:674:5: (lv_decimal_2_0= RULE_INT )
                    	    {
                    	    // InternalMLRegression.g:674:5: (lv_decimal_2_0= RULE_INT )
                    	    // InternalMLRegression.g:675:6: lv_decimal_2_0= RULE_INT
                    	    {
                    	    lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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
                    	    break loop6;
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


    // $ANTLR start "entryRulePercentValue"
    // InternalMLRegression.g:696:1: entryRulePercentValue returns [EObject current=null] : iv_rulePercentValue= rulePercentValue EOF ;
    public final EObject entryRulePercentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePercentValue = null;


        try {
            // InternalMLRegression.g:696:53: (iv_rulePercentValue= rulePercentValue EOF )
            // InternalMLRegression.g:697:2: iv_rulePercentValue= rulePercentValue EOF
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
    // InternalMLRegression.g:703:1: rulePercentValue returns [EObject current=null] : (this_NumberValue_0= ruleNumberValue otherlv_1= '%' ) ;
    public final EObject rulePercentValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_NumberValue_0 = null;



        	enterRule();

        try {
            // InternalMLRegression.g:709:2: ( (this_NumberValue_0= ruleNumberValue otherlv_1= '%' ) )
            // InternalMLRegression.g:710:2: (this_NumberValue_0= ruleNumberValue otherlv_1= '%' )
            {
            // InternalMLRegression.g:710:2: (this_NumberValue_0= ruleNumberValue otherlv_1= '%' )
            // InternalMLRegression.g:711:3: this_NumberValue_0= ruleNumberValue otherlv_1= '%'
            {

            			newCompositeNode(grammarAccess.getPercentValueAccess().getNumberValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_NumberValue_0=ruleNumberValue();

            state._fsp--;


            			current = this_NumberValue_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMLRegression.g:727:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalMLRegression.g:727:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalMLRegression.g:728:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalMLRegression.g:734:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalMLRegression.g:740:2: ( ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) ) )
            // InternalMLRegression.g:741:2: ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) )
            {
            // InternalMLRegression.g:741:2: ( ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) ) )
            // InternalMLRegression.g:742:3: ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) )
            {
            // InternalMLRegression.g:742:3: ( (lv_value_0_1= 'false' | lv_value_0_2= 'true' ) )
            // InternalMLRegression.g:743:4: (lv_value_0_1= 'false' | lv_value_0_2= 'true' )
            {
            // InternalMLRegression.g:743:4: (lv_value_0_1= 'false' | lv_value_0_2= 'true' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMLRegression.g:744:5: lv_value_0_1= 'false'
                    {
                    lv_value_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:755:5: lv_value_0_2= 'true'
                    {
                    lv_value_0_2=(Token)match(input,24,FOLLOW_2); 

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\5\1\14\1\5\2\uffff\1\5";
    static final String dfa_3s = "\1\5\2\26\2\uffff\1\26";
    static final String dfa_4s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\10\uffff\1\2\1\4",
            "\1\5\6\uffff\1\3\11\uffff\1\4",
            "",
            "",
            "\1\5\6\uffff\1\3\11\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "300:5: (lv_training_1_1= ruleNumberValue | lv_training_1_2= rulePercentValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}