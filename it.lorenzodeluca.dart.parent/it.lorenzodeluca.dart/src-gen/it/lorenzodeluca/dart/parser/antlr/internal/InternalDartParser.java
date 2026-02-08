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

@SuppressWarnings("all")
public class InternalDartParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SCRIPT_TAG", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'library'", "';'", "'.'", "'import'", "'as'", "'export'", "'part'", "'class'", "'{'", "'}'", "'mixin'", "'extension'", "'on'", "'enum'", "'typedef'", "'='", "'external'", "'('", "')'", "'late'", "','", "'var'", "'final'", "'const'", "'@'", "'?'", "'<'", "'>'"
    };
    public static final int RULE_SCRIPT_TAG=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDartParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDartParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDartParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDart.g"; }



     	private DartGrammarAccess grammarAccess;

        public InternalDartParser(TokenStream input, DartGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CompilationUnit";
       	}

       	@Override
       	protected DartGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompilationUnit"
    // InternalDart.g:64:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilationUnit = null;


        try {
            // InternalDart.g:64:56: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // InternalDart.g:65:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompilationUnit=ruleCompilationUnit();

            state._fsp--;

             current =iv_ruleCompilationUnit; 
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
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // InternalDart.g:71:1: ruleCompilationUnit returns [EObject current=null] : ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_directives_2_0= ruleImportOrExport ) )* ( (lv_partDirectives_3_0= rulePartDirective ) )* ( (lv_declarations_4_0= ruleTopLevelDeclaration ) )* ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_scriptTag_0_0 = null;

        EObject lv_libraryName_1_0 = null;

        EObject lv_directives_2_0 = null;

        EObject lv_partDirectives_3_0 = null;

        EObject lv_declarations_4_0 = null;



        	enterRule();

        try {
            // InternalDart.g:77:2: ( ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_directives_2_0= ruleImportOrExport ) )* ( (lv_partDirectives_3_0= rulePartDirective ) )* ( (lv_declarations_4_0= ruleTopLevelDeclaration ) )* ) )
            // InternalDart.g:78:2: ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_directives_2_0= ruleImportOrExport ) )* ( (lv_partDirectives_3_0= rulePartDirective ) )* ( (lv_declarations_4_0= ruleTopLevelDeclaration ) )* )
            {
            // InternalDart.g:78:2: ( ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_directives_2_0= ruleImportOrExport ) )* ( (lv_partDirectives_3_0= rulePartDirective ) )* ( (lv_declarations_4_0= ruleTopLevelDeclaration ) )* )
            // InternalDart.g:79:3: ( (lv_scriptTag_0_0= ruleScriptTag ) )? ( (lv_libraryName_1_0= ruleLibraryName ) )? ( (lv_directives_2_0= ruleImportOrExport ) )* ( (lv_partDirectives_3_0= rulePartDirective ) )* ( (lv_declarations_4_0= ruleTopLevelDeclaration ) )*
            {
            // InternalDart.g:79:3: ( (lv_scriptTag_0_0= ruleScriptTag ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SCRIPT_TAG) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDart.g:80:4: (lv_scriptTag_0_0= ruleScriptTag )
                    {
                    // InternalDart.g:80:4: (lv_scriptTag_0_0= ruleScriptTag )
                    // InternalDart.g:81:5: lv_scriptTag_0_0= ruleScriptTag
                    {

                    					newCompositeNode(grammarAccess.getCompilationUnitAccess().getScriptTagScriptTagParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_scriptTag_0_0=ruleScriptTag();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    					}
                    					set(
                    						current,
                    						"scriptTag",
                    						lv_scriptTag_0_0,
                    						"it.lorenzodeluca.dart.Dart.ScriptTag");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDart.g:98:3: ( (lv_libraryName_1_0= ruleLibraryName ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDart.g:99:4: (lv_libraryName_1_0= ruleLibraryName )
                    {
                    // InternalDart.g:99:4: (lv_libraryName_1_0= ruleLibraryName )
                    // InternalDart.g:100:5: lv_libraryName_1_0= ruleLibraryName
                    {

                    					newCompositeNode(grammarAccess.getCompilationUnitAccess().getLibraryNameLibraryNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_libraryName_1_0=ruleLibraryName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    					}
                    					set(
                    						current,
                    						"libraryName",
                    						lv_libraryName_1_0,
                    						"it.lorenzodeluca.dart.Dart.LibraryName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDart.g:117:3: ( (lv_directives_2_0= ruleImportOrExport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDart.g:118:4: (lv_directives_2_0= ruleImportOrExport )
            	    {
            	    // InternalDart.g:118:4: (lv_directives_2_0= ruleImportOrExport )
            	    // InternalDart.g:119:5: lv_directives_2_0= ruleImportOrExport
            	    {

            	    					newCompositeNode(grammarAccess.getCompilationUnitAccess().getDirectivesImportOrExportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_directives_2_0=ruleImportOrExport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_2_0,
            	    						"it.lorenzodeluca.dart.Dart.ImportOrExport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDart.g:136:3: ( (lv_partDirectives_3_0= rulePartDirective ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDart.g:137:4: (lv_partDirectives_3_0= rulePartDirective )
            	    {
            	    // InternalDart.g:137:4: (lv_partDirectives_3_0= rulePartDirective )
            	    // InternalDart.g:138:5: lv_partDirectives_3_0= rulePartDirective
            	    {

            	    					newCompositeNode(grammarAccess.getCompilationUnitAccess().getPartDirectivesPartDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_partDirectives_3_0=rulePartDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"partDirectives",
            	    						lv_partDirectives_3_0,
            	    						"it.lorenzodeluca.dart.Dart.PartDirective");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDart.g:155:3: ( (lv_declarations_4_0= ruleTopLevelDeclaration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==19||(LA5_0>=22 && LA5_0<=23)||(LA5_0>=25 && LA5_0<=26)||LA5_0==28||LA5_0==31||(LA5_0>=33 && LA5_0<=36)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDart.g:156:4: (lv_declarations_4_0= ruleTopLevelDeclaration )
            	    {
            	    // InternalDart.g:156:4: (lv_declarations_4_0= ruleTopLevelDeclaration )
            	    // InternalDart.g:157:5: lv_declarations_4_0= ruleTopLevelDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getCompilationUnitAccess().getDeclarationsTopLevelDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_declarations_4_0=ruleTopLevelDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_4_0,
            	    						"it.lorenzodeluca.dart.Dart.TopLevelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleScriptTag"
    // InternalDart.g:178:1: entryRuleScriptTag returns [EObject current=null] : iv_ruleScriptTag= ruleScriptTag EOF ;
    public final EObject entryRuleScriptTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptTag = null;


        try {
            // InternalDart.g:178:50: (iv_ruleScriptTag= ruleScriptTag EOF )
            // InternalDart.g:179:2: iv_ruleScriptTag= ruleScriptTag EOF
            {
             newCompositeNode(grammarAccess.getScriptTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScriptTag=ruleScriptTag();

            state._fsp--;

             current =iv_ruleScriptTag; 
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
    // $ANTLR end "entryRuleScriptTag"


    // $ANTLR start "ruleScriptTag"
    // InternalDart.g:185:1: ruleScriptTag returns [EObject current=null] : ( (lv_content_0_0= RULE_SCRIPT_TAG ) ) ;
    public final EObject ruleScriptTag() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;


        	enterRule();

        try {
            // InternalDart.g:191:2: ( ( (lv_content_0_0= RULE_SCRIPT_TAG ) ) )
            // InternalDart.g:192:2: ( (lv_content_0_0= RULE_SCRIPT_TAG ) )
            {
            // InternalDart.g:192:2: ( (lv_content_0_0= RULE_SCRIPT_TAG ) )
            // InternalDart.g:193:3: (lv_content_0_0= RULE_SCRIPT_TAG )
            {
            // InternalDart.g:193:3: (lv_content_0_0= RULE_SCRIPT_TAG )
            // InternalDart.g:194:4: lv_content_0_0= RULE_SCRIPT_TAG
            {
            lv_content_0_0=(Token)match(input,RULE_SCRIPT_TAG,FOLLOW_2); 

            				newLeafNode(lv_content_0_0, grammarAccess.getScriptTagAccess().getContentSCRIPT_TAGTerminalRuleCall_0());
            			

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
    // $ANTLR end "ruleScriptTag"


    // $ANTLR start "entryRuleLibraryName"
    // InternalDart.g:213:1: entryRuleLibraryName returns [EObject current=null] : iv_ruleLibraryName= ruleLibraryName EOF ;
    public final EObject entryRuleLibraryName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryName = null;


        try {
            // InternalDart.g:213:52: (iv_ruleLibraryName= ruleLibraryName EOF )
            // InternalDart.g:214:2: iv_ruleLibraryName= ruleLibraryName EOF
            {
             newCompositeNode(grammarAccess.getLibraryNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraryName=ruleLibraryName();

            state._fsp--;

             current =iv_ruleLibraryName; 
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
    // $ANTLR end "entryRuleLibraryName"


    // $ANTLR start "ruleLibraryName"
    // InternalDart.g:220:1: ruleLibraryName returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= ruleDottedIdentifier ) ) otherlv_2= ';' ) ;
    public final EObject ruleLibraryName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDart.g:226:2: ( (otherlv_0= 'library' ( (lv_name_1_0= ruleDottedIdentifier ) ) otherlv_2= ';' ) )
            // InternalDart.g:227:2: (otherlv_0= 'library' ( (lv_name_1_0= ruleDottedIdentifier ) ) otherlv_2= ';' )
            {
            // InternalDart.g:227:2: (otherlv_0= 'library' ( (lv_name_1_0= ruleDottedIdentifier ) ) otherlv_2= ';' )
            // InternalDart.g:228:3: otherlv_0= 'library' ( (lv_name_1_0= ruleDottedIdentifier ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryNameAccess().getLibraryKeyword_0());
            		
            // InternalDart.g:232:3: ( (lv_name_1_0= ruleDottedIdentifier ) )
            // InternalDart.g:233:4: (lv_name_1_0= ruleDottedIdentifier )
            {
            // InternalDart.g:233:4: (lv_name_1_0= ruleDottedIdentifier )
            // InternalDart.g:234:5: lv_name_1_0= ruleDottedIdentifier
            {

            					newCompositeNode(grammarAccess.getLibraryNameAccess().getNameDottedIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleDottedIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.lorenzodeluca.dart.Dart.DottedIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLibraryNameAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleLibraryName"


    // $ANTLR start "entryRuleDottedIdentifier"
    // InternalDart.g:259:1: entryRuleDottedIdentifier returns [String current=null] : iv_ruleDottedIdentifier= ruleDottedIdentifier EOF ;
    public final String entryRuleDottedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDottedIdentifier = null;


        try {
            // InternalDart.g:259:56: (iv_ruleDottedIdentifier= ruleDottedIdentifier EOF )
            // InternalDart.g:260:2: iv_ruleDottedIdentifier= ruleDottedIdentifier EOF
            {
             newCompositeNode(grammarAccess.getDottedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDottedIdentifier=ruleDottedIdentifier();

            state._fsp--;

             current =iv_ruleDottedIdentifier.getText(); 
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
    // $ANTLR end "entryRuleDottedIdentifier"


    // $ANTLR start "ruleDottedIdentifier"
    // InternalDart.g:266:1: ruleDottedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDottedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDart.g:272:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDart.g:273:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDart.g:273:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDart.g:274:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getDottedIdentifierAccess().getIDTerminalRuleCall_0());
            		
            // InternalDart.g:281:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDart.g:282:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDottedIdentifierAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getDottedIdentifierAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleDottedIdentifier"


    // $ANTLR start "entryRuleImportOrExport"
    // InternalDart.g:299:1: entryRuleImportOrExport returns [EObject current=null] : iv_ruleImportOrExport= ruleImportOrExport EOF ;
    public final EObject entryRuleImportOrExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportOrExport = null;


        try {
            // InternalDart.g:299:55: (iv_ruleImportOrExport= ruleImportOrExport EOF )
            // InternalDart.g:300:2: iv_ruleImportOrExport= ruleImportOrExport EOF
            {
             newCompositeNode(grammarAccess.getImportOrExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportOrExport=ruleImportOrExport();

            state._fsp--;

             current =iv_ruleImportOrExport; 
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
    // $ANTLR end "entryRuleImportOrExport"


    // $ANTLR start "ruleImportOrExport"
    // InternalDart.g:306:1: ruleImportOrExport returns [EObject current=null] : (this_LibraryImport_0= ruleLibraryImport | this_LibraryExport_1= ruleLibraryExport ) ;
    public final EObject ruleImportOrExport() throws RecognitionException {
        EObject current = null;

        EObject this_LibraryImport_0 = null;

        EObject this_LibraryExport_1 = null;



        	enterRule();

        try {
            // InternalDart.g:312:2: ( (this_LibraryImport_0= ruleLibraryImport | this_LibraryExport_1= ruleLibraryExport ) )
            // InternalDart.g:313:2: (this_LibraryImport_0= ruleLibraryImport | this_LibraryExport_1= ruleLibraryExport )
            {
            // InternalDart.g:313:2: (this_LibraryImport_0= ruleLibraryImport | this_LibraryExport_1= ruleLibraryExport )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDart.g:314:3: this_LibraryImport_0= ruleLibraryImport
                    {

                    			newCompositeNode(grammarAccess.getImportOrExportAccess().getLibraryImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LibraryImport_0=ruleLibraryImport();

                    state._fsp--;


                    			current = this_LibraryImport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDart.g:323:3: this_LibraryExport_1= ruleLibraryExport
                    {

                    			newCompositeNode(grammarAccess.getImportOrExportAccess().getLibraryExportParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LibraryExport_1=ruleLibraryExport();

                    state._fsp--;


                    			current = this_LibraryExport_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleImportOrExport"


    // $ANTLR start "entryRuleLibraryImport"
    // InternalDart.g:335:1: entryRuleLibraryImport returns [EObject current=null] : iv_ruleLibraryImport= ruleLibraryImport EOF ;
    public final EObject entryRuleLibraryImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryImport = null;


        try {
            // InternalDart.g:335:54: (iv_ruleLibraryImport= ruleLibraryImport EOF )
            // InternalDart.g:336:2: iv_ruleLibraryImport= ruleLibraryImport EOF
            {
             newCompositeNode(grammarAccess.getLibraryImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraryImport=ruleLibraryImport();

            state._fsp--;

             current =iv_ruleLibraryImport; 
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
    // $ANTLR end "entryRuleLibraryImport"


    // $ANTLR start "ruleLibraryImport"
    // InternalDart.g:342:1: ruleLibraryImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleLibraryImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDart.g:348:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ';' ) )
            // InternalDart.g:349:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ';' )
            {
            // InternalDart.g:349:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ';' )
            // InternalDart.g:350:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryImportAccess().getImportKeyword_0());
            		
            // InternalDart.g:354:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDart.g:355:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDart.g:355:4: (lv_importURI_1_0= RULE_STRING )
            // InternalDart.g:356:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getLibraryImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDart.g:372:3: (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDart.g:373:4: otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getLibraryImportAccess().getAsKeyword_2_0());
                    			
                    // InternalDart.g:377:4: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalDart.g:378:5: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalDart.g:378:5: (lv_alias_3_0= RULE_ID )
                    // InternalDart.g:379:6: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_alias_3_0, grammarAccess.getLibraryImportAccess().getAliasIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLibraryImportRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLibraryImportAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLibraryImport"


    // $ANTLR start "entryRuleLibraryExport"
    // InternalDart.g:404:1: entryRuleLibraryExport returns [EObject current=null] : iv_ruleLibraryExport= ruleLibraryExport EOF ;
    public final EObject entryRuleLibraryExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryExport = null;


        try {
            // InternalDart.g:404:54: (iv_ruleLibraryExport= ruleLibraryExport EOF )
            // InternalDart.g:405:2: iv_ruleLibraryExport= ruleLibraryExport EOF
            {
             newCompositeNode(grammarAccess.getLibraryExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraryExport=ruleLibraryExport();

            state._fsp--;

             current =iv_ruleLibraryExport; 
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
    // $ANTLR end "entryRuleLibraryExport"


    // $ANTLR start "ruleLibraryExport"
    // InternalDart.g:411:1: ruleLibraryExport returns [EObject current=null] : (otherlv_0= 'export' ( (lv_exportURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleLibraryExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exportURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDart.g:417:2: ( (otherlv_0= 'export' ( (lv_exportURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalDart.g:418:2: (otherlv_0= 'export' ( (lv_exportURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalDart.g:418:2: (otherlv_0= 'export' ( (lv_exportURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalDart.g:419:3: otherlv_0= 'export' ( (lv_exportURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryExportAccess().getExportKeyword_0());
            		
            // InternalDart.g:423:3: ( (lv_exportURI_1_0= RULE_STRING ) )
            // InternalDart.g:424:4: (lv_exportURI_1_0= RULE_STRING )
            {
            // InternalDart.g:424:4: (lv_exportURI_1_0= RULE_STRING )
            // InternalDart.g:425:5: lv_exportURI_1_0= RULE_STRING
            {
            lv_exportURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_exportURI_1_0, grammarAccess.getLibraryExportAccess().getExportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryExportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exportURI",
            						lv_exportURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLibraryExportAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleLibraryExport"


    // $ANTLR start "entryRulePartDirective"
    // InternalDart.g:449:1: entryRulePartDirective returns [EObject current=null] : iv_rulePartDirective= rulePartDirective EOF ;
    public final EObject entryRulePartDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDirective = null;


        try {
            // InternalDart.g:449:54: (iv_rulePartDirective= rulePartDirective EOF )
            // InternalDart.g:450:2: iv_rulePartDirective= rulePartDirective EOF
            {
             newCompositeNode(grammarAccess.getPartDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartDirective=rulePartDirective();

            state._fsp--;

             current =iv_rulePartDirective; 
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
    // $ANTLR end "entryRulePartDirective"


    // $ANTLR start "rulePartDirective"
    // InternalDart.g:456:1: rulePartDirective returns [EObject current=null] : (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject rulePartDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_partURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDart.g:462:2: ( (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalDart.g:463:2: (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalDart.g:463:2: (otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalDart.g:464:3: otherlv_0= 'part' ( (lv_partURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPartDirectiveAccess().getPartKeyword_0());
            		
            // InternalDart.g:468:3: ( (lv_partURI_1_0= RULE_STRING ) )
            // InternalDart.g:469:4: (lv_partURI_1_0= RULE_STRING )
            {
            // InternalDart.g:469:4: (lv_partURI_1_0= RULE_STRING )
            // InternalDart.g:470:5: lv_partURI_1_0= RULE_STRING
            {
            lv_partURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_partURI_1_0, grammarAccess.getPartDirectiveAccess().getPartURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartDirectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"partURI",
            						lv_partURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPartDirectiveAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePartDirective"


    // $ANTLR start "entryRuleTopLevelDeclaration"
    // InternalDart.g:494:1: entryRuleTopLevelDeclaration returns [EObject current=null] : iv_ruleTopLevelDeclaration= ruleTopLevelDeclaration EOF ;
    public final EObject entryRuleTopLevelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelDeclaration = null;


        try {
            // InternalDart.g:494:60: (iv_ruleTopLevelDeclaration= ruleTopLevelDeclaration EOF )
            // InternalDart.g:495:2: iv_ruleTopLevelDeclaration= ruleTopLevelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTopLevelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelDeclaration=ruleTopLevelDeclaration();

            state._fsp--;

             current =iv_ruleTopLevelDeclaration; 
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
    // $ANTLR end "entryRuleTopLevelDeclaration"


    // $ANTLR start "ruleTopLevelDeclaration"
    // InternalDart.g:501:1: ruleTopLevelDeclaration returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | this_FunctionDeclaration_5= ruleFunctionDeclaration | this_VariableDeclaration_6= ruleVariableDeclaration ) ;
    public final EObject ruleTopLevelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDeclaration_0 = null;

        EObject this_MixinDeclaration_1 = null;

        EObject this_ExtensionDeclaration_2 = null;

        EObject this_EnumDeclaration_3 = null;

        EObject this_TypeAlias_4 = null;

        EObject this_FunctionDeclaration_5 = null;

        EObject this_VariableDeclaration_6 = null;



        	enterRule();

        try {
            // InternalDart.g:507:2: ( (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | this_FunctionDeclaration_5= ruleFunctionDeclaration | this_VariableDeclaration_6= ruleVariableDeclaration ) )
            // InternalDart.g:508:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | this_FunctionDeclaration_5= ruleFunctionDeclaration | this_VariableDeclaration_6= ruleVariableDeclaration )
            {
            // InternalDart.g:508:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | this_FunctionDeclaration_5= ruleFunctionDeclaration | this_VariableDeclaration_6= ruleVariableDeclaration )
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalDart.g:509:3: this_ClassDeclaration_0= ruleClassDeclaration
                    {

                    			newCompositeNode(grammarAccess.getTopLevelDeclarationAccess().getClassDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDeclaration_0=ruleClassDeclaration();

                    state._fsp--;


                    			current = this_ClassDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDart.g:518:3: this_MixinDeclaration_1= ruleMixinDeclaration
                    {

                    			newCompositeNode(grammarAccess.getTopLevelDeclarationAccess().getMixinDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MixinDeclaration_1=ruleMixinDeclaration();

                    state._fsp--;


                    			current = this_MixinDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDart.g:527:3: this_ExtensionDeclaration_2= ruleExtensionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getTopLevelDeclarationAccess().getExtensionDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtensionDeclaration_2=ruleExtensionDeclaration();

                    state._fsp--;


                    			current = this_ExtensionDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDart.g:536:3: this_EnumDeclaration_3= ruleEnumDeclaration
                    {

                    			newCompositeNode(grammarAccess.getTopLevelDeclarationAccess().getEnumDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumDeclaration_3=ruleEnumDeclaration();

                    state._fsp--;


                    			current = this_EnumDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDart.g:545:3: this_TypeAlias_4= ruleTypeAlias
                    {

                    			newCompositeNode(grammarAccess.getTopLevelDeclarationAccess().getTypeAliasParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeAlias_4=ruleTypeAlias();

                    state._fsp--;


                    			current = this_TypeAlias_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDart.g:554:3: this_FunctionDeclaration_5= ruleFunctionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getTopLevelDeclarationAccess().getFunctionDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionDeclaration_5=ruleFunctionDeclaration();

                    state._fsp--;


                    			current = this_FunctionDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDart.g:563:3: this_VariableDeclaration_6= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getTopLevelDeclarationAccess().getVariableDeclarationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_6=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_6;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTopLevelDeclaration"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalDart.g:575:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalDart.g:575:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalDart.g:576:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalDart.g:582:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_metadata_0_0 = null;



        	enterRule();

        try {
            // InternalDart.g:588:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalDart.g:589:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalDart.g:589:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalDart.g:590:3: ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalDart.g:590:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDart.g:591:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:591:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:592:5: lv_metadata_0_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getClassDeclarationAccess().getMetadataMetadataParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metadata",
            	    						lv_metadata_0_0,
            	    						"it.lorenzodeluca.dart.Dart.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalDart.g:613:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDart.g:614:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDart.g:614:4: (lv_name_2_0= RULE_ID )
            // InternalDart.g:615:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleMixinDeclaration"
    // InternalDart.g:643:1: entryRuleMixinDeclaration returns [EObject current=null] : iv_ruleMixinDeclaration= ruleMixinDeclaration EOF ;
    public final EObject entryRuleMixinDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixinDeclaration = null;


        try {
            // InternalDart.g:643:57: (iv_ruleMixinDeclaration= ruleMixinDeclaration EOF )
            // InternalDart.g:644:2: iv_ruleMixinDeclaration= ruleMixinDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMixinDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixinDeclaration=ruleMixinDeclaration();

            state._fsp--;

             current =iv_ruleMixinDeclaration; 
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
    // $ANTLR end "entryRuleMixinDeclaration"


    // $ANTLR start "ruleMixinDeclaration"
    // InternalDart.g:650:1: ruleMixinDeclaration returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleMixinDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_metadata_0_0 = null;



        	enterRule();

        try {
            // InternalDart.g:656:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalDart.g:657:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalDart.g:657:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalDart.g:658:3: ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalDart.g:658:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDart.g:659:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:659:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:660:5: lv_metadata_0_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getMixinDeclarationAccess().getMetadataMetadataParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMixinDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metadata",
            	    						lv_metadata_0_0,
            	    						"it.lorenzodeluca.dart.Dart.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMixinDeclarationAccess().getMixinKeyword_1());
            		
            // InternalDart.g:681:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDart.g:682:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDart.g:682:4: (lv_name_2_0= RULE_ID )
            // InternalDart.g:683:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMixinDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getMixinDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMixinDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMixinDeclaration"


    // $ANTLR start "entryRuleExtensionDeclaration"
    // InternalDart.g:711:1: entryRuleExtensionDeclaration returns [EObject current=null] : iv_ruleExtensionDeclaration= ruleExtensionDeclaration EOF ;
    public final EObject entryRuleExtensionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionDeclaration = null;


        try {
            // InternalDart.g:711:61: (iv_ruleExtensionDeclaration= ruleExtensionDeclaration EOF )
            // InternalDart.g:712:2: iv_ruleExtensionDeclaration= ruleExtensionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExtensionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionDeclaration=ruleExtensionDeclaration();

            state._fsp--;

             current =iv_ruleExtensionDeclaration; 
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
    // $ANTLR end "entryRuleExtensionDeclaration"


    // $ANTLR start "ruleExtensionDeclaration"
    // InternalDart.g:718:1: ruleExtensionDeclaration returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'extension' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' this_ID_4= RULE_ID otherlv_5= '{' otherlv_6= '}' ) ;
    public final EObject ruleExtensionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_metadata_0_0 = null;



        	enterRule();

        try {
            // InternalDart.g:724:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'extension' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' this_ID_4= RULE_ID otherlv_5= '{' otherlv_6= '}' ) )
            // InternalDart.g:725:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'extension' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' this_ID_4= RULE_ID otherlv_5= '{' otherlv_6= '}' )
            {
            // InternalDart.g:725:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'extension' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' this_ID_4= RULE_ID otherlv_5= '{' otherlv_6= '}' )
            // InternalDart.g:726:3: ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'extension' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' this_ID_4= RULE_ID otherlv_5= '{' otherlv_6= '}'
            {
            // InternalDart.g:726:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDart.g:727:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:727:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:728:5: lv_metadata_0_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionDeclarationAccess().getMetadataMetadataParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metadata",
            	    						lv_metadata_0_0,
            	    						"it.lorenzodeluca.dart.Dart.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionDeclarationAccess().getExtensionKeyword_1());
            		
            // InternalDart.g:749:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDart.g:750:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDart.g:750:4: (lv_name_2_0= RULE_ID )
            // InternalDart.g:751:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtensionDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionDeclarationAccess().getOnKeyword_3());
            		
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            			newLeafNode(this_ID_4, grammarAccess.getExtensionDeclarationAccess().getIDTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getExtensionDeclarationAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExtensionDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExtensionDeclaration"


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalDart.g:787:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // InternalDart.g:787:56: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // InternalDart.g:788:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalDart.g:794:1: ruleEnumDeclaration returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_metadata_0_0 = null;



        	enterRule();

        try {
            // InternalDart.g:800:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalDart.g:801:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalDart.g:801:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalDart.g:802:3: ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalDart.g:802:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDart.g:803:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:803:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:804:5: lv_metadata_0_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getEnumDeclarationAccess().getMetadataMetadataParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metadata",
            	    						lv_metadata_0_0,
            	    						"it.lorenzodeluca.dart.Dart.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumDeclarationAccess().getEnumKeyword_1());
            		
            // InternalDart.g:825:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDart.g:826:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDart.g:826:4: (lv_name_2_0= RULE_ID )
            // InternalDart.g:827:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleTypeAlias"
    // InternalDart.g:855:1: entryRuleTypeAlias returns [EObject current=null] : iv_ruleTypeAlias= ruleTypeAlias EOF ;
    public final EObject entryRuleTypeAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAlias = null;


        try {
            // InternalDart.g:855:50: (iv_ruleTypeAlias= ruleTypeAlias EOF )
            // InternalDart.g:856:2: iv_ruleTypeAlias= ruleTypeAlias EOF
            {
             newCompositeNode(grammarAccess.getTypeAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeAlias=ruleTypeAlias();

            state._fsp--;

             current =iv_ruleTypeAlias; 
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
    // $ANTLR end "entryRuleTypeAlias"


    // $ANTLR start "ruleTypeAlias"
    // InternalDart.g:862:1: ruleTypeAlias returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'typedef' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' this_ID_4= RULE_ID otherlv_5= ';' ) ;
    public final EObject ruleTypeAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_metadata_0_0 = null;



        	enterRule();

        try {
            // InternalDart.g:868:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'typedef' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' this_ID_4= RULE_ID otherlv_5= ';' ) )
            // InternalDart.g:869:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'typedef' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' this_ID_4= RULE_ID otherlv_5= ';' )
            {
            // InternalDart.g:869:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'typedef' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' this_ID_4= RULE_ID otherlv_5= ';' )
            // InternalDart.g:870:3: ( (lv_metadata_0_0= ruleMetadata ) )* otherlv_1= 'typedef' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' this_ID_4= RULE_ID otherlv_5= ';'
            {
            // InternalDart.g:870:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDart.g:871:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:871:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:872:5: lv_metadata_0_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getTypeAliasAccess().getMetadataMetadataParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeAliasRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metadata",
            	    						lv_metadata_0_0,
            	    						"it.lorenzodeluca.dart.Dart.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAliasAccess().getTypedefKeyword_1());
            		
            // InternalDart.g:893:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDart.g:894:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDart.g:894:4: (lv_name_2_0= RULE_ID )
            // InternalDart.g:895:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeAliasAccess().getEqualsSignKeyword_3());
            		
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(this_ID_4, grammarAccess.getTypeAliasAccess().getIDTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeAliasAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleTypeAlias"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalDart.g:927:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalDart.g:927:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalDart.g:928:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalDart.g:934:1: ruleFunctionDeclaration returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_external_1_0= 'external' ) )? ( (lv_returnType_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' ( ( (lv_body_6_0= ruleFunctionBody ) ) | otherlv_7= ';' ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_external_1_0=null;
        Token lv_returnType_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_metadata_0_0 = null;

        AntlrDatatypeRuleToken lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalDart.g:940:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_external_1_0= 'external' ) )? ( (lv_returnType_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' ( ( (lv_body_6_0= ruleFunctionBody ) ) | otherlv_7= ';' ) ) )
            // InternalDart.g:941:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_external_1_0= 'external' ) )? ( (lv_returnType_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' ( ( (lv_body_6_0= ruleFunctionBody ) ) | otherlv_7= ';' ) )
            {
            // InternalDart.g:941:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_external_1_0= 'external' ) )? ( (lv_returnType_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' ( ( (lv_body_6_0= ruleFunctionBody ) ) | otherlv_7= ';' ) )
            // InternalDart.g:942:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_external_1_0= 'external' ) )? ( (lv_returnType_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' ( ( (lv_body_6_0= ruleFunctionBody ) ) | otherlv_7= ';' )
            {
            // InternalDart.g:942:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDart.g:943:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:943:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:944:5: lv_metadata_0_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getMetadataMetadataParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metadata",
            	    						lv_metadata_0_0,
            	    						"it.lorenzodeluca.dart.Dart.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalDart.g:961:3: ( (lv_external_1_0= 'external' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDart.g:962:4: (lv_external_1_0= 'external' )
                    {
                    // InternalDart.g:962:4: (lv_external_1_0= 'external' )
                    // InternalDart.g:963:5: lv_external_1_0= 'external'
                    {
                    lv_external_1_0=(Token)match(input,28,FOLLOW_7); 

                    					newLeafNode(lv_external_1_0, grammarAccess.getFunctionDeclarationAccess().getExternalExternalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "external", lv_external_1_0 != null, "external");
                    				

                    }


                    }
                    break;

            }

            // InternalDart.g:975:3: ( (lv_returnType_2_0= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalDart.g:976:4: (lv_returnType_2_0= RULE_ID )
                    {
                    // InternalDart.g:976:4: (lv_returnType_2_0= RULE_ID )
                    // InternalDart.g:977:5: lv_returnType_2_0= RULE_ID
                    {
                    lv_returnType_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_returnType_2_0, grammarAccess.getFunctionDeclarationAccess().getReturnTypeIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"returnType",
                    						lv_returnType_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDart.g:993:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDart.g:994:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDart.g:994:4: (lv_name_3_0= RULE_ID )
            // InternalDart.g:995:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5());
            		
            // InternalDart.g:1019:3: ( ( (lv_body_6_0= ruleFunctionBody ) ) | otherlv_7= ';' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            else if ( (LA18_0==13) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDart.g:1020:4: ( (lv_body_6_0= ruleFunctionBody ) )
                    {
                    // InternalDart.g:1020:4: ( (lv_body_6_0= ruleFunctionBody ) )
                    // InternalDart.g:1021:5: (lv_body_6_0= ruleFunctionBody )
                    {
                    // InternalDart.g:1021:5: (lv_body_6_0= ruleFunctionBody )
                    // InternalDart.g:1022:6: lv_body_6_0= ruleFunctionBody
                    {

                    						newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyFunctionBodyParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleFunctionBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_6_0,
                    							"it.lorenzodeluca.dart.Dart.FunctionBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:1040:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_6_1());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionBody"
    // InternalDart.g:1049:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // InternalDart.g:1049:52: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalDart.g:1050:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody.getText(); 
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
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalDart.g:1056:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDart.g:1062:2: ( (kw= '{' kw= '}' ) )
            // InternalDart.g:1063:2: (kw= '{' kw= '}' )
            {
            // InternalDart.g:1063:2: (kw= '{' kw= '}' )
            // InternalDart.g:1064:3: kw= '{' kw= '}'
            {
            kw=(Token)match(input,20,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_1());
            		

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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalDart.g:1078:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalDart.g:1078:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalDart.g:1079:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalDart.g:1085:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_late_1_0= 'late' ) )? ( ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? ) | ( (lv_type_4_0= ruleType ) ) ) ( (lv_variables_5_0= ruleVariableSingleDeclaration ) ) (otherlv_6= ',' ( (lv_variables_7_0= ruleVariableSingleDeclaration ) ) )* otherlv_8= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_late_1_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_metadata_0_0 = null;

        AntlrDatatypeRuleToken lv_modifier_2_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_variables_7_0 = null;



        	enterRule();

        try {
            // InternalDart.g:1091:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_late_1_0= 'late' ) )? ( ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? ) | ( (lv_type_4_0= ruleType ) ) ) ( (lv_variables_5_0= ruleVariableSingleDeclaration ) ) (otherlv_6= ',' ( (lv_variables_7_0= ruleVariableSingleDeclaration ) ) )* otherlv_8= ';' ) )
            // InternalDart.g:1092:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_late_1_0= 'late' ) )? ( ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? ) | ( (lv_type_4_0= ruleType ) ) ) ( (lv_variables_5_0= ruleVariableSingleDeclaration ) ) (otherlv_6= ',' ( (lv_variables_7_0= ruleVariableSingleDeclaration ) ) )* otherlv_8= ';' )
            {
            // InternalDart.g:1092:2: ( ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_late_1_0= 'late' ) )? ( ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? ) | ( (lv_type_4_0= ruleType ) ) ) ( (lv_variables_5_0= ruleVariableSingleDeclaration ) ) (otherlv_6= ',' ( (lv_variables_7_0= ruleVariableSingleDeclaration ) ) )* otherlv_8= ';' )
            // InternalDart.g:1093:3: ( (lv_metadata_0_0= ruleMetadata ) )* ( (lv_late_1_0= 'late' ) )? ( ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? ) | ( (lv_type_4_0= ruleType ) ) ) ( (lv_variables_5_0= ruleVariableSingleDeclaration ) ) (otherlv_6= ',' ( (lv_variables_7_0= ruleVariableSingleDeclaration ) ) )* otherlv_8= ';'
            {
            // InternalDart.g:1093:3: ( (lv_metadata_0_0= ruleMetadata ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDart.g:1094:4: (lv_metadata_0_0= ruleMetadata )
            	    {
            	    // InternalDart.g:1094:4: (lv_metadata_0_0= ruleMetadata )
            	    // InternalDart.g:1095:5: lv_metadata_0_0= ruleMetadata
            	    {

            	    					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getMetadataMetadataParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_metadata_0_0=ruleMetadata();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metadata",
            	    						lv_metadata_0_0,
            	    						"it.lorenzodeluca.dart.Dart.Metadata");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalDart.g:1112:3: ( (lv_late_1_0= 'late' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDart.g:1113:4: (lv_late_1_0= 'late' )
                    {
                    // InternalDart.g:1113:4: (lv_late_1_0= 'late' )
                    // InternalDart.g:1114:5: lv_late_1_0= 'late'
                    {
                    lv_late_1_0=(Token)match(input,31,FOLLOW_25); 

                    					newLeafNode(lv_late_1_0, grammarAccess.getVariableDeclarationAccess().getLateLateKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "late", lv_late_1_0 != null, "late");
                    				

                    }


                    }
                    break;

            }

            // InternalDart.g:1126:3: ( ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? ) | ( (lv_type_4_0= ruleType ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=35)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDart.g:1127:4: ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? )
                    {
                    // InternalDart.g:1127:4: ( ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )? )
                    // InternalDart.g:1128:5: ( (lv_modifier_2_0= ruleVariableModifier ) ) ( (lv_type_3_0= ruleType ) )?
                    {
                    // InternalDart.g:1128:5: ( (lv_modifier_2_0= ruleVariableModifier ) )
                    // InternalDart.g:1129:6: (lv_modifier_2_0= ruleVariableModifier )
                    {
                    // InternalDart.g:1129:6: (lv_modifier_2_0= ruleVariableModifier )
                    // InternalDart.g:1130:7: lv_modifier_2_0= ruleVariableModifier
                    {

                    							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getModifierVariableModifierParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_modifier_2_0=ruleVariableModifier();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    							}
                    							set(
                    								current,
                    								"modifier",
                    								lv_modifier_2_0,
                    								"it.lorenzodeluca.dart.Dart.VariableModifier");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDart.g:1147:5: ( (lv_type_3_0= ruleType ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==RULE_ID||(LA21_1>=37 && LA21_1<=38)) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDart.g:1148:6: (lv_type_3_0= ruleType )
                            {
                            // InternalDart.g:1148:6: (lv_type_3_0= ruleType )
                            // InternalDart.g:1149:7: lv_type_3_0= ruleType
                            {

                            							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_type_3_0=ruleType();

                            state._fsp--;


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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:1168:4: ( (lv_type_4_0= ruleType ) )
                    {
                    // InternalDart.g:1168:4: ( (lv_type_4_0= ruleType ) )
                    // InternalDart.g:1169:5: (lv_type_4_0= ruleType )
                    {
                    // InternalDart.g:1169:5: (lv_type_4_0= ruleType )
                    // InternalDart.g:1170:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
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

            // InternalDart.g:1188:3: ( (lv_variables_5_0= ruleVariableSingleDeclaration ) )
            // InternalDart.g:1189:4: (lv_variables_5_0= ruleVariableSingleDeclaration )
            {
            // InternalDart.g:1189:4: (lv_variables_5_0= ruleVariableSingleDeclaration )
            // InternalDart.g:1190:5: lv_variables_5_0= ruleVariableSingleDeclaration
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariablesVariableSingleDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_variables_5_0=ruleVariableSingleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_5_0,
            						"it.lorenzodeluca.dart.Dart.VariableSingleDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDart.g:1207:3: (otherlv_6= ',' ( (lv_variables_7_0= ruleVariableSingleDeclaration ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDart.g:1208:4: otherlv_6= ',' ( (lv_variables_7_0= ruleVariableSingleDeclaration ) )
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_25); 

            	    				newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDart.g:1212:4: ( (lv_variables_7_0= ruleVariableSingleDeclaration ) )
            	    // InternalDart.g:1213:5: (lv_variables_7_0= ruleVariableSingleDeclaration )
            	    {
            	    // InternalDart.g:1213:5: (lv_variables_7_0= ruleVariableSingleDeclaration )
            	    // InternalDart.g:1214:6: lv_variables_7_0= ruleVariableSingleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariablesVariableSingleDeclarationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_variables_7_0=ruleVariableSingleDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_7_0,
            	    							"it.lorenzodeluca.dart.Dart.VariableSingleDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableSingleDeclaration"
    // InternalDart.g:1240:1: entryRuleVariableSingleDeclaration returns [EObject current=null] : iv_ruleVariableSingleDeclaration= ruleVariableSingleDeclaration EOF ;
    public final EObject entryRuleVariableSingleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableSingleDeclaration = null;


        try {
            // InternalDart.g:1240:66: (iv_ruleVariableSingleDeclaration= ruleVariableSingleDeclaration EOF )
            // InternalDart.g:1241:2: iv_ruleVariableSingleDeclaration= ruleVariableSingleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableSingleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableSingleDeclaration=ruleVariableSingleDeclaration();

            state._fsp--;

             current =iv_ruleVariableSingleDeclaration; 
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
    // $ANTLR end "entryRuleVariableSingleDeclaration"


    // $ANTLR start "ruleVariableSingleDeclaration"
    // InternalDart.g:1247:1: ruleVariableSingleDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableSingleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_initialValue_2_0 = null;



        	enterRule();

        try {
            // InternalDart.g:1253:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? ) )
            // InternalDart.g:1254:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? )
            {
            // InternalDart.g:1254:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )? )
            // InternalDart.g:1255:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )?
            {
            // InternalDart.g:1255:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDart.g:1256:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDart.g:1256:4: (lv_name_0_0= RULE_ID )
            // InternalDart.g:1257:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableSingleDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableSingleDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDart.g:1273:3: (otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDart.g:1274:4: otherlv_1= '=' ( (lv_initialValue_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableSingleDeclarationAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalDart.g:1278:4: ( (lv_initialValue_2_0= ruleExpression ) )
                    // InternalDart.g:1279:5: (lv_initialValue_2_0= ruleExpression )
                    {
                    // InternalDart.g:1279:5: (lv_initialValue_2_0= ruleExpression )
                    // InternalDart.g:1280:6: lv_initialValue_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableSingleDeclarationAccess().getInitialValueExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_initialValue_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableSingleDeclarationRule());
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
                    break;

            }


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
    // $ANTLR end "ruleVariableSingleDeclaration"


    // $ANTLR start "entryRuleVariableModifier"
    // InternalDart.g:1302:1: entryRuleVariableModifier returns [String current=null] : iv_ruleVariableModifier= ruleVariableModifier EOF ;
    public final String entryRuleVariableModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableModifier = null;


        try {
            // InternalDart.g:1302:56: (iv_ruleVariableModifier= ruleVariableModifier EOF )
            // InternalDart.g:1303:2: iv_ruleVariableModifier= ruleVariableModifier EOF
            {
             newCompositeNode(grammarAccess.getVariableModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableModifier=ruleVariableModifier();

            state._fsp--;

             current =iv_ruleVariableModifier.getText(); 
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
    // $ANTLR end "entryRuleVariableModifier"


    // $ANTLR start "ruleVariableModifier"
    // InternalDart.g:1309:1: ruleVariableModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'var' | kw= 'final' | kw= 'const' ) ;
    public final AntlrDatatypeRuleToken ruleVariableModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDart.g:1315:2: ( (kw= 'var' | kw= 'final' | kw= 'const' ) )
            // InternalDart.g:1316:2: (kw= 'var' | kw= 'final' | kw= 'const' )
            {
            // InternalDart.g:1316:2: (kw= 'var' | kw= 'final' | kw= 'const' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDart.g:1317:3: kw= 'var'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableModifierAccess().getVarKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDart.g:1323:3: kw= 'final'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableModifierAccess().getFinalKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDart.g:1329:3: kw= 'const'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableModifierAccess().getConstKeyword_2());
                    		

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
    // $ANTLR end "ruleVariableModifier"


    // $ANTLR start "entryRuleMetadata"
    // InternalDart.g:1338:1: entryRuleMetadata returns [String current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final String entryRuleMetadata() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadata = null;


        try {
            // InternalDart.g:1338:48: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalDart.g:1339:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata.getText(); 
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
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalDart.g:1345:1: ruleMetadata returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleMetadata() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDart.g:1351:2: ( (kw= '@' this_ID_1= RULE_ID ) )
            // InternalDart.g:1352:2: (kw= '@' this_ID_1= RULE_ID )
            {
            // InternalDart.g:1352:2: (kw= '@' this_ID_1= RULE_ID )
            // InternalDart.g:1353:3: kw= '@' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,36,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMetadataAccess().getCommercialAtKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getMetadataAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleExpression"
    // InternalDart.g:1369:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalDart.g:1369:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalDart.g:1370:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDart.g:1376:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDart.g:1382:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalDart.g:1383:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalDart.g:1383:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_INT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDart.g:1384:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDart.g:1392:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleType"
    // InternalDart.g:1403:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDart.g:1403:45: (iv_ruleType= ruleType EOF )
            // InternalDart.g:1404:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDart.g:1410:1: ruleType returns [EObject current=null] : (this_TypeName_0= ruleTypeName ( (lv_nullable_1_0= '?' ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_1_0=null;
        EObject this_TypeName_0 = null;



        	enterRule();

        try {
            // InternalDart.g:1416:2: ( (this_TypeName_0= ruleTypeName ( (lv_nullable_1_0= '?' ) )? ) )
            // InternalDart.g:1417:2: (this_TypeName_0= ruleTypeName ( (lv_nullable_1_0= '?' ) )? )
            {
            // InternalDart.g:1417:2: (this_TypeName_0= ruleTypeName ( (lv_nullable_1_0= '?' ) )? )
            // InternalDart.g:1418:3: this_TypeName_0= ruleTypeName ( (lv_nullable_1_0= '?' ) )?
            {

            			newCompositeNode(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_TypeName_0=ruleTypeName();

            state._fsp--;


            			current = this_TypeName_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDart.g:1426:3: ( (lv_nullable_1_0= '?' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDart.g:1427:4: (lv_nullable_1_0= '?' )
                    {
                    // InternalDart.g:1427:4: (lv_nullable_1_0= '?' )
                    // InternalDart.g:1428:5: lv_nullable_1_0= '?'
                    {
                    lv_nullable_1_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_nullable_1_0, grammarAccess.getTypeAccess().getNullableQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "nullable", lv_nullable_1_0 != null, "?");
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeName"
    // InternalDart.g:1444:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalDart.g:1444:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalDart.g:1445:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalDart.g:1451:1: ruleTypeName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_typeArguments_1_0 = null;



        	enterRule();

        try {
            // InternalDart.g:1457:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? ) )
            // InternalDart.g:1458:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? )
            {
            // InternalDart.g:1458:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )? )
            // InternalDart.g:1459:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_typeArguments_1_0= ruleTypeArguments ) )?
            {
            // InternalDart.g:1459:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDart.g:1460:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDart.g:1460:4: (lv_name_0_0= RULE_ID )
            // InternalDart.g:1461:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDart.g:1477:3: ( (lv_typeArguments_1_0= ruleTypeArguments ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDart.g:1478:4: (lv_typeArguments_1_0= ruleTypeArguments )
                    {
                    // InternalDart.g:1478:4: (lv_typeArguments_1_0= ruleTypeArguments )
                    // InternalDart.g:1479:5: lv_typeArguments_1_0= ruleTypeArguments
                    {

                    					newCompositeNode(grammarAccess.getTypeNameAccess().getTypeArgumentsTypeArgumentsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeArguments_1_0=ruleTypeArguments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeNameRule());
                    					}
                    					set(
                    						current,
                    						"typeArguments",
                    						lv_typeArguments_1_0,
                    						"it.lorenzodeluca.dart.Dart.TypeArguments");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeArguments"
    // InternalDart.g:1500:1: entryRuleTypeArguments returns [EObject current=null] : iv_ruleTypeArguments= ruleTypeArguments EOF ;
    public final EObject entryRuleTypeArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeArguments = null;


        try {
            // InternalDart.g:1500:54: (iv_ruleTypeArguments= ruleTypeArguments EOF )
            // InternalDart.g:1501:2: iv_ruleTypeArguments= ruleTypeArguments EOF
            {
             newCompositeNode(grammarAccess.getTypeArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeArguments=ruleTypeArguments();

            state._fsp--;

             current =iv_ruleTypeArguments; 
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
    // $ANTLR end "entryRuleTypeArguments"


    // $ANTLR start "ruleTypeArguments"
    // InternalDart.g:1507:1: ruleTypeArguments returns [EObject current=null] : (otherlv_0= '<' ( (lv_elements_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalDart.g:1513:2: ( (otherlv_0= '<' ( (lv_elements_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleType ) ) )* otherlv_4= '>' ) )
            // InternalDart.g:1514:2: (otherlv_0= '<' ( (lv_elements_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleType ) ) )* otherlv_4= '>' )
            {
            // InternalDart.g:1514:2: (otherlv_0= '<' ( (lv_elements_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleType ) ) )* otherlv_4= '>' )
            // InternalDart.g:1515:3: otherlv_0= '<' ( (lv_elements_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeArgumentsAccess().getLessThanSignKeyword_0());
            		
            // InternalDart.g:1519:3: ( (lv_elements_1_0= ruleType ) )
            // InternalDart.g:1520:4: (lv_elements_1_0= ruleType )
            {
            // InternalDart.g:1520:4: (lv_elements_1_0= ruleType )
            // InternalDart.g:1521:5: lv_elements_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTypeArgumentsAccess().getElementsTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_elements_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeArgumentsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"it.lorenzodeluca.dart.Dart.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDart.g:1538:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleType ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDart.g:1539:4: otherlv_2= ',' ( (lv_elements_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeArgumentsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDart.g:1543:4: ( (lv_elements_3_0= ruleType ) )
            	    // InternalDart.g:1544:5: (lv_elements_3_0= ruleType )
            	    {
            	    // InternalDart.g:1544:5: (lv_elements_3_0= ruleType )
            	    // InternalDart.g:1545:6: lv_elements_3_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getTypeArgumentsAccess().getElementsTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_elements_3_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeArgumentsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"it.lorenzodeluca.dart.Dart.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeArgumentsAccess().getGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleTypeArguments"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\2\5\6\uffff\1\5\1\uffff\1\5\1\15";
    static final String dfa_3s = "\1\44\1\5\6\uffff\1\46\1\uffff\1\44\1\40";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\2\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\15\uffff\1\2\2\uffff\1\3\1\4\1\uffff\1\5\1\6\1\uffff\1\7\2\uffff\1\11\1\uffff\3\11\1\1",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\27\uffff\1\7\7\uffff\2\11",
            "",
            "\1\10\15\uffff\1\2\2\uffff\1\3\1\4\1\uffff\1\5\1\6\1\uffff\1\7\2\uffff\1\11\1\uffff\3\11\1\1",
            "\1\11\15\uffff\1\11\1\uffff\1\7\2\uffff\1\11"
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
            return "508:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_MixinDeclaration_1= ruleMixinDeclaration | this_ExtensionDeclaration_2= ruleExtensionDeclaration | this_EnumDeclaration_3= ruleEnumDeclaration | this_TypeAlias_4= ruleTypeAlias | this_FunctionDeclaration_5= ruleFunctionDeclaration | this_VariableDeclaration_6= ruleVariableDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001E96CE9022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001E96CE8022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001E96CC0022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001E96C80022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001010000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001E96C80020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008100000000L});

}