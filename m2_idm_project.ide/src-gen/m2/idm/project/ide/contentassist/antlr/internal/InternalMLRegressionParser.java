package m2.idm.project.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import m2.idm.project.services.MLRegressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMLRegressionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cross_validation'", "'false'", "'true'", "';'", "'learning'", "'training'", "'predict'", "'{'", "'}'", "'target'", "'return'", "'.'", "'%'", "'import'"
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

    	public void setGrammarAccess(MLRegressionGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMLRegression"
    // InternalMLRegression.g:53:1: entryRuleMLRegression : ruleMLRegression EOF ;
    public final void entryRuleMLRegression() throws RecognitionException {
        try {
            // InternalMLRegression.g:54:1: ( ruleMLRegression EOF )
            // InternalMLRegression.g:55:1: ruleMLRegression EOF
            {
             before(grammarAccess.getMLRegressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMLRegression();

            state._fsp--;

             after(grammarAccess.getMLRegressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMLRegression"


    // $ANTLR start "ruleMLRegression"
    // InternalMLRegression.g:62:1: ruleMLRegression : ( ( rule__MLRegression__Group__0 ) ) ;
    public final void ruleMLRegression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:66:2: ( ( ( rule__MLRegression__Group__0 ) ) )
            // InternalMLRegression.g:67:2: ( ( rule__MLRegression__Group__0 ) )
            {
            // InternalMLRegression.g:67:2: ( ( rule__MLRegression__Group__0 ) )
            // InternalMLRegression.g:68:3: ( rule__MLRegression__Group__0 )
            {
             before(grammarAccess.getMLRegressionAccess().getGroup()); 
            // InternalMLRegression.g:69:3: ( rule__MLRegression__Group__0 )
            // InternalMLRegression.g:69:4: rule__MLRegression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMLRegression"


    // $ANTLR start "entryRuleDataset"
    // InternalMLRegression.g:78:1: entryRuleDataset : ruleDataset EOF ;
    public final void entryRuleDataset() throws RecognitionException {
        try {
            // InternalMLRegression.g:79:1: ( ruleDataset EOF )
            // InternalMLRegression.g:80:1: ruleDataset EOF
            {
             before(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_1);
            ruleDataset();

            state._fsp--;

             after(grammarAccess.getDatasetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataset"


    // $ANTLR start "ruleDataset"
    // InternalMLRegression.g:87:1: ruleDataset : ( ( rule__Dataset__Group__0 ) ) ;
    public final void ruleDataset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:91:2: ( ( ( rule__Dataset__Group__0 ) ) )
            // InternalMLRegression.g:92:2: ( ( rule__Dataset__Group__0 ) )
            {
            // InternalMLRegression.g:92:2: ( ( rule__Dataset__Group__0 ) )
            // InternalMLRegression.g:93:3: ( rule__Dataset__Group__0 )
            {
             before(grammarAccess.getDatasetAccess().getGroup()); 
            // InternalMLRegression.g:94:3: ( rule__Dataset__Group__0 )
            // InternalMLRegression.g:94:4: rule__Dataset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataset"


    // $ANTLR start "entryRuleLearningType"
    // InternalMLRegression.g:103:1: entryRuleLearningType : ruleLearningType EOF ;
    public final void entryRuleLearningType() throws RecognitionException {
        try {
            // InternalMLRegression.g:104:1: ( ruleLearningType EOF )
            // InternalMLRegression.g:105:1: ruleLearningType EOF
            {
             before(grammarAccess.getLearningTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLearningType();

            state._fsp--;

             after(grammarAccess.getLearningTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLearningType"


    // $ANTLR start "ruleLearningType"
    // InternalMLRegression.g:112:1: ruleLearningType : ( ( rule__LearningType__Group__0 ) ) ;
    public final void ruleLearningType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:116:2: ( ( ( rule__LearningType__Group__0 ) ) )
            // InternalMLRegression.g:117:2: ( ( rule__LearningType__Group__0 ) )
            {
            // InternalMLRegression.g:117:2: ( ( rule__LearningType__Group__0 ) )
            // InternalMLRegression.g:118:3: ( rule__LearningType__Group__0 )
            {
             before(grammarAccess.getLearningTypeAccess().getGroup()); 
            // InternalMLRegression.g:119:3: ( rule__LearningType__Group__0 )
            // InternalMLRegression.g:119:4: rule__LearningType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LearningType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLearningTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLearningType"


    // $ANTLR start "entryRuleTraining"
    // InternalMLRegression.g:128:1: entryRuleTraining : ruleTraining EOF ;
    public final void entryRuleTraining() throws RecognitionException {
        try {
            // InternalMLRegression.g:129:1: ( ruleTraining EOF )
            // InternalMLRegression.g:130:1: ruleTraining EOF
            {
             before(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getTrainingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalMLRegression.g:137:1: ruleTraining : ( ( rule__Training__Group__0 ) ) ;
    public final void ruleTraining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:141:2: ( ( ( rule__Training__Group__0 ) ) )
            // InternalMLRegression.g:142:2: ( ( rule__Training__Group__0 ) )
            {
            // InternalMLRegression.g:142:2: ( ( rule__Training__Group__0 ) )
            // InternalMLRegression.g:143:3: ( rule__Training__Group__0 )
            {
             before(grammarAccess.getTrainingAccess().getGroup()); 
            // InternalMLRegression.g:144:3: ( rule__Training__Group__0 )
            // InternalMLRegression.g:144:4: rule__Training__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMLRegression.g:153:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMLRegression.g:154:1: ( ruleCrossValidation EOF )
            // InternalMLRegression.g:155:1: ruleCrossValidation EOF
            {
             before(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getCrossValidationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMLRegression.g:162:1: ruleCrossValidation : ( 'cross_validation' ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:166:2: ( ( 'cross_validation' ) )
            // InternalMLRegression.g:167:2: ( 'cross_validation' )
            {
            // InternalMLRegression.g:167:2: ( 'cross_validation' )
            // InternalMLRegression.g:168:3: 'cross_validation'
            {
             before(grammarAccess.getCrossValidationAccess().getCross_validationKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getCross_validationKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleVariables"
    // InternalMLRegression.g:178:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // InternalMLRegression.g:179:1: ( ruleVariables EOF )
            // InternalMLRegression.g:180:1: ruleVariables EOF
            {
             before(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalMLRegression.g:187:1: ruleVariables : ( ( rule__Variables__Group__0 ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:191:2: ( ( ( rule__Variables__Group__0 ) ) )
            // InternalMLRegression.g:192:2: ( ( rule__Variables__Group__0 ) )
            {
            // InternalMLRegression.g:192:2: ( ( rule__Variables__Group__0 ) )
            // InternalMLRegression.g:193:3: ( rule__Variables__Group__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup()); 
            // InternalMLRegression.g:194:3: ( rule__Variables__Group__0 )
            // InternalMLRegression.g:194:4: rule__Variables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRulePredictives"
    // InternalMLRegression.g:203:1: entryRulePredictives : rulePredictives EOF ;
    public final void entryRulePredictives() throws RecognitionException {
        try {
            // InternalMLRegression.g:204:1: ( rulePredictives EOF )
            // InternalMLRegression.g:205:1: rulePredictives EOF
            {
             before(grammarAccess.getPredictivesRule()); 
            pushFollow(FOLLOW_1);
            rulePredictives();

            state._fsp--;

             after(grammarAccess.getPredictivesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredictives"


    // $ANTLR start "rulePredictives"
    // InternalMLRegression.g:212:1: rulePredictives : ( ( rule__Predictives__Group__0 ) ) ;
    public final void rulePredictives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:216:2: ( ( ( rule__Predictives__Group__0 ) ) )
            // InternalMLRegression.g:217:2: ( ( rule__Predictives__Group__0 ) )
            {
            // InternalMLRegression.g:217:2: ( ( rule__Predictives__Group__0 ) )
            // InternalMLRegression.g:218:3: ( rule__Predictives__Group__0 )
            {
             before(grammarAccess.getPredictivesAccess().getGroup()); 
            // InternalMLRegression.g:219:3: ( rule__Predictives__Group__0 )
            // InternalMLRegression.g:219:4: rule__Predictives__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predictives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictivesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredictives"


    // $ANTLR start "entryRuleTargets"
    // InternalMLRegression.g:228:1: entryRuleTargets : ruleTargets EOF ;
    public final void entryRuleTargets() throws RecognitionException {
        try {
            // InternalMLRegression.g:229:1: ( ruleTargets EOF )
            // InternalMLRegression.g:230:1: ruleTargets EOF
            {
             before(grammarAccess.getTargetsRule()); 
            pushFollow(FOLLOW_1);
            ruleTargets();

            state._fsp--;

             after(grammarAccess.getTargetsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargets"


    // $ANTLR start "ruleTargets"
    // InternalMLRegression.g:237:1: ruleTargets : ( ( rule__Targets__Group__0 ) ) ;
    public final void ruleTargets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:241:2: ( ( ( rule__Targets__Group__0 ) ) )
            // InternalMLRegression.g:242:2: ( ( rule__Targets__Group__0 ) )
            {
            // InternalMLRegression.g:242:2: ( ( rule__Targets__Group__0 ) )
            // InternalMLRegression.g:243:3: ( rule__Targets__Group__0 )
            {
             before(grammarAccess.getTargetsAccess().getGroup()); 
            // InternalMLRegression.g:244:3: ( rule__Targets__Group__0 )
            // InternalMLRegression.g:244:4: rule__Targets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Targets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargets"


    // $ANTLR start "entryRuleVar"
    // InternalMLRegression.g:253:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMLRegression.g:254:1: ( ruleVar EOF )
            // InternalMLRegression.g:255:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMLRegression.g:262:1: ruleVar : ( ( rule__Var__NameVarAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:266:2: ( ( ( rule__Var__NameVarAssignment ) ) )
            // InternalMLRegression.g:267:2: ( ( rule__Var__NameVarAssignment ) )
            {
            // InternalMLRegression.g:267:2: ( ( rule__Var__NameVarAssignment ) )
            // InternalMLRegression.g:268:3: ( rule__Var__NameVarAssignment )
            {
             before(grammarAccess.getVarAccess().getNameVarAssignment()); 
            // InternalMLRegression.g:269:3: ( rule__Var__NameVarAssignment )
            // InternalMLRegression.g:269:4: rule__Var__NameVarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Var__NameVarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleReturnType"
    // InternalMLRegression.g:278:1: entryRuleReturnType : ruleReturnType EOF ;
    public final void entryRuleReturnType() throws RecognitionException {
        try {
            // InternalMLRegression.g:279:1: ( ruleReturnType EOF )
            // InternalMLRegression.g:280:1: ruleReturnType EOF
            {
             before(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getReturnTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalMLRegression.g:287:1: ruleReturnType : ( ( rule__ReturnType__Group__0 ) ) ;
    public final void ruleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:291:2: ( ( ( rule__ReturnType__Group__0 ) ) )
            // InternalMLRegression.g:292:2: ( ( rule__ReturnType__Group__0 ) )
            {
            // InternalMLRegression.g:292:2: ( ( rule__ReturnType__Group__0 ) )
            // InternalMLRegression.g:293:3: ( rule__ReturnType__Group__0 )
            {
             before(grammarAccess.getReturnTypeAccess().getGroup()); 
            // InternalMLRegression.g:294:3: ( rule__ReturnType__Group__0 )
            // InternalMLRegression.g:294:4: rule__ReturnType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleStringValue"
    // InternalMLRegression.g:303:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:304:1: ( ruleStringValue EOF )
            // InternalMLRegression.g:305:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMLRegression.g:312:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:316:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalMLRegression.g:317:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:317:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalMLRegression.g:318:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:319:3: ( rule__StringValue__ValueAssignment )
            // InternalMLRegression.g:319:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalMLRegression.g:328:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:329:1: ( ruleNumberValue EOF )
            // InternalMLRegression.g:330:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalMLRegression.g:337:1: ruleNumberValue : ( ( rule__NumberValue__Group__0 ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:341:2: ( ( ( rule__NumberValue__Group__0 ) ) )
            // InternalMLRegression.g:342:2: ( ( rule__NumberValue__Group__0 ) )
            {
            // InternalMLRegression.g:342:2: ( ( rule__NumberValue__Group__0 ) )
            // InternalMLRegression.g:343:3: ( rule__NumberValue__Group__0 )
            {
             before(grammarAccess.getNumberValueAccess().getGroup()); 
            // InternalMLRegression.g:344:3: ( rule__NumberValue__Group__0 )
            // InternalMLRegression.g:344:4: rule__NumberValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRulePercentValue"
    // InternalMLRegression.g:353:1: entryRulePercentValue : rulePercentValue EOF ;
    public final void entryRulePercentValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:354:1: ( rulePercentValue EOF )
            // InternalMLRegression.g:355:1: rulePercentValue EOF
            {
             before(grammarAccess.getPercentValueRule()); 
            pushFollow(FOLLOW_1);
            rulePercentValue();

            state._fsp--;

             after(grammarAccess.getPercentValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePercentValue"


    // $ANTLR start "rulePercentValue"
    // InternalMLRegression.g:362:1: rulePercentValue : ( ( rule__PercentValue__Group__0 ) ) ;
    public final void rulePercentValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:366:2: ( ( ( rule__PercentValue__Group__0 ) ) )
            // InternalMLRegression.g:367:2: ( ( rule__PercentValue__Group__0 ) )
            {
            // InternalMLRegression.g:367:2: ( ( rule__PercentValue__Group__0 ) )
            // InternalMLRegression.g:368:3: ( rule__PercentValue__Group__0 )
            {
             before(grammarAccess.getPercentValueAccess().getGroup()); 
            // InternalMLRegression.g:369:3: ( rule__PercentValue__Group__0 )
            // InternalMLRegression.g:369:4: rule__PercentValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PercentValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPercentValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePercentValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalMLRegression.g:378:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:379:1: ( ruleBooleanValue EOF )
            // InternalMLRegression.g:380:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalMLRegression.g:387:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:391:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalMLRegression.g:392:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:392:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalMLRegression.g:393:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:394:3: ( rule__BooleanValue__ValueAssignment )
            // InternalMLRegression.g:394:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "rule__LearningType__Alternatives_1"
    // InternalMLRegression.g:402:1: rule__LearningType__Alternatives_1 : ( ( ( rule__LearningType__TrainingAssignment_1_0 ) ) | ( ( rule__LearningType__CrossValidationAssignment_1_1 ) ) );
    public final void rule__LearningType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:406:1: ( ( ( rule__LearningType__TrainingAssignment_1_0 ) ) | ( ( rule__LearningType__CrossValidationAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:407:2: ( ( rule__LearningType__TrainingAssignment_1_0 ) )
                    {
                    // InternalMLRegression.g:407:2: ( ( rule__LearningType__TrainingAssignment_1_0 ) )
                    // InternalMLRegression.g:408:3: ( rule__LearningType__TrainingAssignment_1_0 )
                    {
                     before(grammarAccess.getLearningTypeAccess().getTrainingAssignment_1_0()); 
                    // InternalMLRegression.g:409:3: ( rule__LearningType__TrainingAssignment_1_0 )
                    // InternalMLRegression.g:409:4: rule__LearningType__TrainingAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LearningType__TrainingAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLearningTypeAccess().getTrainingAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:413:2: ( ( rule__LearningType__CrossValidationAssignment_1_1 ) )
                    {
                    // InternalMLRegression.g:413:2: ( ( rule__LearningType__CrossValidationAssignment_1_1 ) )
                    // InternalMLRegression.g:414:3: ( rule__LearningType__CrossValidationAssignment_1_1 )
                    {
                     before(grammarAccess.getLearningTypeAccess().getCrossValidationAssignment_1_1()); 
                    // InternalMLRegression.g:415:3: ( rule__LearningType__CrossValidationAssignment_1_1 )
                    // InternalMLRegression.g:415:4: rule__LearningType__CrossValidationAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LearningType__CrossValidationAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLearningTypeAccess().getCrossValidationAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningType__Alternatives_1"


    // $ANTLR start "rule__Training__TrainingAlternatives_1_0"
    // InternalMLRegression.g:423:1: rule__Training__TrainingAlternatives_1_0 : ( ( ruleNumberValue ) | ( rulePercentValue ) );
    public final void rule__Training__TrainingAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:427:1: ( ( ruleNumberValue ) | ( rulePercentValue ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMLRegression.g:428:2: ( ruleNumberValue )
                    {
                    // InternalMLRegression.g:428:2: ( ruleNumberValue )
                    // InternalMLRegression.g:429:3: ruleNumberValue
                    {
                     before(grammarAccess.getTrainingAccess().getTrainingNumberValueParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getTrainingAccess().getTrainingNumberValueParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:434:2: ( rulePercentValue )
                    {
                    // InternalMLRegression.g:434:2: ( rulePercentValue )
                    // InternalMLRegression.g:435:3: rulePercentValue
                    {
                     before(grammarAccess.getTrainingAccess().getTrainingPercentValueParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePercentValue();

                    state._fsp--;

                     after(grammarAccess.getTrainingAccess().getTrainingPercentValueParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__TrainingAlternatives_1_0"


    // $ANTLR start "rule__BooleanValue__ValueAlternatives_0"
    // InternalMLRegression.g:444:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'false' ) | ( 'true' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:448:1: ( ( 'false' ) | ( 'true' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMLRegression.g:449:2: ( 'false' )
                    {
                    // InternalMLRegression.g:449:2: ( 'false' )
                    // InternalMLRegression.g:450:3: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:455:2: ( 'true' )
                    {
                    // InternalMLRegression.g:455:2: ( 'true' )
                    // InternalMLRegression.g:456:3: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAlternatives_0"


    // $ANTLR start "rule__MLRegression__Group__0"
    // InternalMLRegression.g:465:1: rule__MLRegression__Group__0 : rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 ;
    public final void rule__MLRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:469:1: ( rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 )
            // InternalMLRegression.g:470:2: rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MLRegression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__0"


    // $ANTLR start "rule__MLRegression__Group__0__Impl"
    // InternalMLRegression.g:477:1: rule__MLRegression__Group__0__Impl : ( ( rule__MLRegression__DatasetAssignment_0 ) ) ;
    public final void rule__MLRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:481:1: ( ( ( rule__MLRegression__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:482:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:482:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            // InternalMLRegression.g:483:2: ( rule__MLRegression__DatasetAssignment_0 )
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:484:2: ( rule__MLRegression__DatasetAssignment_0 )
            // InternalMLRegression.g:484:3: rule__MLRegression__DatasetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__DatasetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__0__Impl"


    // $ANTLR start "rule__MLRegression__Group__1"
    // InternalMLRegression.g:492:1: rule__MLRegression__Group__1 : rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 ;
    public final void rule__MLRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:496:1: ( rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 )
            // InternalMLRegression.g:497:2: rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MLRegression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__1"


    // $ANTLR start "rule__MLRegression__Group__1__Impl"
    // InternalMLRegression.g:504:1: rule__MLRegression__Group__1__Impl : ( ( rule__MLRegression__LearningTypeAssignment_1 )? ) ;
    public final void rule__MLRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:508:1: ( ( ( rule__MLRegression__LearningTypeAssignment_1 )? ) )
            // InternalMLRegression.g:509:1: ( ( rule__MLRegression__LearningTypeAssignment_1 )? )
            {
            // InternalMLRegression.g:509:1: ( ( rule__MLRegression__LearningTypeAssignment_1 )? )
            // InternalMLRegression.g:510:2: ( rule__MLRegression__LearningTypeAssignment_1 )?
            {
             before(grammarAccess.getMLRegressionAccess().getLearningTypeAssignment_1()); 
            // InternalMLRegression.g:511:2: ( rule__MLRegression__LearningTypeAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:511:3: rule__MLRegression__LearningTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLRegression__LearningTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLRegressionAccess().getLearningTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__1__Impl"


    // $ANTLR start "rule__MLRegression__Group__2"
    // InternalMLRegression.g:519:1: rule__MLRegression__Group__2 : rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 ;
    public final void rule__MLRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:523:1: ( rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 )
            // InternalMLRegression.g:524:2: rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MLRegression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__2"


    // $ANTLR start "rule__MLRegression__Group__2__Impl"
    // InternalMLRegression.g:531:1: rule__MLRegression__Group__2__Impl : ( ( rule__MLRegression__VarsAssignment_2 ) ) ;
    public final void rule__MLRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:535:1: ( ( ( rule__MLRegression__VarsAssignment_2 ) ) )
            // InternalMLRegression.g:536:1: ( ( rule__MLRegression__VarsAssignment_2 ) )
            {
            // InternalMLRegression.g:536:1: ( ( rule__MLRegression__VarsAssignment_2 ) )
            // InternalMLRegression.g:537:2: ( rule__MLRegression__VarsAssignment_2 )
            {
             before(grammarAccess.getMLRegressionAccess().getVarsAssignment_2()); 
            // InternalMLRegression.g:538:2: ( rule__MLRegression__VarsAssignment_2 )
            // InternalMLRegression.g:538:3: rule__MLRegression__VarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__VarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getVarsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__2__Impl"


    // $ANTLR start "rule__MLRegression__Group__3"
    // InternalMLRegression.g:546:1: rule__MLRegression__Group__3 : rule__MLRegression__Group__3__Impl ;
    public final void rule__MLRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:550:1: ( rule__MLRegression__Group__3__Impl )
            // InternalMLRegression.g:551:2: rule__MLRegression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__3"


    // $ANTLR start "rule__MLRegression__Group__3__Impl"
    // InternalMLRegression.g:557:1: rule__MLRegression__Group__3__Impl : ( ( rule__MLRegression__ReturnTypeAssignment_3 )? ) ;
    public final void rule__MLRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:561:1: ( ( ( rule__MLRegression__ReturnTypeAssignment_3 )? ) )
            // InternalMLRegression.g:562:1: ( ( rule__MLRegression__ReturnTypeAssignment_3 )? )
            {
            // InternalMLRegression.g:562:1: ( ( rule__MLRegression__ReturnTypeAssignment_3 )? )
            // InternalMLRegression.g:563:2: ( rule__MLRegression__ReturnTypeAssignment_3 )?
            {
             before(grammarAccess.getMLRegressionAccess().getReturnTypeAssignment_3()); 
            // InternalMLRegression.g:564:2: ( rule__MLRegression__ReturnTypeAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMLRegression.g:564:3: rule__MLRegression__ReturnTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLRegression__ReturnTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLRegressionAccess().getReturnTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__Group__3__Impl"


    // $ANTLR start "rule__Dataset__Group__0"
    // InternalMLRegression.g:573:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:577:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMLRegression.g:578:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Dataset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__Group__0"


    // $ANTLR start "rule__Dataset__Group__0__Impl"
    // InternalMLRegression.g:585:1: rule__Dataset__Group__0__Impl : ( ( rule__Dataset__DatasetAssignment_0 ) ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:589:1: ( ( ( rule__Dataset__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:590:1: ( ( rule__Dataset__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:590:1: ( ( rule__Dataset__DatasetAssignment_0 ) )
            // InternalMLRegression.g:591:2: ( rule__Dataset__DatasetAssignment_0 )
            {
             before(grammarAccess.getDatasetAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:592:2: ( rule__Dataset__DatasetAssignment_0 )
            // InternalMLRegression.g:592:3: rule__Dataset__DatasetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__DatasetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getDatasetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__Group__0__Impl"


    // $ANTLR start "rule__Dataset__Group__1"
    // InternalMLRegression.g:600:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:604:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMLRegression.g:605:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Dataset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__Group__1"


    // $ANTLR start "rule__Dataset__Group__1__Impl"
    // InternalMLRegression.g:612:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__DataAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:616:1: ( ( ( rule__Dataset__DataAssignment_1 ) ) )
            // InternalMLRegression.g:617:1: ( ( rule__Dataset__DataAssignment_1 ) )
            {
            // InternalMLRegression.g:617:1: ( ( rule__Dataset__DataAssignment_1 ) )
            // InternalMLRegression.g:618:2: ( rule__Dataset__DataAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getDataAssignment_1()); 
            // InternalMLRegression.g:619:2: ( rule__Dataset__DataAssignment_1 )
            // InternalMLRegression.g:619:3: rule__Dataset__DataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__DataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getDataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__Group__1__Impl"


    // $ANTLR start "rule__Dataset__Group__2"
    // InternalMLRegression.g:627:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:631:1: ( rule__Dataset__Group__2__Impl )
            // InternalMLRegression.g:632:2: rule__Dataset__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__Group__2"


    // $ANTLR start "rule__Dataset__Group__2__Impl"
    // InternalMLRegression.g:638:1: rule__Dataset__Group__2__Impl : ( ';' ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:642:1: ( ( ';' ) )
            // InternalMLRegression.g:643:1: ( ';' )
            {
            // InternalMLRegression.g:643:1: ( ';' )
            // InternalMLRegression.g:644:2: ';'
            {
             before(grammarAccess.getDatasetAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__Group__2__Impl"


    // $ANTLR start "rule__LearningType__Group__0"
    // InternalMLRegression.g:654:1: rule__LearningType__Group__0 : rule__LearningType__Group__0__Impl rule__LearningType__Group__1 ;
    public final void rule__LearningType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:658:1: ( rule__LearningType__Group__0__Impl rule__LearningType__Group__1 )
            // InternalMLRegression.g:659:2: rule__LearningType__Group__0__Impl rule__LearningType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LearningType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LearningType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningType__Group__0"


    // $ANTLR start "rule__LearningType__Group__0__Impl"
    // InternalMLRegression.g:666:1: rule__LearningType__Group__0__Impl : ( 'learning' ) ;
    public final void rule__LearningType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:670:1: ( ( 'learning' ) )
            // InternalMLRegression.g:671:1: ( 'learning' )
            {
            // InternalMLRegression.g:671:1: ( 'learning' )
            // InternalMLRegression.g:672:2: 'learning'
            {
             before(grammarAccess.getLearningTypeAccess().getLearningKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLearningTypeAccess().getLearningKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningType__Group__0__Impl"


    // $ANTLR start "rule__LearningType__Group__1"
    // InternalMLRegression.g:681:1: rule__LearningType__Group__1 : rule__LearningType__Group__1__Impl ;
    public final void rule__LearningType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:685:1: ( rule__LearningType__Group__1__Impl )
            // InternalMLRegression.g:686:2: rule__LearningType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LearningType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningType__Group__1"


    // $ANTLR start "rule__LearningType__Group__1__Impl"
    // InternalMLRegression.g:692:1: rule__LearningType__Group__1__Impl : ( ( rule__LearningType__Alternatives_1 ) ) ;
    public final void rule__LearningType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:696:1: ( ( ( rule__LearningType__Alternatives_1 ) ) )
            // InternalMLRegression.g:697:1: ( ( rule__LearningType__Alternatives_1 ) )
            {
            // InternalMLRegression.g:697:1: ( ( rule__LearningType__Alternatives_1 ) )
            // InternalMLRegression.g:698:2: ( rule__LearningType__Alternatives_1 )
            {
             before(grammarAccess.getLearningTypeAccess().getAlternatives_1()); 
            // InternalMLRegression.g:699:2: ( rule__LearningType__Alternatives_1 )
            // InternalMLRegression.g:699:3: rule__LearningType__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LearningType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLearningTypeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningType__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__0"
    // InternalMLRegression.g:708:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:712:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalMLRegression.g:713:2: rule__Training__Group__0__Impl rule__Training__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Training__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0"


    // $ANTLR start "rule__Training__Group__0__Impl"
    // InternalMLRegression.g:720:1: rule__Training__Group__0__Impl : ( 'training' ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:724:1: ( ( 'training' ) )
            // InternalMLRegression.g:725:1: ( 'training' )
            {
            // InternalMLRegression.g:725:1: ( 'training' )
            // InternalMLRegression.g:726:2: 'training'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getTrainingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0__Impl"


    // $ANTLR start "rule__Training__Group__1"
    // InternalMLRegression.g:735:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:739:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalMLRegression.g:740:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Training__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1"


    // $ANTLR start "rule__Training__Group__1__Impl"
    // InternalMLRegression.g:747:1: rule__Training__Group__1__Impl : ( ( rule__Training__TrainingAssignment_1 ) ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:751:1: ( ( ( rule__Training__TrainingAssignment_1 ) ) )
            // InternalMLRegression.g:752:1: ( ( rule__Training__TrainingAssignment_1 ) )
            {
            // InternalMLRegression.g:752:1: ( ( rule__Training__TrainingAssignment_1 ) )
            // InternalMLRegression.g:753:2: ( rule__Training__TrainingAssignment_1 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingAssignment_1()); 
            // InternalMLRegression.g:754:2: ( rule__Training__TrainingAssignment_1 )
            // InternalMLRegression.g:754:3: rule__Training__TrainingAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__TrainingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__2"
    // InternalMLRegression.g:762:1: rule__Training__Group__2 : rule__Training__Group__2__Impl ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:766:1: ( rule__Training__Group__2__Impl )
            // InternalMLRegression.g:767:2: rule__Training__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2"


    // $ANTLR start "rule__Training__Group__2__Impl"
    // InternalMLRegression.g:773:1: rule__Training__Group__2__Impl : ( ';' ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:777:1: ( ( ';' ) )
            // InternalMLRegression.g:778:1: ( ';' )
            {
            // InternalMLRegression.g:778:1: ( ';' )
            // InternalMLRegression.g:779:2: ';'
            {
             before(grammarAccess.getTrainingAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2__Impl"


    // $ANTLR start "rule__Variables__Group__0"
    // InternalMLRegression.g:789:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:793:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalMLRegression.g:794:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Variables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__0"


    // $ANTLR start "rule__Variables__Group__0__Impl"
    // InternalMLRegression.g:801:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__PredictivesAssignment_0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:805:1: ( ( ( rule__Variables__PredictivesAssignment_0 ) ) )
            // InternalMLRegression.g:806:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            {
            // InternalMLRegression.g:806:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            // InternalMLRegression.g:807:2: ( rule__Variables__PredictivesAssignment_0 )
            {
             before(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 
            // InternalMLRegression.g:808:2: ( rule__Variables__PredictivesAssignment_0 )
            // InternalMLRegression.g:808:3: rule__Variables__PredictivesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variables__PredictivesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__0__Impl"


    // $ANTLR start "rule__Variables__Group__1"
    // InternalMLRegression.g:816:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:820:1: ( rule__Variables__Group__1__Impl )
            // InternalMLRegression.g:821:2: rule__Variables__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__1"


    // $ANTLR start "rule__Variables__Group__1__Impl"
    // InternalMLRegression.g:827:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__TargetsAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:831:1: ( ( ( rule__Variables__TargetsAssignment_1 ) ) )
            // InternalMLRegression.g:832:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            {
            // InternalMLRegression.g:832:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            // InternalMLRegression.g:833:2: ( rule__Variables__TargetsAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 
            // InternalMLRegression.g:834:2: ( rule__Variables__TargetsAssignment_1 )
            // InternalMLRegression.g:834:3: rule__Variables__TargetsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variables__TargetsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group__1__Impl"


    // $ANTLR start "rule__Predictives__Group__0"
    // InternalMLRegression.g:843:1: rule__Predictives__Group__0 : rule__Predictives__Group__0__Impl rule__Predictives__Group__1 ;
    public final void rule__Predictives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:847:1: ( rule__Predictives__Group__0__Impl rule__Predictives__Group__1 )
            // InternalMLRegression.g:848:2: rule__Predictives__Group__0__Impl rule__Predictives__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Predictives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predictives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__0"


    // $ANTLR start "rule__Predictives__Group__0__Impl"
    // InternalMLRegression.g:855:1: rule__Predictives__Group__0__Impl : ( 'predict' ) ;
    public final void rule__Predictives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:859:1: ( ( 'predict' ) )
            // InternalMLRegression.g:860:1: ( 'predict' )
            {
            // InternalMLRegression.g:860:1: ( 'predict' )
            // InternalMLRegression.g:861:2: 'predict'
            {
             before(grammarAccess.getPredictivesAccess().getPredictKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredictivesAccess().getPredictKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__0__Impl"


    // $ANTLR start "rule__Predictives__Group__1"
    // InternalMLRegression.g:870:1: rule__Predictives__Group__1 : rule__Predictives__Group__1__Impl rule__Predictives__Group__2 ;
    public final void rule__Predictives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:874:1: ( rule__Predictives__Group__1__Impl rule__Predictives__Group__2 )
            // InternalMLRegression.g:875:2: rule__Predictives__Group__1__Impl rule__Predictives__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Predictives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predictives__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__1"


    // $ANTLR start "rule__Predictives__Group__1__Impl"
    // InternalMLRegression.g:882:1: rule__Predictives__Group__1__Impl : ( '{' ) ;
    public final void rule__Predictives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:886:1: ( ( '{' ) )
            // InternalMLRegression.g:887:1: ( '{' )
            {
            // InternalMLRegression.g:887:1: ( '{' )
            // InternalMLRegression.g:888:2: '{'
            {
             before(grammarAccess.getPredictivesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPredictivesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__1__Impl"


    // $ANTLR start "rule__Predictives__Group__2"
    // InternalMLRegression.g:897:1: rule__Predictives__Group__2 : rule__Predictives__Group__2__Impl rule__Predictives__Group__3 ;
    public final void rule__Predictives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:901:1: ( rule__Predictives__Group__2__Impl rule__Predictives__Group__3 )
            // InternalMLRegression.g:902:2: rule__Predictives__Group__2__Impl rule__Predictives__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Predictives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predictives__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__2"


    // $ANTLR start "rule__Predictives__Group__2__Impl"
    // InternalMLRegression.g:909:1: rule__Predictives__Group__2__Impl : ( ( ( rule__Predictives__VarsAssignment_2 ) ) ( ( rule__Predictives__VarsAssignment_2 )* ) ) ;
    public final void rule__Predictives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:913:1: ( ( ( ( rule__Predictives__VarsAssignment_2 ) ) ( ( rule__Predictives__VarsAssignment_2 )* ) ) )
            // InternalMLRegression.g:914:1: ( ( ( rule__Predictives__VarsAssignment_2 ) ) ( ( rule__Predictives__VarsAssignment_2 )* ) )
            {
            // InternalMLRegression.g:914:1: ( ( ( rule__Predictives__VarsAssignment_2 ) ) ( ( rule__Predictives__VarsAssignment_2 )* ) )
            // InternalMLRegression.g:915:2: ( ( rule__Predictives__VarsAssignment_2 ) ) ( ( rule__Predictives__VarsAssignment_2 )* )
            {
            // InternalMLRegression.g:915:2: ( ( rule__Predictives__VarsAssignment_2 ) )
            // InternalMLRegression.g:916:3: ( rule__Predictives__VarsAssignment_2 )
            {
             before(grammarAccess.getPredictivesAccess().getVarsAssignment_2()); 
            // InternalMLRegression.g:917:3: ( rule__Predictives__VarsAssignment_2 )
            // InternalMLRegression.g:917:4: rule__Predictives__VarsAssignment_2
            {
            pushFollow(FOLLOW_12);
            rule__Predictives__VarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredictivesAccess().getVarsAssignment_2()); 

            }

            // InternalMLRegression.g:920:2: ( ( rule__Predictives__VarsAssignment_2 )* )
            // InternalMLRegression.g:921:3: ( rule__Predictives__VarsAssignment_2 )*
            {
             before(grammarAccess.getPredictivesAccess().getVarsAssignment_2()); 
            // InternalMLRegression.g:922:3: ( rule__Predictives__VarsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMLRegression.g:922:4: rule__Predictives__VarsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Predictives__VarsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPredictivesAccess().getVarsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__2__Impl"


    // $ANTLR start "rule__Predictives__Group__3"
    // InternalMLRegression.g:931:1: rule__Predictives__Group__3 : rule__Predictives__Group__3__Impl rule__Predictives__Group__4 ;
    public final void rule__Predictives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:935:1: ( rule__Predictives__Group__3__Impl rule__Predictives__Group__4 )
            // InternalMLRegression.g:936:2: rule__Predictives__Group__3__Impl rule__Predictives__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Predictives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predictives__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__3"


    // $ANTLR start "rule__Predictives__Group__3__Impl"
    // InternalMLRegression.g:943:1: rule__Predictives__Group__3__Impl : ( '}' ) ;
    public final void rule__Predictives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:947:1: ( ( '}' ) )
            // InternalMLRegression.g:948:1: ( '}' )
            {
            // InternalMLRegression.g:948:1: ( '}' )
            // InternalMLRegression.g:949:2: '}'
            {
             before(grammarAccess.getPredictivesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPredictivesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__3__Impl"


    // $ANTLR start "rule__Predictives__Group__4"
    // InternalMLRegression.g:958:1: rule__Predictives__Group__4 : rule__Predictives__Group__4__Impl ;
    public final void rule__Predictives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:962:1: ( rule__Predictives__Group__4__Impl )
            // InternalMLRegression.g:963:2: rule__Predictives__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predictives__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__4"


    // $ANTLR start "rule__Predictives__Group__4__Impl"
    // InternalMLRegression.g:969:1: rule__Predictives__Group__4__Impl : ( ';' ) ;
    public final void rule__Predictives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:973:1: ( ( ';' ) )
            // InternalMLRegression.g:974:1: ( ';' )
            {
            // InternalMLRegression.g:974:1: ( ';' )
            // InternalMLRegression.g:975:2: ';'
            {
             before(grammarAccess.getPredictivesAccess().getSemicolonKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPredictivesAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__Group__4__Impl"


    // $ANTLR start "rule__Targets__Group__0"
    // InternalMLRegression.g:985:1: rule__Targets__Group__0 : rule__Targets__Group__0__Impl rule__Targets__Group__1 ;
    public final void rule__Targets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:989:1: ( rule__Targets__Group__0__Impl rule__Targets__Group__1 )
            // InternalMLRegression.g:990:2: rule__Targets__Group__0__Impl rule__Targets__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Targets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Targets__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Targets__Group__0"


    // $ANTLR start "rule__Targets__Group__0__Impl"
    // InternalMLRegression.g:997:1: rule__Targets__Group__0__Impl : ( 'target' ) ;
    public final void rule__Targets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1001:1: ( ( 'target' ) )
            // InternalMLRegression.g:1002:1: ( 'target' )
            {
            // InternalMLRegression.g:1002:1: ( 'target' )
            // InternalMLRegression.g:1003:2: 'target'
            {
             before(grammarAccess.getTargetsAccess().getTargetKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTargetsAccess().getTargetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Targets__Group__0__Impl"


    // $ANTLR start "rule__Targets__Group__1"
    // InternalMLRegression.g:1012:1: rule__Targets__Group__1 : rule__Targets__Group__1__Impl rule__Targets__Group__2 ;
    public final void rule__Targets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1016:1: ( rule__Targets__Group__1__Impl rule__Targets__Group__2 )
            // InternalMLRegression.g:1017:2: rule__Targets__Group__1__Impl rule__Targets__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Targets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Targets__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Targets__Group__1"


    // $ANTLR start "rule__Targets__Group__1__Impl"
    // InternalMLRegression.g:1024:1: rule__Targets__Group__1__Impl : ( ( rule__Targets__VarAssignment_1 ) ) ;
    public final void rule__Targets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1028:1: ( ( ( rule__Targets__VarAssignment_1 ) ) )
            // InternalMLRegression.g:1029:1: ( ( rule__Targets__VarAssignment_1 ) )
            {
            // InternalMLRegression.g:1029:1: ( ( rule__Targets__VarAssignment_1 ) )
            // InternalMLRegression.g:1030:2: ( rule__Targets__VarAssignment_1 )
            {
             before(grammarAccess.getTargetsAccess().getVarAssignment_1()); 
            // InternalMLRegression.g:1031:2: ( rule__Targets__VarAssignment_1 )
            // InternalMLRegression.g:1031:3: rule__Targets__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Targets__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetsAccess().getVarAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Targets__Group__1__Impl"


    // $ANTLR start "rule__Targets__Group__2"
    // InternalMLRegression.g:1039:1: rule__Targets__Group__2 : rule__Targets__Group__2__Impl ;
    public final void rule__Targets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1043:1: ( rule__Targets__Group__2__Impl )
            // InternalMLRegression.g:1044:2: rule__Targets__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Targets__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Targets__Group__2"


    // $ANTLR start "rule__Targets__Group__2__Impl"
    // InternalMLRegression.g:1050:1: rule__Targets__Group__2__Impl : ( ';' ) ;
    public final void rule__Targets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1054:1: ( ( ';' ) )
            // InternalMLRegression.g:1055:1: ( ';' )
            {
            // InternalMLRegression.g:1055:1: ( ';' )
            // InternalMLRegression.g:1056:2: ';'
            {
             before(grammarAccess.getTargetsAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTargetsAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Targets__Group__2__Impl"


    // $ANTLR start "rule__ReturnType__Group__0"
    // InternalMLRegression.g:1066:1: rule__ReturnType__Group__0 : rule__ReturnType__Group__0__Impl rule__ReturnType__Group__1 ;
    public final void rule__ReturnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1070:1: ( rule__ReturnType__Group__0__Impl rule__ReturnType__Group__1 )
            // InternalMLRegression.g:1071:2: rule__ReturnType__Group__0__Impl rule__ReturnType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ReturnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__Group__0"


    // $ANTLR start "rule__ReturnType__Group__0__Impl"
    // InternalMLRegression.g:1078:1: rule__ReturnType__Group__0__Impl : ( 'return' ) ;
    public final void rule__ReturnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1082:1: ( ( 'return' ) )
            // InternalMLRegression.g:1083:1: ( 'return' )
            {
            // InternalMLRegression.g:1083:1: ( 'return' )
            // InternalMLRegression.g:1084:2: 'return'
            {
             before(grammarAccess.getReturnTypeAccess().getReturnKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReturnTypeAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__Group__0__Impl"


    // $ANTLR start "rule__ReturnType__Group__1"
    // InternalMLRegression.g:1093:1: rule__ReturnType__Group__1 : rule__ReturnType__Group__1__Impl ;
    public final void rule__ReturnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1097:1: ( rule__ReturnType__Group__1__Impl )
            // InternalMLRegression.g:1098:2: rule__ReturnType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__Group__1"


    // $ANTLR start "rule__ReturnType__Group__1__Impl"
    // InternalMLRegression.g:1104:1: rule__ReturnType__Group__1__Impl : ( ( rule__ReturnType__NameReturnAssignment_1 ) ) ;
    public final void rule__ReturnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1108:1: ( ( ( rule__ReturnType__NameReturnAssignment_1 ) ) )
            // InternalMLRegression.g:1109:1: ( ( rule__ReturnType__NameReturnAssignment_1 ) )
            {
            // InternalMLRegression.g:1109:1: ( ( rule__ReturnType__NameReturnAssignment_1 ) )
            // InternalMLRegression.g:1110:2: ( rule__ReturnType__NameReturnAssignment_1 )
            {
             before(grammarAccess.getReturnTypeAccess().getNameReturnAssignment_1()); 
            // InternalMLRegression.g:1111:2: ( rule__ReturnType__NameReturnAssignment_1 )
            // InternalMLRegression.g:1111:3: rule__ReturnType__NameReturnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType__NameReturnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeAccess().getNameReturnAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__Group__1__Impl"


    // $ANTLR start "rule__NumberValue__Group__0"
    // InternalMLRegression.g:1120:1: rule__NumberValue__Group__0 : rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1 ;
    public final void rule__NumberValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1124:1: ( rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1 )
            // InternalMLRegression.g:1125:2: rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__NumberValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group__0"


    // $ANTLR start "rule__NumberValue__Group__0__Impl"
    // InternalMLRegression.g:1132:1: rule__NumberValue__Group__0__Impl : ( ( rule__NumberValue__ValueAssignment_0 ) ) ;
    public final void rule__NumberValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1136:1: ( ( ( rule__NumberValue__ValueAssignment_0 ) ) )
            // InternalMLRegression.g:1137:1: ( ( rule__NumberValue__ValueAssignment_0 ) )
            {
            // InternalMLRegression.g:1137:1: ( ( rule__NumberValue__ValueAssignment_0 ) )
            // InternalMLRegression.g:1138:2: ( rule__NumberValue__ValueAssignment_0 )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment_0()); 
            // InternalMLRegression.g:1139:2: ( rule__NumberValue__ValueAssignment_0 )
            // InternalMLRegression.g:1139:3: rule__NumberValue__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group__0__Impl"


    // $ANTLR start "rule__NumberValue__Group__1"
    // InternalMLRegression.g:1147:1: rule__NumberValue__Group__1 : rule__NumberValue__Group__1__Impl ;
    public final void rule__NumberValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1151:1: ( rule__NumberValue__Group__1__Impl )
            // InternalMLRegression.g:1152:2: rule__NumberValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group__1"


    // $ANTLR start "rule__NumberValue__Group__1__Impl"
    // InternalMLRegression.g:1158:1: rule__NumberValue__Group__1__Impl : ( ( rule__NumberValue__Group_1__0 )? ) ;
    public final void rule__NumberValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1162:1: ( ( ( rule__NumberValue__Group_1__0 )? ) )
            // InternalMLRegression.g:1163:1: ( ( rule__NumberValue__Group_1__0 )? )
            {
            // InternalMLRegression.g:1163:1: ( ( rule__NumberValue__Group_1__0 )? )
            // InternalMLRegression.g:1164:2: ( rule__NumberValue__Group_1__0 )?
            {
             before(grammarAccess.getNumberValueAccess().getGroup_1()); 
            // InternalMLRegression.g:1165:2: ( rule__NumberValue__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMLRegression.g:1165:3: rule__NumberValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberValue__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group__1__Impl"


    // $ANTLR start "rule__NumberValue__Group_1__0"
    // InternalMLRegression.g:1174:1: rule__NumberValue__Group_1__0 : rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1 ;
    public final void rule__NumberValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1178:1: ( rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1 )
            // InternalMLRegression.g:1179:2: rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__NumberValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group_1__0"


    // $ANTLR start "rule__NumberValue__Group_1__0__Impl"
    // InternalMLRegression.g:1186:1: rule__NumberValue__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NumberValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1190:1: ( ( '.' ) )
            // InternalMLRegression.g:1191:1: ( '.' )
            {
            // InternalMLRegression.g:1191:1: ( '.' )
            // InternalMLRegression.g:1192:2: '.'
            {
             before(grammarAccess.getNumberValueAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumberValueAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group_1__0__Impl"


    // $ANTLR start "rule__NumberValue__Group_1__1"
    // InternalMLRegression.g:1201:1: rule__NumberValue__Group_1__1 : rule__NumberValue__Group_1__1__Impl ;
    public final void rule__NumberValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1205:1: ( rule__NumberValue__Group_1__1__Impl )
            // InternalMLRegression.g:1206:2: rule__NumberValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group_1__1"


    // $ANTLR start "rule__NumberValue__Group_1__1__Impl"
    // InternalMLRegression.g:1212:1: rule__NumberValue__Group_1__1__Impl : ( ( rule__NumberValue__DecimalAssignment_1_1 )* ) ;
    public final void rule__NumberValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1216:1: ( ( ( rule__NumberValue__DecimalAssignment_1_1 )* ) )
            // InternalMLRegression.g:1217:1: ( ( rule__NumberValue__DecimalAssignment_1_1 )* )
            {
            // InternalMLRegression.g:1217:1: ( ( rule__NumberValue__DecimalAssignment_1_1 )* )
            // InternalMLRegression.g:1218:2: ( rule__NumberValue__DecimalAssignment_1_1 )*
            {
             before(grammarAccess.getNumberValueAccess().getDecimalAssignment_1_1()); 
            // InternalMLRegression.g:1219:2: ( rule__NumberValue__DecimalAssignment_1_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMLRegression.g:1219:3: rule__NumberValue__DecimalAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__NumberValue__DecimalAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getNumberValueAccess().getDecimalAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__Group_1__1__Impl"


    // $ANTLR start "rule__PercentValue__Group__0"
    // InternalMLRegression.g:1228:1: rule__PercentValue__Group__0 : rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1 ;
    public final void rule__PercentValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1232:1: ( rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1 )
            // InternalMLRegression.g:1233:2: rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__PercentValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PercentValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentValue__Group__0"


    // $ANTLR start "rule__PercentValue__Group__0__Impl"
    // InternalMLRegression.g:1240:1: rule__PercentValue__Group__0__Impl : ( ruleNumberValue ) ;
    public final void rule__PercentValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1244:1: ( ( ruleNumberValue ) )
            // InternalMLRegression.g:1245:1: ( ruleNumberValue )
            {
            // InternalMLRegression.g:1245:1: ( ruleNumberValue )
            // InternalMLRegression.g:1246:2: ruleNumberValue
            {
             before(grammarAccess.getPercentValueAccess().getNumberValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getPercentValueAccess().getNumberValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentValue__Group__0__Impl"


    // $ANTLR start "rule__PercentValue__Group__1"
    // InternalMLRegression.g:1255:1: rule__PercentValue__Group__1 : rule__PercentValue__Group__1__Impl ;
    public final void rule__PercentValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1259:1: ( rule__PercentValue__Group__1__Impl )
            // InternalMLRegression.g:1260:2: rule__PercentValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PercentValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentValue__Group__1"


    // $ANTLR start "rule__PercentValue__Group__1__Impl"
    // InternalMLRegression.g:1266:1: rule__PercentValue__Group__1__Impl : ( '%' ) ;
    public final void rule__PercentValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1270:1: ( ( '%' ) )
            // InternalMLRegression.g:1271:1: ( '%' )
            {
            // InternalMLRegression.g:1271:1: ( '%' )
            // InternalMLRegression.g:1272:2: '%'
            {
             before(grammarAccess.getPercentValueAccess().getPercentSignKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPercentValueAccess().getPercentSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PercentValue__Group__1__Impl"


    // $ANTLR start "rule__MLRegression__DatasetAssignment_0"
    // InternalMLRegression.g:1282:1: rule__MLRegression__DatasetAssignment_0 : ( ruleDataset ) ;
    public final void rule__MLRegression__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1286:1: ( ( ruleDataset ) )
            // InternalMLRegression.g:1287:2: ( ruleDataset )
            {
            // InternalMLRegression.g:1287:2: ( ruleDataset )
            // InternalMLRegression.g:1288:3: ruleDataset
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetDatasetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataset();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getDatasetDatasetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__DatasetAssignment_0"


    // $ANTLR start "rule__MLRegression__LearningTypeAssignment_1"
    // InternalMLRegression.g:1297:1: rule__MLRegression__LearningTypeAssignment_1 : ( ruleLearningType ) ;
    public final void rule__MLRegression__LearningTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1301:1: ( ( ruleLearningType ) )
            // InternalMLRegression.g:1302:2: ( ruleLearningType )
            {
            // InternalMLRegression.g:1302:2: ( ruleLearningType )
            // InternalMLRegression.g:1303:3: ruleLearningType
            {
             before(grammarAccess.getMLRegressionAccess().getLearningTypeLearningTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLearningType();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getLearningTypeLearningTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__LearningTypeAssignment_1"


    // $ANTLR start "rule__MLRegression__VarsAssignment_2"
    // InternalMLRegression.g:1312:1: rule__MLRegression__VarsAssignment_2 : ( ruleVariables ) ;
    public final void rule__MLRegression__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1316:1: ( ( ruleVariables ) )
            // InternalMLRegression.g:1317:2: ( ruleVariables )
            {
            // InternalMLRegression.g:1317:2: ( ruleVariables )
            // InternalMLRegression.g:1318:3: ruleVariables
            {
             before(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__VarsAssignment_2"


    // $ANTLR start "rule__MLRegression__ReturnTypeAssignment_3"
    // InternalMLRegression.g:1327:1: rule__MLRegression__ReturnTypeAssignment_3 : ( ruleReturnType ) ;
    public final void rule__MLRegression__ReturnTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1331:1: ( ( ruleReturnType ) )
            // InternalMLRegression.g:1332:2: ( ruleReturnType )
            {
            // InternalMLRegression.g:1332:2: ( ruleReturnType )
            // InternalMLRegression.g:1333:3: ruleReturnType
            {
             before(grammarAccess.getMLRegressionAccess().getReturnTypeReturnTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getReturnTypeReturnTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__ReturnTypeAssignment_3"


    // $ANTLR start "rule__Dataset__DatasetAssignment_0"
    // InternalMLRegression.g:1342:1: rule__Dataset__DatasetAssignment_0 : ( ( 'import' ) ) ;
    public final void rule__Dataset__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1346:1: ( ( ( 'import' ) ) )
            // InternalMLRegression.g:1347:2: ( ( 'import' ) )
            {
            // InternalMLRegression.g:1347:2: ( ( 'import' ) )
            // InternalMLRegression.g:1348:3: ( 'import' )
            {
             before(grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0()); 
            // InternalMLRegression.g:1349:3: ( 'import' )
            // InternalMLRegression.g:1350:4: 'import'
            {
             before(grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0()); 

            }

             after(grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__DatasetAssignment_0"


    // $ANTLR start "rule__Dataset__DataAssignment_1"
    // InternalMLRegression.g:1361:1: rule__Dataset__DataAssignment_1 : ( ruleStringValue ) ;
    public final void rule__Dataset__DataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1365:1: ( ( ruleStringValue ) )
            // InternalMLRegression.g:1366:2: ( ruleStringValue )
            {
            // InternalMLRegression.g:1366:2: ( ruleStringValue )
            // InternalMLRegression.g:1367:3: ruleStringValue
            {
             before(grammarAccess.getDatasetAccess().getDataStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getDatasetAccess().getDataStringValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dataset__DataAssignment_1"


    // $ANTLR start "rule__LearningType__TrainingAssignment_1_0"
    // InternalMLRegression.g:1376:1: rule__LearningType__TrainingAssignment_1_0 : ( ruleTraining ) ;
    public final void rule__LearningType__TrainingAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1380:1: ( ( ruleTraining ) )
            // InternalMLRegression.g:1381:2: ( ruleTraining )
            {
            // InternalMLRegression.g:1381:2: ( ruleTraining )
            // InternalMLRegression.g:1382:3: ruleTraining
            {
             before(grammarAccess.getLearningTypeAccess().getTrainingTrainingParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getLearningTypeAccess().getTrainingTrainingParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningType__TrainingAssignment_1_0"


    // $ANTLR start "rule__LearningType__CrossValidationAssignment_1_1"
    // InternalMLRegression.g:1391:1: rule__LearningType__CrossValidationAssignment_1_1 : ( ruleCrossValidation ) ;
    public final void rule__LearningType__CrossValidationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1395:1: ( ( ruleCrossValidation ) )
            // InternalMLRegression.g:1396:2: ( ruleCrossValidation )
            {
            // InternalMLRegression.g:1396:2: ( ruleCrossValidation )
            // InternalMLRegression.g:1397:3: ruleCrossValidation
            {
             before(grammarAccess.getLearningTypeAccess().getCrossValidationCrossValidationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getLearningTypeAccess().getCrossValidationCrossValidationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LearningType__CrossValidationAssignment_1_1"


    // $ANTLR start "rule__Training__TrainingAssignment_1"
    // InternalMLRegression.g:1406:1: rule__Training__TrainingAssignment_1 : ( ( rule__Training__TrainingAlternatives_1_0 ) ) ;
    public final void rule__Training__TrainingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1410:1: ( ( ( rule__Training__TrainingAlternatives_1_0 ) ) )
            // InternalMLRegression.g:1411:2: ( ( rule__Training__TrainingAlternatives_1_0 ) )
            {
            // InternalMLRegression.g:1411:2: ( ( rule__Training__TrainingAlternatives_1_0 ) )
            // InternalMLRegression.g:1412:3: ( rule__Training__TrainingAlternatives_1_0 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingAlternatives_1_0()); 
            // InternalMLRegression.g:1413:3: ( rule__Training__TrainingAlternatives_1_0 )
            // InternalMLRegression.g:1413:4: rule__Training__TrainingAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Training__TrainingAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__TrainingAssignment_1"


    // $ANTLR start "rule__Variables__PredictivesAssignment_0"
    // InternalMLRegression.g:1421:1: rule__Variables__PredictivesAssignment_0 : ( rulePredictives ) ;
    public final void rule__Variables__PredictivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1425:1: ( ( rulePredictives ) )
            // InternalMLRegression.g:1426:2: ( rulePredictives )
            {
            // InternalMLRegression.g:1426:2: ( rulePredictives )
            // InternalMLRegression.g:1427:3: rulePredictives
            {
             before(grammarAccess.getVariablesAccess().getPredictivesPredictivesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredictives();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getPredictivesPredictivesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__PredictivesAssignment_0"


    // $ANTLR start "rule__Variables__TargetsAssignment_1"
    // InternalMLRegression.g:1436:1: rule__Variables__TargetsAssignment_1 : ( ruleTargets ) ;
    public final void rule__Variables__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1440:1: ( ( ruleTargets ) )
            // InternalMLRegression.g:1441:2: ( ruleTargets )
            {
            // InternalMLRegression.g:1441:2: ( ruleTargets )
            // InternalMLRegression.g:1442:3: ruleTargets
            {
             before(grammarAccess.getVariablesAccess().getTargetsTargetsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTargets();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getTargetsTargetsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__TargetsAssignment_1"


    // $ANTLR start "rule__Predictives__VarsAssignment_2"
    // InternalMLRegression.g:1451:1: rule__Predictives__VarsAssignment_2 : ( ruleVar ) ;
    public final void rule__Predictives__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1455:1: ( ( ruleVar ) )
            // InternalMLRegression.g:1456:2: ( ruleVar )
            {
            // InternalMLRegression.g:1456:2: ( ruleVar )
            // InternalMLRegression.g:1457:3: ruleVar
            {
             before(grammarAccess.getPredictivesAccess().getVarsVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getPredictivesAccess().getVarsVarParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predictives__VarsAssignment_2"


    // $ANTLR start "rule__Targets__VarAssignment_1"
    // InternalMLRegression.g:1466:1: rule__Targets__VarAssignment_1 : ( ruleVar ) ;
    public final void rule__Targets__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1470:1: ( ( ruleVar ) )
            // InternalMLRegression.g:1471:2: ( ruleVar )
            {
            // InternalMLRegression.g:1471:2: ( ruleVar )
            // InternalMLRegression.g:1472:3: ruleVar
            {
             before(grammarAccess.getTargetsAccess().getVarVarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getTargetsAccess().getVarVarParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Targets__VarAssignment_1"


    // $ANTLR start "rule__Var__NameVarAssignment"
    // InternalMLRegression.g:1481:1: rule__Var__NameVarAssignment : ( ruleStringValue ) ;
    public final void rule__Var__NameVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1485:1: ( ( ruleStringValue ) )
            // InternalMLRegression.g:1486:2: ( ruleStringValue )
            {
            // InternalMLRegression.g:1486:2: ( ruleStringValue )
            // InternalMLRegression.g:1487:3: ruleStringValue
            {
             before(grammarAccess.getVarAccess().getNameVarStringValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getVarAccess().getNameVarStringValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__NameVarAssignment"


    // $ANTLR start "rule__ReturnType__NameReturnAssignment_1"
    // InternalMLRegression.g:1496:1: rule__ReturnType__NameReturnAssignment_1 : ( ruleStringValue ) ;
    public final void rule__ReturnType__NameReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1500:1: ( ( ruleStringValue ) )
            // InternalMLRegression.g:1501:2: ( ruleStringValue )
            {
            // InternalMLRegression.g:1501:2: ( ruleStringValue )
            // InternalMLRegression.g:1502:3: ruleStringValue
            {
             before(grammarAccess.getReturnTypeAccess().getNameReturnStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getReturnTypeAccess().getNameReturnStringValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__NameReturnAssignment_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalMLRegression.g:1511:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1515:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:1516:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:1516:2: ( RULE_STRING )
            // InternalMLRegression.g:1517:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__NumberValue__ValueAssignment_0"
    // InternalMLRegression.g:1526:1: rule__NumberValue__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1530:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:1531:2: ( RULE_INT )
            {
            // InternalMLRegression.g:1531:2: ( RULE_INT )
            // InternalMLRegression.g:1532:3: RULE_INT
            {
             before(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberValueAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment_0"


    // $ANTLR start "rule__NumberValue__DecimalAssignment_1_1"
    // InternalMLRegression.g:1541:1: rule__NumberValue__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__NumberValue__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1545:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:1546:2: ( RULE_INT )
            {
            // InternalMLRegression.g:1546:2: ( RULE_INT )
            // InternalMLRegression.g:1547:3: RULE_INT
            {
             before(grammarAccess.getNumberValueAccess().getDecimalINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberValueAccess().getDecimalINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__DecimalAssignment_1_1"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalMLRegression.g:1556:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1560:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalMLRegression.g:1561:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalMLRegression.g:1561:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalMLRegression.g:1562:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // InternalMLRegression.g:1563:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalMLRegression.g:1563:4: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\5\1\16\1\5\2\uffff\1\5";
    static final String dfa_3s = "\1\5\2\27\2\uffff\1\27";
    static final String dfa_4s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\7\uffff\1\2\1\4",
            "\1\5\10\uffff\1\3\10\uffff\1\4",
            "",
            "",
            "\1\5\10\uffff\1\3\10\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "423:1: rule__Training__TrainingAlternatives_1_0 : ( ( ruleNumberValue ) | ( rulePercentValue ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});

}