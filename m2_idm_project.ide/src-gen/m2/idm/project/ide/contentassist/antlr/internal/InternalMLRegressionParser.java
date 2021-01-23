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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'line_regress'", "'decision_tree_regressor'", "'svr'", "'mean_absolute_error'", "'mean_squared_error'", "'median_absolute_error'", "'python'", "'Python'", "'PYTHON'", "'r'", "'R'", "'target_language'", "':'", "';'", "'import'", "'predictive_vars'", "','", "'target_vars'", "'partition'", "'cross_validation'", "'algorithm'", "'calculate'", "'Loop'", "'.'", "'%'"
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
    public static final int T__35=35;
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



    // $ANTLR start "entryRuleModel"
    // InternalMLRegression.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMLRegression.g:54:1: ( ruleModel EOF )
            // InternalMLRegression.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMLRegression.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMLRegression.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMLRegression.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMLRegression.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMLRegression.g:69:3: ( rule__Model__Group__0 )
            // InternalMLRegression.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLanguageTarget"
    // InternalMLRegression.g:78:1: entryRuleLanguageTarget : ruleLanguageTarget EOF ;
    public final void entryRuleLanguageTarget() throws RecognitionException {
        try {
            // InternalMLRegression.g:79:1: ( ruleLanguageTarget EOF )
            // InternalMLRegression.g:80:1: ruleLanguageTarget EOF
            {
             before(grammarAccess.getLanguageTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageTarget();

            state._fsp--;

             after(grammarAccess.getLanguageTargetRule()); 
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
    // $ANTLR end "entryRuleLanguageTarget"


    // $ANTLR start "ruleLanguageTarget"
    // InternalMLRegression.g:87:1: ruleLanguageTarget : ( ( rule__LanguageTarget__Group__0 ) ) ;
    public final void ruleLanguageTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:91:2: ( ( ( rule__LanguageTarget__Group__0 ) ) )
            // InternalMLRegression.g:92:2: ( ( rule__LanguageTarget__Group__0 ) )
            {
            // InternalMLRegression.g:92:2: ( ( rule__LanguageTarget__Group__0 ) )
            // InternalMLRegression.g:93:3: ( rule__LanguageTarget__Group__0 )
            {
             before(grammarAccess.getLanguageTargetAccess().getGroup()); 
            // InternalMLRegression.g:94:3: ( rule__LanguageTarget__Group__0 )
            // InternalMLRegression.g:94:4: rule__LanguageTarget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageTarget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageTargetAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguageTarget"


    // $ANTLR start "entryRulePython"
    // InternalMLRegression.g:103:1: entryRulePython : rulePython EOF ;
    public final void entryRulePython() throws RecognitionException {
        try {
            // InternalMLRegression.g:104:1: ( rulePython EOF )
            // InternalMLRegression.g:105:1: rulePython EOF
            {
             before(grammarAccess.getPythonRule()); 
            pushFollow(FOLLOW_1);
            rulePython();

            state._fsp--;

             after(grammarAccess.getPythonRule()); 
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
    // $ANTLR end "entryRulePython"


    // $ANTLR start "rulePython"
    // InternalMLRegression.g:112:1: rulePython : ( ( rule__Python__Alternatives ) ) ;
    public final void rulePython() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:116:2: ( ( ( rule__Python__Alternatives ) ) )
            // InternalMLRegression.g:117:2: ( ( rule__Python__Alternatives ) )
            {
            // InternalMLRegression.g:117:2: ( ( rule__Python__Alternatives ) )
            // InternalMLRegression.g:118:3: ( rule__Python__Alternatives )
            {
             before(grammarAccess.getPythonAccess().getAlternatives()); 
            // InternalMLRegression.g:119:3: ( rule__Python__Alternatives )
            // InternalMLRegression.g:119:4: rule__Python__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Python__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPythonAccess().getAlternatives()); 

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
    // $ANTLR end "rulePython"


    // $ANTLR start "entryRuleR"
    // InternalMLRegression.g:128:1: entryRuleR : ruleR EOF ;
    public final void entryRuleR() throws RecognitionException {
        try {
            // InternalMLRegression.g:129:1: ( ruleR EOF )
            // InternalMLRegression.g:130:1: ruleR EOF
            {
             before(grammarAccess.getRRule()); 
            pushFollow(FOLLOW_1);
            ruleR();

            state._fsp--;

             after(grammarAccess.getRRule()); 
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
    // $ANTLR end "entryRuleR"


    // $ANTLR start "ruleR"
    // InternalMLRegression.g:137:1: ruleR : ( ( rule__R__Alternatives ) ) ;
    public final void ruleR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:141:2: ( ( ( rule__R__Alternatives ) ) )
            // InternalMLRegression.g:142:2: ( ( rule__R__Alternatives ) )
            {
            // InternalMLRegression.g:142:2: ( ( rule__R__Alternatives ) )
            // InternalMLRegression.g:143:3: ( rule__R__Alternatives )
            {
             before(grammarAccess.getRAccess().getAlternatives()); 
            // InternalMLRegression.g:144:3: ( rule__R__Alternatives )
            // InternalMLRegression.g:144:4: rule__R__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__R__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRAccess().getAlternatives()); 

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
    // $ANTLR end "ruleR"


    // $ANTLR start "entryRuleMLRegression"
    // InternalMLRegression.g:153:1: entryRuleMLRegression : ruleMLRegression EOF ;
    public final void entryRuleMLRegression() throws RecognitionException {
        try {
            // InternalMLRegression.g:154:1: ( ruleMLRegression EOF )
            // InternalMLRegression.g:155:1: ruleMLRegression EOF
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
    // InternalMLRegression.g:162:1: ruleMLRegression : ( ( rule__MLRegression__Group__0 ) ) ;
    public final void ruleMLRegression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:166:2: ( ( ( rule__MLRegression__Group__0 ) ) )
            // InternalMLRegression.g:167:2: ( ( rule__MLRegression__Group__0 ) )
            {
            // InternalMLRegression.g:167:2: ( ( rule__MLRegression__Group__0 ) )
            // InternalMLRegression.g:168:3: ( rule__MLRegression__Group__0 )
            {
             before(grammarAccess.getMLRegressionAccess().getGroup()); 
            // InternalMLRegression.g:169:3: ( rule__MLRegression__Group__0 )
            // InternalMLRegression.g:169:4: rule__MLRegression__Group__0
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
    // InternalMLRegression.g:178:1: entryRuleDataset : ruleDataset EOF ;
    public final void entryRuleDataset() throws RecognitionException {
        try {
            // InternalMLRegression.g:179:1: ( ruleDataset EOF )
            // InternalMLRegression.g:180:1: ruleDataset EOF
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
    // InternalMLRegression.g:187:1: ruleDataset : ( ( rule__Dataset__Group__0 ) ) ;
    public final void ruleDataset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:191:2: ( ( ( rule__Dataset__Group__0 ) ) )
            // InternalMLRegression.g:192:2: ( ( rule__Dataset__Group__0 ) )
            {
            // InternalMLRegression.g:192:2: ( ( rule__Dataset__Group__0 ) )
            // InternalMLRegression.g:193:3: ( rule__Dataset__Group__0 )
            {
             before(grammarAccess.getDatasetAccess().getGroup()); 
            // InternalMLRegression.g:194:3: ( rule__Dataset__Group__0 )
            // InternalMLRegression.g:194:4: rule__Dataset__Group__0
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


    // $ANTLR start "entryRuleVariables"
    // InternalMLRegression.g:203:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // InternalMLRegression.g:204:1: ( ruleVariables EOF )
            // InternalMLRegression.g:205:1: ruleVariables EOF
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
    // InternalMLRegression.g:212:1: ruleVariables : ( ( rule__Variables__Group__0 ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:216:2: ( ( ( rule__Variables__Group__0 ) ) )
            // InternalMLRegression.g:217:2: ( ( rule__Variables__Group__0 ) )
            {
            // InternalMLRegression.g:217:2: ( ( rule__Variables__Group__0 ) )
            // InternalMLRegression.g:218:3: ( rule__Variables__Group__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup()); 
            // InternalMLRegression.g:219:3: ( rule__Variables__Group__0 )
            // InternalMLRegression.g:219:4: rule__Variables__Group__0
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


    // $ANTLR start "entryRulePredictiveVars"
    // InternalMLRegression.g:228:1: entryRulePredictiveVars : rulePredictiveVars EOF ;
    public final void entryRulePredictiveVars() throws RecognitionException {
        try {
            // InternalMLRegression.g:229:1: ( rulePredictiveVars EOF )
            // InternalMLRegression.g:230:1: rulePredictiveVars EOF
            {
             before(grammarAccess.getPredictiveVarsRule()); 
            pushFollow(FOLLOW_1);
            rulePredictiveVars();

            state._fsp--;

             after(grammarAccess.getPredictiveVarsRule()); 
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
    // $ANTLR end "entryRulePredictiveVars"


    // $ANTLR start "rulePredictiveVars"
    // InternalMLRegression.g:237:1: rulePredictiveVars : ( ( rule__PredictiveVars__Group__0 ) ) ;
    public final void rulePredictiveVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:241:2: ( ( ( rule__PredictiveVars__Group__0 ) ) )
            // InternalMLRegression.g:242:2: ( ( rule__PredictiveVars__Group__0 ) )
            {
            // InternalMLRegression.g:242:2: ( ( rule__PredictiveVars__Group__0 ) )
            // InternalMLRegression.g:243:3: ( rule__PredictiveVars__Group__0 )
            {
             before(grammarAccess.getPredictiveVarsAccess().getGroup()); 
            // InternalMLRegression.g:244:3: ( rule__PredictiveVars__Group__0 )
            // InternalMLRegression.g:244:4: rule__PredictiveVars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveVarsAccess().getGroup()); 

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
    // $ANTLR end "rulePredictiveVars"


    // $ANTLR start "entryRuleTargetVars"
    // InternalMLRegression.g:253:1: entryRuleTargetVars : ruleTargetVars EOF ;
    public final void entryRuleTargetVars() throws RecognitionException {
        try {
            // InternalMLRegression.g:254:1: ( ruleTargetVars EOF )
            // InternalMLRegression.g:255:1: ruleTargetVars EOF
            {
             before(grammarAccess.getTargetVarsRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetVars();

            state._fsp--;

             after(grammarAccess.getTargetVarsRule()); 
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
    // $ANTLR end "entryRuleTargetVars"


    // $ANTLR start "ruleTargetVars"
    // InternalMLRegression.g:262:1: ruleTargetVars : ( ( rule__TargetVars__Group__0 ) ) ;
    public final void ruleTargetVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:266:2: ( ( ( rule__TargetVars__Group__0 ) ) )
            // InternalMLRegression.g:267:2: ( ( rule__TargetVars__Group__0 ) )
            {
            // InternalMLRegression.g:267:2: ( ( rule__TargetVars__Group__0 ) )
            // InternalMLRegression.g:268:3: ( rule__TargetVars__Group__0 )
            {
             before(grammarAccess.getTargetVarsAccess().getGroup()); 
            // InternalMLRegression.g:269:3: ( rule__TargetVars__Group__0 )
            // InternalMLRegression.g:269:4: rule__TargetVars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetVars__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarsAccess().getGroup()); 

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
    // $ANTLR end "ruleTargetVars"


    // $ANTLR start "entryRuleEvaluationType"
    // InternalMLRegression.g:278:1: entryRuleEvaluationType : ruleEvaluationType EOF ;
    public final void entryRuleEvaluationType() throws RecognitionException {
        try {
            // InternalMLRegression.g:279:1: ( ruleEvaluationType EOF )
            // InternalMLRegression.g:280:1: ruleEvaluationType EOF
            {
             before(grammarAccess.getEvaluationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluationType();

            state._fsp--;

             after(grammarAccess.getEvaluationTypeRule()); 
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
    // $ANTLR end "entryRuleEvaluationType"


    // $ANTLR start "ruleEvaluationType"
    // InternalMLRegression.g:287:1: ruleEvaluationType : ( ( rule__EvaluationType__Alternatives ) ) ;
    public final void ruleEvaluationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:291:2: ( ( ( rule__EvaluationType__Alternatives ) ) )
            // InternalMLRegression.g:292:2: ( ( rule__EvaluationType__Alternatives ) )
            {
            // InternalMLRegression.g:292:2: ( ( rule__EvaluationType__Alternatives ) )
            // InternalMLRegression.g:293:3: ( rule__EvaluationType__Alternatives )
            {
             before(grammarAccess.getEvaluationTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:294:3: ( rule__EvaluationType__Alternatives )
            // InternalMLRegression.g:294:4: rule__EvaluationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvaluationType"


    // $ANTLR start "entryRulePartition"
    // InternalMLRegression.g:303:1: entryRulePartition : rulePartition EOF ;
    public final void entryRulePartition() throws RecognitionException {
        try {
            // InternalMLRegression.g:304:1: ( rulePartition EOF )
            // InternalMLRegression.g:305:1: rulePartition EOF
            {
             before(grammarAccess.getPartitionRule()); 
            pushFollow(FOLLOW_1);
            rulePartition();

            state._fsp--;

             after(grammarAccess.getPartitionRule()); 
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
    // $ANTLR end "entryRulePartition"


    // $ANTLR start "rulePartition"
    // InternalMLRegression.g:312:1: rulePartition : ( ( rule__Partition__Group__0 ) ) ;
    public final void rulePartition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:316:2: ( ( ( rule__Partition__Group__0 ) ) )
            // InternalMLRegression.g:317:2: ( ( rule__Partition__Group__0 ) )
            {
            // InternalMLRegression.g:317:2: ( ( rule__Partition__Group__0 ) )
            // InternalMLRegression.g:318:3: ( rule__Partition__Group__0 )
            {
             before(grammarAccess.getPartitionAccess().getGroup()); 
            // InternalMLRegression.g:319:3: ( rule__Partition__Group__0 )
            // InternalMLRegression.g:319:4: rule__Partition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Partition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartitionAccess().getGroup()); 

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
    // $ANTLR end "rulePartition"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMLRegression.g:328:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMLRegression.g:329:1: ( ruleCrossValidation EOF )
            // InternalMLRegression.g:330:1: ruleCrossValidation EOF
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
    // InternalMLRegression.g:337:1: ruleCrossValidation : ( ( rule__CrossValidation__Group__0 ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:341:2: ( ( ( rule__CrossValidation__Group__0 ) ) )
            // InternalMLRegression.g:342:2: ( ( rule__CrossValidation__Group__0 ) )
            {
            // InternalMLRegression.g:342:2: ( ( rule__CrossValidation__Group__0 ) )
            // InternalMLRegression.g:343:3: ( rule__CrossValidation__Group__0 )
            {
             before(grammarAccess.getCrossValidationAccess().getGroup()); 
            // InternalMLRegression.g:344:3: ( rule__CrossValidation__Group__0 )
            // InternalMLRegression.g:344:4: rule__CrossValidation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAlgo"
    // InternalMLRegression.g:353:1: entryRuleAlgo : ruleAlgo EOF ;
    public final void entryRuleAlgo() throws RecognitionException {
        try {
            // InternalMLRegression.g:354:1: ( ruleAlgo EOF )
            // InternalMLRegression.g:355:1: ruleAlgo EOF
            {
             before(grammarAccess.getAlgoRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgo();

            state._fsp--;

             after(grammarAccess.getAlgoRule()); 
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
    // $ANTLR end "entryRuleAlgo"


    // $ANTLR start "ruleAlgo"
    // InternalMLRegression.g:362:1: ruleAlgo : ( ( rule__Algo__Group__0 ) ) ;
    public final void ruleAlgo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:366:2: ( ( ( rule__Algo__Group__0 ) ) )
            // InternalMLRegression.g:367:2: ( ( rule__Algo__Group__0 ) )
            {
            // InternalMLRegression.g:367:2: ( ( rule__Algo__Group__0 ) )
            // InternalMLRegression.g:368:3: ( rule__Algo__Group__0 )
            {
             before(grammarAccess.getAlgoAccess().getGroup()); 
            // InternalMLRegression.g:369:3: ( rule__Algo__Group__0 )
            // InternalMLRegression.g:369:4: rule__Algo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgoAccess().getGroup()); 

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
    // $ANTLR end "ruleAlgo"


    // $ANTLR start "entryRuleAlgoType"
    // InternalMLRegression.g:378:1: entryRuleAlgoType : ruleAlgoType EOF ;
    public final void entryRuleAlgoType() throws RecognitionException {
        try {
            // InternalMLRegression.g:379:1: ( ruleAlgoType EOF )
            // InternalMLRegression.g:380:1: ruleAlgoType EOF
            {
             before(grammarAccess.getAlgoTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgoType();

            state._fsp--;

             after(grammarAccess.getAlgoTypeRule()); 
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
    // $ANTLR end "entryRuleAlgoType"


    // $ANTLR start "ruleAlgoType"
    // InternalMLRegression.g:387:1: ruleAlgoType : ( ( rule__AlgoType__Alternatives ) ) ;
    public final void ruleAlgoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:391:2: ( ( ( rule__AlgoType__Alternatives ) ) )
            // InternalMLRegression.g:392:2: ( ( rule__AlgoType__Alternatives ) )
            {
            // InternalMLRegression.g:392:2: ( ( rule__AlgoType__Alternatives ) )
            // InternalMLRegression.g:393:3: ( rule__AlgoType__Alternatives )
            {
             before(grammarAccess.getAlgoTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:394:3: ( rule__AlgoType__Alternatives )
            // InternalMLRegression.g:394:4: rule__AlgoType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AlgoType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlgoTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAlgoType"


    // $ANTLR start "entryRuleLineRegress"
    // InternalMLRegression.g:403:1: entryRuleLineRegress : ruleLineRegress EOF ;
    public final void entryRuleLineRegress() throws RecognitionException {
        try {
            // InternalMLRegression.g:404:1: ( ruleLineRegress EOF )
            // InternalMLRegression.g:405:1: ruleLineRegress EOF
            {
             before(grammarAccess.getLineRegressRule()); 
            pushFollow(FOLLOW_1);
            ruleLineRegress();

            state._fsp--;

             after(grammarAccess.getLineRegressRule()); 
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
    // $ANTLR end "entryRuleLineRegress"


    // $ANTLR start "ruleLineRegress"
    // InternalMLRegression.g:412:1: ruleLineRegress : ( 'line_regress' ) ;
    public final void ruleLineRegress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:416:2: ( ( 'line_regress' ) )
            // InternalMLRegression.g:417:2: ( 'line_regress' )
            {
            // InternalMLRegression.g:417:2: ( 'line_regress' )
            // InternalMLRegression.g:418:3: 'line_regress'
            {
             before(grammarAccess.getLineRegressAccess().getLine_regressKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getLine_regressKeyword()); 

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
    // $ANTLR end "ruleLineRegress"


    // $ANTLR start "entryRuleDecisionTreeRegressor"
    // InternalMLRegression.g:428:1: entryRuleDecisionTreeRegressor : ruleDecisionTreeRegressor EOF ;
    public final void entryRuleDecisionTreeRegressor() throws RecognitionException {
        try {
            // InternalMLRegression.g:429:1: ( ruleDecisionTreeRegressor EOF )
            // InternalMLRegression.g:430:1: ruleDecisionTreeRegressor EOF
            {
             before(grammarAccess.getDecisionTreeRegressorRule()); 
            pushFollow(FOLLOW_1);
            ruleDecisionTreeRegressor();

            state._fsp--;

             after(grammarAccess.getDecisionTreeRegressorRule()); 
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
    // $ANTLR end "entryRuleDecisionTreeRegressor"


    // $ANTLR start "ruleDecisionTreeRegressor"
    // InternalMLRegression.g:437:1: ruleDecisionTreeRegressor : ( 'decision_tree_regressor' ) ;
    public final void ruleDecisionTreeRegressor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:441:2: ( ( 'decision_tree_regressor' ) )
            // InternalMLRegression.g:442:2: ( 'decision_tree_regressor' )
            {
            // InternalMLRegression.g:442:2: ( 'decision_tree_regressor' )
            // InternalMLRegression.g:443:3: 'decision_tree_regressor'
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword()); 

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
    // $ANTLR end "ruleDecisionTreeRegressor"


    // $ANTLR start "entryRuleSVR"
    // InternalMLRegression.g:453:1: entryRuleSVR : ruleSVR EOF ;
    public final void entryRuleSVR() throws RecognitionException {
        try {
            // InternalMLRegression.g:454:1: ( ruleSVR EOF )
            // InternalMLRegression.g:455:1: ruleSVR EOF
            {
             before(grammarAccess.getSVRRule()); 
            pushFollow(FOLLOW_1);
            ruleSVR();

            state._fsp--;

             after(grammarAccess.getSVRRule()); 
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
    // $ANTLR end "entryRuleSVR"


    // $ANTLR start "ruleSVR"
    // InternalMLRegression.g:462:1: ruleSVR : ( 'svr' ) ;
    public final void ruleSVR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:466:2: ( ( 'svr' ) )
            // InternalMLRegression.g:467:2: ( 'svr' )
            {
            // InternalMLRegression.g:467:2: ( 'svr' )
            // InternalMLRegression.g:468:3: 'svr'
            {
             before(grammarAccess.getSVRAccess().getSvrKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getSvrKeyword()); 

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
    // $ANTLR end "ruleSVR"


    // $ANTLR start "entryRuleCalculate"
    // InternalMLRegression.g:478:1: entryRuleCalculate : ruleCalculate EOF ;
    public final void entryRuleCalculate() throws RecognitionException {
        try {
            // InternalMLRegression.g:479:1: ( ruleCalculate EOF )
            // InternalMLRegression.g:480:1: ruleCalculate EOF
            {
             before(grammarAccess.getCalculateRule()); 
            pushFollow(FOLLOW_1);
            ruleCalculate();

            state._fsp--;

             after(grammarAccess.getCalculateRule()); 
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
    // $ANTLR end "entryRuleCalculate"


    // $ANTLR start "ruleCalculate"
    // InternalMLRegression.g:487:1: ruleCalculate : ( ( rule__Calculate__Group__0 ) ) ;
    public final void ruleCalculate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:491:2: ( ( ( rule__Calculate__Group__0 ) ) )
            // InternalMLRegression.g:492:2: ( ( rule__Calculate__Group__0 ) )
            {
            // InternalMLRegression.g:492:2: ( ( rule__Calculate__Group__0 ) )
            // InternalMLRegression.g:493:3: ( rule__Calculate__Group__0 )
            {
             before(grammarAccess.getCalculateAccess().getGroup()); 
            // InternalMLRegression.g:494:3: ( rule__Calculate__Group__0 )
            // InternalMLRegression.g:494:4: rule__Calculate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalculateAccess().getGroup()); 

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
    // $ANTLR end "ruleCalculate"


    // $ANTLR start "entryRuleCalculateType"
    // InternalMLRegression.g:503:1: entryRuleCalculateType : ruleCalculateType EOF ;
    public final void entryRuleCalculateType() throws RecognitionException {
        try {
            // InternalMLRegression.g:504:1: ( ruleCalculateType EOF )
            // InternalMLRegression.g:505:1: ruleCalculateType EOF
            {
             before(grammarAccess.getCalculateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCalculateType();

            state._fsp--;

             after(grammarAccess.getCalculateTypeRule()); 
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
    // $ANTLR end "entryRuleCalculateType"


    // $ANTLR start "ruleCalculateType"
    // InternalMLRegression.g:512:1: ruleCalculateType : ( ( rule__CalculateType__Alternatives ) ) ;
    public final void ruleCalculateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:516:2: ( ( ( rule__CalculateType__Alternatives ) ) )
            // InternalMLRegression.g:517:2: ( ( rule__CalculateType__Alternatives ) )
            {
            // InternalMLRegression.g:517:2: ( ( rule__CalculateType__Alternatives ) )
            // InternalMLRegression.g:518:3: ( rule__CalculateType__Alternatives )
            {
             before(grammarAccess.getCalculateTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:519:3: ( rule__CalculateType__Alternatives )
            // InternalMLRegression.g:519:4: rule__CalculateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CalculateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCalculateTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCalculateType"


    // $ANTLR start "entryRuleMeanAbsoluteError"
    // InternalMLRegression.g:528:1: entryRuleMeanAbsoluteError : ruleMeanAbsoluteError EOF ;
    public final void entryRuleMeanAbsoluteError() throws RecognitionException {
        try {
            // InternalMLRegression.g:529:1: ( ruleMeanAbsoluteError EOF )
            // InternalMLRegression.g:530:1: ruleMeanAbsoluteError EOF
            {
             before(grammarAccess.getMeanAbsoluteErrorRule()); 
            pushFollow(FOLLOW_1);
            ruleMeanAbsoluteError();

            state._fsp--;

             after(grammarAccess.getMeanAbsoluteErrorRule()); 
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
    // $ANTLR end "entryRuleMeanAbsoluteError"


    // $ANTLR start "ruleMeanAbsoluteError"
    // InternalMLRegression.g:537:1: ruleMeanAbsoluteError : ( 'mean_absolute_error' ) ;
    public final void ruleMeanAbsoluteError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:541:2: ( ( 'mean_absolute_error' ) )
            // InternalMLRegression.g:542:2: ( 'mean_absolute_error' )
            {
            // InternalMLRegression.g:542:2: ( 'mean_absolute_error' )
            // InternalMLRegression.g:543:3: 'mean_absolute_error'
            {
             before(grammarAccess.getMeanAbsoluteErrorAccess().getMean_absolute_errorKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMeanAbsoluteErrorAccess().getMean_absolute_errorKeyword()); 

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
    // $ANTLR end "ruleMeanAbsoluteError"


    // $ANTLR start "entryRuleMeanSquaredError"
    // InternalMLRegression.g:553:1: entryRuleMeanSquaredError : ruleMeanSquaredError EOF ;
    public final void entryRuleMeanSquaredError() throws RecognitionException {
        try {
            // InternalMLRegression.g:554:1: ( ruleMeanSquaredError EOF )
            // InternalMLRegression.g:555:1: ruleMeanSquaredError EOF
            {
             before(grammarAccess.getMeanSquaredErrorRule()); 
            pushFollow(FOLLOW_1);
            ruleMeanSquaredError();

            state._fsp--;

             after(grammarAccess.getMeanSquaredErrorRule()); 
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
    // $ANTLR end "entryRuleMeanSquaredError"


    // $ANTLR start "ruleMeanSquaredError"
    // InternalMLRegression.g:562:1: ruleMeanSquaredError : ( 'mean_squared_error' ) ;
    public final void ruleMeanSquaredError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:566:2: ( ( 'mean_squared_error' ) )
            // InternalMLRegression.g:567:2: ( 'mean_squared_error' )
            {
            // InternalMLRegression.g:567:2: ( 'mean_squared_error' )
            // InternalMLRegression.g:568:3: 'mean_squared_error'
            {
             before(grammarAccess.getMeanSquaredErrorAccess().getMean_squared_errorKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMeanSquaredErrorAccess().getMean_squared_errorKeyword()); 

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
    // $ANTLR end "ruleMeanSquaredError"


    // $ANTLR start "entryRuleMedianAbsoluteError"
    // InternalMLRegression.g:578:1: entryRuleMedianAbsoluteError : ruleMedianAbsoluteError EOF ;
    public final void entryRuleMedianAbsoluteError() throws RecognitionException {
        try {
            // InternalMLRegression.g:579:1: ( ruleMedianAbsoluteError EOF )
            // InternalMLRegression.g:580:1: ruleMedianAbsoluteError EOF
            {
             before(grammarAccess.getMedianAbsoluteErrorRule()); 
            pushFollow(FOLLOW_1);
            ruleMedianAbsoluteError();

            state._fsp--;

             after(grammarAccess.getMedianAbsoluteErrorRule()); 
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
    // $ANTLR end "entryRuleMedianAbsoluteError"


    // $ANTLR start "ruleMedianAbsoluteError"
    // InternalMLRegression.g:587:1: ruleMedianAbsoluteError : ( 'median_absolute_error' ) ;
    public final void ruleMedianAbsoluteError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:591:2: ( ( 'median_absolute_error' ) )
            // InternalMLRegression.g:592:2: ( 'median_absolute_error' )
            {
            // InternalMLRegression.g:592:2: ( 'median_absolute_error' )
            // InternalMLRegression.g:593:3: 'median_absolute_error'
            {
             before(grammarAccess.getMedianAbsoluteErrorAccess().getMedian_absolute_errorKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMedianAbsoluteErrorAccess().getMedian_absolute_errorKeyword()); 

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
    // $ANTLR end "ruleMedianAbsoluteError"


    // $ANTLR start "entryRuleLoop"
    // InternalMLRegression.g:603:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMLRegression.g:604:1: ( ruleLoop EOF )
            // InternalMLRegression.g:605:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMLRegression.g:612:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:616:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMLRegression.g:617:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMLRegression.g:617:2: ( ( rule__Loop__Group__0 ) )
            // InternalMLRegression.g:618:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMLRegression.g:619:3: ( rule__Loop__Group__0 )
            // InternalMLRegression.g:619:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleNumericValue"
    // InternalMLRegression.g:628:1: entryRuleNumericValue : ruleNumericValue EOF ;
    public final void entryRuleNumericValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:629:1: ( ruleNumericValue EOF )
            // InternalMLRegression.g:630:1: ruleNumericValue EOF
            {
             before(grammarAccess.getNumericValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericValue();

            state._fsp--;

             after(grammarAccess.getNumericValueRule()); 
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
    // $ANTLR end "entryRuleNumericValue"


    // $ANTLR start "ruleNumericValue"
    // InternalMLRegression.g:637:1: ruleNumericValue : ( ( rule__NumericValue__Alternatives ) ) ;
    public final void ruleNumericValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:641:2: ( ( ( rule__NumericValue__Alternatives ) ) )
            // InternalMLRegression.g:642:2: ( ( rule__NumericValue__Alternatives ) )
            {
            // InternalMLRegression.g:642:2: ( ( rule__NumericValue__Alternatives ) )
            // InternalMLRegression.g:643:3: ( rule__NumericValue__Alternatives )
            {
             before(grammarAccess.getNumericValueAccess().getAlternatives()); 
            // InternalMLRegression.g:644:3: ( rule__NumericValue__Alternatives )
            // InternalMLRegression.g:644:4: rule__NumericValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumericValue"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMLRegression.g:653:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMLRegression.g:654:1: ( ruleFLOAT EOF )
            // InternalMLRegression.g:655:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMLRegression.g:662:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:666:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMLRegression.g:667:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMLRegression.g:667:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMLRegression.g:668:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMLRegression.g:669:3: ( rule__FLOAT__Group__0 )
            // InternalMLRegression.g:669:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRulePERCENT"
    // InternalMLRegression.g:678:1: entryRulePERCENT : rulePERCENT EOF ;
    public final void entryRulePERCENT() throws RecognitionException {
        try {
            // InternalMLRegression.g:679:1: ( rulePERCENT EOF )
            // InternalMLRegression.g:680:1: rulePERCENT EOF
            {
             before(grammarAccess.getPERCENTRule()); 
            pushFollow(FOLLOW_1);
            rulePERCENT();

            state._fsp--;

             after(grammarAccess.getPERCENTRule()); 
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
    // $ANTLR end "entryRulePERCENT"


    // $ANTLR start "rulePERCENT"
    // InternalMLRegression.g:687:1: rulePERCENT : ( ( rule__PERCENT__Group__0 ) ) ;
    public final void rulePERCENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:691:2: ( ( ( rule__PERCENT__Group__0 ) ) )
            // InternalMLRegression.g:692:2: ( ( rule__PERCENT__Group__0 ) )
            {
            // InternalMLRegression.g:692:2: ( ( rule__PERCENT__Group__0 ) )
            // InternalMLRegression.g:693:3: ( rule__PERCENT__Group__0 )
            {
             before(grammarAccess.getPERCENTAccess().getGroup()); 
            // InternalMLRegression.g:694:3: ( rule__PERCENT__Group__0 )
            // InternalMLRegression.g:694:4: rule__PERCENT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PERCENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPERCENTAccess().getGroup()); 

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
    // $ANTLR end "rulePERCENT"


    // $ANTLR start "rule__LanguageTarget__LanguageAlternatives_2_0"
    // InternalMLRegression.g:702:1: rule__LanguageTarget__LanguageAlternatives_2_0 : ( ( rulePython ) | ( ruleR ) );
    public final void rule__LanguageTarget__LanguageAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:706:1: ( ( rulePython ) | ( ruleR ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=17 && LA1_0<=19)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=20 && LA1_0<=21)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:707:2: ( rulePython )
                    {
                    // InternalMLRegression.g:707:2: ( rulePython )
                    // InternalMLRegression.g:708:3: rulePython
                    {
                     before(grammarAccess.getLanguageTargetAccess().getLanguagePythonParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePython();

                    state._fsp--;

                     after(grammarAccess.getLanguageTargetAccess().getLanguagePythonParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:713:2: ( ruleR )
                    {
                    // InternalMLRegression.g:713:2: ( ruleR )
                    // InternalMLRegression.g:714:3: ruleR
                    {
                     before(grammarAccess.getLanguageTargetAccess().getLanguageRParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleR();

                    state._fsp--;

                     after(grammarAccess.getLanguageTargetAccess().getLanguageRParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__LanguageTarget__LanguageAlternatives_2_0"


    // $ANTLR start "rule__Python__Alternatives"
    // InternalMLRegression.g:723:1: rule__Python__Alternatives : ( ( 'python' ) | ( 'Python' ) | ( 'PYTHON' ) );
    public final void rule__Python__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:727:1: ( ( 'python' ) | ( 'Python' ) | ( 'PYTHON' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
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
                    // InternalMLRegression.g:728:2: ( 'python' )
                    {
                    // InternalMLRegression.g:728:2: ( 'python' )
                    // InternalMLRegression.g:729:3: 'python'
                    {
                     before(grammarAccess.getPythonAccess().getPythonKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPythonAccess().getPythonKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:734:2: ( 'Python' )
                    {
                    // InternalMLRegression.g:734:2: ( 'Python' )
                    // InternalMLRegression.g:735:3: 'Python'
                    {
                     before(grammarAccess.getPythonAccess().getPythonKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPythonAccess().getPythonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:740:2: ( 'PYTHON' )
                    {
                    // InternalMLRegression.g:740:2: ( 'PYTHON' )
                    // InternalMLRegression.g:741:3: 'PYTHON'
                    {
                     before(grammarAccess.getPythonAccess().getPYTHONKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getPythonAccess().getPYTHONKeyword_2()); 

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
    // $ANTLR end "rule__Python__Alternatives"


    // $ANTLR start "rule__R__Alternatives"
    // InternalMLRegression.g:750:1: rule__R__Alternatives : ( ( 'r' ) | ( 'R' ) );
    public final void rule__R__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:754:1: ( ( 'r' ) | ( 'R' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMLRegression.g:755:2: ( 'r' )
                    {
                    // InternalMLRegression.g:755:2: ( 'r' )
                    // InternalMLRegression.g:756:3: 'r'
                    {
                     before(grammarAccess.getRAccess().getRKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getRAccess().getRKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:761:2: ( 'R' )
                    {
                    // InternalMLRegression.g:761:2: ( 'R' )
                    // InternalMLRegression.g:762:3: 'R'
                    {
                     before(grammarAccess.getRAccess().getRKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getRAccess().getRKeyword_1()); 

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
    // $ANTLR end "rule__R__Alternatives"


    // $ANTLR start "rule__EvaluationType__Alternatives"
    // InternalMLRegression.g:771:1: rule__EvaluationType__Alternatives : ( ( rulePartition ) | ( ruleCrossValidation ) );
    public final void rule__EvaluationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:775:1: ( ( rulePartition ) | ( ruleCrossValidation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:776:2: ( rulePartition )
                    {
                    // InternalMLRegression.g:776:2: ( rulePartition )
                    // InternalMLRegression.g:777:3: rulePartition
                    {
                     before(grammarAccess.getEvaluationTypeAccess().getPartitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePartition();

                    state._fsp--;

                     after(grammarAccess.getEvaluationTypeAccess().getPartitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:782:2: ( ruleCrossValidation )
                    {
                    // InternalMLRegression.g:782:2: ( ruleCrossValidation )
                    // InternalMLRegression.g:783:3: ruleCrossValidation
                    {
                     before(grammarAccess.getEvaluationTypeAccess().getCrossValidationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCrossValidation();

                    state._fsp--;

                     after(grammarAccess.getEvaluationTypeAccess().getCrossValidationParserRuleCall_1()); 

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
    // $ANTLR end "rule__EvaluationType__Alternatives"


    // $ANTLR start "rule__AlgoType__Alternatives"
    // InternalMLRegression.g:792:1: rule__AlgoType__Alternatives : ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) );
    public final void rule__AlgoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:796:1: ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 12:
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
                    // InternalMLRegression.g:797:2: ( ruleLineRegress )
                    {
                    // InternalMLRegression.g:797:2: ( ruleLineRegress )
                    // InternalMLRegression.g:798:3: ruleLineRegress
                    {
                     before(grammarAccess.getAlgoTypeAccess().getLineRegressParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLineRegress();

                    state._fsp--;

                     after(grammarAccess.getAlgoTypeAccess().getLineRegressParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:803:2: ( ruleSVR )
                    {
                    // InternalMLRegression.g:803:2: ( ruleSVR )
                    // InternalMLRegression.g:804:3: ruleSVR
                    {
                     before(grammarAccess.getAlgoTypeAccess().getSVRParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSVR();

                    state._fsp--;

                     after(grammarAccess.getAlgoTypeAccess().getSVRParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:809:2: ( ruleDecisionTreeRegressor )
                    {
                    // InternalMLRegression.g:809:2: ( ruleDecisionTreeRegressor )
                    // InternalMLRegression.g:810:3: ruleDecisionTreeRegressor
                    {
                     before(grammarAccess.getAlgoTypeAccess().getDecisionTreeRegressorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDecisionTreeRegressor();

                    state._fsp--;

                     after(grammarAccess.getAlgoTypeAccess().getDecisionTreeRegressorParserRuleCall_2()); 

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
    // $ANTLR end "rule__AlgoType__Alternatives"


    // $ANTLR start "rule__CalculateType__Alternatives"
    // InternalMLRegression.g:819:1: rule__CalculateType__Alternatives : ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) );
    public final void rule__CalculateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:823:1: ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
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
                    // InternalMLRegression.g:824:2: ( ruleMeanAbsoluteError )
                    {
                    // InternalMLRegression.g:824:2: ( ruleMeanAbsoluteError )
                    // InternalMLRegression.g:825:3: ruleMeanAbsoluteError
                    {
                     before(grammarAccess.getCalculateTypeAccess().getMeanAbsoluteErrorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMeanAbsoluteError();

                    state._fsp--;

                     after(grammarAccess.getCalculateTypeAccess().getMeanAbsoluteErrorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:830:2: ( ruleMeanSquaredError )
                    {
                    // InternalMLRegression.g:830:2: ( ruleMeanSquaredError )
                    // InternalMLRegression.g:831:3: ruleMeanSquaredError
                    {
                     before(grammarAccess.getCalculateTypeAccess().getMeanSquaredErrorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMeanSquaredError();

                    state._fsp--;

                     after(grammarAccess.getCalculateTypeAccess().getMeanSquaredErrorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:836:2: ( ruleMedianAbsoluteError )
                    {
                    // InternalMLRegression.g:836:2: ( ruleMedianAbsoluteError )
                    // InternalMLRegression.g:837:3: ruleMedianAbsoluteError
                    {
                     before(grammarAccess.getCalculateTypeAccess().getMedianAbsoluteErrorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMedianAbsoluteError();

                    state._fsp--;

                     after(grammarAccess.getCalculateTypeAccess().getMedianAbsoluteErrorParserRuleCall_2()); 

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
    // $ANTLR end "rule__CalculateType__Alternatives"


    // $ANTLR start "rule__NumericValue__Alternatives"
    // InternalMLRegression.g:846:1: rule__NumericValue__Alternatives : ( ( ruleFLOAT ) | ( rulePERCENT ) );
    public final void rule__NumericValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:850:1: ( ( ruleFLOAT ) | ( rulePERCENT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_INT) ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5==EOF||LA7_5==24) ) {
                            alt7=1;
                        }
                        else if ( (LA7_5==35) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 24:
                    {
                    alt7=1;
                    }
                    break;
                case 35:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMLRegression.g:851:2: ( ruleFLOAT )
                    {
                    // InternalMLRegression.g:851:2: ( ruleFLOAT )
                    // InternalMLRegression.g:852:3: ruleFLOAT
                    {
                     before(grammarAccess.getNumericValueAccess().getFLOATParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFLOAT();

                    state._fsp--;

                     after(grammarAccess.getNumericValueAccess().getFLOATParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:857:2: ( rulePERCENT )
                    {
                    // InternalMLRegression.g:857:2: ( rulePERCENT )
                    // InternalMLRegression.g:858:3: rulePERCENT
                    {
                     before(grammarAccess.getNumericValueAccess().getPERCENTParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePERCENT();

                    state._fsp--;

                     after(grammarAccess.getNumericValueAccess().getPERCENTParserRuleCall_1()); 

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
    // $ANTLR end "rule__NumericValue__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMLRegression.g:867:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:871:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMLRegression.g:872:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMLRegression.g:879:1: rule__Model__Group__0__Impl : ( ( rule__Model__LanguageTargetAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:883:1: ( ( ( rule__Model__LanguageTargetAssignment_0 )? ) )
            // InternalMLRegression.g:884:1: ( ( rule__Model__LanguageTargetAssignment_0 )? )
            {
            // InternalMLRegression.g:884:1: ( ( rule__Model__LanguageTargetAssignment_0 )? )
            // InternalMLRegression.g:885:2: ( rule__Model__LanguageTargetAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getLanguageTargetAssignment_0()); 
            // InternalMLRegression.g:886:2: ( rule__Model__LanguageTargetAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMLRegression.g:886:3: rule__Model__LanguageTargetAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__LanguageTargetAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getLanguageTargetAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMLRegression.g:894:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:898:1: ( rule__Model__Group__1__Impl )
            // InternalMLRegression.g:899:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMLRegression.g:905:1: rule__Model__Group__1__Impl : ( ( rule__Model__MlAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:909:1: ( ( ( rule__Model__MlAssignment_1 ) ) )
            // InternalMLRegression.g:910:1: ( ( rule__Model__MlAssignment_1 ) )
            {
            // InternalMLRegression.g:910:1: ( ( rule__Model__MlAssignment_1 ) )
            // InternalMLRegression.g:911:2: ( rule__Model__MlAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getMlAssignment_1()); 
            // InternalMLRegression.g:912:2: ( rule__Model__MlAssignment_1 )
            // InternalMLRegression.g:912:3: rule__Model__MlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__MlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMlAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__LanguageTarget__Group__0"
    // InternalMLRegression.g:921:1: rule__LanguageTarget__Group__0 : rule__LanguageTarget__Group__0__Impl rule__LanguageTarget__Group__1 ;
    public final void rule__LanguageTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:925:1: ( rule__LanguageTarget__Group__0__Impl rule__LanguageTarget__Group__1 )
            // InternalMLRegression.g:926:2: rule__LanguageTarget__Group__0__Impl rule__LanguageTarget__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LanguageTarget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageTarget__Group__1();

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
    // $ANTLR end "rule__LanguageTarget__Group__0"


    // $ANTLR start "rule__LanguageTarget__Group__0__Impl"
    // InternalMLRegression.g:933:1: rule__LanguageTarget__Group__0__Impl : ( 'target_language' ) ;
    public final void rule__LanguageTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:937:1: ( ( 'target_language' ) )
            // InternalMLRegression.g:938:1: ( 'target_language' )
            {
            // InternalMLRegression.g:938:1: ( 'target_language' )
            // InternalMLRegression.g:939:2: 'target_language'
            {
             before(grammarAccess.getLanguageTargetAccess().getTarget_languageKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageTargetAccess().getTarget_languageKeyword_0()); 

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
    // $ANTLR end "rule__LanguageTarget__Group__0__Impl"


    // $ANTLR start "rule__LanguageTarget__Group__1"
    // InternalMLRegression.g:948:1: rule__LanguageTarget__Group__1 : rule__LanguageTarget__Group__1__Impl rule__LanguageTarget__Group__2 ;
    public final void rule__LanguageTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:952:1: ( rule__LanguageTarget__Group__1__Impl rule__LanguageTarget__Group__2 )
            // InternalMLRegression.g:953:2: rule__LanguageTarget__Group__1__Impl rule__LanguageTarget__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LanguageTarget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageTarget__Group__2();

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
    // $ANTLR end "rule__LanguageTarget__Group__1"


    // $ANTLR start "rule__LanguageTarget__Group__1__Impl"
    // InternalMLRegression.g:960:1: rule__LanguageTarget__Group__1__Impl : ( ':' ) ;
    public final void rule__LanguageTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:964:1: ( ( ':' ) )
            // InternalMLRegression.g:965:1: ( ':' )
            {
            // InternalMLRegression.g:965:1: ( ':' )
            // InternalMLRegression.g:966:2: ':'
            {
             before(grammarAccess.getLanguageTargetAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLanguageTargetAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__LanguageTarget__Group__1__Impl"


    // $ANTLR start "rule__LanguageTarget__Group__2"
    // InternalMLRegression.g:975:1: rule__LanguageTarget__Group__2 : rule__LanguageTarget__Group__2__Impl rule__LanguageTarget__Group__3 ;
    public final void rule__LanguageTarget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:979:1: ( rule__LanguageTarget__Group__2__Impl rule__LanguageTarget__Group__3 )
            // InternalMLRegression.g:980:2: rule__LanguageTarget__Group__2__Impl rule__LanguageTarget__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LanguageTarget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageTarget__Group__3();

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
    // $ANTLR end "rule__LanguageTarget__Group__2"


    // $ANTLR start "rule__LanguageTarget__Group__2__Impl"
    // InternalMLRegression.g:987:1: rule__LanguageTarget__Group__2__Impl : ( ( rule__LanguageTarget__LanguageAssignment_2 ) ) ;
    public final void rule__LanguageTarget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:991:1: ( ( ( rule__LanguageTarget__LanguageAssignment_2 ) ) )
            // InternalMLRegression.g:992:1: ( ( rule__LanguageTarget__LanguageAssignment_2 ) )
            {
            // InternalMLRegression.g:992:1: ( ( rule__LanguageTarget__LanguageAssignment_2 ) )
            // InternalMLRegression.g:993:2: ( rule__LanguageTarget__LanguageAssignment_2 )
            {
             before(grammarAccess.getLanguageTargetAccess().getLanguageAssignment_2()); 
            // InternalMLRegression.g:994:2: ( rule__LanguageTarget__LanguageAssignment_2 )
            // InternalMLRegression.g:994:3: rule__LanguageTarget__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LanguageTarget__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguageTargetAccess().getLanguageAssignment_2()); 

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
    // $ANTLR end "rule__LanguageTarget__Group__2__Impl"


    // $ANTLR start "rule__LanguageTarget__Group__3"
    // InternalMLRegression.g:1002:1: rule__LanguageTarget__Group__3 : rule__LanguageTarget__Group__3__Impl ;
    public final void rule__LanguageTarget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1006:1: ( rule__LanguageTarget__Group__3__Impl )
            // InternalMLRegression.g:1007:2: rule__LanguageTarget__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageTarget__Group__3__Impl();

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
    // $ANTLR end "rule__LanguageTarget__Group__3"


    // $ANTLR start "rule__LanguageTarget__Group__3__Impl"
    // InternalMLRegression.g:1013:1: rule__LanguageTarget__Group__3__Impl : ( ';' ) ;
    public final void rule__LanguageTarget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1017:1: ( ( ';' ) )
            // InternalMLRegression.g:1018:1: ( ';' )
            {
            // InternalMLRegression.g:1018:1: ( ';' )
            // InternalMLRegression.g:1019:2: ';'
            {
             before(grammarAccess.getLanguageTargetAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLanguageTargetAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__LanguageTarget__Group__3__Impl"


    // $ANTLR start "rule__MLRegression__Group__0"
    // InternalMLRegression.g:1029:1: rule__MLRegression__Group__0 : rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 ;
    public final void rule__MLRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1033:1: ( rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 )
            // InternalMLRegression.g:1034:2: rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMLRegression.g:1041:1: rule__MLRegression__Group__0__Impl : ( ( rule__MLRegression__DatasetAssignment_0 ) ) ;
    public final void rule__MLRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1045:1: ( ( ( rule__MLRegression__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:1046:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:1046:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            // InternalMLRegression.g:1047:2: ( rule__MLRegression__DatasetAssignment_0 )
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:1048:2: ( rule__MLRegression__DatasetAssignment_0 )
            // InternalMLRegression.g:1048:3: rule__MLRegression__DatasetAssignment_0
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
    // InternalMLRegression.g:1056:1: rule__MLRegression__Group__1 : rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 ;
    public final void rule__MLRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1060:1: ( rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 )
            // InternalMLRegression.g:1061:2: rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMLRegression.g:1068:1: rule__MLRegression__Group__1__Impl : ( ( rule__MLRegression__VarsAssignment_1 )? ) ;
    public final void rule__MLRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1072:1: ( ( ( rule__MLRegression__VarsAssignment_1 )? ) )
            // InternalMLRegression.g:1073:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            {
            // InternalMLRegression.g:1073:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            // InternalMLRegression.g:1074:2: ( rule__MLRegression__VarsAssignment_1 )?
            {
             before(grammarAccess.getMLRegressionAccess().getVarsAssignment_1()); 
            // InternalMLRegression.g:1075:2: ( rule__MLRegression__VarsAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMLRegression.g:1075:3: rule__MLRegression__VarsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLRegression__VarsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLRegressionAccess().getVarsAssignment_1()); 

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
    // InternalMLRegression.g:1083:1: rule__MLRegression__Group__2 : rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 ;
    public final void rule__MLRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1087:1: ( rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 )
            // InternalMLRegression.g:1088:2: rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1095:1: rule__MLRegression__Group__2__Impl : ( ( rule__MLRegression__EvaluationAssignment_2 ) ) ;
    public final void rule__MLRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1099:1: ( ( ( rule__MLRegression__EvaluationAssignment_2 ) ) )
            // InternalMLRegression.g:1100:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            {
            // InternalMLRegression.g:1100:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            // InternalMLRegression.g:1101:2: ( rule__MLRegression__EvaluationAssignment_2 )
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_2()); 
            // InternalMLRegression.g:1102:2: ( rule__MLRegression__EvaluationAssignment_2 )
            // InternalMLRegression.g:1102:3: rule__MLRegression__EvaluationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__EvaluationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_2()); 

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
    // InternalMLRegression.g:1110:1: rule__MLRegression__Group__3 : rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 ;
    public final void rule__MLRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1114:1: ( rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 )
            // InternalMLRegression.g:1115:2: rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MLRegression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__4();

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
    // InternalMLRegression.g:1122:1: rule__MLRegression__Group__3__Impl : ( ( rule__MLRegression__AlgoAssignment_3 ) ) ;
    public final void rule__MLRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1126:1: ( ( ( rule__MLRegression__AlgoAssignment_3 ) ) )
            // InternalMLRegression.g:1127:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            {
            // InternalMLRegression.g:1127:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            // InternalMLRegression.g:1128:2: ( rule__MLRegression__AlgoAssignment_3 )
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAssignment_3()); 
            // InternalMLRegression.g:1129:2: ( rule__MLRegression__AlgoAssignment_3 )
            // InternalMLRegression.g:1129:3: rule__MLRegression__AlgoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__AlgoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getAlgoAssignment_3()); 

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


    // $ANTLR start "rule__MLRegression__Group__4"
    // InternalMLRegression.g:1137:1: rule__MLRegression__Group__4 : rule__MLRegression__Group__4__Impl rule__MLRegression__Group__5 ;
    public final void rule__MLRegression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1141:1: ( rule__MLRegression__Group__4__Impl rule__MLRegression__Group__5 )
            // InternalMLRegression.g:1142:2: rule__MLRegression__Group__4__Impl rule__MLRegression__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__MLRegression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__5();

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
    // $ANTLR end "rule__MLRegression__Group__4"


    // $ANTLR start "rule__MLRegression__Group__4__Impl"
    // InternalMLRegression.g:1149:1: rule__MLRegression__Group__4__Impl : ( ( rule__MLRegression__CalculateAssignment_4 ) ) ;
    public final void rule__MLRegression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1153:1: ( ( ( rule__MLRegression__CalculateAssignment_4 ) ) )
            // InternalMLRegression.g:1154:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            {
            // InternalMLRegression.g:1154:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            // InternalMLRegression.g:1155:2: ( rule__MLRegression__CalculateAssignment_4 )
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateAssignment_4()); 
            // InternalMLRegression.g:1156:2: ( rule__MLRegression__CalculateAssignment_4 )
            // InternalMLRegression.g:1156:3: rule__MLRegression__CalculateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__CalculateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getCalculateAssignment_4()); 

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
    // $ANTLR end "rule__MLRegression__Group__4__Impl"


    // $ANTLR start "rule__MLRegression__Group__5"
    // InternalMLRegression.g:1164:1: rule__MLRegression__Group__5 : rule__MLRegression__Group__5__Impl ;
    public final void rule__MLRegression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1168:1: ( rule__MLRegression__Group__5__Impl )
            // InternalMLRegression.g:1169:2: rule__MLRegression__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__5__Impl();

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
    // $ANTLR end "rule__MLRegression__Group__5"


    // $ANTLR start "rule__MLRegression__Group__5__Impl"
    // InternalMLRegression.g:1175:1: rule__MLRegression__Group__5__Impl : ( ( rule__MLRegression__LoopAssignment_5 )? ) ;
    public final void rule__MLRegression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1179:1: ( ( ( rule__MLRegression__LoopAssignment_5 )? ) )
            // InternalMLRegression.g:1180:1: ( ( rule__MLRegression__LoopAssignment_5 )? )
            {
            // InternalMLRegression.g:1180:1: ( ( rule__MLRegression__LoopAssignment_5 )? )
            // InternalMLRegression.g:1181:2: ( rule__MLRegression__LoopAssignment_5 )?
            {
             before(grammarAccess.getMLRegressionAccess().getLoopAssignment_5()); 
            // InternalMLRegression.g:1182:2: ( rule__MLRegression__LoopAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMLRegression.g:1182:3: rule__MLRegression__LoopAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLRegression__LoopAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMLRegressionAccess().getLoopAssignment_5()); 

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
    // $ANTLR end "rule__MLRegression__Group__5__Impl"


    // $ANTLR start "rule__Dataset__Group__0"
    // InternalMLRegression.g:1191:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1195:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMLRegression.g:1196:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1203:1: rule__Dataset__Group__0__Impl : ( 'import' ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1207:1: ( ( 'import' ) )
            // InternalMLRegression.g:1208:1: ( 'import' )
            {
            // InternalMLRegression.g:1208:1: ( 'import' )
            // InternalMLRegression.g:1209:2: 'import'
            {
             before(grammarAccess.getDatasetAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getImportKeyword_0()); 

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
    // InternalMLRegression.g:1218:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1222:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMLRegression.g:1223:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:1230:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__DataPathAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1234:1: ( ( ( rule__Dataset__DataPathAssignment_1 ) ) )
            // InternalMLRegression.g:1235:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            {
            // InternalMLRegression.g:1235:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            // InternalMLRegression.g:1236:2: ( rule__Dataset__DataPathAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getDataPathAssignment_1()); 
            // InternalMLRegression.g:1237:2: ( rule__Dataset__DataPathAssignment_1 )
            // InternalMLRegression.g:1237:3: rule__Dataset__DataPathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__DataPathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasetAccess().getDataPathAssignment_1()); 

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
    // InternalMLRegression.g:1245:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl rule__Dataset__Group__3 ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1249:1: ( rule__Dataset__Group__2__Impl rule__Dataset__Group__3 )
            // InternalMLRegression.g:1250:2: rule__Dataset__Group__2__Impl rule__Dataset__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Dataset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dataset__Group__3();

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
    // InternalMLRegression.g:1257:1: rule__Dataset__Group__2__Impl : ( ( rule__Dataset__SeparatorAssignment_2 )? ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1261:1: ( ( ( rule__Dataset__SeparatorAssignment_2 )? ) )
            // InternalMLRegression.g:1262:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            {
            // InternalMLRegression.g:1262:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            // InternalMLRegression.g:1263:2: ( rule__Dataset__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getDatasetAccess().getSeparatorAssignment_2()); 
            // InternalMLRegression.g:1264:2: ( rule__Dataset__SeparatorAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMLRegression.g:1264:3: rule__Dataset__SeparatorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dataset__SeparatorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatasetAccess().getSeparatorAssignment_2()); 

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


    // $ANTLR start "rule__Dataset__Group__3"
    // InternalMLRegression.g:1272:1: rule__Dataset__Group__3 : rule__Dataset__Group__3__Impl ;
    public final void rule__Dataset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1276:1: ( rule__Dataset__Group__3__Impl )
            // InternalMLRegression.g:1277:2: rule__Dataset__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dataset__Group__3__Impl();

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
    // $ANTLR end "rule__Dataset__Group__3"


    // $ANTLR start "rule__Dataset__Group__3__Impl"
    // InternalMLRegression.g:1283:1: rule__Dataset__Group__3__Impl : ( ';' ) ;
    public final void rule__Dataset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1287:1: ( ( ';' ) )
            // InternalMLRegression.g:1288:1: ( ';' )
            {
            // InternalMLRegression.g:1288:1: ( ';' )
            // InternalMLRegression.g:1289:2: ';'
            {
             before(grammarAccess.getDatasetAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Dataset__Group__3__Impl"


    // $ANTLR start "rule__Variables__Group__0"
    // InternalMLRegression.g:1299:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1303:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalMLRegression.g:1304:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:1311:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__PredictivesAssignment_0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1315:1: ( ( ( rule__Variables__PredictivesAssignment_0 ) ) )
            // InternalMLRegression.g:1316:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            {
            // InternalMLRegression.g:1316:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            // InternalMLRegression.g:1317:2: ( rule__Variables__PredictivesAssignment_0 )
            {
             before(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 
            // InternalMLRegression.g:1318:2: ( rule__Variables__PredictivesAssignment_0 )
            // InternalMLRegression.g:1318:3: rule__Variables__PredictivesAssignment_0
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
    // InternalMLRegression.g:1326:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1330:1: ( rule__Variables__Group__1__Impl )
            // InternalMLRegression.g:1331:2: rule__Variables__Group__1__Impl
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
    // InternalMLRegression.g:1337:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__TargetsAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1341:1: ( ( ( rule__Variables__TargetsAssignment_1 ) ) )
            // InternalMLRegression.g:1342:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            {
            // InternalMLRegression.g:1342:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            // InternalMLRegression.g:1343:2: ( rule__Variables__TargetsAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 
            // InternalMLRegression.g:1344:2: ( rule__Variables__TargetsAssignment_1 )
            // InternalMLRegression.g:1344:3: rule__Variables__TargetsAssignment_1
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


    // $ANTLR start "rule__PredictiveVars__Group__0"
    // InternalMLRegression.g:1353:1: rule__PredictiveVars__Group__0 : rule__PredictiveVars__Group__0__Impl rule__PredictiveVars__Group__1 ;
    public final void rule__PredictiveVars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1357:1: ( rule__PredictiveVars__Group__0__Impl rule__PredictiveVars__Group__1 )
            // InternalMLRegression.g:1358:2: rule__PredictiveVars__Group__0__Impl rule__PredictiveVars__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PredictiveVars__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__1();

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
    // $ANTLR end "rule__PredictiveVars__Group__0"


    // $ANTLR start "rule__PredictiveVars__Group__0__Impl"
    // InternalMLRegression.g:1365:1: rule__PredictiveVars__Group__0__Impl : ( 'predictive_vars' ) ;
    public final void rule__PredictiveVars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1369:1: ( ( 'predictive_vars' ) )
            // InternalMLRegression.g:1370:1: ( 'predictive_vars' )
            {
            // InternalMLRegression.g:1370:1: ( 'predictive_vars' )
            // InternalMLRegression.g:1371:2: 'predictive_vars'
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredictive_varsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getPredictive_varsKeyword_0()); 

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
    // $ANTLR end "rule__PredictiveVars__Group__0__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__1"
    // InternalMLRegression.g:1380:1: rule__PredictiveVars__Group__1 : rule__PredictiveVars__Group__1__Impl rule__PredictiveVars__Group__2 ;
    public final void rule__PredictiveVars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1384:1: ( rule__PredictiveVars__Group__1__Impl rule__PredictiveVars__Group__2 )
            // InternalMLRegression.g:1385:2: rule__PredictiveVars__Group__1__Impl rule__PredictiveVars__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PredictiveVars__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__2();

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
    // $ANTLR end "rule__PredictiveVars__Group__1"


    // $ANTLR start "rule__PredictiveVars__Group__1__Impl"
    // InternalMLRegression.g:1392:1: rule__PredictiveVars__Group__1__Impl : ( ':' ) ;
    public final void rule__PredictiveVars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1396:1: ( ( ':' ) )
            // InternalMLRegression.g:1397:1: ( ':' )
            {
            // InternalMLRegression.g:1397:1: ( ':' )
            // InternalMLRegression.g:1398:2: ':'
            {
             before(grammarAccess.getPredictiveVarsAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__PredictiveVars__Group__1__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__2"
    // InternalMLRegression.g:1407:1: rule__PredictiveVars__Group__2 : rule__PredictiveVars__Group__2__Impl rule__PredictiveVars__Group__3 ;
    public final void rule__PredictiveVars__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1411:1: ( rule__PredictiveVars__Group__2__Impl rule__PredictiveVars__Group__3 )
            // InternalMLRegression.g:1412:2: rule__PredictiveVars__Group__2__Impl rule__PredictiveVars__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__PredictiveVars__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__3();

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
    // $ANTLR end "rule__PredictiveVars__Group__2"


    // $ANTLR start "rule__PredictiveVars__Group__2__Impl"
    // InternalMLRegression.g:1419:1: rule__PredictiveVars__Group__2__Impl : ( ( rule__PredictiveVars__PredVarAssignment_2 ) ) ;
    public final void rule__PredictiveVars__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1423:1: ( ( ( rule__PredictiveVars__PredVarAssignment_2 ) ) )
            // InternalMLRegression.g:1424:1: ( ( rule__PredictiveVars__PredVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1424:1: ( ( rule__PredictiveVars__PredVarAssignment_2 ) )
            // InternalMLRegression.g:1425:2: ( rule__PredictiveVars__PredVarAssignment_2 )
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredVarAssignment_2()); 
            // InternalMLRegression.g:1426:2: ( rule__PredictiveVars__PredVarAssignment_2 )
            // InternalMLRegression.g:1426:3: rule__PredictiveVars__PredVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__PredVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveVarsAccess().getPredVarAssignment_2()); 

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
    // $ANTLR end "rule__PredictiveVars__Group__2__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__3"
    // InternalMLRegression.g:1434:1: rule__PredictiveVars__Group__3 : rule__PredictiveVars__Group__3__Impl rule__PredictiveVars__Group__4 ;
    public final void rule__PredictiveVars__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1438:1: ( rule__PredictiveVars__Group__3__Impl rule__PredictiveVars__Group__4 )
            // InternalMLRegression.g:1439:2: rule__PredictiveVars__Group__3__Impl rule__PredictiveVars__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__PredictiveVars__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__4();

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
    // $ANTLR end "rule__PredictiveVars__Group__3"


    // $ANTLR start "rule__PredictiveVars__Group__3__Impl"
    // InternalMLRegression.g:1446:1: rule__PredictiveVars__Group__3__Impl : ( ( rule__PredictiveVars__Group_3__0 )* ) ;
    public final void rule__PredictiveVars__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1450:1: ( ( ( rule__PredictiveVars__Group_3__0 )* ) )
            // InternalMLRegression.g:1451:1: ( ( rule__PredictiveVars__Group_3__0 )* )
            {
            // InternalMLRegression.g:1451:1: ( ( rule__PredictiveVars__Group_3__0 )* )
            // InternalMLRegression.g:1452:2: ( rule__PredictiveVars__Group_3__0 )*
            {
             before(grammarAccess.getPredictiveVarsAccess().getGroup_3()); 
            // InternalMLRegression.g:1453:2: ( rule__PredictiveVars__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMLRegression.g:1453:3: rule__PredictiveVars__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PredictiveVars__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPredictiveVarsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PredictiveVars__Group__3__Impl"


    // $ANTLR start "rule__PredictiveVars__Group__4"
    // InternalMLRegression.g:1461:1: rule__PredictiveVars__Group__4 : rule__PredictiveVars__Group__4__Impl ;
    public final void rule__PredictiveVars__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1465:1: ( rule__PredictiveVars__Group__4__Impl )
            // InternalMLRegression.g:1466:2: rule__PredictiveVars__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group__4__Impl();

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
    // $ANTLR end "rule__PredictiveVars__Group__4"


    // $ANTLR start "rule__PredictiveVars__Group__4__Impl"
    // InternalMLRegression.g:1472:1: rule__PredictiveVars__Group__4__Impl : ( ';' ) ;
    public final void rule__PredictiveVars__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1476:1: ( ( ';' ) )
            // InternalMLRegression.g:1477:1: ( ';' )
            {
            // InternalMLRegression.g:1477:1: ( ';' )
            // InternalMLRegression.g:1478:2: ';'
            {
             before(grammarAccess.getPredictiveVarsAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__PredictiveVars__Group__4__Impl"


    // $ANTLR start "rule__PredictiveVars__Group_3__0"
    // InternalMLRegression.g:1488:1: rule__PredictiveVars__Group_3__0 : rule__PredictiveVars__Group_3__0__Impl rule__PredictiveVars__Group_3__1 ;
    public final void rule__PredictiveVars__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1492:1: ( rule__PredictiveVars__Group_3__0__Impl rule__PredictiveVars__Group_3__1 )
            // InternalMLRegression.g:1493:2: rule__PredictiveVars__Group_3__0__Impl rule__PredictiveVars__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__PredictiveVars__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group_3__1();

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
    // $ANTLR end "rule__PredictiveVars__Group_3__0"


    // $ANTLR start "rule__PredictiveVars__Group_3__0__Impl"
    // InternalMLRegression.g:1500:1: rule__PredictiveVars__Group_3__0__Impl : ( ',' ) ;
    public final void rule__PredictiveVars__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1504:1: ( ( ',' ) )
            // InternalMLRegression.g:1505:1: ( ',' )
            {
            // InternalMLRegression.g:1505:1: ( ',' )
            // InternalMLRegression.g:1506:2: ','
            {
             before(grammarAccess.getPredictiveVarsAccess().getCommaKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__PredictiveVars__Group_3__0__Impl"


    // $ANTLR start "rule__PredictiveVars__Group_3__1"
    // InternalMLRegression.g:1515:1: rule__PredictiveVars__Group_3__1 : rule__PredictiveVars__Group_3__1__Impl ;
    public final void rule__PredictiveVars__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1519:1: ( rule__PredictiveVars__Group_3__1__Impl )
            // InternalMLRegression.g:1520:2: rule__PredictiveVars__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__Group_3__1__Impl();

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
    // $ANTLR end "rule__PredictiveVars__Group_3__1"


    // $ANTLR start "rule__PredictiveVars__Group_3__1__Impl"
    // InternalMLRegression.g:1526:1: rule__PredictiveVars__Group_3__1__Impl : ( ( rule__PredictiveVars__PredVarAssignment_3_1 ) ) ;
    public final void rule__PredictiveVars__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1530:1: ( ( ( rule__PredictiveVars__PredVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1531:1: ( ( rule__PredictiveVars__PredVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1531:1: ( ( rule__PredictiveVars__PredVarAssignment_3_1 ) )
            // InternalMLRegression.g:1532:2: ( rule__PredictiveVars__PredVarAssignment_3_1 )
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredVarAssignment_3_1()); 
            // InternalMLRegression.g:1533:2: ( rule__PredictiveVars__PredVarAssignment_3_1 )
            // InternalMLRegression.g:1533:3: rule__PredictiveVars__PredVarAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveVars__PredVarAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveVarsAccess().getPredVarAssignment_3_1()); 

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
    // $ANTLR end "rule__PredictiveVars__Group_3__1__Impl"


    // $ANTLR start "rule__TargetVars__Group__0"
    // InternalMLRegression.g:1542:1: rule__TargetVars__Group__0 : rule__TargetVars__Group__0__Impl rule__TargetVars__Group__1 ;
    public final void rule__TargetVars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1546:1: ( rule__TargetVars__Group__0__Impl rule__TargetVars__Group__1 )
            // InternalMLRegression.g:1547:2: rule__TargetVars__Group__0__Impl rule__TargetVars__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TargetVars__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVars__Group__1();

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
    // $ANTLR end "rule__TargetVars__Group__0"


    // $ANTLR start "rule__TargetVars__Group__0__Impl"
    // InternalMLRegression.g:1554:1: rule__TargetVars__Group__0__Impl : ( 'target_vars' ) ;
    public final void rule__TargetVars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1558:1: ( ( 'target_vars' ) )
            // InternalMLRegression.g:1559:1: ( 'target_vars' )
            {
            // InternalMLRegression.g:1559:1: ( 'target_vars' )
            // InternalMLRegression.g:1560:2: 'target_vars'
            {
             before(grammarAccess.getTargetVarsAccess().getTarget_varsKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTargetVarsAccess().getTarget_varsKeyword_0()); 

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
    // $ANTLR end "rule__TargetVars__Group__0__Impl"


    // $ANTLR start "rule__TargetVars__Group__1"
    // InternalMLRegression.g:1569:1: rule__TargetVars__Group__1 : rule__TargetVars__Group__1__Impl rule__TargetVars__Group__2 ;
    public final void rule__TargetVars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1573:1: ( rule__TargetVars__Group__1__Impl rule__TargetVars__Group__2 )
            // InternalMLRegression.g:1574:2: rule__TargetVars__Group__1__Impl rule__TargetVars__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__TargetVars__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVars__Group__2();

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
    // $ANTLR end "rule__TargetVars__Group__1"


    // $ANTLR start "rule__TargetVars__Group__1__Impl"
    // InternalMLRegression.g:1581:1: rule__TargetVars__Group__1__Impl : ( ':' ) ;
    public final void rule__TargetVars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1585:1: ( ( ':' ) )
            // InternalMLRegression.g:1586:1: ( ':' )
            {
            // InternalMLRegression.g:1586:1: ( ':' )
            // InternalMLRegression.g:1587:2: ':'
            {
             before(grammarAccess.getTargetVarsAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTargetVarsAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__TargetVars__Group__1__Impl"


    // $ANTLR start "rule__TargetVars__Group__2"
    // InternalMLRegression.g:1596:1: rule__TargetVars__Group__2 : rule__TargetVars__Group__2__Impl rule__TargetVars__Group__3 ;
    public final void rule__TargetVars__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1600:1: ( rule__TargetVars__Group__2__Impl rule__TargetVars__Group__3 )
            // InternalMLRegression.g:1601:2: rule__TargetVars__Group__2__Impl rule__TargetVars__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TargetVars__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVars__Group__3();

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
    // $ANTLR end "rule__TargetVars__Group__2"


    // $ANTLR start "rule__TargetVars__Group__2__Impl"
    // InternalMLRegression.g:1608:1: rule__TargetVars__Group__2__Impl : ( ( rule__TargetVars__TargetVarAssignment_2 ) ) ;
    public final void rule__TargetVars__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1612:1: ( ( ( rule__TargetVars__TargetVarAssignment_2 ) ) )
            // InternalMLRegression.g:1613:1: ( ( rule__TargetVars__TargetVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1613:1: ( ( rule__TargetVars__TargetVarAssignment_2 ) )
            // InternalMLRegression.g:1614:2: ( rule__TargetVars__TargetVarAssignment_2 )
            {
             before(grammarAccess.getTargetVarsAccess().getTargetVarAssignment_2()); 
            // InternalMLRegression.g:1615:2: ( rule__TargetVars__TargetVarAssignment_2 )
            // InternalMLRegression.g:1615:3: rule__TargetVars__TargetVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetVars__TargetVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarsAccess().getTargetVarAssignment_2()); 

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
    // $ANTLR end "rule__TargetVars__Group__2__Impl"


    // $ANTLR start "rule__TargetVars__Group__3"
    // InternalMLRegression.g:1623:1: rule__TargetVars__Group__3 : rule__TargetVars__Group__3__Impl rule__TargetVars__Group__4 ;
    public final void rule__TargetVars__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1627:1: ( rule__TargetVars__Group__3__Impl rule__TargetVars__Group__4 )
            // InternalMLRegression.g:1628:2: rule__TargetVars__Group__3__Impl rule__TargetVars__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__TargetVars__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVars__Group__4();

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
    // $ANTLR end "rule__TargetVars__Group__3"


    // $ANTLR start "rule__TargetVars__Group__3__Impl"
    // InternalMLRegression.g:1635:1: rule__TargetVars__Group__3__Impl : ( ( rule__TargetVars__Group_3__0 )* ) ;
    public final void rule__TargetVars__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1639:1: ( ( ( rule__TargetVars__Group_3__0 )* ) )
            // InternalMLRegression.g:1640:1: ( ( rule__TargetVars__Group_3__0 )* )
            {
            // InternalMLRegression.g:1640:1: ( ( rule__TargetVars__Group_3__0 )* )
            // InternalMLRegression.g:1641:2: ( rule__TargetVars__Group_3__0 )*
            {
             before(grammarAccess.getTargetVarsAccess().getGroup_3()); 
            // InternalMLRegression.g:1642:2: ( rule__TargetVars__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMLRegression.g:1642:3: rule__TargetVars__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TargetVars__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTargetVarsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TargetVars__Group__3__Impl"


    // $ANTLR start "rule__TargetVars__Group__4"
    // InternalMLRegression.g:1650:1: rule__TargetVars__Group__4 : rule__TargetVars__Group__4__Impl ;
    public final void rule__TargetVars__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1654:1: ( rule__TargetVars__Group__4__Impl )
            // InternalMLRegression.g:1655:2: rule__TargetVars__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetVars__Group__4__Impl();

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
    // $ANTLR end "rule__TargetVars__Group__4"


    // $ANTLR start "rule__TargetVars__Group__4__Impl"
    // InternalMLRegression.g:1661:1: rule__TargetVars__Group__4__Impl : ( ';' ) ;
    public final void rule__TargetVars__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1665:1: ( ( ';' ) )
            // InternalMLRegression.g:1666:1: ( ';' )
            {
            // InternalMLRegression.g:1666:1: ( ';' )
            // InternalMLRegression.g:1667:2: ';'
            {
             before(grammarAccess.getTargetVarsAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTargetVarsAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__TargetVars__Group__4__Impl"


    // $ANTLR start "rule__TargetVars__Group_3__0"
    // InternalMLRegression.g:1677:1: rule__TargetVars__Group_3__0 : rule__TargetVars__Group_3__0__Impl rule__TargetVars__Group_3__1 ;
    public final void rule__TargetVars__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1681:1: ( rule__TargetVars__Group_3__0__Impl rule__TargetVars__Group_3__1 )
            // InternalMLRegression.g:1682:2: rule__TargetVars__Group_3__0__Impl rule__TargetVars__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__TargetVars__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVars__Group_3__1();

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
    // $ANTLR end "rule__TargetVars__Group_3__0"


    // $ANTLR start "rule__TargetVars__Group_3__0__Impl"
    // InternalMLRegression.g:1689:1: rule__TargetVars__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TargetVars__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1693:1: ( ( ',' ) )
            // InternalMLRegression.g:1694:1: ( ',' )
            {
            // InternalMLRegression.g:1694:1: ( ',' )
            // InternalMLRegression.g:1695:2: ','
            {
             before(grammarAccess.getTargetVarsAccess().getCommaKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTargetVarsAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__TargetVars__Group_3__0__Impl"


    // $ANTLR start "rule__TargetVars__Group_3__1"
    // InternalMLRegression.g:1704:1: rule__TargetVars__Group_3__1 : rule__TargetVars__Group_3__1__Impl ;
    public final void rule__TargetVars__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1708:1: ( rule__TargetVars__Group_3__1__Impl )
            // InternalMLRegression.g:1709:2: rule__TargetVars__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetVars__Group_3__1__Impl();

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
    // $ANTLR end "rule__TargetVars__Group_3__1"


    // $ANTLR start "rule__TargetVars__Group_3__1__Impl"
    // InternalMLRegression.g:1715:1: rule__TargetVars__Group_3__1__Impl : ( ( rule__TargetVars__TargetVarAssignment_3_1 ) ) ;
    public final void rule__TargetVars__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1719:1: ( ( ( rule__TargetVars__TargetVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1720:1: ( ( rule__TargetVars__TargetVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1720:1: ( ( rule__TargetVars__TargetVarAssignment_3_1 ) )
            // InternalMLRegression.g:1721:2: ( rule__TargetVars__TargetVarAssignment_3_1 )
            {
             before(grammarAccess.getTargetVarsAccess().getTargetVarAssignment_3_1()); 
            // InternalMLRegression.g:1722:2: ( rule__TargetVars__TargetVarAssignment_3_1 )
            // InternalMLRegression.g:1722:3: rule__TargetVars__TargetVarAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetVars__TargetVarAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarsAccess().getTargetVarAssignment_3_1()); 

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
    // $ANTLR end "rule__TargetVars__Group_3__1__Impl"


    // $ANTLR start "rule__Partition__Group__0"
    // InternalMLRegression.g:1731:1: rule__Partition__Group__0 : rule__Partition__Group__0__Impl rule__Partition__Group__1 ;
    public final void rule__Partition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1735:1: ( rule__Partition__Group__0__Impl rule__Partition__Group__1 )
            // InternalMLRegression.g:1736:2: rule__Partition__Group__0__Impl rule__Partition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Partition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partition__Group__1();

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
    // $ANTLR end "rule__Partition__Group__0"


    // $ANTLR start "rule__Partition__Group__0__Impl"
    // InternalMLRegression.g:1743:1: rule__Partition__Group__0__Impl : ( 'partition' ) ;
    public final void rule__Partition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1747:1: ( ( 'partition' ) )
            // InternalMLRegression.g:1748:1: ( 'partition' )
            {
            // InternalMLRegression.g:1748:1: ( 'partition' )
            // InternalMLRegression.g:1749:2: 'partition'
            {
             before(grammarAccess.getPartitionAccess().getPartitionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPartitionAccess().getPartitionKeyword_0()); 

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
    // $ANTLR end "rule__Partition__Group__0__Impl"


    // $ANTLR start "rule__Partition__Group__1"
    // InternalMLRegression.g:1758:1: rule__Partition__Group__1 : rule__Partition__Group__1__Impl rule__Partition__Group__2 ;
    public final void rule__Partition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1762:1: ( rule__Partition__Group__1__Impl rule__Partition__Group__2 )
            // InternalMLRegression.g:1763:2: rule__Partition__Group__1__Impl rule__Partition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Partition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partition__Group__2();

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
    // $ANTLR end "rule__Partition__Group__1"


    // $ANTLR start "rule__Partition__Group__1__Impl"
    // InternalMLRegression.g:1770:1: rule__Partition__Group__1__Impl : ( ':' ) ;
    public final void rule__Partition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1774:1: ( ( ':' ) )
            // InternalMLRegression.g:1775:1: ( ':' )
            {
            // InternalMLRegression.g:1775:1: ( ':' )
            // InternalMLRegression.g:1776:2: ':'
            {
             before(grammarAccess.getPartitionAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPartitionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Partition__Group__1__Impl"


    // $ANTLR start "rule__Partition__Group__2"
    // InternalMLRegression.g:1785:1: rule__Partition__Group__2 : rule__Partition__Group__2__Impl rule__Partition__Group__3 ;
    public final void rule__Partition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1789:1: ( rule__Partition__Group__2__Impl rule__Partition__Group__3 )
            // InternalMLRegression.g:1790:2: rule__Partition__Group__2__Impl rule__Partition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Partition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partition__Group__3();

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
    // $ANTLR end "rule__Partition__Group__2"


    // $ANTLR start "rule__Partition__Group__2__Impl"
    // InternalMLRegression.g:1797:1: rule__Partition__Group__2__Impl : ( ( rule__Partition__TestAssignment_2 ) ) ;
    public final void rule__Partition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1801:1: ( ( ( rule__Partition__TestAssignment_2 ) ) )
            // InternalMLRegression.g:1802:1: ( ( rule__Partition__TestAssignment_2 ) )
            {
            // InternalMLRegression.g:1802:1: ( ( rule__Partition__TestAssignment_2 ) )
            // InternalMLRegression.g:1803:2: ( rule__Partition__TestAssignment_2 )
            {
             before(grammarAccess.getPartitionAccess().getTestAssignment_2()); 
            // InternalMLRegression.g:1804:2: ( rule__Partition__TestAssignment_2 )
            // InternalMLRegression.g:1804:3: rule__Partition__TestAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Partition__TestAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartitionAccess().getTestAssignment_2()); 

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
    // $ANTLR end "rule__Partition__Group__2__Impl"


    // $ANTLR start "rule__Partition__Group__3"
    // InternalMLRegression.g:1812:1: rule__Partition__Group__3 : rule__Partition__Group__3__Impl ;
    public final void rule__Partition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1816:1: ( rule__Partition__Group__3__Impl )
            // InternalMLRegression.g:1817:2: rule__Partition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Partition__Group__3__Impl();

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
    // $ANTLR end "rule__Partition__Group__3"


    // $ANTLR start "rule__Partition__Group__3__Impl"
    // InternalMLRegression.g:1823:1: rule__Partition__Group__3__Impl : ( ';' ) ;
    public final void rule__Partition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1827:1: ( ( ';' ) )
            // InternalMLRegression.g:1828:1: ( ';' )
            {
            // InternalMLRegression.g:1828:1: ( ';' )
            // InternalMLRegression.g:1829:2: ';'
            {
             before(grammarAccess.getPartitionAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPartitionAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Partition__Group__3__Impl"


    // $ANTLR start "rule__CrossValidation__Group__0"
    // InternalMLRegression.g:1839:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1843:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMLRegression.g:1844:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CrossValidation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__1();

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
    // $ANTLR end "rule__CrossValidation__Group__0"


    // $ANTLR start "rule__CrossValidation__Group__0__Impl"
    // InternalMLRegression.g:1851:1: rule__CrossValidation__Group__0__Impl : ( 'cross_validation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1855:1: ( ( 'cross_validation' ) )
            // InternalMLRegression.g:1856:1: ( 'cross_validation' )
            {
            // InternalMLRegression.g:1856:1: ( 'cross_validation' )
            // InternalMLRegression.g:1857:2: 'cross_validation'
            {
             before(grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0()); 

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
    // $ANTLR end "rule__CrossValidation__Group__0__Impl"


    // $ANTLR start "rule__CrossValidation__Group__1"
    // InternalMLRegression.g:1866:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1870:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMLRegression.g:1871:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CrossValidation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__2();

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
    // $ANTLR end "rule__CrossValidation__Group__1"


    // $ANTLR start "rule__CrossValidation__Group__1__Impl"
    // InternalMLRegression.g:1878:1: rule__CrossValidation__Group__1__Impl : ( ':' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1882:1: ( ( ':' ) )
            // InternalMLRegression.g:1883:1: ( ':' )
            {
            // InternalMLRegression.g:1883:1: ( ':' )
            // InternalMLRegression.g:1884:2: ':'
            {
             before(grammarAccess.getCrossValidationAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__CrossValidation__Group__1__Impl"


    // $ANTLR start "rule__CrossValidation__Group__2"
    // InternalMLRegression.g:1893:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1897:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMLRegression.g:1898:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CrossValidation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__3();

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
    // $ANTLR end "rule__CrossValidation__Group__2"


    // $ANTLR start "rule__CrossValidation__Group__2__Impl"
    // InternalMLRegression.g:1905:1: rule__CrossValidation__Group__2__Impl : ( ( rule__CrossValidation__KAssignment_2 ) ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1909:1: ( ( ( rule__CrossValidation__KAssignment_2 ) ) )
            // InternalMLRegression.g:1910:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            {
            // InternalMLRegression.g:1910:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            // InternalMLRegression.g:1911:2: ( rule__CrossValidation__KAssignment_2 )
            {
             before(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 
            // InternalMLRegression.g:1912:2: ( rule__CrossValidation__KAssignment_2 )
            // InternalMLRegression.g:1912:3: rule__CrossValidation__KAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__KAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 

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
    // $ANTLR end "rule__CrossValidation__Group__2__Impl"


    // $ANTLR start "rule__CrossValidation__Group__3"
    // InternalMLRegression.g:1920:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1924:1: ( rule__CrossValidation__Group__3__Impl )
            // InternalMLRegression.g:1925:2: rule__CrossValidation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__3__Impl();

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
    // $ANTLR end "rule__CrossValidation__Group__3"


    // $ANTLR start "rule__CrossValidation__Group__3__Impl"
    // InternalMLRegression.g:1931:1: rule__CrossValidation__Group__3__Impl : ( ';' ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1935:1: ( ( ';' ) )
            // InternalMLRegression.g:1936:1: ( ';' )
            {
            // InternalMLRegression.g:1936:1: ( ';' )
            // InternalMLRegression.g:1937:2: ';'
            {
             before(grammarAccess.getCrossValidationAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__CrossValidation__Group__3__Impl"


    // $ANTLR start "rule__Algo__Group__0"
    // InternalMLRegression.g:1947:1: rule__Algo__Group__0 : rule__Algo__Group__0__Impl rule__Algo__Group__1 ;
    public final void rule__Algo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1951:1: ( rule__Algo__Group__0__Impl rule__Algo__Group__1 )
            // InternalMLRegression.g:1952:2: rule__Algo__Group__0__Impl rule__Algo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Algo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__1();

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
    // $ANTLR end "rule__Algo__Group__0"


    // $ANTLR start "rule__Algo__Group__0__Impl"
    // InternalMLRegression.g:1959:1: rule__Algo__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1963:1: ( ( 'algorithm' ) )
            // InternalMLRegression.g:1964:1: ( 'algorithm' )
            {
            // InternalMLRegression.g:1964:1: ( 'algorithm' )
            // InternalMLRegression.g:1965:2: 'algorithm'
            {
             before(grammarAccess.getAlgoAccess().getAlgorithmKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getAlgorithmKeyword_0()); 

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
    // $ANTLR end "rule__Algo__Group__0__Impl"


    // $ANTLR start "rule__Algo__Group__1"
    // InternalMLRegression.g:1974:1: rule__Algo__Group__1 : rule__Algo__Group__1__Impl rule__Algo__Group__2 ;
    public final void rule__Algo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1978:1: ( rule__Algo__Group__1__Impl rule__Algo__Group__2 )
            // InternalMLRegression.g:1979:2: rule__Algo__Group__1__Impl rule__Algo__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Algo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__2();

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
    // $ANTLR end "rule__Algo__Group__1"


    // $ANTLR start "rule__Algo__Group__1__Impl"
    // InternalMLRegression.g:1986:1: rule__Algo__Group__1__Impl : ( ':' ) ;
    public final void rule__Algo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1990:1: ( ( ':' ) )
            // InternalMLRegression.g:1991:1: ( ':' )
            {
            // InternalMLRegression.g:1991:1: ( ':' )
            // InternalMLRegression.g:1992:2: ':'
            {
             before(grammarAccess.getAlgoAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Algo__Group__1__Impl"


    // $ANTLR start "rule__Algo__Group__2"
    // InternalMLRegression.g:2001:1: rule__Algo__Group__2 : rule__Algo__Group__2__Impl rule__Algo__Group__3 ;
    public final void rule__Algo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2005:1: ( rule__Algo__Group__2__Impl rule__Algo__Group__3 )
            // InternalMLRegression.g:2006:2: rule__Algo__Group__2__Impl rule__Algo__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Algo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__3();

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
    // $ANTLR end "rule__Algo__Group__2"


    // $ANTLR start "rule__Algo__Group__2__Impl"
    // InternalMLRegression.g:2013:1: rule__Algo__Group__2__Impl : ( ( rule__Algo__AlgoAssignment_2 ) ) ;
    public final void rule__Algo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2017:1: ( ( ( rule__Algo__AlgoAssignment_2 ) ) )
            // InternalMLRegression.g:2018:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            {
            // InternalMLRegression.g:2018:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            // InternalMLRegression.g:2019:2: ( rule__Algo__AlgoAssignment_2 )
            {
             before(grammarAccess.getAlgoAccess().getAlgoAssignment_2()); 
            // InternalMLRegression.g:2020:2: ( rule__Algo__AlgoAssignment_2 )
            // InternalMLRegression.g:2020:3: rule__Algo__AlgoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Algo__AlgoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlgoAccess().getAlgoAssignment_2()); 

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
    // $ANTLR end "rule__Algo__Group__2__Impl"


    // $ANTLR start "rule__Algo__Group__3"
    // InternalMLRegression.g:2028:1: rule__Algo__Group__3 : rule__Algo__Group__3__Impl ;
    public final void rule__Algo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2032:1: ( rule__Algo__Group__3__Impl )
            // InternalMLRegression.g:2033:2: rule__Algo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algo__Group__3__Impl();

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
    // $ANTLR end "rule__Algo__Group__3"


    // $ANTLR start "rule__Algo__Group__3__Impl"
    // InternalMLRegression.g:2039:1: rule__Algo__Group__3__Impl : ( ';' ) ;
    public final void rule__Algo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2043:1: ( ( ';' ) )
            // InternalMLRegression.g:2044:1: ( ';' )
            {
            // InternalMLRegression.g:2044:1: ( ';' )
            // InternalMLRegression.g:2045:2: ';'
            {
             before(grammarAccess.getAlgoAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Algo__Group__3__Impl"


    // $ANTLR start "rule__Calculate__Group__0"
    // InternalMLRegression.g:2055:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2059:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalMLRegression.g:2060:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Calculate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculate__Group__1();

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
    // $ANTLR end "rule__Calculate__Group__0"


    // $ANTLR start "rule__Calculate__Group__0__Impl"
    // InternalMLRegression.g:2067:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2071:1: ( ( 'calculate' ) )
            // InternalMLRegression.g:2072:1: ( 'calculate' )
            {
            // InternalMLRegression.g:2072:1: ( 'calculate' )
            // InternalMLRegression.g:2073:2: 'calculate'
            {
             before(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 

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
    // $ANTLR end "rule__Calculate__Group__0__Impl"


    // $ANTLR start "rule__Calculate__Group__1"
    // InternalMLRegression.g:2082:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2086:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalMLRegression.g:2087:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Calculate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculate__Group__2();

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
    // $ANTLR end "rule__Calculate__Group__1"


    // $ANTLR start "rule__Calculate__Group__1__Impl"
    // InternalMLRegression.g:2094:1: rule__Calculate__Group__1__Impl : ( ':' ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2098:1: ( ( ':' ) )
            // InternalMLRegression.g:2099:1: ( ':' )
            {
            // InternalMLRegression.g:2099:1: ( ':' )
            // InternalMLRegression.g:2100:2: ':'
            {
             before(grammarAccess.getCalculateAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCalculateAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Calculate__Group__1__Impl"


    // $ANTLR start "rule__Calculate__Group__2"
    // InternalMLRegression.g:2109:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2113:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalMLRegression.g:2114:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Calculate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculate__Group__3();

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
    // $ANTLR end "rule__Calculate__Group__2"


    // $ANTLR start "rule__Calculate__Group__2__Impl"
    // InternalMLRegression.g:2121:1: rule__Calculate__Group__2__Impl : ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2125:1: ( ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) )
            // InternalMLRegression.g:2126:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            {
            // InternalMLRegression.g:2126:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            // InternalMLRegression.g:2127:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            {
             before(grammarAccess.getCalculateAccess().getCalculateTypeAssignment_2()); 
            // InternalMLRegression.g:2128:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            // InternalMLRegression.g:2128:3: rule__Calculate__CalculateTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__CalculateTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCalculateAccess().getCalculateTypeAssignment_2()); 

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
    // $ANTLR end "rule__Calculate__Group__2__Impl"


    // $ANTLR start "rule__Calculate__Group__3"
    // InternalMLRegression.g:2136:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2140:1: ( rule__Calculate__Group__3__Impl )
            // InternalMLRegression.g:2141:2: rule__Calculate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__3__Impl();

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
    // $ANTLR end "rule__Calculate__Group__3"


    // $ANTLR start "rule__Calculate__Group__3__Impl"
    // InternalMLRegression.g:2147:1: rule__Calculate__Group__3__Impl : ( ';' ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2151:1: ( ( ';' ) )
            // InternalMLRegression.g:2152:1: ( ';' )
            {
            // InternalMLRegression.g:2152:1: ( ';' )
            // InternalMLRegression.g:2153:2: ';'
            {
             before(grammarAccess.getCalculateAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCalculateAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Calculate__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalMLRegression.g:2163:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2167:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMLRegression.g:2168:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

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
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalMLRegression.g:2175:1: rule__Loop__Group__0__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2179:1: ( ( 'Loop' ) )
            // InternalMLRegression.g:2180:1: ( 'Loop' )
            {
            // InternalMLRegression.g:2180:1: ( 'Loop' )
            // InternalMLRegression.g:2181:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_0()); 

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
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalMLRegression.g:2190:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2194:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalMLRegression.g:2195:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

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
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalMLRegression.g:2202:1: rule__Loop__Group__1__Impl : ( ':' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2206:1: ( ( ':' ) )
            // InternalMLRegression.g:2207:1: ( ':' )
            {
            // InternalMLRegression.g:2207:1: ( ':' )
            // InternalMLRegression.g:2208:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalMLRegression.g:2217:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2221:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalMLRegression.g:2222:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

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
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalMLRegression.g:2229:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__IAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2233:1: ( ( ( rule__Loop__IAssignment_2 ) ) )
            // InternalMLRegression.g:2234:1: ( ( rule__Loop__IAssignment_2 ) )
            {
            // InternalMLRegression.g:2234:1: ( ( rule__Loop__IAssignment_2 ) )
            // InternalMLRegression.g:2235:2: ( rule__Loop__IAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getIAssignment_2()); 
            // InternalMLRegression.g:2236:2: ( rule__Loop__IAssignment_2 )
            // InternalMLRegression.g:2236:3: rule__Loop__IAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__IAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getIAssignment_2()); 

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
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalMLRegression.g:2244:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2248:1: ( rule__Loop__Group__3__Impl )
            // InternalMLRegression.g:2249:2: rule__Loop__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__3__Impl();

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
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalMLRegression.g:2255:1: rule__Loop__Group__3__Impl : ( ';' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2259:1: ( ( ';' ) )
            // InternalMLRegression.g:2260:1: ( ';' )
            {
            // InternalMLRegression.g:2260:1: ( ';' )
            // InternalMLRegression.g:2261:2: ';'
            {
             before(grammarAccess.getLoopAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMLRegression.g:2271:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2275:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMLRegression.g:2276:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

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
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalMLRegression.g:2283:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__ValueAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2287:1: ( ( ( rule__FLOAT__ValueAssignment_0 ) ) )
            // InternalMLRegression.g:2288:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            {
            // InternalMLRegression.g:2288:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            // InternalMLRegression.g:2289:2: ( rule__FLOAT__ValueAssignment_0 )
            {
             before(grammarAccess.getFLOATAccess().getValueAssignment_0()); 
            // InternalMLRegression.g:2290:2: ( rule__FLOAT__ValueAssignment_0 )
            // InternalMLRegression.g:2290:3: rule__FLOAT__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalMLRegression.g:2298:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2302:1: ( rule__FLOAT__Group__1__Impl )
            // InternalMLRegression.g:2303:2: rule__FLOAT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1__Impl();

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
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalMLRegression.g:2309:1: rule__FLOAT__Group__1__Impl : ( ( rule__FLOAT__Group_1__0 )? ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2313:1: ( ( ( rule__FLOAT__Group_1__0 )? ) )
            // InternalMLRegression.g:2314:1: ( ( rule__FLOAT__Group_1__0 )? )
            {
            // InternalMLRegression.g:2314:1: ( ( rule__FLOAT__Group_1__0 )? )
            // InternalMLRegression.g:2315:2: ( rule__FLOAT__Group_1__0 )?
            {
             before(grammarAccess.getFLOATAccess().getGroup_1()); 
            // InternalMLRegression.g:2316:2: ( rule__FLOAT__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMLRegression.g:2316:3: rule__FLOAT__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FLOAT__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFLOATAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group_1__0"
    // InternalMLRegression.g:2325:1: rule__FLOAT__Group_1__0 : rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 ;
    public final void rule__FLOAT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2329:1: ( rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 )
            // InternalMLRegression.g:2330:2: rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__FLOAT__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group_1__1();

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
    // $ANTLR end "rule__FLOAT__Group_1__0"


    // $ANTLR start "rule__FLOAT__Group_1__0__Impl"
    // InternalMLRegression.g:2337:1: rule__FLOAT__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2341:1: ( ( '.' ) )
            // InternalMLRegression.g:2342:1: ( '.' )
            {
            // InternalMLRegression.g:2342:1: ( '.' )
            // InternalMLRegression.g:2343:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FLOAT__Group_1__0__Impl"


    // $ANTLR start "rule__FLOAT__Group_1__1"
    // InternalMLRegression.g:2352:1: rule__FLOAT__Group_1__1 : rule__FLOAT__Group_1__1__Impl ;
    public final void rule__FLOAT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2356:1: ( rule__FLOAT__Group_1__1__Impl )
            // InternalMLRegression.g:2357:2: rule__FLOAT__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group_1__1__Impl();

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
    // $ANTLR end "rule__FLOAT__Group_1__1"


    // $ANTLR start "rule__FLOAT__Group_1__1__Impl"
    // InternalMLRegression.g:2363:1: rule__FLOAT__Group_1__1__Impl : ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) ;
    public final void rule__FLOAT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2367:1: ( ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) )
            // InternalMLRegression.g:2368:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            {
            // InternalMLRegression.g:2368:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            // InternalMLRegression.g:2369:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getFLOATAccess().getDecimalAssignment_1_1()); 
            // InternalMLRegression.g:2370:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            // InternalMLRegression.g:2370:3: rule__FLOAT__DecimalAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__DecimalAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getDecimalAssignment_1_1()); 

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
    // $ANTLR end "rule__FLOAT__Group_1__1__Impl"


    // $ANTLR start "rule__PERCENT__Group__0"
    // InternalMLRegression.g:2379:1: rule__PERCENT__Group__0 : rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 ;
    public final void rule__PERCENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2383:1: ( rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 )
            // InternalMLRegression.g:2384:2: rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__PERCENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PERCENT__Group__1();

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
    // $ANTLR end "rule__PERCENT__Group__0"


    // $ANTLR start "rule__PERCENT__Group__0__Impl"
    // InternalMLRegression.g:2391:1: rule__PERCENT__Group__0__Impl : ( ( rule__PERCENT__FloatAssignment_0 ) ) ;
    public final void rule__PERCENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2395:1: ( ( ( rule__PERCENT__FloatAssignment_0 ) ) )
            // InternalMLRegression.g:2396:1: ( ( rule__PERCENT__FloatAssignment_0 ) )
            {
            // InternalMLRegression.g:2396:1: ( ( rule__PERCENT__FloatAssignment_0 ) )
            // InternalMLRegression.g:2397:2: ( rule__PERCENT__FloatAssignment_0 )
            {
             before(grammarAccess.getPERCENTAccess().getFloatAssignment_0()); 
            // InternalMLRegression.g:2398:2: ( rule__PERCENT__FloatAssignment_0 )
            // InternalMLRegression.g:2398:3: rule__PERCENT__FloatAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PERCENT__FloatAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPERCENTAccess().getFloatAssignment_0()); 

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
    // $ANTLR end "rule__PERCENT__Group__0__Impl"


    // $ANTLR start "rule__PERCENT__Group__1"
    // InternalMLRegression.g:2406:1: rule__PERCENT__Group__1 : rule__PERCENT__Group__1__Impl ;
    public final void rule__PERCENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2410:1: ( rule__PERCENT__Group__1__Impl )
            // InternalMLRegression.g:2411:2: rule__PERCENT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PERCENT__Group__1__Impl();

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
    // $ANTLR end "rule__PERCENT__Group__1"


    // $ANTLR start "rule__PERCENT__Group__1__Impl"
    // InternalMLRegression.g:2417:1: rule__PERCENT__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2421:1: ( ( '%' ) )
            // InternalMLRegression.g:2422:1: ( '%' )
            {
            // InternalMLRegression.g:2422:1: ( '%' )
            // InternalMLRegression.g:2423:2: '%'
            {
             before(grammarAccess.getPERCENTAccess().getPercentSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPERCENTAccess().getPercentSignKeyword_1()); 

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
    // $ANTLR end "rule__PERCENT__Group__1__Impl"


    // $ANTLR start "rule__Model__LanguageTargetAssignment_0"
    // InternalMLRegression.g:2433:1: rule__Model__LanguageTargetAssignment_0 : ( ruleLanguageTarget ) ;
    public final void rule__Model__LanguageTargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2437:1: ( ( ruleLanguageTarget ) )
            // InternalMLRegression.g:2438:2: ( ruleLanguageTarget )
            {
            // InternalMLRegression.g:2438:2: ( ruleLanguageTarget )
            // InternalMLRegression.g:2439:3: ruleLanguageTarget
            {
             before(grammarAccess.getModelAccess().getLanguageTargetLanguageTargetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageTarget();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLanguageTargetLanguageTargetParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__LanguageTargetAssignment_0"


    // $ANTLR start "rule__Model__MlAssignment_1"
    // InternalMLRegression.g:2448:1: rule__Model__MlAssignment_1 : ( ruleMLRegression ) ;
    public final void rule__Model__MlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2452:1: ( ( ruleMLRegression ) )
            // InternalMLRegression.g:2453:2: ( ruleMLRegression )
            {
            // InternalMLRegression.g:2453:2: ( ruleMLRegression )
            // InternalMLRegression.g:2454:3: ruleMLRegression
            {
             before(grammarAccess.getModelAccess().getMlMLRegressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMLRegression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMlMLRegressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__MlAssignment_1"


    // $ANTLR start "rule__LanguageTarget__LanguageAssignment_2"
    // InternalMLRegression.g:2463:1: rule__LanguageTarget__LanguageAssignment_2 : ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) ) ;
    public final void rule__LanguageTarget__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2467:1: ( ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) ) )
            // InternalMLRegression.g:2468:2: ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) )
            {
            // InternalMLRegression.g:2468:2: ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) )
            // InternalMLRegression.g:2469:3: ( rule__LanguageTarget__LanguageAlternatives_2_0 )
            {
             before(grammarAccess.getLanguageTargetAccess().getLanguageAlternatives_2_0()); 
            // InternalMLRegression.g:2470:3: ( rule__LanguageTarget__LanguageAlternatives_2_0 )
            // InternalMLRegression.g:2470:4: rule__LanguageTarget__LanguageAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageTarget__LanguageAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageTargetAccess().getLanguageAlternatives_2_0()); 

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
    // $ANTLR end "rule__LanguageTarget__LanguageAssignment_2"


    // $ANTLR start "rule__MLRegression__DatasetAssignment_0"
    // InternalMLRegression.g:2478:1: rule__MLRegression__DatasetAssignment_0 : ( ruleDataset ) ;
    public final void rule__MLRegression__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2482:1: ( ( ruleDataset ) )
            // InternalMLRegression.g:2483:2: ( ruleDataset )
            {
            // InternalMLRegression.g:2483:2: ( ruleDataset )
            // InternalMLRegression.g:2484:3: ruleDataset
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


    // $ANTLR start "rule__MLRegression__VarsAssignment_1"
    // InternalMLRegression.g:2493:1: rule__MLRegression__VarsAssignment_1 : ( ruleVariables ) ;
    public final void rule__MLRegression__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2497:1: ( ( ruleVariables ) )
            // InternalMLRegression.g:2498:2: ( ruleVariables )
            {
            // InternalMLRegression.g:2498:2: ( ruleVariables )
            // InternalMLRegression.g:2499:3: ruleVariables
            {
             before(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getVarsVariablesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MLRegression__VarsAssignment_1"


    // $ANTLR start "rule__MLRegression__EvaluationAssignment_2"
    // InternalMLRegression.g:2508:1: rule__MLRegression__EvaluationAssignment_2 : ( ruleEvaluationType ) ;
    public final void rule__MLRegression__EvaluationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2512:1: ( ( ruleEvaluationType ) )
            // InternalMLRegression.g:2513:2: ( ruleEvaluationType )
            {
            // InternalMLRegression.g:2513:2: ( ruleEvaluationType )
            // InternalMLRegression.g:2514:3: ruleEvaluationType
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationType();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MLRegression__EvaluationAssignment_2"


    // $ANTLR start "rule__MLRegression__AlgoAssignment_3"
    // InternalMLRegression.g:2523:1: rule__MLRegression__AlgoAssignment_3 : ( ruleAlgo ) ;
    public final void rule__MLRegression__AlgoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2527:1: ( ( ruleAlgo ) )
            // InternalMLRegression.g:2528:2: ( ruleAlgo )
            {
            // InternalMLRegression.g:2528:2: ( ruleAlgo )
            // InternalMLRegression.g:2529:3: ruleAlgo
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgo();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MLRegression__AlgoAssignment_3"


    // $ANTLR start "rule__MLRegression__CalculateAssignment_4"
    // InternalMLRegression.g:2538:1: rule__MLRegression__CalculateAssignment_4 : ( ruleCalculate ) ;
    public final void rule__MLRegression__CalculateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2542:1: ( ( ruleCalculate ) )
            // InternalMLRegression.g:2543:2: ( ruleCalculate )
            {
            // InternalMLRegression.g:2543:2: ( ruleCalculate )
            // InternalMLRegression.g:2544:3: ruleCalculate
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculate();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MLRegression__CalculateAssignment_4"


    // $ANTLR start "rule__MLRegression__LoopAssignment_5"
    // InternalMLRegression.g:2553:1: rule__MLRegression__LoopAssignment_5 : ( ruleLoop ) ;
    public final void rule__MLRegression__LoopAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2557:1: ( ( ruleLoop ) )
            // InternalMLRegression.g:2558:2: ( ruleLoop )
            {
            // InternalMLRegression.g:2558:2: ( ruleLoop )
            // InternalMLRegression.g:2559:3: ruleLoop
            {
             before(grammarAccess.getMLRegressionAccess().getLoopLoopParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getLoopLoopParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__MLRegression__LoopAssignment_5"


    // $ANTLR start "rule__Dataset__DataPathAssignment_1"
    // InternalMLRegression.g:2568:1: rule__Dataset__DataPathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Dataset__DataPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2572:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2573:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2573:2: ( RULE_STRING )
            // InternalMLRegression.g:2574:3: RULE_STRING
            {
             before(grammarAccess.getDatasetAccess().getDataPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getDataPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dataset__DataPathAssignment_1"


    // $ANTLR start "rule__Dataset__SeparatorAssignment_2"
    // InternalMLRegression.g:2583:1: rule__Dataset__SeparatorAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Dataset__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2587:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2588:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2588:2: ( RULE_STRING )
            // InternalMLRegression.g:2589:3: RULE_STRING
            {
             before(grammarAccess.getDatasetAccess().getSeparatorSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatasetAccess().getSeparatorSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Dataset__SeparatorAssignment_2"


    // $ANTLR start "rule__Variables__PredictivesAssignment_0"
    // InternalMLRegression.g:2598:1: rule__Variables__PredictivesAssignment_0 : ( rulePredictiveVars ) ;
    public final void rule__Variables__PredictivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2602:1: ( ( rulePredictiveVars ) )
            // InternalMLRegression.g:2603:2: ( rulePredictiveVars )
            {
            // InternalMLRegression.g:2603:2: ( rulePredictiveVars )
            // InternalMLRegression.g:2604:3: rulePredictiveVars
            {
             before(grammarAccess.getVariablesAccess().getPredictivesPredictiveVarsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredictiveVars();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getPredictivesPredictiveVarsParserRuleCall_0_0()); 

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
    // InternalMLRegression.g:2613:1: rule__Variables__TargetsAssignment_1 : ( ruleTargetVars ) ;
    public final void rule__Variables__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2617:1: ( ( ruleTargetVars ) )
            // InternalMLRegression.g:2618:2: ( ruleTargetVars )
            {
            // InternalMLRegression.g:2618:2: ( ruleTargetVars )
            // InternalMLRegression.g:2619:3: ruleTargetVars
            {
             before(grammarAccess.getVariablesAccess().getTargetsTargetVarsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetVars();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getTargetsTargetVarsParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__PredictiveVars__PredVarAssignment_2"
    // InternalMLRegression.g:2628:1: rule__PredictiveVars__PredVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PredictiveVars__PredVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2632:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2633:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2633:2: ( RULE_STRING )
            // InternalMLRegression.g:2634:3: RULE_STRING
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredVarSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getPredVarSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PredictiveVars__PredVarAssignment_2"


    // $ANTLR start "rule__PredictiveVars__PredVarAssignment_3_1"
    // InternalMLRegression.g:2643:1: rule__PredictiveVars__PredVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PredictiveVars__PredVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2647:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2648:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2648:2: ( RULE_STRING )
            // InternalMLRegression.g:2649:3: RULE_STRING
            {
             before(grammarAccess.getPredictiveVarsAccess().getPredVarSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPredictiveVarsAccess().getPredVarSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PredictiveVars__PredVarAssignment_3_1"


    // $ANTLR start "rule__TargetVars__TargetVarAssignment_2"
    // InternalMLRegression.g:2658:1: rule__TargetVars__TargetVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TargetVars__TargetVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2662:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2663:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2663:2: ( RULE_STRING )
            // InternalMLRegression.g:2664:3: RULE_STRING
            {
             before(grammarAccess.getTargetVarsAccess().getTargetVarSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetVarsAccess().getTargetVarSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TargetVars__TargetVarAssignment_2"


    // $ANTLR start "rule__TargetVars__TargetVarAssignment_3_1"
    // InternalMLRegression.g:2673:1: rule__TargetVars__TargetVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TargetVars__TargetVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2677:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2678:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2678:2: ( RULE_STRING )
            // InternalMLRegression.g:2679:3: RULE_STRING
            {
             before(grammarAccess.getTargetVarsAccess().getTargetVarSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetVarsAccess().getTargetVarSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TargetVars__TargetVarAssignment_3_1"


    // $ANTLR start "rule__Partition__TestAssignment_2"
    // InternalMLRegression.g:2688:1: rule__Partition__TestAssignment_2 : ( ruleNumericValue ) ;
    public final void rule__Partition__TestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2692:1: ( ( ruleNumericValue ) )
            // InternalMLRegression.g:2693:2: ( ruleNumericValue )
            {
            // InternalMLRegression.g:2693:2: ( ruleNumericValue )
            // InternalMLRegression.g:2694:3: ruleNumericValue
            {
             before(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericValue();

            state._fsp--;

             after(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Partition__TestAssignment_2"


    // $ANTLR start "rule__CrossValidation__KAssignment_2"
    // InternalMLRegression.g:2703:1: rule__CrossValidation__KAssignment_2 : ( RULE_INT ) ;
    public final void rule__CrossValidation__KAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2707:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2708:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2708:2: ( RULE_INT )
            // InternalMLRegression.g:2709:3: RULE_INT
            {
             before(grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getKINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CrossValidation__KAssignment_2"


    // $ANTLR start "rule__Algo__AlgoAssignment_2"
    // InternalMLRegression.g:2718:1: rule__Algo__AlgoAssignment_2 : ( ruleAlgoType ) ;
    public final void rule__Algo__AlgoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2722:1: ( ( ruleAlgoType ) )
            // InternalMLRegression.g:2723:2: ( ruleAlgoType )
            {
            // InternalMLRegression.g:2723:2: ( ruleAlgoType )
            // InternalMLRegression.g:2724:3: ruleAlgoType
            {
             before(grammarAccess.getAlgoAccess().getAlgoAlgoTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgoType();

            state._fsp--;

             after(grammarAccess.getAlgoAccess().getAlgoAlgoTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Algo__AlgoAssignment_2"


    // $ANTLR start "rule__Calculate__CalculateTypeAssignment_2"
    // InternalMLRegression.g:2733:1: rule__Calculate__CalculateTypeAssignment_2 : ( ruleCalculateType ) ;
    public final void rule__Calculate__CalculateTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2737:1: ( ( ruleCalculateType ) )
            // InternalMLRegression.g:2738:2: ( ruleCalculateType )
            {
            // InternalMLRegression.g:2738:2: ( ruleCalculateType )
            // InternalMLRegression.g:2739:3: ruleCalculateType
            {
             before(grammarAccess.getCalculateAccess().getCalculateTypeCalculateTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculateType();

            state._fsp--;

             after(grammarAccess.getCalculateAccess().getCalculateTypeCalculateTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Calculate__CalculateTypeAssignment_2"


    // $ANTLR start "rule__Loop__IAssignment_2"
    // InternalMLRegression.g:2748:1: rule__Loop__IAssignment_2 : ( RULE_INT ) ;
    public final void rule__Loop__IAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2752:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2753:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2753:2: ( RULE_INT )
            // InternalMLRegression.g:2754:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getIINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Loop__IAssignment_2"


    // $ANTLR start "rule__FLOAT__ValueAssignment_0"
    // InternalMLRegression.g:2763:1: rule__FLOAT__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2767:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2768:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2768:2: ( RULE_INT )
            // InternalMLRegression.g:2769:3: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getValueINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FLOAT__ValueAssignment_0"


    // $ANTLR start "rule__FLOAT__DecimalAssignment_1_1"
    // InternalMLRegression.g:2778:1: rule__FLOAT__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__FLOAT__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2782:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2783:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2783:2: ( RULE_INT )
            // InternalMLRegression.g:2784:3: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getDecimalINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getDecimalINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FLOAT__DecimalAssignment_1_1"


    // $ANTLR start "rule__PERCENT__FloatAssignment_0"
    // InternalMLRegression.g:2793:1: rule__PERCENT__FloatAssignment_0 : ( ruleFLOAT ) ;
    public final void rule__PERCENT__FloatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2797:1: ( ( ruleFLOAT ) )
            // InternalMLRegression.g:2798:2: ( ruleFLOAT )
            {
            // InternalMLRegression.g:2798:2: ( ruleFLOAT )
            // InternalMLRegression.g:2799:3: ruleFLOAT
            {
             before(grammarAccess.getPERCENTAccess().getFloatFLOATParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getPERCENTAccess().getFloatFLOATParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PERCENT__FloatAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000064000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});

}