package fr.enseeiht.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.enseeiht.services.GAMEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGAMEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'{'", "'}'", "'chemin'", "'de'", "'vers'", "'si'", "'personne'", "'interaction'", "'choix'", "'objet'", "'taille'", "'description'", "'condition'", "'connaissance'", "'explorateur'", "'inventaireO'", "'inventaireC'", "'localisation'", "'lieu'", "'objets'", "'connaissances'", "'personnes'", "'visible'", "'invisible'"
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

        public InternalGAMEParser(TokenStream input, GAMEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Jeu";
       	}

       	@Override
       	protected GAMEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJeu"
    // InternalGAME.g:65:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalGAME.g:65:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalGAME.g:66:2: iv_ruleJeu= ruleJeu EOF
            {
             newCompositeNode(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeu=ruleJeu();

            state._fsp--;

             current =iv_ruleJeu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalGAME.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) ( (lv_lieux_4_0= ruleLieu ) )* ( (lv_Objets_5_0= ruleObjet ) )* ( (lv_Connaissances_6_0= ruleConnaissance ) )* ( (lv_personnes_7_0= rulePersonne ) )* ( (lv_chemins_8_0= ruleChemin ) )* otherlv_9= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_explorateur_3_0 = null;

        EObject lv_lieux_4_0 = null;

        EObject lv_Objets_5_0 = null;

        EObject lv_Connaissances_6_0 = null;

        EObject lv_personnes_7_0 = null;

        EObject lv_chemins_8_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:78:2: ( (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) ( (lv_lieux_4_0= ruleLieu ) )* ( (lv_Objets_5_0= ruleObjet ) )* ( (lv_Connaissances_6_0= ruleConnaissance ) )* ( (lv_personnes_7_0= rulePersonne ) )* ( (lv_chemins_8_0= ruleChemin ) )* otherlv_9= '}' ) )
            // InternalGAME.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) ( (lv_lieux_4_0= ruleLieu ) )* ( (lv_Objets_5_0= ruleObjet ) )* ( (lv_Connaissances_6_0= ruleConnaissance ) )* ( (lv_personnes_7_0= rulePersonne ) )* ( (lv_chemins_8_0= ruleChemin ) )* otherlv_9= '}' )
            {
            // InternalGAME.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) ( (lv_lieux_4_0= ruleLieu ) )* ( (lv_Objets_5_0= ruleObjet ) )* ( (lv_Connaissances_6_0= ruleConnaissance ) )* ( (lv_personnes_7_0= rulePersonne ) )* ( (lv_chemins_8_0= ruleChemin ) )* otherlv_9= '}' )
            // InternalGAME.g:80:3: otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) ( (lv_lieux_4_0= ruleLieu ) )* ( (lv_Objets_5_0= ruleObjet ) )* ( (lv_Connaissances_6_0= ruleConnaissance ) )* ( (lv_personnes_7_0= rulePersonne ) )* ( (lv_chemins_8_0= ruleChemin ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalGAME.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:106:3: ( (lv_explorateur_3_0= ruleExplorateur ) )
            // InternalGAME.g:107:4: (lv_explorateur_3_0= ruleExplorateur )
            {
            // InternalGAME.g:107:4: (lv_explorateur_3_0= ruleExplorateur )
            // InternalGAME.g:108:5: lv_explorateur_3_0= ruleExplorateur
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getExplorateurExplorateurParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_explorateur_3_0=ruleExplorateur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"explorateur",
            						lv_explorateur_3_0,
            						"fr.enseeiht.GAME.Explorateur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:125:3: ( (lv_lieux_4_0= ruleLieu ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGAME.g:126:4: (lv_lieux_4_0= ruleLieu )
            	    {
            	    // InternalGAME.g:126:4: (lv_lieux_4_0= ruleLieu )
            	    // InternalGAME.g:127:5: lv_lieux_4_0= ruleLieu
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getLieuxLieuParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_lieux_4_0=ruleLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lieux",
            	    						lv_lieux_4_0,
            	    						"fr.enseeiht.GAME.Lieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGAME.g:144:3: ( (lv_Objets_5_0= ruleObjet ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGAME.g:145:4: (lv_Objets_5_0= ruleObjet )
            	    {
            	    // InternalGAME.g:145:4: (lv_Objets_5_0= ruleObjet )
            	    // InternalGAME.g:146:5: lv_Objets_5_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getObjetsObjetParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_Objets_5_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Objets",
            	    						lv_Objets_5_0,
            	    						"fr.enseeiht.GAME.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGAME.g:163:3: ( (lv_Connaissances_6_0= ruleConnaissance ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGAME.g:164:4: (lv_Connaissances_6_0= ruleConnaissance )
            	    {
            	    // InternalGAME.g:164:4: (lv_Connaissances_6_0= ruleConnaissance )
            	    // InternalGAME.g:165:5: lv_Connaissances_6_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_Connaissances_6_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Connaissances",
            	    						lv_Connaissances_6_0,
            	    						"fr.enseeiht.GAME.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGAME.g:182:3: ( (lv_personnes_7_0= rulePersonne ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGAME.g:183:4: (lv_personnes_7_0= rulePersonne )
            	    {
            	    // InternalGAME.g:183:4: (lv_personnes_7_0= rulePersonne )
            	    // InternalGAME.g:184:5: lv_personnes_7_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_personnes_7_0=rulePersonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"personnes",
            	    						lv_personnes_7_0,
            	    						"fr.enseeiht.GAME.Personne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGAME.g:201:3: ( (lv_chemins_8_0= ruleChemin ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGAME.g:202:4: (lv_chemins_8_0= ruleChemin )
            	    {
            	    // InternalGAME.g:202:4: (lv_chemins_8_0= ruleChemin )
            	    // InternalGAME.g:203:5: lv_chemins_8_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_chemins_8_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chemins",
            	    						lv_chemins_8_0,
            	    						"fr.enseeiht.GAME.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleChemin"
    // InternalGAME.g:228:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGAME.g:228:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGAME.g:229:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalGAME.g:235:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) otherlv_11= '}' ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_descriptions_3_0 = null;

        Enumerator lv_visibilite_8_0 = null;

        EObject lv_conditionsVisibilite_10_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:241:2: ( (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) otherlv_11= '}' ) )
            // InternalGAME.g:242:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) otherlv_11= '}' )
            {
            // InternalGAME.g:242:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) otherlv_11= '}' )
            // InternalGAME.g:243:3: otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            // InternalGAME.g:247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:248:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheminAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:269:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGAME.g:270:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:270:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:271:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_descriptions_3_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCheminRule());
                    					}
                    					set(
                    						current,
                    						"descriptions",
                    						lv_descriptions_3_0,
                    						"fr.enseeiht.GAME.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getDeKeyword_4());
            		
            // InternalGAME.g:292:3: ( (otherlv_5= RULE_ID ) )
            // InternalGAME.g:293:4: (otherlv_5= RULE_ID )
            {
            // InternalGAME.g:293:4: (otherlv_5= RULE_ID )
            // InternalGAME.g:294:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getDepartLieuCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getVersKeyword_6());
            		
            // InternalGAME.g:309:3: ( (otherlv_7= RULE_ID ) )
            // InternalGAME.g:310:4: (otherlv_7= RULE_ID )
            {
            // InternalGAME.g:310:4: (otherlv_7= RULE_ID )
            // InternalGAME.g:311:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getArriveLieuCrossReference_7_0());
            				

            }


            }

            // InternalGAME.g:322:3: ( (lv_visibilite_8_0= ruleVisibilite ) )
            // InternalGAME.g:323:4: (lv_visibilite_8_0= ruleVisibilite )
            {
            // InternalGAME.g:323:4: (lv_visibilite_8_0= ruleVisibilite )
            // InternalGAME.g:324:5: lv_visibilite_8_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getVisibiliteVisibiliteEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_visibilite_8_0=ruleVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_8_0,
            						"fr.enseeiht.GAME.Visibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getSiKeyword_9());
            		
            // InternalGAME.g:345:3: ( (lv_conditionsVisibilite_10_0= ruleCondition ) )
            // InternalGAME.g:346:4: (lv_conditionsVisibilite_10_0= ruleCondition )
            {
            // InternalGAME.g:346:4: (lv_conditionsVisibilite_10_0= ruleCondition )
            // InternalGAME.g:347:5: lv_conditionsVisibilite_10_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_17);
            lv_conditionsVisibilite_10_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"conditionsVisibilite",
            						lv_conditionsVisibilite_10_0,
            						"fr.enseeiht.GAME.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRulePersonne"
    // InternalGAME.g:372:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGAME.g:372:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGAME.g:373:2: iv_rulePersonne= rulePersonne EOF
            {
             newCompositeNode(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonne=rulePersonne();

            state._fsp--;

             current =iv_rulePersonne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalGAME.g:379:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) otherlv_8= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_descriptions_3_0 = null;

        EObject lv_interaction_4_0 = null;

        Enumerator lv_visibilite_5_0 = null;

        EObject lv_conditionsVisibilite_7_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:385:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) otherlv_8= '}' ) )
            // InternalGAME.g:386:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) otherlv_8= '}' )
            {
            // InternalGAME.g:386:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) otherlv_8= '}' )
            // InternalGAME.g:387:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGAME.g:391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:392:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:393:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:413:3: ( (lv_descriptions_3_0= ruleDescription ) )
            // InternalGAME.g:414:4: (lv_descriptions_3_0= ruleDescription )
            {
            // InternalGAME.g:414:4: (lv_descriptions_3_0= ruleDescription )
            // InternalGAME.g:415:5: lv_descriptions_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_descriptions_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"descriptions",
            						lv_descriptions_3_0,
            						"fr.enseeiht.GAME.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:432:3: ( (lv_interaction_4_0= ruleInteraction ) )
            // InternalGAME.g:433:4: (lv_interaction_4_0= ruleInteraction )
            {
            // InternalGAME.g:433:4: (lv_interaction_4_0= ruleInteraction )
            // InternalGAME.g:434:5: lv_interaction_4_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_interaction_4_0=ruleInteraction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"interaction",
            						lv_interaction_4_0,
            						"fr.enseeiht.GAME.Interaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:451:3: ( (lv_visibilite_5_0= ruleVisibilite ) )
            // InternalGAME.g:452:4: (lv_visibilite_5_0= ruleVisibilite )
            {
            // InternalGAME.g:452:4: (lv_visibilite_5_0= ruleVisibilite )
            // InternalGAME.g:453:5: lv_visibilite_5_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_visibilite_5_0=ruleVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_5_0,
            						"fr.enseeiht.GAME.Visibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonneAccess().getSiKeyword_6());
            		
            // InternalGAME.g:474:3: ( (lv_conditionsVisibilite_7_0= ruleCondition ) )
            // InternalGAME.g:475:4: (lv_conditionsVisibilite_7_0= ruleCondition )
            {
            // InternalGAME.g:475:4: (lv_conditionsVisibilite_7_0= ruleCondition )
            // InternalGAME.g:476:5: lv_conditionsVisibilite_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_conditionsVisibilite_7_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"conditionsVisibilite",
            						lv_conditionsVisibilite_7_0,
            						"fr.enseeiht.GAME.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleInteraction"
    // InternalGAME.g:501:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGAME.g:501:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGAME.g:502:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalGAME.g:508:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_choix_2_0= ruleChoix ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_choix_2_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:514:2: ( (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_choix_2_0= ruleChoix ) )+ otherlv_3= '}' ) )
            // InternalGAME.g:515:2: (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_choix_2_0= ruleChoix ) )+ otherlv_3= '}' )
            {
            // InternalGAME.g:515:2: (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_choix_2_0= ruleChoix ) )+ otherlv_3= '}' )
            // InternalGAME.g:516:3: otherlv_0= 'interaction' otherlv_1= '{' ( (lv_choix_2_0= ruleChoix ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGAME.g:524:3: ( (lv_choix_2_0= ruleChoix ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGAME.g:525:4: (lv_choix_2_0= ruleChoix )
            	    {
            	    // InternalGAME.g:525:4: (lv_choix_2_0= ruleChoix )
            	    // InternalGAME.g:526:5: lv_choix_2_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_choix_2_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"choix",
            	    						lv_choix_2_0,
            	    						"fr.enseeiht.GAME.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleChoix"
    // InternalGAME.g:551:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGAME.g:551:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGAME.g:552:2: iv_ruleChoix= ruleChoix EOF
            {
             newCompositeNode(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoix=ruleChoix();

            state._fsp--;

             current =iv_ruleChoix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalGAME.g:558:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGAME.g:564:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalGAME.g:565:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalGAME.g:565:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalGAME.g:566:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGAME.g:570:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:571:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:571:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:572:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleObjet"
    // InternalGAME.g:600:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGAME.g:600:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGAME.g:601:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalGAME.g:607:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_taille_5_0=null;
        Token otherlv_6=null;
        EObject lv_descriptions_3_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:613:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalGAME.g:614:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalGAME.g:614:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalGAME.g:615:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalGAME.g:619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:620:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:641:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGAME.g:642:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:642:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:643:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getObjetAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_descriptions_3_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjetRule());
                    					}
                    					add(
                    						current,
                    						"descriptions",
                    						lv_descriptions_3_0,
                    						"fr.enseeiht.GAME.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getTailleKeyword_4());
            		
            // InternalGAME.g:664:3: ( (lv_taille_5_0= RULE_INT ) )
            // InternalGAME.g:665:4: (lv_taille_5_0= RULE_INT )
            {
            // InternalGAME.g:665:4: (lv_taille_5_0= RULE_INT )
            // InternalGAME.g:666:5: lv_taille_5_0= RULE_INT
            {
            lv_taille_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_taille_5_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleDescription"
    // InternalGAME.g:690:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalGAME.g:690:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalGAME.g:691:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalGAME.g:697:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGAME.g:703:2: ( (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalGAME.g:704:2: (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalGAME.g:704:2: (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalGAME.g:705:3: otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGAME.g:713:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalGAME.g:714:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalGAME.g:714:4: (lv_text_2_0= RULE_STRING )
            // InternalGAME.g:715:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_text_2_0, grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleCondition"
    // InternalGAME.g:739:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGAME.g:739:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGAME.g:740:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGAME.g:746:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGAME.g:752:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalGAME.g:753:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalGAME.g:753:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalGAME.g:754:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalGAME.g:758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:759:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConnaissance"
    // InternalGAME.g:788:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGAME.g:788:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGAME.g:789:2: iv_ruleConnaissance= ruleConnaissance EOF
            {
             newCompositeNode(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnaissance=ruleConnaissance();

            state._fsp--;

             current =iv_ruleConnaissance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalGAME.g:795:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGAME.g:801:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalGAME.g:802:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalGAME.g:802:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalGAME.g:803:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalGAME.g:807:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:808:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:808:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:809:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleExplorateur"
    // InternalGAME.g:837:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGAME.g:837:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGAME.g:838:2: iv_ruleExplorateur= ruleExplorateur EOF
            {
             newCompositeNode(grammarAccess.getExplorateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplorateur=ruleExplorateur();

            state._fsp--;

             current =iv_ruleExplorateur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplorateur"


    // $ANTLR start "ruleExplorateur"
    // InternalGAME.g:844:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
    public final EObject ruleExplorateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_taille_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalGAME.g:850:2: ( (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // InternalGAME.g:851:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // InternalGAME.g:851:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // InternalGAME.g:852:3: otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            // InternalGAME.g:856:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:857:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:857:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:858:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExplorateurAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getExplorateurAccess().getTailleKeyword_3());
            		
            // InternalGAME.g:882:3: ( (lv_taille_4_0= RULE_INT ) )
            // InternalGAME.g:883:4: (lv_taille_4_0= RULE_INT )
            {
            // InternalGAME.g:883:4: (lv_taille_4_0= RULE_INT )
            // InternalGAME.g:884:5: lv_taille_4_0= RULE_INT
            {
            lv_taille_4_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_taille_4_0, grammarAccess.getExplorateurAccess().getTailleINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getExplorateurAccess().getInventaireOKeyword_5());
            		
            // InternalGAME.g:904:3: ( (otherlv_6= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGAME.g:905:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGAME.g:905:4: (otherlv_6= RULE_ID )
            	    // InternalGAME.g:906:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExplorateurRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    					newLeafNode(otherlv_6, grammarAccess.getExplorateurAccess().getObjetsObjetCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getExplorateurAccess().getInventaireCKeyword_7());
            		
            // InternalGAME.g:921:3: ( (otherlv_8= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGAME.g:922:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalGAME.g:922:4: (otherlv_8= RULE_ID )
            	    // InternalGAME.g:923:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExplorateurRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getExplorateurAccess().getLocalisationKeyword_9());
            		
            // InternalGAME.g:938:3: ( (otherlv_10= RULE_ID ) )
            // InternalGAME.g:939:4: (otherlv_10= RULE_ID )
            {
            // InternalGAME.g:939:4: (otherlv_10= RULE_ID )
            // InternalGAME.g:940:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_10, grammarAccess.getExplorateurAccess().getLocalisationLieuCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExplorateurAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplorateur"


    // $ANTLR start "entryRuleLieu"
    // InternalGAME.g:959:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGAME.g:959:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGAME.g:960:2: iv_ruleLieu= ruleLieu EOF
            {
             newCompositeNode(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieu=ruleLieu();

            state._fsp--;

             current =iv_ruleLieu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalGAME.g:966:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'connaissances' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= 'personnes' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_descriptions_3_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:972:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'connaissances' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= 'personnes' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' ) )
            // InternalGAME.g:973:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'connaissances' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= 'personnes' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )
            {
            // InternalGAME.g:973:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'connaissances' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= 'personnes' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )
            // InternalGAME.g:974:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'connaissances' ( (otherlv_7= RULE_ID ) ) )* (otherlv_8= 'personnes' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalGAME.g:978:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:979:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:979:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:980:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1000:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGAME.g:1001:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:1001:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:1002:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_descriptions_3_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLieuRule());
                    					}
                    					add(
                    						current,
                    						"descriptions",
                    						lv_descriptions_3_0,
                    						"fr.enseeiht.GAME.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGAME.g:1019:3: (otherlv_4= 'objets' ( (otherlv_5= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGAME.g:1020:4: otherlv_4= 'objets' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getObjetsKeyword_4_0());
            	    			
            	    // InternalGAME.g:1024:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalGAME.g:1025:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalGAME.g:1025:5: (otherlv_5= RULE_ID )
            	    // InternalGAME.g:1026:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    						newLeafNode(otherlv_5, grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalGAME.g:1038:3: (otherlv_6= 'connaissances' ( (otherlv_7= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGAME.g:1039:4: otherlv_6= 'connaissances' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getConnaissancesKeyword_5_0());
            	    			
            	    // InternalGAME.g:1043:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalGAME.g:1044:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalGAME.g:1044:5: (otherlv_7= RULE_ID )
            	    // InternalGAME.g:1045:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    						newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalGAME.g:1057:3: (otherlv_8= 'personnes' ( (otherlv_9= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGAME.g:1058:4: otherlv_8= 'personnes' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getPersonnesKeyword_6_0());
            	    			
            	    // InternalGAME.g:1062:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalGAME.g:1063:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGAME.g:1063:5: (otherlv_9= RULE_ID )
            	    // InternalGAME.g:1064:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    						newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLieu"


    // $ANTLR start "ruleVisibilite"
    // InternalGAME.g:1084:1: ruleVisibilite returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) ;
    public final Enumerator ruleVisibilite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGAME.g:1090:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) )
            // InternalGAME.g:1091:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            {
            // InternalGAME.g:1091:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGAME.g:1092:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalGAME.g:1092:3: (enumLiteral_0= 'visible' )
                    // InternalGAME.g:1093:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:1100:3: (enumLiteral_1= 'invisible' )
                    {
                    // InternalGAME.g:1100:3: (enumLiteral_1= 'invisible' )
                    // InternalGAME.g:1101:4: enumLiteral_1= 'invisible'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getVisibiliteAccess().getInvisibleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibiliteAccess().getInvisibleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilite"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000042246000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002246000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002046000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000380802000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000380002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200002000L});

}