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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mean_absolute_error'", "'mean_squared_error'", "'median_absolute_error'", "'import'", "';'", "'partition'", "':'", "','", "'cross_validation'", "'('", "')'", "'predictive_vars'", "'target_vars'", "'calculate'", "'algorithm'", "'line_regress()'", "'='", "'predict'", "'()'", "'decision_tree_regressor'", "'svr'", "'.'", "'%'"
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


    // $ANTLR start "entryRuleFLOAT"
    // InternalMLRegression.g:503:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMLRegression.g:504:1: ( ruleFLOAT EOF )
            // InternalMLRegression.g:505:1: ruleFLOAT EOF
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
    // InternalMLRegression.g:512:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:516:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMLRegression.g:517:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMLRegression.g:517:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMLRegression.g:518:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMLRegression.g:519:3: ( rule__FLOAT__Group__0 )
            // InternalMLRegression.g:519:4: rule__FLOAT__Group__0
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
    // InternalMLRegression.g:528:1: entryRulePERCENT : rulePERCENT EOF ;
    public final void entryRulePERCENT() throws RecognitionException {
        try {
            // InternalMLRegression.g:529:1: ( rulePERCENT EOF )
            // InternalMLRegression.g:530:1: rulePERCENT EOF
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
    // InternalMLRegression.g:537:1: rulePERCENT : ( ( rule__PERCENT__Group__0 ) ) ;
    public final void rulePERCENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:541:2: ( ( ( rule__PERCENT__Group__0 ) ) )
            // InternalMLRegression.g:542:2: ( ( rule__PERCENT__Group__0 ) )
            {
            // InternalMLRegression.g:542:2: ( ( rule__PERCENT__Group__0 ) )
            // InternalMLRegression.g:543:3: ( rule__PERCENT__Group__0 )
            {
             before(grammarAccess.getPERCENTAccess().getGroup()); 
            // InternalMLRegression.g:544:3: ( rule__PERCENT__Group__0 )
            // InternalMLRegression.g:544:4: rule__PERCENT__Group__0
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
    // InternalMLRegression.g:552:1: rule__EvaluationType__Alternatives : ( ( rulePartition ) | ( ruleCrossValidation ) );
    public final void rule__EvaluationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:556:1: ( ( rulePartition ) | ( ruleCrossValidation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:557:2: ( rulePartition )
                    {
                    // InternalMLRegression.g:557:2: ( rulePartition )
                    // InternalMLRegression.g:558:3: rulePartition
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
                    // InternalMLRegression.g:563:2: ( ruleCrossValidation )
                    {
                    // InternalMLRegression.g:563:2: ( ruleCrossValidation )
                    // InternalMLRegression.g:564:3: ruleCrossValidation
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
    // InternalMLRegression.g:573:1: rule__CalculateType__Alternatives : ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) );
    public final void rule__CalculateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:577:1: ( ( ruleMeanAbsoluteError ) | ( ruleMeanSquaredError ) | ( ruleMedianAbsoluteError ) )
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
                    // InternalMLRegression.g:578:2: ( ruleMeanAbsoluteError )
                    {
                    // InternalMLRegression.g:578:2: ( ruleMeanAbsoluteError )
                    // InternalMLRegression.g:579:3: ruleMeanAbsoluteError
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
                    // InternalMLRegression.g:584:2: ( ruleMeanSquaredError )
                    {
                    // InternalMLRegression.g:584:2: ( ruleMeanSquaredError )
                    // InternalMLRegression.g:585:3: ruleMeanSquaredError
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
                    // InternalMLRegression.g:590:2: ( ruleMedianAbsoluteError )
                    {
                    // InternalMLRegression.g:590:2: ( ruleMedianAbsoluteError )
                    // InternalMLRegression.g:591:3: ruleMedianAbsoluteError
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
    // InternalMLRegression.g:600:1: rule__AlgoType__Alternatives : ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) );
    public final void rule__AlgoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:604:1: ( ( ruleLineRegress ) | ( ruleSVR ) | ( ruleDecisionTreeRegressor ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
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
                    // InternalMLRegression.g:605:2: ( ruleLineRegress )
                    {
                    // InternalMLRegression.g:605:2: ( ruleLineRegress )
                    // InternalMLRegression.g:606:3: ruleLineRegress
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
                    // InternalMLRegression.g:611:2: ( ruleSVR )
                    {
                    // InternalMLRegression.g:611:2: ( ruleSVR )
                    // InternalMLRegression.g:612:3: ruleSVR
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
                    // InternalMLRegression.g:617:2: ( ruleDecisionTreeRegressor )
                    {
                    // InternalMLRegression.g:617:2: ( ruleDecisionTreeRegressor )
                    // InternalMLRegression.g:618:3: ruleDecisionTreeRegressor
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


    // $ANTLR start "rule__MLRegression__Group__0"
    // InternalMLRegression.g:627:1: rule__MLRegression__Group__0 : rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 ;
    public final void rule__MLRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:631:1: ( rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 )
            // InternalMLRegression.g:632:2: rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1
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
    // InternalMLRegression.g:639:1: rule__MLRegression__Group__0__Impl : ( ( rule__MLRegression__DatasetAssignment_0 ) ) ;
    public final void rule__MLRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:643:1: ( ( ( rule__MLRegression__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:644:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:644:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            // InternalMLRegression.g:645:2: ( rule__MLRegression__DatasetAssignment_0 )
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:646:2: ( rule__MLRegression__DatasetAssignment_0 )
            // InternalMLRegression.g:646:3: rule__MLRegression__DatasetAssignment_0
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
    // InternalMLRegression.g:654:1: rule__MLRegression__Group__1 : rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 ;
    public final void rule__MLRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:658:1: ( rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 )
            // InternalMLRegression.g:659:2: rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2
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
    // InternalMLRegression.g:666:1: rule__MLRegression__Group__1__Impl : ( ( rule__MLRegression__VarsAssignment_1 )? ) ;
    public final void rule__MLRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:670:1: ( ( ( rule__MLRegression__VarsAssignment_1 )? ) )
            // InternalMLRegression.g:671:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            {
            // InternalMLRegression.g:671:1: ( ( rule__MLRegression__VarsAssignment_1 )? )
            // InternalMLRegression.g:672:2: ( rule__MLRegression__VarsAssignment_1 )?
            {
             before(grammarAccess.getMLRegressionAccess().getVarsAssignment_1()); 
            // InternalMLRegression.g:673:2: ( rule__MLRegression__VarsAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:673:3: rule__MLRegression__VarsAssignment_1
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
    // InternalMLRegression.g:681:1: rule__MLRegression__Group__2 : rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 ;
    public final void rule__MLRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:685:1: ( rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 )
            // InternalMLRegression.g:686:2: rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3
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
    // InternalMLRegression.g:693:1: rule__MLRegression__Group__2__Impl : ( ( rule__MLRegression__EvaluationAssignment_2 ) ) ;
    public final void rule__MLRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:697:1: ( ( ( rule__MLRegression__EvaluationAssignment_2 ) ) )
            // InternalMLRegression.g:698:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            {
            // InternalMLRegression.g:698:1: ( ( rule__MLRegression__EvaluationAssignment_2 ) )
            // InternalMLRegression.g:699:2: ( rule__MLRegression__EvaluationAssignment_2 )
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_2()); 
            // InternalMLRegression.g:700:2: ( rule__MLRegression__EvaluationAssignment_2 )
            // InternalMLRegression.g:700:3: rule__MLRegression__EvaluationAssignment_2
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
    // InternalMLRegression.g:708:1: rule__MLRegression__Group__3 : rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 ;
    public final void rule__MLRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:712:1: ( rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 )
            // InternalMLRegression.g:713:2: rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4
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
    // InternalMLRegression.g:720:1: rule__MLRegression__Group__3__Impl : ( ( rule__MLRegression__AlgoAssignment_3 ) ) ;
    public final void rule__MLRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:724:1: ( ( ( rule__MLRegression__AlgoAssignment_3 ) ) )
            // InternalMLRegression.g:725:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            {
            // InternalMLRegression.g:725:1: ( ( rule__MLRegression__AlgoAssignment_3 ) )
            // InternalMLRegression.g:726:2: ( rule__MLRegression__AlgoAssignment_3 )
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAssignment_3()); 
            // InternalMLRegression.g:727:2: ( rule__MLRegression__AlgoAssignment_3 )
            // InternalMLRegression.g:727:3: rule__MLRegression__AlgoAssignment_3
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
    // InternalMLRegression.g:735:1: rule__MLRegression__Group__4 : rule__MLRegression__Group__4__Impl ;
    public final void rule__MLRegression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:739:1: ( rule__MLRegression__Group__4__Impl )
            // InternalMLRegression.g:740:2: rule__MLRegression__Group__4__Impl
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
    // InternalMLRegression.g:746:1: rule__MLRegression__Group__4__Impl : ( ( rule__MLRegression__CalculateAssignment_4 ) ) ;
    public final void rule__MLRegression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:750:1: ( ( ( rule__MLRegression__CalculateAssignment_4 ) ) )
            // InternalMLRegression.g:751:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            {
            // InternalMLRegression.g:751:1: ( ( rule__MLRegression__CalculateAssignment_4 ) )
            // InternalMLRegression.g:752:2: ( rule__MLRegression__CalculateAssignment_4 )
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateAssignment_4()); 
            // InternalMLRegression.g:753:2: ( rule__MLRegression__CalculateAssignment_4 )
            // InternalMLRegression.g:753:3: rule__MLRegression__CalculateAssignment_4
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
    // InternalMLRegression.g:762:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:766:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMLRegression.g:767:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
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
    // InternalMLRegression.g:774:1: rule__Dataset__Group__0__Impl : ( 'import' ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:778:1: ( ( 'import' ) )
            // InternalMLRegression.g:779:1: ( 'import' )
            {
            // InternalMLRegression.g:779:1: ( 'import' )
            // InternalMLRegression.g:780:2: 'import'
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
    // InternalMLRegression.g:789:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:793:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMLRegression.g:794:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
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
    // InternalMLRegression.g:801:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__DataPathAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:805:1: ( ( ( rule__Dataset__DataPathAssignment_1 ) ) )
            // InternalMLRegression.g:806:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            {
            // InternalMLRegression.g:806:1: ( ( rule__Dataset__DataPathAssignment_1 ) )
            // InternalMLRegression.g:807:2: ( rule__Dataset__DataPathAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getDataPathAssignment_1()); 
            // InternalMLRegression.g:808:2: ( rule__Dataset__DataPathAssignment_1 )
            // InternalMLRegression.g:808:3: rule__Dataset__DataPathAssignment_1
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
    // InternalMLRegression.g:816:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl rule__Dataset__Group__3 ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:820:1: ( rule__Dataset__Group__2__Impl rule__Dataset__Group__3 )
            // InternalMLRegression.g:821:2: rule__Dataset__Group__2__Impl rule__Dataset__Group__3
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
    // InternalMLRegression.g:828:1: rule__Dataset__Group__2__Impl : ( ( rule__Dataset__SeparatorAssignment_2 )? ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:832:1: ( ( ( rule__Dataset__SeparatorAssignment_2 )? ) )
            // InternalMLRegression.g:833:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            {
            // InternalMLRegression.g:833:1: ( ( rule__Dataset__SeparatorAssignment_2 )? )
            // InternalMLRegression.g:834:2: ( rule__Dataset__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getDatasetAccess().getSeparatorAssignment_2()); 
            // InternalMLRegression.g:835:2: ( rule__Dataset__SeparatorAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMLRegression.g:835:3: rule__Dataset__SeparatorAssignment_2
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
    // InternalMLRegression.g:843:1: rule__Dataset__Group__3 : rule__Dataset__Group__3__Impl ;
    public final void rule__Dataset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:847:1: ( rule__Dataset__Group__3__Impl )
            // InternalMLRegression.g:848:2: rule__Dataset__Group__3__Impl
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
    // InternalMLRegression.g:854:1: rule__Dataset__Group__3__Impl : ( ';' ) ;
    public final void rule__Dataset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:858:1: ( ( ';' ) )
            // InternalMLRegression.g:859:1: ( ';' )
            {
            // InternalMLRegression.g:859:1: ( ';' )
            // InternalMLRegression.g:860:2: ';'
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
    // InternalMLRegression.g:870:1: rule__Partition__Group__0 : rule__Partition__Group__0__Impl rule__Partition__Group__1 ;
    public final void rule__Partition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:874:1: ( rule__Partition__Group__0__Impl rule__Partition__Group__1 )
            // InternalMLRegression.g:875:2: rule__Partition__Group__0__Impl rule__Partition__Group__1
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
    // InternalMLRegression.g:882:1: rule__Partition__Group__0__Impl : ( 'partition' ) ;
    public final void rule__Partition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:886:1: ( ( 'partition' ) )
            // InternalMLRegression.g:887:1: ( 'partition' )
            {
            // InternalMLRegression.g:887:1: ( 'partition' )
            // InternalMLRegression.g:888:2: 'partition'
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
    // InternalMLRegression.g:897:1: rule__Partition__Group__1 : rule__Partition__Group__1__Impl rule__Partition__Group__2 ;
    public final void rule__Partition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:901:1: ( rule__Partition__Group__1__Impl rule__Partition__Group__2 )
            // InternalMLRegression.g:902:2: rule__Partition__Group__1__Impl rule__Partition__Group__2
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
    // InternalMLRegression.g:909:1: rule__Partition__Group__1__Impl : ( ':' ) ;
    public final void rule__Partition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:913:1: ( ( ':' ) )
            // InternalMLRegression.g:914:1: ( ':' )
            {
            // InternalMLRegression.g:914:1: ( ':' )
            // InternalMLRegression.g:915:2: ':'
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
    // InternalMLRegression.g:924:1: rule__Partition__Group__2 : rule__Partition__Group__2__Impl rule__Partition__Group__3 ;
    public final void rule__Partition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:928:1: ( rule__Partition__Group__2__Impl rule__Partition__Group__3 )
            // InternalMLRegression.g:929:2: rule__Partition__Group__2__Impl rule__Partition__Group__3
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
    // InternalMLRegression.g:936:1: rule__Partition__Group__2__Impl : ( ( rule__Partition__TrainAssignment_2 ) ) ;
    public final void rule__Partition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:940:1: ( ( ( rule__Partition__TrainAssignment_2 ) ) )
            // InternalMLRegression.g:941:1: ( ( rule__Partition__TrainAssignment_2 ) )
            {
            // InternalMLRegression.g:941:1: ( ( rule__Partition__TrainAssignment_2 ) )
            // InternalMLRegression.g:942:2: ( rule__Partition__TrainAssignment_2 )
            {
             before(grammarAccess.getPartitionAccess().getTrainAssignment_2()); 
            // InternalMLRegression.g:943:2: ( rule__Partition__TrainAssignment_2 )
            // InternalMLRegression.g:943:3: rule__Partition__TrainAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Partition__TrainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartitionAccess().getTrainAssignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:951:1: rule__Partition__Group__3 : rule__Partition__Group__3__Impl rule__Partition__Group__4 ;
    public final void rule__Partition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:955:1: ( rule__Partition__Group__3__Impl rule__Partition__Group__4 )
            // InternalMLRegression.g:956:2: rule__Partition__Group__3__Impl rule__Partition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Partition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partition__Group__4();

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
    // InternalMLRegression.g:963:1: rule__Partition__Group__3__Impl : ( ',' ) ;
    public final void rule__Partition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:967:1: ( ( ',' ) )
            // InternalMLRegression.g:968:1: ( ',' )
            {
            // InternalMLRegression.g:968:1: ( ',' )
            // InternalMLRegression.g:969:2: ','
            {
             before(grammarAccess.getPartitionAccess().getCommaKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPartitionAccess().getCommaKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Partition__Group__4"
    // InternalMLRegression.g:978:1: rule__Partition__Group__4 : rule__Partition__Group__4__Impl rule__Partition__Group__5 ;
    public final void rule__Partition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:982:1: ( rule__Partition__Group__4__Impl rule__Partition__Group__5 )
            // InternalMLRegression.g:983:2: rule__Partition__Group__4__Impl rule__Partition__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Partition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partition__Group__5();

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
    // $ANTLR end "rule__Partition__Group__4"


    // $ANTLR start "rule__Partition__Group__4__Impl"
    // InternalMLRegression.g:990:1: rule__Partition__Group__4__Impl : ( ( rule__Partition__TestAssignment_4 ) ) ;
    public final void rule__Partition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:994:1: ( ( ( rule__Partition__TestAssignment_4 ) ) )
            // InternalMLRegression.g:995:1: ( ( rule__Partition__TestAssignment_4 ) )
            {
            // InternalMLRegression.g:995:1: ( ( rule__Partition__TestAssignment_4 ) )
            // InternalMLRegression.g:996:2: ( rule__Partition__TestAssignment_4 )
            {
             before(grammarAccess.getPartitionAccess().getTestAssignment_4()); 
            // InternalMLRegression.g:997:2: ( rule__Partition__TestAssignment_4 )
            // InternalMLRegression.g:997:3: rule__Partition__TestAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Partition__TestAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPartitionAccess().getTestAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partition__Group__4__Impl"


    // $ANTLR start "rule__Partition__Group__5"
    // InternalMLRegression.g:1005:1: rule__Partition__Group__5 : rule__Partition__Group__5__Impl ;
    public final void rule__Partition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1009:1: ( rule__Partition__Group__5__Impl )
            // InternalMLRegression.g:1010:2: rule__Partition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Partition__Group__5__Impl();

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
    // $ANTLR end "rule__Partition__Group__5"


    // $ANTLR start "rule__Partition__Group__5__Impl"
    // InternalMLRegression.g:1016:1: rule__Partition__Group__5__Impl : ( ';' ) ;
    public final void rule__Partition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1020:1: ( ( ';' ) )
            // InternalMLRegression.g:1021:1: ( ';' )
            {
            // InternalMLRegression.g:1021:1: ( ';' )
            // InternalMLRegression.g:1022:2: ';'
            {
             before(grammarAccess.getPartitionAccess().getSemicolonKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPartitionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partition__Group__5__Impl"


    // $ANTLR start "rule__CrossValidation__Group__0"
    // InternalMLRegression.g:1032:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1036:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMLRegression.g:1037:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:1044:1: rule__CrossValidation__Group__0__Impl : ( 'cross_validation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1048:1: ( ( 'cross_validation' ) )
            // InternalMLRegression.g:1049:1: ( 'cross_validation' )
            {
            // InternalMLRegression.g:1049:1: ( 'cross_validation' )
            // InternalMLRegression.g:1050:2: 'cross_validation'
            {
             before(grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMLRegression.g:1059:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1063:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMLRegression.g:1064:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
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
    // InternalMLRegression.g:1071:1: rule__CrossValidation__Group__1__Impl : ( '(' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1075:1: ( ( '(' ) )
            // InternalMLRegression.g:1076:1: ( '(' )
            {
            // InternalMLRegression.g:1076:1: ( '(' )
            // InternalMLRegression.g:1077:2: '('
            {
             before(grammarAccess.getCrossValidationAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMLRegression.g:1086:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1090:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMLRegression.g:1091:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:1098:1: rule__CrossValidation__Group__2__Impl : ( ( rule__CrossValidation__KAssignment_2 ) ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1102:1: ( ( ( rule__CrossValidation__KAssignment_2 ) ) )
            // InternalMLRegression.g:1103:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            {
            // InternalMLRegression.g:1103:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            // InternalMLRegression.g:1104:2: ( rule__CrossValidation__KAssignment_2 )
            {
             before(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 
            // InternalMLRegression.g:1105:2: ( rule__CrossValidation__KAssignment_2 )
            // InternalMLRegression.g:1105:3: rule__CrossValidation__KAssignment_2
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
    // InternalMLRegression.g:1113:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1117:1: ( rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 )
            // InternalMLRegression.g:1118:2: rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1125:1: rule__CrossValidation__Group__3__Impl : ( ')' ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1129:1: ( ( ')' ) )
            // InternalMLRegression.g:1130:1: ( ')' )
            {
            // InternalMLRegression.g:1130:1: ( ')' )
            // InternalMLRegression.g:1131:2: ')'
            {
             before(grammarAccess.getCrossValidationAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:1140:1: rule__CrossValidation__Group__4 : rule__CrossValidation__Group__4__Impl ;
    public final void rule__CrossValidation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1144:1: ( rule__CrossValidation__Group__4__Impl )
            // InternalMLRegression.g:1145:2: rule__CrossValidation__Group__4__Impl
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
    // InternalMLRegression.g:1151:1: rule__CrossValidation__Group__4__Impl : ( ';' ) ;
    public final void rule__CrossValidation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1155:1: ( ( ';' ) )
            // InternalMLRegression.g:1156:1: ( ';' )
            {
            // InternalMLRegression.g:1156:1: ( ';' )
            // InternalMLRegression.g:1157:2: ';'
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
    // InternalMLRegression.g:1167:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1171:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalMLRegression.g:1172:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMLRegression.g:1179:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__PredictivesAssignment_0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1183:1: ( ( ( rule__Variables__PredictivesAssignment_0 ) ) )
            // InternalMLRegression.g:1184:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            {
            // InternalMLRegression.g:1184:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            // InternalMLRegression.g:1185:2: ( rule__Variables__PredictivesAssignment_0 )
            {
             before(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 
            // InternalMLRegression.g:1186:2: ( rule__Variables__PredictivesAssignment_0 )
            // InternalMLRegression.g:1186:3: rule__Variables__PredictivesAssignment_0
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
    // InternalMLRegression.g:1194:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1198:1: ( rule__Variables__Group__1__Impl )
            // InternalMLRegression.g:1199:2: rule__Variables__Group__1__Impl
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
    // InternalMLRegression.g:1205:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__TargetsAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1209:1: ( ( ( rule__Variables__TargetsAssignment_1 ) ) )
            // InternalMLRegression.g:1210:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            {
            // InternalMLRegression.g:1210:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            // InternalMLRegression.g:1211:2: ( rule__Variables__TargetsAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 
            // InternalMLRegression.g:1212:2: ( rule__Variables__TargetsAssignment_1 )
            // InternalMLRegression.g:1212:3: rule__Variables__TargetsAssignment_1
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
    // InternalMLRegression.g:1221:1: rule__ListePredictiveVar__Group__0 : rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 ;
    public final void rule__ListePredictiveVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1225:1: ( rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 )
            // InternalMLRegression.g:1226:2: rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1
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
    // InternalMLRegression.g:1233:1: rule__ListePredictiveVar__Group__0__Impl : ( 'predictive_vars' ) ;
    public final void rule__ListePredictiveVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1237:1: ( ( 'predictive_vars' ) )
            // InternalMLRegression.g:1238:1: ( 'predictive_vars' )
            {
            // InternalMLRegression.g:1238:1: ( 'predictive_vars' )
            // InternalMLRegression.g:1239:2: 'predictive_vars'
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMLRegression.g:1248:1: rule__ListePredictiveVar__Group__1 : rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 ;
    public final void rule__ListePredictiveVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1252:1: ( rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 )
            // InternalMLRegression.g:1253:2: rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2
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
    // InternalMLRegression.g:1260:1: rule__ListePredictiveVar__Group__1__Impl : ( ':' ) ;
    public final void rule__ListePredictiveVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1264:1: ( ( ':' ) )
            // InternalMLRegression.g:1265:1: ( ':' )
            {
            // InternalMLRegression.g:1265:1: ( ':' )
            // InternalMLRegression.g:1266:2: ':'
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
    // InternalMLRegression.g:1275:1: rule__ListePredictiveVar__Group__2 : rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 ;
    public final void rule__ListePredictiveVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1279:1: ( rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 )
            // InternalMLRegression.g:1280:2: rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMLRegression.g:1287:1: rule__ListePredictiveVar__Group__2__Impl : ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) ) ;
    public final void rule__ListePredictiveVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1291:1: ( ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) ) )
            // InternalMLRegression.g:1292:1: ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1292:1: ( ( rule__ListePredictiveVar__PredVarAssignment_2 ) )
            // InternalMLRegression.g:1293:2: ( rule__ListePredictiveVar__PredVarAssignment_2 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_2()); 
            // InternalMLRegression.g:1294:2: ( rule__ListePredictiveVar__PredVarAssignment_2 )
            // InternalMLRegression.g:1294:3: rule__ListePredictiveVar__PredVarAssignment_2
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
    // InternalMLRegression.g:1302:1: rule__ListePredictiveVar__Group__3 : rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 ;
    public final void rule__ListePredictiveVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1306:1: ( rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 )
            // InternalMLRegression.g:1307:2: rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalMLRegression.g:1314:1: rule__ListePredictiveVar__Group__3__Impl : ( ( rule__ListePredictiveVar__Group_3__0 )* ) ;
    public final void rule__ListePredictiveVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1318:1: ( ( ( rule__ListePredictiveVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1319:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1319:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            // InternalMLRegression.g:1320:2: ( rule__ListePredictiveVar__Group_3__0 )*
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1321:2: ( rule__ListePredictiveVar__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMLRegression.g:1321:3: rule__ListePredictiveVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ListePredictiveVar__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMLRegression.g:1329:1: rule__ListePredictiveVar__Group__4 : rule__ListePredictiveVar__Group__4__Impl ;
    public final void rule__ListePredictiveVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1333:1: ( rule__ListePredictiveVar__Group__4__Impl )
            // InternalMLRegression.g:1334:2: rule__ListePredictiveVar__Group__4__Impl
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
    // InternalMLRegression.g:1340:1: rule__ListePredictiveVar__Group__4__Impl : ( ';' ) ;
    public final void rule__ListePredictiveVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1344:1: ( ( ';' ) )
            // InternalMLRegression.g:1345:1: ( ';' )
            {
            // InternalMLRegression.g:1345:1: ( ';' )
            // InternalMLRegression.g:1346:2: ';'
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
    // InternalMLRegression.g:1356:1: rule__ListePredictiveVar__Group_3__0 : rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 ;
    public final void rule__ListePredictiveVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1360:1: ( rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 )
            // InternalMLRegression.g:1361:2: rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1
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
    // InternalMLRegression.g:1368:1: rule__ListePredictiveVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListePredictiveVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1372:1: ( ( ',' ) )
            // InternalMLRegression.g:1373:1: ( ',' )
            {
            // InternalMLRegression.g:1373:1: ( ',' )
            // InternalMLRegression.g:1374:2: ','
            {
             before(grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1383:1: rule__ListePredictiveVar__Group_3__1 : rule__ListePredictiveVar__Group_3__1__Impl ;
    public final void rule__ListePredictiveVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1387:1: ( rule__ListePredictiveVar__Group_3__1__Impl )
            // InternalMLRegression.g:1388:2: rule__ListePredictiveVar__Group_3__1__Impl
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
    // InternalMLRegression.g:1394:1: rule__ListePredictiveVar__Group_3__1__Impl : ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) ;
    public final void rule__ListePredictiveVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1398:1: ( ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1399:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1399:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            // InternalMLRegression.g:1400:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_3_1()); 
            // InternalMLRegression.g:1401:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            // InternalMLRegression.g:1401:3: rule__ListePredictiveVar__PredVarAssignment_3_1
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
    // InternalMLRegression.g:1410:1: rule__TargetVar__Group__0 : rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 ;
    public final void rule__TargetVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1414:1: ( rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 )
            // InternalMLRegression.g:1415:2: rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1
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
    // InternalMLRegression.g:1422:1: rule__TargetVar__Group__0__Impl : ( 'target_vars' ) ;
    public final void rule__TargetVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1426:1: ( ( 'target_vars' ) )
            // InternalMLRegression.g:1427:1: ( 'target_vars' )
            {
            // InternalMLRegression.g:1427:1: ( 'target_vars' )
            // InternalMLRegression.g:1428:2: 'target_vars'
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
    // InternalMLRegression.g:1437:1: rule__TargetVar__Group__1 : rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 ;
    public final void rule__TargetVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1441:1: ( rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 )
            // InternalMLRegression.g:1442:2: rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2
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
    // InternalMLRegression.g:1449:1: rule__TargetVar__Group__1__Impl : ( ':' ) ;
    public final void rule__TargetVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1453:1: ( ( ':' ) )
            // InternalMLRegression.g:1454:1: ( ':' )
            {
            // InternalMLRegression.g:1454:1: ( ':' )
            // InternalMLRegression.g:1455:2: ':'
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
    // InternalMLRegression.g:1464:1: rule__TargetVar__Group__2 : rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 ;
    public final void rule__TargetVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1468:1: ( rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 )
            // InternalMLRegression.g:1469:2: rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMLRegression.g:1476:1: rule__TargetVar__Group__2__Impl : ( ( rule__TargetVar__TargetVarAssignment_2 ) ) ;
    public final void rule__TargetVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1480:1: ( ( ( rule__TargetVar__TargetVarAssignment_2 ) ) )
            // InternalMLRegression.g:1481:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            {
            // InternalMLRegression.g:1481:1: ( ( rule__TargetVar__TargetVarAssignment_2 ) )
            // InternalMLRegression.g:1482:2: ( rule__TargetVar__TargetVarAssignment_2 )
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarAssignment_2()); 
            // InternalMLRegression.g:1483:2: ( rule__TargetVar__TargetVarAssignment_2 )
            // InternalMLRegression.g:1483:3: rule__TargetVar__TargetVarAssignment_2
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
    // InternalMLRegression.g:1491:1: rule__TargetVar__Group__3 : rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 ;
    public final void rule__TargetVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1495:1: ( rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 )
            // InternalMLRegression.g:1496:2: rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalMLRegression.g:1503:1: rule__TargetVar__Group__3__Impl : ( ( rule__TargetVar__Group_3__0 )* ) ;
    public final void rule__TargetVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1507:1: ( ( ( rule__TargetVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1508:1: ( ( rule__TargetVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1508:1: ( ( rule__TargetVar__Group_3__0 )* )
            // InternalMLRegression.g:1509:2: ( rule__TargetVar__Group_3__0 )*
            {
             before(grammarAccess.getTargetVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1510:2: ( rule__TargetVar__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMLRegression.g:1510:3: rule__TargetVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TargetVar__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMLRegression.g:1518:1: rule__TargetVar__Group__4 : rule__TargetVar__Group__4__Impl ;
    public final void rule__TargetVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1522:1: ( rule__TargetVar__Group__4__Impl )
            // InternalMLRegression.g:1523:2: rule__TargetVar__Group__4__Impl
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
    // InternalMLRegression.g:1529:1: rule__TargetVar__Group__4__Impl : ( ';' ) ;
    public final void rule__TargetVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1533:1: ( ( ';' ) )
            // InternalMLRegression.g:1534:1: ( ';' )
            {
            // InternalMLRegression.g:1534:1: ( ';' )
            // InternalMLRegression.g:1535:2: ';'
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
    // InternalMLRegression.g:1545:1: rule__TargetVar__Group_3__0 : rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 ;
    public final void rule__TargetVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1549:1: ( rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 )
            // InternalMLRegression.g:1550:2: rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1
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
    // InternalMLRegression.g:1557:1: rule__TargetVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TargetVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1561:1: ( ( ',' ) )
            // InternalMLRegression.g:1562:1: ( ',' )
            {
            // InternalMLRegression.g:1562:1: ( ',' )
            // InternalMLRegression.g:1563:2: ','
            {
             before(grammarAccess.getTargetVarAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1572:1: rule__TargetVar__Group_3__1 : rule__TargetVar__Group_3__1__Impl ;
    public final void rule__TargetVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1576:1: ( rule__TargetVar__Group_3__1__Impl )
            // InternalMLRegression.g:1577:2: rule__TargetVar__Group_3__1__Impl
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
    // InternalMLRegression.g:1583:1: rule__TargetVar__Group_3__1__Impl : ( ( rule__TargetVar__TargetVarAssignment_3_1 ) ) ;
    public final void rule__TargetVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1587:1: ( ( ( rule__TargetVar__TargetVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1588:1: ( ( rule__TargetVar__TargetVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1588:1: ( ( rule__TargetVar__TargetVarAssignment_3_1 ) )
            // InternalMLRegression.g:1589:2: ( rule__TargetVar__TargetVarAssignment_3_1 )
            {
             before(grammarAccess.getTargetVarAccess().getTargetVarAssignment_3_1()); 
            // InternalMLRegression.g:1590:2: ( rule__TargetVar__TargetVarAssignment_3_1 )
            // InternalMLRegression.g:1590:3: rule__TargetVar__TargetVarAssignment_3_1
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
    // InternalMLRegression.g:1599:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1603:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalMLRegression.g:1604:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
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
    // InternalMLRegression.g:1611:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1615:1: ( ( 'calculate' ) )
            // InternalMLRegression.g:1616:1: ( 'calculate' )
            {
            // InternalMLRegression.g:1616:1: ( 'calculate' )
            // InternalMLRegression.g:1617:2: 'calculate'
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
    // InternalMLRegression.g:1626:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1630:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalMLRegression.g:1631:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMLRegression.g:1638:1: rule__Calculate__Group__1__Impl : ( ':' ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1642:1: ( ( ':' ) )
            // InternalMLRegression.g:1643:1: ( ':' )
            {
            // InternalMLRegression.g:1643:1: ( ':' )
            // InternalMLRegression.g:1644:2: ':'
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
    // InternalMLRegression.g:1653:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1657:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalMLRegression.g:1658:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1665:1: rule__Calculate__Group__2__Impl : ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1669:1: ( ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) )
            // InternalMLRegression.g:1670:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            {
            // InternalMLRegression.g:1670:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            // InternalMLRegression.g:1671:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            {
             before(grammarAccess.getCalculateAccess().getCalculateTypeAssignment_2()); 
            // InternalMLRegression.g:1672:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            // InternalMLRegression.g:1672:3: rule__Calculate__CalculateTypeAssignment_2
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
    // InternalMLRegression.g:1680:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1684:1: ( rule__Calculate__Group__3__Impl )
            // InternalMLRegression.g:1685:2: rule__Calculate__Group__3__Impl
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
    // InternalMLRegression.g:1691:1: rule__Calculate__Group__3__Impl : ( ';' ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1695:1: ( ( ';' ) )
            // InternalMLRegression.g:1696:1: ( ';' )
            {
            // InternalMLRegression.g:1696:1: ( ';' )
            // InternalMLRegression.g:1697:2: ';'
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
    // InternalMLRegression.g:1707:1: rule__Algo__Group__0 : rule__Algo__Group__0__Impl rule__Algo__Group__1 ;
    public final void rule__Algo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1711:1: ( rule__Algo__Group__0__Impl rule__Algo__Group__1 )
            // InternalMLRegression.g:1712:2: rule__Algo__Group__0__Impl rule__Algo__Group__1
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
    // InternalMLRegression.g:1719:1: rule__Algo__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1723:1: ( ( 'algorithm' ) )
            // InternalMLRegression.g:1724:1: ( 'algorithm' )
            {
            // InternalMLRegression.g:1724:1: ( 'algorithm' )
            // InternalMLRegression.g:1725:2: 'algorithm'
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
    // InternalMLRegression.g:1734:1: rule__Algo__Group__1 : rule__Algo__Group__1__Impl rule__Algo__Group__2 ;
    public final void rule__Algo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1738:1: ( rule__Algo__Group__1__Impl rule__Algo__Group__2 )
            // InternalMLRegression.g:1739:2: rule__Algo__Group__1__Impl rule__Algo__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMLRegression.g:1746:1: rule__Algo__Group__1__Impl : ( ':' ) ;
    public final void rule__Algo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1750:1: ( ( ':' ) )
            // InternalMLRegression.g:1751:1: ( ':' )
            {
            // InternalMLRegression.g:1751:1: ( ':' )
            // InternalMLRegression.g:1752:2: ':'
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
    // InternalMLRegression.g:1761:1: rule__Algo__Group__2 : rule__Algo__Group__2__Impl rule__Algo__Group__3 ;
    public final void rule__Algo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1765:1: ( rule__Algo__Group__2__Impl rule__Algo__Group__3 )
            // InternalMLRegression.g:1766:2: rule__Algo__Group__2__Impl rule__Algo__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1773:1: rule__Algo__Group__2__Impl : ( ( rule__Algo__AlgoAssignment_2 ) ) ;
    public final void rule__Algo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1777:1: ( ( ( rule__Algo__AlgoAssignment_2 ) ) )
            // InternalMLRegression.g:1778:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            {
            // InternalMLRegression.g:1778:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            // InternalMLRegression.g:1779:2: ( rule__Algo__AlgoAssignment_2 )
            {
             before(grammarAccess.getAlgoAccess().getAlgoAssignment_2()); 
            // InternalMLRegression.g:1780:2: ( rule__Algo__AlgoAssignment_2 )
            // InternalMLRegression.g:1780:3: rule__Algo__AlgoAssignment_2
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
    // InternalMLRegression.g:1788:1: rule__Algo__Group__3 : rule__Algo__Group__3__Impl ;
    public final void rule__Algo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1792:1: ( rule__Algo__Group__3__Impl )
            // InternalMLRegression.g:1793:2: rule__Algo__Group__3__Impl
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
    // InternalMLRegression.g:1799:1: rule__Algo__Group__3__Impl : ( ';' ) ;
    public final void rule__Algo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1803:1: ( ( ';' ) )
            // InternalMLRegression.g:1804:1: ( ';' )
            {
            // InternalMLRegression.g:1804:1: ( ';' )
            // InternalMLRegression.g:1805:2: ';'
            {
             before(grammarAccess.getAlgoAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__LineRegress__Group__0"
    // InternalMLRegression.g:1815:1: rule__LineRegress__Group__0 : rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 ;
    public final void rule__LineRegress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1819:1: ( rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 )
            // InternalMLRegression.g:1820:2: rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:1827:1: rule__LineRegress__Group__0__Impl : ( 'line_regress()' ) ;
    public final void rule__LineRegress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1831:1: ( ( 'line_regress()' ) )
            // InternalMLRegression.g:1832:1: ( 'line_regress()' )
            {
            // InternalMLRegression.g:1832:1: ( 'line_regress()' )
            // InternalMLRegression.g:1833:2: 'line_regress()'
            {
             before(grammarAccess.getLineRegressAccess().getLine_regressKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMLRegression.g:1842:1: rule__LineRegress__Group__1 : rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 ;
    public final void rule__LineRegress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1846:1: ( rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 )
            // InternalMLRegression.g:1847:2: rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMLRegression.g:1854:1: rule__LineRegress__Group__1__Impl : ( ',' ) ;
    public final void rule__LineRegress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1858:1: ( ( ',' ) )
            // InternalMLRegression.g:1859:1: ( ',' )
            {
            // InternalMLRegression.g:1859:1: ( ',' )
            // InternalMLRegression.g:1860:2: ','
            {
             before(grammarAccess.getLineRegressAccess().getCommaKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getCommaKeyword_1()); 

            }


            }

        }
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
    // InternalMLRegression.g:1869:1: rule__LineRegress__Group__2 : rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 ;
    public final void rule__LineRegress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1873:1: ( rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 )
            // InternalMLRegression.g:1874:2: rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMLRegression.g:1881:1: rule__LineRegress__Group__2__Impl : ( ( rule__LineRegress__LeftSidePredictAssignment_2 ) ) ;
    public final void rule__LineRegress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1885:1: ( ( ( rule__LineRegress__LeftSidePredictAssignment_2 ) ) )
            // InternalMLRegression.g:1886:1: ( ( rule__LineRegress__LeftSidePredictAssignment_2 ) )
            {
            // InternalMLRegression.g:1886:1: ( ( rule__LineRegress__LeftSidePredictAssignment_2 ) )
            // InternalMLRegression.g:1887:2: ( rule__LineRegress__LeftSidePredictAssignment_2 )
            {
             before(grammarAccess.getLineRegressAccess().getLeftSidePredictAssignment_2()); 
            // InternalMLRegression.g:1888:2: ( rule__LineRegress__LeftSidePredictAssignment_2 )
            // InternalMLRegression.g:1888:3: rule__LineRegress__LeftSidePredictAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__LeftSidePredictAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getLeftSidePredictAssignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:1896:1: rule__LineRegress__Group__3 : rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4 ;
    public final void rule__LineRegress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1900:1: ( rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4 )
            // InternalMLRegression.g:1901:2: rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__LineRegress__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__4();

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
    // InternalMLRegression.g:1908:1: rule__LineRegress__Group__3__Impl : ( '=' ) ;
    public final void rule__LineRegress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1912:1: ( ( '=' ) )
            // InternalMLRegression.g:1913:1: ( '=' )
            {
            // InternalMLRegression.g:1913:1: ( '=' )
            // InternalMLRegression.g:1914:2: '='
            {
             before(grammarAccess.getLineRegressAccess().getEqualsSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__LineRegress__Group__4"
    // InternalMLRegression.g:1923:1: rule__LineRegress__Group__4 : rule__LineRegress__Group__4__Impl rule__LineRegress__Group__5 ;
    public final void rule__LineRegress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1927:1: ( rule__LineRegress__Group__4__Impl rule__LineRegress__Group__5 )
            // InternalMLRegression.g:1928:2: rule__LineRegress__Group__4__Impl rule__LineRegress__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__LineRegress__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__5();

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
    // $ANTLR end "rule__LineRegress__Group__4"


    // $ANTLR start "rule__LineRegress__Group__4__Impl"
    // InternalMLRegression.g:1935:1: rule__LineRegress__Group__4__Impl : ( 'predict' ) ;
    public final void rule__LineRegress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1939:1: ( ( 'predict' ) )
            // InternalMLRegression.g:1940:1: ( 'predict' )
            {
            // InternalMLRegression.g:1940:1: ( 'predict' )
            // InternalMLRegression.g:1941:2: 'predict'
            {
             before(grammarAccess.getLineRegressAccess().getPredictKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getPredictKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__4__Impl"


    // $ANTLR start "rule__LineRegress__Group__5"
    // InternalMLRegression.g:1950:1: rule__LineRegress__Group__5 : rule__LineRegress__Group__5__Impl ;
    public final void rule__LineRegress__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1954:1: ( rule__LineRegress__Group__5__Impl )
            // InternalMLRegression.g:1955:2: rule__LineRegress__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__5__Impl();

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
    // $ANTLR end "rule__LineRegress__Group__5"


    // $ANTLR start "rule__LineRegress__Group__5__Impl"
    // InternalMLRegression.g:1961:1: rule__LineRegress__Group__5__Impl : ( '()' ) ;
    public final void rule__LineRegress__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1965:1: ( ( '()' ) )
            // InternalMLRegression.g:1966:1: ( '()' )
            {
            // InternalMLRegression.g:1966:1: ( '()' )
            // InternalMLRegression.g:1967:2: '()'
            {
             before(grammarAccess.getLineRegressAccess().getLeftParenthesisRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getLeftParenthesisRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__5__Impl"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__0"
    // InternalMLRegression.g:1977:1: rule__DecisionTreeRegressor__Group__0 : rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1 ;
    public final void rule__DecisionTreeRegressor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1981:1: ( rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1 )
            // InternalMLRegression.g:1982:2: rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:1989:1: rule__DecisionTreeRegressor__Group__0__Impl : ( 'decision_tree_regressor' ) ;
    public final void rule__DecisionTreeRegressor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1993:1: ( ( 'decision_tree_regressor' ) )
            // InternalMLRegression.g:1994:1: ( 'decision_tree_regressor' )
            {
            // InternalMLRegression.g:1994:1: ( 'decision_tree_regressor' )
            // InternalMLRegression.g:1995:2: 'decision_tree_regressor'
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
    // InternalMLRegression.g:2004:1: rule__DecisionTreeRegressor__Group__1 : rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2 ;
    public final void rule__DecisionTreeRegressor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2008:1: ( rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2 )
            // InternalMLRegression.g:2009:2: rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2
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
    // InternalMLRegression.g:2016:1: rule__DecisionTreeRegressor__Group__1__Impl : ( '(' ) ;
    public final void rule__DecisionTreeRegressor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2020:1: ( ( '(' ) )
            // InternalMLRegression.g:2021:1: ( '(' )
            {
            // InternalMLRegression.g:2021:1: ( '(' )
            // InternalMLRegression.g:2022:2: '('
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMLRegression.g:2031:1: rule__DecisionTreeRegressor__Group__2 : rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3 ;
    public final void rule__DecisionTreeRegressor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2035:1: ( rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3 )
            // InternalMLRegression.g:2036:2: rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:2043:1: rule__DecisionTreeRegressor__Group__2__Impl : ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) ) ;
    public final void rule__DecisionTreeRegressor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2047:1: ( ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) ) )
            // InternalMLRegression.g:2048:1: ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) )
            {
            // InternalMLRegression.g:2048:1: ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) )
            // InternalMLRegression.g:2049:2: ( rule__DecisionTreeRegressor__RandAssignment_2 )
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getRandAssignment_2()); 
            // InternalMLRegression.g:2050:2: ( rule__DecisionTreeRegressor__RandAssignment_2 )
            // InternalMLRegression.g:2050:3: rule__DecisionTreeRegressor__RandAssignment_2
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
    // InternalMLRegression.g:2058:1: rule__DecisionTreeRegressor__Group__3 : rule__DecisionTreeRegressor__Group__3__Impl ;
    public final void rule__DecisionTreeRegressor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2062:1: ( rule__DecisionTreeRegressor__Group__3__Impl )
            // InternalMLRegression.g:2063:2: rule__DecisionTreeRegressor__Group__3__Impl
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
    // InternalMLRegression.g:2069:1: rule__DecisionTreeRegressor__Group__3__Impl : ( ')' ) ;
    public final void rule__DecisionTreeRegressor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2073:1: ( ( ')' ) )
            // InternalMLRegression.g:2074:1: ( ')' )
            {
            // InternalMLRegression.g:2074:1: ( ')' )
            // InternalMLRegression.g:2075:2: ')'
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:2085:1: rule__SVR__Group__0 : rule__SVR__Group__0__Impl rule__SVR__Group__1 ;
    public final void rule__SVR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2089:1: ( rule__SVR__Group__0__Impl rule__SVR__Group__1 )
            // InternalMLRegression.g:2090:2: rule__SVR__Group__0__Impl rule__SVR__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:2097:1: rule__SVR__Group__0__Impl : ( 'svr' ) ;
    public final void rule__SVR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2101:1: ( ( 'svr' ) )
            // InternalMLRegression.g:2102:1: ( 'svr' )
            {
            // InternalMLRegression.g:2102:1: ( 'svr' )
            // InternalMLRegression.g:2103:2: 'svr'
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
    // InternalMLRegression.g:2112:1: rule__SVR__Group__1 : rule__SVR__Group__1__Impl rule__SVR__Group__2 ;
    public final void rule__SVR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2116:1: ( rule__SVR__Group__1__Impl rule__SVR__Group__2 )
            // InternalMLRegression.g:2117:2: rule__SVR__Group__1__Impl rule__SVR__Group__2
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
    // InternalMLRegression.g:2124:1: rule__SVR__Group__1__Impl : ( '(' ) ;
    public final void rule__SVR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2128:1: ( ( '(' ) )
            // InternalMLRegression.g:2129:1: ( '(' )
            {
            // InternalMLRegression.g:2129:1: ( '(' )
            // InternalMLRegression.g:2130:2: '('
            {
             before(grammarAccess.getSVRAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMLRegression.g:2139:1: rule__SVR__Group__2 : rule__SVR__Group__2__Impl rule__SVR__Group__3 ;
    public final void rule__SVR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2143:1: ( rule__SVR__Group__2__Impl rule__SVR__Group__3 )
            // InternalMLRegression.g:2144:2: rule__SVR__Group__2__Impl rule__SVR__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:2151:1: rule__SVR__Group__2__Impl : ( ( rule__SVR__ParamAssignment_2 ) ) ;
    public final void rule__SVR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2155:1: ( ( ( rule__SVR__ParamAssignment_2 ) ) )
            // InternalMLRegression.g:2156:1: ( ( rule__SVR__ParamAssignment_2 ) )
            {
            // InternalMLRegression.g:2156:1: ( ( rule__SVR__ParamAssignment_2 ) )
            // InternalMLRegression.g:2157:2: ( rule__SVR__ParamAssignment_2 )
            {
             before(grammarAccess.getSVRAccess().getParamAssignment_2()); 
            // InternalMLRegression.g:2158:2: ( rule__SVR__ParamAssignment_2 )
            // InternalMLRegression.g:2158:3: rule__SVR__ParamAssignment_2
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
    // InternalMLRegression.g:2166:1: rule__SVR__Group__3 : rule__SVR__Group__3__Impl ;
    public final void rule__SVR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2170:1: ( rule__SVR__Group__3__Impl )
            // InternalMLRegression.g:2171:2: rule__SVR__Group__3__Impl
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
    // InternalMLRegression.g:2177:1: rule__SVR__Group__3__Impl : ( ')' ) ;
    public final void rule__SVR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2181:1: ( ( ')' ) )
            // InternalMLRegression.g:2182:1: ( ')' )
            {
            // InternalMLRegression.g:2182:1: ( ')' )
            // InternalMLRegression.g:2183:2: ')'
            {
             before(grammarAccess.getSVRAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:2193:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2197:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMLRegression.g:2198:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
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
    // InternalMLRegression.g:2205:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__ValueAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2209:1: ( ( ( rule__FLOAT__ValueAssignment_0 ) ) )
            // InternalMLRegression.g:2210:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            {
            // InternalMLRegression.g:2210:1: ( ( rule__FLOAT__ValueAssignment_0 ) )
            // InternalMLRegression.g:2211:2: ( rule__FLOAT__ValueAssignment_0 )
            {
             before(grammarAccess.getFLOATAccess().getValueAssignment_0()); 
            // InternalMLRegression.g:2212:2: ( rule__FLOAT__ValueAssignment_0 )
            // InternalMLRegression.g:2212:3: rule__FLOAT__ValueAssignment_0
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
    // InternalMLRegression.g:2220:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2224:1: ( rule__FLOAT__Group__1__Impl )
            // InternalMLRegression.g:2225:2: rule__FLOAT__Group__1__Impl
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
    // InternalMLRegression.g:2231:1: rule__FLOAT__Group__1__Impl : ( ( rule__FLOAT__Group_1__0 )? ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2235:1: ( ( ( rule__FLOAT__Group_1__0 )? ) )
            // InternalMLRegression.g:2236:1: ( ( rule__FLOAT__Group_1__0 )? )
            {
            // InternalMLRegression.g:2236:1: ( ( rule__FLOAT__Group_1__0 )? )
            // InternalMLRegression.g:2237:2: ( rule__FLOAT__Group_1__0 )?
            {
             before(grammarAccess.getFLOATAccess().getGroup_1()); 
            // InternalMLRegression.g:2238:2: ( rule__FLOAT__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMLRegression.g:2238:3: rule__FLOAT__Group_1__0
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
    // InternalMLRegression.g:2247:1: rule__FLOAT__Group_1__0 : rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 ;
    public final void rule__FLOAT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2251:1: ( rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 )
            // InternalMLRegression.g:2252:2: rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1
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
    // InternalMLRegression.g:2259:1: rule__FLOAT__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2263:1: ( ( '.' ) )
            // InternalMLRegression.g:2264:1: ( '.' )
            {
            // InternalMLRegression.g:2264:1: ( '.' )
            // InternalMLRegression.g:2265:2: '.'
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
    // InternalMLRegression.g:2274:1: rule__FLOAT__Group_1__1 : rule__FLOAT__Group_1__1__Impl ;
    public final void rule__FLOAT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2278:1: ( rule__FLOAT__Group_1__1__Impl )
            // InternalMLRegression.g:2279:2: rule__FLOAT__Group_1__1__Impl
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
    // InternalMLRegression.g:2285:1: rule__FLOAT__Group_1__1__Impl : ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) ;
    public final void rule__FLOAT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2289:1: ( ( ( rule__FLOAT__DecimalAssignment_1_1 ) ) )
            // InternalMLRegression.g:2290:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            {
            // InternalMLRegression.g:2290:1: ( ( rule__FLOAT__DecimalAssignment_1_1 ) )
            // InternalMLRegression.g:2291:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getFLOATAccess().getDecimalAssignment_1_1()); 
            // InternalMLRegression.g:2292:2: ( rule__FLOAT__DecimalAssignment_1_1 )
            // InternalMLRegression.g:2292:3: rule__FLOAT__DecimalAssignment_1_1
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
    // InternalMLRegression.g:2301:1: rule__PERCENT__Group__0 : rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 ;
    public final void rule__PERCENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2305:1: ( rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1 )
            // InternalMLRegression.g:2306:2: rule__PERCENT__Group__0__Impl rule__PERCENT__Group__1
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
    // InternalMLRegression.g:2313:1: rule__PERCENT__Group__0__Impl : ( ruleFLOAT ) ;
    public final void rule__PERCENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2317:1: ( ( ruleFLOAT ) )
            // InternalMLRegression.g:2318:1: ( ruleFLOAT )
            {
            // InternalMLRegression.g:2318:1: ( ruleFLOAT )
            // InternalMLRegression.g:2319:2: ruleFLOAT
            {
             before(grammarAccess.getPERCENTAccess().getFLOATParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getPERCENTAccess().getFLOATParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMLRegression.g:2328:1: rule__PERCENT__Group__1 : rule__PERCENT__Group__1__Impl ;
    public final void rule__PERCENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2332:1: ( rule__PERCENT__Group__1__Impl )
            // InternalMLRegression.g:2333:2: rule__PERCENT__Group__1__Impl
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
    // InternalMLRegression.g:2339:1: rule__PERCENT__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2343:1: ( ( '%' ) )
            // InternalMLRegression.g:2344:1: ( '%' )
            {
            // InternalMLRegression.g:2344:1: ( '%' )
            // InternalMLRegression.g:2345:2: '%'
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
    // InternalMLRegression.g:2355:1: rule__MLRegression__DatasetAssignment_0 : ( ruleDataset ) ;
    public final void rule__MLRegression__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2359:1: ( ( ruleDataset ) )
            // InternalMLRegression.g:2360:2: ( ruleDataset )
            {
            // InternalMLRegression.g:2360:2: ( ruleDataset )
            // InternalMLRegression.g:2361:3: ruleDataset
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
    // InternalMLRegression.g:2370:1: rule__MLRegression__VarsAssignment_1 : ( ruleVariables ) ;
    public final void rule__MLRegression__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2374:1: ( ( ruleVariables ) )
            // InternalMLRegression.g:2375:2: ( ruleVariables )
            {
            // InternalMLRegression.g:2375:2: ( ruleVariables )
            // InternalMLRegression.g:2376:3: ruleVariables
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
    // InternalMLRegression.g:2385:1: rule__MLRegression__EvaluationAssignment_2 : ( ruleEvaluationType ) ;
    public final void rule__MLRegression__EvaluationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2389:1: ( ( ruleEvaluationType ) )
            // InternalMLRegression.g:2390:2: ( ruleEvaluationType )
            {
            // InternalMLRegression.g:2390:2: ( ruleEvaluationType )
            // InternalMLRegression.g:2391:3: ruleEvaluationType
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
    // InternalMLRegression.g:2400:1: rule__MLRegression__AlgoAssignment_3 : ( ruleAlgo ) ;
    public final void rule__MLRegression__AlgoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2404:1: ( ( ruleAlgo ) )
            // InternalMLRegression.g:2405:2: ( ruleAlgo )
            {
            // InternalMLRegression.g:2405:2: ( ruleAlgo )
            // InternalMLRegression.g:2406:3: ruleAlgo
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
    // InternalMLRegression.g:2415:1: rule__MLRegression__CalculateAssignment_4 : ( ruleCalculate ) ;
    public final void rule__MLRegression__CalculateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2419:1: ( ( ruleCalculate ) )
            // InternalMLRegression.g:2420:2: ( ruleCalculate )
            {
            // InternalMLRegression.g:2420:2: ( ruleCalculate )
            // InternalMLRegression.g:2421:3: ruleCalculate
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
    // InternalMLRegression.g:2430:1: rule__Dataset__DataPathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Dataset__DataPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2434:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2435:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2435:2: ( RULE_STRING )
            // InternalMLRegression.g:2436:3: RULE_STRING
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
    // InternalMLRegression.g:2445:1: rule__Dataset__SeparatorAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Dataset__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2449:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2450:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2450:2: ( RULE_STRING )
            // InternalMLRegression.g:2451:3: RULE_STRING
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


    // $ANTLR start "rule__Partition__TrainAssignment_2"
    // InternalMLRegression.g:2460:1: rule__Partition__TrainAssignment_2 : ( RULE_INT ) ;
    public final void rule__Partition__TrainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2464:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2465:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2465:2: ( RULE_INT )
            // InternalMLRegression.g:2466:3: RULE_INT
            {
             before(grammarAccess.getPartitionAccess().getTrainINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPartitionAccess().getTrainINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partition__TrainAssignment_2"


    // $ANTLR start "rule__Partition__TestAssignment_4"
    // InternalMLRegression.g:2475:1: rule__Partition__TestAssignment_4 : ( RULE_INT ) ;
    public final void rule__Partition__TestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2479:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2480:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2480:2: ( RULE_INT )
            // InternalMLRegression.g:2481:3: RULE_INT
            {
             before(grammarAccess.getPartitionAccess().getTestINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPartitionAccess().getTestINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partition__TestAssignment_4"


    // $ANTLR start "rule__CrossValidation__KAssignment_2"
    // InternalMLRegression.g:2490:1: rule__CrossValidation__KAssignment_2 : ( RULE_INT ) ;
    public final void rule__CrossValidation__KAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2494:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2495:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2495:2: ( RULE_INT )
            // InternalMLRegression.g:2496:3: RULE_INT
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
    // InternalMLRegression.g:2505:1: rule__Variables__PredictivesAssignment_0 : ( ruleListePredictiveVar ) ;
    public final void rule__Variables__PredictivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2509:1: ( ( ruleListePredictiveVar ) )
            // InternalMLRegression.g:2510:2: ( ruleListePredictiveVar )
            {
            // InternalMLRegression.g:2510:2: ( ruleListePredictiveVar )
            // InternalMLRegression.g:2511:3: ruleListePredictiveVar
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
    // InternalMLRegression.g:2520:1: rule__Variables__TargetsAssignment_1 : ( ruleTargetVar ) ;
    public final void rule__Variables__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2524:1: ( ( ruleTargetVar ) )
            // InternalMLRegression.g:2525:2: ( ruleTargetVar )
            {
            // InternalMLRegression.g:2525:2: ( ruleTargetVar )
            // InternalMLRegression.g:2526:3: ruleTargetVar
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
    // InternalMLRegression.g:2535:1: rule__ListePredictiveVar__PredVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__PredVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2539:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2540:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2540:2: ( RULE_STRING )
            // InternalMLRegression.g:2541:3: RULE_STRING
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
    // InternalMLRegression.g:2550:1: rule__ListePredictiveVar__PredVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__PredVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2554:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2555:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2555:2: ( RULE_STRING )
            // InternalMLRegression.g:2556:3: RULE_STRING
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
    // InternalMLRegression.g:2565:1: rule__TargetVar__TargetVarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TargetVar__TargetVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2569:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2570:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2570:2: ( RULE_STRING )
            // InternalMLRegression.g:2571:3: RULE_STRING
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
    // InternalMLRegression.g:2580:1: rule__TargetVar__TargetVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TargetVar__TargetVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2584:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2585:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2585:2: ( RULE_STRING )
            // InternalMLRegression.g:2586:3: RULE_STRING
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
    // InternalMLRegression.g:2595:1: rule__Calculate__CalculateTypeAssignment_2 : ( ruleCalculateType ) ;
    public final void rule__Calculate__CalculateTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2599:1: ( ( ruleCalculateType ) )
            // InternalMLRegression.g:2600:2: ( ruleCalculateType )
            {
            // InternalMLRegression.g:2600:2: ( ruleCalculateType )
            // InternalMLRegression.g:2601:3: ruleCalculateType
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
    // InternalMLRegression.g:2610:1: rule__Algo__AlgoAssignment_2 : ( ruleAlgoType ) ;
    public final void rule__Algo__AlgoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2614:1: ( ( ruleAlgoType ) )
            // InternalMLRegression.g:2615:2: ( ruleAlgoType )
            {
            // InternalMLRegression.g:2615:2: ( ruleAlgoType )
            // InternalMLRegression.g:2616:3: ruleAlgoType
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


    // $ANTLR start "rule__LineRegress__LeftSidePredictAssignment_2"
    // InternalMLRegression.g:2625:1: rule__LineRegress__LeftSidePredictAssignment_2 : ( RULE_ID ) ;
    public final void rule__LineRegress__LeftSidePredictAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2629:1: ( ( RULE_ID ) )
            // InternalMLRegression.g:2630:2: ( RULE_ID )
            {
            // InternalMLRegression.g:2630:2: ( RULE_ID )
            // InternalMLRegression.g:2631:3: RULE_ID
            {
             before(grammarAccess.getLineRegressAccess().getLeftSidePredictIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getLeftSidePredictIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__LeftSidePredictAssignment_2"


    // $ANTLR start "rule__DecisionTreeRegressor__RandAssignment_2"
    // InternalMLRegression.g:2640:1: rule__DecisionTreeRegressor__RandAssignment_2 : ( RULE_INT ) ;
    public final void rule__DecisionTreeRegressor__RandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2644:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2645:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2645:2: ( RULE_INT )
            // InternalMLRegression.g:2646:3: RULE_INT
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
    // InternalMLRegression.g:2655:1: rule__SVR__ParamAssignment_2 : ( RULE_ID ) ;
    public final void rule__SVR__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2659:1: ( ( RULE_ID ) )
            // InternalMLRegression.g:2660:2: ( RULE_ID )
            {
            // InternalMLRegression.g:2660:2: ( RULE_ID )
            // InternalMLRegression.g:2661:3: RULE_ID
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
    // InternalMLRegression.g:2670:1: rule__FLOAT__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2674:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2675:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2675:2: ( RULE_INT )
            // InternalMLRegression.g:2676:3: RULE_INT
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
    // InternalMLRegression.g:2685:1: rule__FLOAT__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__FLOAT__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2689:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2690:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2690:2: ( RULE_INT )
            // InternalMLRegression.g:2691:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000490000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C4000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});

}