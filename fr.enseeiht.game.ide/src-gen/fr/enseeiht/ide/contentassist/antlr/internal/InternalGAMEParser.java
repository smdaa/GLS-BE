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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'visible'", "'invisible'", "'jeu'", "'{'", "'}'", "'chemin'", "'de'", "'vers'", "'si'", "'personne'", "'interaction'", "'choix'", "'objet'", "'taille'", "'description'", "'condition'", "'connaissance'", "'explorateur'", "'inventaireO'", "'inventaireC'", "'localisation'", "'lieu'", "'objets'", "'connaissances'", "'personnes'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
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


    // $ANTLR start "entryRuleObjet"
    // InternalGAME.g:178:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalGAME.g:179:1: ( ruleObjet EOF )
            // InternalGAME.g:180:1: ruleObjet EOF
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
    // InternalGAME.g:187:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:191:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalGAME.g:192:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalGAME.g:192:2: ( ( rule__Objet__Group__0 ) )
            // InternalGAME.g:193:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalGAME.g:194:3: ( rule__Objet__Group__0 )
            // InternalGAME.g:194:4: rule__Objet__Group__0
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
    // InternalGAME.g:203:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalGAME.g:204:1: ( ruleDescription EOF )
            // InternalGAME.g:205:1: ruleDescription EOF
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
    // InternalGAME.g:212:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:216:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalGAME.g:217:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalGAME.g:217:2: ( ( rule__Description__Group__0 ) )
            // InternalGAME.g:218:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalGAME.g:219:3: ( rule__Description__Group__0 )
            // InternalGAME.g:219:4: rule__Description__Group__0
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
    // InternalGAME.g:228:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGAME.g:229:1: ( ruleCondition EOF )
            // InternalGAME.g:230:1: ruleCondition EOF
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
    // InternalGAME.g:237:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:241:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGAME.g:242:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGAME.g:242:2: ( ( rule__Condition__Group__0 ) )
            // InternalGAME.g:243:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGAME.g:244:3: ( rule__Condition__Group__0 )
            // InternalGAME.g:244:4: rule__Condition__Group__0
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
    // InternalGAME.g:253:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalGAME.g:254:1: ( ruleConnaissance EOF )
            // InternalGAME.g:255:1: ruleConnaissance EOF
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
    // InternalGAME.g:262:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:266:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalGAME.g:267:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalGAME.g:267:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalGAME.g:268:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalGAME.g:269:3: ( rule__Connaissance__Group__0 )
            // InternalGAME.g:269:4: rule__Connaissance__Group__0
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
    // InternalGAME.g:278:1: entryRuleExplorateur : ruleExplorateur EOF ;
    public final void entryRuleExplorateur() throws RecognitionException {
        try {
            // InternalGAME.g:279:1: ( ruleExplorateur EOF )
            // InternalGAME.g:280:1: ruleExplorateur EOF
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
    // InternalGAME.g:287:1: ruleExplorateur : ( ( rule__Explorateur__Group__0 ) ) ;
    public final void ruleExplorateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:291:2: ( ( ( rule__Explorateur__Group__0 ) ) )
            // InternalGAME.g:292:2: ( ( rule__Explorateur__Group__0 ) )
            {
            // InternalGAME.g:292:2: ( ( rule__Explorateur__Group__0 ) )
            // InternalGAME.g:293:3: ( rule__Explorateur__Group__0 )
            {
             before(grammarAccess.getExplorateurAccess().getGroup()); 
            // InternalGAME.g:294:3: ( rule__Explorateur__Group__0 )
            // InternalGAME.g:294:4: rule__Explorateur__Group__0
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
    // InternalGAME.g:303:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalGAME.g:304:1: ( ruleLieu EOF )
            // InternalGAME.g:305:1: ruleLieu EOF
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
    // InternalGAME.g:312:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:316:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalGAME.g:317:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalGAME.g:317:2: ( ( rule__Lieu__Group__0 ) )
            // InternalGAME.g:318:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalGAME.g:319:3: ( rule__Lieu__Group__0 )
            // InternalGAME.g:319:4: rule__Lieu__Group__0
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
    // InternalGAME.g:328:1: ruleVisibilite : ( ( rule__Visibilite__Alternatives ) ) ;
    public final void ruleVisibilite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:332:1: ( ( ( rule__Visibilite__Alternatives ) ) )
            // InternalGAME.g:333:2: ( ( rule__Visibilite__Alternatives ) )
            {
            // InternalGAME.g:333:2: ( ( rule__Visibilite__Alternatives ) )
            // InternalGAME.g:334:3: ( rule__Visibilite__Alternatives )
            {
             before(grammarAccess.getVisibiliteAccess().getAlternatives()); 
            // InternalGAME.g:335:3: ( rule__Visibilite__Alternatives )
            // InternalGAME.g:335:4: rule__Visibilite__Alternatives
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


    // $ANTLR start "rule__Visibilite__Alternatives"
    // InternalGAME.g:343:1: rule__Visibilite__Alternatives : ( ( ( 'visible' ) ) | ( ( 'invisible' ) ) );
    public final void rule__Visibilite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:347:1: ( ( ( 'visible' ) ) | ( ( 'invisible' ) ) )
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
                    // InternalGAME.g:348:2: ( ( 'visible' ) )
                    {
                    // InternalGAME.g:348:2: ( ( 'visible' ) )
                    // InternalGAME.g:349:3: ( 'visible' )
                    {
                     before(grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalGAME.g:350:3: ( 'visible' )
                    // InternalGAME.g:350:4: 'visible'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:354:2: ( ( 'invisible' ) )
                    {
                    // InternalGAME.g:354:2: ( ( 'invisible' ) )
                    // InternalGAME.g:355:3: ( 'invisible' )
                    {
                     before(grammarAccess.getVisibiliteAccess().getInvisibleEnumLiteralDeclaration_1()); 
                    // InternalGAME.g:356:3: ( 'invisible' )
                    // InternalGAME.g:356:4: 'invisible'
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


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalGAME.g:364:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:368:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalGAME.g:369:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalGAME.g:376:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:380:1: ( ( 'jeu' ) )
            // InternalGAME.g:381:1: ( 'jeu' )
            {
            // InternalGAME.g:381:1: ( 'jeu' )
            // InternalGAME.g:382:2: 'jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGAME.g:391:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:395:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalGAME.g:396:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalGAME.g:403:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:407:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalGAME.g:408:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalGAME.g:408:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalGAME.g:409:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalGAME.g:410:2: ( rule__Jeu__NameAssignment_1 )
            // InternalGAME.g:410:3: rule__Jeu__NameAssignment_1
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
    // InternalGAME.g:418:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:422:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalGAME.g:423:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalGAME.g:430:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:434:1: ( ( '{' ) )
            // InternalGAME.g:435:1: ( '{' )
            {
            // InternalGAME.g:435:1: ( '{' )
            // InternalGAME.g:436:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:445:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:449:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalGAME.g:450:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
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
    // InternalGAME.g:457:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__ExplorateurAssignment_3 ) ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:461:1: ( ( ( rule__Jeu__ExplorateurAssignment_3 ) ) )
            // InternalGAME.g:462:1: ( ( rule__Jeu__ExplorateurAssignment_3 ) )
            {
            // InternalGAME.g:462:1: ( ( rule__Jeu__ExplorateurAssignment_3 ) )
            // InternalGAME.g:463:2: ( rule__Jeu__ExplorateurAssignment_3 )
            {
             before(grammarAccess.getJeuAccess().getExplorateurAssignment_3()); 
            // InternalGAME.g:464:2: ( rule__Jeu__ExplorateurAssignment_3 )
            // InternalGAME.g:464:3: rule__Jeu__ExplorateurAssignment_3
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
    // InternalGAME.g:472:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:476:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalGAME.g:477:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalGAME.g:484:1: rule__Jeu__Group__4__Impl : ( ( rule__Jeu__LieuxAssignment_4 )* ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:488:1: ( ( ( rule__Jeu__LieuxAssignment_4 )* ) )
            // InternalGAME.g:489:1: ( ( rule__Jeu__LieuxAssignment_4 )* )
            {
            // InternalGAME.g:489:1: ( ( rule__Jeu__LieuxAssignment_4 )* )
            // InternalGAME.g:490:2: ( rule__Jeu__LieuxAssignment_4 )*
            {
             before(grammarAccess.getJeuAccess().getLieuxAssignment_4()); 
            // InternalGAME.g:491:2: ( rule__Jeu__LieuxAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGAME.g:491:3: rule__Jeu__LieuxAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Jeu__LieuxAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getLieuxAssignment_4()); 

            }


            }

        }
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
    // InternalGAME.g:499:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl rule__Jeu__Group__6 ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:503:1: ( rule__Jeu__Group__5__Impl rule__Jeu__Group__6 )
            // InternalGAME.g:504:2: rule__Jeu__Group__5__Impl rule__Jeu__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalGAME.g:511:1: rule__Jeu__Group__5__Impl : ( ( rule__Jeu__ObjetsAssignment_5 )* ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:515:1: ( ( ( rule__Jeu__ObjetsAssignment_5 )* ) )
            // InternalGAME.g:516:1: ( ( rule__Jeu__ObjetsAssignment_5 )* )
            {
            // InternalGAME.g:516:1: ( ( rule__Jeu__ObjetsAssignment_5 )* )
            // InternalGAME.g:517:2: ( rule__Jeu__ObjetsAssignment_5 )*
            {
             before(grammarAccess.getJeuAccess().getObjetsAssignment_5()); 
            // InternalGAME.g:518:2: ( rule__Jeu__ObjetsAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGAME.g:518:3: rule__Jeu__ObjetsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Jeu__ObjetsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getObjetsAssignment_5()); 

            }


            }

        }
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
    // InternalGAME.g:526:1: rule__Jeu__Group__6 : rule__Jeu__Group__6__Impl rule__Jeu__Group__7 ;
    public final void rule__Jeu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:530:1: ( rule__Jeu__Group__6__Impl rule__Jeu__Group__7 )
            // InternalGAME.g:531:2: rule__Jeu__Group__6__Impl rule__Jeu__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalGAME.g:538:1: rule__Jeu__Group__6__Impl : ( ( rule__Jeu__ConnaissancesAssignment_6 )* ) ;
    public final void rule__Jeu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:542:1: ( ( ( rule__Jeu__ConnaissancesAssignment_6 )* ) )
            // InternalGAME.g:543:1: ( ( rule__Jeu__ConnaissancesAssignment_6 )* )
            {
            // InternalGAME.g:543:1: ( ( rule__Jeu__ConnaissancesAssignment_6 )* )
            // InternalGAME.g:544:2: ( rule__Jeu__ConnaissancesAssignment_6 )*
            {
             before(grammarAccess.getJeuAccess().getConnaissancesAssignment_6()); 
            // InternalGAME.g:545:2: ( rule__Jeu__ConnaissancesAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGAME.g:545:3: rule__Jeu__ConnaissancesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Jeu__ConnaissancesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getConnaissancesAssignment_6()); 

            }


            }

        }
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
    // InternalGAME.g:553:1: rule__Jeu__Group__7 : rule__Jeu__Group__7__Impl rule__Jeu__Group__8 ;
    public final void rule__Jeu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:557:1: ( rule__Jeu__Group__7__Impl rule__Jeu__Group__8 )
            // InternalGAME.g:558:2: rule__Jeu__Group__7__Impl rule__Jeu__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalGAME.g:565:1: rule__Jeu__Group__7__Impl : ( ( rule__Jeu__PersonnesAssignment_7 )* ) ;
    public final void rule__Jeu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:569:1: ( ( ( rule__Jeu__PersonnesAssignment_7 )* ) )
            // InternalGAME.g:570:1: ( ( rule__Jeu__PersonnesAssignment_7 )* )
            {
            // InternalGAME.g:570:1: ( ( rule__Jeu__PersonnesAssignment_7 )* )
            // InternalGAME.g:571:2: ( rule__Jeu__PersonnesAssignment_7 )*
            {
             before(grammarAccess.getJeuAccess().getPersonnesAssignment_7()); 
            // InternalGAME.g:572:2: ( rule__Jeu__PersonnesAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGAME.g:572:3: rule__Jeu__PersonnesAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Jeu__PersonnesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getPersonnesAssignment_7()); 

            }


            }

        }
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
    // InternalGAME.g:580:1: rule__Jeu__Group__8 : rule__Jeu__Group__8__Impl rule__Jeu__Group__9 ;
    public final void rule__Jeu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:584:1: ( rule__Jeu__Group__8__Impl rule__Jeu__Group__9 )
            // InternalGAME.g:585:2: rule__Jeu__Group__8__Impl rule__Jeu__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalGAME.g:592:1: rule__Jeu__Group__8__Impl : ( ( rule__Jeu__CheminsAssignment_8 )* ) ;
    public final void rule__Jeu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:596:1: ( ( ( rule__Jeu__CheminsAssignment_8 )* ) )
            // InternalGAME.g:597:1: ( ( rule__Jeu__CheminsAssignment_8 )* )
            {
            // InternalGAME.g:597:1: ( ( rule__Jeu__CheminsAssignment_8 )* )
            // InternalGAME.g:598:2: ( rule__Jeu__CheminsAssignment_8 )*
            {
             before(grammarAccess.getJeuAccess().getCheminsAssignment_8()); 
            // InternalGAME.g:599:2: ( rule__Jeu__CheminsAssignment_8 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGAME.g:599:3: rule__Jeu__CheminsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Jeu__CheminsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getCheminsAssignment_8()); 

            }


            }

        }
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
    // InternalGAME.g:607:1: rule__Jeu__Group__9 : rule__Jeu__Group__9__Impl ;
    public final void rule__Jeu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:611:1: ( rule__Jeu__Group__9__Impl )
            // InternalGAME.g:612:2: rule__Jeu__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:618:1: rule__Jeu__Group__9__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:622:1: ( ( '}' ) )
            // InternalGAME.g:623:1: ( '}' )
            {
            // InternalGAME.g:623:1: ( '}' )
            // InternalGAME.g:624:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalGAME.g:634:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:638:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalGAME.g:639:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
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
    // InternalGAME.g:646:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:650:1: ( ( 'chemin' ) )
            // InternalGAME.g:651:1: ( 'chemin' )
            {
            // InternalGAME.g:651:1: ( 'chemin' )
            // InternalGAME.g:652:2: 'chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGAME.g:661:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:665:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalGAME.g:666:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
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
    // InternalGAME.g:673:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__NameAssignment_1 ) ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:677:1: ( ( ( rule__Chemin__NameAssignment_1 ) ) )
            // InternalGAME.g:678:1: ( ( rule__Chemin__NameAssignment_1 ) )
            {
            // InternalGAME.g:678:1: ( ( rule__Chemin__NameAssignment_1 ) )
            // InternalGAME.g:679:2: ( rule__Chemin__NameAssignment_1 )
            {
             before(grammarAccess.getCheminAccess().getNameAssignment_1()); 
            // InternalGAME.g:680:2: ( rule__Chemin__NameAssignment_1 )
            // InternalGAME.g:680:3: rule__Chemin__NameAssignment_1
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
    // InternalGAME.g:688:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:692:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalGAME.g:693:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalGAME.g:700:1: rule__Chemin__Group__2__Impl : ( '{' ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:704:1: ( ( '{' ) )
            // InternalGAME.g:705:1: ( '{' )
            {
            // InternalGAME.g:705:1: ( '{' )
            // InternalGAME.g:706:2: '{'
            {
             before(grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:715:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:719:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalGAME.g:720:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalGAME.g:727:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__DescriptionsAssignment_3 )? ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:731:1: ( ( ( rule__Chemin__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:732:1: ( ( rule__Chemin__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:732:1: ( ( rule__Chemin__DescriptionsAssignment_3 )? )
            // InternalGAME.g:733:2: ( rule__Chemin__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getCheminAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:734:2: ( rule__Chemin__DescriptionsAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGAME.g:734:3: rule__Chemin__DescriptionsAssignment_3
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
    // InternalGAME.g:742:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:746:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalGAME.g:747:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
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
    // InternalGAME.g:754:1: rule__Chemin__Group__4__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:758:1: ( ( 'de' ) )
            // InternalGAME.g:759:1: ( 'de' )
            {
            // InternalGAME.g:759:1: ( 'de' )
            // InternalGAME.g:760:2: 'de'
            {
             before(grammarAccess.getCheminAccess().getDeKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGAME.g:769:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:773:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalGAME.g:774:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalGAME.g:781:1: rule__Chemin__Group__5__Impl : ( ( rule__Chemin__DepartAssignment_5 ) ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:785:1: ( ( ( rule__Chemin__DepartAssignment_5 ) ) )
            // InternalGAME.g:786:1: ( ( rule__Chemin__DepartAssignment_5 ) )
            {
            // InternalGAME.g:786:1: ( ( rule__Chemin__DepartAssignment_5 ) )
            // InternalGAME.g:787:2: ( rule__Chemin__DepartAssignment_5 )
            {
             before(grammarAccess.getCheminAccess().getDepartAssignment_5()); 
            // InternalGAME.g:788:2: ( rule__Chemin__DepartAssignment_5 )
            // InternalGAME.g:788:3: rule__Chemin__DepartAssignment_5
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
    // InternalGAME.g:796:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:800:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalGAME.g:801:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
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
    // InternalGAME.g:808:1: rule__Chemin__Group__6__Impl : ( 'vers' ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:812:1: ( ( 'vers' ) )
            // InternalGAME.g:813:1: ( 'vers' )
            {
            // InternalGAME.g:813:1: ( 'vers' )
            // InternalGAME.g:814:2: 'vers'
            {
             before(grammarAccess.getCheminAccess().getVersKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGAME.g:823:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:827:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalGAME.g:828:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalGAME.g:835:1: rule__Chemin__Group__7__Impl : ( ( rule__Chemin__ArriveAssignment_7 ) ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:839:1: ( ( ( rule__Chemin__ArriveAssignment_7 ) ) )
            // InternalGAME.g:840:1: ( ( rule__Chemin__ArriveAssignment_7 ) )
            {
            // InternalGAME.g:840:1: ( ( rule__Chemin__ArriveAssignment_7 ) )
            // InternalGAME.g:841:2: ( rule__Chemin__ArriveAssignment_7 )
            {
             before(grammarAccess.getCheminAccess().getArriveAssignment_7()); 
            // InternalGAME.g:842:2: ( rule__Chemin__ArriveAssignment_7 )
            // InternalGAME.g:842:3: rule__Chemin__ArriveAssignment_7
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
    // InternalGAME.g:850:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:854:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalGAME.g:855:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalGAME.g:862:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__VisibiliteAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:866:1: ( ( ( rule__Chemin__VisibiliteAssignment_8 ) ) )
            // InternalGAME.g:867:1: ( ( rule__Chemin__VisibiliteAssignment_8 ) )
            {
            // InternalGAME.g:867:1: ( ( rule__Chemin__VisibiliteAssignment_8 ) )
            // InternalGAME.g:868:2: ( rule__Chemin__VisibiliteAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getVisibiliteAssignment_8()); 
            // InternalGAME.g:869:2: ( rule__Chemin__VisibiliteAssignment_8 )
            // InternalGAME.g:869:3: rule__Chemin__VisibiliteAssignment_8
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
    // InternalGAME.g:877:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:881:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalGAME.g:882:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalGAME.g:889:1: rule__Chemin__Group__9__Impl : ( 'si' ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:893:1: ( ( 'si' ) )
            // InternalGAME.g:894:1: ( 'si' )
            {
            // InternalGAME.g:894:1: ( 'si' )
            // InternalGAME.g:895:2: 'si'
            {
             before(grammarAccess.getCheminAccess().getSiKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSiKeyword_9()); 

            }


            }

        }
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
    // InternalGAME.g:904:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl rule__Chemin__Group__11 ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:908:1: ( rule__Chemin__Group__10__Impl rule__Chemin__Group__11 )
            // InternalGAME.g:909:2: rule__Chemin__Group__10__Impl rule__Chemin__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:916:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__ConditionsVisibiliteAssignment_10 ) ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:920:1: ( ( ( rule__Chemin__ConditionsVisibiliteAssignment_10 ) ) )
            // InternalGAME.g:921:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_10 ) )
            {
            // InternalGAME.g:921:1: ( ( rule__Chemin__ConditionsVisibiliteAssignment_10 ) )
            // InternalGAME.g:922:2: ( rule__Chemin__ConditionsVisibiliteAssignment_10 )
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_10()); 
            // InternalGAME.g:923:2: ( rule__Chemin__ConditionsVisibiliteAssignment_10 )
            // InternalGAME.g:923:3: rule__Chemin__ConditionsVisibiliteAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionsVisibiliteAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteAssignment_10()); 

            }


            }

        }
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
    // InternalGAME.g:931:1: rule__Chemin__Group__11 : rule__Chemin__Group__11__Impl ;
    public final void rule__Chemin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:935:1: ( rule__Chemin__Group__11__Impl )
            // InternalGAME.g:936:2: rule__Chemin__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:942:1: rule__Chemin__Group__11__Impl : ( '}' ) ;
    public final void rule__Chemin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:946:1: ( ( '}' ) )
            // InternalGAME.g:947:1: ( '}' )
            {
            // InternalGAME.g:947:1: ( '}' )
            // InternalGAME.g:948:2: '}'
            {
             before(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Personne__Group__0"
    // InternalGAME.g:958:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:962:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalGAME.g:963:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
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
    // InternalGAME.g:970:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:974:1: ( ( 'personne' ) )
            // InternalGAME.g:975:1: ( 'personne' )
            {
            // InternalGAME.g:975:1: ( 'personne' )
            // InternalGAME.g:976:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGAME.g:985:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:989:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalGAME.g:990:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
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
    // InternalGAME.g:997:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1001:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalGAME.g:1002:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalGAME.g:1002:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalGAME.g:1003:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalGAME.g:1004:2: ( rule__Personne__NameAssignment_1 )
            // InternalGAME.g:1004:3: rule__Personne__NameAssignment_1
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
    // InternalGAME.g:1012:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1016:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalGAME.g:1017:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGAME.g:1024:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1028:1: ( ( '{' ) )
            // InternalGAME.g:1029:1: ( '{' )
            {
            // InternalGAME.g:1029:1: ( '{' )
            // InternalGAME.g:1030:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:1039:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1043:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalGAME.g:1044:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalGAME.g:1051:1: rule__Personne__Group__3__Impl : ( ( rule__Personne__DescriptionsAssignment_3 ) ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1055:1: ( ( ( rule__Personne__DescriptionsAssignment_3 ) ) )
            // InternalGAME.g:1056:1: ( ( rule__Personne__DescriptionsAssignment_3 ) )
            {
            // InternalGAME.g:1056:1: ( ( rule__Personne__DescriptionsAssignment_3 ) )
            // InternalGAME.g:1057:2: ( rule__Personne__DescriptionsAssignment_3 )
            {
             before(grammarAccess.getPersonneAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:1058:2: ( rule__Personne__DescriptionsAssignment_3 )
            // InternalGAME.g:1058:3: rule__Personne__DescriptionsAssignment_3
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
    // InternalGAME.g:1066:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1070:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalGAME.g:1071:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalGAME.g:1078:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__InteractionAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1082:1: ( ( ( rule__Personne__InteractionAssignment_4 ) ) )
            // InternalGAME.g:1083:1: ( ( rule__Personne__InteractionAssignment_4 ) )
            {
            // InternalGAME.g:1083:1: ( ( rule__Personne__InteractionAssignment_4 ) )
            // InternalGAME.g:1084:2: ( rule__Personne__InteractionAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getInteractionAssignment_4()); 
            // InternalGAME.g:1085:2: ( rule__Personne__InteractionAssignment_4 )
            // InternalGAME.g:1085:3: rule__Personne__InteractionAssignment_4
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
    // InternalGAME.g:1093:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1097:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalGAME.g:1098:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalGAME.g:1105:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__VisibiliteAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1109:1: ( ( ( rule__Personne__VisibiliteAssignment_5 ) ) )
            // InternalGAME.g:1110:1: ( ( rule__Personne__VisibiliteAssignment_5 ) )
            {
            // InternalGAME.g:1110:1: ( ( rule__Personne__VisibiliteAssignment_5 ) )
            // InternalGAME.g:1111:2: ( rule__Personne__VisibiliteAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getVisibiliteAssignment_5()); 
            // InternalGAME.g:1112:2: ( rule__Personne__VisibiliteAssignment_5 )
            // InternalGAME.g:1112:3: rule__Personne__VisibiliteAssignment_5
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
    // InternalGAME.g:1120:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1124:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalGAME.g:1125:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalGAME.g:1132:1: rule__Personne__Group__6__Impl : ( 'si' ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1136:1: ( ( 'si' ) )
            // InternalGAME.g:1137:1: ( 'si' )
            {
            // InternalGAME.g:1137:1: ( 'si' )
            // InternalGAME.g:1138:2: 'si'
            {
             before(grammarAccess.getPersonneAccess().getSiKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getSiKeyword_6()); 

            }


            }

        }
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
    // InternalGAME.g:1147:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl rule__Personne__Group__8 ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1151:1: ( rule__Personne__Group__7__Impl rule__Personne__Group__8 )
            // InternalGAME.g:1152:2: rule__Personne__Group__7__Impl rule__Personne__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1159:1: rule__Personne__Group__7__Impl : ( ( rule__Personne__ConditionsVisibiliteAssignment_7 ) ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1163:1: ( ( ( rule__Personne__ConditionsVisibiliteAssignment_7 ) ) )
            // InternalGAME.g:1164:1: ( ( rule__Personne__ConditionsVisibiliteAssignment_7 ) )
            {
            // InternalGAME.g:1164:1: ( ( rule__Personne__ConditionsVisibiliteAssignment_7 ) )
            // InternalGAME.g:1165:2: ( rule__Personne__ConditionsVisibiliteAssignment_7 )
            {
             before(grammarAccess.getPersonneAccess().getConditionsVisibiliteAssignment_7()); 
            // InternalGAME.g:1166:2: ( rule__Personne__ConditionsVisibiliteAssignment_7 )
            // InternalGAME.g:1166:3: rule__Personne__ConditionsVisibiliteAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ConditionsVisibiliteAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getConditionsVisibiliteAssignment_7()); 

            }


            }

        }
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
    // InternalGAME.g:1174:1: rule__Personne__Group__8 : rule__Personne__Group__8__Impl ;
    public final void rule__Personne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1178:1: ( rule__Personne__Group__8__Impl )
            // InternalGAME.g:1179:2: rule__Personne__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:1185:1: rule__Personne__Group__8__Impl : ( '}' ) ;
    public final void rule__Personne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1189:1: ( ( '}' ) )
            // InternalGAME.g:1190:1: ( '}' )
            {
            // InternalGAME.g:1190:1: ( '}' )
            // InternalGAME.g:1191:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalGAME.g:1201:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1205:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalGAME.g:1206:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalGAME.g:1213:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1217:1: ( ( 'interaction' ) )
            // InternalGAME.g:1218:1: ( 'interaction' )
            {
            // InternalGAME.g:1218:1: ( 'interaction' )
            // InternalGAME.g:1219:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGAME.g:1228:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1232:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalGAME.g:1233:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalGAME.g:1240:1: rule__Interaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1244:1: ( ( '{' ) )
            // InternalGAME.g:1245:1: ( '{' )
            {
            // InternalGAME.g:1245:1: ( '{' )
            // InternalGAME.g:1246:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:1255:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1259:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalGAME.g:1260:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1267:1: rule__Interaction__Group__2__Impl : ( ( ( rule__Interaction__ChoixAssignment_2 ) ) ( ( rule__Interaction__ChoixAssignment_2 )* ) ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1271:1: ( ( ( ( rule__Interaction__ChoixAssignment_2 ) ) ( ( rule__Interaction__ChoixAssignment_2 )* ) ) )
            // InternalGAME.g:1272:1: ( ( ( rule__Interaction__ChoixAssignment_2 ) ) ( ( rule__Interaction__ChoixAssignment_2 )* ) )
            {
            // InternalGAME.g:1272:1: ( ( ( rule__Interaction__ChoixAssignment_2 ) ) ( ( rule__Interaction__ChoixAssignment_2 )* ) )
            // InternalGAME.g:1273:2: ( ( rule__Interaction__ChoixAssignment_2 ) ) ( ( rule__Interaction__ChoixAssignment_2 )* )
            {
            // InternalGAME.g:1273:2: ( ( rule__Interaction__ChoixAssignment_2 ) )
            // InternalGAME.g:1274:3: ( rule__Interaction__ChoixAssignment_2 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_2()); 
            // InternalGAME.g:1275:3: ( rule__Interaction__ChoixAssignment_2 )
            // InternalGAME.g:1275:4: rule__Interaction__ChoixAssignment_2
            {
            pushFollow(FOLLOW_21);
            rule__Interaction__ChoixAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixAssignment_2()); 

            }

            // InternalGAME.g:1278:2: ( ( rule__Interaction__ChoixAssignment_2 )* )
            // InternalGAME.g:1279:3: ( rule__Interaction__ChoixAssignment_2 )*
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_2()); 
            // InternalGAME.g:1280:3: ( rule__Interaction__ChoixAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGAME.g:1280:4: rule__Interaction__ChoixAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Interaction__ChoixAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getChoixAssignment_2()); 

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
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // InternalGAME.g:1289:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1293:1: ( rule__Interaction__Group__3__Impl )
            // InternalGAME.g:1294:2: rule__Interaction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:1300:1: rule__Interaction__Group__3__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1304:1: ( ( '}' ) )
            // InternalGAME.g:1305:1: ( '}' )
            {
            // InternalGAME.g:1305:1: ( '}' )
            // InternalGAME.g:1306:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Choix__Group__0"
    // InternalGAME.g:1316:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1320:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalGAME.g:1321:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
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
    // InternalGAME.g:1328:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1332:1: ( ( 'choix' ) )
            // InternalGAME.g:1333:1: ( 'choix' )
            {
            // InternalGAME.g:1333:1: ( 'choix' )
            // InternalGAME.g:1334:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGAME.g:1343:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1347:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalGAME.g:1348:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
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
    // InternalGAME.g:1355:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1359:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalGAME.g:1360:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalGAME.g:1360:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalGAME.g:1361:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalGAME.g:1362:2: ( rule__Choix__NameAssignment_1 )
            // InternalGAME.g:1362:3: rule__Choix__NameAssignment_1
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
    // InternalGAME.g:1370:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1374:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalGAME.g:1375:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1382:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1386:1: ( ( '{' ) )
            // InternalGAME.g:1387:1: ( '{' )
            {
            // InternalGAME.g:1387:1: ( '{' )
            // InternalGAME.g:1388:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:1397:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1401:1: ( rule__Choix__Group__3__Impl )
            // InternalGAME.g:1402:2: rule__Choix__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:1408:1: rule__Choix__Group__3__Impl : ( '}' ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1412:1: ( ( '}' ) )
            // InternalGAME.g:1413:1: ( '}' )
            {
            // InternalGAME.g:1413:1: ( '}' )
            // InternalGAME.g:1414:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Objet__Group__0"
    // InternalGAME.g:1424:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1428:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalGAME.g:1429:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
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
    // InternalGAME.g:1436:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1440:1: ( ( 'objet' ) )
            // InternalGAME.g:1441:1: ( 'objet' )
            {
            // InternalGAME.g:1441:1: ( 'objet' )
            // InternalGAME.g:1442:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGAME.g:1451:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1455:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalGAME.g:1456:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
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
    // InternalGAME.g:1463:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1467:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalGAME.g:1468:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalGAME.g:1468:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalGAME.g:1469:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalGAME.g:1470:2: ( rule__Objet__NameAssignment_1 )
            // InternalGAME.g:1470:3: rule__Objet__NameAssignment_1
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
    // InternalGAME.g:1478:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1482:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalGAME.g:1483:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalGAME.g:1490:1: rule__Objet__Group__2__Impl : ( '{' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1494:1: ( ( '{' ) )
            // InternalGAME.g:1495:1: ( '{' )
            {
            // InternalGAME.g:1495:1: ( '{' )
            // InternalGAME.g:1496:2: '{'
            {
             before(grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:1505:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1509:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalGAME.g:1510:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalGAME.g:1517:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__DescriptionsAssignment_3 )? ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1521:1: ( ( ( rule__Objet__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:1522:1: ( ( rule__Objet__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:1522:1: ( ( rule__Objet__DescriptionsAssignment_3 )? )
            // InternalGAME.g:1523:2: ( rule__Objet__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getObjetAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:1524:2: ( rule__Objet__DescriptionsAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGAME.g:1524:3: rule__Objet__DescriptionsAssignment_3
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
    // InternalGAME.g:1532:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1536:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalGAME.g:1537:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalGAME.g:1544:1: rule__Objet__Group__4__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1548:1: ( ( 'taille' ) )
            // InternalGAME.g:1549:1: ( 'taille' )
            {
            // InternalGAME.g:1549:1: ( 'taille' )
            // InternalGAME.g:1550:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGAME.g:1559:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1563:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalGAME.g:1564:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1571:1: rule__Objet__Group__5__Impl : ( ( rule__Objet__TailleAssignment_5 ) ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1575:1: ( ( ( rule__Objet__TailleAssignment_5 ) ) )
            // InternalGAME.g:1576:1: ( ( rule__Objet__TailleAssignment_5 ) )
            {
            // InternalGAME.g:1576:1: ( ( rule__Objet__TailleAssignment_5 ) )
            // InternalGAME.g:1577:2: ( rule__Objet__TailleAssignment_5 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_5()); 
            // InternalGAME.g:1578:2: ( rule__Objet__TailleAssignment_5 )
            // InternalGAME.g:1578:3: rule__Objet__TailleAssignment_5
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
    // InternalGAME.g:1586:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1590:1: ( rule__Objet__Group__6__Impl )
            // InternalGAME.g:1591:2: rule__Objet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:1597:1: rule__Objet__Group__6__Impl : ( '}' ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1601:1: ( ( '}' ) )
            // InternalGAME.g:1602:1: ( '}' )
            {
            // InternalGAME.g:1602:1: ( '}' )
            // InternalGAME.g:1603:2: '}'
            {
             before(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Description__Group__0"
    // InternalGAME.g:1613:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1617:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGAME.g:1618:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalGAME.g:1625:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1629:1: ( ( 'description' ) )
            // InternalGAME.g:1630:1: ( 'description' )
            {
            // InternalGAME.g:1630:1: ( 'description' )
            // InternalGAME.g:1631:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGAME.g:1640:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1644:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalGAME.g:1645:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalGAME.g:1652:1: rule__Description__Group__1__Impl : ( '{' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1656:1: ( ( '{' ) )
            // InternalGAME.g:1657:1: ( '{' )
            {
            // InternalGAME.g:1657:1: ( '{' )
            // InternalGAME.g:1658:2: '{'
            {
             before(grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:1667:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1671:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalGAME.g:1672:2: rule__Description__Group__2__Impl rule__Description__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1679:1: rule__Description__Group__2__Impl : ( ( rule__Description__TextAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1683:1: ( ( ( rule__Description__TextAssignment_2 ) ) )
            // InternalGAME.g:1684:1: ( ( rule__Description__TextAssignment_2 ) )
            {
            // InternalGAME.g:1684:1: ( ( rule__Description__TextAssignment_2 ) )
            // InternalGAME.g:1685:2: ( rule__Description__TextAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 
            // InternalGAME.g:1686:2: ( rule__Description__TextAssignment_2 )
            // InternalGAME.g:1686:3: rule__Description__TextAssignment_2
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
    // InternalGAME.g:1694:1: rule__Description__Group__3 : rule__Description__Group__3__Impl ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1698:1: ( rule__Description__Group__3__Impl )
            // InternalGAME.g:1699:2: rule__Description__Group__3__Impl
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
    // InternalGAME.g:1705:1: rule__Description__Group__3__Impl : ( '}' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1709:1: ( ( '}' ) )
            // InternalGAME.g:1710:1: ( '}' )
            {
            // InternalGAME.g:1710:1: ( '}' )
            // InternalGAME.g:1711:2: '}'
            {
             before(grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGAME.g:1721:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1725:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGAME.g:1726:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalGAME.g:1733:1: rule__Condition__Group__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1737:1: ( ( 'condition' ) )
            // InternalGAME.g:1738:1: ( 'condition' )
            {
            // InternalGAME.g:1738:1: ( 'condition' )
            // InternalGAME.g:1739:2: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGAME.g:1748:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1752:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGAME.g:1753:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalGAME.g:1760:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1764:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalGAME.g:1765:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalGAME.g:1765:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalGAME.g:1766:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalGAME.g:1767:2: ( rule__Condition__NameAssignment_1 )
            // InternalGAME.g:1767:3: rule__Condition__NameAssignment_1
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
    // InternalGAME.g:1775:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1779:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalGAME.g:1780:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1787:1: rule__Condition__Group__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1791:1: ( ( '{' ) )
            // InternalGAME.g:1792:1: ( '{' )
            {
            // InternalGAME.g:1792:1: ( '{' )
            // InternalGAME.g:1793:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:1802:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1806:1: ( rule__Condition__Group__3__Impl )
            // InternalGAME.g:1807:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:1813:1: rule__Condition__Group__3__Impl : ( '}' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1817:1: ( ( '}' ) )
            // InternalGAME.g:1818:1: ( '}' )
            {
            // InternalGAME.g:1818:1: ( '}' )
            // InternalGAME.g:1819:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalGAME.g:1829:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1833:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalGAME.g:1834:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
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
    // InternalGAME.g:1841:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1845:1: ( ( 'connaissance' ) )
            // InternalGAME.g:1846:1: ( 'connaissance' )
            {
            // InternalGAME.g:1846:1: ( 'connaissance' )
            // InternalGAME.g:1847:2: 'connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGAME.g:1856:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1860:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalGAME.g:1861:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
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
    // InternalGAME.g:1868:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1872:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalGAME.g:1873:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalGAME.g:1873:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalGAME.g:1874:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalGAME.g:1875:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalGAME.g:1875:3: rule__Connaissance__NameAssignment_1
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
    // InternalGAME.g:1883:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1887:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalGAME.g:1888:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:1895:1: rule__Connaissance__Group__2__Impl : ( '{' ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1899:1: ( ( '{' ) )
            // InternalGAME.g:1900:1: ( '{' )
            {
            // InternalGAME.g:1900:1: ( '{' )
            // InternalGAME.g:1901:2: '{'
            {
             before(grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:1910:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1914:1: ( rule__Connaissance__Group__3__Impl )
            // InternalGAME.g:1915:2: rule__Connaissance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:1921:1: rule__Connaissance__Group__3__Impl : ( '}' ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1925:1: ( ( '}' ) )
            // InternalGAME.g:1926:1: ( '}' )
            {
            // InternalGAME.g:1926:1: ( '}' )
            // InternalGAME.g:1927:2: '}'
            {
             before(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Explorateur__Group__0"
    // InternalGAME.g:1937:1: rule__Explorateur__Group__0 : rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 ;
    public final void rule__Explorateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1941:1: ( rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1 )
            // InternalGAME.g:1942:2: rule__Explorateur__Group__0__Impl rule__Explorateur__Group__1
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
    // InternalGAME.g:1949:1: rule__Explorateur__Group__0__Impl : ( 'explorateur' ) ;
    public final void rule__Explorateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1953:1: ( ( 'explorateur' ) )
            // InternalGAME.g:1954:1: ( 'explorateur' )
            {
            // InternalGAME.g:1954:1: ( 'explorateur' )
            // InternalGAME.g:1955:2: 'explorateur'
            {
             before(grammarAccess.getExplorateurAccess().getExplorateurKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGAME.g:1964:1: rule__Explorateur__Group__1 : rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 ;
    public final void rule__Explorateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1968:1: ( rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2 )
            // InternalGAME.g:1969:2: rule__Explorateur__Group__1__Impl rule__Explorateur__Group__2
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
    // InternalGAME.g:1976:1: rule__Explorateur__Group__1__Impl : ( ( rule__Explorateur__NameAssignment_1 ) ) ;
    public final void rule__Explorateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1980:1: ( ( ( rule__Explorateur__NameAssignment_1 ) ) )
            // InternalGAME.g:1981:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            {
            // InternalGAME.g:1981:1: ( ( rule__Explorateur__NameAssignment_1 ) )
            // InternalGAME.g:1982:2: ( rule__Explorateur__NameAssignment_1 )
            {
             before(grammarAccess.getExplorateurAccess().getNameAssignment_1()); 
            // InternalGAME.g:1983:2: ( rule__Explorateur__NameAssignment_1 )
            // InternalGAME.g:1983:3: rule__Explorateur__NameAssignment_1
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
    // InternalGAME.g:1991:1: rule__Explorateur__Group__2 : rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 ;
    public final void rule__Explorateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:1995:1: ( rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3 )
            // InternalGAME.g:1996:2: rule__Explorateur__Group__2__Impl rule__Explorateur__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalGAME.g:2003:1: rule__Explorateur__Group__2__Impl : ( '{' ) ;
    public final void rule__Explorateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2007:1: ( ( '{' ) )
            // InternalGAME.g:2008:1: ( '{' )
            {
            // InternalGAME.g:2008:1: ( '{' )
            // InternalGAME.g:2009:2: '{'
            {
             before(grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:2018:1: rule__Explorateur__Group__3 : rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 ;
    public final void rule__Explorateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2022:1: ( rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4 )
            // InternalGAME.g:2023:2: rule__Explorateur__Group__3__Impl rule__Explorateur__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalGAME.g:2030:1: rule__Explorateur__Group__3__Impl : ( 'taille' ) ;
    public final void rule__Explorateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2034:1: ( ( 'taille' ) )
            // InternalGAME.g:2035:1: ( 'taille' )
            {
            // InternalGAME.g:2035:1: ( 'taille' )
            // InternalGAME.g:2036:2: 'taille'
            {
             before(grammarAccess.getExplorateurAccess().getTailleKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGAME.g:2045:1: rule__Explorateur__Group__4 : rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 ;
    public final void rule__Explorateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2049:1: ( rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5 )
            // InternalGAME.g:2050:2: rule__Explorateur__Group__4__Impl rule__Explorateur__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalGAME.g:2057:1: rule__Explorateur__Group__4__Impl : ( ( rule__Explorateur__TailleAssignment_4 ) ) ;
    public final void rule__Explorateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2061:1: ( ( ( rule__Explorateur__TailleAssignment_4 ) ) )
            // InternalGAME.g:2062:1: ( ( rule__Explorateur__TailleAssignment_4 ) )
            {
            // InternalGAME.g:2062:1: ( ( rule__Explorateur__TailleAssignment_4 ) )
            // InternalGAME.g:2063:2: ( rule__Explorateur__TailleAssignment_4 )
            {
             before(grammarAccess.getExplorateurAccess().getTailleAssignment_4()); 
            // InternalGAME.g:2064:2: ( rule__Explorateur__TailleAssignment_4 )
            // InternalGAME.g:2064:3: rule__Explorateur__TailleAssignment_4
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
    // InternalGAME.g:2072:1: rule__Explorateur__Group__5 : rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 ;
    public final void rule__Explorateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2076:1: ( rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6 )
            // InternalGAME.g:2077:2: rule__Explorateur__Group__5__Impl rule__Explorateur__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalGAME.g:2084:1: rule__Explorateur__Group__5__Impl : ( 'inventaireO' ) ;
    public final void rule__Explorateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2088:1: ( ( 'inventaireO' ) )
            // InternalGAME.g:2089:1: ( 'inventaireO' )
            {
            // InternalGAME.g:2089:1: ( 'inventaireO' )
            // InternalGAME.g:2090:2: 'inventaireO'
            {
             before(grammarAccess.getExplorateurAccess().getInventaireOKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGAME.g:2099:1: rule__Explorateur__Group__6 : rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 ;
    public final void rule__Explorateur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2103:1: ( rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7 )
            // InternalGAME.g:2104:2: rule__Explorateur__Group__6__Impl rule__Explorateur__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalGAME.g:2111:1: rule__Explorateur__Group__6__Impl : ( ( rule__Explorateur__ObjetsAssignment_6 )* ) ;
    public final void rule__Explorateur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2115:1: ( ( ( rule__Explorateur__ObjetsAssignment_6 )* ) )
            // InternalGAME.g:2116:1: ( ( rule__Explorateur__ObjetsAssignment_6 )* )
            {
            // InternalGAME.g:2116:1: ( ( rule__Explorateur__ObjetsAssignment_6 )* )
            // InternalGAME.g:2117:2: ( rule__Explorateur__ObjetsAssignment_6 )*
            {
             before(grammarAccess.getExplorateurAccess().getObjetsAssignment_6()); 
            // InternalGAME.g:2118:2: ( rule__Explorateur__ObjetsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGAME.g:2118:3: rule__Explorateur__ObjetsAssignment_6
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Explorateur__ObjetsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalGAME.g:2126:1: rule__Explorateur__Group__7 : rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 ;
    public final void rule__Explorateur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2130:1: ( rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8 )
            // InternalGAME.g:2131:2: rule__Explorateur__Group__7__Impl rule__Explorateur__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalGAME.g:2138:1: rule__Explorateur__Group__7__Impl : ( 'inventaireC' ) ;
    public final void rule__Explorateur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2142:1: ( ( 'inventaireC' ) )
            // InternalGAME.g:2143:1: ( 'inventaireC' )
            {
            // InternalGAME.g:2143:1: ( 'inventaireC' )
            // InternalGAME.g:2144:2: 'inventaireC'
            {
             before(grammarAccess.getExplorateurAccess().getInventaireCKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGAME.g:2153:1: rule__Explorateur__Group__8 : rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 ;
    public final void rule__Explorateur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2157:1: ( rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9 )
            // InternalGAME.g:2158:2: rule__Explorateur__Group__8__Impl rule__Explorateur__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalGAME.g:2165:1: rule__Explorateur__Group__8__Impl : ( ( rule__Explorateur__ConnaissancesAssignment_8 )* ) ;
    public final void rule__Explorateur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2169:1: ( ( ( rule__Explorateur__ConnaissancesAssignment_8 )* ) )
            // InternalGAME.g:2170:1: ( ( rule__Explorateur__ConnaissancesAssignment_8 )* )
            {
            // InternalGAME.g:2170:1: ( ( rule__Explorateur__ConnaissancesAssignment_8 )* )
            // InternalGAME.g:2171:2: ( rule__Explorateur__ConnaissancesAssignment_8 )*
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesAssignment_8()); 
            // InternalGAME.g:2172:2: ( rule__Explorateur__ConnaissancesAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGAME.g:2172:3: rule__Explorateur__ConnaissancesAssignment_8
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Explorateur__ConnaissancesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalGAME.g:2180:1: rule__Explorateur__Group__9 : rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 ;
    public final void rule__Explorateur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2184:1: ( rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10 )
            // InternalGAME.g:2185:2: rule__Explorateur__Group__9__Impl rule__Explorateur__Group__10
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
    // InternalGAME.g:2192:1: rule__Explorateur__Group__9__Impl : ( 'localisation' ) ;
    public final void rule__Explorateur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2196:1: ( ( 'localisation' ) )
            // InternalGAME.g:2197:1: ( 'localisation' )
            {
            // InternalGAME.g:2197:1: ( 'localisation' )
            // InternalGAME.g:2198:2: 'localisation'
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationKeyword_9()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGAME.g:2207:1: rule__Explorateur__Group__10 : rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 ;
    public final void rule__Explorateur__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2211:1: ( rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11 )
            // InternalGAME.g:2212:2: rule__Explorateur__Group__10__Impl rule__Explorateur__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalGAME.g:2219:1: rule__Explorateur__Group__10__Impl : ( ( rule__Explorateur__LocalisationAssignment_10 ) ) ;
    public final void rule__Explorateur__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2223:1: ( ( ( rule__Explorateur__LocalisationAssignment_10 ) ) )
            // InternalGAME.g:2224:1: ( ( rule__Explorateur__LocalisationAssignment_10 ) )
            {
            // InternalGAME.g:2224:1: ( ( rule__Explorateur__LocalisationAssignment_10 ) )
            // InternalGAME.g:2225:2: ( rule__Explorateur__LocalisationAssignment_10 )
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationAssignment_10()); 
            // InternalGAME.g:2226:2: ( rule__Explorateur__LocalisationAssignment_10 )
            // InternalGAME.g:2226:3: rule__Explorateur__LocalisationAssignment_10
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
    // InternalGAME.g:2234:1: rule__Explorateur__Group__11 : rule__Explorateur__Group__11__Impl ;
    public final void rule__Explorateur__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2238:1: ( rule__Explorateur__Group__11__Impl )
            // InternalGAME.g:2239:2: rule__Explorateur__Group__11__Impl
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
    // InternalGAME.g:2245:1: rule__Explorateur__Group__11__Impl : ( '}' ) ;
    public final void rule__Explorateur__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2249:1: ( ( '}' ) )
            // InternalGAME.g:2250:1: ( '}' )
            {
            // InternalGAME.g:2250:1: ( '}' )
            // InternalGAME.g:2251:2: '}'
            {
             before(grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGAME.g:2261:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2265:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalGAME.g:2266:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalGAME.g:2273:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2277:1: ( ( 'lieu' ) )
            // InternalGAME.g:2278:1: ( 'lieu' )
            {
            // InternalGAME.g:2278:1: ( 'lieu' )
            // InternalGAME.g:2279:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGAME.g:2288:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2292:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalGAME.g:2293:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalGAME.g:2300:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2304:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalGAME.g:2305:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalGAME.g:2305:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalGAME.g:2306:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalGAME.g:2307:2: ( rule__Lieu__NameAssignment_1 )
            // InternalGAME.g:2307:3: rule__Lieu__NameAssignment_1
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
    // InternalGAME.g:2315:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2319:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalGAME.g:2320:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalGAME.g:2327:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2331:1: ( ( '{' ) )
            // InternalGAME.g:2332:1: ( '{' )
            {
            // InternalGAME.g:2332:1: ( '{' )
            // InternalGAME.g:2333:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGAME.g:2342:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2346:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalGAME.g:2347:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalGAME.g:2354:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__DescriptionsAssignment_3 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2358:1: ( ( ( rule__Lieu__DescriptionsAssignment_3 )? ) )
            // InternalGAME.g:2359:1: ( ( rule__Lieu__DescriptionsAssignment_3 )? )
            {
            // InternalGAME.g:2359:1: ( ( rule__Lieu__DescriptionsAssignment_3 )? )
            // InternalGAME.g:2360:2: ( rule__Lieu__DescriptionsAssignment_3 )?
            {
             before(grammarAccess.getLieuAccess().getDescriptionsAssignment_3()); 
            // InternalGAME.g:2361:2: ( rule__Lieu__DescriptionsAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGAME.g:2361:3: rule__Lieu__DescriptionsAssignment_3
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
    // InternalGAME.g:2369:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl rule__Lieu__Group__5 ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2373:1: ( rule__Lieu__Group__4__Impl rule__Lieu__Group__5 )
            // InternalGAME.g:2374:2: rule__Lieu__Group__4__Impl rule__Lieu__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalGAME.g:2381:1: rule__Lieu__Group__4__Impl : ( ( rule__Lieu__Group_4__0 )* ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2385:1: ( ( ( rule__Lieu__Group_4__0 )* ) )
            // InternalGAME.g:2386:1: ( ( rule__Lieu__Group_4__0 )* )
            {
            // InternalGAME.g:2386:1: ( ( rule__Lieu__Group_4__0 )* )
            // InternalGAME.g:2387:2: ( rule__Lieu__Group_4__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_4()); 
            // InternalGAME.g:2388:2: ( rule__Lieu__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGAME.g:2388:3: rule__Lieu__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Lieu__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalGAME.g:2396:1: rule__Lieu__Group__5 : rule__Lieu__Group__5__Impl rule__Lieu__Group__6 ;
    public final void rule__Lieu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2400:1: ( rule__Lieu__Group__5__Impl rule__Lieu__Group__6 )
            // InternalGAME.g:2401:2: rule__Lieu__Group__5__Impl rule__Lieu__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalGAME.g:2408:1: rule__Lieu__Group__5__Impl : ( ( rule__Lieu__Group_5__0 )* ) ;
    public final void rule__Lieu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2412:1: ( ( ( rule__Lieu__Group_5__0 )* ) )
            // InternalGAME.g:2413:1: ( ( rule__Lieu__Group_5__0 )* )
            {
            // InternalGAME.g:2413:1: ( ( rule__Lieu__Group_5__0 )* )
            // InternalGAME.g:2414:2: ( rule__Lieu__Group_5__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_5()); 
            // InternalGAME.g:2415:2: ( rule__Lieu__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGAME.g:2415:3: rule__Lieu__Group_5__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Lieu__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGAME.g:2423:1: rule__Lieu__Group__6 : rule__Lieu__Group__6__Impl rule__Lieu__Group__7 ;
    public final void rule__Lieu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2427:1: ( rule__Lieu__Group__6__Impl rule__Lieu__Group__7 )
            // InternalGAME.g:2428:2: rule__Lieu__Group__6__Impl rule__Lieu__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalGAME.g:2435:1: rule__Lieu__Group__6__Impl : ( ( rule__Lieu__Group_6__0 )* ) ;
    public final void rule__Lieu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2439:1: ( ( ( rule__Lieu__Group_6__0 )* ) )
            // InternalGAME.g:2440:1: ( ( rule__Lieu__Group_6__0 )* )
            {
            // InternalGAME.g:2440:1: ( ( rule__Lieu__Group_6__0 )* )
            // InternalGAME.g:2441:2: ( rule__Lieu__Group_6__0 )*
            {
             before(grammarAccess.getLieuAccess().getGroup_6()); 
            // InternalGAME.g:2442:2: ( rule__Lieu__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGAME.g:2442:3: rule__Lieu__Group_6__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Lieu__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGAME.g:2450:1: rule__Lieu__Group__7 : rule__Lieu__Group__7__Impl ;
    public final void rule__Lieu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2454:1: ( rule__Lieu__Group__7__Impl )
            // InternalGAME.g:2455:2: rule__Lieu__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:2461:1: rule__Lieu__Group__7__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2465:1: ( ( '}' ) )
            // InternalGAME.g:2466:1: ( '}' )
            {
            // InternalGAME.g:2466:1: ( '}' )
            // InternalGAME.g:2467:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Lieu__Group_4__0"
    // InternalGAME.g:2477:1: rule__Lieu__Group_4__0 : rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1 ;
    public final void rule__Lieu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2481:1: ( rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1 )
            // InternalGAME.g:2482:2: rule__Lieu__Group_4__0__Impl rule__Lieu__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGAME.g:2489:1: rule__Lieu__Group_4__0__Impl : ( 'objets' ) ;
    public final void rule__Lieu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2493:1: ( ( 'objets' ) )
            // InternalGAME.g:2494:1: ( 'objets' )
            {
            // InternalGAME.g:2494:1: ( 'objets' )
            // InternalGAME.g:2495:2: 'objets'
            {
             before(grammarAccess.getLieuAccess().getObjetsKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalGAME.g:2504:1: rule__Lieu__Group_4__1 : rule__Lieu__Group_4__1__Impl ;
    public final void rule__Lieu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2508:1: ( rule__Lieu__Group_4__1__Impl )
            // InternalGAME.g:2509:2: rule__Lieu__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:2515:1: rule__Lieu__Group_4__1__Impl : ( ( rule__Lieu__ObjetsAssignment_4_1 ) ) ;
    public final void rule__Lieu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2519:1: ( ( ( rule__Lieu__ObjetsAssignment_4_1 ) ) )
            // InternalGAME.g:2520:1: ( ( rule__Lieu__ObjetsAssignment_4_1 ) )
            {
            // InternalGAME.g:2520:1: ( ( rule__Lieu__ObjetsAssignment_4_1 ) )
            // InternalGAME.g:2521:2: ( rule__Lieu__ObjetsAssignment_4_1 )
            {
             before(grammarAccess.getLieuAccess().getObjetsAssignment_4_1()); 
            // InternalGAME.g:2522:2: ( rule__Lieu__ObjetsAssignment_4_1 )
            // InternalGAME.g:2522:3: rule__Lieu__ObjetsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ObjetsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getObjetsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Lieu__Group_5__0"
    // InternalGAME.g:2531:1: rule__Lieu__Group_5__0 : rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1 ;
    public final void rule__Lieu__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2535:1: ( rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1 )
            // InternalGAME.g:2536:2: rule__Lieu__Group_5__0__Impl rule__Lieu__Group_5__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGAME.g:2543:1: rule__Lieu__Group_5__0__Impl : ( 'connaissances' ) ;
    public final void rule__Lieu__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2547:1: ( ( 'connaissances' ) )
            // InternalGAME.g:2548:1: ( 'connaissances' )
            {
            // InternalGAME.g:2548:1: ( 'connaissances' )
            // InternalGAME.g:2549:2: 'connaissances'
            {
             before(grammarAccess.getLieuAccess().getConnaissancesKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGAME.g:2558:1: rule__Lieu__Group_5__1 : rule__Lieu__Group_5__1__Impl ;
    public final void rule__Lieu__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2562:1: ( rule__Lieu__Group_5__1__Impl )
            // InternalGAME.g:2563:2: rule__Lieu__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:2569:1: rule__Lieu__Group_5__1__Impl : ( ( rule__Lieu__ConnaissancesAssignment_5_1 ) ) ;
    public final void rule__Lieu__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2573:1: ( ( ( rule__Lieu__ConnaissancesAssignment_5_1 ) ) )
            // InternalGAME.g:2574:1: ( ( rule__Lieu__ConnaissancesAssignment_5_1 ) )
            {
            // InternalGAME.g:2574:1: ( ( rule__Lieu__ConnaissancesAssignment_5_1 ) )
            // InternalGAME.g:2575:2: ( rule__Lieu__ConnaissancesAssignment_5_1 )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesAssignment_5_1()); 
            // InternalGAME.g:2576:2: ( rule__Lieu__ConnaissancesAssignment_5_1 )
            // InternalGAME.g:2576:3: rule__Lieu__ConnaissancesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__ConnaissancesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getConnaissancesAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Lieu__Group_6__0"
    // InternalGAME.g:2585:1: rule__Lieu__Group_6__0 : rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 ;
    public final void rule__Lieu__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2589:1: ( rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1 )
            // InternalGAME.g:2590:2: rule__Lieu__Group_6__0__Impl rule__Lieu__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGAME.g:2597:1: rule__Lieu__Group_6__0__Impl : ( 'personnes' ) ;
    public final void rule__Lieu__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2601:1: ( ( 'personnes' ) )
            // InternalGAME.g:2602:1: ( 'personnes' )
            {
            // InternalGAME.g:2602:1: ( 'personnes' )
            // InternalGAME.g:2603:2: 'personnes'
            {
             before(grammarAccess.getLieuAccess().getPersonnesKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGAME.g:2612:1: rule__Lieu__Group_6__1 : rule__Lieu__Group_6__1__Impl ;
    public final void rule__Lieu__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2616:1: ( rule__Lieu__Group_6__1__Impl )
            // InternalGAME.g:2617:2: rule__Lieu__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalGAME.g:2623:1: rule__Lieu__Group_6__1__Impl : ( ( rule__Lieu__PersonnesAssignment_6_1 ) ) ;
    public final void rule__Lieu__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2627:1: ( ( ( rule__Lieu__PersonnesAssignment_6_1 ) ) )
            // InternalGAME.g:2628:1: ( ( rule__Lieu__PersonnesAssignment_6_1 ) )
            {
            // InternalGAME.g:2628:1: ( ( rule__Lieu__PersonnesAssignment_6_1 ) )
            // InternalGAME.g:2629:2: ( rule__Lieu__PersonnesAssignment_6_1 )
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_6_1()); 
            // InternalGAME.g:2630:2: ( rule__Lieu__PersonnesAssignment_6_1 )
            // InternalGAME.g:2630:3: rule__Lieu__PersonnesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__PersonnesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getPersonnesAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalGAME.g:2639:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2643:1: ( ( RULE_ID ) )
            // InternalGAME.g:2644:2: ( RULE_ID )
            {
            // InternalGAME.g:2644:2: ( RULE_ID )
            // InternalGAME.g:2645:3: RULE_ID
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
    // InternalGAME.g:2654:1: rule__Jeu__ExplorateurAssignment_3 : ( ruleExplorateur ) ;
    public final void rule__Jeu__ExplorateurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2658:1: ( ( ruleExplorateur ) )
            // InternalGAME.g:2659:2: ( ruleExplorateur )
            {
            // InternalGAME.g:2659:2: ( ruleExplorateur )
            // InternalGAME.g:2660:3: ruleExplorateur
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


    // $ANTLR start "rule__Jeu__LieuxAssignment_4"
    // InternalGAME.g:2669:1: rule__Jeu__LieuxAssignment_4 : ( ruleLieu ) ;
    public final void rule__Jeu__LieuxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2673:1: ( ( ruleLieu ) )
            // InternalGAME.g:2674:2: ( ruleLieu )
            {
            // InternalGAME.g:2674:2: ( ruleLieu )
            // InternalGAME.g:2675:3: ruleLieu
            {
             before(grammarAccess.getJeuAccess().getLieuxLieuParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getLieuxLieuParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__LieuxAssignment_4"


    // $ANTLR start "rule__Jeu__ObjetsAssignment_5"
    // InternalGAME.g:2684:1: rule__Jeu__ObjetsAssignment_5 : ( ruleObjet ) ;
    public final void rule__Jeu__ObjetsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2688:1: ( ( ruleObjet ) )
            // InternalGAME.g:2689:2: ( ruleObjet )
            {
            // InternalGAME.g:2689:2: ( ruleObjet )
            // InternalGAME.g:2690:3: ruleObjet
            {
             before(grammarAccess.getJeuAccess().getObjetsObjetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getObjetsObjetParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ObjetsAssignment_5"


    // $ANTLR start "rule__Jeu__ConnaissancesAssignment_6"
    // InternalGAME.g:2699:1: rule__Jeu__ConnaissancesAssignment_6 : ( ruleConnaissance ) ;
    public final void rule__Jeu__ConnaissancesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2703:1: ( ( ruleConnaissance ) )
            // InternalGAME.g:2704:2: ( ruleConnaissance )
            {
            // InternalGAME.g:2704:2: ( ruleConnaissance )
            // InternalGAME.g:2705:3: ruleConnaissance
            {
             before(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__ConnaissancesAssignment_6"


    // $ANTLR start "rule__Jeu__PersonnesAssignment_7"
    // InternalGAME.g:2714:1: rule__Jeu__PersonnesAssignment_7 : ( rulePersonne ) ;
    public final void rule__Jeu__PersonnesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2718:1: ( ( rulePersonne ) )
            // InternalGAME.g:2719:2: ( rulePersonne )
            {
            // InternalGAME.g:2719:2: ( rulePersonne )
            // InternalGAME.g:2720:3: rulePersonne
            {
             before(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__PersonnesAssignment_7"


    // $ANTLR start "rule__Jeu__CheminsAssignment_8"
    // InternalGAME.g:2729:1: rule__Jeu__CheminsAssignment_8 : ( ruleChemin ) ;
    public final void rule__Jeu__CheminsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2733:1: ( ( ruleChemin ) )
            // InternalGAME.g:2734:2: ( ruleChemin )
            {
            // InternalGAME.g:2734:2: ( ruleChemin )
            // InternalGAME.g:2735:3: ruleChemin
            {
             before(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jeu__CheminsAssignment_8"


    // $ANTLR start "rule__Chemin__NameAssignment_1"
    // InternalGAME.g:2744:1: rule__Chemin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chemin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2748:1: ( ( RULE_ID ) )
            // InternalGAME.g:2749:2: ( RULE_ID )
            {
            // InternalGAME.g:2749:2: ( RULE_ID )
            // InternalGAME.g:2750:3: RULE_ID
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
    // InternalGAME.g:2759:1: rule__Chemin__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Chemin__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2763:1: ( ( ruleDescription ) )
            // InternalGAME.g:2764:2: ( ruleDescription )
            {
            // InternalGAME.g:2764:2: ( ruleDescription )
            // InternalGAME.g:2765:3: ruleDescription
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
    // InternalGAME.g:2774:1: rule__Chemin__DepartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__DepartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2778:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:2779:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:2779:2: ( ( RULE_ID ) )
            // InternalGAME.g:2780:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getDepartLieuCrossReference_5_0()); 
            // InternalGAME.g:2781:3: ( RULE_ID )
            // InternalGAME.g:2782:4: RULE_ID
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
    // InternalGAME.g:2793:1: rule__Chemin__ArriveAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ArriveAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2797:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:2798:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:2798:2: ( ( RULE_ID ) )
            // InternalGAME.g:2799:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getArriveLieuCrossReference_7_0()); 
            // InternalGAME.g:2800:3: ( RULE_ID )
            // InternalGAME.g:2801:4: RULE_ID
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
    // InternalGAME.g:2812:1: rule__Chemin__VisibiliteAssignment_8 : ( ruleVisibilite ) ;
    public final void rule__Chemin__VisibiliteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2816:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:2817:2: ( ruleVisibilite )
            {
            // InternalGAME.g:2817:2: ( ruleVisibilite )
            // InternalGAME.g:2818:3: ruleVisibilite
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


    // $ANTLR start "rule__Chemin__ConditionsVisibiliteAssignment_10"
    // InternalGAME.g:2827:1: rule__Chemin__ConditionsVisibiliteAssignment_10 : ( ruleCondition ) ;
    public final void rule__Chemin__ConditionsVisibiliteAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2831:1: ( ( ruleCondition ) )
            // InternalGAME.g:2832:2: ( ruleCondition )
            {
            // InternalGAME.g:2832:2: ( ruleCondition )
            // InternalGAME.g:2833:3: ruleCondition
            {
             before(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chemin__ConditionsVisibiliteAssignment_10"


    // $ANTLR start "rule__Personne__NameAssignment_1"
    // InternalGAME.g:2842:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2846:1: ( ( RULE_ID ) )
            // InternalGAME.g:2847:2: ( RULE_ID )
            {
            // InternalGAME.g:2847:2: ( RULE_ID )
            // InternalGAME.g:2848:3: RULE_ID
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
    // InternalGAME.g:2857:1: rule__Personne__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Personne__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2861:1: ( ( ruleDescription ) )
            // InternalGAME.g:2862:2: ( ruleDescription )
            {
            // InternalGAME.g:2862:2: ( ruleDescription )
            // InternalGAME.g:2863:3: ruleDescription
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
    // InternalGAME.g:2872:1: rule__Personne__InteractionAssignment_4 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2876:1: ( ( ruleInteraction ) )
            // InternalGAME.g:2877:2: ( ruleInteraction )
            {
            // InternalGAME.g:2877:2: ( ruleInteraction )
            // InternalGAME.g:2878:3: ruleInteraction
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
    // InternalGAME.g:2887:1: rule__Personne__VisibiliteAssignment_5 : ( ruleVisibilite ) ;
    public final void rule__Personne__VisibiliteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2891:1: ( ( ruleVisibilite ) )
            // InternalGAME.g:2892:2: ( ruleVisibilite )
            {
            // InternalGAME.g:2892:2: ( ruleVisibilite )
            // InternalGAME.g:2893:3: ruleVisibilite
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


    // $ANTLR start "rule__Personne__ConditionsVisibiliteAssignment_7"
    // InternalGAME.g:2902:1: rule__Personne__ConditionsVisibiliteAssignment_7 : ( ruleCondition ) ;
    public final void rule__Personne__ConditionsVisibiliteAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2906:1: ( ( ruleCondition ) )
            // InternalGAME.g:2907:2: ( ruleCondition )
            {
            // InternalGAME.g:2907:2: ( ruleCondition )
            // InternalGAME.g:2908:3: ruleCondition
            {
             before(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Personne__ConditionsVisibiliteAssignment_7"


    // $ANTLR start "rule__Interaction__ChoixAssignment_2"
    // InternalGAME.g:2917:1: rule__Interaction__ChoixAssignment_2 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2921:1: ( ( ruleChoix ) )
            // InternalGAME.g:2922:2: ( ruleChoix )
            {
            // InternalGAME.g:2922:2: ( ruleChoix )
            // InternalGAME.g:2923:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ChoixAssignment_2"


    // $ANTLR start "rule__Choix__NameAssignment_1"
    // InternalGAME.g:2932:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2936:1: ( ( RULE_ID ) )
            // InternalGAME.g:2937:2: ( RULE_ID )
            {
            // InternalGAME.g:2937:2: ( RULE_ID )
            // InternalGAME.g:2938:3: RULE_ID
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


    // $ANTLR start "rule__Objet__NameAssignment_1"
    // InternalGAME.g:2947:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2951:1: ( ( RULE_ID ) )
            // InternalGAME.g:2952:2: ( RULE_ID )
            {
            // InternalGAME.g:2952:2: ( RULE_ID )
            // InternalGAME.g:2953:3: RULE_ID
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
    // InternalGAME.g:2962:1: rule__Objet__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Objet__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2966:1: ( ( ruleDescription ) )
            // InternalGAME.g:2967:2: ( ruleDescription )
            {
            // InternalGAME.g:2967:2: ( ruleDescription )
            // InternalGAME.g:2968:3: ruleDescription
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
    // InternalGAME.g:2977:1: rule__Objet__TailleAssignment_5 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2981:1: ( ( RULE_INT ) )
            // InternalGAME.g:2982:2: ( RULE_INT )
            {
            // InternalGAME.g:2982:2: ( RULE_INT )
            // InternalGAME.g:2983:3: RULE_INT
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


    // $ANTLR start "rule__Description__TextAssignment_2"
    // InternalGAME.g:2992:1: rule__Description__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:2996:1: ( ( RULE_STRING ) )
            // InternalGAME.g:2997:2: ( RULE_STRING )
            {
            // InternalGAME.g:2997:2: ( RULE_STRING )
            // InternalGAME.g:2998:3: RULE_STRING
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
    // InternalGAME.g:3007:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3011:1: ( ( RULE_ID ) )
            // InternalGAME.g:3012:2: ( RULE_ID )
            {
            // InternalGAME.g:3012:2: ( RULE_ID )
            // InternalGAME.g:3013:3: RULE_ID
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


    // $ANTLR start "rule__Connaissance__NameAssignment_1"
    // InternalGAME.g:3022:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3026:1: ( ( RULE_ID ) )
            // InternalGAME.g:3027:2: ( RULE_ID )
            {
            // InternalGAME.g:3027:2: ( RULE_ID )
            // InternalGAME.g:3028:3: RULE_ID
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


    // $ANTLR start "rule__Explorateur__NameAssignment_1"
    // InternalGAME.g:3037:1: rule__Explorateur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Explorateur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3041:1: ( ( RULE_ID ) )
            // InternalGAME.g:3042:2: ( RULE_ID )
            {
            // InternalGAME.g:3042:2: ( RULE_ID )
            // InternalGAME.g:3043:3: RULE_ID
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
    // InternalGAME.g:3052:1: rule__Explorateur__TailleAssignment_4 : ( RULE_INT ) ;
    public final void rule__Explorateur__TailleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3056:1: ( ( RULE_INT ) )
            // InternalGAME.g:3057:2: ( RULE_INT )
            {
            // InternalGAME.g:3057:2: ( RULE_INT )
            // InternalGAME.g:3058:3: RULE_INT
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
    // InternalGAME.g:3067:1: rule__Explorateur__ObjetsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ObjetsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3071:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:3072:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:3072:2: ( ( RULE_ID ) )
            // InternalGAME.g:3073:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getObjetsObjetCrossReference_6_0()); 
            // InternalGAME.g:3074:3: ( RULE_ID )
            // InternalGAME.g:3075:4: RULE_ID
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
    // InternalGAME.g:3086:1: rule__Explorateur__ConnaissancesAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__ConnaissancesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3090:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:3091:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:3091:2: ( ( RULE_ID ) )
            // InternalGAME.g:3092:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_8_0()); 
            // InternalGAME.g:3093:3: ( RULE_ID )
            // InternalGAME.g:3094:4: RULE_ID
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
    // InternalGAME.g:3105:1: rule__Explorateur__LocalisationAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Explorateur__LocalisationAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3109:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:3110:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:3110:2: ( ( RULE_ID ) )
            // InternalGAME.g:3111:3: ( RULE_ID )
            {
             before(grammarAccess.getExplorateurAccess().getLocalisationLieuCrossReference_10_0()); 
            // InternalGAME.g:3112:3: ( RULE_ID )
            // InternalGAME.g:3113:4: RULE_ID
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
    // InternalGAME.g:3124:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3128:1: ( ( RULE_ID ) )
            // InternalGAME.g:3129:2: ( RULE_ID )
            {
            // InternalGAME.g:3129:2: ( RULE_ID )
            // InternalGAME.g:3130:3: RULE_ID
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
    // InternalGAME.g:3139:1: rule__Lieu__DescriptionsAssignment_3 : ( ruleDescription ) ;
    public final void rule__Lieu__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3143:1: ( ( ruleDescription ) )
            // InternalGAME.g:3144:2: ( ruleDescription )
            {
            // InternalGAME.g:3144:2: ( ruleDescription )
            // InternalGAME.g:3145:3: ruleDescription
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


    // $ANTLR start "rule__Lieu__ObjetsAssignment_4_1"
    // InternalGAME.g:3154:1: rule__Lieu__ObjetsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ObjetsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3158:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:3159:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:3159:2: ( ( RULE_ID ) )
            // InternalGAME.g:3160:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_1_0()); 
            // InternalGAME.g:3161:3: ( RULE_ID )
            // InternalGAME.g:3162:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getObjetsObjetIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getObjetsObjetIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ObjetsAssignment_4_1"


    // $ANTLR start "rule__Lieu__ConnaissancesAssignment_5_1"
    // InternalGAME.g:3173:1: rule__Lieu__ConnaissancesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__ConnaissancesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3177:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:3178:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:3178:2: ( ( RULE_ID ) )
            // InternalGAME.g:3179:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_1_0()); 
            // InternalGAME.g:3180:3: ( RULE_ID )
            // InternalGAME.g:3181:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__ConnaissancesAssignment_5_1"


    // $ANTLR start "rule__Lieu__PersonnesAssignment_6_1"
    // InternalGAME.g:3192:1: rule__Lieu__PersonnesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lieu__PersonnesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGAME.g:3196:1: ( ( ( RULE_ID ) ) )
            // InternalGAME.g:3197:2: ( ( RULE_ID ) )
            {
            // InternalGAME.g:3197:2: ( ( RULE_ID ) )
            // InternalGAME.g:3198:3: ( RULE_ID )
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_1_0()); 
            // InternalGAME.g:3199:3: ( RULE_ID )
            // InternalGAME.g:3200:4: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesPersonneIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lieu__PersonnesAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000108918000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000E02008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});

}