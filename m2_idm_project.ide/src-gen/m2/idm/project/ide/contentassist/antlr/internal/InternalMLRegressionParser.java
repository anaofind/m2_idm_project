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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min_error'", "'min_square_error'", "'sums_square_error'", "'false'", "'true'", "'calculate'", "':'", "';'", "'import'", "'partition'", "','", "'cross_validation'", "'predictive_vars'", "'target_vars'", "'algorithm'", "'line_regress'", "'('", "')'", "'decision_tree_regressor'", "'svr'", "'.'", "'%'"
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


    // $ANTLR start "entryRuleMinError"
    // InternalMLRegression.g:428:1: entryRuleMinError : ruleMinError EOF ;
    public final void entryRuleMinError() throws RecognitionException {
        try {
            // InternalMLRegression.g:429:1: ( ruleMinError EOF )
            // InternalMLRegression.g:430:1: ruleMinError EOF
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
    // InternalMLRegression.g:437:1: ruleMinError : ( 'min_error' ) ;
    public final void ruleMinError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:441:2: ( ( 'min_error' ) )
            // InternalMLRegression.g:442:2: ( 'min_error' )
            {
            // InternalMLRegression.g:442:2: ( 'min_error' )
            // InternalMLRegression.g:443:3: 'min_error'
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
    // InternalMLRegression.g:453:1: entryRuleMinSquaredError : ruleMinSquaredError EOF ;
    public final void entryRuleMinSquaredError() throws RecognitionException {
        try {
            // InternalMLRegression.g:454:1: ( ruleMinSquaredError EOF )
            // InternalMLRegression.g:455:1: ruleMinSquaredError EOF
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
    // InternalMLRegression.g:462:1: ruleMinSquaredError : ( 'min_square_error' ) ;
    public final void ruleMinSquaredError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:466:2: ( ( 'min_square_error' ) )
            // InternalMLRegression.g:467:2: ( 'min_square_error' )
            {
            // InternalMLRegression.g:467:2: ( 'min_square_error' )
            // InternalMLRegression.g:468:3: 'min_square_error'
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
    // InternalMLRegression.g:478:1: entryRuleSumsSquaredError : ruleSumsSquaredError EOF ;
    public final void entryRuleSumsSquaredError() throws RecognitionException {
        try {
            // InternalMLRegression.g:479:1: ( ruleSumsSquaredError EOF )
            // InternalMLRegression.g:480:1: ruleSumsSquaredError EOF
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
    // InternalMLRegression.g:487:1: ruleSumsSquaredError : ( 'sums_square_error' ) ;
    public final void ruleSumsSquaredError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:491:2: ( ( 'sums_square_error' ) )
            // InternalMLRegression.g:492:2: ( 'sums_square_error' )
            {
            // InternalMLRegression.g:492:2: ( 'sums_square_error' )
            // InternalMLRegression.g:493:3: 'sums_square_error'
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
    // InternalMLRegression.g:503:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:504:1: ( ruleStringValue EOF )
            // InternalMLRegression.g:505:1: ruleStringValue EOF
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
    // InternalMLRegression.g:512:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:516:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalMLRegression.g:517:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:517:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalMLRegression.g:518:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:519:3: ( rule__StringValue__ValueAssignment )
            // InternalMLRegression.g:519:4: rule__StringValue__ValueAssignment
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
    // InternalMLRegression.g:528:1: entryRuleNumericValue : ruleNumericValue EOF ;
    public final void entryRuleNumericValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:529:1: ( ruleNumericValue EOF )
            // InternalMLRegression.g:530:1: ruleNumericValue EOF
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
    // InternalMLRegression.g:537:1: ruleNumericValue : ( ( rule__NumericValue__Alternatives ) ) ;
    public final void ruleNumericValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:541:2: ( ( ( rule__NumericValue__Alternatives ) ) )
            // InternalMLRegression.g:542:2: ( ( rule__NumericValue__Alternatives ) )
            {
            // InternalMLRegression.g:542:2: ( ( rule__NumericValue__Alternatives ) )
            // InternalMLRegression.g:543:3: ( rule__NumericValue__Alternatives )
            {
             before(grammarAccess.getNumericValueAccess().getAlternatives()); 
            // InternalMLRegression.g:544:3: ( rule__NumericValue__Alternatives )
            // InternalMLRegression.g:544:4: rule__NumericValue__Alternatives
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
    // InternalMLRegression.g:553:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:554:1: ( ruleNumberValue EOF )
            // InternalMLRegression.g:555:1: ruleNumberValue EOF
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
    // InternalMLRegression.g:562:1: ruleNumberValue : ( ( rule__NumberValue__Group__0 ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:566:2: ( ( ( rule__NumberValue__Group__0 ) ) )
            // InternalMLRegression.g:567:2: ( ( rule__NumberValue__Group__0 ) )
            {
            // InternalMLRegression.g:567:2: ( ( rule__NumberValue__Group__0 ) )
            // InternalMLRegression.g:568:3: ( rule__NumberValue__Group__0 )
            {
             before(grammarAccess.getNumberValueAccess().getGroup()); 
            // InternalMLRegression.g:569:3: ( rule__NumberValue__Group__0 )
            // InternalMLRegression.g:569:4: rule__NumberValue__Group__0
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
    // InternalMLRegression.g:578:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:579:1: ( ruleIntegerValue EOF )
            // InternalMLRegression.g:580:1: ruleIntegerValue EOF
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
    // InternalMLRegression.g:587:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:591:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // InternalMLRegression.g:592:2: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:592:2: ( ( rule__IntegerValue__ValueAssignment ) )
            // InternalMLRegression.g:593:3: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:594:3: ( rule__IntegerValue__ValueAssignment )
            // InternalMLRegression.g:594:4: rule__IntegerValue__ValueAssignment
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
    // InternalMLRegression.g:603:1: entryRulePercentValue : rulePercentValue EOF ;
    public final void entryRulePercentValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:604:1: ( rulePercentValue EOF )
            // InternalMLRegression.g:605:1: rulePercentValue EOF
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
    // InternalMLRegression.g:612:1: rulePercentValue : ( ( rule__PercentValue__Group__0 ) ) ;
    public final void rulePercentValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:616:2: ( ( ( rule__PercentValue__Group__0 ) ) )
            // InternalMLRegression.g:617:2: ( ( rule__PercentValue__Group__0 ) )
            {
            // InternalMLRegression.g:617:2: ( ( rule__PercentValue__Group__0 ) )
            // InternalMLRegression.g:618:3: ( rule__PercentValue__Group__0 )
            {
             before(grammarAccess.getPercentValueAccess().getGroup()); 
            // InternalMLRegression.g:619:3: ( rule__PercentValue__Group__0 )
            // InternalMLRegression.g:619:4: rule__PercentValue__Group__0
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
    // InternalMLRegression.g:628:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalMLRegression.g:629:1: ( ruleBooleanValue EOF )
            // InternalMLRegression.g:630:1: ruleBooleanValue EOF
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
    // InternalMLRegression.g:637:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:641:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalMLRegression.g:642:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalMLRegression.g:642:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalMLRegression.g:643:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalMLRegression.g:644:3: ( rule__BooleanValue__ValueAssignment )
            // InternalMLRegression.g:644:4: rule__BooleanValue__ValueAssignment
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
    // InternalMLRegression.g:652:1: rule__CalculateType__Alternatives : ( ( ( rule__CalculateType__TypeAssignment_0 ) ) | ( ( rule__CalculateType__TypeAssignment_1 ) ) | ( ( rule__CalculateType__TypeAssignment_2 ) ) );
    public final void rule__CalculateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:656:1: ( ( ( rule__CalculateType__TypeAssignment_0 ) ) | ( ( rule__CalculateType__TypeAssignment_1 ) ) | ( ( rule__CalculateType__TypeAssignment_2 ) ) )
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
                    // InternalMLRegression.g:657:2: ( ( rule__CalculateType__TypeAssignment_0 ) )
                    {
                    // InternalMLRegression.g:657:2: ( ( rule__CalculateType__TypeAssignment_0 ) )
                    // InternalMLRegression.g:658:3: ( rule__CalculateType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getCalculateTypeAccess().getTypeAssignment_0()); 
                    // InternalMLRegression.g:659:3: ( rule__CalculateType__TypeAssignment_0 )
                    // InternalMLRegression.g:659:4: rule__CalculateType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalculateType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalculateTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:663:2: ( ( rule__CalculateType__TypeAssignment_1 ) )
                    {
                    // InternalMLRegression.g:663:2: ( ( rule__CalculateType__TypeAssignment_1 ) )
                    // InternalMLRegression.g:664:3: ( rule__CalculateType__TypeAssignment_1 )
                    {
                     before(grammarAccess.getCalculateTypeAccess().getTypeAssignment_1()); 
                    // InternalMLRegression.g:665:3: ( rule__CalculateType__TypeAssignment_1 )
                    // InternalMLRegression.g:665:4: rule__CalculateType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalculateType__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalculateTypeAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:669:2: ( ( rule__CalculateType__TypeAssignment_2 ) )
                    {
                    // InternalMLRegression.g:669:2: ( ( rule__CalculateType__TypeAssignment_2 ) )
                    // InternalMLRegression.g:670:3: ( rule__CalculateType__TypeAssignment_2 )
                    {
                     before(grammarAccess.getCalculateTypeAccess().getTypeAssignment_2()); 
                    // InternalMLRegression.g:671:3: ( rule__CalculateType__TypeAssignment_2 )
                    // InternalMLRegression.g:671:4: rule__CalculateType__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalculateType__TypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalculateTypeAccess().getTypeAssignment_2()); 

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
    // InternalMLRegression.g:679:1: rule__EvaluationType__Alternatives : ( ( ( rule__EvaluationType__TypeAssignment_0 ) ) | ( ( rule__EvaluationType__TypeAssignment_1 ) ) );
    public final void rule__EvaluationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:683:1: ( ( ( rule__EvaluationType__TypeAssignment_0 ) ) | ( ( rule__EvaluationType__TypeAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMLRegression.g:684:2: ( ( rule__EvaluationType__TypeAssignment_0 ) )
                    {
                    // InternalMLRegression.g:684:2: ( ( rule__EvaluationType__TypeAssignment_0 ) )
                    // InternalMLRegression.g:685:3: ( rule__EvaluationType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getEvaluationTypeAccess().getTypeAssignment_0()); 
                    // InternalMLRegression.g:686:3: ( rule__EvaluationType__TypeAssignment_0 )
                    // InternalMLRegression.g:686:4: rule__EvaluationType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvaluationType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvaluationTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:690:2: ( ( rule__EvaluationType__TypeAssignment_1 ) )
                    {
                    // InternalMLRegression.g:690:2: ( ( rule__EvaluationType__TypeAssignment_1 ) )
                    // InternalMLRegression.g:691:3: ( rule__EvaluationType__TypeAssignment_1 )
                    {
                     before(grammarAccess.getEvaluationTypeAccess().getTypeAssignment_1()); 
                    // InternalMLRegression.g:692:3: ( rule__EvaluationType__TypeAssignment_1 )
                    // InternalMLRegression.g:692:4: rule__EvaluationType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvaluationType__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvaluationTypeAccess().getTypeAssignment_1()); 

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
    // InternalMLRegression.g:700:1: rule__AlgoType__Alternatives : ( ( ( rule__AlgoType__TypeAssignment_0 ) ) | ( ( rule__AlgoType__TypeAssignment_1 ) ) | ( ( rule__AlgoType__TypeAssignment_2 ) ) );
    public final void rule__AlgoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:704:1: ( ( ( rule__AlgoType__TypeAssignment_0 ) ) | ( ( rule__AlgoType__TypeAssignment_1 ) ) | ( ( rule__AlgoType__TypeAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 29:
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
                    // InternalMLRegression.g:705:2: ( ( rule__AlgoType__TypeAssignment_0 ) )
                    {
                    // InternalMLRegression.g:705:2: ( ( rule__AlgoType__TypeAssignment_0 ) )
                    // InternalMLRegression.g:706:3: ( rule__AlgoType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getAlgoTypeAccess().getTypeAssignment_0()); 
                    // InternalMLRegression.g:707:3: ( rule__AlgoType__TypeAssignment_0 )
                    // InternalMLRegression.g:707:4: rule__AlgoType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AlgoType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlgoTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:711:2: ( ( rule__AlgoType__TypeAssignment_1 ) )
                    {
                    // InternalMLRegression.g:711:2: ( ( rule__AlgoType__TypeAssignment_1 ) )
                    // InternalMLRegression.g:712:3: ( rule__AlgoType__TypeAssignment_1 )
                    {
                     before(grammarAccess.getAlgoTypeAccess().getTypeAssignment_1()); 
                    // InternalMLRegression.g:713:3: ( rule__AlgoType__TypeAssignment_1 )
                    // InternalMLRegression.g:713:4: rule__AlgoType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AlgoType__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlgoTypeAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLRegression.g:717:2: ( ( rule__AlgoType__TypeAssignment_2 ) )
                    {
                    // InternalMLRegression.g:717:2: ( ( rule__AlgoType__TypeAssignment_2 ) )
                    // InternalMLRegression.g:718:3: ( rule__AlgoType__TypeAssignment_2 )
                    {
                     before(grammarAccess.getAlgoTypeAccess().getTypeAssignment_2()); 
                    // InternalMLRegression.g:719:3: ( rule__AlgoType__TypeAssignment_2 )
                    // InternalMLRegression.g:719:4: rule__AlgoType__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AlgoType__TypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlgoTypeAccess().getTypeAssignment_2()); 

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
    // InternalMLRegression.g:727:1: rule__NumericValue__Alternatives : ( ( ( rule__NumericValue__TypeAssignment_0 ) ) | ( ( rule__NumericValue__TypeAssignment_1 ) ) );
    public final void rule__NumericValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:731:1: ( ( ( rule__NumericValue__TypeAssignment_0 ) ) | ( ( rule__NumericValue__TypeAssignment_1 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMLRegression.g:732:2: ( ( rule__NumericValue__TypeAssignment_0 ) )
                    {
                    // InternalMLRegression.g:732:2: ( ( rule__NumericValue__TypeAssignment_0 ) )
                    // InternalMLRegression.g:733:3: ( rule__NumericValue__TypeAssignment_0 )
                    {
                     before(grammarAccess.getNumericValueAccess().getTypeAssignment_0()); 
                    // InternalMLRegression.g:734:3: ( rule__NumericValue__TypeAssignment_0 )
                    // InternalMLRegression.g:734:4: rule__NumericValue__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericValue__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumericValueAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:738:2: ( ( rule__NumericValue__TypeAssignment_1 ) )
                    {
                    // InternalMLRegression.g:738:2: ( ( rule__NumericValue__TypeAssignment_1 ) )
                    // InternalMLRegression.g:739:3: ( rule__NumericValue__TypeAssignment_1 )
                    {
                     before(grammarAccess.getNumericValueAccess().getTypeAssignment_1()); 
                    // InternalMLRegression.g:740:3: ( rule__NumericValue__TypeAssignment_1 )
                    // InternalMLRegression.g:740:4: rule__NumericValue__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericValue__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumericValueAccess().getTypeAssignment_1()); 

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
    // InternalMLRegression.g:748:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'false' ) | ( 'true' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:752:1: ( ( 'false' ) | ( 'true' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMLRegression.g:753:2: ( 'false' )
                    {
                    // InternalMLRegression.g:753:2: ( 'false' )
                    // InternalMLRegression.g:754:3: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLRegression.g:759:2: ( 'true' )
                    {
                    // InternalMLRegression.g:759:2: ( 'true' )
                    // InternalMLRegression.g:760:3: 'true'
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
    // InternalMLRegression.g:769:1: rule__MLRegression__Group__0 : rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 ;
    public final void rule__MLRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:773:1: ( rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1 )
            // InternalMLRegression.g:774:2: rule__MLRegression__Group__0__Impl rule__MLRegression__Group__1
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
    // InternalMLRegression.g:781:1: rule__MLRegression__Group__0__Impl : ( ( rule__MLRegression__DatasetAssignment_0 ) ) ;
    public final void rule__MLRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:785:1: ( ( ( rule__MLRegression__DatasetAssignment_0 ) ) )
            // InternalMLRegression.g:786:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            {
            // InternalMLRegression.g:786:1: ( ( rule__MLRegression__DatasetAssignment_0 ) )
            // InternalMLRegression.g:787:2: ( rule__MLRegression__DatasetAssignment_0 )
            {
             before(grammarAccess.getMLRegressionAccess().getDatasetAssignment_0()); 
            // InternalMLRegression.g:788:2: ( rule__MLRegression__DatasetAssignment_0 )
            // InternalMLRegression.g:788:3: rule__MLRegression__DatasetAssignment_0
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
    // InternalMLRegression.g:796:1: rule__MLRegression__Group__1 : rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 ;
    public final void rule__MLRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:800:1: ( rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2 )
            // InternalMLRegression.g:801:2: rule__MLRegression__Group__1__Impl rule__MLRegression__Group__2
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
    // InternalMLRegression.g:808:1: rule__MLRegression__Group__1__Impl : ( ( rule__MLRegression__EvaluationAssignment_1 ) ) ;
    public final void rule__MLRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:812:1: ( ( ( rule__MLRegression__EvaluationAssignment_1 ) ) )
            // InternalMLRegression.g:813:1: ( ( rule__MLRegression__EvaluationAssignment_1 ) )
            {
            // InternalMLRegression.g:813:1: ( ( rule__MLRegression__EvaluationAssignment_1 ) )
            // InternalMLRegression.g:814:2: ( rule__MLRegression__EvaluationAssignment_1 )
            {
             before(grammarAccess.getMLRegressionAccess().getEvaluationAssignment_1()); 
            // InternalMLRegression.g:815:2: ( rule__MLRegression__EvaluationAssignment_1 )
            // InternalMLRegression.g:815:3: rule__MLRegression__EvaluationAssignment_1
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
    // InternalMLRegression.g:823:1: rule__MLRegression__Group__2 : rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 ;
    public final void rule__MLRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:827:1: ( rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3 )
            // InternalMLRegression.g:828:2: rule__MLRegression__Group__2__Impl rule__MLRegression__Group__3
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
    // InternalMLRegression.g:835:1: rule__MLRegression__Group__2__Impl : ( ( rule__MLRegression__VarsAssignment_2 )? ) ;
    public final void rule__MLRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:839:1: ( ( ( rule__MLRegression__VarsAssignment_2 )? ) )
            // InternalMLRegression.g:840:1: ( ( rule__MLRegression__VarsAssignment_2 )? )
            {
            // InternalMLRegression.g:840:1: ( ( rule__MLRegression__VarsAssignment_2 )? )
            // InternalMLRegression.g:841:2: ( rule__MLRegression__VarsAssignment_2 )?
            {
             before(grammarAccess.getMLRegressionAccess().getVarsAssignment_2()); 
            // InternalMLRegression.g:842:2: ( rule__MLRegression__VarsAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMLRegression.g:842:3: rule__MLRegression__VarsAssignment_2
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
    // InternalMLRegression.g:850:1: rule__MLRegression__Group__3 : rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 ;
    public final void rule__MLRegression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:854:1: ( rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4 )
            // InternalMLRegression.g:855:2: rule__MLRegression__Group__3__Impl rule__MLRegression__Group__4
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
    // InternalMLRegression.g:862:1: rule__MLRegression__Group__3__Impl : ( ( rule__MLRegression__CalculateAssignment_3 ) ) ;
    public final void rule__MLRegression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:866:1: ( ( ( rule__MLRegression__CalculateAssignment_3 ) ) )
            // InternalMLRegression.g:867:1: ( ( rule__MLRegression__CalculateAssignment_3 ) )
            {
            // InternalMLRegression.g:867:1: ( ( rule__MLRegression__CalculateAssignment_3 ) )
            // InternalMLRegression.g:868:2: ( rule__MLRegression__CalculateAssignment_3 )
            {
             before(grammarAccess.getMLRegressionAccess().getCalculateAssignment_3()); 
            // InternalMLRegression.g:869:2: ( rule__MLRegression__CalculateAssignment_3 )
            // InternalMLRegression.g:869:3: rule__MLRegression__CalculateAssignment_3
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
    // InternalMLRegression.g:877:1: rule__MLRegression__Group__4 : rule__MLRegression__Group__4__Impl ;
    public final void rule__MLRegression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:881:1: ( rule__MLRegression__Group__4__Impl )
            // InternalMLRegression.g:882:2: rule__MLRegression__Group__4__Impl
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
    // InternalMLRegression.g:888:1: rule__MLRegression__Group__4__Impl : ( ( rule__MLRegression__AlgoAssignment_4 ) ) ;
    public final void rule__MLRegression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:892:1: ( ( ( rule__MLRegression__AlgoAssignment_4 ) ) )
            // InternalMLRegression.g:893:1: ( ( rule__MLRegression__AlgoAssignment_4 ) )
            {
            // InternalMLRegression.g:893:1: ( ( rule__MLRegression__AlgoAssignment_4 ) )
            // InternalMLRegression.g:894:2: ( rule__MLRegression__AlgoAssignment_4 )
            {
             before(grammarAccess.getMLRegressionAccess().getAlgoAssignment_4()); 
            // InternalMLRegression.g:895:2: ( rule__MLRegression__AlgoAssignment_4 )
            // InternalMLRegression.g:895:3: rule__MLRegression__AlgoAssignment_4
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
    // InternalMLRegression.g:904:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:908:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalMLRegression.g:909:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
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
    // InternalMLRegression.g:916:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:920:1: ( ( 'calculate' ) )
            // InternalMLRegression.g:921:1: ( 'calculate' )
            {
            // InternalMLRegression.g:921:1: ( 'calculate' )
            // InternalMLRegression.g:922:2: 'calculate'
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
    // InternalMLRegression.g:931:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:935:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalMLRegression.g:936:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
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
    // InternalMLRegression.g:943:1: rule__Calculate__Group__1__Impl : ( ':' ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:947:1: ( ( ':' ) )
            // InternalMLRegression.g:948:1: ( ':' )
            {
            // InternalMLRegression.g:948:1: ( ':' )
            // InternalMLRegression.g:949:2: ':'
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
    // InternalMLRegression.g:958:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:962:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalMLRegression.g:963:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
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
    // InternalMLRegression.g:970:1: rule__Calculate__Group__2__Impl : ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:974:1: ( ( ( rule__Calculate__CalculateTypeAssignment_2 ) ) )
            // InternalMLRegression.g:975:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            {
            // InternalMLRegression.g:975:1: ( ( rule__Calculate__CalculateTypeAssignment_2 ) )
            // InternalMLRegression.g:976:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            {
             before(grammarAccess.getCalculateAccess().getCalculateTypeAssignment_2()); 
            // InternalMLRegression.g:977:2: ( rule__Calculate__CalculateTypeAssignment_2 )
            // InternalMLRegression.g:977:3: rule__Calculate__CalculateTypeAssignment_2
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
    // InternalMLRegression.g:985:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:989:1: ( rule__Calculate__Group__3__Impl )
            // InternalMLRegression.g:990:2: rule__Calculate__Group__3__Impl
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
    // InternalMLRegression.g:996:1: rule__Calculate__Group__3__Impl : ( ';' ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1000:1: ( ( ';' ) )
            // InternalMLRegression.g:1001:1: ( ';' )
            {
            // InternalMLRegression.g:1001:1: ( ';' )
            // InternalMLRegression.g:1002:2: ';'
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
    // InternalMLRegression.g:1012:1: rule__Dataset__Group__0 : rule__Dataset__Group__0__Impl rule__Dataset__Group__1 ;
    public final void rule__Dataset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1016:1: ( rule__Dataset__Group__0__Impl rule__Dataset__Group__1 )
            // InternalMLRegression.g:1017:2: rule__Dataset__Group__0__Impl rule__Dataset__Group__1
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
    // InternalMLRegression.g:1024:1: rule__Dataset__Group__0__Impl : ( 'import' ) ;
    public final void rule__Dataset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1028:1: ( ( 'import' ) )
            // InternalMLRegression.g:1029:1: ( 'import' )
            {
            // InternalMLRegression.g:1029:1: ( 'import' )
            // InternalMLRegression.g:1030:2: 'import'
            {
             before(grammarAccess.getDatasetAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMLRegression.g:1039:1: rule__Dataset__Group__1 : rule__Dataset__Group__1__Impl rule__Dataset__Group__2 ;
    public final void rule__Dataset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1043:1: ( rule__Dataset__Group__1__Impl rule__Dataset__Group__2 )
            // InternalMLRegression.g:1044:2: rule__Dataset__Group__1__Impl rule__Dataset__Group__2
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
    // InternalMLRegression.g:1051:1: rule__Dataset__Group__1__Impl : ( ( rule__Dataset__DataAssignment_1 ) ) ;
    public final void rule__Dataset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1055:1: ( ( ( rule__Dataset__DataAssignment_1 ) ) )
            // InternalMLRegression.g:1056:1: ( ( rule__Dataset__DataAssignment_1 ) )
            {
            // InternalMLRegression.g:1056:1: ( ( rule__Dataset__DataAssignment_1 ) )
            // InternalMLRegression.g:1057:2: ( rule__Dataset__DataAssignment_1 )
            {
             before(grammarAccess.getDatasetAccess().getDataAssignment_1()); 
            // InternalMLRegression.g:1058:2: ( rule__Dataset__DataAssignment_1 )
            // InternalMLRegression.g:1058:3: rule__Dataset__DataAssignment_1
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
    // InternalMLRegression.g:1066:1: rule__Dataset__Group__2 : rule__Dataset__Group__2__Impl ;
    public final void rule__Dataset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1070:1: ( rule__Dataset__Group__2__Impl )
            // InternalMLRegression.g:1071:2: rule__Dataset__Group__2__Impl
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
    // InternalMLRegression.g:1077:1: rule__Dataset__Group__2__Impl : ( ';' ) ;
    public final void rule__Dataset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1081:1: ( ( ';' ) )
            // InternalMLRegression.g:1082:1: ( ';' )
            {
            // InternalMLRegression.g:1082:1: ( ';' )
            // InternalMLRegression.g:1083:2: ';'
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
    // InternalMLRegression.g:1093:1: rule__Partition__Group__0 : rule__Partition__Group__0__Impl rule__Partition__Group__1 ;
    public final void rule__Partition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1097:1: ( rule__Partition__Group__0__Impl rule__Partition__Group__1 )
            // InternalMLRegression.g:1098:2: rule__Partition__Group__0__Impl rule__Partition__Group__1
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
    // InternalMLRegression.g:1105:1: rule__Partition__Group__0__Impl : ( 'partition' ) ;
    public final void rule__Partition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1109:1: ( ( 'partition' ) )
            // InternalMLRegression.g:1110:1: ( 'partition' )
            {
            // InternalMLRegression.g:1110:1: ( 'partition' )
            // InternalMLRegression.g:1111:2: 'partition'
            {
             before(grammarAccess.getPartitionAccess().getPartitionKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMLRegression.g:1120:1: rule__Partition__Group__1 : rule__Partition__Group__1__Impl rule__Partition__Group__2 ;
    public final void rule__Partition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1124:1: ( rule__Partition__Group__1__Impl rule__Partition__Group__2 )
            // InternalMLRegression.g:1125:2: rule__Partition__Group__1__Impl rule__Partition__Group__2
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
    // InternalMLRegression.g:1132:1: rule__Partition__Group__1__Impl : ( ':' ) ;
    public final void rule__Partition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1136:1: ( ( ':' ) )
            // InternalMLRegression.g:1137:1: ( ':' )
            {
            // InternalMLRegression.g:1137:1: ( ':' )
            // InternalMLRegression.g:1138:2: ':'
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
    // InternalMLRegression.g:1147:1: rule__Partition__Group__2 : rule__Partition__Group__2__Impl rule__Partition__Group__3 ;
    public final void rule__Partition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1151:1: ( rule__Partition__Group__2__Impl rule__Partition__Group__3 )
            // InternalMLRegression.g:1152:2: rule__Partition__Group__2__Impl rule__Partition__Group__3
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
    // InternalMLRegression.g:1159:1: rule__Partition__Group__2__Impl : ( ( rule__Partition__TrainAssignment_2 ) ) ;
    public final void rule__Partition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1163:1: ( ( ( rule__Partition__TrainAssignment_2 ) ) )
            // InternalMLRegression.g:1164:1: ( ( rule__Partition__TrainAssignment_2 ) )
            {
            // InternalMLRegression.g:1164:1: ( ( rule__Partition__TrainAssignment_2 ) )
            // InternalMLRegression.g:1165:2: ( rule__Partition__TrainAssignment_2 )
            {
             before(grammarAccess.getPartitionAccess().getTrainAssignment_2()); 
            // InternalMLRegression.g:1166:2: ( rule__Partition__TrainAssignment_2 )
            // InternalMLRegression.g:1166:3: rule__Partition__TrainAssignment_2
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
    // InternalMLRegression.g:1174:1: rule__Partition__Group__3 : rule__Partition__Group__3__Impl rule__Partition__Group__4 ;
    public final void rule__Partition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1178:1: ( rule__Partition__Group__3__Impl rule__Partition__Group__4 )
            // InternalMLRegression.g:1179:2: rule__Partition__Group__3__Impl rule__Partition__Group__4
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
    // InternalMLRegression.g:1186:1: rule__Partition__Group__3__Impl : ( ',' ) ;
    public final void rule__Partition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1190:1: ( ( ',' ) )
            // InternalMLRegression.g:1191:1: ( ',' )
            {
            // InternalMLRegression.g:1191:1: ( ',' )
            // InternalMLRegression.g:1192:2: ','
            {
             before(grammarAccess.getPartitionAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:1201:1: rule__Partition__Group__4 : rule__Partition__Group__4__Impl rule__Partition__Group__5 ;
    public final void rule__Partition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1205:1: ( rule__Partition__Group__4__Impl rule__Partition__Group__5 )
            // InternalMLRegression.g:1206:2: rule__Partition__Group__4__Impl rule__Partition__Group__5
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
    // InternalMLRegression.g:1213:1: rule__Partition__Group__4__Impl : ( ( rule__Partition__TestAssignment_4 ) ) ;
    public final void rule__Partition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1217:1: ( ( ( rule__Partition__TestAssignment_4 ) ) )
            // InternalMLRegression.g:1218:1: ( ( rule__Partition__TestAssignment_4 ) )
            {
            // InternalMLRegression.g:1218:1: ( ( rule__Partition__TestAssignment_4 ) )
            // InternalMLRegression.g:1219:2: ( rule__Partition__TestAssignment_4 )
            {
             before(grammarAccess.getPartitionAccess().getTestAssignment_4()); 
            // InternalMLRegression.g:1220:2: ( rule__Partition__TestAssignment_4 )
            // InternalMLRegression.g:1220:3: rule__Partition__TestAssignment_4
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
    // InternalMLRegression.g:1228:1: rule__Partition__Group__5 : rule__Partition__Group__5__Impl ;
    public final void rule__Partition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1232:1: ( rule__Partition__Group__5__Impl )
            // InternalMLRegression.g:1233:2: rule__Partition__Group__5__Impl
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
    // InternalMLRegression.g:1239:1: rule__Partition__Group__5__Impl : ( ';' ) ;
    public final void rule__Partition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1243:1: ( ( ';' ) )
            // InternalMLRegression.g:1244:1: ( ';' )
            {
            // InternalMLRegression.g:1244:1: ( ';' )
            // InternalMLRegression.g:1245:2: ';'
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
    // InternalMLRegression.g:1255:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1259:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMLRegression.g:1260:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
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
    // InternalMLRegression.g:1267:1: rule__CrossValidation__Group__0__Impl : ( 'cross_validation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1271:1: ( ( 'cross_validation' ) )
            // InternalMLRegression.g:1272:1: ( 'cross_validation' )
            {
            // InternalMLRegression.g:1272:1: ( 'cross_validation' )
            // InternalMLRegression.g:1273:2: 'cross_validation'
            {
             before(grammarAccess.getCrossValidationAccess().getCross_validationKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMLRegression.g:1282:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1286:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMLRegression.g:1287:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
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
    // InternalMLRegression.g:1294:1: rule__CrossValidation__Group__1__Impl : ( ':' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1298:1: ( ( ':' ) )
            // InternalMLRegression.g:1299:1: ( ':' )
            {
            // InternalMLRegression.g:1299:1: ( ':' )
            // InternalMLRegression.g:1300:2: ':'
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
    // InternalMLRegression.g:1309:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1313:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMLRegression.g:1314:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
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
    // InternalMLRegression.g:1321:1: rule__CrossValidation__Group__2__Impl : ( ( rule__CrossValidation__KAssignment_2 ) ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1325:1: ( ( ( rule__CrossValidation__KAssignment_2 ) ) )
            // InternalMLRegression.g:1326:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            {
            // InternalMLRegression.g:1326:1: ( ( rule__CrossValidation__KAssignment_2 ) )
            // InternalMLRegression.g:1327:2: ( rule__CrossValidation__KAssignment_2 )
            {
             before(grammarAccess.getCrossValidationAccess().getKAssignment_2()); 
            // InternalMLRegression.g:1328:2: ( rule__CrossValidation__KAssignment_2 )
            // InternalMLRegression.g:1328:3: rule__CrossValidation__KAssignment_2
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
    // InternalMLRegression.g:1336:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1340:1: ( rule__CrossValidation__Group__3__Impl )
            // InternalMLRegression.g:1341:2: rule__CrossValidation__Group__3__Impl
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
    // InternalMLRegression.g:1347:1: rule__CrossValidation__Group__3__Impl : ( ';' ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1351:1: ( ( ';' ) )
            // InternalMLRegression.g:1352:1: ( ';' )
            {
            // InternalMLRegression.g:1352:1: ( ';' )
            // InternalMLRegression.g:1353:2: ';'
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
    // InternalMLRegression.g:1363:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1367:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // InternalMLRegression.g:1368:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
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
    // InternalMLRegression.g:1375:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__PredictivesAssignment_0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1379:1: ( ( ( rule__Variables__PredictivesAssignment_0 ) ) )
            // InternalMLRegression.g:1380:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            {
            // InternalMLRegression.g:1380:1: ( ( rule__Variables__PredictivesAssignment_0 ) )
            // InternalMLRegression.g:1381:2: ( rule__Variables__PredictivesAssignment_0 )
            {
             before(grammarAccess.getVariablesAccess().getPredictivesAssignment_0()); 
            // InternalMLRegression.g:1382:2: ( rule__Variables__PredictivesAssignment_0 )
            // InternalMLRegression.g:1382:3: rule__Variables__PredictivesAssignment_0
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
    // InternalMLRegression.g:1390:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1394:1: ( rule__Variables__Group__1__Impl )
            // InternalMLRegression.g:1395:2: rule__Variables__Group__1__Impl
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
    // InternalMLRegression.g:1401:1: rule__Variables__Group__1__Impl : ( ( rule__Variables__TargetsAssignment_1 ) ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1405:1: ( ( ( rule__Variables__TargetsAssignment_1 ) ) )
            // InternalMLRegression.g:1406:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            {
            // InternalMLRegression.g:1406:1: ( ( rule__Variables__TargetsAssignment_1 ) )
            // InternalMLRegression.g:1407:2: ( rule__Variables__TargetsAssignment_1 )
            {
             before(grammarAccess.getVariablesAccess().getTargetsAssignment_1()); 
            // InternalMLRegression.g:1408:2: ( rule__Variables__TargetsAssignment_1 )
            // InternalMLRegression.g:1408:3: rule__Variables__TargetsAssignment_1
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
    // InternalMLRegression.g:1417:1: rule__ListePredictiveVar__Group__0 : rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 ;
    public final void rule__ListePredictiveVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1421:1: ( rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1 )
            // InternalMLRegression.g:1422:2: rule__ListePredictiveVar__Group__0__Impl rule__ListePredictiveVar__Group__1
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
    // InternalMLRegression.g:1429:1: rule__ListePredictiveVar__Group__0__Impl : ( 'predictive_vars' ) ;
    public final void rule__ListePredictiveVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1433:1: ( ( 'predictive_vars' ) )
            // InternalMLRegression.g:1434:1: ( 'predictive_vars' )
            {
            // InternalMLRegression.g:1434:1: ( 'predictive_vars' )
            // InternalMLRegression.g:1435:2: 'predictive_vars'
            {
             before(grammarAccess.getListePredictiveVarAccess().getPredictive_varsKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMLRegression.g:1444:1: rule__ListePredictiveVar__Group__1 : rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 ;
    public final void rule__ListePredictiveVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1448:1: ( rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2 )
            // InternalMLRegression.g:1449:2: rule__ListePredictiveVar__Group__1__Impl rule__ListePredictiveVar__Group__2
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
    // InternalMLRegression.g:1456:1: rule__ListePredictiveVar__Group__1__Impl : ( ':' ) ;
    public final void rule__ListePredictiveVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1460:1: ( ( ':' ) )
            // InternalMLRegression.g:1461:1: ( ':' )
            {
            // InternalMLRegression.g:1461:1: ( ':' )
            // InternalMLRegression.g:1462:2: ':'
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
    // InternalMLRegression.g:1471:1: rule__ListePredictiveVar__Group__2 : rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 ;
    public final void rule__ListePredictiveVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1475:1: ( rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3 )
            // InternalMLRegression.g:1476:2: rule__ListePredictiveVar__Group__2__Impl rule__ListePredictiveVar__Group__3
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
    // InternalMLRegression.g:1483:1: rule__ListePredictiveVar__Group__2__Impl : ( ( rule__ListePredictiveVar__VarsAssignment_2 ) ) ;
    public final void rule__ListePredictiveVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1487:1: ( ( ( rule__ListePredictiveVar__VarsAssignment_2 ) ) )
            // InternalMLRegression.g:1488:1: ( ( rule__ListePredictiveVar__VarsAssignment_2 ) )
            {
            // InternalMLRegression.g:1488:1: ( ( rule__ListePredictiveVar__VarsAssignment_2 ) )
            // InternalMLRegression.g:1489:2: ( rule__ListePredictiveVar__VarsAssignment_2 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getVarsAssignment_2()); 
            // InternalMLRegression.g:1490:2: ( rule__ListePredictiveVar__VarsAssignment_2 )
            // InternalMLRegression.g:1490:3: rule__ListePredictiveVar__VarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__VarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListePredictiveVarAccess().getVarsAssignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:1498:1: rule__ListePredictiveVar__Group__3 : rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 ;
    public final void rule__ListePredictiveVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1502:1: ( rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4 )
            // InternalMLRegression.g:1503:2: rule__ListePredictiveVar__Group__3__Impl rule__ListePredictiveVar__Group__4
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
    // InternalMLRegression.g:1510:1: rule__ListePredictiveVar__Group__3__Impl : ( ( rule__ListePredictiveVar__Group_3__0 )* ) ;
    public final void rule__ListePredictiveVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1514:1: ( ( ( rule__ListePredictiveVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1515:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1515:1: ( ( rule__ListePredictiveVar__Group_3__0 )* )
            // InternalMLRegression.g:1516:2: ( rule__ListePredictiveVar__Group_3__0 )*
            {
             before(grammarAccess.getListePredictiveVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1517:2: ( rule__ListePredictiveVar__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMLRegression.g:1517:3: rule__ListePredictiveVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalMLRegression.g:1525:1: rule__ListePredictiveVar__Group__4 : rule__ListePredictiveVar__Group__4__Impl ;
    public final void rule__ListePredictiveVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1529:1: ( rule__ListePredictiveVar__Group__4__Impl )
            // InternalMLRegression.g:1530:2: rule__ListePredictiveVar__Group__4__Impl
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
    // InternalMLRegression.g:1536:1: rule__ListePredictiveVar__Group__4__Impl : ( ';' ) ;
    public final void rule__ListePredictiveVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1540:1: ( ( ';' ) )
            // InternalMLRegression.g:1541:1: ( ';' )
            {
            // InternalMLRegression.g:1541:1: ( ';' )
            // InternalMLRegression.g:1542:2: ';'
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
    // InternalMLRegression.g:1552:1: rule__ListePredictiveVar__Group_3__0 : rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 ;
    public final void rule__ListePredictiveVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1556:1: ( rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1 )
            // InternalMLRegression.g:1557:2: rule__ListePredictiveVar__Group_3__0__Impl rule__ListePredictiveVar__Group_3__1
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
    // InternalMLRegression.g:1564:1: rule__ListePredictiveVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListePredictiveVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1568:1: ( ( ',' ) )
            // InternalMLRegression.g:1569:1: ( ',' )
            {
            // InternalMLRegression.g:1569:1: ( ',' )
            // InternalMLRegression.g:1570:2: ','
            {
             before(grammarAccess.getListePredictiveVarAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:1579:1: rule__ListePredictiveVar__Group_3__1 : rule__ListePredictiveVar__Group_3__1__Impl ;
    public final void rule__ListePredictiveVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1583:1: ( rule__ListePredictiveVar__Group_3__1__Impl )
            // InternalMLRegression.g:1584:2: rule__ListePredictiveVar__Group_3__1__Impl
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
    // InternalMLRegression.g:1590:1: rule__ListePredictiveVar__Group_3__1__Impl : ( ( rule__ListePredictiveVar__VarsAssignment_3_1 ) ) ;
    public final void rule__ListePredictiveVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1594:1: ( ( ( rule__ListePredictiveVar__VarsAssignment_3_1 ) ) )
            // InternalMLRegression.g:1595:1: ( ( rule__ListePredictiveVar__VarsAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1595:1: ( ( rule__ListePredictiveVar__VarsAssignment_3_1 ) )
            // InternalMLRegression.g:1596:2: ( rule__ListePredictiveVar__VarsAssignment_3_1 )
            {
             before(grammarAccess.getListePredictiveVarAccess().getVarsAssignment_3_1()); 
            // InternalMLRegression.g:1597:2: ( rule__ListePredictiveVar__VarsAssignment_3_1 )
            // InternalMLRegression.g:1597:3: rule__ListePredictiveVar__VarsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ListePredictiveVar__VarsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getListePredictiveVarAccess().getVarsAssignment_3_1()); 

            }


            }

        }
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
    // InternalMLRegression.g:1606:1: rule__TargetVar__Group__0 : rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 ;
    public final void rule__TargetVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1610:1: ( rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1 )
            // InternalMLRegression.g:1611:2: rule__TargetVar__Group__0__Impl rule__TargetVar__Group__1
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
    // InternalMLRegression.g:1618:1: rule__TargetVar__Group__0__Impl : ( 'target_vars' ) ;
    public final void rule__TargetVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1622:1: ( ( 'target_vars' ) )
            // InternalMLRegression.g:1623:1: ( 'target_vars' )
            {
            // InternalMLRegression.g:1623:1: ( 'target_vars' )
            // InternalMLRegression.g:1624:2: 'target_vars'
            {
             before(grammarAccess.getTargetVarAccess().getTarget_varsKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMLRegression.g:1633:1: rule__TargetVar__Group__1 : rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 ;
    public final void rule__TargetVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1637:1: ( rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2 )
            // InternalMLRegression.g:1638:2: rule__TargetVar__Group__1__Impl rule__TargetVar__Group__2
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
    // InternalMLRegression.g:1645:1: rule__TargetVar__Group__1__Impl : ( ':' ) ;
    public final void rule__TargetVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1649:1: ( ( ':' ) )
            // InternalMLRegression.g:1650:1: ( ':' )
            {
            // InternalMLRegression.g:1650:1: ( ':' )
            // InternalMLRegression.g:1651:2: ':'
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
    // InternalMLRegression.g:1660:1: rule__TargetVar__Group__2 : rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 ;
    public final void rule__TargetVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1664:1: ( rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3 )
            // InternalMLRegression.g:1665:2: rule__TargetVar__Group__2__Impl rule__TargetVar__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:1672:1: rule__TargetVar__Group__2__Impl : ( ( rule__TargetVar__VarsAssignment_2 ) ) ;
    public final void rule__TargetVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1676:1: ( ( ( rule__TargetVar__VarsAssignment_2 ) ) )
            // InternalMLRegression.g:1677:1: ( ( rule__TargetVar__VarsAssignment_2 ) )
            {
            // InternalMLRegression.g:1677:1: ( ( rule__TargetVar__VarsAssignment_2 ) )
            // InternalMLRegression.g:1678:2: ( rule__TargetVar__VarsAssignment_2 )
            {
             before(grammarAccess.getTargetVarAccess().getVarsAssignment_2()); 
            // InternalMLRegression.g:1679:2: ( rule__TargetVar__VarsAssignment_2 )
            // InternalMLRegression.g:1679:3: rule__TargetVar__VarsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__VarsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getVarsAssignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:1687:1: rule__TargetVar__Group__3 : rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 ;
    public final void rule__TargetVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1691:1: ( rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4 )
            // InternalMLRegression.g:1692:2: rule__TargetVar__Group__3__Impl rule__TargetVar__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalMLRegression.g:1699:1: rule__TargetVar__Group__3__Impl : ( ( rule__TargetVar__Group_3__0 )* ) ;
    public final void rule__TargetVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1703:1: ( ( ( rule__TargetVar__Group_3__0 )* ) )
            // InternalMLRegression.g:1704:1: ( ( rule__TargetVar__Group_3__0 )* )
            {
            // InternalMLRegression.g:1704:1: ( ( rule__TargetVar__Group_3__0 )* )
            // InternalMLRegression.g:1705:2: ( rule__TargetVar__Group_3__0 )*
            {
             before(grammarAccess.getTargetVarAccess().getGroup_3()); 
            // InternalMLRegression.g:1706:2: ( rule__TargetVar__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMLRegression.g:1706:3: rule__TargetVar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalMLRegression.g:1714:1: rule__TargetVar__Group__4 : rule__TargetVar__Group__4__Impl ;
    public final void rule__TargetVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1718:1: ( rule__TargetVar__Group__4__Impl )
            // InternalMLRegression.g:1719:2: rule__TargetVar__Group__4__Impl
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
    // InternalMLRegression.g:1725:1: rule__TargetVar__Group__4__Impl : ( ';' ) ;
    public final void rule__TargetVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1729:1: ( ( ';' ) )
            // InternalMLRegression.g:1730:1: ( ';' )
            {
            // InternalMLRegression.g:1730:1: ( ';' )
            // InternalMLRegression.g:1731:2: ';'
            {
             before(grammarAccess.getTargetVarAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMLRegression.g:1741:1: rule__TargetVar__Group_3__0 : rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 ;
    public final void rule__TargetVar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1745:1: ( rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1 )
            // InternalMLRegression.g:1746:2: rule__TargetVar__Group_3__0__Impl rule__TargetVar__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMLRegression.g:1753:1: rule__TargetVar__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TargetVar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1757:1: ( ( ',' ) )
            // InternalMLRegression.g:1758:1: ( ',' )
            {
            // InternalMLRegression.g:1758:1: ( ',' )
            // InternalMLRegression.g:1759:2: ','
            {
             before(grammarAccess.getTargetVarAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMLRegression.g:1768:1: rule__TargetVar__Group_3__1 : rule__TargetVar__Group_3__1__Impl ;
    public final void rule__TargetVar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1772:1: ( rule__TargetVar__Group_3__1__Impl )
            // InternalMLRegression.g:1773:2: rule__TargetVar__Group_3__1__Impl
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
    // InternalMLRegression.g:1779:1: rule__TargetVar__Group_3__1__Impl : ( ( rule__TargetVar__VarsAssignment_3_1 ) ) ;
    public final void rule__TargetVar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1783:1: ( ( ( rule__TargetVar__VarsAssignment_3_1 ) ) )
            // InternalMLRegression.g:1784:1: ( ( rule__TargetVar__VarsAssignment_3_1 ) )
            {
            // InternalMLRegression.g:1784:1: ( ( rule__TargetVar__VarsAssignment_3_1 ) )
            // InternalMLRegression.g:1785:2: ( rule__TargetVar__VarsAssignment_3_1 )
            {
             before(grammarAccess.getTargetVarAccess().getVarsAssignment_3_1()); 
            // InternalMLRegression.g:1786:2: ( rule__TargetVar__VarsAssignment_3_1 )
            // InternalMLRegression.g:1786:3: rule__TargetVar__VarsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetVar__VarsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetVarAccess().getVarsAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Algo__Group__0"
    // InternalMLRegression.g:1795:1: rule__Algo__Group__0 : rule__Algo__Group__0__Impl rule__Algo__Group__1 ;
    public final void rule__Algo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1799:1: ( rule__Algo__Group__0__Impl rule__Algo__Group__1 )
            // InternalMLRegression.g:1800:2: rule__Algo__Group__0__Impl rule__Algo__Group__1
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
    // InternalMLRegression.g:1807:1: rule__Algo__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1811:1: ( ( 'algorithm' ) )
            // InternalMLRegression.g:1812:1: ( 'algorithm' )
            {
            // InternalMLRegression.g:1812:1: ( 'algorithm' )
            // InternalMLRegression.g:1813:2: 'algorithm'
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
    // InternalMLRegression.g:1822:1: rule__Algo__Group__1 : rule__Algo__Group__1__Impl rule__Algo__Group__2 ;
    public final void rule__Algo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1826:1: ( rule__Algo__Group__1__Impl rule__Algo__Group__2 )
            // InternalMLRegression.g:1827:2: rule__Algo__Group__1__Impl rule__Algo__Group__2
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
    // InternalMLRegression.g:1834:1: rule__Algo__Group__1__Impl : ( ':' ) ;
    public final void rule__Algo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1838:1: ( ( ':' ) )
            // InternalMLRegression.g:1839:1: ( ':' )
            {
            // InternalMLRegression.g:1839:1: ( ':' )
            // InternalMLRegression.g:1840:2: ':'
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
    // InternalMLRegression.g:1849:1: rule__Algo__Group__2 : rule__Algo__Group__2__Impl rule__Algo__Group__3 ;
    public final void rule__Algo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1853:1: ( rule__Algo__Group__2__Impl rule__Algo__Group__3 )
            // InternalMLRegression.g:1854:2: rule__Algo__Group__2__Impl rule__Algo__Group__3
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
    // InternalMLRegression.g:1861:1: rule__Algo__Group__2__Impl : ( ( rule__Algo__AlgoAssignment_2 ) ) ;
    public final void rule__Algo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1865:1: ( ( ( rule__Algo__AlgoAssignment_2 ) ) )
            // InternalMLRegression.g:1866:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            {
            // InternalMLRegression.g:1866:1: ( ( rule__Algo__AlgoAssignment_2 ) )
            // InternalMLRegression.g:1867:2: ( rule__Algo__AlgoAssignment_2 )
            {
             before(grammarAccess.getAlgoAccess().getAlgoAssignment_2()); 
            // InternalMLRegression.g:1868:2: ( rule__Algo__AlgoAssignment_2 )
            // InternalMLRegression.g:1868:3: rule__Algo__AlgoAssignment_2
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
    // InternalMLRegression.g:1876:1: rule__Algo__Group__3 : rule__Algo__Group__3__Impl ;
    public final void rule__Algo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1880:1: ( rule__Algo__Group__3__Impl )
            // InternalMLRegression.g:1881:2: rule__Algo__Group__3__Impl
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
    // InternalMLRegression.g:1887:1: rule__Algo__Group__3__Impl : ( ';' ) ;
    public final void rule__Algo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1891:1: ( ( ';' ) )
            // InternalMLRegression.g:1892:1: ( ';' )
            {
            // InternalMLRegression.g:1892:1: ( ';' )
            // InternalMLRegression.g:1893:2: ';'
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
    // InternalMLRegression.g:1903:1: rule__LineRegress__Group__0 : rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 ;
    public final void rule__LineRegress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1907:1: ( rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1 )
            // InternalMLRegression.g:1908:2: rule__LineRegress__Group__0__Impl rule__LineRegress__Group__1
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
    // InternalMLRegression.g:1915:1: rule__LineRegress__Group__0__Impl : ( 'line_regress' ) ;
    public final void rule__LineRegress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1919:1: ( ( 'line_regress' ) )
            // InternalMLRegression.g:1920:1: ( 'line_regress' )
            {
            // InternalMLRegression.g:1920:1: ( 'line_regress' )
            // InternalMLRegression.g:1921:2: 'line_regress'
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
    // InternalMLRegression.g:1930:1: rule__LineRegress__Group__1 : rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 ;
    public final void rule__LineRegress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1934:1: ( rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2 )
            // InternalMLRegression.g:1935:2: rule__LineRegress__Group__1__Impl rule__LineRegress__Group__2
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
    // InternalMLRegression.g:1942:1: rule__LineRegress__Group__1__Impl : ( '(' ) ;
    public final void rule__LineRegress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1946:1: ( ( '(' ) )
            // InternalMLRegression.g:1947:1: ( '(' )
            {
            // InternalMLRegression.g:1947:1: ( '(' )
            // InternalMLRegression.g:1948:2: '('
            {
             before(grammarAccess.getLineRegressAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMLRegression.g:1957:1: rule__LineRegress__Group__2 : rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 ;
    public final void rule__LineRegress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1961:1: ( rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3 )
            // InternalMLRegression.g:1962:2: rule__LineRegress__Group__2__Impl rule__LineRegress__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMLRegression.g:1969:1: rule__LineRegress__Group__2__Impl : ( ( rule__LineRegress__ColumnsAssignment_2 ) ) ;
    public final void rule__LineRegress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1973:1: ( ( ( rule__LineRegress__ColumnsAssignment_2 ) ) )
            // InternalMLRegression.g:1974:1: ( ( rule__LineRegress__ColumnsAssignment_2 ) )
            {
            // InternalMLRegression.g:1974:1: ( ( rule__LineRegress__ColumnsAssignment_2 ) )
            // InternalMLRegression.g:1975:2: ( rule__LineRegress__ColumnsAssignment_2 )
            {
             before(grammarAccess.getLineRegressAccess().getColumnsAssignment_2()); 
            // InternalMLRegression.g:1976:2: ( rule__LineRegress__ColumnsAssignment_2 )
            // InternalMLRegression.g:1976:3: rule__LineRegress__ColumnsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__ColumnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getColumnsAssignment_2()); 

            }


            }

        }
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
    // InternalMLRegression.g:1984:1: rule__LineRegress__Group__3 : rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4 ;
    public final void rule__LineRegress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:1988:1: ( rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4 )
            // InternalMLRegression.g:1989:2: rule__LineRegress__Group__3__Impl rule__LineRegress__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMLRegression.g:1996:1: rule__LineRegress__Group__3__Impl : ( ( rule__LineRegress__Group_3__0 )* ) ;
    public final void rule__LineRegress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2000:1: ( ( ( rule__LineRegress__Group_3__0 )* ) )
            // InternalMLRegression.g:2001:1: ( ( rule__LineRegress__Group_3__0 )* )
            {
            // InternalMLRegression.g:2001:1: ( ( rule__LineRegress__Group_3__0 )* )
            // InternalMLRegression.g:2002:2: ( rule__LineRegress__Group_3__0 )*
            {
             before(grammarAccess.getLineRegressAccess().getGroup_3()); 
            // InternalMLRegression.g:2003:2: ( rule__LineRegress__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMLRegression.g:2003:3: rule__LineRegress__Group_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__LineRegress__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLineRegressAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalMLRegression.g:2011:1: rule__LineRegress__Group__4 : rule__LineRegress__Group__4__Impl ;
    public final void rule__LineRegress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2015:1: ( rule__LineRegress__Group__4__Impl )
            // InternalMLRegression.g:2016:2: rule__LineRegress__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMLRegression.g:2022:1: rule__LineRegress__Group__4__Impl : ( ')' ) ;
    public final void rule__LineRegress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2026:1: ( ( ')' ) )
            // InternalMLRegression.g:2027:1: ( ')' )
            {
            // InternalMLRegression.g:2027:1: ( ')' )
            // InternalMLRegression.g:2028:2: ')'
            {
             before(grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__LineRegress__Group_3__0"
    // InternalMLRegression.g:2038:1: rule__LineRegress__Group_3__0 : rule__LineRegress__Group_3__0__Impl rule__LineRegress__Group_3__1 ;
    public final void rule__LineRegress__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2042:1: ( rule__LineRegress__Group_3__0__Impl rule__LineRegress__Group_3__1 )
            // InternalMLRegression.g:2043:2: rule__LineRegress__Group_3__0__Impl rule__LineRegress__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__LineRegress__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineRegress__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group_3__0"


    // $ANTLR start "rule__LineRegress__Group_3__0__Impl"
    // InternalMLRegression.g:2050:1: rule__LineRegress__Group_3__0__Impl : ( ',' ) ;
    public final void rule__LineRegress__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2054:1: ( ( ',' ) )
            // InternalMLRegression.g:2055:1: ( ',' )
            {
            // InternalMLRegression.g:2055:1: ( ',' )
            // InternalMLRegression.g:2056:2: ','
            {
             before(grammarAccess.getLineRegressAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group_3__0__Impl"


    // $ANTLR start "rule__LineRegress__Group_3__1"
    // InternalMLRegression.g:2065:1: rule__LineRegress__Group_3__1 : rule__LineRegress__Group_3__1__Impl ;
    public final void rule__LineRegress__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2069:1: ( rule__LineRegress__Group_3__1__Impl )
            // InternalMLRegression.g:2070:2: rule__LineRegress__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group_3__1"


    // $ANTLR start "rule__LineRegress__Group_3__1__Impl"
    // InternalMLRegression.g:2076:1: rule__LineRegress__Group_3__1__Impl : ( ( rule__LineRegress__ColumnsAssignment_3_1 ) ) ;
    public final void rule__LineRegress__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2080:1: ( ( ( rule__LineRegress__ColumnsAssignment_3_1 ) ) )
            // InternalMLRegression.g:2081:1: ( ( rule__LineRegress__ColumnsAssignment_3_1 ) )
            {
            // InternalMLRegression.g:2081:1: ( ( rule__LineRegress__ColumnsAssignment_3_1 ) )
            // InternalMLRegression.g:2082:2: ( rule__LineRegress__ColumnsAssignment_3_1 )
            {
             before(grammarAccess.getLineRegressAccess().getColumnsAssignment_3_1()); 
            // InternalMLRegression.g:2083:2: ( rule__LineRegress__ColumnsAssignment_3_1 )
            // InternalMLRegression.g:2083:3: rule__LineRegress__ColumnsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LineRegress__ColumnsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLineRegressAccess().getColumnsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__Group_3__1__Impl"


    // $ANTLR start "rule__DecisionTreeRegressor__Group__0"
    // InternalMLRegression.g:2092:1: rule__DecisionTreeRegressor__Group__0 : rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1 ;
    public final void rule__DecisionTreeRegressor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2096:1: ( rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1 )
            // InternalMLRegression.g:2097:2: rule__DecisionTreeRegressor__Group__0__Impl rule__DecisionTreeRegressor__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMLRegression.g:2104:1: rule__DecisionTreeRegressor__Group__0__Impl : ( 'decision_tree_regressor' ) ;
    public final void rule__DecisionTreeRegressor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2108:1: ( ( 'decision_tree_regressor' ) )
            // InternalMLRegression.g:2109:1: ( 'decision_tree_regressor' )
            {
            // InternalMLRegression.g:2109:1: ( 'decision_tree_regressor' )
            // InternalMLRegression.g:2110:2: 'decision_tree_regressor'
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMLRegression.g:2119:1: rule__DecisionTreeRegressor__Group__1 : rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2 ;
    public final void rule__DecisionTreeRegressor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2123:1: ( rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2 )
            // InternalMLRegression.g:2124:2: rule__DecisionTreeRegressor__Group__1__Impl rule__DecisionTreeRegressor__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMLRegression.g:2131:1: rule__DecisionTreeRegressor__Group__1__Impl : ( '(' ) ;
    public final void rule__DecisionTreeRegressor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2135:1: ( ( '(' ) )
            // InternalMLRegression.g:2136:1: ( '(' )
            {
            // InternalMLRegression.g:2136:1: ( '(' )
            // InternalMLRegression.g:2137:2: '('
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMLRegression.g:2146:1: rule__DecisionTreeRegressor__Group__2 : rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3 ;
    public final void rule__DecisionTreeRegressor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2150:1: ( rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3 )
            // InternalMLRegression.g:2151:2: rule__DecisionTreeRegressor__Group__2__Impl rule__DecisionTreeRegressor__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMLRegression.g:2158:1: rule__DecisionTreeRegressor__Group__2__Impl : ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) ) ;
    public final void rule__DecisionTreeRegressor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2162:1: ( ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) ) )
            // InternalMLRegression.g:2163:1: ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) )
            {
            // InternalMLRegression.g:2163:1: ( ( rule__DecisionTreeRegressor__RandAssignment_2 ) )
            // InternalMLRegression.g:2164:2: ( rule__DecisionTreeRegressor__RandAssignment_2 )
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getRandAssignment_2()); 
            // InternalMLRegression.g:2165:2: ( rule__DecisionTreeRegressor__RandAssignment_2 )
            // InternalMLRegression.g:2165:3: rule__DecisionTreeRegressor__RandAssignment_2
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
    // InternalMLRegression.g:2173:1: rule__DecisionTreeRegressor__Group__3 : rule__DecisionTreeRegressor__Group__3__Impl ;
    public final void rule__DecisionTreeRegressor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2177:1: ( rule__DecisionTreeRegressor__Group__3__Impl )
            // InternalMLRegression.g:2178:2: rule__DecisionTreeRegressor__Group__3__Impl
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
    // InternalMLRegression.g:2184:1: rule__DecisionTreeRegressor__Group__3__Impl : ( ')' ) ;
    public final void rule__DecisionTreeRegressor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2188:1: ( ( ')' ) )
            // InternalMLRegression.g:2189:1: ( ')' )
            {
            // InternalMLRegression.g:2189:1: ( ')' )
            // InternalMLRegression.g:2190:2: ')'
            {
             before(grammarAccess.getDecisionTreeRegressorAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMLRegression.g:2200:1: rule__SVR__Group__0 : rule__SVR__Group__0__Impl rule__SVR__Group__1 ;
    public final void rule__SVR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2204:1: ( rule__SVR__Group__0__Impl rule__SVR__Group__1 )
            // InternalMLRegression.g:2205:2: rule__SVR__Group__0__Impl rule__SVR__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMLRegression.g:2212:1: rule__SVR__Group__0__Impl : ( 'svr' ) ;
    public final void rule__SVR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2216:1: ( ( 'svr' ) )
            // InternalMLRegression.g:2217:1: ( 'svr' )
            {
            // InternalMLRegression.g:2217:1: ( 'svr' )
            // InternalMLRegression.g:2218:2: 'svr'
            {
             before(grammarAccess.getSVRAccess().getSvrKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMLRegression.g:2227:1: rule__SVR__Group__1 : rule__SVR__Group__1__Impl rule__SVR__Group__2 ;
    public final void rule__SVR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2231:1: ( rule__SVR__Group__1__Impl rule__SVR__Group__2 )
            // InternalMLRegression.g:2232:2: rule__SVR__Group__1__Impl rule__SVR__Group__2
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
    // InternalMLRegression.g:2239:1: rule__SVR__Group__1__Impl : ( '(' ) ;
    public final void rule__SVR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2243:1: ( ( '(' ) )
            // InternalMLRegression.g:2244:1: ( '(' )
            {
            // InternalMLRegression.g:2244:1: ( '(' )
            // InternalMLRegression.g:2245:2: '('
            {
             before(grammarAccess.getSVRAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMLRegression.g:2254:1: rule__SVR__Group__2 : rule__SVR__Group__2__Impl rule__SVR__Group__3 ;
    public final void rule__SVR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2258:1: ( rule__SVR__Group__2__Impl rule__SVR__Group__3 )
            // InternalMLRegression.g:2259:2: rule__SVR__Group__2__Impl rule__SVR__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMLRegression.g:2266:1: rule__SVR__Group__2__Impl : ( ( rule__SVR__ParamAssignment_2 ) ) ;
    public final void rule__SVR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2270:1: ( ( ( rule__SVR__ParamAssignment_2 ) ) )
            // InternalMLRegression.g:2271:1: ( ( rule__SVR__ParamAssignment_2 ) )
            {
            // InternalMLRegression.g:2271:1: ( ( rule__SVR__ParamAssignment_2 ) )
            // InternalMLRegression.g:2272:2: ( rule__SVR__ParamAssignment_2 )
            {
             before(grammarAccess.getSVRAccess().getParamAssignment_2()); 
            // InternalMLRegression.g:2273:2: ( rule__SVR__ParamAssignment_2 )
            // InternalMLRegression.g:2273:3: rule__SVR__ParamAssignment_2
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
    // InternalMLRegression.g:2281:1: rule__SVR__Group__3 : rule__SVR__Group__3__Impl ;
    public final void rule__SVR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2285:1: ( rule__SVR__Group__3__Impl )
            // InternalMLRegression.g:2286:2: rule__SVR__Group__3__Impl
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
    // InternalMLRegression.g:2292:1: rule__SVR__Group__3__Impl : ( ')' ) ;
    public final void rule__SVR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2296:1: ( ( ')' ) )
            // InternalMLRegression.g:2297:1: ( ')' )
            {
            // InternalMLRegression.g:2297:1: ( ')' )
            // InternalMLRegression.g:2298:2: ')'
            {
             before(grammarAccess.getSVRAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__NumberValue__Group__0"
    // InternalMLRegression.g:2308:1: rule__NumberValue__Group__0 : rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1 ;
    public final void rule__NumberValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2312:1: ( rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1 )
            // InternalMLRegression.g:2313:2: rule__NumberValue__Group__0__Impl rule__NumberValue__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMLRegression.g:2320:1: rule__NumberValue__Group__0__Impl : ( ( rule__NumberValue__ValueAssignment_0 ) ) ;
    public final void rule__NumberValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2324:1: ( ( ( rule__NumberValue__ValueAssignment_0 ) ) )
            // InternalMLRegression.g:2325:1: ( ( rule__NumberValue__ValueAssignment_0 ) )
            {
            // InternalMLRegression.g:2325:1: ( ( rule__NumberValue__ValueAssignment_0 ) )
            // InternalMLRegression.g:2326:2: ( rule__NumberValue__ValueAssignment_0 )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment_0()); 
            // InternalMLRegression.g:2327:2: ( rule__NumberValue__ValueAssignment_0 )
            // InternalMLRegression.g:2327:3: rule__NumberValue__ValueAssignment_0
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
    // InternalMLRegression.g:2335:1: rule__NumberValue__Group__1 : rule__NumberValue__Group__1__Impl ;
    public final void rule__NumberValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2339:1: ( rule__NumberValue__Group__1__Impl )
            // InternalMLRegression.g:2340:2: rule__NumberValue__Group__1__Impl
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
    // InternalMLRegression.g:2346:1: rule__NumberValue__Group__1__Impl : ( ( rule__NumberValue__Group_1__0 )? ) ;
    public final void rule__NumberValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2350:1: ( ( ( rule__NumberValue__Group_1__0 )? ) )
            // InternalMLRegression.g:2351:1: ( ( rule__NumberValue__Group_1__0 )? )
            {
            // InternalMLRegression.g:2351:1: ( ( rule__NumberValue__Group_1__0 )? )
            // InternalMLRegression.g:2352:2: ( rule__NumberValue__Group_1__0 )?
            {
             before(grammarAccess.getNumberValueAccess().getGroup_1()); 
            // InternalMLRegression.g:2353:2: ( rule__NumberValue__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMLRegression.g:2353:3: rule__NumberValue__Group_1__0
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
    // InternalMLRegression.g:2362:1: rule__NumberValue__Group_1__0 : rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1 ;
    public final void rule__NumberValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2366:1: ( rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1 )
            // InternalMLRegression.g:2367:2: rule__NumberValue__Group_1__0__Impl rule__NumberValue__Group_1__1
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
    // InternalMLRegression.g:2374:1: rule__NumberValue__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NumberValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2378:1: ( ( '.' ) )
            // InternalMLRegression.g:2379:1: ( '.' )
            {
            // InternalMLRegression.g:2379:1: ( '.' )
            // InternalMLRegression.g:2380:2: '.'
            {
             before(grammarAccess.getNumberValueAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMLRegression.g:2389:1: rule__NumberValue__Group_1__1 : rule__NumberValue__Group_1__1__Impl ;
    public final void rule__NumberValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2393:1: ( rule__NumberValue__Group_1__1__Impl )
            // InternalMLRegression.g:2394:2: rule__NumberValue__Group_1__1__Impl
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
    // InternalMLRegression.g:2400:1: rule__NumberValue__Group_1__1__Impl : ( ( rule__NumberValue__DecimalAssignment_1_1 )* ) ;
    public final void rule__NumberValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2404:1: ( ( ( rule__NumberValue__DecimalAssignment_1_1 )* ) )
            // InternalMLRegression.g:2405:1: ( ( rule__NumberValue__DecimalAssignment_1_1 )* )
            {
            // InternalMLRegression.g:2405:1: ( ( rule__NumberValue__DecimalAssignment_1_1 )* )
            // InternalMLRegression.g:2406:2: ( rule__NumberValue__DecimalAssignment_1_1 )*
            {
             before(grammarAccess.getNumberValueAccess().getDecimalAssignment_1_1()); 
            // InternalMLRegression.g:2407:2: ( rule__NumberValue__DecimalAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMLRegression.g:2407:3: rule__NumberValue__DecimalAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__NumberValue__DecimalAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMLRegression.g:2416:1: rule__PercentValue__Group__0 : rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1 ;
    public final void rule__PercentValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2420:1: ( rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1 )
            // InternalMLRegression.g:2421:2: rule__PercentValue__Group__0__Impl rule__PercentValue__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMLRegression.g:2428:1: rule__PercentValue__Group__0__Impl : ( ruleNumberValue ) ;
    public final void rule__PercentValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2432:1: ( ( ruleNumberValue ) )
            // InternalMLRegression.g:2433:1: ( ruleNumberValue )
            {
            // InternalMLRegression.g:2433:1: ( ruleNumberValue )
            // InternalMLRegression.g:2434:2: ruleNumberValue
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
    // InternalMLRegression.g:2443:1: rule__PercentValue__Group__1 : rule__PercentValue__Group__1__Impl ;
    public final void rule__PercentValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2447:1: ( rule__PercentValue__Group__1__Impl )
            // InternalMLRegression.g:2448:2: rule__PercentValue__Group__1__Impl
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
    // InternalMLRegression.g:2454:1: rule__PercentValue__Group__1__Impl : ( '%' ) ;
    public final void rule__PercentValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2458:1: ( ( '%' ) )
            // InternalMLRegression.g:2459:1: ( '%' )
            {
            // InternalMLRegression.g:2459:1: ( '%' )
            // InternalMLRegression.g:2460:2: '%'
            {
             before(grammarAccess.getPercentValueAccess().getPercentSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMLRegression.g:2470:1: rule__MLRegression__DatasetAssignment_0 : ( ruleDataset ) ;
    public final void rule__MLRegression__DatasetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2474:1: ( ( ruleDataset ) )
            // InternalMLRegression.g:2475:2: ( ruleDataset )
            {
            // InternalMLRegression.g:2475:2: ( ruleDataset )
            // InternalMLRegression.g:2476:3: ruleDataset
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
    // InternalMLRegression.g:2485:1: rule__MLRegression__EvaluationAssignment_1 : ( ruleEvaluationType ) ;
    public final void rule__MLRegression__EvaluationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2489:1: ( ( ruleEvaluationType ) )
            // InternalMLRegression.g:2490:2: ( ruleEvaluationType )
            {
            // InternalMLRegression.g:2490:2: ( ruleEvaluationType )
            // InternalMLRegression.g:2491:3: ruleEvaluationType
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
    // InternalMLRegression.g:2500:1: rule__MLRegression__VarsAssignment_2 : ( ruleVariables ) ;
    public final void rule__MLRegression__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2504:1: ( ( ruleVariables ) )
            // InternalMLRegression.g:2505:2: ( ruleVariables )
            {
            // InternalMLRegression.g:2505:2: ( ruleVariables )
            // InternalMLRegression.g:2506:3: ruleVariables
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
    // InternalMLRegression.g:2515:1: rule__MLRegression__CalculateAssignment_3 : ( ruleCalculate ) ;
    public final void rule__MLRegression__CalculateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2519:1: ( ( ruleCalculate ) )
            // InternalMLRegression.g:2520:2: ( ruleCalculate )
            {
            // InternalMLRegression.g:2520:2: ( ruleCalculate )
            // InternalMLRegression.g:2521:3: ruleCalculate
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
    // InternalMLRegression.g:2530:1: rule__MLRegression__AlgoAssignment_4 : ( ruleAlgo ) ;
    public final void rule__MLRegression__AlgoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2534:1: ( ( ruleAlgo ) )
            // InternalMLRegression.g:2535:2: ( ruleAlgo )
            {
            // InternalMLRegression.g:2535:2: ( ruleAlgo )
            // InternalMLRegression.g:2536:3: ruleAlgo
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
    // InternalMLRegression.g:2545:1: rule__Calculate__CalculateTypeAssignment_2 : ( ruleCalculateType ) ;
    public final void rule__Calculate__CalculateTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2549:1: ( ( ruleCalculateType ) )
            // InternalMLRegression.g:2550:2: ( ruleCalculateType )
            {
            // InternalMLRegression.g:2550:2: ( ruleCalculateType )
            // InternalMLRegression.g:2551:3: ruleCalculateType
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


    // $ANTLR start "rule__CalculateType__TypeAssignment_0"
    // InternalMLRegression.g:2560:1: rule__CalculateType__TypeAssignment_0 : ( ruleMinError ) ;
    public final void rule__CalculateType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2564:1: ( ( ruleMinError ) )
            // InternalMLRegression.g:2565:2: ( ruleMinError )
            {
            // InternalMLRegression.g:2565:2: ( ruleMinError )
            // InternalMLRegression.g:2566:3: ruleMinError
            {
             before(grammarAccess.getCalculateTypeAccess().getTypeMinErrorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMinError();

            state._fsp--;

             after(grammarAccess.getCalculateTypeAccess().getTypeMinErrorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateType__TypeAssignment_0"


    // $ANTLR start "rule__CalculateType__TypeAssignment_1"
    // InternalMLRegression.g:2575:1: rule__CalculateType__TypeAssignment_1 : ( ruleMinSquaredError ) ;
    public final void rule__CalculateType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2579:1: ( ( ruleMinSquaredError ) )
            // InternalMLRegression.g:2580:2: ( ruleMinSquaredError )
            {
            // InternalMLRegression.g:2580:2: ( ruleMinSquaredError )
            // InternalMLRegression.g:2581:3: ruleMinSquaredError
            {
             before(grammarAccess.getCalculateTypeAccess().getTypeMinSquaredErrorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMinSquaredError();

            state._fsp--;

             after(grammarAccess.getCalculateTypeAccess().getTypeMinSquaredErrorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateType__TypeAssignment_1"


    // $ANTLR start "rule__CalculateType__TypeAssignment_2"
    // InternalMLRegression.g:2590:1: rule__CalculateType__TypeAssignment_2 : ( ruleSumsSquaredError ) ;
    public final void rule__CalculateType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2594:1: ( ( ruleSumsSquaredError ) )
            // InternalMLRegression.g:2595:2: ( ruleSumsSquaredError )
            {
            // InternalMLRegression.g:2595:2: ( ruleSumsSquaredError )
            // InternalMLRegression.g:2596:3: ruleSumsSquaredError
            {
             before(grammarAccess.getCalculateTypeAccess().getTypeSumsSquaredErrorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSumsSquaredError();

            state._fsp--;

             after(grammarAccess.getCalculateTypeAccess().getTypeSumsSquaredErrorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateType__TypeAssignment_2"


    // $ANTLR start "rule__Dataset__DataAssignment_1"
    // InternalMLRegression.g:2605:1: rule__Dataset__DataAssignment_1 : ( ruleStringValue ) ;
    public final void rule__Dataset__DataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2609:1: ( ( ruleStringValue ) )
            // InternalMLRegression.g:2610:2: ( ruleStringValue )
            {
            // InternalMLRegression.g:2610:2: ( ruleStringValue )
            // InternalMLRegression.g:2611:3: ruleStringValue
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


    // $ANTLR start "rule__EvaluationType__TypeAssignment_0"
    // InternalMLRegression.g:2620:1: rule__EvaluationType__TypeAssignment_0 : ( rulePartition ) ;
    public final void rule__EvaluationType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2624:1: ( ( rulePartition ) )
            // InternalMLRegression.g:2625:2: ( rulePartition )
            {
            // InternalMLRegression.g:2625:2: ( rulePartition )
            // InternalMLRegression.g:2626:3: rulePartition
            {
             before(grammarAccess.getEvaluationTypeAccess().getTypePartitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartition();

            state._fsp--;

             after(grammarAccess.getEvaluationTypeAccess().getTypePartitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationType__TypeAssignment_0"


    // $ANTLR start "rule__EvaluationType__TypeAssignment_1"
    // InternalMLRegression.g:2635:1: rule__EvaluationType__TypeAssignment_1 : ( ruleCrossValidation ) ;
    public final void rule__EvaluationType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2639:1: ( ( ruleCrossValidation ) )
            // InternalMLRegression.g:2640:2: ( ruleCrossValidation )
            {
            // InternalMLRegression.g:2640:2: ( ruleCrossValidation )
            // InternalMLRegression.g:2641:3: ruleCrossValidation
            {
             before(grammarAccess.getEvaluationTypeAccess().getTypeCrossValidationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getEvaluationTypeAccess().getTypeCrossValidationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationType__TypeAssignment_1"


    // $ANTLR start "rule__Partition__TrainAssignment_2"
    // InternalMLRegression.g:2650:1: rule__Partition__TrainAssignment_2 : ( ruleNumericValue ) ;
    public final void rule__Partition__TrainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2654:1: ( ( ruleNumericValue ) )
            // InternalMLRegression.g:2655:2: ( ruleNumericValue )
            {
            // InternalMLRegression.g:2655:2: ( ruleNumericValue )
            // InternalMLRegression.g:2656:3: ruleNumericValue
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
    // InternalMLRegression.g:2665:1: rule__Partition__TestAssignment_4 : ( ruleNumericValue ) ;
    public final void rule__Partition__TestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2669:1: ( ( ruleNumericValue ) )
            // InternalMLRegression.g:2670:2: ( ruleNumericValue )
            {
            // InternalMLRegression.g:2670:2: ( ruleNumericValue )
            // InternalMLRegression.g:2671:3: ruleNumericValue
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
    // InternalMLRegression.g:2680:1: rule__CrossValidation__KAssignment_2 : ( ruleIntegerValue ) ;
    public final void rule__CrossValidation__KAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2684:1: ( ( ruleIntegerValue ) )
            // InternalMLRegression.g:2685:2: ( ruleIntegerValue )
            {
            // InternalMLRegression.g:2685:2: ( ruleIntegerValue )
            // InternalMLRegression.g:2686:3: ruleIntegerValue
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
    // InternalMLRegression.g:2695:1: rule__Variables__PredictivesAssignment_0 : ( ruleListePredictiveVar ) ;
    public final void rule__Variables__PredictivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2699:1: ( ( ruleListePredictiveVar ) )
            // InternalMLRegression.g:2700:2: ( ruleListePredictiveVar )
            {
            // InternalMLRegression.g:2700:2: ( ruleListePredictiveVar )
            // InternalMLRegression.g:2701:3: ruleListePredictiveVar
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
    // InternalMLRegression.g:2710:1: rule__Variables__TargetsAssignment_1 : ( ruleTargetVar ) ;
    public final void rule__Variables__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2714:1: ( ( ruleTargetVar ) )
            // InternalMLRegression.g:2715:2: ( ruleTargetVar )
            {
            // InternalMLRegression.g:2715:2: ( ruleTargetVar )
            // InternalMLRegression.g:2716:3: ruleTargetVar
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


    // $ANTLR start "rule__ListePredictiveVar__VarsAssignment_2"
    // InternalMLRegression.g:2725:1: rule__ListePredictiveVar__VarsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2729:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2730:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2730:2: ( RULE_STRING )
            // InternalMLRegression.g:2731:3: RULE_STRING
            {
             before(grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListePredictiveVar__VarsAssignment_2"


    // $ANTLR start "rule__ListePredictiveVar__VarsAssignment_3_1"
    // InternalMLRegression.g:2740:1: rule__ListePredictiveVar__VarsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ListePredictiveVar__VarsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2744:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2745:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2745:2: ( RULE_STRING )
            // InternalMLRegression.g:2746:3: RULE_STRING
            {
             before(grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getListePredictiveVarAccess().getVarsSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListePredictiveVar__VarsAssignment_3_1"


    // $ANTLR start "rule__TargetVar__VarsAssignment_2"
    // InternalMLRegression.g:2755:1: rule__TargetVar__VarsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TargetVar__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2759:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2760:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2760:2: ( RULE_STRING )
            // InternalMLRegression.g:2761:3: RULE_STRING
            {
             before(grammarAccess.getTargetVarAccess().getVarsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getVarsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__VarsAssignment_2"


    // $ANTLR start "rule__TargetVar__VarsAssignment_3_1"
    // InternalMLRegression.g:2770:1: rule__TargetVar__VarsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TargetVar__VarsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2774:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2775:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2775:2: ( RULE_STRING )
            // InternalMLRegression.g:2776:3: RULE_STRING
            {
             before(grammarAccess.getTargetVarAccess().getVarsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetVarAccess().getVarsSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetVar__VarsAssignment_3_1"


    // $ANTLR start "rule__Algo__AlgoAssignment_2"
    // InternalMLRegression.g:2785:1: rule__Algo__AlgoAssignment_2 : ( ruleAlgoType ) ;
    public final void rule__Algo__AlgoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2789:1: ( ( ruleAlgoType ) )
            // InternalMLRegression.g:2790:2: ( ruleAlgoType )
            {
            // InternalMLRegression.g:2790:2: ( ruleAlgoType )
            // InternalMLRegression.g:2791:3: ruleAlgoType
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


    // $ANTLR start "rule__AlgoType__TypeAssignment_0"
    // InternalMLRegression.g:2800:1: rule__AlgoType__TypeAssignment_0 : ( ruleLineRegress ) ;
    public final void rule__AlgoType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2804:1: ( ( ruleLineRegress ) )
            // InternalMLRegression.g:2805:2: ( ruleLineRegress )
            {
            // InternalMLRegression.g:2805:2: ( ruleLineRegress )
            // InternalMLRegression.g:2806:3: ruleLineRegress
            {
             before(grammarAccess.getAlgoTypeAccess().getTypeLineRegressParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLineRegress();

            state._fsp--;

             after(grammarAccess.getAlgoTypeAccess().getTypeLineRegressParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoType__TypeAssignment_0"


    // $ANTLR start "rule__AlgoType__TypeAssignment_1"
    // InternalMLRegression.g:2815:1: rule__AlgoType__TypeAssignment_1 : ( ruleSVR ) ;
    public final void rule__AlgoType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2819:1: ( ( ruleSVR ) )
            // InternalMLRegression.g:2820:2: ( ruleSVR )
            {
            // InternalMLRegression.g:2820:2: ( ruleSVR )
            // InternalMLRegression.g:2821:3: ruleSVR
            {
             before(grammarAccess.getAlgoTypeAccess().getTypeSVRParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSVR();

            state._fsp--;

             after(grammarAccess.getAlgoTypeAccess().getTypeSVRParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoType__TypeAssignment_1"


    // $ANTLR start "rule__AlgoType__TypeAssignment_2"
    // InternalMLRegression.g:2830:1: rule__AlgoType__TypeAssignment_2 : ( ruleDecisionTreeRegressor ) ;
    public final void rule__AlgoType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2834:1: ( ( ruleDecisionTreeRegressor ) )
            // InternalMLRegression.g:2835:2: ( ruleDecisionTreeRegressor )
            {
            // InternalMLRegression.g:2835:2: ( ruleDecisionTreeRegressor )
            // InternalMLRegression.g:2836:3: ruleDecisionTreeRegressor
            {
             before(grammarAccess.getAlgoTypeAccess().getTypeDecisionTreeRegressorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecisionTreeRegressor();

            state._fsp--;

             after(grammarAccess.getAlgoTypeAccess().getTypeDecisionTreeRegressorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlgoType__TypeAssignment_2"


    // $ANTLR start "rule__LineRegress__ColumnsAssignment_2"
    // InternalMLRegression.g:2845:1: rule__LineRegress__ColumnsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LineRegress__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2849:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2850:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2850:2: ( RULE_STRING )
            // InternalMLRegression.g:2851:3: RULE_STRING
            {
             before(grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__ColumnsAssignment_2"


    // $ANTLR start "rule__LineRegress__ColumnsAssignment_3_1"
    // InternalMLRegression.g:2860:1: rule__LineRegress__ColumnsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__LineRegress__ColumnsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2864:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2865:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2865:2: ( RULE_STRING )
            // InternalMLRegression.g:2866:3: RULE_STRING
            {
             before(grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLineRegressAccess().getColumnsSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineRegress__ColumnsAssignment_3_1"


    // $ANTLR start "rule__DecisionTreeRegressor__RandAssignment_2"
    // InternalMLRegression.g:2875:1: rule__DecisionTreeRegressor__RandAssignment_2 : ( RULE_INT ) ;
    public final void rule__DecisionTreeRegressor__RandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2879:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2880:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2880:2: ( RULE_INT )
            // InternalMLRegression.g:2881:3: RULE_INT
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
    // InternalMLRegression.g:2890:1: rule__SVR__ParamAssignment_2 : ( RULE_ID ) ;
    public final void rule__SVR__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2894:1: ( ( RULE_ID ) )
            // InternalMLRegression.g:2895:2: ( RULE_ID )
            {
            // InternalMLRegression.g:2895:2: ( RULE_ID )
            // InternalMLRegression.g:2896:3: RULE_ID
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


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalMLRegression.g:2905:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2909:1: ( ( RULE_STRING ) )
            // InternalMLRegression.g:2910:2: ( RULE_STRING )
            {
            // InternalMLRegression.g:2910:2: ( RULE_STRING )
            // InternalMLRegression.g:2911:3: RULE_STRING
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


    // $ANTLR start "rule__NumericValue__TypeAssignment_0"
    // InternalMLRegression.g:2920:1: rule__NumericValue__TypeAssignment_0 : ( ruleNumberValue ) ;
    public final void rule__NumericValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2924:1: ( ( ruleNumberValue ) )
            // InternalMLRegression.g:2925:2: ( ruleNumberValue )
            {
            // InternalMLRegression.g:2925:2: ( ruleNumberValue )
            // InternalMLRegression.g:2926:3: ruleNumberValue
            {
             before(grammarAccess.getNumericValueAccess().getTypeNumberValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumericValueAccess().getTypeNumberValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__TypeAssignment_0"


    // $ANTLR start "rule__NumericValue__TypeAssignment_1"
    // InternalMLRegression.g:2935:1: rule__NumericValue__TypeAssignment_1 : ( rulePercentValue ) ;
    public final void rule__NumericValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2939:1: ( ( rulePercentValue ) )
            // InternalMLRegression.g:2940:2: ( rulePercentValue )
            {
            // InternalMLRegression.g:2940:2: ( rulePercentValue )
            // InternalMLRegression.g:2941:3: rulePercentValue
            {
             before(grammarAccess.getNumericValueAccess().getTypePercentValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePercentValue();

            state._fsp--;

             after(grammarAccess.getNumericValueAccess().getTypePercentValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__TypeAssignment_1"


    // $ANTLR start "rule__NumberValue__ValueAssignment_0"
    // InternalMLRegression.g:2950:1: rule__NumberValue__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumberValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2954:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2955:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2955:2: ( RULE_INT )
            // InternalMLRegression.g:2956:3: RULE_INT
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
    // InternalMLRegression.g:2965:1: rule__NumberValue__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__NumberValue__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2969:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2970:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2970:2: ( RULE_INT )
            // InternalMLRegression.g:2971:3: RULE_INT
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
    // InternalMLRegression.g:2980:1: rule__IntegerValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2984:1: ( ( RULE_INT ) )
            // InternalMLRegression.g:2985:2: ( RULE_INT )
            {
            // InternalMLRegression.g:2985:2: ( RULE_INT )
            // InternalMLRegression.g:2986:3: RULE_INT
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
    // InternalMLRegression.g:2995:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLRegression.g:2999:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // InternalMLRegression.g:3000:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // InternalMLRegression.g:3000:2: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // InternalMLRegression.g:3001:3: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // InternalMLRegression.g:3002:3: ( rule__BooleanValue__ValueAlternatives_0 )
            // InternalMLRegression.g:3002:4: rule__BooleanValue__ValueAlternatives_0
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\2\3\2\uffff\1\3";
    static final String dfa_3s = "\1\5\1\22\1\5\2\uffff\1\5";
    static final String dfa_4s = "\1\5\2\40\2\uffff\1\40";
    static final String dfa_5s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\2\uffff\1\3\11\uffff\1\2\1\4",
            "\1\5\14\uffff\1\3\2\uffff\1\3\12\uffff\1\4",
            "",
            "",
            "\1\5\14\uffff\1\3\2\uffff\1\3\12\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "727:1: rule__NumericValue__Alternatives : ( ( ( rule__NumericValue__TypeAssignment_0 ) ) | ( ( rule__NumericValue__TypeAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000064000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});

}