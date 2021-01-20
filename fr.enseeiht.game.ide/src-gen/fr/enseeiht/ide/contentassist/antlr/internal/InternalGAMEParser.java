package fr.enseeiht.ide.contentassist.antlr.internal;

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
import fr.enseeiht.services.GAMEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGAMEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'visible'", "'invisible'", "'ouvert'", "'ferme'", "'jeu'", "'{'", "'pointDepart'", "'pointFin'", "'}'", "'chemin'", "'de'", "'vers'", "'si'", "'personne'", "'localisation'", "'interaction'", "'choix'", "'action'", "'echange'", "'objetsDonne'", "'objetsPris'", "'connaissancesDonne'", "'objet'", "'taille'", "'description'", "'condition'", "'objets'", "'necessaires'", "'manquants'", "'connaissances'", "'connaissance'", "'explorateur'", "'inventaireO'", "'inventaireC'", "'objetavecquantite'", "','", "'lieu'", "'trouvables'", "'trouvable'", "'personnes'", "'cheminspossible'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGAMEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGAMEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGAMEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGAME.g"; }


    	private GAMEGrammarAccess grammarAccess;

    	public void setGrammarAccess(GAMEGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJeu"
    // InternalGAME.g:53:1: entryRuleJeu : ruleJeu EOF ;
    public final void entryRuleJeu() throws RecognitionException {
        try {
            // InternalGAME.g:54:1: ( ruleJeu EOF )
            // InternalGAME.g:55:1: ruleJeu EOF
            {
             before(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleJeu();

            state._fsp--;

             after(grammarAccess.getJeuRule()); 
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
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalGAME.g:62:1: ruleJeu : ( ( rule__Jeu__Group__0 ) ) ;
    public final void ruleJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:66:2: ( ( ( rule__Jeu__Group__0 ) ) )
            // InternalGAME.g:67:2: ( ( rule__Jeu__Group__0 ) )
            {
            // InternalGAME.g:67:2: ( ( rule__Jeu__Group__0 ) )
            // InternalGAME.g:68:3: ( rule__Jeu__Group__0 )
            {
             before(grammarAccess.getJeuAccess().getGroup()); 
            // InternalGAME.g:69:3: ( rule__Jeu__Group__0 )
            // InternalGAME.g:69:4: rule__Jeu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleChemin"
    // InternalGAME.g:78:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalGAME.g:79:1: ( ruleChemin EOF )
            // InternalGAME.g:80:1: ruleChemin EOF
            {
             before(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminRule()); 
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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGAME.g:87:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:91:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalGAME.g:92:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalGAME.g:92:2: ( ( rule__Chemin__Group__0 ) )
            // InternalGAME.g:93:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalGAME.g:94:3: ( rule__Chemin__Group__0 )
            // InternalGAME.g:94:4: rule__Chemin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRulePersonne"
    // InternalGAME.g:103:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalGAME.g:104:1: ( rulePersonne EOF )
            // InternalGAME.g:105:1: rulePersonne EOF
            {
             before(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getPersonneRule()); 
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
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalGAME.g:112:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:116:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalGAME.g:117:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalGAME.g:117:2: ( ( rule__Personne__Group__0 ) )
            // InternalGAME.g:118:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalGAME.g:119:3: ( rule__Personne__Group__0 )
            // InternalGAME.g:119:4: rule__Personne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleInteraction"
    // InternalGAME.g:128:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalGAME.g:129:1: ( ruleInteraction EOF )
            // InternalGAME.g:130:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalGAME.g:137:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:141:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalGAME.g:142:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalGAME.g:142:2: ( ( rule__Interaction__Group__0 ) )
            // InternalGAME.g:143:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalGAME.g:144:3: ( rule__Interaction__Group__0 )
            // InternalGAME.g:144:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleChoix"
    // InternalGAME.g:153:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalGAME.g:154:1: ( ruleChoix EOF )
            // InternalGAME.g:155:1: ruleChoix EOF
            {
             before(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getChoixRule()); 
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
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGAME.g:162:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:166:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalGAME.g:167:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalGAME.g:167:2: ( ( rule__Choix__Group__0 ) )
            // InternalGAME.g:168:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalGAME.g:169:3: ( rule__Choix__Group__0 )
            // InternalGAME.g:169:4: rule__Choix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleAction"
    // InternalGAME.g:178:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalGAME.g:179:1: ( ruleAction EOF )
            // InternalGAME.g:180:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGAME.g:187:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:191:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalGAME.g:192:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalGAME.g:192:2: ( ( rule__Action__Group__0 ) )
            // InternalGAME.g:193:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalGAME.g:194:3: ( rule__Action__Group__0 )
            // InternalGAME.g:194:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEchange"
    // InternalGAME.g:203:1: entryRuleEchange : ruleEchange EOF ;
    public final void entryRuleEchange() throws RecognitionException {
        try {
            // InternalGAME.g:204:1: ( ruleEchange EOF )
            // InternalGAME.g:205:1: ruleEchange EOF
            {
             before(grammarAccess.getEchangeRule()); 
            pushFollow(FOLLOW_1);
            ruleEchange();

            state._fsp--;

             after(grammarAccess.getEchangeRule()); 
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
    // $ANTLR end "entryRuleEchange"


    // $ANTLR start "ruleEchange"
    // InternalGAME.g:212:1: ruleEchange : ( ( rule__Echange__Group__0 ) ) ;
    public final void ruleEchange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:216:2: ( ( ( rule__Echange__Group__0 ) ) )
            // InternalGAME.g:217:2: ( ( rule__Echange__Group__0 ) )
            {
            // InternalGAME.g:217:2: ( ( rule__Echange__Group__0 ) )
            // InternalGAME.g:218:3: ( rule__Echange__Group__0 )
            {
             before(grammarAccess.getEchangeAccess().getGroup()); 
            // InternalGAME.g:219:3: ( rule__Echange__Group__0 )
            // InternalGAME.g:219:4: rule__Echange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Echange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEchangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEchange"


    // $ANTLR start "entryRuleObjet"
    // InternalGAME.g:228:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalGAME.g:229:1: ( ruleObjet EOF )
            // InternalGAME.g:230:1: ruleObjet EOF
            {
             before(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getObjetRule()); 
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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGAME.g:237:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:241:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalGAME.g:242:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalGAME.g:242:2: ( ( rule__Objet__Group__0 ) )
            // InternalGAME.g:243:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalGAME.g:244:3: ( rule__Objet__Group__0 )
            // InternalGAME.g:244:4: rule__Objet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleDescription"
    // InternalGAME.g:253:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalGAME.g:254:1: ( ruleDescription EOF )
            // InternalGAME.g:255:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalGAME.g:262:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:266:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalGAME.g:267:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalGAME.g:267:2: ( ( rule__Description__Group__0 ) )
            // InternalGAME.g:268:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalGAME.g:269:3: ( rule__Description__Group__0 )
            // InternalGAME.g:269:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleCondition"
    // InternalGAME.g:278:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGAME.g:279:1: ( ruleCondition EOF )
            // InternalGAME.g:280:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGAME.g:287:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:291:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGAME.g:292:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGAME.g:292:2: ( ( rule__Condition__Group__0 ) )
            // InternalGAME.g:293:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGAME.g:294:3: ( rule__Condition__Group__0 )
            // InternalGAME.g:294:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGAME.g:303:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalGAME.g:304:1: ( ruleConnaissance EOF )
            // InternalGAME.g:305:1: ruleConnaissance EOF
            {
             before(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getConnaissanceRule()); 
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
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGAME.g:312:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:316:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalGAME.g:317:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalGAME.g:317:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalGAME.g:318:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalGAME.g:319:3: ( rule__Connaissance__Group__0 )
            // InternalGAME.g:319:4: rule__Connaissance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleExplorateur"
    // InternalGAME.g:328:1: entryRuleExplorateur : ruleExplorateur EOF ;
    public final void entryRuleExplorateur() throws RecognitionException {
        try {
            // InternalGAME.g:329:1: ( ruleExplorateur EOF )
            // InternalGAME.g:330:1: ruleExplorateur EOF
            {
             before(grammarAccess.getExplorateurRule()); 
            pushFollow(FOLLOW_1);
            ruleExplorateur();

            state._fsp--;

             after(grammarAccess.getExplorateurRule()); 
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
    // $ANTLR end "entryRuleExplorateur"


    // $ANTLR start "ruleExplorateur"
    // InternalGAME.g:337:1: ruleExplorateur : ( ( rule__Explorateur__Group__0 ) ) ;
    public final void ruleExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:341:2: ( ( ( rule__Explorateur__Group__0 ) ) )
            // InternalGAME.g:342:2: ( ( rule__Explorateur__Group__0 ) )
            {
            // InternalGAME.g:342:2: ( ( rule__Explorateur__Group__0 ) )
            // InternalGAME.g:343:3: ( rule__Explorateur__Group__0 )
            {
             before(grammarAccess.getExplorateurAccess().getGroup()); 
            // InternalGAME.g:344:3: ( rule__Explorateur__Group__0 )
            // InternalGAME.g:344:4: rule__Explorateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExplorateur"


    // $ANTLR start "entryRuleObjetAvecQuantite"
    // InternalGAME.g:353:1: entryRuleObjetAvecQuantite : ruleObjetAvecQuantite EOF ;
    public final void entryRuleObjetAvecQuantite() throws RecognitionException {
        try {
            // InternalGAME.g:354:1: ( ruleObjetAvecQuantite EOF )
            // InternalGAME.g:355:1: ruleObjetAvecQuantite EOF
            {
             before(grammarAccess.getObjetAvecQuantiteRule()); 
            pushFollow(FOLLOW_1);
            ruleObjetAvecQuantite();

            state._fsp--;

             after(grammarAccess.getObjetAvecQuantiteRule()); 
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
    // $ANTLR end "entryRuleObjetAvecQuantite"


    // $ANTLR start "ruleObjetAvecQuantite"
    // InternalGAME.g:362:1: ruleObjetAvecQuantite : ( ( rule__ObjetAvecQuantite__Group__0 ) ) ;
    public final void ruleObjetAvecQuantite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:366:2: ( ( ( rule__ObjetAvecQuantite__Group__0 ) ) )
            // InternalGAME.g:367:2: ( ( rule__ObjetAvecQuantite__Group__0 ) )
            {
            // InternalGAME.g:367:2: ( ( rule__ObjetAvecQuantite__Group__0 ) )
            // InternalGAME.g:368:3: ( rule__ObjetAvecQuantite__Group__0 )
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getGroup()); 
            // InternalGAME.g:369:3: ( rule__ObjetAvecQuantite__Group__0 )
            // InternalGAME.g:369:4: rule__ObjetAvecQuantite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetAvecQuantiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjetAvecQuantite"


    // $ANTLR start "entryRuleLieu"
    // InternalGAME.g:378:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGAME.g:379:1: ( ruleLieu EOF )
            // InternalGAME.g:380:1: ruleLieu EOF
            {
             before(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getLieuRule()); 
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
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGAME.g:387:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:391:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGAME.g:392:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGAME.g:392:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGAME.g:393:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGAME.g:394:3: ( rule__Lieu__Group__0 )
            // InternalGAME.g:394:4: rule__Lieu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLieu"


    // $ANTLR start "ruleVisibilite"
    // InternalGAME.g:403:1: ruleVisibilite : ( ( rule__Visibilite__Alternatives ) ) ;
    public final void ruleVisibilite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:407:1: ( ( ( rule__Visibilite__Alternatives ) ) )
            // InternalGAME.g:408:2: ( ( rule__Visibilite__Alternatives ) )
            {
            // InternalGAME.g:408:2: ( ( rule__Visibilite__Alternatives ) )
            // InternalGAME.g:409:3: ( rule__Visibilite__Alternatives )
            {
             before(grammarAccess.getVisibiliteAccess().getAlternatives()); 
            // InternalGAME.g:410:3: ( rule__Visibilite__Alternatives )
            // InternalGAME.g:410:4: rule__Visibilite__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibilite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibiliteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilite"


    // $ANTLR start "ruleOuverture"
    // InternalGAME.g:419:1: ruleOuverture : ( ( rule__Ouverture__Alternatives ) ) ;
    public final void ruleOuverture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:423:1: ( ( ( rule__Ouverture__Alternatives ) ) )
            // InternalGAME.g:424:2: ( ( rule__Ouverture__Alternatives ) )
            {
            // InternalGAME.g:424:2: ( ( rule__Ouverture__Alternatives ) )
            // InternalGAME.g:425:3: ( rule__Ouverture__Alternatives )
            {
             before(grammarAccess.getOuvertureAccess().getAlternatives()); 
            // InternalGAME.g:426:3: ( rule__Ouverture__Alternatives )
            // InternalGAME.g:426:4: rule__Ouverture__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ouverture__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOuvertureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOuverture"


    // $ANTLR start "rule__Visibilite__Alternatives"
    // InternalGAME.g:434:1: rule__Visibilite__Alternatives : ( ( ( 'visible' ) ) | ( ( 'invisible' ) ) );
    public final void rule__Visibilite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:438:1: ( ( ( 'visible' ) ) | ( ( 'invisible' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGAME.g:439:2: ( ( 'visible' ) )
                    {
                    // InternalGAME.g:439:2: ( ( 'visible' ) )
                    // InternalGAME.g:440:3: ( 'visible' )
                    {
                     before(grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalGAME.g:441:3: ( 'visible' )
                    // InternalGAME.g:441:4: 'visible'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:445:2: ( ( 'invisible' ) )
                    {
                    // InternalGAME.g:445:2: ( ( 'invisible' ) )
                    // InternalGAME.g:446:3: ( 'invisible' )
                    {
                     before(grammarAccess.getVisibiliteAccess().getInvisibleEnumLiteralDeclaration_1()); 
                    // InternalGAME.g:447:3: ( 'invisible' )
                    // InternalGAME.g:447:4: 'invisible'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibiliteAccess().getInvisibleEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Visibilite__Alternatives"


    // $ANTLR start "rule__Ouverture__Alternatives"
    // InternalGAME.g:455:1: rule__Ouverture__Alternatives : ( ( ( 'ouvert' ) ) | ( ( 'ferme' ) ) );
    public final void rule__Ouverture__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:459:1: ( ( ( 'ouvert' ) ) | ( ( 'ferme' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGAME.g:460:2: ( ( 'ouvert' ) )
                    {
                    // InternalGAME.g:460:2: ( ( 'ouvert' ) )
                    // InternalGAME.g:461:3: ( 'ouvert' )
                    {
                     before(grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0()); 
                    // InternalGAME.g:462:3: ( 'ouvert' )
                    // InternalGAME.g:462:4: 'ouvert'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:466:2: ( ( 'ferme' ) )
                    {
                    // InternalGAME.g:466:2: ( ( 'ferme' ) )
                    // InternalGAME.g:467:3: ( 'ferme' )
                    {
                     before(grammarAccess.getOuvertureAccess().getFermeEnumLiteralDeclaration_1()); 
                    // InternalGAME.g:468:3: ( 'ferme' )
                    // InternalGAME.g:468:4: 'ferme'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOuvertureAccess().getFermeEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Ouverture__Alternatives"


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalGAME.g:476:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:480:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGAME.g:481:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__0"


    // $ANTLR start "rule__Jeu__Group__0__Impl"
    // InternalGAME.g:488:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:492:1: ( ( 'jeu' ) )
            // InternalGAME.g:493:1: ( 'jeu' )
            {
            // InternalGAME.g:493:1: ( 'jeu' )
            // InternalGAME.g:494:2: 'jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getJeuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__0__Impl"


    // $ANTLR start "rule__Jeu__Group__1"
    // InternalGAME.g:503:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:507:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGAME.g:508:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Jeu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__1"


    // $ANTLR start "rule__Jeu__Group__1__Impl"
    // InternalGAME.g:515:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:519:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalGAME.g:520:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalGAME.g:520:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalGAME.g:521:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalGAME.g:522:2: ( rule__Jeu__NameAssignment_1 )
            // InternalGAME.g:522:3: rule__Jeu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__1__Impl"


    // $ANTLR start "rule__Jeu__Group__2"
    // InternalGAME.g:530:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:534:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGAME.g:535:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__2"


    // $ANTLR start "rule__Jeu__Group__2__Impl"
    // InternalGAME.g:542:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:546:1: ( ( '{' ) )
            // InternalGAME.g:547:1: ( '{' )
            {
            // InternalGAME.g:547:1: ( '{' )
            // InternalGAME.g:548:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__2__Impl"


    // $ANTLR start "rule__Jeu__Group__3"
    // InternalGAME.g:557:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:561:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGAME.g:562:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__3"


    // $ANTLR start "rule__Jeu__Group__3__Impl"
    // InternalGAME.g:569:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__ExplorateurAssignment_3 ) ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:573:1: ( ( ( rule__Jeu__ExplorateurAssignment_3 ) ) )
            // InternalGAME.g:574:1: ( ( rule__Jeu__ExplorateurAssignment_3 ) )
            {
            // InternalGAME.g:574:1: ( ( rule__Jeu__ExplorateurAssignment_3 ) )
            // InternalGAME.g:575:2: ( rule__Jeu__ExplorateurAssignment_3 )
            {
             before(grammarAccess.getJeuAccess().getExplorateurAssignment_3()); 
            // InternalGAME.g:576:2: ( rule__Jeu__ExplorateurAssignment_3 )
            // InternalGAME.g:576:3: rule__Jeu__ExplorateurAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__ExplorateurAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getExplorateurAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__3__Impl"


    // $ANTLR start "rule__Jeu__Group__4"
    // InternalGAME.g:584:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:588:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGAME.g:589:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__4"


    // $ANTLR start "rule__Jeu__Group__4__Impl"
    // InternalGAME.g:596:1: rule__Jeu__Group__4__Impl : ( 'pointDepart' ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:600:1: ( ( 'pointDepart' ) )
            // InternalGAME.g:601:1: ( 'pointDepart' )
            {
            // InternalGAME.g:601:1: ( 'pointDepart' )
            // InternalGAME.g:602:2: 'pointDepart'
            {
             before(grammarAccess.getJeuAccess().getPointDepartKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getPointDepartKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__4__Impl"


    // $ANTLR start "rule__Jeu__Group__5"
    // InternalGAME.g:611:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:615:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGAME.g:616:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Jeu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__5"


    // $ANTLR start "rule__Jeu__Group__5__Impl"
    // InternalGAME.g:623:1: rule__Jeu__Group__5__Impl : ( ( rule__Jeu__PointDepartAssignment_5 ) ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:627:1: ( ( ( rule__Jeu__PointDepartAssignment_5 ) ) )
            // InternalGAME.g:628:1: ( ( rule__Jeu__PointDepartAssignment_5 ) )
            {
            // InternalGAME.g:628:1: ( ( rule__Jeu__PointDepartAssignment_5 ) )
            // InternalGAME.g:629:2: ( rule__Jeu__PointDepartAssignment_5 )
            {
             before(grammarAccess.getJeuAccess().getPointDepartAssignment_5()); 
            // InternalGAME.g:630:2: ( rule__Jeu__PointDepartAssignment_5 )
            // InternalGAME.g:630:3: rule__Jeu__PointDepartAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__PointDepartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getPointDepartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__5__Impl"


    // $ANTLR start "rule__Jeu__Group__6"
    // InternalGAME.g:638:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl rule__Jeu__Group__7 ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:642:1: ( rule__Jeu__Group__6__Impl rule__Jeu__Group__7 )
            // InternalGAME.g:643:2: rule__Jeu__Group__6__Impl rule__Jeu__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__6"


    // $ANTLR start "rule__Jeu__Group__6__Impl"
    // InternalGAME.g:650:1: rule__Jeu__Group__6__Impl : ( 'pointFin' ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:654:1: ( ( 'pointFin' ) )
            // InternalGAME.g:655:1: ( 'pointFin' )
            {
            // InternalGAME.g:655:1: ( 'pointFin' )
            // InternalGAME.g:656:2: 'pointFin'
            {
             before(grammarAccess.getJeuAccess().getPointFinKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getPointFinKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__6__Impl"


    // $ANTLR start "rule__Jeu__Group__7"
    // InternalGAME.g:665:1: rule__Jeu__Group__7 : rule__Jeu__Group__7__Impl rule__Jeu__Group__8 ;
    public final void rule__Jeu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:669:1: ( rule__Jeu__Group__7__Impl rule__Jeu__Group__8 )
            // InternalGAME.g:670:2: rule__Jeu__Group__7__Impl rule__Jeu__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__7"


    // $ANTLR start "rule__Jeu__Group__7__Impl"
    // InternalGAME.g:677:1: rule__Jeu__Group__7__Impl : ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) ) ;
    public final void rule__Jeu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:681:1: ( ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) ) )
            // InternalGAME.g:682:1: ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) )
            {
            // InternalGAME.g:682:1: ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) )
            // InternalGAME.g:683:2: ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* )
            {
            // InternalGAME.g:683:2: ( ( rule__Jeu__PointFinAssignment_7 ) )
            // InternalGAME.g:684:3: ( rule__Jeu__PointFinAssignment_7 )
            {
             before(grammarAccess.getJeuAccess().getPointFinAssignment_7()); 
            // InternalGAME.g:685:3: ( rule__Jeu__PointFinAssignment_7 )
            // InternalGAME.g:685:4: rule__Jeu__PointFinAssignment_7
            {
            pushFollow(FOLLOW_9);
            rule__Jeu__PointFinAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getPointFinAssignment_7()); 

            }

            // InternalGAME.g:688:2: ( ( rule__Jeu__PointFinAssignment_7 )* )
            // InternalGAME.g:689:3: ( rule__Jeu__PointFinAssignment_7 )*
            {
             before(grammarAccess.getJeuAccess().getPointFinAssignment_7()); 
            // InternalGAME.g:690:3: ( rule__Jeu__PointFinAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGAME.g:690:4: rule__Jeu__PointFinAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Jeu__PointFinAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getPointFinAssignment_7()); 

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
    // $ANTLR end "rule__Jeu__Group__7__Impl"


    // $ANTLR start "rule__Jeu__Group__8"
    // InternalGAME.g:699:1: rule__Jeu__Group__8 : rule__Jeu__Group__8__Impl rule__Jeu__Group__9 ;
    public final void rule__Jeu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:703:1: ( rule__Jeu__Group__8__Impl rule__Jeu__Group__9 )
            // InternalGAME.g:704:2: rule__Jeu__Group__8__Impl rule__Jeu__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__8"


    // $ANTLR start "rule__Jeu__Group__8__Impl"
    // InternalGAME.g:711:1: rule__Jeu__Group__8__Impl : ( ( rule__Jeu__LieuxAssignment_8 )* ) ;
    public final void rule__Jeu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:715:1: ( ( ( rule__Jeu__LieuxAssignment_8 )* ) )
            // InternalGAME.g:716:1: ( ( rule__Jeu__LieuxAssignment_8 )* )
            {
            // InternalGAME.g:716:1: ( ( rule__Jeu__LieuxAssignment_8 )* )
            // InternalGAME.g:717:2: ( rule__Jeu__LieuxAssignment_8 )*
            {
             before(grammarAccess.getJeuAccess().getLieuxAssignment_8()); 
            // InternalGAME.g:718:2: ( rule__Jeu__LieuxAssignment_8 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==47) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGAME.g:718:3: rule__Jeu__LieuxAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Jeu__LieuxAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getLieuxAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__8__Impl"


    // $ANTLR start "rule__Jeu__Group__9"
    // InternalGAME.g:726:1: rule__Jeu__Group__9 : rule__Jeu__Group__9__Impl rule__Jeu__Group__10 ;
    public final void rule__Jeu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:730:1: ( rule__Jeu__Group__9__Impl rule__Jeu__Group__10 )
            // InternalGAME.g:731:2: rule__Jeu__Group__9__Impl rule__Jeu__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__9"


    // $ANTLR start "rule__Jeu__Group__9__Impl"
    // InternalGAME.g:738:1: rule__Jeu__Group__9__Impl : ( ( rule__Jeu__ObjetsAssignment_9 )* ) ;
    public final void rule__Jeu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:742:1: ( ( ( rule__Jeu__ObjetsAssignment_9 )* ) )
            // InternalGAME.g:743:1: ( ( rule__Jeu__ObjetsAssignment_9 )* )
            {
            // InternalGAME.g:743:1: ( ( rule__Jeu__ObjetsAssignment_9 )* )
            // InternalGAME.g:744:2: ( rule__Jeu__ObjetsAssignment_9 )*
            {
             before(grammarAccess.getJeuAccess().getObjetsAssignment_9()); 
            // InternalGAME.g:745:2: ( rule__Jeu__ObjetsAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGAME.g:745:3: rule__Jeu__ObjetsAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Jeu__ObjetsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getObjetsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__9__Impl"


    // $ANTLR start "rule__Jeu__Group__10"
    // InternalGAME.g:753:1: rule__Jeu__Group__10 : rule__Jeu__Group__10__Impl rule__Jeu__Group__11 ;
    public final void rule__Jeu__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:757:1: ( rule__Jeu__Group__10__Impl rule__Jeu__Group__11 )
            // InternalGAME.g:758:2: rule__Jeu__Group__10__Impl rule__Jeu__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__10"


    // $ANTLR start "rule__Jeu__Group__10__Impl"
    // InternalGAME.g:765:1: rule__Jeu__Group__10__Impl : ( ( rule__Jeu__ObjetAvecQuantiteAssignment_10 )* ) ;
    public final void rule__Jeu__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:769:1: ( ( ( rule__Jeu__ObjetAvecQuantiteAssignment_10 )* ) )
            // InternalGAME.g:770:1: ( ( rule__Jeu__ObjetAvecQuantiteAssignment_10 )* )
            {
            // InternalGAME.g:770:1: ( ( rule__Jeu__ObjetAvecQuantiteAssignment_10 )* )
            // InternalGAME.g:771:2: ( rule__Jeu__ObjetAvecQuantiteAssignment_10 )*
            {
             before(grammarAccess.getJeuAccess().getObjetAvecQuantiteAssignment_10()); 
            // InternalGAME.g:772:2: ( rule__Jeu__ObjetAvecQuantiteAssignment_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGAME.g:772:3: rule__Jeu__ObjetAvecQuantiteAssignment_10
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Jeu__ObjetAvecQuantiteAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getObjetAvecQuantiteAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__10__Impl"


    // $ANTLR start "rule__Jeu__Group__11"
    // InternalGAME.g:780:1: rule__Jeu__Group__11 : rule__Jeu__Group__11__Impl rule__Jeu__Group__12 ;
    public final void rule__Jeu__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:784:1: ( rule__Jeu__Group__11__Impl rule__Jeu__Group__12 )
            // InternalGAME.g:785:2: rule__Jeu__Group__11__Impl rule__Jeu__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__11"


    // $ANTLR start "rule__Jeu__Group__11__Impl"
    // InternalGAME.g:792:1: rule__Jeu__Group__11__Impl : ( ( rule__Jeu__ConnaissancesAssignment_11 )* ) ;
    public final void rule__Jeu__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:796:1: ( ( ( rule__Jeu__ConnaissancesAssignment_11 )* ) )
            // InternalGAME.g:797:1: ( ( rule__Jeu__ConnaissancesAssignment_11 )* )
            {
            // InternalGAME.g:797:1: ( ( rule__Jeu__ConnaissancesAssignment_11 )* )
            // InternalGAME.g:798:2: ( rule__Jeu__ConnaissancesAssignment_11 )*
            {
             before(grammarAccess.getJeuAccess().getConnaissancesAssignment_11()); 
            // InternalGAME.g:799:2: ( rule__Jeu__ConnaissancesAssignment_11 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGAME.g:799:3: rule__Jeu__ConnaissancesAssignment_11
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Jeu__ConnaissancesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getConnaissancesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__11__Impl"


    // $ANTLR start "rule__Jeu__Group__12"
    // InternalGAME.g:807:1: rule__Jeu__Group__12 : rule__Jeu__Group__12__Impl rule__Jeu__Group__13 ;
    public final void rule__Jeu__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:811:1: ( rule__Jeu__Group__12__Impl rule__Jeu__Group__13 )
            // InternalGAME.g:812:2: rule__Jeu__Group__12__Impl rule__Jeu__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__12"


    // $ANTLR start "rule__Jeu__Group__12__Impl"
    // InternalGAME.g:819:1: rule__Jeu__Group__12__Impl : ( ( rule__Jeu__PersonnesAssignment_12 )* ) ;
    public final void rule__Jeu__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:823:1: ( ( ( rule__Jeu__PersonnesAssignment_12 )* ) )
            // InternalGAME.g:824:1: ( ( rule__Jeu__PersonnesAssignment_12 )* )
            {
            // InternalGAME.g:824:1: ( ( rule__Jeu__PersonnesAssignment_12 )* )
            // InternalGAME.g:825:2: ( rule__Jeu__PersonnesAssignment_12 )*
            {
             before(grammarAccess.getJeuAccess().getPersonnesAssignment_12()); 
            // InternalGAME.g:826:2: ( rule__Jeu__PersonnesAssignment_12 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGAME.g:826:3: rule__Jeu__PersonnesAssignment_12
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Jeu__PersonnesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getPersonnesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__12__Impl"


    // $ANTLR start "rule__Jeu__Group__13"
    // InternalGAME.g:834:1: rule__Jeu__Group__13 : rule__Jeu__Group__13__Impl rule__Jeu__Group__14 ;
    public final void rule__Jeu__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:838:1: ( rule__Jeu__Group__13__Impl rule__Jeu__Group__14 )
            // InternalGAME.g:839:2: rule__Jeu__Group__13__Impl rule__Jeu__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Jeu__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__13"


    // $ANTLR start "rule__Jeu__Group__13__Impl"
    // InternalGAME.g:846:1: rule__Jeu__Group__13__Impl : ( ( rule__Jeu__CheminsAssignment_13 )* ) ;
    public final void rule__Jeu__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:850:1: ( ( ( rule__Jeu__CheminsAssignment_13 )* ) )
            // InternalGAME.g:851:1: ( ( rule__Jeu__CheminsAssignment_13 )* )
            {
            // InternalGAME.g:851:1: ( ( rule__Jeu__CheminsAssignment_13 )* )
            // InternalGAME.g:852:2: ( rule__Jeu__CheminsAssignment_13 )*
            {
             before(grammarAccess.getJeuAccess().getCheminsAssignment_13()); 
            // InternalGAME.g:853:2: ( rule__Jeu__CheminsAssignment_13 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGAME.g:853:3: rule__Jeu__CheminsAssignment_13
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Jeu__CheminsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getCheminsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__13__Impl"


    // $ANTLR start "rule__Jeu__Group__14"
    // InternalGAME.g:861:1: rule__Jeu__Group__14 : rule__Jeu__Group__14__Impl ;
    public final void rule__Jeu__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:865:1: ( rule__Jeu__Group__14__Impl )
            // InternalGAME.g:866:2: rule__Jeu__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__14"


    // $ANTLR start "rule__Jeu__Group__14__Impl"
    // InternalGAME.g:872:1: rule__Jeu__Group__14__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:876:1: ( ( '}' ) )
            // InternalGAME.g:877:1: ( '}' )
            {
            // InternalGAME.g:877:1: ( '}' )
            // InternalGAME.g:878:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__Group__14__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalGAME.g:888:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:892:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGAME.g:893:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0"


    // $ANTLR start "rule__Chemin__Group__0__Impl"
    // InternalGAME.g:900:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:904:1: ( ( 'chemin' ) )
            // InternalGAME.g:905:1: ( 'chemin' )
            {
            // InternalGAME.g:905:1: ( 'chemin' )
            // InternalGAME.g:906:2: 'chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCheminKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalGAME.g:915:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:919:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGAME.g:920:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Chemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1"


    // $ANTLR start "rule__Chemin__Group__1__Impl"
    // InternalGAME.g:927:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__NameAssignment_1 ) ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:931:1: ( ( ( rule__Chemin__NameAssignment_1 ) ) )
            // InternalGAME.g:932:1: ( ( rule__Chemin__NameAssignment_1 ) )
            {
            // InternalGAME.g:932:1: ( ( rule__Chemin__NameAssignment_1 ) )
            // InternalGAME.g:933:2: ( rule__Chemin__NameAssignment_1 )
            {
             before(grammarAccess.getCheminAccess().getNameAssignment_1()); 
            // InternalGAME.g:934:2: ( rule__Chemin__NameAssignment_1 )
            // InternalGAME.g:934:3: rule__Chemin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__1__Impl"


    // $ANTLR start "rule__Chemin__Group__2"
    // InternalGAME.g:942:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:946:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGAME.g:947:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Chemin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2"


    // $ANTLR start "rule__Chemin__Group__2__Impl"
    // InternalGAME.g:954:1: rule__Chemin__Group__2__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:958:1: ( ( '{' ) )
            // InternalGAME.g:959:1: ( '{' )
            {
            // InternalGAME.g:959:1: ( '{' )
            // InternalGAME.g:960:2: '{'
            {
             before(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__2__Impl"


    // $ANTLR start "rule__Chemin__Group__3"
    // InternalGAME.g:969:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:973:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGAME.g:974:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Chemin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__3"


    // $ANTLR start "rule__Chemin__Group__3__Impl"
    // InternalGAME.g:981:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__DescriptionsAssignment_3 )? ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:985:1: ( ( ( rule__Chemin__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:986:1: ( ( rule__Chemin__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:986:1: ( ( rule__Chemin__DescriptionsAssignment_3 )? )
            // InternalGAME.g:987:2: ( rule__Chemin__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getCheminAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:988:2: ( rule__Chemin__DescriptionsAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGAME.g:988:3: rule__Chemin__DescriptionsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__DescriptionsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__3__Impl"


    // $ANTLR start "rule__Chemin__Group__4"
    // InternalGAME.g:996:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1000:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGAME.g:1001:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__4"


    // $ANTLR start "rule__Chemin__Group__4__Impl"
    // InternalGAME.g:1008:1: rule__Chemin__Group__4__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1012:1: ( ( 'de' ) )
            // InternalGAME.g:1013:1: ( 'de' )
            {
            // InternalGAME.g:1013:1: ( 'de' )
            // InternalGAME.g:1014:2: 'de'
            {
             before(grammarAccess.getCheminAccess().getDeKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__4__Impl"


    // $ANTLR start "rule__Chemin__Group__5"
    // InternalGAME.g:1023:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1027:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGAME.g:1028:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Chemin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__5"


    // $ANTLR start "rule__Chemin__Group__5__Impl"
    // InternalGAME.g:1035:1: rule__Chemin__Group__5__Impl : ( ( rule__Chemin__DepartAssignment_5 ) ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1039:1: ( ( ( rule__Chemin__DepartAssignment_5 ) ) )
            // InternalGAME.g:1040:1: ( ( rule__Chemin__DepartAssignment_5 ) )
            {
            // InternalGAME.g:1040:1: ( ( rule__Chemin__DepartAssignment_5 ) )
            // InternalGAME.g:1041:2: ( rule__Chemin__DepartAssignment_5 )
            {
             before(grammarAccess.getCheminAccess().getDepartAssignment_5()); 
            // InternalGAME.g:1042:2: ( rule__Chemin__DepartAssignment_5 )
            // InternalGAME.g:1042:3: rule__Chemin__DepartAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__DepartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getDepartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__5__Impl"


    // $ANTLR start "rule__Chemin__Group__6"
    // InternalGAME.g:1050:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1054:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGAME.g:1055:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__6"


    // $ANTLR start "rule__Chemin__Group__6__Impl"
    // InternalGAME.g:1062:1: rule__Chemin__Group__6__Impl : ( 'vers' ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1066:1: ( ( 'vers' ) )
            // InternalGAME.g:1067:1: ( 'vers' )
            {
            // InternalGAME.g:1067:1: ( 'vers' )
            // InternalGAME.g:1068:2: 'vers'
            {
             before(grammarAccess.getCheminAccess().getVersKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getVersKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__6__Impl"


    // $ANTLR start "rule__Chemin__Group__7"
    // InternalGAME.g:1077:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1081:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGAME.g:1082:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Chemin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__7"


    // $ANTLR start "rule__Chemin__Group__7__Impl"
    // InternalGAME.g:1089:1: rule__Chemin__Group__7__Impl : ( ( rule__Chemin__ArriveAssignment_7 ) ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1093:1: ( ( ( rule__Chemin__ArriveAssignment_7 ) ) )
            // InternalGAME.g:1094:1: ( ( rule__Chemin__ArriveAssignment_7 ) )
            {
            // InternalGAME.g:1094:1: ( ( rule__Chemin__ArriveAssignment_7 ) )
            // InternalGAME.g:1095:2: ( rule__Chemin__ArriveAssignment_7 )
            {
             before(grammarAccess.getCheminAccess().getArriveAssignment_7()); 
            // InternalGAME.g:1096:2: ( rule__Chemin__ArriveAssignment_7 )
            // InternalGAME.g:1096:3: rule__Chemin__ArriveAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ArriveAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getArriveAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__7__Impl"


    // $ANTLR start "rule__Chemin__Group__8"
    // InternalGAME.g:1104:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1108:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGAME.g:1109:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Chemin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__8"


    // $ANTLR start "rule__Chemin__Group__8__Impl"
    // InternalGAME.g:1116:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__VisibiliteAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1120:1: ( ( ( rule__Chemin__VisibiliteAssignment_8 ) ) )
            // InternalGAME.g:1121:1: ( ( rule__Chemin__VisibiliteAssignment_8 ) )
            {
            // InternalGAME.g:1121:1: ( ( rule__Chemin__VisibiliteAssignment_8 ) )
            // InternalGAME.g:1122:2: ( rule__Chemin__VisibiliteAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getVisibiliteAssignment_8()); 
            // InternalGAME.g:1123:2: ( rule__Chemin__VisibiliteAssignment_8 )
            // InternalGAME.g:1123:3: rule__Chemin__VisibiliteAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__VisibiliteAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getVisibiliteAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__8__Impl"


    // $ANTLR start "rule__Chemin__Group__9"
    // InternalGAME.g:1131:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1135:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGAME.g:1136:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Chemin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__9"


    // $ANTLR start "rule__Chemin__Group__9__Impl"
    // InternalGAME.g:1143:1: rule__Chemin__Group__9__Impl : ( ( rule__Chemin__Group_9__0 )? ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1147:1: ( ( ( rule__Chemin__Group_9__0 )? ) )
            // InternalGAME.g:1148:1: ( ( rule__Chemin__Group_9__0 )? )
            {
            // InternalGAME.g:1148:1: ( ( rule__Chemin__Group_9__0 )? )
            // InternalGAME.g:1149:2: ( rule__Chemin__Group_9__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_9()); 
            // InternalGAME.g:1150:2: ( rule__Chemin__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGAME.g:1150:3: rule__Chemin__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__9__Impl"


    // $ANTLR start "rule__Chemin__Group__10"
    // InternalGAME.g:1158:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1162:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGAME.g:1163:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Chemin__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__10"


    // $ANTLR start "rule__Chemin__Group__10__Impl"
    // InternalGAME.g:1170:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__OuvertureAssignment_10 ) ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1174:1: ( ( ( rule__Chemin__OuvertureAssignment_10 ) ) )
            // InternalGAME.g:1175:1: ( ( rule__Chemin__OuvertureAssignment_10 ) )
            {
            // InternalGAME.g:1175:1: ( ( rule__Chemin__OuvertureAssignment_10 ) )
            // InternalGAME.g:1176:2: ( rule__Chemin__OuvertureAssignment_10 )
            {
             before(grammarAccess.getCheminAccess().getOuvertureAssignment_10()); 
            // InternalGAME.g:1177:2: ( rule__Chemin__OuvertureAssignment_10 )
            // InternalGAME.g:1177:3: rule__Chemin__OuvertureAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__OuvertureAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getOuvertureAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__10__Impl"


    // $ANTLR start "rule__Chemin__Group__11"
    // InternalGAME.g:1185:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl rule__Chemin__Group__12 ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1189:1: ( rule__Chemin__Group__11__Impl rule__Chemin__Group__12 )
            // InternalGAME.g:1190:2: rule__Chemin__Group__11__Impl rule__Chemin__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Chemin__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__11"


    // $ANTLR start "rule__Chemin__Group__11__Impl"
    // InternalGAME.g:1197:1: rule__Chemin__Group__11__Impl : ( ( rule__Chemin__Group_11__0 )? ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1201:1: ( ( ( rule__Chemin__Group_11__0 )? ) )
            // InternalGAME.g:1202:1: ( ( rule__Chemin__Group_11__0 )? )
            {
            // InternalGAME.g:1202:1: ( ( rule__Chemin__Group_11__0 )? )
            // InternalGAME.g:1203:2: ( rule__Chemin__Group_11__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_11()); 
            // InternalGAME.g:1204:2: ( rule__Chemin__Group_11__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGAME.g:1204:3: rule__Chemin__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chemin__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheminAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__11__Impl"


    // $ANTLR start "rule__Chemin__Group__12"
    // InternalGAME.g:1212:1: rule__Chemin__Group__12 : rule__Chemin__Group__12__Impl ;
    public final void rule__Chemin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1216:1: ( rule__Chemin__Group__12__Impl )
            // InternalGAME.g:1217:2: rule__Chemin__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__12"


    // $ANTLR start "rule__Chemin__Group__12__Impl"
    // InternalGAME.g:1223:1: rule__Chemin__Group__12__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1227:1: ( ( '}' ) )
            // InternalGAME.g:1228:1: ( '}' )
            {
            // InternalGAME.g:1228:1: ( '}' )
            // InternalGAME.g:1229:2: '}'
            {
             before(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group__12__Impl"


    // $ANTLR start "rule__Chemin__Group_9__0"
    // InternalGAME.g:1239:1: rule__Chemin__Group_9__0 : rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 ;
    public final void rule__Chemin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1243:1: ( rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 )
            // InternalGAME.g:1244:2: rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1
            {
            pushFollow(FOLLOW_21);
            rule__Chemin__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__0"


    // $ANTLR start "rule__Chemin__Group_9__0__Impl"
    // InternalGAME.g:1251:1: rule__Chemin__Group_9__0__Impl : ( 'si' ) ;
    public final void rule__Chemin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1255:1: ( ( 'si' ) )
            // InternalGAME.g:1256:1: ( 'si' )
            {
            // InternalGAME.g:1256:1: ( 'si' )
            // InternalGAME.g:1257:2: 'si'
            {
             before(grammarAccess.getCheminAccess().getSiKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSiKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__0__Impl"


    // $ANTLR start "rule__Chemin__Group_9__1"
    // InternalGAME.g:1266:1: rule__Chemin__Group_9__1 : rule__Chemin__Group_9__1__Impl ;
    public final void rule__Chemin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1270:1: ( rule__Chemin__Group_9__1__Impl )
            // InternalGAME.g:1271:2: rule__Chemin__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__1"


    // $ANTLR start "rule__Chemin__Group_9__1__Impl"
    // InternalGAME.g:1277:1: rule__Chemin__Group_9__1__Impl : ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) ) ;
    public final void rule__Chemin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1281:1: ( ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) ) )
            // InternalGAME.g:1282:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) )
            {
            // InternalGAME.g:1282:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) )
            // InternalGAME.g:1283:2: ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 )
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_9_1()); 
            // InternalGAME.g:1284:2: ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 )
            // InternalGAME.g:1284:3: rule__Chemin__ConditionsVisibiliteAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionsVisibiliteAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_9__1__Impl"


    // $ANTLR start "rule__Chemin__Group_11__0"
    // InternalGAME.g:1293:1: rule__Chemin__Group_11__0 : rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1 ;
    public final void rule__Chemin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1297:1: ( rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1 )
            // InternalGAME.g:1298:2: rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1
            {
            pushFollow(FOLLOW_21);
            rule__Chemin__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__0"


    // $ANTLR start "rule__Chemin__Group_11__0__Impl"
    // InternalGAME.g:1305:1: rule__Chemin__Group_11__0__Impl : ( 'si' ) ;
    public final void rule__Chemin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1309:1: ( ( 'si' ) )
            // InternalGAME.g:1310:1: ( 'si' )
            {
            // InternalGAME.g:1310:1: ( 'si' )
            // InternalGAME.g:1311:2: 'si'
            {
             before(grammarAccess.getCheminAccess().getSiKeyword_11_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSiKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__0__Impl"


    // $ANTLR start "rule__Chemin__Group_11__1"
    // InternalGAME.g:1320:1: rule__Chemin__Group_11__1 : rule__Chemin__Group_11__1__Impl ;
    public final void rule__Chemin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1324:1: ( rule__Chemin__Group_11__1__Impl )
            // InternalGAME.g:1325:2: rule__Chemin__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__1"


    // $ANTLR start "rule__Chemin__Group_11__1__Impl"
    // InternalGAME.g:1331:1: rule__Chemin__Group_11__1__Impl : ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) ) ;
    public final void rule__Chemin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1335:1: ( ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) ) )
            // InternalGAME.g:1336:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) )
            {
            // InternalGAME.g:1336:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) )
            // InternalGAME.g:1337:2: ( rule__Chemin__ConditionsOuvertureAssignment_11_1 )
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureAssignment_11_1()); 
            // InternalGAME.g:1338:2: ( rule__Chemin__ConditionsOuvertureAssignment_11_1 )
            // InternalGAME.g:1338:3: rule__Chemin__ConditionsOuvertureAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionsOuvertureAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionsOuvertureAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__Group_11__1__Impl"


    // $ANTLR start "rule__Personne__Group__0"
    // InternalGAME.g:1347:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1351:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGAME.g:1352:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Personne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__0"


    // $ANTLR start "rule__Personne__Group__0__Impl"
    // InternalGAME.g:1359:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1363:1: ( ( 'personne' ) )
            // InternalGAME.g:1364:1: ( 'personne' )
            {
            // InternalGAME.g:1364:1: ( 'personne' )
            // InternalGAME.g:1365:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__0__Impl"


    // $ANTLR start "rule__Personne__Group__1"
    // InternalGAME.g:1374:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1378:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGAME.g:1379:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__1"


    // $ANTLR start "rule__Personne__Group__1__Impl"
    // InternalGAME.g:1386:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1390:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGAME.g:1391:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGAME.g:1391:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGAME.g:1392:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGAME.g:1393:2: ( rule__Personne__NameAssignment_1 )
            // InternalGAME.g:1393:3: rule__Personne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__1__Impl"


    // $ANTLR start "rule__Personne__Group__2"
    // InternalGAME.g:1401:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1405:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGAME.g:1406:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Personne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__2"


    // $ANTLR start "rule__Personne__Group__2__Impl"
    // InternalGAME.g:1413:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1417:1: ( ( '{' ) )
            // InternalGAME.g:1418:1: ( '{' )
            {
            // InternalGAME.g:1418:1: ( '{' )
            // InternalGAME.g:1419:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__2__Impl"


    // $ANTLR start "rule__Personne__Group__3"
    // InternalGAME.g:1428:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1432:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGAME.g:1433:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Personne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__3"


    // $ANTLR start "rule__Personne__Group__3__Impl"
    // InternalGAME.g:1440:1: rule__Personne__Group__3__Impl : ( 'localisation' ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1444:1: ( ( 'localisation' ) )
            // InternalGAME.g:1445:1: ( 'localisation' )
            {
            // InternalGAME.g:1445:1: ( 'localisation' )
            // InternalGAME.g:1446:2: 'localisation'
            {
             before(grammarAccess.getPersonneAccess().getLocalisationKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLocalisationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__3__Impl"


    // $ANTLR start "rule__Personne__Group__4"
    // InternalGAME.g:1455:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1459:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGAME.g:1460:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Personne__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__4"


    // $ANTLR start "rule__Personne__Group__4__Impl"
    // InternalGAME.g:1467:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__LocalisationAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1471:1: ( ( ( rule__Personne__LocalisationAssignment_4 ) ) )
            // InternalGAME.g:1472:1: ( ( rule__Personne__LocalisationAssignment_4 ) )
            {
            // InternalGAME.g:1472:1: ( ( rule__Personne__LocalisationAssignment_4 ) )
            // InternalGAME.g:1473:2: ( rule__Personne__LocalisationAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getLocalisationAssignment_4()); 
            // InternalGAME.g:1474:2: ( rule__Personne__LocalisationAssignment_4 )
            // InternalGAME.g:1474:3: rule__Personne__LocalisationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Personne__LocalisationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getLocalisationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__4__Impl"


    // $ANTLR start "rule__Personne__Group__5"
    // InternalGAME.g:1482:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1486:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGAME.g:1487:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Personne__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__5"


    // $ANTLR start "rule__Personne__Group__5__Impl"
    // InternalGAME.g:1494:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__DescriptionsAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1498:1: ( ( ( rule__Personne__DescriptionsAssignment_5 ) ) )
            // InternalGAME.g:1499:1: ( ( rule__Personne__DescriptionsAssignment_5 ) )
            {
            // InternalGAME.g:1499:1: ( ( rule__Personne__DescriptionsAssignment_5 ) )
            // InternalGAME.g:1500:2: ( rule__Personne__DescriptionsAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getDescriptionsAssignment_5()); 
            // InternalGAME.g:1501:2: ( rule__Personne__DescriptionsAssignment_5 )
            // InternalGAME.g:1501:3: rule__Personne__DescriptionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Personne__DescriptionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getDescriptionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__5__Impl"


    // $ANTLR start "rule__Personne__Group__6"
    // InternalGAME.g:1509:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1513:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalGAME.g:1514:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Personne__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__6"


    // $ANTLR start "rule__Personne__Group__6__Impl"
    // InternalGAME.g:1521:1: rule__Personne__Group__6__Impl : ( ( rule__Personne__InteractionAssignment_6 ) ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1525:1: ( ( ( rule__Personne__InteractionAssignment_6 ) ) )
            // InternalGAME.g:1526:1: ( ( rule__Personne__InteractionAssignment_6 ) )
            {
            // InternalGAME.g:1526:1: ( ( rule__Personne__InteractionAssignment_6 ) )
            // InternalGAME.g:1527:2: ( rule__Personne__InteractionAssignment_6 )
            {
             before(grammarAccess.getPersonneAccess().getInteractionAssignment_6()); 
            // InternalGAME.g:1528:2: ( rule__Personne__InteractionAssignment_6 )
            // InternalGAME.g:1528:3: rule__Personne__InteractionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Personne__InteractionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getInteractionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__6__Impl"


    // $ANTLR start "rule__Personne__Group__7"
    // InternalGAME.g:1536:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl rule__Personne__Group__8 ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1540:1: ( rule__Personne__Group__7__Impl rule__Personne__Group__8 )
            // InternalGAME.g:1541:2: rule__Personne__Group__7__Impl rule__Personne__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Personne__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__7"


    // $ANTLR start "rule__Personne__Group__7__Impl"
    // InternalGAME.g:1548:1: rule__Personne__Group__7__Impl : ( ( rule__Personne__VisibiliteAssignment_7 ) ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1552:1: ( ( ( rule__Personne__VisibiliteAssignment_7 ) ) )
            // InternalGAME.g:1553:1: ( ( rule__Personne__VisibiliteAssignment_7 ) )
            {
            // InternalGAME.g:1553:1: ( ( rule__Personne__VisibiliteAssignment_7 ) )
            // InternalGAME.g:1554:2: ( rule__Personne__VisibiliteAssignment_7 )
            {
             before(grammarAccess.getPersonneAccess().getVisibiliteAssignment_7()); 
            // InternalGAME.g:1555:2: ( rule__Personne__VisibiliteAssignment_7 )
            // InternalGAME.g:1555:3: rule__Personne__VisibiliteAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibiliteAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibiliteAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__7__Impl"


    // $ANTLR start "rule__Personne__Group__8"
    // InternalGAME.g:1563:1: rule__Personne__Group__8 : rule__Personne__Group__8__Impl rule__Personne__Group__9 ;
    public final void rule__Personne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1567:1: ( rule__Personne__Group__8__Impl rule__Personne__Group__9 )
            // InternalGAME.g:1568:2: rule__Personne__Group__8__Impl rule__Personne__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Personne__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__8"


    // $ANTLR start "rule__Personne__Group__8__Impl"
    // InternalGAME.g:1575:1: rule__Personne__Group__8__Impl : ( ( rule__Personne__Group_8__0 )? ) ;
    public final void rule__Personne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1579:1: ( ( ( rule__Personne__Group_8__0 )? ) )
            // InternalGAME.g:1580:1: ( ( rule__Personne__Group_8__0 )? )
            {
            // InternalGAME.g:1580:1: ( ( rule__Personne__Group_8__0 )? )
            // InternalGAME.g:1581:2: ( rule__Personne__Group_8__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_8()); 
            // InternalGAME.g:1582:2: ( rule__Personne__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGAME.g:1582:3: rule__Personne__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__8__Impl"


    // $ANTLR start "rule__Personne__Group__9"
    // InternalGAME.g:1590:1: rule__Personne__Group__9 : rule__Personne__Group__9__Impl ;
    public final void rule__Personne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1594:1: ( rule__Personne__Group__9__Impl )
            // InternalGAME.g:1595:2: rule__Personne__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__9"


    // $ANTLR start "rule__Personne__Group__9__Impl"
    // InternalGAME.g:1601:1: rule__Personne__Group__9__Impl : ( '}' ) ;
    public final void rule__Personne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1605:1: ( ( '}' ) )
            // InternalGAME.g:1606:1: ( '}' )
            {
            // InternalGAME.g:1606:1: ( '}' )
            // InternalGAME.g:1607:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group__9__Impl"


    // $ANTLR start "rule__Personne__Group_8__0"
    // InternalGAME.g:1617:1: rule__Personne__Group_8__0 : rule__Personne__Group_8__0__Impl rule__Personne__Group_8__1 ;
    public final void rule__Personne__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1621:1: ( rule__Personne__Group_8__0__Impl rule__Personne__Group_8__1 )
            // InternalGAME.g:1622:2: rule__Personne__Group_8__0__Impl rule__Personne__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__Personne__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__0"


    // $ANTLR start "rule__Personne__Group_8__0__Impl"
    // InternalGAME.g:1629:1: rule__Personne__Group_8__0__Impl : ( 'si' ) ;
    public final void rule__Personne__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1633:1: ( ( 'si' ) )
            // InternalGAME.g:1634:1: ( 'si' )
            {
            // InternalGAME.g:1634:1: ( 'si' )
            // InternalGAME.g:1635:2: 'si'
            {
             before(grammarAccess.getPersonneAccess().getSiKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getSiKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__0__Impl"


    // $ANTLR start "rule__Personne__Group_8__1"
    // InternalGAME.g:1644:1: rule__Personne__Group_8__1 : rule__Personne__Group_8__1__Impl ;
    public final void rule__Personne__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1648:1: ( rule__Personne__Group_8__1__Impl )
            // InternalGAME.g:1649:2: rule__Personne__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__1"


    // $ANTLR start "rule__Personne__Group_8__1__Impl"
    // InternalGAME.g:1655:1: rule__Personne__Group_8__1__Impl : ( ( rule__Personne__ConditionsVisibiliteAssignment_8_1 ) ) ;
    public final void rule__Personne__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1659:1: ( ( ( rule__Personne__ConditionsVisibiliteAssignment_8_1 ) ) )
            // InternalGAME.g:1660:1: ( ( rule__Personne__ConditionsVisibiliteAssignment_8_1 ) )
            {
            // InternalGAME.g:1660:1: ( ( rule__Personne__ConditionsVisibiliteAssignment_8_1 ) )
            // InternalGAME.g:1661:2: ( rule__Personne__ConditionsVisibiliteAssignment_8_1 )
            {
             before(grammarAccess.getPersonneAccess().getConditionsVisibiliteAssignment_8_1()); 
            // InternalGAME.g:1662:2: ( rule__Personne__ConditionsVisibiliteAssignment_8_1 )
            // InternalGAME.g:1662:3: rule__Personne__ConditionsVisibiliteAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ConditionsVisibiliteAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getConditionsVisibiliteAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_8__1__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGAME.g:1671:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1675:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGAME.g:1676:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalGAME.g:1683:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1687:1: ( ( 'interaction' ) )
            // InternalGAME.g:1688:1: ( 'interaction' )
            {
            // InternalGAME.g:1688:1: ( 'interaction' )
            // InternalGAME.g:1689:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalGAME.g:1698:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1702:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGAME.g:1703:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalGAME.g:1710:1: rule__Interaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1714:1: ( ( '{' ) )
            // InternalGAME.g:1715:1: ( '{' )
            {
            // InternalGAME.g:1715:1: ( '{' )
            // InternalGAME.g:1716:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalGAME.g:1725:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1729:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGAME.g:1730:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Interaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalGAME.g:1737:1: rule__Interaction__Group__2__Impl : ( ( rule__Interaction__EchangesAssignment_2 )* ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1741:1: ( ( ( rule__Interaction__EchangesAssignment_2 )* ) )
            // InternalGAME.g:1742:1: ( ( rule__Interaction__EchangesAssignment_2 )* )
            {
            // InternalGAME.g:1742:1: ( ( rule__Interaction__EchangesAssignment_2 )* )
            // InternalGAME.g:1743:2: ( rule__Interaction__EchangesAssignment_2 )*
            {
             before(grammarAccess.getInteractionAccess().getEchangesAssignment_2()); 
            // InternalGAME.g:1744:2: ( rule__Interaction__EchangesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGAME.g:1744:3: rule__Interaction__EchangesAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Interaction__EchangesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getEchangesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // InternalGAME.g:1752:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1756:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGAME.g:1757:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Interaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__3"


    // $ANTLR start "rule__Interaction__Group__3__Impl"
    // InternalGAME.g:1764:1: rule__Interaction__Group__3__Impl : ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1768:1: ( ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) ) )
            // InternalGAME.g:1769:1: ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) )
            {
            // InternalGAME.g:1769:1: ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) )
            // InternalGAME.g:1770:2: ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* )
            {
            // InternalGAME.g:1770:2: ( ( rule__Interaction__ChoixAssignment_3 ) )
            // InternalGAME.g:1771:3: ( rule__Interaction__ChoixAssignment_3 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 
            // InternalGAME.g:1772:3: ( rule__Interaction__ChoixAssignment_3 )
            // InternalGAME.g:1772:4: rule__Interaction__ChoixAssignment_3
            {
            pushFollow(FOLLOW_28);
            rule__Interaction__ChoixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 

            }

            // InternalGAME.g:1775:2: ( ( rule__Interaction__ChoixAssignment_3 )* )
            // InternalGAME.g:1776:3: ( rule__Interaction__ChoixAssignment_3 )*
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 
            // InternalGAME.g:1777:3: ( rule__Interaction__ChoixAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGAME.g:1777:4: rule__Interaction__ChoixAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Interaction__ChoixAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 

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
    // $ANTLR end "rule__Interaction__Group__3__Impl"


    // $ANTLR start "rule__Interaction__Group__4"
    // InternalGAME.g:1786:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1790:1: ( rule__Interaction__Group__4__Impl )
            // InternalGAME.g:1791:2: rule__Interaction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__4"


    // $ANTLR start "rule__Interaction__Group__4__Impl"
    // InternalGAME.g:1797:1: rule__Interaction__Group__4__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1801:1: ( ( '}' ) )
            // InternalGAME.g:1802:1: ( '}' )
            {
            // InternalGAME.g:1802:1: ( '}' )
            // InternalGAME.g:1803:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__4__Impl"


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGAME.g:1813:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1817:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGAME.g:1818:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Choix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__0"


    // $ANTLR start "rule__Choix__Group__0__Impl"
    // InternalGAME.g:1825:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1829:1: ( ( 'choix' ) )
            // InternalGAME.g:1830:1: ( 'choix' )
            {
            // InternalGAME.g:1830:1: ( 'choix' )
            // InternalGAME.g:1831:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__0__Impl"


    // $ANTLR start "rule__Choix__Group__1"
    // InternalGAME.g:1840:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1844:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGAME.g:1845:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__1"


    // $ANTLR start "rule__Choix__Group__1__Impl"
    // InternalGAME.g:1852:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1856:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGAME.g:1857:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGAME.g:1857:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGAME.g:1858:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGAME.g:1859:2: ( rule__Choix__NameAssignment_1 )
            // InternalGAME.g:1859:3: rule__Choix__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__1__Impl"


    // $ANTLR start "rule__Choix__Group__2"
    // InternalGAME.g:1867:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1871:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGAME.g:1872:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Choix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__2"


    // $ANTLR start "rule__Choix__Group__2__Impl"
    // InternalGAME.g:1879:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1883:1: ( ( '{' ) )
            // InternalGAME.g:1884:1: ( '{' )
            {
            // InternalGAME.g:1884:1: ( '{' )
            // InternalGAME.g:1885:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__2__Impl"


    // $ANTLR start "rule__Choix__Group__3"
    // InternalGAME.g:1894:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1898:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGAME.g:1899:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Choix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__3"


    // $ANTLR start "rule__Choix__Group__3__Impl"
    // InternalGAME.g:1906:1: rule__Choix__Group__3__Impl : ( ( rule__Choix__ActionsAssignment_3 )* ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1910:1: ( ( ( rule__Choix__ActionsAssignment_3 )* ) )
            // InternalGAME.g:1911:1: ( ( rule__Choix__ActionsAssignment_3 )* )
            {
            // InternalGAME.g:1911:1: ( ( rule__Choix__ActionsAssignment_3 )* )
            // InternalGAME.g:1912:2: ( rule__Choix__ActionsAssignment_3 )*
            {
             before(grammarAccess.getChoixAccess().getActionsAssignment_3()); 
            // InternalGAME.g:1913:2: ( rule__Choix__ActionsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGAME.g:1913:3: rule__Choix__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Choix__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__3__Impl"


    // $ANTLR start "rule__Choix__Group__4"
    // InternalGAME.g:1921:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1925:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGAME.g:1926:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Choix__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__4"


    // $ANTLR start "rule__Choix__Group__4__Impl"
    // InternalGAME.g:1933:1: rule__Choix__Group__4__Impl : ( ( rule__Choix__ConditionsAssignment_4 )* ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1937:1: ( ( ( rule__Choix__ConditionsAssignment_4 )* ) )
            // InternalGAME.g:1938:1: ( ( rule__Choix__ConditionsAssignment_4 )* )
            {
            // InternalGAME.g:1938:1: ( ( rule__Choix__ConditionsAssignment_4 )* )
            // InternalGAME.g:1939:2: ( rule__Choix__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getChoixAccess().getConditionsAssignment_4()); 
            // InternalGAME.g:1940:2: ( rule__Choix__ConditionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGAME.g:1940:3: rule__Choix__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Choix__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getConditionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__4__Impl"


    // $ANTLR start "rule__Choix__Group__5"
    // InternalGAME.g:1948:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1952:1: ( rule__Choix__Group__5__Impl )
            // InternalGAME.g:1953:2: rule__Choix__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__5"


    // $ANTLR start "rule__Choix__Group__5__Impl"
    // InternalGAME.g:1959:1: rule__Choix__Group__5__Impl : ( '}' ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1963:1: ( ( '}' ) )
            // InternalGAME.g:1964:1: ( '}' )
            {
            // InternalGAME.g:1964:1: ( '}' )
            // InternalGAME.g:1965:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalGAME.g:1975:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1979:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGAME.g:1980:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalGAME.g:1987:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1991:1: ( ( 'action' ) )
            // InternalGAME.g:1992:1: ( 'action' )
            {
            // InternalGAME.g:1992:1: ( 'action' )
            // InternalGAME.g:1993:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalGAME.g:2002:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2006:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalGAME.g:2007:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalGAME.g:2014:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2018:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalGAME.g:2019:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalGAME.g:2019:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalGAME.g:2020:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalGAME.g:2021:2: ( rule__Action__NameAssignment_1 )
            // InternalGAME.g:2021:3: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalGAME.g:2029:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2033:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalGAME.g:2034:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalGAME.g:2041:1: rule__Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2045:1: ( ( '{' ) )
            // InternalGAME.g:2046:1: ( '{' )
            {
            // InternalGAME.g:2046:1: ( '{' )
            // InternalGAME.g:2047:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalGAME.g:2056:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2060:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalGAME.g:2061:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalGAME.g:2068:1: rule__Action__Group__3__Impl : ( ( rule__Action__DescriptionsAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2072:1: ( ( ( rule__Action__DescriptionsAssignment_3 ) ) )
            // InternalGAME.g:2073:1: ( ( rule__Action__DescriptionsAssignment_3 ) )
            {
            // InternalGAME.g:2073:1: ( ( rule__Action__DescriptionsAssignment_3 ) )
            // InternalGAME.g:2074:2: ( rule__Action__DescriptionsAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:2075:2: ( rule__Action__DescriptionsAssignment_3 )
            // InternalGAME.g:2075:3: rule__Action__DescriptionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Action__DescriptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalGAME.g:2083:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2087:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalGAME.g:2088:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalGAME.g:2095:1: rule__Action__Group__4__Impl : ( ( rule__Action__ConditionsAssignment_4 )* ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2099:1: ( ( ( rule__Action__ConditionsAssignment_4 )* ) )
            // InternalGAME.g:2100:1: ( ( rule__Action__ConditionsAssignment_4 )* )
            {
            // InternalGAME.g:2100:1: ( ( rule__Action__ConditionsAssignment_4 )* )
            // InternalGAME.g:2101:2: ( rule__Action__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getActionAccess().getConditionsAssignment_4()); 
            // InternalGAME.g:2102:2: ( rule__Action__ConditionsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGAME.g:2102:3: rule__Action__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Action__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getConditionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalGAME.g:2110:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2114:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalGAME.g:2115:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalGAME.g:2122:1: rule__Action__Group__5__Impl : ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2126:1: ( ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) ) )
            // InternalGAME.g:2127:1: ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) )
            {
            // InternalGAME.g:2127:1: ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) )
            // InternalGAME.g:2128:2: ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* )
            {
            // InternalGAME.g:2128:2: ( ( rule__Action__EchangesAssignment_5 ) )
            // InternalGAME.g:2129:3: ( rule__Action__EchangesAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getEchangesAssignment_5()); 
            // InternalGAME.g:2130:3: ( rule__Action__EchangesAssignment_5 )
            // InternalGAME.g:2130:4: rule__Action__EchangesAssignment_5
            {
            pushFollow(FOLLOW_33);
            rule__Action__EchangesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getEchangesAssignment_5()); 

            }

            // InternalGAME.g:2133:2: ( ( rule__Action__EchangesAssignment_5 )* )
            // InternalGAME.g:2134:3: ( rule__Action__EchangesAssignment_5 )*
            {
             before(grammarAccess.getActionAccess().getEchangesAssignment_5()); 
            // InternalGAME.g:2135:3: ( rule__Action__EchangesAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGAME.g:2135:4: rule__Action__EchangesAssignment_5
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Action__EchangesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getEchangesAssignment_5()); 

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
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalGAME.g:2144:1: rule__Action__Group__6 : rule__Action__Group__6__Impl ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2148:1: ( rule__Action__Group__6__Impl )
            // InternalGAME.g:2149:2: rule__Action__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalGAME.g:2155:1: rule__Action__Group__6__Impl : ( '}' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2159:1: ( ( '}' ) )
            // InternalGAME.g:2160:1: ( '}' )
            {
            // InternalGAME.g:2160:1: ( '}' )
            // InternalGAME.g:2161:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Echange__Group__0"
    // InternalGAME.g:2171:1: rule__Echange__Group__0 : rule__Echange__Group__0__Impl rule__Echange__Group__1 ;
    public final void rule__Echange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2175:1: ( rule__Echange__Group__0__Impl rule__Echange__Group__1 )
            // InternalGAME.g:2176:2: rule__Echange__Group__0__Impl rule__Echange__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Echange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__0"


    // $ANTLR start "rule__Echange__Group__0__Impl"
    // InternalGAME.g:2183:1: rule__Echange__Group__0__Impl : ( () ) ;
    public final void rule__Echange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2187:1: ( ( () ) )
            // InternalGAME.g:2188:1: ( () )
            {
            // InternalGAME.g:2188:1: ( () )
            // InternalGAME.g:2189:2: ()
            {
             before(grammarAccess.getEchangeAccess().getEchangeAction_0()); 
            // InternalGAME.g:2190:2: ()
            // InternalGAME.g:2190:3: 
            {
            }

             after(grammarAccess.getEchangeAccess().getEchangeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__0__Impl"


    // $ANTLR start "rule__Echange__Group__1"
    // InternalGAME.g:2198:1: rule__Echange__Group__1 : rule__Echange__Group__1__Impl rule__Echange__Group__2 ;
    public final void rule__Echange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2202:1: ( rule__Echange__Group__1__Impl rule__Echange__Group__2 )
            // InternalGAME.g:2203:2: rule__Echange__Group__1__Impl rule__Echange__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Echange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__1"


    // $ANTLR start "rule__Echange__Group__1__Impl"
    // InternalGAME.g:2210:1: rule__Echange__Group__1__Impl : ( 'echange' ) ;
    public final void rule__Echange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2214:1: ( ( 'echange' ) )
            // InternalGAME.g:2215:1: ( 'echange' )
            {
            // InternalGAME.g:2215:1: ( 'echange' )
            // InternalGAME.g:2216:2: 'echange'
            {
             before(grammarAccess.getEchangeAccess().getEchangeKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getEchangeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__1__Impl"


    // $ANTLR start "rule__Echange__Group__2"
    // InternalGAME.g:2225:1: rule__Echange__Group__2 : rule__Echange__Group__2__Impl rule__Echange__Group__3 ;
    public final void rule__Echange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2229:1: ( rule__Echange__Group__2__Impl rule__Echange__Group__3 )
            // InternalGAME.g:2230:2: rule__Echange__Group__2__Impl rule__Echange__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Echange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__2"


    // $ANTLR start "rule__Echange__Group__2__Impl"
    // InternalGAME.g:2237:1: rule__Echange__Group__2__Impl : ( '{' ) ;
    public final void rule__Echange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2241:1: ( ( '{' ) )
            // InternalGAME.g:2242:1: ( '{' )
            {
            // InternalGAME.g:2242:1: ( '{' )
            // InternalGAME.g:2243:2: '{'
            {
             before(grammarAccess.getEchangeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__2__Impl"


    // $ANTLR start "rule__Echange__Group__3"
    // InternalGAME.g:2252:1: rule__Echange__Group__3 : rule__Echange__Group__3__Impl rule__Echange__Group__4 ;
    public final void rule__Echange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2256:1: ( rule__Echange__Group__3__Impl rule__Echange__Group__4 )
            // InternalGAME.g:2257:2: rule__Echange__Group__3__Impl rule__Echange__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Echange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__3"


    // $ANTLR start "rule__Echange__Group__3__Impl"
    // InternalGAME.g:2264:1: rule__Echange__Group__3__Impl : ( ( rule__Echange__Group_3__0 )? ) ;
    public final void rule__Echange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2268:1: ( ( ( rule__Echange__Group_3__0 )? ) )
            // InternalGAME.g:2269:1: ( ( rule__Echange__Group_3__0 )? )
            {
            // InternalGAME.g:2269:1: ( ( rule__Echange__Group_3__0 )? )
            // InternalGAME.g:2270:2: ( rule__Echange__Group_3__0 )?
            {
             before(grammarAccess.getEchangeAccess().getGroup_3()); 
            // InternalGAME.g:2271:2: ( rule__Echange__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGAME.g:2271:3: rule__Echange__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Echange__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEchangeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__3__Impl"


    // $ANTLR start "rule__Echange__Group__4"
    // InternalGAME.g:2279:1: rule__Echange__Group__4 : rule__Echange__Group__4__Impl rule__Echange__Group__5 ;
    public final void rule__Echange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2283:1: ( rule__Echange__Group__4__Impl rule__Echange__Group__5 )
            // InternalGAME.g:2284:2: rule__Echange__Group__4__Impl rule__Echange__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Echange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__4"


    // $ANTLR start "rule__Echange__Group__4__Impl"
    // InternalGAME.g:2291:1: rule__Echange__Group__4__Impl : ( ( rule__Echange__Group_4__0 )? ) ;
    public final void rule__Echange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2295:1: ( ( ( rule__Echange__Group_4__0 )? ) )
            // InternalGAME.g:2296:1: ( ( rule__Echange__Group_4__0 )? )
            {
            // InternalGAME.g:2296:1: ( ( rule__Echange__Group_4__0 )? )
            // InternalGAME.g:2297:2: ( rule__Echange__Group_4__0 )?
            {
             before(grammarAccess.getEchangeAccess().getGroup_4()); 
            // InternalGAME.g:2298:2: ( rule__Echange__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGAME.g:2298:3: rule__Echange__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Echange__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEchangeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__4__Impl"


    // $ANTLR start "rule__Echange__Group__5"
    // InternalGAME.g:2306:1: rule__Echange__Group__5 : rule__Echange__Group__5__Impl rule__Echange__Group__6 ;
    public final void rule__Echange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2310:1: ( rule__Echange__Group__5__Impl rule__Echange__Group__6 )
            // InternalGAME.g:2311:2: rule__Echange__Group__5__Impl rule__Echange__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Echange__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__5"


    // $ANTLR start "rule__Echange__Group__5__Impl"
    // InternalGAME.g:2318:1: rule__Echange__Group__5__Impl : ( ( rule__Echange__Group_5__0 )? ) ;
    public final void rule__Echange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2322:1: ( ( ( rule__Echange__Group_5__0 )? ) )
            // InternalGAME.g:2323:1: ( ( rule__Echange__Group_5__0 )? )
            {
            // InternalGAME.g:2323:1: ( ( rule__Echange__Group_5__0 )? )
            // InternalGAME.g:2324:2: ( rule__Echange__Group_5__0 )?
            {
             before(grammarAccess.getEchangeAccess().getGroup_5()); 
            // InternalGAME.g:2325:2: ( rule__Echange__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGAME.g:2325:3: rule__Echange__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Echange__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEchangeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__5__Impl"


    // $ANTLR start "rule__Echange__Group__6"
    // InternalGAME.g:2333:1: rule__Echange__Group__6 : rule__Echange__Group__6__Impl rule__Echange__Group__7 ;
    public final void rule__Echange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2337:1: ( rule__Echange__Group__6__Impl rule__Echange__Group__7 )
            // InternalGAME.g:2338:2: rule__Echange__Group__6__Impl rule__Echange__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__Echange__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__6"


    // $ANTLR start "rule__Echange__Group__6__Impl"
    // InternalGAME.g:2345:1: rule__Echange__Group__6__Impl : ( ( rule__Echange__ConditionsAssignment_6 )* ) ;
    public final void rule__Echange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2349:1: ( ( ( rule__Echange__ConditionsAssignment_6 )* ) )
            // InternalGAME.g:2350:1: ( ( rule__Echange__ConditionsAssignment_6 )* )
            {
            // InternalGAME.g:2350:1: ( ( rule__Echange__ConditionsAssignment_6 )* )
            // InternalGAME.g:2351:2: ( rule__Echange__ConditionsAssignment_6 )*
            {
             before(grammarAccess.getEchangeAccess().getConditionsAssignment_6()); 
            // InternalGAME.g:2352:2: ( rule__Echange__ConditionsAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGAME.g:2352:3: rule__Echange__ConditionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Echange__ConditionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEchangeAccess().getConditionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__6__Impl"


    // $ANTLR start "rule__Echange__Group__7"
    // InternalGAME.g:2360:1: rule__Echange__Group__7 : rule__Echange__Group__7__Impl ;
    public final void rule__Echange__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2364:1: ( rule__Echange__Group__7__Impl )
            // InternalGAME.g:2365:2: rule__Echange__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Echange__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__7"


    // $ANTLR start "rule__Echange__Group__7__Impl"
    // InternalGAME.g:2371:1: rule__Echange__Group__7__Impl : ( '}' ) ;
    public final void rule__Echange__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2375:1: ( ( '}' ) )
            // InternalGAME.g:2376:1: ( '}' )
            {
            // InternalGAME.g:2376:1: ( '}' )
            // InternalGAME.g:2377:2: '}'
            {
             before(grammarAccess.getEchangeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group__7__Impl"


    // $ANTLR start "rule__Echange__Group_3__0"
    // InternalGAME.g:2387:1: rule__Echange__Group_3__0 : rule__Echange__Group_3__0__Impl rule__Echange__Group_3__1 ;
    public final void rule__Echange__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2391:1: ( rule__Echange__Group_3__0__Impl rule__Echange__Group_3__1 )
            // InternalGAME.g:2392:2: rule__Echange__Group_3__0__Impl rule__Echange__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Echange__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_3__0"


    // $ANTLR start "rule__Echange__Group_3__0__Impl"
    // InternalGAME.g:2399:1: rule__Echange__Group_3__0__Impl : ( 'objetsDonne' ) ;
    public final void rule__Echange__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2403:1: ( ( 'objetsDonne' ) )
            // InternalGAME.g:2404:1: ( 'objetsDonne' )
            {
            // InternalGAME.g:2404:1: ( 'objetsDonne' )
            // InternalGAME.g:2405:2: 'objetsDonne'
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getObjetsDonneKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_3__0__Impl"


    // $ANTLR start "rule__Echange__Group_3__1"
    // InternalGAME.g:2414:1: rule__Echange__Group_3__1 : rule__Echange__Group_3__1__Impl ;
    public final void rule__Echange__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2418:1: ( rule__Echange__Group_3__1__Impl )
            // InternalGAME.g:2419:2: rule__Echange__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Echange__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_3__1"


    // $ANTLR start "rule__Echange__Group_3__1__Impl"
    // InternalGAME.g:2425:1: rule__Echange__Group_3__1__Impl : ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) ) ;
    public final void rule__Echange__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2429:1: ( ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) ) )
            // InternalGAME.g:2430:1: ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) )
            {
            // InternalGAME.g:2430:1: ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) )
            // InternalGAME.g:2431:2: ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* )
            {
            // InternalGAME.g:2431:2: ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) )
            // InternalGAME.g:2432:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneAssignment_3_1()); 
            // InternalGAME.g:2433:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )
            // InternalGAME.g:2433:4: rule__Echange__ObjetsDonneAssignment_3_1
            {
            pushFollow(FOLLOW_9);
            rule__Echange__ObjetsDonneAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEchangeAccess().getObjetsDonneAssignment_3_1()); 

            }

            // InternalGAME.g:2436:2: ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* )
            // InternalGAME.g:2437:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )*
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneAssignment_3_1()); 
            // InternalGAME.g:2438:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGAME.g:2438:4: rule__Echange__ObjetsDonneAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Echange__ObjetsDonneAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEchangeAccess().getObjetsDonneAssignment_3_1()); 

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
    // $ANTLR end "rule__Echange__Group_3__1__Impl"


    // $ANTLR start "rule__Echange__Group_4__0"
    // InternalGAME.g:2448:1: rule__Echange__Group_4__0 : rule__Echange__Group_4__0__Impl rule__Echange__Group_4__1 ;
    public final void rule__Echange__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2452:1: ( rule__Echange__Group_4__0__Impl rule__Echange__Group_4__1 )
            // InternalGAME.g:2453:2: rule__Echange__Group_4__0__Impl rule__Echange__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Echange__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_4__0"


    // $ANTLR start "rule__Echange__Group_4__0__Impl"
    // InternalGAME.g:2460:1: rule__Echange__Group_4__0__Impl : ( 'objetsPris' ) ;
    public final void rule__Echange__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2464:1: ( ( 'objetsPris' ) )
            // InternalGAME.g:2465:1: ( 'objetsPris' )
            {
            // InternalGAME.g:2465:1: ( 'objetsPris' )
            // InternalGAME.g:2466:2: 'objetsPris'
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getObjetsPrisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_4__0__Impl"


    // $ANTLR start "rule__Echange__Group_4__1"
    // InternalGAME.g:2475:1: rule__Echange__Group_4__1 : rule__Echange__Group_4__1__Impl ;
    public final void rule__Echange__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2479:1: ( rule__Echange__Group_4__1__Impl )
            // InternalGAME.g:2480:2: rule__Echange__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Echange__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_4__1"


    // $ANTLR start "rule__Echange__Group_4__1__Impl"
    // InternalGAME.g:2486:1: rule__Echange__Group_4__1__Impl : ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) ) ;
    public final void rule__Echange__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2490:1: ( ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) ) )
            // InternalGAME.g:2491:1: ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) )
            {
            // InternalGAME.g:2491:1: ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) )
            // InternalGAME.g:2492:2: ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* )
            {
            // InternalGAME.g:2492:2: ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) )
            // InternalGAME.g:2493:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisAssignment_4_1()); 
            // InternalGAME.g:2494:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )
            // InternalGAME.g:2494:4: rule__Echange__ObjetsPrisAssignment_4_1
            {
            pushFollow(FOLLOW_9);
            rule__Echange__ObjetsPrisAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEchangeAccess().getObjetsPrisAssignment_4_1()); 

            }

            // InternalGAME.g:2497:2: ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* )
            // InternalGAME.g:2498:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )*
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisAssignment_4_1()); 
            // InternalGAME.g:2499:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGAME.g:2499:4: rule__Echange__ObjetsPrisAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Echange__ObjetsPrisAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEchangeAccess().getObjetsPrisAssignment_4_1()); 

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
    // $ANTLR end "rule__Echange__Group_4__1__Impl"


    // $ANTLR start "rule__Echange__Group_5__0"
    // InternalGAME.g:2509:1: rule__Echange__Group_5__0 : rule__Echange__Group_5__0__Impl rule__Echange__Group_5__1 ;
    public final void rule__Echange__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2513:1: ( rule__Echange__Group_5__0__Impl rule__Echange__Group_5__1 )
            // InternalGAME.g:2514:2: rule__Echange__Group_5__0__Impl rule__Echange__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Echange__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Echange__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_5__0"


    // $ANTLR start "rule__Echange__Group_5__0__Impl"
    // InternalGAME.g:2521:1: rule__Echange__Group_5__0__Impl : ( 'connaissancesDonne' ) ;
    public final void rule__Echange__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2525:1: ( ( 'connaissancesDonne' ) )
            // InternalGAME.g:2526:1: ( 'connaissancesDonne' )
            {
            // InternalGAME.g:2526:1: ( 'connaissancesDonne' )
            // InternalGAME.g:2527:2: 'connaissancesDonne'
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesDonneKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getConnaissancesDonneKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_5__0__Impl"


    // $ANTLR start "rule__Echange__Group_5__1"
    // InternalGAME.g:2536:1: rule__Echange__Group_5__1 : rule__Echange__Group_5__1__Impl ;
    public final void rule__Echange__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2540:1: ( rule__Echange__Group_5__1__Impl )
            // InternalGAME.g:2541:2: rule__Echange__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Echange__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__Group_5__1"


    // $ANTLR start "rule__Echange__Group_5__1__Impl"
    // InternalGAME.g:2547:1: rule__Echange__Group_5__1__Impl : ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) ) ;
    public final void rule__Echange__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2551:1: ( ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) ) )
            // InternalGAME.g:2552:1: ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) )
            {
            // InternalGAME.g:2552:1: ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) )
            // InternalGAME.g:2553:2: ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* )
            {
            // InternalGAME.g:2553:2: ( ( rule__Echange__ConnaissancesAssignment_5_1 ) )
            // InternalGAME.g:2554:3: ( rule__Echange__ConnaissancesAssignment_5_1 )
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesAssignment_5_1()); 
            // InternalGAME.g:2555:3: ( rule__Echange__ConnaissancesAssignment_5_1 )
            // InternalGAME.g:2555:4: rule__Echange__ConnaissancesAssignment_5_1
            {
            pushFollow(FOLLOW_9);
            rule__Echange__ConnaissancesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEchangeAccess().getConnaissancesAssignment_5_1()); 

            }

            // InternalGAME.g:2558:2: ( ( rule__Echange__ConnaissancesAssignment_5_1 )* )
            // InternalGAME.g:2559:3: ( rule__Echange__ConnaissancesAssignment_5_1 )*
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesAssignment_5_1()); 
            // InternalGAME.g:2560:3: ( rule__Echange__ConnaissancesAssignment_5_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGAME.g:2560:4: rule__Echange__ConnaissancesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Echange__ConnaissancesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEchangeAccess().getConnaissancesAssignment_5_1()); 

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
    // $ANTLR end "rule__Echange__Group_5__1__Impl"


    // $ANTLR start "rule__Objet__Group__0"
    // InternalGAME.g:2570:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2574:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGAME.g:2575:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Objet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__0"


    // $ANTLR start "rule__Objet__Group__0__Impl"
    // InternalGAME.g:2582:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2586:1: ( ( 'objet' ) )
            // InternalGAME.g:2587:1: ( 'objet' )
            {
            // InternalGAME.g:2587:1: ( 'objet' )
            // InternalGAME.g:2588:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getObjetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__0__Impl"


    // $ANTLR start "rule__Objet__Group__1"
    // InternalGAME.g:2597:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2601:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGAME.g:2602:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Objet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__1"


    // $ANTLR start "rule__Objet__Group__1__Impl"
    // InternalGAME.g:2609:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2613:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGAME.g:2614:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGAME.g:2614:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGAME.g:2615:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGAME.g:2616:2: ( rule__Objet__NameAssignment_1 )
            // InternalGAME.g:2616:3: rule__Objet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__1__Impl"


    // $ANTLR start "rule__Objet__Group__2"
    // InternalGAME.g:2624:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2628:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGAME.g:2629:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Objet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__2"


    // $ANTLR start "rule__Objet__Group__2__Impl"
    // InternalGAME.g:2636:1: rule__Objet__Group__2__Impl : ( '{' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2640:1: ( ( '{' ) )
            // InternalGAME.g:2641:1: ( '{' )
            {
            // InternalGAME.g:2641:1: ( '{' )
            // InternalGAME.g:2642:2: '{'
            {
             before(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__2__Impl"


    // $ANTLR start "rule__Objet__Group__3"
    // InternalGAME.g:2651:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2655:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGAME.g:2656:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Objet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__3"


    // $ANTLR start "rule__Objet__Group__3__Impl"
    // InternalGAME.g:2663:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__DescriptionsAssignment_3 )? ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2667:1: ( ( ( rule__Objet__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:2668:1: ( ( rule__Objet__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:2668:1: ( ( rule__Objet__DescriptionsAssignment_3 )? )
            // InternalGAME.g:2669:2: ( rule__Objet__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getObjetAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:2670:2: ( rule__Objet__DescriptionsAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGAME.g:2670:3: rule__Objet__DescriptionsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__DescriptionsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__3__Impl"


    // $ANTLR start "rule__Objet__Group__4"
    // InternalGAME.g:2678:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2682:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGAME.g:2683:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Objet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__4"


    // $ANTLR start "rule__Objet__Group__4__Impl"
    // InternalGAME.g:2690:1: rule__Objet__Group__4__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2694:1: ( ( 'taille' ) )
            // InternalGAME.g:2695:1: ( 'taille' )
            {
            // InternalGAME.g:2695:1: ( 'taille' )
            // InternalGAME.g:2696:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__4__Impl"


    // $ANTLR start "rule__Objet__Group__5"
    // InternalGAME.g:2705:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2709:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGAME.g:2710:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Objet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__5"


    // $ANTLR start "rule__Objet__Group__5__Impl"
    // InternalGAME.g:2717:1: rule__Objet__Group__5__Impl : ( ( rule__Objet__TailleAssignment_5 ) ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2721:1: ( ( ( rule__Objet__TailleAssignment_5 ) ) )
            // InternalGAME.g:2722:1: ( ( rule__Objet__TailleAssignment_5 ) )
            {
            // InternalGAME.g:2722:1: ( ( rule__Objet__TailleAssignment_5 ) )
            // InternalGAME.g:2723:2: ( rule__Objet__TailleAssignment_5 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_5()); 
            // InternalGAME.g:2724:2: ( rule__Objet__TailleAssignment_5 )
            // InternalGAME.g:2724:3: rule__Objet__TailleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__5__Impl"


    // $ANTLR start "rule__Objet__Group__6"
    // InternalGAME.g:2732:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl rule__Objet__Group__7 ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2736:1: ( rule__Objet__Group__6__Impl rule__Objet__Group__7 )
            // InternalGAME.g:2737:2: rule__Objet__Group__6__Impl rule__Objet__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Objet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__6"


    // $ANTLR start "rule__Objet__Group__6__Impl"
    // InternalGAME.g:2744:1: rule__Objet__Group__6__Impl : ( ( rule__Objet__VisibiliteAssignment_6 ) ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2748:1: ( ( ( rule__Objet__VisibiliteAssignment_6 ) ) )
            // InternalGAME.g:2749:1: ( ( rule__Objet__VisibiliteAssignment_6 ) )
            {
            // InternalGAME.g:2749:1: ( ( rule__Objet__VisibiliteAssignment_6 ) )
            // InternalGAME.g:2750:2: ( rule__Objet__VisibiliteAssignment_6 )
            {
             before(grammarAccess.getObjetAccess().getVisibiliteAssignment_6()); 
            // InternalGAME.g:2751:2: ( rule__Objet__VisibiliteAssignment_6 )
            // InternalGAME.g:2751:3: rule__Objet__VisibiliteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Objet__VisibiliteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getVisibiliteAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__6__Impl"


    // $ANTLR start "rule__Objet__Group__7"
    // InternalGAME.g:2759:1: rule__Objet__Group__7 : rule__Objet__Group__7__Impl rule__Objet__Group__8 ;
    public final void rule__Objet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2763:1: ( rule__Objet__Group__7__Impl rule__Objet__Group__8 )
            // InternalGAME.g:2764:2: rule__Objet__Group__7__Impl rule__Objet__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Objet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__7"


    // $ANTLR start "rule__Objet__Group__7__Impl"
    // InternalGAME.g:2771:1: rule__Objet__Group__7__Impl : ( ( rule__Objet__Group_7__0 )? ) ;
    public final void rule__Objet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2775:1: ( ( ( rule__Objet__Group_7__0 )? ) )
            // InternalGAME.g:2776:1: ( ( rule__Objet__Group_7__0 )? )
            {
            // InternalGAME.g:2776:1: ( ( rule__Objet__Group_7__0 )? )
            // InternalGAME.g:2777:2: ( rule__Objet__Group_7__0 )?
            {
             before(grammarAccess.getObjetAccess().getGroup_7()); 
            // InternalGAME.g:2778:2: ( rule__Objet__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGAME.g:2778:3: rule__Objet__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__7__Impl"


    // $ANTLR start "rule__Objet__Group__8"
    // InternalGAME.g:2786:1: rule__Objet__Group__8 : rule__Objet__Group__8__Impl ;
    public final void rule__Objet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2790:1: ( rule__Objet__Group__8__Impl )
            // InternalGAME.g:2791:2: rule__Objet__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__8"


    // $ANTLR start "rule__Objet__Group__8__Impl"
    // InternalGAME.g:2797:1: rule__Objet__Group__8__Impl : ( '}' ) ;
    public final void rule__Objet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2801:1: ( ( '}' ) )
            // InternalGAME.g:2802:1: ( '}' )
            {
            // InternalGAME.g:2802:1: ( '}' )
            // InternalGAME.g:2803:2: '}'
            {
             before(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__8__Impl"


    // $ANTLR start "rule__Objet__Group_7__0"
    // InternalGAME.g:2813:1: rule__Objet__Group_7__0 : rule__Objet__Group_7__0__Impl rule__Objet__Group_7__1 ;
    public final void rule__Objet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2817:1: ( rule__Objet__Group_7__0__Impl rule__Objet__Group_7__1 )
            // InternalGAME.g:2818:2: rule__Objet__Group_7__0__Impl rule__Objet__Group_7__1
            {
            pushFollow(FOLLOW_21);
            rule__Objet__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__0"


    // $ANTLR start "rule__Objet__Group_7__0__Impl"
    // InternalGAME.g:2825:1: rule__Objet__Group_7__0__Impl : ( 'si' ) ;
    public final void rule__Objet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2829:1: ( ( 'si' ) )
            // InternalGAME.g:2830:1: ( 'si' )
            {
            // InternalGAME.g:2830:1: ( 'si' )
            // InternalGAME.g:2831:2: 'si'
            {
             before(grammarAccess.getObjetAccess().getSiKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getSiKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__0__Impl"


    // $ANTLR start "rule__Objet__Group_7__1"
    // InternalGAME.g:2840:1: rule__Objet__Group_7__1 : rule__Objet__Group_7__1__Impl ;
    public final void rule__Objet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2844:1: ( rule__Objet__Group_7__1__Impl )
            // InternalGAME.g:2845:2: rule__Objet__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__1"


    // $ANTLR start "rule__Objet__Group_7__1__Impl"
    // InternalGAME.g:2851:1: rule__Objet__Group_7__1__Impl : ( ( rule__Objet__ConditionsVisibiliteAssignment_7_1 ) ) ;
    public final void rule__Objet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2855:1: ( ( ( rule__Objet__ConditionsVisibiliteAssignment_7_1 ) ) )
            // InternalGAME.g:2856:1: ( ( rule__Objet__ConditionsVisibiliteAssignment_7_1 ) )
            {
            // InternalGAME.g:2856:1: ( ( rule__Objet__ConditionsVisibiliteAssignment_7_1 ) )
            // InternalGAME.g:2857:2: ( rule__Objet__ConditionsVisibiliteAssignment_7_1 )
            {
             before(grammarAccess.getObjetAccess().getConditionsVisibiliteAssignment_7_1()); 
            // InternalGAME.g:2858:2: ( rule__Objet__ConditionsVisibiliteAssignment_7_1 )
            // InternalGAME.g:2858:3: rule__Objet__ConditionsVisibiliteAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__ConditionsVisibiliteAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getConditionsVisibiliteAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_7__1__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalGAME.g:2867:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2871:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGAME.g:2872:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalGAME.g:2879:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2883:1: ( ( 'description' ) )
            // InternalGAME.g:2884:1: ( 'description' )
            {
            // InternalGAME.g:2884:1: ( 'description' )
            // InternalGAME.g:2885:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalGAME.g:2894:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2898:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalGAME.g:2899:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalGAME.g:2906:1: rule__Description__Group__1__Impl : ( '{' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2910:1: ( ( '{' ) )
            // InternalGAME.g:2911:1: ( '{' )
            {
            // InternalGAME.g:2911:1: ( '{' )
            // InternalGAME.g:2912:2: '{'
            {
             before(grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalGAME.g:2921:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2925:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalGAME.g:2926:2: rule__Description__Group__2__Impl rule__Description__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Description__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalGAME.g:2933:1: rule__Description__Group__2__Impl : ( ( rule__Description__TextAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2937:1: ( ( ( rule__Description__TextAssignment_2 ) ) )
            // InternalGAME.g:2938:1: ( ( rule__Description__TextAssignment_2 ) )
            {
            // InternalGAME.g:2938:1: ( ( rule__Description__TextAssignment_2 ) )
            // InternalGAME.g:2939:2: ( rule__Description__TextAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 
            // InternalGAME.g:2940:2: ( rule__Description__TextAssignment_2 )
            // InternalGAME.g:2940:3: rule__Description__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Description__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Description__Group__3"
    // InternalGAME.g:2948:1: rule__Description__Group__3 : rule__Description__Group__3__Impl ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2952:1: ( rule__Description__Group__3__Impl )
            // InternalGAME.g:2953:2: rule__Description__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3"


    // $ANTLR start "rule__Description__Group__3__Impl"
    // InternalGAME.g:2959:1: rule__Description__Group__3__Impl : ( '}' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2963:1: ( ( '}' ) )
            // InternalGAME.g:2964:1: ( '}' )
            {
            // InternalGAME.g:2964:1: ( '}' )
            // InternalGAME.g:2965:2: '}'
            {
             before(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGAME.g:2975:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2979:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGAME.g:2980:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGAME.g:2987:1: rule__Condition__Group__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2991:1: ( ( 'condition' ) )
            // InternalGAME.g:2992:1: ( 'condition' )
            {
            // InternalGAME.g:2992:1: ( 'condition' )
            // InternalGAME.g:2993:2: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGAME.g:3002:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3006:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGAME.g:3007:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGAME.g:3014:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3018:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalGAME.g:3019:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalGAME.g:3019:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalGAME.g:3020:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalGAME.g:3021:2: ( rule__Condition__NameAssignment_1 )
            // InternalGAME.g:3021:3: rule__Condition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGAME.g:3029:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3033:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalGAME.g:3034:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGAME.g:3041:1: rule__Condition__Group__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3045:1: ( ( '{' ) )
            // InternalGAME.g:3046:1: ( '{' )
            {
            // InternalGAME.g:3046:1: ( '{' )
            // InternalGAME.g:3047:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalGAME.g:3056:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3060:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalGAME.g:3061:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalGAME.g:3068:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3072:1: ( ( ( rule__Condition__Group_3__0 )? ) )
            // InternalGAME.g:3073:1: ( ( rule__Condition__Group_3__0 )? )
            {
            // InternalGAME.g:3073:1: ( ( rule__Condition__Group_3__0 )? )
            // InternalGAME.g:3074:2: ( rule__Condition__Group_3__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_3()); 
            // InternalGAME.g:3075:2: ( rule__Condition__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==38) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalGAME.g:3075:3: rule__Condition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalGAME.g:3083:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3087:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalGAME.g:3088:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalGAME.g:3095:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__Group_4__0 )? ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3099:1: ( ( ( rule__Condition__Group_4__0 )? ) )
            // InternalGAME.g:3100:1: ( ( rule__Condition__Group_4__0 )? )
            {
            // InternalGAME.g:3100:1: ( ( rule__Condition__Group_4__0 )? )
            // InternalGAME.g:3101:2: ( rule__Condition__Group_4__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_4()); 
            // InternalGAME.g:3102:2: ( rule__Condition__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGAME.g:3102:3: rule__Condition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalGAME.g:3110:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3114:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalGAME.g:3115:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__Condition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalGAME.g:3122:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__Group_5__0 )? ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3126:1: ( ( ( rule__Condition__Group_5__0 )? ) )
            // InternalGAME.g:3127:1: ( ( rule__Condition__Group_5__0 )? )
            {
            // InternalGAME.g:3127:1: ( ( rule__Condition__Group_5__0 )? )
            // InternalGAME.g:3128:2: ( rule__Condition__Group_5__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_5()); 
            // InternalGAME.g:3129:2: ( rule__Condition__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGAME.g:3129:3: rule__Condition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__6"
    // InternalGAME.g:3137:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3141:1: ( rule__Condition__Group__6__Impl )
            // InternalGAME.g:3142:2: rule__Condition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__6"


    // $ANTLR start "rule__Condition__Group__6__Impl"
    // InternalGAME.g:3148:1: rule__Condition__Group__6__Impl : ( '}' ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3152:1: ( ( '}' ) )
            // InternalGAME.g:3153:1: ( '}' )
            {
            // InternalGAME.g:3153:1: ( '}' )
            // InternalGAME.g:3154:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__6__Impl"


    // $ANTLR start "rule__Condition__Group_3__0"
    // InternalGAME.g:3164:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
    public final void rule__Condition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3168:1: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
            // InternalGAME.g:3169:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
            {
            pushFollow(FOLLOW_40);
            rule__Condition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__0"


    // $ANTLR start "rule__Condition__Group_3__0__Impl"
    // InternalGAME.g:3176:1: rule__Condition__Group_3__0__Impl : ( 'objets' ) ;
    public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3180:1: ( ( 'objets' ) )
            // InternalGAME.g:3181:1: ( 'objets' )
            {
            // InternalGAME.g:3181:1: ( 'objets' )
            // InternalGAME.g:3182:2: 'objets'
            {
             before(grammarAccess.getConditionAccess().getObjetsKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__0__Impl"


    // $ANTLR start "rule__Condition__Group_3__1"
    // InternalGAME.g:3191:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 ;
    public final void rule__Condition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3195:1: ( rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 )
            // InternalGAME.g:3196:2: rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__1"


    // $ANTLR start "rule__Condition__Group_3__1__Impl"
    // InternalGAME.g:3203:1: rule__Condition__Group_3__1__Impl : ( 'necessaires' ) ;
    public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3207:1: ( ( 'necessaires' ) )
            // InternalGAME.g:3208:1: ( 'necessaires' )
            {
            // InternalGAME.g:3208:1: ( 'necessaires' )
            // InternalGAME.g:3209:2: 'necessaires'
            {
             before(grammarAccess.getConditionAccess().getNecessairesKeyword_3_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNecessairesKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__1__Impl"


    // $ANTLR start "rule__Condition__Group_3__2"
    // InternalGAME.g:3218:1: rule__Condition__Group_3__2 : rule__Condition__Group_3__2__Impl ;
    public final void rule__Condition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3222:1: ( rule__Condition__Group_3__2__Impl )
            // InternalGAME.g:3223:2: rule__Condition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__2"


    // $ANTLR start "rule__Condition__Group_3__2__Impl"
    // InternalGAME.g:3229:1: rule__Condition__Group_3__2__Impl : ( ( rule__Condition__ObjetsAssignment_3_2 )* ) ;
    public final void rule__Condition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3233:1: ( ( ( rule__Condition__ObjetsAssignment_3_2 )* ) )
            // InternalGAME.g:3234:1: ( ( rule__Condition__ObjetsAssignment_3_2 )* )
            {
            // InternalGAME.g:3234:1: ( ( rule__Condition__ObjetsAssignment_3_2 )* )
            // InternalGAME.g:3235:2: ( rule__Condition__ObjetsAssignment_3_2 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsAssignment_3_2()); 
            // InternalGAME.g:3236:2: ( rule__Condition__ObjetsAssignment_3_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGAME.g:3236:3: rule__Condition__ObjetsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condition__ObjetsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getObjetsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__2__Impl"


    // $ANTLR start "rule__Condition__Group_4__0"
    // InternalGAME.g:3245:1: rule__Condition__Group_4__0 : rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 ;
    public final void rule__Condition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3249:1: ( rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 )
            // InternalGAME.g:3250:2: rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__Condition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__0"


    // $ANTLR start "rule__Condition__Group_4__0__Impl"
    // InternalGAME.g:3257:1: rule__Condition__Group_4__0__Impl : ( 'objets' ) ;
    public final void rule__Condition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3261:1: ( ( 'objets' ) )
            // InternalGAME.g:3262:1: ( 'objets' )
            {
            // InternalGAME.g:3262:1: ( 'objets' )
            // InternalGAME.g:3263:2: 'objets'
            {
             before(grammarAccess.getConditionAccess().getObjetsKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__0__Impl"


    // $ANTLR start "rule__Condition__Group_4__1"
    // InternalGAME.g:3272:1: rule__Condition__Group_4__1 : rule__Condition__Group_4__1__Impl rule__Condition__Group_4__2 ;
    public final void rule__Condition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3276:1: ( rule__Condition__Group_4__1__Impl rule__Condition__Group_4__2 )
            // InternalGAME.g:3277:2: rule__Condition__Group_4__1__Impl rule__Condition__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__1"


    // $ANTLR start "rule__Condition__Group_4__1__Impl"
    // InternalGAME.g:3284:1: rule__Condition__Group_4__1__Impl : ( 'manquants' ) ;
    public final void rule__Condition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3288:1: ( ( 'manquants' ) )
            // InternalGAME.g:3289:1: ( 'manquants' )
            {
            // InternalGAME.g:3289:1: ( 'manquants' )
            // InternalGAME.g:3290:2: 'manquants'
            {
             before(grammarAccess.getConditionAccess().getManquantsKeyword_4_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getManquantsKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__1__Impl"


    // $ANTLR start "rule__Condition__Group_4__2"
    // InternalGAME.g:3299:1: rule__Condition__Group_4__2 : rule__Condition__Group_4__2__Impl ;
    public final void rule__Condition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3303:1: ( rule__Condition__Group_4__2__Impl )
            // InternalGAME.g:3304:2: rule__Condition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__2"


    // $ANTLR start "rule__Condition__Group_4__2__Impl"
    // InternalGAME.g:3310:1: rule__Condition__Group_4__2__Impl : ( ( rule__Condition__ObjetsAssignment_4_2 )* ) ;
    public final void rule__Condition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3314:1: ( ( ( rule__Condition__ObjetsAssignment_4_2 )* ) )
            // InternalGAME.g:3315:1: ( ( rule__Condition__ObjetsAssignment_4_2 )* )
            {
            // InternalGAME.g:3315:1: ( ( rule__Condition__ObjetsAssignment_4_2 )* )
            // InternalGAME.g:3316:2: ( rule__Condition__ObjetsAssignment_4_2 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsAssignment_4_2()); 
            // InternalGAME.g:3317:2: ( rule__Condition__ObjetsAssignment_4_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGAME.g:3317:3: rule__Condition__ObjetsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condition__ObjetsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getObjetsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_4__2__Impl"


    // $ANTLR start "rule__Condition__Group_5__0"
    // InternalGAME.g:3326:1: rule__Condition__Group_5__0 : rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 ;
    public final void rule__Condition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3330:1: ( rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 )
            // InternalGAME.g:3331:2: rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1
            {
            pushFollow(FOLLOW_40);
            rule__Condition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__0"


    // $ANTLR start "rule__Condition__Group_5__0__Impl"
    // InternalGAME.g:3338:1: rule__Condition__Group_5__0__Impl : ( 'connaissances' ) ;
    public final void rule__Condition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3342:1: ( ( 'connaissances' ) )
            // InternalGAME.g:3343:1: ( 'connaissances' )
            {
            // InternalGAME.g:3343:1: ( 'connaissances' )
            // InternalGAME.g:3344:2: 'connaissances'
            {
             before(grammarAccess.getConditionAccess().getConnaissancesKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissancesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__0__Impl"


    // $ANTLR start "rule__Condition__Group_5__1"
    // InternalGAME.g:3353:1: rule__Condition__Group_5__1 : rule__Condition__Group_5__1__Impl rule__Condition__Group_5__2 ;
    public final void rule__Condition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3357:1: ( rule__Condition__Group_5__1__Impl rule__Condition__Group_5__2 )
            // InternalGAME.g:3358:2: rule__Condition__Group_5__1__Impl rule__Condition__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__1"


    // $ANTLR start "rule__Condition__Group_5__1__Impl"
    // InternalGAME.g:3365:1: rule__Condition__Group_5__1__Impl : ( 'necessaires' ) ;
    public final void rule__Condition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3369:1: ( ( 'necessaires' ) )
            // InternalGAME.g:3370:1: ( 'necessaires' )
            {
            // InternalGAME.g:3370:1: ( 'necessaires' )
            // InternalGAME.g:3371:2: 'necessaires'
            {
             before(grammarAccess.getConditionAccess().getNecessairesKeyword_5_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNecessairesKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__1__Impl"


    // $ANTLR start "rule__Condition__Group_5__2"
    // InternalGAME.g:3380:1: rule__Condition__Group_5__2 : rule__Condition__Group_5__2__Impl ;
    public final void rule__Condition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3384:1: ( rule__Condition__Group_5__2__Impl )
            // InternalGAME.g:3385:2: rule__Condition__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__2"


    // $ANTLR start "rule__Condition__Group_5__2__Impl"
    // InternalGAME.g:3391:1: rule__Condition__Group_5__2__Impl : ( ( rule__Condition__ConnaissancesAssignment_5_2 )* ) ;
    public final void rule__Condition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3395:1: ( ( ( rule__Condition__ConnaissancesAssignment_5_2 )* ) )
            // InternalGAME.g:3396:1: ( ( rule__Condition__ConnaissancesAssignment_5_2 )* )
            {
            // InternalGAME.g:3396:1: ( ( rule__Condition__ConnaissancesAssignment_5_2 )* )
            // InternalGAME.g:3397:2: ( rule__Condition__ConnaissancesAssignment_5_2 )*
            {
             before(grammarAccess.getConditionAccess().getConnaissancesAssignment_5_2()); 
            // InternalGAME.g:3398:2: ( rule__Condition__ConnaissancesAssignment_5_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGAME.g:3398:3: rule__Condition__ConnaissancesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condition__ConnaissancesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getConnaissancesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__2__Impl"


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalGAME.g:3407:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3411:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGAME.g:3412:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Connaissance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__0"


    // $ANTLR start "rule__Connaissance__Group__0__Impl"
    // InternalGAME.g:3419:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3423:1: ( ( 'connaissance' ) )
            // InternalGAME.g:3424:1: ( 'connaissance' )
            {
            // InternalGAME.g:3424:1: ( 'connaissance' )
            // InternalGAME.g:3425:2: 'connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__0__Impl"


    // $ANTLR start "rule__Connaissance__Group__1"
    // InternalGAME.g:3434:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3438:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalGAME.g:3439:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Connaissance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__1"


    // $ANTLR start "rule__Connaissance__Group__1__Impl"
    // InternalGAME.g:3446:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3450:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalGAME.g:3451:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalGAME.g:3451:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalGAME.g:3452:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalGAME.g:3453:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalGAME.g:3453:3: rule__Connaissance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__1__Impl"


    // $ANTLR start "rule__Connaissance__Group__2"
    // InternalGAME.g:3461:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3465:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalGAME.g:3466:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Connaissance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__2"


    // $ANTLR start "rule__Connaissance__Group__2__Impl"
    // InternalGAME.g:3473:1: rule__Connaissance__Group__2__Impl : ( '{' ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3477:1: ( ( '{' ) )
            // InternalGAME.g:3478:1: ( '{' )
            {
            // InternalGAME.g:3478:1: ( '{' )
            // InternalGAME.g:3479:2: '{'
            {
             before(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__2__Impl"


    // $ANTLR start "rule__Connaissance__Group__3"
    // InternalGAME.g:3488:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3492:1: ( rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 )
            // InternalGAME.g:3493:2: rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Connaissance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__3"


    // $ANTLR start "rule__Connaissance__Group__3__Impl"
    // InternalGAME.g:3500:1: rule__Connaissance__Group__3__Impl : ( ( rule__Connaissance__DescriptionsAssignment_3 )? ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3504:1: ( ( ( rule__Connaissance__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:3505:1: ( ( rule__Connaissance__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:3505:1: ( ( rule__Connaissance__DescriptionsAssignment_3 )? )
            // InternalGAME.g:3506:2: ( rule__Connaissance__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getConnaissanceAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:3507:2: ( rule__Connaissance__DescriptionsAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGAME.g:3507:3: rule__Connaissance__DescriptionsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__DescriptionsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__3__Impl"


    // $ANTLR start "rule__Connaissance__Group__4"
    // InternalGAME.g:3515:1: rule__Connaissance__Group__4 : rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 ;
    public final void rule__Connaissance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3519:1: ( rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 )
            // InternalGAME.g:3520:2: rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Connaissance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__4"


    // $ANTLR start "rule__Connaissance__Group__4__Impl"
    // InternalGAME.g:3527:1: rule__Connaissance__Group__4__Impl : ( ( rule__Connaissance__VisibiliteAssignment_4 ) ) ;
    public final void rule__Connaissance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3531:1: ( ( ( rule__Connaissance__VisibiliteAssignment_4 ) ) )
            // InternalGAME.g:3532:1: ( ( rule__Connaissance__VisibiliteAssignment_4 ) )
            {
            // InternalGAME.g:3532:1: ( ( rule__Connaissance__VisibiliteAssignment_4 ) )
            // InternalGAME.g:3533:2: ( rule__Connaissance__VisibiliteAssignment_4 )
            {
             before(grammarAccess.getConnaissanceAccess().getVisibiliteAssignment_4()); 
            // InternalGAME.g:3534:2: ( rule__Connaissance__VisibiliteAssignment_4 )
            // InternalGAME.g:3534:3: rule__Connaissance__VisibiliteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__VisibiliteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getVisibiliteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__4__Impl"


    // $ANTLR start "rule__Connaissance__Group__5"
    // InternalGAME.g:3542:1: rule__Connaissance__Group__5 : rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 ;
    public final void rule__Connaissance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3546:1: ( rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 )
            // InternalGAME.g:3547:2: rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Connaissance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__5"


    // $ANTLR start "rule__Connaissance__Group__5__Impl"
    // InternalGAME.g:3554:1: rule__Connaissance__Group__5__Impl : ( ( rule__Connaissance__Group_5__0 )? ) ;
    public final void rule__Connaissance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3558:1: ( ( ( rule__Connaissance__Group_5__0 )? ) )
            // InternalGAME.g:3559:1: ( ( rule__Connaissance__Group_5__0 )? )
            {
            // InternalGAME.g:3559:1: ( ( rule__Connaissance__Group_5__0 )? )
            // InternalGAME.g:3560:2: ( rule__Connaissance__Group_5__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_5()); 
            // InternalGAME.g:3561:2: ( rule__Connaissance__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGAME.g:3561:3: rule__Connaissance__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connaissance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnaissanceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__5__Impl"


    // $ANTLR start "rule__Connaissance__Group__6"
    // InternalGAME.g:3569:1: rule__Connaissance__Group__6 : rule__Connaissance__Group__6__Impl ;
    public final void rule__Connaissance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3573:1: ( rule__Connaissance__Group__6__Impl )
            // InternalGAME.g:3574:2: rule__Connaissance__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__6"


    // $ANTLR start "rule__Connaissance__Group__6__Impl"
    // InternalGAME.g:3580:1: rule__Connaissance__Group__6__Impl : ( '}' ) ;
    public final void rule__Connaissance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3584:1: ( ( '}' ) )
            // InternalGAME.g:3585:1: ( '}' )
            {
            // InternalGAME.g:3585:1: ( '}' )
            // InternalGAME.g:3586:2: '}'
            {
             before(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group__6__Impl"


    // $ANTLR start "rule__Connaissance__Group_5__0"
    // InternalGAME.g:3596:1: rule__Connaissance__Group_5__0 : rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1 ;
    public final void rule__Connaissance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3600:1: ( rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1 )
            // InternalGAME.g:3601:2: rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__Connaissance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__0"


    // $ANTLR start "rule__Connaissance__Group_5__0__Impl"
    // InternalGAME.g:3608:1: rule__Connaissance__Group_5__0__Impl : ( 'si' ) ;
    public final void rule__Connaissance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3612:1: ( ( 'si' ) )
            // InternalGAME.g:3613:1: ( 'si' )
            {
            // InternalGAME.g:3613:1: ( 'si' )
            // InternalGAME.g:3614:2: 'si'
            {
             before(grammarAccess.getConnaissanceAccess().getSiKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getSiKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__0__Impl"


    // $ANTLR start "rule__Connaissance__Group_5__1"
    // InternalGAME.g:3623:1: rule__Connaissance__Group_5__1 : rule__Connaissance__Group_5__1__Impl ;
    public final void rule__Connaissance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3627:1: ( rule__Connaissance__Group_5__1__Impl )
            // InternalGAME.g:3628:2: rule__Connaissance__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__1"


    // $ANTLR start "rule__Connaissance__Group_5__1__Impl"
    // InternalGAME.g:3634:1: rule__Connaissance__Group_5__1__Impl : ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) ) ;
    public final void rule__Connaissance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3638:1: ( ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) ) )
            // InternalGAME.g:3639:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) )
            {
            // InternalGAME.g:3639:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) )
            // InternalGAME.g:3640:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteAssignment_5_1()); 
            // InternalGAME.g:3641:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 )
            // InternalGAME.g:3641:3: rule__Connaissance__ConditionsVisibiliteAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__ConditionsVisibiliteAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__Group_5__1__Impl"


    // $ANTLR start "rule__Explorateur__Group__0"
    // InternalGAME.g:3650:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3654:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGAME.g:3655:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Explorateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__0"


    // $ANTLR start "rule__Explorateur__Group__0__Impl"
    // InternalGAME.g:3662:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3666:1: ( ( 'explorateur' ) )
            // InternalGAME.g:3667:1: ( 'explorateur' )
            {
            // InternalGAME.g:3667:1: ( 'explorateur' )
            // InternalGAME.g:3668:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__0__Impl"


    // $ANTLR start "rule__Explorateur__Group__1"
    // InternalGAME.g:3677:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3681:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGAME.g:3682:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Explorateur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__1"


    // $ANTLR start "rule__Explorateur__Group__1__Impl"
    // InternalGAME.g:3689:1: rule__Explorateur__Group__1__Impl : ( ( rule__Explorateur__NameAssignment_1 ) ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3693:1: ( ( ( rule__Explorateur__NameAssignment_1 ) ) )
            // InternalGAME.g:3694:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            {
            // InternalGAME.g:3694:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            // InternalGAME.g:3695:2: ( rule__Explorateur__NameAssignment_1 )
            {
             before(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 
            // InternalGAME.g:3696:2: ( rule__Explorateur__NameAssignment_1 )
            // InternalGAME.g:3696:3: rule__Explorateur__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__1__Impl"


    // $ANTLR start "rule__Explorateur__Group__2"
    // InternalGAME.g:3704:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3708:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGAME.g:3709:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Explorateur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__2"


    // $ANTLR start "rule__Explorateur__Group__2__Impl"
    // InternalGAME.g:3716:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3720:1: ( ( '{' ) )
            // InternalGAME.g:3721:1: ( '{' )
            {
            // InternalGAME.g:3721:1: ( '{' )
            // InternalGAME.g:3722:2: '{'
            {
             before(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__2__Impl"


    // $ANTLR start "rule__Explorateur__Group__3"
    // InternalGAME.g:3731:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3735:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGAME.g:3736:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Explorateur__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__3"


    // $ANTLR start "rule__Explorateur__Group__3__Impl"
    // InternalGAME.g:3743:1: rule__Explorateur__Group__3__Impl : ( 'taille' ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3747:1: ( ( 'taille' ) )
            // InternalGAME.g:3748:1: ( 'taille' )
            {
            // InternalGAME.g:3748:1: ( 'taille' )
            // InternalGAME.g:3749:2: 'taille'
            {
             before(grammarAccess.getExplorateurAccess().getTailleKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getTailleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__3__Impl"


    // $ANTLR start "rule__Explorateur__Group__4"
    // InternalGAME.g:3758:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3762:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGAME.g:3763:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__Explorateur__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__4"


    // $ANTLR start "rule__Explorateur__Group__4__Impl"
    // InternalGAME.g:3770:1: rule__Explorateur__Group__4__Impl : ( ( rule__Explorateur__TailleAssignment_4 ) ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3774:1: ( ( ( rule__Explorateur__TailleAssignment_4 ) ) )
            // InternalGAME.g:3775:1: ( ( rule__Explorateur__TailleAssignment_4 ) )
            {
            // InternalGAME.g:3775:1: ( ( rule__Explorateur__TailleAssignment_4 ) )
            // InternalGAME.g:3776:2: ( rule__Explorateur__TailleAssignment_4 )
            {
             before(grammarAccess.getExplorateurAccess().getTailleAssignment_4()); 
            // InternalGAME.g:3777:2: ( rule__Explorateur__TailleAssignment_4 )
            // InternalGAME.g:3777:3: rule__Explorateur__TailleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__TailleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getTailleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__4__Impl"


    // $ANTLR start "rule__Explorateur__Group__5"
    // InternalGAME.g:3785:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3789:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGAME.g:3790:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__Explorateur__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__5"


    // $ANTLR start "rule__Explorateur__Group__5__Impl"
    // InternalGAME.g:3797:1: rule__Explorateur__Group__5__Impl : ( 'inventaireO' ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3801:1: ( ( 'inventaireO' ) )
            // InternalGAME.g:3802:1: ( 'inventaireO' )
            {
            // InternalGAME.g:3802:1: ( 'inventaireO' )
            // InternalGAME.g:3803:2: 'inventaireO'
            {
             before(grammarAccess.getExplorateurAccess().getInventaireOKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getInventaireOKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__5__Impl"


    // $ANTLR start "rule__Explorateur__Group__6"
    // InternalGAME.g:3812:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3816:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGAME.g:3817:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__Explorateur__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__6"


    // $ANTLR start "rule__Explorateur__Group__6__Impl"
    // InternalGAME.g:3824:1: rule__Explorateur__Group__6__Impl : ( ( rule__Explorateur__ObjetsAssignment_6 )* ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3828:1: ( ( ( rule__Explorateur__ObjetsAssignment_6 )* ) )
            // InternalGAME.g:3829:1: ( ( rule__Explorateur__ObjetsAssignment_6 )* )
            {
            // InternalGAME.g:3829:1: ( ( rule__Explorateur__ObjetsAssignment_6 )* )
            // InternalGAME.g:3830:2: ( rule__Explorateur__ObjetsAssignment_6 )*
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_6()); 
            // InternalGAME.g:3831:2: ( rule__Explorateur__ObjetsAssignment_6 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGAME.g:3831:3: rule__Explorateur__ObjetsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Explorateur__ObjetsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getObjetsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__6__Impl"


    // $ANTLR start "rule__Explorateur__Group__7"
    // InternalGAME.g:3839:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3843:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGAME.g:3844:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
            {
            pushFollow(FOLLOW_46);
            rule__Explorateur__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__7"


    // $ANTLR start "rule__Explorateur__Group__7__Impl"
    // InternalGAME.g:3851:1: rule__Explorateur__Group__7__Impl : ( 'inventaireC' ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3855:1: ( ( 'inventaireC' ) )
            // InternalGAME.g:3856:1: ( 'inventaireC' )
            {
            // InternalGAME.g:3856:1: ( 'inventaireC' )
            // InternalGAME.g:3857:2: 'inventaireC'
            {
             before(grammarAccess.getExplorateurAccess().getInventaireCKeyword_7()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getInventaireCKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__7__Impl"


    // $ANTLR start "rule__Explorateur__Group__8"
    // InternalGAME.g:3866:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3870:1: ( rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 )
            // InternalGAME.g:3871:2: rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9
            {
            pushFollow(FOLLOW_46);
            rule__Explorateur__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__8"


    // $ANTLR start "rule__Explorateur__Group__8__Impl"
    // InternalGAME.g:3878:1: rule__Explorateur__Group__8__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_8 )* ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3882:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_8 )* ) )
            // InternalGAME.g:3883:1: ( ( rule__Explorateur__ConnaissancesAssignment_8 )* )
            {
            // InternalGAME.g:3883:1: ( ( rule__Explorateur__ConnaissancesAssignment_8 )* )
            // InternalGAME.g:3884:2: ( rule__Explorateur__ConnaissancesAssignment_8 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8()); 
            // InternalGAME.g:3885:2: ( rule__Explorateur__ConnaissancesAssignment_8 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGAME.g:3885:3: rule__Explorateur__ConnaissancesAssignment_8
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Explorateur__ConnaissancesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__8__Impl"


    // $ANTLR start "rule__Explorateur__Group__9"
    // InternalGAME.g:3893:1: rule__Explorateur__Group__9 : rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 ;
    public final void rule__Explorateur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3897:1: ( rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 )
            // InternalGAME.g:3898:2: rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Explorateur__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__9"


    // $ANTLR start "rule__Explorateur__Group__9__Impl"
    // InternalGAME.g:3905:1: rule__Explorateur__Group__9__Impl : ( 'localisation' ) ;
    public final void rule__Explorateur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3909:1: ( ( 'localisation' ) )
            // InternalGAME.g:3910:1: ( 'localisation' )
            {
            // InternalGAME.g:3910:1: ( 'localisation' )
            // InternalGAME.g:3911:2: 'localisation'
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLocalisationKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__9__Impl"


    // $ANTLR start "rule__Explorateur__Group__10"
    // InternalGAME.g:3920:1: rule__Explorateur__Group__10 : rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 ;
    public final void rule__Explorateur__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3924:1: ( rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 )
            // InternalGAME.g:3925:2: rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__Explorateur__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__10"


    // $ANTLR start "rule__Explorateur__Group__10__Impl"
    // InternalGAME.g:3932:1: rule__Explorateur__Group__10__Impl : ( ( rule__Explorateur__LocalisationAssignment_10 ) ) ;
    public final void rule__Explorateur__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3936:1: ( ( ( rule__Explorateur__LocalisationAssignment_10 ) ) )
            // InternalGAME.g:3937:1: ( ( rule__Explorateur__LocalisationAssignment_10 ) )
            {
            // InternalGAME.g:3937:1: ( ( rule__Explorateur__LocalisationAssignment_10 ) )
            // InternalGAME.g:3938:2: ( rule__Explorateur__LocalisationAssignment_10 )
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationAssignment_10()); 
            // InternalGAME.g:3939:2: ( rule__Explorateur__LocalisationAssignment_10 )
            // InternalGAME.g:3939:3: rule__Explorateur__LocalisationAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__LocalisationAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getExplorateurAccess().getLocalisationAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__10__Impl"


    // $ANTLR start "rule__Explorateur__Group__11"
    // InternalGAME.g:3947:1: rule__Explorateur__Group__11 : rule__Explorateur__Group__11__Impl ;
    public final void rule__Explorateur__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3951:1: ( rule__Explorateur__Group__11__Impl )
            // InternalGAME.g:3952:2: rule__Explorateur__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Explorateur__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__11"


    // $ANTLR start "rule__Explorateur__Group__11__Impl"
    // InternalGAME.g:3958:1: rule__Explorateur__Group__11__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3962:1: ( ( '}' ) )
            // InternalGAME.g:3963:1: ( '}' )
            {
            // InternalGAME.g:3963:1: ( '}' )
            // InternalGAME.g:3964:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__Group__11__Impl"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__0"
    // InternalGAME.g:3974:1: rule__ObjetAvecQuantite__Group__0 : rule__ObjetAvecQuantite__Group__0__Impl rule__ObjetAvecQuantite__Group__1 ;
    public final void rule__ObjetAvecQuantite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3978:1: ( rule__ObjetAvecQuantite__Group__0__Impl rule__ObjetAvecQuantite__Group__1 )
            // InternalGAME.g:3979:2: rule__ObjetAvecQuantite__Group__0__Impl rule__ObjetAvecQuantite__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjetAvecQuantite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__0"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__0__Impl"
    // InternalGAME.g:3986:1: rule__ObjetAvecQuantite__Group__0__Impl : ( 'objetavecquantite' ) ;
    public final void rule__ObjetAvecQuantite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3990:1: ( ( 'objetavecquantite' ) )
            // InternalGAME.g:3991:1: ( 'objetavecquantite' )
            {
            // InternalGAME.g:3991:1: ( 'objetavecquantite' )
            // InternalGAME.g:3992:2: 'objetavecquantite'
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getObjetavecquantiteKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObjetAvecQuantiteAccess().getObjetavecquantiteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__0__Impl"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__1"
    // InternalGAME.g:4001:1: rule__ObjetAvecQuantite__Group__1 : rule__ObjetAvecQuantite__Group__1__Impl rule__ObjetAvecQuantite__Group__2 ;
    public final void rule__ObjetAvecQuantite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4005:1: ( rule__ObjetAvecQuantite__Group__1__Impl rule__ObjetAvecQuantite__Group__2 )
            // InternalGAME.g:4006:2: rule__ObjetAvecQuantite__Group__1__Impl rule__ObjetAvecQuantite__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ObjetAvecQuantite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__1"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__1__Impl"
    // InternalGAME.g:4013:1: rule__ObjetAvecQuantite__Group__1__Impl : ( ( rule__ObjetAvecQuantite__NameAssignment_1 ) ) ;
    public final void rule__ObjetAvecQuantite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4017:1: ( ( ( rule__ObjetAvecQuantite__NameAssignment_1 ) ) )
            // InternalGAME.g:4018:1: ( ( rule__ObjetAvecQuantite__NameAssignment_1 ) )
            {
            // InternalGAME.g:4018:1: ( ( rule__ObjetAvecQuantite__NameAssignment_1 ) )
            // InternalGAME.g:4019:2: ( rule__ObjetAvecQuantite__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getNameAssignment_1()); 
            // InternalGAME.g:4020:2: ( rule__ObjetAvecQuantite__NameAssignment_1 )
            // InternalGAME.g:4020:3: rule__ObjetAvecQuantite__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAvecQuantiteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__1__Impl"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__2"
    // InternalGAME.g:4028:1: rule__ObjetAvecQuantite__Group__2 : rule__ObjetAvecQuantite__Group__2__Impl rule__ObjetAvecQuantite__Group__3 ;
    public final void rule__ObjetAvecQuantite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4032:1: ( rule__ObjetAvecQuantite__Group__2__Impl rule__ObjetAvecQuantite__Group__3 )
            // InternalGAME.g:4033:2: rule__ObjetAvecQuantite__Group__2__Impl rule__ObjetAvecQuantite__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ObjetAvecQuantite__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__2"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__2__Impl"
    // InternalGAME.g:4040:1: rule__ObjetAvecQuantite__Group__2__Impl : ( '{' ) ;
    public final void rule__ObjetAvecQuantite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4044:1: ( ( '{' ) )
            // InternalGAME.g:4045:1: ( '{' )
            {
            // InternalGAME.g:4045:1: ( '{' )
            // InternalGAME.g:4046:2: '{'
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjetAvecQuantiteAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__2__Impl"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__3"
    // InternalGAME.g:4055:1: rule__ObjetAvecQuantite__Group__3 : rule__ObjetAvecQuantite__Group__3__Impl rule__ObjetAvecQuantite__Group__4 ;
    public final void rule__ObjetAvecQuantite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4059:1: ( rule__ObjetAvecQuantite__Group__3__Impl rule__ObjetAvecQuantite__Group__4 )
            // InternalGAME.g:4060:2: rule__ObjetAvecQuantite__Group__3__Impl rule__ObjetAvecQuantite__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__ObjetAvecQuantite__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__3"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__3__Impl"
    // InternalGAME.g:4067:1: rule__ObjetAvecQuantite__Group__3__Impl : ( ( rule__ObjetAvecQuantite__ObjetAssignment_3 ) ) ;
    public final void rule__ObjetAvecQuantite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4071:1: ( ( ( rule__ObjetAvecQuantite__ObjetAssignment_3 ) ) )
            // InternalGAME.g:4072:1: ( ( rule__ObjetAvecQuantite__ObjetAssignment_3 ) )
            {
            // InternalGAME.g:4072:1: ( ( rule__ObjetAvecQuantite__ObjetAssignment_3 ) )
            // InternalGAME.g:4073:2: ( rule__ObjetAvecQuantite__ObjetAssignment_3 )
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getObjetAssignment_3()); 
            // InternalGAME.g:4074:2: ( rule__ObjetAvecQuantite__ObjetAssignment_3 )
            // InternalGAME.g:4074:3: rule__ObjetAvecQuantite__ObjetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__ObjetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjetAvecQuantiteAccess().getObjetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__3__Impl"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__4"
    // InternalGAME.g:4082:1: rule__ObjetAvecQuantite__Group__4 : rule__ObjetAvecQuantite__Group__4__Impl rule__ObjetAvecQuantite__Group__5 ;
    public final void rule__ObjetAvecQuantite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4086:1: ( rule__ObjetAvecQuantite__Group__4__Impl rule__ObjetAvecQuantite__Group__5 )
            // InternalGAME.g:4087:2: rule__ObjetAvecQuantite__Group__4__Impl rule__ObjetAvecQuantite__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__ObjetAvecQuantite__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__4"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__4__Impl"
    // InternalGAME.g:4094:1: rule__ObjetAvecQuantite__Group__4__Impl : ( ',' ) ;
    public final void rule__ObjetAvecQuantite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4098:1: ( ( ',' ) )
            // InternalGAME.g:4099:1: ( ',' )
            {
            // InternalGAME.g:4099:1: ( ',' )
            // InternalGAME.g:4100:2: ','
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getCommaKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getObjetAvecQuantiteAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__4__Impl"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__5"
    // InternalGAME.g:4109:1: rule__ObjetAvecQuantite__Group__5 : rule__ObjetAvecQuantite__Group__5__Impl rule__ObjetAvecQuantite__Group__6 ;
    public final void rule__ObjetAvecQuantite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4113:1: ( rule__ObjetAvecQuantite__Group__5__Impl rule__ObjetAvecQuantite__Group__6 )
            // InternalGAME.g:4114:2: rule__ObjetAvecQuantite__Group__5__Impl rule__ObjetAvecQuantite__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__ObjetAvecQuantite__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__5"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__5__Impl"
    // InternalGAME.g:4121:1: rule__ObjetAvecQuantite__Group__5__Impl : ( ( rule__ObjetAvecQuantite__QuantiteAssignment_5 ) ) ;
    public final void rule__ObjetAvecQuantite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4125:1: ( ( ( rule__ObjetAvecQuantite__QuantiteAssignment_5 ) ) )
            // InternalGAME.g:4126:1: ( ( rule__ObjetAvecQuantite__QuantiteAssignment_5 ) )
            {
            // InternalGAME.g:4126:1: ( ( rule__ObjetAvecQuantite__QuantiteAssignment_5 ) )
            // InternalGAME.g:4127:2: ( rule__ObjetAvecQuantite__QuantiteAssignment_5 )
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getQuantiteAssignment_5()); 
            // InternalGAME.g:4128:2: ( rule__ObjetAvecQuantite__QuantiteAssignment_5 )
            // InternalGAME.g:4128:3: rule__ObjetAvecQuantite__QuantiteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__QuantiteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getObjetAvecQuantiteAccess().getQuantiteAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__5__Impl"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__6"
    // InternalGAME.g:4136:1: rule__ObjetAvecQuantite__Group__6 : rule__ObjetAvecQuantite__Group__6__Impl ;
    public final void rule__ObjetAvecQuantite__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4140:1: ( rule__ObjetAvecQuantite__Group__6__Impl )
            // InternalGAME.g:4141:2: rule__ObjetAvecQuantite__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjetAvecQuantite__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__6"


    // $ANTLR start "rule__ObjetAvecQuantite__Group__6__Impl"
    // InternalGAME.g:4147:1: rule__ObjetAvecQuantite__Group__6__Impl : ( '}' ) ;
    public final void rule__ObjetAvecQuantite__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4151:1: ( ( '}' ) )
            // InternalGAME.g:4152:1: ( '}' )
            {
            // InternalGAME.g:4152:1: ( '}' )
            // InternalGAME.g:4153:2: '}'
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObjetAvecQuantiteAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__Group__6__Impl"


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGAME.g:4163:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4167:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGAME.g:4168:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__0"


    // $ANTLR start "rule__Lieu__Group__0__Impl"
    // InternalGAME.g:4175:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4179:1: ( ( 'lieu' ) )
            // InternalGAME.g:4180:1: ( 'lieu' )
            {
            // InternalGAME.g:4180:1: ( 'lieu' )
            // InternalGAME.g:4181:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLieuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__0__Impl"


    // $ANTLR start "rule__Lieu__Group__1"
    // InternalGAME.g:4190:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4194:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGAME.g:4195:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Lieu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__1"


    // $ANTLR start "rule__Lieu__Group__1__Impl"
    // InternalGAME.g:4202:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4206:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGAME.g:4207:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGAME.g:4207:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGAME.g:4208:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGAME.g:4209:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGAME.g:4209:3: rule__Lieu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__1__Impl"


    // $ANTLR start "rule__Lieu__Group__2"
    // InternalGAME.g:4217:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4221:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGAME.g:4222:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Lieu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__2"


    // $ANTLR start "rule__Lieu__Group__2__Impl"
    // InternalGAME.g:4229:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4233:1: ( ( '{' ) )
            // InternalGAME.g:4234:1: ( '{' )
            {
            // InternalGAME.g:4234:1: ( '{' )
            // InternalGAME.g:4235:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__2__Impl"


    // $ANTLR start "rule__Lieu__Group__3"
    // InternalGAME.g:4244:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4248:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGAME.g:4249:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Lieu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__3"


    // $ANTLR start "rule__Lieu__Group__3__Impl"
    // InternalGAME.g:4256:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__DescriptionsAssignment_3 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4260:1: ( ( ( rule__Lieu__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:4261:1: ( ( rule__Lieu__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:4261:1: ( ( rule__Lieu__DescriptionsAssignment_3 )? )
            // InternalGAME.g:4262:2: ( rule__Lieu__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getLieuAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:4263:2: ( rule__Lieu__DescriptionsAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGAME.g:4263:3: rule__Lieu__DescriptionsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__DescriptionsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__3__Impl"


    // $ANTLR start "rule__Lieu__Group__4"
    // InternalGAME.g:4271:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl rule__Lieu__Group__5 ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4275:1: ( rule__Lieu__Group__4__Impl rule__Lieu__Group__5 )
            // InternalGAME.g:4276:2: rule__Lieu__Group__4__Impl rule__Lieu__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__Lieu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__4"


    // $ANTLR start "rule__Lieu__Group__4__Impl"
    // InternalGAME.g:4283:1: rule__Lieu__Group__4__Impl : ( ( rule__Lieu__Group_4__0 )* ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4287:1: ( ( ( rule__Lieu__Group_4__0 )* ) )
            // InternalGAME.g:4288:1: ( ( rule__Lieu__Group_4__0 )* )
            {
            // InternalGAME.g:4288:1: ( ( rule__Lieu__Group_4__0 )* )
            // InternalGAME.g:4289:2: ( rule__Lieu__Group_4__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_4()); 
            // InternalGAME.g:4290:2: ( rule__Lieu__Group_4__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGAME.g:4290:3: rule__Lieu__Group_4__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Lieu__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__4__Impl"


    // $ANTLR start "rule__Lieu__Group__5"
    // InternalGAME.g:4298:1: rule__Lieu__Group__5 : rule__Lieu__Group__5__Impl rule__Lieu__Group__6 ;
    public final void rule__Lieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4302:1: ( rule__Lieu__Group__5__Impl rule__Lieu__Group__6 )
            // InternalGAME.g:4303:2: rule__Lieu__Group__5__Impl rule__Lieu__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__Lieu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__5"


    // $ANTLR start "rule__Lieu__Group__5__Impl"
    // InternalGAME.g:4310:1: rule__Lieu__Group__5__Impl : ( ( rule__Lieu__Group_5__0 )* ) ;
    public final void rule__Lieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4314:1: ( ( ( rule__Lieu__Group_5__0 )* ) )
            // InternalGAME.g:4315:1: ( ( rule__Lieu__Group_5__0 )* )
            {
            // InternalGAME.g:4315:1: ( ( rule__Lieu__Group_5__0 )* )
            // InternalGAME.g:4316:2: ( rule__Lieu__Group_5__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_5()); 
            // InternalGAME.g:4317:2: ( rule__Lieu__Group_5__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==40) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGAME.g:4317:3: rule__Lieu__Group_5__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Lieu__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__5__Impl"


    // $ANTLR start "rule__Lieu__Group__6"
    // InternalGAME.g:4325:1: rule__Lieu__Group__6 : rule__Lieu__Group__6__Impl rule__Lieu__Group__7 ;
    public final void rule__Lieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4329:1: ( rule__Lieu__Group__6__Impl rule__Lieu__Group__7 )
            // InternalGAME.g:4330:2: rule__Lieu__Group__6__Impl rule__Lieu__Group__7
            {
            pushFollow(FOLLOW_48);
            rule__Lieu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__6"


    // $ANTLR start "rule__Lieu__Group__6__Impl"
    // InternalGAME.g:4337:1: rule__Lieu__Group__6__Impl : ( ( rule__Lieu__Group_6__0 )* ) ;
    public final void rule__Lieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4341:1: ( ( ( rule__Lieu__Group_6__0 )* ) )
            // InternalGAME.g:4342:1: ( ( rule__Lieu__Group_6__0 )* )
            {
            // InternalGAME.g:4342:1: ( ( rule__Lieu__Group_6__0 )* )
            // InternalGAME.g:4343:2: ( rule__Lieu__Group_6__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_6()); 
            // InternalGAME.g:4344:2: ( rule__Lieu__Group_6__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==50) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGAME.g:4344:3: rule__Lieu__Group_6__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Lieu__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__6__Impl"


    // $ANTLR start "rule__Lieu__Group__7"
    // InternalGAME.g:4352:1: rule__Lieu__Group__7 : rule__Lieu__Group__7__Impl rule__Lieu__Group__8 ;
    public final void rule__Lieu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4356:1: ( rule__Lieu__Group__7__Impl rule__Lieu__Group__8 )
            // InternalGAME.g:4357:2: rule__Lieu__Group__7__Impl rule__Lieu__Group__8
            {
            pushFollow(FOLLOW_48);
            rule__Lieu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__7"


    // $ANTLR start "rule__Lieu__Group__7__Impl"
    // InternalGAME.g:4364:1: rule__Lieu__Group__7__Impl : ( ( rule__Lieu__Group_7__0 )? ) ;
    public final void rule__Lieu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4368:1: ( ( ( rule__Lieu__Group_7__0 )? ) )
            // InternalGAME.g:4369:1: ( ( rule__Lieu__Group_7__0 )? )
            {
            // InternalGAME.g:4369:1: ( ( rule__Lieu__Group_7__0 )? )
            // InternalGAME.g:4370:2: ( rule__Lieu__Group_7__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_7()); 
            // InternalGAME.g:4371:2: ( rule__Lieu__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGAME.g:4371:3: rule__Lieu__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__7__Impl"


    // $ANTLR start "rule__Lieu__Group__8"
    // InternalGAME.g:4379:1: rule__Lieu__Group__8 : rule__Lieu__Group__8__Impl ;
    public final void rule__Lieu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4383:1: ( rule__Lieu__Group__8__Impl )
            // InternalGAME.g:4384:2: rule__Lieu__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__8"


    // $ANTLR start "rule__Lieu__Group__8__Impl"
    // InternalGAME.g:4390:1: rule__Lieu__Group__8__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4394:1: ( ( '}' ) )
            // InternalGAME.g:4395:1: ( '}' )
            {
            // InternalGAME.g:4395:1: ( '}' )
            // InternalGAME.g:4396:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group__8__Impl"


    // $ANTLR start "rule__Lieu__Group_4__0"
    // InternalGAME.g:4406:1: rule__Lieu__Group_4__0 : rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1 ;
    public final void rule__Lieu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4410:1: ( rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1 )
            // InternalGAME.g:4411:2: rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1
            {
            pushFollow(FOLLOW_52);
            rule__Lieu__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_4__0"


    // $ANTLR start "rule__Lieu__Group_4__0__Impl"
    // InternalGAME.g:4418:1: rule__Lieu__Group_4__0__Impl : ( 'objets' ) ;
    public final void rule__Lieu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4422:1: ( ( 'objets' ) )
            // InternalGAME.g:4423:1: ( 'objets' )
            {
            // InternalGAME.g:4423:1: ( 'objets' )
            // InternalGAME.g:4424:2: 'objets'
            {
             before(grammarAccess.getLieuAccess().getObjetsKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getObjetsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_4__0__Impl"


    // $ANTLR start "rule__Lieu__Group_4__1"
    // InternalGAME.g:4433:1: rule__Lieu__Group_4__1 : rule__Lieu__Group_4__1__Impl rule__Lieu__Group_4__2 ;
    public final void rule__Lieu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4437:1: ( rule__Lieu__Group_4__1__Impl rule__Lieu__Group_4__2 )
            // InternalGAME.g:4438:2: rule__Lieu__Group_4__1__Impl rule__Lieu__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_4__1"


    // $ANTLR start "rule__Lieu__Group_4__1__Impl"
    // InternalGAME.g:4445:1: rule__Lieu__Group_4__1__Impl : ( 'trouvables' ) ;
    public final void rule__Lieu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4449:1: ( ( 'trouvables' ) )
            // InternalGAME.g:4450:1: ( 'trouvables' )
            {
            // InternalGAME.g:4450:1: ( 'trouvables' )
            // InternalGAME.g:4451:2: 'trouvables'
            {
             before(grammarAccess.getLieuAccess().getTrouvablesKeyword_4_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getTrouvablesKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_4__1__Impl"


    // $ANTLR start "rule__Lieu__Group_4__2"
    // InternalGAME.g:4460:1: rule__Lieu__Group_4__2 : rule__Lieu__Group_4__2__Impl ;
    public final void rule__Lieu__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4464:1: ( rule__Lieu__Group_4__2__Impl )
            // InternalGAME.g:4465:2: rule__Lieu__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_4__2"


    // $ANTLR start "rule__Lieu__Group_4__2__Impl"
    // InternalGAME.g:4471:1: rule__Lieu__Group_4__2__Impl : ( ( rule__Lieu__ObjetsAssignment_4_2 ) ) ;
    public final void rule__Lieu__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4475:1: ( ( ( rule__Lieu__ObjetsAssignment_4_2 ) ) )
            // InternalGAME.g:4476:1: ( ( rule__Lieu__ObjetsAssignment_4_2 ) )
            {
            // InternalGAME.g:4476:1: ( ( rule__Lieu__ObjetsAssignment_4_2 ) )
            // InternalGAME.g:4477:2: ( rule__Lieu__ObjetsAssignment_4_2 )
            {
             before(grammarAccess.getLieuAccess().getObjetsAssignment_4_2()); 
            // InternalGAME.g:4478:2: ( rule__Lieu__ObjetsAssignment_4_2 )
            // InternalGAME.g:4478:3: rule__Lieu__ObjetsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ObjetsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getObjetsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_4__2__Impl"


    // $ANTLR start "rule__Lieu__Group_5__0"
    // InternalGAME.g:4487:1: rule__Lieu__Group_5__0 : rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1 ;
    public final void rule__Lieu__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4491:1: ( rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1 )
            // InternalGAME.g:4492:2: rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1
            {
            pushFollow(FOLLOW_53);
            rule__Lieu__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_5__0"


    // $ANTLR start "rule__Lieu__Group_5__0__Impl"
    // InternalGAME.g:4499:1: rule__Lieu__Group_5__0__Impl : ( 'connaissances' ) ;
    public final void rule__Lieu__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4503:1: ( ( 'connaissances' ) )
            // InternalGAME.g:4504:1: ( 'connaissances' )
            {
            // InternalGAME.g:4504:1: ( 'connaissances' )
            // InternalGAME.g:4505:2: 'connaissances'
            {
             before(grammarAccess.getLieuAccess().getConnaissancesKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getConnaissancesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_5__0__Impl"


    // $ANTLR start "rule__Lieu__Group_5__1"
    // InternalGAME.g:4514:1: rule__Lieu__Group_5__1 : rule__Lieu__Group_5__1__Impl rule__Lieu__Group_5__2 ;
    public final void rule__Lieu__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4518:1: ( rule__Lieu__Group_5__1__Impl rule__Lieu__Group_5__2 )
            // InternalGAME.g:4519:2: rule__Lieu__Group_5__1__Impl rule__Lieu__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_5__1"


    // $ANTLR start "rule__Lieu__Group_5__1__Impl"
    // InternalGAME.g:4526:1: rule__Lieu__Group_5__1__Impl : ( 'trouvable' ) ;
    public final void rule__Lieu__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4530:1: ( ( 'trouvable' ) )
            // InternalGAME.g:4531:1: ( 'trouvable' )
            {
            // InternalGAME.g:4531:1: ( 'trouvable' )
            // InternalGAME.g:4532:2: 'trouvable'
            {
             before(grammarAccess.getLieuAccess().getTrouvableKeyword_5_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getTrouvableKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_5__1__Impl"


    // $ANTLR start "rule__Lieu__Group_5__2"
    // InternalGAME.g:4541:1: rule__Lieu__Group_5__2 : rule__Lieu__Group_5__2__Impl ;
    public final void rule__Lieu__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4545:1: ( rule__Lieu__Group_5__2__Impl )
            // InternalGAME.g:4546:2: rule__Lieu__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_5__2"


    // $ANTLR start "rule__Lieu__Group_5__2__Impl"
    // InternalGAME.g:4552:1: rule__Lieu__Group_5__2__Impl : ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) ) ;
    public final void rule__Lieu__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4556:1: ( ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) ) )
            // InternalGAME.g:4557:1: ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) )
            {
            // InternalGAME.g:4557:1: ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) )
            // InternalGAME.g:4558:2: ( rule__Lieu__ConnaissancesAssignment_5_2 )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesAssignment_5_2()); 
            // InternalGAME.g:4559:2: ( rule__Lieu__ConnaissancesAssignment_5_2 )
            // InternalGAME.g:4559:3: rule__Lieu__ConnaissancesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ConnaissancesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getConnaissancesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_5__2__Impl"


    // $ANTLR start "rule__Lieu__Group_6__0"
    // InternalGAME.g:4568:1: rule__Lieu__Group_6__0 : rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 ;
    public final void rule__Lieu__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4572:1: ( rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 )
            // InternalGAME.g:4573:2: rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1
            {
            pushFollow(FOLLOW_53);
            rule__Lieu__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__0"


    // $ANTLR start "rule__Lieu__Group_6__0__Impl"
    // InternalGAME.g:4580:1: rule__Lieu__Group_6__0__Impl : ( 'personnes' ) ;
    public final void rule__Lieu__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4584:1: ( ( 'personnes' ) )
            // InternalGAME.g:4585:1: ( 'personnes' )
            {
            // InternalGAME.g:4585:1: ( 'personnes' )
            // InternalGAME.g:4586:2: 'personnes'
            {
             before(grammarAccess.getLieuAccess().getPersonnesKeyword_6_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__0__Impl"


    // $ANTLR start "rule__Lieu__Group_6__1"
    // InternalGAME.g:4595:1: rule__Lieu__Group_6__1 : rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2 ;
    public final void rule__Lieu__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4599:1: ( rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2 )
            // InternalGAME.g:4600:2: rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__1"


    // $ANTLR start "rule__Lieu__Group_6__1__Impl"
    // InternalGAME.g:4607:1: rule__Lieu__Group_6__1__Impl : ( 'trouvable' ) ;
    public final void rule__Lieu__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4611:1: ( ( 'trouvable' ) )
            // InternalGAME.g:4612:1: ( 'trouvable' )
            {
            // InternalGAME.g:4612:1: ( 'trouvable' )
            // InternalGAME.g:4613:2: 'trouvable'
            {
             before(grammarAccess.getLieuAccess().getTrouvableKeyword_6_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getTrouvableKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__1__Impl"


    // $ANTLR start "rule__Lieu__Group_6__2"
    // InternalGAME.g:4622:1: rule__Lieu__Group_6__2 : rule__Lieu__Group_6__2__Impl ;
    public final void rule__Lieu__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4626:1: ( rule__Lieu__Group_6__2__Impl )
            // InternalGAME.g:4627:2: rule__Lieu__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__2"


    // $ANTLR start "rule__Lieu__Group_6__2__Impl"
    // InternalGAME.g:4633:1: rule__Lieu__Group_6__2__Impl : ( ( rule__Lieu__PersonnesAssignment_6_2 ) ) ;
    public final void rule__Lieu__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4637:1: ( ( ( rule__Lieu__PersonnesAssignment_6_2 ) ) )
            // InternalGAME.g:4638:1: ( ( rule__Lieu__PersonnesAssignment_6_2 ) )
            {
            // InternalGAME.g:4638:1: ( ( rule__Lieu__PersonnesAssignment_6_2 ) )
            // InternalGAME.g:4639:2: ( rule__Lieu__PersonnesAssignment_6_2 )
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_6_2()); 
            // InternalGAME.g:4640:2: ( rule__Lieu__PersonnesAssignment_6_2 )
            // InternalGAME.g:4640:3: rule__Lieu__PersonnesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__PersonnesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getPersonnesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_6__2__Impl"


    // $ANTLR start "rule__Lieu__Group_7__0"
    // InternalGAME.g:4649:1: rule__Lieu__Group_7__0 : rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 ;
    public final void rule__Lieu__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4653:1: ( rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 )
            // InternalGAME.g:4654:2: rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_7__0"


    // $ANTLR start "rule__Lieu__Group_7__0__Impl"
    // InternalGAME.g:4661:1: rule__Lieu__Group_7__0__Impl : ( 'cheminspossible' ) ;
    public final void rule__Lieu__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4665:1: ( ( 'cheminspossible' ) )
            // InternalGAME.g:4666:1: ( 'cheminspossible' )
            {
            // InternalGAME.g:4666:1: ( 'cheminspossible' )
            // InternalGAME.g:4667:2: 'cheminspossible'
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleKeyword_7_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getCheminspossibleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_7__0__Impl"


    // $ANTLR start "rule__Lieu__Group_7__1"
    // InternalGAME.g:4676:1: rule__Lieu__Group_7__1 : rule__Lieu__Group_7__1__Impl ;
    public final void rule__Lieu__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4680:1: ( rule__Lieu__Group_7__1__Impl )
            // InternalGAME.g:4681:2: rule__Lieu__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__Group_7__1"


    // $ANTLR start "rule__Lieu__Group_7__1__Impl"
    // InternalGAME.g:4687:1: rule__Lieu__Group_7__1__Impl : ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) ) ;
    public final void rule__Lieu__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4691:1: ( ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) ) )
            // InternalGAME.g:4692:1: ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) )
            {
            // InternalGAME.g:4692:1: ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) )
            // InternalGAME.g:4693:2: ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* )
            {
            // InternalGAME.g:4693:2: ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) )
            // InternalGAME.g:4694:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleAssignment_7_1()); 
            // InternalGAME.g:4695:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )
            // InternalGAME.g:4695:4: rule__Lieu__CheminspossibleAssignment_7_1
            {
            pushFollow(FOLLOW_9);
            rule__Lieu__CheminspossibleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getCheminspossibleAssignment_7_1()); 

            }

            // InternalGAME.g:4698:2: ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* )
            // InternalGAME.g:4699:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )*
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleAssignment_7_1()); 
            // InternalGAME.g:4700:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGAME.g:4700:4: rule__Lieu__CheminspossibleAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Lieu__CheminspossibleAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getCheminspossibleAssignment_7_1()); 

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
    // $ANTLR end "rule__Lieu__Group_7__1__Impl"


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalGAME.g:4710:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4714:1: ( ( RULE_ID ) )
            // InternalGAME.g:4715:2: ( RULE_ID )
            {
            // InternalGAME.g:4715:2: ( RULE_ID )
            // InternalGAME.g:4716:3: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__NameAssignment_1"


    // $ANTLR start "rule__Jeu__ExplorateurAssignment_3"
    // InternalGAME.g:4725:1: rule__Jeu__ExplorateurAssignment_3 : ( ruleExplorateur ) ;
    public final void rule__Jeu__ExplorateurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4729:1: ( ( ruleExplorateur ) )
            // InternalGAME.g:4730:2: ( ruleExplorateur )
            {
            // InternalGAME.g:4730:2: ( ruleExplorateur )
            // InternalGAME.g:4731:3: ruleExplorateur
            {
             before(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExplorateur();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ExplorateurAssignment_3"


    // $ANTLR start "rule__Jeu__PointDepartAssignment_5"
    // InternalGAME.g:4740:1: rule__Jeu__PointDepartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Jeu__PointDepartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4744:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4745:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4745:2: ( ( RULE_ID ) )
            // InternalGAME.g:4746:3: ( RULE_ID )
            {
             before(grammarAccess.getJeuAccess().getPointDepartLieuCrossReference_5_0()); 
            // InternalGAME.g:4747:3: ( RULE_ID )
            // InternalGAME.g:4748:4: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getPointDepartLieuIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getPointDepartLieuIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getJeuAccess().getPointDepartLieuCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__PointDepartAssignment_5"


    // $ANTLR start "rule__Jeu__PointFinAssignment_7"
    // InternalGAME.g:4759:1: rule__Jeu__PointFinAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Jeu__PointFinAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4763:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4764:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4764:2: ( ( RULE_ID ) )
            // InternalGAME.g:4765:3: ( RULE_ID )
            {
             before(grammarAccess.getJeuAccess().getPointFinLieuCrossReference_7_0()); 
            // InternalGAME.g:4766:3: ( RULE_ID )
            // InternalGAME.g:4767:4: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getPointFinLieuIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getPointFinLieuIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getJeuAccess().getPointFinLieuCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__PointFinAssignment_7"


    // $ANTLR start "rule__Jeu__LieuxAssignment_8"
    // InternalGAME.g:4778:1: rule__Jeu__LieuxAssignment_8 : ( ruleLieu ) ;
    public final void rule__Jeu__LieuxAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4782:1: ( ( ruleLieu ) )
            // InternalGAME.g:4783:2: ( ruleLieu )
            {
            // InternalGAME.g:4783:2: ( ruleLieu )
            // InternalGAME.g:4784:3: ruleLieu
            {
             before(grammarAccess.getJeuAccess().getLieuxLieuParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getLieuxLieuParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__LieuxAssignment_8"


    // $ANTLR start "rule__Jeu__ObjetsAssignment_9"
    // InternalGAME.g:4793:1: rule__Jeu__ObjetsAssignment_9 : ( ruleObjet ) ;
    public final void rule__Jeu__ObjetsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4797:1: ( ( ruleObjet ) )
            // InternalGAME.g:4798:2: ( ruleObjet )
            {
            // InternalGAME.g:4798:2: ( ruleObjet )
            // InternalGAME.g:4799:3: ruleObjet
            {
             before(grammarAccess.getJeuAccess().getObjetsObjetParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getObjetsObjetParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ObjetsAssignment_9"


    // $ANTLR start "rule__Jeu__ObjetAvecQuantiteAssignment_10"
    // InternalGAME.g:4808:1: rule__Jeu__ObjetAvecQuantiteAssignment_10 : ( ruleObjetAvecQuantite ) ;
    public final void rule__Jeu__ObjetAvecQuantiteAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4812:1: ( ( ruleObjetAvecQuantite ) )
            // InternalGAME.g:4813:2: ( ruleObjetAvecQuantite )
            {
            // InternalGAME.g:4813:2: ( ruleObjetAvecQuantite )
            // InternalGAME.g:4814:3: ruleObjetAvecQuantite
            {
             before(grammarAccess.getJeuAccess().getObjetAvecQuantiteObjetAvecQuantiteParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleObjetAvecQuantite();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getObjetAvecQuantiteObjetAvecQuantiteParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ObjetAvecQuantiteAssignment_10"


    // $ANTLR start "rule__Jeu__ConnaissancesAssignment_11"
    // InternalGAME.g:4823:1: rule__Jeu__ConnaissancesAssignment_11 : ( ruleConnaissance ) ;
    public final void rule__Jeu__ConnaissancesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4827:1: ( ( ruleConnaissance ) )
            // InternalGAME.g:4828:2: ( ruleConnaissance )
            {
            // InternalGAME.g:4828:2: ( ruleConnaissance )
            // InternalGAME.g:4829:3: ruleConnaissance
            {
             before(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ConnaissancesAssignment_11"


    // $ANTLR start "rule__Jeu__PersonnesAssignment_12"
    // InternalGAME.g:4838:1: rule__Jeu__PersonnesAssignment_12 : ( rulePersonne ) ;
    public final void rule__Jeu__PersonnesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4842:1: ( ( rulePersonne ) )
            // InternalGAME.g:4843:2: ( rulePersonne )
            {
            // InternalGAME.g:4843:2: ( rulePersonne )
            // InternalGAME.g:4844:3: rulePersonne
            {
             before(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__PersonnesAssignment_12"


    // $ANTLR start "rule__Jeu__CheminsAssignment_13"
    // InternalGAME.g:4853:1: rule__Jeu__CheminsAssignment_13 : ( ruleChemin ) ;
    public final void rule__Jeu__CheminsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4857:1: ( ( ruleChemin ) )
            // InternalGAME.g:4858:2: ( ruleChemin )
            {
            // InternalGAME.g:4858:2: ( ruleChemin )
            // InternalGAME.g:4859:3: ruleChemin
            {
             before(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__CheminsAssignment_13"


    // $ANTLR start "rule__Chemin__NameAssignment_1"
    // InternalGAME.g:4868:1: rule__Chemin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chemin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4872:1: ( ( RULE_ID ) )
            // InternalGAME.g:4873:2: ( RULE_ID )
            {
            // InternalGAME.g:4873:2: ( RULE_ID )
            // InternalGAME.g:4874:3: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__NameAssignment_1"


    // $ANTLR start "rule__Chemin__DescriptionsAssignment_3"
    // InternalGAME.g:4883:1: rule__Chemin__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Chemin__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4887:1: ( ( ruleDescription ) )
            // InternalGAME.g:4888:2: ( ruleDescription )
            {
            // InternalGAME.g:4888:2: ( ruleDescription )
            // InternalGAME.g:4889:3: ruleDescription
            {
             before(grammarAccess.getCheminAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__DescriptionsAssignment_3"


    // $ANTLR start "rule__Chemin__DepartAssignment_5"
    // InternalGAME.g:4898:1: rule__Chemin__DepartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__DepartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4902:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4903:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4903:2: ( ( RULE_ID ) )
            // InternalGAME.g:4904:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getDepartLieuCrossReference_5_0()); 
            // InternalGAME.g:4905:3: ( RULE_ID )
            // InternalGAME.g:4906:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getDepartLieuIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDepartLieuIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getDepartLieuCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__DepartAssignment_5"


    // $ANTLR start "rule__Chemin__ArriveAssignment_7"
    // InternalGAME.g:4917:1: rule__Chemin__ArriveAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ArriveAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4921:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4922:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4922:2: ( ( RULE_ID ) )
            // InternalGAME.g:4923:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getArriveLieuCrossReference_7_0()); 
            // InternalGAME.g:4924:3: ( RULE_ID )
            // InternalGAME.g:4925:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getArriveLieuIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getArriveLieuIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getArriveLieuCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ArriveAssignment_7"


    // $ANTLR start "rule__Chemin__VisibiliteAssignment_8"
    // InternalGAME.g:4936:1: rule__Chemin__VisibiliteAssignment_8 : ( ruleVisibilite ) ;
    public final void rule__Chemin__VisibiliteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4940:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:4941:2: ( ruleVisibilite )
            {
            // InternalGAME.g:4941:2: ( ruleVisibilite )
            // InternalGAME.g:4942:3: ruleVisibilite
            {
             before(grammarAccess.getCheminAccess().getVisibiliteVisibiliteEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getVisibiliteVisibiliteEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__VisibiliteAssignment_8"


    // $ANTLR start "rule__Chemin__ConditionsVisibiliteAssignment_9_1"
    // InternalGAME.g:4951:1: rule__Chemin__ConditionsVisibiliteAssignment_9_1 : ( ruleCondition ) ;
    public final void rule__Chemin__ConditionsVisibiliteAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4955:1: ( ( ruleCondition ) )
            // InternalGAME.g:4956:2: ( ruleCondition )
            {
            // InternalGAME.g:4956:2: ( ruleCondition )
            // InternalGAME.g:4957:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ConditionsVisibiliteAssignment_9_1"


    // $ANTLR start "rule__Chemin__OuvertureAssignment_10"
    // InternalGAME.g:4966:1: rule__Chemin__OuvertureAssignment_10 : ( ruleOuverture ) ;
    public final void rule__Chemin__OuvertureAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4970:1: ( ( ruleOuverture ) )
            // InternalGAME.g:4971:2: ( ruleOuverture )
            {
            // InternalGAME.g:4971:2: ( ruleOuverture )
            // InternalGAME.g:4972:3: ruleOuverture
            {
             before(grammarAccess.getCheminAccess().getOuvertureOuvertureEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleOuverture();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getOuvertureOuvertureEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__OuvertureAssignment_10"


    // $ANTLR start "rule__Chemin__ConditionsOuvertureAssignment_11_1"
    // InternalGAME.g:4981:1: rule__Chemin__ConditionsOuvertureAssignment_11_1 : ( ruleCondition ) ;
    public final void rule__Chemin__ConditionsOuvertureAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4985:1: ( ( ruleCondition ) )
            // InternalGAME.g:4986:2: ( ruleCondition )
            {
            // InternalGAME.g:4986:2: ( ruleCondition )
            // InternalGAME.g:4987:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureConditionParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getConditionsOuvertureConditionParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ConditionsOuvertureAssignment_11_1"


    // $ANTLR start "rule__Personne__NameAssignment_1"
    // InternalGAME.g:4996:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5000:1: ( ( RULE_ID ) )
            // InternalGAME.g:5001:2: ( RULE_ID )
            {
            // InternalGAME.g:5001:2: ( RULE_ID )
            // InternalGAME.g:5002:3: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__NameAssignment_1"


    // $ANTLR start "rule__Personne__LocalisationAssignment_4"
    // InternalGAME.g:5011:1: rule__Personne__LocalisationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__LocalisationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5015:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5016:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5016:2: ( ( RULE_ID ) )
            // InternalGAME.g:5017:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getLocalisationLieuCrossReference_4_0()); 
            // InternalGAME.g:5018:3: ( RULE_ID )
            // InternalGAME.g:5019:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getLocalisationLieuIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLocalisationLieuIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getLocalisationLieuCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__LocalisationAssignment_4"


    // $ANTLR start "rule__Personne__DescriptionsAssignment_5"
    // InternalGAME.g:5030:1: rule__Personne__DescriptionsAssignment_5 : ( ruleDescription ) ;
    public final void rule__Personne__DescriptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5034:1: ( ( ruleDescription ) )
            // InternalGAME.g:5035:2: ( ruleDescription )
            {
            // InternalGAME.g:5035:2: ( ruleDescription )
            // InternalGAME.g:5036:3: ruleDescription
            {
             before(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__DescriptionsAssignment_5"


    // $ANTLR start "rule__Personne__InteractionAssignment_6"
    // InternalGAME.g:5045:1: rule__Personne__InteractionAssignment_6 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5049:1: ( ( ruleInteraction ) )
            // InternalGAME.g:5050:2: ( ruleInteraction )
            {
            // InternalGAME.g:5050:2: ( ruleInteraction )
            // InternalGAME.g:5051:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__InteractionAssignment_6"


    // $ANTLR start "rule__Personne__VisibiliteAssignment_7"
    // InternalGAME.g:5060:1: rule__Personne__VisibiliteAssignment_7 : ( ruleVisibilite ) ;
    public final void rule__Personne__VisibiliteAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5064:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:5065:2: ( ruleVisibilite )
            {
            // InternalGAME.g:5065:2: ( ruleVisibilite )
            // InternalGAME.g:5066:3: ruleVisibilite
            {
             before(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibiliteAssignment_7"


    // $ANTLR start "rule__Personne__ConditionsVisibiliteAssignment_8_1"
    // InternalGAME.g:5075:1: rule__Personne__ConditionsVisibiliteAssignment_8_1 : ( ruleCondition ) ;
    public final void rule__Personne__ConditionsVisibiliteAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5079:1: ( ( ruleCondition ) )
            // InternalGAME.g:5080:2: ( ruleCondition )
            {
            // InternalGAME.g:5080:2: ( ruleCondition )
            // InternalGAME.g:5081:3: ruleCondition
            {
             before(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ConditionsVisibiliteAssignment_8_1"


    // $ANTLR start "rule__Interaction__EchangesAssignment_2"
    // InternalGAME.g:5090:1: rule__Interaction__EchangesAssignment_2 : ( ruleEchange ) ;
    public final void rule__Interaction__EchangesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5094:1: ( ( ruleEchange ) )
            // InternalGAME.g:5095:2: ( ruleEchange )
            {
            // InternalGAME.g:5095:2: ( ruleEchange )
            // InternalGAME.g:5096:3: ruleEchange
            {
             before(grammarAccess.getInteractionAccess().getEchangesEchangeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEchange();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getEchangesEchangeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__EchangesAssignment_2"


    // $ANTLR start "rule__Interaction__ChoixAssignment_3"
    // InternalGAME.g:5105:1: rule__Interaction__ChoixAssignment_3 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5109:1: ( ( ruleChoix ) )
            // InternalGAME.g:5110:2: ( ruleChoix )
            {
            // InternalGAME.g:5110:2: ( ruleChoix )
            // InternalGAME.g:5111:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ChoixAssignment_3"


    // $ANTLR start "rule__Choix__NameAssignment_1"
    // InternalGAME.g:5120:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5124:1: ( ( RULE_ID ) )
            // InternalGAME.g:5125:2: ( RULE_ID )
            {
            // InternalGAME.g:5125:2: ( RULE_ID )
            // InternalGAME.g:5126:3: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__NameAssignment_1"


    // $ANTLR start "rule__Choix__ActionsAssignment_3"
    // InternalGAME.g:5135:1: rule__Choix__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__Choix__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5139:1: ( ( ruleAction ) )
            // InternalGAME.g:5140:2: ( ruleAction )
            {
            // InternalGAME.g:5140:2: ( ruleAction )
            // InternalGAME.g:5141:3: ruleAction
            {
             before(grammarAccess.getChoixAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ActionsAssignment_3"


    // $ANTLR start "rule__Choix__ConditionsAssignment_4"
    // InternalGAME.g:5150:1: rule__Choix__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Choix__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5154:1: ( ( ruleCondition ) )
            // InternalGAME.g:5155:2: ( ruleCondition )
            {
            // InternalGAME.g:5155:2: ( ruleCondition )
            // InternalGAME.g:5156:3: ruleCondition
            {
             before(grammarAccess.getChoixAccess().getConditionsConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getConditionsConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__ConditionsAssignment_4"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalGAME.g:5165:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5169:1: ( ( RULE_ID ) )
            // InternalGAME.g:5170:2: ( RULE_ID )
            {
            // InternalGAME.g:5170:2: ( RULE_ID )
            // InternalGAME.g:5171:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__DescriptionsAssignment_3"
    // InternalGAME.g:5180:1: rule__Action__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Action__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5184:1: ( ( ruleDescription ) )
            // InternalGAME.g:5185:2: ( ruleDescription )
            {
            // InternalGAME.g:5185:2: ( ruleDescription )
            // InternalGAME.g:5186:3: ruleDescription
            {
             before(grammarAccess.getActionAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getActionAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DescriptionsAssignment_3"


    // $ANTLR start "rule__Action__ConditionsAssignment_4"
    // InternalGAME.g:5195:1: rule__Action__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Action__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5199:1: ( ( ruleCondition ) )
            // InternalGAME.g:5200:2: ( ruleCondition )
            {
            // InternalGAME.g:5200:2: ( ruleCondition )
            // InternalGAME.g:5201:3: ruleCondition
            {
             before(grammarAccess.getActionAccess().getConditionsConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getConditionsConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ConditionsAssignment_4"


    // $ANTLR start "rule__Action__EchangesAssignment_5"
    // InternalGAME.g:5210:1: rule__Action__EchangesAssignment_5 : ( ruleEchange ) ;
    public final void rule__Action__EchangesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5214:1: ( ( ruleEchange ) )
            // InternalGAME.g:5215:2: ( ruleEchange )
            {
            // InternalGAME.g:5215:2: ( ruleEchange )
            // InternalGAME.g:5216:3: ruleEchange
            {
             before(grammarAccess.getActionAccess().getEchangesEchangeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEchange();

            state._fsp--;

             after(grammarAccess.getActionAccess().getEchangesEchangeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__EchangesAssignment_5"


    // $ANTLR start "rule__Echange__ObjetsDonneAssignment_3_1"
    // InternalGAME.g:5225:1: rule__Echange__ObjetsDonneAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Echange__ObjetsDonneAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5229:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5230:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5230:2: ( ( RULE_ID ) )
            // InternalGAME.g:5231:3: ( RULE_ID )
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneObjetCrossReference_3_1_0()); 
            // InternalGAME.g:5232:3: ( RULE_ID )
            // InternalGAME.g:5233:4: RULE_ID
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneObjetIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getObjetsDonneObjetIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEchangeAccess().getObjetsDonneObjetCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__ObjetsDonneAssignment_3_1"


    // $ANTLR start "rule__Echange__ObjetsPrisAssignment_4_1"
    // InternalGAME.g:5244:1: rule__Echange__ObjetsPrisAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Echange__ObjetsPrisAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5248:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5249:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5249:2: ( ( RULE_ID ) )
            // InternalGAME.g:5250:3: ( RULE_ID )
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisObjetCrossReference_4_1_0()); 
            // InternalGAME.g:5251:3: ( RULE_ID )
            // InternalGAME.g:5252:4: RULE_ID
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisObjetIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getObjetsPrisObjetIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEchangeAccess().getObjetsPrisObjetCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__ObjetsPrisAssignment_4_1"


    // $ANTLR start "rule__Echange__ConnaissancesAssignment_5_1"
    // InternalGAME.g:5263:1: rule__Echange__ConnaissancesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Echange__ConnaissancesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5267:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5268:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5268:2: ( ( RULE_ID ) )
            // InternalGAME.g:5269:3: ( RULE_ID )
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesConnaissanceCrossReference_5_1_0()); 
            // InternalGAME.g:5270:3: ( RULE_ID )
            // InternalGAME.g:5271:4: RULE_ID
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEchangeAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getEchangeAccess().getConnaissancesConnaissanceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__ConnaissancesAssignment_5_1"


    // $ANTLR start "rule__Echange__ConditionsAssignment_6"
    // InternalGAME.g:5282:1: rule__Echange__ConditionsAssignment_6 : ( ruleCondition ) ;
    public final void rule__Echange__ConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5286:1: ( ( ruleCondition ) )
            // InternalGAME.g:5287:2: ( ruleCondition )
            {
            // InternalGAME.g:5287:2: ( ruleCondition )
            // InternalGAME.g:5288:3: ruleCondition
            {
             before(grammarAccess.getEchangeAccess().getConditionsConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getEchangeAccess().getConditionsConditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Echange__ConditionsAssignment_6"


    // $ANTLR start "rule__Objet__NameAssignment_1"
    // InternalGAME.g:5297:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5301:1: ( ( RULE_ID ) )
            // InternalGAME.g:5302:2: ( RULE_ID )
            {
            // InternalGAME.g:5302:2: ( RULE_ID )
            // InternalGAME.g:5303:3: RULE_ID
            {
             before(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__NameAssignment_1"


    // $ANTLR start "rule__Objet__DescriptionsAssignment_3"
    // InternalGAME.g:5312:1: rule__Objet__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Objet__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5316:1: ( ( ruleDescription ) )
            // InternalGAME.g:5317:2: ( ruleDescription )
            {
            // InternalGAME.g:5317:2: ( ruleDescription )
            // InternalGAME.g:5318:3: ruleDescription
            {
             before(grammarAccess.getObjetAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__DescriptionsAssignment_3"


    // $ANTLR start "rule__Objet__TailleAssignment_5"
    // InternalGAME.g:5327:1: rule__Objet__TailleAssignment_5 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5331:1: ( ( RULE_INT ) )
            // InternalGAME.g:5332:2: ( RULE_INT )
            {
            // InternalGAME.g:5332:2: ( RULE_INT )
            // InternalGAME.g:5333:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__TailleAssignment_5"


    // $ANTLR start "rule__Objet__VisibiliteAssignment_6"
    // InternalGAME.g:5342:1: rule__Objet__VisibiliteAssignment_6 : ( ruleVisibilite ) ;
    public final void rule__Objet__VisibiliteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5346:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:5347:2: ( ruleVisibilite )
            {
            // InternalGAME.g:5347:2: ( ruleVisibilite )
            // InternalGAME.g:5348:3: ruleVisibilite
            {
             before(grammarAccess.getObjetAccess().getVisibiliteVisibiliteEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getVisibiliteVisibiliteEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__VisibiliteAssignment_6"


    // $ANTLR start "rule__Objet__ConditionsVisibiliteAssignment_7_1"
    // InternalGAME.g:5357:1: rule__Objet__ConditionsVisibiliteAssignment_7_1 : ( ruleCondition ) ;
    public final void rule__Objet__ConditionsVisibiliteAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5361:1: ( ( ruleCondition ) )
            // InternalGAME.g:5362:2: ( ruleCondition )
            {
            // InternalGAME.g:5362:2: ( ruleCondition )
            // InternalGAME.g:5363:3: ruleCondition
            {
             before(grammarAccess.getObjetAccess().getConditionsVisibiliteConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getConditionsVisibiliteConditionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__ConditionsVisibiliteAssignment_7_1"


    // $ANTLR start "rule__Description__TextAssignment_2"
    // InternalGAME.g:5372:1: rule__Description__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5376:1: ( ( RULE_STRING ) )
            // InternalGAME.g:5377:2: ( RULE_STRING )
            {
            // InternalGAME.g:5377:2: ( RULE_STRING )
            // InternalGAME.g:5378:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__TextAssignment_2"


    // $ANTLR start "rule__Condition__NameAssignment_1"
    // InternalGAME.g:5387:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5391:1: ( ( RULE_ID ) )
            // InternalGAME.g:5392:2: ( RULE_ID )
            {
            // InternalGAME.g:5392:2: ( RULE_ID )
            // InternalGAME.g:5393:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_1"


    // $ANTLR start "rule__Condition__ObjetsAssignment_3_2"
    // InternalGAME.g:5402:1: rule__Condition__ObjetsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5406:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5407:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5407:2: ( ( RULE_ID ) )
            // InternalGAME.g:5408:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsObjetCrossReference_3_2_0()); 
            // InternalGAME.g:5409:3: ( RULE_ID )
            // InternalGAME.g:5410:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getObjetsObjetIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetsObjetIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getObjetsObjetCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ObjetsAssignment_3_2"


    // $ANTLR start "rule__Condition__ObjetsAssignment_4_2"
    // InternalGAME.g:5421:1: rule__Condition__ObjetsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5425:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5426:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5426:2: ( ( RULE_ID ) )
            // InternalGAME.g:5427:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsObjetCrossReference_4_2_0()); 
            // InternalGAME.g:5428:3: ( RULE_ID )
            // InternalGAME.g:5429:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getObjetsObjetIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjetsObjetIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getObjetsObjetCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ObjetsAssignment_4_2"


    // $ANTLR start "rule__Condition__ConnaissancesAssignment_5_2"
    // InternalGAME.g:5440:1: rule__Condition__ConnaissancesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissancesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5444:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5445:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5445:2: ( ( RULE_ID ) )
            // InternalGAME.g:5446:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissancesConnaissanceCrossReference_5_2_0()); 
            // InternalGAME.g:5447:3: ( RULE_ID )
            // InternalGAME.g:5448:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getConnaissancesConnaissanceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConnaissancesAssignment_5_2"


    // $ANTLR start "rule__Connaissance__NameAssignment_1"
    // InternalGAME.g:5459:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5463:1: ( ( RULE_ID ) )
            // InternalGAME.g:5464:2: ( RULE_ID )
            {
            // InternalGAME.g:5464:2: ( RULE_ID )
            // InternalGAME.g:5465:3: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__NameAssignment_1"


    // $ANTLR start "rule__Connaissance__DescriptionsAssignment_3"
    // InternalGAME.g:5474:1: rule__Connaissance__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Connaissance__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5478:1: ( ( ruleDescription ) )
            // InternalGAME.g:5479:2: ( ruleDescription )
            {
            // InternalGAME.g:5479:2: ( ruleDescription )
            // InternalGAME.g:5480:3: ruleDescription
            {
             before(grammarAccess.getConnaissanceAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__DescriptionsAssignment_3"


    // $ANTLR start "rule__Connaissance__VisibiliteAssignment_4"
    // InternalGAME.g:5489:1: rule__Connaissance__VisibiliteAssignment_4 : ( ruleVisibilite ) ;
    public final void rule__Connaissance__VisibiliteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5493:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:5494:2: ( ruleVisibilite )
            {
            // InternalGAME.g:5494:2: ( ruleVisibilite )
            // InternalGAME.g:5495:3: ruleVisibilite
            {
             before(grammarAccess.getConnaissanceAccess().getVisibiliteVisibiliteEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getVisibiliteVisibiliteEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__VisibiliteAssignment_4"


    // $ANTLR start "rule__Connaissance__ConditionsVisibiliteAssignment_5_1"
    // InternalGAME.g:5504:1: rule__Connaissance__ConditionsVisibiliteAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__Connaissance__ConditionsVisibiliteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5508:1: ( ( ruleCondition ) )
            // InternalGAME.g:5509:2: ( ruleCondition )
            {
            // InternalGAME.g:5509:2: ( ruleCondition )
            // InternalGAME.g:5510:3: ruleCondition
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connaissance__ConditionsVisibiliteAssignment_5_1"


    // $ANTLR start "rule__Explorateur__NameAssignment_1"
    // InternalGAME.g:5519:1: rule__Explorateur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Explorateur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5523:1: ( ( RULE_ID ) )
            // InternalGAME.g:5524:2: ( RULE_ID )
            {
            // InternalGAME.g:5524:2: ( RULE_ID )
            // InternalGAME.g:5525:3: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__NameAssignment_1"


    // $ANTLR start "rule__Explorateur__TailleAssignment_4"
    // InternalGAME.g:5534:1: rule__Explorateur__TailleAssignment_4 : ( RULE_INT ) ;
    public final void rule__Explorateur__TailleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5538:1: ( ( RULE_INT ) )
            // InternalGAME.g:5539:2: ( RULE_INT )
            {
            // InternalGAME.g:5539:2: ( RULE_INT )
            // InternalGAME.g:5540:3: RULE_INT
            {
             before(grammarAccess.getExplorateurAccess().getTailleINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getTailleINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__TailleAssignment_4"


    // $ANTLR start "rule__Explorateur__ObjetsAssignment_6"
    // InternalGAME.g:5549:1: rule__Explorateur__ObjetsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ObjetsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5553:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5554:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5554:2: ( ( RULE_ID ) )
            // InternalGAME.g:5555:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetAvecQuantiteCrossReference_6_0()); 
            // InternalGAME.g:5556:3: ( RULE_ID )
            // InternalGAME.g:5557:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetAvecQuantiteIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getObjetsObjetAvecQuantiteIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getObjetsObjetAvecQuantiteCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ObjetsAssignment_6"


    // $ANTLR start "rule__Explorateur__ConnaissancesAssignment_8"
    // InternalGAME.g:5568:1: rule__Explorateur__ConnaissancesAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5572:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5573:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5573:2: ( ( RULE_ID ) )
            // InternalGAME.g:5574:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_8_0()); 
            // InternalGAME.g:5575:3: ( RULE_ID )
            // InternalGAME.g:5576:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__ConnaissancesAssignment_8"


    // $ANTLR start "rule__Explorateur__LocalisationAssignment_10"
    // InternalGAME.g:5587:1: rule__Explorateur__LocalisationAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__LocalisationAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5591:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5592:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5592:2: ( ( RULE_ID ) )
            // InternalGAME.g:5593:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationLieuCrossReference_10_0()); 
            // InternalGAME.g:5594:3: ( RULE_ID )
            // InternalGAME.g:5595:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationLieuIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getLocalisationLieuIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getLocalisationLieuCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Explorateur__LocalisationAssignment_10"


    // $ANTLR start "rule__ObjetAvecQuantite__NameAssignment_1"
    // InternalGAME.g:5606:1: rule__ObjetAvecQuantite__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjetAvecQuantite__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5610:1: ( ( RULE_ID ) )
            // InternalGAME.g:5611:2: ( RULE_ID )
            {
            // InternalGAME.g:5611:2: ( RULE_ID )
            // InternalGAME.g:5612:3: RULE_ID
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAvecQuantiteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__NameAssignment_1"


    // $ANTLR start "rule__ObjetAvecQuantite__ObjetAssignment_3"
    // InternalGAME.g:5621:1: rule__ObjetAvecQuantite__ObjetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjetAvecQuantite__ObjetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5625:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5626:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5626:2: ( ( RULE_ID ) )
            // InternalGAME.g:5627:3: ( RULE_ID )
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getObjetObjetCrossReference_3_0()); 
            // InternalGAME.g:5628:3: ( RULE_ID )
            // InternalGAME.g:5629:4: RULE_ID
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getObjetObjetIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAvecQuantiteAccess().getObjetObjetIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getObjetAvecQuantiteAccess().getObjetObjetCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__ObjetAssignment_3"


    // $ANTLR start "rule__ObjetAvecQuantite__QuantiteAssignment_5"
    // InternalGAME.g:5640:1: rule__ObjetAvecQuantite__QuantiteAssignment_5 : ( RULE_INT ) ;
    public final void rule__ObjetAvecQuantite__QuantiteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5644:1: ( ( RULE_INT ) )
            // InternalGAME.g:5645:2: ( RULE_INT )
            {
            // InternalGAME.g:5645:2: ( RULE_INT )
            // InternalGAME.g:5646:3: RULE_INT
            {
             before(grammarAccess.getObjetAvecQuantiteAccess().getQuantiteINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAvecQuantiteAccess().getQuantiteINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetAvecQuantite__QuantiteAssignment_5"


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalGAME.g:5655:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5659:1: ( ( RULE_ID ) )
            // InternalGAME.g:5660:2: ( RULE_ID )
            {
            // InternalGAME.g:5660:2: ( RULE_ID )
            // InternalGAME.g:5661:3: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__NameAssignment_1"


    // $ANTLR start "rule__Lieu__DescriptionsAssignment_3"
    // InternalGAME.g:5670:1: rule__Lieu__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Lieu__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5674:1: ( ( ruleDescription ) )
            // InternalGAME.g:5675:2: ( ruleDescription )
            {
            // InternalGAME.g:5675:2: ( ruleDescription )
            // InternalGAME.g:5676:3: ruleDescription
            {
             before(grammarAccess.getLieuAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__DescriptionsAssignment_3"


    // $ANTLR start "rule__Lieu__ObjetsAssignment_4_2"
    // InternalGAME.g:5685:1: rule__Lieu__ObjetsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ObjetsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5689:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5690:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5690:2: ( ( RULE_ID ) )
            // InternalGAME.g:5691:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_2_0()); 
            // InternalGAME.g:5692:3: ( RULE_ID )
            // InternalGAME.g:5693:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getObjetsObjetIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ObjetsAssignment_4_2"


    // $ANTLR start "rule__Lieu__ConnaissancesAssignment_5_2"
    // InternalGAME.g:5704:1: rule__Lieu__ConnaissancesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ConnaissancesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5708:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5709:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5709:2: ( ( RULE_ID ) )
            // InternalGAME.g:5710:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_2_0()); 
            // InternalGAME.g:5711:3: ( RULE_ID )
            // InternalGAME.g:5712:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ConnaissancesAssignment_5_2"


    // $ANTLR start "rule__Lieu__PersonnesAssignment_6_2"
    // InternalGAME.g:5723:1: rule__Lieu__PersonnesAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__PersonnesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5727:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5728:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5728:2: ( ( RULE_ID ) )
            // InternalGAME.g:5729:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_0()); 
            // InternalGAME.g:5730:3: ( RULE_ID )
            // InternalGAME.g:5731:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__PersonnesAssignment_6_2"


    // $ANTLR start "rule__Lieu__CheminspossibleAssignment_7_1"
    // InternalGAME.g:5742:1: rule__Lieu__CheminspossibleAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__CheminspossibleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5746:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5747:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5747:2: ( ( RULE_ID ) )
            // InternalGAME.g:5748:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleCheminCrossReference_7_1_0()); 
            // InternalGAME.g:5749:3: ( RULE_ID )
            // InternalGAME.g:5750:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleCheminIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getCheminspossibleCheminIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getCheminspossibleCheminCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__CheminspossibleAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000A20201180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000806000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001010080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000011C0080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000012000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800001800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000C012800080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});

}