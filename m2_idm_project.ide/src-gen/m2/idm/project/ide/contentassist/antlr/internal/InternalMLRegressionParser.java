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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mean_absolute_error'", "'mean_squared_error'", "'median_absolute_error'", "'import'", "';'", "'partition'", "':'", "'cross_validation'", "'('", "')'", "'predictive_vars'", "','", "'target_vars'", "'calculate'", "'algorithm'", "'='", "'predict'", "'()'", "'line_regress'", "'decision_tree_regressor'", "'svr'", "'.'", "'%'"
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


    // $ANTLR start "entryRuleEvaluationType"
    // InternalMLRegression.g:103:1: entryRuleEvaluationType : ruleEvaluationType EOF ;
    public final void entryRuleEvaluationType() throws RecognitionException {
        try {
            // InternalMLRegression.g:104:1: ( ruleEvaluationType EOF )
            // InternalMLRegression.g:105:1: ruleEvaluationType EOF
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
    // InternalMLRegression.g:112:1: ruleEvaluationType : ( ( rule__EvaluationType__Alternatives ) ) ;
    public final void ruleEvaluationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:116:2: ( ( ( rule__EvaluationType__Alternatives ) ) )
            // InternalMLRegression.g:117:2: ( ( rule__EvaluationType__Alternatives ) )
            {
            // InternalMLRegression.g:117:2: ( ( rule__EvaluationType__Alternatives ) )
            // InternalMLRegression.g:118:3: ( rule__EvaluationType__Alternatives )
            {
             before(grammarAccess.getEvaluationTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:119:3: ( rule__EvaluationType__Alternatives )
            // InternalMLRegression.g:119:4: rule__EvaluationType__Alternatives
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
    // InternalMLRegression.g:128:1: entryRulePartition : rulePartition EOF ;
    public final void entryRulePartition() throws RecognitionException {
        try {
            // InternalMLRegression.g:129:1: ( rulePartition EOF )
            // InternalMLRegression.g:130:1: rulePartition EOF
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
    // InternalMLRegression.g:137:1: rulePartition : ( ( rule__Partition__Group__0 ) ) ;
    public final void rulePartition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:141:2: ( ( ( rule__Partition__Group__0 ) ) )
            // InternalMLRegression.g:142:2: ( ( rule__Partition__Group__0 ) )
            {
            // InternalMLRegression.g:142:2: ( ( rule__Partition__Group__0 ) )
            // InternalMLRegression.g:143:3: ( rule__Partition__Group__0 )
            {
             before(grammarAccess.getPartitionAccess().getGroup()); 
            // InternalMLRegression.g:144:3: ( rule__Partition__Group__0 )
            // InternalMLRegression.g:144:4: rule__Partition__Group__0
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
    // InternalMLRegression.g:162:1: ruleCrossValidation : ( ( rule__CrossValidation__Group__0 ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:166:2: ( ( ( rule__CrossValidation__Group__0 ) ) )
            // InternalMLRegression.g:167:2: ( ( rule__CrossValidation__Group__0 ) )
            {
            // InternalMLRegression.g:167:2: ( ( rule__CrossValidation__Group__0 ) )
            // InternalMLRegression.g:168:3: ( rule__CrossValidation__Group__0 )
            {
             before(grammarAccess.getCrossValidationAccess().getGroup()); 
            // InternalMLRegression.g:169:3: ( rule__CrossValidation__Group__0 )
            // InternalMLRegression.g:169:4: rule__CrossValidation__Group__0
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


    // $ANTLR start "entryRuleListePredictiveVar"
    // InternalMLRegression.g:203:1: entryRuleListePredictiveVar : ruleListePredictiveVar EOF ;
    public final void entryRuleListePredictiveVar() throws RecognitionException {
        try {
            // InternalMLRegression.g:204:1: ( ruleListePredictiveVar EOF )
            // InternalMLRegression.g:205:1: ruleListePredictiveVar EOF
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
    // InternalMLRegression.g:212:1: ruleListePredictiveVar : ( ( rule__ListePredictiveVar__Group__0 ) ) ;
    public final void ruleListePredictiveVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:216:2: ( ( ( rule__ListePredictiveVar__Group__0 ) ) )
            // InternalMLRegression.g:217:2: ( ( rule__ListePredictiveVar__Group__0 ) )
            {
            // InternalMLRegression.g:217:2: ( ( rule__ListePredictiveVar__Group__0 ) )
            // InternalMLRegression.g:218:3: ( rule__ListePredictiveVar__Group__0 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup()); 
            // InternalMLRegression.g:219:3: ( rule__ListePredictiveVar__Group__0 )
            // InternalMLRegression.g:219:4: rule__ListePredictiveVar__Group__0
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
    // InternalMLRegression.g:228:1: entryRuleTargetVar : ruleTargetVar EOF ;
    public final void entryRuleTargetVar() throws RecognitionException {
        try {
            // InternalMLRegression.g:229:1: ( ruleTargetVar EOF )
            // InternalMLRegression.g:230:1: ruleTargetVar EOF
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
    // InternalMLRegression.g:237:1: ruleTargetVar : ( ( rule__TargetVar__Group__0 ) ) ;
    public final void ruleTargetVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:241:2: ( ( ( rule__TargetVar__Group__0 ) ) )
            // InternalMLRegression.g:242:2: ( ( rule__TargetVar__Group__0 ) )
            {
            // InternalMLRegression.g:242:2: ( ( rule__TargetVar__Group__0 ) )
            // InternalMLRegression.g:243:3: ( rule__TargetVar__Group__0 )
            {
             before(grammarAccess.getTargetVarAccess().getGroup()); 
            // InternalMLRegression.g:244:3: ( rule__TargetVar__Group__0 )
            // InternalMLRegression.g:244:4: rule__TargetVar__Group__0
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
    // InternalMLRegression.g:253:1: entryRuleCalculate : ruleCalculate EOF ;
    public final void entryRuleCalculate() throws RecognitionException {
        try {
            // InternalMLRegression.g:254:1: ( ruleCalculate EOF )
            // InternalMLRegression.g:255:1: ruleCalculate EOF
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
    // InternalMLRegression.g:262:1: ruleCalculate : ( ( rule__Calculate__Group__0 ) ) ;
    public final void ruleCalculate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:266:2: ( ( ( rule__Calculate__Group__0 ) ) )
            // InternalMLRegression.g:267:2: ( ( rule__Calculate__Group__0 ) )
            {
            // InternalMLRegression.g:267:2: ( ( rule__Calculate__Group__0 ) )
            // InternalMLRegression.g:268:3: ( rule__Calculate__Group__0 )
            {
             before(grammarAccess.getCalculateAccess().getGroup()); 
            // InternalMLRegression.g:269:3: ( rule__Calculate__Group__0 )
            // InternalMLRegression.g:269:4: rule__Calculate__Group__0
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
    // InternalMLRegression.g:278:1: entryRuleCalculateType : ruleCalculateType EOF ;
    public final void entryRuleCalculateType() throws RecognitionException {
        try {
            // InternalMLRegression.g:279:1: ( ruleCalculateType EOF )
            // InternalMLRegression.g:280:1: ruleCalculateType EOF
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
    // InternalMLRegression.g:287:1: ruleCalculateType : ( ( rule__CalculateType__Alternatives ) ) ;
    public final void ruleCalculateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:291:2: ( ( ( rule__CalculateType__Alternatives ) ) )
            // InternalMLRegression.g:292:2: ( ( rule__CalculateType__Alternatives ) )
            {
            // InternalMLRegression.g:292:2: ( ( rule__CalculateType__Alternatives ) )
            // InternalMLRegression.g:293:3: ( rule__CalculateType__Alternatives )
            {
             before(grammarAccess.getCalculateTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:294:3: ( rule__CalculateType__Alternatives )
            // InternalMLRegression.g:294:4: rule__CalculateType__Alternatives
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
    // InternalMLRegression.g:303:1: entryRuleAlgo : ruleAlgo EOF ;
    public final void entryRuleAlgo() throws RecognitionException {
        try {
            // InternalMLRegression.g:304:1: ( ruleAlgo EOF )
            // InternalMLRegression.g:305:1: ruleAlgo EOF
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
    // InternalMLRegression.g:312:1: ruleAlgo : ( ( rule__Algo__Group__0 ) ) ;
    public final void ruleAlgo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:316:2: ( ( ( rule__Algo__Group__0 ) ) )
            // InternalMLRegression.g:317:2: ( ( rule__Algo__Group__0 ) )
            {
            // InternalMLRegression.g:317:2: ( ( rule__Algo__Group__0 ) )
            // InternalMLRegression.g:318:3: ( rule__Algo__Group__0 )
            {
             before(grammarAccess.getAlgoAccess().getGroup()); 
            // InternalMLRegression.g:319:3: ( rule__Algo__Group__0 )
            // InternalMLRegression.g:319:4: rule__Algo__Group__0
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
    // InternalMLRegression.g:328:1: entryRuleAlgoType : ruleAlgoType EOF ;
    public final void entryRuleAlgoType() throws RecognitionException {
        try {
            // InternalMLRegression.g:329:1: ( ruleAlgoType EOF )
            // InternalMLRegression.g:330:1: ruleAlgoType EOF
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
    // InternalMLRegression.g:337:1: ruleAlgoType : ( ( rule__AlgoType__Alternatives ) ) ;
    public final void ruleAlgoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:341:2: ( ( ( rule__AlgoType__Alternatives ) ) )
            // InternalMLRegression.g:342:2: ( ( rule__AlgoType__Alternatives ) )
            {
            // InternalMLRegression.g:342:2: ( ( rule__AlgoType__Alternatives ) )
            // InternalMLRegression.g:343:3: ( rule__AlgoType__Alternatives )
            {
             before(grammarAccess.getAlgoTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:344:3: ( rule__AlgoType__Alternatives )
            // InternalMLRegression.g:344:4: rule__AlgoType__Alternatives
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
    // InternalMLRegression.g:353:1: entryRuleLineRegress : ruleLineRegress EOF ;
    public final void entryRuleLineRegress() throws RecognitionException {
        try {
            // InternalMLRegression.g:354:1: ( ruleLineRegress EOF )
            // InternalMLRegression.g:355:1: ruleLineRegress EOF
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
    // InternalMLRegression.g:362:1: ruleLineRegress : ( ( rule__LineRegress__Group__0 ) ) ;
    public final void ruleLineRegress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:366:2: ( ( ( rule__LineRegress__Group__0 ) ) )
            // InternalMLRegression.g:367:2: ( ( rule__LineRegress__Group__0 ) )
            {
            // InternalMLRegression.g:367:2: ( ( rule__LineRegress__Group__0 ) )
            // InternalMLRegression.g:368:3: ( rule__LineRegress__Group__0 )
            {
             before(grammarAccess.getLineRegressAccess().getGroup()); 
            // InternalMLRegression.g:369:3: ( rule__LineRegress__Group__0 )
            // InternalMLRegression.g:369:4: rule__LineRegress__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getGroup()); 

            }


            }

        }
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
    // InternalMLRegression.g:378:1: entryRuleDecisionTreeRegressor : ruleDecisionTreeRegressor EOF ;
    public final void entryRuleDecisionTreeRegressor() throws RecognitionException {
        try {
            // InternalMLRegression.g:379:1: ( ruleDecisionTreeRegressor EOF )
            // InternalMLRegression.g:380:1: ruleDecisionTreeRegressor EOF
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
    // InternalMLRegression.g:387:1: ruleDecisionTreeRegressor : ( ( rule__DecisionTreeRegressor__Group__0 ) ) ;
    public final void ruleDecisionTreeRegressor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:391:2: ( ( ( rule__DecisionTreeRegressor__Group__0 ) ) )
            // InternalMLRegression.g:392:2: ( ( rule__DecisionTreeRegressor__Group__0 ) )
            {
            // InternalMLRegression.g:392:2: ( ( rule__DecisionTreeRegressor__Group__0 ) )
            // InternalMLRegression.g:393:3: ( rule__DecisionTreeRegressor__Group__0 )
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getGroup()); 
            // InternalMLRegression.g:394:3: ( rule__DecisionTreeRegressor__Group__0 )
            // InternalMLRegression.g:394:4: rule__DecisionTreeRegressor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecisionTreeRegressor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecisionTreeRegressorAccess().getGroup()); 

            }


            }

        }
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
    // InternalMLRegression.g:403:1: entryRuleSVR : ruleSVR EOF ;
    public final void entryRuleSVR() throws RecognitionException {
        try {
            // InternalMLRegression.g:404:1: ( ruleSVR EOF )
            // InternalMLRegression.g:405:1: ruleSVR EOF
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
    // InternalMLRegression.g:412:1: ruleSVR : ( ( rule__SVR__Group__0 ) ) ;
    public final void ruleSVR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:416:2: ( ( ( rule__SVR__Group__0 ) ) )
            // InternalMLRegression.g:417:2: ( ( rule__SVR__Group__0 ) )
            {
            // InternalMLRegression.g:417:2: ( ( rule__SVR__Group__0 ) )
            // InternalMLRegression.g:418:3: ( rule__SVR__Group__0 )
            {
             before(grammarAccess.getSVRAccess().getGroup()); 
            // InternalMLRegression.g:419:3: ( rule__SVR__Group__0 )
            // InternalMLRegression.g:419:4: rule__SVR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SVR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSVRAccess().getGroup()); 

            }


            }

        }
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
    // InternalMLRegression.g:428:1: entryRuleMeanAbsoluteError : ruleMeanAbsoluteError EOF ;
    public final void entryRuleMeanAbsoluteError() throws RecognitionException {
        try {
            // InternalMLRegression.g:429:1: ( ruleMeanAbsoluteError EOF )
            // InternalMLRegression.g:430:1: ruleMeanAbsoluteError EOF
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
    // InternalMLRegression.g:437:1: ruleMeanAbsoluteError : ( 'mean_absolute_error' ) ;
    public final void ruleMeanAbsoluteError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:441:2: ( ( 'mean_absolute_error' ) )
            // InternalMLRegression.g:442:2: ( 'mean_absolute_error' )
            {
            // InternalMLRegression.g:442:2: ( 'mean_absolute_error' )
            // InternalMLRegression.g:443:3: 'mean_absolute_error'
            {
             before(grammarAccess.getMeanAbsoluteErrorAccess().getMean_absolute_errorKeyword()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMLRegression.g:453:1: entryRuleMeanSquaredError : ruleMeanSquaredError EOF ;
    public final void entryRuleMeanSquaredError() throws RecognitionException {
        try {
            // InternalMLRegression.g:454:1: ( ruleMeanSquaredError EOF )
            // InternalMLRegression.g:455:1: ruleMeanSquaredError EOF
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
    // InternalMLRegression.g:462:1: ruleMeanSquaredError : ( 'mean_squared_error' ) ;
    public final void ruleMeanSquaredError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:466:2: ( ( 'mean_squared_error' ) )
            // InternalMLRegression.g:467:2: ( 'mean_squared_error' )
            {
            // InternalMLRegression.g:467:2: ( 'mean_squared_error' )
            // InternalMLRegression.g:468:3: 'mean_squared_error'
            {
             before(grammarAccess.getMeanSquaredErrorAccess().getMean_squared_errorKeyword()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMLRegression.g:478:1: entryRuleMedianAbsoluteError : ruleMedianAbsoluteError EOF ;
    public final void entryRuleMedianAbsoluteError() throws RecognitionException {
        try {
            // InternalMLRegression.g:479:1: ( ruleMedianAbsoluteError EOF )
            // InternalMLRegression.g:480:1: ruleMedianAbsoluteError EOF
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
    // InternalMLRegression.g:487:1: ruleMedianAbsoluteError : ( 'median_absolute_error' ) ;
    public final void ruleMedianAbsoluteError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:491:2: ( ( 'median_absolute_error' ) )
            // InternalMLRegression.g:492:2: ( 'median_absolute_error' )
            {
            // InternalMLRegression.g:492:2: ( 'median_absolute_error' )
            // InternalMLRegression.g:493:3: 'median_absolute_error'
            {
             before(grammarAccess.getMedianAbsoluteErrorAccess().getMedian_absolute_errorKeyword()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMLRegression.g:503:1: entryRuleNumericValue : ruleNumericValue EOF ;
    public final void entryRuleNumericValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:504:1: ( ruleNumericValue EOF )
            // InternalMLRegression.g:505:1: ruleNumericValue EOF
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
    // InternalMLRegression.g:512:1: ruleNumericValue : ( ( rule__NumericValue__Alternatives ) ) ;
    public final void ruleNumericValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:516:2: ( ( ( rule__NumericValue__Alternatives ) ) )
            // InternalMLRegression.g:517:2: ( ( rule__NumericValue__Alternatives ) )
            {
            // InternalMLRegression.g:517:2: ( ( rule__NumericValue__Alternatives ) )
            // InternalMLRegression.g:518:3: ( rule__NumericValue__Alternatives )
            {
             before(grammarAccess.getNumericValueAccess().getAlternatives()); 
            // InternalMLRegression.g:519:3: ( rule__NumericValue__Alternatives )
            // InternalMLRegression.g:519:4: rule__NumericValue__Alternatives
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
    // InternalMLRegression.g:528:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMLRegression.g:529:1: ( ruleFLOAT EOF )
            // InternalMLRegression.g:530:1: ruleFLOAT EOF
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
    // InternalMLRegression.g:537:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:541:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMLRegression.g:542:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMLRegression.g:542:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMLRegression.g:543:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMLRegression.g:544:3: ( rule__FLOAT__Group__0 )
            // InternalMLRegression.g:544:4: rule__FLOAT__Group__0
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
    // InternalMLRegression.g:553:1: entryRulePERCENT : rulePERCENT EOF ;
    public final void entryRulePERCENT() throws RecognitionException {
        try {
            // InternalMLRegression.g:554:1: ( rulePERCENT EOF )
            // InternalMLRegression.g:555:1: rulePERCENT EOF
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
    // InternalMLRegression.g:562:1: rulePERCENT : ( ( rule__PERCENT__Group__0 ) ) ;
    public final void rulePERCENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:566:2: ( ( ( rule__PERCENT__Group__0 ) ) )
            // InternalMLRegression.g:567:2: ( ( rule__PERCENT__Group__0 ) )
            {
            // InternalMLRegression.g:567:2: ( ( rule__PERCENT__Group__0 ) )
            // InternalMLRegression.g:568:3: ( rule__PERCENT__Group__0 )
            {
             before(grammarAccess.getPERCENTAccess().getGroup()); 
            // InternalMLRegression.g:569:3: ( rule__PERCENT__Group__0 )
            // InternalMLRegression.g:569:4: rule__PERCENT__Group__0
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


    // $ANTLR start "rule__EvaluationType__Alternatives"
    // InternalMLRegression.g:577:1: rule__EvaluationType__Alternatives : ( ( rulePartition ) | ( ruleCrossValidation ) );
    public final void rule__EvaluationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:581:1: ( ( rulePartition ) | ( ruleCrossValidation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:582:2: ( rulePartition )
                    {
                    // InternalMLRegression.g:582:2: ( rulePartition )
                    // InternalMLRegression.g:583:3: rulePartition
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
                    // InternalMLRegression.g:588:2: ( ruleCrossValidation )
                    {
                    // InternalMLRegression.g:588:2: ( ruleCrossValidation )
                    // InternalMLRegression.g:589:3: ruleCrossValidation
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
    // InternalMLRegression.g:598:1: rule__CalculateType__Alternatives : ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) );
    public final void rule__CalculateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:602:1: ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // InternalMLRegression.g:603:2: ( ruleMeanAbsoluteError )
                    {
                    // InternalMLRegression.g:603:2: ( ruleMeanAbsoluteError )
                    // InternalMLRegression.g:604:3: ruleMeanAbsoluteError
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
                    // InternalMLRegression.g:609:2: ( ruleMeanSquaredError )
                    {
                    // InternalMLRegression.g:609:2: ( ruleMeanSquaredError )
                    // InternalMLRegression.g:610:3: ruleMeanSquaredError
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
                    // InternalMLRegression.g:615:2: ( ruleMedianAbsoluteError )
                    {
                    // InternalMLRegression.g:615:2: ( ruleMedianAbsoluteError )
                    // InternalMLRegression.g:616:3: ruleMedianAbsoluteError
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
    // InternalMLRegression.g:625:1: rule__AlgoType__Alternatives : ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) );
    public final void rule__AlgoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:629:1: ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 30:
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
                    // InternalMLRegression.g:630:2: ( ruleLineRegress )
                    {
                    // InternalMLRegression.g:630:2: ( ruleLineRegress )
                    // InternalMLRegression.g:631:3: ruleLineRegress
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
                    // InternalMLRegression.g:636:2: ( ruleSVR )
                    {
                    // InternalMLRegression.g:636:2: ( ruleSVR )
                    // InternalMLRegression.g:637:3: ruleSVR
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
                    // InternalMLRegression.g:642:2: ( ruleDecisionTreeRegressor )
                    {
                    // InternalMLRegression.g:642:2: ( ruleDecisionTreeRegressor )
                    // InternalMLRegression.g:643:3: ruleDecisionTreeRegressor
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
    // InternalMLRegression.g:652:1: rule__NumericValue__Alternatives : ( ( ruleFLOAT ) | ( rulePERCENT ) );
    public final void rule__NumericValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:656:1: ( ( ruleFLOAT ) | ( rulePERCENT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_INT) ) {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5==EOF||LA4_5==15) ) {
                            alt4=1;
                        }
                        else if ( (LA4_5==33) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 15:
                    {
                    alt4=1;
                    }
                    break;
                case 33:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:657:2: ( ruleFLOAT )
                    {
                    // InternalMLRegression.g:657:2: ( ruleFLOAT )
                    // InternalMLRegression.g:658:3: ruleFLOAT
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
                    // InternalMLRegression.g:663:2: ( rulePERCENT )
                    {
                    // InternalMLRegression.g:663:2: ( rulePERCENT )
                    // InternalMLRegression.g:664:3: rulePERCENT
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


    // $ANTLR start "rule__MLRegression__Group__0"
    // InternalMLRegression.g:673:1: rule__MLRegression__Group__0 : rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 ;
    public final void rule__MLRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:677:1: ( rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 )
            // InternalMLRegression.g:678:2: rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1
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
    // InternalMLRegression.g:685:1: rule__MLRegression__Group__0__Impl : ( ( rule__MLRegression__DatasetAssignment_0 ) ) ;
    public final void rule__MLRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:689:1: ( ( ( rule__MLRegression__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:690:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:690:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            // InternalMLRegression.g:691:2: ( rule__MLRegression__DatasetAssignment_0 )
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:692:2: ( rule__MLRegression__DatasetAssignment_0 )
            // InternalMLRegression.g:692:3: rule__MLRegression__DatasetAssignment_0
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
    // InternalMLRegression.g:700:1: rule__MLRegression__Group__1 : rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 ;
    public final void rule__MLRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:704:1: ( rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 )
            // InternalMLRegression.g:705:2: rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2
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
    // InternalMLRegression.g:712:1: rule__MLRegression__Group__1__Impl : ( ( rule__MLRegression__VarsAssignment_1 )? ) ;
    public final void rule__MLRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:716:1: ( ( ( rule__MLRegression__VarsAssignment_1 )? ) )
            // InternalMLRegression.g:717:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            {
            // InternalMLRegression.g:717:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            // InternalMLRegression.g:718:2: ( rule__MLRegression__VarsAssignment_1 )?
            {
             before(grammarAccess.getMLRegressionAccess().getVarsAssignment_1()); 
            // InternalMLRegression.g:719:2: ( rule__MLRegression__VarsAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMLRegression.g:719:3: rule__MLRegression__VarsAssignment_1
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
    // InternalMLRegression.g:727:1: rule__MLRegression__Group__2 : rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 ;
    public final void rule__MLRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:731:1: ( rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 )
            // InternalMLRegression.g:732:2: rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3
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
    // InternalMLRegression.g:739:1: rule__MLRegression__Group__2__Impl : ( ( rule__MLRegression__EvaluationAssignment_2 ) ) ;
    public final void rule__MLRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:743:1: ( ( ( rule__MLRegression__EvaluationAssignment_2 ) ) )
            // InternalMLRegression.g:744:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            {
            // InternalMLRegression.g:744:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            // InternalMLRegression.g:745:2: ( rule__MLRegression__EvaluationAssignment_2 )
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_2()); 
            // InternalMLRegression.g:746:2: ( rule__MLRegression__EvaluationAssignment_2 )
            // InternalMLRegression.g:746:3: rule__MLRegression__EvaluationAssignment_2
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
    // InternalMLRegression.g:754:1: rule__MLRegression__Group__3 : rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 ;
    public final void rule__MLRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:758:1: ( rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 )
            // InternalMLRegression.g:759:2: rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMLRegression.g:766:1: rule__MLRegression__Group__3__Impl : ( ( rule__MLRegression__AlgoAssignment_3 ) ) ;
    public final void rule__MLRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:770:1: ( ( ( rule__MLRegression__AlgoAssignment_3 ) ) )
            // InternalMLRegression.g:771:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            {
            // InternalMLRegression.g:771:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            // InternalMLRegression.g:772:2: ( rule__MLRegression__AlgoAssignment_3 )
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAssignment_3()); 
            // InternalMLRegression.g:773:2: ( rule__MLRegression__AlgoAssignment_3 )
            // InternalMLRegression.g:773:3: rule__MLRegression__AlgoAssignment_3
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
    // InternalMLRegression.g:781:1: rule__MLRegression__Group__4 : rule__MLRegression__Group__4__Impl ;
    public final void rule__MLRegression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:785:1: ( rule__MLRegression__Group__4__Impl )
            // InternalMLRegression.g:786:2: rule__MLRegression__Group__4__Impl
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
    // InternalMLRegression.g:792:1: rule__MLRegression__Group__4__Impl : ( ( rule__MLRegression__CalculateAssignment_4 ) ) ;
    public final void rule__MLRegression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:796:1: ( ( ( rule__MLRegression__CalculateAssignment_4 ) ) )
            // InternalMLRegression.g:797:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            {
            // InternalMLRegression.g:797:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            // InternalMLRegression.g:798:2: ( rule__MLRegression__CalculateAssignment_4 )
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateAssignment_4()); 
            // InternalMLRegression.g:799:2: ( rule__MLRegression__CalculateAssignment_4 )
            // InternalMLRegression.g:799:3: rule__MLRegression__CalculateAssignment_4
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
    // InternalMLRegression.g:808:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:812:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMLRegression.g:813:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:820:1: rule__Dataset__Group__0__Impl : ( 'import' ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:824:1: ( ( 'import' ) )
            // InternalMLRegression.g:825:1: ( 'import' )
            {
            // InternalMLRegression.g:825:1: ( 'import' )
            // InternalMLRegression.g:826:2: 'import'
            {
             before(grammarAccess.getDatasetAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMLRegression.g:835:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:839:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMLRegression.g:840:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMLRegression.g:847:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__DataPathAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:851:1: ( ( ( rule__Dataset__DataPathAssignment_1 ) ) )
            // InternalMLRegression.g:852:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            {
            // InternalMLRegression.g:852:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            // InternalMLRegression.g:853:2: ( rule__Dataset__DataPathAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getDataPathAssignment_1()); 
            // InternalMLRegression.g:854:2: ( rule__Dataset__DataPathAssignment_1 )
            // InternalMLRegression.g:854:3: rule__Dataset__DataPathAssignment_1
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
    // InternalMLRegression.g:862:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl rule__Dataset__Group__3 ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:866:1: ( rule__Dataset__Group__2__Impl rule__Dataset__Group__3 )
            // InternalMLRegression.g:867:2: rule__Dataset__Group__2__Impl rule__Dataset__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMLRegression.g:874:1: rule__Dataset__Group__2__Impl : ( ( rule__Dataset__SeparatorAssignment_2 )? ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:878:1: ( ( ( rule__Dataset__SeparatorAssignment_2 )? ) )
            // InternalMLRegression.g:879:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            {
            // InternalMLRegression.g:879:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            // InternalMLRegression.g:880:2: ( rule__Dataset__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getDatasetAccess().getSeparatorAssignment_2()); 
            // InternalMLRegression.g:881:2: ( rule__Dataset__SeparatorAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMLRegression.g:881:3: rule__Dataset__SeparatorAssignment_2
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
    // InternalMLRegression.g:889:1: rule__Dataset__Group__3 : rule__Dataset__Group__3__Impl ;
    public final void rule__Dataset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:893:1: ( rule__Dataset__Group__3__Impl )
            // InternalMLRegression.g:894:2: rule__Dataset__Group__3__Impl
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
    // InternalMLRegression.g:900:1: rule__Dataset__Group__3__Impl : ( ';' ) ;
    public final void rule__Dataset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:904:1: ( ( ';' ) )
            // InternalMLRegression.g:905:1: ( ';' )
            {
            // InternalMLRegression.g:905:1: ( ';' )
            // InternalMLRegression.g:906:2: ';'
            {
             before(grammarAccess.getDatasetAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMLRegression.g:916:1: rule__Partition__Group__0 : rule__Partition__Group__0__Impl rule__Partition__Group__1 ;
    public final void rule__Partition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:920:1: ( rule__Partition__Group__0__Impl rule__Partition__Group__1 )
            // InternalMLRegression.g:921:2: rule__Partition__Group__0__Impl rule__Partition__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:928:1: rule__Partition__Group__0__Impl : ( 'partition' ) ;
    public final void rule__Partition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:932:1: ( ( 'partition' ) )
            // InternalMLRegression.g:933:1: ( 'partition' )
            {
            // InternalMLRegression.g:933:1: ( 'partition' )
            // InternalMLRegression.g:934:2: 'partition'
            {
             before(grammarAccess.getPartitionAccess().getPartitionKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMLRegression.g:943:1: rule__Partition__Group__1 : rule__Partition__Group__1__Impl rule__Partition__Group__2 ;
    public final void rule__Partition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:947:1: ( rule__Partition__Group__1__Impl rule__Partition__Group__2 )
            // InternalMLRegression.g:948:2: rule__Partition__Group__1__Impl rule__Partition__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:955:1: rule__Partition__Group__1__Impl : ( ':' ) ;
    public final void rule__Partition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:959:1: ( ( ':' ) )
            // InternalMLRegression.g:960:1: ( ':' )
            {
            // InternalMLRegression.g:960:1: ( ':' )
            // InternalMLRegression.g:961:2: ':'
            {
             before(grammarAccess.getPartitionAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMLRegression.g:970:1: rule__Partition__Group__2 : rule__Partition__Group__2__Impl rule__Partition__Group__3 ;
    public final void rule__Partition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:974:1: ( rule__Partition__Group__2__Impl rule__Partition__Group__3 )
            // InternalMLRegression.g:975:2: rule__Partition__Group__2__Impl rule__Partition__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:982:1: rule__Partition__Group__2__Impl : ( ( rule__Partition__TestAssignment_2 ) ) ;
    public final void rule__Partition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:986:1: ( ( ( rule__Partition__TestAssignment_2 ) ) )
            // InternalMLRegression.g:987:1: ( ( rule__Partition__TestAssignment_2 ) )
            {
            // InternalMLRegression.g:987:1: ( ( rule__Partition__TestAssignment_2 ) )
            // InternalMLRegression.g:988:2: ( rule__Partition__TestAssignment_2 )
            {
             before(grammarAccess.getPartitionAccess().getTestAssignment_2()); 
            // InternalMLRegression.g:989:2: ( rule__Partition__TestAssignment_2 )
            // InternalMLRegression.g:989:3: rule__Partition__TestAssignment_2
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
    // InternalMLRegression.g:997:1: rule__Partition__Group__3 : rule__Partition__Group__3__Impl ;
    public final void rule__Partition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1001:1: ( rule__Partition__Group__3__Impl )
            // InternalMLRegression.g:1002:2: rule__Partition__Group__3__Impl
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
    // InternalMLRegression.g:1008:1: rule__Partition__Group__3__Impl : ( ';' ) ;
    public final void rule__Partition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1012:1: ( ( ';' ) )
            // InternalMLRegression.g:1013:1: ( ';' )
            {
            // InternalMLRegression.g:1013:1: ( ';' )
            // InternalMLRegression.g:1014:2: ';'
            {
             before(grammarAccess.getPartitionAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMLRegression.g:1024:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1028:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMLRegression.g:1029:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1036:1: rule__CrossValidation__Group__0__Impl : ( 'cross_validation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1040:1: ( ( 'cross_validation' ) )
            // InternalMLRegression.g:1041:1: ( 'cross_validation' )
            {
            // InternalMLRegression.g:1041:1: ( 'cross_validation' )
            // InternalMLRegression.g:1042:2: 'cross_validation'
            {
             before(grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1051:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1055:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMLRegression.g:1056:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:1063:1: rule__CrossValidation__Group__1__Impl : ( '(' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1067:1: ( ( '(' ) )
            // InternalMLRegression.g:1068:1: ( '(' )
            {
            // InternalMLRegression.g:1068:1: ( '(' )
            // InternalMLRegression.g:1069:2: '('
            {
             before(grammarAccess.getCrossValidationAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalMLRegression.g:1078:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1082:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMLRegression.g:1083:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:1090:1: rule__CrossValidation__Group__2__Impl : ( ( rule__CrossValidation__KAssignment_2 ) ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1094:1: ( ( ( rule__CrossValidation__KAssignment_2 ) ) )
            // InternalMLRegression.g:1095:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            {
            // InternalMLRegression.g:1095:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            // InternalMLRegression.g:1096:2: ( rule__CrossValidation__KAssignment_2 )
            {
             before(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 
            // InternalMLRegression.g:1097:2: ( rule__CrossValidation__KAssignment_2 )
            // InternalMLRegression.g:1097:3: rule__CrossValidation__KAssignment_2
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
    // InternalMLRegression.g:1105:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1109:1: ( rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 )
            // InternalMLRegression.g:1110:2: rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CrossValidation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__4();

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
    // InternalMLRegression.g:1117:1: rule__CrossValidation__Group__3__Impl : ( ')' ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1121:1: ( ( ')' ) )
            // InternalMLRegression.g:1122:1: ( ')' )
            {
            // InternalMLRegression.g:1122:1: ( ')' )
            // InternalMLRegression.g:1123:2: ')'
            {
             before(grammarAccess.getCrossValidationAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__CrossValidation__Group__4"
    // InternalMLRegression.g:1132:1: rule__CrossValidation__Group__4 : rule__CrossValidation__Group__4__Impl ;
    public final void rule__CrossValidation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1136:1: ( rule__CrossValidation__Group__4__Impl )
            // InternalMLRegression.g:1137:2: rule__CrossValidation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__4__Impl();

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
    // $ANTLR end "rule__CrossValidation__Group__4"


    // $ANTLR start "rule__CrossValidation__Group__4__Impl"
    // InternalMLRegression.g:1143:1: rule__CrossValidation__Group__4__Impl : ( ';' ) ;
    public final void rule__CrossValidation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1147:1: ( ( ';' ) )
            // InternalMLRegression.g:1148:1: ( ';' )
            {
            // InternalMLRegression.g:1148:1: ( ';' )
            // InternalMLRegression.g:1149:2: ';'
            {
             before(grammarAccess.getCrossValidationAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__4__Impl"


    // $ANTLR start "rule__Variables__Group__0"
    // InternalMLRegression.g:1159:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1163:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalMLRegression.g:1164:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
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
    // InternalMLRegression.g:1171:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__PredictivesAssignment_0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1175:1: ( ( ( rule__Variables__PredictivesAssignment_0 ) ) )
            // InternalMLRegression.g:1176:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            {
            // InternalMLRegression.g:1176:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            // InternalMLRegression.g:1177:2: ( rule__Variables__PredictivesAssignment_0 )
            {
             before(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 
            // InternalMLRegression.g:1178:2: ( rule__Variables__PredictivesAssignment_0 )
            // InternalMLRegression.g:1178:3: rule__Variables__PredictivesAssignment_0
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
    // InternalMLRegression.g:1186:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1190:1: ( rule__Variables__Group__1__Impl )
            // InternalMLRegression.g:1191:2: rule__Variables__Group__1__Impl
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
    // InternalMLRegression.g:1197:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__TargetsAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1201:1: ( ( ( rule__Variables__TargetsAssignment_1 ) ) )
            // InternalMLRegression.g:1202:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            {
            // InternalMLRegression.g:1202:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            // InternalMLRegression.g:1203:2: ( rule__Variables__TargetsAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 
            // InternalMLRegression.g:1204:2: ( rule__Variables__TargetsAssignment_1 )
            // InternalMLRegression.g:1204:3: rule__Variables__TargetsAssignment_1
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
    // InternalMLRegression.g:1213:1: rule__ListePredictiveVar__Group__0 : rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 ;
    public final void rule__ListePredictiveVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1217:1: ( rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 )
            // InternalMLRegression.g:1218:2: rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1225:1: rule__ListePredictiveVar__Group__0__Impl : ( 'predictive_vars' ) ;
    public final void rule__ListePredictiveVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1229:1: ( ( 'predictive_vars' ) )
            // InternalMLRegression.g:1230:1: ( 'predictive_vars' )
            {
            // InternalMLRegression.g:1230:1: ( 'predictive_vars' )
            // InternalMLRegression.g:1231:2: 'predictive_vars'
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:1240:1: rule__ListePredictiveVar__Group__1 : rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 ;
    public final void rule__ListePredictiveVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1244:1: ( rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 )
            // InternalMLRegression.g:1245:2: rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1252:1: rule__ListePredictiveVar__Group__1__Impl : ( ':' ) ;
    public final void rule__ListePredictiveVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1256:1: ( ( ':' ) )
            // InternalMLRegression.g:1257:1: ( ':' )
            {
            // InternalMLRegression.g:1257:1: ( ':' )
            // InternalMLRegression.g:1258:2: ':'
            {
             before(grammarAccess.getListePredictiveVarAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMLRegression.g:1267:1: rule__ListePredictiveVar__Group__2 : rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 ;
    public final void rule__ListePredictiveVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1271:1: ( rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 )
            // InternalMLRegression.g:1272:2: rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3
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
    // InternalMLRegression.g:1279:1: rule__ListePredictiveVar__Group__2__Impl : ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) ) ;
    public final void rule__ListePredictiveVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1283:1: ( ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) ) )
            // InternalMLRegression.g:1284:1: ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1284:1: ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) )
            // InternalMLRegression.g:1285:2: ( rule__ListePredictiveVar__PredVarAssignment_2 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_2()); 
            // InternalMLRegression.g:1286:2: ( rule__ListePredictiveVar__PredVarAssignment_2 )
            // InternalMLRegression.g:1286:3: rule__ListePredictiveVar__PredVarAssignment_2
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
    // InternalMLRegression.g:1294:1: rule__ListePredictiveVar__Group__3 : rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 ;
    public final void rule__ListePredictiveVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1298:1: ( rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 )
            // InternalMLRegression.g:1299:2: rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4
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
    // InternalMLRegression.g:1306:1: rule__ListePredictiveVar__Group__3__Impl : ( ( rule__ListePredictiveVar__Group_3__0 )* ) ;
    public final void rule__ListePredictiveVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1310:1: ( ( ( rule__ListePredictiveVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1311:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1311:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            // InternalMLRegression.g:1312:2: ( rule__ListePredictiveVar__Group_3__0 )*
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1313:2: ( rule__ListePredictiveVar__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMLRegression.g:1313:3: rule__ListePredictiveVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ListePredictiveVar__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMLRegression.g:1321:1: rule__ListePredictiveVar__Group__4 : rule__ListePredictiveVar__Group__4__Impl ;
    public final void rule__ListePredictiveVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1325:1: ( rule__ListePredictiveVar__Group__4__Impl )
            // InternalMLRegression.g:1326:2: rule__ListePredictiveVar__Group__4__Impl
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
    // InternalMLRegression.g:1332:1: rule__ListePredictiveVar__Group__4__Impl : ( ';' ) ;
    public final void rule__ListePredictiveVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1336:1: ( ( ';' ) )
            // InternalMLRegression.g:1337:1: ( ';' )
            {
            // InternalMLRegression.g:1337:1: ( ';' )
            // InternalMLRegression.g:1338:2: ';'
            {
             before(grammarAccess.getListePredictiveVarAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMLRegression.g:1348:1: rule__ListePredictiveVar__Group_3__0 : rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 ;
    public final void rule__ListePredictiveVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1352:1: ( rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 )
            // InternalMLRegression.g:1353:2: rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1360:1: rule__ListePredictiveVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListePredictiveVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1364:1: ( ( ',' ) )
            // InternalMLRegression.g:1365:1: ( ',' )
            {
            // InternalMLRegression.g:1365:1: ( ',' )
            // InternalMLRegression.g:1366:2: ','
            {
             before(grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMLRegression.g:1375:1: rule__ListePredictiveVar__Group_3__1 : rule__ListePredictiveVar__Group_3__1__Impl ;
    public final void rule__ListePredictiveVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1379:1: ( rule__ListePredictiveVar__Group_3__1__Impl )
            // InternalMLRegression.g:1380:2: rule__ListePredictiveVar__Group_3__1__Impl
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
    // InternalMLRegression.g:1386:1: rule__ListePredictiveVar__Group_3__1__Impl : ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) ;
    public final void rule__ListePredictiveVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1390:1: ( ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1391:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1391:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            // InternalMLRegression.g:1392:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_3_1()); 
            // InternalMLRegression.g:1393:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            // InternalMLRegression.g:1393:3: rule__ListePredictiveVar__PredVarAssignment_3_1
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
    // InternalMLRegression.g:1402:1: rule__TargetVar__Group__0 : rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 ;
    public final void rule__TargetVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1406:1: ( rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 )
            // InternalMLRegression.g:1407:2: rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1414:1: rule__TargetVar__Group__0__Impl : ( 'target_vars' ) ;
    public final void rule__TargetVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1418:1: ( ( 'target_vars' ) )
            // InternalMLRegression.g:1419:1: ( 'target_vars' )
            {
            // InternalMLRegression.g:1419:1: ( 'target_vars' )
            // InternalMLRegression.g:1420:2: 'target_vars'
            {
             before(grammarAccess.getTargetVarAccess().getTarget_varsKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMLRegression.g:1429:1: rule__TargetVar__Group__1 : rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 ;
    public final void rule__TargetVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1433:1: ( rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 )
            // InternalMLRegression.g:1434:2: rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1441:1: rule__TargetVar__Group__1__Impl : ( ':' ) ;
    public final void rule__TargetVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1445:1: ( ( ':' ) )
            // InternalMLRegression.g:1446:1: ( ':' )
            {
            // InternalMLRegression.g:1446:1: ( ':' )
            // InternalMLRegression.g:1447:2: ':'
            {
             before(grammarAccess.getTargetVarAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMLRegression.g:1456:1: rule__TargetVar__Group__2 : rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 ;
    public final void rule__TargetVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1460:1: ( rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 )
            // InternalMLRegression.g:1461:2: rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3
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
    // InternalMLRegression.g:1468:1: rule__TargetVar__Group__2__Impl : ( ( rule__TargetVar__TargetVarAssignment_2 ) ) ;
    public final void rule__TargetVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1472:1: ( ( ( rule__TargetVar__TargetVarAssignment_2 ) ) )
            // InternalMLRegression.g:1473:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1473:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            // InternalMLRegression.g:1474:2: ( rule__TargetVar__TargetVarAssignment_2 )
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarAssignment_2()); 
            // InternalMLRegression.g:1475:2: ( rule__TargetVar__TargetVarAssignment_2 )
            // InternalMLRegression.g:1475:3: rule__TargetVar__TargetVarAssignment_2
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
    // InternalMLRegression.g:1483:1: rule__TargetVar__Group__3 : rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 ;
    public final void rule__TargetVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1487:1: ( rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 )
            // InternalMLRegression.g:1488:2: rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4
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
    // InternalMLRegression.g:1495:1: rule__TargetVar__Group__3__Impl : ( ( rule__TargetVar__Group_3__0 )* ) ;
    public final void rule__TargetVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1499:1: ( ( ( rule__TargetVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1500:1: ( ( rule__TargetVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1500:1: ( ( rule__TargetVar__Group_3__0 )* )
            // InternalMLRegression.g:1501:2: ( rule__TargetVar__Group_3__0 )*
            {
             before(grammarAccess.getTargetVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1502:2: ( rule__TargetVar__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMLRegression.g:1502:3: rule__TargetVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TargetVar__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMLRegression.g:1510:1: rule__TargetVar__Group__4 : rule__TargetVar__Group__4__Impl ;
    public final void rule__TargetVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1514:1: ( rule__TargetVar__Group__4__Impl )
            // InternalMLRegression.g:1515:2: rule__TargetVar__Group__4__Impl
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
    // InternalMLRegression.g:1521:1: rule__TargetVar__Group__4__Impl : ( ';' ) ;
    public final void rule__TargetVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1525:1: ( ( ';' ) )
            // InternalMLRegression.g:1526:1: ( ';' )
            {
            // InternalMLRegression.g:1526:1: ( ';' )
            // InternalMLRegression.g:1527:2: ';'
            {
             before(grammarAccess.getTargetVarAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMLRegression.g:1537:1: rule__TargetVar__Group_3__0 : rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 ;
    public final void rule__TargetVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1541:1: ( rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 )
            // InternalMLRegression.g:1542:2: rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1549:1: rule__TargetVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TargetVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1553:1: ( ( ',' ) )
            // InternalMLRegression.g:1554:1: ( ',' )
            {
            // InternalMLRegression.g:1554:1: ( ',' )
            // InternalMLRegression.g:1555:2: ','
            {
             before(grammarAccess.getTargetVarAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMLRegression.g:1564:1: rule__TargetVar__Group_3__1 : rule__TargetVar__Group_3__1__Impl ;
    public final void rule__TargetVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1568:1: ( rule__TargetVar__Group_3__1__Impl )
            // InternalMLRegression.g:1569:2: rule__TargetVar__Group_3__1__Impl
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
    // InternalMLRegression.g:1575:1: rule__TargetVar__Group_3__1__Impl : ( ( rule__TargetVar__TargetVarAssignment_3_1 ) ) ;
    public final void rule__TargetVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1579:1: ( ( ( rule__TargetVar__TargetVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1580:1: ( ( rule__TargetVar__TargetVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1580:1: ( ( rule__TargetVar__TargetVarAssignment_3_1 ) )
            // InternalMLRegression.g:1581:2: ( rule__TargetVar__TargetVarAssignment_3_1 )
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarAssignment_3_1()); 
            // InternalMLRegression.g:1582:2: ( rule__TargetVar__TargetVarAssignment_3_1 )
            // InternalMLRegression.g:1582:3: rule__TargetVar__TargetVarAssignment_3_1
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
    // InternalMLRegression.g:1591:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1595:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalMLRegression.g:1596:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1603:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1607:1: ( ( 'calculate' ) )
            // InternalMLRegression.g:1608:1: ( 'calculate' )
            {
            // InternalMLRegression.g:1608:1: ( 'calculate' )
            // InternalMLRegression.g:1609:2: 'calculate'
            {
             before(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMLRegression.g:1618:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1622:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalMLRegression.g:1623:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
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
    // InternalMLRegression.g:1630:1: rule__Calculate__Group__1__Impl : ( ':' ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1634:1: ( ( ':' ) )
            // InternalMLRegression.g:1635:1: ( ':' )
            {
            // InternalMLRegression.g:1635:1: ( ':' )
            // InternalMLRegression.g:1636:2: ':'
            {
             before(grammarAccess.getCalculateAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMLRegression.g:1645:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1649:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalMLRegression.g:1650:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:1657:1: rule__Calculate__Group__2__Impl : ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1661:1: ( ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) )
            // InternalMLRegression.g:1662:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            {
            // InternalMLRegression.g:1662:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            // InternalMLRegression.g:1663:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            {
             before(grammarAccess.getCalculateAccess().getCalculateTypeAssignment_2()); 
            // InternalMLRegression.g:1664:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            // InternalMLRegression.g:1664:3: rule__Calculate__CalculateTypeAssignment_2
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
    // InternalMLRegression.g:1672:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1676:1: ( rule__Calculate__Group__3__Impl )
            // InternalMLRegression.g:1677:2: rule__Calculate__Group__3__Impl
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
    // InternalMLRegression.g:1683:1: rule__Calculate__Group__3__Impl : ( ';' ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1687:1: ( ( ';' ) )
            // InternalMLRegression.g:1688:1: ( ';' )
            {
            // InternalMLRegression.g:1688:1: ( ';' )
            // InternalMLRegression.g:1689:2: ';'
            {
             before(grammarAccess.getCalculateAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMLRegression.g:1699:1: rule__Algo__Group__0 : rule__Algo__Group__0__Impl rule__Algo__Group__1 ;
    public final void rule__Algo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1703:1: ( rule__Algo__Group__0__Impl rule__Algo__Group__1 )
            // InternalMLRegression.g:1704:2: rule__Algo__Group__0__Impl rule__Algo__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1711:1: rule__Algo__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1715:1: ( ( 'algorithm' ) )
            // InternalMLRegression.g:1716:1: ( 'algorithm' )
            {
            // InternalMLRegression.g:1716:1: ( 'algorithm' )
            // InternalMLRegression.g:1717:2: 'algorithm'
            {
             before(grammarAccess.getAlgoAccess().getAlgorithmKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMLRegression.g:1726:1: rule__Algo__Group__1 : rule__Algo__Group__1__Impl rule__Algo__Group__2 ;
    public final void rule__Algo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1730:1: ( rule__Algo__Group__1__Impl rule__Algo__Group__2 )
            // InternalMLRegression.g:1731:2: rule__Algo__Group__1__Impl rule__Algo__Group__2
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
    // InternalMLRegression.g:1738:1: rule__Algo__Group__1__Impl : ( ':' ) ;
    public final void rule__Algo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1742:1: ( ( ':' ) )
            // InternalMLRegression.g:1743:1: ( ':' )
            {
            // InternalMLRegression.g:1743:1: ( ':' )
            // InternalMLRegression.g:1744:2: ':'
            {
             before(grammarAccess.getAlgoAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMLRegression.g:1753:1: rule__Algo__Group__2 : rule__Algo__Group__2__Impl rule__Algo__Group__3 ;
    public final void rule__Algo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1757:1: ( rule__Algo__Group__2__Impl rule__Algo__Group__3 )
            // InternalMLRegression.g:1758:2: rule__Algo__Group__2__Impl rule__Algo__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMLRegression.g:1765:1: rule__Algo__Group__2__Impl : ( ( rule__Algo__AlgoAssignment_2 ) ) ;
    public final void rule__Algo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1769:1: ( ( ( rule__Algo__AlgoAssignment_2 ) ) )
            // InternalMLRegression.g:1770:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            {
            // InternalMLRegression.g:1770:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            // InternalMLRegression.g:1771:2: ( rule__Algo__AlgoAssignment_2 )
            {
             before(grammarAccess.getAlgoAccess().getAlgoAssignment_2()); 
            // InternalMLRegression.g:1772:2: ( rule__Algo__AlgoAssignment_2 )
            // InternalMLRegression.g:1772:3: rule__Algo__AlgoAssignment_2
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
    // InternalMLRegression.g:1780:1: rule__Algo__Group__3 : rule__Algo__Group__3__Impl rule__Algo__Group__4 ;
    public final void rule__Algo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1784:1: ( rule__Algo__Group__3__Impl rule__Algo__Group__4 )
            // InternalMLRegression.g:1785:2: rule__Algo__Group__3__Impl rule__Algo__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Algo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__4();

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
    // InternalMLRegression.g:1792:1: rule__Algo__Group__3__Impl : ( ',' ) ;
    public final void rule__Algo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1796:1: ( ( ',' ) )
            // InternalMLRegression.g:1797:1: ( ',' )
            {
            // InternalMLRegression.g:1797:1: ( ',' )
            // InternalMLRegression.g:1798:2: ','
            {
             before(grammarAccess.getAlgoAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getCommaKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Algo__Group__4"
    // InternalMLRegression.g:1807:1: rule__Algo__Group__4 : rule__Algo__Group__4__Impl rule__Algo__Group__5 ;
    public final void rule__Algo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1811:1: ( rule__Algo__Group__4__Impl rule__Algo__Group__5 )
            // InternalMLRegression.g:1812:2: rule__Algo__Group__4__Impl rule__Algo__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Algo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__5();

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
    // $ANTLR end "rule__Algo__Group__4"


    // $ANTLR start "rule__Algo__Group__4__Impl"
    // InternalMLRegression.g:1819:1: rule__Algo__Group__4__Impl : ( ( rule__Algo__LeftSidePredictAssignment_4 ) ) ;
    public final void rule__Algo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1823:1: ( ( ( rule__Algo__LeftSidePredictAssignment_4 ) ) )
            // InternalMLRegression.g:1824:1: ( ( rule__Algo__LeftSidePredictAssignment_4 ) )
            {
            // InternalMLRegression.g:1824:1: ( ( rule__Algo__LeftSidePredictAssignment_4 ) )
            // InternalMLRegression.g:1825:2: ( rule__Algo__LeftSidePredictAssignment_4 )
            {
             before(grammarAccess.getAlgoAccess().getLeftSidePredictAssignment_4()); 
            // InternalMLRegression.g:1826:2: ( rule__Algo__LeftSidePredictAssignment_4 )
            // InternalMLRegression.g:1826:3: rule__Algo__LeftSidePredictAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Algo__LeftSidePredictAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAlgoAccess().getLeftSidePredictAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo__Group__4__Impl"


    // $ANTLR start "rule__Algo__Group__5"
    // InternalMLRegression.g:1834:1: rule__Algo__Group__5 : rule__Algo__Group__5__Impl rule__Algo__Group__6 ;
    public final void rule__Algo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1838:1: ( rule__Algo__Group__5__Impl rule__Algo__Group__6 )
            // InternalMLRegression.g:1839:2: rule__Algo__Group__5__Impl rule__Algo__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Algo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__6();

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
    // $ANTLR end "rule__Algo__Group__5"


    // $ANTLR start "rule__Algo__Group__5__Impl"
    // InternalMLRegression.g:1846:1: rule__Algo__Group__5__Impl : ( '=' ) ;
    public final void rule__Algo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1850:1: ( ( '=' ) )
            // InternalMLRegression.g:1851:1: ( '=' )
            {
            // InternalMLRegression.g:1851:1: ( '=' )
            // InternalMLRegression.g:1852:2: '='
            {
             before(grammarAccess.getAlgoAccess().getEqualsSignKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo__Group__5__Impl"


    // $ANTLR start "rule__Algo__Group__6"
    // InternalMLRegression.g:1861:1: rule__Algo__Group__6 : rule__Algo__Group__6__Impl rule__Algo__Group__7 ;
    public final void rule__Algo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1865:1: ( rule__Algo__Group__6__Impl rule__Algo__Group__7 )
            // InternalMLRegression.g:1866:2: rule__Algo__Group__6__Impl rule__Algo__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Algo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__7();

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
    // $ANTLR end "rule__Algo__Group__6"


    // $ANTLR start "rule__Algo__Group__6__Impl"
    // InternalMLRegression.g:1873:1: rule__Algo__Group__6__Impl : ( 'predict' ) ;
    public final void rule__Algo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1877:1: ( ( 'predict' ) )
            // InternalMLRegression.g:1878:1: ( 'predict' )
            {
            // InternalMLRegression.g:1878:1: ( 'predict' )
            // InternalMLRegression.g:1879:2: 'predict'
            {
             before(grammarAccess.getAlgoAccess().getPredictKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getPredictKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo__Group__6__Impl"


    // $ANTLR start "rule__Algo__Group__7"
    // InternalMLRegression.g:1888:1: rule__Algo__Group__7 : rule__Algo__Group__7__Impl rule__Algo__Group__8 ;
    public final void rule__Algo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1892:1: ( rule__Algo__Group__7__Impl rule__Algo__Group__8 )
            // InternalMLRegression.g:1893:2: rule__Algo__Group__7__Impl rule__Algo__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Algo__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algo__Group__8();

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
    // $ANTLR end "rule__Algo__Group__7"


    // $ANTLR start "rule__Algo__Group__7__Impl"
    // InternalMLRegression.g:1900:1: rule__Algo__Group__7__Impl : ( '()' ) ;
    public final void rule__Algo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1904:1: ( ( '()' ) )
            // InternalMLRegression.g:1905:1: ( '()' )
            {
            // InternalMLRegression.g:1905:1: ( '()' )
            // InternalMLRegression.g:1906:2: '()'
            {
             before(grammarAccess.getAlgoAccess().getLeftParenthesisRightParenthesisKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getLeftParenthesisRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo__Group__7__Impl"


    // $ANTLR start "rule__Algo__Group__8"
    // InternalMLRegression.g:1915:1: rule__Algo__Group__8 : rule__Algo__Group__8__Impl ;
    public final void rule__Algo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1919:1: ( rule__Algo__Group__8__Impl )
            // InternalMLRegression.g:1920:2: rule__Algo__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algo__Group__8__Impl();

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
    // $ANTLR end "rule__Algo__Group__8"


    // $ANTLR start "rule__Algo__Group__8__Impl"
    // InternalMLRegression.g:1926:1: rule__Algo__Group__8__Impl : ( ';' ) ;
    public final void rule__Algo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1930:1: ( ( ';' ) )
            // InternalMLRegression.g:1931:1: ( ';' )
            {
            // InternalMLRegression.g:1931:1: ( ';' )
            // InternalMLRegression.g:1932:2: ';'
            {
             before(grammarAccess.getAlgoAccess().getSemicolonKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo__Group__8__Impl"


    // $ANTLR start "rule__LineRegress__Group__0"
    // InternalMLRegression.g:1942:1: rule__LineRegress__Group__0 : rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 ;
    public final void rule__LineRegress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1946:1: ( rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 )
            // InternalMLRegression.g:1947:2: rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__LineRegress__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__1();

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
    // $ANTLR end "rule__LineRegress__Group__0"


    // $ANTLR start "rule__LineRegress__Group__0__Impl"
    // InternalMLRegression.g:1954:1: rule__LineRegress__Group__0__Impl : ( 'line_regress' ) ;
    public final void rule__LineRegress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1958:1: ( ( 'line_regress' ) )
            // InternalMLRegression.g:1959:1: ( 'line_regress' )
            {
            // InternalMLRegression.g:1959:1: ( 'line_regress' )
            // InternalMLRegression.g:1960:2: 'line_regress'
            {
             before(grammarAccess.getLineRegressAccess().getLine_regressKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getLine_regressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__0__Impl"


    // $ANTLR start "rule__LineRegress__Group__1"
    // InternalMLRegression.g:1969:1: rule__LineRegress__Group__1 : rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 ;
    public final void rule__LineRegress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1973:1: ( rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 )
            // InternalMLRegression.g:1974:2: rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__LineRegress__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__2();

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
    // $ANTLR end "rule__LineRegress__Group__1"


    // $ANTLR start "rule__LineRegress__Group__1__Impl"
    // InternalMLRegression.g:1981:1: rule__LineRegress__Group__1__Impl : ( '(' ) ;
    public final void rule__LineRegress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1985:1: ( ( '(' ) )
            // InternalMLRegression.g:1986:1: ( '(' )
            {
            // InternalMLRegression.g:1986:1: ( '(' )
            // InternalMLRegression.g:1987:2: '('
            {
             before(grammarAccess.getLineRegressAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__1__Impl"


    // $ANTLR start "rule__LineRegress__Group__2"
    // InternalMLRegression.g:1996:1: rule__LineRegress__Group__2 : rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 ;
    public final void rule__LineRegress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2000:1: ( rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 )
            // InternalMLRegression.g:2001:2: rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__LineRegress__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__3();

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
    // $ANTLR end "rule__LineRegress__Group__2"


    // $ANTLR start "rule__LineRegress__Group__2__Impl"
    // InternalMLRegression.g:2008:1: rule__LineRegress__Group__2__Impl : ( ( rule__LineRegress__RandAssignment_2 ) ) ;
    public final void rule__LineRegress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2012:1: ( ( ( rule__LineRegress__RandAssignment_2 ) ) )
            // InternalMLRegression.g:2013:1: ( ( rule__LineRegress__RandAssignment_2 ) )
            {
            // InternalMLRegression.g:2013:1: ( ( rule__LineRegress__RandAssignment_2 ) )
            // InternalMLRegression.g:2014:2: ( rule__LineRegress__RandAssignment_2 )
            {
             before(grammarAccess.getLineRegressAccess().getRandAssignment_2()); 
            // InternalMLRegression.g:2015:2: ( rule__LineRegress__RandAssignment_2 )
            // InternalMLRegression.g:2015:3: rule__LineRegress__RandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__RandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getRandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__2__Impl"


    // $ANTLR start "rule__LineRegress__Group__3"
    // InternalMLRegression.g:2023:1: rule__LineRegress__Group__3 : rule__LineRegress__Group__3__Impl ;
    public final void rule__LineRegress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2027:1: ( rule__LineRegress__Group__3__Impl )
            // InternalMLRegression.g:2028:2: rule__LineRegress__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__3__Impl();

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
    // $ANTLR end "rule__LineRegress__Group__3"


    // $ANTLR start "rule__LineRegress__Group__3__Impl"
    // InternalMLRegression.g:2034:1: rule__LineRegress__Group__3__Impl : ( ')' ) ;
    public final void rule__LineRegress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2038:1: ( ( ')' ) )
            // InternalMLRegression.g:2039:1: ( ')' )
            {
            // InternalMLRegression.g:2039:1: ( ')' )
            // InternalMLRegression.g:2040:2: ')'
            {
             before(grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__3__Impl"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__0"
    // InternalMLRegression.g:2050:1: rule__DecisionTreeRegressor__Group__0 : rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1 ;
    public final void rule__DecisionTreeRegressor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2054:1: ( rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1 )
            // InternalMLRegression.g:2055:2: rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DecisionTreeRegressor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionTreeRegressor__Group__1();

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
    // $ANTLR end "rule__DecisionTreeRegressor__Group__0"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__0__Impl"
    // InternalMLRegression.g:2062:1: rule__DecisionTreeRegressor__Group__0__Impl : ( 'decision_tree_regressor' ) ;
    public final void rule__DecisionTreeRegressor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2066:1: ( ( 'decision_tree_regressor' ) )
            // InternalMLRegression.g:2067:1: ( 'decision_tree_regressor' )
            {
            // InternalMLRegression.g:2067:1: ( 'decision_tree_regressor' )
            // InternalMLRegression.g:2068:2: 'decision_tree_regressor'
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTreeRegressor__Group__0__Impl"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__1"
    // InternalMLRegression.g:2077:1: rule__DecisionTreeRegressor__Group__1 : rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2 ;
    public final void rule__DecisionTreeRegressor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2081:1: ( rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2 )
            // InternalMLRegression.g:2082:2: rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DecisionTreeRegressor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionTreeRegressor__Group__2();

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
    // $ANTLR end "rule__DecisionTreeRegressor__Group__1"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__1__Impl"
    // InternalMLRegression.g:2089:1: rule__DecisionTreeRegressor__Group__1__Impl : ( '(' ) ;
    public final void rule__DecisionTreeRegressor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2093:1: ( ( '(' ) )
            // InternalMLRegression.g:2094:1: ( '(' )
            {
            // InternalMLRegression.g:2094:1: ( '(' )
            // InternalMLRegression.g:2095:2: '('
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTreeRegressor__Group__1__Impl"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__2"
    // InternalMLRegression.g:2104:1: rule__DecisionTreeRegressor__Group__2 : rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3 ;
    public final void rule__DecisionTreeRegressor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2108:1: ( rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3 )
            // InternalMLRegression.g:2109:2: rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DecisionTreeRegressor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionTreeRegressor__Group__3();

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
    // $ANTLR end "rule__DecisionTreeRegressor__Group__2"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__2__Impl"
    // InternalMLRegression.g:2116:1: rule__DecisionTreeRegressor__Group__2__Impl : ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) ) ;
    public final void rule__DecisionTreeRegressor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2120:1: ( ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) ) )
            // InternalMLRegression.g:2121:1: ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) )
            {
            // InternalMLRegression.g:2121:1: ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) )
            // InternalMLRegression.g:2122:2: ( rule__DecisionTreeRegressor__RandAssignment_2 )
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getRandAssignment_2()); 
            // InternalMLRegression.g:2123:2: ( rule__DecisionTreeRegressor__RandAssignment_2 )
            // InternalMLRegression.g:2123:3: rule__DecisionTreeRegressor__RandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DecisionTreeRegressor__RandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecisionTreeRegressorAccess().getRandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTreeRegressor__Group__2__Impl"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__3"
    // InternalMLRegression.g:2131:1: rule__DecisionTreeRegressor__Group__3 : rule__DecisionTreeRegressor__Group__3__Impl ;
    public final void rule__DecisionTreeRegressor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2135:1: ( rule__DecisionTreeRegressor__Group__3__Impl )
            // InternalMLRegression.g:2136:2: rule__DecisionTreeRegressor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecisionTreeRegressor__Group__3__Impl();

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
    // $ANTLR end "rule__DecisionTreeRegressor__Group__3"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__3__Impl"
    // InternalMLRegression.g:2142:1: rule__DecisionTreeRegressor__Group__3__Impl : ( ')' ) ;
    public final void rule__DecisionTreeRegressor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2146:1: ( ( ')' ) )
            // InternalMLRegression.g:2147:1: ( ')' )
            {
            // InternalMLRegression.g:2147:1: ( ')' )
            // InternalMLRegression.g:2148:2: ')'
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDecisionTreeRegressorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTreeRegressor__Group__3__Impl"


    // $ANTLR start "rule__SVR__Group__0"
    // InternalMLRegression.g:2158:1: rule__SVR__Group__0 : rule__SVR__Group__0__Impl rule__SVR__Group__1 ;
    public final void rule__SVR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2162:1: ( rule__SVR__Group__0__Impl rule__SVR__Group__1 )
            // InternalMLRegression.g:2163:2: rule__SVR__Group__0__Impl rule__SVR__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SVR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group__1();

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
    // $ANTLR end "rule__SVR__Group__0"


    // $ANTLR start "rule__SVR__Group__0__Impl"
    // InternalMLRegression.g:2170:1: rule__SVR__Group__0__Impl : ( 'svr' ) ;
    public final void rule__SVR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2174:1: ( ( 'svr' ) )
            // InternalMLRegression.g:2175:1: ( 'svr' )
            {
            // InternalMLRegression.g:2175:1: ( 'svr' )
            // InternalMLRegression.g:2176:2: 'svr'
            {
             before(grammarAccess.getSVRAccess().getSvrKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getSvrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__0__Impl"


    // $ANTLR start "rule__SVR__Group__1"
    // InternalMLRegression.g:2185:1: rule__SVR__Group__1 : rule__SVR__Group__1__Impl rule__SVR__Group__2 ;
    public final void rule__SVR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2189:1: ( rule__SVR__Group__1__Impl rule__SVR__Group__2 )
            // InternalMLRegression.g:2190:2: rule__SVR__Group__1__Impl rule__SVR__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SVR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group__2();

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
    // $ANTLR end "rule__SVR__Group__1"


    // $ANTLR start "rule__SVR__Group__1__Impl"
    // InternalMLRegression.g:2197:1: rule__SVR__Group__1__Impl : ( '(' ) ;
    public final void rule__SVR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2201:1: ( ( '(' ) )
            // InternalMLRegression.g:2202:1: ( '(' )
            {
            // InternalMLRegression.g:2202:1: ( '(' )
            // InternalMLRegression.g:2203:2: '('
            {
             before(grammarAccess.getSVRAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__1__Impl"


    // $ANTLR start "rule__SVR__Group__2"
    // InternalMLRegression.g:2212:1: rule__SVR__Group__2 : rule__SVR__Group__2__Impl rule__SVR__Group__3 ;
    public final void rule__SVR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2216:1: ( rule__SVR__Group__2__Impl rule__SVR__Group__3 )
            // InternalMLRegression.g:2217:2: rule__SVR__Group__2__Impl rule__SVR__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SVR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group__3();

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
    // $ANTLR end "rule__SVR__Group__2"


    // $ANTLR start "rule__SVR__Group__2__Impl"
    // InternalMLRegression.g:2224:1: rule__SVR__Group__2__Impl : ( ( rule__SVR__ParamAssignment_2 ) ) ;
    public final void rule__SVR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2228:1: ( ( ( rule__SVR__ParamAssignment_2 ) ) )
            // InternalMLRegression.g:2229:1: ( ( rule__SVR__ParamAssignment_2 ) )
            {
            // InternalMLRegression.g:2229:1: ( ( rule__SVR__ParamAssignment_2 ) )
            // InternalMLRegression.g:2230:2: ( rule__SVR__ParamAssignment_2 )
            {
             before(grammarAccess.getSVRAccess().getParamAssignment_2()); 
            // InternalMLRegression.g:2231:2: ( rule__SVR__ParamAssignment_2 )
            // InternalMLRegression.g:2231:3: rule__SVR__ParamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SVR__ParamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSVRAccess().getParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__2__Impl"


    // $ANTLR start "rule__SVR__Group__3"
    // InternalMLRegression.g:2239:1: rule__SVR__Group__3 : rule__SVR__Group__3__Impl ;
    public final void rule__SVR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2243:1: ( rule__SVR__Group__3__Impl )
            // InternalMLRegression.g:2244:2: rule__SVR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVR__Group__3__Impl();

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
    // $ANTLR end "rule__SVR__Group__3"


    // $ANTLR start "rule__SVR__Group__3__Impl"
    // InternalMLRegression.g:2250:1: rule__SVR__Group__3__Impl : ( ')' ) ;
    public final void rule__SVR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2254:1: ( ( ')' ) )
            // InternalMLRegression.g:2255:1: ( ')' )
            {
            // InternalMLRegression.g:2255:1: ( ')' )
            // InternalMLRegression.g:2256:2: ')'
            {
             before(grammarAccess.getSVRAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__3__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMLRegression.g:2266:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2270:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMLRegression.g:2271:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMLRegression.g:2278:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__ValueAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2282:1: ( ( ( rule__FLOAT__ValueAssignment_0 ) ) )
            // InternalMLRegression.g:2283:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            {
            // InternalMLRegression.g:2283:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            // InternalMLRegression.g:2284:2: ( rule__FLOAT__ValueAssignment_0 )
            {
             before(grammarAccess.getFLOATAccess().getValueAssignment_0()); 
            // InternalMLRegression.g:2285:2: ( rule__FLOAT__ValueAssignment_0 )
            // InternalMLRegression.g:2285:3: rule__FLOAT__ValueAssignment_0
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
    // InternalMLRegression.g:2293:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2297:1: ( rule__FLOAT__Group__1__Impl )
            // InternalMLRegression.g:2298:2: rule__FLOAT__Group__1__Impl
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
    // InternalMLRegression.g:2304:1: rule__FLOAT__Group__1__Impl : ( ( rule__FLOAT__Group_1__0 )? ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2308:1: ( ( ( rule__FLOAT__Group_1__0 )? ) )
            // InternalMLRegression.g:2309:1: ( ( rule__FLOAT__Group_1__0 )? )
            {
            // InternalMLRegression.g:2309:1: ( ( rule__FLOAT__Group_1__0 )? )
            // InternalMLRegression.g:2310:2: ( rule__FLOAT__Group_1__0 )?
            {
             before(grammarAccess.getFLOATAccess().getGroup_1()); 
            // InternalMLRegression.g:2311:2: ( rule__FLOAT__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMLRegression.g:2311:3: rule__FLOAT__Group_1__0
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
    // InternalMLRegression.g:2320:1: rule__FLOAT__Group_1__0 : rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 ;
    public final void rule__FLOAT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2324:1: ( rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 )
            // InternalMLRegression.g:2325:2: rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:2332:1: rule__FLOAT__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2336:1: ( ( '.' ) )
            // InternalMLRegression.g:2337:1: ( '.' )
            {
            // InternalMLRegression.g:2337:1: ( '.' )
            // InternalMLRegression.g:2338:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMLRegression.g:2347:1: rule__FLOAT__Group_1__1 : rule__FLOAT__Group_1__1__Impl ;
    public final void rule__FLOAT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2351:1: ( rule__FLOAT__Group_1__1__Impl )
            // InternalMLRegression.g:2352:2: rule__FLOAT__Group_1__1__Impl
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
    // InternalMLRegression.g:2358:1: rule__FLOAT__Group_1__1__Impl : ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) ;
    public final void rule__FLOAT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2362:1: ( ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) )
            // InternalMLRegression.g:2363:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            {
            // InternalMLRegression.g:2363:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            // InternalMLRegression.g:2364:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getFLOATAccess().getDecimalAssignment_1_1()); 
            // InternalMLRegression.g:2365:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            // InternalMLRegression.g:2365:3: rule__FLOAT__DecimalAssignment_1_1
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
    // InternalMLRegression.g:2374:1: rule__PERCENT__Group__0 : rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 ;
    public final void rule__PERCENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2378:1: ( rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 )
            // InternalMLRegression.g:2379:2: rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMLRegression.g:2386:1: rule__PERCENT__Group__0__Impl : ( ( rule__PERCENT__FloatAssignment_0 ) ) ;
    public final void rule__PERCENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2390:1: ( ( ( rule__PERCENT__FloatAssignment_0 ) ) )
            // InternalMLRegression.g:2391:1: ( ( rule__PERCENT__FloatAssignment_0 ) )
            {
            // InternalMLRegression.g:2391:1: ( ( rule__PERCENT__FloatAssignment_0 ) )
            // InternalMLRegression.g:2392:2: ( rule__PERCENT__FloatAssignment_0 )
            {
             before(grammarAccess.getPERCENTAccess().getFloatAssignment_0()); 
            // InternalMLRegression.g:2393:2: ( rule__PERCENT__FloatAssignment_0 )
            // InternalMLRegression.g:2393:3: rule__PERCENT__FloatAssignment_0
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
    // InternalMLRegression.g:2401:1: rule__PERCENT__Group__1 : rule__PERCENT__Group__1__Impl ;
    public final void rule__PERCENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2405:1: ( rule__PERCENT__Group__1__Impl )
            // InternalMLRegression.g:2406:2: rule__PERCENT__Group__1__Impl
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
    // InternalMLRegression.g:2412:1: rule__PERCENT__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2416:1: ( ( '%' ) )
            // InternalMLRegression.g:2417:1: ( '%' )
            {
            // InternalMLRegression.g:2417:1: ( '%' )
            // InternalMLRegression.g:2418:2: '%'
            {
             before(grammarAccess.getPERCENTAccess().getPercentSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__MLRegression__DatasetAssignment_0"
    // InternalMLRegression.g:2428:1: rule__MLRegression__DatasetAssignment_0 : ( ruleDataset ) ;
    public final void rule__MLRegression__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2432:1: ( ( ruleDataset ) )
            // InternalMLRegression.g:2433:2: ( ruleDataset )
            {
            // InternalMLRegression.g:2433:2: ( ruleDataset )
            // InternalMLRegression.g:2434:3: ruleDataset
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
    // InternalMLRegression.g:2443:1: rule__MLRegression__VarsAssignment_1 : ( ruleVariables ) ;
    public final void rule__MLRegression__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2447:1: ( ( ruleVariables ) )
            // InternalMLRegression.g:2448:2: ( ruleVariables )
            {
            // InternalMLRegression.g:2448:2: ( ruleVariables )
            // InternalMLRegression.g:2449:3: ruleVariables
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
    // InternalMLRegression.g:2458:1: rule__MLRegression__EvaluationAssignment_2 : ( ruleEvaluationType ) ;
    public final void rule__MLRegression__EvaluationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2462:1: ( ( ruleEvaluationType ) )
            // InternalMLRegression.g:2463:2: ( ruleEvaluationType )
            {
            // InternalMLRegression.g:2463:2: ( ruleEvaluationType )
            // InternalMLRegression.g:2464:3: ruleEvaluationType
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
    // InternalMLRegression.g:2473:1: rule__MLRegression__AlgoAssignment_3 : ( ruleAlgo ) ;
    public final void rule__MLRegression__AlgoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2477:1: ( ( ruleAlgo ) )
            // InternalMLRegression.g:2478:2: ( ruleAlgo )
            {
            // InternalMLRegression.g:2478:2: ( ruleAlgo )
            // InternalMLRegression.g:2479:3: ruleAlgo
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
    // InternalMLRegression.g:2488:1: rule__MLRegression__CalculateAssignment_4 : ( ruleCalculate ) ;
    public final void rule__MLRegression__CalculateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2492:1: ( ( ruleCalculate ) )
            // InternalMLRegression.g:2493:2: ( ruleCalculate )
            {
            // InternalMLRegression.g:2493:2: ( ruleCalculate )
            // InternalMLRegression.g:2494:3: ruleCalculate
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
    // InternalMLRegression.g:2503:1: rule__Dataset__DataPathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Dataset__DataPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2507:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2508:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2508:2: ( RULE_STRING )
            // InternalMLRegression.g:2509:3: RULE_STRING
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
    // InternalMLRegression.g:2518:1: rule__Dataset__SeparatorAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Dataset__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2522:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2523:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2523:2: ( RULE_STRING )
            // InternalMLRegression.g:2524:3: RULE_STRING
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
    // InternalMLRegression.g:2533:1: rule__Partition__TestAssignment_2 : ( ruleNumericValue ) ;
    public final void rule__Partition__TestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2537:1: ( ( ruleNumericValue ) )
            // InternalMLRegression.g:2538:2: ( ruleNumericValue )
            {
            // InternalMLRegression.g:2538:2: ( ruleNumericValue )
            // InternalMLRegression.g:2539:3: ruleNumericValue
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
    // InternalMLRegression.g:2548:1: rule__CrossValidation__KAssignment_2 : ( RULE_INT ) ;
    public final void rule__CrossValidation__KAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2552:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2553:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2553:2: ( RULE_INT )
            // InternalMLRegression.g:2554:3: RULE_INT
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
    // InternalMLRegression.g:2563:1: rule__Variables__PredictivesAssignment_0 : ( ruleListePredictiveVar ) ;
    public final void rule__Variables__PredictivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2567:1: ( ( ruleListePredictiveVar ) )
            // InternalMLRegression.g:2568:2: ( ruleListePredictiveVar )
            {
            // InternalMLRegression.g:2568:2: ( ruleListePredictiveVar )
            // InternalMLRegression.g:2569:3: ruleListePredictiveVar
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
    // InternalMLRegression.g:2578:1: rule__Variables__TargetsAssignment_1 : ( ruleTargetVar ) ;
    public final void rule__Variables__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2582:1: ( ( ruleTargetVar ) )
            // InternalMLRegression.g:2583:2: ( ruleTargetVar )
            {
            // InternalMLRegression.g:2583:2: ( ruleTargetVar )
            // InternalMLRegression.g:2584:3: ruleTargetVar
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
    // InternalMLRegression.g:2593:1: rule__ListePredictiveVar__PredVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__PredVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2597:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2598:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2598:2: ( RULE_STRING )
            // InternalMLRegression.g:2599:3: RULE_STRING
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
    // InternalMLRegression.g:2608:1: rule__ListePredictiveVar__PredVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__PredVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2612:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2613:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2613:2: ( RULE_STRING )
            // InternalMLRegression.g:2614:3: RULE_STRING
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
    // InternalMLRegression.g:2623:1: rule__TargetVar__TargetVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TargetVar__TargetVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2627:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2628:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2628:2: ( RULE_STRING )
            // InternalMLRegression.g:2629:3: RULE_STRING
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
    // InternalMLRegression.g:2638:1: rule__TargetVar__TargetVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TargetVar__TargetVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2642:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2643:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2643:2: ( RULE_STRING )
            // InternalMLRegression.g:2644:3: RULE_STRING
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
    // InternalMLRegression.g:2653:1: rule__Calculate__CalculateTypeAssignment_2 : ( ruleCalculateType ) ;
    public final void rule__Calculate__CalculateTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2657:1: ( ( ruleCalculateType ) )
            // InternalMLRegression.g:2658:2: ( ruleCalculateType )
            {
            // InternalMLRegression.g:2658:2: ( ruleCalculateType )
            // InternalMLRegression.g:2659:3: ruleCalculateType
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
    // InternalMLRegression.g:2668:1: rule__Algo__AlgoAssignment_2 : ( ruleAlgoType ) ;
    public final void rule__Algo__AlgoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2672:1: ( ( ruleAlgoType ) )
            // InternalMLRegression.g:2673:2: ( ruleAlgoType )
            {
            // InternalMLRegression.g:2673:2: ( ruleAlgoType )
            // InternalMLRegression.g:2674:3: ruleAlgoType
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


    // $ANTLR start "rule__Algo__LeftSidePredictAssignment_4"
    // InternalMLRegression.g:2683:1: rule__Algo__LeftSidePredictAssignment_4 : ( RULE_ID ) ;
    public final void rule__Algo__LeftSidePredictAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2687:1: ( ( RULE_ID ) )
            // InternalMLRegression.g:2688:2: ( RULE_ID )
            {
            // InternalMLRegression.g:2688:2: ( RULE_ID )
            // InternalMLRegression.g:2689:3: RULE_ID
            {
             before(grammarAccess.getAlgoAccess().getLeftSidePredictIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlgoAccess().getLeftSidePredictIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algo__LeftSidePredictAssignment_4"


    // $ANTLR start "rule__LineRegress__RandAssignment_2"
    // InternalMLRegression.g:2698:1: rule__LineRegress__RandAssignment_2 : ( RULE_INT ) ;
    public final void rule__LineRegress__RandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2702:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2703:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2703:2: ( RULE_INT )
            // InternalMLRegression.g:2704:3: RULE_INT
            {
             before(grammarAccess.getLineRegressAccess().getRandINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getRandINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__RandAssignment_2"


    // $ANTLR start "rule__DecisionTreeRegressor__RandAssignment_2"
    // InternalMLRegression.g:2713:1: rule__DecisionTreeRegressor__RandAssignment_2 : ( RULE_INT ) ;
    public final void rule__DecisionTreeRegressor__RandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2717:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2718:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2718:2: ( RULE_INT )
            // InternalMLRegression.g:2719:3: RULE_INT
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getRandINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecisionTreeRegressorAccess().getRandINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionTreeRegressor__RandAssignment_2"


    // $ANTLR start "rule__SVR__ParamAssignment_2"
    // InternalMLRegression.g:2728:1: rule__SVR__ParamAssignment_2 : ( RULE_ID ) ;
    public final void rule__SVR__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2732:1: ( ( RULE_ID ) )
            // InternalMLRegression.g:2733:2: ( RULE_ID )
            {
            // InternalMLRegression.g:2733:2: ( RULE_ID )
            // InternalMLRegression.g:2734:3: RULE_ID
            {
             before(grammarAccess.getSVRAccess().getParamIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getParamIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__ParamAssignment_2"


    // $ANTLR start "rule__FLOAT__ValueAssignment_0"
    // InternalMLRegression.g:2743:1: rule__FLOAT__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2747:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2748:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2748:2: ( RULE_INT )
            // InternalMLRegression.g:2749:3: RULE_INT
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
    // InternalMLRegression.g:2758:1: rule__FLOAT__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__FLOAT__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2762:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2763:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2763:2: ( RULE_INT )
            // InternalMLRegression.g:2764:3: RULE_INT
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
    // InternalMLRegression.g:2773:1: rule__PERCENT__FloatAssignment_0 : ( ruleFLOAT ) ;
    public final void rule__PERCENT__FloatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2777:1: ( ( ruleFLOAT ) )
            // InternalMLRegression.g:2778:2: ( ruleFLOAT )
            {
            // InternalMLRegression.g:2778:2: ( ruleFLOAT )
            // InternalMLRegression.g:2779:3: ruleFLOAT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000250000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});

}