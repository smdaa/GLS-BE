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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'{'", "'pointDepart'", "'pointFin'", "'}'", "'chemin'", "'de'", "'vers'", "'si'", "'personne'", "'interaction'", "'choix'", "'action'", "'echange'", "'objetsDonne'", "'objetsPris'", "'connaissancesDonne'", "'objet'", "'taille'", "'quantite'", "'description'", "'condition'", "'objets'", "'necessaires'", "'manquants'", "'connaissances'", "'connaissance'", "'explorateur'", "'inventaireO'", "'inventaireC'", "'localisation'", "'lieu'", "'trouvables'", "'trouvable'", "'personnes'", "'cheminspossible'", "'visible'", "'invisible'", "'ouvert'", "'ferme'"
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
    // InternalGAME.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_Connaissances_10_0= ruleConnaissance ) )* ( (lv_personnes_11_0= rulePersonne ) )* ( (lv_chemins_12_0= ruleChemin ) )* otherlv_13= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_explorateur_3_0 = null;

        EObject lv_lieux_8_0 = null;

        EObject lv_Objets_9_0 = null;

        EObject lv_Connaissances_10_0 = null;

        EObject lv_personnes_11_0 = null;

        EObject lv_chemins_12_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:78:2: ( (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_Connaissances_10_0= ruleConnaissance ) )* ( (lv_personnes_11_0= rulePersonne ) )* ( (lv_chemins_12_0= ruleChemin ) )* otherlv_13= '}' ) )
            // InternalGAME.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_Connaissances_10_0= ruleConnaissance ) )* ( (lv_personnes_11_0= rulePersonne ) )* ( (lv_chemins_12_0= ruleChemin ) )* otherlv_13= '}' )
            {
            // InternalGAME.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_Connaissances_10_0= ruleConnaissance ) )* ( (lv_personnes_11_0= rulePersonne ) )* ( (lv_chemins_12_0= ruleChemin ) )* otherlv_13= '}' )
            // InternalGAME.g:80:3: otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_explorateur_3_0= ruleExplorateur ) ) otherlv_4= 'pointDepart' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'pointFin' ( (otherlv_7= RULE_ID ) )+ ( (lv_lieux_8_0= ruleLieu ) )* ( (lv_Objets_9_0= ruleObjet ) )* ( (lv_Connaissances_10_0= ruleConnaissance ) )* ( (lv_personnes_11_0= rulePersonne ) )* ( (lv_chemins_12_0= ruleChemin ) )* otherlv_13= '}'
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

                if ( (LA2_0==42) ) {
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

            // InternalGAME.g:197:3: ( (lv_Connaissances_10_0= ruleConnaissance ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGAME.g:198:4: (lv_Connaissances_10_0= ruleConnaissance )
            	    {
            	    // InternalGAME.g:198:4: (lv_Connaissances_10_0= ruleConnaissance )
            	    // InternalGAME.g:199:5: lv_Connaissances_10_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getConnaissancesConnaissanceParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_Connaissances_10_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Connaissances",
            	    						lv_Connaissances_10_0,
            	    						"fr.enseeiht.GAME.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGAME.g:216:3: ( (lv_personnes_11_0= rulePersonne ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGAME.g:217:4: (lv_personnes_11_0= rulePersonne )
            	    {
            	    // InternalGAME.g:217:4: (lv_personnes_11_0= rulePersonne )
            	    // InternalGAME.g:218:5: lv_personnes_11_0= rulePersonne
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getPersonnesPersonneParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_personnes_11_0=rulePersonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"personnes",
            	    						lv_personnes_11_0,
            	    						"fr.enseeiht.GAME.Personne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGAME.g:235:3: ( (lv_chemins_12_0= ruleChemin ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGAME.g:236:4: (lv_chemins_12_0= ruleChemin )
            	    {
            	    // InternalGAME.g:236:4: (lv_chemins_12_0= ruleChemin )
            	    // InternalGAME.g:237:5: lv_chemins_12_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getCheminsCheminParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_chemins_12_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chemins",
            	    						lv_chemins_12_0,
            	    						"fr.enseeiht.GAME.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalGAME.g:262:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalGAME.g:262:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalGAME.g:263:2: iv_ruleChemin= ruleChemin EOF
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
    // InternalGAME.g:269:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' ) ;
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
            // InternalGAME.g:275:2: ( (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' ) )
            // InternalGAME.g:276:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' )
            {
            // InternalGAME.g:276:2: (otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}' )
            // InternalGAME.g:277:3: otherlv_0= 'chemin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'de' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'vers' ( (otherlv_7= RULE_ID ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? ( (lv_ouverture_11_0= ruleOuverture ) ) (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            // InternalGAME.g:281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:282:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:283:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:303:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGAME.g:304:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:304:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:305:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getCheminAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
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
            		
            // InternalGAME.g:326:3: ( (otherlv_5= RULE_ID ) )
            // InternalGAME.g:327:4: (otherlv_5= RULE_ID )
            {
            // InternalGAME.g:327:4: (otherlv_5= RULE_ID )
            // InternalGAME.g:328:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getCheminAccess().getDepartLieuCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getVersKeyword_6());
            		
            // InternalGAME.g:343:3: ( (otherlv_7= RULE_ID ) )
            // InternalGAME.g:344:4: (otherlv_7= RULE_ID )
            {
            // InternalGAME.g:344:4: (otherlv_7= RULE_ID )
            // InternalGAME.g:345:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getArriveLieuCrossReference_7_0());
            				

            }


            }

            // InternalGAME.g:356:3: ( (lv_visibilite_8_0= ruleVisibilite ) )
            // InternalGAME.g:357:4: (lv_visibilite_8_0= ruleVisibilite )
            {
            // InternalGAME.g:357:4: (lv_visibilite_8_0= ruleVisibilite )
            // InternalGAME.g:358:5: lv_visibilite_8_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getVisibiliteVisibiliteEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalGAME.g:375:3: (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGAME.g:376:4: otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getSiKeyword_9_0());
                    			
                    // InternalGAME.g:380:4: ( (lv_conditionsVisibilite_10_0= ruleCondition ) )
                    // InternalGAME.g:381:5: (lv_conditionsVisibilite_10_0= ruleCondition )
                    {
                    // InternalGAME.g:381:5: (lv_conditionsVisibilite_10_0= ruleCondition )
                    // InternalGAME.g:382:6: lv_conditionsVisibilite_10_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getConditionsVisibiliteConditionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalGAME.g:400:3: ( (lv_ouverture_11_0= ruleOuverture ) )
            // InternalGAME.g:401:4: (lv_ouverture_11_0= ruleOuverture )
            {
            // InternalGAME.g:401:4: (lv_ouverture_11_0= ruleOuverture )
            // InternalGAME.g:402:5: lv_ouverture_11_0= ruleOuverture
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getOuvertureOuvertureEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalGAME.g:419:3: (otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGAME.g:420:4: otherlv_12= 'si' ( (lv_conditionsOuverture_13_0= ruleCondition ) )
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getCheminAccess().getSiKeyword_11_0());
                    			
                    // InternalGAME.g:424:4: ( (lv_conditionsOuverture_13_0= ruleCondition ) )
                    // InternalGAME.g:425:5: (lv_conditionsOuverture_13_0= ruleCondition )
                    {
                    // InternalGAME.g:425:5: (lv_conditionsOuverture_13_0= ruleCondition )
                    // InternalGAME.g:426:6: lv_conditionsOuverture_13_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getCheminAccess().getConditionsOuvertureConditionParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_21);
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
    // InternalGAME.g:452:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalGAME.g:452:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalGAME.g:453:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalGAME.g:459:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' ) ;
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
            // InternalGAME.g:465:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' ) )
            // InternalGAME.g:466:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' )
            {
            // InternalGAME.g:466:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}' )
            // InternalGAME.g:467:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_interaction_4_0= ruleInteraction ) ) ( (lv_visibilite_5_0= ruleVisibilite ) ) (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalGAME.g:471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:472:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:473:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:493:3: ( (lv_descriptions_3_0= ruleDescription ) )
            // InternalGAME.g:494:4: (lv_descriptions_3_0= ruleDescription )
            {
            // InternalGAME.g:494:4: (lv_descriptions_3_0= ruleDescription )
            // InternalGAME.g:495:5: lv_descriptions_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalGAME.g:512:3: ( (lv_interaction_4_0= ruleInteraction ) )
            // InternalGAME.g:513:4: (lv_interaction_4_0= ruleInteraction )
            {
            // InternalGAME.g:513:4: (lv_interaction_4_0= ruleInteraction )
            // InternalGAME.g:514:5: lv_interaction_4_0= ruleInteraction
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalGAME.g:531:3: ( (lv_visibilite_5_0= ruleVisibilite ) )
            // InternalGAME.g:532:4: (lv_visibilite_5_0= ruleVisibilite )
            {
            // InternalGAME.g:532:4: (lv_visibilite_5_0= ruleVisibilite )
            // InternalGAME.g:533:5: lv_visibilite_5_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalGAME.g:550:3: (otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGAME.g:551:4: otherlv_6= 'si' ( (lv_conditionsVisibilite_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonneAccess().getSiKeyword_6_0());
                    			
                    // InternalGAME.g:555:4: ( (lv_conditionsVisibilite_7_0= ruleCondition ) )
                    // InternalGAME.g:556:5: (lv_conditionsVisibilite_7_0= ruleCondition )
                    {
                    // InternalGAME.g:556:5: (lv_conditionsVisibilite_7_0= ruleCondition )
                    // InternalGAME.g:557:6: lv_conditionsVisibilite_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
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
    // InternalGAME.g:583:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalGAME.g:583:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalGAME.g:584:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalGAME.g:590:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_echanges_2_0 = null;

        EObject lv_choix_3_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:596:2: ( (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' ) )
            // InternalGAME.g:597:2: (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' )
            {
            // InternalGAME.g:597:2: (otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}' )
            // InternalGAME.g:598:3: otherlv_0= 'interaction' otherlv_1= '{' ( (lv_echanges_2_0= ruleEchange ) )* ( (lv_choix_3_0= ruleChoix ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGAME.g:606:3: ( (lv_echanges_2_0= ruleEchange ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGAME.g:607:4: (lv_echanges_2_0= ruleEchange )
            	    {
            	    // InternalGAME.g:607:4: (lv_echanges_2_0= ruleEchange )
            	    // InternalGAME.g:608:5: lv_echanges_2_0= ruleEchange
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getEchangesEchangeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop11;
                }
            } while (true);

            // InternalGAME.g:625:3: ( (lv_choix_3_0= ruleChoix ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGAME.g:626:4: (lv_choix_3_0= ruleChoix )
            	    {
            	    // InternalGAME.g:626:4: (lv_choix_3_0= ruleChoix )
            	    // InternalGAME.g:627:5: lv_choix_3_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalGAME.g:652:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalGAME.g:652:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalGAME.g:653:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalGAME.g:659:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) ;
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
            // InternalGAME.g:665:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) )
            // InternalGAME.g:666:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            {
            // InternalGAME.g:666:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            // InternalGAME.g:667:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actions_3_0= ruleAction ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalGAME.g:671:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:672:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:672:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:673:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:693:3: ( (lv_actions_3_0= ruleAction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGAME.g:694:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalGAME.g:694:4: (lv_actions_3_0= ruleAction )
            	    // InternalGAME.g:695:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop13;
                }
            } while (true);

            // InternalGAME.g:712:3: ( (lv_conditions_4_0= ruleCondition ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGAME.g:713:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalGAME.g:713:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalGAME.g:714:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop14;
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
    // InternalGAME.g:739:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGAME.g:739:47: (iv_ruleAction= ruleAction EOF )
            // InternalGAME.g:740:2: iv_ruleAction= ruleAction EOF
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
    // InternalGAME.g:746:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' ) ;
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
            // InternalGAME.g:752:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' ) )
            // InternalGAME.g:753:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' )
            {
            // InternalGAME.g:753:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}' )
            // InternalGAME.g:754:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) ) ( (lv_conditions_4_0= ruleCondition ) )* ( (lv_echanges_5_0= ruleEchange ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalGAME.g:758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:759:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:760:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:780:3: ( (lv_descriptions_3_0= ruleDescription ) )
            // InternalGAME.g:781:4: (lv_descriptions_3_0= ruleDescription )
            {
            // InternalGAME.g:781:4: (lv_descriptions_3_0= ruleDescription )
            // InternalGAME.g:782:5: lv_descriptions_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getActionAccess().getDescriptionsDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalGAME.g:799:3: ( (lv_conditions_4_0= ruleCondition ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGAME.g:800:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalGAME.g:800:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalGAME.g:801:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop15;
                }
            } while (true);

            // InternalGAME.g:818:3: ( (lv_echanges_5_0= ruleEchange ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGAME.g:819:4: (lv_echanges_5_0= ruleEchange )
            	    {
            	    // InternalGAME.g:819:4: (lv_echanges_5_0= ruleEchange )
            	    // InternalGAME.g:820:5: lv_echanges_5_0= ruleEchange
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getEchangesEchangeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalGAME.g:845:1: entryRuleEchange returns [EObject current=null] : iv_ruleEchange= ruleEchange EOF ;
    public final EObject entryRuleEchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEchange = null;


        try {
            // InternalGAME.g:845:48: (iv_ruleEchange= ruleEchange EOF )
            // InternalGAME.g:846:2: iv_ruleEchange= ruleEchange EOF
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
    // InternalGAME.g:852:1: ruleEchange returns [EObject current=null] : ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' ) ;
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
            // InternalGAME.g:858:2: ( ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' ) )
            // InternalGAME.g:859:2: ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' )
            {
            // InternalGAME.g:859:2: ( () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}' )
            // InternalGAME.g:860:3: () otherlv_1= 'echange' otherlv_2= '{' (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )? (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )? (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )? ( (lv_conditions_9_0= ruleCondition ) )* otherlv_10= '}'
            {
            // InternalGAME.g:860:3: ()
            // InternalGAME.g:861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEchangeAccess().getEchangeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEchangeAccess().getEchangeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getEchangeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:875:3: (otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGAME.g:876:4: otherlv_3= 'objetsDonne' ( (otherlv_4= RULE_ID ) )+
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEchangeAccess().getObjetsDonneKeyword_3_0());
                    			
                    // InternalGAME.g:880:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGAME.g:881:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalGAME.g:881:5: (otherlv_4= RULE_ID )
                    	    // InternalGAME.g:882:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEchangeRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getEchangeAccess().getObjetsDonneObjetCrossReference_3_1_0());
                    	    					

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


                    }
                    break;

            }

            // InternalGAME.g:894:3: (otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+ )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGAME.g:895:4: otherlv_5= 'objetsPris' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEchangeAccess().getObjetsPrisKeyword_4_0());
                    			
                    // InternalGAME.g:899:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGAME.g:900:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalGAME.g:900:5: (otherlv_6= RULE_ID )
                    	    // InternalGAME.g:901:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEchangeRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getEchangeAccess().getObjetsPrisObjetCrossReference_4_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:913:3: (otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+ )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGAME.g:914:4: otherlv_7= 'connaissancesDonne' ( (otherlv_8= RULE_ID ) )+
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getEchangeAccess().getConnaissancesDonneKeyword_5_0());
                    			
                    // InternalGAME.g:918:4: ( (otherlv_8= RULE_ID ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGAME.g:919:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalGAME.g:919:5: (otherlv_8= RULE_ID )
                    	    // InternalGAME.g:920:6: otherlv_8= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEchangeRule());
                    	    						}
                    	    					
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_33); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getEchangeAccess().getConnaissancesConnaissanceCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:932:3: ( (lv_conditions_9_0= ruleCondition ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGAME.g:933:4: (lv_conditions_9_0= ruleCondition )
            	    {
            	    // InternalGAME.g:933:4: (lv_conditions_9_0= ruleCondition )
            	    // InternalGAME.g:934:5: lv_conditions_9_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getEchangeAccess().getConditionsConditionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop23;
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
    // InternalGAME.g:959:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalGAME.g:959:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalGAME.g:960:2: iv_ruleObjet= ruleObjet EOF
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
    // InternalGAME.g:966:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= 'quantite' ( (lv_quantite_7_0= RULE_INT ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_taille_5_0=null;
        Token otherlv_6=null;
        Token lv_quantite_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_descriptions_3_0 = null;

        Enumerator lv_visibilite_8_0 = null;

        EObject lv_conditionsVisibilite_10_0 = null;



        	enterRule();

        try {
            // InternalGAME.g:972:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= 'quantite' ( (lv_quantite_7_0= RULE_INT ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? otherlv_11= '}' ) )
            // InternalGAME.g:973:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= 'quantite' ( (lv_quantite_7_0= RULE_INT ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? otherlv_11= '}' )
            {
            // InternalGAME.g:973:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= 'quantite' ( (lv_quantite_7_0= RULE_INT ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? otherlv_11= '}' )
            // InternalGAME.g:974:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? otherlv_4= 'taille' ( (lv_taille_5_0= RULE_INT ) ) otherlv_6= 'quantite' ( (lv_quantite_7_0= RULE_INT ) ) ( (lv_visibilite_8_0= ruleVisibilite ) ) (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalGAME.g:978:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:979:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:979:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:980:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1000:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGAME.g:1001:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:1001:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:1002:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getObjetAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_35);
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

            otherlv_4=(Token)match(input,29,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getTailleKeyword_4());
            		
            // InternalGAME.g:1023:3: ( (lv_taille_5_0= RULE_INT ) )
            // InternalGAME.g:1024:4: (lv_taille_5_0= RULE_INT )
            {
            // InternalGAME.g:1024:4: (lv_taille_5_0= RULE_INT )
            // InternalGAME.g:1025:5: lv_taille_5_0= RULE_INT
            {
            lv_taille_5_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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

            otherlv_6=(Token)match(input,30,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getObjetAccess().getQuantiteKeyword_6());
            		
            // InternalGAME.g:1045:3: ( (lv_quantite_7_0= RULE_INT ) )
            // InternalGAME.g:1046:4: (lv_quantite_7_0= RULE_INT )
            {
            // InternalGAME.g:1046:4: (lv_quantite_7_0= RULE_INT )
            // InternalGAME.g:1047:5: lv_quantite_7_0= RULE_INT
            {
            lv_quantite_7_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_quantite_7_0, grammarAccess.getObjetAccess().getQuantiteINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantite",
            						lv_quantite_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGAME.g:1063:3: ( (lv_visibilite_8_0= ruleVisibilite ) )
            // InternalGAME.g:1064:4: (lv_visibilite_8_0= ruleVisibilite )
            {
            // InternalGAME.g:1064:4: (lv_visibilite_8_0= ruleVisibilite )
            // InternalGAME.g:1065:5: lv_visibilite_8_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getVisibiliteVisibiliteEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_visibilite_8_0=ruleVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"visibilite",
            						lv_visibilite_8_0,
            						"fr.enseeiht.GAME.Visibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGAME.g:1082:3: (otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGAME.g:1083:4: otherlv_9= 'si' ( (lv_conditionsVisibilite_10_0= ruleCondition ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjetAccess().getSiKeyword_9_0());
                    			
                    // InternalGAME.g:1087:4: ( (lv_conditionsVisibilite_10_0= ruleCondition ) )
                    // InternalGAME.g:1088:5: (lv_conditionsVisibilite_10_0= ruleCondition )
                    {
                    // InternalGAME.g:1088:5: (lv_conditionsVisibilite_10_0= ruleCondition )
                    // InternalGAME.g:1089:6: lv_conditionsVisibilite_10_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getObjetAccess().getConditionsVisibiliteConditionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_conditionsVisibilite_10_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjetRule());
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

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getObjetAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalGAME.g:1115:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalGAME.g:1115:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalGAME.g:1116:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalGAME.g:1122:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGAME.g:1128:2: ( (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalGAME.g:1129:2: (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalGAME.g:1129:2: (otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalGAME.g:1130:3: otherlv_0= 'description' otherlv_1= '{' ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGAME.g:1138:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalGAME.g:1139:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalGAME.g:1139:4: (lv_text_2_0= RULE_STRING )
            // InternalGAME.g:1140:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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
    // InternalGAME.g:1164:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGAME.g:1164:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGAME.g:1165:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGAME.g:1171:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' ) ;
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
            // InternalGAME.g:1177:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' ) )
            // InternalGAME.g:1178:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' )
            {
            // InternalGAME.g:1178:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}' )
            // InternalGAME.g:1179:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )? (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )? (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalGAME.g:1183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1184:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1185:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGAME.g:1205:3: (otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==34) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalGAME.g:1206:4: otherlv_3= 'objets' otherlv_4= 'necessaires' ( (otherlv_5= RULE_ID ) )*
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getObjetsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,34,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getNecessairesKeyword_3_1());
                    			
                    // InternalGAME.g:1214:4: ( (otherlv_5= RULE_ID ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGAME.g:1215:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1215:5: (otherlv_5= RULE_ID )
                    	    // InternalGAME.g:1216:6: otherlv_5= RULE_ID
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:1228:3: (otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGAME.g:1229:4: otherlv_6= 'objets' otherlv_7= 'manquants' ( (otherlv_8= RULE_ID ) )*
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_42); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getObjetsKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getManquantsKeyword_4_1());
                    			
                    // InternalGAME.g:1237:4: ( (otherlv_8= RULE_ID ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalGAME.g:1238:5: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1238:5: (otherlv_8= RULE_ID )
                    	    // InternalGAME.g:1239:6: otherlv_8= RULE_ID
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalGAME.g:1251:3: (otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGAME.g:1252:4: otherlv_9= 'connaissances' otherlv_10= 'necessaires' ( (otherlv_11= RULE_ID ) )*
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getConnaissancesKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,34,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getNecessairesKeyword_5_1());
                    			
                    // InternalGAME.g:1260:4: ( (otherlv_11= RULE_ID ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGAME.g:1261:5: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1261:5: (otherlv_11= RULE_ID )
                    	    // InternalGAME.g:1262:6: otherlv_11= RULE_ID
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
                    	    break loop30;
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
    // InternalGAME.g:1282:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalGAME.g:1282:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalGAME.g:1283:2: iv_ruleConnaissance= ruleConnaissance EOF
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
    // InternalGAME.g:1289:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' ) ;
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
            // InternalGAME.g:1295:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' ) )
            // InternalGAME.g:1296:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            {
            // InternalGAME.g:1296:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}' )
            // InternalGAME.g:1297:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_visibilite_4_0= ruleVisibilite ) ) (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalGAME.g:1301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1302:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1303:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGAME.g:1323:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGAME.g:1324:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:1324:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:1325:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getConnaissanceAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalGAME.g:1342:3: ( (lv_visibilite_4_0= ruleVisibilite ) )
            // InternalGAME.g:1343:4: (lv_visibilite_4_0= ruleVisibilite )
            {
            // InternalGAME.g:1343:4: (lv_visibilite_4_0= ruleVisibilite )
            // InternalGAME.g:1344:5: lv_visibilite_4_0= ruleVisibilite
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getVisibiliteVisibiliteEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalGAME.g:1361:3: (otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGAME.g:1362:4: otherlv_5= 'si' ( (lv_conditionsVisibilite_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnaissanceAccess().getSiKeyword_5_0());
                    			
                    // InternalGAME.g:1366:4: ( (lv_conditionsVisibilite_6_0= ruleCondition ) )
                    // InternalGAME.g:1367:5: (lv_conditionsVisibilite_6_0= ruleCondition )
                    {
                    // InternalGAME.g:1367:5: (lv_conditionsVisibilite_6_0= ruleCondition )
                    // InternalGAME.g:1368:6: lv_conditionsVisibilite_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConnaissanceAccess().getConditionsVisibiliteConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
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
    // InternalGAME.g:1394:1: entryRuleExplorateur returns [EObject current=null] : iv_ruleExplorateur= ruleExplorateur EOF ;
    public final EObject entryRuleExplorateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplorateur = null;


        try {
            // InternalGAME.g:1394:52: (iv_ruleExplorateur= ruleExplorateur EOF )
            // InternalGAME.g:1395:2: iv_ruleExplorateur= ruleExplorateur EOF
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
    // InternalGAME.g:1401:1: ruleExplorateur returns [EObject current=null] : (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) ;
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
            // InternalGAME.g:1407:2: ( (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' ) )
            // InternalGAME.g:1408:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            {
            // InternalGAME.g:1408:2: (otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}' )
            // InternalGAME.g:1409:3: otherlv_0= 'explorateur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) otherlv_5= 'inventaireO' ( (otherlv_6= RULE_ID ) )* otherlv_7= 'inventaireC' ( (otherlv_8= RULE_ID ) )* otherlv_9= 'localisation' ( (otherlv_10= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplorateurAccess().getExplorateurKeyword_0());
            		
            // InternalGAME.g:1413:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1414:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1414:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1415:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getExplorateurAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getExplorateurAccess().getTailleKeyword_3());
            		
            // InternalGAME.g:1439:3: ( (lv_taille_4_0= RULE_INT ) )
            // InternalGAME.g:1440:4: (lv_taille_4_0= RULE_INT )
            {
            // InternalGAME.g:1440:4: (lv_taille_4_0= RULE_INT )
            // InternalGAME.g:1441:5: lv_taille_4_0= RULE_INT
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

            otherlv_5=(Token)match(input,39,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getExplorateurAccess().getInventaireOKeyword_5());
            		
            // InternalGAME.g:1461:3: ( (otherlv_6= RULE_ID ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGAME.g:1462:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGAME.g:1462:4: (otherlv_6= RULE_ID )
            	    // InternalGAME.g:1463:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getExplorateurRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    					newLeafNode(otherlv_6, grammarAccess.getExplorateurAccess().getObjetsObjetCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_7=(Token)match(input,40,FOLLOW_48); 

            			newLeafNode(otherlv_7, grammarAccess.getExplorateurAccess().getInventaireCKeyword_7());
            		
            // InternalGAME.g:1478:3: ( (otherlv_8= RULE_ID ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGAME.g:1479:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalGAME.g:1479:4: (otherlv_8= RULE_ID )
            	    // InternalGAME.g:1480:5: otherlv_8= RULE_ID
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
            	    break loop35;
                }
            } while (true);

            otherlv_9=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getExplorateurAccess().getLocalisationKeyword_9());
            		
            // InternalGAME.g:1495:3: ( (otherlv_10= RULE_ID ) )
            // InternalGAME.g:1496:4: (otherlv_10= RULE_ID )
            {
            // InternalGAME.g:1496:4: (otherlv_10= RULE_ID )
            // InternalGAME.g:1497:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplorateurRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_21); 

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


    // $ANTLR start "entryRuleLieu"
    // InternalGAME.g:1516:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalGAME.g:1516:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalGAME.g:1517:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalGAME.g:1523:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' ) ;
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
            // InternalGAME.g:1529:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' ) )
            // InternalGAME.g:1530:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' )
            {
            // InternalGAME.g:1530:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}' )
            // InternalGAME.g:1531:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_descriptions_3_0= ruleDescription ) )? (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )* (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalGAME.g:1535:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGAME.g:1536:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGAME.g:1536:4: (lv_name_1_0= RULE_ID )
            // InternalGAME.g:1537:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGAME.g:1557:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGAME.g:1558:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalGAME.g:1558:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalGAME.g:1559:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getLieuAccess().getDescriptionsDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_50);
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

            // InternalGAME.g:1576:3: (otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGAME.g:1577:4: otherlv_4= 'objets' otherlv_5= 'trouvables' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_51); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getObjetsKeyword_4_0());
            	    			
            	    otherlv_5=(Token)match(input,43,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLieuAccess().getTrouvablesKeyword_4_1());
            	    			
            	    // InternalGAME.g:1585:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalGAME.g:1586:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGAME.g:1586:5: (otherlv_6= RULE_ID )
            	    // InternalGAME.g:1587:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    						newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getObjetsObjetCrossReference_4_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalGAME.g:1599:3: (otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==36) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGAME.g:1600:4: otherlv_7= 'connaissances' otherlv_8= 'trouvable' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,36,FOLLOW_52); 

            	    				newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getConnaissancesKeyword_5_0());
            	    			
            	    otherlv_8=(Token)match(input,44,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getLieuAccess().getTrouvableKeyword_5_1());
            	    			
            	    // InternalGAME.g:1608:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalGAME.g:1609:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGAME.g:1609:5: (otherlv_9= RULE_ID )
            	    // InternalGAME.g:1610:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    						newLeafNode(otherlv_9, grammarAccess.getLieuAccess().getConnaissancesConnaissanceCrossReference_5_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalGAME.g:1622:3: (otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==45) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGAME.g:1623:4: otherlv_10= 'personnes' otherlv_11= 'trouvable' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,45,FOLLOW_52); 

            	    				newLeafNode(otherlv_10, grammarAccess.getLieuAccess().getPersonnesKeyword_6_0());
            	    			
            	    otherlv_11=(Token)match(input,44,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getLieuAccess().getTrouvableKeyword_6_1());
            	    			
            	    // InternalGAME.g:1631:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalGAME.g:1632:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalGAME.g:1632:5: (otherlv_12= RULE_ID )
            	    // InternalGAME.g:1633:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLieuRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_54); 

            	    						newLeafNode(otherlv_12, grammarAccess.getLieuAccess().getPersonnesPersonneCrossReference_6_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalGAME.g:1645:3: (otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+ )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGAME.g:1646:4: otherlv_13= 'cheminspossible' ( (otherlv_14= RULE_ID ) )+
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getLieuAccess().getCheminspossibleKeyword_7_0());
                    			
                    // InternalGAME.g:1650:4: ( (otherlv_14= RULE_ID ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_ID) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalGAME.g:1651:5: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalGAME.g:1651:5: (otherlv_14= RULE_ID )
                    	    // InternalGAME.g:1652:6: otherlv_14= RULE_ID
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
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
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
    // InternalGAME.g:1672:1: ruleVisibilite returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) ;
    public final Enumerator ruleVisibilite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGAME.g:1678:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) ) )
            // InternalGAME.g:1679:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            {
            // InternalGAME.g:1679:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'invisible' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            else if ( (LA42_0==48) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGAME.g:1680:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalGAME.g:1680:3: (enumLiteral_0= 'visible' )
                    // InternalGAME.g:1681:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibiliteAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:1688:3: (enumLiteral_1= 'invisible' )
                    {
                    // InternalGAME.g:1688:3: (enumLiteral_1= 'invisible' )
                    // InternalGAME.g:1689:4: enumLiteral_1= 'invisible'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalGAME.g:1699:1: ruleOuverture returns [Enumerator current=null] : ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) ;
    public final Enumerator ruleOuverture() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGAME.g:1705:2: ( ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) )
            // InternalGAME.g:1706:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            {
            // InternalGAME.g:1706:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            else if ( (LA43_0==50) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalGAME.g:1707:3: (enumLiteral_0= 'ouvert' )
                    {
                    // InternalGAME.g:1707:3: (enumLiteral_0= 'ouvert' )
                    // InternalGAME.g:1708:4: enumLiteral_0= 'ouvert'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOuvertureAccess().getOuvertEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGAME.g:1715:3: (enumLiteral_1= 'ferme' )
                    {
                    // InternalGAME.g:1715:3: (enumLiteral_1= 'ferme' )
                    // InternalGAME.g:1716:4: enumLiteral_1= 'ferme'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000042010118010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000042010118000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002010118000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000118000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000118000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0006000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001408000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100808000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000010E008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000010C008010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000108008010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100008010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001200008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001200008010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000008010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001800080000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000601280008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000601200008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000601000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000600000008000L});

}