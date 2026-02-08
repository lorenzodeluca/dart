package it.lorenzodeluca.dart.ide.contentassist.antlr.internal;

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
import it.lorenzodeluca.dart.services.DartGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDartParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SCRIPT_TAG", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'var'", "'final'", "'const'", "'library'", "'.'", "'import'", "'as'", "'export'", "'part'", "'class'", "'{'", "'}'", "'mixin'", "'extension'", "'on'", "'enum'", "'typedef'", "'='", "'('", "')'", "','", "'@'", "'<'", "'>'", "'external'", "'late'", "'?'"
    };
    public static final int RULE_SCRIPT_TAG=6;
    public static final int RULE_STRING=7;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

    	public void setGrammarAccess(DartGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCompilationUnit"
    // InternalDart.g:53:1: entryRuleCompilationUnit : ruleCompilationUnit EOF ;
    public final void entryRuleCompilationUnit() throws RecognitionException {
        try {
            // InternalDart.g:54:1: ( ruleCompilationUnit EOF )
            // InternalDart.g:55:1: ruleCompilationUnit EOF
            {
             before(grammarAccess.getCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleCompilationUnit();

            state._fsp--;

             after(grammarAccess.getCompilationUnitRule()); 
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
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // InternalDart.g:62:1: ruleCompilationUnit : ( ( rule__CompilationUnit__Group__0 ) ) ;
    public final void ruleCompilationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:66:2: ( ( ( rule__CompilationUnit__Group__0 ) ) )
            // InternalDart.g:67:2: ( ( rule__CompilationUnit__Group__0 ) )
            {
            // InternalDart.g:67:2: ( ( rule__CompilationUnit__Group__0 ) )
            // InternalDart.g:68:3: ( rule__CompilationUnit__Group__0 )
            {
             before(grammarAccess.getCompilationUnitAccess().getGroup()); 
            // InternalDart.g:69:3: ( rule__CompilationUnit__Group__0 )
            // InternalDart.g:69:4: rule__CompilationUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompilationUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompilationUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleScriptTag"
    // InternalDart.g:78:1: entryRuleScriptTag : ruleScriptTag EOF ;
    public final void entryRuleScriptTag() throws RecognitionException {
        try {
            // InternalDart.g:79:1: ( ruleScriptTag EOF )
            // InternalDart.g:80:1: ruleScriptTag EOF
            {
             before(grammarAccess.getScriptTagRule()); 
            pushFollow(FOLLOW_1);
            ruleScriptTag();

            state._fsp--;

             after(grammarAccess.getScriptTagRule()); 
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
    // $ANTLR end "entryRuleScriptTag"


    // $ANTLR start "ruleScriptTag"
    // InternalDart.g:87:1: ruleScriptTag : ( ( rule__ScriptTag__ContentAssignment ) ) ;
    public final void ruleScriptTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:91:2: ( ( ( rule__ScriptTag__ContentAssignment ) ) )
            // InternalDart.g:92:2: ( ( rule__ScriptTag__ContentAssignment ) )
            {
            // InternalDart.g:92:2: ( ( rule__ScriptTag__ContentAssignment ) )
            // InternalDart.g:93:3: ( rule__ScriptTag__ContentAssignment )
            {
             before(grammarAccess.getScriptTagAccess().getContentAssignment()); 
            // InternalDart.g:94:3: ( rule__ScriptTag__ContentAssignment )
            // InternalDart.g:94:4: rule__ScriptTag__ContentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ScriptTag__ContentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getScriptTagAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScriptTag"


    // $ANTLR start "entryRuleLibraryName"
    // InternalDart.g:103:1: entryRuleLibraryName : ruleLibraryName EOF ;
    public final void entryRuleLibraryName() throws RecognitionException {
        try {
            // InternalDart.g:104:1: ( ruleLibraryName EOF )
            // InternalDart.g:105:1: ruleLibraryName EOF
            {
             before(grammarAccess.getLibraryNameRule()); 
            pushFollow(FOLLOW_1);
            ruleLibraryName();

            state._fsp--;

             after(grammarAccess.getLibraryNameRule()); 
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
    // $ANTLR end "entryRuleLibraryName"


    // $ANTLR start "ruleLibraryName"
    // InternalDart.g:112:1: ruleLibraryName : ( ( rule__LibraryName__Group__0 ) ) ;
    public final void ruleLibraryName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:116:2: ( ( ( rule__LibraryName__Group__0 ) ) )
            // InternalDart.g:117:2: ( ( rule__LibraryName__Group__0 ) )
            {
            // InternalDart.g:117:2: ( ( rule__LibraryName__Group__0 ) )
            // InternalDart.g:118:3: ( rule__LibraryName__Group__0 )
            {
             before(grammarAccess.getLibraryNameAccess().getGroup()); 
            // InternalDart.g:119:3: ( rule__LibraryName__Group__0 )
            // InternalDart.g:119:4: rule__LibraryName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibraryName"


    // $ANTLR start "entryRuleDottedIdentifier"
    // InternalDart.g:128:1: entryRuleDottedIdentifier : ruleDottedIdentifier EOF ;
    public final void entryRuleDottedIdentifier() throws RecognitionException {
        try {
            // InternalDart.g:129:1: ( ruleDottedIdentifier EOF )
            // InternalDart.g:130:1: ruleDottedIdentifier EOF
            {
             before(grammarAccess.getDottedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleDottedIdentifier();

            state._fsp--;

             after(grammarAccess.getDottedIdentifierRule()); 
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
    // $ANTLR end "entryRuleDottedIdentifier"


    // $ANTLR start "ruleDottedIdentifier"
    // InternalDart.g:137:1: ruleDottedIdentifier : ( ( rule__DottedIdentifier__Group__0 ) ) ;
    public final void ruleDottedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:141:2: ( ( ( rule__DottedIdentifier__Group__0 ) ) )
            // InternalDart.g:142:2: ( ( rule__DottedIdentifier__Group__0 ) )
            {
            // InternalDart.g:142:2: ( ( rule__DottedIdentifier__Group__0 ) )
            // InternalDart.g:143:3: ( rule__DottedIdentifier__Group__0 )
            {
             before(grammarAccess.getDottedIdentifierAccess().getGroup()); 
            // InternalDart.g:144:3: ( rule__DottedIdentifier__Group__0 )
            // InternalDart.g:144:4: rule__DottedIdentifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DottedIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDottedIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDottedIdentifier"


    // $ANTLR start "entryRuleImportOrExport"
    // InternalDart.g:153:1: entryRuleImportOrExport : ruleImportOrExport EOF ;
    public final void entryRuleImportOrExport() throws RecognitionException {
        try {
            // InternalDart.g:154:1: ( ruleImportOrExport EOF )
            // InternalDart.g:155:1: ruleImportOrExport EOF
            {
             before(grammarAccess.getImportOrExportRule()); 
            pushFollow(FOLLOW_1);
            ruleImportOrExport();

            state._fsp--;

             after(grammarAccess.getImportOrExportRule()); 
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
    // $ANTLR end "entryRuleImportOrExport"


    // $ANTLR start "ruleImportOrExport"
    // InternalDart.g:162:1: ruleImportOrExport : ( ( rule__ImportOrExport__Alternatives ) ) ;
    public final void ruleImportOrExport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:166:2: ( ( ( rule__ImportOrExport__Alternatives ) ) )
            // InternalDart.g:167:2: ( ( rule__ImportOrExport__Alternatives ) )
            {
            // InternalDart.g:167:2: ( ( rule__ImportOrExport__Alternatives ) )
            // InternalDart.g:168:3: ( rule__ImportOrExport__Alternatives )
            {
             before(grammarAccess.getImportOrExportAccess().getAlternatives()); 
            // InternalDart.g:169:3: ( rule__ImportOrExport__Alternatives )
            // InternalDart.g:169:4: rule__ImportOrExport__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ImportOrExport__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportOrExportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportOrExport"


    // $ANTLR start "entryRuleLibraryImport"
    // InternalDart.g:178:1: entryRuleLibraryImport : ruleLibraryImport EOF ;
    public final void entryRuleLibraryImport() throws RecognitionException {
        try {
            // InternalDart.g:179:1: ( ruleLibraryImport EOF )
            // InternalDart.g:180:1: ruleLibraryImport EOF
            {
             before(grammarAccess.getLibraryImportRule()); 
            pushFollow(FOLLOW_1);
            ruleLibraryImport();

            state._fsp--;

             after(grammarAccess.getLibraryImportRule()); 
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
    // $ANTLR end "entryRuleLibraryImport"


    // $ANTLR start "ruleLibraryImport"
    // InternalDart.g:187:1: ruleLibraryImport : ( ( rule__LibraryImport__Group__0 ) ) ;
    public final void ruleLibraryImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:191:2: ( ( ( rule__LibraryImport__Group__0 ) ) )
            // InternalDart.g:192:2: ( ( rule__LibraryImport__Group__0 ) )
            {
            // InternalDart.g:192:2: ( ( rule__LibraryImport__Group__0 ) )
            // InternalDart.g:193:3: ( rule__LibraryImport__Group__0 )
            {
             before(grammarAccess.getLibraryImportAccess().getGroup()); 
            // InternalDart.g:194:3: ( rule__LibraryImport__Group__0 )
            // InternalDart.g:194:4: rule__LibraryImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibraryImport"


    // $ANTLR start "entryRuleLibraryExport"
    // InternalDart.g:203:1: entryRuleLibraryExport : ruleLibraryExport EOF ;
    public final void entryRuleLibraryExport() throws RecognitionException {
        try {
            // InternalDart.g:204:1: ( ruleLibraryExport EOF )
            // InternalDart.g:205:1: ruleLibraryExport EOF
            {
             before(grammarAccess.getLibraryExportRule()); 
            pushFollow(FOLLOW_1);
            ruleLibraryExport();

            state._fsp--;

             after(grammarAccess.getLibraryExportRule()); 
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
    // $ANTLR end "entryRuleLibraryExport"


    // $ANTLR start "ruleLibraryExport"
    // InternalDart.g:212:1: ruleLibraryExport : ( ( rule__LibraryExport__Group__0 ) ) ;
    public final void ruleLibraryExport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:216:2: ( ( ( rule__LibraryExport__Group__0 ) ) )
            // InternalDart.g:217:2: ( ( rule__LibraryExport__Group__0 ) )
            {
            // InternalDart.g:217:2: ( ( rule__LibraryExport__Group__0 ) )
            // InternalDart.g:218:3: ( rule__LibraryExport__Group__0 )
            {
             before(grammarAccess.getLibraryExportAccess().getGroup()); 
            // InternalDart.g:219:3: ( rule__LibraryExport__Group__0 )
            // InternalDart.g:219:4: rule__LibraryExport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryExport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryExportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibraryExport"


    // $ANTLR start "entryRulePartDirective"
    // InternalDart.g:228:1: entryRulePartDirective : rulePartDirective EOF ;
    public final void entryRulePartDirective() throws RecognitionException {
        try {
            // InternalDart.g:229:1: ( rulePartDirective EOF )
            // InternalDart.g:230:1: rulePartDirective EOF
            {
             before(grammarAccess.getPartDirectiveRule()); 
            pushFollow(FOLLOW_1);
            rulePartDirective();

            state._fsp--;

             after(grammarAccess.getPartDirectiveRule()); 
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
    // $ANTLR end "entryRulePartDirective"


    // $ANTLR start "rulePartDirective"
    // InternalDart.g:237:1: rulePartDirective : ( ( rule__PartDirective__Group__0 ) ) ;
    public final void rulePartDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:241:2: ( ( ( rule__PartDirective__Group__0 ) ) )
            // InternalDart.g:242:2: ( ( rule__PartDirective__Group__0 ) )
            {
            // InternalDart.g:242:2: ( ( rule__PartDirective__Group__0 ) )
            // InternalDart.g:243:3: ( rule__PartDirective__Group__0 )
            {
             before(grammarAccess.getPartDirectiveAccess().getGroup()); 
            // InternalDart.g:244:3: ( rule__PartDirective__Group__0 )
            // InternalDart.g:244:4: rule__PartDirective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartDirective"


    // $ANTLR start "entryRuleTopLevelDeclaration"
    // InternalDart.g:253:1: entryRuleTopLevelDeclaration : ruleTopLevelDeclaration EOF ;
    public final void entryRuleTopLevelDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:254:1: ( ruleTopLevelDeclaration EOF )
            // InternalDart.g:255:1: ruleTopLevelDeclaration EOF
            {
             before(grammarAccess.getTopLevelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTopLevelDeclaration();

            state._fsp--;

             after(grammarAccess.getTopLevelDeclarationRule()); 
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
    // $ANTLR end "entryRuleTopLevelDeclaration"


    // $ANTLR start "ruleTopLevelDeclaration"
    // InternalDart.g:262:1: ruleTopLevelDeclaration : ( ( rule__TopLevelDeclaration__Alternatives ) ) ;
    public final void ruleTopLevelDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:266:2: ( ( ( rule__TopLevelDeclaration__Alternatives ) ) )
            // InternalDart.g:267:2: ( ( rule__TopLevelDeclaration__Alternatives ) )
            {
            // InternalDart.g:267:2: ( ( rule__TopLevelDeclaration__Alternatives ) )
            // InternalDart.g:268:3: ( rule__TopLevelDeclaration__Alternatives )
            {
             before(grammarAccess.getTopLevelDeclarationAccess().getAlternatives()); 
            // InternalDart.g:269:3: ( rule__TopLevelDeclaration__Alternatives )
            // InternalDart.g:269:4: rule__TopLevelDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevelDeclaration"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalDart.g:278:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:279:1: ( ruleClassDeclaration EOF )
            // InternalDart.g:280:1: ruleClassDeclaration EOF
            {
             before(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationRule()); 
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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalDart.g:287:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:291:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalDart.g:292:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalDart.g:292:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalDart.g:293:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalDart.g:294:3: ( rule__ClassDeclaration__Group__0 )
            // InternalDart.g:294:4: rule__ClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleMixinDeclaration"
    // InternalDart.g:303:1: entryRuleMixinDeclaration : ruleMixinDeclaration EOF ;
    public final void entryRuleMixinDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:304:1: ( ruleMixinDeclaration EOF )
            // InternalDart.g:305:1: ruleMixinDeclaration EOF
            {
             before(grammarAccess.getMixinDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleMixinDeclaration();

            state._fsp--;

             after(grammarAccess.getMixinDeclarationRule()); 
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
    // $ANTLR end "entryRuleMixinDeclaration"


    // $ANTLR start "ruleMixinDeclaration"
    // InternalDart.g:312:1: ruleMixinDeclaration : ( ( rule__MixinDeclaration__Group__0 ) ) ;
    public final void ruleMixinDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:316:2: ( ( ( rule__MixinDeclaration__Group__0 ) ) )
            // InternalDart.g:317:2: ( ( rule__MixinDeclaration__Group__0 ) )
            {
            // InternalDart.g:317:2: ( ( rule__MixinDeclaration__Group__0 ) )
            // InternalDart.g:318:3: ( rule__MixinDeclaration__Group__0 )
            {
             before(grammarAccess.getMixinDeclarationAccess().getGroup()); 
            // InternalDart.g:319:3: ( rule__MixinDeclaration__Group__0 )
            // InternalDart.g:319:4: rule__MixinDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MixinDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixinDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixinDeclaration"


    // $ANTLR start "entryRuleExtensionDeclaration"
    // InternalDart.g:328:1: entryRuleExtensionDeclaration : ruleExtensionDeclaration EOF ;
    public final void entryRuleExtensionDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:329:1: ( ruleExtensionDeclaration EOF )
            // InternalDart.g:330:1: ruleExtensionDeclaration EOF
            {
             before(grammarAccess.getExtensionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleExtensionDeclaration();

            state._fsp--;

             after(grammarAccess.getExtensionDeclarationRule()); 
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
    // $ANTLR end "entryRuleExtensionDeclaration"


    // $ANTLR start "ruleExtensionDeclaration"
    // InternalDart.g:337:1: ruleExtensionDeclaration : ( ( rule__ExtensionDeclaration__Group__0 ) ) ;
    public final void ruleExtensionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:341:2: ( ( ( rule__ExtensionDeclaration__Group__0 ) ) )
            // InternalDart.g:342:2: ( ( rule__ExtensionDeclaration__Group__0 ) )
            {
            // InternalDart.g:342:2: ( ( rule__ExtensionDeclaration__Group__0 ) )
            // InternalDart.g:343:3: ( rule__ExtensionDeclaration__Group__0 )
            {
             before(grammarAccess.getExtensionDeclarationAccess().getGroup()); 
            // InternalDart.g:344:3: ( rule__ExtensionDeclaration__Group__0 )
            // InternalDart.g:344:4: rule__ExtensionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionDeclaration"


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalDart.g:353:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:354:1: ( ruleEnumDeclaration EOF )
            // InternalDart.g:355:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalDart.g:362:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:366:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // InternalDart.g:367:2: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // InternalDart.g:367:2: ( ( rule__EnumDeclaration__Group__0 ) )
            // InternalDart.g:368:3: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // InternalDart.g:369:3: ( rule__EnumDeclaration__Group__0 )
            // InternalDart.g:369:4: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleTypeAlias"
    // InternalDart.g:378:1: entryRuleTypeAlias : ruleTypeAlias EOF ;
    public final void entryRuleTypeAlias() throws RecognitionException {
        try {
            // InternalDart.g:379:1: ( ruleTypeAlias EOF )
            // InternalDart.g:380:1: ruleTypeAlias EOF
            {
             before(grammarAccess.getTypeAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeAlias();

            state._fsp--;

             after(grammarAccess.getTypeAliasRule()); 
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
    // $ANTLR end "entryRuleTypeAlias"


    // $ANTLR start "ruleTypeAlias"
    // InternalDart.g:387:1: ruleTypeAlias : ( ( rule__TypeAlias__Group__0 ) ) ;
    public final void ruleTypeAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:391:2: ( ( ( rule__TypeAlias__Group__0 ) ) )
            // InternalDart.g:392:2: ( ( rule__TypeAlias__Group__0 ) )
            {
            // InternalDart.g:392:2: ( ( rule__TypeAlias__Group__0 ) )
            // InternalDart.g:393:3: ( rule__TypeAlias__Group__0 )
            {
             before(grammarAccess.getTypeAliasAccess().getGroup()); 
            // InternalDart.g:394:3: ( rule__TypeAlias__Group__0 )
            // InternalDart.g:394:4: rule__TypeAlias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeAlias"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalDart.g:403:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:404:1: ( ruleFunctionDeclaration EOF )
            // InternalDart.g:405:1: ruleFunctionDeclaration EOF
            {
             before(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationRule()); 
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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalDart.g:412:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:416:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // InternalDart.g:417:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // InternalDart.g:417:2: ( ( rule__FunctionDeclaration__Group__0 ) )
            // InternalDart.g:418:3: ( rule__FunctionDeclaration__Group__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            // InternalDart.g:419:3: ( rule__FunctionDeclaration__Group__0 )
            // InternalDart.g:419:4: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionBody"
    // InternalDart.g:428:1: entryRuleFunctionBody : ruleFunctionBody EOF ;
    public final void entryRuleFunctionBody() throws RecognitionException {
        try {
            // InternalDart.g:429:1: ( ruleFunctionBody EOF )
            // InternalDart.g:430:1: ruleFunctionBody EOF
            {
             before(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionBodyRule()); 
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
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalDart.g:437:1: ruleFunctionBody : ( ( rule__FunctionBody__Group__0 ) ) ;
    public final void ruleFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:441:2: ( ( ( rule__FunctionBody__Group__0 ) ) )
            // InternalDart.g:442:2: ( ( rule__FunctionBody__Group__0 ) )
            {
            // InternalDart.g:442:2: ( ( rule__FunctionBody__Group__0 ) )
            // InternalDart.g:443:3: ( rule__FunctionBody__Group__0 )
            {
             before(grammarAccess.getFunctionBodyAccess().getGroup()); 
            // InternalDart.g:444:3: ( rule__FunctionBody__Group__0 )
            // InternalDart.g:444:4: rule__FunctionBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalDart.g:453:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:454:1: ( ruleVariableDeclaration EOF )
            // InternalDart.g:455:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalDart.g:462:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:466:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalDart.g:467:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalDart.g:467:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalDart.g:468:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalDart.g:469:3: ( rule__VariableDeclaration__Group__0 )
            // InternalDart.g:469:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableSingleDeclaration"
    // InternalDart.g:478:1: entryRuleVariableSingleDeclaration : ruleVariableSingleDeclaration EOF ;
    public final void entryRuleVariableSingleDeclaration() throws RecognitionException {
        try {
            // InternalDart.g:479:1: ( ruleVariableSingleDeclaration EOF )
            // InternalDart.g:480:1: ruleVariableSingleDeclaration EOF
            {
             before(grammarAccess.getVariableSingleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableSingleDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableSingleDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableSingleDeclaration"


    // $ANTLR start "ruleVariableSingleDeclaration"
    // InternalDart.g:487:1: ruleVariableSingleDeclaration : ( ( rule__VariableSingleDeclaration__Group__0 ) ) ;
    public final void ruleVariableSingleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:491:2: ( ( ( rule__VariableSingleDeclaration__Group__0 ) ) )
            // InternalDart.g:492:2: ( ( rule__VariableSingleDeclaration__Group__0 ) )
            {
            // InternalDart.g:492:2: ( ( rule__VariableSingleDeclaration__Group__0 ) )
            // InternalDart.g:493:3: ( rule__VariableSingleDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableSingleDeclarationAccess().getGroup()); 
            // InternalDart.g:494:3: ( rule__VariableSingleDeclaration__Group__0 )
            // InternalDart.g:494:4: rule__VariableSingleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableSingleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableSingleDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableSingleDeclaration"


    // $ANTLR start "entryRuleVariableModifier"
    // InternalDart.g:503:1: entryRuleVariableModifier : ruleVariableModifier EOF ;
    public final void entryRuleVariableModifier() throws RecognitionException {
        try {
            // InternalDart.g:504:1: ( ruleVariableModifier EOF )
            // InternalDart.g:505:1: ruleVariableModifier EOF
            {
             before(grammarAccess.getVariableModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableModifier();

            state._fsp--;

             after(grammarAccess.getVariableModifierRule()); 
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
    // $ANTLR end "entryRuleVariableModifier"


    // $ANTLR start "ruleVariableModifier"
    // InternalDart.g:512:1: ruleVariableModifier : ( ( rule__VariableModifier__Alternatives ) ) ;
    public final void ruleVariableModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:516:2: ( ( ( rule__VariableModifier__Alternatives ) ) )
            // InternalDart.g:517:2: ( ( rule__VariableModifier__Alternatives ) )
            {
            // InternalDart.g:517:2: ( ( rule__VariableModifier__Alternatives ) )
            // InternalDart.g:518:3: ( rule__VariableModifier__Alternatives )
            {
             before(grammarAccess.getVariableModifierAccess().getAlternatives()); 
            // InternalDart.g:519:3: ( rule__VariableModifier__Alternatives )
            // InternalDart.g:519:4: rule__VariableModifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableModifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableModifier"


    // $ANTLR start "entryRuleMetadata"
    // InternalDart.g:528:1: entryRuleMetadata : ruleMetadata EOF ;
    public final void entryRuleMetadata() throws RecognitionException {
        try {
            // InternalDart.g:529:1: ( ruleMetadata EOF )
            // InternalDart.g:530:1: ruleMetadata EOF
            {
             before(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getMetadataRule()); 
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
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalDart.g:537:1: ruleMetadata : ( ( rule__Metadata__Group__0 ) ) ;
    public final void ruleMetadata() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:541:2: ( ( ( rule__Metadata__Group__0 ) ) )
            // InternalDart.g:542:2: ( ( rule__Metadata__Group__0 ) )
            {
            // InternalDart.g:542:2: ( ( rule__Metadata__Group__0 ) )
            // InternalDart.g:543:3: ( rule__Metadata__Group__0 )
            {
             before(grammarAccess.getMetadataAccess().getGroup()); 
            // InternalDart.g:544:3: ( rule__Metadata__Group__0 )
            // InternalDart.g:544:4: rule__Metadata__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleExpression"
    // InternalDart.g:553:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDart.g:554:1: ( ruleExpression EOF )
            // InternalDart.g:555:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDart.g:562:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:566:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalDart.g:567:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalDart.g:567:2: ( ( rule__Expression__Alternatives ) )
            // InternalDart.g:568:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalDart.g:569:3: ( rule__Expression__Alternatives )
            // InternalDart.g:569:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleType"
    // InternalDart.g:578:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDart.g:579:1: ( ruleType EOF )
            // InternalDart.g:580:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDart.g:587:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:591:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalDart.g:592:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalDart.g:592:2: ( ( rule__Type__Group__0 ) )
            // InternalDart.g:593:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalDart.g:594:3: ( rule__Type__Group__0 )
            // InternalDart.g:594:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeName"
    // InternalDart.g:603:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // InternalDart.g:604:1: ( ruleTypeName EOF )
            // InternalDart.g:605:1: ruleTypeName EOF
            {
             before(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getTypeNameRule()); 
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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalDart.g:612:1: ruleTypeName : ( ( rule__TypeName__Group__0 ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:616:2: ( ( ( rule__TypeName__Group__0 ) ) )
            // InternalDart.g:617:2: ( ( rule__TypeName__Group__0 ) )
            {
            // InternalDart.g:617:2: ( ( rule__TypeName__Group__0 ) )
            // InternalDart.g:618:3: ( rule__TypeName__Group__0 )
            {
             before(grammarAccess.getTypeNameAccess().getGroup()); 
            // InternalDart.g:619:3: ( rule__TypeName__Group__0 )
            // InternalDart.g:619:4: rule__TypeName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeArguments"
    // InternalDart.g:628:1: entryRuleTypeArguments : ruleTypeArguments EOF ;
    public final void entryRuleTypeArguments() throws RecognitionException {
        try {
            // InternalDart.g:629:1: ( ruleTypeArguments EOF )
            // InternalDart.g:630:1: ruleTypeArguments EOF
            {
             before(grammarAccess.getTypeArgumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeArguments();

            state._fsp--;

             after(grammarAccess.getTypeArgumentsRule()); 
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
    // $ANTLR end "entryRuleTypeArguments"


    // $ANTLR start "ruleTypeArguments"
    // InternalDart.g:637:1: ruleTypeArguments : ( ( rule__TypeArguments__Group__0 ) ) ;
    public final void ruleTypeArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:641:2: ( ( ( rule__TypeArguments__Group__0 ) ) )
            // InternalDart.g:642:2: ( ( rule__TypeArguments__Group__0 ) )
            {
            // InternalDart.g:642:2: ( ( rule__TypeArguments__Group__0 ) )
            // InternalDart.g:643:3: ( rule__TypeArguments__Group__0 )
            {
             before(grammarAccess.getTypeArgumentsAccess().getGroup()); 
            // InternalDart.g:644:3: ( rule__TypeArguments__Group__0 )
            // InternalDart.g:644:4: rule__TypeArguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeArguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeArgumentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeArguments"


    // $ANTLR start "rule__ImportOrExport__Alternatives"
    // InternalDart.g:652:1: rule__ImportOrExport__Alternatives : ( ( ruleLibraryImport ) | ( ruleLibraryExport ) );
    public final void rule__ImportOrExport__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:656:1: ( ( ruleLibraryImport ) | ( ruleLibraryExport ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDart.g:657:2: ( ruleLibraryImport )
                    {
                    // InternalDart.g:657:2: ( ruleLibraryImport )
                    // InternalDart.g:658:3: ruleLibraryImport
                    {
                     before(grammarAccess.getImportOrExportAccess().getLibraryImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLibraryImport();

                    state._fsp--;

                     after(grammarAccess.getImportOrExportAccess().getLibraryImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:663:2: ( ruleLibraryExport )
                    {
                    // InternalDart.g:663:2: ( ruleLibraryExport )
                    // InternalDart.g:664:3: ruleLibraryExport
                    {
                     before(grammarAccess.getImportOrExportAccess().getLibraryExportParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLibraryExport();

                    state._fsp--;

                     after(grammarAccess.getImportOrExportAccess().getLibraryExportParserRuleCall_1()); 

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
    // $ANTLR end "rule__ImportOrExport__Alternatives"


    // $ANTLR start "rule__TopLevelDeclaration__Alternatives"
    // InternalDart.g:673:1: rule__TopLevelDeclaration__Alternatives : ( ( ruleClassDeclaration ) | ( ruleMixinDeclaration ) | ( ruleExtensionDeclaration ) | ( ruleEnumDeclaration ) | ( ruleTypeAlias ) | ( ruleFunctionDeclaration ) | ( ruleVariableDeclaration ) );
    public final void rule__TopLevelDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:677:1: ( ( ruleClassDeclaration ) | ( ruleMixinDeclaration ) | ( ruleExtensionDeclaration ) | ( ruleEnumDeclaration ) | ( ruleTypeAlias ) | ( ruleFunctionDeclaration ) | ( ruleVariableDeclaration ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDart.g:678:2: ( ruleClassDeclaration )
                    {
                    // InternalDart.g:678:2: ( ruleClassDeclaration )
                    // InternalDart.g:679:3: ruleClassDeclaration
                    {
                     before(grammarAccess.getTopLevelDeclarationAccess().getClassDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTopLevelDeclarationAccess().getClassDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:684:2: ( ruleMixinDeclaration )
                    {
                    // InternalDart.g:684:2: ( ruleMixinDeclaration )
                    // InternalDart.g:685:3: ruleMixinDeclaration
                    {
                     before(grammarAccess.getTopLevelDeclarationAccess().getMixinDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMixinDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTopLevelDeclarationAccess().getMixinDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDart.g:690:2: ( ruleExtensionDeclaration )
                    {
                    // InternalDart.g:690:2: ( ruleExtensionDeclaration )
                    // InternalDart.g:691:3: ruleExtensionDeclaration
                    {
                     before(grammarAccess.getTopLevelDeclarationAccess().getExtensionDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExtensionDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTopLevelDeclarationAccess().getExtensionDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDart.g:696:2: ( ruleEnumDeclaration )
                    {
                    // InternalDart.g:696:2: ( ruleEnumDeclaration )
                    // InternalDart.g:697:3: ruleEnumDeclaration
                    {
                     before(grammarAccess.getTopLevelDeclarationAccess().getEnumDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTopLevelDeclarationAccess().getEnumDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDart.g:702:2: ( ruleTypeAlias )
                    {
                    // InternalDart.g:702:2: ( ruleTypeAlias )
                    // InternalDart.g:703:3: ruleTypeAlias
                    {
                     before(grammarAccess.getTopLevelDeclarationAccess().getTypeAliasParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeAlias();

                    state._fsp--;

                     after(grammarAccess.getTopLevelDeclarationAccess().getTypeAliasParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDart.g:708:2: ( ruleFunctionDeclaration )
                    {
                    // InternalDart.g:708:2: ( ruleFunctionDeclaration )
                    // InternalDart.g:709:3: ruleFunctionDeclaration
                    {
                     before(grammarAccess.getTopLevelDeclarationAccess().getFunctionDeclarationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTopLevelDeclarationAccess().getFunctionDeclarationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDart.g:714:2: ( ruleVariableDeclaration )
                    {
                    // InternalDart.g:714:2: ( ruleVariableDeclaration )
                    // InternalDart.g:715:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getTopLevelDeclarationAccess().getVariableDeclarationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTopLevelDeclarationAccess().getVariableDeclarationParserRuleCall_6()); 

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
    // $ANTLR end "rule__TopLevelDeclaration__Alternatives"


    // $ANTLR start "rule__FunctionDeclaration__Alternatives_6"
    // InternalDart.g:724:1: rule__FunctionDeclaration__Alternatives_6 : ( ( ( rule__FunctionDeclaration__BodyAssignment_6_0 ) ) | ( ';' ) );
    public final void rule__FunctionDeclaration__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:728:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_6_0 ) ) | ( ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDart.g:729:2: ( ( rule__FunctionDeclaration__BodyAssignment_6_0 ) )
                    {
                    // InternalDart.g:729:2: ( ( rule__FunctionDeclaration__BodyAssignment_6_0 ) )
                    // InternalDart.g:730:3: ( rule__FunctionDeclaration__BodyAssignment_6_0 )
                    {
                     before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_6_0()); 
                    // InternalDart.g:731:3: ( rule__FunctionDeclaration__BodyAssignment_6_0 )
                    // InternalDart.g:731:4: rule__FunctionDeclaration__BodyAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__BodyAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:735:2: ( ';' )
                    {
                    // InternalDart.g:735:2: ( ';' )
                    // InternalDart.g:736:3: ';'
                    {
                     before(grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_6_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_6_1()); 

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
    // $ANTLR end "rule__FunctionDeclaration__Alternatives_6"


    // $ANTLR start "rule__VariableDeclaration__Alternatives_2"
    // InternalDart.g:745:1: rule__VariableDeclaration__Alternatives_2 : ( ( ( rule__VariableDeclaration__Group_2_0__0 ) ) | ( ( rule__VariableDeclaration__TypeAssignment_2_1 ) ) );
    public final void rule__VariableDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:749:1: ( ( ( rule__VariableDeclaration__Group_2_0__0 ) ) | ( ( rule__VariableDeclaration__TypeAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDart.g:750:2: ( ( rule__VariableDeclaration__Group_2_0__0 ) )
                    {
                    // InternalDart.g:750:2: ( ( rule__VariableDeclaration__Group_2_0__0 ) )
                    // InternalDart.g:751:3: ( rule__VariableDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getGroup_2_0()); 
                    // InternalDart.g:752:3: ( rule__VariableDeclaration__Group_2_0__0 )
                    // InternalDart.g:752:4: rule__VariableDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:756:2: ( ( rule__VariableDeclaration__TypeAssignment_2_1 ) )
                    {
                    // InternalDart.g:756:2: ( ( rule__VariableDeclaration__TypeAssignment_2_1 ) )
                    // InternalDart.g:757:3: ( rule__VariableDeclaration__TypeAssignment_2_1 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_1()); 
                    // InternalDart.g:758:3: ( rule__VariableDeclaration__TypeAssignment_2_1 )
                    // InternalDart.g:758:4: rule__VariableDeclaration__TypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__TypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Alternatives_2"


    // $ANTLR start "rule__VariableModifier__Alternatives"
    // InternalDart.g:766:1: rule__VariableModifier__Alternatives : ( ( 'var' ) | ( 'final' ) | ( 'const' ) );
    public final void rule__VariableModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:770:1: ( ( 'var' ) | ( 'final' ) | ( 'const' ) )
            int alt5=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDart.g:771:2: ( 'var' )
                    {
                    // InternalDart.g:771:2: ( 'var' )
                    // InternalDart.g:772:3: 'var'
                    {
                     before(grammarAccess.getVariableModifierAccess().getVarKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVariableModifierAccess().getVarKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:777:2: ( 'final' )
                    {
                    // InternalDart.g:777:2: ( 'final' )
                    // InternalDart.g:778:3: 'final'
                    {
                     before(grammarAccess.getVariableModifierAccess().getFinalKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVariableModifierAccess().getFinalKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDart.g:783:2: ( 'const' )
                    {
                    // InternalDart.g:783:2: ( 'const' )
                    // InternalDart.g:784:3: 'const'
                    {
                     before(grammarAccess.getVariableModifierAccess().getConstKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVariableModifierAccess().getConstKeyword_2()); 

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
    // $ANTLR end "rule__VariableModifier__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalDart.g:793:1: rule__Expression__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:797:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDart.g:798:2: ( RULE_ID )
                    {
                    // InternalDart.g:798:2: ( RULE_ID )
                    // InternalDart.g:799:3: RULE_ID
                    {
                     before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDart.g:804:2: ( RULE_INT )
                    {
                    // InternalDart.g:804:2: ( RULE_INT )
                    // InternalDart.g:805:3: RULE_INT
                    {
                     before(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__CompilationUnit__Group__0"
    // InternalDart.g:814:1: rule__CompilationUnit__Group__0 : rule__CompilationUnit__Group__0__Impl rule__CompilationUnit__Group__1 ;
    public final void rule__CompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:818:1: ( rule__CompilationUnit__Group__0__Impl rule__CompilationUnit__Group__1 )
            // InternalDart.g:819:2: rule__CompilationUnit__Group__0__Impl rule__CompilationUnit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CompilationUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompilationUnit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__0"


    // $ANTLR start "rule__CompilationUnit__Group__0__Impl"
    // InternalDart.g:826:1: rule__CompilationUnit__Group__0__Impl : ( ( rule__CompilationUnit__ScriptTagAssignment_0 )? ) ;
    public final void rule__CompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:830:1: ( ( ( rule__CompilationUnit__ScriptTagAssignment_0 )? ) )
            // InternalDart.g:831:1: ( ( rule__CompilationUnit__ScriptTagAssignment_0 )? )
            {
            // InternalDart.g:831:1: ( ( rule__CompilationUnit__ScriptTagAssignment_0 )? )
            // InternalDart.g:832:2: ( rule__CompilationUnit__ScriptTagAssignment_0 )?
            {
             before(grammarAccess.getCompilationUnitAccess().getScriptTagAssignment_0()); 
            // InternalDart.g:833:2: ( rule__CompilationUnit__ScriptTagAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SCRIPT_TAG) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDart.g:833:3: rule__CompilationUnit__ScriptTagAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompilationUnit__ScriptTagAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompilationUnitAccess().getScriptTagAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__0__Impl"


    // $ANTLR start "rule__CompilationUnit__Group__1"
    // InternalDart.g:841:1: rule__CompilationUnit__Group__1 : rule__CompilationUnit__Group__1__Impl rule__CompilationUnit__Group__2 ;
    public final void rule__CompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:845:1: ( rule__CompilationUnit__Group__1__Impl rule__CompilationUnit__Group__2 )
            // InternalDart.g:846:2: rule__CompilationUnit__Group__1__Impl rule__CompilationUnit__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CompilationUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompilationUnit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__1"


    // $ANTLR start "rule__CompilationUnit__Group__1__Impl"
    // InternalDart.g:853:1: rule__CompilationUnit__Group__1__Impl : ( ( rule__CompilationUnit__LibraryNameAssignment_1 )? ) ;
    public final void rule__CompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:857:1: ( ( ( rule__CompilationUnit__LibraryNameAssignment_1 )? ) )
            // InternalDart.g:858:1: ( ( rule__CompilationUnit__LibraryNameAssignment_1 )? )
            {
            // InternalDart.g:858:1: ( ( rule__CompilationUnit__LibraryNameAssignment_1 )? )
            // InternalDart.g:859:2: ( rule__CompilationUnit__LibraryNameAssignment_1 )?
            {
             before(grammarAccess.getCompilationUnitAccess().getLibraryNameAssignment_1()); 
            // InternalDart.g:860:2: ( rule__CompilationUnit__LibraryNameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDart.g:860:3: rule__CompilationUnit__LibraryNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompilationUnit__LibraryNameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompilationUnitAccess().getLibraryNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__1__Impl"


    // $ANTLR start "rule__CompilationUnit__Group__2"
    // InternalDart.g:868:1: rule__CompilationUnit__Group__2 : rule__CompilationUnit__Group__2__Impl rule__CompilationUnit__Group__3 ;
    public final void rule__CompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:872:1: ( rule__CompilationUnit__Group__2__Impl rule__CompilationUnit__Group__3 )
            // InternalDart.g:873:2: rule__CompilationUnit__Group__2__Impl rule__CompilationUnit__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__CompilationUnit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompilationUnit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__2"


    // $ANTLR start "rule__CompilationUnit__Group__2__Impl"
    // InternalDart.g:880:1: rule__CompilationUnit__Group__2__Impl : ( ( rule__CompilationUnit__DirectivesAssignment_2 )* ) ;
    public final void rule__CompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:884:1: ( ( ( rule__CompilationUnit__DirectivesAssignment_2 )* ) )
            // InternalDart.g:885:1: ( ( rule__CompilationUnit__DirectivesAssignment_2 )* )
            {
            // InternalDart.g:885:1: ( ( rule__CompilationUnit__DirectivesAssignment_2 )* )
            // InternalDart.g:886:2: ( rule__CompilationUnit__DirectivesAssignment_2 )*
            {
             before(grammarAccess.getCompilationUnitAccess().getDirectivesAssignment_2()); 
            // InternalDart.g:887:2: ( rule__CompilationUnit__DirectivesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDart.g:887:3: rule__CompilationUnit__DirectivesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CompilationUnit__DirectivesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCompilationUnitAccess().getDirectivesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__2__Impl"


    // $ANTLR start "rule__CompilationUnit__Group__3"
    // InternalDart.g:895:1: rule__CompilationUnit__Group__3 : rule__CompilationUnit__Group__3__Impl rule__CompilationUnit__Group__4 ;
    public final void rule__CompilationUnit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:899:1: ( rule__CompilationUnit__Group__3__Impl rule__CompilationUnit__Group__4 )
            // InternalDart.g:900:2: rule__CompilationUnit__Group__3__Impl rule__CompilationUnit__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__CompilationUnit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompilationUnit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__3"


    // $ANTLR start "rule__CompilationUnit__Group__3__Impl"
    // InternalDart.g:907:1: rule__CompilationUnit__Group__3__Impl : ( ( rule__CompilationUnit__PartDirectivesAssignment_3 )* ) ;
    public final void rule__CompilationUnit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:911:1: ( ( ( rule__CompilationUnit__PartDirectivesAssignment_3 )* ) )
            // InternalDart.g:912:1: ( ( rule__CompilationUnit__PartDirectivesAssignment_3 )* )
            {
            // InternalDart.g:912:1: ( ( rule__CompilationUnit__PartDirectivesAssignment_3 )* )
            // InternalDart.g:913:2: ( rule__CompilationUnit__PartDirectivesAssignment_3 )*
            {
             before(grammarAccess.getCompilationUnitAccess().getPartDirectivesAssignment_3()); 
            // InternalDart.g:914:2: ( rule__CompilationUnit__PartDirectivesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDart.g:914:3: rule__CompilationUnit__PartDirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CompilationUnit__PartDirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompilationUnitAccess().getPartDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__3__Impl"


    // $ANTLR start "rule__CompilationUnit__Group__4"
    // InternalDart.g:922:1: rule__CompilationUnit__Group__4 : rule__CompilationUnit__Group__4__Impl ;
    public final void rule__CompilationUnit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:926:1: ( rule__CompilationUnit__Group__4__Impl )
            // InternalDart.g:927:2: rule__CompilationUnit__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompilationUnit__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__4"


    // $ANTLR start "rule__CompilationUnit__Group__4__Impl"
    // InternalDart.g:933:1: rule__CompilationUnit__Group__4__Impl : ( ( rule__CompilationUnit__DeclarationsAssignment_4 )* ) ;
    public final void rule__CompilationUnit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:937:1: ( ( ( rule__CompilationUnit__DeclarationsAssignment_4 )* ) )
            // InternalDart.g:938:1: ( ( rule__CompilationUnit__DeclarationsAssignment_4 )* )
            {
            // InternalDart.g:938:1: ( ( rule__CompilationUnit__DeclarationsAssignment_4 )* )
            // InternalDart.g:939:2: ( rule__CompilationUnit__DeclarationsAssignment_4 )*
            {
             before(grammarAccess.getCompilationUnitAccess().getDeclarationsAssignment_4()); 
            // InternalDart.g:940:2: ( rule__CompilationUnit__DeclarationsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=13 && LA11_0<=15)||LA11_0==22||(LA11_0>=25 && LA11_0<=26)||(LA11_0>=28 && LA11_0<=29)||LA11_0==34||(LA11_0>=37 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDart.g:940:3: rule__CompilationUnit__DeclarationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CompilationUnit__DeclarationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCompilationUnitAccess().getDeclarationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__Group__4__Impl"


    // $ANTLR start "rule__LibraryName__Group__0"
    // InternalDart.g:949:1: rule__LibraryName__Group__0 : rule__LibraryName__Group__0__Impl rule__LibraryName__Group__1 ;
    public final void rule__LibraryName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:953:1: ( rule__LibraryName__Group__0__Impl rule__LibraryName__Group__1 )
            // InternalDart.g:954:2: rule__LibraryName__Group__0__Impl rule__LibraryName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LibraryName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryName__Group__0"


    // $ANTLR start "rule__LibraryName__Group__0__Impl"
    // InternalDart.g:961:1: rule__LibraryName__Group__0__Impl : ( 'library' ) ;
    public final void rule__LibraryName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:965:1: ( ( 'library' ) )
            // InternalDart.g:966:1: ( 'library' )
            {
            // InternalDart.g:966:1: ( 'library' )
            // InternalDart.g:967:2: 'library'
            {
             before(grammarAccess.getLibraryNameAccess().getLibraryKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLibraryNameAccess().getLibraryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryName__Group__0__Impl"


    // $ANTLR start "rule__LibraryName__Group__1"
    // InternalDart.g:976:1: rule__LibraryName__Group__1 : rule__LibraryName__Group__1__Impl rule__LibraryName__Group__2 ;
    public final void rule__LibraryName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:980:1: ( rule__LibraryName__Group__1__Impl rule__LibraryName__Group__2 )
            // InternalDart.g:981:2: rule__LibraryName__Group__1__Impl rule__LibraryName__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LibraryName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryName__Group__1"


    // $ANTLR start "rule__LibraryName__Group__1__Impl"
    // InternalDart.g:988:1: rule__LibraryName__Group__1__Impl : ( ( rule__LibraryName__NameAssignment_1 ) ) ;
    public final void rule__LibraryName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:992:1: ( ( ( rule__LibraryName__NameAssignment_1 ) ) )
            // InternalDart.g:993:1: ( ( rule__LibraryName__NameAssignment_1 ) )
            {
            // InternalDart.g:993:1: ( ( rule__LibraryName__NameAssignment_1 ) )
            // InternalDart.g:994:2: ( rule__LibraryName__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryNameAccess().getNameAssignment_1()); 
            // InternalDart.g:995:2: ( rule__LibraryName__NameAssignment_1 )
            // InternalDart.g:995:3: rule__LibraryName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LibraryName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryName__Group__1__Impl"


    // $ANTLR start "rule__LibraryName__Group__2"
    // InternalDart.g:1003:1: rule__LibraryName__Group__2 : rule__LibraryName__Group__2__Impl ;
    public final void rule__LibraryName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1007:1: ( rule__LibraryName__Group__2__Impl )
            // InternalDart.g:1008:2: rule__LibraryName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryName__Group__2"


    // $ANTLR start "rule__LibraryName__Group__2__Impl"
    // InternalDart.g:1014:1: rule__LibraryName__Group__2__Impl : ( ';' ) ;
    public final void rule__LibraryName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1018:1: ( ( ';' ) )
            // InternalDart.g:1019:1: ( ';' )
            {
            // InternalDart.g:1019:1: ( ';' )
            // InternalDart.g:1020:2: ';'
            {
             before(grammarAccess.getLibraryNameAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLibraryNameAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryName__Group__2__Impl"


    // $ANTLR start "rule__DottedIdentifier__Group__0"
    // InternalDart.g:1030:1: rule__DottedIdentifier__Group__0 : rule__DottedIdentifier__Group__0__Impl rule__DottedIdentifier__Group__1 ;
    public final void rule__DottedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1034:1: ( rule__DottedIdentifier__Group__0__Impl rule__DottedIdentifier__Group__1 )
            // InternalDart.g:1035:2: rule__DottedIdentifier__Group__0__Impl rule__DottedIdentifier__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DottedIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DottedIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group__0"


    // $ANTLR start "rule__DottedIdentifier__Group__0__Impl"
    // InternalDart.g:1042:1: rule__DottedIdentifier__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DottedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1046:1: ( ( RULE_ID ) )
            // InternalDart.g:1047:1: ( RULE_ID )
            {
            // InternalDart.g:1047:1: ( RULE_ID )
            // InternalDart.g:1048:2: RULE_ID
            {
             before(grammarAccess.getDottedIdentifierAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDottedIdentifierAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group__0__Impl"


    // $ANTLR start "rule__DottedIdentifier__Group__1"
    // InternalDart.g:1057:1: rule__DottedIdentifier__Group__1 : rule__DottedIdentifier__Group__1__Impl ;
    public final void rule__DottedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1061:1: ( rule__DottedIdentifier__Group__1__Impl )
            // InternalDart.g:1062:2: rule__DottedIdentifier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DottedIdentifier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group__1"


    // $ANTLR start "rule__DottedIdentifier__Group__1__Impl"
    // InternalDart.g:1068:1: rule__DottedIdentifier__Group__1__Impl : ( ( rule__DottedIdentifier__Group_1__0 )* ) ;
    public final void rule__DottedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1072:1: ( ( ( rule__DottedIdentifier__Group_1__0 )* ) )
            // InternalDart.g:1073:1: ( ( rule__DottedIdentifier__Group_1__0 )* )
            {
            // InternalDart.g:1073:1: ( ( rule__DottedIdentifier__Group_1__0 )* )
            // InternalDart.g:1074:2: ( rule__DottedIdentifier__Group_1__0 )*
            {
             before(grammarAccess.getDottedIdentifierAccess().getGroup_1()); 
            // InternalDart.g:1075:2: ( rule__DottedIdentifier__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDart.g:1075:3: rule__DottedIdentifier__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DottedIdentifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDottedIdentifierAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group__1__Impl"


    // $ANTLR start "rule__DottedIdentifier__Group_1__0"
    // InternalDart.g:1084:1: rule__DottedIdentifier__Group_1__0 : rule__DottedIdentifier__Group_1__0__Impl rule__DottedIdentifier__Group_1__1 ;
    public final void rule__DottedIdentifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1088:1: ( rule__DottedIdentifier__Group_1__0__Impl rule__DottedIdentifier__Group_1__1 )
            // InternalDart.g:1089:2: rule__DottedIdentifier__Group_1__0__Impl rule__DottedIdentifier__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__DottedIdentifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DottedIdentifier__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group_1__0"


    // $ANTLR start "rule__DottedIdentifier__Group_1__0__Impl"
    // InternalDart.g:1096:1: rule__DottedIdentifier__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DottedIdentifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1100:1: ( ( '.' ) )
            // InternalDart.g:1101:1: ( '.' )
            {
            // InternalDart.g:1101:1: ( '.' )
            // InternalDart.g:1102:2: '.'
            {
             before(grammarAccess.getDottedIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDottedIdentifierAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group_1__0__Impl"


    // $ANTLR start "rule__DottedIdentifier__Group_1__1"
    // InternalDart.g:1111:1: rule__DottedIdentifier__Group_1__1 : rule__DottedIdentifier__Group_1__1__Impl ;
    public final void rule__DottedIdentifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1115:1: ( rule__DottedIdentifier__Group_1__1__Impl )
            // InternalDart.g:1116:2: rule__DottedIdentifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DottedIdentifier__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group_1__1"


    // $ANTLR start "rule__DottedIdentifier__Group_1__1__Impl"
    // InternalDart.g:1122:1: rule__DottedIdentifier__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__DottedIdentifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1126:1: ( ( RULE_ID ) )
            // InternalDart.g:1127:1: ( RULE_ID )
            {
            // InternalDart.g:1127:1: ( RULE_ID )
            // InternalDart.g:1128:2: RULE_ID
            {
             before(grammarAccess.getDottedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDottedIdentifierAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedIdentifier__Group_1__1__Impl"


    // $ANTLR start "rule__LibraryImport__Group__0"
    // InternalDart.g:1138:1: rule__LibraryImport__Group__0 : rule__LibraryImport__Group__0__Impl rule__LibraryImport__Group__1 ;
    public final void rule__LibraryImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1142:1: ( rule__LibraryImport__Group__0__Impl rule__LibraryImport__Group__1 )
            // InternalDart.g:1143:2: rule__LibraryImport__Group__0__Impl rule__LibraryImport__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__LibraryImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__0"


    // $ANTLR start "rule__LibraryImport__Group__0__Impl"
    // InternalDart.g:1150:1: rule__LibraryImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__LibraryImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1154:1: ( ( 'import' ) )
            // InternalDart.g:1155:1: ( 'import' )
            {
            // InternalDart.g:1155:1: ( 'import' )
            // InternalDart.g:1156:2: 'import'
            {
             before(grammarAccess.getLibraryImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLibraryImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__0__Impl"


    // $ANTLR start "rule__LibraryImport__Group__1"
    // InternalDart.g:1165:1: rule__LibraryImport__Group__1 : rule__LibraryImport__Group__1__Impl rule__LibraryImport__Group__2 ;
    public final void rule__LibraryImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1169:1: ( rule__LibraryImport__Group__1__Impl rule__LibraryImport__Group__2 )
            // InternalDart.g:1170:2: rule__LibraryImport__Group__1__Impl rule__LibraryImport__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__LibraryImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__1"


    // $ANTLR start "rule__LibraryImport__Group__1__Impl"
    // InternalDart.g:1177:1: rule__LibraryImport__Group__1__Impl : ( ( rule__LibraryImport__ImportURIAssignment_1 ) ) ;
    public final void rule__LibraryImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1181:1: ( ( ( rule__LibraryImport__ImportURIAssignment_1 ) ) )
            // InternalDart.g:1182:1: ( ( rule__LibraryImport__ImportURIAssignment_1 ) )
            {
            // InternalDart.g:1182:1: ( ( rule__LibraryImport__ImportURIAssignment_1 ) )
            // InternalDart.g:1183:2: ( rule__LibraryImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getLibraryImportAccess().getImportURIAssignment_1()); 
            // InternalDart.g:1184:2: ( rule__LibraryImport__ImportURIAssignment_1 )
            // InternalDart.g:1184:3: rule__LibraryImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LibraryImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__1__Impl"


    // $ANTLR start "rule__LibraryImport__Group__2"
    // InternalDart.g:1192:1: rule__LibraryImport__Group__2 : rule__LibraryImport__Group__2__Impl rule__LibraryImport__Group__3 ;
    public final void rule__LibraryImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1196:1: ( rule__LibraryImport__Group__2__Impl rule__LibraryImport__Group__3 )
            // InternalDart.g:1197:2: rule__LibraryImport__Group__2__Impl rule__LibraryImport__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__LibraryImport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryImport__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__2"


    // $ANTLR start "rule__LibraryImport__Group__2__Impl"
    // InternalDart.g:1204:1: rule__LibraryImport__Group__2__Impl : ( ( rule__LibraryImport__Group_2__0 )? ) ;
    public final void rule__LibraryImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1208:1: ( ( ( rule__LibraryImport__Group_2__0 )? ) )
            // InternalDart.g:1209:1: ( ( rule__LibraryImport__Group_2__0 )? )
            {
            // InternalDart.g:1209:1: ( ( rule__LibraryImport__Group_2__0 )? )
            // InternalDart.g:1210:2: ( rule__LibraryImport__Group_2__0 )?
            {
             before(grammarAccess.getLibraryImportAccess().getGroup_2()); 
            // InternalDart.g:1211:2: ( rule__LibraryImport__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDart.g:1211:3: rule__LibraryImport__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LibraryImport__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryImportAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__2__Impl"


    // $ANTLR start "rule__LibraryImport__Group__3"
    // InternalDart.g:1219:1: rule__LibraryImport__Group__3 : rule__LibraryImport__Group__3__Impl ;
    public final void rule__LibraryImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1223:1: ( rule__LibraryImport__Group__3__Impl )
            // InternalDart.g:1224:2: rule__LibraryImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryImport__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__3"


    // $ANTLR start "rule__LibraryImport__Group__3__Impl"
    // InternalDart.g:1230:1: rule__LibraryImport__Group__3__Impl : ( ';' ) ;
    public final void rule__LibraryImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1234:1: ( ( ';' ) )
            // InternalDart.g:1235:1: ( ';' )
            {
            // InternalDart.g:1235:1: ( ';' )
            // InternalDart.g:1236:2: ';'
            {
             before(grammarAccess.getLibraryImportAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLibraryImportAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group__3__Impl"


    // $ANTLR start "rule__LibraryImport__Group_2__0"
    // InternalDart.g:1246:1: rule__LibraryImport__Group_2__0 : rule__LibraryImport__Group_2__0__Impl rule__LibraryImport__Group_2__1 ;
    public final void rule__LibraryImport__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1250:1: ( rule__LibraryImport__Group_2__0__Impl rule__LibraryImport__Group_2__1 )
            // InternalDart.g:1251:2: rule__LibraryImport__Group_2__0__Impl rule__LibraryImport__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__LibraryImport__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryImport__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group_2__0"


    // $ANTLR start "rule__LibraryImport__Group_2__0__Impl"
    // InternalDart.g:1258:1: rule__LibraryImport__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__LibraryImport__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1262:1: ( ( 'as' ) )
            // InternalDart.g:1263:1: ( 'as' )
            {
            // InternalDart.g:1263:1: ( 'as' )
            // InternalDart.g:1264:2: 'as'
            {
             before(grammarAccess.getLibraryImportAccess().getAsKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLibraryImportAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group_2__0__Impl"


    // $ANTLR start "rule__LibraryImport__Group_2__1"
    // InternalDart.g:1273:1: rule__LibraryImport__Group_2__1 : rule__LibraryImport__Group_2__1__Impl ;
    public final void rule__LibraryImport__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1277:1: ( rule__LibraryImport__Group_2__1__Impl )
            // InternalDart.g:1278:2: rule__LibraryImport__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryImport__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group_2__1"


    // $ANTLR start "rule__LibraryImport__Group_2__1__Impl"
    // InternalDart.g:1284:1: rule__LibraryImport__Group_2__1__Impl : ( ( rule__LibraryImport__AliasAssignment_2_1 ) ) ;
    public final void rule__LibraryImport__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1288:1: ( ( ( rule__LibraryImport__AliasAssignment_2_1 ) ) )
            // InternalDart.g:1289:1: ( ( rule__LibraryImport__AliasAssignment_2_1 ) )
            {
            // InternalDart.g:1289:1: ( ( rule__LibraryImport__AliasAssignment_2_1 ) )
            // InternalDart.g:1290:2: ( rule__LibraryImport__AliasAssignment_2_1 )
            {
             before(grammarAccess.getLibraryImportAccess().getAliasAssignment_2_1()); 
            // InternalDart.g:1291:2: ( rule__LibraryImport__AliasAssignment_2_1 )
            // InternalDart.g:1291:3: rule__LibraryImport__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LibraryImport__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryImportAccess().getAliasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__Group_2__1__Impl"


    // $ANTLR start "rule__LibraryExport__Group__0"
    // InternalDart.g:1300:1: rule__LibraryExport__Group__0 : rule__LibraryExport__Group__0__Impl rule__LibraryExport__Group__1 ;
    public final void rule__LibraryExport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1304:1: ( rule__LibraryExport__Group__0__Impl rule__LibraryExport__Group__1 )
            // InternalDart.g:1305:2: rule__LibraryExport__Group__0__Impl rule__LibraryExport__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__LibraryExport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryExport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryExport__Group__0"


    // $ANTLR start "rule__LibraryExport__Group__0__Impl"
    // InternalDart.g:1312:1: rule__LibraryExport__Group__0__Impl : ( 'export' ) ;
    public final void rule__LibraryExport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1316:1: ( ( 'export' ) )
            // InternalDart.g:1317:1: ( 'export' )
            {
            // InternalDart.g:1317:1: ( 'export' )
            // InternalDart.g:1318:2: 'export'
            {
             before(grammarAccess.getLibraryExportAccess().getExportKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLibraryExportAccess().getExportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryExport__Group__0__Impl"


    // $ANTLR start "rule__LibraryExport__Group__1"
    // InternalDart.g:1327:1: rule__LibraryExport__Group__1 : rule__LibraryExport__Group__1__Impl rule__LibraryExport__Group__2 ;
    public final void rule__LibraryExport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1331:1: ( rule__LibraryExport__Group__1__Impl rule__LibraryExport__Group__2 )
            // InternalDart.g:1332:2: rule__LibraryExport__Group__1__Impl rule__LibraryExport__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LibraryExport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryExport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryExport__Group__1"


    // $ANTLR start "rule__LibraryExport__Group__1__Impl"
    // InternalDart.g:1339:1: rule__LibraryExport__Group__1__Impl : ( ( rule__LibraryExport__ExportURIAssignment_1 ) ) ;
    public final void rule__LibraryExport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1343:1: ( ( ( rule__LibraryExport__ExportURIAssignment_1 ) ) )
            // InternalDart.g:1344:1: ( ( rule__LibraryExport__ExportURIAssignment_1 ) )
            {
            // InternalDart.g:1344:1: ( ( rule__LibraryExport__ExportURIAssignment_1 ) )
            // InternalDart.g:1345:2: ( rule__LibraryExport__ExportURIAssignment_1 )
            {
             before(grammarAccess.getLibraryExportAccess().getExportURIAssignment_1()); 
            // InternalDart.g:1346:2: ( rule__LibraryExport__ExportURIAssignment_1 )
            // InternalDart.g:1346:3: rule__LibraryExport__ExportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LibraryExport__ExportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryExportAccess().getExportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryExport__Group__1__Impl"


    // $ANTLR start "rule__LibraryExport__Group__2"
    // InternalDart.g:1354:1: rule__LibraryExport__Group__2 : rule__LibraryExport__Group__2__Impl ;
    public final void rule__LibraryExport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1358:1: ( rule__LibraryExport__Group__2__Impl )
            // InternalDart.g:1359:2: rule__LibraryExport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryExport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryExport__Group__2"


    // $ANTLR start "rule__LibraryExport__Group__2__Impl"
    // InternalDart.g:1365:1: rule__LibraryExport__Group__2__Impl : ( ';' ) ;
    public final void rule__LibraryExport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1369:1: ( ( ';' ) )
            // InternalDart.g:1370:1: ( ';' )
            {
            // InternalDart.g:1370:1: ( ';' )
            // InternalDart.g:1371:2: ';'
            {
             before(grammarAccess.getLibraryExportAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLibraryExportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryExport__Group__2__Impl"


    // $ANTLR start "rule__PartDirective__Group__0"
    // InternalDart.g:1381:1: rule__PartDirective__Group__0 : rule__PartDirective__Group__0__Impl rule__PartDirective__Group__1 ;
    public final void rule__PartDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1385:1: ( rule__PartDirective__Group__0__Impl rule__PartDirective__Group__1 )
            // InternalDart.g:1386:2: rule__PartDirective__Group__0__Impl rule__PartDirective__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PartDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDirective__Group__0"


    // $ANTLR start "rule__PartDirective__Group__0__Impl"
    // InternalDart.g:1393:1: rule__PartDirective__Group__0__Impl : ( 'part' ) ;
    public final void rule__PartDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1397:1: ( ( 'part' ) )
            // InternalDart.g:1398:1: ( 'part' )
            {
            // InternalDart.g:1398:1: ( 'part' )
            // InternalDart.g:1399:2: 'part'
            {
             before(grammarAccess.getPartDirectiveAccess().getPartKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPartDirectiveAccess().getPartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDirective__Group__0__Impl"


    // $ANTLR start "rule__PartDirective__Group__1"
    // InternalDart.g:1408:1: rule__PartDirective__Group__1 : rule__PartDirective__Group__1__Impl rule__PartDirective__Group__2 ;
    public final void rule__PartDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1412:1: ( rule__PartDirective__Group__1__Impl rule__PartDirective__Group__2 )
            // InternalDart.g:1413:2: rule__PartDirective__Group__1__Impl rule__PartDirective__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PartDirective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDirective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDirective__Group__1"


    // $ANTLR start "rule__PartDirective__Group__1__Impl"
    // InternalDart.g:1420:1: rule__PartDirective__Group__1__Impl : ( ( rule__PartDirective__PartURIAssignment_1 ) ) ;
    public final void rule__PartDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1424:1: ( ( ( rule__PartDirective__PartURIAssignment_1 ) ) )
            // InternalDart.g:1425:1: ( ( rule__PartDirective__PartURIAssignment_1 ) )
            {
            // InternalDart.g:1425:1: ( ( rule__PartDirective__PartURIAssignment_1 ) )
            // InternalDart.g:1426:2: ( rule__PartDirective__PartURIAssignment_1 )
            {
             before(grammarAccess.getPartDirectiveAccess().getPartURIAssignment_1()); 
            // InternalDart.g:1427:2: ( rule__PartDirective__PartURIAssignment_1 )
            // InternalDart.g:1427:3: rule__PartDirective__PartURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PartDirective__PartURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartDirectiveAccess().getPartURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDirective__Group__1__Impl"


    // $ANTLR start "rule__PartDirective__Group__2"
    // InternalDart.g:1435:1: rule__PartDirective__Group__2 : rule__PartDirective__Group__2__Impl ;
    public final void rule__PartDirective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1439:1: ( rule__PartDirective__Group__2__Impl )
            // InternalDart.g:1440:2: rule__PartDirective__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartDirective__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDirective__Group__2"


    // $ANTLR start "rule__PartDirective__Group__2__Impl"
    // InternalDart.g:1446:1: rule__PartDirective__Group__2__Impl : ( ';' ) ;
    public final void rule__PartDirective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1450:1: ( ( ';' ) )
            // InternalDart.g:1451:1: ( ';' )
            {
            // InternalDart.g:1451:1: ( ';' )
            // InternalDart.g:1452:2: ';'
            {
             before(grammarAccess.getPartDirectiveAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPartDirectiveAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDirective__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalDart.g:1462:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1466:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalDart.g:1467:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0"


    // $ANTLR start "rule__ClassDeclaration__Group__0__Impl"
    // InternalDart.g:1474:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__MetadataAssignment_0 )* ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1478:1: ( ( ( rule__ClassDeclaration__MetadataAssignment_0 )* ) )
            // InternalDart.g:1479:1: ( ( rule__ClassDeclaration__MetadataAssignment_0 )* )
            {
            // InternalDart.g:1479:1: ( ( rule__ClassDeclaration__MetadataAssignment_0 )* )
            // InternalDart.g:1480:2: ( rule__ClassDeclaration__MetadataAssignment_0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getMetadataAssignment_0()); 
            // InternalDart.g:1481:2: ( rule__ClassDeclaration__MetadataAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDart.g:1481:3: rule__ClassDeclaration__MetadataAssignment_0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ClassDeclaration__MetadataAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__1"
    // InternalDart.g:1489:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1493:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalDart.g:1494:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ClassDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1"


    // $ANTLR start "rule__ClassDeclaration__Group__1__Impl"
    // InternalDart.g:1501:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1505:1: ( ( 'class' ) )
            // InternalDart.g:1506:1: ( 'class' )
            {
            // InternalDart.g:1506:1: ( 'class' )
            // InternalDart.g:1507:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__2"
    // InternalDart.g:1516:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1520:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalDart.g:1521:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ClassDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2"


    // $ANTLR start "rule__ClassDeclaration__Group__2__Impl"
    // InternalDart.g:1528:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1532:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalDart.g:1533:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalDart.g:1533:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalDart.g:1534:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalDart.g:1535:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalDart.g:1535:3: rule__ClassDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__3"
    // InternalDart.g:1543:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1547:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalDart.g:1548:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ClassDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3"


    // $ANTLR start "rule__ClassDeclaration__Group__3__Impl"
    // InternalDart.g:1555:1: rule__ClassDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1559:1: ( ( '{' ) )
            // InternalDart.g:1560:1: ( '{' )
            {
            // InternalDart.g:1560:1: ( '{' )
            // InternalDart.g:1561:2: '{'
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__4"
    // InternalDart.g:1570:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1574:1: ( rule__ClassDeclaration__Group__4__Impl )
            // InternalDart.g:1575:2: rule__ClassDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4"


    // $ANTLR start "rule__ClassDeclaration__Group__4__Impl"
    // InternalDart.g:1581:1: rule__ClassDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1585:1: ( ( '}' ) )
            // InternalDart.g:1586:1: ( '}' )
            {
            // InternalDart.g:1586:1: ( '}' )
            // InternalDart.g:1587:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4__Impl"


    // $ANTLR start "rule__MixinDeclaration__Group__0"
    // InternalDart.g:1597:1: rule__MixinDeclaration__Group__0 : rule__MixinDeclaration__Group__0__Impl rule__MixinDeclaration__Group__1 ;
    public final void rule__MixinDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1601:1: ( rule__MixinDeclaration__Group__0__Impl rule__MixinDeclaration__Group__1 )
            // InternalDart.g:1602:2: rule__MixinDeclaration__Group__0__Impl rule__MixinDeclaration__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__MixinDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixinDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__0"


    // $ANTLR start "rule__MixinDeclaration__Group__0__Impl"
    // InternalDart.g:1609:1: rule__MixinDeclaration__Group__0__Impl : ( ( rule__MixinDeclaration__MetadataAssignment_0 )* ) ;
    public final void rule__MixinDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1613:1: ( ( ( rule__MixinDeclaration__MetadataAssignment_0 )* ) )
            // InternalDart.g:1614:1: ( ( rule__MixinDeclaration__MetadataAssignment_0 )* )
            {
            // InternalDart.g:1614:1: ( ( rule__MixinDeclaration__MetadataAssignment_0 )* )
            // InternalDart.g:1615:2: ( rule__MixinDeclaration__MetadataAssignment_0 )*
            {
             before(grammarAccess.getMixinDeclarationAccess().getMetadataAssignment_0()); 
            // InternalDart.g:1616:2: ( rule__MixinDeclaration__MetadataAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDart.g:1616:3: rule__MixinDeclaration__MetadataAssignment_0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MixinDeclaration__MetadataAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMixinDeclarationAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__0__Impl"


    // $ANTLR start "rule__MixinDeclaration__Group__1"
    // InternalDart.g:1624:1: rule__MixinDeclaration__Group__1 : rule__MixinDeclaration__Group__1__Impl rule__MixinDeclaration__Group__2 ;
    public final void rule__MixinDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1628:1: ( rule__MixinDeclaration__Group__1__Impl rule__MixinDeclaration__Group__2 )
            // InternalDart.g:1629:2: rule__MixinDeclaration__Group__1__Impl rule__MixinDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MixinDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixinDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__1"


    // $ANTLR start "rule__MixinDeclaration__Group__1__Impl"
    // InternalDart.g:1636:1: rule__MixinDeclaration__Group__1__Impl : ( 'mixin' ) ;
    public final void rule__MixinDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1640:1: ( ( 'mixin' ) )
            // InternalDart.g:1641:1: ( 'mixin' )
            {
            // InternalDart.g:1641:1: ( 'mixin' )
            // InternalDart.g:1642:2: 'mixin'
            {
             before(grammarAccess.getMixinDeclarationAccess().getMixinKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMixinDeclarationAccess().getMixinKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MixinDeclaration__Group__2"
    // InternalDart.g:1651:1: rule__MixinDeclaration__Group__2 : rule__MixinDeclaration__Group__2__Impl rule__MixinDeclaration__Group__3 ;
    public final void rule__MixinDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1655:1: ( rule__MixinDeclaration__Group__2__Impl rule__MixinDeclaration__Group__3 )
            // InternalDart.g:1656:2: rule__MixinDeclaration__Group__2__Impl rule__MixinDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__MixinDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixinDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__2"


    // $ANTLR start "rule__MixinDeclaration__Group__2__Impl"
    // InternalDart.g:1663:1: rule__MixinDeclaration__Group__2__Impl : ( ( rule__MixinDeclaration__NameAssignment_2 ) ) ;
    public final void rule__MixinDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1667:1: ( ( ( rule__MixinDeclaration__NameAssignment_2 ) ) )
            // InternalDart.g:1668:1: ( ( rule__MixinDeclaration__NameAssignment_2 ) )
            {
            // InternalDart.g:1668:1: ( ( rule__MixinDeclaration__NameAssignment_2 ) )
            // InternalDart.g:1669:2: ( rule__MixinDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getMixinDeclarationAccess().getNameAssignment_2()); 
            // InternalDart.g:1670:2: ( rule__MixinDeclaration__NameAssignment_2 )
            // InternalDart.g:1670:3: rule__MixinDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MixinDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMixinDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__2__Impl"


    // $ANTLR start "rule__MixinDeclaration__Group__3"
    // InternalDart.g:1678:1: rule__MixinDeclaration__Group__3 : rule__MixinDeclaration__Group__3__Impl rule__MixinDeclaration__Group__4 ;
    public final void rule__MixinDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1682:1: ( rule__MixinDeclaration__Group__3__Impl rule__MixinDeclaration__Group__4 )
            // InternalDart.g:1683:2: rule__MixinDeclaration__Group__3__Impl rule__MixinDeclaration__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__MixinDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixinDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__3"


    // $ANTLR start "rule__MixinDeclaration__Group__3__Impl"
    // InternalDart.g:1690:1: rule__MixinDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__MixinDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1694:1: ( ( '{' ) )
            // InternalDart.g:1695:1: ( '{' )
            {
            // InternalDart.g:1695:1: ( '{' )
            // InternalDart.g:1696:2: '{'
            {
             before(grammarAccess.getMixinDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMixinDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__3__Impl"


    // $ANTLR start "rule__MixinDeclaration__Group__4"
    // InternalDart.g:1705:1: rule__MixinDeclaration__Group__4 : rule__MixinDeclaration__Group__4__Impl ;
    public final void rule__MixinDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1709:1: ( rule__MixinDeclaration__Group__4__Impl )
            // InternalDart.g:1710:2: rule__MixinDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MixinDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__4"


    // $ANTLR start "rule__MixinDeclaration__Group__4__Impl"
    // InternalDart.g:1716:1: rule__MixinDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__MixinDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1720:1: ( ( '}' ) )
            // InternalDart.g:1721:1: ( '}' )
            {
            // InternalDart.g:1721:1: ( '}' )
            // InternalDart.g:1722:2: '}'
            {
             before(grammarAccess.getMixinDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMixinDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ExtensionDeclaration__Group__0"
    // InternalDart.g:1732:1: rule__ExtensionDeclaration__Group__0 : rule__ExtensionDeclaration__Group__0__Impl rule__ExtensionDeclaration__Group__1 ;
    public final void rule__ExtensionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1736:1: ( rule__ExtensionDeclaration__Group__0__Impl rule__ExtensionDeclaration__Group__1 )
            // InternalDart.g:1737:2: rule__ExtensionDeclaration__Group__0__Impl rule__ExtensionDeclaration__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExtensionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__0"


    // $ANTLR start "rule__ExtensionDeclaration__Group__0__Impl"
    // InternalDart.g:1744:1: rule__ExtensionDeclaration__Group__0__Impl : ( ( rule__ExtensionDeclaration__MetadataAssignment_0 )* ) ;
    public final void rule__ExtensionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1748:1: ( ( ( rule__ExtensionDeclaration__MetadataAssignment_0 )* ) )
            // InternalDart.g:1749:1: ( ( rule__ExtensionDeclaration__MetadataAssignment_0 )* )
            {
            // InternalDart.g:1749:1: ( ( rule__ExtensionDeclaration__MetadataAssignment_0 )* )
            // InternalDart.g:1750:2: ( rule__ExtensionDeclaration__MetadataAssignment_0 )*
            {
             before(grammarAccess.getExtensionDeclarationAccess().getMetadataAssignment_0()); 
            // InternalDart.g:1751:2: ( rule__ExtensionDeclaration__MetadataAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDart.g:1751:3: rule__ExtensionDeclaration__MetadataAssignment_0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ExtensionDeclaration__MetadataAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExtensionDeclarationAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ExtensionDeclaration__Group__1"
    // InternalDart.g:1759:1: rule__ExtensionDeclaration__Group__1 : rule__ExtensionDeclaration__Group__1__Impl rule__ExtensionDeclaration__Group__2 ;
    public final void rule__ExtensionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1763:1: ( rule__ExtensionDeclaration__Group__1__Impl rule__ExtensionDeclaration__Group__2 )
            // InternalDart.g:1764:2: rule__ExtensionDeclaration__Group__1__Impl rule__ExtensionDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ExtensionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__1"


    // $ANTLR start "rule__ExtensionDeclaration__Group__1__Impl"
    // InternalDart.g:1771:1: rule__ExtensionDeclaration__Group__1__Impl : ( 'extension' ) ;
    public final void rule__ExtensionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1775:1: ( ( 'extension' ) )
            // InternalDart.g:1776:1: ( 'extension' )
            {
            // InternalDart.g:1776:1: ( 'extension' )
            // InternalDart.g:1777:2: 'extension'
            {
             before(grammarAccess.getExtensionDeclarationAccess().getExtensionKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExtensionDeclarationAccess().getExtensionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ExtensionDeclaration__Group__2"
    // InternalDart.g:1786:1: rule__ExtensionDeclaration__Group__2 : rule__ExtensionDeclaration__Group__2__Impl rule__ExtensionDeclaration__Group__3 ;
    public final void rule__ExtensionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1790:1: ( rule__ExtensionDeclaration__Group__2__Impl rule__ExtensionDeclaration__Group__3 )
            // InternalDart.g:1791:2: rule__ExtensionDeclaration__Group__2__Impl rule__ExtensionDeclaration__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ExtensionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__2"


    // $ANTLR start "rule__ExtensionDeclaration__Group__2__Impl"
    // InternalDart.g:1798:1: rule__ExtensionDeclaration__Group__2__Impl : ( ( rule__ExtensionDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ExtensionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1802:1: ( ( ( rule__ExtensionDeclaration__NameAssignment_2 ) ) )
            // InternalDart.g:1803:1: ( ( rule__ExtensionDeclaration__NameAssignment_2 ) )
            {
            // InternalDart.g:1803:1: ( ( rule__ExtensionDeclaration__NameAssignment_2 ) )
            // InternalDart.g:1804:2: ( rule__ExtensionDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getExtensionDeclarationAccess().getNameAssignment_2()); 
            // InternalDart.g:1805:2: ( rule__ExtensionDeclaration__NameAssignment_2 )
            // InternalDart.g:1805:3: rule__ExtensionDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtensionDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ExtensionDeclaration__Group__3"
    // InternalDart.g:1813:1: rule__ExtensionDeclaration__Group__3 : rule__ExtensionDeclaration__Group__3__Impl rule__ExtensionDeclaration__Group__4 ;
    public final void rule__ExtensionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1817:1: ( rule__ExtensionDeclaration__Group__3__Impl rule__ExtensionDeclaration__Group__4 )
            // InternalDart.g:1818:2: rule__ExtensionDeclaration__Group__3__Impl rule__ExtensionDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ExtensionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__3"


    // $ANTLR start "rule__ExtensionDeclaration__Group__3__Impl"
    // InternalDart.g:1825:1: rule__ExtensionDeclaration__Group__3__Impl : ( 'on' ) ;
    public final void rule__ExtensionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1829:1: ( ( 'on' ) )
            // InternalDart.g:1830:1: ( 'on' )
            {
            // InternalDart.g:1830:1: ( 'on' )
            // InternalDart.g:1831:2: 'on'
            {
             before(grammarAccess.getExtensionDeclarationAccess().getOnKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExtensionDeclarationAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ExtensionDeclaration__Group__4"
    // InternalDart.g:1840:1: rule__ExtensionDeclaration__Group__4 : rule__ExtensionDeclaration__Group__4__Impl rule__ExtensionDeclaration__Group__5 ;
    public final void rule__ExtensionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1844:1: ( rule__ExtensionDeclaration__Group__4__Impl rule__ExtensionDeclaration__Group__5 )
            // InternalDart.g:1845:2: rule__ExtensionDeclaration__Group__4__Impl rule__ExtensionDeclaration__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ExtensionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__4"


    // $ANTLR start "rule__ExtensionDeclaration__Group__4__Impl"
    // InternalDart.g:1852:1: rule__ExtensionDeclaration__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__ExtensionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1856:1: ( ( RULE_ID ) )
            // InternalDart.g:1857:1: ( RULE_ID )
            {
            // InternalDart.g:1857:1: ( RULE_ID )
            // InternalDart.g:1858:2: RULE_ID
            {
             before(grammarAccess.getExtensionDeclarationAccess().getIDTerminalRuleCall_4()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtensionDeclarationAccess().getIDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ExtensionDeclaration__Group__5"
    // InternalDart.g:1867:1: rule__ExtensionDeclaration__Group__5 : rule__ExtensionDeclaration__Group__5__Impl rule__ExtensionDeclaration__Group__6 ;
    public final void rule__ExtensionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1871:1: ( rule__ExtensionDeclaration__Group__5__Impl rule__ExtensionDeclaration__Group__6 )
            // InternalDart.g:1872:2: rule__ExtensionDeclaration__Group__5__Impl rule__ExtensionDeclaration__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ExtensionDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__5"


    // $ANTLR start "rule__ExtensionDeclaration__Group__5__Impl"
    // InternalDart.g:1879:1: rule__ExtensionDeclaration__Group__5__Impl : ( '{' ) ;
    public final void rule__ExtensionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1883:1: ( ( '{' ) )
            // InternalDart.g:1884:1: ( '{' )
            {
            // InternalDart.g:1884:1: ( '{' )
            // InternalDart.g:1885:2: '{'
            {
             before(grammarAccess.getExtensionDeclarationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExtensionDeclarationAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ExtensionDeclaration__Group__6"
    // InternalDart.g:1894:1: rule__ExtensionDeclaration__Group__6 : rule__ExtensionDeclaration__Group__6__Impl ;
    public final void rule__ExtensionDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1898:1: ( rule__ExtensionDeclaration__Group__6__Impl )
            // InternalDart.g:1899:2: rule__ExtensionDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__6"


    // $ANTLR start "rule__ExtensionDeclaration__Group__6__Impl"
    // InternalDart.g:1905:1: rule__ExtensionDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ExtensionDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1909:1: ( ( '}' ) )
            // InternalDart.g:1910:1: ( '}' )
            {
            // InternalDart.g:1910:1: ( '}' )
            // InternalDart.g:1911:2: '}'
            {
             before(grammarAccess.getExtensionDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExtensionDeclarationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__Group__6__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // InternalDart.g:1921:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1925:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // InternalDart.g:1926:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0"


    // $ANTLR start "rule__EnumDeclaration__Group__0__Impl"
    // InternalDart.g:1933:1: rule__EnumDeclaration__Group__0__Impl : ( ( rule__EnumDeclaration__MetadataAssignment_0 )* ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1937:1: ( ( ( rule__EnumDeclaration__MetadataAssignment_0 )* ) )
            // InternalDart.g:1938:1: ( ( rule__EnumDeclaration__MetadataAssignment_0 )* )
            {
            // InternalDart.g:1938:1: ( ( rule__EnumDeclaration__MetadataAssignment_0 )* )
            // InternalDart.g:1939:2: ( rule__EnumDeclaration__MetadataAssignment_0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getMetadataAssignment_0()); 
            // InternalDart.g:1940:2: ( rule__EnumDeclaration__MetadataAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDart.g:1940:3: rule__EnumDeclaration__MetadataAssignment_0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__EnumDeclaration__MetadataAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEnumDeclarationAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // InternalDart.g:1948:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1952:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // InternalDart.g:1953:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1"


    // $ANTLR start "rule__EnumDeclaration__Group__1__Impl"
    // InternalDart.g:1960:1: rule__EnumDeclaration__Group__1__Impl : ( 'enum' ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1964:1: ( ( 'enum' ) )
            // InternalDart.g:1965:1: ( 'enum' )
            {
            // InternalDart.g:1965:1: ( 'enum' )
            // InternalDart.g:1966:2: 'enum'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // InternalDart.g:1975:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1979:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // InternalDart.g:1980:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2"


    // $ANTLR start "rule__EnumDeclaration__Group__2__Impl"
    // InternalDart.g:1987:1: rule__EnumDeclaration__Group__2__Impl : ( ( rule__EnumDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:1991:1: ( ( ( rule__EnumDeclaration__NameAssignment_2 ) ) )
            // InternalDart.g:1992:1: ( ( rule__EnumDeclaration__NameAssignment_2 ) )
            {
            // InternalDart.g:1992:1: ( ( rule__EnumDeclaration__NameAssignment_2 ) )
            // InternalDart.g:1993:2: ( rule__EnumDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_2()); 
            // InternalDart.g:1994:2: ( rule__EnumDeclaration__NameAssignment_2 )
            // InternalDart.g:1994:3: rule__EnumDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__3"
    // InternalDart.g:2002:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2006:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // InternalDart.g:2007:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__3"


    // $ANTLR start "rule__EnumDeclaration__Group__3__Impl"
    // InternalDart.g:2014:1: rule__EnumDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2018:1: ( ( '{' ) )
            // InternalDart.g:2019:1: ( '{' )
            {
            // InternalDart.g:2019:1: ( '{' )
            // InternalDart.g:2020:2: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__4"
    // InternalDart.g:2029:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2033:1: ( rule__EnumDeclaration__Group__4__Impl )
            // InternalDart.g:2034:2: rule__EnumDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__4"


    // $ANTLR start "rule__EnumDeclaration__Group__4__Impl"
    // InternalDart.g:2040:1: rule__EnumDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2044:1: ( ( '}' ) )
            // InternalDart.g:2045:1: ( '}' )
            {
            // InternalDart.g:2045:1: ( '}' )
            // InternalDart.g:2046:2: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TypeAlias__Group__0"
    // InternalDart.g:2056:1: rule__TypeAlias__Group__0 : rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 ;
    public final void rule__TypeAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2060:1: ( rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1 )
            // InternalDart.g:2061:2: rule__TypeAlias__Group__0__Impl rule__TypeAlias__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TypeAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__0"


    // $ANTLR start "rule__TypeAlias__Group__0__Impl"
    // InternalDart.g:2068:1: rule__TypeAlias__Group__0__Impl : ( ( rule__TypeAlias__MetadataAssignment_0 )* ) ;
    public final void rule__TypeAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2072:1: ( ( ( rule__TypeAlias__MetadataAssignment_0 )* ) )
            // InternalDart.g:2073:1: ( ( rule__TypeAlias__MetadataAssignment_0 )* )
            {
            // InternalDart.g:2073:1: ( ( rule__TypeAlias__MetadataAssignment_0 )* )
            // InternalDart.g:2074:2: ( rule__TypeAlias__MetadataAssignment_0 )*
            {
             before(grammarAccess.getTypeAliasAccess().getMetadataAssignment_0()); 
            // InternalDart.g:2075:2: ( rule__TypeAlias__MetadataAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDart.g:2075:3: rule__TypeAlias__MetadataAssignment_0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TypeAlias__MetadataAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTypeAliasAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__0__Impl"


    // $ANTLR start "rule__TypeAlias__Group__1"
    // InternalDart.g:2083:1: rule__TypeAlias__Group__1 : rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 ;
    public final void rule__TypeAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2087:1: ( rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2 )
            // InternalDart.g:2088:2: rule__TypeAlias__Group__1__Impl rule__TypeAlias__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TypeAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__1"


    // $ANTLR start "rule__TypeAlias__Group__1__Impl"
    // InternalDart.g:2095:1: rule__TypeAlias__Group__1__Impl : ( 'typedef' ) ;
    public final void rule__TypeAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2099:1: ( ( 'typedef' ) )
            // InternalDart.g:2100:1: ( 'typedef' )
            {
            // InternalDart.g:2100:1: ( 'typedef' )
            // InternalDart.g:2101:2: 'typedef'
            {
             before(grammarAccess.getTypeAliasAccess().getTypedefKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeAliasAccess().getTypedefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__1__Impl"


    // $ANTLR start "rule__TypeAlias__Group__2"
    // InternalDart.g:2110:1: rule__TypeAlias__Group__2 : rule__TypeAlias__Group__2__Impl rule__TypeAlias__Group__3 ;
    public final void rule__TypeAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2114:1: ( rule__TypeAlias__Group__2__Impl rule__TypeAlias__Group__3 )
            // InternalDart.g:2115:2: rule__TypeAlias__Group__2__Impl rule__TypeAlias__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TypeAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__2"


    // $ANTLR start "rule__TypeAlias__Group__2__Impl"
    // InternalDart.g:2122:1: rule__TypeAlias__Group__2__Impl : ( ( rule__TypeAlias__NameAssignment_2 ) ) ;
    public final void rule__TypeAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2126:1: ( ( ( rule__TypeAlias__NameAssignment_2 ) ) )
            // InternalDart.g:2127:1: ( ( rule__TypeAlias__NameAssignment_2 ) )
            {
            // InternalDart.g:2127:1: ( ( rule__TypeAlias__NameAssignment_2 ) )
            // InternalDart.g:2128:2: ( rule__TypeAlias__NameAssignment_2 )
            {
             before(grammarAccess.getTypeAliasAccess().getNameAssignment_2()); 
            // InternalDart.g:2129:2: ( rule__TypeAlias__NameAssignment_2 )
            // InternalDart.g:2129:3: rule__TypeAlias__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlias__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAliasAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__2__Impl"


    // $ANTLR start "rule__TypeAlias__Group__3"
    // InternalDart.g:2137:1: rule__TypeAlias__Group__3 : rule__TypeAlias__Group__3__Impl rule__TypeAlias__Group__4 ;
    public final void rule__TypeAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2141:1: ( rule__TypeAlias__Group__3__Impl rule__TypeAlias__Group__4 )
            // InternalDart.g:2142:2: rule__TypeAlias__Group__3__Impl rule__TypeAlias__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TypeAlias__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__3"


    // $ANTLR start "rule__TypeAlias__Group__3__Impl"
    // InternalDart.g:2149:1: rule__TypeAlias__Group__3__Impl : ( '=' ) ;
    public final void rule__TypeAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2153:1: ( ( '=' ) )
            // InternalDart.g:2154:1: ( '=' )
            {
            // InternalDart.g:2154:1: ( '=' )
            // InternalDart.g:2155:2: '='
            {
             before(grammarAccess.getTypeAliasAccess().getEqualsSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAliasAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__3__Impl"


    // $ANTLR start "rule__TypeAlias__Group__4"
    // InternalDart.g:2164:1: rule__TypeAlias__Group__4 : rule__TypeAlias__Group__4__Impl rule__TypeAlias__Group__5 ;
    public final void rule__TypeAlias__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2168:1: ( rule__TypeAlias__Group__4__Impl rule__TypeAlias__Group__5 )
            // InternalDart.g:2169:2: rule__TypeAlias__Group__4__Impl rule__TypeAlias__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TypeAlias__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__4"


    // $ANTLR start "rule__TypeAlias__Group__4__Impl"
    // InternalDart.g:2176:1: rule__TypeAlias__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__TypeAlias__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2180:1: ( ( RULE_ID ) )
            // InternalDart.g:2181:1: ( RULE_ID )
            {
            // InternalDart.g:2181:1: ( RULE_ID )
            // InternalDart.g:2182:2: RULE_ID
            {
             before(grammarAccess.getTypeAliasAccess().getIDTerminalRuleCall_4()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAliasAccess().getIDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__4__Impl"


    // $ANTLR start "rule__TypeAlias__Group__5"
    // InternalDart.g:2191:1: rule__TypeAlias__Group__5 : rule__TypeAlias__Group__5__Impl ;
    public final void rule__TypeAlias__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2195:1: ( rule__TypeAlias__Group__5__Impl )
            // InternalDart.g:2196:2: rule__TypeAlias__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeAlias__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__5"


    // $ANTLR start "rule__TypeAlias__Group__5__Impl"
    // InternalDart.g:2202:1: rule__TypeAlias__Group__5__Impl : ( ';' ) ;
    public final void rule__TypeAlias__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2206:1: ( ( ';' ) )
            // InternalDart.g:2207:1: ( ';' )
            {
            // InternalDart.g:2207:1: ( ';' )
            // InternalDart.g:2208:2: ';'
            {
             before(grammarAccess.getTypeAliasAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTypeAliasAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__Group__5__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // InternalDart.g:2218:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2222:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // InternalDart.g:2223:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0"


    // $ANTLR start "rule__FunctionDeclaration__Group__0__Impl"
    // InternalDart.g:2230:1: rule__FunctionDeclaration__Group__0__Impl : ( ( rule__FunctionDeclaration__MetadataAssignment_0 )* ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2234:1: ( ( ( rule__FunctionDeclaration__MetadataAssignment_0 )* ) )
            // InternalDart.g:2235:1: ( ( rule__FunctionDeclaration__MetadataAssignment_0 )* )
            {
            // InternalDart.g:2235:1: ( ( rule__FunctionDeclaration__MetadataAssignment_0 )* )
            // InternalDart.g:2236:2: ( rule__FunctionDeclaration__MetadataAssignment_0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getMetadataAssignment_0()); 
            // InternalDart.g:2237:2: ( rule__FunctionDeclaration__MetadataAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDart.g:2237:3: rule__FunctionDeclaration__MetadataAssignment_0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__FunctionDeclaration__MetadataAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__1"
    // InternalDart.g:2245:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2249:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // InternalDart.g:2250:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1"


    // $ANTLR start "rule__FunctionDeclaration__Group__1__Impl"
    // InternalDart.g:2257:1: rule__FunctionDeclaration__Group__1__Impl : ( ( rule__FunctionDeclaration__ExternalAssignment_1 )? ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2261:1: ( ( ( rule__FunctionDeclaration__ExternalAssignment_1 )? ) )
            // InternalDart.g:2262:1: ( ( rule__FunctionDeclaration__ExternalAssignment_1 )? )
            {
            // InternalDart.g:2262:1: ( ( rule__FunctionDeclaration__ExternalAssignment_1 )? )
            // InternalDart.g:2263:2: ( rule__FunctionDeclaration__ExternalAssignment_1 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getExternalAssignment_1()); 
            // InternalDart.g:2264:2: ( rule__FunctionDeclaration__ExternalAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDart.g:2264:3: rule__FunctionDeclaration__ExternalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__ExternalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getExternalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__2"
    // InternalDart.g:2272:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2276:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // InternalDart.g:2277:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2"


    // $ANTLR start "rule__FunctionDeclaration__Group__2__Impl"
    // InternalDart.g:2284:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__ReturnTypeAssignment_2 )? ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2288:1: ( ( ( rule__FunctionDeclaration__ReturnTypeAssignment_2 )? ) )
            // InternalDart.g:2289:1: ( ( rule__FunctionDeclaration__ReturnTypeAssignment_2 )? )
            {
            // InternalDart.g:2289:1: ( ( rule__FunctionDeclaration__ReturnTypeAssignment_2 )? )
            // InternalDart.g:2290:2: ( rule__FunctionDeclaration__ReturnTypeAssignment_2 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getReturnTypeAssignment_2()); 
            // InternalDart.g:2291:2: ( rule__FunctionDeclaration__ReturnTypeAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalDart.g:2291:3: rule__FunctionDeclaration__ReturnTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionDeclaration__ReturnTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getReturnTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__3"
    // InternalDart.g:2299:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2303:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // InternalDart.g:2304:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3"


    // $ANTLR start "rule__FunctionDeclaration__Group__3__Impl"
    // InternalDart.g:2311:1: rule__FunctionDeclaration__Group__3__Impl : ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2315:1: ( ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) )
            // InternalDart.g:2316:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            {
            // InternalDart.g:2316:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            // InternalDart.g:2317:2: ( rule__FunctionDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3()); 
            // InternalDart.g:2318:2: ( rule__FunctionDeclaration__NameAssignment_3 )
            // InternalDart.g:2318:3: rule__FunctionDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__4"
    // InternalDart.g:2326:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2330:1: ( rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 )
            // InternalDart.g:2331:2: rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4"


    // $ANTLR start "rule__FunctionDeclaration__Group__4__Impl"
    // InternalDart.g:2338:1: rule__FunctionDeclaration__Group__4__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2342:1: ( ( '(' ) )
            // InternalDart.g:2343:1: ( '(' )
            {
            // InternalDart.g:2343:1: ( '(' )
            // InternalDart.g:2344:2: '('
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__5"
    // InternalDart.g:2353:1: rule__FunctionDeclaration__Group__5 : rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 ;
    public final void rule__FunctionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2357:1: ( rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 )
            // InternalDart.g:2358:2: rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__FunctionDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__5"


    // $ANTLR start "rule__FunctionDeclaration__Group__5__Impl"
    // InternalDart.g:2365:1: rule__FunctionDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2369:1: ( ( ')' ) )
            // InternalDart.g:2370:1: ( ')' )
            {
            // InternalDart.g:2370:1: ( ')' )
            // InternalDart.g:2371:2: ')'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__6"
    // InternalDart.g:2380:1: rule__FunctionDeclaration__Group__6 : rule__FunctionDeclaration__Group__6__Impl ;
    public final void rule__FunctionDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2384:1: ( rule__FunctionDeclaration__Group__6__Impl )
            // InternalDart.g:2385:2: rule__FunctionDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__6"


    // $ANTLR start "rule__FunctionDeclaration__Group__6__Impl"
    // InternalDart.g:2391:1: rule__FunctionDeclaration__Group__6__Impl : ( ( rule__FunctionDeclaration__Alternatives_6 ) ) ;
    public final void rule__FunctionDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2395:1: ( ( ( rule__FunctionDeclaration__Alternatives_6 ) ) )
            // InternalDart.g:2396:1: ( ( rule__FunctionDeclaration__Alternatives_6 ) )
            {
            // InternalDart.g:2396:1: ( ( rule__FunctionDeclaration__Alternatives_6 ) )
            // InternalDart.g:2397:2: ( rule__FunctionDeclaration__Alternatives_6 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getAlternatives_6()); 
            // InternalDart.g:2398:2: ( rule__FunctionDeclaration__Alternatives_6 )
            // InternalDart.g:2398:3: rule__FunctionDeclaration__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__FunctionDeclaration__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__6__Impl"


    // $ANTLR start "rule__FunctionBody__Group__0"
    // InternalDart.g:2407:1: rule__FunctionBody__Group__0 : rule__FunctionBody__Group__0__Impl rule__FunctionBody__Group__1 ;
    public final void rule__FunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2411:1: ( rule__FunctionBody__Group__0__Impl rule__FunctionBody__Group__1 )
            // InternalDart.g:2412:2: rule__FunctionBody__Group__0__Impl rule__FunctionBody__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FunctionBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBody__Group__0"


    // $ANTLR start "rule__FunctionBody__Group__0__Impl"
    // InternalDart.g:2419:1: rule__FunctionBody__Group__0__Impl : ( '{' ) ;
    public final void rule__FunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2423:1: ( ( '{' ) )
            // InternalDart.g:2424:1: ( '{' )
            {
            // InternalDart.g:2424:1: ( '{' )
            // InternalDart.g:2425:2: '{'
            {
             before(grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBody__Group__0__Impl"


    // $ANTLR start "rule__FunctionBody__Group__1"
    // InternalDart.g:2434:1: rule__FunctionBody__Group__1 : rule__FunctionBody__Group__1__Impl ;
    public final void rule__FunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2438:1: ( rule__FunctionBody__Group__1__Impl )
            // InternalDart.g:2439:2: rule__FunctionBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBody__Group__1"


    // $ANTLR start "rule__FunctionBody__Group__1__Impl"
    // InternalDart.g:2445:1: rule__FunctionBody__Group__1__Impl : ( '}' ) ;
    public final void rule__FunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2449:1: ( ( '}' ) )
            // InternalDart.g:2450:1: ( '}' )
            {
            // InternalDart.g:2450:1: ( '}' )
            // InternalDart.g:2451:2: '}'
            {
             before(grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBody__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalDart.g:2461:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2465:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalDart.g:2466:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalDart.g:2473:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__MetadataAssignment_0 )* ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2477:1: ( ( ( rule__VariableDeclaration__MetadataAssignment_0 )* ) )
            // InternalDart.g:2478:1: ( ( rule__VariableDeclaration__MetadataAssignment_0 )* )
            {
            // InternalDart.g:2478:1: ( ( rule__VariableDeclaration__MetadataAssignment_0 )* )
            // InternalDart.g:2479:2: ( rule__VariableDeclaration__MetadataAssignment_0 )*
            {
             before(grammarAccess.getVariableDeclarationAccess().getMetadataAssignment_0()); 
            // InternalDart.g:2480:2: ( rule__VariableDeclaration__MetadataAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDart.g:2480:3: rule__VariableDeclaration__MetadataAssignment_0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__VariableDeclaration__MetadataAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getVariableDeclarationAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalDart.g:2488:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2492:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalDart.g:2493:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalDart.g:2500:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__LateAssignment_1 )? ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2504:1: ( ( ( rule__VariableDeclaration__LateAssignment_1 )? ) )
            // InternalDart.g:2505:1: ( ( rule__VariableDeclaration__LateAssignment_1 )? )
            {
            // InternalDart.g:2505:1: ( ( rule__VariableDeclaration__LateAssignment_1 )? )
            // InternalDart.g:2506:2: ( rule__VariableDeclaration__LateAssignment_1 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getLateAssignment_1()); 
            // InternalDart.g:2507:2: ( rule__VariableDeclaration__LateAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDart.g:2507:3: rule__VariableDeclaration__LateAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__LateAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclarationAccess().getLateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalDart.g:2515:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2519:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalDart.g:2520:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalDart.g:2527:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__Alternatives_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2531:1: ( ( ( rule__VariableDeclaration__Alternatives_2 ) ) )
            // InternalDart.g:2532:1: ( ( rule__VariableDeclaration__Alternatives_2 ) )
            {
            // InternalDart.g:2532:1: ( ( rule__VariableDeclaration__Alternatives_2 ) )
            // InternalDart.g:2533:2: ( rule__VariableDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives_2()); 
            // InternalDart.g:2534:2: ( rule__VariableDeclaration__Alternatives_2 )
            // InternalDart.g:2534:3: rule__VariableDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalDart.g:2542:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2546:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // InternalDart.g:2547:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalDart.g:2554:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__VariablesAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2558:1: ( ( ( rule__VariableDeclaration__VariablesAssignment_3 ) ) )
            // InternalDart.g:2559:1: ( ( rule__VariableDeclaration__VariablesAssignment_3 ) )
            {
            // InternalDart.g:2559:1: ( ( rule__VariableDeclaration__VariablesAssignment_3 ) )
            // InternalDart.g:2560:2: ( rule__VariableDeclaration__VariablesAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariablesAssignment_3()); 
            // InternalDart.g:2561:2: ( rule__VariableDeclaration__VariablesAssignment_3 )
            // InternalDart.g:2561:3: rule__VariableDeclaration__VariablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__VariablesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__4"
    // InternalDart.g:2569:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl rule__VariableDeclaration__Group__5 ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2573:1: ( rule__VariableDeclaration__Group__4__Impl rule__VariableDeclaration__Group__5 )
            // InternalDart.g:2574:2: rule__VariableDeclaration__Group__4__Impl rule__VariableDeclaration__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__VariableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__4"


    // $ANTLR start "rule__VariableDeclaration__Group__4__Impl"
    // InternalDart.g:2581:1: rule__VariableDeclaration__Group__4__Impl : ( ( rule__VariableDeclaration__Group_4__0 )* ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2585:1: ( ( ( rule__VariableDeclaration__Group_4__0 )* ) )
            // InternalDart.g:2586:1: ( ( rule__VariableDeclaration__Group_4__0 )* )
            {
            // InternalDart.g:2586:1: ( ( rule__VariableDeclaration__Group_4__0 )* )
            // InternalDart.g:2587:2: ( rule__VariableDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_4()); 
            // InternalDart.g:2588:2: ( rule__VariableDeclaration__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDart.g:2588:3: rule__VariableDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__VariableDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getVariableDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__5"
    // InternalDart.g:2596:1: rule__VariableDeclaration__Group__5 : rule__VariableDeclaration__Group__5__Impl ;
    public final void rule__VariableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2600:1: ( rule__VariableDeclaration__Group__5__Impl )
            // InternalDart.g:2601:2: rule__VariableDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__5"


    // $ANTLR start "rule__VariableDeclaration__Group__5__Impl"
    // InternalDart.g:2607:1: rule__VariableDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2611:1: ( ( ';' ) )
            // InternalDart.g:2612:1: ( ';' )
            {
            // InternalDart.g:2612:1: ( ';' )
            // InternalDart.g:2613:2: ';'
            {
             before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__5__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__0"
    // InternalDart.g:2623:1: rule__VariableDeclaration__Group_2_0__0 : rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1 ;
    public final void rule__VariableDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2627:1: ( rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1 )
            // InternalDart.g:2628:2: rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_27);
            rule__VariableDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__0"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__0__Impl"
    // InternalDart.g:2635:1: rule__VariableDeclaration__Group_2_0__0__Impl : ( ( rule__VariableDeclaration__ModifierAssignment_2_0_0 ) ) ;
    public final void rule__VariableDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2639:1: ( ( ( rule__VariableDeclaration__ModifierAssignment_2_0_0 ) ) )
            // InternalDart.g:2640:1: ( ( rule__VariableDeclaration__ModifierAssignment_2_0_0 ) )
            {
            // InternalDart.g:2640:1: ( ( rule__VariableDeclaration__ModifierAssignment_2_0_0 ) )
            // InternalDart.g:2641:2: ( rule__VariableDeclaration__ModifierAssignment_2_0_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getModifierAssignment_2_0_0()); 
            // InternalDart.g:2642:2: ( rule__VariableDeclaration__ModifierAssignment_2_0_0 )
            // InternalDart.g:2642:3: rule__VariableDeclaration__ModifierAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ModifierAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getModifierAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__1"
    // InternalDart.g:2650:1: rule__VariableDeclaration__Group_2_0__1 : rule__VariableDeclaration__Group_2_0__1__Impl ;
    public final void rule__VariableDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2654:1: ( rule__VariableDeclaration__Group_2_0__1__Impl )
            // InternalDart.g:2655:2: rule__VariableDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__1"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__1__Impl"
    // InternalDart.g:2661:1: rule__VariableDeclaration__Group_2_0__1__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2_0_1 )? ) ;
    public final void rule__VariableDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2665:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2_0_1 )? ) )
            // InternalDart.g:2666:1: ( ( rule__VariableDeclaration__TypeAssignment_2_0_1 )? )
            {
            // InternalDart.g:2666:1: ( ( rule__VariableDeclaration__TypeAssignment_2_0_1 )? )
            // InternalDart.g:2667:2: ( rule__VariableDeclaration__TypeAssignment_2_0_1 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_0_1()); 
            // InternalDart.g:2668:2: ( rule__VariableDeclaration__TypeAssignment_2_0_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID||LA25_1==35||LA25_1==39) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalDart.g:2668:3: rule__VariableDeclaration__TypeAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDeclaration__TypeAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_4__0"
    // InternalDart.g:2677:1: rule__VariableDeclaration__Group_4__0 : rule__VariableDeclaration__Group_4__0__Impl rule__VariableDeclaration__Group_4__1 ;
    public final void rule__VariableDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2681:1: ( rule__VariableDeclaration__Group_4__0__Impl rule__VariableDeclaration__Group_4__1 )
            // InternalDart.g:2682:2: rule__VariableDeclaration__Group_4__0__Impl rule__VariableDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__VariableDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_4__0"


    // $ANTLR start "rule__VariableDeclaration__Group_4__0__Impl"
    // InternalDart.g:2689:1: rule__VariableDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2693:1: ( ( ',' ) )
            // InternalDart.g:2694:1: ( ',' )
            {
            // InternalDart.g:2694:1: ( ',' )
            // InternalDart.g:2695:2: ','
            {
             before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_4__1"
    // InternalDart.g:2704:1: rule__VariableDeclaration__Group_4__1 : rule__VariableDeclaration__Group_4__1__Impl ;
    public final void rule__VariableDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2708:1: ( rule__VariableDeclaration__Group_4__1__Impl )
            // InternalDart.g:2709:2: rule__VariableDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_4__1"


    // $ANTLR start "rule__VariableDeclaration__Group_4__1__Impl"
    // InternalDart.g:2715:1: rule__VariableDeclaration__Group_4__1__Impl : ( ( rule__VariableDeclaration__VariablesAssignment_4_1 ) ) ;
    public final void rule__VariableDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2719:1: ( ( ( rule__VariableDeclaration__VariablesAssignment_4_1 ) ) )
            // InternalDart.g:2720:1: ( ( rule__VariableDeclaration__VariablesAssignment_4_1 ) )
            {
            // InternalDart.g:2720:1: ( ( rule__VariableDeclaration__VariablesAssignment_4_1 ) )
            // InternalDart.g:2721:2: ( rule__VariableDeclaration__VariablesAssignment_4_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariablesAssignment_4_1()); 
            // InternalDart.g:2722:2: ( rule__VariableDeclaration__VariablesAssignment_4_1 )
            // InternalDart.g:2722:3: rule__VariableDeclaration__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__VariablesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getVariablesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__VariableSingleDeclaration__Group__0"
    // InternalDart.g:2731:1: rule__VariableSingleDeclaration__Group__0 : rule__VariableSingleDeclaration__Group__0__Impl rule__VariableSingleDeclaration__Group__1 ;
    public final void rule__VariableSingleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2735:1: ( rule__VariableSingleDeclaration__Group__0__Impl rule__VariableSingleDeclaration__Group__1 )
            // InternalDart.g:2736:2: rule__VariableSingleDeclaration__Group__0__Impl rule__VariableSingleDeclaration__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VariableSingleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableSingleDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group__0"


    // $ANTLR start "rule__VariableSingleDeclaration__Group__0__Impl"
    // InternalDart.g:2743:1: rule__VariableSingleDeclaration__Group__0__Impl : ( ( rule__VariableSingleDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VariableSingleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2747:1: ( ( ( rule__VariableSingleDeclaration__NameAssignment_0 ) ) )
            // InternalDart.g:2748:1: ( ( rule__VariableSingleDeclaration__NameAssignment_0 ) )
            {
            // InternalDart.g:2748:1: ( ( rule__VariableSingleDeclaration__NameAssignment_0 ) )
            // InternalDart.g:2749:2: ( rule__VariableSingleDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getVariableSingleDeclarationAccess().getNameAssignment_0()); 
            // InternalDart.g:2750:2: ( rule__VariableSingleDeclaration__NameAssignment_0 )
            // InternalDart.g:2750:3: rule__VariableSingleDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableSingleDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableSingleDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableSingleDeclaration__Group__1"
    // InternalDart.g:2758:1: rule__VariableSingleDeclaration__Group__1 : rule__VariableSingleDeclaration__Group__1__Impl ;
    public final void rule__VariableSingleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2762:1: ( rule__VariableSingleDeclaration__Group__1__Impl )
            // InternalDart.g:2763:2: rule__VariableSingleDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableSingleDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group__1"


    // $ANTLR start "rule__VariableSingleDeclaration__Group__1__Impl"
    // InternalDart.g:2769:1: rule__VariableSingleDeclaration__Group__1__Impl : ( ( rule__VariableSingleDeclaration__Group_1__0 )? ) ;
    public final void rule__VariableSingleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2773:1: ( ( ( rule__VariableSingleDeclaration__Group_1__0 )? ) )
            // InternalDart.g:2774:1: ( ( rule__VariableSingleDeclaration__Group_1__0 )? )
            {
            // InternalDart.g:2774:1: ( ( rule__VariableSingleDeclaration__Group_1__0 )? )
            // InternalDart.g:2775:2: ( rule__VariableSingleDeclaration__Group_1__0 )?
            {
             before(grammarAccess.getVariableSingleDeclarationAccess().getGroup_1()); 
            // InternalDart.g:2776:2: ( rule__VariableSingleDeclaration__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDart.g:2776:3: rule__VariableSingleDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableSingleDeclaration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableSingleDeclarationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableSingleDeclaration__Group_1__0"
    // InternalDart.g:2785:1: rule__VariableSingleDeclaration__Group_1__0 : rule__VariableSingleDeclaration__Group_1__0__Impl rule__VariableSingleDeclaration__Group_1__1 ;
    public final void rule__VariableSingleDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2789:1: ( rule__VariableSingleDeclaration__Group_1__0__Impl rule__VariableSingleDeclaration__Group_1__1 )
            // InternalDart.g:2790:2: rule__VariableSingleDeclaration__Group_1__0__Impl rule__VariableSingleDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__VariableSingleDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableSingleDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group_1__0"


    // $ANTLR start "rule__VariableSingleDeclaration__Group_1__0__Impl"
    // InternalDart.g:2797:1: rule__VariableSingleDeclaration__Group_1__0__Impl : ( '=' ) ;
    public final void rule__VariableSingleDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2801:1: ( ( '=' ) )
            // InternalDart.g:2802:1: ( '=' )
            {
            // InternalDart.g:2802:1: ( '=' )
            // InternalDart.g:2803:2: '='
            {
             before(grammarAccess.getVariableSingleDeclarationAccess().getEqualsSignKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariableSingleDeclarationAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__VariableSingleDeclaration__Group_1__1"
    // InternalDart.g:2812:1: rule__VariableSingleDeclaration__Group_1__1 : rule__VariableSingleDeclaration__Group_1__1__Impl ;
    public final void rule__VariableSingleDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2816:1: ( rule__VariableSingleDeclaration__Group_1__1__Impl )
            // InternalDart.g:2817:2: rule__VariableSingleDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableSingleDeclaration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group_1__1"


    // $ANTLR start "rule__VariableSingleDeclaration__Group_1__1__Impl"
    // InternalDart.g:2823:1: rule__VariableSingleDeclaration__Group_1__1__Impl : ( ( rule__VariableSingleDeclaration__InitialValueAssignment_1_1 ) ) ;
    public final void rule__VariableSingleDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2827:1: ( ( ( rule__VariableSingleDeclaration__InitialValueAssignment_1_1 ) ) )
            // InternalDart.g:2828:1: ( ( rule__VariableSingleDeclaration__InitialValueAssignment_1_1 ) )
            {
            // InternalDart.g:2828:1: ( ( rule__VariableSingleDeclaration__InitialValueAssignment_1_1 ) )
            // InternalDart.g:2829:2: ( rule__VariableSingleDeclaration__InitialValueAssignment_1_1 )
            {
             before(grammarAccess.getVariableSingleDeclarationAccess().getInitialValueAssignment_1_1()); 
            // InternalDart.g:2830:2: ( rule__VariableSingleDeclaration__InitialValueAssignment_1_1 )
            // InternalDart.g:2830:3: rule__VariableSingleDeclaration__InitialValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableSingleDeclaration__InitialValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableSingleDeclarationAccess().getInitialValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__Metadata__Group__0"
    // InternalDart.g:2839:1: rule__Metadata__Group__0 : rule__Metadata__Group__0__Impl rule__Metadata__Group__1 ;
    public final void rule__Metadata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2843:1: ( rule__Metadata__Group__0__Impl rule__Metadata__Group__1 )
            // InternalDart.g:2844:2: rule__Metadata__Group__0__Impl rule__Metadata__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Metadata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0"


    // $ANTLR start "rule__Metadata__Group__0__Impl"
    // InternalDart.g:2851:1: rule__Metadata__Group__0__Impl : ( '@' ) ;
    public final void rule__Metadata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2855:1: ( ( '@' ) )
            // InternalDart.g:2856:1: ( '@' )
            {
            // InternalDart.g:2856:1: ( '@' )
            // InternalDart.g:2857:2: '@'
            {
             before(grammarAccess.getMetadataAccess().getCommercialAtKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0__Impl"


    // $ANTLR start "rule__Metadata__Group__1"
    // InternalDart.g:2866:1: rule__Metadata__Group__1 : rule__Metadata__Group__1__Impl ;
    public final void rule__Metadata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2870:1: ( rule__Metadata__Group__1__Impl )
            // InternalDart.g:2871:2: rule__Metadata__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1"


    // $ANTLR start "rule__Metadata__Group__1__Impl"
    // InternalDart.g:2877:1: rule__Metadata__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Metadata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2881:1: ( ( RULE_ID ) )
            // InternalDart.g:2882:1: ( RULE_ID )
            {
            // InternalDart.g:2882:1: ( RULE_ID )
            // InternalDart.g:2883:2: RULE_ID
            {
             before(grammarAccess.getMetadataAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalDart.g:2893:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2897:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDart.g:2898:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalDart.g:2905:1: rule__Type__Group__0__Impl : ( ruleTypeName ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2909:1: ( ( ruleTypeName ) )
            // InternalDart.g:2910:1: ( ruleTypeName )
            {
            // InternalDart.g:2910:1: ( ruleTypeName )
            // InternalDart.g:2911:2: ruleTypeName
            {
             before(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalDart.g:2920:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2924:1: ( rule__Type__Group__1__Impl )
            // InternalDart.g:2925:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalDart.g:2931:1: rule__Type__Group__1__Impl : ( ( rule__Type__NullableAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2935:1: ( ( ( rule__Type__NullableAssignment_1 )? ) )
            // InternalDart.g:2936:1: ( ( rule__Type__NullableAssignment_1 )? )
            {
            // InternalDart.g:2936:1: ( ( rule__Type__NullableAssignment_1 )? )
            // InternalDart.g:2937:2: ( rule__Type__NullableAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getNullableAssignment_1()); 
            // InternalDart.g:2938:2: ( rule__Type__NullableAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDart.g:2938:3: rule__Type__NullableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__NullableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getNullableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__TypeName__Group__0"
    // InternalDart.g:2947:1: rule__TypeName__Group__0 : rule__TypeName__Group__0__Impl rule__TypeName__Group__1 ;
    public final void rule__TypeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2951:1: ( rule__TypeName__Group__0__Impl rule__TypeName__Group__1 )
            // InternalDart.g:2952:2: rule__TypeName__Group__0__Impl rule__TypeName__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TypeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group__0"


    // $ANTLR start "rule__TypeName__Group__0__Impl"
    // InternalDart.g:2959:1: rule__TypeName__Group__0__Impl : ( ( rule__TypeName__NameAssignment_0 ) ) ;
    public final void rule__TypeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2963:1: ( ( ( rule__TypeName__NameAssignment_0 ) ) )
            // InternalDart.g:2964:1: ( ( rule__TypeName__NameAssignment_0 ) )
            {
            // InternalDart.g:2964:1: ( ( rule__TypeName__NameAssignment_0 ) )
            // InternalDart.g:2965:2: ( rule__TypeName__NameAssignment_0 )
            {
             before(grammarAccess.getTypeNameAccess().getNameAssignment_0()); 
            // InternalDart.g:2966:2: ( rule__TypeName__NameAssignment_0 )
            // InternalDart.g:2966:3: rule__TypeName__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeName__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group__0__Impl"


    // $ANTLR start "rule__TypeName__Group__1"
    // InternalDart.g:2974:1: rule__TypeName__Group__1 : rule__TypeName__Group__1__Impl ;
    public final void rule__TypeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2978:1: ( rule__TypeName__Group__1__Impl )
            // InternalDart.g:2979:2: rule__TypeName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group__1"


    // $ANTLR start "rule__TypeName__Group__1__Impl"
    // InternalDart.g:2985:1: rule__TypeName__Group__1__Impl : ( ( rule__TypeName__TypeArgumentsAssignment_1 )? ) ;
    public final void rule__TypeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:2989:1: ( ( ( rule__TypeName__TypeArgumentsAssignment_1 )? ) )
            // InternalDart.g:2990:1: ( ( rule__TypeName__TypeArgumentsAssignment_1 )? )
            {
            // InternalDart.g:2990:1: ( ( rule__TypeName__TypeArgumentsAssignment_1 )? )
            // InternalDart.g:2991:2: ( rule__TypeName__TypeArgumentsAssignment_1 )?
            {
             before(grammarAccess.getTypeNameAccess().getTypeArgumentsAssignment_1()); 
            // InternalDart.g:2992:2: ( rule__TypeName__TypeArgumentsAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDart.g:2992:3: rule__TypeName__TypeArgumentsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeName__TypeArgumentsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeNameAccess().getTypeArgumentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group__1__Impl"


    // $ANTLR start "rule__TypeArguments__Group__0"
    // InternalDart.g:3001:1: rule__TypeArguments__Group__0 : rule__TypeArguments__Group__0__Impl rule__TypeArguments__Group__1 ;
    public final void rule__TypeArguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3005:1: ( rule__TypeArguments__Group__0__Impl rule__TypeArguments__Group__1 )
            // InternalDart.g:3006:2: rule__TypeArguments__Group__0__Impl rule__TypeArguments__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__TypeArguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeArguments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__0"


    // $ANTLR start "rule__TypeArguments__Group__0__Impl"
    // InternalDart.g:3013:1: rule__TypeArguments__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeArguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3017:1: ( ( '<' ) )
            // InternalDart.g:3018:1: ( '<' )
            {
            // InternalDart.g:3018:1: ( '<' )
            // InternalDart.g:3019:2: '<'
            {
             before(grammarAccess.getTypeArgumentsAccess().getLessThanSignKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTypeArgumentsAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__0__Impl"


    // $ANTLR start "rule__TypeArguments__Group__1"
    // InternalDart.g:3028:1: rule__TypeArguments__Group__1 : rule__TypeArguments__Group__1__Impl rule__TypeArguments__Group__2 ;
    public final void rule__TypeArguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3032:1: ( rule__TypeArguments__Group__1__Impl rule__TypeArguments__Group__2 )
            // InternalDart.g:3033:2: rule__TypeArguments__Group__1__Impl rule__TypeArguments__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__TypeArguments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeArguments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__1"


    // $ANTLR start "rule__TypeArguments__Group__1__Impl"
    // InternalDart.g:3040:1: rule__TypeArguments__Group__1__Impl : ( ( rule__TypeArguments__ElementsAssignment_1 ) ) ;
    public final void rule__TypeArguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3044:1: ( ( ( rule__TypeArguments__ElementsAssignment_1 ) ) )
            // InternalDart.g:3045:1: ( ( rule__TypeArguments__ElementsAssignment_1 ) )
            {
            // InternalDart.g:3045:1: ( ( rule__TypeArguments__ElementsAssignment_1 ) )
            // InternalDart.g:3046:2: ( rule__TypeArguments__ElementsAssignment_1 )
            {
             before(grammarAccess.getTypeArgumentsAccess().getElementsAssignment_1()); 
            // InternalDart.g:3047:2: ( rule__TypeArguments__ElementsAssignment_1 )
            // InternalDart.g:3047:3: rule__TypeArguments__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeArguments__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeArgumentsAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__1__Impl"


    // $ANTLR start "rule__TypeArguments__Group__2"
    // InternalDart.g:3055:1: rule__TypeArguments__Group__2 : rule__TypeArguments__Group__2__Impl rule__TypeArguments__Group__3 ;
    public final void rule__TypeArguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3059:1: ( rule__TypeArguments__Group__2__Impl rule__TypeArguments__Group__3 )
            // InternalDart.g:3060:2: rule__TypeArguments__Group__2__Impl rule__TypeArguments__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__TypeArguments__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeArguments__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__2"


    // $ANTLR start "rule__TypeArguments__Group__2__Impl"
    // InternalDart.g:3067:1: rule__TypeArguments__Group__2__Impl : ( ( rule__TypeArguments__Group_2__0 )* ) ;
    public final void rule__TypeArguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3071:1: ( ( ( rule__TypeArguments__Group_2__0 )* ) )
            // InternalDart.g:3072:1: ( ( rule__TypeArguments__Group_2__0 )* )
            {
            // InternalDart.g:3072:1: ( ( rule__TypeArguments__Group_2__0 )* )
            // InternalDart.g:3073:2: ( rule__TypeArguments__Group_2__0 )*
            {
             before(grammarAccess.getTypeArgumentsAccess().getGroup_2()); 
            // InternalDart.g:3074:2: ( rule__TypeArguments__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDart.g:3074:3: rule__TypeArguments__Group_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__TypeArguments__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTypeArgumentsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__2__Impl"


    // $ANTLR start "rule__TypeArguments__Group__3"
    // InternalDart.g:3082:1: rule__TypeArguments__Group__3 : rule__TypeArguments__Group__3__Impl ;
    public final void rule__TypeArguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3086:1: ( rule__TypeArguments__Group__3__Impl )
            // InternalDart.g:3087:2: rule__TypeArguments__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeArguments__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__3"


    // $ANTLR start "rule__TypeArguments__Group__3__Impl"
    // InternalDart.g:3093:1: rule__TypeArguments__Group__3__Impl : ( '>' ) ;
    public final void rule__TypeArguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3097:1: ( ( '>' ) )
            // InternalDart.g:3098:1: ( '>' )
            {
            // InternalDart.g:3098:1: ( '>' )
            // InternalDart.g:3099:2: '>'
            {
             before(grammarAccess.getTypeArgumentsAccess().getGreaterThanSignKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeArgumentsAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group__3__Impl"


    // $ANTLR start "rule__TypeArguments__Group_2__0"
    // InternalDart.g:3109:1: rule__TypeArguments__Group_2__0 : rule__TypeArguments__Group_2__0__Impl rule__TypeArguments__Group_2__1 ;
    public final void rule__TypeArguments__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3113:1: ( rule__TypeArguments__Group_2__0__Impl rule__TypeArguments__Group_2__1 )
            // InternalDart.g:3114:2: rule__TypeArguments__Group_2__0__Impl rule__TypeArguments__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__TypeArguments__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeArguments__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group_2__0"


    // $ANTLR start "rule__TypeArguments__Group_2__0__Impl"
    // InternalDart.g:3121:1: rule__TypeArguments__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypeArguments__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3125:1: ( ( ',' ) )
            // InternalDart.g:3126:1: ( ',' )
            {
            // InternalDart.g:3126:1: ( ',' )
            // InternalDart.g:3127:2: ','
            {
             before(grammarAccess.getTypeArgumentsAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeArgumentsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group_2__0__Impl"


    // $ANTLR start "rule__TypeArguments__Group_2__1"
    // InternalDart.g:3136:1: rule__TypeArguments__Group_2__1 : rule__TypeArguments__Group_2__1__Impl ;
    public final void rule__TypeArguments__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3140:1: ( rule__TypeArguments__Group_2__1__Impl )
            // InternalDart.g:3141:2: rule__TypeArguments__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeArguments__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group_2__1"


    // $ANTLR start "rule__TypeArguments__Group_2__1__Impl"
    // InternalDart.g:3147:1: rule__TypeArguments__Group_2__1__Impl : ( ( rule__TypeArguments__ElementsAssignment_2_1 ) ) ;
    public final void rule__TypeArguments__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3151:1: ( ( ( rule__TypeArguments__ElementsAssignment_2_1 ) ) )
            // InternalDart.g:3152:1: ( ( rule__TypeArguments__ElementsAssignment_2_1 ) )
            {
            // InternalDart.g:3152:1: ( ( rule__TypeArguments__ElementsAssignment_2_1 ) )
            // InternalDart.g:3153:2: ( rule__TypeArguments__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getTypeArgumentsAccess().getElementsAssignment_2_1()); 
            // InternalDart.g:3154:2: ( rule__TypeArguments__ElementsAssignment_2_1 )
            // InternalDart.g:3154:3: rule__TypeArguments__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeArguments__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeArgumentsAccess().getElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__Group_2__1__Impl"


    // $ANTLR start "rule__CompilationUnit__ScriptTagAssignment_0"
    // InternalDart.g:3163:1: rule__CompilationUnit__ScriptTagAssignment_0 : ( ruleScriptTag ) ;
    public final void rule__CompilationUnit__ScriptTagAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3167:1: ( ( ruleScriptTag ) )
            // InternalDart.g:3168:2: ( ruleScriptTag )
            {
            // InternalDart.g:3168:2: ( ruleScriptTag )
            // InternalDart.g:3169:3: ruleScriptTag
            {
             before(grammarAccess.getCompilationUnitAccess().getScriptTagScriptTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleScriptTag();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getScriptTagScriptTagParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__ScriptTagAssignment_0"


    // $ANTLR start "rule__CompilationUnit__LibraryNameAssignment_1"
    // InternalDart.g:3178:1: rule__CompilationUnit__LibraryNameAssignment_1 : ( ruleLibraryName ) ;
    public final void rule__CompilationUnit__LibraryNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3182:1: ( ( ruleLibraryName ) )
            // InternalDart.g:3183:2: ( ruleLibraryName )
            {
            // InternalDart.g:3183:2: ( ruleLibraryName )
            // InternalDart.g:3184:3: ruleLibraryName
            {
             before(grammarAccess.getCompilationUnitAccess().getLibraryNameLibraryNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLibraryName();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getLibraryNameLibraryNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__LibraryNameAssignment_1"


    // $ANTLR start "rule__CompilationUnit__DirectivesAssignment_2"
    // InternalDart.g:3193:1: rule__CompilationUnit__DirectivesAssignment_2 : ( ruleImportOrExport ) ;
    public final void rule__CompilationUnit__DirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3197:1: ( ( ruleImportOrExport ) )
            // InternalDart.g:3198:2: ( ruleImportOrExport )
            {
            // InternalDart.g:3198:2: ( ruleImportOrExport )
            // InternalDart.g:3199:3: ruleImportOrExport
            {
             before(grammarAccess.getCompilationUnitAccess().getDirectivesImportOrExportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImportOrExport();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getDirectivesImportOrExportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__DirectivesAssignment_2"


    // $ANTLR start "rule__CompilationUnit__PartDirectivesAssignment_3"
    // InternalDart.g:3208:1: rule__CompilationUnit__PartDirectivesAssignment_3 : ( rulePartDirective ) ;
    public final void rule__CompilationUnit__PartDirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3212:1: ( ( rulePartDirective ) )
            // InternalDart.g:3213:2: ( rulePartDirective )
            {
            // InternalDart.g:3213:2: ( rulePartDirective )
            // InternalDart.g:3214:3: rulePartDirective
            {
             before(grammarAccess.getCompilationUnitAccess().getPartDirectivesPartDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePartDirective();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getPartDirectivesPartDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__PartDirectivesAssignment_3"


    // $ANTLR start "rule__CompilationUnit__DeclarationsAssignment_4"
    // InternalDart.g:3223:1: rule__CompilationUnit__DeclarationsAssignment_4 : ( ruleTopLevelDeclaration ) ;
    public final void rule__CompilationUnit__DeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3227:1: ( ( ruleTopLevelDeclaration ) )
            // InternalDart.g:3228:2: ( ruleTopLevelDeclaration )
            {
            // InternalDart.g:3228:2: ( ruleTopLevelDeclaration )
            // InternalDart.g:3229:3: ruleTopLevelDeclaration
            {
             before(grammarAccess.getCompilationUnitAccess().getDeclarationsTopLevelDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTopLevelDeclaration();

            state._fsp--;

             after(grammarAccess.getCompilationUnitAccess().getDeclarationsTopLevelDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompilationUnit__DeclarationsAssignment_4"


    // $ANTLR start "rule__ScriptTag__ContentAssignment"
    // InternalDart.g:3238:1: rule__ScriptTag__ContentAssignment : ( RULE_SCRIPT_TAG ) ;
    public final void rule__ScriptTag__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3242:1: ( ( RULE_SCRIPT_TAG ) )
            // InternalDart.g:3243:2: ( RULE_SCRIPT_TAG )
            {
            // InternalDart.g:3243:2: ( RULE_SCRIPT_TAG )
            // InternalDart.g:3244:3: RULE_SCRIPT_TAG
            {
             before(grammarAccess.getScriptTagAccess().getContentSCRIPT_TAGTerminalRuleCall_0()); 
            match(input,RULE_SCRIPT_TAG,FOLLOW_2); 
             after(grammarAccess.getScriptTagAccess().getContentSCRIPT_TAGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScriptTag__ContentAssignment"


    // $ANTLR start "rule__LibraryName__NameAssignment_1"
    // InternalDart.g:3253:1: rule__LibraryName__NameAssignment_1 : ( ruleDottedIdentifier ) ;
    public final void rule__LibraryName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3257:1: ( ( ruleDottedIdentifier ) )
            // InternalDart.g:3258:2: ( ruleDottedIdentifier )
            {
            // InternalDart.g:3258:2: ( ruleDottedIdentifier )
            // InternalDart.g:3259:3: ruleDottedIdentifier
            {
             before(grammarAccess.getLibraryNameAccess().getNameDottedIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDottedIdentifier();

            state._fsp--;

             after(grammarAccess.getLibraryNameAccess().getNameDottedIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryName__NameAssignment_1"


    // $ANTLR start "rule__LibraryImport__ImportURIAssignment_1"
    // InternalDart.g:3268:1: rule__LibraryImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LibraryImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3272:1: ( ( RULE_STRING ) )
            // InternalDart.g:3273:2: ( RULE_STRING )
            {
            // InternalDart.g:3273:2: ( RULE_STRING )
            // InternalDart.g:3274:3: RULE_STRING
            {
             before(grammarAccess.getLibraryImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLibraryImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__ImportURIAssignment_1"


    // $ANTLR start "rule__LibraryImport__AliasAssignment_2_1"
    // InternalDart.g:3283:1: rule__LibraryImport__AliasAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__LibraryImport__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3287:1: ( ( RULE_ID ) )
            // InternalDart.g:3288:2: ( RULE_ID )
            {
            // InternalDart.g:3288:2: ( RULE_ID )
            // InternalDart.g:3289:3: RULE_ID
            {
             before(grammarAccess.getLibraryImportAccess().getAliasIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLibraryImportAccess().getAliasIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryImport__AliasAssignment_2_1"


    // $ANTLR start "rule__LibraryExport__ExportURIAssignment_1"
    // InternalDart.g:3298:1: rule__LibraryExport__ExportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LibraryExport__ExportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3302:1: ( ( RULE_STRING ) )
            // InternalDart.g:3303:2: ( RULE_STRING )
            {
            // InternalDart.g:3303:2: ( RULE_STRING )
            // InternalDart.g:3304:3: RULE_STRING
            {
             before(grammarAccess.getLibraryExportAccess().getExportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLibraryExportAccess().getExportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryExport__ExportURIAssignment_1"


    // $ANTLR start "rule__PartDirective__PartURIAssignment_1"
    // InternalDart.g:3313:1: rule__PartDirective__PartURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PartDirective__PartURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3317:1: ( ( RULE_STRING ) )
            // InternalDart.g:3318:2: ( RULE_STRING )
            {
            // InternalDart.g:3318:2: ( RULE_STRING )
            // InternalDart.g:3319:3: RULE_STRING
            {
             before(grammarAccess.getPartDirectiveAccess().getPartURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPartDirectiveAccess().getPartURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDirective__PartURIAssignment_1"


    // $ANTLR start "rule__ClassDeclaration__MetadataAssignment_0"
    // InternalDart.g:3328:1: rule__ClassDeclaration__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__ClassDeclaration__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3332:1: ( ( ruleMetadata ) )
            // InternalDart.g:3333:2: ( ruleMetadata )
            {
            // InternalDart.g:3333:2: ( ruleMetadata )
            // InternalDart.g:3334:3: ruleMetadata
            {
             before(grammarAccess.getClassDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__MetadataAssignment_0"


    // $ANTLR start "rule__ClassDeclaration__NameAssignment_2"
    // InternalDart.g:3343:1: rule__ClassDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3347:1: ( ( RULE_ID ) )
            // InternalDart.g:3348:2: ( RULE_ID )
            {
            // InternalDart.g:3348:2: ( RULE_ID )
            // InternalDart.g:3349:3: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__NameAssignment_2"


    // $ANTLR start "rule__MixinDeclaration__MetadataAssignment_0"
    // InternalDart.g:3358:1: rule__MixinDeclaration__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__MixinDeclaration__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3362:1: ( ( ruleMetadata ) )
            // InternalDart.g:3363:2: ( ruleMetadata )
            {
            // InternalDart.g:3363:2: ( ruleMetadata )
            // InternalDart.g:3364:3: ruleMetadata
            {
             before(grammarAccess.getMixinDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getMixinDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__MetadataAssignment_0"


    // $ANTLR start "rule__MixinDeclaration__NameAssignment_2"
    // InternalDart.g:3373:1: rule__MixinDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MixinDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3377:1: ( ( RULE_ID ) )
            // InternalDart.g:3378:2: ( RULE_ID )
            {
            // InternalDart.g:3378:2: ( RULE_ID )
            // InternalDart.g:3379:3: RULE_ID
            {
             before(grammarAccess.getMixinDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMixinDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixinDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ExtensionDeclaration__MetadataAssignment_0"
    // InternalDart.g:3388:1: rule__ExtensionDeclaration__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__ExtensionDeclaration__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3392:1: ( ( ruleMetadata ) )
            // InternalDart.g:3393:2: ( ruleMetadata )
            {
            // InternalDart.g:3393:2: ( ruleMetadata )
            // InternalDart.g:3394:3: ruleMetadata
            {
             before(grammarAccess.getExtensionDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getExtensionDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__MetadataAssignment_0"


    // $ANTLR start "rule__ExtensionDeclaration__NameAssignment_2"
    // InternalDart.g:3403:1: rule__ExtensionDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExtensionDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3407:1: ( ( RULE_ID ) )
            // InternalDart.g:3408:2: ( RULE_ID )
            {
            // InternalDart.g:3408:2: ( RULE_ID )
            // InternalDart.g:3409:3: RULE_ID
            {
             before(grammarAccess.getExtensionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtensionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionDeclaration__NameAssignment_2"


    // $ANTLR start "rule__EnumDeclaration__MetadataAssignment_0"
    // InternalDart.g:3418:1: rule__EnumDeclaration__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__EnumDeclaration__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3422:1: ( ( ruleMetadata ) )
            // InternalDart.g:3423:2: ( ruleMetadata )
            {
            // InternalDart.g:3423:2: ( ruleMetadata )
            // InternalDart.g:3424:3: ruleMetadata
            {
             before(grammarAccess.getEnumDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__MetadataAssignment_0"


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_2"
    // InternalDart.g:3433:1: rule__EnumDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3437:1: ( ( RULE_ID ) )
            // InternalDart.g:3438:2: ( RULE_ID )
            {
            // InternalDart.g:3438:2: ( RULE_ID )
            // InternalDart.g:3439:3: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_2"


    // $ANTLR start "rule__TypeAlias__MetadataAssignment_0"
    // InternalDart.g:3448:1: rule__TypeAlias__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__TypeAlias__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3452:1: ( ( ruleMetadata ) )
            // InternalDart.g:3453:2: ( ruleMetadata )
            {
            // InternalDart.g:3453:2: ( ruleMetadata )
            // InternalDart.g:3454:3: ruleMetadata
            {
             before(grammarAccess.getTypeAliasAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getTypeAliasAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__MetadataAssignment_0"


    // $ANTLR start "rule__TypeAlias__NameAssignment_2"
    // InternalDart.g:3463:1: rule__TypeAlias__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TypeAlias__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3467:1: ( ( RULE_ID ) )
            // InternalDart.g:3468:2: ( RULE_ID )
            {
            // InternalDart.g:3468:2: ( RULE_ID )
            // InternalDart.g:3469:3: RULE_ID
            {
             before(grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAliasAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAlias__NameAssignment_2"


    // $ANTLR start "rule__FunctionDeclaration__MetadataAssignment_0"
    // InternalDart.g:3478:1: rule__FunctionDeclaration__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__FunctionDeclaration__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3482:1: ( ( ruleMetadata ) )
            // InternalDart.g:3483:2: ( ruleMetadata )
            {
            // InternalDart.g:3483:2: ( ruleMetadata )
            // InternalDart.g:3484:3: ruleMetadata
            {
             before(grammarAccess.getFunctionDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__MetadataAssignment_0"


    // $ANTLR start "rule__FunctionDeclaration__ExternalAssignment_1"
    // InternalDart.g:3493:1: rule__FunctionDeclaration__ExternalAssignment_1 : ( ( 'external' ) ) ;
    public final void rule__FunctionDeclaration__ExternalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3497:1: ( ( ( 'external' ) ) )
            // InternalDart.g:3498:2: ( ( 'external' ) )
            {
            // InternalDart.g:3498:2: ( ( 'external' ) )
            // InternalDart.g:3499:3: ( 'external' )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getExternalExternalKeyword_1_0()); 
            // InternalDart.g:3500:3: ( 'external' )
            // InternalDart.g:3501:4: 'external'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getExternalExternalKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getExternalExternalKeyword_1_0()); 

            }

             after(grammarAccess.getFunctionDeclarationAccess().getExternalExternalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ExternalAssignment_1"


    // $ANTLR start "rule__FunctionDeclaration__ReturnTypeAssignment_2"
    // InternalDart.g:3512:1: rule__FunctionDeclaration__ReturnTypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3516:1: ( ( RULE_ID ) )
            // InternalDart.g:3517:2: ( RULE_ID )
            {
            // InternalDart.g:3517:2: ( RULE_ID )
            // InternalDart.g:3518:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getReturnTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getReturnTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ReturnTypeAssignment_2"


    // $ANTLR start "rule__FunctionDeclaration__NameAssignment_3"
    // InternalDart.g:3527:1: rule__FunctionDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3531:1: ( ( RULE_ID ) )
            // InternalDart.g:3532:2: ( RULE_ID )
            {
            // InternalDart.g:3532:2: ( RULE_ID )
            // InternalDart.g:3533:3: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__NameAssignment_3"


    // $ANTLR start "rule__FunctionDeclaration__BodyAssignment_6_0"
    // InternalDart.g:3542:1: rule__FunctionDeclaration__BodyAssignment_6_0 : ( ruleFunctionBody ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3546:1: ( ( ruleFunctionBody ) )
            // InternalDart.g:3547:2: ( ruleFunctionBody )
            {
            // InternalDart.g:3547:2: ( ruleFunctionBody )
            // InternalDart.g:3548:3: ruleFunctionBody
            {
             before(grammarAccess.getFunctionDeclarationAccess().getBodyFunctionBodyParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getBodyFunctionBodyParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__BodyAssignment_6_0"


    // $ANTLR start "rule__VariableDeclaration__MetadataAssignment_0"
    // InternalDart.g:3557:1: rule__VariableDeclaration__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__VariableDeclaration__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3561:1: ( ( ruleMetadata ) )
            // InternalDart.g:3562:2: ( ruleMetadata )
            {
            // InternalDart.g:3562:2: ( ruleMetadata )
            // InternalDart.g:3563:3: ruleMetadata
            {
             before(grammarAccess.getVariableDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__MetadataAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__LateAssignment_1"
    // InternalDart.g:3572:1: rule__VariableDeclaration__LateAssignment_1 : ( ( 'late' ) ) ;
    public final void rule__VariableDeclaration__LateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3576:1: ( ( ( 'late' ) ) )
            // InternalDart.g:3577:2: ( ( 'late' ) )
            {
            // InternalDart.g:3577:2: ( ( 'late' ) )
            // InternalDart.g:3578:3: ( 'late' )
            {
             before(grammarAccess.getVariableDeclarationAccess().getLateLateKeyword_1_0()); 
            // InternalDart.g:3579:3: ( 'late' )
            // InternalDart.g:3580:4: 'late'
            {
             before(grammarAccess.getVariableDeclarationAccess().getLateLateKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getLateLateKeyword_1_0()); 

            }

             after(grammarAccess.getVariableDeclarationAccess().getLateLateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__LateAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ModifierAssignment_2_0_0"
    // InternalDart.g:3591:1: rule__VariableDeclaration__ModifierAssignment_2_0_0 : ( ruleVariableModifier ) ;
    public final void rule__VariableDeclaration__ModifierAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3595:1: ( ( ruleVariableModifier ) )
            // InternalDart.g:3596:2: ( ruleVariableModifier )
            {
            // InternalDart.g:3596:2: ( ruleVariableModifier )
            // InternalDart.g:3597:3: ruleVariableModifier
            {
             before(grammarAccess.getVariableDeclarationAccess().getModifierVariableModifierParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableModifier();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getModifierVariableModifierParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ModifierAssignment_2_0_0"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_2_0_1"
    // InternalDart.g:3606:1: rule__VariableDeclaration__TypeAssignment_2_0_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3610:1: ( ( ruleType ) )
            // InternalDart.g:3611:2: ( ruleType )
            {
            // InternalDart.g:3611:2: ( ruleType )
            // InternalDart.g:3612:3: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_2_0_1"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_2_1"
    // InternalDart.g:3621:1: rule__VariableDeclaration__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3625:1: ( ( ruleType ) )
            // InternalDart.g:3626:2: ( ruleType )
            {
            // InternalDart.g:3626:2: ( ruleType )
            // InternalDart.g:3627:3: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_2_1"


    // $ANTLR start "rule__VariableDeclaration__VariablesAssignment_3"
    // InternalDart.g:3636:1: rule__VariableDeclaration__VariablesAssignment_3 : ( ruleVariableSingleDeclaration ) ;
    public final void rule__VariableDeclaration__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3640:1: ( ( ruleVariableSingleDeclaration ) )
            // InternalDart.g:3641:2: ( ruleVariableSingleDeclaration )
            {
            // InternalDart.g:3641:2: ( ruleVariableSingleDeclaration )
            // InternalDart.g:3642:3: ruleVariableSingleDeclaration
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariablesVariableSingleDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableSingleDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getVariablesVariableSingleDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__VariablesAssignment_3"


    // $ANTLR start "rule__VariableDeclaration__VariablesAssignment_4_1"
    // InternalDart.g:3651:1: rule__VariableDeclaration__VariablesAssignment_4_1 : ( ruleVariableSingleDeclaration ) ;
    public final void rule__VariableDeclaration__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3655:1: ( ( ruleVariableSingleDeclaration ) )
            // InternalDart.g:3656:2: ( ruleVariableSingleDeclaration )
            {
            // InternalDart.g:3656:2: ( ruleVariableSingleDeclaration )
            // InternalDart.g:3657:3: ruleVariableSingleDeclaration
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariablesVariableSingleDeclarationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableSingleDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getVariablesVariableSingleDeclarationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__VariablesAssignment_4_1"


    // $ANTLR start "rule__VariableSingleDeclaration__NameAssignment_0"
    // InternalDart.g:3666:1: rule__VariableSingleDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableSingleDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3670:1: ( ( RULE_ID ) )
            // InternalDart.g:3671:2: ( RULE_ID )
            {
            // InternalDart.g:3671:2: ( RULE_ID )
            // InternalDart.g:3672:3: RULE_ID
            {
             before(grammarAccess.getVariableSingleDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableSingleDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VariableSingleDeclaration__InitialValueAssignment_1_1"
    // InternalDart.g:3681:1: rule__VariableSingleDeclaration__InitialValueAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableSingleDeclaration__InitialValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3685:1: ( ( ruleExpression ) )
            // InternalDart.g:3686:2: ( ruleExpression )
            {
            // InternalDart.g:3686:2: ( ruleExpression )
            // InternalDart.g:3687:3: ruleExpression
            {
             before(grammarAccess.getVariableSingleDeclarationAccess().getInitialValueExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableSingleDeclarationAccess().getInitialValueExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSingleDeclaration__InitialValueAssignment_1_1"


    // $ANTLR start "rule__Type__NullableAssignment_1"
    // InternalDart.g:3696:1: rule__Type__NullableAssignment_1 : ( ( '?' ) ) ;
    public final void rule__Type__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3700:1: ( ( ( '?' ) ) )
            // InternalDart.g:3701:2: ( ( '?' ) )
            {
            // InternalDart.g:3701:2: ( ( '?' ) )
            // InternalDart.g:3702:3: ( '?' )
            {
             before(grammarAccess.getTypeAccess().getNullableQuestionMarkKeyword_1_0()); 
            // InternalDart.g:3703:3: ( '?' )
            // InternalDart.g:3704:4: '?'
            {
             before(grammarAccess.getTypeAccess().getNullableQuestionMarkKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNullableQuestionMarkKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getNullableQuestionMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NullableAssignment_1"


    // $ANTLR start "rule__TypeName__NameAssignment_0"
    // InternalDart.g:3715:1: rule__TypeName__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypeName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3719:1: ( ( RULE_ID ) )
            // InternalDart.g:3720:2: ( RULE_ID )
            {
            // InternalDart.g:3720:2: ( RULE_ID )
            // InternalDart.g:3721:3: RULE_ID
            {
             before(grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__NameAssignment_0"


    // $ANTLR start "rule__TypeName__TypeArgumentsAssignment_1"
    // InternalDart.g:3730:1: rule__TypeName__TypeArgumentsAssignment_1 : ( ruleTypeArguments ) ;
    public final void rule__TypeName__TypeArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3734:1: ( ( ruleTypeArguments ) )
            // InternalDart.g:3735:2: ( ruleTypeArguments )
            {
            // InternalDart.g:3735:2: ( ruleTypeArguments )
            // InternalDart.g:3736:3: ruleTypeArguments
            {
             before(grammarAccess.getTypeNameAccess().getTypeArgumentsTypeArgumentsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeArguments();

            state._fsp--;

             after(grammarAccess.getTypeNameAccess().getTypeArgumentsTypeArgumentsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__TypeArgumentsAssignment_1"


    // $ANTLR start "rule__TypeArguments__ElementsAssignment_1"
    // InternalDart.g:3745:1: rule__TypeArguments__ElementsAssignment_1 : ( ruleType ) ;
    public final void rule__TypeArguments__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3749:1: ( ( ruleType ) )
            // InternalDart.g:3750:2: ( ruleType )
            {
            // InternalDart.g:3750:2: ( ruleType )
            // InternalDart.g:3751:3: ruleType
            {
             before(grammarAccess.getTypeArgumentsAccess().getElementsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeArgumentsAccess().getElementsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__ElementsAssignment_1"


    // $ANTLR start "rule__TypeArguments__ElementsAssignment_2_1"
    // InternalDart.g:3760:1: rule__TypeArguments__ElementsAssignment_2_1 : ( ruleType ) ;
    public final void rule__TypeArguments__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDart.g:3764:1: ( ( ruleType ) )
            // InternalDart.g:3765:2: ( ruleType )
            {
            // InternalDart.g:3765:2: ( ruleType )
            // InternalDart.g:3766:3: ruleType
            {
             before(grammarAccess.getTypeArgumentsAccess().getElementsTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeArgumentsAccess().getElementsTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeArguments__ElementsAssignment_2_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\2\4\6\uffff\1\4\1\uffff\1\4\1\14";
    static final String dfa_3s = "\1\46\1\4\6\uffff\1\47\1\uffff\1\46\1\41";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\2\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\10\uffff\3\11\6\uffff\1\2\2\uffff\1\3\1\4\1\uffff\1\5\1\6\4\uffff\1\1\2\uffff\1\7\1\11",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\32\uffff\1\7\3\uffff\1\11\3\uffff\1\11",
            "",
            "\1\10\10\uffff\3\11\6\uffff\1\2\2\uffff\1\3\1\4\1\uffff\1\5\1\6\4\uffff\1\1\2\uffff\1\7\1\11",
            "\1\11\21\uffff\1\11\1\7\1\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "673:1: rule__TopLevelDeclaration__Alternatives : ( ( ruleClassDeclaration ) | ( ruleMixinDeclaration ) | ( ruleExtensionDeclaration ) | ( ruleEnumDeclaration ) | ( ruleTypeAlias ) | ( ruleFunctionDeclaration ) | ( ruleVariableDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000643675E010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000643640E012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002400000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000643640E010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001200000000L});

}