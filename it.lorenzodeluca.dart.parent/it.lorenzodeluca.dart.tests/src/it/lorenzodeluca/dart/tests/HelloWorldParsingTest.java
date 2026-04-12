package it.lorenzodeluca.dart.tests;

import com.google.inject.Inject;
import it.lorenzodeluca.dart.dart.LibraryDeclaration;
import it.lorenzodeluca.dart.dart.TopLevelDeclaration;
import it.lorenzodeluca.dart.dart.DartFile;
import it.lorenzodeluca.dart.dart.FunctionDeclaration;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DartInjectorProvider.class) 
public class HelloWorldParsingTest {

    @Inject
    private ParseHelper<DartFile> parseHelper;

    @Test
    public void testHelloWorldParsing() throws Exception {
        // Il classico Hello World in Dart (Capitolo 9 & 19 della specifica)
        String dartCode = 
            "void main() {\n" +
            "  print('Hello, World!');\n" +
            "}";

        DartFile result = parseHelper.parse(dartCode);

        // 1. Verifica che non ci siano errori sintattici
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty(), 
            "Il parsing ha prodotto errori: " + result.eResource().getErrors());

        // 2. Navigazione dell'AST (Abstract Syntax Tree)
        // In base alla tua grammatica, un DartFile è una LibraryDeclaration
        Assertions.assertTrue(result instanceof LibraryDeclaration);
        LibraryDeclaration lib = (LibraryDeclaration) result;

        // Recuperiamo la prima dichiarazione top-level
        TopLevelDeclaration topLevel = lib.getDeclarations().get(0);
        
        // Verifichiamo che sia una funzione (la funzione main)
        Assertions.assertTrue(topLevel instanceof FunctionDeclaration);
        FunctionDeclaration mainFunc = (FunctionDeclaration) topLevel;     
        
        Assertions.assertEquals("main", mainFunc.getName());
        Assertions.assertEquals("void", mainFunc.getReturnType().getTypeName().getName());
    }

    @Test
    public void testParsingError() throws Exception {
        // Test volutamente errato (manca la chiusura della graffa)
        String badCode = "void main() { print('Error'); ";
        
        DartFile result = parseHelper.parse(badCode);
        
        Assertions.assertFalse(result.eResource().getErrors().isEmpty(), 
            "Il parser avrebbe dovuto rilevare un errore di sintassi.");
    }
}