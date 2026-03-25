package it.lorenzodeluca.dart.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.lorenzodeluca.dart.services.DartGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDartParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SCRIPT_TAG", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'late'", "'var'", "'final'", "'const'", "','", "'='", "'external'", "';'", "'('", "')'", "'covariant'", "'['", "']'", "'{'", "'}'", "'required'", "':'", "'async'", "'sync'", "'*'", "'=>'", "'abstract'", "'class'", "'extends'", "'with'", "'implements'", "'static'", "'operator'", "'get'", "'set'", "'~'", "'=='", "'[]'", "'[]='", "'/'", "'%'", "'~/'", "'+'", "'-'", "'<<'", "'>>>'", "'>>'", "'&'", "'^'", "'|'", "'>='", "'>'", "'<='", "'<'", "'mixin'", "'on'", "'extension'", "'enum'", "'@'", "'.'", "'*='", "'/='", "'~/='", "'%='", "'+='", "'-='", "'<<='", "'>>>='", "'>>='", "'&='", "'^='", "'|='", "'??='", "'?'", "'??'", "'||'", "'&&'", "'!='", "'as'", "'is'", "'!'", "'++'", "'--'", "'await'", "'this'", "'super'", "'null'", "'true'", "'false'", "'new'", "'if'", "'else'", "'for'", "'while'", "'do'", "'switch'", "'case'", "'default'", "'rethrow'", "'try'", "'catch'", "'finally'", "'break'", "'continue'", "'return'", "'yield'", "'import'", "'deferred'", "'export'", "'show'", "'hide'", "'part'", "'library'", "'of'", "'typedef'", "'void'", "'dynamic'", "'Function'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_SCRIPT_TAG=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalDartParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDartParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[411+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalDartParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDart.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private DartGrammarAccess grammarAccess;

        public InternalDartParser(TokenStream input, DartGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DartFile";
       	}

       	@Override
       	protected DartGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDartFile"
    // InternalDart.g:71:1: entryRuleDartFile returns [EObject current=null] : iv_ruleDartFile= ruleDartFile EOF ;
    public final EObject entryRuleDartFile() throws RecognitionException {
        EObject current = null;
        int entryRuleDartFile_StartIndex = input.index();
        EObject iv_ruleDartFile = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // InternalDart.g:71:49: (iv_ruleDartFile= ruleDartFile EOF )
            // InternalDart.g:72:2: iv_ruleDartFile= ruleDartFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDartFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDartFile=ruleDartFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDartFile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleDartFile_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDartFile"


    // $ANTLR start "ruleDartFile"
    // InternalDart.g:78:1: ruleDartFile returns [EObject current=null] : (this_LibraryDeclaration_0= ruleLibraryDeclaration | this_PartDeclaration_1= rulePartDeclaration ) ;
    public final EObject ruleDartFile() throws RecognitionException {
        EObject current = null;
        int ruleDartFile_StartIndex = input.index();
        EObject this_LibraryDeclaration_0 = null;

        EObject this_PartDeclaration_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // InternalDart.g:84:2: ( (this_LibraryDeclaration_0= ruleLibraryDeclaration | this_PartDeclaration_1= rulePartDeclaration ) )
            // InternalDart.g:85:2: (this_LibraryDeclaration_0= ruleLibraryDeclaration | this_PartDeclaration_1= rulePartDeclaration )
            {
            // InternalDart.g:85:2: (this_LibraryDeclaration_0= ruleLibraryDeclaration | this_PartDeclaration_1= rulePartDeclaration )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EOF||LA1_0==RULE_ID||LA1_0==RULE_SCRIPT_TAG||(LA1_0>=12 && LA1_0<=15)||LA1_0==18||(LA1_0>=33 && LA1_0<=34)||LA1_0==61||(LA1_0>=63 && LA1_0<=65)||LA1_0==113||LA1_0==115||LA1_0==119||(LA1_0>=121 && LA1_0<=124)) ) {
                alt1=1;
            }
            else if ( (LA1_0==118) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_STRING) ) {
                    alt1=1;
                }
                else if ( (LA1_2==120) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDart.g:86:3: this_LibraryDeclaration_0= ruleLibraryDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDartFileAccess().getLibraryDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LibraryDeclaration_0=ruleLibraryDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LibraryDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:98:3: this_PartDeclaration_1= rulePartDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDartFileAccess().getPartDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartDeclaration_1=rulePartDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, ruleDartFile_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDartFile"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalDart.g:113:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleVariableDeclaration_StartIndex = input.index();
        EObject iv_ruleVariableDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // InternalDart.g:113:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalDart.g:114:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalDart.g:120:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_late_0_0= 'late' ) )? ( ( (lv_isVar_1_0= 'var' ) ) | ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? ) | ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? ) | ( (lv_type_6_0= ruleType ) ) ) ( (lv_variables_7_0= ruleInitializedIdentifier ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleInitializedIdentifier ) ) )* ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleVariableDeclaration_StartIndex = input.index();
        Token lv_late_0_0=null;
        Token lv_isVar_1_0=null;
        Token lv_isFinal_2_0=null;
        Token lv_isConst_4_0=null;
        Token otherlv_8=null;
        EObject lv_type_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_variables_9_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // InternalDart.g:126:2: ( ( ( (lv_late_0_0= 'late' ) )? ( ( (lv_isVar_1_0= 'var' ) ) | ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? ) | ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? ) | ( (lv_type_6_0= ruleType ) ) ) ( (lv_variables_7_0= ruleInitializedIdentifier ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleInitializedIdentifier ) ) )* ) )
            // InternalDart.g:127:2: ( ( (lv_late_0_0= 'late' ) )? ( ( (lv_isVar_1_0= 'var' ) ) | ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? ) | ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? ) | ( (lv_type_6_0= ruleType ) ) ) ( (lv_variables_7_0= ruleInitializedIdentifier ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleInitializedIdentifier ) ) )* )
            {
            // InternalDart.g:127:2: ( ( (lv_late_0_0= 'late' ) )? ( ( (lv_isVar_1_0= 'var' ) ) | ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? ) | ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? ) | ( (lv_type_6_0= ruleType ) ) ) ( (lv_variables_7_0= ruleInitializedIdentifier ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleInitializedIdentifier ) ) )* )
            // InternalDart.g:128:3: ( (lv_late_0_0= 'late' ) )? ( ( (lv_isVar_1_0= 'var' ) ) | ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? ) | ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? ) | ( (lv_type_6_0= ruleType ) ) ) ( (lv_variables_7_0= ruleInitializedIdentifier ) ) (otherlv_8= ',' ( (lv_variables_9_0= ruleInitializedIdentifier ) ) )*
            {
            // InternalDart.g:128:3: ( (lv_late_0_0= 'late' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDart.g:129:4: (lv_late_0_0= 'late' )
                    {
                    // InternalDart.g:129:4: (lv_late_0_0= 'late' )
                    // InternalDart.g:130:5: lv_late_0_0= 'late'
                    {
                    lv_late_0_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_late_0_0, grammarAccess.getVariableDeclarationAccess().getLateLateKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "late", lv_late_0_0 != null, "late");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:142:3: ( ( (lv_isVar_1_0= 'var' ) ) | ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? ) | ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? ) | ( (lv_type_6_0= ruleType ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
            case 122:
            case 123:
            case 124:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDart.g:143:4: ( (lv_isVar_1_0= 'var' ) )
                    {
                    // InternalDart.g:143:4: ( (lv_isVar_1_0= 'var' ) )
                    // InternalDart.g:144:5: (lv_isVar_1_0= 'var' )
                    {
                    // InternalDart.g:144:5: (lv_isVar_1_0= 'var' )
                    // InternalDart.g:145:6: lv_isVar_1_0= 'var'
                    {
                    lv_isVar_1_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isVar_1_0, grammarAccess.getVariableDeclarationAccess().getIsVarVarKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "isVar", lv_isVar_1_0 != null, "var");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:158:4: ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? )
                    {
                    // InternalDart.g:158:4: ( ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )? )
                    // InternalDart.g:159:5: ( (lv_isFinal_2_0= 'final' ) ) ( (lv_type_3_0= ruleType ) )?
                    {
                    // InternalDart.g:159:5: ( (lv_isFinal_2_0= 'final' ) )
                    // InternalDart.g:160:6: (lv_isFinal_2_0= 'final' )
                    {
                    // InternalDart.g:160:6: (lv_isFinal_2_0= 'final' )
                    // InternalDart.g:161:7: lv_isFinal_2_0= 'final'
                    {
                    lv_isFinal_2_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isFinal_2_0, grammarAccess.getVariableDeclarationAccess().getIsFinalFinalKeyword_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "isFinal", lv_isFinal_2_0 != null, "final");
                      						
                    }

                    }


                    }

                    // InternalDart.g:173:5: ( (lv_type_3_0= ruleType ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=122 && LA3_0<=124)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==RULE_ID) ) {
                        int LA3_2 = input.LA(2);

                        if ( (LA3_2==60||LA3_2==66||LA3_2==80) ) {
                            alt3=1;
                        }
                        else if ( (LA3_2==RULE_ID) ) {
                            int LA3_3 = input.LA(3);

                            if ( (synpred4_InternalDart()) ) {
                                alt3=1;
                            }
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalDart.g:174:6: (lv_type_3_0= ruleType )
                            {
                            // InternalDart.g:174:6: (lv_type_3_0= ruleType )
                            // InternalDart.g:175:7: lv_type_3_0= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_4);
                            lv_type_3_0=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_3_0,
                              								"it.lorenzodeluca.dart.Dart.Type");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDart.g:194:4: ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? )
                    {
                    // InternalDart.g:194:4: ( ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )? )
                    // InternalDart.g:195:5: ( (lv_isConst_4_0= 'const' ) ) ( (lv_type_5_0= ruleType ) )?
                    {
                    // InternalDart.g:195:5: ( (lv_isConst_4_0= 'const' ) )
                    // InternalDart.g:196:6: (lv_isConst_4_0= 'const' )
                    {
                    // InternalDart.g:196:6: (lv_isConst_4_0= 'const' )
                    // InternalDart.g:197:7: lv_isConst_4_0= 'const'
                    {
                    lv_isConst_4_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isConst_4_0, grammarAccess.getVariableDeclarationAccess().getIsConstConstKeyword_1_2_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "isConst", lv_isConst_4_0 != null, "const");
                      						
                    }

                    }


                    }

                    // InternalDart.g:209:5: ( (lv_type_5_0= ruleType ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=122 && LA4_0<=124)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_ID) ) {
                        int LA4_2 = input.LA(2);

                        if ( (LA4_2==60||LA4_2==66||LA4_2==80) ) {
                            alt4=1;
                        }
                        else if ( (LA4_2==RULE_ID) ) {
                            int LA4_3 = input.LA(3);

                            if ( (synpred6_InternalDart()) ) {
                                alt4=1;
                            }
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDart.g:210:6: (lv_type_5_0= ruleType )
                            {
                            // InternalDart.g:210:6: (lv_type_5_0= ruleType )
                            // InternalDart.g:211:7: lv_type_5_0= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_4);
                            lv_type_5_0=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_5_0,
                              								"it.lorenzodeluca.dart.Dart.Type");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDart.g:230:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalDart.g:230:4: ( (lv_type_6_0= ruleType ) )
                    // InternalDart.g:231:5: (lv_type_6_0= ruleType )
                    {
                    // InternalDart.g:231:5: (lv_type_6_0= ruleType )
                    // InternalDart.g:232:6: lv_type_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_type_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_6_0,
                      							"it.lorenzodeluca.dart.Dart.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDart.g:250:3: ( (lv_variables_7_0= ruleInitializedIdentifier ) )
            // InternalDart.g:251:4: (lv_variables_7_0= ruleInitializedIdentifier )
            {
            // InternalDart.g:251:4: (lv_variables_7_0= ruleInitializedIdentifier )
            // InternalDart.g:252:5: lv_variables_7_0= ruleInitializedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariablesInitializedIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_variables_7_0=ruleInitializedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					add(
              						current,
              						"variables",
              						lv_variables_7_0,
              						"it.lorenzodeluca.dart.Dart.InitializedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:269:3: (otherlv_8= ',' ( (lv_variables_9_0= ruleInitializedIdentifier ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDart.g:270:4: otherlv_8= ',' ( (lv_variables_9_0= ruleInitializedIdentifier ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalDart.g:274:4: ( (lv_variables_9_0= ruleInitializedIdentifier ) )
            	    // InternalDart.g:275:5: (lv_variables_9_0= ruleInitializedIdentifier )
            	    {
            	    // InternalDart.g:275:5: (lv_variables_9_0= ruleInitializedIdentifier )
            	    // InternalDart.g:276:6: lv_variables_9_0= ruleInitializedIdentifier
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariablesInitializedIdentifierParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_variables_9_0=ruleInitializedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variables",
            	      							lv_variables_9_0,
            	      							"it.lorenzodeluca.dart.Dart.InitializedIdentifier");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, ruleVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleInitializedIdentifier"
    // InternalDart.g:298:1: entryRuleInitializedIdentifier returns [EObject current=null] : iv_ruleInitializedIdentifier= ruleInitializedIdentifier EOF ;
    public final EObject entryRuleInitializedIdentifier() throws RecognitionException {
        EObject current = null;
        int entryRuleInitializedIdentifier_StartIndex = input.index();
        EObject iv_ruleInitializedIdentifier = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // InternalDart.g:298:62: (iv_ruleInitializedIdentifier= ruleInitializedIdentifier EOF )
            // InternalDart.g:299:2: iv_ruleInitializedIdentifier= ruleInitializedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializedIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitializedIdentifier=ruleInitializedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitializedIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleInitializedIdentifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializedIdentifier"


    // $ANTLR start "ruleInitializedIdentifier"
    // InternalDart.g:305:1: ruleInitializedIdentifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleInitializedIdentifier() throws RecognitionException {
        EObject current = null;
        int ruleInitializedIdentifier_StartIndex = input.index();
        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_initialValue_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // InternalDart.g:311:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? ) )
            // InternalDart.g:312:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? )
            {
            // InternalDart.g:312:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? )
            // InternalDart.g:313:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )?
            {
            // InternalDart.g:313:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDart.g:314:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDart.g:314:4: (lv_name_0_0= RULE_ID )
            // InternalDart.g:315:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getInitializedIdentifierAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInitializedIdentifierRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:331:3: (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDart.g:332:4: otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInitializedIdentifierAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalDart.g:336:4: ( (lv_initialValue_2_0= ruleExpression ) )
                    // InternalDart.g:337:5: (lv_initialValue_2_0= ruleExpression )
                    {
                    // InternalDart.g:337:5: (lv_initialValue_2_0= ruleExpression )
                    // InternalDart.g:338:6: lv_initialValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitializedIdentifierAccess().getInitialValueExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_initialValue_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInitializedIdentifierRule());
                      						}
                      						set(
                      							current,
                      							"initialValue",
                      							lv_initialValue_2_0,
                      							"it.lorenzodeluca.dart.Dart.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, ruleInitializedIdentifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInitializedIdentifier"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalDart.g:360:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionDeclaration_StartIndex = input.index();
        EObject iv_ruleFunctionDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // InternalDart.g:360:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalDart.g:361:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleFunctionDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalDart.g:367:1: ruleFunctionDeclaration returns [EObject current=null] : ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleFormalParameterPart ) ) ( ( (lv_body_4_0= ruleFunctionBody ) ) | otherlv_5= ';' ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleFunctionDeclaration_StartIndex = input.index();
        Token lv_isExternal_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        EObject lv_returnType_1_0 = null;

        EObject lv_signature_3_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // InternalDart.g:373:2: ( ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleFormalParameterPart ) ) ( ( (lv_body_4_0= ruleFunctionBody ) ) | otherlv_5= ';' ) ) )
            // InternalDart.g:374:2: ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleFormalParameterPart ) ) ( ( (lv_body_4_0= ruleFunctionBody ) ) | otherlv_5= ';' ) )
            {
            // InternalDart.g:374:2: ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleFormalParameterPart ) ) ( ( (lv_body_4_0= ruleFunctionBody ) ) | otherlv_5= ';' ) )
            // InternalDart.g:375:3: ( (lv_isExternal_0_0= 'external' ) )? ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_signature_3_0= ruleFormalParameterPart ) ) ( ( (lv_body_4_0= ruleFunctionBody ) ) | otherlv_5= ';' )
            {
            // InternalDart.g:375:3: ( (lv_isExternal_0_0= 'external' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDart.g:376:4: (lv_isExternal_0_0= 'external' )
                    {
                    // InternalDart.g:376:4: (lv_isExternal_0_0= 'external' )
                    // InternalDart.g:377:5: lv_isExternal_0_0= 'external'
                    {
                    lv_isExternal_0_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isExternal_0_0, grammarAccess.getFunctionDeclarationAccess().getIsExternalExternalKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "isExternal", lv_isExternal_0_0 != null, "external");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:389:3: ( (lv_returnType_1_0= ruleType ) )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalDart.g:390:4: (lv_returnType_1_0= ruleType )
                    {
                    // InternalDart.g:390:4: (lv_returnType_1_0= ruleType )
                    // InternalDart.g:391:5: lv_returnType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturnTypeTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    lv_returnType_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"returnType",
                      						lv_returnType_1_0,
                      						"it.lorenzodeluca.dart.Dart.Type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:408:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDart.g:409:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDart.g:409:4: (lv_name_2_0= RULE_ID )
            // InternalDart.g:410:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:426:3: ( (lv_signature_3_0= ruleFormalParameterPart ) )
            // InternalDart.g:427:4: (lv_signature_3_0= ruleFormalParameterPart )
            {
            // InternalDart.g:427:4: (lv_signature_3_0= ruleFormalParameterPart )
            // InternalDart.g:428:5: lv_signature_3_0= ruleFormalParameterPart
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getSignatureFormalParameterPartParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_signature_3_0=ruleFormalParameterPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              					}
              					set(
              						current,
              						"signature",
              						lv_signature_3_0,
              						"it.lorenzodeluca.dart.Dart.FormalParameterPart");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:445:3: ( ( (lv_body_4_0= ruleFunctionBody ) ) | otherlv_5= ';' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25||(LA10_0>=29 && LA10_0<=32)) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDart.g:446:4: ( (lv_body_4_0= ruleFunctionBody ) )
                    {
                    // InternalDart.g:446:4: ( (lv_body_4_0= ruleFunctionBody ) )
                    // InternalDart.g:447:5: (lv_body_4_0= ruleFunctionBody )
                    {
                    // InternalDart.g:447:5: (lv_body_4_0= ruleFunctionBody )
                    // InternalDart.g:448:6: lv_body_4_0= ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyFunctionBodyParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_4_0=ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"body",
                      							lv_body_4_0,
                      							"it.lorenzodeluca.dart.Dart.FunctionBody");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:466:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_4_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, ruleFunctionDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFormalParameterPart"
    // InternalDart.g:475:1: entryRuleFormalParameterPart returns [EObject current=null] : iv_ruleFormalParameterPart= ruleFormalParameterPart EOF ;
    public final EObject entryRuleFormalParameterPart() throws RecognitionException {
        EObject current = null;
        int entryRuleFormalParameterPart_StartIndex = input.index();
        EObject iv_ruleFormalParameterPart = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // InternalDart.g:475:60: (iv_ruleFormalParameterPart= ruleFormalParameterPart EOF )
            // InternalDart.g:476:2: iv_ruleFormalParameterPart= ruleFormalParameterPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalParameterPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormalParameterPart=ruleFormalParameterPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalParameterPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleFormalParameterPart_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalParameterPart"


    // $ANTLR start "ruleFormalParameterPart"
    // InternalDart.g:482:1: ruleFormalParameterPart returns [EObject current=null] : ( ( (lv_typeParameters_0_0= ruleTypeParameters ) )? ( (lv_parameters_1_0= ruleFormalParameterList ) ) ) ;
    public final EObject ruleFormalParameterPart() throws RecognitionException {
        EObject current = null;
        int ruleFormalParameterPart_StartIndex = input.index();
        EObject lv_typeParameters_0_0 = null;

        EObject lv_parameters_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // InternalDart.g:488:2: ( ( ( (lv_typeParameters_0_0= ruleTypeParameters ) )? ( (lv_parameters_1_0= ruleFormalParameterList ) ) ) )
            // InternalDart.g:489:2: ( ( (lv_typeParameters_0_0= ruleTypeParameters ) )? ( (lv_parameters_1_0= ruleFormalParameterList ) ) )
            {
            // InternalDart.g:489:2: ( ( (lv_typeParameters_0_0= ruleTypeParameters ) )? ( (lv_parameters_1_0= ruleFormalParameterList ) ) )
            // InternalDart.g:490:3: ( (lv_typeParameters_0_0= ruleTypeParameters ) )? ( (lv_parameters_1_0= ruleFormalParameterList ) )
            {
            // InternalDart.g:490:3: ( (lv_typeParameters_0_0= ruleTypeParameters ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==60) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDart.g:491:4: (lv_typeParameters_0_0= ruleTypeParameters )
                    {
                    // InternalDart.g:491:4: (lv_typeParameters_0_0= ruleTypeParameters )
                    // InternalDart.g:492:5: lv_typeParameters_0_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFormalParameterPartAccess().getTypeParametersTypeParametersParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_typeParameters_0_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFormalParameterPartRule());
                      					}
                      					set(
                      						current,
                      						"typeParameters",
                      						lv_typeParameters_0_0,
                      						"it.lorenzodeluca.dart.Dart.TypeParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:509:3: ( (lv_parameters_1_0= ruleFormalParameterList ) )
            // InternalDart.g:510:4: (lv_parameters_1_0= ruleFormalParameterList )
            {
            // InternalDart.g:510:4: (lv_parameters_1_0= ruleFormalParameterList )
            // InternalDart.g:511:5: lv_parameters_1_0= ruleFormalParameterList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormalParameterPartAccess().getParametersFormalParameterListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_parameters_1_0=ruleFormalParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormalParameterPartRule());
              					}
              					set(
              						current,
              						"parameters",
              						lv_parameters_1_0,
              						"it.lorenzodeluca.dart.Dart.FormalParameterList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, ruleFormalParameterPart_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFormalParameterPart"


    // $ANTLR start "entryRuleFormalParameterList"
    // InternalDart.g:532:1: entryRuleFormalParameterList returns [EObject current=null] : iv_ruleFormalParameterList= ruleFormalParameterList EOF ;
    public final EObject entryRuleFormalParameterList() throws RecognitionException {
        EObject current = null;
        int entryRuleFormalParameterList_StartIndex = input.index();
        EObject iv_ruleFormalParameterList = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // InternalDart.g:532:60: (iv_ruleFormalParameterList= ruleFormalParameterList EOF )
            // InternalDart.g:533:2: iv_ruleFormalParameterList= ruleFormalParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormalParameterList=ruleFormalParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleFormalParameterList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalParameterList"


    // $ANTLR start "ruleFormalParameterList"
    // InternalDart.g:539:1: ruleFormalParameterList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) ) (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )* )? (otherlv_5= ',' ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) ) )? otherlv_7= ')' ) ;
    public final EObject ruleFormalParameterList() throws RecognitionException {
        EObject current = null;
        int ruleFormalParameterList_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_normalParameters_2_0 = null;

        EObject lv_normalParameters_4_0 = null;

        EObject lv_optionalParameters_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // InternalDart.g:545:2: ( ( () otherlv_1= '(' ( ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) ) (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )* )? (otherlv_5= ',' ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) ) )? otherlv_7= ')' ) )
            // InternalDart.g:546:2: ( () otherlv_1= '(' ( ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) ) (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )* )? (otherlv_5= ',' ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) ) )? otherlv_7= ')' )
            {
            // InternalDart.g:546:2: ( () otherlv_1= '(' ( ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) ) (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )* )? (otherlv_5= ',' ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) ) )? otherlv_7= ')' )
            // InternalDart.g:547:3: () otherlv_1= '(' ( ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) ) (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )* )? (otherlv_5= ',' ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) ) )? otherlv_7= ')'
            {
            // InternalDart.g:547:3: ()
            // InternalDart.g:548:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFormalParameterListAccess().getFormalParameterListAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFormalParameterListAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDart.g:561:3: ( ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) ) (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==22||LA13_0==65||(LA13_0>=122 && LA13_0<=124)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDart.g:562:4: ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) ) (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )*
                    {
                    // InternalDart.g:562:4: ( (lv_normalParameters_2_0= ruleNormalFormalParameter ) )
                    // InternalDart.g:563:5: (lv_normalParameters_2_0= ruleNormalFormalParameter )
                    {
                    // InternalDart.g:563:5: (lv_normalParameters_2_0= ruleNormalFormalParameter )
                    // InternalDart.g:564:6: lv_normalParameters_2_0= ruleNormalFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFormalParameterListAccess().getNormalParametersNormalFormalParameterParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_normalParameters_2_0=ruleNormalFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
                      						}
                      						add(
                      							current,
                      							"normalParameters",
                      							lv_normalParameters_2_0,
                      							"it.lorenzodeluca.dart.Dart.NormalFormalParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:581:4: (otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==RULE_ID||LA12_1==22||LA12_1==65||(LA12_1>=122 && LA12_1<=124)) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDart.g:582:5: otherlv_3= ',' ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFormalParameterListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDart.g:586:5: ( (lv_normalParameters_4_0= ruleNormalFormalParameter ) )
                    	    // InternalDart.g:587:6: (lv_normalParameters_4_0= ruleNormalFormalParameter )
                    	    {
                    	    // InternalDart.g:587:6: (lv_normalParameters_4_0= ruleNormalFormalParameter )
                    	    // InternalDart.g:588:7: lv_normalParameters_4_0= ruleNormalFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFormalParameterListAccess().getNormalParametersNormalFormalParameterParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_normalParameters_4_0=ruleNormalFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"normalParameters",
                    	      								lv_normalParameters_4_0,
                    	      								"it.lorenzodeluca.dart.Dart.NormalFormalParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDart.g:607:3: (otherlv_5= ',' ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDart.g:608:4: otherlv_5= ',' ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFormalParameterListAccess().getCommaKeyword_3_0());
                      			
                    }
                    // InternalDart.g:612:4: ( (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters ) )
                    // InternalDart.g:613:5: (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters )
                    {
                    // InternalDart.g:613:5: (lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters )
                    // InternalDart.g:614:6: lv_optionalParameters_6_0= ruleOptionalOrNamedFormalParameters
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFormalParameterListAccess().getOptionalParametersOptionalOrNamedFormalParametersParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_optionalParameters_6_0=ruleOptionalOrNamedFormalParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFormalParameterListRule());
                      						}
                      						set(
                      							current,
                      							"optionalParameters",
                      							lv_optionalParameters_6_0,
                      							"it.lorenzodeluca.dart.Dart.OptionalOrNamedFormalParameters");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFormalParameterListAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, ruleFormalParameterList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFormalParameterList"


    // $ANTLR start "entryRuleNormalFormalParameter"
    // InternalDart.g:640:1: entryRuleNormalFormalParameter returns [EObject current=null] : iv_ruleNormalFormalParameter= ruleNormalFormalParameter EOF ;
    public final EObject entryRuleNormalFormalParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleNormalFormalParameter_StartIndex = input.index();
        EObject iv_ruleNormalFormalParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // InternalDart.g:640:62: (iv_ruleNormalFormalParameter= ruleNormalFormalParameter EOF )
            // InternalDart.g:641:2: iv_ruleNormalFormalParameter= ruleNormalFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalFormalParameter=ruleNormalFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleNormalFormalParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNormalFormalParameter"


    // $ANTLR start "ruleNormalFormalParameter"
    // InternalDart.g:647:1: ruleNormalFormalParameter returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isCovariant_1_0= 'covariant' ) )? ( (lv_type_2_0= ruleType ) )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleNormalFormalParameter() throws RecognitionException {
        EObject current = null;
        int ruleNormalFormalParameter_StartIndex = input.index();
        Token lv_isCovariant_1_0=null;
        Token lv_name_3_0=null;
        EObject lv_metadata_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // InternalDart.g:653:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isCovariant_1_0= 'covariant' ) )? ( (lv_type_2_0= ruleType ) )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalDart.g:654:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isCovariant_1_0= 'covariant' ) )? ( (lv_type_2_0= ruleType ) )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalDart.g:654:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isCovariant_1_0= 'covariant' ) )? ( (lv_type_2_0= ruleType ) )? ( (lv_name_3_0= RULE_ID ) ) )
            // InternalDart.g:655:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isCovariant_1_0= 'covariant' ) )? ( (lv_type_2_0= ruleType ) )? ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalDart.g:655:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==65) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDart.g:656:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:656:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:657:5: lv_metadata_0_0= ruleMetadata
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNormalFormalParameterAccess().getMetadataMetadataParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNormalFormalParameterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"metadata",
            	      						lv_metadata_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Metadata");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalDart.g:674:3: ( (lv_isCovariant_1_0= 'covariant' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDart.g:675:4: (lv_isCovariant_1_0= 'covariant' )
                    {
                    // InternalDart.g:675:4: (lv_isCovariant_1_0= 'covariant' )
                    // InternalDart.g:676:5: lv_isCovariant_1_0= 'covariant'
                    {
                    lv_isCovariant_1_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isCovariant_1_0, grammarAccess.getNormalFormalParameterAccess().getIsCovariantCovariantKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNormalFormalParameterRule());
                      					}
                      					setWithLastConsumed(current, "isCovariant", lv_isCovariant_1_0 != null, "covariant");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:688:3: ( (lv_type_2_0= ruleType ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=122 && LA17_0<=124)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID||LA17_2==60||LA17_2==66||LA17_2==80) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalDart.g:689:4: (lv_type_2_0= ruleType )
                    {
                    // InternalDart.g:689:4: (lv_type_2_0= ruleType )
                    // InternalDart.g:690:5: lv_type_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNormalFormalParameterAccess().getTypeTypeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    lv_type_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNormalFormalParameterRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_2_0,
                      						"it.lorenzodeluca.dart.Dart.Type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:707:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDart.g:708:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDart.g:708:4: (lv_name_3_0= RULE_ID )
            // InternalDart.g:709:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getNormalFormalParameterAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNormalFormalParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, ruleNormalFormalParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNormalFormalParameter"


    // $ANTLR start "entryRuleOptionalOrNamedFormalParameters"
    // InternalDart.g:729:1: entryRuleOptionalOrNamedFormalParameters returns [EObject current=null] : iv_ruleOptionalOrNamedFormalParameters= ruleOptionalOrNamedFormalParameters EOF ;
    public final EObject entryRuleOptionalOrNamedFormalParameters() throws RecognitionException {
        EObject current = null;
        int entryRuleOptionalOrNamedFormalParameters_StartIndex = input.index();
        EObject iv_ruleOptionalOrNamedFormalParameters = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // InternalDart.g:729:72: (iv_ruleOptionalOrNamedFormalParameters= ruleOptionalOrNamedFormalParameters EOF )
            // InternalDart.g:730:2: iv_ruleOptionalOrNamedFormalParameters= ruleOptionalOrNamedFormalParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalOrNamedFormalParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOptionalOrNamedFormalParameters=ruleOptionalOrNamedFormalParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalOrNamedFormalParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleOptionalOrNamedFormalParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalOrNamedFormalParameters"


    // $ANTLR start "ruleOptionalOrNamedFormalParameters"
    // InternalDart.g:736:1: ruleOptionalOrNamedFormalParameters returns [EObject current=null] : (this_OptionalPositionalFormalParameters_0= ruleOptionalPositionalFormalParameters | this_NamedFormalParameters_1= ruleNamedFormalParameters ) ;
    public final EObject ruleOptionalOrNamedFormalParameters() throws RecognitionException {
        EObject current = null;
        int ruleOptionalOrNamedFormalParameters_StartIndex = input.index();
        EObject this_OptionalPositionalFormalParameters_0 = null;

        EObject this_NamedFormalParameters_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // InternalDart.g:742:2: ( (this_OptionalPositionalFormalParameters_0= ruleOptionalPositionalFormalParameters | this_NamedFormalParameters_1= ruleNamedFormalParameters ) )
            // InternalDart.g:743:2: (this_OptionalPositionalFormalParameters_0= ruleOptionalPositionalFormalParameters | this_NamedFormalParameters_1= ruleNamedFormalParameters )
            {
            // InternalDart.g:743:2: (this_OptionalPositionalFormalParameters_0= ruleOptionalPositionalFormalParameters | this_NamedFormalParameters_1= ruleNamedFormalParameters )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDart.g:744:3: this_OptionalPositionalFormalParameters_0= ruleOptionalPositionalFormalParameters
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOptionalOrNamedFormalParametersAccess().getOptionalPositionalFormalParametersParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OptionalPositionalFormalParameters_0=ruleOptionalPositionalFormalParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OptionalPositionalFormalParameters_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:756:3: this_NamedFormalParameters_1= ruleNamedFormalParameters
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOptionalOrNamedFormalParametersAccess().getNamedFormalParametersParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NamedFormalParameters_1=ruleNamedFormalParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NamedFormalParameters_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, ruleOptionalOrNamedFormalParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOptionalOrNamedFormalParameters"


    // $ANTLR start "entryRuleOptionalPositionalFormalParameters"
    // InternalDart.g:771:1: entryRuleOptionalPositionalFormalParameters returns [EObject current=null] : iv_ruleOptionalPositionalFormalParameters= ruleOptionalPositionalFormalParameters EOF ;
    public final EObject entryRuleOptionalPositionalFormalParameters() throws RecognitionException {
        EObject current = null;
        int entryRuleOptionalPositionalFormalParameters_StartIndex = input.index();
        EObject iv_ruleOptionalPositionalFormalParameters = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // InternalDart.g:771:75: (iv_ruleOptionalPositionalFormalParameters= ruleOptionalPositionalFormalParameters EOF )
            // InternalDart.g:772:2: iv_ruleOptionalPositionalFormalParameters= ruleOptionalPositionalFormalParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalPositionalFormalParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOptionalPositionalFormalParameters=ruleOptionalPositionalFormalParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalPositionalFormalParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleOptionalPositionalFormalParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalPositionalFormalParameters"


    // $ANTLR start "ruleOptionalPositionalFormalParameters"
    // InternalDart.g:778:1: ruleOptionalPositionalFormalParameters returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_parameters_2_0= ruleDefaultFormalParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleOptionalPositionalFormalParameters() throws RecognitionException {
        EObject current = null;
        int ruleOptionalPositionalFormalParameters_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // InternalDart.g:784:2: ( ( () otherlv_1= '[' ( ( (lv_parameters_2_0= ruleDefaultFormalParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )* )? otherlv_5= ']' ) )
            // InternalDart.g:785:2: ( () otherlv_1= '[' ( ( (lv_parameters_2_0= ruleDefaultFormalParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )* )? otherlv_5= ']' )
            {
            // InternalDart.g:785:2: ( () otherlv_1= '[' ( ( (lv_parameters_2_0= ruleDefaultFormalParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )* )? otherlv_5= ']' )
            // InternalDart.g:786:3: () otherlv_1= '[' ( ( (lv_parameters_2_0= ruleDefaultFormalParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )* )? otherlv_5= ']'
            {
            // InternalDart.g:786:3: ()
            // InternalDart.g:787:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOptionalPositionalFormalParametersAccess().getOptionalPositionalFormalParametersAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOptionalPositionalFormalParametersAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDart.g:800:3: ( ( (lv_parameters_2_0= ruleDefaultFormalParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==22||LA20_0==65||(LA20_0>=122 && LA20_0<=124)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDart.g:801:4: ( (lv_parameters_2_0= ruleDefaultFormalParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )*
                    {
                    // InternalDart.g:801:4: ( (lv_parameters_2_0= ruleDefaultFormalParameter ) )
                    // InternalDart.g:802:5: (lv_parameters_2_0= ruleDefaultFormalParameter )
                    {
                    // InternalDart.g:802:5: (lv_parameters_2_0= ruleDefaultFormalParameter )
                    // InternalDart.g:803:6: lv_parameters_2_0= ruleDefaultFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOptionalPositionalFormalParametersAccess().getParametersDefaultFormalParameterParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_parameters_2_0=ruleDefaultFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOptionalPositionalFormalParametersRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"it.lorenzodeluca.dart.Dart.DefaultFormalParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:820:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDart.g:821:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getOptionalPositionalFormalParametersAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDart.g:825:5: ( (lv_parameters_4_0= ruleDefaultFormalParameter ) )
                    	    // InternalDart.g:826:6: (lv_parameters_4_0= ruleDefaultFormalParameter )
                    	    {
                    	    // InternalDart.g:826:6: (lv_parameters_4_0= ruleDefaultFormalParameter )
                    	    // InternalDart.g:827:7: lv_parameters_4_0= ruleDefaultFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOptionalPositionalFormalParametersAccess().getParametersDefaultFormalParameterParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_parameters_4_0=ruleDefaultFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOptionalPositionalFormalParametersRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"it.lorenzodeluca.dart.Dart.DefaultFormalParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOptionalPositionalFormalParametersAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, ruleOptionalPositionalFormalParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOptionalPositionalFormalParameters"


    // $ANTLR start "entryRuleNamedFormalParameters"
    // InternalDart.g:854:1: entryRuleNamedFormalParameters returns [EObject current=null] : iv_ruleNamedFormalParameters= ruleNamedFormalParameters EOF ;
    public final EObject entryRuleNamedFormalParameters() throws RecognitionException {
        EObject current = null;
        int entryRuleNamedFormalParameters_StartIndex = input.index();
        EObject iv_ruleNamedFormalParameters = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // InternalDart.g:854:62: (iv_ruleNamedFormalParameters= ruleNamedFormalParameters EOF )
            // InternalDart.g:855:2: iv_ruleNamedFormalParameters= ruleNamedFormalParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedFormalParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedFormalParameters=ruleNamedFormalParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedFormalParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleNamedFormalParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedFormalParameters"


    // $ANTLR start "ruleNamedFormalParameters"
    // InternalDart.g:861:1: ruleNamedFormalParameters returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_parameters_2_0= ruleDefaultNamedParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleNamedFormalParameters() throws RecognitionException {
        EObject current = null;
        int ruleNamedFormalParameters_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // InternalDart.g:867:2: ( ( () otherlv_1= '{' ( ( (lv_parameters_2_0= ruleDefaultNamedParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )* )? otherlv_5= '}' ) )
            // InternalDart.g:868:2: ( () otherlv_1= '{' ( ( (lv_parameters_2_0= ruleDefaultNamedParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )* )? otherlv_5= '}' )
            {
            // InternalDart.g:868:2: ( () otherlv_1= '{' ( ( (lv_parameters_2_0= ruleDefaultNamedParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )* )? otherlv_5= '}' )
            // InternalDart.g:869:3: () otherlv_1= '{' ( ( (lv_parameters_2_0= ruleDefaultNamedParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )* )? otherlv_5= '}'
            {
            // InternalDart.g:869:3: ()
            // InternalDart.g:870:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNamedFormalParametersAccess().getNamedFormalParametersAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNamedFormalParametersAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDart.g:883:3: ( ( (lv_parameters_2_0= ruleDefaultNamedParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==22||LA22_0==27||LA22_0==65||(LA22_0>=122 && LA22_0<=124)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDart.g:884:4: ( (lv_parameters_2_0= ruleDefaultNamedParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )*
                    {
                    // InternalDart.g:884:4: ( (lv_parameters_2_0= ruleDefaultNamedParameter ) )
                    // InternalDart.g:885:5: (lv_parameters_2_0= ruleDefaultNamedParameter )
                    {
                    // InternalDart.g:885:5: (lv_parameters_2_0= ruleDefaultNamedParameter )
                    // InternalDart.g:886:6: lv_parameters_2_0= ruleDefaultNamedParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNamedFormalParametersAccess().getParametersDefaultNamedParameterParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_parameters_2_0=ruleDefaultNamedParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNamedFormalParametersRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"it.lorenzodeluca.dart.Dart.DefaultNamedParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:903:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDart.g:904:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleDefaultNamedParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getNamedFormalParametersAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDart.g:908:5: ( (lv_parameters_4_0= ruleDefaultNamedParameter ) )
                    	    // InternalDart.g:909:6: (lv_parameters_4_0= ruleDefaultNamedParameter )
                    	    {
                    	    // InternalDart.g:909:6: (lv_parameters_4_0= ruleDefaultNamedParameter )
                    	    // InternalDart.g:910:7: lv_parameters_4_0= ruleDefaultNamedParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNamedFormalParametersAccess().getParametersDefaultNamedParameterParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_4_0=ruleDefaultNamedParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNamedFormalParametersRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"it.lorenzodeluca.dart.Dart.DefaultNamedParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getNamedFormalParametersAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ruleNamedFormalParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamedFormalParameters"


    // $ANTLR start "entryRuleDefaultFormalParameter"
    // InternalDart.g:937:1: entryRuleDefaultFormalParameter returns [EObject current=null] : iv_ruleDefaultFormalParameter= ruleDefaultFormalParameter EOF ;
    public final EObject entryRuleDefaultFormalParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleDefaultFormalParameter_StartIndex = input.index();
        EObject iv_ruleDefaultFormalParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // InternalDart.g:937:63: (iv_ruleDefaultFormalParameter= ruleDefaultFormalParameter EOF )
            // InternalDart.g:938:2: iv_ruleDefaultFormalParameter= ruleDefaultFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultFormalParameter=ruleDefaultFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleDefaultFormalParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultFormalParameter"


    // $ANTLR start "ruleDefaultFormalParameter"
    // InternalDart.g:944:1: ruleDefaultFormalParameter returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleNormalFormalParameter ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDefaultFormalParameter() throws RecognitionException {
        EObject current = null;
        int ruleDefaultFormalParameter_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_defaultValue_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // InternalDart.g:950:2: ( ( ( (lv_parameter_0_0= ruleNormalFormalParameter ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleExpression ) ) )? ) )
            // InternalDart.g:951:2: ( ( (lv_parameter_0_0= ruleNormalFormalParameter ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleExpression ) ) )? )
            {
            // InternalDart.g:951:2: ( ( (lv_parameter_0_0= ruleNormalFormalParameter ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleExpression ) ) )? )
            // InternalDart.g:952:3: ( (lv_parameter_0_0= ruleNormalFormalParameter ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleExpression ) ) )?
            {
            // InternalDart.g:952:3: ( (lv_parameter_0_0= ruleNormalFormalParameter ) )
            // InternalDart.g:953:4: (lv_parameter_0_0= ruleNormalFormalParameter )
            {
            // InternalDart.g:953:4: (lv_parameter_0_0= ruleNormalFormalParameter )
            // InternalDart.g:954:5: lv_parameter_0_0= ruleNormalFormalParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultFormalParameterAccess().getParameterNormalFormalParameterParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_parameter_0_0=ruleNormalFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultFormalParameterRule());
              					}
              					set(
              						current,
              						"parameter",
              						lv_parameter_0_0,
              						"it.lorenzodeluca.dart.Dart.NormalFormalParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:971:3: (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDart.g:972:4: otherlv_1= '=' ( (lv_defaultValue_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDefaultFormalParameterAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalDart.g:976:4: ( (lv_defaultValue_2_0= ruleExpression ) )
                    // InternalDart.g:977:5: (lv_defaultValue_2_0= ruleExpression )
                    {
                    // InternalDart.g:977:5: (lv_defaultValue_2_0= ruleExpression )
                    // InternalDart.g:978:6: lv_defaultValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefaultFormalParameterAccess().getDefaultValueExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_defaultValue_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefaultFormalParameterRule());
                      						}
                      						set(
                      							current,
                      							"defaultValue",
                      							lv_defaultValue_2_0,
                      							"it.lorenzodeluca.dart.Dart.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, ruleDefaultFormalParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDefaultFormalParameter"


    // $ANTLR start "entryRuleDefaultNamedParameter"
    // InternalDart.g:1000:1: entryRuleDefaultNamedParameter returns [EObject current=null] : iv_ruleDefaultNamedParameter= ruleDefaultNamedParameter EOF ;
    public final EObject entryRuleDefaultNamedParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleDefaultNamedParameter_StartIndex = input.index();
        EObject iv_ruleDefaultNamedParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // InternalDart.g:1000:62: (iv_ruleDefaultNamedParameter= ruleDefaultNamedParameter EOF )
            // InternalDart.g:1001:2: iv_ruleDefaultNamedParameter= ruleDefaultNamedParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultNamedParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultNamedParameter=ruleDefaultNamedParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultNamedParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleDefaultNamedParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultNamedParameter"


    // $ANTLR start "ruleDefaultNamedParameter"
    // InternalDart.g:1007:1: ruleDefaultNamedParameter returns [EObject current=null] : ( ( (lv_isRequired_0_0= 'required' ) )? ( (lv_parameter_1_0= ruleNormalFormalParameter ) ) ( (otherlv_2= '=' | otherlv_3= ':' ) ( (lv_defaultValue_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDefaultNamedParameter() throws RecognitionException {
        EObject current = null;
        int ruleDefaultNamedParameter_StartIndex = input.index();
        Token lv_isRequired_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_parameter_1_0 = null;

        EObject lv_defaultValue_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // InternalDart.g:1013:2: ( ( ( (lv_isRequired_0_0= 'required' ) )? ( (lv_parameter_1_0= ruleNormalFormalParameter ) ) ( (otherlv_2= '=' | otherlv_3= ':' ) ( (lv_defaultValue_4_0= ruleExpression ) ) )? ) )
            // InternalDart.g:1014:2: ( ( (lv_isRequired_0_0= 'required' ) )? ( (lv_parameter_1_0= ruleNormalFormalParameter ) ) ( (otherlv_2= '=' | otherlv_3= ':' ) ( (lv_defaultValue_4_0= ruleExpression ) ) )? )
            {
            // InternalDart.g:1014:2: ( ( (lv_isRequired_0_0= 'required' ) )? ( (lv_parameter_1_0= ruleNormalFormalParameter ) ) ( (otherlv_2= '=' | otherlv_3= ':' ) ( (lv_defaultValue_4_0= ruleExpression ) ) )? )
            // InternalDart.g:1015:3: ( (lv_isRequired_0_0= 'required' ) )? ( (lv_parameter_1_0= ruleNormalFormalParameter ) ) ( (otherlv_2= '=' | otherlv_3= ':' ) ( (lv_defaultValue_4_0= ruleExpression ) ) )?
            {
            // InternalDart.g:1015:3: ( (lv_isRequired_0_0= 'required' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDart.g:1016:4: (lv_isRequired_0_0= 'required' )
                    {
                    // InternalDart.g:1016:4: (lv_isRequired_0_0= 'required' )
                    // InternalDart.g:1017:5: lv_isRequired_0_0= 'required'
                    {
                    lv_isRequired_0_0=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isRequired_0_0, grammarAccess.getDefaultNamedParameterAccess().getIsRequiredRequiredKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDefaultNamedParameterRule());
                      					}
                      					setWithLastConsumed(current, "isRequired", lv_isRequired_0_0 != null, "required");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1029:3: ( (lv_parameter_1_0= ruleNormalFormalParameter ) )
            // InternalDart.g:1030:4: (lv_parameter_1_0= ruleNormalFormalParameter )
            {
            // InternalDart.g:1030:4: (lv_parameter_1_0= ruleNormalFormalParameter )
            // InternalDart.g:1031:5: lv_parameter_1_0= ruleNormalFormalParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultNamedParameterAccess().getParameterNormalFormalParameterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_parameter_1_0=ruleNormalFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultNamedParameterRule());
              					}
              					set(
              						current,
              						"parameter",
              						lv_parameter_1_0,
              						"it.lorenzodeluca.dart.Dart.NormalFormalParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:1048:3: ( (otherlv_2= '=' | otherlv_3= ':' ) ( (lv_defaultValue_4_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17||LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDart.g:1049:4: (otherlv_2= '=' | otherlv_3= ':' ) ( (lv_defaultValue_4_0= ruleExpression ) )
                    {
                    // InternalDart.g:1049:4: (otherlv_2= '=' | otherlv_3= ':' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==17) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==28) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalDart.g:1050:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getDefaultNamedParameterAccess().getEqualsSignKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDart.g:1055:5: otherlv_3= ':'
                            {
                            otherlv_3=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getDefaultNamedParameterAccess().getColonKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDart.g:1060:4: ( (lv_defaultValue_4_0= ruleExpression ) )
                    // InternalDart.g:1061:5: (lv_defaultValue_4_0= ruleExpression )
                    {
                    // InternalDart.g:1061:5: (lv_defaultValue_4_0= ruleExpression )
                    // InternalDart.g:1062:6: lv_defaultValue_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefaultNamedParameterAccess().getDefaultValueExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_defaultValue_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefaultNamedParameterRule());
                      						}
                      						set(
                      							current,
                      							"defaultValue",
                      							lv_defaultValue_4_0,
                      							"it.lorenzodeluca.dart.Dart.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, ruleDefaultNamedParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDefaultNamedParameter"


    // $ANTLR start "entryRuleFunctionBody"
    // InternalDart.g:1084:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionBody_StartIndex = input.index();
        EObject iv_ruleFunctionBody = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // InternalDart.g:1084:53: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalDart.g:1085:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleFunctionBody_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalDart.g:1091:1: ruleFunctionBody returns [EObject current=null] : ( ( ( (lv_isAsync_0_0= 'async' ) ) | ( (lv_isSync_1_0= 'sync' ) ) )? ( (lv_isStar_2_0= '*' ) )? ( (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( (lv_block_6_0= ruleBlock ) ) ) ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;
        int ruleFunctionBody_StartIndex = input.index();
        Token lv_isAsync_0_0=null;
        Token lv_isSync_1_0=null;
        Token lv_isStar_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;

        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // InternalDart.g:1097:2: ( ( ( ( (lv_isAsync_0_0= 'async' ) ) | ( (lv_isSync_1_0= 'sync' ) ) )? ( (lv_isStar_2_0= '*' ) )? ( (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( (lv_block_6_0= ruleBlock ) ) ) ) )
            // InternalDart.g:1098:2: ( ( ( (lv_isAsync_0_0= 'async' ) ) | ( (lv_isSync_1_0= 'sync' ) ) )? ( (lv_isStar_2_0= '*' ) )? ( (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( (lv_block_6_0= ruleBlock ) ) ) )
            {
            // InternalDart.g:1098:2: ( ( ( (lv_isAsync_0_0= 'async' ) ) | ( (lv_isSync_1_0= 'sync' ) ) )? ( (lv_isStar_2_0= '*' ) )? ( (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( (lv_block_6_0= ruleBlock ) ) ) )
            // InternalDart.g:1099:3: ( ( (lv_isAsync_0_0= 'async' ) ) | ( (lv_isSync_1_0= 'sync' ) ) )? ( (lv_isStar_2_0= '*' ) )? ( (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( (lv_block_6_0= ruleBlock ) ) )
            {
            // InternalDart.g:1099:3: ( ( (lv_isAsync_0_0= 'async' ) ) | ( (lv_isSync_1_0= 'sync' ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            else if ( (LA27_0==30) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // InternalDart.g:1100:4: ( (lv_isAsync_0_0= 'async' ) )
                    {
                    // InternalDart.g:1100:4: ( (lv_isAsync_0_0= 'async' ) )
                    // InternalDart.g:1101:5: (lv_isAsync_0_0= 'async' )
                    {
                    // InternalDart.g:1101:5: (lv_isAsync_0_0= 'async' )
                    // InternalDart.g:1102:6: lv_isAsync_0_0= 'async'
                    {
                    lv_isAsync_0_0=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isAsync_0_0, grammarAccess.getFunctionBodyAccess().getIsAsyncAsyncKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFunctionBodyRule());
                      						}
                      						setWithLastConsumed(current, "isAsync", lv_isAsync_0_0 != null, "async");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:1115:4: ( (lv_isSync_1_0= 'sync' ) )
                    {
                    // InternalDart.g:1115:4: ( (lv_isSync_1_0= 'sync' ) )
                    // InternalDart.g:1116:5: (lv_isSync_1_0= 'sync' )
                    {
                    // InternalDart.g:1116:5: (lv_isSync_1_0= 'sync' )
                    // InternalDart.g:1117:6: lv_isSync_1_0= 'sync'
                    {
                    lv_isSync_1_0=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isSync_1_0, grammarAccess.getFunctionBodyAccess().getIsSyncSyncKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFunctionBodyRule());
                      						}
                      						setWithLastConsumed(current, "isSync", lv_isSync_1_0 != null, "sync");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDart.g:1130:3: ( (lv_isStar_2_0= '*' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDart.g:1131:4: (lv_isStar_2_0= '*' )
                    {
                    // InternalDart.g:1131:4: (lv_isStar_2_0= '*' )
                    // InternalDart.g:1132:5: lv_isStar_2_0= '*'
                    {
                    lv_isStar_2_0=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isStar_2_0, grammarAccess.getFunctionBodyAccess().getIsStarAsteriskKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionBodyRule());
                      					}
                      					setWithLastConsumed(current, "isStar", lv_isStar_2_0 != null, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1144:3: ( (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( (lv_block_6_0= ruleBlock ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            else if ( (LA29_0==25) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDart.g:1145:4: (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    {
                    // InternalDart.g:1145:4: (otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    // InternalDart.g:1146:5: otherlv_3= '=>' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getFunctionBodyAccess().getEqualsSignGreaterThanSignKeyword_2_0_0());
                      				
                    }
                    // InternalDart.g:1150:5: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalDart.g:1151:6: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalDart.g:1151:6: (lv_expression_4_0= ruleExpression )
                    // InternalDart.g:1152:7: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionBodyAccess().getExpressionExpressionParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                      							}
                      							set(
                      								current,
                      								"expression",
                      								lv_expression_4_0,
                      								"it.lorenzodeluca.dart.Dart.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getFunctionBodyAccess().getSemicolonKeyword_2_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:1175:4: ( (lv_block_6_0= ruleBlock ) )
                    {
                    // InternalDart.g:1175:4: ( (lv_block_6_0= ruleBlock ) )
                    // InternalDart.g:1176:5: (lv_block_6_0= ruleBlock )
                    {
                    // InternalDart.g:1176:5: (lv_block_6_0= ruleBlock )
                    // InternalDart.g:1177:6: lv_block_6_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlockBlockParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_6_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_6_0,
                      							"it.lorenzodeluca.dart.Dart.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, ruleFunctionBody_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalDart.g:1199:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleClassDeclaration_StartIndex = input.index();
        EObject iv_ruleClassDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // InternalDart.g:1199:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalDart.g:1200:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleClassDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalDart.g:1206:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeParameters_3_0= ruleTypeParameters ) )? ( (lv_superclass_4_0= ruleSuperclass ) )? ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMemberDeclaration ) )* otherlv_8= '}' ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleClassDeclaration_StartIndex = input.index();
        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_typeParameters_3_0 = null;

        EObject lv_superclass_4_0 = null;

        EObject lv_interfaces_5_0 = null;

        EObject lv_members_7_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // InternalDart.g:1212:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeParameters_3_0= ruleTypeParameters ) )? ( (lv_superclass_4_0= ruleSuperclass ) )? ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMemberDeclaration ) )* otherlv_8= '}' ) )
            // InternalDart.g:1213:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeParameters_3_0= ruleTypeParameters ) )? ( (lv_superclass_4_0= ruleSuperclass ) )? ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMemberDeclaration ) )* otherlv_8= '}' )
            {
            // InternalDart.g:1213:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeParameters_3_0= ruleTypeParameters ) )? ( (lv_superclass_4_0= ruleSuperclass ) )? ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMemberDeclaration ) )* otherlv_8= '}' )
            // InternalDart.g:1214:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_typeParameters_3_0= ruleTypeParameters ) )? ( (lv_superclass_4_0= ruleSuperclass ) )? ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMemberDeclaration ) )* otherlv_8= '}'
            {
            // InternalDart.g:1214:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDart.g:1215:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalDart.g:1215:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalDart.g:1216:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClassDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "isAbstract", lv_isAbstract_0_0 != null, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
              		
            }
            // InternalDart.g:1232:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDart.g:1233:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDart.g:1233:4: (lv_name_2_0= RULE_ID )
            // InternalDart.g:1234:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClassDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:1250:3: ( (lv_typeParameters_3_0= ruleTypeParameters ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==60) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDart.g:1251:4: (lv_typeParameters_3_0= ruleTypeParameters )
                    {
                    // InternalDart.g:1251:4: (lv_typeParameters_3_0= ruleTypeParameters )
                    // InternalDart.g:1252:5: lv_typeParameters_3_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassDeclarationAccess().getTypeParametersTypeParametersParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
                    lv_typeParameters_3_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"typeParameters",
                      						lv_typeParameters_3_0,
                      						"it.lorenzodeluca.dart.Dart.TypeParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1269:3: ( (lv_superclass_4_0= ruleSuperclass ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDart.g:1270:4: (lv_superclass_4_0= ruleSuperclass )
                    {
                    // InternalDart.g:1270:4: (lv_superclass_4_0= ruleSuperclass )
                    // InternalDart.g:1271:5: lv_superclass_4_0= ruleSuperclass
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassDeclarationAccess().getSuperclassSuperclassParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_26);
                    lv_superclass_4_0=ruleSuperclass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"superclass",
                      						lv_superclass_4_0,
                      						"it.lorenzodeluca.dart.Dart.Superclass");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1288:3: ( (lv_interfaces_5_0= ruleInterfaces ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDart.g:1289:4: (lv_interfaces_5_0= ruleInterfaces )
                    {
                    // InternalDart.g:1289:4: (lv_interfaces_5_0= ruleInterfaces )
                    // InternalDart.g:1290:5: lv_interfaces_5_0= ruleInterfaces
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassDeclarationAccess().getInterfacesInterfacesParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    lv_interfaces_5_0=ruleInterfaces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"interfaces",
                      						lv_interfaces_5_0,
                      						"it.lorenzodeluca.dart.Dart.Interfaces");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDart.g:1311:3: ( (lv_members_7_0= ruleMemberDeclaration ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==12||(LA34_0>=14 && LA34_0<=15)||LA34_0==18||(LA34_0>=38 && LA34_0<=41)||LA34_0==65||(LA34_0>=122 && LA34_0<=124)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDart.g:1312:4: (lv_members_7_0= ruleMemberDeclaration )
            	    {
            	    // InternalDart.g:1312:4: (lv_members_7_0= ruleMemberDeclaration )
            	    // InternalDart.g:1313:5: lv_members_7_0= ruleMemberDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getClassDeclarationAccess().getMembersMemberDeclarationParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_members_7_0=ruleMemberDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_7_0,
            	      						"it.lorenzodeluca.dart.Dart.MemberDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, ruleClassDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleSuperclass"
    // InternalDart.g:1338:1: entryRuleSuperclass returns [EObject current=null] : iv_ruleSuperclass= ruleSuperclass EOF ;
    public final EObject entryRuleSuperclass() throws RecognitionException {
        EObject current = null;
        int entryRuleSuperclass_StartIndex = input.index();
        EObject iv_ruleSuperclass = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // InternalDart.g:1338:51: (iv_ruleSuperclass= ruleSuperclass EOF )
            // InternalDart.g:1339:2: iv_ruleSuperclass= ruleSuperclass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuperclassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSuperclass=ruleSuperclass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuperclass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleSuperclass_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperclass"


    // $ANTLR start "ruleSuperclass"
    // InternalDart.g:1345:1: ruleSuperclass returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_type_1_0= ruleType ) ) ( (lv_mixins_2_0= ruleMixins ) )? ) ;
    public final EObject ruleSuperclass() throws RecognitionException {
        EObject current = null;
        int ruleSuperclass_StartIndex = input.index();
        Token otherlv_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_mixins_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // InternalDart.g:1351:2: ( (otherlv_0= 'extends' ( (lv_type_1_0= ruleType ) ) ( (lv_mixins_2_0= ruleMixins ) )? ) )
            // InternalDart.g:1352:2: (otherlv_0= 'extends' ( (lv_type_1_0= ruleType ) ) ( (lv_mixins_2_0= ruleMixins ) )? )
            {
            // InternalDart.g:1352:2: (otherlv_0= 'extends' ( (lv_type_1_0= ruleType ) ) ( (lv_mixins_2_0= ruleMixins ) )? )
            // InternalDart.g:1353:3: otherlv_0= 'extends' ( (lv_type_1_0= ruleType ) ) ( (lv_mixins_2_0= ruleMixins ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSuperclassAccess().getExtendsKeyword_0());
              		
            }
            // InternalDart.g:1357:3: ( (lv_type_1_0= ruleType ) )
            // InternalDart.g:1358:4: (lv_type_1_0= ruleType )
            {
            // InternalDart.g:1358:4: (lv_type_1_0= ruleType )
            // InternalDart.g:1359:5: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSuperclassAccess().getTypeTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSuperclassRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"it.lorenzodeluca.dart.Dart.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:1376:3: ( (lv_mixins_2_0= ruleMixins ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDart.g:1377:4: (lv_mixins_2_0= ruleMixins )
                    {
                    // InternalDart.g:1377:4: (lv_mixins_2_0= ruleMixins )
                    // InternalDart.g:1378:5: lv_mixins_2_0= ruleMixins
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSuperclassAccess().getMixinsMixinsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_mixins_2_0=ruleMixins();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSuperclassRule());
                      					}
                      					set(
                      						current,
                      						"mixins",
                      						lv_mixins_2_0,
                      						"it.lorenzodeluca.dart.Dart.Mixins");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, ruleSuperclass_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSuperclass"


    // $ANTLR start "entryRuleMixins"
    // InternalDart.g:1399:1: entryRuleMixins returns [EObject current=null] : iv_ruleMixins= ruleMixins EOF ;
    public final EObject entryRuleMixins() throws RecognitionException {
        EObject current = null;
        int entryRuleMixins_StartIndex = input.index();
        EObject iv_ruleMixins = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // InternalDart.g:1399:47: (iv_ruleMixins= ruleMixins EOF )
            // InternalDart.g:1400:2: iv_ruleMixins= ruleMixins EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMixinsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMixins=ruleMixins();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMixins; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleMixins_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMixins"


    // $ANTLR start "ruleMixins"
    // InternalDart.g:1406:1: ruleMixins returns [EObject current=null] : (otherlv_0= 'with' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ;
    public final EObject ruleMixins() throws RecognitionException {
        EObject current = null;
        int ruleMixins_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // InternalDart.g:1412:2: ( (otherlv_0= 'with' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            // InternalDart.g:1413:2: (otherlv_0= 'with' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            {
            // InternalDart.g:1413:2: (otherlv_0= 'with' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            // InternalDart.g:1414:3: otherlv_0= 'with' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMixinsAccess().getWithKeyword_0());
              		
            }
            // InternalDart.g:1418:3: ( (lv_types_1_0= ruleType ) )
            // InternalDart.g:1419:4: (lv_types_1_0= ruleType )
            {
            // InternalDart.g:1419:4: (lv_types_1_0= ruleType )
            // InternalDart.g:1420:5: lv_types_1_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMixinsAccess().getTypesTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMixinsRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"it.lorenzodeluca.dart.Dart.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:1437:3: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==16) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDart.g:1438:4: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getMixinsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalDart.g:1442:4: ( (lv_types_3_0= ruleType ) )
            	    // InternalDart.g:1443:5: (lv_types_3_0= ruleType )
            	    {
            	    // InternalDart.g:1443:5: (lv_types_3_0= ruleType )
            	    // InternalDart.g:1444:6: lv_types_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMixinsAccess().getTypesTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMixinsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"it.lorenzodeluca.dart.Dart.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, ruleMixins_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMixins"


    // $ANTLR start "entryRuleInterfaces"
    // InternalDart.g:1466:1: entryRuleInterfaces returns [EObject current=null] : iv_ruleInterfaces= ruleInterfaces EOF ;
    public final EObject entryRuleInterfaces() throws RecognitionException {
        EObject current = null;
        int entryRuleInterfaces_StartIndex = input.index();
        EObject iv_ruleInterfaces = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // InternalDart.g:1466:51: (iv_ruleInterfaces= ruleInterfaces EOF )
            // InternalDart.g:1467:2: iv_ruleInterfaces= ruleInterfaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfacesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaces=ruleInterfaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaces; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleInterfaces_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaces"


    // $ANTLR start "ruleInterfaces"
    // InternalDart.g:1473:1: ruleInterfaces returns [EObject current=null] : (otherlv_0= 'implements' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ;
    public final EObject ruleInterfaces() throws RecognitionException {
        EObject current = null;
        int ruleInterfaces_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // InternalDart.g:1479:2: ( (otherlv_0= 'implements' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            // InternalDart.g:1480:2: (otherlv_0= 'implements' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            {
            // InternalDart.g:1480:2: (otherlv_0= 'implements' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            // InternalDart.g:1481:3: otherlv_0= 'implements' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfacesAccess().getImplementsKeyword_0());
              		
            }
            // InternalDart.g:1485:3: ( (lv_types_1_0= ruleType ) )
            // InternalDart.g:1486:4: (lv_types_1_0= ruleType )
            {
            // InternalDart.g:1486:4: (lv_types_1_0= ruleType )
            // InternalDart.g:1487:5: lv_types_1_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInterfacesAccess().getTypesTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInterfacesRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"it.lorenzodeluca.dart.Dart.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:1504:3: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==16) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDart.g:1505:4: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getInterfacesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalDart.g:1509:4: ( (lv_types_3_0= ruleType ) )
            	    // InternalDart.g:1510:5: (lv_types_3_0= ruleType )
            	    {
            	    // InternalDart.g:1510:5: (lv_types_3_0= ruleType )
            	    // InternalDart.g:1511:6: lv_types_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInterfacesAccess().getTypesTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInterfacesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"it.lorenzodeluca.dart.Dart.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, ruleInterfaces_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInterfaces"


    // $ANTLR start "entryRuleMemberDeclaration"
    // InternalDart.g:1533:1: entryRuleMemberDeclaration returns [EObject current=null] : iv_ruleMemberDeclaration= ruleMemberDeclaration EOF ;
    public final EObject entryRuleMemberDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleMemberDeclaration_StartIndex = input.index();
        EObject iv_ruleMemberDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // InternalDart.g:1533:58: (iv_ruleMemberDeclaration= ruleMemberDeclaration EOF )
            // InternalDart.g:1534:2: iv_ruleMemberDeclaration= ruleMemberDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMemberDeclaration=ruleMemberDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleMemberDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberDeclaration"


    // $ANTLR start "ruleMemberDeclaration"
    // InternalDart.g:1540:1: ruleMemberDeclaration returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isStatic_1_0= 'static' ) )? ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) | ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' ) ) ) ;
    public final EObject ruleMemberDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleMemberDeclaration_StartIndex = input.index();
        Token lv_isStatic_1_0=null;
        Token otherlv_5=null;
        EObject lv_metadata_0_0 = null;

        EObject lv_method_2_0 = null;

        EObject lv_body_3_0 = null;

        EObject lv_variable_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // InternalDart.g:1546:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isStatic_1_0= 'static' ) )? ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) | ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' ) ) ) )
            // InternalDart.g:1547:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isStatic_1_0= 'static' ) )? ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) | ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' ) ) )
            {
            // InternalDart.g:1547:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isStatic_1_0= 'static' ) )? ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) | ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' ) ) )
            // InternalDart.g:1548:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_isStatic_1_0= 'static' ) )? ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) | ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' ) )
            {
            // InternalDart.g:1548:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==65) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDart.g:1549:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:1549:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:1550:5: lv_metadata_0_0= ruleMetadata
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMemberDeclarationAccess().getMetadataMetadataParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMemberDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"metadata",
            	      						lv_metadata_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Metadata");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalDart.g:1567:3: ( (lv_isStatic_1_0= 'static' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDart.g:1568:4: (lv_isStatic_1_0= 'static' )
                    {
                    // InternalDart.g:1568:4: (lv_isStatic_1_0= 'static' )
                    // InternalDart.g:1569:5: lv_isStatic_1_0= 'static'
                    {
                    lv_isStatic_1_0=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isStatic_1_0, grammarAccess.getMemberDeclarationAccess().getIsStaticStaticKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMemberDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "isStatic", lv_isStatic_1_0 != null, "static");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1581:3: ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) | ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' ) )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalDart.g:1582:4: ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) )
                    {
                    // InternalDart.g:1582:4: ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) )
                    // InternalDart.g:1583:5: ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) )
                    {
                    // InternalDart.g:1583:5: ( (lv_method_2_0= ruleMethodSignature ) )
                    // InternalDart.g:1584:6: (lv_method_2_0= ruleMethodSignature )
                    {
                    // InternalDart.g:1584:6: (lv_method_2_0= ruleMethodSignature )
                    // InternalDart.g:1585:7: lv_method_2_0= ruleMethodSignature
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMemberDeclarationAccess().getMethodMethodSignatureParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_method_2_0=ruleMethodSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMemberDeclarationRule());
                      							}
                      							set(
                      								current,
                      								"method",
                      								lv_method_2_0,
                      								"it.lorenzodeluca.dart.Dart.MethodSignature");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDart.g:1602:5: ( (lv_body_3_0= ruleFunctionBody ) )
                    // InternalDart.g:1603:6: (lv_body_3_0= ruleFunctionBody )
                    {
                    // InternalDart.g:1603:6: (lv_body_3_0= ruleFunctionBody )
                    // InternalDart.g:1604:7: lv_body_3_0= ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMemberDeclarationAccess().getBodyFunctionBodyParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMemberDeclarationRule());
                      							}
                      							set(
                      								current,
                      								"body",
                      								lv_body_3_0,
                      								"it.lorenzodeluca.dart.Dart.FunctionBody");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:1623:4: ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' )
                    {
                    // InternalDart.g:1623:4: ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' )
                    // InternalDart.g:1624:5: ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';'
                    {
                    // InternalDart.g:1624:5: ( (lv_variable_4_0= ruleDeclaration ) )
                    // InternalDart.g:1625:6: (lv_variable_4_0= ruleDeclaration )
                    {
                    // InternalDart.g:1625:6: (lv_variable_4_0= ruleDeclaration )
                    // InternalDart.g:1626:7: lv_variable_4_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMemberDeclarationAccess().getVariableDeclarationParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    lv_variable_4_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMemberDeclarationRule());
                      							}
                      							set(
                      								current,
                      								"variable",
                      								lv_variable_4_0,
                      								"it.lorenzodeluca.dart.Dart.Declaration");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getMemberDeclarationAccess().getSemicolonKeyword_2_1_1());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, ruleMemberDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMemberDeclaration"


    // $ANTLR start "entryRuleMethodSignature"
    // InternalDart.g:1653:1: entryRuleMethodSignature returns [EObject current=null] : iv_ruleMethodSignature= ruleMethodSignature EOF ;
    public final EObject entryRuleMethodSignature() throws RecognitionException {
        EObject current = null;
        int entryRuleMethodSignature_StartIndex = input.index();
        EObject iv_ruleMethodSignature = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // InternalDart.g:1653:56: (iv_ruleMethodSignature= ruleMethodSignature EOF )
            // InternalDart.g:1654:2: iv_ruleMethodSignature= ruleMethodSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodSignature=ruleMethodSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodSignature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleMethodSignature_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodSignature"


    // $ANTLR start "ruleMethodSignature"
    // InternalDart.g:1660:1: ruleMethodSignature returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleType ) )? ( ( (lv_isOperator_1_0= 'operator' ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( ( (lv_isGetter_3_0= 'get' ) ) | ( (lv_isSetter_4_0= 'set' ) ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_parameters_6_0= ruleFormalParameterList ) )? ) ;
    public final EObject ruleMethodSignature() throws RecognitionException {
        EObject current = null;
        int ruleMethodSignature_StartIndex = input.index();
        Token lv_isOperator_1_0=null;
        Token lv_isGetter_3_0=null;
        Token lv_isSetter_4_0=null;
        Token lv_name_5_0=null;
        EObject lv_returnType_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // InternalDart.g:1666:2: ( ( ( (lv_returnType_0_0= ruleType ) )? ( ( (lv_isOperator_1_0= 'operator' ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( ( (lv_isGetter_3_0= 'get' ) ) | ( (lv_isSetter_4_0= 'set' ) ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_parameters_6_0= ruleFormalParameterList ) )? ) )
            // InternalDart.g:1667:2: ( ( (lv_returnType_0_0= ruleType ) )? ( ( (lv_isOperator_1_0= 'operator' ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( ( (lv_isGetter_3_0= 'get' ) ) | ( (lv_isSetter_4_0= 'set' ) ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_parameters_6_0= ruleFormalParameterList ) )? )
            {
            // InternalDart.g:1667:2: ( ( (lv_returnType_0_0= ruleType ) )? ( ( (lv_isOperator_1_0= 'operator' ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( ( (lv_isGetter_3_0= 'get' ) ) | ( (lv_isSetter_4_0= 'set' ) ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_parameters_6_0= ruleFormalParameterList ) )? )
            // InternalDart.g:1668:3: ( (lv_returnType_0_0= ruleType ) )? ( ( (lv_isOperator_1_0= 'operator' ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( ( (lv_isGetter_3_0= 'get' ) ) | ( (lv_isSetter_4_0= 'set' ) ) )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_parameters_6_0= ruleFormalParameterList ) )?
            {
            // InternalDart.g:1668:3: ( (lv_returnType_0_0= ruleType ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=122 && LA41_0<=124)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==RULE_ID||(LA41_2>=39 && LA41_2<=41)||LA41_2==60||LA41_2==66||LA41_2==80) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalDart.g:1669:4: (lv_returnType_0_0= ruleType )
                    {
                    // InternalDart.g:1669:4: (lv_returnType_0_0= ruleType )
                    // InternalDart.g:1670:5: lv_returnType_0_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodSignatureAccess().getReturnTypeTypeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
                    lv_returnType_0_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodSignatureRule());
                      					}
                      					set(
                      						current,
                      						"returnType",
                      						lv_returnType_0_0,
                      						"it.lorenzodeluca.dart.Dart.Type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1687:3: ( ( (lv_isOperator_1_0= 'operator' ) ) ( (lv_operator_2_0= ruleOperator ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDart.g:1688:4: ( (lv_isOperator_1_0= 'operator' ) ) ( (lv_operator_2_0= ruleOperator ) )
                    {
                    // InternalDart.g:1688:4: ( (lv_isOperator_1_0= 'operator' ) )
                    // InternalDart.g:1689:5: (lv_isOperator_1_0= 'operator' )
                    {
                    // InternalDart.g:1689:5: (lv_isOperator_1_0= 'operator' )
                    // InternalDart.g:1690:6: lv_isOperator_1_0= 'operator'
                    {
                    lv_isOperator_1_0=(Token)match(input,39,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isOperator_1_0, grammarAccess.getMethodSignatureAccess().getIsOperatorOperatorKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMethodSignatureRule());
                      						}
                      						setWithLastConsumed(current, "isOperator", lv_isOperator_1_0 != null, "operator");
                      					
                    }

                    }


                    }

                    // InternalDart.g:1702:4: ( (lv_operator_2_0= ruleOperator ) )
                    // InternalDart.g:1703:5: (lv_operator_2_0= ruleOperator )
                    {
                    // InternalDart.g:1703:5: (lv_operator_2_0= ruleOperator )
                    // InternalDart.g:1704:6: lv_operator_2_0= ruleOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodSignatureAccess().getOperatorOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_operator_2_0=ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodSignatureRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"it.lorenzodeluca.dart.Dart.Operator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDart.g:1722:3: ( ( (lv_isGetter_3_0= 'get' ) ) | ( (lv_isSetter_4_0= 'set' ) ) )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            else if ( (LA43_0==41) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // InternalDart.g:1723:4: ( (lv_isGetter_3_0= 'get' ) )
                    {
                    // InternalDart.g:1723:4: ( (lv_isGetter_3_0= 'get' ) )
                    // InternalDart.g:1724:5: (lv_isGetter_3_0= 'get' )
                    {
                    // InternalDart.g:1724:5: (lv_isGetter_3_0= 'get' )
                    // InternalDart.g:1725:6: lv_isGetter_3_0= 'get'
                    {
                    lv_isGetter_3_0=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isGetter_3_0, grammarAccess.getMethodSignatureAccess().getIsGetterGetKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMethodSignatureRule());
                      						}
                      						setWithLastConsumed(current, "isGetter", lv_isGetter_3_0 != null, "get");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:1738:4: ( (lv_isSetter_4_0= 'set' ) )
                    {
                    // InternalDart.g:1738:4: ( (lv_isSetter_4_0= 'set' ) )
                    // InternalDart.g:1739:5: (lv_isSetter_4_0= 'set' )
                    {
                    // InternalDart.g:1739:5: (lv_isSetter_4_0= 'set' )
                    // InternalDart.g:1740:6: lv_isSetter_4_0= 'set'
                    {
                    lv_isSetter_4_0=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isSetter_4_0, grammarAccess.getMethodSignatureAccess().getIsSetterSetKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMethodSignatureRule());
                      						}
                      						setWithLastConsumed(current, "isSetter", lv_isSetter_4_0 != null, "set");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDart.g:1753:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDart.g:1754:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDart.g:1754:4: (lv_name_5_0= RULE_ID )
            // InternalDart.g:1755:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_5_0, grammarAccess.getMethodSignatureAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodSignatureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_5_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:1771:3: ( (lv_parameters_6_0= ruleFormalParameterList ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDart.g:1772:4: (lv_parameters_6_0= ruleFormalParameterList )
                    {
                    // InternalDart.g:1772:4: (lv_parameters_6_0= ruleFormalParameterList )
                    // InternalDart.g:1773:5: lv_parameters_6_0= ruleFormalParameterList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodSignatureAccess().getParametersFormalParameterListParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_parameters_6_0=ruleFormalParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodSignatureRule());
                      					}
                      					set(
                      						current,
                      						"parameters",
                      						lv_parameters_6_0,
                      						"it.lorenzodeluca.dart.Dart.FormalParameterList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, ruleMethodSignature_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMethodSignature"


    // $ANTLR start "entryRuleDeclaration"
    // InternalDart.g:1794:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleDeclaration_StartIndex = input.index();
        EObject iv_ruleDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // InternalDart.g:1794:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalDart.g:1795:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDart.g:1801:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_isLate_1_0= 'late' ) )? ( ( (lv_isFinal_2_0= 'final' ) ) | ( (lv_isConst_3_0= 'const' ) ) )? ( (lv_type_4_0= ruleType ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleDeclaration_StartIndex = input.index();
        Token lv_isExternal_0_0=null;
        Token lv_isLate_1_0=null;
        Token lv_isFinal_2_0=null;
        Token lv_isConst_3_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_type_4_0 = null;

        EObject lv_initialValue_7_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // InternalDart.g:1807:2: ( ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_isLate_1_0= 'late' ) )? ( ( (lv_isFinal_2_0= 'final' ) ) | ( (lv_isConst_3_0= 'const' ) ) )? ( (lv_type_4_0= ruleType ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? ) )
            // InternalDart.g:1808:2: ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_isLate_1_0= 'late' ) )? ( ( (lv_isFinal_2_0= 'final' ) ) | ( (lv_isConst_3_0= 'const' ) ) )? ( (lv_type_4_0= ruleType ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? )
            {
            // InternalDart.g:1808:2: ( ( (lv_isExternal_0_0= 'external' ) )? ( (lv_isLate_1_0= 'late' ) )? ( ( (lv_isFinal_2_0= 'final' ) ) | ( (lv_isConst_3_0= 'const' ) ) )? ( (lv_type_4_0= ruleType ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? )
            // InternalDart.g:1809:3: ( (lv_isExternal_0_0= 'external' ) )? ( (lv_isLate_1_0= 'late' ) )? ( ( (lv_isFinal_2_0= 'final' ) ) | ( (lv_isConst_3_0= 'const' ) ) )? ( (lv_type_4_0= ruleType ) )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )?
            {
            // InternalDart.g:1809:3: ( (lv_isExternal_0_0= 'external' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==18) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDart.g:1810:4: (lv_isExternal_0_0= 'external' )
                    {
                    // InternalDart.g:1810:4: (lv_isExternal_0_0= 'external' )
                    // InternalDart.g:1811:5: lv_isExternal_0_0= 'external'
                    {
                    lv_isExternal_0_0=(Token)match(input,18,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isExternal_0_0, grammarAccess.getDeclarationAccess().getIsExternalExternalKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "isExternal", lv_isExternal_0_0 != null, "external");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1823:3: ( (lv_isLate_1_0= 'late' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDart.g:1824:4: (lv_isLate_1_0= 'late' )
                    {
                    // InternalDart.g:1824:4: (lv_isLate_1_0= 'late' )
                    // InternalDart.g:1825:5: lv_isLate_1_0= 'late'
                    {
                    lv_isLate_1_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isLate_1_0, grammarAccess.getDeclarationAccess().getIsLateLateKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDeclarationRule());
                      					}
                      					setWithLastConsumed(current, "isLate", lv_isLate_1_0 != null, "late");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1837:3: ( ( (lv_isFinal_2_0= 'final' ) ) | ( (lv_isConst_3_0= 'const' ) ) )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            else if ( (LA47_0==15) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // InternalDart.g:1838:4: ( (lv_isFinal_2_0= 'final' ) )
                    {
                    // InternalDart.g:1838:4: ( (lv_isFinal_2_0= 'final' ) )
                    // InternalDart.g:1839:5: (lv_isFinal_2_0= 'final' )
                    {
                    // InternalDart.g:1839:5: (lv_isFinal_2_0= 'final' )
                    // InternalDart.g:1840:6: lv_isFinal_2_0= 'final'
                    {
                    lv_isFinal_2_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isFinal_2_0, grammarAccess.getDeclarationAccess().getIsFinalFinalKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "isFinal", lv_isFinal_2_0 != null, "final");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:1853:4: ( (lv_isConst_3_0= 'const' ) )
                    {
                    // InternalDart.g:1853:4: ( (lv_isConst_3_0= 'const' ) )
                    // InternalDart.g:1854:5: (lv_isConst_3_0= 'const' )
                    {
                    // InternalDart.g:1854:5: (lv_isConst_3_0= 'const' )
                    // InternalDart.g:1855:6: lv_isConst_3_0= 'const'
                    {
                    lv_isConst_3_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isConst_3_0, grammarAccess.getDeclarationAccess().getIsConstConstKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "isConst", lv_isConst_3_0 != null, "const");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDart.g:1868:3: ( (lv_type_4_0= ruleType ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=122 && LA48_0<=124)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_ID) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID||LA48_2==60||LA48_2==66||LA48_2==80) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalDart.g:1869:4: (lv_type_4_0= ruleType )
                    {
                    // InternalDart.g:1869:4: (lv_type_4_0= ruleType )
                    // InternalDart.g:1870:5: lv_type_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    lv_type_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_4_0,
                      						"it.lorenzodeluca.dart.Dart.Type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:1887:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDart.g:1888:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDart.g:1888:4: (lv_name_5_0= RULE_ID )
            // InternalDart.g:1889:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_5_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_5_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:1905:3: (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==17) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDart.g:1906:4: otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalDart.g:1910:4: ( (lv_initialValue_7_0= ruleExpression ) )
                    // InternalDart.g:1911:5: (lv_initialValue_7_0= ruleExpression )
                    {
                    // InternalDart.g:1911:5: (lv_initialValue_7_0= ruleExpression )
                    // InternalDart.g:1912:6: lv_initialValue_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclarationAccess().getInitialValueExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_initialValue_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"initialValue",
                      							lv_initialValue_7_0,
                      							"it.lorenzodeluca.dart.Dart.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, ruleDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleOperator"
    // InternalDart.g:1934:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;
        int entryRuleOperator_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // InternalDart.g:1934:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalDart.g:1935:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalDart.g:1941:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '~' | kw= '==' | kw= '[]' | kw= '[]=' | kw= '*' | kw= '/' | kw= '%' | kw= '~/' | kw= '+' | kw= '-' | kw= '<<' | kw= '>>>' | kw= '>>' | kw= '&' | kw= '^' | kw= '|' | kw= '>=' | kw= '>' | kw= '<=' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOperator_StartIndex = input.index();
        Token kw=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // InternalDart.g:1947:2: ( (kw= '~' | kw= '==' | kw= '[]' | kw= '[]=' | kw= '*' | kw= '/' | kw= '%' | kw= '~/' | kw= '+' | kw= '-' | kw= '<<' | kw= '>>>' | kw= '>>' | kw= '&' | kw= '^' | kw= '|' | kw= '>=' | kw= '>' | kw= '<=' | kw= '<' ) )
            // InternalDart.g:1948:2: (kw= '~' | kw= '==' | kw= '[]' | kw= '[]=' | kw= '*' | kw= '/' | kw= '%' | kw= '~/' | kw= '+' | kw= '-' | kw= '<<' | kw= '>>>' | kw= '>>' | kw= '&' | kw= '^' | kw= '|' | kw= '>=' | kw= '>' | kw= '<=' | kw= '<' )
            {
            // InternalDart.g:1948:2: (kw= '~' | kw= '==' | kw= '[]' | kw= '[]=' | kw= '*' | kw= '/' | kw= '%' | kw= '~/' | kw= '+' | kw= '-' | kw= '<<' | kw= '>>>' | kw= '>>' | kw= '&' | kw= '^' | kw= '|' | kw= '>=' | kw= '>' | kw= '<=' | kw= '<' )
            int alt50=20;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt50=1;
                }
                break;
            case 43:
                {
                alt50=2;
                }
                break;
            case 44:
                {
                alt50=3;
                }
                break;
            case 45:
                {
                alt50=4;
                }
                break;
            case 31:
                {
                alt50=5;
                }
                break;
            case 46:
                {
                alt50=6;
                }
                break;
            case 47:
                {
                alt50=7;
                }
                break;
            case 48:
                {
                alt50=8;
                }
                break;
            case 49:
                {
                alt50=9;
                }
                break;
            case 50:
                {
                alt50=10;
                }
                break;
            case 51:
                {
                alt50=11;
                }
                break;
            case 52:
                {
                alt50=12;
                }
                break;
            case 53:
                {
                alt50=13;
                }
                break;
            case 54:
                {
                alt50=14;
                }
                break;
            case 55:
                {
                alt50=15;
                }
                break;
            case 56:
                {
                alt50=16;
                }
                break;
            case 57:
                {
                alt50=17;
                }
                break;
            case 58:
                {
                alt50=18;
                }
                break;
            case 59:
                {
                alt50=19;
                }
                break;
            case 60:
                {
                alt50=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDart.g:1949:3: kw= '~'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getTildeKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:1955:3: kw= '=='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDart.g:1961:3: kw= '[]'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDart.g:1967:3: kw= '[]='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLeftSquareBracketRightSquareBracketEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDart.g:1973:3: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDart.g:1979:3: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDart.g:1985:3: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getPercentSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalDart.g:1991:3: kw= '~/'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getTildeSolidusKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalDart.g:1997:3: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalDart.g:2003:3: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalDart.g:2009:3: kw= '<<'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignLessThanSignKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalDart.g:2015:3: kw= '>>>'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalDart.g:2021:3: kw= '>>'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalDart.g:2027:3: kw= '&'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getAmpersandKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalDart.g:2033:3: kw= '^'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getCircumflexAccentKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalDart.g:2039:3: kw= '|'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getVerticalLineKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalDart.g:2045:3: kw= '>='
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalDart.g:2051:3: kw= '>'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalDart.g:2057:3: kw= '<='
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalDart.g:2063:3: kw= '<'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_19());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, ruleOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleMixinDeclaration"
    // InternalDart.g:2072:1: entryRuleMixinDeclaration returns [EObject current=null] : iv_ruleMixinDeclaration= ruleMixinDeclaration EOF ;
    public final EObject entryRuleMixinDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleMixinDeclaration_StartIndex = input.index();
        EObject iv_ruleMixinDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // InternalDart.g:2072:57: (iv_ruleMixinDeclaration= ruleMixinDeclaration EOF )
            // InternalDart.g:2073:2: iv_ruleMixinDeclaration= ruleMixinDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMixinDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMixinDeclaration=ruleMixinDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMixinDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleMixinDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMixinDeclaration"


    // $ANTLR start "ruleMixinDeclaration"
    // InternalDart.g:2079:1: ruleMixinDeclaration returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typeParameters_2_0= ruleTypeParameters ) )? (otherlv_3= 'on' ( (lv_onTypes_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )* )? ( (lv_interfaces_7_0= ruleInterfaces ) )? otherlv_8= '{' ( (lv_members_9_0= ruleMemberDeclaration ) )* otherlv_10= '}' ) ;
    public final EObject ruleMixinDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleMixinDeclaration_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_typeParameters_2_0 = null;

        EObject lv_onTypes_4_0 = null;

        EObject lv_onTypes_6_0 = null;

        EObject lv_interfaces_7_0 = null;

        EObject lv_members_9_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // InternalDart.g:2085:2: ( (otherlv_0= 'mixin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typeParameters_2_0= ruleTypeParameters ) )? (otherlv_3= 'on' ( (lv_onTypes_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )* )? ( (lv_interfaces_7_0= ruleInterfaces ) )? otherlv_8= '{' ( (lv_members_9_0= ruleMemberDeclaration ) )* otherlv_10= '}' ) )
            // InternalDart.g:2086:2: (otherlv_0= 'mixin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typeParameters_2_0= ruleTypeParameters ) )? (otherlv_3= 'on' ( (lv_onTypes_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )* )? ( (lv_interfaces_7_0= ruleInterfaces ) )? otherlv_8= '{' ( (lv_members_9_0= ruleMemberDeclaration ) )* otherlv_10= '}' )
            {
            // InternalDart.g:2086:2: (otherlv_0= 'mixin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typeParameters_2_0= ruleTypeParameters ) )? (otherlv_3= 'on' ( (lv_onTypes_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )* )? ( (lv_interfaces_7_0= ruleInterfaces ) )? otherlv_8= '{' ( (lv_members_9_0= ruleMemberDeclaration ) )* otherlv_10= '}' )
            // InternalDart.g:2087:3: otherlv_0= 'mixin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_typeParameters_2_0= ruleTypeParameters ) )? (otherlv_3= 'on' ( (lv_onTypes_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )* )? ( (lv_interfaces_7_0= ruleInterfaces ) )? otherlv_8= '{' ( (lv_members_9_0= ruleMemberDeclaration ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMixinDeclarationAccess().getMixinKeyword_0());
              		
            }
            // InternalDart.g:2091:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDart.g:2092:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDart.g:2092:4: (lv_name_1_0= RULE_ID )
            // InternalDart.g:2093:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMixinDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMixinDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:2109:3: ( (lv_typeParameters_2_0= ruleTypeParameters ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDart.g:2110:4: (lv_typeParameters_2_0= ruleTypeParameters )
                    {
                    // InternalDart.g:2110:4: (lv_typeParameters_2_0= ruleTypeParameters )
                    // InternalDart.g:2111:5: lv_typeParameters_2_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMixinDeclarationAccess().getTypeParametersTypeParametersParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_37);
                    lv_typeParameters_2_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMixinDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"typeParameters",
                      						lv_typeParameters_2_0,
                      						"it.lorenzodeluca.dart.Dart.TypeParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:2128:3: (otherlv_3= 'on' ( (lv_onTypes_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDart.g:2129:4: otherlv_3= 'on' ( (lv_onTypes_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )*
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMixinDeclarationAccess().getOnKeyword_3_0());
                      			
                    }
                    // InternalDart.g:2133:4: ( (lv_onTypes_4_0= ruleType ) )
                    // InternalDart.g:2134:5: (lv_onTypes_4_0= ruleType )
                    {
                    // InternalDart.g:2134:5: (lv_onTypes_4_0= ruleType )
                    // InternalDart.g:2135:6: lv_onTypes_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMixinDeclarationAccess().getOnTypesTypeParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_onTypes_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMixinDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"onTypes",
                      							lv_onTypes_4_0,
                      							"it.lorenzodeluca.dart.Dart.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:2152:4: (otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalDart.g:2153:5: otherlv_5= ',' ( (lv_onTypes_6_0= ruleType ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getMixinDeclarationAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalDart.g:2157:5: ( (lv_onTypes_6_0= ruleType ) )
                    	    // InternalDart.g:2158:6: (lv_onTypes_6_0= ruleType )
                    	    {
                    	    // InternalDart.g:2158:6: (lv_onTypes_6_0= ruleType )
                    	    // InternalDart.g:2159:7: lv_onTypes_6_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMixinDeclarationAccess().getOnTypesTypeParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    lv_onTypes_6_0=ruleType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMixinDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"onTypes",
                    	      								lv_onTypes_6_0,
                    	      								"it.lorenzodeluca.dart.Dart.Type");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDart.g:2178:3: ( (lv_interfaces_7_0= ruleInterfaces ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==37) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDart.g:2179:4: (lv_interfaces_7_0= ruleInterfaces )
                    {
                    // InternalDart.g:2179:4: (lv_interfaces_7_0= ruleInterfaces )
                    // InternalDart.g:2180:5: lv_interfaces_7_0= ruleInterfaces
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMixinDeclarationAccess().getInterfacesInterfacesParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    lv_interfaces_7_0=ruleInterfaces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMixinDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"interfaces",
                      						lv_interfaces_7_0,
                      						"it.lorenzodeluca.dart.Dart.Interfaces");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getMixinDeclarationAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDart.g:2201:3: ( (lv_members_9_0= ruleMemberDeclaration ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID||LA55_0==12||(LA55_0>=14 && LA55_0<=15)||LA55_0==18||(LA55_0>=38 && LA55_0<=41)||LA55_0==65||(LA55_0>=122 && LA55_0<=124)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalDart.g:2202:4: (lv_members_9_0= ruleMemberDeclaration )
            	    {
            	    // InternalDart.g:2202:4: (lv_members_9_0= ruleMemberDeclaration )
            	    // InternalDart.g:2203:5: lv_members_9_0= ruleMemberDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMixinDeclarationAccess().getMembersMemberDeclarationParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_members_9_0=ruleMemberDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMixinDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_9_0,
            	      						"it.lorenzodeluca.dart.Dart.MemberDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_10=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getMixinDeclarationAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, ruleMixinDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMixinDeclaration"


    // $ANTLR start "entryRuleMixinApplicationClass"
    // InternalDart.g:2228:1: entryRuleMixinApplicationClass returns [EObject current=null] : iv_ruleMixinApplicationClass= ruleMixinApplicationClass EOF ;
    public final EObject entryRuleMixinApplicationClass() throws RecognitionException {
        EObject current = null;
        int entryRuleMixinApplicationClass_StartIndex = input.index();
        EObject iv_ruleMixinApplicationClass = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // InternalDart.g:2228:62: (iv_ruleMixinApplicationClass= ruleMixinApplicationClass EOF )
            // InternalDart.g:2229:2: iv_ruleMixinApplicationClass= ruleMixinApplicationClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMixinApplicationClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMixinApplicationClass=ruleMixinApplicationClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMixinApplicationClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleMixinApplicationClass_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMixinApplicationClass"


    // $ANTLR start "ruleMixinApplicationClass"
    // InternalDart.g:2235:1: ruleMixinApplicationClass returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeParameters_1_0= ruleTypeParameters ) )? otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ( (lv_mixins_4_0= ruleMixins ) ) ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= ';' ) ;
    public final EObject ruleMixinApplicationClass() throws RecognitionException {
        EObject current = null;
        int ruleMixinApplicationClass_StartIndex = input.index();
        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_typeParameters_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_mixins_4_0 = null;

        EObject lv_interfaces_5_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // InternalDart.g:2241:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeParameters_1_0= ruleTypeParameters ) )? otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ( (lv_mixins_4_0= ruleMixins ) ) ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= ';' ) )
            // InternalDart.g:2242:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeParameters_1_0= ruleTypeParameters ) )? otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ( (lv_mixins_4_0= ruleMixins ) ) ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= ';' )
            {
            // InternalDart.g:2242:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeParameters_1_0= ruleTypeParameters ) )? otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ( (lv_mixins_4_0= ruleMixins ) ) ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= ';' )
            // InternalDart.g:2243:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeParameters_1_0= ruleTypeParameters ) )? otherlv_2= '=' ( (lv_type_3_0= ruleType ) ) ( (lv_mixins_4_0= ruleMixins ) ) ( (lv_interfaces_5_0= ruleInterfaces ) )? otherlv_6= ';'
            {
            // InternalDart.g:2243:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDart.g:2244:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDart.g:2244:4: (lv_name_0_0= RULE_ID )
            // InternalDart.g:2245:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMixinApplicationClassAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMixinApplicationClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:2261:3: ( (lv_typeParameters_1_0= ruleTypeParameters ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==60) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDart.g:2262:4: (lv_typeParameters_1_0= ruleTypeParameters )
                    {
                    // InternalDart.g:2262:4: (lv_typeParameters_1_0= ruleTypeParameters )
                    // InternalDart.g:2263:5: lv_typeParameters_1_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMixinApplicationClassAccess().getTypeParametersTypeParametersParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_40);
                    lv_typeParameters_1_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMixinApplicationClassRule());
                      					}
                      					set(
                      						current,
                      						"typeParameters",
                      						lv_typeParameters_1_0,
                      						"it.lorenzodeluca.dart.Dart.TypeParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMixinApplicationClassAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalDart.g:2284:3: ( (lv_type_3_0= ruleType ) )
            // InternalDart.g:2285:4: (lv_type_3_0= ruleType )
            {
            // InternalDart.g:2285:4: (lv_type_3_0= ruleType )
            // InternalDart.g:2286:5: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMixinApplicationClassAccess().getTypeTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMixinApplicationClassRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"it.lorenzodeluca.dart.Dart.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:2303:3: ( (lv_mixins_4_0= ruleMixins ) )
            // InternalDart.g:2304:4: (lv_mixins_4_0= ruleMixins )
            {
            // InternalDart.g:2304:4: (lv_mixins_4_0= ruleMixins )
            // InternalDart.g:2305:5: lv_mixins_4_0= ruleMixins
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMixinApplicationClassAccess().getMixinsMixinsParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_mixins_4_0=ruleMixins();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMixinApplicationClassRule());
              					}
              					set(
              						current,
              						"mixins",
              						lv_mixins_4_0,
              						"it.lorenzodeluca.dart.Dart.Mixins");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:2322:3: ( (lv_interfaces_5_0= ruleInterfaces ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDart.g:2323:4: (lv_interfaces_5_0= ruleInterfaces )
                    {
                    // InternalDart.g:2323:4: (lv_interfaces_5_0= ruleInterfaces )
                    // InternalDart.g:2324:5: lv_interfaces_5_0= ruleInterfaces
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMixinApplicationClassAccess().getInterfacesInterfacesParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
                    lv_interfaces_5_0=ruleInterfaces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMixinApplicationClassRule());
                      					}
                      					set(
                      						current,
                      						"interfaces",
                      						lv_interfaces_5_0,
                      						"it.lorenzodeluca.dart.Dart.Interfaces");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMixinApplicationClassAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, ruleMixinApplicationClass_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMixinApplicationClass"


    // $ANTLR start "entryRuleExtensionDeclaration"
    // InternalDart.g:2349:1: entryRuleExtensionDeclaration returns [EObject current=null] : iv_ruleExtensionDeclaration= ruleExtensionDeclaration EOF ;
    public final EObject entryRuleExtensionDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleExtensionDeclaration_StartIndex = input.index();
        EObject iv_ruleExtensionDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // InternalDart.g:2349:61: (iv_ruleExtensionDeclaration= ruleExtensionDeclaration EOF )
            // InternalDart.g:2350:2: iv_ruleExtensionDeclaration= ruleExtensionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtensionDeclaration=ruleExtensionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtensionDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleExtensionDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensionDeclaration"


    // $ANTLR start "ruleExtensionDeclaration"
    // InternalDart.g:2356:1: ruleExtensionDeclaration returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) )? ( (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= 'on' ( (lv_onType_4_0= ruleType ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMemberDeclaration ) )* otherlv_7= '}' ) ;
    public final EObject ruleExtensionDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleExtensionDeclaration_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_typeParameters_2_0 = null;

        EObject lv_onType_4_0 = null;

        EObject lv_members_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // InternalDart.g:2362:2: ( (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) )? ( (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= 'on' ( (lv_onType_4_0= ruleType ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMemberDeclaration ) )* otherlv_7= '}' ) )
            // InternalDart.g:2363:2: (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) )? ( (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= 'on' ( (lv_onType_4_0= ruleType ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMemberDeclaration ) )* otherlv_7= '}' )
            {
            // InternalDart.g:2363:2: (otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) )? ( (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= 'on' ( (lv_onType_4_0= ruleType ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMemberDeclaration ) )* otherlv_7= '}' )
            // InternalDart.g:2364:3: otherlv_0= 'extension' ( (lv_name_1_0= RULE_ID ) )? ( (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= 'on' ( (lv_onType_4_0= ruleType ) ) otherlv_5= '{' ( (lv_members_6_0= ruleMemberDeclaration ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExtensionDeclarationAccess().getExtensionKeyword_0());
              		
            }
            // InternalDart.g:2368:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDart.g:2369:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDart.g:2369:4: (lv_name_1_0= RULE_ID )
                    // InternalDart.g:2370:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getExtensionDeclarationAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExtensionDeclarationRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:2386:3: ( (lv_typeParameters_2_0= ruleTypeParameters ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDart.g:2387:4: (lv_typeParameters_2_0= ruleTypeParameters )
                    {
                    // InternalDart.g:2387:4: (lv_typeParameters_2_0= ruleTypeParameters )
                    // InternalDart.g:2388:5: lv_typeParameters_2_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExtensionDeclarationAccess().getTypeParametersTypeParametersParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_45);
                    lv_typeParameters_2_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExtensionDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"typeParameters",
                      						lv_typeParameters_2_0,
                      						"it.lorenzodeluca.dart.Dart.TypeParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExtensionDeclarationAccess().getOnKeyword_3());
              		
            }
            // InternalDart.g:2409:3: ( (lv_onType_4_0= ruleType ) )
            // InternalDart.g:2410:4: (lv_onType_4_0= ruleType )
            {
            // InternalDart.g:2410:4: (lv_onType_4_0= ruleType )
            // InternalDart.g:2411:5: lv_onType_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExtensionDeclarationAccess().getOnTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_onType_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExtensionDeclarationRule());
              					}
              					set(
              						current,
              						"onType",
              						lv_onType_4_0,
              						"it.lorenzodeluca.dart.Dart.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getExtensionDeclarationAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalDart.g:2432:3: ( (lv_members_6_0= ruleMemberDeclaration ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID||LA60_0==12||(LA60_0>=14 && LA60_0<=15)||LA60_0==18||(LA60_0>=38 && LA60_0<=41)||LA60_0==65||(LA60_0>=122 && LA60_0<=124)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalDart.g:2433:4: (lv_members_6_0= ruleMemberDeclaration )
            	    {
            	    // InternalDart.g:2433:4: (lv_members_6_0= ruleMemberDeclaration )
            	    // InternalDart.g:2434:5: lv_members_6_0= ruleMemberDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getExtensionDeclarationAccess().getMembersMemberDeclarationParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_members_6_0=ruleMemberDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getExtensionDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_6_0,
            	      						"it.lorenzodeluca.dart.Dart.MemberDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getExtensionDeclarationAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ruleExtensionDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtensionDeclaration"


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalDart.g:2459:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleEnumDeclaration_StartIndex = input.index();
        EObject iv_ruleEnumDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // InternalDart.g:2459:56: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // InternalDart.g:2460:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleEnumDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalDart.g:2466:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleEnumEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleEnumEntry ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleEnumDeclaration_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_entries_3_0 = null;

        EObject lv_entries_5_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // InternalDart.g:2472:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleEnumEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleEnumEntry ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // InternalDart.g:2473:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleEnumEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleEnumEntry ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // InternalDart.g:2473:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleEnumEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleEnumEntry ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // InternalDart.g:2474:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleEnumEntry ) ) (otherlv_4= ',' ( (lv_entries_5_0= ruleEnumEntry ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0());
              		
            }
            // InternalDart.g:2478:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDart.g:2479:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDart.g:2479:4: (lv_name_1_0= RULE_ID )
            // InternalDart.g:2480:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalDart.g:2500:3: ( (lv_entries_3_0= ruleEnumEntry ) )
            // InternalDart.g:2501:4: (lv_entries_3_0= ruleEnumEntry )
            {
            // InternalDart.g:2501:4: (lv_entries_3_0= ruleEnumEntry )
            // InternalDart.g:2502:5: lv_entries_3_0= ruleEnumEntry
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDeclarationAccess().getEntriesEnumEntryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_entries_3_0=ruleEnumEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
              					}
              					add(
              						current,
              						"entries",
              						lv_entries_3_0,
              						"it.lorenzodeluca.dart.Dart.EnumEntry");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:2519:3: (otherlv_4= ',' ( (lv_entries_5_0= ruleEnumEntry ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==16) ) {
                    int LA61_1 = input.LA(2);

                    if ( (LA61_1==RULE_ID||LA61_1==65) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // InternalDart.g:2520:4: otherlv_4= ',' ( (lv_entries_5_0= ruleEnumEntry ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDart.g:2524:4: ( (lv_entries_5_0= ruleEnumEntry ) )
            	    // InternalDart.g:2525:5: (lv_entries_5_0= ruleEnumEntry )
            	    {
            	    // InternalDart.g:2525:5: (lv_entries_5_0= ruleEnumEntry )
            	    // InternalDart.g:2526:6: lv_entries_5_0= ruleEnumEntry
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumDeclarationAccess().getEntriesEnumEntryParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_entries_5_0=ruleEnumEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"entries",
            	      							lv_entries_5_0,
            	      							"it.lorenzodeluca.dart.Dart.EnumEntry");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // InternalDart.g:2544:3: (otherlv_6= ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==16) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDart.g:2545:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_5());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, ruleEnumDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleEnumEntry"
    // InternalDart.g:2558:1: entryRuleEnumEntry returns [EObject current=null] : iv_ruleEnumEntry= ruleEnumEntry EOF ;
    public final EObject entryRuleEnumEntry() throws RecognitionException {
        EObject current = null;
        int entryRuleEnumEntry_StartIndex = input.index();
        EObject iv_ruleEnumEntry = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // InternalDart.g:2558:50: (iv_ruleEnumEntry= ruleEnumEntry EOF )
            // InternalDart.g:2559:2: iv_ruleEnumEntry= ruleEnumEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumEntry=ruleEnumEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleEnumEntry_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumEntry"


    // $ANTLR start "ruleEnumEntry"
    // InternalDart.g:2565:1: ruleEnumEntry returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumEntry() throws RecognitionException {
        EObject current = null;
        int ruleEnumEntry_StartIndex = input.index();
        Token lv_name_1_0=null;
        EObject lv_metadata_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // InternalDart.g:2571:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDart.g:2572:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDart.g:2572:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDart.g:2573:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalDart.g:2573:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==65) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalDart.g:2574:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:2574:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:2575:5: lv_metadata_0_0= ruleMetadata
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumEntryAccess().getMetadataMetadataParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumEntryRule());
            	      					}
            	      					add(
            	      						current,
            	      						"metadata",
            	      						lv_metadata_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Metadata");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalDart.g:2592:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDart.g:2593:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDart.g:2593:4: (lv_name_1_0= RULE_ID )
            // InternalDart.g:2594:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumEntryAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumEntryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, ruleEnumEntry_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEnumEntry"


    // $ANTLR start "entryRuleTypeParameters"
    // InternalDart.g:2614:1: entryRuleTypeParameters returns [EObject current=null] : iv_ruleTypeParameters= ruleTypeParameters EOF ;
    public final EObject entryRuleTypeParameters() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeParameters_StartIndex = input.index();
        EObject iv_ruleTypeParameters = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // InternalDart.g:2614:55: (iv_ruleTypeParameters= ruleTypeParameters EOF )
            // InternalDart.g:2615:2: iv_ruleTypeParameters= ruleTypeParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeParameters=ruleTypeParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleTypeParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameters"


    // $ANTLR start "ruleTypeParameters"
    // InternalDart.g:2621:1: ruleTypeParameters returns [EObject current=null] : (otherlv_0= '<' ( (lv_parameters_1_0= ruleTypeParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleTypeParameter ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeParameters() throws RecognitionException {
        EObject current = null;
        int ruleTypeParameters_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // InternalDart.g:2627:2: ( (otherlv_0= '<' ( (lv_parameters_1_0= ruleTypeParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleTypeParameter ) ) )* otherlv_4= '>' ) )
            // InternalDart.g:2628:2: (otherlv_0= '<' ( (lv_parameters_1_0= ruleTypeParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleTypeParameter ) ) )* otherlv_4= '>' )
            {
            // InternalDart.g:2628:2: (otherlv_0= '<' ( (lv_parameters_1_0= ruleTypeParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleTypeParameter ) ) )* otherlv_4= '>' )
            // InternalDart.g:2629:3: otherlv_0= '<' ( (lv_parameters_1_0= ruleTypeParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleTypeParameter ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeParametersAccess().getLessThanSignKeyword_0());
              		
            }
            // InternalDart.g:2633:3: ( (lv_parameters_1_0= ruleTypeParameter ) )
            // InternalDart.g:2634:4: (lv_parameters_1_0= ruleTypeParameter )
            {
            // InternalDart.g:2634:4: (lv_parameters_1_0= ruleTypeParameter )
            // InternalDart.g:2635:5: lv_parameters_1_0= ruleTypeParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeParametersAccess().getParametersTypeParameterParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_parameters_1_0=ruleTypeParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeParametersRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_1_0,
              						"it.lorenzodeluca.dart.Dart.TypeParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:2652:3: (otherlv_2= ',' ( (lv_parameters_3_0= ruleTypeParameter ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==16) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalDart.g:2653:4: otherlv_2= ',' ( (lv_parameters_3_0= ruleTypeParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getTypeParametersAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalDart.g:2657:4: ( (lv_parameters_3_0= ruleTypeParameter ) )
            	    // InternalDart.g:2658:5: (lv_parameters_3_0= ruleTypeParameter )
            	    {
            	    // InternalDart.g:2658:5: (lv_parameters_3_0= ruleTypeParameter )
            	    // InternalDart.g:2659:6: lv_parameters_3_0= ruleTypeParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypeParametersAccess().getParametersTypeParameterParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_parameters_3_0=ruleTypeParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTypeParametersRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_3_0,
            	      							"it.lorenzodeluca.dart.Dart.TypeParameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypeParametersAccess().getGreaterThanSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, ruleTypeParameters_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeParameters"


    // $ANTLR start "entryRuleTypeParameter"
    // InternalDart.g:2685:1: entryRuleTypeParameter returns [EObject current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final EObject entryRuleTypeParameter() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeParameter_StartIndex = input.index();
        EObject iv_ruleTypeParameter = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // InternalDart.g:2685:54: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // InternalDart.g:2686:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleTypeParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameter"


    // $ANTLR start "ruleTypeParameter"
    // InternalDart.g:2692:1: ruleTypeParameter returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_bound_3_0= ruleType ) ) )? ) ;
    public final EObject ruleTypeParameter() throws RecognitionException {
        EObject current = null;
        int ruleTypeParameter_StartIndex = input.index();
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_metadata_0_0 = null;

        EObject lv_bound_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // InternalDart.g:2698:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_bound_3_0= ruleType ) ) )? ) )
            // InternalDart.g:2699:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_bound_3_0= ruleType ) ) )? )
            {
            // InternalDart.g:2699:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_bound_3_0= ruleType ) ) )? )
            // InternalDart.g:2700:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_bound_3_0= ruleType ) ) )?
            {
            // InternalDart.g:2700:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==65) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalDart.g:2701:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:2701:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:2702:5: lv_metadata_0_0= ruleMetadata
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypeParameterAccess().getMetadataMetadataParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTypeParameterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"metadata",
            	      						lv_metadata_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Metadata");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // InternalDart.g:2719:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDart.g:2720:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDart.g:2720:4: (lv_name_1_0= RULE_ID )
            // InternalDart.g:2721:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTypeParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:2737:3: (otherlv_2= 'extends' ( (lv_bound_3_0= ruleType ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==35) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDart.g:2738:4: otherlv_2= 'extends' ( (lv_bound_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTypeParameterAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalDart.g:2742:4: ( (lv_bound_3_0= ruleType ) )
                    // InternalDart.g:2743:5: (lv_bound_3_0= ruleType )
                    {
                    // InternalDart.g:2743:5: (lv_bound_3_0= ruleType )
                    // InternalDart.g:2744:6: lv_bound_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeParameterAccess().getBoundTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_bound_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeParameterRule());
                      						}
                      						set(
                      							current,
                      							"bound",
                      							lv_bound_3_0,
                      							"it.lorenzodeluca.dart.Dart.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, ruleTypeParameter_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleMetadata"
    // InternalDart.g:2766:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;
        int entryRuleMetadata_StartIndex = input.index();
        EObject iv_ruleMetadata = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // InternalDart.g:2766:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalDart.g:2767:2: iv_ruleMetadata= ruleMetadata EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetadataRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetadata; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleMetadata_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalDart.g:2773:1: ruleMetadata returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '.' ( (lv_constructor_3_0= RULE_ID ) ) )? ( (lv_arguments_4_0= ruleArguments ) )? ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;
        int ruleMetadata_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_constructor_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // InternalDart.g:2779:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '.' ( (lv_constructor_3_0= RULE_ID ) ) )? ( (lv_arguments_4_0= ruleArguments ) )? ) )
            // InternalDart.g:2780:2: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '.' ( (lv_constructor_3_0= RULE_ID ) ) )? ( (lv_arguments_4_0= ruleArguments ) )? )
            {
            // InternalDart.g:2780:2: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '.' ( (lv_constructor_3_0= RULE_ID ) ) )? ( (lv_arguments_4_0= ruleArguments ) )? )
            // InternalDart.g:2781:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '.' ( (lv_constructor_3_0= RULE_ID ) ) )? ( (lv_arguments_4_0= ruleArguments ) )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalDart.g:2785:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDart.g:2786:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDart.g:2786:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDart.g:2787:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetadataAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetadataRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"it.lorenzodeluca.dart.Dart.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:2804:3: (otherlv_2= '.' ( (lv_constructor_3_0= RULE_ID ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==66) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDart.g:2805:4: otherlv_2= '.' ( (lv_constructor_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalDart.g:2809:4: ( (lv_constructor_3_0= RULE_ID ) )
                    // InternalDart.g:2810:5: (lv_constructor_3_0= RULE_ID )
                    {
                    // InternalDart.g:2810:5: (lv_constructor_3_0= RULE_ID )
                    // InternalDart.g:2811:6: lv_constructor_3_0= RULE_ID
                    {
                    lv_constructor_3_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_constructor_3_0, grammarAccess.getMetadataAccess().getConstructorIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetadataRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"constructor",
                      							lv_constructor_3_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDart.g:2828:3: ( (lv_arguments_4_0= ruleArguments ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==20) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDart.g:2829:4: (lv_arguments_4_0= ruleArguments )
                    {
                    // InternalDart.g:2829:4: (lv_arguments_4_0= ruleArguments )
                    // InternalDart.g:2830:5: lv_arguments_4_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMetadataAccess().getArgumentsArgumentsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arguments_4_0=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMetadataRule());
                      					}
                      					set(
                      						current,
                      						"arguments",
                      						lv_arguments_4_0,
                      						"it.lorenzodeluca.dart.Dart.Arguments");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, ruleMetadata_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDart.g:2851:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;
        int entryRuleQualifiedName_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // InternalDart.g:2851:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDart.g:2852:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleQualifiedName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDart.g:2858:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleQualifiedName_StartIndex = input.index();
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // InternalDart.g:2864:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDart.g:2865:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDart.g:2865:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDart.g:2866:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDart.g:2873:3: (kw= '.' this_ID_2= RULE_ID )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==66) ) {
                    int LA69_1 = input.LA(2);

                    if ( (LA69_1==RULE_ID) ) {
                        int LA69_3 = input.LA(3);

                        if ( (synpred92_InternalDart()) ) {
                            alt69=1;
                        }


                    }


                }


                switch (alt69) {
            	case 1 :
            	    // InternalDart.g:2874:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, ruleQualifiedName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleArguments"
    // InternalDart.g:2891:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;
        int entryRuleArguments_StartIndex = input.index();
        EObject iv_ruleArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // InternalDart.g:2891:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalDart.g:2892:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalDart.g:2898:1: ruleArguments returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;
        int ruleArguments_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // InternalDart.g:2904:2: ( ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalDart.g:2905:2: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalDart.g:2905:2: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalDart.g:2906:3: () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalDart.g:2906:3: ()
            // InternalDart.g:2907:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArgumentsAccess().getArgumentsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDart.g:2920:3: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_STRING)||LA71_0==15||LA71_0==20||LA71_0==23||LA71_0==25||LA71_0==42||LA71_0==50||LA71_0==60||(LA71_0>=87 && LA71_0<=96)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDart.g:2921:4: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // InternalDart.g:2921:4: ( (lv_arguments_2_0= ruleExpression ) )
                    // InternalDart.g:2922:5: (lv_arguments_2_0= ruleExpression )
                    {
                    // InternalDart.g:2922:5: (lv_arguments_2_0= ruleExpression )
                    // InternalDart.g:2923:6: lv_arguments_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_arguments_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArgumentsRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"it.lorenzodeluca.dart.Dart.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:2940:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==16) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalDart.g:2941:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDart.g:2945:5: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // InternalDart.g:2946:6: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // InternalDart.g:2946:6: (lv_arguments_4_0= ruleExpression )
                    	    // InternalDart.g:2947:7: lv_arguments_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_arguments_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"it.lorenzodeluca.dart.Dart.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, ruleArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleExpression"
    // InternalDart.g:2974:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleExpression_StartIndex = input.index();
        EObject iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // InternalDart.g:2974:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDart.g:2975:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDart.g:2981:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;
        int ruleExpression_StartIndex = input.index();
        EObject this_AssignmentExpression_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // InternalDart.g:2987:2: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // InternalDart.g:2988:2: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_AssignmentExpression_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_AssignmentExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // InternalDart.g:3002:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAssignmentExpression_StartIndex = input.index();
        EObject iv_ruleAssignmentExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // InternalDart.g:3002:61: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // InternalDart.g:3003:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleAssignmentExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // InternalDart.g:3009:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_right_3_0= ruleAssignmentExpression ) ) )? ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;
        int ruleAssignmentExpression_StartIndex = input.index();
        EObject this_ConditionalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // InternalDart.g:3015:2: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_right_3_0= ruleAssignmentExpression ) ) )? ) )
            // InternalDart.g:3016:2: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_right_3_0= ruleAssignmentExpression ) ) )? )
            {
            // InternalDart.g:3016:2: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_right_3_0= ruleAssignmentExpression ) ) )? )
            // InternalDart.g:3017:3: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_right_3_0= ruleAssignmentExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConditionalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3028:3: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_right_3_0= ruleAssignmentExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==17||(LA72_0>=67 && LA72_0<=79)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDart.g:3029:4: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_right_3_0= ruleAssignmentExpression ) )
                    {
                    // InternalDart.g:3029:4: ()
                    // InternalDart.g:3030:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getAssignmentExpressionAccess().getAssignmentLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDart.g:3039:4: ( (lv_operator_2_0= ruleAssignmentOperator ) )
                    // InternalDart.g:3040:5: (lv_operator_2_0= ruleAssignmentOperator )
                    {
                    // InternalDart.g:3040:5: (lv_operator_2_0= ruleAssignmentOperator )
                    // InternalDart.g:3041:6: lv_operator_2_0= ruleAssignmentOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_operator_2_0=ruleAssignmentOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"it.lorenzodeluca.dart.Dart.AssignmentOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:3058:4: ( (lv_right_3_0= ruleAssignmentExpression ) )
                    // InternalDart.g:3059:5: (lv_right_3_0= ruleAssignmentExpression )
                    {
                    // InternalDart.g:3059:5: (lv_right_3_0= ruleAssignmentExpression )
                    // InternalDart.g:3060:6: lv_right_3_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRightAssignmentExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.lorenzodeluca.dart.Dart.AssignmentExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, ruleAssignmentExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleAssignmentOperator"
    // InternalDart.g:3082:1: entryRuleAssignmentOperator returns [String current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final String entryRuleAssignmentOperator() throws RecognitionException {
        String current = null;
        int entryRuleAssignmentOperator_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleAssignmentOperator = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // InternalDart.g:3082:58: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // InternalDart.g:3083:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentOperator=ruleAssignmentOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleAssignmentOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentOperator"


    // $ANTLR start "ruleAssignmentOperator"
    // InternalDart.g:3089:1: ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '*=' | kw= '/=' | kw= '~/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>>=' | kw= '>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '??=' ) ;
    public final AntlrDatatypeRuleToken ruleAssignmentOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleAssignmentOperator_StartIndex = input.index();
        Token kw=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // InternalDart.g:3095:2: ( (kw= '=' | kw= '*=' | kw= '/=' | kw= '~/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>>=' | kw= '>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '??=' ) )
            // InternalDart.g:3096:2: (kw= '=' | kw= '*=' | kw= '/=' | kw= '~/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>>=' | kw= '>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '??=' )
            {
            // InternalDart.g:3096:2: (kw= '=' | kw= '*=' | kw= '/=' | kw= '~/=' | kw= '%=' | kw= '+=' | kw= '-=' | kw= '<<=' | kw= '>>>=' | kw= '>>=' | kw= '&=' | kw= '^=' | kw= '|=' | kw= '??=' )
            int alt73=14;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt73=1;
                }
                break;
            case 67:
                {
                alt73=2;
                }
                break;
            case 68:
                {
                alt73=3;
                }
                break;
            case 69:
                {
                alt73=4;
                }
                break;
            case 70:
                {
                alt73=5;
                }
                break;
            case 71:
                {
                alt73=6;
                }
                break;
            case 72:
                {
                alt73=7;
                }
                break;
            case 73:
                {
                alt73=8;
                }
                break;
            case 74:
                {
                alt73=9;
                }
                break;
            case 75:
                {
                alt73=10;
                }
                break;
            case 76:
                {
                alt73=11;
                }
                break;
            case 77:
                {
                alt73=12;
                }
                break;
            case 78:
                {
                alt73=13;
                }
                break;
            case 79:
                {
                alt73=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalDart.g:3097:3: kw= '='
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:3103:3: kw= '*='
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getAsteriskEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDart.g:3109:3: kw= '/='
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getSolidusEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDart.g:3115:3: kw= '~/='
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getTildeSolidusEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDart.g:3121:3: kw= '%='
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getPercentSignEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDart.g:3127:3: kw= '+='
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getPlusSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDart.g:3133:3: kw= '-='
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalDart.g:3139:3: kw= '<<='
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalDart.g:3145:3: kw= '>>>='
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getGreaterThanSignGreaterThanSignGreaterThanSignEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalDart.g:3151:3: kw= '>>='
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalDart.g:3157:3: kw= '&='
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getAmpersandEqualsSignKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalDart.g:3163:3: kw= '^='
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getCircumflexAccentEqualsSignKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalDart.g:3169:3: kw= '|='
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getVerticalLineEqualsSignKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalDart.g:3175:3: kw= '??='
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getQuestionMarkQuestionMarkEqualsSignKeyword_13());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, ruleAssignmentOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalDart.g:3184:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleConditionalExpression_StartIndex = input.index();
        EObject iv_ruleConditionalExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // InternalDart.g:3184:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalDart.g:3185:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleConditionalExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalDart.g:3191:1: ruleConditionalExpression returns [EObject current=null] : (this_IfNullExpression_0= ruleIfNullExpression ( () otherlv_2= '?' ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) ) otherlv_4= ':' ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;
        int ruleConditionalExpression_StartIndex = input.index();
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IfNullExpression_0 = null;

        EObject lv_thenExpr_3_0 = null;

        EObject lv_elseExpr_5_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // InternalDart.g:3197:2: ( (this_IfNullExpression_0= ruleIfNullExpression ( () otherlv_2= '?' ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) ) otherlv_4= ':' ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) ) )? ) )
            // InternalDart.g:3198:2: (this_IfNullExpression_0= ruleIfNullExpression ( () otherlv_2= '?' ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) ) otherlv_4= ':' ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) ) )? )
            {
            // InternalDart.g:3198:2: (this_IfNullExpression_0= ruleIfNullExpression ( () otherlv_2= '?' ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) ) otherlv_4= ':' ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) ) )? )
            // InternalDart.g:3199:3: this_IfNullExpression_0= ruleIfNullExpression ( () otherlv_2= '?' ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) ) otherlv_4= ':' ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConditionalExpressionAccess().getIfNullExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_IfNullExpression_0=ruleIfNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_IfNullExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3210:3: ( () otherlv_2= '?' ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) ) otherlv_4= ':' ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==80) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDart.g:3211:4: () otherlv_2= '?' ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) ) otherlv_4= ':' ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) )
                    {
                    // InternalDart.g:3211:4: ()
                    // InternalDart.g:3212:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getConditionalExpressionAccess().getConditionalConditionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,80,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                      			
                    }
                    // InternalDart.g:3225:4: ( (lv_thenExpr_3_0= ruleExpressionWithoutCascade ) )
                    // InternalDart.g:3226:5: (lv_thenExpr_3_0= ruleExpressionWithoutCascade )
                    {
                    // InternalDart.g:3226:5: (lv_thenExpr_3_0= ruleExpressionWithoutCascade )
                    // InternalDart.g:3227:6: lv_thenExpr_3_0= ruleExpressionWithoutCascade
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getThenExprExpressionWithoutCascadeParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_56);
                    lv_thenExpr_3_0=ruleExpressionWithoutCascade();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"thenExpr",
                      							lv_thenExpr_3_0,
                      							"it.lorenzodeluca.dart.Dart.ExpressionWithoutCascade");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                      			
                    }
                    // InternalDart.g:3248:4: ( (lv_elseExpr_5_0= ruleExpressionWithoutCascade ) )
                    // InternalDart.g:3249:5: (lv_elseExpr_5_0= ruleExpressionWithoutCascade )
                    {
                    // InternalDart.g:3249:5: (lv_elseExpr_5_0= ruleExpressionWithoutCascade )
                    // InternalDart.g:3250:6: lv_elseExpr_5_0= ruleExpressionWithoutCascade
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getElseExprExpressionWithoutCascadeParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseExpr_5_0=ruleExpressionWithoutCascade();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"elseExpr",
                      							lv_elseExpr_5_0,
                      							"it.lorenzodeluca.dart.Dart.ExpressionWithoutCascade");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, ruleConditionalExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleExpressionWithoutCascade"
    // InternalDart.g:3272:1: entryRuleExpressionWithoutCascade returns [EObject current=null] : iv_ruleExpressionWithoutCascade= ruleExpressionWithoutCascade EOF ;
    public final EObject entryRuleExpressionWithoutCascade() throws RecognitionException {
        EObject current = null;
        int entryRuleExpressionWithoutCascade_StartIndex = input.index();
        EObject iv_ruleExpressionWithoutCascade = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // InternalDart.g:3272:65: (iv_ruleExpressionWithoutCascade= ruleExpressionWithoutCascade EOF )
            // InternalDart.g:3273:2: iv_ruleExpressionWithoutCascade= ruleExpressionWithoutCascade EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionWithoutCascadeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionWithoutCascade=ruleExpressionWithoutCascade();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionWithoutCascade; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleExpressionWithoutCascade_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionWithoutCascade"


    // $ANTLR start "ruleExpressionWithoutCascade"
    // InternalDart.g:3279:1: ruleExpressionWithoutCascade returns [EObject current=null] : this_IfNullExpression_0= ruleIfNullExpression ;
    public final EObject ruleExpressionWithoutCascade() throws RecognitionException {
        EObject current = null;
        int ruleExpressionWithoutCascade_StartIndex = input.index();
        EObject this_IfNullExpression_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // InternalDart.g:3285:2: (this_IfNullExpression_0= ruleIfNullExpression )
            // InternalDart.g:3286:2: this_IfNullExpression_0= ruleIfNullExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionWithoutCascadeAccess().getIfNullExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_IfNullExpression_0=ruleIfNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_IfNullExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, ruleExpressionWithoutCascade_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpressionWithoutCascade"


    // $ANTLR start "entryRuleIfNullExpression"
    // InternalDart.g:3300:1: entryRuleIfNullExpression returns [EObject current=null] : iv_ruleIfNullExpression= ruleIfNullExpression EOF ;
    public final EObject entryRuleIfNullExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleIfNullExpression_StartIndex = input.index();
        EObject iv_ruleIfNullExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // InternalDart.g:3300:57: (iv_ruleIfNullExpression= ruleIfNullExpression EOF )
            // InternalDart.g:3301:2: iv_ruleIfNullExpression= ruleIfNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfNullExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfNullExpression=ruleIfNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfNullExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleIfNullExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfNullExpression"


    // $ANTLR start "ruleIfNullExpression"
    // InternalDart.g:3307:1: ruleIfNullExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '??' ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* ) ;
    public final EObject ruleIfNullExpression() throws RecognitionException {
        EObject current = null;
        int ruleIfNullExpression_StartIndex = input.index();
        Token otherlv_2=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // InternalDart.g:3313:2: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '??' ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* ) )
            // InternalDart.g:3314:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '??' ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* )
            {
            // InternalDart.g:3314:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '??' ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* )
            // InternalDart.g:3315:3: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '??' ( (lv_right_3_0= ruleLogicalOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfNullExpressionAccess().getLogicalOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3326:3: ( () otherlv_2= '??' ( (lv_right_3_0= ruleLogicalOrExpression ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==81) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalDart.g:3327:4: () otherlv_2= '??' ( (lv_right_3_0= ruleLogicalOrExpression ) )
            	    {
            	    // InternalDart.g:3327:4: ()
            	    // InternalDart.g:3328:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getIfNullExpressionAccess().getIfNullLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,81,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getIfNullExpressionAccess().getQuestionMarkQuestionMarkKeyword_1_1());
            	      			
            	    }
            	    // InternalDart.g:3341:4: ( (lv_right_3_0= ruleLogicalOrExpression ) )
            	    // InternalDart.g:3342:5: (lv_right_3_0= ruleLogicalOrExpression )
            	    {
            	    // InternalDart.g:3342:5: (lv_right_3_0= ruleLogicalOrExpression )
            	    // InternalDart.g:3343:6: lv_right_3_0= ruleLogicalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfNullExpressionAccess().getRightLogicalOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_right_3_0=ruleLogicalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfNullExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.LogicalOrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, ruleIfNullExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfNullExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalDart.g:3365:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalOrExpression_StartIndex = input.index();
        EObject iv_ruleLogicalOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // InternalDart.g:3365:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalDart.g:3366:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalDart.g:3372:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalOrExpression_StartIndex = input.index();
        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // InternalDart.g:3378:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalDart.g:3379:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalDart.g:3379:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalDart.g:3380:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3391:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleLogicalAndExpression ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==82) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalDart.g:3392:4: () otherlv_2= '||' ( (lv_right_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalDart.g:3392:4: ()
            	    // InternalDart.g:3393:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalOrExpressionAccess().getLogicalOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,82,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalDart.g:3406:4: ( (lv_right_3_0= ruleLogicalAndExpression ) )
            	    // InternalDart.g:3407:5: (lv_right_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalDart.g:3407:5: (lv_right_3_0= ruleLogicalAndExpression )
            	    // InternalDart.g:3408:6: lv_right_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightLogicalAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_right_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.LogicalAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, ruleLogicalOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalDart.g:3430:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleLogicalAndExpression_StartIndex = input.index();
        EObject iv_ruleLogicalAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // InternalDart.g:3430:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalDart.g:3431:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalDart.g:3437:1: ruleLogicalAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleLogicalAndExpression_StartIndex = input.index();
        Token otherlv_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // InternalDart.g:3443:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalDart.g:3444:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalDart.g:3444:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalDart.g:3445:3: this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3456:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==83) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalDart.g:3457:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalDart.g:3457:4: ()
            	    // InternalDart.g:3458:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalAndExpressionAccess().getLogicalAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,83,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalDart.g:3471:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalDart.g:3472:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalDart.g:3472:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalDart.g:3473:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.EqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, ruleLogicalAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalDart.g:3495:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleEqualityExpression_StartIndex = input.index();
        EObject iv_ruleEqualityExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // InternalDart.g:3495:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalDart.g:3496:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleEqualityExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalDart.g:3502:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;
        int ruleEqualityExpression_StartIndex = input.index();
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // InternalDart.g:3508:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )? ) )
            // InternalDart.g:3509:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )? )
            {
            // InternalDart.g:3509:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )? )
            // InternalDart.g:3510:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3521:3: ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==43||LA79_0==84) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDart.g:3522:4: () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
                    {
                    // InternalDart.g:3522:4: ()
                    // InternalDart.g:3523:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getEqualityExpressionAccess().getEqualityLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDart.g:3532:4: ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) ) )
                    // InternalDart.g:3533:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) )
                    {
                    // InternalDart.g:3533:5: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' ) )
                    // InternalDart.g:3534:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' )
                    {
                    // InternalDart.g:3534:6: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==43) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==84) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalDart.g:3535:7: lv_operator_2_1= '=='
                            {
                            lv_operator_2_1=(Token)match(input,43,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_2_1, grammarAccess.getEqualityExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalDart.g:3546:7: lv_operator_2_2= '!='
                            {
                            lv_operator_2_2=(Token)match(input,84,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_2_2, grammarAccess.getEqualityExpressionAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalDart.g:3559:4: ( (lv_right_3_0= ruleRelationalExpression ) )
                    // InternalDart.g:3560:5: (lv_right_3_0= ruleRelationalExpression )
                    {
                    // InternalDart.g:3560:5: (lv_right_3_0= ruleRelationalExpression )
                    // InternalDart.g:3561:6: lv_right_3_0= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleRelationalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.lorenzodeluca.dart.Dart.RelationalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, ruleEqualityExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalDart.g:3583:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleRelationalExpression_StartIndex = input.index();
        EObject iv_ruleRelationalExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // InternalDart.g:3583:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalDart.g:3584:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleRelationalExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalDart.g:3590:1: ruleRelationalExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) ) | ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;
        int ruleRelationalExpression_StartIndex = input.index();
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_right_3_0 = null;

        AntlrDatatypeRuleToken lv_operator_5_0 = null;

        EObject lv_type_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // InternalDart.g:3596:2: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) ) | ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) ) )? ) )
            // InternalDart.g:3597:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) ) | ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) ) )? )
            {
            // InternalDart.g:3597:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) ) | ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) ) )? )
            // InternalDart.g:3598:3: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) ) | ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getBitwiseOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3609:3: ( ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) ) | ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=57 && LA81_0<=60)) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=85 && LA81_0<=86)) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // InternalDart.g:3610:4: ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) )
                    {
                    // InternalDart.g:3610:4: ( () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalDart.g:3611:5: () ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) ) ( (lv_right_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalDart.g:3611:5: ()
                    // InternalDart.g:3612:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getRelationalExpressionAccess().getRelationalLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDart.g:3621:5: ( ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) ) )
                    // InternalDart.g:3622:6: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) )
                    {
                    // InternalDart.g:3622:6: ( (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' ) )
                    // InternalDart.g:3623:7: (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' )
                    {
                    // InternalDart.g:3623:7: (lv_operator_2_1= '>=' | lv_operator_2_2= '>' | lv_operator_2_3= '<=' | lv_operator_2_4= '<' )
                    int alt80=4;
                    switch ( input.LA(1) ) {
                    case 57:
                        {
                        alt80=1;
                        }
                        break;
                    case 58:
                        {
                        alt80=2;
                        }
                        break;
                    case 59:
                        {
                        alt80=3;
                        }
                        break;
                    case 60:
                        {
                        alt80=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }

                    switch (alt80) {
                        case 1 :
                            // InternalDart.g:3624:8: lv_operator_2_1= '>='
                            {
                            lv_operator_2_1=(Token)match(input,57,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_2_1, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getRelationalExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_2_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalDart.g:3635:8: lv_operator_2_2= '>'
                            {
                            lv_operator_2_2=(Token)match(input,58,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_2_2, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignKeyword_1_0_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getRelationalExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_2_2, null);
                              							
                            }

                            }
                            break;
                        case 3 :
                            // InternalDart.g:3646:8: lv_operator_2_3= '<='
                            {
                            lv_operator_2_3=(Token)match(input,59,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_2_3, grammarAccess.getRelationalExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_1_0_2());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getRelationalExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_2_3, null);
                              							
                            }

                            }
                            break;
                        case 4 :
                            // InternalDart.g:3657:8: lv_operator_2_4= '<'
                            {
                            lv_operator_2_4=(Token)match(input,60,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_operator_2_4, grammarAccess.getRelationalExpressionAccess().getOperatorLessThanSignKeyword_1_0_1_0_3());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getRelationalExpressionRule());
                              								}
                              								setWithLastConsumed(current, "operator", lv_operator_2_4, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalDart.g:3670:5: ( (lv_right_3_0= ruleBitwiseOrExpression ) )
                    // InternalDart.g:3671:6: (lv_right_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalDart.g:3671:6: (lv_right_3_0= ruleBitwiseOrExpression )
                    // InternalDart.g:3672:7: lv_right_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightBitwiseOrExpressionParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleBitwiseOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"it.lorenzodeluca.dart.Dart.BitwiseOrExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:3691:4: ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) )
                    {
                    // InternalDart.g:3691:4: ( () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) ) )
                    // InternalDart.g:3692:5: () ( (lv_operator_5_0= ruleTypeCheckOperator ) ) ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalDart.g:3692:5: ()
                    // InternalDart.g:3693:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getRelationalExpressionAccess().getTypeCheckLeftAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDart.g:3702:5: ( (lv_operator_5_0= ruleTypeCheckOperator ) )
                    // InternalDart.g:3703:6: (lv_operator_5_0= ruleTypeCheckOperator )
                    {
                    // InternalDart.g:3703:6: (lv_operator_5_0= ruleTypeCheckOperator )
                    // InternalDart.g:3704:7: lv_operator_5_0= ruleTypeCheckOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorTypeCheckOperatorParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_3);
                    lv_operator_5_0=ruleTypeCheckOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_5_0,
                      								"it.lorenzodeluca.dart.Dart.TypeCheckOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDart.g:3721:5: ( (lv_type_6_0= ruleType ) )
                    // InternalDart.g:3722:6: (lv_type_6_0= ruleType )
                    {
                    // InternalDart.g:3722:6: (lv_type_6_0= ruleType )
                    // InternalDart.g:3723:7: lv_type_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getTypeTypeParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      							}
                      							set(
                      								current,
                      								"type",
                      								lv_type_6_0,
                      								"it.lorenzodeluca.dart.Dart.Type");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, ruleRelationalExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleTypeCheckOperator"
    // InternalDart.g:3746:1: entryRuleTypeCheckOperator returns [String current=null] : iv_ruleTypeCheckOperator= ruleTypeCheckOperator EOF ;
    public final String entryRuleTypeCheckOperator() throws RecognitionException {
        String current = null;
        int entryRuleTypeCheckOperator_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTypeCheckOperator = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // InternalDart.g:3746:57: (iv_ruleTypeCheckOperator= ruleTypeCheckOperator EOF )
            // InternalDart.g:3747:2: iv_ruleTypeCheckOperator= ruleTypeCheckOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCheckOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeCheckOperator=ruleTypeCheckOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeCheckOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleTypeCheckOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeCheckOperator"


    // $ANTLR start "ruleTypeCheckOperator"
    // InternalDart.g:3753:1: ruleTypeCheckOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'as' | (kw= 'is' kw= '!' ) | kw= 'is' ) ;
    public final AntlrDatatypeRuleToken ruleTypeCheckOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTypeCheckOperator_StartIndex = input.index();
        Token kw=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // InternalDart.g:3759:2: ( (kw= 'as' | (kw= 'is' kw= '!' ) | kw= 'is' ) )
            // InternalDart.g:3760:2: (kw= 'as' | (kw= 'is' kw= '!' ) | kw= 'is' )
            {
            // InternalDart.g:3760:2: (kw= 'as' | (kw= 'is' kw= '!' ) | kw= 'is' )
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==85) ) {
                alt82=1;
            }
            else if ( (LA82_0==86) ) {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==87) ) {
                    alt82=2;
                }
                else if ( (LA82_2==EOF||LA82_2==RULE_ID||(LA82_2>=122 && LA82_2<=124)) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalDart.g:3761:3: kw= 'as'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeCheckOperatorAccess().getAsKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:3767:3: (kw= 'is' kw= '!' )
                    {
                    // InternalDart.g:3767:3: (kw= 'is' kw= '!' )
                    // InternalDart.g:3768:4: kw= 'is' kw= '!'
                    {
                    kw=(Token)match(input,86,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeCheckOperatorAccess().getIsKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeCheckOperatorAccess().getExclamationMarkKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDart.g:3780:3: kw= 'is'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeCheckOperatorAccess().getIsKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, ruleTypeCheckOperator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeCheckOperator"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalDart.g:3789:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseOrExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseOrExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // InternalDart.g:3789:60: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalDart.g:3790:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalDart.g:3796:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXorExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseOrExpression_StartIndex = input.index();
        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // InternalDart.g:3802:2: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXorExpression ) ) )* ) )
            // InternalDart.g:3803:2: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXorExpression ) ) )* )
            {
            // InternalDart.g:3803:2: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXorExpression ) ) )* )
            // InternalDart.g:3804:3: this_BitwiseXorExpression_0= ruleBitwiseXorExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_63);
            this_BitwiseXorExpression_0=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseXorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3815:3: ( () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXorExpression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==56) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalDart.g:3816:4: () otherlv_2= '|' ( (lv_right_3_0= ruleBitwiseXorExpression ) )
            	    {
            	    // InternalDart.g:3816:4: ()
            	    // InternalDart.g:3817:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalDart.g:3830:4: ( (lv_right_3_0= ruleBitwiseXorExpression ) )
            	    // InternalDart.g:3831:5: (lv_right_3_0= ruleBitwiseXorExpression )
            	    {
            	    // InternalDart.g:3831:5: (lv_right_3_0= ruleBitwiseXorExpression )
            	    // InternalDart.g:3832:6: lv_right_3_0= ruleBitwiseXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightBitwiseXorExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_right_3_0=ruleBitwiseXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.BitwiseXorExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, ruleBitwiseOrExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseXorExpression"
    // InternalDart.g:3854:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseXorExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseXorExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // InternalDart.g:3854:61: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // InternalDart.g:3855:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleBitwiseXorExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseXorExpression"


    // $ANTLR start "ruleBitwiseXorExpression"
    // InternalDart.g:3861:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseXorExpression_StartIndex = input.index();
        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // InternalDart.g:3867:2: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // InternalDart.g:3868:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // InternalDart.g:3868:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAndExpression ) ) )* )
            // InternalDart.g:3869:3: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_64);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3880:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAndExpression ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==55) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalDart.g:3881:4: () otherlv_2= '^' ( (lv_right_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // InternalDart.g:3881:4: ()
            	    // InternalDart.g:3882:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	      			
            	    }
            	    // InternalDart.g:3895:4: ( (lv_right_3_0= ruleBitwiseAndExpression ) )
            	    // InternalDart.g:3896:5: (lv_right_3_0= ruleBitwiseAndExpression )
            	    {
            	    // InternalDart.g:3896:5: (lv_right_3_0= ruleBitwiseAndExpression )
            	    // InternalDart.g:3897:6: lv_right_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightBitwiseAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_right_3_0=ruleBitwiseAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitwiseXorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.BitwiseAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, ruleBitwiseXorExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalDart.g:3919:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleBitwiseAndExpression_StartIndex = input.index();
        EObject iv_ruleBitwiseAndExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // InternalDart.g:3919:61: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalDart.g:3920:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalDart.g:3926:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;
        int ruleBitwiseAndExpression_StartIndex = input.index();
        Token otherlv_2=null;
        EObject this_ShiftExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // InternalDart.g:3932:2: ( (this_ShiftExpression_0= ruleShiftExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftExpression ) ) )* ) )
            // InternalDart.g:3933:2: (this_ShiftExpression_0= ruleShiftExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftExpression ) ) )* )
            {
            // InternalDart.g:3933:2: (this_ShiftExpression_0= ruleShiftExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftExpression ) ) )* )
            // InternalDart.g:3934:3: this_ShiftExpression_0= ruleShiftExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getShiftExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_65);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShiftExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:3945:3: ( () otherlv_2= '&' ( (lv_right_3_0= ruleShiftExpression ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==54) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalDart.g:3946:4: () otherlv_2= '&' ( (lv_right_3_0= ruleShiftExpression ) )
            	    {
            	    // InternalDart.g:3946:4: ()
            	    // InternalDart.g:3947:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalDart.g:3960:4: ( (lv_right_3_0= ruleShiftExpression ) )
            	    // InternalDart.g:3961:5: (lv_right_3_0= ruleShiftExpression )
            	    {
            	    // InternalDart.g:3961:5: (lv_right_3_0= ruleShiftExpression )
            	    // InternalDart.g:3962:6: lv_right_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightShiftExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_right_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.ShiftExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, ruleBitwiseAndExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // InternalDart.g:3984:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleShiftExpression_StartIndex = input.index();
        EObject iv_ruleShiftExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // InternalDart.g:3984:56: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // InternalDart.g:3985:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleShiftExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // InternalDart.g:3991:1: ruleShiftExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;
        int ruleShiftExpression_StartIndex = input.index();
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // InternalDart.g:3997:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalDart.g:3998:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalDart.g:3998:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalDart.g:3999:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_66);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:4010:3: ( () ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=51 && LA87_0<=53)) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalDart.g:4011:4: () ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalDart.g:4011:4: ()
            	    // InternalDart.g:4012:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftExpressionAccess().getShiftLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalDart.g:4021:4: ( ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) ) )
            	    // InternalDart.g:4022:5: ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) )
            	    {
            	    // InternalDart.g:4022:5: ( (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' ) )
            	    // InternalDart.g:4023:6: (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' )
            	    {
            	    // InternalDart.g:4023:6: (lv_operator_2_1= '<<' | lv_operator_2_2= '>>>' | lv_operator_2_3= '>>' )
            	    int alt86=3;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt86=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt86=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt86=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 86, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt86) {
            	        case 1 :
            	            // InternalDart.g:4024:7: lv_operator_2_1= '<<'
            	            {
            	            lv_operator_2_1=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getShiftExpressionAccess().getOperatorLessThanSignLessThanSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getShiftExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalDart.g:4035:7: lv_operator_2_2= '>>>'
            	            {
            	            lv_operator_2_2=(Token)match(input,52,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getShiftExpressionAccess().getOperatorGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getShiftExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalDart.g:4046:7: lv_operator_2_3= '>>'
            	            {
            	            lv_operator_2_3=(Token)match(input,53,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_3, grammarAccess.getShiftExpressionAccess().getOperatorGreaterThanSignGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getShiftExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDart.g:4059:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalDart.g:4060:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalDart.g:4060:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalDart.g:4061:6: lv_right_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_66);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.AdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, ruleShiftExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalDart.g:4083:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleAdditiveExpression_StartIndex = input.index();
        EObject iv_ruleAdditiveExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // InternalDart.g:4083:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalDart.g:4084:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleAdditiveExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalDart.g:4090:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;
        int ruleAdditiveExpression_StartIndex = input.index();
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // InternalDart.g:4096:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalDart.g:4097:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalDart.g:4097:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalDart.g:4098:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:4109:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=49 && LA89_0<=50)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalDart.g:4110:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalDart.g:4110:4: ()
            	    // InternalDart.g:4111:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditiveExpressionAccess().getAdditiveLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalDart.g:4120:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalDart.g:4121:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalDart.g:4121:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalDart.g:4122:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalDart.g:4122:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==49) ) {
            	        alt88=1;
            	    }
            	    else if ( (LA88_0==50) ) {
            	        alt88=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 88, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // InternalDart.g:4123:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getAdditiveExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalDart.g:4134:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getAdditiveExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDart.g:4147:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalDart.g:4148:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalDart.g:4148:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalDart.g:4149:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.MultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, ruleAdditiveExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalDart.g:4171:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleMultiplicativeExpression_StartIndex = input.index();
        EObject iv_ruleMultiplicativeExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // InternalDart.g:4171:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalDart.g:4172:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleMultiplicativeExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalDart.g:4178:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;
        int ruleMultiplicativeExpression_StartIndex = input.index();
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // InternalDart.g:4184:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalDart.g:4185:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalDart.g:4185:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalDart.g:4186:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:4197:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==31||(LA91_0>=46 && LA91_0<=48)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalDart.g:4198:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalDart.g:4198:4: ()
            	    // InternalDart.g:4199:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalDart.g:4208:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) ) )
            	    // InternalDart.g:4209:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) )
            	    {
            	    // InternalDart.g:4209:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' ) )
            	    // InternalDart.g:4210:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' )
            	    {
            	    // InternalDart.g:4210:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' | lv_operator_2_4= '~/' )
            	    int alt90=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt90=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt90=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt90=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt90=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 90, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt90) {
            	        case 1 :
            	            // InternalDart.g:4211:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicativeExpressionAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalDart.g:4222:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,46,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicativeExpressionAccess().getOperatorSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalDart.g:4233:7: lv_operator_2_3= '%'
            	            {
            	            lv_operator_2_3=(Token)match(input,47,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_3, grammarAccess.getMultiplicativeExpressionAccess().getOperatorPercentSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalDart.g:4244:7: lv_operator_2_4= '~/'
            	            {
            	            lv_operator_2_4=(Token)match(input,48,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_4, grammarAccess.getMultiplicativeExpressionAccess().getOperatorTildeSolidusKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDart.g:4257:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalDart.g:4258:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalDart.g:4258:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalDart.g:4259:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_68);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.lorenzodeluca.dart.Dart.UnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, ruleMultiplicativeExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalDart.g:4281:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;
        int entryRuleUnaryExpression_StartIndex = input.index();
        EObject iv_ruleUnaryExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // InternalDart.g:4281:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDart.g:4282:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleUnaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalDart.g:4288:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PostfixExpression_3= rulePostfixExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;
        int ruleUnaryExpression_StartIndex = input.index();
        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_operator_1_4=null;
        Token lv_operator_1_5=null;
        Token lv_operator_1_6=null;
        EObject lv_operand_2_0 = null;

        EObject this_PostfixExpression_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // InternalDart.g:4294:2: ( ( ( () ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PostfixExpression_3= rulePostfixExpression ) )
            // InternalDart.g:4295:2: ( ( () ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PostfixExpression_3= rulePostfixExpression )
            {
            // InternalDart.g:4295:2: ( ( () ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PostfixExpression_3= rulePostfixExpression )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==42||LA93_0==50||(LA93_0>=87 && LA93_0<=90)) ) {
                alt93=1;
            }
            else if ( ((LA93_0>=RULE_ID && LA93_0<=RULE_STRING)||LA93_0==15||LA93_0==20||LA93_0==23||LA93_0==25||LA93_0==60||(LA93_0>=91 && LA93_0<=96)) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalDart.g:4296:3: ( () ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalDart.g:4296:3: ( () ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    // InternalDart.g:4297:4: () ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) )
                    {
                    // InternalDart.g:4297:4: ()
                    // InternalDart.g:4298:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getPrefixExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDart.g:4307:4: ( ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) ) )
                    // InternalDart.g:4308:5: ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) )
                    {
                    // InternalDart.g:4308:5: ( (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' ) )
                    // InternalDart.g:4309:6: (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' )
                    {
                    // InternalDart.g:4309:6: (lv_operator_1_1= '-' | lv_operator_1_2= '!' | lv_operator_1_3= '~' | lv_operator_1_4= '++' | lv_operator_1_5= '--' | lv_operator_1_6= 'await' )
                    int alt92=6;
                    switch ( input.LA(1) ) {
                    case 50:
                        {
                        alt92=1;
                        }
                        break;
                    case 87:
                        {
                        alt92=2;
                        }
                        break;
                    case 42:
                        {
                        alt92=3;
                        }
                        break;
                    case 88:
                        {
                        alt92=4;
                        }
                        break;
                    case 89:
                        {
                        alt92=5;
                        }
                        break;
                    case 90:
                        {
                        alt92=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }

                    switch (alt92) {
                        case 1 :
                            // InternalDart.g:4310:7: lv_operator_1_1= '-'
                            {
                            lv_operator_1_1=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_1_1, grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalDart.g:4321:7: lv_operator_1_2= '!'
                            {
                            lv_operator_1_2=(Token)match(input,87,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_1_2, grammarAccess.getUnaryExpressionAccess().getOperatorExclamationMarkKeyword_0_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalDart.g:4332:7: lv_operator_1_3= '~'
                            {
                            lv_operator_1_3=(Token)match(input,42,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_1_3, grammarAccess.getUnaryExpressionAccess().getOperatorTildeKeyword_0_1_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                              						
                            }

                            }
                            break;
                        case 4 :
                            // InternalDart.g:4343:7: lv_operator_1_4= '++'
                            {
                            lv_operator_1_4=(Token)match(input,88,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_1_4, grammarAccess.getUnaryExpressionAccess().getOperatorPlusSignPlusSignKeyword_0_1_0_3());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                              						
                            }

                            }
                            break;
                        case 5 :
                            // InternalDart.g:4354:7: lv_operator_1_5= '--'
                            {
                            lv_operator_1_5=(Token)match(input,89,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_1_5, grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusHyphenMinusKeyword_0_1_0_4());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                              						
                            }

                            }
                            break;
                        case 6 :
                            // InternalDart.g:4365:7: lv_operator_1_6= 'await'
                            {
                            lv_operator_1_6=(Token)match(input,90,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_operator_1_6, grammarAccess.getUnaryExpressionAccess().getOperatorAwaitKeyword_0_1_0_5());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "operator", lv_operator_1_6, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalDart.g:4378:4: ( (lv_operand_2_0= ruleUnaryExpression ) )
                    // InternalDart.g:4379:5: (lv_operand_2_0= ruleUnaryExpression )
                    {
                    // InternalDart.g:4379:5: (lv_operand_2_0= ruleUnaryExpression )
                    // InternalDart.g:4380:6: lv_operand_2_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"it.lorenzodeluca.dart.Dart.UnaryExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:4399:3: this_PostfixExpression_3= rulePostfixExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPostfixExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PostfixExpression_3=rulePostfixExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PostfixExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, ruleUnaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePostfixExpression"
    // InternalDart.g:4414:1: entryRulePostfixExpression returns [EObject current=null] : iv_rulePostfixExpression= rulePostfixExpression EOF ;
    public final EObject entryRulePostfixExpression() throws RecognitionException {
        EObject current = null;
        int entryRulePostfixExpression_StartIndex = input.index();
        EObject iv_rulePostfixExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // InternalDart.g:4414:58: (iv_rulePostfixExpression= rulePostfixExpression EOF )
            // InternalDart.g:4415:2: iv_rulePostfixExpression= rulePostfixExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostfixExpression=rulePostfixExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRulePostfixExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixExpression"


    // $ANTLR start "rulePostfixExpression"
    // InternalDart.g:4421:1: rulePostfixExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) ) | ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) ) | ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' ) )* ) ;
    public final EObject rulePostfixExpression() throws RecognitionException {
        EObject current = null;
        int rulePostfixExpression_StartIndex = input.index();
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token otherlv_4=null;
        Token lv_method_5_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_args_7_0 = null;

        EObject lv_index_10_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // InternalDart.g:4427:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) ) | ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) ) | ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' ) )* ) )
            // InternalDart.g:4428:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) ) | ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) ) | ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' ) )* )
            {
            // InternalDart.g:4428:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) ) | ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) ) | ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' ) )* )
            // InternalDart.g:4429:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) ) | ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) ) | ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPostfixExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_69);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:4440:3: ( ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) ) | ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) ) | ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' ) )*
            loop96:
            do {
                int alt96=4;
                switch ( input.LA(1) ) {
                case 88:
                case 89:
                    {
                    alt96=1;
                    }
                    break;
                case 66:
                    {
                    alt96=2;
                    }
                    break;
                case 23:
                    {
                    alt96=3;
                    }
                    break;

                }

                switch (alt96) {
            	case 1 :
            	    // InternalDart.g:4441:4: ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) )
            	    {
            	    // InternalDart.g:4441:4: ( () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) ) )
            	    // InternalDart.g:4442:5: () ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) )
            	    {
            	    // InternalDart.g:4442:5: ()
            	    // InternalDart.g:4443:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPostfixExpressionAccess().getPostfixOperandAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalDart.g:4452:5: ( ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) ) )
            	    // InternalDart.g:4453:6: ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) )
            	    {
            	    // InternalDart.g:4453:6: ( (lv_operator_2_1= '++' | lv_operator_2_2= '--' ) )
            	    // InternalDart.g:4454:7: (lv_operator_2_1= '++' | lv_operator_2_2= '--' )
            	    {
            	    // InternalDart.g:4454:7: (lv_operator_2_1= '++' | lv_operator_2_2= '--' )
            	    int alt94=2;
            	    int LA94_0 = input.LA(1);

            	    if ( (LA94_0==88) ) {
            	        alt94=1;
            	    }
            	    else if ( (LA94_0==89) ) {
            	        alt94=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 94, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt94) {
            	        case 1 :
            	            // InternalDart.g:4455:8: lv_operator_2_1= '++'
            	            {
            	            lv_operator_2_1=(Token)match(input,88,FOLLOW_69); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_operator_2_1, grammarAccess.getPostfixExpressionAccess().getOperatorPlusSignPlusSignKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPostfixExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalDart.g:4466:8: lv_operator_2_2= '--'
            	            {
            	            lv_operator_2_2=(Token)match(input,89,FOLLOW_69); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_operator_2_2, grammarAccess.getPostfixExpressionAccess().getOperatorHyphenMinusHyphenMinusKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPostfixExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDart.g:4481:4: ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) )
            	    {
            	    // InternalDart.g:4481:4: ( () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) ) )
            	    // InternalDart.g:4482:5: () otherlv_4= '.' ( (lv_method_5_0= RULE_ID ) ) ( (lv_typeArguments_6_0= ruleTypeArguments ) )? ( (lv_args_7_0= ruleArguments ) )
            	    {
            	    // InternalDart.g:4482:5: ()
            	    // InternalDart.g:4483:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPostfixExpressionAccess().getMethodInvocationReceiverAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_4=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getPostfixExpressionAccess().getFullStopKeyword_1_1_1());
            	      				
            	    }
            	    // InternalDart.g:4496:5: ( (lv_method_5_0= RULE_ID ) )
            	    // InternalDart.g:4497:6: (lv_method_5_0= RULE_ID )
            	    {
            	    // InternalDart.g:4497:6: (lv_method_5_0= RULE_ID )
            	    // InternalDart.g:4498:7: lv_method_5_0= RULE_ID
            	    {
            	    lv_method_5_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_method_5_0, grammarAccess.getPostfixExpressionAccess().getMethodIDTerminalRuleCall_1_1_2_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getPostfixExpressionRule());
            	      							}
            	      							setWithLastConsumed(
            	      								current,
            	      								"method",
            	      								lv_method_5_0,
            	      								"org.eclipse.xtext.common.Terminals.ID");
            	      						
            	    }

            	    }


            	    }

            	    // InternalDart.g:4514:5: ( (lv_typeArguments_6_0= ruleTypeArguments ) )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==60) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // InternalDart.g:4515:6: (lv_typeArguments_6_0= ruleTypeArguments )
            	            {
            	            // InternalDart.g:4515:6: (lv_typeArguments_6_0= ruleTypeArguments )
            	            // InternalDart.g:4516:7: lv_typeArguments_6_0= ruleTypeArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getPostfixExpressionAccess().getTypeArgumentsTypeArgumentsParserRuleCall_1_1_3_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_70);
            	            lv_typeArguments_6_0=ruleTypeArguments();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getPostfixExpressionRule());
            	              							}
            	              							set(
            	              								current,
            	              								"typeArguments",
            	              								lv_typeArguments_6_0,
            	              								"it.lorenzodeluca.dart.Dart.TypeArguments");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDart.g:4533:5: ( (lv_args_7_0= ruleArguments ) )
            	    // InternalDart.g:4534:6: (lv_args_7_0= ruleArguments )
            	    {
            	    // InternalDart.g:4534:6: (lv_args_7_0= ruleArguments )
            	    // InternalDart.g:4535:7: lv_args_7_0= ruleArguments
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getPostfixExpressionAccess().getArgsArgumentsParserRuleCall_1_1_4_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_69);
            	    lv_args_7_0=ruleArguments();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getPostfixExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"args",
            	      								lv_args_7_0,
            	      								"it.lorenzodeluca.dart.Dart.Arguments");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDart.g:4554:4: ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' )
            	    {
            	    // InternalDart.g:4554:4: ( () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']' )
            	    // InternalDart.g:4555:5: () otherlv_9= '[' ( (lv_index_10_0= ruleExpression ) ) otherlv_11= ']'
            	    {
            	    // InternalDart.g:4555:5: ()
            	    // InternalDart.g:4556:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getPostfixExpressionAccess().getIndexExpressionReceiverAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_9=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_9, grammarAccess.getPostfixExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
            	      				
            	    }
            	    // InternalDart.g:4569:5: ( (lv_index_10_0= ruleExpression ) )
            	    // InternalDart.g:4570:6: (lv_index_10_0= ruleExpression )
            	    {
            	    // InternalDart.g:4570:6: (lv_index_10_0= ruleExpression )
            	    // InternalDart.g:4571:7: lv_index_10_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getPostfixExpressionAccess().getIndexExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_71);
            	    lv_index_10_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getPostfixExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"index",
            	      								lv_index_10_0,
            	      								"it.lorenzodeluca.dart.Dart.Expression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,24,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getPostfixExpressionAccess().getRightSquareBracketKeyword_1_2_3());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, rulePostfixExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePostfixExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDart.g:4598:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;
        int entryRulePrimaryExpression_StartIndex = input.index();
        EObject iv_rulePrimaryExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // InternalDart.g:4598:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDart.g:4599:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRulePrimaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalDart.g:4605:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'this' ) | ( () otherlv_3= 'super' ) | ( () otherlv_5= 'null' ) | ( () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) ) ) | ( () ( (lv_intValue_9_0= RULE_INT ) ) ) | ( () ( (lv_stringValue_11_0= RULE_STRING ) ) ) | ( () ( (lv_name_13_0= RULE_ID ) ) ) | this_CollectionLiteral_14= ruleCollectionLiteral | ( () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) ) ) | ( () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) ) ) | ( () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;
        int rulePrimaryExpression_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_boolValue_7_1=null;
        Token lv_boolValue_7_2=null;
        Token lv_intValue_9_0=null;
        Token lv_stringValue_11_0=null;
        Token lv_name_13_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_constructor_19_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_constructor_25_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        EObject this_CollectionLiteral_14 = null;

        EObject lv_type_17_0 = null;

        EObject lv_args_20_0 = null;

        EObject lv_type_23_0 = null;

        EObject lv_args_26_0 = null;

        EObject lv_expression_29_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // InternalDart.g:4611:2: ( ( ( () otherlv_1= 'this' ) | ( () otherlv_3= 'super' ) | ( () otherlv_5= 'null' ) | ( () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) ) ) | ( () ( (lv_intValue_9_0= RULE_INT ) ) ) | ( () ( (lv_stringValue_11_0= RULE_STRING ) ) ) | ( () ( (lv_name_13_0= RULE_ID ) ) ) | this_CollectionLiteral_14= ruleCollectionLiteral | ( () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) ) ) | ( () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) ) ) | ( () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')' ) ) )
            // InternalDart.g:4612:2: ( ( () otherlv_1= 'this' ) | ( () otherlv_3= 'super' ) | ( () otherlv_5= 'null' ) | ( () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) ) ) | ( () ( (lv_intValue_9_0= RULE_INT ) ) ) | ( () ( (lv_stringValue_11_0= RULE_STRING ) ) ) | ( () ( (lv_name_13_0= RULE_ID ) ) ) | this_CollectionLiteral_14= ruleCollectionLiteral | ( () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) ) ) | ( () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) ) ) | ( () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')' ) )
            {
            // InternalDart.g:4612:2: ( ( () otherlv_1= 'this' ) | ( () otherlv_3= 'super' ) | ( () otherlv_5= 'null' ) | ( () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) ) ) | ( () ( (lv_intValue_9_0= RULE_INT ) ) ) | ( () ( (lv_stringValue_11_0= RULE_STRING ) ) ) | ( () ( (lv_name_13_0= RULE_ID ) ) ) | this_CollectionLiteral_14= ruleCollectionLiteral | ( () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) ) ) | ( () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) ) ) | ( () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')' ) )
            int alt100=11;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalDart.g:4613:3: ( () otherlv_1= 'this' )
                    {
                    // InternalDart.g:4613:3: ( () otherlv_1= 'this' )
                    // InternalDart.g:4614:4: () otherlv_1= 'this'
                    {
                    // InternalDart.g:4614:4: ()
                    // InternalDart.g:4615:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getThisExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getThisKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:4630:3: ( () otherlv_3= 'super' )
                    {
                    // InternalDart.g:4630:3: ( () otherlv_3= 'super' )
                    // InternalDart.g:4631:4: () otherlv_3= 'super'
                    {
                    // InternalDart.g:4631:4: ()
                    // InternalDart.g:4632:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getSuperExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getSuperKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDart.g:4647:3: ( () otherlv_5= 'null' )
                    {
                    // InternalDart.g:4647:3: ( () otherlv_5= 'null' )
                    // InternalDart.g:4648:4: () otherlv_5= 'null'
                    {
                    // InternalDart.g:4648:4: ()
                    // InternalDart.g:4649:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getNullLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getNullKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDart.g:4664:3: ( () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) ) )
                    {
                    // InternalDart.g:4664:3: ( () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) ) )
                    // InternalDart.g:4665:4: () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) )
                    {
                    // InternalDart.g:4665:4: ()
                    // InternalDart.g:4666:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDart.g:4675:4: ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) )
                    // InternalDart.g:4676:5: ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) )
                    {
                    // InternalDart.g:4676:5: ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) )
                    // InternalDart.g:4677:6: (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' )
                    {
                    // InternalDart.g:4677:6: (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' )
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==94) ) {
                        alt97=1;
                    }
                    else if ( (LA97_0==95) ) {
                        alt97=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalDart.g:4678:7: lv_boolValue_7_1= 'true'
                            {
                            lv_boolValue_7_1=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_boolValue_7_1, grammarAccess.getPrimaryExpressionAccess().getBoolValueTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "boolValue", lv_boolValue_7_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalDart.g:4689:7: lv_boolValue_7_2= 'false'
                            {
                            lv_boolValue_7_2=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_boolValue_7_2, grammarAccess.getPrimaryExpressionAccess().getBoolValueFalseKeyword_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "boolValue", lv_boolValue_7_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDart.g:4704:3: ( () ( (lv_intValue_9_0= RULE_INT ) ) )
                    {
                    // InternalDart.g:4704:3: ( () ( (lv_intValue_9_0= RULE_INT ) ) )
                    // InternalDart.g:4705:4: () ( (lv_intValue_9_0= RULE_INT ) )
                    {
                    // InternalDart.g:4705:4: ()
                    // InternalDart.g:4706:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDart.g:4715:4: ( (lv_intValue_9_0= RULE_INT ) )
                    // InternalDart.g:4716:5: (lv_intValue_9_0= RULE_INT )
                    {
                    // InternalDart.g:4716:5: (lv_intValue_9_0= RULE_INT )
                    // InternalDart.g:4717:6: lv_intValue_9_0= RULE_INT
                    {
                    lv_intValue_9_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_intValue_9_0, grammarAccess.getPrimaryExpressionAccess().getIntValueINTTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"intValue",
                      							lv_intValue_9_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDart.g:4735:3: ( () ( (lv_stringValue_11_0= RULE_STRING ) ) )
                    {
                    // InternalDart.g:4735:3: ( () ( (lv_stringValue_11_0= RULE_STRING ) ) )
                    // InternalDart.g:4736:4: () ( (lv_stringValue_11_0= RULE_STRING ) )
                    {
                    // InternalDart.g:4736:4: ()
                    // InternalDart.g:4737:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDart.g:4746:4: ( (lv_stringValue_11_0= RULE_STRING ) )
                    // InternalDart.g:4747:5: (lv_stringValue_11_0= RULE_STRING )
                    {
                    // InternalDart.g:4747:5: (lv_stringValue_11_0= RULE_STRING )
                    // InternalDart.g:4748:6: lv_stringValue_11_0= RULE_STRING
                    {
                    lv_stringValue_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_stringValue_11_0, grammarAccess.getPrimaryExpressionAccess().getStringValueSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"stringValue",
                      							lv_stringValue_11_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDart.g:4766:3: ( () ( (lv_name_13_0= RULE_ID ) ) )
                    {
                    // InternalDart.g:4766:3: ( () ( (lv_name_13_0= RULE_ID ) ) )
                    // InternalDart.g:4767:4: () ( (lv_name_13_0= RULE_ID ) )
                    {
                    // InternalDart.g:4767:4: ()
                    // InternalDart.g:4768:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getIdentifierRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDart.g:4777:4: ( (lv_name_13_0= RULE_ID ) )
                    // InternalDart.g:4778:5: (lv_name_13_0= RULE_ID )
                    {
                    // InternalDart.g:4778:5: (lv_name_13_0= RULE_ID )
                    // InternalDart.g:4779:6: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_13_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_13_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDart.g:4797:3: this_CollectionLiteral_14= ruleCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCollectionLiteralParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionLiteral_14=ruleCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteral_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalDart.g:4809:3: ( () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) ) )
                    {
                    // InternalDart.g:4809:3: ( () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) ) )
                    // InternalDart.g:4810:4: () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) )
                    {
                    // InternalDart.g:4810:4: ()
                    // InternalDart.g:4811:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getNewExpressionAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_16=(Token)match(input,96,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_8_1());
                      			
                    }
                    // InternalDart.g:4824:4: ( (lv_type_17_0= ruleType ) )
                    // InternalDart.g:4825:5: (lv_type_17_0= ruleType )
                    {
                    // InternalDart.g:4825:5: (lv_type_17_0= ruleType )
                    // InternalDart.g:4826:6: lv_type_17_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeTypeParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
                    lv_type_17_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_17_0,
                      							"it.lorenzodeluca.dart.Dart.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:4843:4: (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==66) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalDart.g:4844:5: otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) )
                            {
                            otherlv_18=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_8_3_0());
                              				
                            }
                            // InternalDart.g:4848:5: ( (lv_constructor_19_0= RULE_ID ) )
                            // InternalDart.g:4849:6: (lv_constructor_19_0= RULE_ID )
                            {
                            // InternalDart.g:4849:6: (lv_constructor_19_0= RULE_ID )
                            // InternalDart.g:4850:7: lv_constructor_19_0= RULE_ID
                            {
                            lv_constructor_19_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_constructor_19_0, grammarAccess.getPrimaryExpressionAccess().getConstructorIDTerminalRuleCall_8_3_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"constructor",
                              								lv_constructor_19_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalDart.g:4867:4: ( (lv_args_20_0= ruleArguments ) )
                    // InternalDart.g:4868:5: (lv_args_20_0= ruleArguments )
                    {
                    // InternalDart.g:4868:5: (lv_args_20_0= ruleArguments )
                    // InternalDart.g:4869:6: lv_args_20_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsArgumentsParserRuleCall_8_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_args_20_0=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"args",
                      							lv_args_20_0,
                      							"it.lorenzodeluca.dart.Dart.Arguments");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDart.g:4888:3: ( () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) ) )
                    {
                    // InternalDart.g:4888:3: ( () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) ) )
                    // InternalDart.g:4889:4: () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) )
                    {
                    // InternalDart.g:4889:4: ()
                    // InternalDart.g:4890:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getConstExpressionAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getPrimaryExpressionAccess().getConstKeyword_9_1());
                      			
                    }
                    // InternalDart.g:4903:4: ( (lv_type_23_0= ruleType ) )
                    // InternalDart.g:4904:5: (lv_type_23_0= ruleType )
                    {
                    // InternalDart.g:4904:5: (lv_type_23_0= ruleType )
                    // InternalDart.g:4905:6: lv_type_23_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeTypeParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
                    lv_type_23_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_23_0,
                      							"it.lorenzodeluca.dart.Dart.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDart.g:4922:4: (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==66) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalDart.g:4923:5: otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) )
                            {
                            otherlv_24=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_24, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_9_3_0());
                              				
                            }
                            // InternalDart.g:4927:5: ( (lv_constructor_25_0= RULE_ID ) )
                            // InternalDart.g:4928:6: (lv_constructor_25_0= RULE_ID )
                            {
                            // InternalDart.g:4928:6: (lv_constructor_25_0= RULE_ID )
                            // InternalDart.g:4929:7: lv_constructor_25_0= RULE_ID
                            {
                            lv_constructor_25_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_constructor_25_0, grammarAccess.getPrimaryExpressionAccess().getConstructorIDTerminalRuleCall_9_3_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"constructor",
                              								lv_constructor_25_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalDart.g:4946:4: ( (lv_args_26_0= ruleArguments ) )
                    // InternalDart.g:4947:5: (lv_args_26_0= ruleArguments )
                    {
                    // InternalDart.g:4947:5: (lv_args_26_0= ruleArguments )
                    // InternalDart.g:4948:6: lv_args_26_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsArgumentsParserRuleCall_9_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_args_26_0=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"args",
                      							lv_args_26_0,
                      							"it.lorenzodeluca.dart.Dart.Arguments");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDart.g:4967:3: ( () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')' )
                    {
                    // InternalDart.g:4967:3: ( () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')' )
                    // InternalDart.g:4968:4: () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')'
                    {
                    // InternalDart.g:4968:4: ()
                    // InternalDart.g:4969:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_28=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_10_1());
                      			
                    }
                    // InternalDart.g:4982:4: ( (lv_expression_29_0= ruleExpression ) )
                    // InternalDart.g:4983:5: (lv_expression_29_0= ruleExpression )
                    {
                    // InternalDart.g:4983:5: (lv_expression_29_0= ruleExpression )
                    // InternalDart.g:4984:6: lv_expression_29_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionExpressionParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_expression_29_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_29_0,
                      							"it.lorenzodeluca.dart.Dart.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_10_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, rulePrimaryExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleCollectionLiteral"
    // InternalDart.g:5010:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleCollectionLiteral_StartIndex = input.index();
        EObject iv_ruleCollectionLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // InternalDart.g:5010:58: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // InternalDart.g:5011:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleCollectionLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteral"


    // $ANTLR start "ruleCollectionLiteral"
    // InternalDart.g:5017:1: ruleCollectionLiteral returns [EObject current=null] : ( () ( (lv_isConst_1_0= 'const' ) )? ( (lv_typeArguments_2_0= ruleTypeArguments ) )? ( (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' ) | (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' ) ) ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;
        int ruleCollectionLiteral_StartIndex = input.index();
        Token lv_isConst_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_listElements_4_0 = null;

        EObject lv_listElements_6_0 = null;

        EObject lv_mapElements_9_0 = null;

        EObject lv_mapElements_11_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // InternalDart.g:5023:2: ( ( () ( (lv_isConst_1_0= 'const' ) )? ( (lv_typeArguments_2_0= ruleTypeArguments ) )? ( (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' ) | (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' ) ) ) )
            // InternalDart.g:5024:2: ( () ( (lv_isConst_1_0= 'const' ) )? ( (lv_typeArguments_2_0= ruleTypeArguments ) )? ( (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' ) | (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' ) ) )
            {
            // InternalDart.g:5024:2: ( () ( (lv_isConst_1_0= 'const' ) )? ( (lv_typeArguments_2_0= ruleTypeArguments ) )? ( (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' ) | (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' ) ) )
            // InternalDart.g:5025:3: () ( (lv_isConst_1_0= 'const' ) )? ( (lv_typeArguments_2_0= ruleTypeArguments ) )? ( (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' ) | (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' ) )
            {
            // InternalDart.g:5025:3: ()
            // InternalDart.g:5026:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionLiteralAccess().getCollectionLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDart.g:5035:3: ( (lv_isConst_1_0= 'const' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==15) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalDart.g:5036:4: (lv_isConst_1_0= 'const' )
                    {
                    // InternalDart.g:5036:4: (lv_isConst_1_0= 'const' )
                    // InternalDart.g:5037:5: lv_isConst_1_0= 'const'
                    {
                    lv_isConst_1_0=(Token)match(input,15,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isConst_1_0, grammarAccess.getCollectionLiteralAccess().getIsConstConstKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCollectionLiteralRule());
                      					}
                      					setWithLastConsumed(current, "isConst", lv_isConst_1_0 != null, "const");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:5049:3: ( (lv_typeArguments_2_0= ruleTypeArguments ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==60) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDart.g:5050:4: (lv_typeArguments_2_0= ruleTypeArguments )
                    {
                    // InternalDart.g:5050:4: (lv_typeArguments_2_0= ruleTypeArguments )
                    // InternalDart.g:5051:5: lv_typeArguments_2_0= ruleTypeArguments
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionLiteralAccess().getTypeArgumentsTypeArgumentsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_typeArguments_2_0=ruleTypeArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
                      					}
                      					set(
                      						current,
                      						"typeArguments",
                      						lv_typeArguments_2_0,
                      						"it.lorenzodeluca.dart.Dart.TypeArguments");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:5068:3: ( (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' ) | (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==23) ) {
                alt107=1;
            }
            else if ( (LA107_0==25) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalDart.g:5069:4: (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' )
                    {
                    // InternalDart.g:5069:4: (otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']' )
                    // InternalDart.g:5070:5: otherlv_3= '[' ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )? otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_3_0_0());
                      				
                    }
                    // InternalDart.g:5074:5: ( ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )* )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( ((LA104_0>=RULE_ID && LA104_0<=RULE_STRING)||LA104_0==15||LA104_0==20||LA104_0==23||LA104_0==25||LA104_0==42||LA104_0==50||LA104_0==60||(LA104_0>=87 && LA104_0<=96)) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalDart.g:5075:6: ( (lv_listElements_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )*
                            {
                            // InternalDart.g:5075:6: ( (lv_listElements_4_0= ruleExpression ) )
                            // InternalDart.g:5076:7: (lv_listElements_4_0= ruleExpression )
                            {
                            // InternalDart.g:5076:7: (lv_listElements_4_0= ruleExpression )
                            // InternalDart.g:5077:8: lv_listElements_4_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getCollectionLiteralAccess().getListElementsExpressionParserRuleCall_3_0_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_16);
                            lv_listElements_4_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
                              								}
                              								add(
                              									current,
                              									"listElements",
                              									lv_listElements_4_0,
                              									"it.lorenzodeluca.dart.Dart.Expression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalDart.g:5094:6: (otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) ) )*
                            loop103:
                            do {
                                int alt103=2;
                                int LA103_0 = input.LA(1);

                                if ( (LA103_0==16) ) {
                                    alt103=1;
                                }


                                switch (alt103) {
                            	case 1 :
                            	    // InternalDart.g:5095:7: otherlv_5= ',' ( (lv_listElements_6_0= ruleExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralAccess().getCommaKeyword_3_0_1_1_0());
                            	      						
                            	    }
                            	    // InternalDart.g:5099:7: ( (lv_listElements_6_0= ruleExpression ) )
                            	    // InternalDart.g:5100:8: (lv_listElements_6_0= ruleExpression )
                            	    {
                            	    // InternalDart.g:5100:8: (lv_listElements_6_0= ruleExpression )
                            	    // InternalDart.g:5101:9: lv_listElements_6_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getCollectionLiteralAccess().getListElementsExpressionParserRuleCall_3_0_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_16);
                            	    lv_listElements_6_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"listElements",
                            	      										lv_listElements_6_0,
                            	      										"it.lorenzodeluca.dart.Dart.Expression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop103;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:5126:4: (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' )
                    {
                    // InternalDart.g:5126:4: (otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}' )
                    // InternalDart.g:5127:5: otherlv_8= '{' ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )? otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getCollectionLiteralAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalDart.g:5131:5: ( ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )* )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( ((LA106_0>=RULE_ID && LA106_0<=RULE_STRING)||LA106_0==15||LA106_0==20||LA106_0==23||LA106_0==25||LA106_0==42||LA106_0==50||LA106_0==60||(LA106_0>=87 && LA106_0<=96)) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalDart.g:5132:6: ( (lv_mapElements_9_0= ruleMapOrSetElement ) ) (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )*
                            {
                            // InternalDart.g:5132:6: ( (lv_mapElements_9_0= ruleMapOrSetElement ) )
                            // InternalDart.g:5133:7: (lv_mapElements_9_0= ruleMapOrSetElement )
                            {
                            // InternalDart.g:5133:7: (lv_mapElements_9_0= ruleMapOrSetElement )
                            // InternalDart.g:5134:8: lv_mapElements_9_0= ruleMapOrSetElement
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getCollectionLiteralAccess().getMapElementsMapOrSetElementParserRuleCall_3_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_18);
                            lv_mapElements_9_0=ruleMapOrSetElement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
                              								}
                              								add(
                              									current,
                              									"mapElements",
                              									lv_mapElements_9_0,
                              									"it.lorenzodeluca.dart.Dart.MapOrSetElement");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalDart.g:5151:6: (otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) ) )*
                            loop105:
                            do {
                                int alt105=2;
                                int LA105_0 = input.LA(1);

                                if ( (LA105_0==16) ) {
                                    alt105=1;
                                }


                                switch (alt105) {
                            	case 1 :
                            	    // InternalDart.g:5152:7: otherlv_10= ',' ( (lv_mapElements_11_0= ruleMapOrSetElement ) )
                            	    {
                            	    otherlv_10=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_10, grammarAccess.getCollectionLiteralAccess().getCommaKeyword_3_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalDart.g:5156:7: ( (lv_mapElements_11_0= ruleMapOrSetElement ) )
                            	    // InternalDart.g:5157:8: (lv_mapElements_11_0= ruleMapOrSetElement )
                            	    {
                            	    // InternalDart.g:5157:8: (lv_mapElements_11_0= ruleMapOrSetElement )
                            	    // InternalDart.g:5158:9: lv_mapElements_11_0= ruleMapOrSetElement
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getCollectionLiteralAccess().getMapElementsMapOrSetElementParserRuleCall_3_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_18);
                            	    lv_mapElements_11_0=ruleMapOrSetElement();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"mapElements",
                            	      										lv_mapElements_11_0,
                            	      										"it.lorenzodeluca.dart.Dart.MapOrSetElement");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop105;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getCollectionLiteralAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, ruleCollectionLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteral"


    // $ANTLR start "entryRuleMapOrSetElement"
    // InternalDart.g:5187:1: entryRuleMapOrSetElement returns [EObject current=null] : iv_ruleMapOrSetElement= ruleMapOrSetElement EOF ;
    public final EObject entryRuleMapOrSetElement() throws RecognitionException {
        EObject current = null;
        int entryRuleMapOrSetElement_StartIndex = input.index();
        EObject iv_ruleMapOrSetElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // InternalDart.g:5187:56: (iv_ruleMapOrSetElement= ruleMapOrSetElement EOF )
            // InternalDart.g:5188:2: iv_ruleMapOrSetElement= ruleMapOrSetElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapOrSetElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapOrSetElement=ruleMapOrSetElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapOrSetElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, entryRuleMapOrSetElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleMapOrSetElement"


    // $ANTLR start "ruleMapOrSetElement"
    // InternalDart.g:5194:1: ruleMapOrSetElement returns [EObject current=null] : (this_Expression_0= ruleExpression (otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleMapOrSetElement() throws RecognitionException {
        EObject current = null;
        int ruleMapOrSetElement_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_Expression_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // InternalDart.g:5200:2: ( (this_Expression_0= ruleExpression (otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )? ) )
            // InternalDart.g:5201:2: (this_Expression_0= ruleExpression (otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )? )
            {
            // InternalDart.g:5201:2: (this_Expression_0= ruleExpression (otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )? )
            // InternalDart.g:5202:3: this_Expression_0= ruleExpression (otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapOrSetElementAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_76);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDart.g:5213:3: (otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==28) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalDart.g:5214:4: otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapOrSetElementAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalDart.g:5218:4: ( (lv_value_2_0= ruleExpression ) )
                    // InternalDart.g:5219:5: (lv_value_2_0= ruleExpression )
                    {
                    // InternalDart.g:5219:5: (lv_value_2_0= ruleExpression )
                    // InternalDart.g:5220:6: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapOrSetElementAccess().getValueExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapOrSetElementRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"it.lorenzodeluca.dart.Dart.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, ruleMapOrSetElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleMapOrSetElement"


    // $ANTLR start "entryRuleStatement"
    // InternalDart.g:5242:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleStatement_StartIndex = input.index();
        EObject iv_ruleStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // InternalDart.g:5242:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDart.g:5243:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, entryRuleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDart.g:5249:1: ruleStatement returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_statement_1_0= ruleNonLabelledStatement ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;
        int ruleStatement_StartIndex = input.index();
        EObject lv_labels_0_0 = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // InternalDart.g:5255:2: ( ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_statement_1_0= ruleNonLabelledStatement ) ) ) )
            // InternalDart.g:5256:2: ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_statement_1_0= ruleNonLabelledStatement ) ) )
            {
            // InternalDart.g:5256:2: ( ( (lv_labels_0_0= ruleLabel ) )* ( (lv_statement_1_0= ruleNonLabelledStatement ) ) )
            // InternalDart.g:5257:3: ( (lv_labels_0_0= ruleLabel ) )* ( (lv_statement_1_0= ruleNonLabelledStatement ) )
            {
            // InternalDart.g:5257:3: ( (lv_labels_0_0= ruleLabel ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==RULE_ID) ) {
                    int LA109_2 = input.LA(2);

                    if ( (LA109_2==28) ) {
                        alt109=1;
                    }


                }


                switch (alt109) {
            	case 1 :
            	    // InternalDart.g:5258:4: (lv_labels_0_0= ruleLabel )
            	    {
            	    // InternalDart.g:5258:4: (lv_labels_0_0= ruleLabel )
            	    // InternalDart.g:5259:5: lv_labels_0_0= ruleLabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStatementAccess().getLabelsLabelParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_77);
            	    lv_labels_0_0=ruleLabel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"labels",
            	      						lv_labels_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Label");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            // InternalDart.g:5276:3: ( (lv_statement_1_0= ruleNonLabelledStatement ) )
            // InternalDart.g:5277:4: (lv_statement_1_0= ruleNonLabelledStatement )
            {
            // InternalDart.g:5277:4: (lv_statement_1_0= ruleNonLabelledStatement )
            // InternalDart.g:5278:5: lv_statement_1_0= ruleNonLabelledStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStatementAccess().getStatementNonLabelledStatementParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statement_1_0=ruleNonLabelledStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStatementRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_1_0,
              						"it.lorenzodeluca.dart.Dart.NonLabelledStatement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, ruleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLabel"
    // InternalDart.g:5299:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;
        int entryRuleLabel_StartIndex = input.index();
        EObject iv_ruleLabel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // InternalDart.g:5299:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalDart.g:5300:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, entryRuleLabel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalDart.g:5306:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;
        int ruleLabel_StartIndex = input.index();
        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // InternalDart.g:5312:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // InternalDart.g:5313:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // InternalDart.g:5313:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // InternalDart.g:5314:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // InternalDart.g:5314:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDart.g:5315:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDart.g:5315:4: (lv_name_0_0= RULE_ID )
            // InternalDart.g:5316:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLabelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, ruleLabel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleNonLabelledStatement"
    // InternalDart.g:5340:1: entryRuleNonLabelledStatement returns [EObject current=null] : iv_ruleNonLabelledStatement= ruleNonLabelledStatement EOF ;
    public final EObject entryRuleNonLabelledStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleNonLabelledStatement_StartIndex = input.index();
        EObject iv_ruleNonLabelledStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // InternalDart.g:5340:61: (iv_ruleNonLabelledStatement= ruleNonLabelledStatement EOF )
            // InternalDart.g:5341:2: iv_ruleNonLabelledStatement= ruleNonLabelledStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonLabelledStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNonLabelledStatement=ruleNonLabelledStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonLabelledStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, entryRuleNonLabelledStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNonLabelledStatement"


    // $ANTLR start "ruleNonLabelledStatement"
    // InternalDart.g:5347:1: ruleNonLabelledStatement returns [EObject current=null] : (this_Block_0= ruleBlock | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration | this_ForStatement_2= ruleForStatement | this_WhileStatement_3= ruleWhileStatement | this_DoStatement_4= ruleDoStatement | this_SwitchStatement_5= ruleSwitchStatement | this_IfStatement_6= ruleIfStatement | this_RethrowStatement_7= ruleRethrowStatement | this_TryStatement_8= ruleTryStatement | this_BreakStatement_9= ruleBreakStatement | this_ContinueStatement_10= ruleContinueStatement | this_ReturnStatement_11= ruleReturnStatement | this_YieldStatement_12= ruleYieldStatement | this_ExpressionStatement_13= ruleExpressionStatement ) ;
    public final EObject ruleNonLabelledStatement() throws RecognitionException {
        EObject current = null;
        int ruleNonLabelledStatement_StartIndex = input.index();
        EObject this_Block_0 = null;

        EObject this_LocalVariableDeclaration_1 = null;

        EObject this_ForStatement_2 = null;

        EObject this_WhileStatement_3 = null;

        EObject this_DoStatement_4 = null;

        EObject this_SwitchStatement_5 = null;

        EObject this_IfStatement_6 = null;

        EObject this_RethrowStatement_7 = null;

        EObject this_TryStatement_8 = null;

        EObject this_BreakStatement_9 = null;

        EObject this_ContinueStatement_10 = null;

        EObject this_ReturnStatement_11 = null;

        EObject this_YieldStatement_12 = null;

        EObject this_ExpressionStatement_13 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // InternalDart.g:5353:2: ( (this_Block_0= ruleBlock | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration | this_ForStatement_2= ruleForStatement | this_WhileStatement_3= ruleWhileStatement | this_DoStatement_4= ruleDoStatement | this_SwitchStatement_5= ruleSwitchStatement | this_IfStatement_6= ruleIfStatement | this_RethrowStatement_7= ruleRethrowStatement | this_TryStatement_8= ruleTryStatement | this_BreakStatement_9= ruleBreakStatement | this_ContinueStatement_10= ruleContinueStatement | this_ReturnStatement_11= ruleReturnStatement | this_YieldStatement_12= ruleYieldStatement | this_ExpressionStatement_13= ruleExpressionStatement ) )
            // InternalDart.g:5354:2: (this_Block_0= ruleBlock | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration | this_ForStatement_2= ruleForStatement | this_WhileStatement_3= ruleWhileStatement | this_DoStatement_4= ruleDoStatement | this_SwitchStatement_5= ruleSwitchStatement | this_IfStatement_6= ruleIfStatement | this_RethrowStatement_7= ruleRethrowStatement | this_TryStatement_8= ruleTryStatement | this_BreakStatement_9= ruleBreakStatement | this_ContinueStatement_10= ruleContinueStatement | this_ReturnStatement_11= ruleReturnStatement | this_YieldStatement_12= ruleYieldStatement | this_ExpressionStatement_13= ruleExpressionStatement )
            {
            // InternalDart.g:5354:2: (this_Block_0= ruleBlock | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration | this_ForStatement_2= ruleForStatement | this_WhileStatement_3= ruleWhileStatement | this_DoStatement_4= ruleDoStatement | this_SwitchStatement_5= ruleSwitchStatement | this_IfStatement_6= ruleIfStatement | this_RethrowStatement_7= ruleRethrowStatement | this_TryStatement_8= ruleTryStatement | this_BreakStatement_9= ruleBreakStatement | this_ContinueStatement_10= ruleContinueStatement | this_ReturnStatement_11= ruleReturnStatement | this_YieldStatement_12= ruleYieldStatement | this_ExpressionStatement_13= ruleExpressionStatement )
            int alt110=14;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // InternalDart.g:5355:3: this_Block_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getBlockParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:5367:3: this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getLocalVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalVariableDeclaration_1=ruleLocalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LocalVariableDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDart.g:5379:3: this_ForStatement_2= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getForStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_2=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDart.g:5391:3: this_WhileStatement_3= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getWhileStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_3=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDart.g:5403:3: this_DoStatement_4= ruleDoStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getDoStatementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DoStatement_4=ruleDoStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DoStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDart.g:5415:3: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getSwitchStatementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchStatement_5=ruleSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SwitchStatement_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDart.g:5427:3: this_IfStatement_6= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getIfStatementParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_6=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalDart.g:5439:3: this_RethrowStatement_7= ruleRethrowStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getRethrowStatementParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RethrowStatement_7=ruleRethrowStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RethrowStatement_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalDart.g:5451:3: this_TryStatement_8= ruleTryStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getTryStatementParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TryStatement_8=ruleTryStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TryStatement_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalDart.g:5463:3: this_BreakStatement_9= ruleBreakStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getBreakStatementParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BreakStatement_9=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BreakStatement_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalDart.g:5475:3: this_ContinueStatement_10= ruleContinueStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getContinueStatementParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContinueStatement_10=ruleContinueStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContinueStatement_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalDart.g:5487:3: this_ReturnStatement_11= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getReturnStatementParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnStatement_11=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReturnStatement_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalDart.g:5499:3: this_YieldStatement_12= ruleYieldStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getYieldStatementParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YieldStatement_12=ruleYieldStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YieldStatement_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalDart.g:5511:3: this_ExpressionStatement_13= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLabelledStatementAccess().getExpressionStatementParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionStatement_13=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionStatement_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, ruleNonLabelledStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNonLabelledStatement"


    // $ANTLR start "entryRuleBlock"
    // InternalDart.g:5526:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;
        int entryRuleBlock_StartIndex = input.index();
        EObject iv_ruleBlock = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // InternalDart.g:5526:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalDart.g:5527:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, entryRuleBlock_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalDart.g:5533:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;
        int ruleBlock_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // InternalDart.g:5539:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalDart.g:5540:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalDart.g:5540:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalDart.g:5541:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalDart.g:5541:3: ()
            // InternalDart.g:5542:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDart.g:5555:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=RULE_ID && LA111_0<=RULE_STRING)||(LA111_0>=12 && LA111_0<=15)||LA111_0==20||LA111_0==23||LA111_0==25||LA111_0==42||LA111_0==50||LA111_0==60||(LA111_0>=87 && LA111_0<=97)||(LA111_0>=99 && LA111_0<=102)||(LA111_0>=105 && LA111_0<=106)||(LA111_0>=109 && LA111_0<=112)||(LA111_0>=122 && LA111_0<=124)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalDart.g:5556:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalDart.g:5556:4: (lv_statements_2_0= ruleStatement )
            	    // InternalDart.g:5557:5: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_78);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"it.lorenzodeluca.dart.Dart.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, ruleBlock_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // InternalDart.g:5582:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleLocalVariableDeclaration_StartIndex = input.index();
        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // InternalDart.g:5582:65: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // InternalDart.g:5583:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, entryRuleLocalVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariableDeclaration"


    // $ANTLR start "ruleLocalVariableDeclaration"
    // InternalDart.g:5589:1: ruleLocalVariableDeclaration returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableDeclaration ) ) otherlv_1= ';' ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleLocalVariableDeclaration_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // InternalDart.g:5595:2: ( ( ( (lv_variable_0_0= ruleVariableDeclaration ) ) otherlv_1= ';' ) )
            // InternalDart.g:5596:2: ( ( (lv_variable_0_0= ruleVariableDeclaration ) ) otherlv_1= ';' )
            {
            // InternalDart.g:5596:2: ( ( (lv_variable_0_0= ruleVariableDeclaration ) ) otherlv_1= ';' )
            // InternalDart.g:5597:3: ( (lv_variable_0_0= ruleVariableDeclaration ) ) otherlv_1= ';'
            {
            // InternalDart.g:5597:3: ( (lv_variable_0_0= ruleVariableDeclaration ) )
            // InternalDart.g:5598:4: (lv_variable_0_0= ruleVariableDeclaration )
            {
            // InternalDart.g:5598:4: (lv_variable_0_0= ruleVariableDeclaration )
            // InternalDart.g:5599:5: lv_variable_0_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getVariableVariableDeclarationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_variable_0_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_0_0,
              						"it.lorenzodeluca.dart.Dart.VariableDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, ruleLocalVariableDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleIfStatement"
    // InternalDart.g:5624:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleIfStatement_StartIndex = input.index();
        EObject iv_ruleIfStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // InternalDart.g:5624:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalDart.g:5625:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, entryRuleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalDart.g:5631:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;
        int ruleIfStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenStatement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // InternalDart.g:5637:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // InternalDart.g:5638:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // InternalDart.g:5638:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // InternalDart.g:5639:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,97,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDart.g:5647:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalDart.g:5648:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalDart.g:5648:4: (lv_condition_2_0= ruleExpression )
            // InternalDart.g:5649:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"it.lorenzodeluca.dart.Dart.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalDart.g:5670:3: ( (lv_thenStatement_4_0= ruleStatement ) )
            // InternalDart.g:5671:4: (lv_thenStatement_4_0= ruleStatement )
            {
            // InternalDart.g:5671:4: (lv_thenStatement_4_0= ruleStatement )
            // InternalDart.g:5672:5: lv_thenStatement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getThenStatementStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_79);
            lv_thenStatement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"thenStatement",
              						lv_thenStatement_4_0,
              						"it.lorenzodeluca.dart.Dart.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:5689:3: (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==98) ) {
                int LA112_1 = input.LA(2);

                if ( (synpred181_InternalDart()) ) {
                    alt112=1;
                }
            }
            switch (alt112) {
                case 1 :
                    // InternalDart.g:5690:4: otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    otherlv_5=(Token)match(input,98,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalDart.g:5694:4: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // InternalDart.g:5695:5: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // InternalDart.g:5695:5: (lv_elseStatement_6_0= ruleStatement )
                    // InternalDart.g:5696:6: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementStatementParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseStatement_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseStatement",
                      							lv_elseStatement_6_0,
                      							"it.lorenzodeluca.dart.Dart.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, ruleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalDart.g:5718:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleForStatement_StartIndex = input.index();
        EObject iv_ruleForStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // InternalDart.g:5718:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalDart.g:5719:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, entryRuleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalDart.g:5725:1: ruleForStatement returns [EObject current=null] : ( ( (lv_isAwait_0_0= 'await' ) )? otherlv_1= 'for' otherlv_2= '(' ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) | ( (lv_initExpr_4_0= ruleExpression ) )? ) otherlv_5= ';' ( (lv_condition_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_update_8_0= ruleExpression ) )? otherlv_9= ')' ( (lv_body_10_0= ruleStatement ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;
        int ruleForStatement_StartIndex = input.index();
        Token lv_isAwait_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_init_3_0 = null;

        EObject lv_initExpr_4_0 = null;

        EObject lv_condition_6_0 = null;

        EObject lv_update_8_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // InternalDart.g:5731:2: ( ( ( (lv_isAwait_0_0= 'await' ) )? otherlv_1= 'for' otherlv_2= '(' ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) | ( (lv_initExpr_4_0= ruleExpression ) )? ) otherlv_5= ';' ( (lv_condition_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_update_8_0= ruleExpression ) )? otherlv_9= ')' ( (lv_body_10_0= ruleStatement ) ) ) )
            // InternalDart.g:5732:2: ( ( (lv_isAwait_0_0= 'await' ) )? otherlv_1= 'for' otherlv_2= '(' ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) | ( (lv_initExpr_4_0= ruleExpression ) )? ) otherlv_5= ';' ( (lv_condition_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_update_8_0= ruleExpression ) )? otherlv_9= ')' ( (lv_body_10_0= ruleStatement ) ) )
            {
            // InternalDart.g:5732:2: ( ( (lv_isAwait_0_0= 'await' ) )? otherlv_1= 'for' otherlv_2= '(' ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) | ( (lv_initExpr_4_0= ruleExpression ) )? ) otherlv_5= ';' ( (lv_condition_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_update_8_0= ruleExpression ) )? otherlv_9= ')' ( (lv_body_10_0= ruleStatement ) ) )
            // InternalDart.g:5733:3: ( (lv_isAwait_0_0= 'await' ) )? otherlv_1= 'for' otherlv_2= '(' ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) | ( (lv_initExpr_4_0= ruleExpression ) )? ) otherlv_5= ';' ( (lv_condition_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_update_8_0= ruleExpression ) )? otherlv_9= ')' ( (lv_body_10_0= ruleStatement ) )
            {
            // InternalDart.g:5733:3: ( (lv_isAwait_0_0= 'await' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==90) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalDart.g:5734:4: (lv_isAwait_0_0= 'await' )
                    {
                    // InternalDart.g:5734:4: (lv_isAwait_0_0= 'await' )
                    // InternalDart.g:5735:5: lv_isAwait_0_0= 'await'
                    {
                    lv_isAwait_0_0=(Token)match(input,90,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAwait_0_0, grammarAccess.getForStatementAccess().getIsAwaitAwaitKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getForStatementRule());
                      					}
                      					setWithLastConsumed(current, "isAwait", lv_isAwait_0_0 != null, "await");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,99,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDart.g:5755:3: ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) | ( (lv_initExpr_4_0= ruleExpression ) )? )
            int alt115=2;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // InternalDart.g:5756:4: ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) )
                    {
                    // InternalDart.g:5756:4: ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) )
                    // InternalDart.g:5757:5: ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration )
                    {
                    // InternalDart.g:5761:5: (lv_init_3_0= ruleVariableDeclaration )
                    // InternalDart.g:5762:6: lv_init_3_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForStatementAccess().getInitVariableDeclarationParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_init_3_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getForStatementRule());
                      						}
                      						set(
                      							current,
                      							"init",
                      							lv_init_3_0,
                      							"it.lorenzodeluca.dart.Dart.VariableDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:5780:4: ( (lv_initExpr_4_0= ruleExpression ) )?
                    {
                    // InternalDart.g:5780:4: ( (lv_initExpr_4_0= ruleExpression ) )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( ((LA114_0>=RULE_ID && LA114_0<=RULE_STRING)||LA114_0==15||LA114_0==20||LA114_0==23||LA114_0==25||LA114_0==42||LA114_0==50||LA114_0==60||(LA114_0>=87 && LA114_0<=96)) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // InternalDart.g:5781:5: (lv_initExpr_4_0= ruleExpression )
                            {
                            // InternalDart.g:5781:5: (lv_initExpr_4_0= ruleExpression )
                            // InternalDart.g:5782:6: lv_initExpr_4_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStatementAccess().getInitExprExpressionParserRuleCall_3_1_0());
                              					
                            }
                            pushFollow(FOLLOW_22);
                            lv_initExpr_4_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getForStatementRule());
                              						}
                              						set(
                              							current,
                              							"initExpr",
                              							lv_initExpr_4_0,
                              							"it.lorenzodeluca.dart.Dart.Expression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_4());
              		
            }
            // InternalDart.g:5804:3: ( (lv_condition_6_0= ruleExpression ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( ((LA116_0>=RULE_ID && LA116_0<=RULE_STRING)||LA116_0==15||LA116_0==20||LA116_0==23||LA116_0==25||LA116_0==42||LA116_0==50||LA116_0==60||(LA116_0>=87 && LA116_0<=96)) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalDart.g:5805:4: (lv_condition_6_0= ruleExpression )
                    {
                    // InternalDart.g:5805:4: (lv_condition_6_0= ruleExpression )
                    // InternalDart.g:5806:5: lv_condition_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getConditionExpressionParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
                    lv_condition_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForStatementRule());
                      					}
                      					set(
                      						current,
                      						"condition",
                      						lv_condition_6_0,
                      						"it.lorenzodeluca.dart.Dart.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getSemicolonKeyword_6());
              		
            }
            // InternalDart.g:5827:3: ( (lv_update_8_0= ruleExpression ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=RULE_ID && LA117_0<=RULE_STRING)||LA117_0==15||LA117_0==20||LA117_0==23||LA117_0==25||LA117_0==42||LA117_0==50||LA117_0==60||(LA117_0>=87 && LA117_0<=96)) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalDart.g:5828:4: (lv_update_8_0= ruleExpression )
                    {
                    // InternalDart.g:5828:4: (lv_update_8_0= ruleExpression )
                    // InternalDart.g:5829:5: lv_update_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStatementAccess().getUpdateExpressionParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_update_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForStatementRule());
                      					}
                      					set(
                      						current,
                      						"update",
                      						lv_update_8_0,
                      						"it.lorenzodeluca.dart.Dart.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalDart.g:5850:3: ( (lv_body_10_0= ruleStatement ) )
            // InternalDart.g:5851:4: (lv_body_10_0= ruleStatement )
            {
            // InternalDart.g:5851:4: (lv_body_10_0= ruleStatement )
            // InternalDart.g:5852:5: lv_body_10_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getBodyStatementParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_10_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"it.lorenzodeluca.dart.Dart.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 120, ruleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalDart.g:5873:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleWhileStatement_StartIndex = input.index();
        EObject iv_ruleWhileStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // InternalDart.g:5873:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalDart.g:5874:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, entryRuleWhileStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalDart.g:5880:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;
        int ruleWhileStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // InternalDart.g:5886:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) ) )
            // InternalDart.g:5887:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // InternalDart.g:5887:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) ) )
            // InternalDart.g:5888:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDart.g:5896:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalDart.g:5897:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalDart.g:5897:4: (lv_condition_2_0= ruleExpression )
            // InternalDart.g:5898:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"it.lorenzodeluca.dart.Dart.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalDart.g:5919:3: ( (lv_body_4_0= ruleStatement ) )
            // InternalDart.g:5920:4: (lv_body_4_0= ruleStatement )
            {
            // InternalDart.g:5920:4: (lv_body_4_0= ruleStatement )
            // InternalDart.g:5921:5: lv_body_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getBodyStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_4_0,
              						"it.lorenzodeluca.dart.Dart.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, ruleWhileStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleDoStatement"
    // InternalDart.g:5942:1: entryRuleDoStatement returns [EObject current=null] : iv_ruleDoStatement= ruleDoStatement EOF ;
    public final EObject entryRuleDoStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleDoStatement_StartIndex = input.index();
        EObject iv_ruleDoStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // InternalDart.g:5942:52: (iv_ruleDoStatement= ruleDoStatement EOF )
            // InternalDart.g:5943:2: iv_ruleDoStatement= ruleDoStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoStatement=ruleDoStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, entryRuleDoStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDoStatement"


    // $ANTLR start "ruleDoStatement"
    // InternalDart.g:5949:1: ruleDoStatement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_body_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleDoStatement() throws RecognitionException {
        EObject current = null;
        int ruleDoStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_body_1_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return current; }
            // InternalDart.g:5955:2: ( (otherlv_0= 'do' ( (lv_body_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalDart.g:5956:2: (otherlv_0= 'do' ( (lv_body_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalDart.g:5956:2: (otherlv_0= 'do' ( (lv_body_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalDart.g:5957:3: otherlv_0= 'do' ( (lv_body_1_0= ruleStatement ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDoStatementAccess().getDoKeyword_0());
              		
            }
            // InternalDart.g:5961:3: ( (lv_body_1_0= ruleStatement ) )
            // InternalDart.g:5962:4: (lv_body_1_0= ruleStatement )
            {
            // InternalDart.g:5962:4: (lv_body_1_0= ruleStatement )
            // InternalDart.g:5963:5: lv_body_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDoStatementAccess().getBodyStatementParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_83);
            lv_body_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDoStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_1_0,
              						"it.lorenzodeluca.dart.Dart.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,100,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDoStatementAccess().getWhileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDoStatementAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalDart.g:5988:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalDart.g:5989:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalDart.g:5989:4: (lv_condition_4_0= ruleExpression )
            // InternalDart.g:5990:5: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDoStatementAccess().getConditionExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_condition_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDoStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_4_0,
              						"it.lorenzodeluca.dart.Dart.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDoStatementAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDoStatementAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 124, ruleDoStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDoStatement"


    // $ANTLR start "entryRuleSwitchStatement"
    // InternalDart.g:6019:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleSwitchStatement_StartIndex = input.index();
        EObject iv_ruleSwitchStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return current; }
            // InternalDart.g:6019:56: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // InternalDart.g:6020:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, entryRuleSwitchStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStatement"


    // $ANTLR start "ruleSwitchStatement"
    // InternalDart.g:6026:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_defaultCase_6_0= ruleDefaultCase ) )? otherlv_7= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;
        int ruleSwitchStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_defaultCase_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return current; }
            // InternalDart.g:6032:2: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_defaultCase_6_0= ruleDefaultCase ) )? otherlv_7= '}' ) )
            // InternalDart.g:6033:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_defaultCase_6_0= ruleDefaultCase ) )? otherlv_7= '}' )
            {
            // InternalDart.g:6033:2: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_defaultCase_6_0= ruleDefaultCase ) )? otherlv_7= '}' )
            // InternalDart.g:6034:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_defaultCase_6_0= ruleDefaultCase ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDart.g:6042:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalDart.g:6043:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalDart.g:6043:4: (lv_expression_2_0= ruleExpression )
            // InternalDart.g:6044:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchStatementAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"it.lorenzodeluca.dart.Dart.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,25,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalDart.g:6069:3: ( (lv_cases_5_0= ruleSwitchCase ) )*
            loop118:
            do {
                int alt118=2;
                alt118 = dfa118.predict(input);
                switch (alt118) {
            	case 1 :
            	    // InternalDart.g:6070:4: (lv_cases_5_0= ruleSwitchCase )
            	    {
            	    // InternalDart.g:6070:4: (lv_cases_5_0= ruleSwitchCase )
            	    // InternalDart.g:6071:5: lv_cases_5_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesSwitchCaseParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_84);
            	    lv_cases_5_0=ruleSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_5_0,
            	      						"it.lorenzodeluca.dart.Dart.SwitchCase");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            // InternalDart.g:6088:3: ( (lv_defaultCase_6_0= ruleDefaultCase ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RULE_ID||LA119_0==104) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalDart.g:6089:4: (lv_defaultCase_6_0= ruleDefaultCase )
                    {
                    // InternalDart.g:6089:4: (lv_defaultCase_6_0= ruleDefaultCase )
                    // InternalDart.g:6090:5: lv_defaultCase_6_0= ruleDefaultCase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultCaseDefaultCaseParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_47);
                    lv_defaultCase_6_0=ruleDefaultCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
                      					}
                      					set(
                      						current,
                      						"defaultCase",
                      						lv_defaultCase_6_0,
                      						"it.lorenzodeluca.dart.Dart.DefaultCase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, ruleSwitchStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStatement"


    // $ANTLR start "entryRuleSwitchCase"
    // InternalDart.g:6115:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;
        int entryRuleSwitchCase_StartIndex = input.index();
        EObject iv_ruleSwitchCase = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return current; }
            // InternalDart.g:6115:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalDart.g:6116:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, entryRuleSwitchCase_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // InternalDart.g:6122:1: ruleSwitchCase returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'case' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statements_4_0= ruleStatement ) )* ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;
        int ruleSwitchCase_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_labels_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return current; }
            // InternalDart.g:6128:2: ( ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'case' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statements_4_0= ruleStatement ) )* ) )
            // InternalDart.g:6129:2: ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'case' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statements_4_0= ruleStatement ) )* )
            {
            // InternalDart.g:6129:2: ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'case' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statements_4_0= ruleStatement ) )* )
            // InternalDart.g:6130:3: ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'case' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statements_4_0= ruleStatement ) )*
            {
            // InternalDart.g:6130:3: ( (lv_labels_0_0= ruleLabel ) )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==RULE_ID) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // InternalDart.g:6131:4: (lv_labels_0_0= ruleLabel )
            	    {
            	    // InternalDart.g:6131:4: (lv_labels_0_0= ruleLabel )
            	    // InternalDart.g:6132:5: lv_labels_0_0= ruleLabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseAccess().getLabelsLabelParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_85);
            	    lv_labels_0_0=ruleLabel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"labels",
            	      						lv_labels_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Label");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);

            otherlv_1=(Token)match(input,103,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getCaseKeyword_1());
              		
            }
            // InternalDart.g:6153:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalDart.g:6154:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalDart.g:6154:4: (lv_expression_2_0= ruleExpression )
            // InternalDart.g:6155:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchCaseAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"it.lorenzodeluca.dart.Dart.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getColonKeyword_3());
              		
            }
            // InternalDart.g:6176:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop121:
            do {
                int alt121=2;
                alt121 = dfa121.predict(input);
                switch (alt121) {
            	case 1 :
            	    // InternalDart.g:6177:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalDart.g:6177:4: (lv_statements_4_0= ruleStatement )
            	    // InternalDart.g:6178:5: lv_statements_4_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementsStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_86);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_4_0,
            	      						"it.lorenzodeluca.dart.Dart.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, ruleSwitchCase_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleDefaultCase"
    // InternalDart.g:6199:1: entryRuleDefaultCase returns [EObject current=null] : iv_ruleDefaultCase= ruleDefaultCase EOF ;
    public final EObject entryRuleDefaultCase() throws RecognitionException {
        EObject current = null;
        int entryRuleDefaultCase_StartIndex = input.index();
        EObject iv_ruleDefaultCase = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return current; }
            // InternalDart.g:6199:52: (iv_ruleDefaultCase= ruleDefaultCase EOF )
            // InternalDart.g:6200:2: iv_ruleDefaultCase= ruleDefaultCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultCase=ruleDefaultCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, entryRuleDefaultCase_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultCase"


    // $ANTLR start "ruleDefaultCase"
    // InternalDart.g:6206:1: ruleDefaultCase returns [EObject current=null] : ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleDefaultCase() throws RecognitionException {
        EObject current = null;
        int ruleDefaultCase_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_labels_0_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return current; }
            // InternalDart.g:6212:2: ( ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalDart.g:6213:2: ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalDart.g:6213:2: ( ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalDart.g:6214:3: ( (lv_labels_0_0= ruleLabel ) )* otherlv_1= 'default' otherlv_2= ':' ( (lv_statements_3_0= ruleStatement ) )*
            {
            // InternalDart.g:6214:3: ( (lv_labels_0_0= ruleLabel ) )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==RULE_ID) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // InternalDart.g:6215:4: (lv_labels_0_0= ruleLabel )
            	    {
            	    // InternalDart.g:6215:4: (lv_labels_0_0= ruleLabel )
            	    // InternalDart.g:6216:5: lv_labels_0_0= ruleLabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefaultCaseAccess().getLabelsLabelParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_87);
            	    lv_labels_0_0=ruleLabel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefaultCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"labels",
            	      						lv_labels_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Label");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);

            otherlv_1=(Token)match(input,104,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultCaseAccess().getDefaultKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,28,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefaultCaseAccess().getColonKeyword_2());
              		
            }
            // InternalDart.g:6241:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=RULE_ID && LA123_0<=RULE_STRING)||(LA123_0>=12 && LA123_0<=15)||LA123_0==20||LA123_0==23||LA123_0==25||LA123_0==42||LA123_0==50||LA123_0==60||(LA123_0>=87 && LA123_0<=97)||(LA123_0>=99 && LA123_0<=102)||(LA123_0>=105 && LA123_0<=106)||(LA123_0>=109 && LA123_0<=112)||(LA123_0>=122 && LA123_0<=124)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // InternalDart.g:6242:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalDart.g:6242:4: (lv_statements_3_0= ruleStatement )
            	    // InternalDart.g:6243:5: lv_statements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefaultCaseAccess().getStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_86);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefaultCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_3_0,
            	      						"it.lorenzodeluca.dart.Dart.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, ruleDefaultCase_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDefaultCase"


    // $ANTLR start "entryRuleRethrowStatement"
    // InternalDart.g:6264:1: entryRuleRethrowStatement returns [EObject current=null] : iv_ruleRethrowStatement= ruleRethrowStatement EOF ;
    public final EObject entryRuleRethrowStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleRethrowStatement_StartIndex = input.index();
        EObject iv_ruleRethrowStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return current; }
            // InternalDart.g:6264:57: (iv_ruleRethrowStatement= ruleRethrowStatement EOF )
            // InternalDart.g:6265:2: iv_ruleRethrowStatement= ruleRethrowStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRethrowStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRethrowStatement=ruleRethrowStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRethrowStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, entryRuleRethrowStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRethrowStatement"


    // $ANTLR start "ruleRethrowStatement"
    // InternalDart.g:6271:1: ruleRethrowStatement returns [EObject current=null] : ( () otherlv_1= 'rethrow' otherlv_2= ';' ) ;
    public final EObject ruleRethrowStatement() throws RecognitionException {
        EObject current = null;
        int ruleRethrowStatement_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return current; }
            // InternalDart.g:6277:2: ( ( () otherlv_1= 'rethrow' otherlv_2= ';' ) )
            // InternalDart.g:6278:2: ( () otherlv_1= 'rethrow' otherlv_2= ';' )
            {
            // InternalDart.g:6278:2: ( () otherlv_1= 'rethrow' otherlv_2= ';' )
            // InternalDart.g:6279:3: () otherlv_1= 'rethrow' otherlv_2= ';'
            {
            // InternalDart.g:6279:3: ()
            // InternalDart.g:6280:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRethrowStatementAccess().getRethrowStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,105,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRethrowStatementAccess().getRethrowKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRethrowStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, ruleRethrowStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRethrowStatement"


    // $ANTLR start "entryRuleTryStatement"
    // InternalDart.g:6301:1: entryRuleTryStatement returns [EObject current=null] : iv_ruleTryStatement= ruleTryStatement EOF ;
    public final EObject entryRuleTryStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleTryStatement_StartIndex = input.index();
        EObject iv_ruleTryStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return current; }
            // InternalDart.g:6301:53: (iv_ruleTryStatement= ruleTryStatement EOF )
            // InternalDart.g:6302:2: iv_ruleTryStatement= ruleTryStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTryStatement=ruleTryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, entryRuleTryStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTryStatement"


    // $ANTLR start "ruleTryStatement"
    // InternalDart.g:6308:1: ruleTryStatement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_block_1_0= ruleBlock ) ) ( ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause ) )* ( (lv_finallyBlock_3_0= ruleFinallyClause ) )? ) ;
    public final EObject ruleTryStatement() throws RecognitionException {
        EObject current = null;
        int ruleTryStatement_StartIndex = input.index();
        Token otherlv_0=null;
        EObject lv_block_1_0 = null;

        EObject lv_catchClauses_2_0 = null;

        EObject lv_finallyBlock_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return current; }
            // InternalDart.g:6314:2: ( (otherlv_0= 'try' ( (lv_block_1_0= ruleBlock ) ) ( ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause ) )* ( (lv_finallyBlock_3_0= ruleFinallyClause ) )? ) )
            // InternalDart.g:6315:2: (otherlv_0= 'try' ( (lv_block_1_0= ruleBlock ) ) ( ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause ) )* ( (lv_finallyBlock_3_0= ruleFinallyClause ) )? )
            {
            // InternalDart.g:6315:2: (otherlv_0= 'try' ( (lv_block_1_0= ruleBlock ) ) ( ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause ) )* ( (lv_finallyBlock_3_0= ruleFinallyClause ) )? )
            // InternalDart.g:6316:3: otherlv_0= 'try' ( (lv_block_1_0= ruleBlock ) ) ( ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause ) )* ( (lv_finallyBlock_3_0= ruleFinallyClause ) )?
            {
            otherlv_0=(Token)match(input,106,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTryStatementAccess().getTryKeyword_0());
              		
            }
            // InternalDart.g:6320:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalDart.g:6321:4: (lv_block_1_0= ruleBlock )
            {
            // InternalDart.g:6321:4: (lv_block_1_0= ruleBlock )
            // InternalDart.g:6322:5: lv_block_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTryStatementAccess().getBlockBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_88);
            lv_block_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTryStatementRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_1_0,
              						"it.lorenzodeluca.dart.Dart.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:6339:3: ( ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause ) )*
            loop124:
            do {
                int alt124=2;
                alt124 = dfa124.predict(input);
                switch (alt124) {
            	case 1 :
            	    // InternalDart.g:6340:4: ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause )
            	    {
            	    // InternalDart.g:6344:4: (lv_catchClauses_2_0= ruleCatchClause )
            	    // InternalDart.g:6345:5: lv_catchClauses_2_0= ruleCatchClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTryStatementAccess().getCatchClausesCatchClauseParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_88);
            	    lv_catchClauses_2_0=ruleCatchClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTryStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"catchClauses",
            	      						lv_catchClauses_2_0,
            	      						"it.lorenzodeluca.dart.Dart.CatchClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            // InternalDart.g:6362:3: ( (lv_finallyBlock_3_0= ruleFinallyClause ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==108) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalDart.g:6363:4: (lv_finallyBlock_3_0= ruleFinallyClause )
                    {
                    // InternalDart.g:6363:4: (lv_finallyBlock_3_0= ruleFinallyClause )
                    // InternalDart.g:6364:5: lv_finallyBlock_3_0= ruleFinallyClause
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTryStatementAccess().getFinallyBlockFinallyClauseParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_finallyBlock_3_0=ruleFinallyClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTryStatementRule());
                      					}
                      					set(
                      						current,
                      						"finallyBlock",
                      						lv_finallyBlock_3_0,
                      						"it.lorenzodeluca.dart.Dart.FinallyClause");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, ruleTryStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTryStatement"


    // $ANTLR start "entryRuleCatchClause"
    // InternalDart.g:6385:1: entryRuleCatchClause returns [EObject current=null] : iv_ruleCatchClause= ruleCatchClause EOF ;
    public final EObject entryRuleCatchClause() throws RecognitionException {
        EObject current = null;
        int entryRuleCatchClause_StartIndex = input.index();
        EObject iv_ruleCatchClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return current; }
            // InternalDart.g:6385:52: (iv_ruleCatchClause= ruleCatchClause EOF )
            // InternalDart.g:6386:2: iv_ruleCatchClause= ruleCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCatchClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCatchClause=ruleCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCatchClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, entryRuleCatchClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCatchClause"


    // $ANTLR start "ruleCatchClause"
    // InternalDart.g:6392:1: ruleCatchClause returns [EObject current=null] : ( (otherlv_0= 'on' ( (lv_type_1_0= ruleType ) ) )? (otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )? otherlv_7= ')' )? ( (lv_block_8_0= ruleBlock ) ) ) ;
    public final EObject ruleCatchClause() throws RecognitionException {
        EObject current = null;
        int ruleCatchClause_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_exception_4_0=null;
        Token otherlv_5=null;
        Token lv_stackTrace_6_0=null;
        Token otherlv_7=null;
        EObject lv_type_1_0 = null;

        EObject lv_block_8_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return current; }
            // InternalDart.g:6398:2: ( ( (otherlv_0= 'on' ( (lv_type_1_0= ruleType ) ) )? (otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )? otherlv_7= ')' )? ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalDart.g:6399:2: ( (otherlv_0= 'on' ( (lv_type_1_0= ruleType ) ) )? (otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )? otherlv_7= ')' )? ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalDart.g:6399:2: ( (otherlv_0= 'on' ( (lv_type_1_0= ruleType ) ) )? (otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )? otherlv_7= ')' )? ( (lv_block_8_0= ruleBlock ) ) )
            // InternalDart.g:6400:3: (otherlv_0= 'on' ( (lv_type_1_0= ruleType ) ) )? (otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )? otherlv_7= ')' )? ( (lv_block_8_0= ruleBlock ) )
            {
            // InternalDart.g:6400:3: (otherlv_0= 'on' ( (lv_type_1_0= ruleType ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==62) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalDart.g:6401:4: otherlv_0= 'on' ( (lv_type_1_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCatchClauseAccess().getOnKeyword_0_0());
                      			
                    }
                    // InternalDart.g:6405:4: ( (lv_type_1_0= ruleType ) )
                    // InternalDart.g:6406:5: (lv_type_1_0= ruleType )
                    {
                    // InternalDart.g:6406:5: (lv_type_1_0= ruleType )
                    // InternalDart.g:6407:6: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCatchClauseAccess().getTypeTypeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_89);
                    lv_type_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCatchClauseRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_1_0,
                      							"it.lorenzodeluca.dart.Dart.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDart.g:6425:3: (otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )? otherlv_7= ')' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==107) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalDart.g:6426:4: otherlv_2= 'catch' otherlv_3= '(' ( (lv_exception_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )? otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,107,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCatchClauseAccess().getCatchKeyword_1_0());
                      			
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCatchClauseAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalDart.g:6434:4: ( (lv_exception_4_0= RULE_ID ) )
                    // InternalDart.g:6435:5: (lv_exception_4_0= RULE_ID )
                    {
                    // InternalDart.g:6435:5: (lv_exception_4_0= RULE_ID )
                    // InternalDart.g:6436:6: lv_exception_4_0= RULE_ID
                    {
                    lv_exception_4_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exception_4_0, grammarAccess.getCatchClauseAccess().getExceptionIDTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatchClauseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exception",
                      							lv_exception_4_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalDart.g:6452:4: (otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) ) )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==16) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalDart.g:6453:5: otherlv_5= ',' ( (lv_stackTrace_6_0= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getCatchClauseAccess().getCommaKeyword_1_3_0());
                              				
                            }
                            // InternalDart.g:6457:5: ( (lv_stackTrace_6_0= RULE_ID ) )
                            // InternalDart.g:6458:6: (lv_stackTrace_6_0= RULE_ID )
                            {
                            // InternalDart.g:6458:6: (lv_stackTrace_6_0= RULE_ID )
                            // InternalDart.g:6459:7: lv_stackTrace_6_0= RULE_ID
                            {
                            lv_stackTrace_6_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_stackTrace_6_0, grammarAccess.getCatchClauseAccess().getStackTraceIDTerminalRuleCall_1_3_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getCatchClauseRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"stackTrace",
                              								lv_stackTrace_6_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getCatchClauseAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }
                    break;

            }

            // InternalDart.g:6481:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalDart.g:6482:4: (lv_block_8_0= ruleBlock )
            {
            // InternalDart.g:6482:4: (lv_block_8_0= ruleBlock )
            // InternalDart.g:6483:5: lv_block_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCatchClauseAccess().getBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCatchClauseRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_8_0,
              						"it.lorenzodeluca.dart.Dart.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, ruleCatchClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCatchClause"


    // $ANTLR start "entryRuleFinallyClause"
    // InternalDart.g:6504:1: entryRuleFinallyClause returns [EObject current=null] : iv_ruleFinallyClause= ruleFinallyClause EOF ;
    public final EObject entryRuleFinallyClause() throws RecognitionException {
        EObject current = null;
        int entryRuleFinallyClause_StartIndex = input.index();
        EObject iv_ruleFinallyClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return current; }
            // InternalDart.g:6504:54: (iv_ruleFinallyClause= ruleFinallyClause EOF )
            // InternalDart.g:6505:2: iv_ruleFinallyClause= ruleFinallyClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinallyClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFinallyClause=ruleFinallyClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFinallyClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, entryRuleFinallyClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFinallyClause"


    // $ANTLR start "ruleFinallyClause"
    // InternalDart.g:6511:1: ruleFinallyClause returns [EObject current=null] : (otherlv_0= 'finally' ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleFinallyClause() throws RecognitionException {
        EObject current = null;
        int ruleFinallyClause_StartIndex = input.index();
        Token otherlv_0=null;
        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return current; }
            // InternalDart.g:6517:2: ( (otherlv_0= 'finally' ( (lv_block_1_0= ruleBlock ) ) ) )
            // InternalDart.g:6518:2: (otherlv_0= 'finally' ( (lv_block_1_0= ruleBlock ) ) )
            {
            // InternalDart.g:6518:2: (otherlv_0= 'finally' ( (lv_block_1_0= ruleBlock ) ) )
            // InternalDart.g:6519:3: otherlv_0= 'finally' ( (lv_block_1_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFinallyClauseAccess().getFinallyKeyword_0());
              		
            }
            // InternalDart.g:6523:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalDart.g:6524:4: (lv_block_1_0= ruleBlock )
            {
            // InternalDart.g:6524:4: (lv_block_1_0= ruleBlock )
            // InternalDart.g:6525:5: lv_block_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFinallyClauseAccess().getBlockBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFinallyClauseRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_1_0,
              						"it.lorenzodeluca.dart.Dart.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, ruleFinallyClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFinallyClause"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalDart.g:6546:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleBreakStatement_StartIndex = input.index();
        EObject iv_ruleBreakStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return current; }
            // InternalDart.g:6546:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalDart.g:6547:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, entryRuleBreakStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalDart.g:6553:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;
        int ruleBreakStatement_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return current; }
            // InternalDart.g:6559:2: ( ( () otherlv_1= 'break' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' ) )
            // InternalDart.g:6560:2: ( () otherlv_1= 'break' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' )
            {
            // InternalDart.g:6560:2: ( () otherlv_1= 'break' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' )
            // InternalDart.g:6561:3: () otherlv_1= 'break' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';'
            {
            // InternalDart.g:6561:3: ()
            // InternalDart.g:6562:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,109,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
              		
            }
            // InternalDart.g:6575:3: ( (lv_label_2_0= RULE_ID ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_ID) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalDart.g:6576:4: (lv_label_2_0= RULE_ID )
                    {
                    // InternalDart.g:6576:4: (lv_label_2_0= RULE_ID )
                    // InternalDart.g:6577:5: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_label_2_0, grammarAccess.getBreakStatementAccess().getLabelIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBreakStatementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"label",
                      						lv_label_2_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 140, ruleBreakStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleContinueStatement"
    // InternalDart.g:6601:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleContinueStatement_StartIndex = input.index();
        EObject iv_ruleContinueStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return current; }
            // InternalDart.g:6601:58: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalDart.g:6602:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 141, entryRuleContinueStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleContinueStatement"


    // $ANTLR start "ruleContinueStatement"
    // InternalDart.g:6608:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;
        int ruleContinueStatement_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return current; }
            // InternalDart.g:6614:2: ( ( () otherlv_1= 'continue' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' ) )
            // InternalDart.g:6615:2: ( () otherlv_1= 'continue' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' )
            {
            // InternalDart.g:6615:2: ( () otherlv_1= 'continue' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';' )
            // InternalDart.g:6616:3: () otherlv_1= 'continue' ( (lv_label_2_0= RULE_ID ) )? otherlv_3= ';'
            {
            // InternalDart.g:6616:3: ()
            // InternalDart.g:6617:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,110,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
              		
            }
            // InternalDart.g:6630:3: ( (lv_label_2_0= RULE_ID ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==RULE_ID) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalDart.g:6631:4: (lv_label_2_0= RULE_ID )
                    {
                    // InternalDart.g:6631:4: (lv_label_2_0= RULE_ID )
                    // InternalDart.g:6632:5: lv_label_2_0= RULE_ID
                    {
                    lv_label_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_label_2_0, grammarAccess.getContinueStatementAccess().getLabelIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getContinueStatementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"label",
                      						lv_label_2_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getContinueStatementAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 142, ruleContinueStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleContinueStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalDart.g:6656:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleReturnStatement_StartIndex = input.index();
        EObject iv_ruleReturnStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return current; }
            // InternalDart.g:6656:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalDart.g:6657:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 143, entryRuleReturnStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalDart.g:6663:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;
        int ruleReturnStatement_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return current; }
            // InternalDart.g:6669:2: ( ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' ) )
            // InternalDart.g:6670:2: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            {
            // InternalDart.g:6670:2: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';' )
            // InternalDart.g:6671:3: () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? otherlv_3= ';'
            {
            // InternalDart.g:6671:3: ()
            // InternalDart.g:6672:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,111,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
              		
            }
            // InternalDart.g:6685:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( ((LA131_0>=RULE_ID && LA131_0<=RULE_STRING)||LA131_0==15||LA131_0==20||LA131_0==23||LA131_0==25||LA131_0==42||LA131_0==50||LA131_0==60||(LA131_0>=87 && LA131_0<=96)) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalDart.g:6686:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalDart.g:6686:4: (lv_expression_2_0= ruleExpression )
                    // InternalDart.g:6687:5: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getReturnStatementRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_2_0,
                      						"it.lorenzodeluca.dart.Dart.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 144, ruleReturnStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleYieldStatement"
    // InternalDart.g:6712:1: entryRuleYieldStatement returns [EObject current=null] : iv_ruleYieldStatement= ruleYieldStatement EOF ;
    public final EObject entryRuleYieldStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleYieldStatement_StartIndex = input.index();
        EObject iv_ruleYieldStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return current; }
            // InternalDart.g:6712:55: (iv_ruleYieldStatement= ruleYieldStatement EOF )
            // InternalDart.g:6713:2: iv_ruleYieldStatement= ruleYieldStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYieldStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYieldStatement=ruleYieldStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYieldStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 145, entryRuleYieldStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleYieldStatement"


    // $ANTLR start "ruleYieldStatement"
    // InternalDart.g:6719:1: ruleYieldStatement returns [EObject current=null] : ( () otherlv_1= 'yield' ( (lv_isStar_2_0= '*' ) )? ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleYieldStatement() throws RecognitionException {
        EObject current = null;
        int ruleYieldStatement_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_isStar_2_0=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return current; }
            // InternalDart.g:6725:2: ( ( () otherlv_1= 'yield' ( (lv_isStar_2_0= '*' ) )? ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // InternalDart.g:6726:2: ( () otherlv_1= 'yield' ( (lv_isStar_2_0= '*' ) )? ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // InternalDart.g:6726:2: ( () otherlv_1= 'yield' ( (lv_isStar_2_0= '*' ) )? ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
            // InternalDart.g:6727:3: () otherlv_1= 'yield' ( (lv_isStar_2_0= '*' ) )? ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // InternalDart.g:6727:3: ()
            // InternalDart.g:6728:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYieldStatementAccess().getYieldStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,112,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYieldStatementAccess().getYieldKeyword_1());
              		
            }
            // InternalDart.g:6741:3: ( (lv_isStar_2_0= '*' ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==31) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalDart.g:6742:4: (lv_isStar_2_0= '*' )
                    {
                    // InternalDart.g:6742:4: (lv_isStar_2_0= '*' )
                    // InternalDart.g:6743:5: lv_isStar_2_0= '*'
                    {
                    lv_isStar_2_0=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isStar_2_0, grammarAccess.getYieldStatementAccess().getIsStarAsteriskKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYieldStatementRule());
                      					}
                      					setWithLastConsumed(current, "isStar", lv_isStar_2_0 != null, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:6755:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalDart.g:6756:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalDart.g:6756:4: (lv_expression_3_0= ruleExpression )
            // InternalDart.g:6757:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYieldStatementAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYieldStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"it.lorenzodeluca.dart.Dart.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYieldStatementAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 146, ruleYieldStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleYieldStatement"


    // $ANTLR start "entryRuleExpressionStatement"
    // InternalDart.g:6782:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleExpressionStatement_StartIndex = input.index();
        EObject iv_ruleExpressionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return current; }
            // InternalDart.g:6782:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalDart.g:6783:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 147, entryRuleExpressionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // InternalDart.g:6789:1: ruleExpressionStatement returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;
        int ruleExpressionStatement_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return current; }
            // InternalDart.g:6795:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // InternalDart.g:6796:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // InternalDart.g:6796:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // InternalDart.g:6797:3: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // InternalDart.g:6797:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalDart.g:6798:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalDart.g:6798:4: (lv_expression_0_0= ruleExpression )
            // InternalDart.g:6799:5: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"it.lorenzodeluca.dart.Dart.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 148, ruleExpressionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRuleLibraryDeclaration"
    // InternalDart.g:6824:1: entryRuleLibraryDeclaration returns [EObject current=null] : iv_ruleLibraryDeclaration= ruleLibraryDeclaration EOF ;
    public final EObject entryRuleLibraryDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRuleLibraryDeclaration_StartIndex = input.index();
        EObject iv_ruleLibraryDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return current; }
            // InternalDart.g:6824:59: (iv_ruleLibraryDeclaration= ruleLibraryDeclaration EOF )
            // InternalDart.g:6825:2: iv_ruleLibraryDeclaration= ruleLibraryDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLibraryDeclaration=ruleLibraryDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 149, entryRuleLibraryDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLibraryDeclaration"


    // $ANTLR start "ruleLibraryDeclaration"
    // InternalDart.g:6831:1: ruleLibraryDeclaration returns [EObject current=null] : ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_elements_2_0= ruleElementWithMetadata ) )* ) ;
    public final EObject ruleLibraryDeclaration() throws RecognitionException {
        EObject current = null;
        int ruleLibraryDeclaration_StartIndex = input.index();
        EObject lv_scriptTag_0_0 = null;

        EObject lv_libraryName_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return current; }
            // InternalDart.g:6837:2: ( ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_elements_2_0= ruleElementWithMetadata ) )* ) )
            // InternalDart.g:6838:2: ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_elements_2_0= ruleElementWithMetadata ) )* )
            {
            // InternalDart.g:6838:2: ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_elements_2_0= ruleElementWithMetadata ) )* )
            // InternalDart.g:6839:3: ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_elements_2_0= ruleElementWithMetadata ) )*
            {
            // InternalDart.g:6839:3: ( (lv_scriptTag_0_0= ruleScriptTag ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==RULE_SCRIPT_TAG) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalDart.g:6840:4: (lv_scriptTag_0_0= ruleScriptTag )
                    {
                    // InternalDart.g:6840:4: (lv_scriptTag_0_0= ruleScriptTag )
                    // InternalDart.g:6841:5: lv_scriptTag_0_0= ruleScriptTag
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLibraryDeclarationAccess().getScriptTagScriptTagParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_92);
                    lv_scriptTag_0_0=ruleScriptTag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLibraryDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"scriptTag",
                      						lv_scriptTag_0_0,
                      						"it.lorenzodeluca.dart.Dart.ScriptTag");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:6858:3: ( (lv_libraryName_1_0= ruleLibraryName ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==119) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalDart.g:6859:4: (lv_libraryName_1_0= ruleLibraryName )
                    {
                    // InternalDart.g:6859:4: (lv_libraryName_1_0= ruleLibraryName )
                    // InternalDart.g:6860:5: lv_libraryName_1_0= ruleLibraryName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLibraryDeclarationAccess().getLibraryNameLibraryNameParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_93);
                    lv_libraryName_1_0=ruleLibraryName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLibraryDeclarationRule());
                      					}
                      					set(
                      						current,
                      						"libraryName",
                      						lv_libraryName_1_0,
                      						"it.lorenzodeluca.dart.Dart.LibraryName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:6877:3: ( (lv_elements_2_0= ruleElementWithMetadata ) )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==RULE_ID||(LA135_0>=12 && LA135_0<=15)||LA135_0==18||(LA135_0>=33 && LA135_0<=34)||LA135_0==61||(LA135_0>=63 && LA135_0<=65)||LA135_0==113||LA135_0==115||LA135_0==118||(LA135_0>=121 && LA135_0<=124)) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalDart.g:6878:4: (lv_elements_2_0= ruleElementWithMetadata )
            	    {
            	    // InternalDart.g:6878:4: (lv_elements_2_0= ruleElementWithMetadata )
            	    // InternalDart.g:6879:5: lv_elements_2_0= ruleElementWithMetadata
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLibraryDeclarationAccess().getElementsElementWithMetadataParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_93);
            	    lv_elements_2_0=ruleElementWithMetadata();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLibraryDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_2_0,
            	      						"it.lorenzodeluca.dart.Dart.ElementWithMetadata");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 150, ruleLibraryDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLibraryDeclaration"


    // $ANTLR start "entryRuleElementWithMetadata"
    // InternalDart.g:6900:1: entryRuleElementWithMetadata returns [EObject current=null] : iv_ruleElementWithMetadata= ruleElementWithMetadata EOF ;
    public final EObject entryRuleElementWithMetadata() throws RecognitionException {
        EObject current = null;
        int entryRuleElementWithMetadata_StartIndex = input.index();
        EObject iv_ruleElementWithMetadata = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return current; }
            // InternalDart.g:6900:60: (iv_ruleElementWithMetadata= ruleElementWithMetadata EOF )
            // InternalDart.g:6901:2: iv_ruleElementWithMetadata= ruleElementWithMetadata EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementWithMetadataRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementWithMetadata=ruleElementWithMetadata();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementWithMetadata; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 151, entryRuleElementWithMetadata_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleElementWithMetadata"


    // $ANTLR start "ruleElementWithMetadata"
    // InternalDart.g:6907:1: ruleElementWithMetadata returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( ( (lv_element_1_0= ruleImportOrExportContent ) ) | ( (lv_element_2_0= rulePartDirectiveContent ) ) | ( (lv_member_3_0= ruleTopLevelDeclarationContent ) ) ) ) ;
    public final EObject ruleElementWithMetadata() throws RecognitionException {
        EObject current = null;
        int ruleElementWithMetadata_StartIndex = input.index();
        EObject lv_metadata_0_0 = null;

        EObject lv_element_1_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_member_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return current; }
            // InternalDart.g:6913:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( ( (lv_element_1_0= ruleImportOrExportContent ) ) | ( (lv_element_2_0= rulePartDirectiveContent ) ) | ( (lv_member_3_0= ruleTopLevelDeclarationContent ) ) ) ) )
            // InternalDart.g:6914:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( ( (lv_element_1_0= ruleImportOrExportContent ) ) | ( (lv_element_2_0= rulePartDirectiveContent ) ) | ( (lv_member_3_0= ruleTopLevelDeclarationContent ) ) ) )
            {
            // InternalDart.g:6914:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( ( (lv_element_1_0= ruleImportOrExportContent ) ) | ( (lv_element_2_0= rulePartDirectiveContent ) ) | ( (lv_member_3_0= ruleTopLevelDeclarationContent ) ) ) )
            // InternalDart.g:6915:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( ( (lv_element_1_0= ruleImportOrExportContent ) ) | ( (lv_element_2_0= rulePartDirectiveContent ) ) | ( (lv_member_3_0= ruleTopLevelDeclarationContent ) ) )
            {
            // InternalDart.g:6915:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==65) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // InternalDart.g:6916:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:6916:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:6917:5: lv_metadata_0_0= ruleMetadata
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElementWithMetadataAccess().getMetadataMetadataParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_94);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getElementWithMetadataRule());
            	      					}
            	      					add(
            	      						current,
            	      						"metadata",
            	      						lv_metadata_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Metadata");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);

            // InternalDart.g:6934:3: ( ( (lv_element_1_0= ruleImportOrExportContent ) ) | ( (lv_element_2_0= rulePartDirectiveContent ) ) | ( (lv_member_3_0= ruleTopLevelDeclarationContent ) ) )
            int alt137=3;
            switch ( input.LA(1) ) {
            case 113:
            case 115:
                {
                alt137=1;
                }
                break;
            case 118:
                {
                alt137=2;
                }
                break;
            case RULE_ID:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 33:
            case 34:
            case 61:
            case 63:
            case 64:
            case 121:
            case 122:
            case 123:
            case 124:
                {
                alt137=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // InternalDart.g:6935:4: ( (lv_element_1_0= ruleImportOrExportContent ) )
                    {
                    // InternalDart.g:6935:4: ( (lv_element_1_0= ruleImportOrExportContent ) )
                    // InternalDart.g:6936:5: (lv_element_1_0= ruleImportOrExportContent )
                    {
                    // InternalDart.g:6936:5: (lv_element_1_0= ruleImportOrExportContent )
                    // InternalDart.g:6937:6: lv_element_1_0= ruleImportOrExportContent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getElementWithMetadataAccess().getElementImportOrExportContentParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_element_1_0=ruleImportOrExportContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getElementWithMetadataRule());
                      						}
                      						set(
                      							current,
                      							"element",
                      							lv_element_1_0,
                      							"it.lorenzodeluca.dart.Dart.ImportOrExportContent");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:6955:4: ( (lv_element_2_0= rulePartDirectiveContent ) )
                    {
                    // InternalDart.g:6955:4: ( (lv_element_2_0= rulePartDirectiveContent ) )
                    // InternalDart.g:6956:5: (lv_element_2_0= rulePartDirectiveContent )
                    {
                    // InternalDart.g:6956:5: (lv_element_2_0= rulePartDirectiveContent )
                    // InternalDart.g:6957:6: lv_element_2_0= rulePartDirectiveContent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getElementWithMetadataAccess().getElementPartDirectiveContentParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_element_2_0=rulePartDirectiveContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getElementWithMetadataRule());
                      						}
                      						set(
                      							current,
                      							"element",
                      							lv_element_2_0,
                      							"it.lorenzodeluca.dart.Dart.PartDirectiveContent");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDart.g:6975:4: ( (lv_member_3_0= ruleTopLevelDeclarationContent ) )
                    {
                    // InternalDart.g:6975:4: ( (lv_member_3_0= ruleTopLevelDeclarationContent ) )
                    // InternalDart.g:6976:5: (lv_member_3_0= ruleTopLevelDeclarationContent )
                    {
                    // InternalDart.g:6976:5: (lv_member_3_0= ruleTopLevelDeclarationContent )
                    // InternalDart.g:6977:6: lv_member_3_0= ruleTopLevelDeclarationContent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getElementWithMetadataAccess().getMemberTopLevelDeclarationContentParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_member_3_0=ruleTopLevelDeclarationContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getElementWithMetadataRule());
                      						}
                      						set(
                      							current,
                      							"member",
                      							lv_member_3_0,
                      							"it.lorenzodeluca.dart.Dart.TopLevelDeclarationContent");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 152, ruleElementWithMetadata_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleElementWithMetadata"


    // $ANTLR start "entryRuleImportOrExportContent"
    // InternalDart.g:6999:1: entryRuleImportOrExportContent returns [EObject current=null] : iv_ruleImportOrExportContent= ruleImportOrExportContent EOF ;
    public final EObject entryRuleImportOrExportContent() throws RecognitionException {
        EObject current = null;
        int entryRuleImportOrExportContent_StartIndex = input.index();
        EObject iv_ruleImportOrExportContent = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return current; }
            // InternalDart.g:6999:62: (iv_ruleImportOrExportContent= ruleImportOrExportContent EOF )
            // InternalDart.g:7000:2: iv_ruleImportOrExportContent= ruleImportOrExportContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportOrExportContentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportOrExportContent=ruleImportOrExportContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportOrExportContent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 153, entryRuleImportOrExportContent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleImportOrExportContent"


    // $ANTLR start "ruleImportOrExportContent"
    // InternalDart.g:7006:1: ruleImportOrExportContent returns [EObject current=null] : ( ( ( (lv_isImport_0_0= 'import' ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )? ( (lv_combinators_5_0= ruleCombinator ) )* otherlv_6= ';' ) | ( ( (lv_isExport_7_0= 'export' ) ) ( (lv_exportURI_8_0= RULE_STRING ) ) ( (lv_combinators_9_0= ruleCombinator ) )* otherlv_10= ';' ) ) ;
    public final EObject ruleImportOrExportContent() throws RecognitionException {
        EObject current = null;
        int ruleImportOrExportContent_StartIndex = input.index();
        Token lv_isImport_0_0=null;
        Token lv_importURI_1_0=null;
        Token lv_isDeferred_2_0=null;
        Token otherlv_3=null;
        Token lv_prefix_4_0=null;
        Token otherlv_6=null;
        Token lv_isExport_7_0=null;
        Token lv_exportURI_8_0=null;
        Token otherlv_10=null;
        EObject lv_combinators_5_0 = null;

        EObject lv_combinators_9_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return current; }
            // InternalDart.g:7012:2: ( ( ( ( (lv_isImport_0_0= 'import' ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )? ( (lv_combinators_5_0= ruleCombinator ) )* otherlv_6= ';' ) | ( ( (lv_isExport_7_0= 'export' ) ) ( (lv_exportURI_8_0= RULE_STRING ) ) ( (lv_combinators_9_0= ruleCombinator ) )* otherlv_10= ';' ) ) )
            // InternalDart.g:7013:2: ( ( ( (lv_isImport_0_0= 'import' ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )? ( (lv_combinators_5_0= ruleCombinator ) )* otherlv_6= ';' ) | ( ( (lv_isExport_7_0= 'export' ) ) ( (lv_exportURI_8_0= RULE_STRING ) ) ( (lv_combinators_9_0= ruleCombinator ) )* otherlv_10= ';' ) )
            {
            // InternalDart.g:7013:2: ( ( ( (lv_isImport_0_0= 'import' ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )? ( (lv_combinators_5_0= ruleCombinator ) )* otherlv_6= ';' ) | ( ( (lv_isExport_7_0= 'export' ) ) ( (lv_exportURI_8_0= RULE_STRING ) ) ( (lv_combinators_9_0= ruleCombinator ) )* otherlv_10= ';' ) )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==113) ) {
                alt142=1;
            }
            else if ( (LA142_0==115) ) {
                alt142=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // InternalDart.g:7014:3: ( ( (lv_isImport_0_0= 'import' ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )? ( (lv_combinators_5_0= ruleCombinator ) )* otherlv_6= ';' )
                    {
                    // InternalDart.g:7014:3: ( ( (lv_isImport_0_0= 'import' ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )? ( (lv_combinators_5_0= ruleCombinator ) )* otherlv_6= ';' )
                    // InternalDart.g:7015:4: ( (lv_isImport_0_0= 'import' ) ) ( (lv_importURI_1_0= RULE_STRING ) ) ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )? ( (lv_combinators_5_0= ruleCombinator ) )* otherlv_6= ';'
                    {
                    // InternalDart.g:7015:4: ( (lv_isImport_0_0= 'import' ) )
                    // InternalDart.g:7016:5: (lv_isImport_0_0= 'import' )
                    {
                    // InternalDart.g:7016:5: (lv_isImport_0_0= 'import' )
                    // InternalDart.g:7017:6: lv_isImport_0_0= 'import'
                    {
                    lv_isImport_0_0=(Token)match(input,113,FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isImport_0_0, grammarAccess.getImportOrExportContentAccess().getIsImportImportKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportOrExportContentRule());
                      						}
                      						setWithLastConsumed(current, "isImport", lv_isImport_0_0 != null, "import");
                      					
                    }

                    }


                    }

                    // InternalDart.g:7029:4: ( (lv_importURI_1_0= RULE_STRING ) )
                    // InternalDart.g:7030:5: (lv_importURI_1_0= RULE_STRING )
                    {
                    // InternalDart.g:7030:5: (lv_importURI_1_0= RULE_STRING )
                    // InternalDart.g:7031:6: lv_importURI_1_0= RULE_STRING
                    {
                    lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_96); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_importURI_1_0, grammarAccess.getImportOrExportContentAccess().getImportURISTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportOrExportContentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"importURI",
                      							lv_importURI_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    // InternalDart.g:7047:4: ( ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) ) )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==85||LA139_0==114) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalDart.g:7048:5: ( (lv_isDeferred_2_0= 'deferred' ) )? otherlv_3= 'as' ( (lv_prefix_4_0= RULE_ID ) )
                            {
                            // InternalDart.g:7048:5: ( (lv_isDeferred_2_0= 'deferred' ) )?
                            int alt138=2;
                            int LA138_0 = input.LA(1);

                            if ( (LA138_0==114) ) {
                                alt138=1;
                            }
                            switch (alt138) {
                                case 1 :
                                    // InternalDart.g:7049:6: (lv_isDeferred_2_0= 'deferred' )
                                    {
                                    // InternalDart.g:7049:6: (lv_isDeferred_2_0= 'deferred' )
                                    // InternalDart.g:7050:7: lv_isDeferred_2_0= 'deferred'
                                    {
                                    lv_isDeferred_2_0=(Token)match(input,114,FOLLOW_97); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_isDeferred_2_0, grammarAccess.getImportOrExportContentAccess().getIsDeferredDeferredKeyword_0_2_0_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getImportOrExportContentRule());
                                      							}
                                      							setWithLastConsumed(current, "isDeferred", lv_isDeferred_2_0 != null, "deferred");
                                      						
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_3=(Token)match(input,85,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getImportOrExportContentAccess().getAsKeyword_0_2_1());
                              				
                            }
                            // InternalDart.g:7066:5: ( (lv_prefix_4_0= RULE_ID ) )
                            // InternalDart.g:7067:6: (lv_prefix_4_0= RULE_ID )
                            {
                            // InternalDart.g:7067:6: (lv_prefix_4_0= RULE_ID )
                            // InternalDart.g:7068:7: lv_prefix_4_0= RULE_ID
                            {
                            lv_prefix_4_0=(Token)match(input,RULE_ID,FOLLOW_98); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prefix_4_0, grammarAccess.getImportOrExportContentAccess().getPrefixIDTerminalRuleCall_0_2_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getImportOrExportContentRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"prefix",
                              								lv_prefix_4_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalDart.g:7085:4: ( (lv_combinators_5_0= ruleCombinator ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( ((LA140_0>=116 && LA140_0<=117)) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalDart.g:7086:5: (lv_combinators_5_0= ruleCombinator )
                    	    {
                    	    // InternalDart.g:7086:5: (lv_combinators_5_0= ruleCombinator )
                    	    // InternalDart.g:7087:6: lv_combinators_5_0= ruleCombinator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImportOrExportContentAccess().getCombinatorsCombinatorParserRuleCall_0_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_98);
                    	    lv_combinators_5_0=ruleCombinator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getImportOrExportContentRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"combinators",
                    	      							lv_combinators_5_0,
                    	      							"it.lorenzodeluca.dart.Dart.Combinator");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getImportOrExportContentAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:7110:3: ( ( (lv_isExport_7_0= 'export' ) ) ( (lv_exportURI_8_0= RULE_STRING ) ) ( (lv_combinators_9_0= ruleCombinator ) )* otherlv_10= ';' )
                    {
                    // InternalDart.g:7110:3: ( ( (lv_isExport_7_0= 'export' ) ) ( (lv_exportURI_8_0= RULE_STRING ) ) ( (lv_combinators_9_0= ruleCombinator ) )* otherlv_10= ';' )
                    // InternalDart.g:7111:4: ( (lv_isExport_7_0= 'export' ) ) ( (lv_exportURI_8_0= RULE_STRING ) ) ( (lv_combinators_9_0= ruleCombinator ) )* otherlv_10= ';'
                    {
                    // InternalDart.g:7111:4: ( (lv_isExport_7_0= 'export' ) )
                    // InternalDart.g:7112:5: (lv_isExport_7_0= 'export' )
                    {
                    // InternalDart.g:7112:5: (lv_isExport_7_0= 'export' )
                    // InternalDart.g:7113:6: lv_isExport_7_0= 'export'
                    {
                    lv_isExport_7_0=(Token)match(input,115,FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isExport_7_0, grammarAccess.getImportOrExportContentAccess().getIsExportExportKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportOrExportContentRule());
                      						}
                      						setWithLastConsumed(current, "isExport", lv_isExport_7_0 != null, "export");
                      					
                    }

                    }


                    }

                    // InternalDart.g:7125:4: ( (lv_exportURI_8_0= RULE_STRING ) )
                    // InternalDart.g:7126:5: (lv_exportURI_8_0= RULE_STRING )
                    {
                    // InternalDart.g:7126:5: (lv_exportURI_8_0= RULE_STRING )
                    // InternalDart.g:7127:6: lv_exportURI_8_0= RULE_STRING
                    {
                    lv_exportURI_8_0=(Token)match(input,RULE_STRING,FOLLOW_98); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exportURI_8_0, grammarAccess.getImportOrExportContentAccess().getExportURISTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportOrExportContentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exportURI",
                      							lv_exportURI_8_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    // InternalDart.g:7143:4: ( (lv_combinators_9_0= ruleCombinator ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( ((LA141_0>=116 && LA141_0<=117)) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalDart.g:7144:5: (lv_combinators_9_0= ruleCombinator )
                    	    {
                    	    // InternalDart.g:7144:5: (lv_combinators_9_0= ruleCombinator )
                    	    // InternalDart.g:7145:6: lv_combinators_9_0= ruleCombinator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImportOrExportContentAccess().getCombinatorsCombinatorParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_98);
                    	    lv_combinators_9_0=ruleCombinator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getImportOrExportContentRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"combinators",
                    	      							lv_combinators_9_0,
                    	      							"it.lorenzodeluca.dart.Dart.Combinator");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getImportOrExportContentAccess().getSemicolonKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 154, ruleImportOrExportContent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleImportOrExportContent"


    // $ANTLR start "entryRuleCombinator"
    // InternalDart.g:7171:1: entryRuleCombinator returns [EObject current=null] : iv_ruleCombinator= ruleCombinator EOF ;
    public final EObject entryRuleCombinator() throws RecognitionException {
        EObject current = null;
        int entryRuleCombinator_StartIndex = input.index();
        EObject iv_ruleCombinator = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return current; }
            // InternalDart.g:7171:51: (iv_ruleCombinator= ruleCombinator EOF )
            // InternalDart.g:7172:2: iv_ruleCombinator= ruleCombinator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCombinator=ruleCombinator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCombinator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 155, entryRuleCombinator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleCombinator"


    // $ANTLR start "ruleCombinator"
    // InternalDart.g:7178:1: ruleCombinator returns [EObject current=null] : ( (otherlv_0= 'show' | otherlv_1= 'hide' ) ( (lv_identifiers_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifiers_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleCombinator() throws RecognitionException {
        EObject current = null;
        int ruleCombinator_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_identifiers_2_0=null;
        Token otherlv_3=null;
        Token lv_identifiers_4_0=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return current; }
            // InternalDart.g:7184:2: ( ( (otherlv_0= 'show' | otherlv_1= 'hide' ) ( (lv_identifiers_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifiers_4_0= RULE_ID ) ) )* ) )
            // InternalDart.g:7185:2: ( (otherlv_0= 'show' | otherlv_1= 'hide' ) ( (lv_identifiers_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifiers_4_0= RULE_ID ) ) )* )
            {
            // InternalDart.g:7185:2: ( (otherlv_0= 'show' | otherlv_1= 'hide' ) ( (lv_identifiers_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifiers_4_0= RULE_ID ) ) )* )
            // InternalDart.g:7186:3: (otherlv_0= 'show' | otherlv_1= 'hide' ) ( (lv_identifiers_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_identifiers_4_0= RULE_ID ) ) )*
            {
            // InternalDart.g:7186:3: (otherlv_0= 'show' | otherlv_1= 'hide' )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==116) ) {
                alt143=1;
            }
            else if ( (LA143_0==117) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalDart.g:7187:4: otherlv_0= 'show'
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCombinatorAccess().getShowKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:7192:4: otherlv_1= 'hide'
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCombinatorAccess().getHideKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDart.g:7197:3: ( (lv_identifiers_2_0= RULE_ID ) )
            // InternalDart.g:7198:4: (lv_identifiers_2_0= RULE_ID )
            {
            // InternalDart.g:7198:4: (lv_identifiers_2_0= RULE_ID )
            // InternalDart.g:7199:5: lv_identifiers_2_0= RULE_ID
            {
            lv_identifiers_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_identifiers_2_0, grammarAccess.getCombinatorAccess().getIdentifiersIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCombinatorRule());
              					}
              					addWithLastConsumed(
              						current,
              						"identifiers",
              						lv_identifiers_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:7215:3: (otherlv_3= ',' ( (lv_identifiers_4_0= RULE_ID ) ) )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==16) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalDart.g:7216:4: otherlv_3= ',' ( (lv_identifiers_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getCombinatorAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalDart.g:7220:4: ( (lv_identifiers_4_0= RULE_ID ) )
            	    // InternalDart.g:7221:5: (lv_identifiers_4_0= RULE_ID )
            	    {
            	    // InternalDart.g:7221:5: (lv_identifiers_4_0= RULE_ID )
            	    // InternalDart.g:7222:6: lv_identifiers_4_0= RULE_ID
            	    {
            	    lv_identifiers_4_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_identifiers_4_0, grammarAccess.getCombinatorAccess().getIdentifiersIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getCombinatorRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"identifiers",
            	      							lv_identifiers_4_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 156, ruleCombinator_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleCombinator"


    // $ANTLR start "entryRulePartDirectiveContent"
    // InternalDart.g:7243:1: entryRulePartDirectiveContent returns [EObject current=null] : iv_rulePartDirectiveContent= rulePartDirectiveContent EOF ;
    public final EObject entryRulePartDirectiveContent() throws RecognitionException {
        EObject current = null;
        int entryRulePartDirectiveContent_StartIndex = input.index();
        EObject iv_rulePartDirectiveContent = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return current; }
            // InternalDart.g:7243:61: (iv_rulePartDirectiveContent= rulePartDirectiveContent EOF )
            // InternalDart.g:7244:2: iv_rulePartDirectiveContent= rulePartDirectiveContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartDirectiveContentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartDirectiveContent=rulePartDirectiveContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartDirectiveContent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 157, entryRulePartDirectiveContent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePartDirectiveContent"


    // $ANTLR start "rulePartDirectiveContent"
    // InternalDart.g:7250:1: rulePartDirectiveContent returns [EObject current=null] : (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject rulePartDirectiveContent() throws RecognitionException {
        EObject current = null;
        int rulePartDirectiveContent_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_partURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 158) ) { return current; }
            // InternalDart.g:7256:2: ( (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalDart.g:7257:2: (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalDart.g:7257:2: (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalDart.g:7258:3: otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,118,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartDirectiveContentAccess().getPartKeyword_0());
              		
            }
            // InternalDart.g:7262:3: ( (lv_partURI_1_0= RULE_STRING ) )
            // InternalDart.g:7263:4: (lv_partURI_1_0= RULE_STRING )
            {
            // InternalDart.g:7263:4: (lv_partURI_1_0= RULE_STRING )
            // InternalDart.g:7264:5: lv_partURI_1_0= RULE_STRING
            {
            lv_partURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_partURI_1_0, grammarAccess.getPartDirectiveContentAccess().getPartURISTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPartDirectiveContentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"partURI",
              						lv_partURI_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPartDirectiveContentAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 158, rulePartDirectiveContent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePartDirectiveContent"


    // $ANTLR start "entryRulePartDeclaration"
    // InternalDart.g:7288:1: entryRulePartDeclaration returns [EObject current=null] : iv_rulePartDeclaration= rulePartDeclaration EOF ;
    public final EObject entryRulePartDeclaration() throws RecognitionException {
        EObject current = null;
        int entryRulePartDeclaration_StartIndex = input.index();
        EObject iv_rulePartDeclaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 159) ) { return current; }
            // InternalDart.g:7288:56: (iv_rulePartDeclaration= rulePartDeclaration EOF )
            // InternalDart.g:7289:2: iv_rulePartDeclaration= rulePartDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartDeclaration=rulePartDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 159, entryRulePartDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePartDeclaration"


    // $ANTLR start "rulePartDeclaration"
    // InternalDart.g:7295:1: rulePartDeclaration returns [EObject current=null] : ( ( (lv_partHeader_0_0= rulePartHeader ) ) ( (lv_declarations_1_0= ruleAnnotatedTopLevel ) )* ) ;
    public final EObject rulePartDeclaration() throws RecognitionException {
        EObject current = null;
        int rulePartDeclaration_StartIndex = input.index();
        EObject lv_partHeader_0_0 = null;

        EObject lv_declarations_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 160) ) { return current; }
            // InternalDart.g:7301:2: ( ( ( (lv_partHeader_0_0= rulePartHeader ) ) ( (lv_declarations_1_0= ruleAnnotatedTopLevel ) )* ) )
            // InternalDart.g:7302:2: ( ( (lv_partHeader_0_0= rulePartHeader ) ) ( (lv_declarations_1_0= ruleAnnotatedTopLevel ) )* )
            {
            // InternalDart.g:7302:2: ( ( (lv_partHeader_0_0= rulePartHeader ) ) ( (lv_declarations_1_0= ruleAnnotatedTopLevel ) )* )
            // InternalDart.g:7303:3: ( (lv_partHeader_0_0= rulePartHeader ) ) ( (lv_declarations_1_0= ruleAnnotatedTopLevel ) )*
            {
            // InternalDart.g:7303:3: ( (lv_partHeader_0_0= rulePartHeader ) )
            // InternalDart.g:7304:4: (lv_partHeader_0_0= rulePartHeader )
            {
            // InternalDart.g:7304:4: (lv_partHeader_0_0= rulePartHeader )
            // InternalDart.g:7305:5: lv_partHeader_0_0= rulePartHeader
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPartDeclarationAccess().getPartHeaderPartHeaderParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_93);
            lv_partHeader_0_0=rulePartHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPartDeclarationRule());
              					}
              					set(
              						current,
              						"partHeader",
              						lv_partHeader_0_0,
              						"it.lorenzodeluca.dart.Dart.PartHeader");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:7322:3: ( (lv_declarations_1_0= ruleAnnotatedTopLevel ) )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==RULE_ID||(LA145_0>=12 && LA145_0<=15)||LA145_0==18||(LA145_0>=33 && LA145_0<=34)||LA145_0==61||(LA145_0>=63 && LA145_0<=65)||(LA145_0>=121 && LA145_0<=124)) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // InternalDart.g:7323:4: (lv_declarations_1_0= ruleAnnotatedTopLevel )
            	    {
            	    // InternalDart.g:7323:4: (lv_declarations_1_0= ruleAnnotatedTopLevel )
            	    // InternalDart.g:7324:5: lv_declarations_1_0= ruleAnnotatedTopLevel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPartDeclarationAccess().getDeclarationsAnnotatedTopLevelParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_93);
            	    lv_declarations_1_0=ruleAnnotatedTopLevel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPartDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"declarations",
            	      						lv_declarations_1_0,
            	      						"it.lorenzodeluca.dart.Dart.AnnotatedTopLevel");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop145;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 160, rulePartDeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePartDeclaration"


    // $ANTLR start "entryRuleAnnotatedTopLevel"
    // InternalDart.g:7345:1: entryRuleAnnotatedTopLevel returns [EObject current=null] : iv_ruleAnnotatedTopLevel= ruleAnnotatedTopLevel EOF ;
    public final EObject entryRuleAnnotatedTopLevel() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotatedTopLevel_StartIndex = input.index();
        EObject iv_ruleAnnotatedTopLevel = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 161) ) { return current; }
            // InternalDart.g:7345:58: (iv_ruleAnnotatedTopLevel= ruleAnnotatedTopLevel EOF )
            // InternalDart.g:7346:2: iv_ruleAnnotatedTopLevel= ruleAnnotatedTopLevel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedTopLevelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotatedTopLevel=ruleAnnotatedTopLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedTopLevel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 161, entryRuleAnnotatedTopLevel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedTopLevel"


    // $ANTLR start "ruleAnnotatedTopLevel"
    // InternalDart.g:7352:1: ruleAnnotatedTopLevel returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_member_1_0= ruleTopLevelDeclarationContent ) ) ) ;
    public final EObject ruleAnnotatedTopLevel() throws RecognitionException {
        EObject current = null;
        int ruleAnnotatedTopLevel_StartIndex = input.index();
        EObject lv_metadata_0_0 = null;

        EObject lv_member_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 162) ) { return current; }
            // InternalDart.g:7358:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_member_1_0= ruleTopLevelDeclarationContent ) ) ) )
            // InternalDart.g:7359:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_member_1_0= ruleTopLevelDeclarationContent ) ) )
            {
            // InternalDart.g:7359:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_member_1_0= ruleTopLevelDeclarationContent ) ) )
            // InternalDart.g:7360:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_member_1_0= ruleTopLevelDeclarationContent ) )
            {
            // InternalDart.g:7360:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==65) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // InternalDart.g:7361:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:7361:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:7362:5: lv_metadata_0_0= ruleMetadata
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAnnotatedTopLevelAccess().getMetadataMetadataParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_94);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAnnotatedTopLevelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"metadata",
            	      						lv_metadata_0_0,
            	      						"it.lorenzodeluca.dart.Dart.Metadata");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);

            // InternalDart.g:7379:3: ( (lv_member_1_0= ruleTopLevelDeclarationContent ) )
            // InternalDart.g:7380:4: (lv_member_1_0= ruleTopLevelDeclarationContent )
            {
            // InternalDart.g:7380:4: (lv_member_1_0= ruleTopLevelDeclarationContent )
            // InternalDart.g:7381:5: lv_member_1_0= ruleTopLevelDeclarationContent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnnotatedTopLevelAccess().getMemberTopLevelDeclarationContentParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_member_1_0=ruleTopLevelDeclarationContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnnotatedTopLevelRule());
              					}
              					set(
              						current,
              						"member",
              						lv_member_1_0,
              						"it.lorenzodeluca.dart.Dart.TopLevelDeclarationContent");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 162, ruleAnnotatedTopLevel_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatedTopLevel"


    // $ANTLR start "entryRuleScriptTag"
    // InternalDart.g:7402:1: entryRuleScriptTag returns [EObject current=null] : iv_ruleScriptTag= ruleScriptTag EOF ;
    public final EObject entryRuleScriptTag() throws RecognitionException {
        EObject current = null;
        int entryRuleScriptTag_StartIndex = input.index();
        EObject iv_ruleScriptTag = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 163) ) { return current; }
            // InternalDart.g:7402:50: (iv_ruleScriptTag= ruleScriptTag EOF )
            // InternalDart.g:7403:2: iv_ruleScriptTag= ruleScriptTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScriptTag=ruleScriptTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScriptTag; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 163, entryRuleScriptTag_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleScriptTag"


    // $ANTLR start "ruleScriptTag"
    // InternalDart.g:7409:1: ruleScriptTag returns [EObject current=null] : ( (lv_content_0_0= RULE_SCRIPT_TAG ) ) ;
    public final EObject ruleScriptTag() throws RecognitionException {
        EObject current = null;
        int ruleScriptTag_StartIndex = input.index();
        Token lv_content_0_0=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 164) ) { return current; }
            // InternalDart.g:7415:2: ( ( (lv_content_0_0= RULE_SCRIPT_TAG ) ) )
            // InternalDart.g:7416:2: ( (lv_content_0_0= RULE_SCRIPT_TAG ) )
            {
            // InternalDart.g:7416:2: ( (lv_content_0_0= RULE_SCRIPT_TAG ) )
            // InternalDart.g:7417:3: (lv_content_0_0= RULE_SCRIPT_TAG )
            {
            // InternalDart.g:7417:3: (lv_content_0_0= RULE_SCRIPT_TAG )
            // InternalDart.g:7418:4: lv_content_0_0= RULE_SCRIPT_TAG
            {
            lv_content_0_0=(Token)match(input,RULE_SCRIPT_TAG,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_content_0_0, grammarAccess.getScriptTagAccess().getContentSCRIPT_TAGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getScriptTagRule());
              				}
              				setWithLastConsumed(
              					current,
              					"content",
              					lv_content_0_0,
              					"it.lorenzodeluca.dart.Dart.SCRIPT_TAG");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 164, ruleScriptTag_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleScriptTag"


    // $ANTLR start "entryRuleLibraryName"
    // InternalDart.g:7437:1: entryRuleLibraryName returns [EObject current=null] : iv_ruleLibraryName= ruleLibraryName EOF ;
    public final EObject entryRuleLibraryName() throws RecognitionException {
        EObject current = null;
        int entryRuleLibraryName_StartIndex = input.index();
        EObject iv_ruleLibraryName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 165) ) { return current; }
            // InternalDart.g:7437:52: (iv_ruleLibraryName= ruleLibraryName EOF )
            // InternalDart.g:7438:2: iv_ruleLibraryName= ruleLibraryName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLibraryNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLibraryName=ruleLibraryName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLibraryName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 165, entryRuleLibraryName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLibraryName"


    // $ANTLR start "ruleLibraryName"
    // InternalDart.g:7444:1: ruleLibraryName returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject ruleLibraryName() throws RecognitionException {
        EObject current = null;
        int ruleLibraryName_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 166) ) { return current; }
            // InternalDart.g:7450:2: ( (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // InternalDart.g:7451:2: (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // InternalDart.g:7451:2: (otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // InternalDart.g:7452:3: otherlv_0= 'library' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLibraryNameAccess().getLibraryKeyword_0());
              		
            }
            // InternalDart.g:7456:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDart.g:7457:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDart.g:7457:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDart.g:7458:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLibraryNameAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLibraryNameRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"it.lorenzodeluca.dart.Dart.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLibraryNameAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 166, ruleLibraryName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLibraryName"


    // $ANTLR start "entryRulePartHeader"
    // InternalDart.g:7483:1: entryRulePartHeader returns [EObject current=null] : iv_rulePartHeader= rulePartHeader EOF ;
    public final EObject entryRulePartHeader() throws RecognitionException {
        EObject current = null;
        int entryRulePartHeader_StartIndex = input.index();
        EObject iv_rulePartHeader = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 167) ) { return current; }
            // InternalDart.g:7483:51: (iv_rulePartHeader= rulePartHeader EOF )
            // InternalDart.g:7484:2: iv_rulePartHeader= rulePartHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartHeader=rulePartHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 167, entryRulePartHeader_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePartHeader"


    // $ANTLR start "rulePartHeader"
    // InternalDart.g:7490:1: rulePartHeader returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'of' ( ( (lv_name_2_0= ruleQualifiedName ) ) | ( (lv_uri_3_0= RULE_STRING ) ) ) otherlv_4= ';' ) ;
    public final EObject rulePartHeader() throws RecognitionException {
        EObject current = null;
        int rulePartHeader_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_uri_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 168) ) { return current; }
            // InternalDart.g:7496:2: ( (otherlv_0= 'part' otherlv_1= 'of' ( ( (lv_name_2_0= ruleQualifiedName ) ) | ( (lv_uri_3_0= RULE_STRING ) ) ) otherlv_4= ';' ) )
            // InternalDart.g:7497:2: (otherlv_0= 'part' otherlv_1= 'of' ( ( (lv_name_2_0= ruleQualifiedName ) ) | ( (lv_uri_3_0= RULE_STRING ) ) ) otherlv_4= ';' )
            {
            // InternalDart.g:7497:2: (otherlv_0= 'part' otherlv_1= 'of' ( ( (lv_name_2_0= ruleQualifiedName ) ) | ( (lv_uri_3_0= RULE_STRING ) ) ) otherlv_4= ';' )
            // InternalDart.g:7498:3: otherlv_0= 'part' otherlv_1= 'of' ( ( (lv_name_2_0= ruleQualifiedName ) ) | ( (lv_uri_3_0= RULE_STRING ) ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,118,FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartHeaderAccess().getPartKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,120,FOLLOW_100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartHeaderAccess().getOfKeyword_1());
              		
            }
            // InternalDart.g:7506:3: ( ( (lv_name_2_0= ruleQualifiedName ) ) | ( (lv_uri_3_0= RULE_STRING ) ) )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==RULE_ID) ) {
                alt147=1;
            }
            else if ( (LA147_0==RULE_STRING) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalDart.g:7507:4: ( (lv_name_2_0= ruleQualifiedName ) )
                    {
                    // InternalDart.g:7507:4: ( (lv_name_2_0= ruleQualifiedName ) )
                    // InternalDart.g:7508:5: (lv_name_2_0= ruleQualifiedName )
                    {
                    // InternalDart.g:7508:5: (lv_name_2_0= ruleQualifiedName )
                    // InternalDart.g:7509:6: lv_name_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPartHeaderAccess().getNameQualifiedNameParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_name_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPartHeaderRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"it.lorenzodeluca.dart.Dart.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:7527:4: ( (lv_uri_3_0= RULE_STRING ) )
                    {
                    // InternalDart.g:7527:4: ( (lv_uri_3_0= RULE_STRING ) )
                    // InternalDart.g:7528:5: (lv_uri_3_0= RULE_STRING )
                    {
                    // InternalDart.g:7528:5: (lv_uri_3_0= RULE_STRING )
                    // InternalDart.g:7529:6: lv_uri_3_0= RULE_STRING
                    {
                    lv_uri_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_uri_3_0, grammarAccess.getPartHeaderAccess().getUriSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPartHeaderRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"uri",
                      							lv_uri_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPartHeaderAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 168, rulePartHeader_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePartHeader"


    // $ANTLR start "entryRuleTopLevelDeclarationContent"
    // InternalDart.g:7554:1: entryRuleTopLevelDeclarationContent returns [EObject current=null] : iv_ruleTopLevelDeclarationContent= ruleTopLevelDeclarationContent EOF ;
    public final EObject entryRuleTopLevelDeclarationContent() throws RecognitionException {
        EObject current = null;
        int entryRuleTopLevelDeclarationContent_StartIndex = input.index();
        EObject iv_ruleTopLevelDeclarationContent = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 169) ) { return current; }
            // InternalDart.g:7554:67: (iv_ruleTopLevelDeclarationContent= ruleTopLevelDeclarationContent EOF )
            // InternalDart.g:7555:2: iv_ruleTopLevelDeclarationContent= ruleTopLevelDeclarationContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelDeclarationContentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelDeclarationContent=ruleTopLevelDeclarationContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelDeclarationContent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 169, entryRuleTopLevelDeclarationContent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelDeclarationContent"


    // $ANTLR start "ruleTopLevelDeclarationContent"
    // InternalDart.g:7561:1: ruleTopLevelDeclarationContent returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_MixinApplicationClass_7= ruleMixinApplicationClass ) ;
    public final EObject ruleTopLevelDeclarationContent() throws RecognitionException {
        EObject current = null;
        int ruleTopLevelDeclarationContent_StartIndex = input.index();
        EObject this_ClassDeclaration_0 = null;

        EObject this_MixinDeclaration_1 = null;

        EObject this_ExtensionDeclaration_2 = null;

        EObject this_EnumDeclaration_3 = null;

        EObject this_TypeAlias_4 = null;

        EObject this_FunctionDeclaration_5 = null;

        EObject this_VariableDeclaration_6 = null;

        EObject this_MixinApplicationClass_7 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 170) ) { return current; }
            // InternalDart.g:7567:2: ( (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_MixinApplicationClass_7= ruleMixinApplicationClass ) )
            // InternalDart.g:7568:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_MixinApplicationClass_7= ruleMixinApplicationClass )
            {
            // InternalDart.g:7568:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_MixinApplicationClass_7= ruleMixinApplicationClass )
            int alt148=8;
            alt148 = dfa148.predict(input);
            switch (alt148) {
                case 1 :
                    // InternalDart.g:7569:3: this_ClassDeclaration_0= ruleClassDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getClassDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassDeclaration_0=ruleClassDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDart.g:7581:3: this_MixinDeclaration_1= ruleMixinDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getMixinDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MixinDeclaration_1=ruleMixinDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MixinDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDart.g:7593:3: this_ExtensionDeclaration_2= ruleExtensionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getExtensionDeclarationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExtensionDeclaration_2=ruleExtensionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExtensionDeclaration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDart.g:7605:3: this_EnumDeclaration_3= ruleEnumDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getEnumDeclarationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumDeclaration_3=ruleEnumDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumDeclaration_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDart.g:7617:3: this_TypeAlias_4= ruleTypeAlias
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getTypeAliasParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeAlias_4=ruleTypeAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeAlias_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDart.g:7629:3: ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration )
                    {
                    // InternalDart.g:7629:3: ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration )
                    // InternalDart.g:7630:4: ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getFunctionDeclarationParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionDeclaration_5=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FunctionDeclaration_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDart.g:7644:3: this_VariableDeclaration_6= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getVariableDeclarationParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_6=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalDart.g:7656:3: this_MixinApplicationClass_7= ruleMixinApplicationClass
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclarationContentAccess().getMixinApplicationClassParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MixinApplicationClass_7=ruleMixinApplicationClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MixinApplicationClass_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 170, ruleTopLevelDeclarationContent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelDeclarationContent"


    // $ANTLR start "entryRuleTypeAlias"
    // InternalDart.g:7671:1: entryRuleTypeAlias returns [EObject current=null] : iv_ruleTypeAlias= ruleTypeAlias EOF ;
    public final EObject entryRuleTypeAlias() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeAlias_StartIndex = input.index();
        EObject iv_ruleTypeAlias = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 171) ) { return current; }
            // InternalDart.g:7671:50: (iv_ruleTypeAlias= ruleTypeAlias EOF )
            // InternalDart.g:7672:2: iv_ruleTypeAlias= ruleTypeAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeAlias=ruleTypeAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 171, entryRuleTypeAlias_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAlias"


    // $ANTLR start "ruleTypeAlias"
    // InternalDart.g:7678:1: ruleTypeAlias returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleTypeParameters ) )=> (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) ;
    public final EObject ruleTypeAlias() throws RecognitionException {
        EObject current = null;
        int ruleTypeAlias_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typeParameters_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 172) ) { return current; }
            // InternalDart.g:7684:2: ( (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleTypeParameters ) )=> (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) )
            // InternalDart.g:7685:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleTypeParameters ) )=> (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
            {
            // InternalDart.g:7685:2: (otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleTypeParameters ) )=> (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
            // InternalDart.g:7686:3: otherlv_0= 'typedef' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleTypeParameters ) )=> (lv_typeParameters_2_0= ruleTypeParameters ) )? otherlv_3= '=' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeAliasAccess().getTypedefKeyword_0());
              		
            }
            // InternalDart.g:7690:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDart.g:7691:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDart.g:7691:4: (lv_name_1_0= RULE_ID )
            // InternalDart.g:7692:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeAliasRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalDart.g:7708:3: ( ( ( ruleTypeParameters ) )=> (lv_typeParameters_2_0= ruleTypeParameters ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==60) && (synpred227_InternalDart())) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalDart.g:7709:4: ( ( ruleTypeParameters ) )=> (lv_typeParameters_2_0= ruleTypeParameters )
                    {
                    // InternalDart.g:7713:4: (lv_typeParameters_2_0= ruleTypeParameters )
                    // InternalDart.g:7714:5: lv_typeParameters_2_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAliasAccess().getTypeParametersTypeParametersParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_40);
                    lv_typeParameters_2_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeAliasRule());
                      					}
                      					set(
                      						current,
                      						"typeParameters",
                      						lv_typeParameters_2_0,
                      						"it.lorenzodeluca.dart.Dart.TypeParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTypeAliasAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalDart.g:7735:3: ( (lv_type_4_0= ruleType ) )
            // InternalDart.g:7736:4: (lv_type_4_0= ruleType )
            {
            // InternalDart.g:7736:4: (lv_type_4_0= ruleType )
            // InternalDart.g:7737:5: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeAliasAccess().getTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeAliasRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"it.lorenzodeluca.dart.Dart.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTypeAliasAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 172, ruleTypeAlias_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeAlias"


    // $ANTLR start "entryRuleType"
    // InternalDart.g:7762:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;
        int entryRuleType_StartIndex = input.index();
        EObject iv_ruleType = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 173) ) { return current; }
            // InternalDart.g:7762:45: (iv_ruleType= ruleType EOF )
            // InternalDart.g:7763:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 173, entryRuleType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDart.g:7769:1: ruleType returns [EObject current=null] : ( ( (lv_typeName_0_0= ruleTypeName ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? ( (lv_isNullable_2_0= '?' ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;
        int ruleType_StartIndex = input.index();
        Token lv_isNullable_2_0=null;
        EObject lv_typeName_0_0 = null;

        EObject lv_typeArguments_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 174) ) { return current; }
            // InternalDart.g:7775:2: ( ( ( (lv_typeName_0_0= ruleTypeName ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? ( (lv_isNullable_2_0= '?' ) )? ) )
            // InternalDart.g:7776:2: ( ( (lv_typeName_0_0= ruleTypeName ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? ( (lv_isNullable_2_0= '?' ) )? )
            {
            // InternalDart.g:7776:2: ( ( (lv_typeName_0_0= ruleTypeName ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? ( (lv_isNullable_2_0= '?' ) )? )
            // InternalDart.g:7777:3: ( (lv_typeName_0_0= ruleTypeName ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? ( (lv_isNullable_2_0= '?' ) )?
            {
            // InternalDart.g:7777:3: ( (lv_typeName_0_0= ruleTypeName ) )
            // InternalDart.g:7778:4: (lv_typeName_0_0= ruleTypeName )
            {
            // InternalDart.g:7778:4: (lv_typeName_0_0= ruleTypeName )
            // InternalDart.g:7779:5: lv_typeName_0_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeAccess().getTypeNameTypeNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_101);
            lv_typeName_0_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeRule());
              					}
              					set(
              						current,
              						"typeName",
              						lv_typeName_0_0,
              						"it.lorenzodeluca.dart.Dart.TypeName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:7796:3: ( (lv_typeArguments_1_0= ruleTypeArguments ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==60) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalDart.g:7797:4: (lv_typeArguments_1_0= ruleTypeArguments )
                    {
                    // InternalDart.g:7797:4: (lv_typeArguments_1_0= ruleTypeArguments )
                    // InternalDart.g:7798:5: lv_typeArguments_1_0= ruleTypeArguments
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getTypeArgumentsTypeArgumentsParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_55);
                    lv_typeArguments_1_0=ruleTypeArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"typeArguments",
                      						lv_typeArguments_1_0,
                      						"it.lorenzodeluca.dart.Dart.TypeArguments");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDart.g:7815:3: ( (lv_isNullable_2_0= '?' ) )?
            int alt151=2;
            alt151 = dfa151.predict(input);
            switch (alt151) {
                case 1 :
                    // InternalDart.g:7816:4: (lv_isNullable_2_0= '?' )
                    {
                    // InternalDart.g:7816:4: (lv_isNullable_2_0= '?' )
                    // InternalDart.g:7817:5: lv_isNullable_2_0= '?'
                    {
                    lv_isNullable_2_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isNullable_2_0, grammarAccess.getTypeAccess().getIsNullableQuestionMarkKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTypeRule());
                      					}
                      					setWithLastConsumed(current, "isNullable", lv_isNullable_2_0 != null, "?");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 174, ruleType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeName"
    // InternalDart.g:7833:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeName_StartIndex = input.index();
        EObject iv_ruleTypeName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 175) ) { return current; }
            // InternalDart.g:7833:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalDart.g:7834:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 175, entryRuleTypeName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalDart.g:7840:1: ruleTypeName returns [EObject current=null] : ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= 'dynamic' ) ) | ( (lv_name_2_0= 'Function' ) ) | ( (lv_name_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;
        int ruleTypeName_StartIndex = input.index();
        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 176) ) { return current; }
            // InternalDart.g:7846:2: ( ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= 'dynamic' ) ) | ( (lv_name_2_0= 'Function' ) ) | ( (lv_name_3_0= ruleQualifiedName ) ) ) )
            // InternalDart.g:7847:2: ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= 'dynamic' ) ) | ( (lv_name_2_0= 'Function' ) ) | ( (lv_name_3_0= ruleQualifiedName ) ) )
            {
            // InternalDart.g:7847:2: ( ( (lv_name_0_0= 'void' ) ) | ( (lv_name_1_0= 'dynamic' ) ) | ( (lv_name_2_0= 'Function' ) ) | ( (lv_name_3_0= ruleQualifiedName ) ) )
            int alt152=4;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt152=1;
                }
                break;
            case 123:
                {
                alt152=2;
                }
                break;
            case 124:
                {
                alt152=3;
                }
                break;
            case RULE_ID:
                {
                alt152=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalDart.g:7848:3: ( (lv_name_0_0= 'void' ) )
                    {
                    // InternalDart.g:7848:3: ( (lv_name_0_0= 'void' ) )
                    // InternalDart.g:7849:4: (lv_name_0_0= 'void' )
                    {
                    // InternalDart.g:7849:4: (lv_name_0_0= 'void' )
                    // InternalDart.g:7850:5: lv_name_0_0= 'void'
                    {
                    lv_name_0_0=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_0, grammarAccess.getTypeNameAccess().getNameVoidKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_0_0, "void");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:7863:3: ( (lv_name_1_0= 'dynamic' ) )
                    {
                    // InternalDart.g:7863:3: ( (lv_name_1_0= 'dynamic' ) )
                    // InternalDart.g:7864:4: (lv_name_1_0= 'dynamic' )
                    {
                    // InternalDart.g:7864:4: (lv_name_1_0= 'dynamic' )
                    // InternalDart.g:7865:5: lv_name_1_0= 'dynamic'
                    {
                    lv_name_1_0=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getTypeNameAccess().getNameDynamicKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_1_0, "dynamic");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDart.g:7878:3: ( (lv_name_2_0= 'Function' ) )
                    {
                    // InternalDart.g:7878:3: ( (lv_name_2_0= 'Function' ) )
                    // InternalDart.g:7879:4: (lv_name_2_0= 'Function' )
                    {
                    // InternalDart.g:7879:4: (lv_name_2_0= 'Function' )
                    // InternalDart.g:7880:5: lv_name_2_0= 'Function'
                    {
                    lv_name_2_0=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_2_0, grammarAccess.getTypeNameAccess().getNameFunctionKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "name", lv_name_2_0, "Function");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDart.g:7893:3: ( (lv_name_3_0= ruleQualifiedName ) )
                    {
                    // InternalDart.g:7893:3: ( (lv_name_3_0= ruleQualifiedName ) )
                    // InternalDart.g:7894:4: (lv_name_3_0= ruleQualifiedName )
                    {
                    // InternalDart.g:7894:4: (lv_name_3_0= ruleQualifiedName )
                    // InternalDart.g:7895:5: lv_name_3_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeNameAccess().getNameQualifiedNameParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_3_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeNameRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_3_0,
                      						"it.lorenzodeluca.dart.Dart.QualifiedName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 176, ruleTypeName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeArguments"
    // InternalDart.g:7916:1: entryRuleTypeArguments returns [EObject current=null] : iv_ruleTypeArguments= ruleTypeArguments EOF ;
    public final EObject entryRuleTypeArguments() throws RecognitionException {
        EObject current = null;
        int entryRuleTypeArguments_StartIndex = input.index();
        EObject iv_ruleTypeArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 177) ) { return current; }
            // InternalDart.g:7916:54: (iv_ruleTypeArguments= ruleTypeArguments EOF )
            // InternalDart.g:7917:2: iv_ruleTypeArguments= ruleTypeArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeArguments=ruleTypeArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeArguments; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 177, entryRuleTypeArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeArguments"


    // $ANTLR start "ruleTypeArguments"
    // InternalDart.g:7923:1: ruleTypeArguments returns [EObject current=null] : (otherlv_0= '<' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeArguments() throws RecognitionException {
        EObject current = null;
        int ruleTypeArguments_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 178) ) { return current; }
            // InternalDart.g:7929:2: ( (otherlv_0= '<' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= '>' ) )
            // InternalDart.g:7930:2: (otherlv_0= '<' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= '>' )
            {
            // InternalDart.g:7930:2: (otherlv_0= '<' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= '>' )
            // InternalDart.g:7931:3: otherlv_0= '<' ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeArgumentsAccess().getLessThanSignKeyword_0());
              		
            }
            // InternalDart.g:7935:3: ( (lv_types_1_0= ruleType ) )
            // InternalDart.g:7936:4: (lv_types_1_0= ruleType )
            {
            // InternalDart.g:7936:4: (lv_types_1_0= ruleType )
            // InternalDart.g:7937:5: lv_types_1_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeArgumentsAccess().getTypesTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_types_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeArgumentsRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"it.lorenzodeluca.dart.Dart.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDart.g:7954:3: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==16) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // InternalDart.g:7955:4: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getTypeArgumentsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalDart.g:7959:4: ( (lv_types_3_0= ruleType ) )
            	    // InternalDart.g:7960:5: (lv_types_3_0= ruleType )
            	    {
            	    // InternalDart.g:7960:5: (lv_types_3_0= ruleType )
            	    // InternalDart.g:7961:6: lv_types_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypeArgumentsAccess().getTypesTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTypeArgumentsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"it.lorenzodeluca.dart.Dart.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop153;
                }
            } while (true);

            otherlv_4=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypeArgumentsAccess().getGreaterThanSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 178, ruleTypeArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeArguments"

    // $ANTLR start synpred4_InternalDart
    public final void synpred4_InternalDart_fragment() throws RecognitionException {   
        EObject lv_type_3_0 = null;


        // InternalDart.g:174:6: ( (lv_type_3_0= ruleType ) )
        // InternalDart.g:174:6: (lv_type_3_0= ruleType )
        {
        // InternalDart.g:174:6: (lv_type_3_0= ruleType )
        // InternalDart.g:175:7: lv_type_3_0= ruleType
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_type_3_0=ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalDart

    // $ANTLR start synpred6_InternalDart
    public final void synpred6_InternalDart_fragment() throws RecognitionException {   
        EObject lv_type_5_0 = null;


        // InternalDart.g:210:6: ( (lv_type_5_0= ruleType ) )
        // InternalDart.g:210:6: (lv_type_5_0= ruleType )
        {
        // InternalDart.g:210:6: (lv_type_5_0= ruleType )
        // InternalDart.g:211:7: lv_type_5_0= ruleType
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_2_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_type_5_0=ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalDart

    // $ANTLR start synpred43_InternalDart
    public final void synpred43_InternalDart_fragment() throws RecognitionException {   
        EObject lv_method_2_0 = null;

        EObject lv_body_3_0 = null;


        // InternalDart.g:1582:4: ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) )
        // InternalDart.g:1582:4: ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) )
        {
        // InternalDart.g:1582:4: ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) )
        // InternalDart.g:1583:5: ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) )
        {
        // InternalDart.g:1583:5: ( (lv_method_2_0= ruleMethodSignature ) )
        // InternalDart.g:1584:6: (lv_method_2_0= ruleMethodSignature )
        {
        // InternalDart.g:1584:6: (lv_method_2_0= ruleMethodSignature )
        // InternalDart.g:1585:7: lv_method_2_0= ruleMethodSignature
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMemberDeclarationAccess().getMethodMethodSignatureParserRuleCall_2_0_0_0());
          						
        }
        pushFollow(FOLLOW_21);
        lv_method_2_0=ruleMethodSignature();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalDart.g:1602:5: ( (lv_body_3_0= ruleFunctionBody ) )
        // InternalDart.g:1603:6: (lv_body_3_0= ruleFunctionBody )
        {
        // InternalDart.g:1603:6: (lv_body_3_0= ruleFunctionBody )
        // InternalDart.g:1604:7: lv_body_3_0= ruleFunctionBody
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMemberDeclarationAccess().getBodyFunctionBodyParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_body_3_0=ruleFunctionBody();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred43_InternalDart

    // $ANTLR start synpred92_InternalDart
    public final void synpred92_InternalDart_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_2=null;

        // InternalDart.g:2874:4: (kw= '.' this_ID_2= RULE_ID )
        // InternalDart.g:2874:4: kw= '.' this_ID_2= RULE_ID
        {
        kw=(Token)match(input,66,FOLLOW_4); if (state.failed) return ;
        this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_InternalDart

    // $ANTLR start synpred167_InternalDart
    public final void synpred167_InternalDart_fragment() throws RecognitionException {   
        EObject this_Block_0 = null;


        // InternalDart.g:5355:3: (this_Block_0= ruleBlock )
        // InternalDart.g:5355:3: this_Block_0= ruleBlock
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Block_0=ruleBlock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_InternalDart

    // $ANTLR start synpred168_InternalDart
    public final void synpred168_InternalDart_fragment() throws RecognitionException {   
        EObject this_LocalVariableDeclaration_1 = null;


        // InternalDart.g:5367:3: (this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration )
        // InternalDart.g:5367:3: this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_LocalVariableDeclaration_1=ruleLocalVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_InternalDart

    // $ANTLR start synpred169_InternalDart
    public final void synpred169_InternalDart_fragment() throws RecognitionException {   
        EObject this_ForStatement_2 = null;


        // InternalDart.g:5379:3: (this_ForStatement_2= ruleForStatement )
        // InternalDart.g:5379:3: this_ForStatement_2= ruleForStatement
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ForStatement_2=ruleForStatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_InternalDart

    // $ANTLR start synpred181_InternalDart
    public final void synpred181_InternalDart_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseStatement_6_0 = null;


        // InternalDart.g:5690:4: (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) ) )
        // InternalDart.g:5690:4: otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleStatement ) )
        {
        otherlv_5=(Token)match(input,98,FOLLOW_77); if (state.failed) return ;
        // InternalDart.g:5694:4: ( (lv_elseStatement_6_0= ruleStatement ) )
        // InternalDart.g:5695:5: (lv_elseStatement_6_0= ruleStatement )
        {
        // InternalDart.g:5695:5: (lv_elseStatement_6_0= ruleStatement )
        // InternalDart.g:5696:6: lv_elseStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementStatementParserRuleCall_5_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_elseStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred181_InternalDart

    // $ANTLR start synpred184_InternalDart
    public final void synpred184_InternalDart_fragment() throws RecognitionException {   
        EObject lv_init_3_0 = null;


        // InternalDart.g:5756:4: ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) )
        // InternalDart.g:5756:4: ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) )
        {
        // InternalDart.g:5756:4: ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) )
        // InternalDart.g:5757:5: ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration )
        {
        // InternalDart.g:5761:5: (lv_init_3_0= ruleVariableDeclaration )
        // InternalDart.g:5762:6: lv_init_3_0= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getForStatementAccess().getInitVariableDeclarationParserRuleCall_3_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_init_3_0=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred184_InternalDart

    // $ANTLR start synpred194_InternalDart
    public final void synpred194_InternalDart_fragment() throws RecognitionException {   
        // InternalDart.g:6340:4: ( ( ruleCatchClause ) )
        // InternalDart.g:6340:5: ( ruleCatchClause )
        {
        // InternalDart.g:6340:5: ( ruleCatchClause )
        // InternalDart.g:6341:5: ruleCatchClause
        {
        pushFollow(FOLLOW_2);
        ruleCatchClause();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred194_InternalDart

    // $ANTLR start synpred225_InternalDart
    public final void synpred225_InternalDart_fragment() throws RecognitionException {   
        EObject this_FunctionDeclaration_5 = null;


        // InternalDart.g:7629:3: ( ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration ) )
        // InternalDart.g:7629:3: ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration )
        {
        // InternalDart.g:7629:3: ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration )
        // InternalDart.g:7630:4: ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration
        {
        pushFollow(FOLLOW_2);
        this_FunctionDeclaration_5=ruleFunctionDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred225_InternalDart

    // $ANTLR start synpred226_InternalDart
    public final void synpred226_InternalDart_fragment() throws RecognitionException {   
        EObject this_VariableDeclaration_6 = null;


        // InternalDart.g:7644:3: (this_VariableDeclaration_6= ruleVariableDeclaration )
        // InternalDart.g:7644:3: this_VariableDeclaration_6= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_VariableDeclaration_6=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred226_InternalDart

    // $ANTLR start synpred227_InternalDart
    public final void synpred227_InternalDart_fragment() throws RecognitionException {   
        // InternalDart.g:7709:4: ( ( ruleTypeParameters ) )
        // InternalDart.g:7709:5: ( ruleTypeParameters )
        {
        // InternalDart.g:7709:5: ( ruleTypeParameters )
        // InternalDart.g:7710:5: ruleTypeParameters
        {
        pushFollow(FOLLOW_2);
        ruleTypeParameters();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred227_InternalDart

    // $ANTLR start synpred229_InternalDart
    public final void synpred229_InternalDart_fragment() throws RecognitionException {   
        Token lv_isNullable_2_0=null;

        // InternalDart.g:7816:4: ( (lv_isNullable_2_0= '?' ) )
        // InternalDart.g:7816:4: (lv_isNullable_2_0= '?' )
        {
        // InternalDart.g:7816:4: (lv_isNullable_2_0= '?' )
        // InternalDart.g:7817:5: lv_isNullable_2_0= '?'
        {
        lv_isNullable_2_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred229_InternalDart

    // Delegated rules

    public final boolean synpred4_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred225_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred225_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred226_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred226_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred194_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred227_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred227_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred229_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred229_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred181_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred169_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred169_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred167_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred167_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred184_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred184_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalDart() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalDart_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA148 dfa148 = new DFA148(this);
    protected DFA151 dfa151 = new DFA151(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\4\1\uffff\2\4\1\uffff\1\20\2\4\1\20";
    static final String dfa_3s = "\1\174\1\uffff\1\120\1\174\1\uffff\1\120\1\174\2\120";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\2\4\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\165\uffff\3\1",
            "",
            "\1\1\17\uffff\1\4\47\uffff\1\3\5\uffff\1\1\15\uffff\1\1",
            "\1\5\74\uffff\1\4\70\uffff\3\1",
            "",
            "\1\6\22\uffff\1\4\26\uffff\1\7\1\uffff\1\1\5\uffff\1\1\15\uffff\1\1",
            "\1\10\74\uffff\1\4\70\uffff\3\1",
            "\1\1\17\uffff\1\4\73\uffff\1\1",
            "\1\6\22\uffff\1\4\26\uffff\1\7\1\uffff\1\1\5\uffff\1\1\15\uffff\1\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "389:3: ( (lv_returnType_1_0= ruleType ) )?";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\4\0\7\uffff";
    static final String dfa_9s = "\1\174\4\0\7\uffff";
    static final String dfa_10s = "\5\uffff\1\1\2\uffff\1\2\3\uffff";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\7\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\7\uffff\1\10\1\uffff\2\10\2\uffff\1\10\24\uffff\3\5\120\uffff\1\1\1\2\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1581:3: ( ( ( (lv_method_2_0= ruleMethodSignature ) ) ( (lv_body_3_0= ruleFunctionBody ) ) ) | ( ( (lv_variable_4_0= ruleDeclaration ) ) otherlv_5= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalDart()) ) {s = 5;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalDart()) ) {s = 5;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_3 = input.LA(1);

                         
                        int index40_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalDart()) ) {s = 5;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_4 = input.LA(1);

                         
                        int index40_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalDart()) ) {s = 5;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index40_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\1\4\7\uffff\1\4\4\uffff";
    static final String dfa_15s = "\1\140\7\uffff\1\174\4\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\13\1\12";
    static final String dfa_17s = "\15\uffff}>";
    static final String[] dfa_18s = {
            "\1\7\1\5\1\6\10\uffff\1\10\4\uffff\1\13\2\uffff\1\11\1\uffff\1\11\42\uffff\1\11\36\uffff\1\1\1\2\1\3\2\4\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\22\uffff\1\11\1\uffff\1\11\42\uffff\1\11\75\uffff\3\14",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "4612:2: ( ( () otherlv_1= 'this' ) | ( () otherlv_3= 'super' ) | ( () otherlv_5= 'null' ) | ( () ( ( (lv_boolValue_7_1= 'true' | lv_boolValue_7_2= 'false' ) ) ) ) | ( () ( (lv_intValue_9_0= RULE_INT ) ) ) | ( () ( (lv_stringValue_11_0= RULE_STRING ) ) ) | ( () ( (lv_name_13_0= RULE_ID ) ) ) | this_CollectionLiteral_14= ruleCollectionLiteral | ( () otherlv_16= 'new' ( (lv_type_17_0= ruleType ) ) (otherlv_18= '.' ( (lv_constructor_19_0= RULE_ID ) ) )? ( (lv_args_20_0= ruleArguments ) ) ) | ( () otherlv_22= 'const' ( (lv_type_23_0= ruleType ) ) (otherlv_24= '.' ( (lv_constructor_25_0= RULE_ID ) ) )? ( (lv_args_26_0= ruleArguments ) ) ) | ( () otherlv_28= '(' ( (lv_expression_29_0= ruleExpression ) ) otherlv_30= ')' ) )";
        }
    }
    static final String dfa_19s = "\47\uffff";
    static final String dfa_20s = "\1\4\1\0\3\uffff\1\0\3\uffff\2\0\34\uffff";
    static final String dfa_21s = "\1\174\1\0\3\uffff\1\0\3\uffff\2\0\34\uffff";
    static final String dfa_22s = "\2\uffff\1\2\10\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\17\uffff\1\1";
    static final String dfa_23s = "\1\uffff\1\0\3\uffff\1\1\3\uffff\1\2\1\3\34\uffff}>";
    static final String[] dfa_24s = {
            "\1\11\2\26\5\uffff\3\2\1\5\4\uffff\1\26\2\uffff\1\26\1\uffff\1\1\20\uffff\1\26\7\uffff\1\26\11\uffff\1\26\32\uffff\3\26\1\12\6\26\1\17\1\uffff\1\13\1\14\1\15\1\16\2\uffff\1\20\1\21\2\uffff\1\22\1\23\1\24\1\25\11\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "5354:2: (this_Block_0= ruleBlock | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration | this_ForStatement_2= ruleForStatement | this_WhileStatement_3= ruleWhileStatement | this_DoStatement_4= ruleDoStatement | this_SwitchStatement_5= ruleSwitchStatement | this_IfStatement_6= ruleIfStatement | this_RethrowStatement_7= ruleRethrowStatement | this_TryStatement_8= ruleTryStatement | this_BreakStatement_9= ruleBreakStatement | this_ContinueStatement_10= ruleContinueStatement | this_ReturnStatement_11= ruleReturnStatement | this_YieldStatement_12= ruleYieldStatement | this_ExpressionStatement_13= ruleExpressionStatement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_1 = input.LA(1);

                         
                        int index110_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred167_InternalDart()) ) {s = 38;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index110_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA110_5 = input.LA(1);

                         
                        int index110_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred168_InternalDart()) ) {s = 2;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index110_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA110_9 = input.LA(1);

                         
                        int index110_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred168_InternalDart()) ) {s = 2;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index110_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA110_10 = input.LA(1);

                         
                        int index110_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred169_InternalDart()) ) {s = 11;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index110_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\34\uffff";
    static final String dfa_26s = "\1\4\3\uffff\1\0\3\uffff\1\0\23\uffff";
    static final String dfa_27s = "\1\174\3\uffff\1\0\3\uffff\1\0\23\uffff";
    static final String dfa_28s = "\1\uffff\1\1\7\uffff\1\2\22\uffff";
    static final String dfa_29s = "\4\uffff\1\0\3\uffff\1\1\23\uffff}>";
    static final String[] dfa_30s = {
            "\1\10\2\11\5\uffff\3\1\1\4\3\uffff\2\11\2\uffff\1\11\1\uffff\1\11\20\uffff\1\11\7\uffff\1\11\11\uffff\1\11\32\uffff\12\11\31\uffff\3\1",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "5755:3: ( ( ( ( ruleVariableDeclaration ) )=> (lv_init_3_0= ruleVariableDeclaration ) ) | ( (lv_initExpr_4_0= ruleExpression ) )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_4 = input.LA(1);

                         
                        int index115_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_InternalDart()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index115_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_8 = input.LA(1);

                         
                        int index115_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_InternalDart()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index115_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 115, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\5\uffff";
    static final String dfa_32s = "\1\4\1\34\2\uffff\1\4";
    static final String dfa_33s = "\1\150\1\34\2\uffff\1\150";
    static final String dfa_34s = "\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_35s = "\5\uffff}>";
    static final String[] dfa_36s = {
            "\1\1\25\uffff\1\2\114\uffff\1\3\1\2",
            "\1\4",
            "",
            "",
            "\1\1\142\uffff\1\3\1\2"
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 6069:3: ( (lv_cases_5_0= ruleSwitchCase ) )*";
        }
    }
    static final String dfa_37s = "\1\2\4\uffff";
    static final String dfa_38s = "\2\4\2\uffff\1\4";
    static final String dfa_39s = "\1\174\1\131\2\uffff\1\174";
    static final String[] dfa_40s = {
            "\1\1\2\3\5\uffff\4\3\4\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\2\17\uffff\1\3\7\uffff\1\3\11\uffff\1\3\32\uffff\13\3\1\uffff\4\3\2\2\2\3\2\uffff\4\3\11\uffff\3\3",
            "\1\3\14\uffff\1\3\1\uffff\1\3\3\uffff\1\3\4\uffff\1\4\2\uffff\1\3\13\uffff\1\3\2\uffff\17\3\5\uffff\25\3\1\uffff\2\3",
            "",
            "",
            "\1\1\2\3\5\uffff\4\3\4\uffff\1\3\2\uffff\1\3\1\uffff\1\3\20\uffff\1\3\7\uffff\1\3\11\uffff\1\3\32\uffff\13\3\1\uffff\4\3\2\2\2\3\2\uffff\4\3\11\uffff\3\3"
    };
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = dfa_31;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 6176:3: ( (lv_statements_4_0= ruleStatement ) )*";
        }
    }
    static final String dfa_41s = "\56\uffff";
    static final String dfa_42s = "\1\1\55\uffff";
    static final String dfa_43s = "\1\4\4\uffff\1\0\50\uffff";
    static final String dfa_44s = "\1\174\4\uffff\1\0\50\uffff";
    static final String dfa_45s = "\1\uffff\1\2\52\uffff\2\1";
    static final String dfa_46s = "\1\0\4\uffff\1\1\50\uffff}>";
    static final String[] dfa_47s = {
            "\3\1\5\uffff\4\1\4\uffff\1\1\2\uffff\1\1\1\uffff\1\5\1\1\17\uffff\1\1\7\uffff\1\1\11\uffff\1\1\1\uffff\1\54\30\uffff\24\1\1\55\5\1\11\uffff\3\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = dfa_41;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "()* loopback of 6339:3: ( ( ( ruleCatchClause ) )=> (lv_catchClauses_2_0= ruleCatchClause ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_0 = input.LA(1);

                         
                        int index124_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA124_0==EOF||(LA124_0>=RULE_ID && LA124_0<=RULE_STRING)||(LA124_0>=12 && LA124_0<=15)||LA124_0==20||LA124_0==23||LA124_0==26||LA124_0==42||LA124_0==50||LA124_0==60||(LA124_0>=87 && LA124_0<=106)||(LA124_0>=108 && LA124_0<=112)||(LA124_0>=122 && LA124_0<=124)) ) {s = 1;}

                        else if ( (LA124_0==25) ) {s = 5;}

                        else if ( (LA124_0==62) && (synpred194_InternalDart())) {s = 44;}

                        else if ( (LA124_0==107) && (synpred194_InternalDart())) {s = 45;}

                         
                        input.seek(index124_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA124_5 = input.LA(1);

                         
                        int index124_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalDart()) ) {s = 45;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 124, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_48s = "\21\uffff";
    static final String dfa_49s = "\1\4\7\uffff\4\0\5\uffff";
    static final String dfa_50s = "\1\174\7\uffff\4\0\5\uffff";
    static final String dfa_51s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff\1\7\3\uffff\1\10";
    static final String dfa_52s = "\10\uffff\1\0\1\1\1\2\1\3\5\uffff}>";
    static final String[] dfa_53s = {
            "\1\13\7\uffff\4\14\2\uffff\1\7\16\uffff\2\1\32\uffff\1\3\1\uffff\1\4\1\5\70\uffff\1\6\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA148 extends DFA {

        public DFA148(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 148;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "7568:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | ( ( ruleFunctionDeclaration )=>this_FunctionDeclaration_5= ruleFunctionDeclaration ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_MixinApplicationClass_7= ruleMixinApplicationClass )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA148_8 = input.LA(1);

                         
                        int index148_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred225_InternalDart()) ) {s = 7;}

                        else if ( (synpred226_InternalDart()) ) {s = 12;}

                         
                        input.seek(index148_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA148_9 = input.LA(1);

                         
                        int index148_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred225_InternalDart()) ) {s = 7;}

                        else if ( (synpred226_InternalDart()) ) {s = 12;}

                         
                        input.seek(index148_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA148_10 = input.LA(1);

                         
                        int index148_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred225_InternalDart()) ) {s = 7;}

                        else if ( (synpred226_InternalDart()) ) {s = 12;}

                         
                        input.seek(index148_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA148_11 = input.LA(1);

                         
                        int index148_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred225_InternalDart()) ) {s = 7;}

                        else if ( (synpred226_InternalDart()) ) {s = 12;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index148_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 148, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_54s = "\72\uffff";
    static final String dfa_55s = "\1\2\71\uffff";
    static final String dfa_56s = "\1\4\1\0\70\uffff";
    static final String dfa_57s = "\1\174\1\0\70\uffff";
    static final String dfa_58s = "\2\uffff\1\2\66\uffff\1\1";
    static final String dfa_59s = "\1\uffff\1\0\70\uffff}>";
    static final String[] dfa_60s = {
            "\1\2\7\uffff\12\2\2\uffff\3\2\1\uffff\1\2\4\uffff\2\2\1\uffff\2\2\1\uffff\3\2\1\uffff\1\2\16\uffff\1\2\2\uffff\1\2\1\uffff\21\2\1\1\4\2\26\uffff\1\2\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\4\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA151 extends DFA {

        public DFA151(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 151;
            this.eot = dfa_54;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "7815:3: ( (lv_isNullable_2_0= '?' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA151_1 = input.LA(1);

                         
                        int index151_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred229_InternalDart()) ) {s = 57;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index151_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 151, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000E010L,0x1C00000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1004040002908070L,0x00000001FF800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001E2080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000061E010L,0x1C00000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000040E010L,0x1C00000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000140E010L,0x1C00000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C40E010L,0x1C00000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000840E010L,0x1C00000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010020002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001E2000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1000002802000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002802000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003C00404F010L,0x1C00000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003C00004F010L,0x1C00000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000038000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1FFFFC0080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000100002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000000F010L,0x1C00000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x5000002002000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000002002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002002010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x5000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000000010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000004L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1004040002B08070L,0x00000001FF800000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000020002L,0x000000000000FFF8L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000080000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1E00000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0001C00080000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000800002L,0x0000000003000004L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000004L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x1000000002800000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1004040003908070L,0x00000001FF800000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x1004040006908070L,0x00000001FF800000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x10040401E290F070L,0x1C01E67BFF800000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x10040401E690F070L,0x1C01E67BFF800000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x100404000298F070L,0x1C000001FF800000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x1004040002988070L,0x00000001FF800000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x10040401E690F070L,0x1C01E7FBFF800000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x10040401E290F070L,0x1C01E6FBFF800000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x10040401E290F072L,0x1C01E67BFF800000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x10040401E290F070L,0x1C01E77BFF800000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x40000001E2000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x00000001E2000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x1004040082908070L,0x00000001FF800000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0xA00000060004F012L,0x1ECA000000000003L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0xA00000060004F012L,0x1E4A000000000003L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0xA00000060004F010L,0x1E4A000000000003L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000080000L,0x0034000000200000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000080000L,0x0030000000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x000000000000E050L,0x1C00000000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x1000000000000002L,0x0000000000010000L});

}