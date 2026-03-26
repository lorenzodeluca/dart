package it.lorenzodeluca.dart.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.google.inject.Inject;

import it.lorenzodeluca.dart.dart.Block;
import it.lorenzodeluca.dart.dart.DartFile;
import it.lorenzodeluca.dart.dart.ExpressionStatement;
import it.lorenzodeluca.dart.dart.FunctionCall;
import it.lorenzodeluca.dart.dart.FunctionDeclaration;
import it.lorenzodeluca.dart.dart.IdentifierRef;
import it.lorenzodeluca.dart.dart.LibraryDeclaration;
import it.lorenzodeluca.dart.dart.NonLabelledStatement;
import it.lorenzodeluca.dart.dart.ReturnStatement;
import it.lorenzodeluca.dart.dart.StringLiteral;
import it.lorenzodeluca.dart.dart.TopLevelDeclaration;
import it.lorenzodeluca.dart.dart.VariableDeclaration;

import org.eclipse.xtext.util.EmfFormatter;

@ExtendWith(InjectionExtension.class)
@InjectWith(DartInjectorProvider.class)
public class DartTests {
	
    @Inject
    private ParseHelper<DartFile> parseHelper;
	
    @Test
    void testFunctionVsVariableAmbiguity() throws Exception {
        String code = 
            "String foo;\n" +
            "String bar() { return 'hello'; }\n";
        
        DartFile result = parseHelper.parse(code);
        System.out.println(EmfFormatter.objToStr(result));
        
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty(),
            "Parser errors: " + result.eResource().getErrors());
        
        LibraryDeclaration library = (LibraryDeclaration) result;
        Assertions.assertEquals(2, library.getDeclarations().size(),
            "Dovrebbero esserci 2 dichiarazioni top-level");
        
        // Prima dichiarazione: variabile String foo
        TopLevelDeclaration firstDecl = library.getDeclarations().get(0);
        Assertions.assertInstanceOf(VariableDeclaration.class, firstDecl,
            "La prima dichiarazione dovrebbe essere una VariableDeclaration");
        VariableDeclaration varDecl = (VariableDeclaration) firstDecl;
        Assertions.assertEquals("foo", varDecl.getVariables().get(0).getName());
        Assertions.assertEquals("String", varDecl.getType().getTypeName().getName());
        
        // Seconda dichiarazione: funzione String bar()
        TopLevelDeclaration secondDecl = library.getDeclarations().get(1);
        Assertions.assertInstanceOf(FunctionDeclaration.class, secondDecl,
            "La seconda dichiarazione dovrebbe essere una FunctionDeclaration");
        FunctionDeclaration funcDecl = (FunctionDeclaration) secondDecl;
        Assertions.assertEquals("bar", funcDecl.getName());
        Assertions.assertEquals("String", funcDecl.getReturnType().getTypeName().getName());
        
        // Verifica body della funzione
        Block body = funcDecl.getBody().getBlock();
        Assertions.assertNotNull(body);
        Assertions.assertFalse(body.getStatements().isEmpty());
        
        // Verifica return 'hello'
        NonLabelledStatement stmt = body.getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(ReturnStatement.class, stmt);
        ReturnStatement returnStmt = (ReturnStatement) stmt;
        Assertions.assertInstanceOf(StringLiteral.class, returnStmt.getExpression());
        Assertions.assertEquals("hello", 
            ((StringLiteral) returnStmt.getExpression()).getStringValue());
    }
    
    @Test
    void testHelloWorldFunction() throws Exception {
        String code = "void main() { print('Hello World'); }";
        DartFile result = parseHelper.parse(code);

        // DEBUG Print AST to console
        System.out.println(EmfFormatter.objToStr(result));

        
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty(),
            "Parser errors: " + result.eResource().getErrors());

        LibraryDeclaration library = (LibraryDeclaration) result;
        TopLevelDeclaration firstDecl = library.getDeclarations().get(0);

        // Verifica FunctionDeclaration
        Assertions.assertInstanceOf(FunctionDeclaration.class, firstDecl);
        FunctionDeclaration mainFunc = (FunctionDeclaration) firstDecl;
        Assertions.assertEquals("main", mainFunc.getName());
        
        if (mainFunc.getReturnType() != null) {//void doesnt get parsed so for xtext the return type is null
            Assertions.assertEquals("void", mainFunc.getReturnType().getTypeName().getName());
        }
        
        // Verifica body
        Block body = mainFunc.getBody().getBlock();
        Assertions.assertNotNull(body);
        Assertions.assertFalse(body.getStatements().isEmpty());

        // Verifica print('Hello World')
        NonLabelledStatement stmt = body.getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(ExpressionStatement.class, stmt);
        ExpressionStatement exprStmt = (ExpressionStatement) stmt;

        Assertions.assertInstanceOf(FunctionCall.class, exprStmt.getExpression());
        FunctionCall call = (FunctionCall) exprStmt.getExpression();

        Assertions.assertInstanceOf(IdentifierRef.class, call.getReceiver());
        Assertions.assertEquals("print", ((IdentifierRef) call.getReceiver()).getName());

        Assertions.assertEquals(1, call.getArgs().getArguments().size());
        Assertions.assertInstanceOf(StringLiteral.class, call.getArgs().getArguments().get(0));
        Assertions.assertEquals("Hello World",
            ((StringLiteral) call.getArgs().getArguments().get(0)).getStringValue());
    }
    
    @Test
    void testDebugReturnType() throws Exception {
        DartFile result = parseHelper.parse("void main() {}");
        System.out.println(EmfFormatter.objToStr(result));
        
        LibraryDeclaration library = (LibraryDeclaration) result;
        FunctionDeclaration func = (FunctionDeclaration) library.getDeclarations().get(0);
        
        System.out.println("name: " + func.getName());
        System.out.println("returnType: " + func.getReturnType());
        System.out.println("errors: " + result.eResource().getErrors());
    }
    
    /*
      @Test
     
    void testDebugParsing() throws Exception {
        // Test 1: funzione senza return type
        DartFile r1 = parseHelper.parse("main() {}");
        System.out.println("=== main() {} ===");
        System.out.println(EmfFormatter.objToStr(r1));
        System.out.println("Errors: " + r1.eResource().getErrors());

        // Test 2: funzione con keyword type
        DartFile r2 = parseHelper.parse("void main() {}");
        System.out.println("=== void main() {} ===");
        System.out.println(EmfFormatter.objToStr(r2));
        System.out.println("Errors: " + r2.eResource().getErrors());

        // Test 3: solo void
        DartFile r3 = parseHelper.parse("void main() { print('Hello'); }");
        System.out.println("=== void main() { print('Hello'); } ===");
        System.out.println(EmfFormatter.objToStr(r3));
        System.out.println("Errors: " + r3.eResource().getErrors());
    }
    */
}