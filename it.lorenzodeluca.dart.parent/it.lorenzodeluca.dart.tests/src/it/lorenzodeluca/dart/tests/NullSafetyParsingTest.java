package it.lorenzodeluca.dart.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.google.inject.Inject;

import it.lorenzodeluca.dart.dart.CompilationUnit;

@ExtendWith(InjectionExtension.class)
@InjectWith(DartInjectorProvider.class)
public class NullSafetyParsingTest {

    @Inject
    private ParseHelper<CompilationUnit> parseHelper;

    @Test
    void testSimpleNullableType() throws Exception {
        // Dichiarazione variabile con tipo nullabile
        CompilationUnit result = parseHelper.parse("int? a;");
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty(), 
            "Il parser dovrebbe accettare 'int? a;' senza errori.");
    }

    @Test
    void testNestedGenericNullability() throws Exception {
        //  Null Safety annidato
        CompilationUnit result = parseHelper.parse("List<String?>? names;");
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty(), 
            "Il parser dovrebbe gestire correttamente i ? annidati nei Generics.");
    }

    @Test
    void testLateNullableVariable() throws Exception {
        // Verifica la combinazione di modificatori (§8) e null safety
        CompilationUnit result = parseHelper.parse("late String? description;");
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty());
    }
}