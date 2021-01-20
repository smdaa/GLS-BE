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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'visible'", "'invisible'", "'ouvert'", "'ferme'", "'jeu'", "'{'", "'pointDepart'", "'pointFin'", "'}'", "'chemin'", "'de'", "'vers'", "'si'", "'personne'", "'interaction'", "'choix'", "'action'", "'echange'", "'objetsDonne'", "'objetsPris'", "'connaissancesDonne'", "'objet'", "'taille'", "'quantite'", "'description'", "'condition'", "'objets'", "'necessaires'", "'manquants'", "'connaissances'", "'connaissance'", "'explorateur'", "'inventaireO'", "'inventaireC'", "'localisation'", "'lieu'", "'trouvables'", "'trouvable'", "'personnes'", "'cheminspossible'"
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


    // $ANTLR start "entryRuleLieu"
    // InternalGAME.g:353:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGAME.g:354:1: ( ruleLieu EOF )
            // InternalGAME.g:355:1: ruleLieu EOF
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
    // InternalGAME.g:362:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:366:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGAME.g:367:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGAME.g:367:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGAME.g:368:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGAME.g:369:3: ( rule__Lieu__Group__0 )
            // InternalGAME.g:369:4: rule__Lieu__Group__0
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
    // InternalGAME.g:378:1: ruleVisibilite : ( ( rule__Visibilite__Alternatives ) ) ;
    public final void ruleVisibilite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:382:1: ( ( ( rule__Visibilite__Alternatives ) ) )
            // InternalGAME.g:383:2: ( ( rule__Visibilite__Alternatives ) )
            {
            // InternalGAME.g:383:2: ( ( rule__Visibilite__Alternatives ) )
            // InternalGAME.g:384:3: ( rule__Visibilite__Alternatives )
            {
             before(grammarAccess.getVisibiliteAccess().getAlternatives()); 
            // InternalGAME.g:385:3: ( rule__Visibilite__Alternatives )
            // InternalGAME.g:385:4: rule__Visibilite__Alternatives
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
    // InternalGAME.g:394:1: ruleOuverture : ( ( rule__Ouverture__Alternatives ) ) ;
    public final void ruleOuverture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:398:1: ( ( ( rule__Ouverture__Alternatives ) ) )
            // InternalGAME.g:399:2: ( ( rule__Ouverture__Alternatives ) )
            {
            // InternalGAME.g:399:2: ( ( rule__Ouverture__Alternatives ) )
            // InternalGAME.g:400:3: ( rule__Ouverture__Alternatives )
            {
             before(grammarAccess.getOuvertureAccess().getAlternatives()); 
            // InternalGAME.g:401:3: ( rule__Ouverture__Alternatives )
            // InternalGAME.g:401:4: rule__Ouverture__Alternatives
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
    // InternalGAME.g:409:1: rule__Visibilite__Alternatives : ( ( ( 'visible' ) ) | ( ( 'invisible' ) ) );
    public final void rule__Visibilite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:413:1: ( ( ( 'visible' ) ) | ( ( 'invisible' ) ) )
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
                    // InternalGAME.g:414:2: ( ( 'visible' ) )
                    {
                    // InternalGAME.g:414:2: ( ( 'visible' ) )
                    // InternalGAME.g:415:3: ( 'visible' )
                    {
                     before(grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalGAME.g:416:3: ( 'visible' )
                    // InternalGAME.g:416:4: 'visible'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:420:2: ( ( 'invisible' ) )
                    {
                    // InternalGAME.g:420:2: ( ( 'invisible' ) )
                    // InternalGAME.g:421:3: ( 'invisible' )
                    {
                     before(grammarAccess.getVisibiliteAccess().getInvisibleEnumLiteralDeclaration_1()); 
                    // InternalGAME.g:422:3: ( 'invisible' )
                    // InternalGAME.g:422:4: 'invisible'
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
    // InternalGAME.g:430:1: rule__Ouverture__Alternatives : ( ( ( 'ouvert' ) ) | ( ( 'ferme' ) ) );
    public final void rule__Ouverture__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:434:1: ( ( ( 'ouvert' ) ) | ( ( 'ferme' ) ) )
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
                    // InternalGAME.g:435:2: ( ( 'ouvert' ) )
                    {
                    // InternalGAME.g:435:2: ( ( 'ouvert' ) )
                    // InternalGAME.g:436:3: ( 'ouvert' )
                    {
                     before(grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0()); 
                    // InternalGAME.g:437:3: ( 'ouvert' )
                    // InternalGAME.g:437:4: 'ouvert'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:441:2: ( ( 'ferme' ) )
                    {
                    // InternalGAME.g:441:2: ( ( 'ferme' ) )
                    // InternalGAME.g:442:3: ( 'ferme' )
                    {
                     before(grammarAccess.getOuvertureAccess().getFermeEnumLiteralDeclaration_1()); 
                    // InternalGAME.g:443:3: ( 'ferme' )
                    // InternalGAME.g:443:4: 'ferme'
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
    // InternalGAME.g:451:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:455:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGAME.g:456:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalGAME.g:463:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:467:1: ( ( 'jeu' ) )
            // InternalGAME.g:468:1: ( 'jeu' )
            {
            // InternalGAME.g:468:1: ( 'jeu' )
            // InternalGAME.g:469:2: 'jeu'
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
    // InternalGAME.g:478:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:482:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGAME.g:483:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalGAME.g:490:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:494:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalGAME.g:495:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalGAME.g:495:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalGAME.g:496:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalGAME.g:497:2: ( rule__Jeu__NameAssignment_1 )
            // InternalGAME.g:497:3: rule__Jeu__NameAssignment_1
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
    // InternalGAME.g:505:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:509:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGAME.g:510:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalGAME.g:517:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:521:1: ( ( '{' ) )
            // InternalGAME.g:522:1: ( '{' )
            {
            // InternalGAME.g:522:1: ( '{' )
            // InternalGAME.g:523:2: '{'
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
    // InternalGAME.g:532:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:536:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGAME.g:537:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
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
    // InternalGAME.g:544:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__ExplorateurAssignment_3 ) ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:548:1: ( ( ( rule__Jeu__ExplorateurAssignment_3 ) ) )
            // InternalGAME.g:549:1: ( ( rule__Jeu__ExplorateurAssignment_3 ) )
            {
            // InternalGAME.g:549:1: ( ( rule__Jeu__ExplorateurAssignment_3 ) )
            // InternalGAME.g:550:2: ( rule__Jeu__ExplorateurAssignment_3 )
            {
             before(grammarAccess.getJeuAccess().getExplorateurAssignment_3()); 
            // InternalGAME.g:551:2: ( rule__Jeu__ExplorateurAssignment_3 )
            // InternalGAME.g:551:3: rule__Jeu__ExplorateurAssignment_3
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
    // InternalGAME.g:559:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:563:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGAME.g:564:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
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
    // InternalGAME.g:571:1: rule__Jeu__Group__4__Impl : ( 'pointDepart' ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:575:1: ( ( 'pointDepart' ) )
            // InternalGAME.g:576:1: ( 'pointDepart' )
            {
            // InternalGAME.g:576:1: ( 'pointDepart' )
            // InternalGAME.g:577:2: 'pointDepart'
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
    // InternalGAME.g:586:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:590:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGAME.g:591:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
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
    // InternalGAME.g:598:1: rule__Jeu__Group__5__Impl : ( ( rule__Jeu__PointDepartAssignment_5 ) ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:602:1: ( ( ( rule__Jeu__PointDepartAssignment_5 ) ) )
            // InternalGAME.g:603:1: ( ( rule__Jeu__PointDepartAssignment_5 ) )
            {
            // InternalGAME.g:603:1: ( ( rule__Jeu__PointDepartAssignment_5 ) )
            // InternalGAME.g:604:2: ( rule__Jeu__PointDepartAssignment_5 )
            {
             before(grammarAccess.getJeuAccess().getPointDepartAssignment_5()); 
            // InternalGAME.g:605:2: ( rule__Jeu__PointDepartAssignment_5 )
            // InternalGAME.g:605:3: rule__Jeu__PointDepartAssignment_5
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
    // InternalGAME.g:613:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl rule__Jeu__Group__7 ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:617:1: ( rule__Jeu__Group__6__Impl rule__Jeu__Group__7 )
            // InternalGAME.g:618:2: rule__Jeu__Group__6__Impl rule__Jeu__Group__7
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
    // InternalGAME.g:625:1: rule__Jeu__Group__6__Impl : ( 'pointFin' ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:629:1: ( ( 'pointFin' ) )
            // InternalGAME.g:630:1: ( 'pointFin' )
            {
            // InternalGAME.g:630:1: ( 'pointFin' )
            // InternalGAME.g:631:2: 'pointFin'
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
    // InternalGAME.g:640:1: rule__Jeu__Group__7 : rule__Jeu__Group__7__Impl rule__Jeu__Group__8 ;
    public final void rule__Jeu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:644:1: ( rule__Jeu__Group__7__Impl rule__Jeu__Group__8 )
            // InternalGAME.g:645:2: rule__Jeu__Group__7__Impl rule__Jeu__Group__8
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
    // InternalGAME.g:652:1: rule__Jeu__Group__7__Impl : ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) ) ;
    public final void rule__Jeu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:656:1: ( ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) ) )
            // InternalGAME.g:657:1: ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) )
            {
            // InternalGAME.g:657:1: ( ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* ) )
            // InternalGAME.g:658:2: ( ( rule__Jeu__PointFinAssignment_7 ) ) ( ( rule__Jeu__PointFinAssignment_7 )* )
            {
            // InternalGAME.g:658:2: ( ( rule__Jeu__PointFinAssignment_7 ) )
            // InternalGAME.g:659:3: ( rule__Jeu__PointFinAssignment_7 )
            {
             before(grammarAccess.getJeuAccess().getPointFinAssignment_7()); 
            // InternalGAME.g:660:3: ( rule__Jeu__PointFinAssignment_7 )
            // InternalGAME.g:660:4: rule__Jeu__PointFinAssignment_7
            {
            pushFollow(FOLLOW_9);
            rule__Jeu__PointFinAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getPointFinAssignment_7()); 

            }

            // InternalGAME.g:663:2: ( ( rule__Jeu__PointFinAssignment_7 )* )
            // InternalGAME.g:664:3: ( rule__Jeu__PointFinAssignment_7 )*
            {
             before(grammarAccess.getJeuAccess().getPointFinAssignment_7()); 
            // InternalGAME.g:665:3: ( rule__Jeu__PointFinAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGAME.g:665:4: rule__Jeu__PointFinAssignment_7
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
    // InternalGAME.g:674:1: rule__Jeu__Group__8 : rule__Jeu__Group__8__Impl rule__Jeu__Group__9 ;
    public final void rule__Jeu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:678:1: ( rule__Jeu__Group__8__Impl rule__Jeu__Group__9 )
            // InternalGAME.g:679:2: rule__Jeu__Group__8__Impl rule__Jeu__Group__9
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
    // InternalGAME.g:686:1: rule__Jeu__Group__8__Impl : ( ( rule__Jeu__LieuxAssignment_8 )* ) ;
    public final void rule__Jeu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:690:1: ( ( ( rule__Jeu__LieuxAssignment_8 )* ) )
            // InternalGAME.g:691:1: ( ( rule__Jeu__LieuxAssignment_8 )* )
            {
            // InternalGAME.g:691:1: ( ( rule__Jeu__LieuxAssignment_8 )* )
            // InternalGAME.g:692:2: ( rule__Jeu__LieuxAssignment_8 )*
            {
             before(grammarAccess.getJeuAccess().getLieuxAssignment_8()); 
            // InternalGAME.g:693:2: ( rule__Jeu__LieuxAssignment_8 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==46) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGAME.g:693:3: rule__Jeu__LieuxAssignment_8
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
    // InternalGAME.g:701:1: rule__Jeu__Group__9 : rule__Jeu__Group__9__Impl rule__Jeu__Group__10 ;
    public final void rule__Jeu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:705:1: ( rule__Jeu__Group__9__Impl rule__Jeu__Group__10 )
            // InternalGAME.g:706:2: rule__Jeu__Group__9__Impl rule__Jeu__Group__10
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
    // InternalGAME.g:713:1: rule__Jeu__Group__9__Impl : ( ( rule__Jeu__ObjetsAssignment_9 )* ) ;
    public final void rule__Jeu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:717:1: ( ( ( rule__Jeu__ObjetsAssignment_9 )* ) )
            // InternalGAME.g:718:1: ( ( rule__Jeu__ObjetsAssignment_9 )* )
            {
            // InternalGAME.g:718:1: ( ( rule__Jeu__ObjetsAssignment_9 )* )
            // InternalGAME.g:719:2: ( rule__Jeu__ObjetsAssignment_9 )*
            {
             before(grammarAccess.getJeuAccess().getObjetsAssignment_9()); 
            // InternalGAME.g:720:2: ( rule__Jeu__ObjetsAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGAME.g:720:3: rule__Jeu__ObjetsAssignment_9
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
    // InternalGAME.g:728:1: rule__Jeu__Group__10 : rule__Jeu__Group__10__Impl rule__Jeu__Group__11 ;
    public final void rule__Jeu__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:732:1: ( rule__Jeu__Group__10__Impl rule__Jeu__Group__11 )
            // InternalGAME.g:733:2: rule__Jeu__Group__10__Impl rule__Jeu__Group__11
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
    // InternalGAME.g:740:1: rule__Jeu__Group__10__Impl : ( ( rule__Jeu__ConnaissancesAssignment_10 )* ) ;
    public final void rule__Jeu__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:744:1: ( ( ( rule__Jeu__ConnaissancesAssignment_10 )* ) )
            // InternalGAME.g:745:1: ( ( rule__Jeu__ConnaissancesAssignment_10 )* )
            {
            // InternalGAME.g:745:1: ( ( rule__Jeu__ConnaissancesAssignment_10 )* )
            // InternalGAME.g:746:2: ( rule__Jeu__ConnaissancesAssignment_10 )*
            {
             before(grammarAccess.getJeuAccess().getConnaissancesAssignment_10()); 
            // InternalGAME.g:747:2: ( rule__Jeu__ConnaissancesAssignment_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==41) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGAME.g:747:3: rule__Jeu__ConnaissancesAssignment_10
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Jeu__ConnaissancesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getConnaissancesAssignment_10()); 

            }


            }

        }
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
    // InternalGAME.g:755:1: rule__Jeu__Group__11 : rule__Jeu__Group__11__Impl rule__Jeu__Group__12 ;
    public final void rule__Jeu__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:759:1: ( rule__Jeu__Group__11__Impl rule__Jeu__Group__12 )
            // InternalGAME.g:760:2: rule__Jeu__Group__11__Impl rule__Jeu__Group__12
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
    // InternalGAME.g:767:1: rule__Jeu__Group__11__Impl : ( ( rule__Jeu__PersonnesAssignment_11 )* ) ;
    public final void rule__Jeu__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:771:1: ( ( ( rule__Jeu__PersonnesAssignment_11 )* ) )
            // InternalGAME.g:772:1: ( ( rule__Jeu__PersonnesAssignment_11 )* )
            {
            // InternalGAME.g:772:1: ( ( rule__Jeu__PersonnesAssignment_11 )* )
            // InternalGAME.g:773:2: ( rule__Jeu__PersonnesAssignment_11 )*
            {
             before(grammarAccess.getJeuAccess().getPersonnesAssignment_11()); 
            // InternalGAME.g:774:2: ( rule__Jeu__PersonnesAssignment_11 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGAME.g:774:3: rule__Jeu__PersonnesAssignment_11
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Jeu__PersonnesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getPersonnesAssignment_11()); 

            }


            }

        }
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
    // InternalGAME.g:782:1: rule__Jeu__Group__12 : rule__Jeu__Group__12__Impl rule__Jeu__Group__13 ;
    public final void rule__Jeu__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:786:1: ( rule__Jeu__Group__12__Impl rule__Jeu__Group__13 )
            // InternalGAME.g:787:2: rule__Jeu__Group__12__Impl rule__Jeu__Group__13
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
    // InternalGAME.g:794:1: rule__Jeu__Group__12__Impl : ( ( rule__Jeu__CheminsAssignment_12 )* ) ;
    public final void rule__Jeu__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:798:1: ( ( ( rule__Jeu__CheminsAssignment_12 )* ) )
            // InternalGAME.g:799:1: ( ( rule__Jeu__CheminsAssignment_12 )* )
            {
            // InternalGAME.g:799:1: ( ( rule__Jeu__CheminsAssignment_12 )* )
            // InternalGAME.g:800:2: ( rule__Jeu__CheminsAssignment_12 )*
            {
             before(grammarAccess.getJeuAccess().getCheminsAssignment_12()); 
            // InternalGAME.g:801:2: ( rule__Jeu__CheminsAssignment_12 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGAME.g:801:3: rule__Jeu__CheminsAssignment_12
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Jeu__CheminsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getCheminsAssignment_12()); 

            }


            }

        }
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
    // InternalGAME.g:809:1: rule__Jeu__Group__13 : rule__Jeu__Group__13__Impl ;
    public final void rule__Jeu__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:813:1: ( rule__Jeu__Group__13__Impl )
            // InternalGAME.g:814:2: rule__Jeu__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__13__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:820:1: rule__Jeu__Group__13__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:824:1: ( ( '}' ) )
            // InternalGAME.g:825:1: ( '}' )
            {
            // InternalGAME.g:825:1: ( '}' )
            // InternalGAME.g:826:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalGAME.g:836:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:840:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGAME.g:841:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
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
    // InternalGAME.g:848:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:852:1: ( ( 'chemin' ) )
            // InternalGAME.g:853:1: ( 'chemin' )
            {
            // InternalGAME.g:853:1: ( 'chemin' )
            // InternalGAME.g:854:2: 'chemin'
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
    // InternalGAME.g:863:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:867:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGAME.g:868:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
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
    // InternalGAME.g:875:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__NameAssignment_1 ) ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:879:1: ( ( ( rule__Chemin__NameAssignment_1 ) ) )
            // InternalGAME.g:880:1: ( ( rule__Chemin__NameAssignment_1 ) )
            {
            // InternalGAME.g:880:1: ( ( rule__Chemin__NameAssignment_1 ) )
            // InternalGAME.g:881:2: ( rule__Chemin__NameAssignment_1 )
            {
             before(grammarAccess.getCheminAccess().getNameAssignment_1()); 
            // InternalGAME.g:882:2: ( rule__Chemin__NameAssignment_1 )
            // InternalGAME.g:882:3: rule__Chemin__NameAssignment_1
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
    // InternalGAME.g:890:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:894:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGAME.g:895:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGAME.g:902:1: rule__Chemin__Group__2__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:906:1: ( ( '{' ) )
            // InternalGAME.g:907:1: ( '{' )
            {
            // InternalGAME.g:907:1: ( '{' )
            // InternalGAME.g:908:2: '{'
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
    // InternalGAME.g:917:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:921:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGAME.g:922:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalGAME.g:929:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__DescriptionsAssignment_3 )? ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:933:1: ( ( ( rule__Chemin__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:934:1: ( ( rule__Chemin__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:934:1: ( ( rule__Chemin__DescriptionsAssignment_3 )? )
            // InternalGAME.g:935:2: ( rule__Chemin__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getCheminAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:936:2: ( rule__Chemin__DescriptionsAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGAME.g:936:3: rule__Chemin__DescriptionsAssignment_3
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
    // InternalGAME.g:944:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:948:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGAME.g:949:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
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
    // InternalGAME.g:956:1: rule__Chemin__Group__4__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:960:1: ( ( 'de' ) )
            // InternalGAME.g:961:1: ( 'de' )
            {
            // InternalGAME.g:961:1: ( 'de' )
            // InternalGAME.g:962:2: 'de'
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
    // InternalGAME.g:971:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:975:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGAME.g:976:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalGAME.g:983:1: rule__Chemin__Group__5__Impl : ( ( rule__Chemin__DepartAssignment_5 ) ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:987:1: ( ( ( rule__Chemin__DepartAssignment_5 ) ) )
            // InternalGAME.g:988:1: ( ( rule__Chemin__DepartAssignment_5 ) )
            {
            // InternalGAME.g:988:1: ( ( rule__Chemin__DepartAssignment_5 ) )
            // InternalGAME.g:989:2: ( rule__Chemin__DepartAssignment_5 )
            {
             before(grammarAccess.getCheminAccess().getDepartAssignment_5()); 
            // InternalGAME.g:990:2: ( rule__Chemin__DepartAssignment_5 )
            // InternalGAME.g:990:3: rule__Chemin__DepartAssignment_5
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
    // InternalGAME.g:998:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1002:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGAME.g:1003:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
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
    // InternalGAME.g:1010:1: rule__Chemin__Group__6__Impl : ( 'vers' ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1014:1: ( ( 'vers' ) )
            // InternalGAME.g:1015:1: ( 'vers' )
            {
            // InternalGAME.g:1015:1: ( 'vers' )
            // InternalGAME.g:1016:2: 'vers'
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
    // InternalGAME.g:1025:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1029:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGAME.g:1030:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1037:1: rule__Chemin__Group__7__Impl : ( ( rule__Chemin__ArriveAssignment_7 ) ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1041:1: ( ( ( rule__Chemin__ArriveAssignment_7 ) ) )
            // InternalGAME.g:1042:1: ( ( rule__Chemin__ArriveAssignment_7 ) )
            {
            // InternalGAME.g:1042:1: ( ( rule__Chemin__ArriveAssignment_7 ) )
            // InternalGAME.g:1043:2: ( rule__Chemin__ArriveAssignment_7 )
            {
             before(grammarAccess.getCheminAccess().getArriveAssignment_7()); 
            // InternalGAME.g:1044:2: ( rule__Chemin__ArriveAssignment_7 )
            // InternalGAME.g:1044:3: rule__Chemin__ArriveAssignment_7
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
    // InternalGAME.g:1052:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1056:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGAME.g:1057:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalGAME.g:1064:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__VisibiliteAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1068:1: ( ( ( rule__Chemin__VisibiliteAssignment_8 ) ) )
            // InternalGAME.g:1069:1: ( ( rule__Chemin__VisibiliteAssignment_8 ) )
            {
            // InternalGAME.g:1069:1: ( ( rule__Chemin__VisibiliteAssignment_8 ) )
            // InternalGAME.g:1070:2: ( rule__Chemin__VisibiliteAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getVisibiliteAssignment_8()); 
            // InternalGAME.g:1071:2: ( rule__Chemin__VisibiliteAssignment_8 )
            // InternalGAME.g:1071:3: rule__Chemin__VisibiliteAssignment_8
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
    // InternalGAME.g:1079:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1083:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGAME.g:1084:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalGAME.g:1091:1: rule__Chemin__Group__9__Impl : ( ( rule__Chemin__Group_9__0 )? ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1095:1: ( ( ( rule__Chemin__Group_9__0 )? ) )
            // InternalGAME.g:1096:1: ( ( rule__Chemin__Group_9__0 )? )
            {
            // InternalGAME.g:1096:1: ( ( rule__Chemin__Group_9__0 )? )
            // InternalGAME.g:1097:2: ( rule__Chemin__Group_9__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_9()); 
            // InternalGAME.g:1098:2: ( rule__Chemin__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGAME.g:1098:3: rule__Chemin__Group_9__0
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
    // InternalGAME.g:1106:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1110:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGAME.g:1111:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalGAME.g:1118:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__OuvertureAssignment_10 ) ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1122:1: ( ( ( rule__Chemin__OuvertureAssignment_10 ) ) )
            // InternalGAME.g:1123:1: ( ( rule__Chemin__OuvertureAssignment_10 ) )
            {
            // InternalGAME.g:1123:1: ( ( rule__Chemin__OuvertureAssignment_10 ) )
            // InternalGAME.g:1124:2: ( rule__Chemin__OuvertureAssignment_10 )
            {
             before(grammarAccess.getCheminAccess().getOuvertureAssignment_10()); 
            // InternalGAME.g:1125:2: ( rule__Chemin__OuvertureAssignment_10 )
            // InternalGAME.g:1125:3: rule__Chemin__OuvertureAssignment_10
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
    // InternalGAME.g:1133:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl rule__Chemin__Group__12 ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1137:1: ( rule__Chemin__Group__11__Impl rule__Chemin__Group__12 )
            // InternalGAME.g:1138:2: rule__Chemin__Group__11__Impl rule__Chemin__Group__12
            {
            pushFollow(FOLLOW_19);
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
    // InternalGAME.g:1145:1: rule__Chemin__Group__11__Impl : ( ( rule__Chemin__Group_11__0 )? ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1149:1: ( ( ( rule__Chemin__Group_11__0 )? ) )
            // InternalGAME.g:1150:1: ( ( rule__Chemin__Group_11__0 )? )
            {
            // InternalGAME.g:1150:1: ( ( rule__Chemin__Group_11__0 )? )
            // InternalGAME.g:1151:2: ( rule__Chemin__Group_11__0 )?
            {
             before(grammarAccess.getCheminAccess().getGroup_11()); 
            // InternalGAME.g:1152:2: ( rule__Chemin__Group_11__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGAME.g:1152:3: rule__Chemin__Group_11__0
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
    // InternalGAME.g:1160:1: rule__Chemin__Group__12 : rule__Chemin__Group__12__Impl ;
    public final void rule__Chemin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1164:1: ( rule__Chemin__Group__12__Impl )
            // InternalGAME.g:1165:2: rule__Chemin__Group__12__Impl
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
    // InternalGAME.g:1171:1: rule__Chemin__Group__12__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1175:1: ( ( '}' ) )
            // InternalGAME.g:1176:1: ( '}' )
            {
            // InternalGAME.g:1176:1: ( '}' )
            // InternalGAME.g:1177:2: '}'
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
    // InternalGAME.g:1187:1: rule__Chemin__Group_9__0 : rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 ;
    public final void rule__Chemin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1191:1: ( rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1 )
            // InternalGAME.g:1192:2: rule__Chemin__Group_9__0__Impl rule__Chemin__Group_9__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGAME.g:1199:1: rule__Chemin__Group_9__0__Impl : ( 'si' ) ;
    public final void rule__Chemin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1203:1: ( ( 'si' ) )
            // InternalGAME.g:1204:1: ( 'si' )
            {
            // InternalGAME.g:1204:1: ( 'si' )
            // InternalGAME.g:1205:2: 'si'
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
    // InternalGAME.g:1214:1: rule__Chemin__Group_9__1 : rule__Chemin__Group_9__1__Impl ;
    public final void rule__Chemin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1218:1: ( rule__Chemin__Group_9__1__Impl )
            // InternalGAME.g:1219:2: rule__Chemin__Group_9__1__Impl
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
    // InternalGAME.g:1225:1: rule__Chemin__Group_9__1__Impl : ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) ) ;
    public final void rule__Chemin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1229:1: ( ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) ) )
            // InternalGAME.g:1230:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) )
            {
            // InternalGAME.g:1230:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 ) )
            // InternalGAME.g:1231:2: ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 )
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_9_1()); 
            // InternalGAME.g:1232:2: ( rule__Chemin__ConditionsVisibiliteAssignment_9_1 )
            // InternalGAME.g:1232:3: rule__Chemin__ConditionsVisibiliteAssignment_9_1
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
    // InternalGAME.g:1241:1: rule__Chemin__Group_11__0 : rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1 ;
    public final void rule__Chemin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1245:1: ( rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1 )
            // InternalGAME.g:1246:2: rule__Chemin__Group_11__0__Impl rule__Chemin__Group_11__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGAME.g:1253:1: rule__Chemin__Group_11__0__Impl : ( 'si' ) ;
    public final void rule__Chemin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1257:1: ( ( 'si' ) )
            // InternalGAME.g:1258:1: ( 'si' )
            {
            // InternalGAME.g:1258:1: ( 'si' )
            // InternalGAME.g:1259:2: 'si'
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
    // InternalGAME.g:1268:1: rule__Chemin__Group_11__1 : rule__Chemin__Group_11__1__Impl ;
    public final void rule__Chemin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1272:1: ( rule__Chemin__Group_11__1__Impl )
            // InternalGAME.g:1273:2: rule__Chemin__Group_11__1__Impl
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
    // InternalGAME.g:1279:1: rule__Chemin__Group_11__1__Impl : ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) ) ;
    public final void rule__Chemin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1283:1: ( ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) ) )
            // InternalGAME.g:1284:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) )
            {
            // InternalGAME.g:1284:1: ( ( rule__Chemin__ConditionsOuvertureAssignment_11_1 ) )
            // InternalGAME.g:1285:2: ( rule__Chemin__ConditionsOuvertureAssignment_11_1 )
            {
             before(grammarAccess.getCheminAccess().getConditionsOuvertureAssignment_11_1()); 
            // InternalGAME.g:1286:2: ( rule__Chemin__ConditionsOuvertureAssignment_11_1 )
            // InternalGAME.g:1286:3: rule__Chemin__ConditionsOuvertureAssignment_11_1
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
    // InternalGAME.g:1295:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1299:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGAME.g:1300:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
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
    // InternalGAME.g:1307:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1311:1: ( ( 'personne' ) )
            // InternalGAME.g:1312:1: ( 'personne' )
            {
            // InternalGAME.g:1312:1: ( 'personne' )
            // InternalGAME.g:1313:2: 'personne'
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
    // InternalGAME.g:1322:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1326:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGAME.g:1327:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
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
    // InternalGAME.g:1334:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1338:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGAME.g:1339:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGAME.g:1339:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGAME.g:1340:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGAME.g:1341:2: ( rule__Personne__NameAssignment_1 )
            // InternalGAME.g:1341:3: rule__Personne__NameAssignment_1
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
    // InternalGAME.g:1349:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1353:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGAME.g:1354:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalGAME.g:1361:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1365:1: ( ( '{' ) )
            // InternalGAME.g:1366:1: ( '{' )
            {
            // InternalGAME.g:1366:1: ( '{' )
            // InternalGAME.g:1367:2: '{'
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
    // InternalGAME.g:1376:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1380:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGAME.g:1381:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalGAME.g:1388:1: rule__Personne__Group__3__Impl : ( ( rule__Personne__DescriptionsAssignment_3 ) ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1392:1: ( ( ( rule__Personne__DescriptionsAssignment_3 ) ) )
            // InternalGAME.g:1393:1: ( ( rule__Personne__DescriptionsAssignment_3 ) )
            {
            // InternalGAME.g:1393:1: ( ( rule__Personne__DescriptionsAssignment_3 ) )
            // InternalGAME.g:1394:2: ( rule__Personne__DescriptionsAssignment_3 )
            {
             before(grammarAccess.getPersonneAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:1395:2: ( rule__Personne__DescriptionsAssignment_3 )
            // InternalGAME.g:1395:3: rule__Personne__DescriptionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Personne__DescriptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
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
    // InternalGAME.g:1403:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1407:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGAME.g:1408:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1415:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__InteractionAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1419:1: ( ( ( rule__Personne__InteractionAssignment_4 ) ) )
            // InternalGAME.g:1420:1: ( ( rule__Personne__InteractionAssignment_4 ) )
            {
            // InternalGAME.g:1420:1: ( ( rule__Personne__InteractionAssignment_4 ) )
            // InternalGAME.g:1421:2: ( rule__Personne__InteractionAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getInteractionAssignment_4()); 
            // InternalGAME.g:1422:2: ( rule__Personne__InteractionAssignment_4 )
            // InternalGAME.g:1422:3: rule__Personne__InteractionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Personne__InteractionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getInteractionAssignment_4()); 

            }


            }

        }
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
    // InternalGAME.g:1430:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1434:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGAME.g:1435:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalGAME.g:1442:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__VisibiliteAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1446:1: ( ( ( rule__Personne__VisibiliteAssignment_5 ) ) )
            // InternalGAME.g:1447:1: ( ( rule__Personne__VisibiliteAssignment_5 ) )
            {
            // InternalGAME.g:1447:1: ( ( rule__Personne__VisibiliteAssignment_5 ) )
            // InternalGAME.g:1448:2: ( rule__Personne__VisibiliteAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getVisibiliteAssignment_5()); 
            // InternalGAME.g:1449:2: ( rule__Personne__VisibiliteAssignment_5 )
            // InternalGAME.g:1449:3: rule__Personne__VisibiliteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Personne__VisibiliteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getVisibiliteAssignment_5()); 

            }


            }

        }
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
    // InternalGAME.g:1457:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1461:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalGAME.g:1462:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalGAME.g:1469:1: rule__Personne__Group__6__Impl : ( ( rule__Personne__Group_6__0 )? ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1473:1: ( ( ( rule__Personne__Group_6__0 )? ) )
            // InternalGAME.g:1474:1: ( ( rule__Personne__Group_6__0 )? )
            {
            // InternalGAME.g:1474:1: ( ( rule__Personne__Group_6__0 )? )
            // InternalGAME.g:1475:2: ( rule__Personne__Group_6__0 )?
            {
             before(grammarAccess.getPersonneAccess().getGroup_6()); 
            // InternalGAME.g:1476:2: ( rule__Personne__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGAME.g:1476:3: rule__Personne__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalGAME.g:1484:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1488:1: ( rule__Personne__Group__7__Impl )
            // InternalGAME.g:1489:2: rule__Personne__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:1495:1: rule__Personne__Group__7__Impl : ( '}' ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1499:1: ( ( '}' ) )
            // InternalGAME.g:1500:1: ( '}' )
            {
            // InternalGAME.g:1500:1: ( '}' )
            // InternalGAME.g:1501:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Personne__Group_6__0"
    // InternalGAME.g:1511:1: rule__Personne__Group_6__0 : rule__Personne__Group_6__0__Impl rule__Personne__Group_6__1 ;
    public final void rule__Personne__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1515:1: ( rule__Personne__Group_6__0__Impl rule__Personne__Group_6__1 )
            // InternalGAME.g:1516:2: rule__Personne__Group_6__0__Impl rule__Personne__Group_6__1
            {
            pushFollow(FOLLOW_20);
            rule__Personne__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_6__0"


    // $ANTLR start "rule__Personne__Group_6__0__Impl"
    // InternalGAME.g:1523:1: rule__Personne__Group_6__0__Impl : ( 'si' ) ;
    public final void rule__Personne__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1527:1: ( ( 'si' ) )
            // InternalGAME.g:1528:1: ( 'si' )
            {
            // InternalGAME.g:1528:1: ( 'si' )
            // InternalGAME.g:1529:2: 'si'
            {
             before(grammarAccess.getPersonneAccess().getSiKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getSiKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_6__0__Impl"


    // $ANTLR start "rule__Personne__Group_6__1"
    // InternalGAME.g:1538:1: rule__Personne__Group_6__1 : rule__Personne__Group_6__1__Impl ;
    public final void rule__Personne__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1542:1: ( rule__Personne__Group_6__1__Impl )
            // InternalGAME.g:1543:2: rule__Personne__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_6__1"


    // $ANTLR start "rule__Personne__Group_6__1__Impl"
    // InternalGAME.g:1549:1: rule__Personne__Group_6__1__Impl : ( ( rule__Personne__ConditionsVisibiliteAssignment_6_1 ) ) ;
    public final void rule__Personne__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1553:1: ( ( ( rule__Personne__ConditionsVisibiliteAssignment_6_1 ) ) )
            // InternalGAME.g:1554:1: ( ( rule__Personne__ConditionsVisibiliteAssignment_6_1 ) )
            {
            // InternalGAME.g:1554:1: ( ( rule__Personne__ConditionsVisibiliteAssignment_6_1 ) )
            // InternalGAME.g:1555:2: ( rule__Personne__ConditionsVisibiliteAssignment_6_1 )
            {
             before(grammarAccess.getPersonneAccess().getConditionsVisibiliteAssignment_6_1()); 
            // InternalGAME.g:1556:2: ( rule__Personne__ConditionsVisibiliteAssignment_6_1 )
            // InternalGAME.g:1556:3: rule__Personne__ConditionsVisibiliteAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ConditionsVisibiliteAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getConditionsVisibiliteAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__Group_6__1__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGAME.g:1565:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1569:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGAME.g:1570:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGAME.g:1577:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1581:1: ( ( 'interaction' ) )
            // InternalGAME.g:1582:1: ( 'interaction' )
            {
            // InternalGAME.g:1582:1: ( 'interaction' )
            // InternalGAME.g:1583:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGAME.g:1592:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1596:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGAME.g:1597:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalGAME.g:1604:1: rule__Interaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1608:1: ( ( '{' ) )
            // InternalGAME.g:1609:1: ( '{' )
            {
            // InternalGAME.g:1609:1: ( '{' )
            // InternalGAME.g:1610:2: '{'
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
    // InternalGAME.g:1619:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1623:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGAME.g:1624:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalGAME.g:1631:1: rule__Interaction__Group__2__Impl : ( ( rule__Interaction__EchangesAssignment_2 )* ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1635:1: ( ( ( rule__Interaction__EchangesAssignment_2 )* ) )
            // InternalGAME.g:1636:1: ( ( rule__Interaction__EchangesAssignment_2 )* )
            {
            // InternalGAME.g:1636:1: ( ( rule__Interaction__EchangesAssignment_2 )* )
            // InternalGAME.g:1637:2: ( rule__Interaction__EchangesAssignment_2 )*
            {
             before(grammarAccess.getInteractionAccess().getEchangesAssignment_2()); 
            // InternalGAME.g:1638:2: ( rule__Interaction__EchangesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGAME.g:1638:3: rule__Interaction__EchangesAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Interaction__EchangesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalGAME.g:1646:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1650:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalGAME.g:1651:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalGAME.g:1658:1: rule__Interaction__Group__3__Impl : ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1662:1: ( ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) ) )
            // InternalGAME.g:1663:1: ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) )
            {
            // InternalGAME.g:1663:1: ( ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* ) )
            // InternalGAME.g:1664:2: ( ( rule__Interaction__ChoixAssignment_3 ) ) ( ( rule__Interaction__ChoixAssignment_3 )* )
            {
            // InternalGAME.g:1664:2: ( ( rule__Interaction__ChoixAssignment_3 ) )
            // InternalGAME.g:1665:3: ( rule__Interaction__ChoixAssignment_3 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 
            // InternalGAME.g:1666:3: ( rule__Interaction__ChoixAssignment_3 )
            // InternalGAME.g:1666:4: rule__Interaction__ChoixAssignment_3
            {
            pushFollow(FOLLOW_26);
            rule__Interaction__ChoixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 

            }

            // InternalGAME.g:1669:2: ( ( rule__Interaction__ChoixAssignment_3 )* )
            // InternalGAME.g:1670:3: ( rule__Interaction__ChoixAssignment_3 )*
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 
            // InternalGAME.g:1671:3: ( rule__Interaction__ChoixAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGAME.g:1671:4: rule__Interaction__ChoixAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Interaction__ChoixAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGAME.g:1680:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1684:1: ( rule__Interaction__Group__4__Impl )
            // InternalGAME.g:1685:2: rule__Interaction__Group__4__Impl
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
    // InternalGAME.g:1691:1: rule__Interaction__Group__4__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1695:1: ( ( '}' ) )
            // InternalGAME.g:1696:1: ( '}' )
            {
            // InternalGAME.g:1696:1: ( '}' )
            // InternalGAME.g:1697:2: '}'
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
    // InternalGAME.g:1707:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1711:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGAME.g:1712:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
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
    // InternalGAME.g:1719:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1723:1: ( ( 'choix' ) )
            // InternalGAME.g:1724:1: ( 'choix' )
            {
            // InternalGAME.g:1724:1: ( 'choix' )
            // InternalGAME.g:1725:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGAME.g:1734:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1738:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGAME.g:1739:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
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
    // InternalGAME.g:1746:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1750:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGAME.g:1751:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGAME.g:1751:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGAME.g:1752:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGAME.g:1753:2: ( rule__Choix__NameAssignment_1 )
            // InternalGAME.g:1753:3: rule__Choix__NameAssignment_1
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
    // InternalGAME.g:1761:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1765:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGAME.g:1766:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalGAME.g:1773:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1777:1: ( ( '{' ) )
            // InternalGAME.g:1778:1: ( '{' )
            {
            // InternalGAME.g:1778:1: ( '{' )
            // InternalGAME.g:1779:2: '{'
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
    // InternalGAME.g:1788:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1792:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalGAME.g:1793:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalGAME.g:1800:1: rule__Choix__Group__3__Impl : ( ( rule__Choix__ActionsAssignment_3 )* ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1804:1: ( ( ( rule__Choix__ActionsAssignment_3 )* ) )
            // InternalGAME.g:1805:1: ( ( rule__Choix__ActionsAssignment_3 )* )
            {
            // InternalGAME.g:1805:1: ( ( rule__Choix__ActionsAssignment_3 )* )
            // InternalGAME.g:1806:2: ( rule__Choix__ActionsAssignment_3 )*
            {
             before(grammarAccess.getChoixAccess().getActionsAssignment_3()); 
            // InternalGAME.g:1807:2: ( rule__Choix__ActionsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGAME.g:1807:3: rule__Choix__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Choix__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGAME.g:1815:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1819:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalGAME.g:1820:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalGAME.g:1827:1: rule__Choix__Group__4__Impl : ( ( rule__Choix__ConditionsAssignment_4 )* ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1831:1: ( ( ( rule__Choix__ConditionsAssignment_4 )* ) )
            // InternalGAME.g:1832:1: ( ( rule__Choix__ConditionsAssignment_4 )* )
            {
            // InternalGAME.g:1832:1: ( ( rule__Choix__ConditionsAssignment_4 )* )
            // InternalGAME.g:1833:2: ( rule__Choix__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getChoixAccess().getConditionsAssignment_4()); 
            // InternalGAME.g:1834:2: ( rule__Choix__ConditionsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGAME.g:1834:3: rule__Choix__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Choix__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalGAME.g:1842:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1846:1: ( rule__Choix__Group__5__Impl )
            // InternalGAME.g:1847:2: rule__Choix__Group__5__Impl
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
    // InternalGAME.g:1853:1: rule__Choix__Group__5__Impl : ( '}' ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1857:1: ( ( '}' ) )
            // InternalGAME.g:1858:1: ( '}' )
            {
            // InternalGAME.g:1858:1: ( '}' )
            // InternalGAME.g:1859:2: '}'
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
    // InternalGAME.g:1869:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1873:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGAME.g:1874:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalGAME.g:1881:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1885:1: ( ( 'action' ) )
            // InternalGAME.g:1886:1: ( 'action' )
            {
            // InternalGAME.g:1886:1: ( 'action' )
            // InternalGAME.g:1887:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGAME.g:1896:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1900:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalGAME.g:1901:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // InternalGAME.g:1908:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1912:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalGAME.g:1913:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalGAME.g:1913:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalGAME.g:1914:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalGAME.g:1915:2: ( rule__Action__NameAssignment_1 )
            // InternalGAME.g:1915:3: rule__Action__NameAssignment_1
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
    // InternalGAME.g:1923:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1927:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalGAME.g:1928:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalGAME.g:1935:1: rule__Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1939:1: ( ( '{' ) )
            // InternalGAME.g:1940:1: ( '{' )
            {
            // InternalGAME.g:1940:1: ( '{' )
            // InternalGAME.g:1941:2: '{'
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
    // InternalGAME.g:1950:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1954:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalGAME.g:1955:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalGAME.g:1962:1: rule__Action__Group__3__Impl : ( ( rule__Action__DescriptionsAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1966:1: ( ( ( rule__Action__DescriptionsAssignment_3 ) ) )
            // InternalGAME.g:1967:1: ( ( rule__Action__DescriptionsAssignment_3 ) )
            {
            // InternalGAME.g:1967:1: ( ( rule__Action__DescriptionsAssignment_3 ) )
            // InternalGAME.g:1968:2: ( rule__Action__DescriptionsAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:1969:2: ( rule__Action__DescriptionsAssignment_3 )
            // InternalGAME.g:1969:3: rule__Action__DescriptionsAssignment_3
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
    // InternalGAME.g:1977:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1981:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalGAME.g:1982:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalGAME.g:1989:1: rule__Action__Group__4__Impl : ( ( rule__Action__ConditionsAssignment_4 )* ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1993:1: ( ( ( rule__Action__ConditionsAssignment_4 )* ) )
            // InternalGAME.g:1994:1: ( ( rule__Action__ConditionsAssignment_4 )* )
            {
            // InternalGAME.g:1994:1: ( ( rule__Action__ConditionsAssignment_4 )* )
            // InternalGAME.g:1995:2: ( rule__Action__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getActionAccess().getConditionsAssignment_4()); 
            // InternalGAME.g:1996:2: ( rule__Action__ConditionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGAME.g:1996:3: rule__Action__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Action__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalGAME.g:2004:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2008:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalGAME.g:2009:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalGAME.g:2016:1: rule__Action__Group__5__Impl : ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2020:1: ( ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) ) )
            // InternalGAME.g:2021:1: ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) )
            {
            // InternalGAME.g:2021:1: ( ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* ) )
            // InternalGAME.g:2022:2: ( ( rule__Action__EchangesAssignment_5 ) ) ( ( rule__Action__EchangesAssignment_5 )* )
            {
            // InternalGAME.g:2022:2: ( ( rule__Action__EchangesAssignment_5 ) )
            // InternalGAME.g:2023:3: ( rule__Action__EchangesAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getEchangesAssignment_5()); 
            // InternalGAME.g:2024:3: ( rule__Action__EchangesAssignment_5 )
            // InternalGAME.g:2024:4: rule__Action__EchangesAssignment_5
            {
            pushFollow(FOLLOW_31);
            rule__Action__EchangesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getEchangesAssignment_5()); 

            }

            // InternalGAME.g:2027:2: ( ( rule__Action__EchangesAssignment_5 )* )
            // InternalGAME.g:2028:3: ( rule__Action__EchangesAssignment_5 )*
            {
             before(grammarAccess.getActionAccess().getEchangesAssignment_5()); 
            // InternalGAME.g:2029:3: ( rule__Action__EchangesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGAME.g:2029:4: rule__Action__EchangesAssignment_5
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Action__EchangesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGAME.g:2038:1: rule__Action__Group__6 : rule__Action__Group__6__Impl ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2042:1: ( rule__Action__Group__6__Impl )
            // InternalGAME.g:2043:2: rule__Action__Group__6__Impl
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
    // InternalGAME.g:2049:1: rule__Action__Group__6__Impl : ( '}' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2053:1: ( ( '}' ) )
            // InternalGAME.g:2054:1: ( '}' )
            {
            // InternalGAME.g:2054:1: ( '}' )
            // InternalGAME.g:2055:2: '}'
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
    // InternalGAME.g:2065:1: rule__Echange__Group__0 : rule__Echange__Group__0__Impl rule__Echange__Group__1 ;
    public final void rule__Echange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2069:1: ( rule__Echange__Group__0__Impl rule__Echange__Group__1 )
            // InternalGAME.g:2070:2: rule__Echange__Group__0__Impl rule__Echange__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalGAME.g:2077:1: rule__Echange__Group__0__Impl : ( () ) ;
    public final void rule__Echange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2081:1: ( ( () ) )
            // InternalGAME.g:2082:1: ( () )
            {
            // InternalGAME.g:2082:1: ( () )
            // InternalGAME.g:2083:2: ()
            {
             before(grammarAccess.getEchangeAccess().getEchangeAction_0()); 
            // InternalGAME.g:2084:2: ()
            // InternalGAME.g:2084:3: 
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
    // InternalGAME.g:2092:1: rule__Echange__Group__1 : rule__Echange__Group__1__Impl rule__Echange__Group__2 ;
    public final void rule__Echange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2096:1: ( rule__Echange__Group__1__Impl rule__Echange__Group__2 )
            // InternalGAME.g:2097:2: rule__Echange__Group__1__Impl rule__Echange__Group__2
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
    // InternalGAME.g:2104:1: rule__Echange__Group__1__Impl : ( 'echange' ) ;
    public final void rule__Echange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2108:1: ( ( 'echange' ) )
            // InternalGAME.g:2109:1: ( 'echange' )
            {
            // InternalGAME.g:2109:1: ( 'echange' )
            // InternalGAME.g:2110:2: 'echange'
            {
             before(grammarAccess.getEchangeAccess().getEchangeKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGAME.g:2119:1: rule__Echange__Group__2 : rule__Echange__Group__2__Impl rule__Echange__Group__3 ;
    public final void rule__Echange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2123:1: ( rule__Echange__Group__2__Impl rule__Echange__Group__3 )
            // InternalGAME.g:2124:2: rule__Echange__Group__2__Impl rule__Echange__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalGAME.g:2131:1: rule__Echange__Group__2__Impl : ( '{' ) ;
    public final void rule__Echange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2135:1: ( ( '{' ) )
            // InternalGAME.g:2136:1: ( '{' )
            {
            // InternalGAME.g:2136:1: ( '{' )
            // InternalGAME.g:2137:2: '{'
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
    // InternalGAME.g:2146:1: rule__Echange__Group__3 : rule__Echange__Group__3__Impl rule__Echange__Group__4 ;
    public final void rule__Echange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2150:1: ( rule__Echange__Group__3__Impl rule__Echange__Group__4 )
            // InternalGAME.g:2151:2: rule__Echange__Group__3__Impl rule__Echange__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalGAME.g:2158:1: rule__Echange__Group__3__Impl : ( ( rule__Echange__Group_3__0 )? ) ;
    public final void rule__Echange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2162:1: ( ( ( rule__Echange__Group_3__0 )? ) )
            // InternalGAME.g:2163:1: ( ( rule__Echange__Group_3__0 )? )
            {
            // InternalGAME.g:2163:1: ( ( rule__Echange__Group_3__0 )? )
            // InternalGAME.g:2164:2: ( rule__Echange__Group_3__0 )?
            {
             before(grammarAccess.getEchangeAccess().getGroup_3()); 
            // InternalGAME.g:2165:2: ( rule__Echange__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGAME.g:2165:3: rule__Echange__Group_3__0
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
    // InternalGAME.g:2173:1: rule__Echange__Group__4 : rule__Echange__Group__4__Impl rule__Echange__Group__5 ;
    public final void rule__Echange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2177:1: ( rule__Echange__Group__4__Impl rule__Echange__Group__5 )
            // InternalGAME.g:2178:2: rule__Echange__Group__4__Impl rule__Echange__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalGAME.g:2185:1: rule__Echange__Group__4__Impl : ( ( rule__Echange__Group_4__0 )? ) ;
    public final void rule__Echange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2189:1: ( ( ( rule__Echange__Group_4__0 )? ) )
            // InternalGAME.g:2190:1: ( ( rule__Echange__Group_4__0 )? )
            {
            // InternalGAME.g:2190:1: ( ( rule__Echange__Group_4__0 )? )
            // InternalGAME.g:2191:2: ( rule__Echange__Group_4__0 )?
            {
             before(grammarAccess.getEchangeAccess().getGroup_4()); 
            // InternalGAME.g:2192:2: ( rule__Echange__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGAME.g:2192:3: rule__Echange__Group_4__0
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
    // InternalGAME.g:2200:1: rule__Echange__Group__5 : rule__Echange__Group__5__Impl rule__Echange__Group__6 ;
    public final void rule__Echange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2204:1: ( rule__Echange__Group__5__Impl rule__Echange__Group__6 )
            // InternalGAME.g:2205:2: rule__Echange__Group__5__Impl rule__Echange__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalGAME.g:2212:1: rule__Echange__Group__5__Impl : ( ( rule__Echange__Group_5__0 )? ) ;
    public final void rule__Echange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2216:1: ( ( ( rule__Echange__Group_5__0 )? ) )
            // InternalGAME.g:2217:1: ( ( rule__Echange__Group_5__0 )? )
            {
            // InternalGAME.g:2217:1: ( ( rule__Echange__Group_5__0 )? )
            // InternalGAME.g:2218:2: ( rule__Echange__Group_5__0 )?
            {
             before(grammarAccess.getEchangeAccess().getGroup_5()); 
            // InternalGAME.g:2219:2: ( rule__Echange__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGAME.g:2219:3: rule__Echange__Group_5__0
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
    // InternalGAME.g:2227:1: rule__Echange__Group__6 : rule__Echange__Group__6__Impl rule__Echange__Group__7 ;
    public final void rule__Echange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2231:1: ( rule__Echange__Group__6__Impl rule__Echange__Group__7 )
            // InternalGAME.g:2232:2: rule__Echange__Group__6__Impl rule__Echange__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalGAME.g:2239:1: rule__Echange__Group__6__Impl : ( ( rule__Echange__ConditionsAssignment_6 )* ) ;
    public final void rule__Echange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2243:1: ( ( ( rule__Echange__ConditionsAssignment_6 )* ) )
            // InternalGAME.g:2244:1: ( ( rule__Echange__ConditionsAssignment_6 )* )
            {
            // InternalGAME.g:2244:1: ( ( rule__Echange__ConditionsAssignment_6 )* )
            // InternalGAME.g:2245:2: ( rule__Echange__ConditionsAssignment_6 )*
            {
             before(grammarAccess.getEchangeAccess().getConditionsAssignment_6()); 
            // InternalGAME.g:2246:2: ( rule__Echange__ConditionsAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGAME.g:2246:3: rule__Echange__ConditionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Echange__ConditionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGAME.g:2254:1: rule__Echange__Group__7 : rule__Echange__Group__7__Impl ;
    public final void rule__Echange__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2258:1: ( rule__Echange__Group__7__Impl )
            // InternalGAME.g:2259:2: rule__Echange__Group__7__Impl
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
    // InternalGAME.g:2265:1: rule__Echange__Group__7__Impl : ( '}' ) ;
    public final void rule__Echange__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2269:1: ( ( '}' ) )
            // InternalGAME.g:2270:1: ( '}' )
            {
            // InternalGAME.g:2270:1: ( '}' )
            // InternalGAME.g:2271:2: '}'
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
    // InternalGAME.g:2281:1: rule__Echange__Group_3__0 : rule__Echange__Group_3__0__Impl rule__Echange__Group_3__1 ;
    public final void rule__Echange__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2285:1: ( rule__Echange__Group_3__0__Impl rule__Echange__Group_3__1 )
            // InternalGAME.g:2286:2: rule__Echange__Group_3__0__Impl rule__Echange__Group_3__1
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
    // InternalGAME.g:2293:1: rule__Echange__Group_3__0__Impl : ( 'objetsDonne' ) ;
    public final void rule__Echange__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2297:1: ( ( 'objetsDonne' ) )
            // InternalGAME.g:2298:1: ( 'objetsDonne' )
            {
            // InternalGAME.g:2298:1: ( 'objetsDonne' )
            // InternalGAME.g:2299:2: 'objetsDonne'
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGAME.g:2308:1: rule__Echange__Group_3__1 : rule__Echange__Group_3__1__Impl ;
    public final void rule__Echange__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2312:1: ( rule__Echange__Group_3__1__Impl )
            // InternalGAME.g:2313:2: rule__Echange__Group_3__1__Impl
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
    // InternalGAME.g:2319:1: rule__Echange__Group_3__1__Impl : ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) ) ;
    public final void rule__Echange__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2323:1: ( ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) ) )
            // InternalGAME.g:2324:1: ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) )
            {
            // InternalGAME.g:2324:1: ( ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* ) )
            // InternalGAME.g:2325:2: ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) ) ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* )
            {
            // InternalGAME.g:2325:2: ( ( rule__Echange__ObjetsDonneAssignment_3_1 ) )
            // InternalGAME.g:2326:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneAssignment_3_1()); 
            // InternalGAME.g:2327:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )
            // InternalGAME.g:2327:4: rule__Echange__ObjetsDonneAssignment_3_1
            {
            pushFollow(FOLLOW_9);
            rule__Echange__ObjetsDonneAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEchangeAccess().getObjetsDonneAssignment_3_1()); 

            }

            // InternalGAME.g:2330:2: ( ( rule__Echange__ObjetsDonneAssignment_3_1 )* )
            // InternalGAME.g:2331:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )*
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneAssignment_3_1()); 
            // InternalGAME.g:2332:3: ( rule__Echange__ObjetsDonneAssignment_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGAME.g:2332:4: rule__Echange__ObjetsDonneAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Echange__ObjetsDonneAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalGAME.g:2342:1: rule__Echange__Group_4__0 : rule__Echange__Group_4__0__Impl rule__Echange__Group_4__1 ;
    public final void rule__Echange__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2346:1: ( rule__Echange__Group_4__0__Impl rule__Echange__Group_4__1 )
            // InternalGAME.g:2347:2: rule__Echange__Group_4__0__Impl rule__Echange__Group_4__1
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
    // InternalGAME.g:2354:1: rule__Echange__Group_4__0__Impl : ( 'objetsPris' ) ;
    public final void rule__Echange__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2358:1: ( ( 'objetsPris' ) )
            // InternalGAME.g:2359:1: ( 'objetsPris' )
            {
            // InternalGAME.g:2359:1: ( 'objetsPris' )
            // InternalGAME.g:2360:2: 'objetsPris'
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGAME.g:2369:1: rule__Echange__Group_4__1 : rule__Echange__Group_4__1__Impl ;
    public final void rule__Echange__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2373:1: ( rule__Echange__Group_4__1__Impl )
            // InternalGAME.g:2374:2: rule__Echange__Group_4__1__Impl
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
    // InternalGAME.g:2380:1: rule__Echange__Group_4__1__Impl : ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) ) ;
    public final void rule__Echange__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2384:1: ( ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) ) )
            // InternalGAME.g:2385:1: ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) )
            {
            // InternalGAME.g:2385:1: ( ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* ) )
            // InternalGAME.g:2386:2: ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) ) ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* )
            {
            // InternalGAME.g:2386:2: ( ( rule__Echange__ObjetsPrisAssignment_4_1 ) )
            // InternalGAME.g:2387:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisAssignment_4_1()); 
            // InternalGAME.g:2388:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )
            // InternalGAME.g:2388:4: rule__Echange__ObjetsPrisAssignment_4_1
            {
            pushFollow(FOLLOW_9);
            rule__Echange__ObjetsPrisAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEchangeAccess().getObjetsPrisAssignment_4_1()); 

            }

            // InternalGAME.g:2391:2: ( ( rule__Echange__ObjetsPrisAssignment_4_1 )* )
            // InternalGAME.g:2392:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )*
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisAssignment_4_1()); 
            // InternalGAME.g:2393:3: ( rule__Echange__ObjetsPrisAssignment_4_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGAME.g:2393:4: rule__Echange__ObjetsPrisAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Echange__ObjetsPrisAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalGAME.g:2403:1: rule__Echange__Group_5__0 : rule__Echange__Group_5__0__Impl rule__Echange__Group_5__1 ;
    public final void rule__Echange__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2407:1: ( rule__Echange__Group_5__0__Impl rule__Echange__Group_5__1 )
            // InternalGAME.g:2408:2: rule__Echange__Group_5__0__Impl rule__Echange__Group_5__1
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
    // InternalGAME.g:2415:1: rule__Echange__Group_5__0__Impl : ( 'connaissancesDonne' ) ;
    public final void rule__Echange__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2419:1: ( ( 'connaissancesDonne' ) )
            // InternalGAME.g:2420:1: ( 'connaissancesDonne' )
            {
            // InternalGAME.g:2420:1: ( 'connaissancesDonne' )
            // InternalGAME.g:2421:2: 'connaissancesDonne'
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesDonneKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGAME.g:2430:1: rule__Echange__Group_5__1 : rule__Echange__Group_5__1__Impl ;
    public final void rule__Echange__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2434:1: ( rule__Echange__Group_5__1__Impl )
            // InternalGAME.g:2435:2: rule__Echange__Group_5__1__Impl
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
    // InternalGAME.g:2441:1: rule__Echange__Group_5__1__Impl : ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) ) ;
    public final void rule__Echange__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2445:1: ( ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) ) )
            // InternalGAME.g:2446:1: ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) )
            {
            // InternalGAME.g:2446:1: ( ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* ) )
            // InternalGAME.g:2447:2: ( ( rule__Echange__ConnaissancesAssignment_5_1 ) ) ( ( rule__Echange__ConnaissancesAssignment_5_1 )* )
            {
            // InternalGAME.g:2447:2: ( ( rule__Echange__ConnaissancesAssignment_5_1 ) )
            // InternalGAME.g:2448:3: ( rule__Echange__ConnaissancesAssignment_5_1 )
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesAssignment_5_1()); 
            // InternalGAME.g:2449:3: ( rule__Echange__ConnaissancesAssignment_5_1 )
            // InternalGAME.g:2449:4: rule__Echange__ConnaissancesAssignment_5_1
            {
            pushFollow(FOLLOW_9);
            rule__Echange__ConnaissancesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEchangeAccess().getConnaissancesAssignment_5_1()); 

            }

            // InternalGAME.g:2452:2: ( ( rule__Echange__ConnaissancesAssignment_5_1 )* )
            // InternalGAME.g:2453:3: ( rule__Echange__ConnaissancesAssignment_5_1 )*
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesAssignment_5_1()); 
            // InternalGAME.g:2454:3: ( rule__Echange__ConnaissancesAssignment_5_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGAME.g:2454:4: rule__Echange__ConnaissancesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Echange__ConnaissancesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGAME.g:2464:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2468:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGAME.g:2469:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
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
    // InternalGAME.g:2476:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2480:1: ( ( 'objet' ) )
            // InternalGAME.g:2481:1: ( 'objet' )
            {
            // InternalGAME.g:2481:1: ( 'objet' )
            // InternalGAME.g:2482:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGAME.g:2491:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2495:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGAME.g:2496:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
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
    // InternalGAME.g:2503:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2507:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGAME.g:2508:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGAME.g:2508:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGAME.g:2509:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGAME.g:2510:2: ( rule__Objet__NameAssignment_1 )
            // InternalGAME.g:2510:3: rule__Objet__NameAssignment_1
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
    // InternalGAME.g:2518:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2522:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGAME.g:2523:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalGAME.g:2530:1: rule__Objet__Group__2__Impl : ( '{' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2534:1: ( ( '{' ) )
            // InternalGAME.g:2535:1: ( '{' )
            {
            // InternalGAME.g:2535:1: ( '{' )
            // InternalGAME.g:2536:2: '{'
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
    // InternalGAME.g:2545:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2549:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGAME.g:2550:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalGAME.g:2557:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__DescriptionsAssignment_3 )? ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2561:1: ( ( ( rule__Objet__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:2562:1: ( ( rule__Objet__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:2562:1: ( ( rule__Objet__DescriptionsAssignment_3 )? )
            // InternalGAME.g:2563:2: ( rule__Objet__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getObjetAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:2564:2: ( rule__Objet__DescriptionsAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGAME.g:2564:3: rule__Objet__DescriptionsAssignment_3
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
    // InternalGAME.g:2572:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2576:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGAME.g:2577:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalGAME.g:2584:1: rule__Objet__Group__4__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2588:1: ( ( 'taille' ) )
            // InternalGAME.g:2589:1: ( 'taille' )
            {
            // InternalGAME.g:2589:1: ( 'taille' )
            // InternalGAME.g:2590:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGAME.g:2599:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2603:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGAME.g:2604:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalGAME.g:2611:1: rule__Objet__Group__5__Impl : ( ( rule__Objet__TailleAssignment_5 ) ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2615:1: ( ( ( rule__Objet__TailleAssignment_5 ) ) )
            // InternalGAME.g:2616:1: ( ( rule__Objet__TailleAssignment_5 ) )
            {
            // InternalGAME.g:2616:1: ( ( rule__Objet__TailleAssignment_5 ) )
            // InternalGAME.g:2617:2: ( rule__Objet__TailleAssignment_5 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_5()); 
            // InternalGAME.g:2618:2: ( rule__Objet__TailleAssignment_5 )
            // InternalGAME.g:2618:3: rule__Objet__TailleAssignment_5
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
    // InternalGAME.g:2626:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl rule__Objet__Group__7 ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2630:1: ( rule__Objet__Group__6__Impl rule__Objet__Group__7 )
            // InternalGAME.g:2631:2: rule__Objet__Group__6__Impl rule__Objet__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalGAME.g:2638:1: rule__Objet__Group__6__Impl : ( 'quantite' ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2642:1: ( ( 'quantite' ) )
            // InternalGAME.g:2643:1: ( 'quantite' )
            {
            // InternalGAME.g:2643:1: ( 'quantite' )
            // InternalGAME.g:2644:2: 'quantite'
            {
             before(grammarAccess.getObjetAccess().getQuantiteKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQuantiteKeyword_6()); 

            }


            }

        }
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
    // InternalGAME.g:2653:1: rule__Objet__Group__7 : rule__Objet__Group__7__Impl rule__Objet__Group__8 ;
    public final void rule__Objet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2657:1: ( rule__Objet__Group__7__Impl rule__Objet__Group__8 )
            // InternalGAME.g:2658:2: rule__Objet__Group__7__Impl rule__Objet__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:2665:1: rule__Objet__Group__7__Impl : ( ( rule__Objet__QuantiteAssignment_7 ) ) ;
    public final void rule__Objet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2669:1: ( ( ( rule__Objet__QuantiteAssignment_7 ) ) )
            // InternalGAME.g:2670:1: ( ( rule__Objet__QuantiteAssignment_7 ) )
            {
            // InternalGAME.g:2670:1: ( ( rule__Objet__QuantiteAssignment_7 ) )
            // InternalGAME.g:2671:2: ( rule__Objet__QuantiteAssignment_7 )
            {
             before(grammarAccess.getObjetAccess().getQuantiteAssignment_7()); 
            // InternalGAME.g:2672:2: ( rule__Objet__QuantiteAssignment_7 )
            // InternalGAME.g:2672:3: rule__Objet__QuantiteAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Objet__QuantiteAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getQuantiteAssignment_7()); 

            }


            }

        }
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
    // InternalGAME.g:2680:1: rule__Objet__Group__8 : rule__Objet__Group__8__Impl rule__Objet__Group__9 ;
    public final void rule__Objet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2684:1: ( rule__Objet__Group__8__Impl rule__Objet__Group__9 )
            // InternalGAME.g:2685:2: rule__Objet__Group__8__Impl rule__Objet__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Objet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__9();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:2692:1: rule__Objet__Group__8__Impl : ( ( rule__Objet__VisibiliteAssignment_8 ) ) ;
    public final void rule__Objet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2696:1: ( ( ( rule__Objet__VisibiliteAssignment_8 ) ) )
            // InternalGAME.g:2697:1: ( ( rule__Objet__VisibiliteAssignment_8 ) )
            {
            // InternalGAME.g:2697:1: ( ( rule__Objet__VisibiliteAssignment_8 ) )
            // InternalGAME.g:2698:2: ( rule__Objet__VisibiliteAssignment_8 )
            {
             before(grammarAccess.getObjetAccess().getVisibiliteAssignment_8()); 
            // InternalGAME.g:2699:2: ( rule__Objet__VisibiliteAssignment_8 )
            // InternalGAME.g:2699:3: rule__Objet__VisibiliteAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Objet__VisibiliteAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getVisibiliteAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Objet__Group__9"
    // InternalGAME.g:2707:1: rule__Objet__Group__9 : rule__Objet__Group__9__Impl rule__Objet__Group__10 ;
    public final void rule__Objet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2711:1: ( rule__Objet__Group__9__Impl rule__Objet__Group__10 )
            // InternalGAME.g:2712:2: rule__Objet__Group__9__Impl rule__Objet__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Objet__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__9"


    // $ANTLR start "rule__Objet__Group__9__Impl"
    // InternalGAME.g:2719:1: rule__Objet__Group__9__Impl : ( ( rule__Objet__Group_9__0 )? ) ;
    public final void rule__Objet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2723:1: ( ( ( rule__Objet__Group_9__0 )? ) )
            // InternalGAME.g:2724:1: ( ( rule__Objet__Group_9__0 )? )
            {
            // InternalGAME.g:2724:1: ( ( rule__Objet__Group_9__0 )? )
            // InternalGAME.g:2725:2: ( rule__Objet__Group_9__0 )?
            {
             before(grammarAccess.getObjetAccess().getGroup_9()); 
            // InternalGAME.g:2726:2: ( rule__Objet__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGAME.g:2726:3: rule__Objet__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objet__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__9__Impl"


    // $ANTLR start "rule__Objet__Group__10"
    // InternalGAME.g:2734:1: rule__Objet__Group__10 : rule__Objet__Group__10__Impl ;
    public final void rule__Objet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2738:1: ( rule__Objet__Group__10__Impl )
            // InternalGAME.g:2739:2: rule__Objet__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__10"


    // $ANTLR start "rule__Objet__Group__10__Impl"
    // InternalGAME.g:2745:1: rule__Objet__Group__10__Impl : ( '}' ) ;
    public final void rule__Objet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2749:1: ( ( '}' ) )
            // InternalGAME.g:2750:1: ( '}' )
            {
            // InternalGAME.g:2750:1: ( '}' )
            // InternalGAME.g:2751:2: '}'
            {
             before(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group__10__Impl"


    // $ANTLR start "rule__Objet__Group_9__0"
    // InternalGAME.g:2761:1: rule__Objet__Group_9__0 : rule__Objet__Group_9__0__Impl rule__Objet__Group_9__1 ;
    public final void rule__Objet__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2765:1: ( rule__Objet__Group_9__0__Impl rule__Objet__Group_9__1 )
            // InternalGAME.g:2766:2: rule__Objet__Group_9__0__Impl rule__Objet__Group_9__1
            {
            pushFollow(FOLLOW_20);
            rule__Objet__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_9__0"


    // $ANTLR start "rule__Objet__Group_9__0__Impl"
    // InternalGAME.g:2773:1: rule__Objet__Group_9__0__Impl : ( 'si' ) ;
    public final void rule__Objet__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2777:1: ( ( 'si' ) )
            // InternalGAME.g:2778:1: ( 'si' )
            {
            // InternalGAME.g:2778:1: ( 'si' )
            // InternalGAME.g:2779:2: 'si'
            {
             before(grammarAccess.getObjetAccess().getSiKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getSiKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_9__0__Impl"


    // $ANTLR start "rule__Objet__Group_9__1"
    // InternalGAME.g:2788:1: rule__Objet__Group_9__1 : rule__Objet__Group_9__1__Impl ;
    public final void rule__Objet__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2792:1: ( rule__Objet__Group_9__1__Impl )
            // InternalGAME.g:2793:2: rule__Objet__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_9__1"


    // $ANTLR start "rule__Objet__Group_9__1__Impl"
    // InternalGAME.g:2799:1: rule__Objet__Group_9__1__Impl : ( ( rule__Objet__ConditionsVisibiliteAssignment_9_1 ) ) ;
    public final void rule__Objet__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2803:1: ( ( ( rule__Objet__ConditionsVisibiliteAssignment_9_1 ) ) )
            // InternalGAME.g:2804:1: ( ( rule__Objet__ConditionsVisibiliteAssignment_9_1 ) )
            {
            // InternalGAME.g:2804:1: ( ( rule__Objet__ConditionsVisibiliteAssignment_9_1 ) )
            // InternalGAME.g:2805:2: ( rule__Objet__ConditionsVisibiliteAssignment_9_1 )
            {
             before(grammarAccess.getObjetAccess().getConditionsVisibiliteAssignment_9_1()); 
            // InternalGAME.g:2806:2: ( rule__Objet__ConditionsVisibiliteAssignment_9_1 )
            // InternalGAME.g:2806:3: rule__Objet__ConditionsVisibiliteAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__ConditionsVisibiliteAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getConditionsVisibiliteAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__Group_9__1__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalGAME.g:2815:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2819:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGAME.g:2820:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalGAME.g:2827:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2831:1: ( ( 'description' ) )
            // InternalGAME.g:2832:1: ( 'description' )
            {
            // InternalGAME.g:2832:1: ( 'description' )
            // InternalGAME.g:2833:2: 'description'
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
    // InternalGAME.g:2842:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2846:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalGAME.g:2847:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalGAME.g:2854:1: rule__Description__Group__1__Impl : ( '{' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2858:1: ( ( '{' ) )
            // InternalGAME.g:2859:1: ( '{' )
            {
            // InternalGAME.g:2859:1: ( '{' )
            // InternalGAME.g:2860:2: '{'
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
    // InternalGAME.g:2869:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2873:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalGAME.g:2874:2: rule__Description__Group__2__Impl rule__Description__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalGAME.g:2881:1: rule__Description__Group__2__Impl : ( ( rule__Description__TextAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2885:1: ( ( ( rule__Description__TextAssignment_2 ) ) )
            // InternalGAME.g:2886:1: ( ( rule__Description__TextAssignment_2 ) )
            {
            // InternalGAME.g:2886:1: ( ( rule__Description__TextAssignment_2 ) )
            // InternalGAME.g:2887:2: ( rule__Description__TextAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 
            // InternalGAME.g:2888:2: ( rule__Description__TextAssignment_2 )
            // InternalGAME.g:2888:3: rule__Description__TextAssignment_2
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
    // InternalGAME.g:2896:1: rule__Description__Group__3 : rule__Description__Group__3__Impl ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2900:1: ( rule__Description__Group__3__Impl )
            // InternalGAME.g:2901:2: rule__Description__Group__3__Impl
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
    // InternalGAME.g:2907:1: rule__Description__Group__3__Impl : ( '}' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2911:1: ( ( '}' ) )
            // InternalGAME.g:2912:1: ( '}' )
            {
            // InternalGAME.g:2912:1: ( '}' )
            // InternalGAME.g:2913:2: '}'
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
    // InternalGAME.g:2923:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2927:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGAME.g:2928:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalGAME.g:2935:1: rule__Condition__Group__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2939:1: ( ( 'condition' ) )
            // InternalGAME.g:2940:1: ( 'condition' )
            {
            // InternalGAME.g:2940:1: ( 'condition' )
            // InternalGAME.g:2941:2: 'condition'
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
    // InternalGAME.g:2950:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2954:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGAME.g:2955:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalGAME.g:2962:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2966:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalGAME.g:2967:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalGAME.g:2967:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalGAME.g:2968:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalGAME.g:2969:2: ( rule__Condition__NameAssignment_1 )
            // InternalGAME.g:2969:3: rule__Condition__NameAssignment_1
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
    // InternalGAME.g:2977:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2981:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalGAME.g:2982:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalGAME.g:2989:1: rule__Condition__Group__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2993:1: ( ( '{' ) )
            // InternalGAME.g:2994:1: ( '{' )
            {
            // InternalGAME.g:2994:1: ( '{' )
            // InternalGAME.g:2995:2: '{'
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
    // InternalGAME.g:3004:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3008:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalGAME.g:3009:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalGAME.g:3016:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3020:1: ( ( ( rule__Condition__Group_3__0 )? ) )
            // InternalGAME.g:3021:1: ( ( rule__Condition__Group_3__0 )? )
            {
            // InternalGAME.g:3021:1: ( ( rule__Condition__Group_3__0 )? )
            // InternalGAME.g:3022:2: ( rule__Condition__Group_3__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_3()); 
            // InternalGAME.g:3023:2: ( rule__Condition__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==38) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalGAME.g:3023:3: rule__Condition__Group_3__0
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
    // InternalGAME.g:3031:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3035:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalGAME.g:3036:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalGAME.g:3043:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__Group_4__0 )? ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3047:1: ( ( ( rule__Condition__Group_4__0 )? ) )
            // InternalGAME.g:3048:1: ( ( rule__Condition__Group_4__0 )? )
            {
            // InternalGAME.g:3048:1: ( ( rule__Condition__Group_4__0 )? )
            // InternalGAME.g:3049:2: ( rule__Condition__Group_4__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_4()); 
            // InternalGAME.g:3050:2: ( rule__Condition__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGAME.g:3050:3: rule__Condition__Group_4__0
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
    // InternalGAME.g:3058:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3062:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalGAME.g:3063:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalGAME.g:3070:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__Group_5__0 )? ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3074:1: ( ( ( rule__Condition__Group_5__0 )? ) )
            // InternalGAME.g:3075:1: ( ( rule__Condition__Group_5__0 )? )
            {
            // InternalGAME.g:3075:1: ( ( rule__Condition__Group_5__0 )? )
            // InternalGAME.g:3076:2: ( rule__Condition__Group_5__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_5()); 
            // InternalGAME.g:3077:2: ( rule__Condition__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGAME.g:3077:3: rule__Condition__Group_5__0
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
    // InternalGAME.g:3085:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3089:1: ( rule__Condition__Group__6__Impl )
            // InternalGAME.g:3090:2: rule__Condition__Group__6__Impl
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
    // InternalGAME.g:3096:1: rule__Condition__Group__6__Impl : ( '}' ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3100:1: ( ( '}' ) )
            // InternalGAME.g:3101:1: ( '}' )
            {
            // InternalGAME.g:3101:1: ( '}' )
            // InternalGAME.g:3102:2: '}'
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
    // InternalGAME.g:3112:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
    public final void rule__Condition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3116:1: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
            // InternalGAME.g:3117:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalGAME.g:3124:1: rule__Condition__Group_3__0__Impl : ( 'objets' ) ;
    public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3128:1: ( ( 'objets' ) )
            // InternalGAME.g:3129:1: ( 'objets' )
            {
            // InternalGAME.g:3129:1: ( 'objets' )
            // InternalGAME.g:3130:2: 'objets'
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
    // InternalGAME.g:3139:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 ;
    public final void rule__Condition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3143:1: ( rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2 )
            // InternalGAME.g:3144:2: rule__Condition__Group_3__1__Impl rule__Condition__Group_3__2
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
    // InternalGAME.g:3151:1: rule__Condition__Group_3__1__Impl : ( 'necessaires' ) ;
    public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3155:1: ( ( 'necessaires' ) )
            // InternalGAME.g:3156:1: ( 'necessaires' )
            {
            // InternalGAME.g:3156:1: ( 'necessaires' )
            // InternalGAME.g:3157:2: 'necessaires'
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
    // InternalGAME.g:3166:1: rule__Condition__Group_3__2 : rule__Condition__Group_3__2__Impl ;
    public final void rule__Condition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3170:1: ( rule__Condition__Group_3__2__Impl )
            // InternalGAME.g:3171:2: rule__Condition__Group_3__2__Impl
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
    // InternalGAME.g:3177:1: rule__Condition__Group_3__2__Impl : ( ( rule__Condition__ObjetsAssignment_3_2 )* ) ;
    public final void rule__Condition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3181:1: ( ( ( rule__Condition__ObjetsAssignment_3_2 )* ) )
            // InternalGAME.g:3182:1: ( ( rule__Condition__ObjetsAssignment_3_2 )* )
            {
            // InternalGAME.g:3182:1: ( ( rule__Condition__ObjetsAssignment_3_2 )* )
            // InternalGAME.g:3183:2: ( rule__Condition__ObjetsAssignment_3_2 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsAssignment_3_2()); 
            // InternalGAME.g:3184:2: ( rule__Condition__ObjetsAssignment_3_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGAME.g:3184:3: rule__Condition__ObjetsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condition__ObjetsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalGAME.g:3193:1: rule__Condition__Group_4__0 : rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 ;
    public final void rule__Condition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3197:1: ( rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1 )
            // InternalGAME.g:3198:2: rule__Condition__Group_4__0__Impl rule__Condition__Group_4__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalGAME.g:3205:1: rule__Condition__Group_4__0__Impl : ( 'objets' ) ;
    public final void rule__Condition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3209:1: ( ( 'objets' ) )
            // InternalGAME.g:3210:1: ( 'objets' )
            {
            // InternalGAME.g:3210:1: ( 'objets' )
            // InternalGAME.g:3211:2: 'objets'
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
    // InternalGAME.g:3220:1: rule__Condition__Group_4__1 : rule__Condition__Group_4__1__Impl rule__Condition__Group_4__2 ;
    public final void rule__Condition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3224:1: ( rule__Condition__Group_4__1__Impl rule__Condition__Group_4__2 )
            // InternalGAME.g:3225:2: rule__Condition__Group_4__1__Impl rule__Condition__Group_4__2
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
    // InternalGAME.g:3232:1: rule__Condition__Group_4__1__Impl : ( 'manquants' ) ;
    public final void rule__Condition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3236:1: ( ( 'manquants' ) )
            // InternalGAME.g:3237:1: ( 'manquants' )
            {
            // InternalGAME.g:3237:1: ( 'manquants' )
            // InternalGAME.g:3238:2: 'manquants'
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
    // InternalGAME.g:3247:1: rule__Condition__Group_4__2 : rule__Condition__Group_4__2__Impl ;
    public final void rule__Condition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3251:1: ( rule__Condition__Group_4__2__Impl )
            // InternalGAME.g:3252:2: rule__Condition__Group_4__2__Impl
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
    // InternalGAME.g:3258:1: rule__Condition__Group_4__2__Impl : ( ( rule__Condition__ObjetsAssignment_4_2 )* ) ;
    public final void rule__Condition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3262:1: ( ( ( rule__Condition__ObjetsAssignment_4_2 )* ) )
            // InternalGAME.g:3263:1: ( ( rule__Condition__ObjetsAssignment_4_2 )* )
            {
            // InternalGAME.g:3263:1: ( ( rule__Condition__ObjetsAssignment_4_2 )* )
            // InternalGAME.g:3264:2: ( rule__Condition__ObjetsAssignment_4_2 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsAssignment_4_2()); 
            // InternalGAME.g:3265:2: ( rule__Condition__ObjetsAssignment_4_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGAME.g:3265:3: rule__Condition__ObjetsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condition__ObjetsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalGAME.g:3274:1: rule__Condition__Group_5__0 : rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 ;
    public final void rule__Condition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3278:1: ( rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 )
            // InternalGAME.g:3279:2: rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalGAME.g:3286:1: rule__Condition__Group_5__0__Impl : ( 'connaissances' ) ;
    public final void rule__Condition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3290:1: ( ( 'connaissances' ) )
            // InternalGAME.g:3291:1: ( 'connaissances' )
            {
            // InternalGAME.g:3291:1: ( 'connaissances' )
            // InternalGAME.g:3292:2: 'connaissances'
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
    // InternalGAME.g:3301:1: rule__Condition__Group_5__1 : rule__Condition__Group_5__1__Impl rule__Condition__Group_5__2 ;
    public final void rule__Condition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3305:1: ( rule__Condition__Group_5__1__Impl rule__Condition__Group_5__2 )
            // InternalGAME.g:3306:2: rule__Condition__Group_5__1__Impl rule__Condition__Group_5__2
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
    // InternalGAME.g:3313:1: rule__Condition__Group_5__1__Impl : ( 'necessaires' ) ;
    public final void rule__Condition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3317:1: ( ( 'necessaires' ) )
            // InternalGAME.g:3318:1: ( 'necessaires' )
            {
            // InternalGAME.g:3318:1: ( 'necessaires' )
            // InternalGAME.g:3319:2: 'necessaires'
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
    // InternalGAME.g:3328:1: rule__Condition__Group_5__2 : rule__Condition__Group_5__2__Impl ;
    public final void rule__Condition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3332:1: ( rule__Condition__Group_5__2__Impl )
            // InternalGAME.g:3333:2: rule__Condition__Group_5__2__Impl
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
    // InternalGAME.g:3339:1: rule__Condition__Group_5__2__Impl : ( ( rule__Condition__ConnaissancesAssignment_5_2 )* ) ;
    public final void rule__Condition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3343:1: ( ( ( rule__Condition__ConnaissancesAssignment_5_2 )* ) )
            // InternalGAME.g:3344:1: ( ( rule__Condition__ConnaissancesAssignment_5_2 )* )
            {
            // InternalGAME.g:3344:1: ( ( rule__Condition__ConnaissancesAssignment_5_2 )* )
            // InternalGAME.g:3345:2: ( rule__Condition__ConnaissancesAssignment_5_2 )*
            {
             before(grammarAccess.getConditionAccess().getConnaissancesAssignment_5_2()); 
            // InternalGAME.g:3346:2: ( rule__Condition__ConnaissancesAssignment_5_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGAME.g:3346:3: rule__Condition__ConnaissancesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condition__ConnaissancesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalGAME.g:3355:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3359:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGAME.g:3360:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
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
    // InternalGAME.g:3367:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3371:1: ( ( 'connaissance' ) )
            // InternalGAME.g:3372:1: ( 'connaissance' )
            {
            // InternalGAME.g:3372:1: ( 'connaissance' )
            // InternalGAME.g:3373:2: 'connaissance'
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
    // InternalGAME.g:3382:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3386:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalGAME.g:3387:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
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
    // InternalGAME.g:3394:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3398:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalGAME.g:3399:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalGAME.g:3399:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalGAME.g:3400:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalGAME.g:3401:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalGAME.g:3401:3: rule__Connaissance__NameAssignment_1
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
    // InternalGAME.g:3409:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3413:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalGAME.g:3414:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalGAME.g:3421:1: rule__Connaissance__Group__2__Impl : ( '{' ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3425:1: ( ( '{' ) )
            // InternalGAME.g:3426:1: ( '{' )
            {
            // InternalGAME.g:3426:1: ( '{' )
            // InternalGAME.g:3427:2: '{'
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
    // InternalGAME.g:3436:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3440:1: ( rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 )
            // InternalGAME.g:3441:2: rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalGAME.g:3448:1: rule__Connaissance__Group__3__Impl : ( ( rule__Connaissance__DescriptionsAssignment_3 )? ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3452:1: ( ( ( rule__Connaissance__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:3453:1: ( ( rule__Connaissance__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:3453:1: ( ( rule__Connaissance__DescriptionsAssignment_3 )? )
            // InternalGAME.g:3454:2: ( rule__Connaissance__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getConnaissanceAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:3455:2: ( rule__Connaissance__DescriptionsAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGAME.g:3455:3: rule__Connaissance__DescriptionsAssignment_3
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
    // InternalGAME.g:3463:1: rule__Connaissance__Group__4 : rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 ;
    public final void rule__Connaissance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3467:1: ( rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 )
            // InternalGAME.g:3468:2: rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalGAME.g:3475:1: rule__Connaissance__Group__4__Impl : ( ( rule__Connaissance__VisibiliteAssignment_4 ) ) ;
    public final void rule__Connaissance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3479:1: ( ( ( rule__Connaissance__VisibiliteAssignment_4 ) ) )
            // InternalGAME.g:3480:1: ( ( rule__Connaissance__VisibiliteAssignment_4 ) )
            {
            // InternalGAME.g:3480:1: ( ( rule__Connaissance__VisibiliteAssignment_4 ) )
            // InternalGAME.g:3481:2: ( rule__Connaissance__VisibiliteAssignment_4 )
            {
             before(grammarAccess.getConnaissanceAccess().getVisibiliteAssignment_4()); 
            // InternalGAME.g:3482:2: ( rule__Connaissance__VisibiliteAssignment_4 )
            // InternalGAME.g:3482:3: rule__Connaissance__VisibiliteAssignment_4
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
    // InternalGAME.g:3490:1: rule__Connaissance__Group__5 : rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 ;
    public final void rule__Connaissance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3494:1: ( rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6 )
            // InternalGAME.g:3495:2: rule__Connaissance__Group__5__Impl rule__Connaissance__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalGAME.g:3502:1: rule__Connaissance__Group__5__Impl : ( ( rule__Connaissance__Group_5__0 )? ) ;
    public final void rule__Connaissance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3506:1: ( ( ( rule__Connaissance__Group_5__0 )? ) )
            // InternalGAME.g:3507:1: ( ( rule__Connaissance__Group_5__0 )? )
            {
            // InternalGAME.g:3507:1: ( ( rule__Connaissance__Group_5__0 )? )
            // InternalGAME.g:3508:2: ( rule__Connaissance__Group_5__0 )?
            {
             before(grammarAccess.getConnaissanceAccess().getGroup_5()); 
            // InternalGAME.g:3509:2: ( rule__Connaissance__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGAME.g:3509:3: rule__Connaissance__Group_5__0
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
    // InternalGAME.g:3517:1: rule__Connaissance__Group__6 : rule__Connaissance__Group__6__Impl ;
    public final void rule__Connaissance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3521:1: ( rule__Connaissance__Group__6__Impl )
            // InternalGAME.g:3522:2: rule__Connaissance__Group__6__Impl
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
    // InternalGAME.g:3528:1: rule__Connaissance__Group__6__Impl : ( '}' ) ;
    public final void rule__Connaissance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3532:1: ( ( '}' ) )
            // InternalGAME.g:3533:1: ( '}' )
            {
            // InternalGAME.g:3533:1: ( '}' )
            // InternalGAME.g:3534:2: '}'
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
    // InternalGAME.g:3544:1: rule__Connaissance__Group_5__0 : rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1 ;
    public final void rule__Connaissance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3548:1: ( rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1 )
            // InternalGAME.g:3549:2: rule__Connaissance__Group_5__0__Impl rule__Connaissance__Group_5__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGAME.g:3556:1: rule__Connaissance__Group_5__0__Impl : ( 'si' ) ;
    public final void rule__Connaissance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3560:1: ( ( 'si' ) )
            // InternalGAME.g:3561:1: ( 'si' )
            {
            // InternalGAME.g:3561:1: ( 'si' )
            // InternalGAME.g:3562:2: 'si'
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
    // InternalGAME.g:3571:1: rule__Connaissance__Group_5__1 : rule__Connaissance__Group_5__1__Impl ;
    public final void rule__Connaissance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3575:1: ( rule__Connaissance__Group_5__1__Impl )
            // InternalGAME.g:3576:2: rule__Connaissance__Group_5__1__Impl
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
    // InternalGAME.g:3582:1: rule__Connaissance__Group_5__1__Impl : ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) ) ;
    public final void rule__Connaissance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3586:1: ( ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) ) )
            // InternalGAME.g:3587:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) )
            {
            // InternalGAME.g:3587:1: ( ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 ) )
            // InternalGAME.g:3588:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteAssignment_5_1()); 
            // InternalGAME.g:3589:2: ( rule__Connaissance__ConditionsVisibiliteAssignment_5_1 )
            // InternalGAME.g:3589:3: rule__Connaissance__ConditionsVisibiliteAssignment_5_1
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
    // InternalGAME.g:3598:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3602:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGAME.g:3603:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
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
    // InternalGAME.g:3610:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3614:1: ( ( 'explorateur' ) )
            // InternalGAME.g:3615:1: ( 'explorateur' )
            {
            // InternalGAME.g:3615:1: ( 'explorateur' )
            // InternalGAME.g:3616:2: 'explorateur'
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
    // InternalGAME.g:3625:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3629:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGAME.g:3630:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
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
    // InternalGAME.g:3637:1: rule__Explorateur__Group__1__Impl : ( ( rule__Explorateur__NameAssignment_1 ) ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3641:1: ( ( ( rule__Explorateur__NameAssignment_1 ) ) )
            // InternalGAME.g:3642:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            {
            // InternalGAME.g:3642:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            // InternalGAME.g:3643:2: ( rule__Explorateur__NameAssignment_1 )
            {
             before(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 
            // InternalGAME.g:3644:2: ( rule__Explorateur__NameAssignment_1 )
            // InternalGAME.g:3644:3: rule__Explorateur__NameAssignment_1
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
    // InternalGAME.g:3652:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3656:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGAME.g:3657:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalGAME.g:3664:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3668:1: ( ( '{' ) )
            // InternalGAME.g:3669:1: ( '{' )
            {
            // InternalGAME.g:3669:1: ( '{' )
            // InternalGAME.g:3670:2: '{'
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
    // InternalGAME.g:3679:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3683:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGAME.g:3684:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalGAME.g:3691:1: rule__Explorateur__Group__3__Impl : ( 'taille' ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3695:1: ( ( 'taille' ) )
            // InternalGAME.g:3696:1: ( 'taille' )
            {
            // InternalGAME.g:3696:1: ( 'taille' )
            // InternalGAME.g:3697:2: 'taille'
            {
             before(grammarAccess.getExplorateurAccess().getTailleKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGAME.g:3706:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3710:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGAME.g:3711:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalGAME.g:3718:1: rule__Explorateur__Group__4__Impl : ( ( rule__Explorateur__TailleAssignment_4 ) ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3722:1: ( ( ( rule__Explorateur__TailleAssignment_4 ) ) )
            // InternalGAME.g:3723:1: ( ( rule__Explorateur__TailleAssignment_4 ) )
            {
            // InternalGAME.g:3723:1: ( ( rule__Explorateur__TailleAssignment_4 ) )
            // InternalGAME.g:3724:2: ( rule__Explorateur__TailleAssignment_4 )
            {
             before(grammarAccess.getExplorateurAccess().getTailleAssignment_4()); 
            // InternalGAME.g:3725:2: ( rule__Explorateur__TailleAssignment_4 )
            // InternalGAME.g:3725:3: rule__Explorateur__TailleAssignment_4
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
    // InternalGAME.g:3733:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3737:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGAME.g:3738:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_44);
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
    // InternalGAME.g:3745:1: rule__Explorateur__Group__5__Impl : ( 'inventaireO' ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3749:1: ( ( 'inventaireO' ) )
            // InternalGAME.g:3750:1: ( 'inventaireO' )
            {
            // InternalGAME.g:3750:1: ( 'inventaireO' )
            // InternalGAME.g:3751:2: 'inventaireO'
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
    // InternalGAME.g:3760:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3764:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGAME.g:3765:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
            {
            pushFollow(FOLLOW_44);
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
    // InternalGAME.g:3772:1: rule__Explorateur__Group__6__Impl : ( ( rule__Explorateur__ObjetsAssignment_6 )* ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3776:1: ( ( ( rule__Explorateur__ObjetsAssignment_6 )* ) )
            // InternalGAME.g:3777:1: ( ( rule__Explorateur__ObjetsAssignment_6 )* )
            {
            // InternalGAME.g:3777:1: ( ( rule__Explorateur__ObjetsAssignment_6 )* )
            // InternalGAME.g:3778:2: ( rule__Explorateur__ObjetsAssignment_6 )*
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_6()); 
            // InternalGAME.g:3779:2: ( rule__Explorateur__ObjetsAssignment_6 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGAME.g:3779:3: rule__Explorateur__ObjetsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Explorateur__ObjetsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalGAME.g:3787:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3791:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGAME.g:3792:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
            {
            pushFollow(FOLLOW_45);
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
    // InternalGAME.g:3799:1: rule__Explorateur__Group__7__Impl : ( 'inventaireC' ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3803:1: ( ( 'inventaireC' ) )
            // InternalGAME.g:3804:1: ( 'inventaireC' )
            {
            // InternalGAME.g:3804:1: ( 'inventaireC' )
            // InternalGAME.g:3805:2: 'inventaireC'
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
    // InternalGAME.g:3814:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3818:1: ( rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 )
            // InternalGAME.g:3819:2: rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9
            {
            pushFollow(FOLLOW_45);
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
    // InternalGAME.g:3826:1: rule__Explorateur__Group__8__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_8 )* ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3830:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_8 )* ) )
            // InternalGAME.g:3831:1: ( ( rule__Explorateur__ConnaissancesAssignment_8 )* )
            {
            // InternalGAME.g:3831:1: ( ( rule__Explorateur__ConnaissancesAssignment_8 )* )
            // InternalGAME.g:3832:2: ( rule__Explorateur__ConnaissancesAssignment_8 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8()); 
            // InternalGAME.g:3833:2: ( rule__Explorateur__ConnaissancesAssignment_8 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGAME.g:3833:3: rule__Explorateur__ConnaissancesAssignment_8
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Explorateur__ConnaissancesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalGAME.g:3841:1: rule__Explorateur__Group__9 : rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 ;
    public final void rule__Explorateur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3845:1: ( rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 )
            // InternalGAME.g:3846:2: rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10
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
    // InternalGAME.g:3853:1: rule__Explorateur__Group__9__Impl : ( 'localisation' ) ;
    public final void rule__Explorateur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3857:1: ( ( 'localisation' ) )
            // InternalGAME.g:3858:1: ( 'localisation' )
            {
            // InternalGAME.g:3858:1: ( 'localisation' )
            // InternalGAME.g:3859:2: 'localisation'
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationKeyword_9()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGAME.g:3868:1: rule__Explorateur__Group__10 : rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 ;
    public final void rule__Explorateur__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3872:1: ( rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 )
            // InternalGAME.g:3873:2: rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalGAME.g:3880:1: rule__Explorateur__Group__10__Impl : ( ( rule__Explorateur__LocalisationAssignment_10 ) ) ;
    public final void rule__Explorateur__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3884:1: ( ( ( rule__Explorateur__LocalisationAssignment_10 ) ) )
            // InternalGAME.g:3885:1: ( ( rule__Explorateur__LocalisationAssignment_10 ) )
            {
            // InternalGAME.g:3885:1: ( ( rule__Explorateur__LocalisationAssignment_10 ) )
            // InternalGAME.g:3886:2: ( rule__Explorateur__LocalisationAssignment_10 )
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationAssignment_10()); 
            // InternalGAME.g:3887:2: ( rule__Explorateur__LocalisationAssignment_10 )
            // InternalGAME.g:3887:3: rule__Explorateur__LocalisationAssignment_10
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
    // InternalGAME.g:3895:1: rule__Explorateur__Group__11 : rule__Explorateur__Group__11__Impl ;
    public final void rule__Explorateur__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3899:1: ( rule__Explorateur__Group__11__Impl )
            // InternalGAME.g:3900:2: rule__Explorateur__Group__11__Impl
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
    // InternalGAME.g:3906:1: rule__Explorateur__Group__11__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3910:1: ( ( '}' ) )
            // InternalGAME.g:3911:1: ( '}' )
            {
            // InternalGAME.g:3911:1: ( '}' )
            // InternalGAME.g:3912:2: '}'
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


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalGAME.g:3922:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3926:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGAME.g:3927:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalGAME.g:3934:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3938:1: ( ( 'lieu' ) )
            // InternalGAME.g:3939:1: ( 'lieu' )
            {
            // InternalGAME.g:3939:1: ( 'lieu' )
            // InternalGAME.g:3940:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalGAME.g:3949:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3953:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGAME.g:3954:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalGAME.g:3961:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3965:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGAME.g:3966:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGAME.g:3966:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGAME.g:3967:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGAME.g:3968:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGAME.g:3968:3: rule__Lieu__NameAssignment_1
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
    // InternalGAME.g:3976:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3980:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGAME.g:3981:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalGAME.g:3988:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3992:1: ( ( '{' ) )
            // InternalGAME.g:3993:1: ( '{' )
            {
            // InternalGAME.g:3993:1: ( '{' )
            // InternalGAME.g:3994:2: '{'
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
    // InternalGAME.g:4003:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4007:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGAME.g:4008:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalGAME.g:4015:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__DescriptionsAssignment_3 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4019:1: ( ( ( rule__Lieu__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:4020:1: ( ( rule__Lieu__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:4020:1: ( ( rule__Lieu__DescriptionsAssignment_3 )? )
            // InternalGAME.g:4021:2: ( rule__Lieu__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getLieuAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:4022:2: ( rule__Lieu__DescriptionsAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGAME.g:4022:3: rule__Lieu__DescriptionsAssignment_3
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
    // InternalGAME.g:4030:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl rule__Lieu__Group__5 ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4034:1: ( rule__Lieu__Group__4__Impl rule__Lieu__Group__5 )
            // InternalGAME.g:4035:2: rule__Lieu__Group__4__Impl rule__Lieu__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalGAME.g:4042:1: rule__Lieu__Group__4__Impl : ( ( rule__Lieu__Group_4__0 )* ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4046:1: ( ( ( rule__Lieu__Group_4__0 )* ) )
            // InternalGAME.g:4047:1: ( ( rule__Lieu__Group_4__0 )* )
            {
            // InternalGAME.g:4047:1: ( ( rule__Lieu__Group_4__0 )* )
            // InternalGAME.g:4048:2: ( rule__Lieu__Group_4__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_4()); 
            // InternalGAME.g:4049:2: ( rule__Lieu__Group_4__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGAME.g:4049:3: rule__Lieu__Group_4__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Lieu__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalGAME.g:4057:1: rule__Lieu__Group__5 : rule__Lieu__Group__5__Impl rule__Lieu__Group__6 ;
    public final void rule__Lieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4061:1: ( rule__Lieu__Group__5__Impl rule__Lieu__Group__6 )
            // InternalGAME.g:4062:2: rule__Lieu__Group__5__Impl rule__Lieu__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalGAME.g:4069:1: rule__Lieu__Group__5__Impl : ( ( rule__Lieu__Group_5__0 )* ) ;
    public final void rule__Lieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4073:1: ( ( ( rule__Lieu__Group_5__0 )* ) )
            // InternalGAME.g:4074:1: ( ( rule__Lieu__Group_5__0 )* )
            {
            // InternalGAME.g:4074:1: ( ( rule__Lieu__Group_5__0 )* )
            // InternalGAME.g:4075:2: ( rule__Lieu__Group_5__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_5()); 
            // InternalGAME.g:4076:2: ( rule__Lieu__Group_5__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==40) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGAME.g:4076:3: rule__Lieu__Group_5__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Lieu__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalGAME.g:4084:1: rule__Lieu__Group__6 : rule__Lieu__Group__6__Impl rule__Lieu__Group__7 ;
    public final void rule__Lieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4088:1: ( rule__Lieu__Group__6__Impl rule__Lieu__Group__7 )
            // InternalGAME.g:4089:2: rule__Lieu__Group__6__Impl rule__Lieu__Group__7
            {
            pushFollow(FOLLOW_46);
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
    // InternalGAME.g:4096:1: rule__Lieu__Group__6__Impl : ( ( rule__Lieu__Group_6__0 )* ) ;
    public final void rule__Lieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4100:1: ( ( ( rule__Lieu__Group_6__0 )* ) )
            // InternalGAME.g:4101:1: ( ( rule__Lieu__Group_6__0 )* )
            {
            // InternalGAME.g:4101:1: ( ( rule__Lieu__Group_6__0 )* )
            // InternalGAME.g:4102:2: ( rule__Lieu__Group_6__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_6()); 
            // InternalGAME.g:4103:2: ( rule__Lieu__Group_6__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==49) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGAME.g:4103:3: rule__Lieu__Group_6__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Lieu__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalGAME.g:4111:1: rule__Lieu__Group__7 : rule__Lieu__Group__7__Impl rule__Lieu__Group__8 ;
    public final void rule__Lieu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4115:1: ( rule__Lieu__Group__7__Impl rule__Lieu__Group__8 )
            // InternalGAME.g:4116:2: rule__Lieu__Group__7__Impl rule__Lieu__Group__8
            {
            pushFollow(FOLLOW_46);
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
    // InternalGAME.g:4123:1: rule__Lieu__Group__7__Impl : ( ( rule__Lieu__Group_7__0 )? ) ;
    public final void rule__Lieu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4127:1: ( ( ( rule__Lieu__Group_7__0 )? ) )
            // InternalGAME.g:4128:1: ( ( rule__Lieu__Group_7__0 )? )
            {
            // InternalGAME.g:4128:1: ( ( rule__Lieu__Group_7__0 )? )
            // InternalGAME.g:4129:2: ( rule__Lieu__Group_7__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_7()); 
            // InternalGAME.g:4130:2: ( rule__Lieu__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGAME.g:4130:3: rule__Lieu__Group_7__0
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
    // InternalGAME.g:4138:1: rule__Lieu__Group__8 : rule__Lieu__Group__8__Impl ;
    public final void rule__Lieu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4142:1: ( rule__Lieu__Group__8__Impl )
            // InternalGAME.g:4143:2: rule__Lieu__Group__8__Impl
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
    // InternalGAME.g:4149:1: rule__Lieu__Group__8__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4153:1: ( ( '}' ) )
            // InternalGAME.g:4154:1: ( '}' )
            {
            // InternalGAME.g:4154:1: ( '}' )
            // InternalGAME.g:4155:2: '}'
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
    // InternalGAME.g:4165:1: rule__Lieu__Group_4__0 : rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1 ;
    public final void rule__Lieu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4169:1: ( rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1 )
            // InternalGAME.g:4170:2: rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalGAME.g:4177:1: rule__Lieu__Group_4__0__Impl : ( 'objets' ) ;
    public final void rule__Lieu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4181:1: ( ( 'objets' ) )
            // InternalGAME.g:4182:1: ( 'objets' )
            {
            // InternalGAME.g:4182:1: ( 'objets' )
            // InternalGAME.g:4183:2: 'objets'
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
    // InternalGAME.g:4192:1: rule__Lieu__Group_4__1 : rule__Lieu__Group_4__1__Impl rule__Lieu__Group_4__2 ;
    public final void rule__Lieu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4196:1: ( rule__Lieu__Group_4__1__Impl rule__Lieu__Group_4__2 )
            // InternalGAME.g:4197:2: rule__Lieu__Group_4__1__Impl rule__Lieu__Group_4__2
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
    // InternalGAME.g:4204:1: rule__Lieu__Group_4__1__Impl : ( 'trouvables' ) ;
    public final void rule__Lieu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4208:1: ( ( 'trouvables' ) )
            // InternalGAME.g:4209:1: ( 'trouvables' )
            {
            // InternalGAME.g:4209:1: ( 'trouvables' )
            // InternalGAME.g:4210:2: 'trouvables'
            {
             before(grammarAccess.getLieuAccess().getTrouvablesKeyword_4_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalGAME.g:4219:1: rule__Lieu__Group_4__2 : rule__Lieu__Group_4__2__Impl ;
    public final void rule__Lieu__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4223:1: ( rule__Lieu__Group_4__2__Impl )
            // InternalGAME.g:4224:2: rule__Lieu__Group_4__2__Impl
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
    // InternalGAME.g:4230:1: rule__Lieu__Group_4__2__Impl : ( ( rule__Lieu__ObjetsAssignment_4_2 ) ) ;
    public final void rule__Lieu__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4234:1: ( ( ( rule__Lieu__ObjetsAssignment_4_2 ) ) )
            // InternalGAME.g:4235:1: ( ( rule__Lieu__ObjetsAssignment_4_2 ) )
            {
            // InternalGAME.g:4235:1: ( ( rule__Lieu__ObjetsAssignment_4_2 ) )
            // InternalGAME.g:4236:2: ( rule__Lieu__ObjetsAssignment_4_2 )
            {
             before(grammarAccess.getLieuAccess().getObjetsAssignment_4_2()); 
            // InternalGAME.g:4237:2: ( rule__Lieu__ObjetsAssignment_4_2 )
            // InternalGAME.g:4237:3: rule__Lieu__ObjetsAssignment_4_2
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
    // InternalGAME.g:4246:1: rule__Lieu__Group_5__0 : rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1 ;
    public final void rule__Lieu__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4250:1: ( rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1 )
            // InternalGAME.g:4251:2: rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalGAME.g:4258:1: rule__Lieu__Group_5__0__Impl : ( 'connaissances' ) ;
    public final void rule__Lieu__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4262:1: ( ( 'connaissances' ) )
            // InternalGAME.g:4263:1: ( 'connaissances' )
            {
            // InternalGAME.g:4263:1: ( 'connaissances' )
            // InternalGAME.g:4264:2: 'connaissances'
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
    // InternalGAME.g:4273:1: rule__Lieu__Group_5__1 : rule__Lieu__Group_5__1__Impl rule__Lieu__Group_5__2 ;
    public final void rule__Lieu__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4277:1: ( rule__Lieu__Group_5__1__Impl rule__Lieu__Group_5__2 )
            // InternalGAME.g:4278:2: rule__Lieu__Group_5__1__Impl rule__Lieu__Group_5__2
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
    // InternalGAME.g:4285:1: rule__Lieu__Group_5__1__Impl : ( 'trouvable' ) ;
    public final void rule__Lieu__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4289:1: ( ( 'trouvable' ) )
            // InternalGAME.g:4290:1: ( 'trouvable' )
            {
            // InternalGAME.g:4290:1: ( 'trouvable' )
            // InternalGAME.g:4291:2: 'trouvable'
            {
             before(grammarAccess.getLieuAccess().getTrouvableKeyword_5_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalGAME.g:4300:1: rule__Lieu__Group_5__2 : rule__Lieu__Group_5__2__Impl ;
    public final void rule__Lieu__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4304:1: ( rule__Lieu__Group_5__2__Impl )
            // InternalGAME.g:4305:2: rule__Lieu__Group_5__2__Impl
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
    // InternalGAME.g:4311:1: rule__Lieu__Group_5__2__Impl : ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) ) ;
    public final void rule__Lieu__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4315:1: ( ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) ) )
            // InternalGAME.g:4316:1: ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) )
            {
            // InternalGAME.g:4316:1: ( ( rule__Lieu__ConnaissancesAssignment_5_2 ) )
            // InternalGAME.g:4317:2: ( rule__Lieu__ConnaissancesAssignment_5_2 )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesAssignment_5_2()); 
            // InternalGAME.g:4318:2: ( rule__Lieu__ConnaissancesAssignment_5_2 )
            // InternalGAME.g:4318:3: rule__Lieu__ConnaissancesAssignment_5_2
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
    // InternalGAME.g:4327:1: rule__Lieu__Group_6__0 : rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 ;
    public final void rule__Lieu__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4331:1: ( rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 )
            // InternalGAME.g:4332:2: rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalGAME.g:4339:1: rule__Lieu__Group_6__0__Impl : ( 'personnes' ) ;
    public final void rule__Lieu__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4343:1: ( ( 'personnes' ) )
            // InternalGAME.g:4344:1: ( 'personnes' )
            {
            // InternalGAME.g:4344:1: ( 'personnes' )
            // InternalGAME.g:4345:2: 'personnes'
            {
             before(grammarAccess.getLieuAccess().getPersonnesKeyword_6_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalGAME.g:4354:1: rule__Lieu__Group_6__1 : rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2 ;
    public final void rule__Lieu__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4358:1: ( rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2 )
            // InternalGAME.g:4359:2: rule__Lieu__Group_6__1__Impl rule__Lieu__Group_6__2
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
    // InternalGAME.g:4366:1: rule__Lieu__Group_6__1__Impl : ( 'trouvable' ) ;
    public final void rule__Lieu__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4370:1: ( ( 'trouvable' ) )
            // InternalGAME.g:4371:1: ( 'trouvable' )
            {
            // InternalGAME.g:4371:1: ( 'trouvable' )
            // InternalGAME.g:4372:2: 'trouvable'
            {
             before(grammarAccess.getLieuAccess().getTrouvableKeyword_6_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalGAME.g:4381:1: rule__Lieu__Group_6__2 : rule__Lieu__Group_6__2__Impl ;
    public final void rule__Lieu__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4385:1: ( rule__Lieu__Group_6__2__Impl )
            // InternalGAME.g:4386:2: rule__Lieu__Group_6__2__Impl
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
    // InternalGAME.g:4392:1: rule__Lieu__Group_6__2__Impl : ( ( rule__Lieu__PersonnesAssignment_6_2 ) ) ;
    public final void rule__Lieu__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4396:1: ( ( ( rule__Lieu__PersonnesAssignment_6_2 ) ) )
            // InternalGAME.g:4397:1: ( ( rule__Lieu__PersonnesAssignment_6_2 ) )
            {
            // InternalGAME.g:4397:1: ( ( rule__Lieu__PersonnesAssignment_6_2 ) )
            // InternalGAME.g:4398:2: ( rule__Lieu__PersonnesAssignment_6_2 )
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_6_2()); 
            // InternalGAME.g:4399:2: ( rule__Lieu__PersonnesAssignment_6_2 )
            // InternalGAME.g:4399:3: rule__Lieu__PersonnesAssignment_6_2
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
    // InternalGAME.g:4408:1: rule__Lieu__Group_7__0 : rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 ;
    public final void rule__Lieu__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4412:1: ( rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1 )
            // InternalGAME.g:4413:2: rule__Lieu__Group_7__0__Impl rule__Lieu__Group_7__1
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
    // InternalGAME.g:4420:1: rule__Lieu__Group_7__0__Impl : ( 'cheminspossible' ) ;
    public final void rule__Lieu__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4424:1: ( ( 'cheminspossible' ) )
            // InternalGAME.g:4425:1: ( 'cheminspossible' )
            {
            // InternalGAME.g:4425:1: ( 'cheminspossible' )
            // InternalGAME.g:4426:2: 'cheminspossible'
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleKeyword_7_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGAME.g:4435:1: rule__Lieu__Group_7__1 : rule__Lieu__Group_7__1__Impl ;
    public final void rule__Lieu__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4439:1: ( rule__Lieu__Group_7__1__Impl )
            // InternalGAME.g:4440:2: rule__Lieu__Group_7__1__Impl
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
    // InternalGAME.g:4446:1: rule__Lieu__Group_7__1__Impl : ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) ) ;
    public final void rule__Lieu__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4450:1: ( ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) ) )
            // InternalGAME.g:4451:1: ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) )
            {
            // InternalGAME.g:4451:1: ( ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* ) )
            // InternalGAME.g:4452:2: ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) ) ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* )
            {
            // InternalGAME.g:4452:2: ( ( rule__Lieu__CheminspossibleAssignment_7_1 ) )
            // InternalGAME.g:4453:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleAssignment_7_1()); 
            // InternalGAME.g:4454:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )
            // InternalGAME.g:4454:4: rule__Lieu__CheminspossibleAssignment_7_1
            {
            pushFollow(FOLLOW_9);
            rule__Lieu__CheminspossibleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getCheminspossibleAssignment_7_1()); 

            }

            // InternalGAME.g:4457:2: ( ( rule__Lieu__CheminspossibleAssignment_7_1 )* )
            // InternalGAME.g:4458:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )*
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleAssignment_7_1()); 
            // InternalGAME.g:4459:3: ( rule__Lieu__CheminspossibleAssignment_7_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGAME.g:4459:4: rule__Lieu__CheminspossibleAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Lieu__CheminspossibleAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalGAME.g:4469:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4473:1: ( ( RULE_ID ) )
            // InternalGAME.g:4474:2: ( RULE_ID )
            {
            // InternalGAME.g:4474:2: ( RULE_ID )
            // InternalGAME.g:4475:3: RULE_ID
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
    // InternalGAME.g:4484:1: rule__Jeu__ExplorateurAssignment_3 : ( ruleExplorateur ) ;
    public final void rule__Jeu__ExplorateurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4488:1: ( ( ruleExplorateur ) )
            // InternalGAME.g:4489:2: ( ruleExplorateur )
            {
            // InternalGAME.g:4489:2: ( ruleExplorateur )
            // InternalGAME.g:4490:3: ruleExplorateur
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
    // InternalGAME.g:4499:1: rule__Jeu__PointDepartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Jeu__PointDepartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4503:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4504:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4504:2: ( ( RULE_ID ) )
            // InternalGAME.g:4505:3: ( RULE_ID )
            {
             before(grammarAccess.getJeuAccess().getPointDepartLieuCrossReference_5_0()); 
            // InternalGAME.g:4506:3: ( RULE_ID )
            // InternalGAME.g:4507:4: RULE_ID
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
    // InternalGAME.g:4518:1: rule__Jeu__PointFinAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Jeu__PointFinAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4522:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4523:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4523:2: ( ( RULE_ID ) )
            // InternalGAME.g:4524:3: ( RULE_ID )
            {
             before(grammarAccess.getJeuAccess().getPointFinLieuCrossReference_7_0()); 
            // InternalGAME.g:4525:3: ( RULE_ID )
            // InternalGAME.g:4526:4: RULE_ID
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
    // InternalGAME.g:4537:1: rule__Jeu__LieuxAssignment_8 : ( ruleLieu ) ;
    public final void rule__Jeu__LieuxAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4541:1: ( ( ruleLieu ) )
            // InternalGAME.g:4542:2: ( ruleLieu )
            {
            // InternalGAME.g:4542:2: ( ruleLieu )
            // InternalGAME.g:4543:3: ruleLieu
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
    // InternalGAME.g:4552:1: rule__Jeu__ObjetsAssignment_9 : ( ruleObjet ) ;
    public final void rule__Jeu__ObjetsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4556:1: ( ( ruleObjet ) )
            // InternalGAME.g:4557:2: ( ruleObjet )
            {
            // InternalGAME.g:4557:2: ( ruleObjet )
            // InternalGAME.g:4558:3: ruleObjet
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


    // $ANTLR start "rule__Jeu__ConnaissancesAssignment_10"
    // InternalGAME.g:4567:1: rule__Jeu__ConnaissancesAssignment_10 : ( ruleConnaissance ) ;
    public final void rule__Jeu__ConnaissancesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4571:1: ( ( ruleConnaissance ) )
            // InternalGAME.g:4572:2: ( ruleConnaissance )
            {
            // InternalGAME.g:4572:2: ( ruleConnaissance )
            // InternalGAME.g:4573:3: ruleConnaissance
            {
             before(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ConnaissancesAssignment_10"


    // $ANTLR start "rule__Jeu__PersonnesAssignment_11"
    // InternalGAME.g:4582:1: rule__Jeu__PersonnesAssignment_11 : ( rulePersonne ) ;
    public final void rule__Jeu__PersonnesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4586:1: ( ( rulePersonne ) )
            // InternalGAME.g:4587:2: ( rulePersonne )
            {
            // InternalGAME.g:4587:2: ( rulePersonne )
            // InternalGAME.g:4588:3: rulePersonne
            {
             before(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__PersonnesAssignment_11"


    // $ANTLR start "rule__Jeu__CheminsAssignment_12"
    // InternalGAME.g:4597:1: rule__Jeu__CheminsAssignment_12 : ( ruleChemin ) ;
    public final void rule__Jeu__CheminsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4601:1: ( ( ruleChemin ) )
            // InternalGAME.g:4602:2: ( ruleChemin )
            {
            // InternalGAME.g:4602:2: ( ruleChemin )
            // InternalGAME.g:4603:3: ruleChemin
            {
             before(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__CheminsAssignment_12"


    // $ANTLR start "rule__Chemin__NameAssignment_1"
    // InternalGAME.g:4612:1: rule__Chemin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chemin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4616:1: ( ( RULE_ID ) )
            // InternalGAME.g:4617:2: ( RULE_ID )
            {
            // InternalGAME.g:4617:2: ( RULE_ID )
            // InternalGAME.g:4618:3: RULE_ID
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
    // InternalGAME.g:4627:1: rule__Chemin__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Chemin__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4631:1: ( ( ruleDescription ) )
            // InternalGAME.g:4632:2: ( ruleDescription )
            {
            // InternalGAME.g:4632:2: ( ruleDescription )
            // InternalGAME.g:4633:3: ruleDescription
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
    // InternalGAME.g:4642:1: rule__Chemin__DepartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__DepartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4646:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4647:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4647:2: ( ( RULE_ID ) )
            // InternalGAME.g:4648:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getDepartLieuCrossReference_5_0()); 
            // InternalGAME.g:4649:3: ( RULE_ID )
            // InternalGAME.g:4650:4: RULE_ID
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
    // InternalGAME.g:4661:1: rule__Chemin__ArriveAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ArriveAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4665:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4666:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4666:2: ( ( RULE_ID ) )
            // InternalGAME.g:4667:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getArriveLieuCrossReference_7_0()); 
            // InternalGAME.g:4668:3: ( RULE_ID )
            // InternalGAME.g:4669:4: RULE_ID
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
    // InternalGAME.g:4680:1: rule__Chemin__VisibiliteAssignment_8 : ( ruleVisibilite ) ;
    public final void rule__Chemin__VisibiliteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4684:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:4685:2: ( ruleVisibilite )
            {
            // InternalGAME.g:4685:2: ( ruleVisibilite )
            // InternalGAME.g:4686:3: ruleVisibilite
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
    // InternalGAME.g:4695:1: rule__Chemin__ConditionsVisibiliteAssignment_9_1 : ( ruleCondition ) ;
    public final void rule__Chemin__ConditionsVisibiliteAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4699:1: ( ( ruleCondition ) )
            // InternalGAME.g:4700:2: ( ruleCondition )
            {
            // InternalGAME.g:4700:2: ( ruleCondition )
            // InternalGAME.g:4701:3: ruleCondition
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
    // InternalGAME.g:4710:1: rule__Chemin__OuvertureAssignment_10 : ( ruleOuverture ) ;
    public final void rule__Chemin__OuvertureAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4714:1: ( ( ruleOuverture ) )
            // InternalGAME.g:4715:2: ( ruleOuverture )
            {
            // InternalGAME.g:4715:2: ( ruleOuverture )
            // InternalGAME.g:4716:3: ruleOuverture
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
    // InternalGAME.g:4725:1: rule__Chemin__ConditionsOuvertureAssignment_11_1 : ( ruleCondition ) ;
    public final void rule__Chemin__ConditionsOuvertureAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4729:1: ( ( ruleCondition ) )
            // InternalGAME.g:4730:2: ( ruleCondition )
            {
            // InternalGAME.g:4730:2: ( ruleCondition )
            // InternalGAME.g:4731:3: ruleCondition
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
    // InternalGAME.g:4740:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4744:1: ( ( RULE_ID ) )
            // InternalGAME.g:4745:2: ( RULE_ID )
            {
            // InternalGAME.g:4745:2: ( RULE_ID )
            // InternalGAME.g:4746:3: RULE_ID
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


    // $ANTLR start "rule__Personne__DescriptionsAssignment_3"
    // InternalGAME.g:4755:1: rule__Personne__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Personne__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4759:1: ( ( ruleDescription ) )
            // InternalGAME.g:4760:2: ( ruleDescription )
            {
            // InternalGAME.g:4760:2: ( ruleDescription )
            // InternalGAME.g:4761:3: ruleDescription
            {
             before(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__DescriptionsAssignment_3"


    // $ANTLR start "rule__Personne__InteractionAssignment_4"
    // InternalGAME.g:4770:1: rule__Personne__InteractionAssignment_4 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4774:1: ( ( ruleInteraction ) )
            // InternalGAME.g:4775:2: ( ruleInteraction )
            {
            // InternalGAME.g:4775:2: ( ruleInteraction )
            // InternalGAME.g:4776:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__InteractionAssignment_4"


    // $ANTLR start "rule__Personne__VisibiliteAssignment_5"
    // InternalGAME.g:4785:1: rule__Personne__VisibiliteAssignment_5 : ( ruleVisibilite ) ;
    public final void rule__Personne__VisibiliteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4789:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:4790:2: ( ruleVisibilite )
            {
            // InternalGAME.g:4790:2: ( ruleVisibilite )
            // InternalGAME.g:4791:3: ruleVisibilite
            {
             before(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__VisibiliteAssignment_5"


    // $ANTLR start "rule__Personne__ConditionsVisibiliteAssignment_6_1"
    // InternalGAME.g:4800:1: rule__Personne__ConditionsVisibiliteAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Personne__ConditionsVisibiliteAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4804:1: ( ( ruleCondition ) )
            // InternalGAME.g:4805:2: ( ruleCondition )
            {
            // InternalGAME.g:4805:2: ( ruleCondition )
            // InternalGAME.g:4806:3: ruleCondition
            {
             before(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ConditionsVisibiliteAssignment_6_1"


    // $ANTLR start "rule__Interaction__EchangesAssignment_2"
    // InternalGAME.g:4815:1: rule__Interaction__EchangesAssignment_2 : ( ruleEchange ) ;
    public final void rule__Interaction__EchangesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4819:1: ( ( ruleEchange ) )
            // InternalGAME.g:4820:2: ( ruleEchange )
            {
            // InternalGAME.g:4820:2: ( ruleEchange )
            // InternalGAME.g:4821:3: ruleEchange
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
    // InternalGAME.g:4830:1: rule__Interaction__ChoixAssignment_3 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4834:1: ( ( ruleChoix ) )
            // InternalGAME.g:4835:2: ( ruleChoix )
            {
            // InternalGAME.g:4835:2: ( ruleChoix )
            // InternalGAME.g:4836:3: ruleChoix
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
    // InternalGAME.g:4845:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4849:1: ( ( RULE_ID ) )
            // InternalGAME.g:4850:2: ( RULE_ID )
            {
            // InternalGAME.g:4850:2: ( RULE_ID )
            // InternalGAME.g:4851:3: RULE_ID
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
    // InternalGAME.g:4860:1: rule__Choix__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__Choix__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4864:1: ( ( ruleAction ) )
            // InternalGAME.g:4865:2: ( ruleAction )
            {
            // InternalGAME.g:4865:2: ( ruleAction )
            // InternalGAME.g:4866:3: ruleAction
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
    // InternalGAME.g:4875:1: rule__Choix__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Choix__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4879:1: ( ( ruleCondition ) )
            // InternalGAME.g:4880:2: ( ruleCondition )
            {
            // InternalGAME.g:4880:2: ( ruleCondition )
            // InternalGAME.g:4881:3: ruleCondition
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
    // InternalGAME.g:4890:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4894:1: ( ( RULE_ID ) )
            // InternalGAME.g:4895:2: ( RULE_ID )
            {
            // InternalGAME.g:4895:2: ( RULE_ID )
            // InternalGAME.g:4896:3: RULE_ID
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
    // InternalGAME.g:4905:1: rule__Action__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Action__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4909:1: ( ( ruleDescription ) )
            // InternalGAME.g:4910:2: ( ruleDescription )
            {
            // InternalGAME.g:4910:2: ( ruleDescription )
            // InternalGAME.g:4911:3: ruleDescription
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
    // InternalGAME.g:4920:1: rule__Action__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Action__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4924:1: ( ( ruleCondition ) )
            // InternalGAME.g:4925:2: ( ruleCondition )
            {
            // InternalGAME.g:4925:2: ( ruleCondition )
            // InternalGAME.g:4926:3: ruleCondition
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
    // InternalGAME.g:4935:1: rule__Action__EchangesAssignment_5 : ( ruleEchange ) ;
    public final void rule__Action__EchangesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4939:1: ( ( ruleEchange ) )
            // InternalGAME.g:4940:2: ( ruleEchange )
            {
            // InternalGAME.g:4940:2: ( ruleEchange )
            // InternalGAME.g:4941:3: ruleEchange
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
    // InternalGAME.g:4950:1: rule__Echange__ObjetsDonneAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Echange__ObjetsDonneAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4954:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4955:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4955:2: ( ( RULE_ID ) )
            // InternalGAME.g:4956:3: ( RULE_ID )
            {
             before(grammarAccess.getEchangeAccess().getObjetsDonneObjetCrossReference_3_1_0()); 
            // InternalGAME.g:4957:3: ( RULE_ID )
            // InternalGAME.g:4958:4: RULE_ID
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
    // InternalGAME.g:4969:1: rule__Echange__ObjetsPrisAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Echange__ObjetsPrisAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4973:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4974:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4974:2: ( ( RULE_ID ) )
            // InternalGAME.g:4975:3: ( RULE_ID )
            {
             before(grammarAccess.getEchangeAccess().getObjetsPrisObjetCrossReference_4_1_0()); 
            // InternalGAME.g:4976:3: ( RULE_ID )
            // InternalGAME.g:4977:4: RULE_ID
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
    // InternalGAME.g:4988:1: rule__Echange__ConnaissancesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Echange__ConnaissancesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:4992:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:4993:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:4993:2: ( ( RULE_ID ) )
            // InternalGAME.g:4994:3: ( RULE_ID )
            {
             before(grammarAccess.getEchangeAccess().getConnaissancesConnaissanceCrossReference_5_1_0()); 
            // InternalGAME.g:4995:3: ( RULE_ID )
            // InternalGAME.g:4996:4: RULE_ID
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
    // InternalGAME.g:5007:1: rule__Echange__ConditionsAssignment_6 : ( ruleCondition ) ;
    public final void rule__Echange__ConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5011:1: ( ( ruleCondition ) )
            // InternalGAME.g:5012:2: ( ruleCondition )
            {
            // InternalGAME.g:5012:2: ( ruleCondition )
            // InternalGAME.g:5013:3: ruleCondition
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
    // InternalGAME.g:5022:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5026:1: ( ( RULE_ID ) )
            // InternalGAME.g:5027:2: ( RULE_ID )
            {
            // InternalGAME.g:5027:2: ( RULE_ID )
            // InternalGAME.g:5028:3: RULE_ID
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
    // InternalGAME.g:5037:1: rule__Objet__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Objet__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5041:1: ( ( ruleDescription ) )
            // InternalGAME.g:5042:2: ( ruleDescription )
            {
            // InternalGAME.g:5042:2: ( ruleDescription )
            // InternalGAME.g:5043:3: ruleDescription
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
    // InternalGAME.g:5052:1: rule__Objet__TailleAssignment_5 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5056:1: ( ( RULE_INT ) )
            // InternalGAME.g:5057:2: ( RULE_INT )
            {
            // InternalGAME.g:5057:2: ( RULE_INT )
            // InternalGAME.g:5058:3: RULE_INT
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


    // $ANTLR start "rule__Objet__QuantiteAssignment_7"
    // InternalGAME.g:5067:1: rule__Objet__QuantiteAssignment_7 : ( RULE_INT ) ;
    public final void rule__Objet__QuantiteAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5071:1: ( ( RULE_INT ) )
            // InternalGAME.g:5072:2: ( RULE_INT )
            {
            // InternalGAME.g:5072:2: ( RULE_INT )
            // InternalGAME.g:5073:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__QuantiteAssignment_7"


    // $ANTLR start "rule__Objet__VisibiliteAssignment_8"
    // InternalGAME.g:5082:1: rule__Objet__VisibiliteAssignment_8 : ( ruleVisibilite ) ;
    public final void rule__Objet__VisibiliteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5086:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:5087:2: ( ruleVisibilite )
            {
            // InternalGAME.g:5087:2: ( ruleVisibilite )
            // InternalGAME.g:5088:3: ruleVisibilite
            {
             before(grammarAccess.getObjetAccess().getVisibiliteVisibiliteEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getVisibiliteVisibiliteEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__VisibiliteAssignment_8"


    // $ANTLR start "rule__Objet__ConditionsVisibiliteAssignment_9_1"
    // InternalGAME.g:5097:1: rule__Objet__ConditionsVisibiliteAssignment_9_1 : ( ruleCondition ) ;
    public final void rule__Objet__ConditionsVisibiliteAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5101:1: ( ( ruleCondition ) )
            // InternalGAME.g:5102:2: ( ruleCondition )
            {
            // InternalGAME.g:5102:2: ( ruleCondition )
            // InternalGAME.g:5103:3: ruleCondition
            {
             before(grammarAccess.getObjetAccess().getConditionsVisibiliteConditionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getConditionsVisibiliteConditionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objet__ConditionsVisibiliteAssignment_9_1"


    // $ANTLR start "rule__Description__TextAssignment_2"
    // InternalGAME.g:5112:1: rule__Description__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5116:1: ( ( RULE_STRING ) )
            // InternalGAME.g:5117:2: ( RULE_STRING )
            {
            // InternalGAME.g:5117:2: ( RULE_STRING )
            // InternalGAME.g:5118:3: RULE_STRING
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
    // InternalGAME.g:5127:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5131:1: ( ( RULE_ID ) )
            // InternalGAME.g:5132:2: ( RULE_ID )
            {
            // InternalGAME.g:5132:2: ( RULE_ID )
            // InternalGAME.g:5133:3: RULE_ID
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
    // InternalGAME.g:5142:1: rule__Condition__ObjetsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5146:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5147:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5147:2: ( ( RULE_ID ) )
            // InternalGAME.g:5148:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsObjetCrossReference_3_2_0()); 
            // InternalGAME.g:5149:3: ( RULE_ID )
            // InternalGAME.g:5150:4: RULE_ID
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
    // InternalGAME.g:5161:1: rule__Condition__ObjetsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ObjetsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5165:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5166:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5166:2: ( ( RULE_ID ) )
            // InternalGAME.g:5167:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getObjetsObjetCrossReference_4_2_0()); 
            // InternalGAME.g:5168:3: ( RULE_ID )
            // InternalGAME.g:5169:4: RULE_ID
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
    // InternalGAME.g:5180:1: rule__Condition__ConnaissancesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissancesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5184:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5185:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5185:2: ( ( RULE_ID ) )
            // InternalGAME.g:5186:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissancesConnaissanceCrossReference_5_2_0()); 
            // InternalGAME.g:5187:3: ( RULE_ID )
            // InternalGAME.g:5188:4: RULE_ID
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
    // InternalGAME.g:5199:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5203:1: ( ( RULE_ID ) )
            // InternalGAME.g:5204:2: ( RULE_ID )
            {
            // InternalGAME.g:5204:2: ( RULE_ID )
            // InternalGAME.g:5205:3: RULE_ID
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
    // InternalGAME.g:5214:1: rule__Connaissance__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Connaissance__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5218:1: ( ( ruleDescription ) )
            // InternalGAME.g:5219:2: ( ruleDescription )
            {
            // InternalGAME.g:5219:2: ( ruleDescription )
            // InternalGAME.g:5220:3: ruleDescription
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
    // InternalGAME.g:5229:1: rule__Connaissance__VisibiliteAssignment_4 : ( ruleVisibilite ) ;
    public final void rule__Connaissance__VisibiliteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5233:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:5234:2: ( ruleVisibilite )
            {
            // InternalGAME.g:5234:2: ( ruleVisibilite )
            // InternalGAME.g:5235:3: ruleVisibilite
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
    // InternalGAME.g:5244:1: rule__Connaissance__ConditionsVisibiliteAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__Connaissance__ConditionsVisibiliteAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5248:1: ( ( ruleCondition ) )
            // InternalGAME.g:5249:2: ( ruleCondition )
            {
            // InternalGAME.g:5249:2: ( ruleCondition )
            // InternalGAME.g:5250:3: ruleCondition
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
    // InternalGAME.g:5259:1: rule__Explorateur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Explorateur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5263:1: ( ( RULE_ID ) )
            // InternalGAME.g:5264:2: ( RULE_ID )
            {
            // InternalGAME.g:5264:2: ( RULE_ID )
            // InternalGAME.g:5265:3: RULE_ID
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
    // InternalGAME.g:5274:1: rule__Explorateur__TailleAssignment_4 : ( RULE_INT ) ;
    public final void rule__Explorateur__TailleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5278:1: ( ( RULE_INT ) )
            // InternalGAME.g:5279:2: ( RULE_INT )
            {
            // InternalGAME.g:5279:2: ( RULE_INT )
            // InternalGAME.g:5280:3: RULE_INT
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
    // InternalGAME.g:5289:1: rule__Explorateur__ObjetsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ObjetsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5293:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5294:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5294:2: ( ( RULE_ID ) )
            // InternalGAME.g:5295:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetCrossReference_6_0()); 
            // InternalGAME.g:5296:3: ( RULE_ID )
            // InternalGAME.g:5297:4: RULE_ID
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExplorateurAccess().getObjetsObjetIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getExplorateurAccess().getObjetsObjetCrossReference_6_0()); 

            }


            }

        }
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
    // InternalGAME.g:5308:1: rule__Explorateur__ConnaissancesAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5312:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5313:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5313:2: ( ( RULE_ID ) )
            // InternalGAME.g:5314:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_8_0()); 
            // InternalGAME.g:5315:3: ( RULE_ID )
            // InternalGAME.g:5316:4: RULE_ID
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
    // InternalGAME.g:5327:1: rule__Explorateur__LocalisationAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__LocalisationAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5331:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5332:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5332:2: ( ( RULE_ID ) )
            // InternalGAME.g:5333:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationLieuCrossReference_10_0()); 
            // InternalGAME.g:5334:3: ( RULE_ID )
            // InternalGAME.g:5335:4: RULE_ID
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


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalGAME.g:5346:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5350:1: ( ( RULE_ID ) )
            // InternalGAME.g:5351:2: ( RULE_ID )
            {
            // InternalGAME.g:5351:2: ( RULE_ID )
            // InternalGAME.g:5352:3: RULE_ID
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
    // InternalGAME.g:5361:1: rule__Lieu__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Lieu__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5365:1: ( ( ruleDescription ) )
            // InternalGAME.g:5366:2: ( ruleDescription )
            {
            // InternalGAME.g:5366:2: ( ruleDescription )
            // InternalGAME.g:5367:3: ruleDescription
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
    // InternalGAME.g:5376:1: rule__Lieu__ObjetsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ObjetsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5380:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5381:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5381:2: ( ( RULE_ID ) )
            // InternalGAME.g:5382:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_2_0()); 
            // InternalGAME.g:5383:3: ( RULE_ID )
            // InternalGAME.g:5384:4: RULE_ID
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
    // InternalGAME.g:5395:1: rule__Lieu__ConnaissancesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ConnaissancesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5399:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5400:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5400:2: ( ( RULE_ID ) )
            // InternalGAME.g:5401:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_2_0()); 
            // InternalGAME.g:5402:3: ( RULE_ID )
            // InternalGAME.g:5403:4: RULE_ID
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
    // InternalGAME.g:5414:1: rule__Lieu__PersonnesAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__PersonnesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5418:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5419:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5419:2: ( ( RULE_ID ) )
            // InternalGAME.g:5420:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_0()); 
            // InternalGAME.g:5421:3: ( RULE_ID )
            // InternalGAME.g:5422:4: RULE_ID
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
    // InternalGAME.g:5433:1: rule__Lieu__CheminspossibleAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__CheminspossibleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:5437:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:5438:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:5438:2: ( ( RULE_ID ) )
            // InternalGAME.g:5439:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getCheminspossibleCheminCrossReference_7_1_0()); 
            // InternalGAME.g:5440:3: ( RULE_ID )
            // InternalGAME.g:5441:4: RULE_ID
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000420101180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000806000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001008080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001010000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000010E0080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000012000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800001800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0006012800080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});

}