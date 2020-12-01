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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min_error'", "'min_square_error'", "'sums_square_error'", "'false'", "'true'", "'calculate'", "':'", "';'", "'partition'", "','", "'cross_validation'", "'predictive_vars'", "'target_var'", "'algorithm'", "'line_regress'", "'('", "')'", "'.'", "'%'", "'import'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


    // $ANTLR start "entryRuleCalculate"
    // InternalMLRegression.g:78:1: entryRuleCalculate : ruleCalculate EOF ;
    public final void entryRuleCalculate() throws RecognitionException {
        try {
            // InternalMLRegression.g:79:1: ( ruleCalculate EOF )
            // InternalMLRegression.g:80:1: ruleCalculate EOF
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
    // InternalMLRegression.g:87:1: ruleCalculate : ( ( rule__Calculate__Group__0 ) ) ;
    public final void ruleCalculate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:91:2: ( ( ( rule__Calculate__Group__0 ) ) )
            // InternalMLRegression.g:92:2: ( ( rule__Calculate__Group__0 ) )
            {
            // InternalMLRegression.g:92:2: ( ( rule__Calculate__Group__0 ) )
            // InternalMLRegression.g:93:3: ( rule__Calculate__Group__0 )
            {
             before(grammarAccess.getCalculateAccess().getGroup()); 
            // InternalMLRegression.g:94:3: ( rule__Calculate__Group__0 )
            // InternalMLRegression.g:94:4: rule__Calculate__Group__0
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
    // InternalMLRegression.g:103:1: entryRuleCalculateType : ruleCalculateType EOF ;
    public final void entryRuleCalculateType() throws RecognitionException {
        try {
            // InternalMLRegression.g:104:1: ( ruleCalculateType EOF )
            // InternalMLRegression.g:105:1: ruleCalculateType EOF
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
    // InternalMLRegression.g:112:1: ruleCalculateType : ( ( rule__CalculateType__Alternatives ) ) ;
    public final void ruleCalculateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:116:2: ( ( ( rule__CalculateType__Alternatives ) ) )
            // InternalMLRegression.g:117:2: ( ( rule__CalculateType__Alternatives ) )
            {
            // InternalMLRegression.g:117:2: ( ( rule__CalculateType__Alternatives ) )
            // InternalMLRegression.g:118:3: ( rule__CalculateType__Alternatives )
            {
             before(grammarAccess.getCalculateTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:119:3: ( rule__CalculateType__Alternatives )
            // InternalMLRegression.g:119:4: rule__CalculateType__Alternatives
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


    // $ANTLR start "entryRuleDataset"
    // InternalMLRegression.g:128:1: entryRuleDataset : ruleDataset EOF ;
    public final void entryRuleDataset() throws RecognitionException {
        try {
            // InternalMLRegression.g:129:1: ( ruleDataset EOF )
            // InternalMLRegression.g:130:1: ruleDataset EOF
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
    // InternalMLRegression.g:137:1: ruleDataset : ( ( rule__Dataset__Group__0 ) ) ;
    public final void ruleDataset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:141:2: ( ( ( rule__Dataset__Group__0 ) ) )
            // InternalMLRegression.g:142:2: ( ( rule__Dataset__Group__0 ) )
            {
            // InternalMLRegression.g:142:2: ( ( rule__Dataset__Group__0 ) )
            // InternalMLRegression.g:143:3: ( rule__Dataset__Group__0 )
            {
             before(grammarAccess.getDatasetAccess().getGroup()); 
            // InternalMLRegression.g:144:3: ( rule__Dataset__Group__0 )
            // InternalMLRegression.g:144:4: rule__Dataset__Group__0
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
    // InternalMLRegression.g:153:1: entryRuleEvaluationType : ruleEvaluationType EOF ;
    public final void entryRuleEvaluationType() throws RecognitionException {
        try {
            // InternalMLRegression.g:154:1: ( ruleEvaluationType EOF )
            // InternalMLRegression.g:155:1: ruleEvaluationType EOF
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
    // InternalMLRegression.g:162:1: ruleEvaluationType : ( ( rule__EvaluationType__Alternatives ) ) ;
    public final void ruleEvaluationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:166:2: ( ( ( rule__EvaluationType__Alternatives ) ) )
            // InternalMLRegression.g:167:2: ( ( rule__EvaluationType__Alternatives ) )
            {
            // InternalMLRegression.g:167:2: ( ( rule__EvaluationType__Alternatives ) )
            // InternalMLRegression.g:168:3: ( rule__EvaluationType__Alternatives )
            {
             before(grammarAccess.getEvaluationTypeAccess().getAlternatives()); 
            // InternalMLRegression.g:169:3: ( rule__EvaluationType__Alternatives )
            // InternalMLRegression.g:169:4: rule__EvaluationType__Alternatives
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
    // InternalMLRegression.g:178:1: entryRulePartition : rulePartition EOF ;
    public final void entryRulePartition() throws RecognitionException {
        try {
            // InternalMLRegression.g:179:1: ( rulePartition EOF )
            // InternalMLRegression.g:180:1: rulePartition EOF
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
    // InternalMLRegression.g:187:1: rulePartition : ( ( rule__Partition__Group__0 ) ) ;
    public final void rulePartition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:191:2: ( ( ( rule__Partition__Group__0 ) ) )
            // InternalMLRegression.g:192:2: ( ( rule__Partition__Group__0 ) )
            {
            // InternalMLRegression.g:192:2: ( ( rule__Partition__Group__0 ) )
            // InternalMLRegression.g:193:3: ( rule__Partition__Group__0 )
            {
             before(grammarAccess.getPartitionAccess().getGroup()); 
            // InternalMLRegression.g:194:3: ( rule__Partition__Group__0 )
            // InternalMLRegression.g:194:4: rule__Partition__Group__0
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
    // InternalMLRegression.g:203:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMLRegression.g:204:1: ( ruleCrossValidation EOF )
            // InternalMLRegression.g:205:1: ruleCrossValidation EOF
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
    // InternalMLRegression.g:212:1: ruleCrossValidation : ( ( rule__CrossValidation__Group__0 ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:216:2: ( ( ( rule__CrossValidation__Group__0 ) ) )
            // InternalMLRegression.g:217:2: ( ( rule__CrossValidation__Group__0 ) )
            {
            // InternalMLRegression.g:217:2: ( ( rule__CrossValidation__Group__0 ) )
            // InternalMLRegression.g:218:3: ( rule__CrossValidation__Group__0 )
            {
             before(grammarAccess.getCrossValidationAccess().getGroup()); 
            // InternalMLRegression.g:219:3: ( rule__CrossValidation__Group__0 )
            // InternalMLRegression.g:219:4: rule__CrossValidation__Group__0
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
    // InternalMLRegression.g:228:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // InternalMLRegression.g:229:1: ( ruleVariables EOF )
            // InternalMLRegression.g:230:1: ruleVariables EOF
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
    // InternalMLRegression.g:237:1: ruleVariables : ( ( rule__Variables__Group__0 ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:241:2: ( ( ( rule__Variables__Group__0 ) ) )
            // InternalMLRegression.g:242:2: ( ( rule__Variables__Group__0 ) )
            {
            // InternalMLRegression.g:242:2: ( ( rule__Variables__Group__0 ) )
            // InternalMLRegression.g:243:3: ( rule__Variables__Group__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup()); 
            // InternalMLRegression.g:244:3: ( rule__Variables__Group__0 )
            // InternalMLRegression.g:244:4: rule__Variables__Group__0
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
    // InternalMLRegression.g:253:1: entryRuleListePredictiveVar : ruleListePredictiveVar EOF ;
    public final void entryRuleListePredictiveVar() throws RecognitionException {
        try {
            // InternalMLRegression.g:254:1: ( ruleListePredictiveVar EOF )
            // InternalMLRegression.g:255:1: ruleListePredictiveVar EOF
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
    // InternalMLRegression.g:262:1: ruleListePredictiveVar : ( ( rule__ListePredictiveVar__Group__0 ) ) ;
    public final void ruleListePredictiveVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:266:2: ( ( ( rule__ListePredictiveVar__Group__0 ) ) )
            // InternalMLRegression.g:267:2: ( ( rule__ListePredictiveVar__Group__0 ) )
            {
            // InternalMLRegression.g:267:2: ( ( rule__ListePredictiveVar__Group__0 ) )
            // InternalMLRegression.g:268:3: ( rule__ListePredictiveVar__Group__0 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup()); 
            // InternalMLRegression.g:269:3: ( rule__ListePredictiveVar__Group__0 )
            // InternalMLRegression.g:269:4: rule__ListePredictiveVar__Group__0
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
    // InternalMLRegression.g:278:1: entryRuleTargetVar : ruleTargetVar EOF ;
    public final void entryRuleTargetVar() throws RecognitionException {
        try {
            // InternalMLRegression.g:279:1: ( ruleTargetVar EOF )
            // InternalMLRegression.g:280:1: ruleTargetVar EOF
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
    // InternalMLRegression.g:287:1: ruleTargetVar : ( ( rule__TargetVar__Group__0 ) ) ;
    public final void ruleTargetVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:291:2: ( ( ( rule__TargetVar__Group__0 ) ) )
            // InternalMLRegression.g:292:2: ( ( rule__TargetVar__Group__0 ) )
            {
            // InternalMLRegression.g:292:2: ( ( rule__TargetVar__Group__0 ) )
            // InternalMLRegression.g:293:3: ( rule__TargetVar__Group__0 )
            {
             before(grammarAccess.getTargetVarAccess().getGroup()); 
            // InternalMLRegression.g:294:3: ( rule__TargetVar__Group__0 )
            // InternalMLRegression.g:294:4: rule__TargetVar__Group__0
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


    // $ANTLR start "entryRuleAlgoML"
    // InternalMLRegression.g:328:1: entryRuleAlgoML : ruleAlgoML EOF ;
    public final void entryRuleAlgoML() throws RecognitionException {
        try {
            // InternalMLRegression.g:329:1: ( ruleAlgoML EOF )
            // InternalMLRegression.g:330:1: ruleAlgoML EOF
            {
             before(grammarAccess.getAlgoMLRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgoML();

            state._fsp--;

             after(grammarAccess.getAlgoMLRule()); 
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
    // $ANTLR end "entryRuleAlgoML"


    // $ANTLR start "ruleAlgoML"
    // InternalMLRegression.g:337:1: ruleAlgoML : ( ruleLineRegress ) ;
    public final void ruleAlgoML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:341:2: ( ( ruleLineRegress ) )
            // InternalMLRegression.g:342:2: ( ruleLineRegress )
            {
            // InternalMLRegression.g:342:2: ( ruleLineRegress )
            // InternalMLRegression.g:343:3: ruleLineRegress
            {
             before(grammarAccess.getAlgoMLAccess().getLineRegressParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleLineRegress();

            state._fsp--;

             after(grammarAccess.getAlgoMLAccess().getLineRegressParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgoML"


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


    // $ANTLR start "entryRuleY"
    // InternalMLRegression.g:378:1: entryRuleY : ruleY EOF ;
    public final void entryRuleY() throws RecognitionException {
        try {
            // InternalMLRegression.g:379:1: ( ruleY EOF )
            // InternalMLRegression.g:380:1: ruleY EOF
            {
             before(grammarAccess.getYRule()); 
            pushFollow(FOLLOW_1);
            ruleY();

            state._fsp--;

             after(grammarAccess.getYRule()); 
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
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // InternalMLRegression.g:387:1: ruleY : ( RULE_INT ) ;
    public final void ruleY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:391:2: ( ( RULE_INT ) )
            // InternalMLRegression.g:392:2: ( RULE_INT )
            {
            // InternalMLRegression.g:392:2: ( RULE_INT )
            // InternalMLRegression.g:393:3: RULE_INT
            {
             before(grammarAccess.getYAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getYAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleMinError"
    // InternalMLRegression.g:403:1: entryRuleMinError : ruleMinError EOF ;
    public final void entryRuleMinError() throws RecognitionException {
        try {
            // InternalMLRegression.g:404:1: ( ruleMinError EOF )
            // InternalMLRegression.g:405:1: ruleMinError EOF
            {
             before(grammarAccess.getMinErrorRule()); 
            pushFollow(FOLLOW_1);
            ruleMinError();

            state._fsp--;

             after(grammarAccess.getMinErrorRule()); 
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
    // $ANTLR end "entryRuleMinError"


    // $ANTLR start "ruleMinError"
    // InternalMLRegression.g:412:1: ruleMinError : ( 'min_error' ) ;
    public final void ruleMinError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:416:2: ( ( 'min_error' ) )
            // InternalMLRegression.g:417:2: ( 'min_error' )
            {
            // InternalMLRegression.g:417:2: ( 'min_error' )
            // InternalMLRegression.g:418:3: 'min_error'
            {
             before(grammarAccess.getMinErrorAccess().getMin_errorKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMinErrorAccess().getMin_errorKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinError"


    // $ANTLR start "entryRuleMinSquaredError"
    // InternalMLRegression.g:428:1: entryRuleMinSquaredError : ruleMinSquaredError EOF ;
    public final void entryRuleMinSquaredError() throws RecognitionException {
        try {
            // InternalMLRegression.g:429:1: ( ruleMinSquaredError EOF )
            // InternalMLRegression.g:430:1: ruleMinSquaredError EOF
            {
             before(grammarAccess.getMinSquaredErrorRule()); 
            pushFollow(FOLLOW_1);
            ruleMinSquaredError();

            state._fsp--;

             after(grammarAccess.getMinSquaredErrorRule()); 
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
    // $ANTLR end "entryRuleMinSquaredError"


    // $ANTLR start "ruleMinSquaredError"
    // InternalMLRegression.g:437:1: ruleMinSquaredError : ( 'min_square_error' ) ;
    public final void ruleMinSquaredError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:441:2: ( ( 'min_square_error' ) )
            // InternalMLRegression.g:442:2: ( 'min_square_error' )
            {
            // InternalMLRegression.g:442:2: ( 'min_square_error' )
            // InternalMLRegression.g:443:3: 'min_square_error'
            {
             before(grammarAccess.getMinSquaredErrorAccess().getMin_square_errorKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMinSquaredErrorAccess().getMin_square_errorKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinSquaredError"


    // $ANTLR start "entryRuleSumsSquaredError"
    // InternalMLRegression.g:453:1: entryRuleSumsSquaredError : ruleSumsSquaredError EOF ;
    public final void entryRuleSumsSquaredError() throws RecognitionException {
        try {
            // InternalMLRegression.g:454:1: ( ruleSumsSquaredError EOF )
            // InternalMLRegression.g:455:1: ruleSumsSquaredError EOF
            {
             before(grammarAccess.getSumsSquaredErrorRule()); 
            pushFollow(FOLLOW_1);
            ruleSumsSquaredError();

            state._fsp--;

             after(grammarAccess.getSumsSquaredErrorRule()); 
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
    // $ANTLR end "entryRuleSumsSquaredError"


    // $ANTLR start "ruleSumsSquaredError"
    // InternalMLRegression.g:462:1: ruleSumsSquaredError : ( 'sums_square_error' ) ;
    public final void ruleSumsSquaredError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:466:2: ( ( 'sums_square_error' ) )
            // InternalMLRegression.g:467:2: ( 'sums_square_error' )
            {
            // InternalMLRegression.g:467:2: ( 'sums_square_error' )
            // InternalMLRegression.g:468:3: 'sums_square_error'
            {
             before(grammarAccess.getSumsSquaredErrorAccess().getSums_square_errorKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSumsSquaredErrorAccess().getSums_square_errorKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSumsSquaredError"


    // $ANTLR start "entryRuleStringValue"
    // InternalMLRegression.g:478:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:479:1: ( ruleStringValue EOF )
            // InternalMLRegression.g:480:1: ruleStringValue EOF
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
    // InternalMLRegression.g:487:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:491:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalMLRegression.g:492:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:492:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalMLRegression.g:493:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:494:3: ( rule__StringValue__ValueAssignment )
            // InternalMLRegression.g:494:4: rule__StringValue__ValueAssignment
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


    // $ANTLR start "entryRuleNumberValue"
    // InternalMLRegression.g:528:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:529:1: ( ruleNumberValue EOF )
            // InternalMLRegression.g:530:1: ruleNumberValue EOF
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
    // InternalMLRegression.g:537:1: ruleNumberValue : ( ( rule__NumberValue__Group__0 ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:541:2: ( ( ( rule__NumberValue__Group__0 ) ) )
            // InternalMLRegression.g:542:2: ( ( rule__NumberValue__Group__0 ) )
            {
            // InternalMLRegression.g:542:2: ( ( rule__NumberValue__Group__0 ) )
            // InternalMLRegression.g:543:3: ( rule__NumberValue__Group__0 )
            {
             before(grammarAccess.getNumberValueAccess().getGroup()); 
            // InternalMLRegression.g:544:3: ( rule__NumberValue__Group__0 )
            // InternalMLRegression.g:544:4: rule__NumberValue__Group__0
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


    // $ANTLR start "entryRuleIntegerValue"
    // InternalMLRegression.g:553:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:554:1: ( ruleIntegerValue EOF )
            // InternalMLRegression.g:555:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalMLRegression.g:562:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:566:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // InternalMLRegression.g:567:2: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:567:2: ( ( rule__IntegerValue__ValueAssignment ) )
            // InternalMLRegression.g:568:3: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:569:3: ( rule__IntegerValue__ValueAssignment )
            // InternalMLRegression.g:569:4: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRulePercentValue"
    // InternalMLRegression.g:578:1: entryRulePercentValue : rulePercentValue EOF ;
    public final void entryRulePercentValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:579:1: ( rulePercentValue EOF )
            // InternalMLRegression.g:580:1: rulePercentValue EOF
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
    // InternalMLRegression.g:587:1: rulePercentValue : ( ( rule__PercentValue__Group__0 ) ) ;
    public final void rulePercentValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:591:2: ( ( ( rule__PercentValue__Group__0 ) ) )
            // InternalMLRegression.g:592:2: ( ( rule__PercentValue__Group__0 ) )
            {
            // InternalMLRegression.g:592:2: ( ( rule__PercentValue__Group__0 ) )
            // InternalMLRegression.g:593:3: ( rule__PercentValue__Group__0 )
            {
             before(grammarAccess.getPercentValueAccess().getGroup()); 
            // InternalMLRegression.g:594:3: ( rule__PercentValue__Group__0 )
            // InternalMLRegression.g:594:4: rule__PercentValue__Group__0
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
    // InternalMLRegression.g:603:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:604:1: ( ruleBooleanValue EOF )
            // InternalMLRegression.g:605:1: ruleBooleanValue EOF
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
    // InternalMLRegression.g:612:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:616:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalMLRegression.g:617:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:617:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalMLRegression.g:618:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:619:3: ( rule__BooleanValue__ValueAssignment )
            // InternalMLRegression.g:619:4: rule__BooleanValue__ValueAssignment
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


    // $ANTLR start "rule__CalculateType__Alternatives"
    // InternalMLRegression.g:627:1: rule__CalculateType__Alternatives : ( ( ruleMinError ) | ( ruleMinSquaredError ) | ( ruleSumsSquaredError ) );
    public final void rule__CalculateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:631:1: ( ( ruleMinError ) | ( ruleMinSquaredError ) | ( ruleSumsSquaredError ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMLRegression.g:632:2: ( ruleMinError )
                    {
                    // InternalMLRegression.g:632:2: ( ruleMinError )
                    // InternalMLRegression.g:633:3: ruleMinError
                    {
                     before(grammarAccess.getCalculateTypeAccess().getMinErrorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMinError();

                    state._fsp--;

                     after(grammarAccess.getCalculateTypeAccess().getMinErrorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:638:2: ( ruleMinSquaredError )
                    {
                    // InternalMLRegression.g:638:2: ( ruleMinSquaredError )
                    // InternalMLRegression.g:639:3: ruleMinSquaredError
                    {
                     before(grammarAccess.getCalculateTypeAccess().getMinSquaredErrorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMinSquaredError();

                    state._fsp--;

                     after(grammarAccess.getCalculateTypeAccess().getMinSquaredErrorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:644:2: ( ruleSumsSquaredError )
                    {
                    // InternalMLRegression.g:644:2: ( ruleSumsSquaredError )
                    // InternalMLRegression.g:645:3: ruleSumsSquaredError
                    {
                     before(grammarAccess.getCalculateTypeAccess().getSumsSquaredErrorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSumsSquaredError();

                    state._fsp--;

                     after(grammarAccess.getCalculateTypeAccess().getSumsSquaredErrorParserRuleCall_2()); 

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


    // $ANTLR start "rule__EvaluationType__Alternatives"
    // InternalMLRegression.g:654:1: rule__EvaluationType__Alternatives : ( ( rulePartition ) | ( ruleCrossValidation ) );
    public final void rule__EvaluationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:658:1: ( ( rulePartition ) | ( ruleCrossValidation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMLRegression.g:659:2: ( rulePartition )
                    {
                    // InternalMLRegression.g:659:2: ( rulePartition )
                    // InternalMLRegression.g:660:3: rulePartition
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
                    // InternalMLRegression.g:665:2: ( ruleCrossValidation )
                    {
                    // InternalMLRegression.g:665:2: ( ruleCrossValidation )
                    // InternalMLRegression.g:666:3: ruleCrossValidation
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


    // $ANTLR start "rule__NumericValue__Alternatives"
    // InternalMLRegression.g:675:1: rule__NumericValue__Alternatives : ( ( ruleNumberValue ) | ( rulePercentValue ) );
    public final void rule__NumericValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:679:1: ( ( ruleNumberValue ) | ( rulePercentValue ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMLRegression.g:680:2: ( ruleNumberValue )
                    {
                    // InternalMLRegression.g:680:2: ( ruleNumberValue )
                    // InternalMLRegression.g:681:3: ruleNumberValue
                    {
                     before(grammarAccess.getNumericValueAccess().getNumberValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getNumericValueAccess().getNumberValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:686:2: ( rulePercentValue )
                    {
                    // InternalMLRegression.g:686:2: ( rulePercentValue )
                    // InternalMLRegression.g:687:3: rulePercentValue
                    {
                     before(grammarAccess.getNumericValueAccess().getPercentValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePercentValue();

                    state._fsp--;

                     after(grammarAccess.getNumericValueAccess().getPercentValueParserRuleCall_1()); 

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


    // $ANTLR start "rule__BooleanValue__ValueAlternatives_0"
    // InternalMLRegression.g:696:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'false' ) | ( 'true' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:700:1: ( ( 'false' ) | ( 'true' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:701:2: ( 'false' )
                    {
                    // InternalMLRegression.g:701:2: ( 'false' )
                    // InternalMLRegression.g:702:3: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:707:2: ( 'true' )
                    {
                    // InternalMLRegression.g:707:2: ( 'true' )
                    // InternalMLRegression.g:708:3: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalMLRegression.g:717:1: rule__MLRegression__Group__0 : rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 ;
    public final void rule__MLRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:721:1: ( rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 )
            // InternalMLRegression.g:722:2: rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1
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
    // InternalMLRegression.g:729:1: rule__MLRegression__Group__0__Impl : ( ( rule__MLRegression__DatasetAssignment_0 ) ) ;
    public final void rule__MLRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:733:1: ( ( ( rule__MLRegression__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:734:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:734:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            // InternalMLRegression.g:735:2: ( rule__MLRegression__DatasetAssignment_0 )
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:736:2: ( rule__MLRegression__DatasetAssignment_0 )
            // InternalMLRegression.g:736:3: rule__MLRegression__DatasetAssignment_0
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
    // InternalMLRegression.g:744:1: rule__MLRegression__Group__1 : rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 ;
    public final void rule__MLRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:748:1: ( rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 )
            // InternalMLRegression.g:749:2: rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMLRegression.g:756:1: rule__MLRegression__Group__1__Impl : ( ( rule__MLRegression__EvaluationAssignment_1 ) ) ;
    public final void rule__MLRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:760:1: ( ( ( rule__MLRegression__EvaluationAssignment_1 ) ) )
            // InternalMLRegression.g:761:1: ( ( rule__MLRegression__EvaluationAssignment_1 ) )
            {
            // InternalMLRegression.g:761:1: ( ( rule__MLRegression__EvaluationAssignment_1 ) )
            // InternalMLRegression.g:762:2: ( rule__MLRegression__EvaluationAssignment_1 )
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_1()); 
            // InternalMLRegression.g:763:2: ( rule__MLRegression__EvaluationAssignment_1 )
            // InternalMLRegression.g:763:3: rule__MLRegression__EvaluationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__EvaluationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_1()); 

            }


            }

        }
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
    // InternalMLRegression.g:771:1: rule__MLRegression__Group__2 : rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 ;
    public final void rule__MLRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:775:1: ( rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 )
            // InternalMLRegression.g:776:2: rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3
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
    // InternalMLRegression.g:783:1: rule__MLRegression__Group__2__Impl : ( ( rule__MLRegression__VarsAssignment_2 )? ) ;
    public final void rule__MLRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:787:1: ( ( ( rule__MLRegression__VarsAssignment_2 )? ) )
            // InternalMLRegression.g:788:1: ( ( rule__MLRegression__VarsAssignment_2 )? )
            {
            // InternalMLRegression.g:788:1: ( ( rule__MLRegression__VarsAssignment_2 )? )
            // InternalMLRegression.g:789:2: ( rule__MLRegression__VarsAssignment_2 )?
            {
             before(grammarAccess.getMLRegressionAccess().getVarsAssignment_2()); 
            // InternalMLRegression.g:790:2: ( rule__MLRegression__VarsAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMLRegression.g:790:3: rule__MLRegression__VarsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MLRegression__VarsAssignment_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalMLRegression.g:798:1: rule__MLRegression__Group__3 : rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 ;
    public final void rule__MLRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:802:1: ( rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 )
            // InternalMLRegression.g:803:2: rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4
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
    // InternalMLRegression.g:810:1: rule__MLRegression__Group__3__Impl : ( ( rule__MLRegression__CalculateAssignment_3 ) ) ;
    public final void rule__MLRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:814:1: ( ( ( rule__MLRegression__CalculateAssignment_3 ) ) )
            // InternalMLRegression.g:815:1: ( ( rule__MLRegression__CalculateAssignment_3 ) )
            {
            // InternalMLRegression.g:815:1: ( ( rule__MLRegression__CalculateAssignment_3 ) )
            // InternalMLRegression.g:816:2: ( rule__MLRegression__CalculateAssignment_3 )
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateAssignment_3()); 
            // InternalMLRegression.g:817:2: ( rule__MLRegression__CalculateAssignment_3 )
            // InternalMLRegression.g:817:3: rule__MLRegression__CalculateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__CalculateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getCalculateAssignment_3()); 

            }


            }

        }
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
    // InternalMLRegression.g:825:1: rule__MLRegression__Group__4 : rule__MLRegression__Group__4__Impl ;
    public final void rule__MLRegression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:829:1: ( rule__MLRegression__Group__4__Impl )
            // InternalMLRegression.g:830:2: rule__MLRegression__Group__4__Impl
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
    // InternalMLRegression.g:836:1: rule__MLRegression__Group__4__Impl : ( ( rule__MLRegression__AlgoAssignment_4 ) ) ;
    public final void rule__MLRegression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:840:1: ( ( ( rule__MLRegression__AlgoAssignment_4 ) ) )
            // InternalMLRegression.g:841:1: ( ( rule__MLRegression__AlgoAssignment_4 ) )
            {
            // InternalMLRegression.g:841:1: ( ( rule__MLRegression__AlgoAssignment_4 ) )
            // InternalMLRegression.g:842:2: ( rule__MLRegression__AlgoAssignment_4 )
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAssignment_4()); 
            // InternalMLRegression.g:843:2: ( rule__MLRegression__AlgoAssignment_4 )
            // InternalMLRegression.g:843:3: rule__MLRegression__AlgoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MLRegression__AlgoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMLRegressionAccess().getAlgoAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Calculate__Group__0"
    // InternalMLRegression.g:852:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:856:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalMLRegression.g:857:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:864:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:868:1: ( ( 'calculate' ) )
            // InternalMLRegression.g:869:1: ( 'calculate' )
            {
            // InternalMLRegression.g:869:1: ( 'calculate' )
            // InternalMLRegression.g:870:2: 'calculate'
            {
             before(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMLRegression.g:879:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:883:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalMLRegression.g:884:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMLRegression.g:891:1: rule__Calculate__Group__1__Impl : ( ':' ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:895:1: ( ( ':' ) )
            // InternalMLRegression.g:896:1: ( ':' )
            {
            // InternalMLRegression.g:896:1: ( ':' )
            // InternalMLRegression.g:897:2: ':'
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
    // InternalMLRegression.g:906:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:910:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalMLRegression.g:911:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:918:1: rule__Calculate__Group__2__Impl : ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:922:1: ( ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) )
            // InternalMLRegression.g:923:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            {
            // InternalMLRegression.g:923:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            // InternalMLRegression.g:924:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            {
             before(grammarAccess.getCalculateAccess().getCalculateTypeAssignment_2()); 
            // InternalMLRegression.g:925:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            // InternalMLRegression.g:925:3: rule__Calculate__CalculateTypeAssignment_2
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
    // InternalMLRegression.g:933:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:937:1: ( rule__Calculate__Group__3__Impl )
            // InternalMLRegression.g:938:2: rule__Calculate__Group__3__Impl
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
    // InternalMLRegression.g:944:1: rule__Calculate__Group__3__Impl : ( ';' ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:948:1: ( ( ';' ) )
            // InternalMLRegression.g:949:1: ( ';' )
            {
            // InternalMLRegression.g:949:1: ( ';' )
            // InternalMLRegression.g:950:2: ';'
            {
             before(grammarAccess.getCalculateAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__Dataset__Group__0"
    // InternalMLRegression.g:960:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:964:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMLRegression.g:965:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:972:1: rule__Dataset__Group__0__Impl : ( ( rule__Dataset__DatasetAssignment_0 ) ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:976:1: ( ( ( rule__Dataset__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:977:1: ( ( rule__Dataset__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:977:1: ( ( rule__Dataset__DatasetAssignment_0 ) )
            // InternalMLRegression.g:978:2: ( rule__Dataset__DatasetAssignment_0 )
            {
             before(grammarAccess.getDatasetAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:979:2: ( rule__Dataset__DatasetAssignment_0 )
            // InternalMLRegression.g:979:3: rule__Dataset__DatasetAssignment_0
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
    // InternalMLRegression.g:987:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:991:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMLRegression.g:992:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:999:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__DataAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1003:1: ( ( ( rule__Dataset__DataAssignment_1 ) ) )
            // InternalMLRegression.g:1004:1: ( ( rule__Dataset__DataAssignment_1 ) )
            {
            // InternalMLRegression.g:1004:1: ( ( rule__Dataset__DataAssignment_1 ) )
            // InternalMLRegression.g:1005:2: ( rule__Dataset__DataAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getDataAssignment_1()); 
            // InternalMLRegression.g:1006:2: ( rule__Dataset__DataAssignment_1 )
            // InternalMLRegression.g:1006:3: rule__Dataset__DataAssignment_1
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
    // InternalMLRegression.g:1014:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1018:1: ( rule__Dataset__Group__2__Impl )
            // InternalMLRegression.g:1019:2: rule__Dataset__Group__2__Impl
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
    // InternalMLRegression.g:1025:1: rule__Dataset__Group__2__Impl : ( ';' ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1029:1: ( ( ';' ) )
            // InternalMLRegression.g:1030:1: ( ';' )
            {
            // InternalMLRegression.g:1030:1: ( ';' )
            // InternalMLRegression.g:1031:2: ';'
            {
             before(grammarAccess.getDatasetAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__Partition__Group__0"
    // InternalMLRegression.g:1041:1: rule__Partition__Group__0 : rule__Partition__Group__0__Impl rule__Partition__Group__1 ;
    public final void rule__Partition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1045:1: ( rule__Partition__Group__0__Impl rule__Partition__Group__1 )
            // InternalMLRegression.g:1046:2: rule__Partition__Group__0__Impl rule__Partition__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1053:1: rule__Partition__Group__0__Impl : ( 'partition' ) ;
    public final void rule__Partition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1057:1: ( ( 'partition' ) )
            // InternalMLRegression.g:1058:1: ( 'partition' )
            {
            // InternalMLRegression.g:1058:1: ( 'partition' )
            // InternalMLRegression.g:1059:2: 'partition'
            {
             before(grammarAccess.getPartitionAccess().getPartitionKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMLRegression.g:1068:1: rule__Partition__Group__1 : rule__Partition__Group__1__Impl rule__Partition__Group__2 ;
    public final void rule__Partition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1072:1: ( rule__Partition__Group__1__Impl rule__Partition__Group__2 )
            // InternalMLRegression.g:1073:2: rule__Partition__Group__1__Impl rule__Partition__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:1080:1: rule__Partition__Group__1__Impl : ( ':' ) ;
    public final void rule__Partition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1084:1: ( ( ':' ) )
            // InternalMLRegression.g:1085:1: ( ':' )
            {
            // InternalMLRegression.g:1085:1: ( ':' )
            // InternalMLRegression.g:1086:2: ':'
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
    // InternalMLRegression.g:1095:1: rule__Partition__Group__2 : rule__Partition__Group__2__Impl rule__Partition__Group__3 ;
    public final void rule__Partition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1099:1: ( rule__Partition__Group__2__Impl rule__Partition__Group__3 )
            // InternalMLRegression.g:1100:2: rule__Partition__Group__2__Impl rule__Partition__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1107:1: rule__Partition__Group__2__Impl : ( ( rule__Partition__TrainAssignment_2 ) ) ;
    public final void rule__Partition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1111:1: ( ( ( rule__Partition__TrainAssignment_2 ) ) )
            // InternalMLRegression.g:1112:1: ( ( rule__Partition__TrainAssignment_2 ) )
            {
            // InternalMLRegression.g:1112:1: ( ( rule__Partition__TrainAssignment_2 ) )
            // InternalMLRegression.g:1113:2: ( rule__Partition__TrainAssignment_2 )
            {
             before(grammarAccess.getPartitionAccess().getTrainAssignment_2()); 
            // InternalMLRegression.g:1114:2: ( rule__Partition__TrainAssignment_2 )
            // InternalMLRegression.g:1114:3: rule__Partition__TrainAssignment_2
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
    // InternalMLRegression.g:1122:1: rule__Partition__Group__3 : rule__Partition__Group__3__Impl rule__Partition__Group__4 ;
    public final void rule__Partition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1126:1: ( rule__Partition__Group__3__Impl rule__Partition__Group__4 )
            // InternalMLRegression.g:1127:2: rule__Partition__Group__3__Impl rule__Partition__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:1134:1: rule__Partition__Group__3__Impl : ( ',' ) ;
    public final void rule__Partition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1138:1: ( ( ',' ) )
            // InternalMLRegression.g:1139:1: ( ',' )
            {
            // InternalMLRegression.g:1139:1: ( ',' )
            // InternalMLRegression.g:1140:2: ','
            {
             before(grammarAccess.getPartitionAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMLRegression.g:1149:1: rule__Partition__Group__4 : rule__Partition__Group__4__Impl rule__Partition__Group__5 ;
    public final void rule__Partition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1153:1: ( rule__Partition__Group__4__Impl rule__Partition__Group__5 )
            // InternalMLRegression.g:1154:2: rule__Partition__Group__4__Impl rule__Partition__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1161:1: rule__Partition__Group__4__Impl : ( ( rule__Partition__TestAssignment_4 ) ) ;
    public final void rule__Partition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1165:1: ( ( ( rule__Partition__TestAssignment_4 ) ) )
            // InternalMLRegression.g:1166:1: ( ( rule__Partition__TestAssignment_4 ) )
            {
            // InternalMLRegression.g:1166:1: ( ( rule__Partition__TestAssignment_4 ) )
            // InternalMLRegression.g:1167:2: ( rule__Partition__TestAssignment_4 )
            {
             before(grammarAccess.getPartitionAccess().getTestAssignment_4()); 
            // InternalMLRegression.g:1168:2: ( rule__Partition__TestAssignment_4 )
            // InternalMLRegression.g:1168:3: rule__Partition__TestAssignment_4
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
    // InternalMLRegression.g:1176:1: rule__Partition__Group__5 : rule__Partition__Group__5__Impl ;
    public final void rule__Partition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1180:1: ( rule__Partition__Group__5__Impl )
            // InternalMLRegression.g:1181:2: rule__Partition__Group__5__Impl
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
    // InternalMLRegression.g:1187:1: rule__Partition__Group__5__Impl : ( ';' ) ;
    public final void rule__Partition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1191:1: ( ( ';' ) )
            // InternalMLRegression.g:1192:1: ( ';' )
            {
            // InternalMLRegression.g:1192:1: ( ';' )
            // InternalMLRegression.g:1193:2: ';'
            {
             before(grammarAccess.getPartitionAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1203:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1207:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMLRegression.g:1208:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1215:1: rule__CrossValidation__Group__0__Impl : ( 'cross_validation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1219:1: ( ( 'cross_validation' ) )
            // InternalMLRegression.g:1220:1: ( 'cross_validation' )
            {
            // InternalMLRegression.g:1220:1: ( 'cross_validation' )
            // InternalMLRegression.g:1221:2: 'cross_validation'
            {
             before(grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:1230:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1234:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMLRegression.g:1235:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:1242:1: rule__CrossValidation__Group__1__Impl : ( ':' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1246:1: ( ( ':' ) )
            // InternalMLRegression.g:1247:1: ( ':' )
            {
            // InternalMLRegression.g:1247:1: ( ':' )
            // InternalMLRegression.g:1248:2: ':'
            {
             before(grammarAccess.getCrossValidationAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMLRegression.g:1257:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1261:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMLRegression.g:1262:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1269:1: rule__CrossValidation__Group__2__Impl : ( ( rule__CrossValidation__KAssignment_2 ) ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1273:1: ( ( ( rule__CrossValidation__KAssignment_2 ) ) )
            // InternalMLRegression.g:1274:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            {
            // InternalMLRegression.g:1274:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            // InternalMLRegression.g:1275:2: ( rule__CrossValidation__KAssignment_2 )
            {
             before(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 
            // InternalMLRegression.g:1276:2: ( rule__CrossValidation__KAssignment_2 )
            // InternalMLRegression.g:1276:3: rule__CrossValidation__KAssignment_2
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
    // InternalMLRegression.g:1284:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1288:1: ( rule__CrossValidation__Group__3__Impl )
            // InternalMLRegression.g:1289:2: rule__CrossValidation__Group__3__Impl
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
    // InternalMLRegression.g:1295:1: rule__CrossValidation__Group__3__Impl : ( ';' ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1299:1: ( ( ';' ) )
            // InternalMLRegression.g:1300:1: ( ';' )
            {
            // InternalMLRegression.g:1300:1: ( ';' )
            // InternalMLRegression.g:1301:2: ';'
            {
             before(grammarAccess.getCrossValidationAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1311:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1315:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalMLRegression.g:1316:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMLRegression.g:1323:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__PredictivesAssignment_0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1327:1: ( ( ( rule__Variables__PredictivesAssignment_0 ) ) )
            // InternalMLRegression.g:1328:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            {
            // InternalMLRegression.g:1328:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            // InternalMLRegression.g:1329:2: ( rule__Variables__PredictivesAssignment_0 )
            {
             before(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 
            // InternalMLRegression.g:1330:2: ( rule__Variables__PredictivesAssignment_0 )
            // InternalMLRegression.g:1330:3: rule__Variables__PredictivesAssignment_0
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
    // InternalMLRegression.g:1338:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1342:1: ( rule__Variables__Group__1__Impl )
            // InternalMLRegression.g:1343:2: rule__Variables__Group__1__Impl
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
    // InternalMLRegression.g:1349:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__TargetsAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1353:1: ( ( ( rule__Variables__TargetsAssignment_1 ) ) )
            // InternalMLRegression.g:1354:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            {
            // InternalMLRegression.g:1354:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            // InternalMLRegression.g:1355:2: ( rule__Variables__TargetsAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 
            // InternalMLRegression.g:1356:2: ( rule__Variables__TargetsAssignment_1 )
            // InternalMLRegression.g:1356:3: rule__Variables__TargetsAssignment_1
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
    // InternalMLRegression.g:1365:1: rule__ListePredictiveVar__Group__0 : rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 ;
    public final void rule__ListePredictiveVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1369:1: ( rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 )
            // InternalMLRegression.g:1370:2: rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1377:1: rule__ListePredictiveVar__Group__0__Impl : ( 'predictive_vars' ) ;
    public final void rule__ListePredictiveVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1381:1: ( ( 'predictive_vars' ) )
            // InternalMLRegression.g:1382:1: ( 'predictive_vars' )
            {
            // InternalMLRegression.g:1382:1: ( 'predictive_vars' )
            // InternalMLRegression.g:1383:2: 'predictive_vars'
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
    // InternalMLRegression.g:1392:1: rule__ListePredictiveVar__Group__1 : rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 ;
    public final void rule__ListePredictiveVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1396:1: ( rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 )
            // InternalMLRegression.g:1397:2: rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:1404:1: rule__ListePredictiveVar__Group__1__Impl : ( ':' ) ;
    public final void rule__ListePredictiveVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1408:1: ( ( ':' ) )
            // InternalMLRegression.g:1409:1: ( ':' )
            {
            // InternalMLRegression.g:1409:1: ( ':' )
            // InternalMLRegression.g:1410:2: ':'
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
    // InternalMLRegression.g:1419:1: rule__ListePredictiveVar__Group__2 : rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 ;
    public final void rule__ListePredictiveVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1423:1: ( rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 )
            // InternalMLRegression.g:1424:2: rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:1431:1: rule__ListePredictiveVar__Group__2__Impl : ( ( rule__ListePredictiveVar__VarPredAssignment_2 ) ) ;
    public final void rule__ListePredictiveVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1435:1: ( ( ( rule__ListePredictiveVar__VarPredAssignment_2 ) ) )
            // InternalMLRegression.g:1436:1: ( ( rule__ListePredictiveVar__VarPredAssignment_2 ) )
            {
            // InternalMLRegression.g:1436:1: ( ( rule__ListePredictiveVar__VarPredAssignment_2 ) )
            // InternalMLRegression.g:1437:2: ( rule__ListePredictiveVar__VarPredAssignment_2 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getVarPredAssignment_2()); 
            // InternalMLRegression.g:1438:2: ( rule__ListePredictiveVar__VarPredAssignment_2 )
            // InternalMLRegression.g:1438:3: rule__ListePredictiveVar__VarPredAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__VarPredAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListePredictiveVarAccess().getVarPredAssignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:1446:1: rule__ListePredictiveVar__Group__3 : rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 ;
    public final void rule__ListePredictiveVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1450:1: ( rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 )
            // InternalMLRegression.g:1451:2: rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:1458:1: rule__ListePredictiveVar__Group__3__Impl : ( ( rule__ListePredictiveVar__Group_3__0 )* ) ;
    public final void rule__ListePredictiveVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1462:1: ( ( ( rule__ListePredictiveVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1463:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1463:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            // InternalMLRegression.g:1464:2: ( rule__ListePredictiveVar__Group_3__0 )*
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1465:2: ( rule__ListePredictiveVar__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMLRegression.g:1465:3: rule__ListePredictiveVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalMLRegression.g:1473:1: rule__ListePredictiveVar__Group__4 : rule__ListePredictiveVar__Group__4__Impl ;
    public final void rule__ListePredictiveVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1477:1: ( rule__ListePredictiveVar__Group__4__Impl )
            // InternalMLRegression.g:1478:2: rule__ListePredictiveVar__Group__4__Impl
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
    // InternalMLRegression.g:1484:1: rule__ListePredictiveVar__Group__4__Impl : ( ';' ) ;
    public final void rule__ListePredictiveVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1488:1: ( ( ';' ) )
            // InternalMLRegression.g:1489:1: ( ';' )
            {
            // InternalMLRegression.g:1489:1: ( ';' )
            // InternalMLRegression.g:1490:2: ';'
            {
             before(grammarAccess.getListePredictiveVarAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1500:1: rule__ListePredictiveVar__Group_3__0 : rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 ;
    public final void rule__ListePredictiveVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1504:1: ( rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 )
            // InternalMLRegression.g:1505:2: rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:1512:1: rule__ListePredictiveVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListePredictiveVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1516:1: ( ( ',' ) )
            // InternalMLRegression.g:1517:1: ( ',' )
            {
            // InternalMLRegression.g:1517:1: ( ',' )
            // InternalMLRegression.g:1518:2: ','
            {
             before(grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMLRegression.g:1527:1: rule__ListePredictiveVar__Group_3__1 : rule__ListePredictiveVar__Group_3__1__Impl ;
    public final void rule__ListePredictiveVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1531:1: ( rule__ListePredictiveVar__Group_3__1__Impl )
            // InternalMLRegression.g:1532:2: rule__ListePredictiveVar__Group_3__1__Impl
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
    // InternalMLRegression.g:1538:1: rule__ListePredictiveVar__Group_3__1__Impl : ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) ;
    public final void rule__ListePredictiveVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1542:1: ( ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) ) )
            // InternalMLRegression.g:1543:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1543:1: ( ( rule__ListePredictiveVar__PredVarAssignment_3_1 ) )
            // InternalMLRegression.g:1544:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredVarAssignment_3_1()); 
            // InternalMLRegression.g:1545:2: ( rule__ListePredictiveVar__PredVarAssignment_3_1 )
            // InternalMLRegression.g:1545:3: rule__ListePredictiveVar__PredVarAssignment_3_1
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
    // InternalMLRegression.g:1554:1: rule__TargetVar__Group__0 : rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 ;
    public final void rule__TargetVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1558:1: ( rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 )
            // InternalMLRegression.g:1559:2: rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1566:1: rule__TargetVar__Group__0__Impl : ( 'target_var' ) ;
    public final void rule__TargetVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1570:1: ( ( 'target_var' ) )
            // InternalMLRegression.g:1571:1: ( 'target_var' )
            {
            // InternalMLRegression.g:1571:1: ( 'target_var' )
            // InternalMLRegression.g:1572:2: 'target_var'
            {
             before(grammarAccess.getTargetVarAccess().getTarget_varKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getTarget_varKeyword_0()); 

            }


            }

        }
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
    // InternalMLRegression.g:1581:1: rule__TargetVar__Group__1 : rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 ;
    public final void rule__TargetVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1585:1: ( rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 )
            // InternalMLRegression.g:1586:2: rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:1593:1: rule__TargetVar__Group__1__Impl : ( ':' ) ;
    public final void rule__TargetVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1597:1: ( ( ':' ) )
            // InternalMLRegression.g:1598:1: ( ':' )
            {
            // InternalMLRegression.g:1598:1: ( ':' )
            // InternalMLRegression.g:1599:2: ':'
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
    // InternalMLRegression.g:1608:1: rule__TargetVar__Group__2 : rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 ;
    public final void rule__TargetVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1612:1: ( rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 )
            // InternalMLRegression.g:1613:2: rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1620:1: rule__TargetVar__Group__2__Impl : ( ( rule__TargetVar__VarTarAssignment_2 ) ) ;
    public final void rule__TargetVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1624:1: ( ( ( rule__TargetVar__VarTarAssignment_2 ) ) )
            // InternalMLRegression.g:1625:1: ( ( rule__TargetVar__VarTarAssignment_2 ) )
            {
            // InternalMLRegression.g:1625:1: ( ( rule__TargetVar__VarTarAssignment_2 ) )
            // InternalMLRegression.g:1626:2: ( rule__TargetVar__VarTarAssignment_2 )
            {
             before(grammarAccess.getTargetVarAccess().getVarTarAssignment_2()); 
            // InternalMLRegression.g:1627:2: ( rule__TargetVar__VarTarAssignment_2 )
            // InternalMLRegression.g:1627:3: rule__TargetVar__VarTarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__VarTarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getVarTarAssignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:1635:1: rule__TargetVar__Group__3 : rule__TargetVar__Group__3__Impl ;
    public final void rule__TargetVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1639:1: ( rule__TargetVar__Group__3__Impl )
            // InternalMLRegression.g:1640:2: rule__TargetVar__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMLRegression.g:1646:1: rule__TargetVar__Group__3__Impl : ( ';' ) ;
    public final void rule__TargetVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1650:1: ( ( ';' ) )
            // InternalMLRegression.g:1651:1: ( ';' )
            {
            // InternalMLRegression.g:1651:1: ( ';' )
            // InternalMLRegression.g:1652:2: ';'
            {
             before(grammarAccess.getTargetVarAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Algo__Group__0"
    // InternalMLRegression.g:1662:1: rule__Algo__Group__0 : rule__Algo__Group__0__Impl rule__Algo__Group__1 ;
    public final void rule__Algo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1666:1: ( rule__Algo__Group__0__Impl rule__Algo__Group__1 )
            // InternalMLRegression.g:1667:2: rule__Algo__Group__0__Impl rule__Algo__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMLRegression.g:1674:1: rule__Algo__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1678:1: ( ( 'algorithm' ) )
            // InternalMLRegression.g:1679:1: ( 'algorithm' )
            {
            // InternalMLRegression.g:1679:1: ( 'algorithm' )
            // InternalMLRegression.g:1680:2: 'algorithm'
            {
             before(grammarAccess.getAlgoAccess().getAlgorithmKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMLRegression.g:1689:1: rule__Algo__Group__1 : rule__Algo__Group__1__Impl rule__Algo__Group__2 ;
    public final void rule__Algo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1693:1: ( rule__Algo__Group__1__Impl rule__Algo__Group__2 )
            // InternalMLRegression.g:1694:2: rule__Algo__Group__1__Impl rule__Algo__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMLRegression.g:1701:1: rule__Algo__Group__1__Impl : ( ':' ) ;
    public final void rule__Algo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1705:1: ( ( ':' ) )
            // InternalMLRegression.g:1706:1: ( ':' )
            {
            // InternalMLRegression.g:1706:1: ( ':' )
            // InternalMLRegression.g:1707:2: ':'
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
    // InternalMLRegression.g:1716:1: rule__Algo__Group__2 : rule__Algo__Group__2__Impl rule__Algo__Group__3 ;
    public final void rule__Algo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1720:1: ( rule__Algo__Group__2__Impl rule__Algo__Group__3 )
            // InternalMLRegression.g:1721:2: rule__Algo__Group__2__Impl rule__Algo__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMLRegression.g:1728:1: rule__Algo__Group__2__Impl : ( ( rule__Algo__AlgoAssignment_2 ) ) ;
    public final void rule__Algo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1732:1: ( ( ( rule__Algo__AlgoAssignment_2 ) ) )
            // InternalMLRegression.g:1733:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            {
            // InternalMLRegression.g:1733:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            // InternalMLRegression.g:1734:2: ( rule__Algo__AlgoAssignment_2 )
            {
             before(grammarAccess.getAlgoAccess().getAlgoAssignment_2()); 
            // InternalMLRegression.g:1735:2: ( rule__Algo__AlgoAssignment_2 )
            // InternalMLRegression.g:1735:3: rule__Algo__AlgoAssignment_2
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
    // InternalMLRegression.g:1743:1: rule__Algo__Group__3 : rule__Algo__Group__3__Impl ;
    public final void rule__Algo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1747:1: ( rule__Algo__Group__3__Impl )
            // InternalMLRegression.g:1748:2: rule__Algo__Group__3__Impl
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
    // InternalMLRegression.g:1754:1: rule__Algo__Group__3__Impl : ( ';' ) ;
    public final void rule__Algo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1758:1: ( ( ';' ) )
            // InternalMLRegression.g:1759:1: ( ';' )
            {
            // InternalMLRegression.g:1759:1: ( ';' )
            // InternalMLRegression.g:1760:2: ';'
            {
             before(grammarAccess.getAlgoAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1770:1: rule__LineRegress__Group__0 : rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 ;
    public final void rule__LineRegress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1774:1: ( rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 )
            // InternalMLRegression.g:1775:2: rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMLRegression.g:1782:1: rule__LineRegress__Group__0__Impl : ( 'line_regress' ) ;
    public final void rule__LineRegress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1786:1: ( ( 'line_regress' ) )
            // InternalMLRegression.g:1787:1: ( 'line_regress' )
            {
            // InternalMLRegression.g:1787:1: ( 'line_regress' )
            // InternalMLRegression.g:1788:2: 'line_regress'
            {
             before(grammarAccess.getLineRegressAccess().getLine_regressKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMLRegression.g:1797:1: rule__LineRegress__Group__1 : rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 ;
    public final void rule__LineRegress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1801:1: ( rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 )
            // InternalMLRegression.g:1802:2: rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMLRegression.g:1809:1: rule__LineRegress__Group__1__Impl : ( '(' ) ;
    public final void rule__LineRegress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1813:1: ( ( '(' ) )
            // InternalMLRegression.g:1814:1: ( '(' )
            {
            // InternalMLRegression.g:1814:1: ( '(' )
            // InternalMLRegression.g:1815:2: '('
            {
             before(grammarAccess.getLineRegressAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMLRegression.g:1824:1: rule__LineRegress__Group__2 : rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 ;
    public final void rule__LineRegress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1828:1: ( rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 )
            // InternalMLRegression.g:1829:2: rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1836:1: rule__LineRegress__Group__2__Impl : ( ( rule__LineRegress__X1Assignment_2 ) ) ;
    public final void rule__LineRegress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1840:1: ( ( ( rule__LineRegress__X1Assignment_2 ) ) )
            // InternalMLRegression.g:1841:1: ( ( rule__LineRegress__X1Assignment_2 ) )
            {
            // InternalMLRegression.g:1841:1: ( ( rule__LineRegress__X1Assignment_2 ) )
            // InternalMLRegression.g:1842:2: ( rule__LineRegress__X1Assignment_2 )
            {
             before(grammarAccess.getLineRegressAccess().getX1Assignment_2()); 
            // InternalMLRegression.g:1843:2: ( rule__LineRegress__X1Assignment_2 )
            // InternalMLRegression.g:1843:3: rule__LineRegress__X1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__X1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getX1Assignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:1851:1: rule__LineRegress__Group__3 : rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4 ;
    public final void rule__LineRegress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1855:1: ( rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4 )
            // InternalMLRegression.g:1856:2: rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:1863:1: rule__LineRegress__Group__3__Impl : ( ',' ) ;
    public final void rule__LineRegress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1867:1: ( ( ',' ) )
            // InternalMLRegression.g:1868:1: ( ',' )
            {
            // InternalMLRegression.g:1868:1: ( ',' )
            // InternalMLRegression.g:1869:2: ','
            {
             before(grammarAccess.getLineRegressAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // InternalMLRegression.g:1878:1: rule__LineRegress__Group__4 : rule__LineRegress__Group__4__Impl rule__LineRegress__Group__5 ;
    public final void rule__LineRegress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1882:1: ( rule__LineRegress__Group__4__Impl rule__LineRegress__Group__5 )
            // InternalMLRegression.g:1883:2: rule__LineRegress__Group__4__Impl rule__LineRegress__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalMLRegression.g:1890:1: rule__LineRegress__Group__4__Impl : ( ( rule__LineRegress__Y1Assignment_4 ) ) ;
    public final void rule__LineRegress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1894:1: ( ( ( rule__LineRegress__Y1Assignment_4 ) ) )
            // InternalMLRegression.g:1895:1: ( ( rule__LineRegress__Y1Assignment_4 ) )
            {
            // InternalMLRegression.g:1895:1: ( ( rule__LineRegress__Y1Assignment_4 ) )
            // InternalMLRegression.g:1896:2: ( rule__LineRegress__Y1Assignment_4 )
            {
             before(grammarAccess.getLineRegressAccess().getY1Assignment_4()); 
            // InternalMLRegression.g:1897:2: ( rule__LineRegress__Y1Assignment_4 )
            // InternalMLRegression.g:1897:3: rule__LineRegress__Y1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Y1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getY1Assignment_4()); 

            }


            }

        }
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
    // InternalMLRegression.g:1905:1: rule__LineRegress__Group__5 : rule__LineRegress__Group__5__Impl rule__LineRegress__Group__6 ;
    public final void rule__LineRegress__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1909:1: ( rule__LineRegress__Group__5__Impl rule__LineRegress__Group__6 )
            // InternalMLRegression.g:1910:2: rule__LineRegress__Group__5__Impl rule__LineRegress__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__LineRegress__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMLRegression.g:1917:1: rule__LineRegress__Group__5__Impl : ( ',' ) ;
    public final void rule__LineRegress__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1921:1: ( ( ',' ) )
            // InternalMLRegression.g:1922:1: ( ',' )
            {
            // InternalMLRegression.g:1922:1: ( ',' )
            // InternalMLRegression.g:1923:2: ','
            {
             before(grammarAccess.getLineRegressAccess().getCommaKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getCommaKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__LineRegress__Group__6"
    // InternalMLRegression.g:1932:1: rule__LineRegress__Group__6 : rule__LineRegress__Group__6__Impl rule__LineRegress__Group__7 ;
    public final void rule__LineRegress__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1936:1: ( rule__LineRegress__Group__6__Impl rule__LineRegress__Group__7 )
            // InternalMLRegression.g:1937:2: rule__LineRegress__Group__6__Impl rule__LineRegress__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__LineRegress__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__6"


    // $ANTLR start "rule__LineRegress__Group__6__Impl"
    // InternalMLRegression.g:1944:1: rule__LineRegress__Group__6__Impl : ( ( rule__LineRegress__X2Assignment_6 ) ) ;
    public final void rule__LineRegress__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1948:1: ( ( ( rule__LineRegress__X2Assignment_6 ) ) )
            // InternalMLRegression.g:1949:1: ( ( rule__LineRegress__X2Assignment_6 ) )
            {
            // InternalMLRegression.g:1949:1: ( ( rule__LineRegress__X2Assignment_6 ) )
            // InternalMLRegression.g:1950:2: ( rule__LineRegress__X2Assignment_6 )
            {
             before(grammarAccess.getLineRegressAccess().getX2Assignment_6()); 
            // InternalMLRegression.g:1951:2: ( rule__LineRegress__X2Assignment_6 )
            // InternalMLRegression.g:1951:3: rule__LineRegress__X2Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__X2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getX2Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__6__Impl"


    // $ANTLR start "rule__LineRegress__Group__7"
    // InternalMLRegression.g:1959:1: rule__LineRegress__Group__7 : rule__LineRegress__Group__7__Impl rule__LineRegress__Group__8 ;
    public final void rule__LineRegress__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1963:1: ( rule__LineRegress__Group__7__Impl rule__LineRegress__Group__8 )
            // InternalMLRegression.g:1964:2: rule__LineRegress__Group__7__Impl rule__LineRegress__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__LineRegress__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__7"


    // $ANTLR start "rule__LineRegress__Group__7__Impl"
    // InternalMLRegression.g:1971:1: rule__LineRegress__Group__7__Impl : ( ',' ) ;
    public final void rule__LineRegress__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1975:1: ( ( ',' ) )
            // InternalMLRegression.g:1976:1: ( ',' )
            {
            // InternalMLRegression.g:1976:1: ( ',' )
            // InternalMLRegression.g:1977:2: ','
            {
             before(grammarAccess.getLineRegressAccess().getCommaKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__7__Impl"


    // $ANTLR start "rule__LineRegress__Group__8"
    // InternalMLRegression.g:1986:1: rule__LineRegress__Group__8 : rule__LineRegress__Group__8__Impl rule__LineRegress__Group__9 ;
    public final void rule__LineRegress__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1990:1: ( rule__LineRegress__Group__8__Impl rule__LineRegress__Group__9 )
            // InternalMLRegression.g:1991:2: rule__LineRegress__Group__8__Impl rule__LineRegress__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__LineRegress__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__8"


    // $ANTLR start "rule__LineRegress__Group__8__Impl"
    // InternalMLRegression.g:1998:1: rule__LineRegress__Group__8__Impl : ( ( rule__LineRegress__Y2Assignment_8 ) ) ;
    public final void rule__LineRegress__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2002:1: ( ( ( rule__LineRegress__Y2Assignment_8 ) ) )
            // InternalMLRegression.g:2003:1: ( ( rule__LineRegress__Y2Assignment_8 ) )
            {
            // InternalMLRegression.g:2003:1: ( ( rule__LineRegress__Y2Assignment_8 ) )
            // InternalMLRegression.g:2004:2: ( rule__LineRegress__Y2Assignment_8 )
            {
             before(grammarAccess.getLineRegressAccess().getY2Assignment_8()); 
            // InternalMLRegression.g:2005:2: ( rule__LineRegress__Y2Assignment_8 )
            // InternalMLRegression.g:2005:3: rule__LineRegress__Y2Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Y2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getY2Assignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__8__Impl"


    // $ANTLR start "rule__LineRegress__Group__9"
    // InternalMLRegression.g:2013:1: rule__LineRegress__Group__9 : rule__LineRegress__Group__9__Impl ;
    public final void rule__LineRegress__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2017:1: ( rule__LineRegress__Group__9__Impl )
            // InternalMLRegression.g:2018:2: rule__LineRegress__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__9"


    // $ANTLR start "rule__LineRegress__Group__9__Impl"
    // InternalMLRegression.g:2024:1: rule__LineRegress__Group__9__Impl : ( ')' ) ;
    public final void rule__LineRegress__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2028:1: ( ( ')' ) )
            // InternalMLRegression.g:2029:1: ( ')' )
            {
            // InternalMLRegression.g:2029:1: ( ')' )
            // InternalMLRegression.g:2030:2: ')'
            {
             before(grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group__9__Impl"


    // $ANTLR start "rule__NumberValue__Group__0"
    // InternalMLRegression.g:2040:1: rule__NumberValue__Group__0 : rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1 ;
    public final void rule__NumberValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2044:1: ( rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1 )
            // InternalMLRegression.g:2045:2: rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMLRegression.g:2052:1: rule__NumberValue__Group__0__Impl : ( ( rule__NumberValue__ValueAssignment_0 ) ) ;
    public final void rule__NumberValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2056:1: ( ( ( rule__NumberValue__ValueAssignment_0 ) ) )
            // InternalMLRegression.g:2057:1: ( ( rule__NumberValue__ValueAssignment_0 ) )
            {
            // InternalMLRegression.g:2057:1: ( ( rule__NumberValue__ValueAssignment_0 ) )
            // InternalMLRegression.g:2058:2: ( rule__NumberValue__ValueAssignment_0 )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment_0()); 
            // InternalMLRegression.g:2059:2: ( rule__NumberValue__ValueAssignment_0 )
            // InternalMLRegression.g:2059:3: rule__NumberValue__ValueAssignment_0
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
    // InternalMLRegression.g:2067:1: rule__NumberValue__Group__1 : rule__NumberValue__Group__1__Impl ;
    public final void rule__NumberValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2071:1: ( rule__NumberValue__Group__1__Impl )
            // InternalMLRegression.g:2072:2: rule__NumberValue__Group__1__Impl
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
    // InternalMLRegression.g:2078:1: rule__NumberValue__Group__1__Impl : ( ( rule__NumberValue__Group_1__0 )? ) ;
    public final void rule__NumberValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2082:1: ( ( ( rule__NumberValue__Group_1__0 )? ) )
            // InternalMLRegression.g:2083:1: ( ( rule__NumberValue__Group_1__0 )? )
            {
            // InternalMLRegression.g:2083:1: ( ( rule__NumberValue__Group_1__0 )? )
            // InternalMLRegression.g:2084:2: ( rule__NumberValue__Group_1__0 )?
            {
             before(grammarAccess.getNumberValueAccess().getGroup_1()); 
            // InternalMLRegression.g:2085:2: ( rule__NumberValue__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMLRegression.g:2085:3: rule__NumberValue__Group_1__0
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
    // InternalMLRegression.g:2094:1: rule__NumberValue__Group_1__0 : rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1 ;
    public final void rule__NumberValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2098:1: ( rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1 )
            // InternalMLRegression.g:2099:2: rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:2106:1: rule__NumberValue__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NumberValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2110:1: ( ( '.' ) )
            // InternalMLRegression.g:2111:1: ( '.' )
            {
            // InternalMLRegression.g:2111:1: ( '.' )
            // InternalMLRegression.g:2112:2: '.'
            {
             before(grammarAccess.getNumberValueAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMLRegression.g:2121:1: rule__NumberValue__Group_1__1 : rule__NumberValue__Group_1__1__Impl ;
    public final void rule__NumberValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2125:1: ( rule__NumberValue__Group_1__1__Impl )
            // InternalMLRegression.g:2126:2: rule__NumberValue__Group_1__1__Impl
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
    // InternalMLRegression.g:2132:1: rule__NumberValue__Group_1__1__Impl : ( ( rule__NumberValue__DecimalAssignment_1_1 )* ) ;
    public final void rule__NumberValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2136:1: ( ( ( rule__NumberValue__DecimalAssignment_1_1 )* ) )
            // InternalMLRegression.g:2137:1: ( ( rule__NumberValue__DecimalAssignment_1_1 )* )
            {
            // InternalMLRegression.g:2137:1: ( ( rule__NumberValue__DecimalAssignment_1_1 )* )
            // InternalMLRegression.g:2138:2: ( rule__NumberValue__DecimalAssignment_1_1 )*
            {
             before(grammarAccess.getNumberValueAccess().getDecimalAssignment_1_1()); 
            // InternalMLRegression.g:2139:2: ( rule__NumberValue__DecimalAssignment_1_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMLRegression.g:2139:3: rule__NumberValue__DecimalAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalMLRegression.g:2148:1: rule__PercentValue__Group__0 : rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1 ;
    public final void rule__PercentValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2152:1: ( rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1 )
            // InternalMLRegression.g:2153:2: rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMLRegression.g:2160:1: rule__PercentValue__Group__0__Impl : ( ruleNumberValue ) ;
    public final void rule__PercentValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2164:1: ( ( ruleNumberValue ) )
            // InternalMLRegression.g:2165:1: ( ruleNumberValue )
            {
            // InternalMLRegression.g:2165:1: ( ruleNumberValue )
            // InternalMLRegression.g:2166:2: ruleNumberValue
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
    // InternalMLRegression.g:2175:1: rule__PercentValue__Group__1 : rule__PercentValue__Group__1__Impl ;
    public final void rule__PercentValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2179:1: ( rule__PercentValue__Group__1__Impl )
            // InternalMLRegression.g:2180:2: rule__PercentValue__Group__1__Impl
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
    // InternalMLRegression.g:2186:1: rule__PercentValue__Group__1__Impl : ( '%' ) ;
    public final void rule__PercentValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2190:1: ( ( '%' ) )
            // InternalMLRegression.g:2191:1: ( '%' )
            {
            // InternalMLRegression.g:2191:1: ( '%' )
            // InternalMLRegression.g:2192:2: '%'
            {
             before(grammarAccess.getPercentValueAccess().getPercentSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMLRegression.g:2202:1: rule__MLRegression__DatasetAssignment_0 : ( ruleDataset ) ;
    public final void rule__MLRegression__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2206:1: ( ( ruleDataset ) )
            // InternalMLRegression.g:2207:2: ( ruleDataset )
            {
            // InternalMLRegression.g:2207:2: ( ruleDataset )
            // InternalMLRegression.g:2208:3: ruleDataset
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


    // $ANTLR start "rule__MLRegression__EvaluationAssignment_1"
    // InternalMLRegression.g:2217:1: rule__MLRegression__EvaluationAssignment_1 : ( ruleEvaluationType ) ;
    public final void rule__MLRegression__EvaluationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2221:1: ( ( ruleEvaluationType ) )
            // InternalMLRegression.g:2222:2: ( ruleEvaluationType )
            {
            // InternalMLRegression.g:2222:2: ( ruleEvaluationType )
            // InternalMLRegression.g:2223:3: ruleEvaluationType
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationType();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getEvaluationEvaluationTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__EvaluationAssignment_1"


    // $ANTLR start "rule__MLRegression__VarsAssignment_2"
    // InternalMLRegression.g:2232:1: rule__MLRegression__VarsAssignment_2 : ( ruleVariables ) ;
    public final void rule__MLRegression__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2236:1: ( ( ruleVariables ) )
            // InternalMLRegression.g:2237:2: ( ruleVariables )
            {
            // InternalMLRegression.g:2237:2: ( ruleVariables )
            // InternalMLRegression.g:2238:3: ruleVariables
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


    // $ANTLR start "rule__MLRegression__CalculateAssignment_3"
    // InternalMLRegression.g:2247:1: rule__MLRegression__CalculateAssignment_3 : ( ruleCalculate ) ;
    public final void rule__MLRegression__CalculateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2251:1: ( ( ruleCalculate ) )
            // InternalMLRegression.g:2252:2: ( ruleCalculate )
            {
            // InternalMLRegression.g:2252:2: ( ruleCalculate )
            // InternalMLRegression.g:2253:3: ruleCalculate
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculate();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getCalculateCalculateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__CalculateAssignment_3"


    // $ANTLR start "rule__MLRegression__AlgoAssignment_4"
    // InternalMLRegression.g:2262:1: rule__MLRegression__AlgoAssignment_4 : ( ruleAlgo ) ;
    public final void rule__MLRegression__AlgoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2266:1: ( ( ruleAlgo ) )
            // InternalMLRegression.g:2267:2: ( ruleAlgo )
            {
            // InternalMLRegression.g:2267:2: ( ruleAlgo )
            // InternalMLRegression.g:2268:3: ruleAlgo
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgo();

            state._fsp--;

             after(grammarAccess.getMLRegressionAccess().getAlgoAlgoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLRegression__AlgoAssignment_4"


    // $ANTLR start "rule__Calculate__CalculateTypeAssignment_2"
    // InternalMLRegression.g:2277:1: rule__Calculate__CalculateTypeAssignment_2 : ( ruleCalculateType ) ;
    public final void rule__Calculate__CalculateTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2281:1: ( ( ruleCalculateType ) )
            // InternalMLRegression.g:2282:2: ( ruleCalculateType )
            {
            // InternalMLRegression.g:2282:2: ( ruleCalculateType )
            // InternalMLRegression.g:2283:3: ruleCalculateType
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


    // $ANTLR start "rule__Dataset__DatasetAssignment_0"
    // InternalMLRegression.g:2292:1: rule__Dataset__DatasetAssignment_0 : ( ( 'import' ) ) ;
    public final void rule__Dataset__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2296:1: ( ( ( 'import' ) ) )
            // InternalMLRegression.g:2297:2: ( ( 'import' ) )
            {
            // InternalMLRegression.g:2297:2: ( ( 'import' ) )
            // InternalMLRegression.g:2298:3: ( 'import' )
            {
             before(grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0()); 
            // InternalMLRegression.g:2299:3: ( 'import' )
            // InternalMLRegression.g:2300:4: 'import'
            {
             before(grammarAccess.getDatasetAccess().getDatasetImportKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMLRegression.g:2311:1: rule__Dataset__DataAssignment_1 : ( ruleStringValue ) ;
    public final void rule__Dataset__DataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2315:1: ( ( ruleStringValue ) )
            // InternalMLRegression.g:2316:2: ( ruleStringValue )
            {
            // InternalMLRegression.g:2316:2: ( ruleStringValue )
            // InternalMLRegression.g:2317:3: ruleStringValue
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


    // $ANTLR start "rule__Partition__TrainAssignment_2"
    // InternalMLRegression.g:2326:1: rule__Partition__TrainAssignment_2 : ( ruleNumericValue ) ;
    public final void rule__Partition__TrainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2330:1: ( ( ruleNumericValue ) )
            // InternalMLRegression.g:2331:2: ( ruleNumericValue )
            {
            // InternalMLRegression.g:2331:2: ( ruleNumericValue )
            // InternalMLRegression.g:2332:3: ruleNumericValue
            {
             before(grammarAccess.getPartitionAccess().getTrainNumericValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericValue();

            state._fsp--;

             after(grammarAccess.getPartitionAccess().getTrainNumericValueParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMLRegression.g:2341:1: rule__Partition__TestAssignment_4 : ( ruleNumericValue ) ;
    public final void rule__Partition__TestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2345:1: ( ( ruleNumericValue ) )
            // InternalMLRegression.g:2346:2: ( ruleNumericValue )
            {
            // InternalMLRegression.g:2346:2: ( ruleNumericValue )
            // InternalMLRegression.g:2347:3: ruleNumericValue
            {
             before(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericValue();

            state._fsp--;

             after(grammarAccess.getPartitionAccess().getTestNumericValueParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMLRegression.g:2356:1: rule__CrossValidation__KAssignment_2 : ( ruleIntegerValue ) ;
    public final void rule__CrossValidation__KAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2360:1: ( ( ruleIntegerValue ) )
            // InternalMLRegression.g:2361:2: ( ruleIntegerValue )
            {
            // InternalMLRegression.g:2361:2: ( ruleIntegerValue )
            // InternalMLRegression.g:2362:3: ruleIntegerValue
            {
             before(grammarAccess.getCrossValidationAccess().getKIntegerValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getCrossValidationAccess().getKIntegerValueParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMLRegression.g:2371:1: rule__Variables__PredictivesAssignment_0 : ( ruleListePredictiveVar ) ;
    public final void rule__Variables__PredictivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2375:1: ( ( ruleListePredictiveVar ) )
            // InternalMLRegression.g:2376:2: ( ruleListePredictiveVar )
            {
            // InternalMLRegression.g:2376:2: ( ruleListePredictiveVar )
            // InternalMLRegression.g:2377:3: ruleListePredictiveVar
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
    // InternalMLRegression.g:2386:1: rule__Variables__TargetsAssignment_1 : ( ruleTargetVar ) ;
    public final void rule__Variables__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2390:1: ( ( ruleTargetVar ) )
            // InternalMLRegression.g:2391:2: ( ruleTargetVar )
            {
            // InternalMLRegression.g:2391:2: ( ruleTargetVar )
            // InternalMLRegression.g:2392:3: ruleTargetVar
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


    // $ANTLR start "rule__ListePredictiveVar__VarPredAssignment_2"
    // InternalMLRegression.g:2401:1: rule__ListePredictiveVar__VarPredAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__VarPredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2405:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2406:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2406:2: ( RULE_STRING )
            // InternalMLRegression.g:2407:3: RULE_STRING
            {
             before(grammarAccess.getListePredictiveVarAccess().getVarPredSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getVarPredSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListePredictiveVar__VarPredAssignment_2"


    // $ANTLR start "rule__ListePredictiveVar__PredVarAssignment_3_1"
    // InternalMLRegression.g:2416:1: rule__ListePredictiveVar__PredVarAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__PredVarAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2420:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2421:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2421:2: ( RULE_STRING )
            // InternalMLRegression.g:2422:3: RULE_STRING
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


    // $ANTLR start "rule__TargetVar__VarTarAssignment_2"
    // InternalMLRegression.g:2431:1: rule__TargetVar__VarTarAssignment_2 : ( ruleStringValue ) ;
    public final void rule__TargetVar__VarTarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2435:1: ( ( ruleStringValue ) )
            // InternalMLRegression.g:2436:2: ( ruleStringValue )
            {
            // InternalMLRegression.g:2436:2: ( ruleStringValue )
            // InternalMLRegression.g:2437:3: ruleStringValue
            {
             before(grammarAccess.getTargetVarAccess().getVarTarStringValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getTargetVarAccess().getVarTarStringValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__VarTarAssignment_2"


    // $ANTLR start "rule__Algo__AlgoAssignment_2"
    // InternalMLRegression.g:2446:1: rule__Algo__AlgoAssignment_2 : ( ruleAlgoML ) ;
    public final void rule__Algo__AlgoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2450:1: ( ( ruleAlgoML ) )
            // InternalMLRegression.g:2451:2: ( ruleAlgoML )
            {
            // InternalMLRegression.g:2451:2: ( ruleAlgoML )
            // InternalMLRegression.g:2452:3: ruleAlgoML
            {
             before(grammarAccess.getAlgoAccess().getAlgoAlgoMLParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgoML();

            state._fsp--;

             after(grammarAccess.getAlgoAccess().getAlgoAlgoMLParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__LineRegress__X1Assignment_2"
    // InternalMLRegression.g:2461:1: rule__LineRegress__X1Assignment_2 : ( RULE_ID ) ;
    public final void rule__LineRegress__X1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2465:1: ( ( RULE_ID ) )
            // InternalMLRegression.g:2466:2: ( RULE_ID )
            {
            // InternalMLRegression.g:2466:2: ( RULE_ID )
            // InternalMLRegression.g:2467:3: RULE_ID
            {
             before(grammarAccess.getLineRegressAccess().getX1IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getX1IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__X1Assignment_2"


    // $ANTLR start "rule__LineRegress__Y1Assignment_4"
    // InternalMLRegression.g:2476:1: rule__LineRegress__Y1Assignment_4 : ( ruleY ) ;
    public final void rule__LineRegress__Y1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2480:1: ( ( ruleY ) )
            // InternalMLRegression.g:2481:2: ( ruleY )
            {
            // InternalMLRegression.g:2481:2: ( ruleY )
            // InternalMLRegression.g:2482:3: ruleY
            {
             before(grammarAccess.getLineRegressAccess().getY1YParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleY();

            state._fsp--;

             after(grammarAccess.getLineRegressAccess().getY1YParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Y1Assignment_4"


    // $ANTLR start "rule__LineRegress__X2Assignment_6"
    // InternalMLRegression.g:2491:1: rule__LineRegress__X2Assignment_6 : ( RULE_ID ) ;
    public final void rule__LineRegress__X2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2495:1: ( ( RULE_ID ) )
            // InternalMLRegression.g:2496:2: ( RULE_ID )
            {
            // InternalMLRegression.g:2496:2: ( RULE_ID )
            // InternalMLRegression.g:2497:3: RULE_ID
            {
             before(grammarAccess.getLineRegressAccess().getX2IDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getX2IDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__X2Assignment_6"


    // $ANTLR start "rule__LineRegress__Y2Assignment_8"
    // InternalMLRegression.g:2506:1: rule__LineRegress__Y2Assignment_8 : ( ruleY ) ;
    public final void rule__LineRegress__Y2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2510:1: ( ( ruleY ) )
            // InternalMLRegression.g:2511:2: ( ruleY )
            {
            // InternalMLRegression.g:2511:2: ( ruleY )
            // InternalMLRegression.g:2512:3: ruleY
            {
             before(grammarAccess.getLineRegressAccess().getY2YParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleY();

            state._fsp--;

             after(grammarAccess.getLineRegressAccess().getY2YParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Y2Assignment_8"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalMLRegression.g:2521:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2525:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2526:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2526:2: ( RULE_STRING )
            // InternalMLRegression.g:2527:3: RULE_STRING
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
    // InternalMLRegression.g:2536:1: rule__NumberValue__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2540:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2541:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2541:2: ( RULE_INT )
            // InternalMLRegression.g:2542:3: RULE_INT
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
    // InternalMLRegression.g:2551:1: rule__NumberValue__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__NumberValue__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2555:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2556:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2556:2: ( RULE_INT )
            // InternalMLRegression.g:2557:3: RULE_INT
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


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // InternalMLRegression.g:2566:1: rule__IntegerValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2570:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2571:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2571:2: ( RULE_INT )
            // InternalMLRegression.g:2572:3: RULE_INT
            {
             before(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__ValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalMLRegression.g:2581:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2585:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalMLRegression.g:2586:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalMLRegression.g:2586:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalMLRegression.g:2587:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // InternalMLRegression.g:2588:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalMLRegression.g:2588:4: rule__BooleanValue__ValueAlternatives_0
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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\2\4\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\22\1\4\2\uffff\1\4";
    static final String dfa_4s = "\1\4\2\35\2\uffff\1\35";
    static final String dfa_5s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\4\1\uffff\1\4\7\uffff\1\2\1\3",
            "\1\5\15\uffff\1\4\1\uffff\1\4\10\uffff\1\3",
            "",
            "",
            "\1\5\15\uffff\1\4\1\uffff\1\4\10\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "675:1: rule__NumericValue__Alternatives : ( ( ruleNumberValue ) | ( rulePercentValue ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});

}