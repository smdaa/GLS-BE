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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'{'", "'pointDepart'", "'pointFin'", "'}'", "'chemin'", "'de'", "'vers'", "'si'", "'personne'", "'interaction'", "'choix'", "'action'", "'echange'", "'objetsDonne'", "'objetsPris'", "'connaissancesDonne'", "'objet'", "'taille'", "'description'", "'condition'", "'objets'", "'necessaires'", "'manquants'", "'connaissances'", "'connaissance'", "'explorateur'", "'inventaireO'", "'inventaireC'", "'localisation'", "'objetavecquantite'", "','", "'lieu'", "'trouvables'", "'trouvable'", "'personnes'", "'cheminspossible'", "'visible'", "'invisible'", "'ouvert'", "'ferme'"
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
    // InternalGAME.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite ) )* ( (lv_Connaissances_11_0= ruleConnaissance ) )* ( (lv_personnes_12_0= rulePersonne ) )* ( (lv_chemins_13_0= ruleChemin ) )* otherlv_14= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_14=null;
        EObject lv_explorateur_3_0 = null;

        EObject lv_lieux_8_0 = null;

        EObject lv_Objets_9_0 = null;

        EObject lv_ObjetAvecQuantite_10_0 = null;

        EObject lv_Connaissances_11_0 = null;

        EObject lv_personnes_12_0 = null;

        EObject lv_chemins_13_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:78:2: ( (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite ) )* ( (lv_Connaissances_11_0= ruleConnaissance ) )* ( (lv_personnes_12_0= rulePersonne ) )* ( (lv_chemins_13_0= ruleChemin ) )* otherlv_14= '}' ) )
            // InternalGAME.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite ) )* ( (lv_Connaissances_11_0= ruleConnaissance ) )* ( (lv_personnes_12_0= rulePersonne ) )* ( (lv_chemins_13_0= ruleChemin ) )* otherlv_14= '}' )
            {
            // InternalGAME.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite ) )* ( (lv_Connaissances_11_0= ruleConnaissance ) )* ( (lv_personnes_12_0= rulePersonne ) )* ( (lv_chemins_13_0= ruleChemin ) )* otherlv_14= '}' )
            // InternalGAME.g:80:3: otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite ) )* ( (lv_Connaissances_11_0= ruleConnaissance ) )* ( (lv_personnes_12_0= rulePersonne ) )* ( (lv_chemins_13_0= ruleChemin ) )* otherlv_14= '}'
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

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJeuAccess().getPointDepartKeyword_4());
            		
            // InternalGAME.g:129:3: ( (otherlv_5= RULE_ID ) )
            // InternalGAME.g:130:4: (otherlv_5= RULE_ID )
            {
            // InternalGAME.g:130:4: (otherlv_5= RULE_ID )
            // InternalGAME.g:131:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getJeuAccess().getPointDepartLieuCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getJeuAccess().getPointFinKeyword_6());
            		
            // InternalGAME.g:146:3: ( (otherlv_7= RULE_ID ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGAME.g:147:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalGAME.g:147:4: (otherlv_7= RULE_ID )
            	    // InternalGAME.g:148:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getJeuRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    					newLeafNode(otherlv_7, grammarAccess.getJeuAccess().getPointFinLieuCrossReference_7_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalGAME.g:159:3: ( (lv_lieux_8_0= ruleLieu ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGAME.g:160:4: (lv_lieux_8_0= ruleLieu )
            	    {
            	    // InternalGAME.g:160:4: (lv_lieux_8_0= ruleLieu )
            	    // InternalGAME.g:161:5: lv_lieux_8_0= ruleLieu
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getLieuxLieuParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_lieux_8_0=ruleLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lieux",
            	    						lv_lieux_8_0,
            	    						"fr.enseeiht.GAME.Lieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGAME.g:178:3: ( (lv_Objets_9_0= ruleObjet ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGAME.g:179:4: (lv_Objets_9_0= ruleObjet )
            	    {
            	    // InternalGAME.g:179:4: (lv_Objets_9_0= ruleObjet )
            	    // InternalGAME.g:180:5: lv_Objets_9_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getObjetsObjetParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_Objets_9_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Objets",
            	    						lv_Objets_9_0,
            	    						"fr.enseeiht.GAME.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGAME.g:197:3: ( (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==41) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGAME.g:198:4: (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite )
            	    {
            	    // InternalGAME.g:198:4: (lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite )
            	    // InternalGAME.g:199:5: lv_ObjetAvecQuantite_10_0= ruleObjetAvecQuantite
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getObjetAvecQuantiteObjetAvecQuantiteParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ObjetAvecQuantite_10_0=ruleObjetAvecQuantite();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ObjetAvecQuantite",
            	    						lv_ObjetAvecQuantite_10_0,
            	    						"fr.enseeiht.GAME.ObjetAvecQuantite");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGAME.g:216:3: ( (lv_Connaissances_11_0= ruleConnaissance ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==36) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGAME.g:217:4: (lv_Connaissances_11_0= ruleConnaissance )
            	    {
            	    // InternalGAME.g:217:4: (lv_Connaissances_11_0= ruleConnaissance )
            	    // InternalGAME.g:218:5: lv_Connaissances_11_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_Connaissances_11_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Connaissances",
            	    						lv_Connaissances_11_0,
            	    						"fr.enseeiht.GAME.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGAME.g:235:3: ( (lv_personnes_12_0= rulePersonne ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGAME.g:236:4: (lv_personnes_12_0= rulePersonne )
            	    {
            	    // InternalGAME.g:236:4: (lv_personnes_12_0= rulePersonne )
            	    // InternalGAME.g:237:5: lv_personnes_12_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_personnes_12_0=rulePersonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"personnes",
            	    						lv_personnes_12_0,
            	    						"fr.enseeiht.GAME.Personne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalGAME.g:254:3: ( (lv_chemins_13_0= ruleChemin ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGAME.g:255:4: (lv_chemins_13_0= ruleChemin )
            	    {
            	    // InternalGAME.g:255:4: (lv_chemins_13_0= ruleChemin )
            	    // InternalGAME.g:256:5: lv_chemins_13_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_chemins_13_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chemins",
            	    						lv_chemins_13_0,
            	    						"fr.enseeiht.GAME.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalGAME.g:281:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGAME.g:281:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGAME.g:282:2: iv_ruleChemin= ruleChemin EOF
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
    // InternalGAME.g:288:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' ) ;
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
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_descriptions_3_0 = null;

        Enumerator lv_visibilite_8_0 = null;

        EObject lv_conditionsVisibilite_10_0 = null;

        Enumerator lv_ouverture_11_0 = null;

        EObject lv_conditionsOuverture_13_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:294:2: ( (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' ) )
            // InternalGAME.g:295:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' )
            {
            // InternalGAME.g:295:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' )
            // InternalGAME.g:296:3: otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            // InternalGAME.g:300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:301:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:302:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:322:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGAME.g:323:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:323:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:324:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
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

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getDeKeyword_4());
            		
            // InternalGAME.g:345:3: ( (otherlv_5= RULE_ID ) )
            // InternalGAME.g:346:4: (otherlv_5= RULE_ID )
            {
            // InternalGAME.g:346:4: (otherlv_5= RULE_ID )
            // InternalGAME.g:347:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getDepartLieuCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getVersKeyword_6());
            		
            // InternalGAME.g:362:3: ( (otherlv_7= RULE_ID ) )
            // InternalGAME.g:363:4: (otherlv_7= RULE_ID )
            {
            // InternalGAME.g:363:4: (otherlv_7= RULE_ID )
            // InternalGAME.g:364:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getArriveLieuCrossReference_7_0());
            				

            }


            }

            // InternalGAME.g:375:3: ( (lv_visibilite_8_0= ruleVisibilite ) )
            // InternalGAME.g:376:4: (lv_visibilite_8_0= ruleVisibilite )
            {
            // InternalGAME.g:376:4: (lv_visibilite_8_0= ruleVisibilite )
            // InternalGAME.g:377:5: lv_visibilite_8_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getVisibiliteVisibiliteEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalGAME.g:394:3: (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGAME.g:395:4: otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getSiKeyword_9_0());
                    			
                    // InternalGAME.g:399:4: ( (lv_conditionsVisibilite_10_0= ruleCondition ) )
                    // InternalGAME.g:400:5: (lv_conditionsVisibilite_10_0= ruleCondition )
                    {
                    // InternalGAME.g:400:5: (lv_conditionsVisibilite_10_0= ruleCondition )
                    // InternalGAME.g:401:6: lv_conditionsVisibilite_10_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_19);
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


                    }
                    break;

            }

            // InternalGAME.g:419:3: ( (lv_ouverture_11_0= ruleOuverture ) )
            // InternalGAME.g:420:4: (lv_ouverture_11_0= ruleOuverture )
            {
            // InternalGAME.g:420:4: (lv_ouverture_11_0= ruleOuverture )
            // InternalGAME.g:421:5: lv_ouverture_11_0= ruleOuverture
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getOuvertureOuvertureEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_21);
            lv_ouverture_11_0=ruleOuverture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"ouverture",
            						lv_ouverture_11_0,
            						"fr.enseeiht.GAME.Ouverture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:438:3: (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGAME.g:439:4: otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) )
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getCheminAccess().getSiKeyword_11_0());
                    			
                    // InternalGAME.g:443:4: ( (lv_conditionsOuverture_13_0= ruleCondition ) )
                    // InternalGAME.g:444:5: (lv_conditionsOuverture_13_0= ruleCondition )
                    {
                    // InternalGAME.g:444:5: (lv_conditionsOuverture_13_0= ruleCondition )
                    // InternalGAME.g:445:6: lv_conditionsOuverture_13_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getConditionsOuvertureConditionParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_conditionsOuverture_13_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheminRule());
                    						}
                    						set(
                    							current,
                    							"conditionsOuverture",
                    							lv_conditionsOuverture_13_0,
                    							"fr.enseeiht.GAME.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCheminAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalGAME.g:471:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGAME.g:471:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGAME.g:472:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGAME.g:478:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' ) ;
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
            // InternalGAME.g:484:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' ) )
            // InternalGAME.g:485:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' )
            {
            // InternalGAME.g:485:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' )
            // InternalGAME.g:486:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGAME.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:492:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:512:3: ( (lv_descriptions_3_0= ruleDescription ) )
            // InternalGAME.g:513:4: (lv_descriptions_3_0= ruleDescription )
            {
            // InternalGAME.g:513:4: (lv_descriptions_3_0= ruleDescription )
            // InternalGAME.g:514:5: lv_descriptions_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalGAME.g:531:3: ( (lv_interaction_4_0= ruleInteraction ) )
            // InternalGAME.g:532:4: (lv_interaction_4_0= ruleInteraction )
            {
            // InternalGAME.g:532:4: (lv_interaction_4_0= ruleInteraction )
            // InternalGAME.g:533:5: lv_interaction_4_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalGAME.g:550:3: ( (lv_visibilite_5_0= ruleVisibilite ) )
            // InternalGAME.g:551:4: (lv_visibilite_5_0= ruleVisibilite )
            {
            // InternalGAME.g:551:4: (lv_visibilite_5_0= ruleVisibilite )
            // InternalGAME.g:552:5: lv_visibilite_5_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalGAME.g:569:3: (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGAME.g:570:4: otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonneAccess().getSiKeyword_6_0());
                    			
                    // InternalGAME.g:574:4: ( (lv_conditionsVisibilite_7_0= ruleCondition ) )
                    // InternalGAME.g:575:5: (lv_conditionsVisibilite_7_0= ruleCondition )
                    {
                    // InternalGAME.g:575:5: (lv_conditionsVisibilite_7_0= ruleCondition )
                    // InternalGAME.g:576:6: lv_conditionsVisibilite_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_22);
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


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGAME.g:602:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGAME.g:602:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGAME.g:603:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGAME.g:609:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_echanges_2_0 = null;

        EObject lv_choix_3_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:615:2: ( (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' ) )
            // InternalGAME.g:616:2: (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' )
            {
            // InternalGAME.g:616:2: (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' )
            // InternalGAME.g:617:3: otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGAME.g:625:3: ( (lv_echanges_2_0= ruleEchange ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGAME.g:626:4: (lv_echanges_2_0= ruleEchange )
            	    {
            	    // InternalGAME.g:626:4: (lv_echanges_2_0= ruleEchange )
            	    // InternalGAME.g:627:5: lv_echanges_2_0= ruleEchange
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getEchangesEchangeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_echanges_2_0=ruleEchange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"echanges",
            	    						lv_echanges_2_0,
            	    						"fr.enseeiht.GAME.Echange");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalGAME.g:644:3: ( (lv_choix_3_0= ruleChoix ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGAME.g:645:4: (lv_choix_3_0= ruleChoix )
            	    {
            	    // InternalGAME.g:645:4: (lv_choix_3_0= ruleChoix )
            	    // InternalGAME.g:646:5: lv_choix_3_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_choix_3_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"choix",
            	    						lv_choix_3_0,
            	    						"fr.enseeiht.GAME.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalGAME.g:671:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGAME.g:671:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGAME.g:672:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGAME.g:678:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_actions_3_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:684:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) )
            // InternalGAME.g:685:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            {
            // InternalGAME.g:685:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            // InternalGAME.g:686:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGAME.g:690:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:691:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:691:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:692:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:712:3: ( (lv_actions_3_0= ruleAction ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGAME.g:713:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalGAME.g:713:4: (lv_actions_3_0= ruleAction )
            	    // InternalGAME.g:714:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"fr.enseeiht.GAME.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalGAME.g:731:3: ( (lv_conditions_4_0= ruleCondition ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGAME.g:732:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalGAME.g:732:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalGAME.g:733:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_conditions_4_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_4_0,
            	    						"fr.enseeiht.GAME.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleAction"
    // InternalGAME.g:758:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGAME.g:758:47: (iv_ruleAction= ruleAction EOF )
            // InternalGAME.g:759:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGAME.g:765:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_descriptions_3_0 = null;

        EObject lv_conditions_4_0 = null;

        EObject lv_echanges_5_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:771:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' ) )
            // InternalGAME.g:772:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' )
            {
            // InternalGAME.g:772:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' )
            // InternalGAME.g:773:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalGAME.g:777:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:778:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:778:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:779:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:799:3: ( (lv_descriptions_3_0= ruleDescription ) )
            // InternalGAME.g:800:4: (lv_descriptions_3_0= ruleDescription )
            {
            // InternalGAME.g:800:4: (lv_descriptions_3_0= ruleDescription )
            // InternalGAME.g:801:5: lv_descriptions_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getActionAccess().getDescriptionsDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_descriptions_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					add(
            						current,
            						"descriptions",
            						lv_descriptions_3_0,
            						"fr.enseeiht.GAME.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:818:3: ( (lv_conditions_4_0= ruleCondition ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGAME.g:819:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalGAME.g:819:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalGAME.g:820:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_conditions_4_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_4_0,
            	    						"fr.enseeiht.GAME.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalGAME.g:837:3: ( (lv_echanges_5_0= ruleEchange ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGAME.g:838:4: (lv_echanges_5_0= ruleEchange )
            	    {
            	    // InternalGAME.g:838:4: (lv_echanges_5_0= ruleEchange )
            	    // InternalGAME.g:839:5: lv_echanges_5_0= ruleEchange
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getEchangesEchangeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_echanges_5_0=ruleEchange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"echanges",
            	    						lv_echanges_5_0,
            	    						"fr.enseeiht.GAME.Echange");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEchange"
    // InternalGAME.g:864:1: entryRuleEchange returns [EObject current=null] : iv_ruleEchange= ruleEchange EOF ;
    public final EObject entryRuleEchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEchange = null;


        try {
            // InternalGAME.g:864:48: (iv_ruleEchange= ruleEchange EOF )
            // InternalGAME.g:865:2: iv_ruleEchange= ruleEchange EOF
            {
             newCompositeNode(grammarAccess.getEchangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEchange=ruleEchange();

            state._fsp--;

             current =iv_ruleEchange; 
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
    // $ANTLR end "entryRuleEchange"


    // $ANTLR start "ruleEchange"
    // InternalGAME.g:871:1: ruleEchange returns [EObject current=null] : ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' ) ;
    public final EObject ruleEchange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_conditions_9_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:877:2: ( ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' ) )
            // InternalGAME.g:878:2: ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' )
            {
            // InternalGAME.g:878:2: ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' )
            // InternalGAME.g:879:3: () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}'
            {
            // InternalGAME.g:879:3: ()
            // InternalGAME.g:880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEchangeAccess().getEchangeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEchangeAccess().getEchangeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getEchangeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:894:3: (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGAME.g:895:4: otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEchangeAccess().getObjetsDonneKeyword_3_0());
                    			
                    // InternalGAME.g:899:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalGAME.g:900:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalGAME.g:900:5: (otherlv_4= RULE_ID )
                    	    // InternalGAME.g:901:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEchangeRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getEchangeAccess().getObjetsDonneObjetCrossReference_3_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:913:3: (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGAME.g:914:4: otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEchangeAccess().getObjetsPrisKeyword_4_0());
                    			
                    // InternalGAME.g:918:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGAME.g:919:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalGAME.g:919:5: (otherlv_6= RULE_ID )
                    	    // InternalGAME.g:920:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEchangeRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_33); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getEchangeAccess().getObjetsPrisObjetCrossReference_4_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:932:3: (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGAME.g:933:4: otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getEchangeAccess().getConnaissancesDonneKeyword_5_0());
                    			
                    // InternalGAME.g:937:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGAME.g:938:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalGAME.g:938:5: (otherlv_8= RULE_ID )
                    	    // InternalGAME.g:939:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEchangeRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_34); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getEchangeAccess().getConnaissancesConnaissanceCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:951:3: ( (lv_conditions_9_0= ruleCondition ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGAME.g:952:4: (lv_conditions_9_0= ruleCondition )
            	    {
            	    // InternalGAME.g:952:4: (lv_conditions_9_0= ruleCondition )
            	    // InternalGAME.g:953:5: lv_conditions_9_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getEchangeAccess().getConditionsConditionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_conditions_9_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEchangeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_9_0,
            	    						"fr.enseeiht.GAME.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEchangeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEchange"


    // $ANTLR start "entryRuleObjet"
    // InternalGAME.g:978:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGAME.g:978:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGAME.g:979:2: iv_ruleObjet= ruleObjet EOF
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
    // InternalGAME.g:985:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) ( (lv_visibilite_6_0= ruleVisibilite ) ) (otherlv_7= 'si' ( (lv_conditionsVisibilite_8_0= ruleCondition ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_taille_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_descriptions_3_0 = null;

        Enumerator lv_visibilite_6_0 = null;

        EObject lv_conditionsVisibilite_8_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:991:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) ( (lv_visibilite_6_0= ruleVisibilite ) ) (otherlv_7= 'si' ( (lv_conditionsVisibilite_8_0= ruleCondition ) ) )? otherlv_9= '}' ) )
            // InternalGAME.g:992:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) ( (lv_visibilite_6_0= ruleVisibilite ) ) (otherlv_7= 'si' ( (lv_conditionsVisibilite_8_0= ruleCondition ) ) )? otherlv_9= '}' )
            {
            // InternalGAME.g:992:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) ( (lv_visibilite_6_0= ruleVisibilite ) ) (otherlv_7= 'si' ( (lv_conditionsVisibilite_8_0= ruleCondition ) ) )? otherlv_9= '}' )
            // InternalGAME.g:993:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) ( (lv_visibilite_6_0= ruleVisibilite ) ) (otherlv_7= 'si' ( (lv_conditionsVisibilite_8_0= ruleCondition ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalGAME.g:997:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:998:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:998:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:999:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1019:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGAME.g:1020:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:1020:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:1021:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getObjetAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_36);
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

            otherlv_4=(Token)match(input,29,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getTailleKeyword_4());
            		
            // InternalGAME.g:1042:3: ( (lv_taille_5_0= RULE_INT ) )
            // InternalGAME.g:1043:4: (lv_taille_5_0= RULE_INT )
            {
            // InternalGAME.g:1043:4: (lv_taille_5_0= RULE_INT )
            // InternalGAME.g:1044:5: lv_taille_5_0= RULE_INT
            {
            lv_taille_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            // InternalGAME.g:1060:3: ( (lv_visibilite_6_0= ruleVisibilite ) )
            // InternalGAME.g:1061:4: (lv_visibilite_6_0= ruleVisibilite )
            {
            // InternalGAME.g:1061:4: (lv_visibilite_6_0= ruleVisibilite )
            // InternalGAME.g:1062:5: lv_visibilite_6_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getVisibiliteVisibiliteEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_visibilite_6_0=ruleVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_6_0,
            						"fr.enseeiht.GAME.Visibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:1079:3: (otherlv_7= 'si' ( (lv_conditionsVisibilite_8_0= ruleCondition ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGAME.g:1080:4: otherlv_7= 'si' ( (lv_conditionsVisibilite_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjetAccess().getSiKeyword_7_0());
                    			
                    // InternalGAME.g:1084:4: ( (lv_conditionsVisibilite_8_0= ruleCondition ) )
                    // InternalGAME.g:1085:5: (lv_conditionsVisibilite_8_0= ruleCondition )
                    {
                    // InternalGAME.g:1085:5: (lv_conditionsVisibilite_8_0= ruleCondition )
                    // InternalGAME.g:1086:6: lv_conditionsVisibilite_8_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getObjetAccess().getConditionsVisibiliteConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_conditionsVisibilite_8_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjetRule());
                    						}
                    						set(
                    							current,
                    							"conditionsVisibilite",
                    							lv_conditionsVisibilite_8_0,
                    							"fr.enseeiht.GAME.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalGAME.g:1112:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalGAME.g:1112:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalGAME.g:1113:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalGAME.g:1119:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGAME.g:1125:2: ( (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalGAME.g:1126:2: (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalGAME.g:1126:2: (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalGAME.g:1127:3: otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGAME.g:1135:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalGAME.g:1136:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalGAME.g:1136:4: (lv_text_2_0= RULE_STRING )
            // InternalGAME.g:1137:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGAME.g:1161:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGAME.g:1161:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGAME.g:1162:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGAME.g:1168:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalGAME.g:1174:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' ) )
            // InternalGAME.g:1175:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' )
            {
            // InternalGAME.g:1175:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' )
            // InternalGAME.g:1176:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalGAME.g:1180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1181:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1182:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1202:3: (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==33) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalGAME.g:1203:4: otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )*
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getObjetsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getNecessairesKeyword_3_1());
                    			
                    // InternalGAME.g:1211:4: ( (otherlv_5= RULE_ID ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGAME.g:1212:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1212:5: (otherlv_5= RULE_ID )
                    	    // InternalGAME.g:1213:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getConditionRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_41); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getObjetsObjetCrossReference_3_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:1225:3: (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGAME.g:1226:4: otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )*
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_42); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getObjetsKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,34,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getManquantsKeyword_4_1());
                    			
                    // InternalGAME.g:1234:4: ( (otherlv_8= RULE_ID ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalGAME.g:1235:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1235:5: (otherlv_8= RULE_ID )
                    	    // InternalGAME.g:1236:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getConditionRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_43); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getObjetsObjetCrossReference_4_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:1248:3: (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGAME.g:1249:4: otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )*
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getConnaissancesKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,33,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getNecessairesKeyword_5_1());
                    			
                    // InternalGAME.g:1257:4: ( (otherlv_11= RULE_ID ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGAME.g:1258:5: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1258:5: (otherlv_11= RULE_ID )
                    	    // InternalGAME.g:1259:6: otherlv_11= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getConditionRule());
                    	    						}
                    	    					
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_44); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getConnaissancesConnaissanceCrossReference_5_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalGAME.g:1279:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGAME.g:1279:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGAME.g:1280:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGAME.g:1286:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_descriptions_3_0 = null;

        Enumerator lv_visibilite_4_0 = null;

        EObject lv_conditionsVisibilite_6_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:1292:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' ) )
            // InternalGAME.g:1293:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            {
            // InternalGAME.g:1293:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            // InternalGAME.g:1294:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalGAME.g:1298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1299:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1300:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getConnaissanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1320:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGAME.g:1321:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:1321:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:1322:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getConnaissanceAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_descriptions_3_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
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

            // InternalGAME.g:1339:3: ( (lv_visibilite_4_0= ruleVisibilite ) )
            // InternalGAME.g:1340:4: (lv_visibilite_4_0= ruleVisibilite )
            {
            // InternalGAME.g:1340:4: (lv_visibilite_4_0= ruleVisibilite )
            // InternalGAME.g:1341:5: lv_visibilite_4_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getVisibiliteVisibiliteEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_visibilite_4_0=ruleVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_4_0,
            						"fr.enseeiht.GAME.Visibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:1358:3: (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGAME.g:1359:4: otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnaissanceAccess().getSiKeyword_5_0());
                    			
                    // InternalGAME.g:1363:4: ( (lv_conditionsVisibilite_6_0= ruleCondition ) )
                    // InternalGAME.g:1364:5: (lv_conditionsVisibilite_6_0= ruleCondition )
                    {
                    // InternalGAME.g:1364:5: (lv_conditionsVisibilite_6_0= ruleCondition )
                    // InternalGAME.g:1365:6: lv_conditionsVisibilite_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_conditionsVisibilite_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnaissanceRule());
                    						}
                    						set(
                    							current,
                    							"conditionsVisibilite",
                    							lv_conditionsVisibilite_6_0,
                    							"fr.enseeiht.GAME.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConnaissanceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalGAME.g:1391:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGAME.g:1391:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGAME.g:1392:2: iv_ruleExplorateur= ruleExplorateur EOF
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
    // InternalGAME.g:1398:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
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
            // InternalGAME.g:1404:2: ( (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // InternalGAME.g:1405:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // InternalGAME.g:1405:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // InternalGAME.g:1406:3: otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            // InternalGAME.g:1410:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1411:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1411:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1412:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getExplorateurAccess().getTailleKeyword_3());
            		
            // InternalGAME.g:1436:3: ( (lv_taille_4_0= RULE_INT ) )
            // InternalGAME.g:1437:4: (lv_taille_4_0= RULE_INT )
            {
            // InternalGAME.g:1437:4: (lv_taille_4_0= RULE_INT )
            // InternalGAME.g:1438:5: lv_taille_4_0= RULE_INT
            {
            lv_taille_4_0=(Token)match(input,RULE_INT,FOLLOW_46); 

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

            otherlv_5=(Token)match(input,38,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getExplorateurAccess().getInventaireOKeyword_5());
            		
            // InternalGAME.g:1458:3: ( (otherlv_6= RULE_ID ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGAME.g:1459:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGAME.g:1459:4: (otherlv_6= RULE_ID )
            	    // InternalGAME.g:1460:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExplorateurRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    					newLeafNode(otherlv_6, grammarAccess.getExplorateurAccess().getObjetsObjetAvecQuantiteCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_7=(Token)match(input,39,FOLLOW_48); 

            			newLeafNode(otherlv_7, grammarAccess.getExplorateurAccess().getInventaireCKeyword_7());
            		
            // InternalGAME.g:1475:3: ( (otherlv_8= RULE_ID ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGAME.g:1476:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalGAME.g:1476:4: (otherlv_8= RULE_ID )
            	    // InternalGAME.g:1477:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExplorateurRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExplorateurAccess().getConnaissancesConnaissanceCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_9=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getExplorateurAccess().getLocalisationKeyword_9());
            		
            // InternalGAME.g:1492:3: ( (otherlv_10= RULE_ID ) )
            // InternalGAME.g:1493:4: (otherlv_10= RULE_ID )
            {
            // InternalGAME.g:1493:4: (otherlv_10= RULE_ID )
            // InternalGAME.g:1494:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_10, grammarAccess.getExplorateurAccess().getLocalisationLieuCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleObjetAvecQuantite"
    // InternalGAME.g:1513:1: entryRuleObjetAvecQuantite returns [EObject current=null] : iv_ruleObjetAvecQuantite= ruleObjetAvecQuantite EOF ;
    public final EObject entryRuleObjetAvecQuantite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetAvecQuantite = null;


        try {
            // InternalGAME.g:1513:58: (iv_ruleObjetAvecQuantite= ruleObjetAvecQuantite EOF )
            // InternalGAME.g:1514:2: iv_ruleObjetAvecQuantite= ruleObjetAvecQuantite EOF
            {
             newCompositeNode(grammarAccess.getObjetAvecQuantiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjetAvecQuantite=ruleObjetAvecQuantite();

            state._fsp--;

             current =iv_ruleObjetAvecQuantite; 
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
    // $ANTLR end "entryRuleObjetAvecQuantite"


    // $ANTLR start "ruleObjetAvecQuantite"
    // InternalGAME.g:1520:1: ruleObjetAvecQuantite returns [EObject current=null] : (otherlv_0= 'objetavecquantite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_quantite_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
    public final EObject ruleObjetAvecQuantite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_quantite_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGAME.g:1526:2: ( (otherlv_0= 'objetavecquantite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_quantite_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalGAME.g:1527:2: (otherlv_0= 'objetavecquantite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_quantite_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalGAME.g:1527:2: (otherlv_0= 'objetavecquantite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_quantite_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalGAME.g:1528:3: otherlv_0= 'objetavecquantite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_quantite_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAvecQuantiteAccess().getObjetavecquantiteKeyword_0());
            		
            // InternalGAME.g:1532:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1533:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1533:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1534:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjetAvecQuantiteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetAvecQuantiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAvecQuantiteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1554:3: ( (otherlv_3= RULE_ID ) )
            // InternalGAME.g:1555:4: (otherlv_3= RULE_ID )
            {
            // InternalGAME.g:1555:4: (otherlv_3= RULE_ID )
            // InternalGAME.g:1556:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetAvecQuantiteRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_3, grammarAccess.getObjetAvecQuantiteAccess().getObjetObjetCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAvecQuantiteAccess().getCommaKeyword_4());
            		
            // InternalGAME.g:1571:3: ( (lv_quantite_5_0= RULE_INT ) )
            // InternalGAME.g:1572:4: (lv_quantite_5_0= RULE_INT )
            {
            // InternalGAME.g:1572:4: (lv_quantite_5_0= RULE_INT )
            // InternalGAME.g:1573:5: lv_quantite_5_0= RULE_INT
            {
            lv_quantite_5_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_quantite_5_0, grammarAccess.getObjetAvecQuantiteAccess().getQuantiteINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetAvecQuantiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getObjetAvecQuantiteAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleObjetAvecQuantite"


    // $ANTLR start "entryRuleLieu"
    // InternalGAME.g:1597:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGAME.g:1597:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGAME.g:1598:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalGAME.g:1604:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_descriptions_3_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:1610:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' ) )
            // InternalGAME.g:1611:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' )
            {
            // InternalGAME.g:1611:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' )
            // InternalGAME.g:1612:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalGAME.g:1616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1617:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1618:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1638:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGAME.g:1639:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:1639:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:1640:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_51);
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

            // InternalGAME.g:1657:3: (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==32) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGAME.g:1658:4: otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_52); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getObjetsKeyword_4_0());
            	    			
            	    otherlv_5=(Token)match(input,44,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLieuAccess().getTrouvablesKeyword_4_1());
            	    			
            	    // InternalGAME.g:1666:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalGAME.g:1667:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGAME.g:1667:5: (otherlv_6= RULE_ID )
            	    // InternalGAME.g:1668:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_51); 

            	    						newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalGAME.g:1680:3: (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGAME.g:1681:4: otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_53); 

            	    				newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getConnaissancesKeyword_5_0());
            	    			
            	    otherlv_8=(Token)match(input,45,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getTrouvableKeyword_5_1());
            	    			
            	    // InternalGAME.g:1689:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalGAME.g:1690:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGAME.g:1690:5: (otherlv_9= RULE_ID )
            	    // InternalGAME.g:1691:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_54); 

            	    						newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalGAME.g:1703:3: (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==46) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGAME.g:1704:4: otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,46,FOLLOW_53); 

            	    				newLeafNode(otherlv_10, grammarAccess.getLieuAccess().getPersonnesKeyword_6_0());
            	    			
            	    otherlv_11=(Token)match(input,45,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getLieuAccess().getTrouvableKeyword_6_1());
            	    			
            	    // InternalGAME.g:1712:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalGAME.g:1713:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalGAME.g:1713:5: (otherlv_12= RULE_ID )
            	    // InternalGAME.g:1714:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_55); 

            	    						newLeafNode(otherlv_12, grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalGAME.g:1726:3: (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGAME.g:1727:4: otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getLieuAccess().getCheminspossibleKeyword_7_0());
                    			
                    // InternalGAME.g:1731:4: ( (otherlv_14= RULE_ID ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGAME.g:1732:5: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1732:5: (otherlv_14= RULE_ID )
                    	    // InternalGAME.g:1733:6: otherlv_14= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLieuRule());
                    	    						}
                    	    					
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_44); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getLieuAccess().getCheminspossibleCheminCrossReference_7_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalGAME.g:1753:1: ruleVisibilite returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) ;
    public final Enumerator ruleVisibilite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGAME.g:1759:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) )
            // InternalGAME.g:1760:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            {
            // InternalGAME.g:1760:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            else if ( (LA43_0==49) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalGAME.g:1761:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalGAME.g:1761:3: (enumLiteral_0= 'visible' )
                    // InternalGAME.g:1762:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:1769:3: (enumLiteral_1= 'invisible' )
                    {
                    // InternalGAME.g:1769:3: (enumLiteral_1= 'invisible' )
                    // InternalGAME.g:1770:4: enumLiteral_1= 'invisible'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

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


    // $ANTLR start "ruleOuverture"
    // InternalGAME.g:1780:1: ruleOuverture returns [Enumerator current=null] : ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) ;
    public final Enumerator ruleOuverture() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGAME.g:1786:2: ( ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) )
            // InternalGAME.g:1787:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            {
            // InternalGAME.g:1787:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            else if ( (LA44_0==51) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGAME.g:1788:3: (enumLiteral_0= 'ouvert' )
                    {
                    // InternalGAME.g:1788:3: (enumLiteral_0= 'ouvert' )
                    // InternalGAME.g:1789:4: enumLiteral_0= 'ouvert'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:1796:3: (enumLiteral_1= 'ferme' )
                    {
                    // InternalGAME.g:1796:3: (enumLiteral_1= 'ferme' )
                    // InternalGAME.g:1797:4: enumLiteral_1= 'ferme'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getOuvertureAccess().getFermeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOuvertureAccess().getFermeEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOuverture"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000A1010118010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000A1010118000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000021010118000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000021000118000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000118000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000118000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000C000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001408000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080808000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000008E008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000008C008010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000088008010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080008010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000900008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000900008010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800008010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0003000040000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000C00940008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000C00900008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000C00800008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000C00000008000L});

}