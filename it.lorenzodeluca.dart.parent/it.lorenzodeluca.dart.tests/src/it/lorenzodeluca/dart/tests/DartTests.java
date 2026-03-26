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
import it.lorenzodeluca.dart.dart.FunctionDeclaration;
import it.lorenzodeluca.dart.dart.LibraryDeclaration;
import it.lorenzodeluca.dart.dart.TopLevelDeclaration;
import org.eclipse.xtext.util.EmfFormatter;

@ExtendWith(InjectionExtension.class)
@InjectWith(DartInjectorProvider.class)
public class DartTests {
	
    @Inject
    private ParseHelper<DartFile> parseHelper;
	
    @Test
    void testHelloWorldFunction() throws Exception {
        // 1. Parse a standard Dart main function
        String code = "void main() { print('Hello World'); }";
        DartFile result = parseHelper.parse(code);
        
        // Debug: Print AST to console
        System.out.println(EmfFormatter.objToStr(result));

        // 2. Basic validation
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty(), 
            "Parser errors found: " + result.eResource().getErrors());
	
        // 3. Navigate the AST based on your updated grammar
        // DartFile -> LibraryDeclaration -> declarations (list)
        LibraryDeclaration library = (LibraryDeclaration) result;
        TopLevelDeclaration firstDecl = library.getDeclarations().get(0);
        
        // In this grammar version, TopLevelDeclaration IS the FunctionDeclaration
        Assertions.assertTrue(firstDecl instanceof FunctionDeclaration, "Expected FunctionDeclaration");
        FunctionDeclaration mainFunc = (FunctionDeclaration) firstDecl;
	
        // 4. Verify function details
        Assertions.assertEquals("main", mainFunc.getName());
        Assertions.assertEquals("void", mainFunc.getReturnType().getTypeName().getName());
	    
        // 5. Verify body structure
        Assertions.assertNotNull(mainFunc.getBody().getBlock(), "Main should have a { } block");
        Block body = mainFunc.getBody().getBlock();
        Assertions.assertFalse(body.getStatements().isEmpty(), "Body should not be empty");
    }
}