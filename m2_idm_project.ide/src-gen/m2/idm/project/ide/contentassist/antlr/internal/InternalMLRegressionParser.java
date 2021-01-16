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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'line_regress'", "'decision_tree_regressor'", "'svr'", "'mean_absolute_error'", "'mean_squared_error'", "'median_absolute_error'", "'python'", "'Python'", "'PYTHON'", "'r'", "'R'", "'target_language'", "':'", "';'", "'import'", "'partition'", "'cross_validation'", "'predictive_vars'", "','", "'target_vars'", "'calculate'", "'algorithm'", "'.'", "'%'"
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


    // $ANTLR start "entryRuleEvaluationType"
    // InternalMLRegression.g:203:1: entryRuleEvaluationType : ruleEvaluationType EOF ;
    public final void entryRuleEvaluationType() throws RecognitionException {
        try {
            // InternalMLRegression.g:204:1: ( ruleEvaluationType EOF )
            // InternalMLRegression.g:205:1: ruleEvaluationType EOF
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
    // InternalMLRegression.g:212:1: ruleEvaluationType : ( ( rule__EvaluationType__Alternatives ) ) ;
    public final void ruleEvaluationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:216:2: ( ( ( rule__EvaluationType__Alternatives ) ) )
            // InternalMLRegression.g:217:2: ( ( rule__EvaluationType__Alternatives ) )
            {
            // InternalMLRegression.g:217:2: ( ( rule__EvaluationType__Alternatives ) )
            // InternalMLRegression.g:218:3: ( rule__EvaluationType__Alternatives )
            {
             before(grammarAccess.getEvaluationTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:219:3: ( rule__EvaluationType__Alternatives )
            // InternalMLRegression.g:219:4: rule__EvaluationType__Alternatives
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
    // InternalMLRegression.g:228:1: entryRulePartition : rulePartition EOF ;
    public final void entryRulePartition() throws RecognitionException {
        try {
            // InternalMLRegression.g:229:1: ( rulePartition EOF )
            // InternalMLRegression.g:230:1: rulePartition EOF
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
    // InternalMLRegression.g:237:1: rulePartition : ( ( rule__Partition__Group__0 ) ) ;
    public final void rulePartition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:241:2: ( ( ( rule__Partition__Group__0 ) ) )
            // InternalMLRegression.g:242:2: ( ( rule__Partition__Group__0 ) )
            {
            // InternalMLRegression.g:242:2: ( ( rule__Partition__Group__0 ) )
            // InternalMLRegression.g:243:3: ( rule__Partition__Group__0 )
            {
             before(grammarAccess.getPartitionAccess().getGroup()); 
            // InternalMLRegression.g:244:3: ( rule__Partition__Group__0 )
            // InternalMLRegression.g:244:4: rule__Partition__Group__0
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
    // InternalMLRegression.g:253:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMLRegression.g:254:1: ( ruleCrossValidation EOF )
            // InternalMLRegression.g:255:1: ruleCrossValidation EOF
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
    // InternalMLRegression.g:262:1: ruleCrossValidation : ( ( rule__CrossValidation__Group__0 ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:266:2: ( ( ( rule__CrossValidation__Group__0 ) ) )
            // InternalMLRegression.g:267:2: ( ( rule__CrossValidation__Group__0 ) )
            {
            // InternalMLRegression.g:267:2: ( ( rule__CrossValidation__Group__0 ) )
            // InternalMLRegression.g:268:3: ( rule__CrossValidation__Group__0 )
            {
             before(grammarAccess.getCrossValidationAccess().getGroup()); 
            // InternalMLRegression.g:269:3: ( rule__CrossValidation__Group__0 )
            // InternalMLRegression.g:269:4: rule__CrossValidation__Group__0
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


    // $ANTLR start "entryRuleVariables"
    // InternalMLRegression.g:278:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // InternalMLRegression.g:279:1: ( ruleVariables EOF )
            // InternalMLRegression.g:280:1: ruleVariables EOF
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
    // InternalMLRegression.g:287:1: ruleVariables : ( ( rule__Variables__Group__0 ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:291:2: ( ( ( rule__Variables__Group__0 ) ) )
            // InternalMLRegression.g:292:2: ( ( rule__Variables__Group__0 ) )
            {
            // InternalMLRegression.g:292:2: ( ( rule__Variables__Group__0 ) )
            // InternalMLRegression.g:293:3: ( rule__Variables__Group__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup()); 
            // InternalMLRegression.g:294:3: ( rule__Variables__Group__0 )
            // InternalMLRegression.g:294:4: rule__Variables__Group__0
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


    // $ANTLR start "entryRuleListePredictiveVar"
    // InternalMLRegression.g:303:1: entryRuleListePredictiveVar : ruleListePredictiveVar EOF ;
    public final void entryRuleListePredictiveVar() throws RecognitionException {
        try {
            // InternalMLRegression.g:304:1: ( ruleListePredictiveVar EOF )
            // InternalMLRegression.g:305:1: ruleListePredictiveVar EOF
            {
             before(grammarAccess.getListePredictiveVarRule()); 
            pushFollow(FOLLOW_1);
            ruleListePredictiveVar();

            state._fsp--;

             after(grammarAccess.getListePredictiveVarRule()); 
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
    // $ANTLR end "entryRuleListePredictiveVar"


    // $ANTLR start "ruleListePredictiveVar"
    // InternalMLRegression.g:312:1: ruleListePredictiveVar : ( ( rule__ListePredictiveVar__Group__0 ) ) ;
    public final void ruleListePredictiveVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:316:2: ( ( ( rule__ListePredictiveVar__Group__0 ) ) )
            // InternalMLRegression.g:317:2: ( ( rule__ListePredictiveVar__Group__0 ) )
            {
            // InternalMLRegression.g:317:2: ( ( rule__ListePredictiveVar__Group__0 ) )
            // InternalMLRegression.g:318:3: ( rule__ListePredictiveVar__Group__0 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup()); 
            // InternalMLRegression.g:319:3: ( rule__ListePredictiveVar__Group__0 )
            // InternalMLRegression.g:319:4: rule__ListePredictiveVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListePredictiveVarAccess().getGroup()); 

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
    // $ANTLR end "ruleListePredictiveVar"


    // $ANTLR start "entryRuleTargetVar"
    // InternalMLRegression.g:328:1: entryRuleTargetVar : ruleTargetVar EOF ;
    public final void entryRuleTargetVar() throws RecognitionException {
        try {
            // InternalMLRegression.g:329:1: ( ruleTargetVar EOF )
            // InternalMLRegression.g:330:1: ruleTargetVar EOF
            {
             before(grammarAccess.getTargetVarRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetVar();

            state._fsp--;

             after(grammarAccess.getTargetVarRule()); 
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
    // $ANTLR end "entryRuleTargetVar"


    // $ANTLR start "ruleTargetVar"
    // InternalMLRegression.g:337:1: ruleTargetVar : ( ( rule__TargetVar__Group__0 ) ) ;
    public final void ruleTargetVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:341:2: ( ( ( rule__TargetVar__Group__0 ) ) )
            // InternalMLRegression.g:342:2: ( ( rule__TargetVar__Group__0 ) )
            {
            // InternalMLRegression.g:342:2: ( ( rule__TargetVar__Group__0 ) )
            // InternalMLRegression.g:343:3: ( rule__TargetVar__Group__0 )
            {
             before(grammarAccess.getTargetVarAccess().getGroup()); 
            // InternalMLRegression.g:344:3: ( rule__TargetVar__Group__0 )
            // InternalMLRegression.g:344:4: rule__TargetVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getGroup()); 

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
    // $ANTLR end "ruleTargetVar"


    // $ANTLR start "entryRuleCalculate"
    // InternalMLRegression.g:353:1: entryRuleCalculate : ruleCalculate EOF ;
    public final void entryRuleCalculate() throws RecognitionException {
        try {
            // InternalMLRegression.g:354:1: ( ruleCalculate EOF )
            // InternalMLRegression.g:355:1: ruleCalculate EOF
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
    // InternalMLRegression.g:362:1: ruleCalculate : ( ( rule__Calculate__Group__0 ) ) ;
    public final void ruleCalculate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:366:2: ( ( ( rule__Calculate__Group__0 ) ) )
            // InternalMLRegression.g:367:2: ( ( rule__Calculate__Group__0 ) )
            {
            // InternalMLRegression.g:367:2: ( ( rule__Calculate__Group__0 ) )
            // InternalMLRegression.g:368:3: ( rule__Calculate__Group__0 )
            {
             before(grammarAccess.getCalculateAccess().getGroup()); 
            // InternalMLRegression.g:369:3: ( rule__Calculate__Group__0 )
            // InternalMLRegression.g:369:4: rule__Calculate__Group__0
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
    // InternalMLRegression.g:378:1: entryRuleCalculateType : ruleCalculateType EOF ;
    public final void entryRuleCalculateType() throws RecognitionException {
        try {
            // InternalMLRegression.g:379:1: ( ruleCalculateType EOF )
            // InternalMLRegression.g:380:1: ruleCalculateType EOF
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
    // InternalMLRegression.g:387:1: ruleCalculateType : ( ( rule__CalculateType__Alternatives ) ) ;
    public final void ruleCalculateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:391:2: ( ( ( rule__CalculateType__Alternatives ) ) )
            // InternalMLRegression.g:392:2: ( ( rule__CalculateType__Alternatives ) )
            {
            // InternalMLRegression.g:392:2: ( ( rule__CalculateType__Alternatives ) )
            // InternalMLRegression.g:393:3: ( rule__CalculateType__Alternatives )
            {
             before(grammarAccess.getCalculateTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:394:3: ( rule__CalculateType__Alternatives )
            // InternalMLRegression.g:394:4: rule__CalculateType__Alternatives
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


    // $ANTLR start "entryRuleAlgo"
    // InternalMLRegression.g:403:1: entryRuleAlgo : ruleAlgo EOF ;
    public final void entryRuleAlgo() throws RecognitionException {
        try {
            // InternalMLRegression.g:404:1: ( ruleAlgo EOF )
            // InternalMLRegression.g:405:1: ruleAlgo EOF
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
    // InternalMLRegression.g:412:1: ruleAlgo : ( ( rule__Algo__Group__0 ) ) ;
    public final void ruleAlgo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:416:2: ( ( ( rule__Algo__Group__0 ) ) )
            // InternalMLRegression.g:417:2: ( ( rule__Algo__Group__0 ) )
            {
            // InternalMLRegression.g:417:2: ( ( rule__Algo__Group__0 ) )
            // InternalMLRegression.g:418:3: ( rule__Algo__Group__0 )
            {
             before(grammarAccess.getAlgoAccess().getGroup()); 
            // InternalMLRegression.g:419:3: ( rule__Algo__Group__0 )
            // InternalMLRegression.g:419:4: rule__Algo__Group__0
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
    // InternalMLRegression.g:428:1: entryRuleAlgoType : ruleAlgoType EOF ;
    public final void entryRuleAlgoType() throws RecognitionException {
        try {
            // InternalMLRegression.g:429:1: ( ruleAlgoType EOF )
            // InternalMLRegression.g:430:1: ruleAlgoType EOF
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
    // InternalMLRegression.g:437:1: ruleAlgoType : ( ( rule__AlgoType__Alternatives ) ) ;
    public final void ruleAlgoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:441:2: ( ( ( rule__AlgoType__Alternatives ) ) )
            // InternalMLRegression.g:442:2: ( ( rule__AlgoType__Alternatives ) )
            {
            // InternalMLRegression.g:442:2: ( ( rule__AlgoType__Alternatives ) )
            // InternalMLRegression.g:443:3: ( rule__AlgoType__Alternatives )
            {
             before(grammarAccess.getAlgoTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:444:3: ( rule__AlgoType__Alternatives )
            // InternalMLRegression.g:444:4: rule__AlgoType__Alternatives
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
    // InternalMLRegression.g:453:1: entryRuleLineRegress : ruleLineRegress EOF ;
    public final void entryRuleLineRegress() throws RecognitionException {
        try {
            // InternalMLRegression.g:454:1: ( ruleLineRegress EOF )
            // InternalMLRegression.g:455:1: ruleLineRegress EOF
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
    // InternalMLRegression.g:462:1: ruleLineRegress : ( 'line_regress' ) ;
    public final void ruleLineRegress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:466:2: ( ( 'line_regress' ) )
            // InternalMLRegression.g:467:2: ( 'line_regress' )
            {
            // InternalMLRegression.g:467:2: ( 'line_regress' )
            // InternalMLRegression.g:468:3: 'line_regress'
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
    // InternalMLRegression.g:478:1: entryRuleDecisionTreeRegressor : ruleDecisionTreeRegressor EOF ;
    public final void entryRuleDecisionTreeRegressor() throws RecognitionException {
        try {
            // InternalMLRegression.g:479:1: ( ruleDecisionTreeRegressor EOF )
            // InternalMLRegression.g:480:1: ruleDecisionTreeRegressor EOF
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
    // InternalMLRegression.g:487:1: ruleDecisionTreeRegressor : ( 'decision_tree_regressor' ) ;
    public final void ruleDecisionTreeRegressor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:491:2: ( ( 'decision_tree_regressor' ) )
            // InternalMLRegression.g:492:2: ( 'decision_tree_regressor' )
            {
            // InternalMLRegression.g:492:2: ( 'decision_tree_regressor' )
            // InternalMLRegression.g:493:3: 'decision_tree_regressor'
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
    // InternalMLRegression.g:503:1: entryRuleSVR : ruleSVR EOF ;
    public final void entryRuleSVR() throws RecognitionException {
        try {
            // InternalMLRegression.g:504:1: ( ruleSVR EOF )
            // InternalMLRegression.g:505:1: ruleSVR EOF
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
    // InternalMLRegression.g:512:1: ruleSVR : ( 'svr' ) ;
    public final void ruleSVR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:516:2: ( ( 'svr' ) )
            // InternalMLRegression.g:517:2: ( 'svr' )
            {
            // InternalMLRegression.g:517:2: ( 'svr' )
            // InternalMLRegression.g:518:3: 'svr'
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


    // $ANTLR start "entryRuleNumericValue"
    // InternalMLRegression.g:603:1: entryRuleNumericValue : ruleNumericValue EOF ;
    public final void entryRuleNumericValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:604:1: ( ruleNumericValue EOF )
            // InternalMLRegression.g:605:1: ruleNumericValue EOF
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
    // InternalMLRegression.g:612:1: ruleNumericValue : ( ( rule__NumericValue__Alternatives ) ) ;
    public final void ruleNumericValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:616:2: ( ( ( rule__NumericValue__Alternatives ) ) )
            // InternalMLRegression.g:617:2: ( ( rule__NumericValue__Alternatives ) )
            {
            // InternalMLRegression.g:617:2: ( ( rule__NumericValue__Alternatives ) )
            // InternalMLRegression.g:618:3: ( rule__NumericValue__Alternatives )
            {
             before(grammarAccess.getNumericValueAccess().getAlternatives()); 
            // InternalMLRegression.g:619:3: ( rule__NumericValue__Alternatives )
            // InternalMLRegression.g:619:4: rule__NumericValue__Alternatives
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
    // InternalMLRegression.g:628:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMLRegression.g:629:1: ( ruleFLOAT EOF )
            // InternalMLRegression.g:630:1: ruleFLOAT EOF
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
    // InternalMLRegression.g:637:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:641:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMLRegression.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMLRegression.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMLRegression.g:643:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMLRegression.g:644:3: ( rule__FLOAT__Group__0 )
            // InternalMLRegression.g:644:4: rule__FLOAT__Group__0
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
    // InternalMLRegression.g:653:1: entryRulePERCENT : rulePERCENT EOF ;
    public final void entryRulePERCENT() throws RecognitionException {
        try {
            // InternalMLRegression.g:654:1: ( rulePERCENT EOF )
            // InternalMLRegression.g:655:1: rulePERCENT EOF
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
    // InternalMLRegression.g:662:1: rulePERCENT : ( ( rule__PERCENT__Group__0 ) ) ;
    public final void rulePERCENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:666:2: ( ( ( rule__PERCENT__Group__0 ) ) )
            // InternalMLRegression.g:667:2: ( ( rule__PERCENT__Group__0 ) )
            {
            // InternalMLRegression.g:667:2: ( ( rule__PERCENT__Group__0 ) )
            // InternalMLRegression.g:668:3: ( rule__PERCENT__Group__0 )
            {
             before(grammarAccess.getPERCENTAccess().getGroup()); 
            // InternalMLRegression.g:669:3: ( rule__PERCENT__Group__0 )
            // InternalMLRegression.g:669:4: rule__PERCENT__Group__0
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
    // InternalMLRegression.g:677:1: rule__LanguageTarget__LanguageAlternatives_2_0 : ( ( rulePython ) | ( ruleR ) );
    public final void rule__LanguageTarget__LanguageAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:681:1: ( ( rulePython ) | ( ruleR ) )
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
                    // InternalMLRegression.g:682:2: ( rulePython )
                    {
                    // InternalMLRegression.g:682:2: ( rulePython )
                    // InternalMLRegression.g:683:3: rulePython
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
                    // InternalMLRegression.g:688:2: ( ruleR )
                    {
                    // InternalMLRegression.g:688:2: ( ruleR )
                    // InternalMLRegression.g:689:3: ruleR
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
    // InternalMLRegression.g:698:1: rule__Python__Alternatives : ( ( 'python' ) | ( 'Python' ) | ( 'PYTHON' ) );
    public final void rule__Python__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:702:1: ( ( 'python' ) | ( 'Python' ) | ( 'PYTHON' ) )
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
                    // InternalMLRegression.g:703:2: ( 'python' )
                    {
                    // InternalMLRegression.g:703:2: ( 'python' )
                    // InternalMLRegression.g:704:3: 'python'
                    {
                     before(grammarAccess.getPythonAccess().getPythonKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPythonAccess().getPythonKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:709:2: ( 'Python' )
                    {
                    // InternalMLRegression.g:709:2: ( 'Python' )
                    // InternalMLRegression.g:710:3: 'Python'
                    {
                     before(grammarAccess.getPythonAccess().getPythonKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPythonAccess().getPythonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:715:2: ( 'PYTHON' )
                    {
                    // InternalMLRegression.g:715:2: ( 'PYTHON' )
                    // InternalMLRegression.g:716:3: 'PYTHON'
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
    // InternalMLRegression.g:725:1: rule__R__Alternatives : ( ( 'r' ) | ( 'R' ) );
    public final void rule__R__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:729:1: ( ( 'r' ) | ( 'R' ) )
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
                    // InternalMLRegression.g:730:2: ( 'r' )
                    {
                    // InternalMLRegression.g:730:2: ( 'r' )
                    // InternalMLRegression.g:731:3: 'r'
                    {
                     before(grammarAccess.getRAccess().getRKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getRAccess().getRKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:736:2: ( 'R' )
                    {
                    // InternalMLRegression.g:736:2: ( 'R' )
                    // InternalMLRegression.g:737:3: 'R'
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
    // InternalMLRegression.g:746:1: rule__EvaluationType__Alternatives : ( ( rulePartition ) | ( ruleCrossValidation ) );
    public final void rule__EvaluationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:750:1: ( ( rulePartition ) | ( ruleCrossValidation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:751:2: ( rulePartition )
                    {
                    // InternalMLRegression.g:751:2: ( rulePartition )
                    // InternalMLRegression.g:752:3: rulePartition
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
                    // InternalMLRegression.g:757:2: ( ruleCrossValidation )
                    {
                    // InternalMLRegression.g:757:2: ( ruleCrossValidation )
                    // InternalMLRegression.g:758:3: ruleCrossValidation
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


    // $ANTLR start "rule__CalculateType__Alternatives"
    // InternalMLRegression.g:767:1: rule__CalculateType__Alternatives : ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) );
    public final void rule__CalculateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:771:1: ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
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
                    // InternalMLRegression.g:772:2: ( ruleMeanAbsoluteError )
                    {
                    // InternalMLRegression.g:772:2: ( ruleMeanAbsoluteError )
                    // InternalMLRegression.g:773:3: ruleMeanAbsoluteError
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
                    // InternalMLRegression.g:778:2: ( ruleMeanSquaredError )
                    {
                    // InternalMLRegression.g:778:2: ( ruleMeanSquaredError )
                    // InternalMLRegression.g:779:3: ruleMeanSquaredError
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
                    // InternalMLRegression.g:784:2: ( ruleMedianAbsoluteError )
                    {
                    // InternalMLRegression.g:784:2: ( ruleMedianAbsoluteError )
                    // InternalMLRegression.g:785:3: ruleMedianAbsoluteError
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


    // $ANTLR start "rule__AlgoType__Alternatives"
    // InternalMLRegression.g:794:1: rule__AlgoType__Alternatives : ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) );
    public final void rule__AlgoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:798:1: ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 12:
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
                    // InternalMLRegression.g:799:2: ( ruleLineRegress )
                    {
                    // InternalMLRegression.g:799:2: ( ruleLineRegress )
                    // InternalMLRegression.g:800:3: ruleLineRegress
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
                    // InternalMLRegression.g:805:2: ( ruleSVR )
                    {
                    // InternalMLRegression.g:805:2: ( ruleSVR )
                    // InternalMLRegression.g:806:3: ruleSVR
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
                    // InternalMLRegression.g:811:2: ( ruleDecisionTreeRegressor )
                    {
                    // InternalMLRegression.g:811:2: ( ruleDecisionTreeRegressor )
                    // InternalMLRegression.g:812:3: ruleDecisionTreeRegressor
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


    // $ANTLR start "rule__NumericValue__Alternatives"
    // InternalMLRegression.g:821:1: rule__NumericValue__Alternatives : ( ( ruleFLOAT ) | ( rulePERCENT ) );
    public final void rule__NumericValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:825:1: ( ( ruleFLOAT ) | ( rulePERCENT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_INT) ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5==34) ) {
                            alt7=2;
                        }
                        else if ( (LA7_5==EOF||LA7_5==24) ) {
                            alt7=1;
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
                case 34:
                    {
                    alt7=2;
                    }
                    break;
                case EOF:
                case 24:
                    {
                    alt7=1;
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
                    // InternalMLRegression.g:826:2: ( ruleFLOAT )
                    {
                    // InternalMLRegression.g:826:2: ( ruleFLOAT )
                    // InternalMLRegression.g:827:3: ruleFLOAT
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
                    // InternalMLRegression.g:832:2: ( rulePERCENT )
                    {
                    // InternalMLRegression.g:832:2: ( rulePERCENT )
                    // InternalMLRegression.g:833:3: rulePERCENT
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
    // InternalMLRegression.g:842:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:846:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMLRegression.g:847:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMLRegression.g:854:1: rule__Model__Group__0__Impl : ( ( rule__Model__LanguageTargetAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:858:1: ( ( ( rule__Model__LanguageTargetAssignment_0 )? ) )
            // InternalMLRegression.g:859:1: ( ( rule__Model__LanguageTargetAssignment_0 )? )
            {
            // InternalMLRegression.g:859:1: ( ( rule__Model__LanguageTargetAssignment_0 )? )
            // InternalMLRegression.g:860:2: ( rule__Model__LanguageTargetAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getLanguageTargetAssignment_0()); 
            // InternalMLRegression.g:861:2: ( rule__Model__LanguageTargetAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMLRegression.g:861:3: rule__Model__LanguageTargetAssignment_0
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
    // InternalMLRegression.g:869:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:873:1: ( rule__Model__Group__1__Impl )
            // InternalMLRegression.g:874:2: rule__Model__Group__1__Impl
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
    // InternalMLRegression.g:880:1: rule__Model__Group__1__Impl : ( ( rule__Model__MlAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:884:1: ( ( ( rule__Model__MlAssignment_1 ) ) )
            // InternalMLRegression.g:885:1: ( ( rule__Model__MlAssignment_1 ) )
            {
            // InternalMLRegression.g:885:1: ( ( rule__Model__MlAssignment_1 ) )
            // InternalMLRegression.g:886:2: ( rule__Model__MlAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getMlAssignment_1()); 
            // InternalMLRegression.g:887:2: ( rule__Model__MlAssignment_1 )
            // InternalMLRegression.g:887:3: rule__Model__MlAssignment_1
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
    // InternalMLRegression.g:896:1: rule__LanguageTarget__Group__0 : rule__LanguageTarget__Group__0__Impl rule__LanguageTarget__Group__1 ;
    public final void rule__LanguageTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:900:1: ( rule__LanguageTarget__Group__0__Impl rule__LanguageTarget__Group__1 )
            // InternalMLRegression.g:901:2: rule__LanguageTarget__Group__0__Impl rule__LanguageTarget__Group__1
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
    // InternalMLRegression.g:908:1: rule__LanguageTarget__Group__0__Impl : ( 'target_language' ) ;
    public final void rule__LanguageTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:912:1: ( ( 'target_language' ) )
            // InternalMLRegression.g:913:1: ( 'target_language' )
            {
            // InternalMLRegression.g:913:1: ( 'target_language' )
            // InternalMLRegression.g:914:2: 'target_language'
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
    // InternalMLRegression.g:923:1: rule__LanguageTarget__Group__1 : rule__LanguageTarget__Group__1__Impl rule__LanguageTarget__Group__2 ;
    public final void rule__LanguageTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:927:1: ( rule__LanguageTarget__Group__1__Impl rule__LanguageTarget__Group__2 )
            // InternalMLRegression.g:928:2: rule__LanguageTarget__Group__1__Impl rule__LanguageTarget__Group__2
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
    // InternalMLRegression.g:935:1: rule__LanguageTarget__Group__1__Impl : ( ':' ) ;
    public final void rule__LanguageTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:939:1: ( ( ':' ) )
            // InternalMLRegression.g:940:1: ( ':' )
            {
            // InternalMLRegression.g:940:1: ( ':' )
            // InternalMLRegression.g:941:2: ':'
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
    // InternalMLRegression.g:950:1: rule__LanguageTarget__Group__2 : rule__LanguageTarget__Group__2__Impl rule__LanguageTarget__Group__3 ;
    public final void rule__LanguageTarget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:954:1: ( rule__LanguageTarget__Group__2__Impl rule__LanguageTarget__Group__3 )
            // InternalMLRegression.g:955:2: rule__LanguageTarget__Group__2__Impl rule__LanguageTarget__Group__3
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
    // InternalMLRegression.g:962:1: rule__LanguageTarget__Group__2__Impl : ( ( rule__LanguageTarget__LanguageAssignment_2 ) ) ;
    public final void rule__LanguageTarget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:966:1: ( ( ( rule__LanguageTarget__LanguageAssignment_2 ) ) )
            // InternalMLRegression.g:967:1: ( ( rule__LanguageTarget__LanguageAssignment_2 ) )
            {
            // InternalMLRegression.g:967:1: ( ( rule__LanguageTarget__LanguageAssignment_2 ) )
            // InternalMLRegression.g:968:2: ( rule__LanguageTarget__LanguageAssignment_2 )
            {
             before(grammarAccess.getLanguageTargetAccess().getLanguageAssignment_2()); 
            // InternalMLRegression.g:969:2: ( rule__LanguageTarget__LanguageAssignment_2 )
            // InternalMLRegression.g:969:3: rule__LanguageTarget__LanguageAssignment_2
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
    // InternalMLRegression.g:977:1: rule__LanguageTarget__Group__3 : rule__LanguageTarget__Group__3__Impl ;
    public final void rule__LanguageTarget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:981:1: ( rule__LanguageTarget__Group__3__Impl )
            // InternalMLRegression.g:982:2: rule__LanguageTarget__Group__3__Impl
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
    // InternalMLRegression.g:988:1: rule__LanguageTarget__Group__3__Impl : ( ';' ) ;
    public final void rule__LanguageTarget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:992:1: ( ( ';' ) )
            // InternalMLRegression.g:993:1: ( ';' )
            {
            // InternalMLRegression.g:993:1: ( ';' )
            // InternalMLRegression.g:994:2: ';'
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
    // InternalMLRegression.g:1004:1: rule__MLRegression__Group__0 : rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 ;
    public final void rule__MLRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1008:1: ( rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 )
            // InternalMLRegression.g:1009:2: rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1
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
    // InternalMLRegression.g:1016:1: rule__MLRegression__Group__0__Impl : ( ( rule__MLRegression__DatasetAssignment_0 ) ) ;
    public final void rule__MLRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1020:1: ( ( ( rule__MLRegression__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:1021:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:1021:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            // InternalMLRegression.g:1022:2: ( rule__MLRegression__DatasetAssignment_0 )
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:1023:2: ( rule__MLRegression__DatasetAssignment_0 )
            // InternalMLRegression.g:1023:3: rule__MLRegression__DatasetAssignment_0
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
    // InternalMLRegression.g:1031:1: rule__MLRegression__Group__1 : rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 ;
    public final void rule__MLRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1035:1: ( rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 )
            // InternalMLRegression.g:1036:2: rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2
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
    // InternalMLRegression.g:1043:1: rule__MLRegression__Group__1__Impl : ( ( rule__MLRegression__VarsAssignment_1 )? ) ;
    public final void rule__MLRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1047:1: ( ( ( rule__MLRegression__VarsAssignment_1 )? ) )
            // InternalMLRegression.g:1048:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            {
            // InternalMLRegression.g:1048:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            // InternalMLRegression.g:1049:2: ( rule__MLRegression__VarsAssignment_1 )?
            {
             before(grammarAccess.getMLRegressionAccess().getVarsAssignment_1()); 
            // InternalMLRegression.g:1050:2: ( rule__MLRegression__VarsAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMLRegression.g:1050:3: rule__MLRegression__VarsAssignment_1
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
    // InternalMLRegression.g:1058:1: rule__MLRegression__Group__2 : rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 ;
    public final void rule__MLRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1062:1: ( rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 )
            // InternalMLRegression.g:1063:2: rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3
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
    // InternalMLRegression.g:1070:1: rule__MLRegression__Group__2__Impl : ( ( rule__MLRegression__EvaluationAssignment_2 ) ) ;
    public final void rule__MLRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1074:1: ( ( ( rule__MLRegression__EvaluationAssignment_2 ) ) )
            // InternalMLRegression.g:1075:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            {
            // InternalMLRegression.g:1075:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            // InternalMLRegression.g:1076:2: ( rule__MLRegression__EvaluationAssignment_2 )
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_2()); 
            // InternalMLRegression.g:1077:2: ( rule__MLRegression__EvaluationAssignment_2 )
            // InternalMLRegression.g:1077:3: rule__MLRegression__EvaluationAssignment_2
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
    // InternalMLRegression.g:1085:1: rule__MLRegression__Group__3 : rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 ;
    public final void rule__MLRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1089:1: ( rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 )
            // InternalMLRegression.g:1090:2: rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4
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
    // InternalMLRegression.g:1097:1: rule__MLRegression__Group__3__Impl : ( ( rule__MLRegression__AlgoAssignment_3 ) ) ;
    public final void rule__MLRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1101:1: ( ( ( rule__MLRegression__AlgoAssignment_3 ) ) )
            // InternalMLRegression.g:1102:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            {
            // InternalMLRegression.g:1102:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            // InternalMLRegression.g:1103:2: ( rule__MLRegression__AlgoAssignment_3 )
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAssignment_3()); 
            // InternalMLRegression.g:1104:2: ( rule__MLRegression__AlgoAssignment_3 )
            // InternalMLRegression.g:1104:3: rule__MLRegression__AlgoAssignment_3
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
    // InternalMLRegression.g:1112:1: rule__MLRegression__Group__4 : rule__MLRegression__Group__4__Impl ;
    public final void rule__MLRegression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1116:1: ( rule__MLRegression__Group__4__Impl )
            // InternalMLRegression.g:1117:2: rule__MLRegression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__Group__4__Impl();

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
    // InternalMLRegression.g:1123:1: rule__MLRegression__Group__4__Impl : ( ( rule__MLRegression__CalculateAssignment_4 ) ) ;
    public final void rule__MLRegression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1127:1: ( ( ( rule__MLRegression__CalculateAssignment_4 ) ) )
            // InternalMLRegression.g:1128:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            {
            // InternalMLRegression.g:1128:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            // InternalMLRegression.g:1129:2: ( rule__MLRegression__CalculateAssignment_4 )
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateAssignment_4()); 
            // InternalMLRegression.g:1130:2: ( rule__MLRegression__CalculateAssignment_4 )
            // InternalMLRegression.g:1130:3: rule__MLRegression__CalculateAssignment_4
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


    // $ANTLR start "rule__Dataset__Group__0"
    // InternalMLRegression.g:1139:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1143:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMLRegression.g:1144:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:1151:1: rule__Dataset__Group__0__Impl : ( 'import' ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1155:1: ( ( 'import' ) )
            // InternalMLRegression.g:1156:1: ( 'import' )
            {
            // InternalMLRegression.g:1156:1: ( 'import' )
            // InternalMLRegression.g:1157:2: 'import'
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
    // InternalMLRegression.g:1166:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1170:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMLRegression.g:1171:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1178:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__DataPathAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1182:1: ( ( ( rule__Dataset__DataPathAssignment_1 ) ) )
            // InternalMLRegression.g:1183:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            {
            // InternalMLRegression.g:1183:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            // InternalMLRegression.g:1184:2: ( rule__Dataset__DataPathAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getDataPathAssignment_1()); 
            // InternalMLRegression.g:1185:2: ( rule__Dataset__DataPathAssignment_1 )
            // InternalMLRegression.g:1185:3: rule__Dataset__DataPathAssignment_1
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
    // InternalMLRegression.g:1193:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl rule__Dataset__Group__3 ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1197:1: ( rule__Dataset__Group__2__Impl rule__Dataset__Group__3 )
            // InternalMLRegression.g:1198:2: rule__Dataset__Group__2__Impl rule__Dataset__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1205:1: rule__Dataset__Group__2__Impl : ( ( rule__Dataset__SeparatorAssignment_2 )? ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1209:1: ( ( ( rule__Dataset__SeparatorAssignment_2 )? ) )
            // InternalMLRegression.g:1210:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            {
            // InternalMLRegression.g:1210:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            // InternalMLRegression.g:1211:2: ( rule__Dataset__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getDatasetAccess().getSeparatorAssignment_2()); 
            // InternalMLRegression.g:1212:2: ( rule__Dataset__SeparatorAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMLRegression.g:1212:3: rule__Dataset__SeparatorAssignment_2
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
    // InternalMLRegression.g:1220:1: rule__Dataset__Group__3 : rule__Dataset__Group__3__Impl ;
    public final void rule__Dataset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1224:1: ( rule__Dataset__Group__3__Impl )
            // InternalMLRegression.g:1225:2: rule__Dataset__Group__3__Impl
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
    // InternalMLRegression.g:1231:1: rule__Dataset__Group__3__Impl : ( ';' ) ;
    public final void rule__Dataset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1235:1: ( ( ';' ) )
            // InternalMLRegression.g:1236:1: ( ';' )
            {
            // InternalMLRegression.g:1236:1: ( ';' )
            // InternalMLRegression.g:1237:2: ';'
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


    // $ANTLR start "rule__Partition__Group__0"
    // InternalMLRegression.g:1247:1: rule__Partition__Group__0 : rule__Partition__Group__0__Impl rule__Partition__Group__1 ;
    public final void rule__Partition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1251:1: ( rule__Partition__Group__0__Impl rule__Partition__Group__1 )
            // InternalMLRegression.g:1252:2: rule__Partition__Group__0__Impl rule__Partition__Group__1
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
    // InternalMLRegression.g:1259:1: rule__Partition__Group__0__Impl : ( 'partition' ) ;
    public final void rule__Partition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1263:1: ( ( 'partition' ) )
            // InternalMLRegression.g:1264:1: ( 'partition' )
            {
            // InternalMLRegression.g:1264:1: ( 'partition' )
            // InternalMLRegression.g:1265:2: 'partition'
            {
             before(grammarAccess.getPartitionAccess().getPartitionKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMLRegression.g:1274:1: rule__Partition__Group__1 : rule__Partition__Group__1__Impl rule__Partition__Group__2 ;
    public final void rule__Partition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1278:1: ( rule__Partition__Group__1__Impl rule__Partition__Group__2 )
            // InternalMLRegression.g:1279:2: rule__Partition__Group__1__Impl rule__Partition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:1286:1: rule__Partition__Group__1__Impl : ( ':' ) ;
    public final void rule__Partition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1290:1: ( ( ':' ) )
            // InternalMLRegression.g:1291:1: ( ':' )
            {
            // InternalMLRegression.g:1291:1: ( ':' )
            // InternalMLRegression.g:1292:2: ':'
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
    // InternalMLRegression.g:1301:1: rule__Partition__Group__2 : rule__Partition__Group__2__Impl rule__Partition__Group__3 ;
    public final void rule__Partition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1305:1: ( rule__Partition__Group__2__Impl rule__Partition__Group__3 )
            // InternalMLRegression.g:1306:2: rule__Partition__Group__2__Impl rule__Partition__Group__3
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
    // InternalMLRegression.g:1313:1: rule__Partition__Group__2__Impl : ( ( rule__Partition__TestAssignment_2 ) ) ;
    public final void rule__Partition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1317:1: ( ( ( rule__Partition__TestAssignment_2 ) ) )
            // InternalMLRegression.g:1318:1: ( ( rule__Partition__TestAssignment_2 ) )
            {
            // InternalMLRegression.g:1318:1: ( ( rule__Partition__TestAssignment_2 ) )
            // InternalMLRegression.g:1319:2: ( rule__Partition__TestAssignment_2 )
            {
             before(grammarAccess.getPartitionAccess().getTestAssignment_2()); 
            // InternalMLRegression.g:1320:2: ( rule__Partition__TestAssignment_2 )
            // InternalMLRegression.g:1320:3: rule__Partition__TestAssignment_2
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
    // InternalMLRegression.g:1328:1: rule__Partition__Group__3 : rule__Partition__Group__3__Impl ;
    public final void rule__Partition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1332:1: ( rule__Partition__Group__3__Impl )
            // InternalMLRegression.g:1333:2: rule__Partition__Group__3__Impl
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
    // InternalMLRegression.g:1339:1: rule__Partition__Group__3__Impl : ( ';' ) ;
    public final void rule__Partition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1343:1: ( ( ';' ) )
            // InternalMLRegression.g:1344:1: ( ';' )
            {
            // InternalMLRegression.g:1344:1: ( ';' )
            // InternalMLRegression.g:1345:2: ';'
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
    // InternalMLRegression.g:1355:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1359:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMLRegression.g:1360:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
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
    // InternalMLRegression.g:1367:1: rule__CrossValidation__Group__0__Impl : ( 'cross_validation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1371:1: ( ( 'cross_validation' ) )
            // InternalMLRegression.g:1372:1: ( 'cross_validation' )
            {
            // InternalMLRegression.g:1372:1: ( 'cross_validation' )
            // InternalMLRegression.g:1373:2: 'cross_validation'
            {
             before(grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMLRegression.g:1382:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1386:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMLRegression.g:1387:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:1394:1: rule__CrossValidation__Group__1__Impl : ( ':' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1398:1: ( ( ':' ) )
            // InternalMLRegression.g:1399:1: ( ':' )
            {
            // InternalMLRegression.g:1399:1: ( ':' )
            // InternalMLRegression.g:1400:2: ':'
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
    // InternalMLRegression.g:1409:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1413:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMLRegression.g:1414:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
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
    // InternalMLRegression.g:1421:1: rule__CrossValidation__Group__2__Impl : ( ( rule__CrossValidation__KAssignment_2 ) ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1425:1: ( ( ( rule__CrossValidation__KAssignment_2 ) ) )
            // InternalMLRegression.g:1426:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            {
            // InternalMLRegression.g:1426:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            // InternalMLRegression.g:1427:2: ( rule__CrossValidation__KAssignment_2 )
            {
             before(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 
            // InternalMLRegression.g:1428:2: ( rule__CrossValidation__KAssignment_2 )
            // InternalMLRegression.g:1428:3: rule__CrossValidation__KAssignment_2
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
    // InternalMLRegression.g:1436:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1440:1: ( rule__CrossValidation__Group__3__Impl )
            // InternalMLRegression.g:1441:2: rule__CrossValidation__Group__3__Impl
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
    // InternalMLRegression.g:1447:1: rule__CrossValidation__Group__3__Impl : ( ';' ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1451:1: ( ( ';' ) )
            // InternalMLRegression.g:1452:1: ( ';' )
            {
            // InternalMLRegression.g:1452:1: ( ';' )
            // InternalMLRegression.g:1453:2: ';'
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


    // $ANTLR start "rule__Variables__Group__0"
    // InternalMLRegression.g:1463:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1467:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalMLRegression.g:1468:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
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
    // InternalMLRegression.g:1475:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__PredictivesAssignment_0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1479:1: ( ( ( rule__Variables__PredictivesAssignment_0 ) ) )
            // InternalMLRegression.g:1480:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            {
            // InternalMLRegression.g:1480:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            // InternalMLRegression.g:1481:2: ( rule__Variables__PredictivesAssignment_0 )
            {
             before(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 
            // InternalMLRegression.g:1482:2: ( rule__Variables__PredictivesAssignment_0 )
            // InternalMLRegression.g:1482:3: rule__Variables__PredictivesAssignment_0
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
    // InternalMLRegression.g:1490:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1494:1: ( rule__Variables__Group__1__Impl )
            // InternalMLRegression.g:1495:2: rule__Variables__Group__1__Impl
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
    // InternalMLRegression.g:1501:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__TargetsAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1505:1: ( ( ( rule__Variables__TargetsAssignment_1 ) ) )
            // InternalMLRegression.g:1506:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            {
            // InternalMLRegression.g:1506:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            // InternalMLRegression.g:1507:2: ( rule__Variables__TargetsAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 
            // InternalMLRegression.g:1508:2: ( rule__Variables__TargetsAssignment_1 )
            // InternalMLRegression.g:1508:3: rule__Variables__TargetsAssignment_1
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


    // $ANTLR start "rule__ListePredictiveVar__Group__0"
    // InternalMLRegression.g:1517:1: rule__ListePredictiveVar__Group__0 : rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 ;
    public final void rule__ListePredictiveVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1521:1: ( rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 )
            // InternalMLRegression.g:1522:2: rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ListePredictiveVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group__1();

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
    // $ANTLR end "rule__ListePredictiveVar__Group__0"


    // $ANTLR start "rule__ListePredictiveVar__Group__0__Impl"
    // InternalMLRegression.g:1529:1: rule__ListePredictiveVar__Group__0__Impl : ( 'predictive_vars' ) ;
    public final void rule__ListePredictiveVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1533:1: ( ( 'predictive_vars' ) )
            // InternalMLRegression.g:1534:1: ( 'predictive_vars' )
            {
            // InternalMLRegression.g:1534:1: ( 'predictive_vars' )
            // InternalMLRegression.g:1535:2: 'predictive_vars'
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0()); 

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
    // $ANTLR end "rule__ListePredictiveVar__Group__0__Impl"


    // $ANTLR start "rule__ListePredictiveVar__Group__1"
    // InternalMLRegression.g:1544:1: rule__ListePredictiveVar__Group__1 : rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 ;
    public final void rule__ListePredictiveVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1548:1: ( rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 )
            // InternalMLRegression.g:1549:2: rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ListePredictiveVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group__2();

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
    // $ANTLR end "rule__ListePredictiveVar__Group__1"


    // $ANTLR start "rule__ListePredictiveVar__Group__1__Impl"
    // InternalMLRegression.g:1556:1: rule__ListePredictiveVar__Group__1__Impl : ( ':' ) ;
    public final void rule__ListePredictiveVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1560:1: ( ( ':' ) )
            // InternalMLRegression.g:1561:1: ( ':' )
            {
            // InternalMLRegression.g:1561:1: ( ':' )
            // InternalMLRegression.g:1562:2: ':'
            {
             before(grammarAccess.getListePredictiveVarAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ListePredictiveVar__Group__1__Impl"


    // $ANTLR start "rule__ListePredictiveVar__Group__2"
    // InternalMLRegression.g:1571:1: rule__ListePredictiveVar__Group__2 : rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 ;
    public final void rule__ListePredictiveVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1575:1: ( rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 )
            // InternalMLRegression.g:1576:2: rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ListePredictiveVar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group__3();

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
    // $ANTLR end "rule__ListePredictiveVar__Group__2"


    // $ANTLR start "rule__ListePredictiveVar__Group__2__Impl"
    // InternalMLRegression.g:1583:1: rule__ListePredictiveVar__Group__2__Impl : ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) ) ;
    public final void rule__ListePredictiveVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1587:1: ( ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) ) )
            // InternalMLRegression.g:1588:1: ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1588:1: ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) )
            // InternalMLRegression.g:1589:2: ( rule__ListePredictiveVar__PredVarAssignment_2 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_2()); 
            // InternalMLRegression.g:1590:2: ( rule__ListePredictiveVar__PredVarAssignment_2 )
            // InternalMLRegression.g:1590:3: rule__ListePredictiveVar__PredVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__PredVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_2()); 

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
    // $ANTLR end "rule__ListePredictiveVar__Group__2__Impl"


    // $ANTLR start "rule__ListePredictiveVar__Group__3"
    // InternalMLRegression.g:1598:1: rule__ListePredictiveVar__Group__3 : rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 ;
    public final void rule__ListePredictiveVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1602:1: ( rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 )
            // InternalMLRegression.g:1603:2: rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ListePredictiveVar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group__4();

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
    // $ANTLR end "rule__ListePredictiveVar__Group__3"


    // $ANTLR start "rule__ListePredictiveVar__Group__3__Impl"
    // InternalMLRegression.g:1610:1: rule__ListePredictiveVar__Group__3__Impl : ( ( rule__ListePredictiveVar__Group_3__0 )* ) ;
    public final void rule__ListePredictiveVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1614:1: ( ( ( rule__ListePredictiveVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1615:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1615:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            // InternalMLRegression.g:1616:2: ( rule__ListePredictiveVar__Group_3__0 )*
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1617:2: ( rule__ListePredictiveVar__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMLRegression.g:1617:3: rule__ListePredictiveVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ListePredictiveVar__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getListePredictiveVarAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ListePredictiveVar__Group__3__Impl"


    // $ANTLR start "rule__ListePredictiveVar__Group__4"
    // InternalMLRegression.g:1625:1: rule__ListePredictiveVar__Group__4 : rule__ListePredictiveVar__Group__4__Impl ;
    public final void rule__ListePredictiveVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1629:1: ( rule__ListePredictiveVar__Group__4__Impl )
            // InternalMLRegression.g:1630:2: rule__ListePredictiveVar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group__4__Impl();

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
    // $ANTLR end "rule__ListePredictiveVar__Group__4"


    // $ANTLR start "rule__ListePredictiveVar__Group__4__Impl"
    // InternalMLRegression.g:1636:1: rule__ListePredictiveVar__Group__4__Impl : ( ';' ) ;
    public final void rule__ListePredictiveVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1640:1: ( ( ';' ) )
            // InternalMLRegression.g:1641:1: ( ';' )
            {
            // InternalMLRegression.g:1641:1: ( ';' )
            // InternalMLRegression.g:1642:2: ';'
            {
             before(grammarAccess.getListePredictiveVarAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ListePredictiveVar__Group__4__Impl"


    // $ANTLR start "rule__ListePredictiveVar__Group_3__0"
    // InternalMLRegression.g:1652:1: rule__ListePredictiveVar__Group_3__0 : rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 ;
    public final void rule__ListePredictiveVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1656:1: ( rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 )
            // InternalMLRegression.g:1657:2: rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ListePredictiveVar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group_3__1();

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
    // $ANTLR end "rule__ListePredictiveVar__Group_3__0"


    // $ANTLR start "rule__ListePredictiveVar__Group_3__0__Impl"
    // InternalMLRegression.g:1664:1: rule__ListePredictiveVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListePredictiveVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1668:1: ( ( ',' ) )
            // InternalMLRegression.g:1669:1: ( ',' )
            {
            // InternalMLRegression.g:1669:1: ( ',' )
            // InternalMLRegression.g:1670:2: ','
            {
             before(grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ListePredictiveVar__Group_3__0__Impl"


    // $ANTLR start "rule__ListePredictiveVar__Group_3__1"
    // InternalMLRegression.g:1679:1: rule__ListePredictiveVar__Group_3__1 : rule__ListePredictiveVar__Group_3__1__Impl ;
    public final void rule__ListePredictiveVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1683:1: ( rule__ListePredictiveVar__Group_3__1__Impl )
            // InternalMLRegression.g:1684:2: rule__ListePredictiveVar__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__Group_3__1__Impl();

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
    // $ANTLR end "rule__ListePredictiveVar__Group_3__1"


    // $ANTLR start "rule__ListePredictiveVar__Group_3__1__Impl"
    // InternalMLRegression.g:1690:1: rule__ListePredictiveVar__Group_3__1__Impl : ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) ;
    public final void rule__ListePredictiveVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1694:1: ( ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1695:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1695:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            // InternalMLRegression.g:1696:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_3_1()); 
            // InternalMLRegression.g:1697:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            // InternalMLRegression.g:1697:3: rule__ListePredictiveVar__PredVarAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__PredVarAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_3_1()); 

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
    // $ANTLR end "rule__ListePredictiveVar__Group_3__1__Impl"


    // $ANTLR start "rule__TargetVar__Group__0"
    // InternalMLRegression.g:1706:1: rule__TargetVar__Group__0 : rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 ;
    public final void rule__TargetVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1710:1: ( rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 )
            // InternalMLRegression.g:1711:2: rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TargetVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__1();

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
    // $ANTLR end "rule__TargetVar__Group__0"


    // $ANTLR start "rule__TargetVar__Group__0__Impl"
    // InternalMLRegression.g:1718:1: rule__TargetVar__Group__0__Impl : ( 'target_vars' ) ;
    public final void rule__TargetVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1722:1: ( ( 'target_vars' ) )
            // InternalMLRegression.g:1723:1: ( 'target_vars' )
            {
            // InternalMLRegression.g:1723:1: ( 'target_vars' )
            // InternalMLRegression.g:1724:2: 'target_vars'
            {
             before(grammarAccess.getTargetVarAccess().getTarget_varsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getTarget_varsKeyword_0()); 

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
    // $ANTLR end "rule__TargetVar__Group__0__Impl"


    // $ANTLR start "rule__TargetVar__Group__1"
    // InternalMLRegression.g:1733:1: rule__TargetVar__Group__1 : rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 ;
    public final void rule__TargetVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1737:1: ( rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 )
            // InternalMLRegression.g:1738:2: rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__TargetVar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__2();

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
    // $ANTLR end "rule__TargetVar__Group__1"


    // $ANTLR start "rule__TargetVar__Group__1__Impl"
    // InternalMLRegression.g:1745:1: rule__TargetVar__Group__1__Impl : ( ':' ) ;
    public final void rule__TargetVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1749:1: ( ( ':' ) )
            // InternalMLRegression.g:1750:1: ( ':' )
            {
            // InternalMLRegression.g:1750:1: ( ':' )
            // InternalMLRegression.g:1751:2: ':'
            {
             before(grammarAccess.getTargetVarAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__TargetVar__Group__1__Impl"


    // $ANTLR start "rule__TargetVar__Group__2"
    // InternalMLRegression.g:1760:1: rule__TargetVar__Group__2 : rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 ;
    public final void rule__TargetVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1764:1: ( rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 )
            // InternalMLRegression.g:1765:2: rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TargetVar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__3();

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
    // $ANTLR end "rule__TargetVar__Group__2"


    // $ANTLR start "rule__TargetVar__Group__2__Impl"
    // InternalMLRegression.g:1772:1: rule__TargetVar__Group__2__Impl : ( ( rule__TargetVar__TargetVarAssignment_2 ) ) ;
    public final void rule__TargetVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1776:1: ( ( ( rule__TargetVar__TargetVarAssignment_2 ) ) )
            // InternalMLRegression.g:1777:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1777:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            // InternalMLRegression.g:1778:2: ( rule__TargetVar__TargetVarAssignment_2 )
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarAssignment_2()); 
            // InternalMLRegression.g:1779:2: ( rule__TargetVar__TargetVarAssignment_2 )
            // InternalMLRegression.g:1779:3: rule__TargetVar__TargetVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__TargetVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getTargetVarAssignment_2()); 

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
    // $ANTLR end "rule__TargetVar__Group__2__Impl"


    // $ANTLR start "rule__TargetVar__Group__3"
    // InternalMLRegression.g:1787:1: rule__TargetVar__Group__3 : rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 ;
    public final void rule__TargetVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1791:1: ( rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 )
            // InternalMLRegression.g:1792:2: rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__TargetVar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__4();

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
    // $ANTLR end "rule__TargetVar__Group__3"


    // $ANTLR start "rule__TargetVar__Group__3__Impl"
    // InternalMLRegression.g:1799:1: rule__TargetVar__Group__3__Impl : ( ( rule__TargetVar__Group_3__0 )* ) ;
    public final void rule__TargetVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1803:1: ( ( ( rule__TargetVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1804:1: ( ( rule__TargetVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1804:1: ( ( rule__TargetVar__Group_3__0 )* )
            // InternalMLRegression.g:1805:2: ( rule__TargetVar__Group_3__0 )*
            {
             before(grammarAccess.getTargetVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1806:2: ( rule__TargetVar__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMLRegression.g:1806:3: rule__TargetVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TargetVar__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTargetVarAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TargetVar__Group__3__Impl"


    // $ANTLR start "rule__TargetVar__Group__4"
    // InternalMLRegression.g:1814:1: rule__TargetVar__Group__4 : rule__TargetVar__Group__4__Impl ;
    public final void rule__TargetVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1818:1: ( rule__TargetVar__Group__4__Impl )
            // InternalMLRegression.g:1819:2: rule__TargetVar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__4__Impl();

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
    // $ANTLR end "rule__TargetVar__Group__4"


    // $ANTLR start "rule__TargetVar__Group__4__Impl"
    // InternalMLRegression.g:1825:1: rule__TargetVar__Group__4__Impl : ( ';' ) ;
    public final void rule__TargetVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1829:1: ( ( ';' ) )
            // InternalMLRegression.g:1830:1: ( ';' )
            {
            // InternalMLRegression.g:1830:1: ( ';' )
            // InternalMLRegression.g:1831:2: ';'
            {
             before(grammarAccess.getTargetVarAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__TargetVar__Group__4__Impl"


    // $ANTLR start "rule__TargetVar__Group_3__0"
    // InternalMLRegression.g:1841:1: rule__TargetVar__Group_3__0 : rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 ;
    public final void rule__TargetVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1845:1: ( rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 )
            // InternalMLRegression.g:1846:2: rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__TargetVar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetVar__Group_3__1();

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
    // $ANTLR end "rule__TargetVar__Group_3__0"


    // $ANTLR start "rule__TargetVar__Group_3__0__Impl"
    // InternalMLRegression.g:1853:1: rule__TargetVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TargetVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1857:1: ( ( ',' ) )
            // InternalMLRegression.g:1858:1: ( ',' )
            {
            // InternalMLRegression.g:1858:1: ( ',' )
            // InternalMLRegression.g:1859:2: ','
            {
             before(grammarAccess.getTargetVarAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__TargetVar__Group_3__0__Impl"


    // $ANTLR start "rule__TargetVar__Group_3__1"
    // InternalMLRegression.g:1868:1: rule__TargetVar__Group_3__1 : rule__TargetVar__Group_3__1__Impl ;
    public final void rule__TargetVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1872:1: ( rule__TargetVar__Group_3__1__Impl )
            // InternalMLRegression.g:1873:2: rule__TargetVar__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__Group_3__1__Impl();

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
    // $ANTLR end "rule__TargetVar__Group_3__1"


    // $ANTLR start "rule__TargetVar__Group_3__1__Impl"
    // InternalMLRegression.g:1879:1: rule__TargetVar__Group_3__1__Impl : ( ( rule__TargetVar__TargetVarAssignment_3_1 ) ) ;
    public final void rule__TargetVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1883:1: ( ( ( rule__TargetVar__TargetVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1884:1: ( ( rule__TargetVar__TargetVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1884:1: ( ( rule__TargetVar__TargetVarAssignment_3_1 ) )
            // InternalMLRegression.g:1885:2: ( rule__TargetVar__TargetVarAssignment_3_1 )
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarAssignment_3_1()); 
            // InternalMLRegression.g:1886:2: ( rule__TargetVar__TargetVarAssignment_3_1 )
            // InternalMLRegression.g:1886:3: rule__TargetVar__TargetVarAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__TargetVarAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getTargetVarAssignment_3_1()); 

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
    // $ANTLR end "rule__TargetVar__Group_3__1__Impl"


    // $ANTLR start "rule__Calculate__Group__0"
    // InternalMLRegression.g:1895:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1899:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalMLRegression.g:1900:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
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
    // InternalMLRegression.g:1907:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1911:1: ( ( 'calculate' ) )
            // InternalMLRegression.g:1912:1: ( 'calculate' )
            {
            // InternalMLRegression.g:1912:1: ( 'calculate' )
            // InternalMLRegression.g:1913:2: 'calculate'
            {
             before(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMLRegression.g:1922:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1926:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalMLRegression.g:1927:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMLRegression.g:1934:1: rule__Calculate__Group__1__Impl : ( ':' ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1938:1: ( ( ':' ) )
            // InternalMLRegression.g:1939:1: ( ':' )
            {
            // InternalMLRegression.g:1939:1: ( ':' )
            // InternalMLRegression.g:1940:2: ':'
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
    // InternalMLRegression.g:1949:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1953:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalMLRegression.g:1954:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
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
    // InternalMLRegression.g:1961:1: rule__Calculate__Group__2__Impl : ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1965:1: ( ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) )
            // InternalMLRegression.g:1966:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            {
            // InternalMLRegression.g:1966:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            // InternalMLRegression.g:1967:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            {
             before(grammarAccess.getCalculateAccess().getCalculateTypeAssignment_2()); 
            // InternalMLRegression.g:1968:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            // InternalMLRegression.g:1968:3: rule__Calculate__CalculateTypeAssignment_2
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
    // InternalMLRegression.g:1976:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1980:1: ( rule__Calculate__Group__3__Impl )
            // InternalMLRegression.g:1981:2: rule__Calculate__Group__3__Impl
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
    // InternalMLRegression.g:1987:1: rule__Calculate__Group__3__Impl : ( ';' ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1991:1: ( ( ';' ) )
            // InternalMLRegression.g:1992:1: ( ';' )
            {
            // InternalMLRegression.g:1992:1: ( ';' )
            // InternalMLRegression.g:1993:2: ';'
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


    // $ANTLR start "rule__Algo__Group__0"
    // InternalMLRegression.g:2003:1: rule__Algo__Group__0 : rule__Algo__Group__0__Impl rule__Algo__Group__1 ;
    public final void rule__Algo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2007:1: ( rule__Algo__Group__0__Impl rule__Algo__Group__1 )
            // InternalMLRegression.g:2008:2: rule__Algo__Group__0__Impl rule__Algo__Group__1
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
    // InternalMLRegression.g:2015:1: rule__Algo__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2019:1: ( ( 'algorithm' ) )
            // InternalMLRegression.g:2020:1: ( 'algorithm' )
            {
            // InternalMLRegression.g:2020:1: ( 'algorithm' )
            // InternalMLRegression.g:2021:2: 'algorithm'
            {
             before(grammarAccess.getAlgoAccess().getAlgorithmKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMLRegression.g:2030:1: rule__Algo__Group__1 : rule__Algo__Group__1__Impl rule__Algo__Group__2 ;
    public final void rule__Algo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2034:1: ( rule__Algo__Group__1__Impl rule__Algo__Group__2 )
            // InternalMLRegression.g:2035:2: rule__Algo__Group__1__Impl rule__Algo__Group__2
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
    // InternalMLRegression.g:2042:1: rule__Algo__Group__1__Impl : ( ':' ) ;
    public final void rule__Algo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2046:1: ( ( ':' ) )
            // InternalMLRegression.g:2047:1: ( ':' )
            {
            // InternalMLRegression.g:2047:1: ( ':' )
            // InternalMLRegression.g:2048:2: ':'
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
    // InternalMLRegression.g:2057:1: rule__Algo__Group__2 : rule__Algo__Group__2__Impl rule__Algo__Group__3 ;
    public final void rule__Algo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2061:1: ( rule__Algo__Group__2__Impl rule__Algo__Group__3 )
            // InternalMLRegression.g:2062:2: rule__Algo__Group__2__Impl rule__Algo__Group__3
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
    // InternalMLRegression.g:2069:1: rule__Algo__Group__2__Impl : ( ( rule__Algo__AlgoAssignment_2 ) ) ;
    public final void rule__Algo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2073:1: ( ( ( rule__Algo__AlgoAssignment_2 ) ) )
            // InternalMLRegression.g:2074:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            {
            // InternalMLRegression.g:2074:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            // InternalMLRegression.g:2075:2: ( rule__Algo__AlgoAssignment_2 )
            {
             before(grammarAccess.getAlgoAccess().getAlgoAssignment_2()); 
            // InternalMLRegression.g:2076:2: ( rule__Algo__AlgoAssignment_2 )
            // InternalMLRegression.g:2076:3: rule__Algo__AlgoAssignment_2
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
    // InternalMLRegression.g:2084:1: rule__Algo__Group__3 : rule__Algo__Group__3__Impl ;
    public final void rule__Algo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2088:1: ( rule__Algo__Group__3__Impl )
            // InternalMLRegression.g:2089:2: rule__Algo__Group__3__Impl
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
    // InternalMLRegression.g:2095:1: rule__Algo__Group__3__Impl : ( ';' ) ;
    public final void rule__Algo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2099:1: ( ( ';' ) )
            // InternalMLRegression.g:2100:1: ( ';' )
            {
            // InternalMLRegression.g:2100:1: ( ';' )
            // InternalMLRegression.g:2101:2: ';'
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


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMLRegression.g:2111:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2115:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMLRegression.g:2116:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMLRegression.g:2123:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__ValueAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2127:1: ( ( ( rule__FLOAT__ValueAssignment_0 ) ) )
            // InternalMLRegression.g:2128:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            {
            // InternalMLRegression.g:2128:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            // InternalMLRegression.g:2129:2: ( rule__FLOAT__ValueAssignment_0 )
            {
             before(grammarAccess.getFLOATAccess().getValueAssignment_0()); 
            // InternalMLRegression.g:2130:2: ( rule__FLOAT__ValueAssignment_0 )
            // InternalMLRegression.g:2130:3: rule__FLOAT__ValueAssignment_0
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
    // InternalMLRegression.g:2138:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2142:1: ( rule__FLOAT__Group__1__Impl )
            // InternalMLRegression.g:2143:2: rule__FLOAT__Group__1__Impl
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
    // InternalMLRegression.g:2149:1: rule__FLOAT__Group__1__Impl : ( ( rule__FLOAT__Group_1__0 )? ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2153:1: ( ( ( rule__FLOAT__Group_1__0 )? ) )
            // InternalMLRegression.g:2154:1: ( ( rule__FLOAT__Group_1__0 )? )
            {
            // InternalMLRegression.g:2154:1: ( ( rule__FLOAT__Group_1__0 )? )
            // InternalMLRegression.g:2155:2: ( rule__FLOAT__Group_1__0 )?
            {
             before(grammarAccess.getFLOATAccess().getGroup_1()); 
            // InternalMLRegression.g:2156:2: ( rule__FLOAT__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMLRegression.g:2156:3: rule__FLOAT__Group_1__0
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
    // InternalMLRegression.g:2165:1: rule__FLOAT__Group_1__0 : rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 ;
    public final void rule__FLOAT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2169:1: ( rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 )
            // InternalMLRegression.g:2170:2: rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:2177:1: rule__FLOAT__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2181:1: ( ( '.' ) )
            // InternalMLRegression.g:2182:1: ( '.' )
            {
            // InternalMLRegression.g:2182:1: ( '.' )
            // InternalMLRegression.g:2183:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMLRegression.g:2192:1: rule__FLOAT__Group_1__1 : rule__FLOAT__Group_1__1__Impl ;
    public final void rule__FLOAT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2196:1: ( rule__FLOAT__Group_1__1__Impl )
            // InternalMLRegression.g:2197:2: rule__FLOAT__Group_1__1__Impl
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
    // InternalMLRegression.g:2203:1: rule__FLOAT__Group_1__1__Impl : ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) ;
    public final void rule__FLOAT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2207:1: ( ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) )
            // InternalMLRegression.g:2208:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            {
            // InternalMLRegression.g:2208:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            // InternalMLRegression.g:2209:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getFLOATAccess().getDecimalAssignment_1_1()); 
            // InternalMLRegression.g:2210:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            // InternalMLRegression.g:2210:3: rule__FLOAT__DecimalAssignment_1_1
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
    // InternalMLRegression.g:2219:1: rule__PERCENT__Group__0 : rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 ;
    public final void rule__PERCENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2223:1: ( rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 )
            // InternalMLRegression.g:2224:2: rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMLRegression.g:2231:1: rule__PERCENT__Group__0__Impl : ( ( rule__PERCENT__FloatAssignment_0 ) ) ;
    public final void rule__PERCENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2235:1: ( ( ( rule__PERCENT__FloatAssignment_0 ) ) )
            // InternalMLRegression.g:2236:1: ( ( rule__PERCENT__FloatAssignment_0 ) )
            {
            // InternalMLRegression.g:2236:1: ( ( rule__PERCENT__FloatAssignment_0 ) )
            // InternalMLRegression.g:2237:2: ( rule__PERCENT__FloatAssignment_0 )
            {
             before(grammarAccess.getPERCENTAccess().getFloatAssignment_0()); 
            // InternalMLRegression.g:2238:2: ( rule__PERCENT__FloatAssignment_0 )
            // InternalMLRegression.g:2238:3: rule__PERCENT__FloatAssignment_0
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
    // InternalMLRegression.g:2246:1: rule__PERCENT__Group__1 : rule__PERCENT__Group__1__Impl ;
    public final void rule__PERCENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2250:1: ( rule__PERCENT__Group__1__Impl )
            // InternalMLRegression.g:2251:2: rule__PERCENT__Group__1__Impl
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
    // InternalMLRegression.g:2257:1: rule__PERCENT__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2261:1: ( ( '%' ) )
            // InternalMLRegression.g:2262:1: ( '%' )
            {
            // InternalMLRegression.g:2262:1: ( '%' )
            // InternalMLRegression.g:2263:2: '%'
            {
             before(grammarAccess.getPERCENTAccess().getPercentSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMLRegression.g:2273:1: rule__Model__LanguageTargetAssignment_0 : ( ruleLanguageTarget ) ;
    public final void rule__Model__LanguageTargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2277:1: ( ( ruleLanguageTarget ) )
            // InternalMLRegression.g:2278:2: ( ruleLanguageTarget )
            {
            // InternalMLRegression.g:2278:2: ( ruleLanguageTarget )
            // InternalMLRegression.g:2279:3: ruleLanguageTarget
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
    // InternalMLRegression.g:2288:1: rule__Model__MlAssignment_1 : ( ruleMLRegression ) ;
    public final void rule__Model__MlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2292:1: ( ( ruleMLRegression ) )
            // InternalMLRegression.g:2293:2: ( ruleMLRegression )
            {
            // InternalMLRegression.g:2293:2: ( ruleMLRegression )
            // InternalMLRegression.g:2294:3: ruleMLRegression
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
    // InternalMLRegression.g:2303:1: rule__LanguageTarget__LanguageAssignment_2 : ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) ) ;
    public final void rule__LanguageTarget__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2307:1: ( ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) ) )
            // InternalMLRegression.g:2308:2: ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) )
            {
            // InternalMLRegression.g:2308:2: ( ( rule__LanguageTarget__LanguageAlternatives_2_0 ) )
            // InternalMLRegression.g:2309:3: ( rule__LanguageTarget__LanguageAlternatives_2_0 )
            {
             before(grammarAccess.getLanguageTargetAccess().getLanguageAlternatives_2_0()); 
            // InternalMLRegression.g:2310:3: ( rule__LanguageTarget__LanguageAlternatives_2_0 )
            // InternalMLRegression.g:2310:4: rule__LanguageTarget__LanguageAlternatives_2_0
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
    // InternalMLRegression.g:2318:1: rule__MLRegression__DatasetAssignment_0 : ( ruleDataset ) ;
    public final void rule__MLRegression__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2322:1: ( ( ruleDataset ) )
            // InternalMLRegression.g:2323:2: ( ruleDataset )
            {
            // InternalMLRegression.g:2323:2: ( ruleDataset )
            // InternalMLRegression.g:2324:3: ruleDataset
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
    // InternalMLRegression.g:2333:1: rule__MLRegression__VarsAssignment_1 : ( ruleVariables ) ;
    public final void rule__MLRegression__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2337:1: ( ( ruleVariables ) )
            // InternalMLRegression.g:2338:2: ( ruleVariables )
            {
            // InternalMLRegression.g:2338:2: ( ruleVariables )
            // InternalMLRegression.g:2339:3: ruleVariables
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
    // InternalMLRegression.g:2348:1: rule__MLRegression__EvaluationAssignment_2 : ( ruleEvaluationType ) ;
    public final void rule__MLRegression__EvaluationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2352:1: ( ( ruleEvaluationType ) )
            // InternalMLRegression.g:2353:2: ( ruleEvaluationType )
            {
            // InternalMLRegression.g:2353:2: ( ruleEvaluationType )
            // InternalMLRegression.g:2354:3: ruleEvaluationType
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
    // InternalMLRegression.g:2363:1: rule__MLRegression__AlgoAssignment_3 : ( ruleAlgo ) ;
    public final void rule__MLRegression__AlgoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2367:1: ( ( ruleAlgo ) )
            // InternalMLRegression.g:2368:2: ( ruleAlgo )
            {
            // InternalMLRegression.g:2368:2: ( ruleAlgo )
            // InternalMLRegression.g:2369:3: ruleAlgo
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
    // InternalMLRegression.g:2378:1: rule__MLRegression__CalculateAssignment_4 : ( ruleCalculate ) ;
    public final void rule__MLRegression__CalculateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2382:1: ( ( ruleCalculate ) )
            // InternalMLRegression.g:2383:2: ( ruleCalculate )
            {
            // InternalMLRegression.g:2383:2: ( ruleCalculate )
            // InternalMLRegression.g:2384:3: ruleCalculate
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


    // $ANTLR start "rule__Dataset__DataPathAssignment_1"
    // InternalMLRegression.g:2393:1: rule__Dataset__DataPathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Dataset__DataPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2397:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2398:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2398:2: ( RULE_STRING )
            // InternalMLRegression.g:2399:3: RULE_STRING
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
    // InternalMLRegression.g:2408:1: rule__Dataset__SeparatorAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Dataset__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2412:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2413:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2413:2: ( RULE_STRING )
            // InternalMLRegression.g:2414:3: RULE_STRING
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


    // $ANTLR start "rule__Partition__TestAssignment_2"
    // InternalMLRegression.g:2423:1: rule__Partition__TestAssignment_2 : ( ruleNumericValue ) ;
    public final void rule__Partition__TestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2427:1: ( ( ruleNumericValue ) )
            // InternalMLRegression.g:2428:2: ( ruleNumericValue )
            {
            // InternalMLRegression.g:2428:2: ( ruleNumericValue )
            // InternalMLRegression.g:2429:3: ruleNumericValue
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
    // InternalMLRegression.g:2438:1: rule__CrossValidation__KAssignment_2 : ( RULE_INT ) ;
    public final void rule__CrossValidation__KAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2442:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2443:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2443:2: ( RULE_INT )
            // InternalMLRegression.g:2444:3: RULE_INT
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


    // $ANTLR start "rule__Variables__PredictivesAssignment_0"
    // InternalMLRegression.g:2453:1: rule__Variables__PredictivesAssignment_0 : ( ruleListePredictiveVar ) ;
    public final void rule__Variables__PredictivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2457:1: ( ( ruleListePredictiveVar ) )
            // InternalMLRegression.g:2458:2: ( ruleListePredictiveVar )
            {
            // InternalMLRegression.g:2458:2: ( ruleListePredictiveVar )
            // InternalMLRegression.g:2459:3: ruleListePredictiveVar
            {
             before(grammarAccess.getVariablesAccess().getPredictivesListePredictiveVarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListePredictiveVar();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getPredictivesListePredictiveVarParserRuleCall_0_0()); 

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
    // InternalMLRegression.g:2468:1: rule__Variables__TargetsAssignment_1 : ( ruleTargetVar ) ;
    public final void rule__Variables__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2472:1: ( ( ruleTargetVar ) )
            // InternalMLRegression.g:2473:2: ( ruleTargetVar )
            {
            // InternalMLRegression.g:2473:2: ( ruleTargetVar )
            // InternalMLRegression.g:2474:3: ruleTargetVar
            {
             before(grammarAccess.getVariablesAccess().getTargetsTargetVarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetVar();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getTargetsTargetVarParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__ListePredictiveVar__PredVarAssignment_2"
    // InternalMLRegression.g:2483:1: rule__ListePredictiveVar__PredVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__PredVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2487:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2488:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2488:2: ( RULE_STRING )
            // InternalMLRegression.g:2489:3: RULE_STRING
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getPredVarSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ListePredictiveVar__PredVarAssignment_2"


    // $ANTLR start "rule__ListePredictiveVar__PredVarAssignment_3_1"
    // InternalMLRegression.g:2498:1: rule__ListePredictiveVar__PredVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__PredVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2502:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2503:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2503:2: ( RULE_STRING )
            // InternalMLRegression.g:2504:3: RULE_STRING
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getPredVarSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ListePredictiveVar__PredVarAssignment_3_1"


    // $ANTLR start "rule__TargetVar__TargetVarAssignment_2"
    // InternalMLRegression.g:2513:1: rule__TargetVar__TargetVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TargetVar__TargetVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2517:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2518:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2518:2: ( RULE_STRING )
            // InternalMLRegression.g:2519:3: RULE_STRING
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getTargetVarSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TargetVar__TargetVarAssignment_2"


    // $ANTLR start "rule__TargetVar__TargetVarAssignment_3_1"
    // InternalMLRegression.g:2528:1: rule__TargetVar__TargetVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TargetVar__TargetVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2532:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2533:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2533:2: ( RULE_STRING )
            // InternalMLRegression.g:2534:3: RULE_STRING
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getTargetVarSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TargetVar__TargetVarAssignment_3_1"


    // $ANTLR start "rule__Calculate__CalculateTypeAssignment_2"
    // InternalMLRegression.g:2543:1: rule__Calculate__CalculateTypeAssignment_2 : ( ruleCalculateType ) ;
    public final void rule__Calculate__CalculateTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2547:1: ( ( ruleCalculateType ) )
            // InternalMLRegression.g:2548:2: ( ruleCalculateType )
            {
            // InternalMLRegression.g:2548:2: ( ruleCalculateType )
            // InternalMLRegression.g:2549:3: ruleCalculateType
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


    // $ANTLR start "rule__Algo__AlgoAssignment_2"
    // InternalMLRegression.g:2558:1: rule__Algo__AlgoAssignment_2 : ( ruleAlgoType ) ;
    public final void rule__Algo__AlgoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2562:1: ( ( ruleAlgoType ) )
            // InternalMLRegression.g:2563:2: ( ruleAlgoType )
            {
            // InternalMLRegression.g:2563:2: ( ruleAlgoType )
            // InternalMLRegression.g:2564:3: ruleAlgoType
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


    // $ANTLR start "rule__FLOAT__ValueAssignment_0"
    // InternalMLRegression.g:2573:1: rule__FLOAT__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2577:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2578:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2578:2: ( RULE_INT )
            // InternalMLRegression.g:2579:3: RULE_INT
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
    // InternalMLRegression.g:2588:1: rule__FLOAT__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__FLOAT__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2592:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2593:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2593:2: ( RULE_INT )
            // InternalMLRegression.g:2594:3: RULE_INT
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
    // InternalMLRegression.g:2603:1: rule__PERCENT__FloatAssignment_0 : ( ruleFLOAT ) ;
    public final void rule__PERCENT__FloatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2607:1: ( ( ruleFLOAT ) )
            // InternalMLRegression.g:2608:2: ( ruleFLOAT )
            {
            // InternalMLRegression.g:2608:2: ( ruleFLOAT )
            // InternalMLRegression.g:2609:3: ruleFLOAT
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});

}