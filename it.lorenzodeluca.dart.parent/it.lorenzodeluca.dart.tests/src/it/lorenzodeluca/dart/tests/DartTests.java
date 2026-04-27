//TODO: add to the tests all the examples I find on the official dart tutorials for all the language functions

package it.lorenzodeluca.dart.tests;

import com.google.inject.Inject;
import it.lorenzodeluca.dart.dart.*;
import org.eclipse.xtext.testing.InjectWith;
import it.lorenzodeluca.dart.tests.DartInjectorProvider;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.util.EmfFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import it.lorenzodeluca.dart.dart.*;

@ExtendWith(InjectionExtension.class)
@InjectWith(DartInjectorProvider.class)
public class DartTests {

    @Inject
    private ParseHelper<DartFile> parseHelper;

    // =========================================================================
    // HELPER
    // =========================================================================

    private LibraryDeclaration parseLibrary(String code) throws Exception {
        DartFile result = parseHelper.parse(code);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.eResource().getErrors().isEmpty(),
            "Parser errors: " + result.eResource().getErrors());
        Assertions.assertInstanceOf(LibraryDeclaration.class, result);
        return (LibraryDeclaration) result;
    }

    // =========================================================================
    // 8. VARIABLES
    // =========================================================================

    @Test
    void testSimpleVariableDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary("String foo;");
        Assertions.assertEquals(1, lib.getDeclarations().size());
        TopLevelDeclaration decl = lib.getDeclarations().get(0);
        Assertions.assertInstanceOf(VariableDeclaration.class, decl);
        VariableDeclaration varDecl = (VariableDeclaration) decl;
        Assertions.assertEquals("foo", varDecl.getVariables().get(0).getName());
        Assertions.assertEquals("String", ((InitializedIdentifier) varDecl.getType()).getName());
    }

    @Test
    void testLateVariableDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary("late String foo;");
        VariableDeclaration varDecl = (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(varDecl.isLate());
        Assertions.assertEquals("foo", varDecl.getVariables().get(0).getName());
    }

    @Test
    void testFinalVariableDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary("final String foo = 'bar';");
        VariableDeclaration varDecl = (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(varDecl.isIsFinal());
        Assertions.assertNotNull(varDecl.getVariables().get(0).getInitialValue());
    }

    @Test
    void testConstVariableDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary("const int x = 42;");
        VariableDeclaration varDecl = (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(varDecl.isIsConst());
    }

    @Test
    void testVarVariableDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary("var x = 10;");
        VariableDeclaration varDecl = (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(varDecl.isIsVar());
    }

    @Test
    void testMultipleVariableDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary("int x = 1, y = 2, z = 3;");
        VariableDeclaration varDecl = (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(3, varDecl.getVariables().size());
        Assertions.assertEquals("x", varDecl.getVariables().get(0).getName());
        Assertions.assertEquals("y", varDecl.getVariables().get(1).getName());
        Assertions.assertEquals("z", varDecl.getVariables().get(2).getName());
    }

    @Test
    void testNullableVariableDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary("String? nullable;");
        VariableDeclaration varDecl = (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(((FieldFormalParameter) varDecl.getType()).isIsNullable());
    }

    // =========================================================================
    // 9. FUNCTIONS
    // =========================================================================

    @Test
    void testHelloWorldFunction() throws Exception {
        String code = "void main() { print('Hello World'); }";
        LibraryDeclaration lib = parseLibrary(code);

        DartFile result = parseHelper.parse(code);
        System.out.println(EmfFormatter.objToStr(result));
        
        TopLevelDeclaration firstDecl = lib.getDeclarations().get(0);
        Assertions.assertInstanceOf(FunctionDeclaration.class, firstDecl);
        FunctionDeclaration mainFunc = (FunctionDeclaration) firstDecl;
        Assertions.assertEquals("main", mainFunc.getName());

        // Con la nuova grammatica void è TypeNotFunction con isVoid=true
        if (mainFunc.getReturnType() != null) {
            Assertions.assertTrue(((TypeNotFunction) mainFunc.getReturnType()).isIsVoid(),
                "Return type dovrebbe essere void");
        }

        Block body = mainFunc.getBody().getBlock();
        Assertions.assertNotNull(body);
        Assertions.assertFalse(body.getStatements().isEmpty());

        NonLabelledStatement stmt = body.getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(ExpressionStatement.class, stmt);
        FunctionCall call = (FunctionCall) ((ExpressionStatement) stmt).getExpression();
        Assertions.assertInstanceOf(IdentifierRef.class, call.getReceiver());
        Assertions.assertEquals("print", ((IdentifierRef) call.getReceiver()).getName());

        ArgumentList argList = call.getArgs().getArgumentList();
        Assertions.assertInstanceOf(ArgumentListPositionalThenNamed.class, argList);

        ArgumentListPositionalThenNamed pos =
            (ArgumentListPositionalThenNamed) argList;

        Assertions.assertEquals(1, pos.getPositional().size());
        Assertions.assertInstanceOf(StringLiteral.class, pos.getPositional().get(0));
        Assertions.assertEquals("Hello World",
            ((StringLiteral) pos.getPositional().get(0)));
    }

    @Test
    void testFunctionVsVariableAmbiguity() throws Exception {
        String code =
            "String foo;\n" +
            "String bar() { return 'hello'; }\n";

        LibraryDeclaration lib = parseLibrary(code);
        Assertions.assertEquals(2, lib.getDeclarations().size());

        // Prima: variabile
        Assertions.assertInstanceOf(VariableDeclaration.class,
            lib.getDeclarations().get(0));
        VariableDeclaration varDecl =
            (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals("foo", varDecl.getVariables().get(0).getName());
        Assertions.assertEquals("String", ( (InitializedIdentifier) varDecl.getType()).getName());

        // Seconda: funzione
        Assertions.assertInstanceOf(FunctionDeclaration.class,
            lib.getDeclarations().get(1));
        FunctionDeclaration funcDecl =
            (FunctionDeclaration) lib.getDeclarations().get(1);
        Assertions.assertEquals("bar", funcDecl.getName());
        Assertions.assertEquals("String",
            ((InitializedIdentifier) funcDecl.getReturnType()).getName());

        Block body = funcDecl.getBody().getBlock();
        Assertions.assertNotNull(body);
        NonLabelledStatement stmt =
            body.getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(ReturnStatement.class, stmt);
        ReturnStatement ret = (ReturnStatement) stmt;
        Assertions.assertInstanceOf(StringLiteral.class, ret.getExpression());
        Assertions.assertEquals("hello",
            ((StringLiteral) ret.getExpression()));
    }

    @Test
    void testFunctionWithNamedParameters() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void greet({required String name, int age = 0}) {}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals("greet", func.getName());
        NamedFormalParameters named = (NamedFormalParameters)
            func.getSignature().getParameters().getOptionalParameters();
        Assertions.assertNotNull(named);
        Assertions.assertEquals(2, named.getParameters().size());
        Assertions.assertTrue(
            named.getParameters().get(0).isIsRequired());
    }

    @Test
    void testFunctionWithOptionalPositionalParameters() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "int add(int a, [int b = 0]) { return a; }");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(
            func.getSignature().getParameters().getOptionalParameters());
        Assertions.assertInstanceOf(OptionalPositionalFormalParameters.class,
            func.getSignature().getParameters().getOptionalParameters());
    }

    @Test
    void testAsyncFunction() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "Future<String> fetchData() async { return 'data'; }");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(func.getBody().isIsAsync());
    }

    @Test
    void testArrowFunction() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "int double(int x) => x * 2;");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(func.getBody().getExpression());
        Assertions.assertNull(func.getBody().getBlock());
    }

    @Test
    void testExternalFunction() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "external void nativeFunc();");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(func.isIsExternal());
    }

    @Test
    void testFunctionWithFunctionTypeParameter() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void execute(void Function(int) callback) {}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(func);
        // Il parametro ha tipo FunctionType
        SimpleFormalParameter param = (SimpleFormalParameter)
            func.getSignature().getParameters()
                .getNormalParameters().get(0);
        Assertions.assertInstanceOf(FunctionType.class, param.getType());
    }

    // =========================================================================
    // 10. CLASSES
    // =========================================================================

    @Test
    void testEmptyClass() throws Exception {
        LibraryDeclaration lib = parseLibrary("class Foo {}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals("Foo", cls.getName());
        Assertions.assertTrue(cls.getMembers().isEmpty());
    }

    @Test
    void testAbstractClass() throws Exception {
        LibraryDeclaration lib = parseLibrary("abstract class Animal {}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertTrue(cls.isIsAbstract());
    }

    @Test
    void testClassWithSuperclass() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Dog extends Animal {}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(cls.getSuperclass());
        Assertions.assertEquals("Animal",
            ((InitializedIdentifier) cls.getSuperclass().getType()).getName());
    }

    @Test
    void testClassWithInterfaces() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class MyClass implements Runnable, Closeable {}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(cls.getInterfaces());
        Assertions.assertEquals(2,
            cls.getInterfaces().getTypes().size());
    }

    @Test
    void testClassWithMixins() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class MyClass extends Base with Mixin1, Mixin2 {}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(cls.getSuperclass().getMixins());
        Assertions.assertEquals(2,
            cls.getSuperclass().getMixins().getTypes().size());
    }

    @Test
    void testConstructorDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Point {\n" +
            "  int x;\n" +
            "  int y;\n" +
            "  Point(this.x, this.y);\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(3, cls.getMembers().size());

        // Terzo membro: costruttore
        MemberDeclaration ctorMember = cls.getMembers().get(2);
        Assertions.assertNotNull(ctorMember.getConstructor());
        Assertions.assertEquals("Point",
            ctorMember.getConstructor().getName().getClassName());

        // Verifica this.x e this.y come FieldFormalParameter
        FormalParameterList params =
            ctorMember.getConstructor().getParameters();
        Assertions.assertEquals(2, params.getNormalParameters().size());
        Assertions.assertInstanceOf(FieldFormalParameter.class,
            params.getNormalParameters().get(0));
        Assertions.assertEquals("x",
            ((FieldFormalParameter) params.getNormalParameters()
                .get(0)).getName());
    }

    @Test
    void testConstructorWithInitializers() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Point {\n" +
            "  final int x;\n" +
            "  final int y;\n" +
            "  Point(int x, int y) : x = x, y = y;\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        MemberDeclaration ctorMember = cls.getMembers().get(2);
        Assertions.assertNotNull(ctorMember.getInitializers());
        Assertions.assertEquals(2,
            ctorMember.getInitializers().getEntries().size());
    }

    @Test
    void testNamedConstructor() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Point {\n" +
            "  int x; int y;\n" +
            "  Point.origin() : x = 0, y = 0 {}\n" +  // removed semicolon, added body
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        MemberDeclaration ctorMember = cls.getMembers().get(2);
        Assertions.assertNotNull(ctorMember.getConstructor());
        Assertions.assertEquals("origin",
            ctorMember.getConstructor().getName().getConstructorId());
    }

    @Test
    void testFactoryConstructor() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Singleton {\n" +
            "  factory Singleton() { return Singleton._internal(); }\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        MemberDeclaration member = cls.getMembers().get(0);
        Assertions.assertNotNull(member.getFactory());
    }

    @Test
    void testRedirectingFactoryConstructor() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class MyList {\n" +
            "  factory MyList.from(List src) = _MyList;\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        MemberDeclaration member = cls.getMembers().get(0);
        Assertions.assertNotNull(member.getRedirectingFactory());
    }

    @Test
    void testStaticMembers() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class MathUtils {\n" +
            "  static const double pi = 3.14;\n" +
            "  static int counter = 0;\n" +
            "  static void reset() {}\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(3, cls.getMembers().size());

        // static const pi
        MemberDeclaration piMember = cls.getMembers().get(0);
        Assertions.assertNotNull(piMember.getDeclaration());
        Assertions.assertTrue(piMember.getDeclaration().isIsStatic());
        Assertions.assertTrue(piMember.getDeclaration().isIsConst());

        // static void reset()
        MemberDeclaration resetMember = cls.getMembers().get(2);
        Assertions.assertNotNull(resetMember.getMethod());
        Assertions.assertTrue(resetMember.getMethod().isIsStatic());
    }

    @Test
    void testGetterAndSetter() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Circle {\n" +
            "  double _radius = 0;\n" +
            "  double get radius => _radius;\n" +
            "  set radius(double r) { _radius = r; }\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(3, cls.getMembers().size());

        MemberDeclaration getter = cls.getMembers().get(1);
        Assertions.assertTrue(getter.getMethod().isIsGetter());

        MemberDeclaration setter = cls.getMembers().get(2);
        Assertions.assertTrue(setter.getMethod().isIsSetter());
    }

    @Test
    void testOperatorOverload() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Vector {\n" +
            "  int x; int y;\n" +
            "  Vector operator +(Vector other) { return Vector(); }\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        MemberDeclaration opMember = cls.getMembers().get(2);
        Assertions.assertTrue(opMember.getMethod().isIsOperator());
        Assertions.assertEquals("+", opMember.getMethod().getOperator());
    }

    @Test
    void testGenericClass() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Box<T> {\n" +
            "  T value;\n" +
            "}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(cls.getTypeParameters());
        Assertions.assertEquals(1,
            cls.getTypeParameters().getParameters().size());
        Assertions.assertEquals("T",
            cls.getTypeParameters().getParameters().get(0).getName());
    }

    // =========================================================================
    // 12. MIXINS
    // =========================================================================

    @Test
    void testMixinDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "mixin Flyable {\n" +
            "  void fly() {}\n" +
            "}");
        MixinDeclaration mixin =
            (MixinDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals("Flyable", mixin.getName());
        Assertions.assertEquals(1, mixin.getMembers().size());
    }

    @Test
    void testMixinWithOnClause() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "mixin Flyable on Animal {\n" +
            "  void fly() {}\n" +
            "}");
        MixinDeclaration mixin =
            (MixinDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(1, mixin.getOnTypes().size());
        Assertions.assertEquals("Animal",
            ((InitializedIdentifier) mixin.getOnTypes().get(0)).getName());
    }

    @Test
    void testMixinApplicationClass() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class FlyingDog = Dog with Flyable;");
        MixinApplicationClass mac =
            (MixinApplicationClass) lib.getDeclarations().get(0);
        Assertions.assertEquals("FlyingDog", mac.getName());
        Assertions.assertEquals("Dog", ((InitializedIdentifier) mac.getType()).getName());
    }

    // =========================================================================
    // 13. EXTENSIONS
    // =========================================================================

    @Test
    void testExtensionDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "extension StringExt on String {\n" +
            "  String shout() => toUpperCase();\n" +
            "}");
        ExtensionDeclaration ext =
            (ExtensionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals("StringExt", ext.getName());
        Assertions.assertEquals("String",
            ((InitializedIdentifier) ext.getOnType()).getName());
        Assertions.assertEquals(1, ext.getMembers().size());
    }

    @Test
    void testAnonymousExtension() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "extension on int {\n" +
            "  bool get isEven => this % 2 == 0;\n" +
            "}");
        ExtensionDeclaration ext =
            (ExtensionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNull(ext.getName());
    }

    // =========================================================================
    // 14. ENUMS
    // =========================================================================

    @Test
    void testSimpleEnum() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "enum Color { red, green, blue }");
        EnumDeclaration enm =
            (EnumDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals("Color", enm.getName());
        Assertions.assertEquals(3, enm.getEntries().size());
        Assertions.assertEquals("red",
            enm.getEntries().get(0).getName());
    }

    @Test
    void testEnhancedEnum() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "enum Color {\n" +
            "  red, green, blue;\n" +
            "  String get label => name;\n" +
            "}");
        EnumDeclaration enm =
            (EnumDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(3, enm.getEntries().size());
        Assertions.assertEquals(1, enm.getMembers().size());
    }

    @Test
    void testEnumWithTrailingComma() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "enum Direction { north, south, east, west, }");
        EnumDeclaration enm =
            (EnumDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(4, enm.getEntries().size());
    }

    // =========================================================================
    // 15. GENERICS
    // =========================================================================

    @Test
    void testGenericFunction() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "T identity<T>(T value) => value;");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertNotNull(
            func.getSignature().getTypeParameters());
        Assertions.assertEquals("T",
            func.getSignature().getTypeParameters()
                .getParameters().get(0).getName());
    }

    @Test
    void testBoundedTypeParameter() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "class Sorter<T extends Comparable<T>> {}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        TypeParameter tp =
            cls.getTypeParameters().getParameters().get(0);
        Assertions.assertEquals("T", tp.getName());
        Assertions.assertNotNull(tp.getBound());
    }

    // =========================================================================
    // 17. EXPRESSIONS
    // =========================================================================

    @Test
    void testBinaryExpressions() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  var a = 1 + 2;\n" +
            "  var b = 3 * 4;\n" +
            "  var c = true && false;\n" +
            "  var d = 1 > 2;\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testNullAwareOperators() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  String? x;\n" +
            "  var len = x?.length;\n" +
            "  var val = x ?? 'default';\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testCascadeExpression() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  var sb = StringBuffer()\n" +
            "    ..write('hello')\n" +
            "    ..write(' world');\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testThrowExpression() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void check(int x) {\n" +
            "  if (x < 0) throw 'negative';\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testTypeCheckExpressions() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  Object o = 'hello';\n" +
            "  var isStr = o is String;\n" +
            "  var asStr = o as String;\n" +
            "  var notStr = o is! int;\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testListLiteral() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  var list = [1, 2, 3];\n" +
            "  var typed = <String>['a', 'b'];\n" +
            "  var constList = const [1, 2];\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testMapLiteral() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  var map = {'key': 'value', 'a': 'b'};\n" +
            "  var typed = <String, int>{'x': 1};\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testConditionalExpression() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  var x = true ? 1 : 2;\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testNewAndConstExpressions() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  var p = new Point(1, 2);\n" +
            "  var c = const Color(0xFF);\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testIndexExpression() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  var list = [1, 2, 3];\n" +
            "  var x = list[0];\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testNullAssertExpression() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  String? x = 'hello';\n" +
            "  var len = x!.length;\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    // =========================================================================
    // 18. STATEMENTS
    // =========================================================================

    @Test
    void testIfElseStatement() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  if (true) { } else { }\n" +
            "}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        NonLabelledStatement stmt =
            func.getBody().getBlock().getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(IfStatement.class, stmt);
    }

    @Test
    void testForLoop() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  for (int i = 0; i < 10; i++) {}\n" +
            "}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        NonLabelledStatement stmt =
            func.getBody().getBlock().getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(ForStatement.class, stmt);
    }

    @Test
    void testForInLoop() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  for (var x in [1,2,3]) {}\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testWhileLoop() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  while (true) { break; }\n" +
            "}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        NonLabelledStatement stmt =
            func.getBody().getBlock().getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(WhileStatement.class, stmt);
    }

    @Test
    void testDoWhileLoop() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  do { } while (false);\n" +
            "}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        NonLabelledStatement stmt =
            func.getBody().getBlock().getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(DoStatement.class, stmt);
    }

    @Test
    void testSwitchStatement() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  switch (1) {\n" +
            "    case 1: break;\n" +
            "    default: break;\n" +
            "  }\n" +
            "}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        NonLabelledStatement stmt =
            func.getBody().getBlock().getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(SwitchStatement.class, stmt);
        SwitchStatement sw = (SwitchStatement) stmt;
        Assertions.assertEquals(1, sw.getCases().size());
        Assertions.assertNotNull(sw.getDefaultCase());
    }

    @Test
    void testTryCatchFinally() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  try {\n" +
            "  } on Exception catch (e) {\n" +
            "  } finally {\n" +
            "  }\n" +
            "}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        NonLabelledStatement stmt =
            func.getBody().getBlock().getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(TryStatement.class, stmt);
        TryStatement tr = (TryStatement) stmt;
        Assertions.assertEquals(1, tr.getCatchClauses().size());
        Assertions.assertNotNull(tr.getFinallyBlock());
    }

    @Test
    void testReturnStatement() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "int foo() { return 42; }");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        NonLabelledStatement stmt =
            func.getBody().getBlock().getStatements().get(0).getStatement();
        Assertions.assertInstanceOf(ReturnStatement.class, stmt);
        ReturnStatement ret = (ReturnStatement) stmt;
        Assertions.assertInstanceOf(NumberLiteral.class, ret.getExpression());
        Assertions.assertEquals(42,
            ((NumberLiteral) ret.getExpression()).getIntValue());
    }

    @Test
    void testAssertStatement() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  assert(true);\n" +
            "  assert(1 > 0, 'must be positive');\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testYieldStatement() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "Iterable<int> gen() sync* {\n" +
            "  yield 1;\n" +
            "  yield* [2, 3];\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testLabeledStatement() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  outer: for (var i = 0; i < 3; i++) {\n" +
            "    for (var j = 0; j < 3; j++) {\n" +
            "      if (j == 1) break outer;\n" +
            "    }\n" +
            "  }\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    @Test
    void testLocalFunctionDeclaration() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void main() {\n" +
            "  int square(int x) => x * x;\n" +
            "  print(square(4));\n" +
            "}");
        Assertions.assertNotNull(lib);
    }

    // =========================================================================
    // 19. LIBRARIES
    // =========================================================================

    @Test
    void testLibraryWithImports() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "import 'dart:core';\n" +
            "import 'dart:async' as async;\n" +
            "void main() {}");
        Assertions.assertEquals(2, lib.getDirectives().size());
        Assertions.assertInstanceOf(LibraryImport.class,
            lib.getDirectives().get(0));
        LibraryImport imp = (LibraryImport) lib.getDirectives().get(1);
        Assertions.assertEquals("async", imp.getPrefix());
    }

    @Test
    void testLibraryWithShowHide() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "import 'dart:math' show Random, pi;\n" +
            "import 'dart:io' hide File;\n" +
            "void main() {}");
        LibraryImport show = (LibraryImport) lib.getDirectives().get(0);
        Assertions.assertEquals(1, show.getCombinators().size());
        Assertions.assertEquals(2,
            show.getCombinators().get(0).getIdentifiers().size());
    }

    @Test
    void testLibraryWithExport() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "export 'src/models.dart';\n" +
            "export 'src/utils.dart' show Helper;");
        Assertions.assertEquals(2, lib.getDirectives().size());
        Assertions.assertInstanceOf(LibraryExport.class,
            lib.getDirectives().get(1));
    }

    @Test
    void testLibraryName() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "library my.dart.library;\n" +
            "void main() {}");
        Assertions.assertNotNull(lib.getLibraryName());
        Assertions.assertEquals("my.dart.library",
            lib.getLibraryName().getName());
    }

    // =========================================================================
    // 20. TYPES
    // =========================================================================

    @Test
    void testFunctionType() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void Function(int x) myFunc;\n" +
            "int Function(String, bool) callback;");
        Assertions.assertEquals(2, lib.getDeclarations().size());
        VariableDeclaration v1 =
            (VariableDeclaration) lib.getDeclarations().get(0);
        Assertions.assertInstanceOf(FunctionType.class, v1.getType());
    }

    @Test
    void testNullableFunctionType() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "void Function(int)? maybeCallback;");
        VariableDeclaration var =
            (VariableDeclaration) lib.getDeclarations().get(0);
        FunctionType ft = (FunctionType) var.getType();
        Assertions.assertTrue(
            ft.getTails().get(0).isIsNullable());
    }

    @Test
    void testTypeAlias() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "typedef IntCallback = void Function(int);\n" +
            "typedef Predicate<T> = bool Function(T);");
        Assertions.assertEquals(2, lib.getDeclarations().size());
        TypeAlias ta = (TypeAlias) lib.getDeclarations().get(0);
        Assertions.assertEquals("IntCallback", ta.getName());
    }

    @Test
    void testOldStyleTypeAlias() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "typedef void Callback(int x);");
        TypeAlias ta = (TypeAlias) lib.getDeclarations().get(0);
        Assertions.assertEquals("Callback", ta.getName());
        Assertions.assertNotNull(ta.getSignature());
    }

    @Test
    void testGenericTypeArguments() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "Map<String, List<int>> data;");
        VariableDeclaration var =
            (VariableDeclaration) lib.getDeclarations().get(0);
        TypeArguments args = ((TypeNotFunction) var.getType()).getTypeArguments();
        Assertions.assertNotNull(args);
        Assertions.assertEquals(2, args.getTypes().size());
        // Il secondo argomento è List<int>
        TypeNotFunction listType = (TypeNotFunction) args.getTypes().get(1);
        Assertions.assertEquals("List", listType.getName().getName());
        Assertions.assertNotNull(listType.getTypeArguments());
    }

    // =========================================================================
    // METADATA
    // =========================================================================

    @Test
    void testMetadata() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "@override\n" +
            "@deprecated\n" +
            "void oldMethod() {}");
        FunctionDeclaration func =
            (FunctionDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(2, func.getMetadata().size());
        Assertions.assertEquals("override",
            func.getMetadata().get(0).getName());
    }

    @Test
    void testMetadataWithArguments() throws Exception {
        LibraryDeclaration lib = parseLibrary(
            "@Author('Alice', year: 2024)\n" +
            "class MyClass {}");
        ClassDeclaration cls =
            (ClassDeclaration) lib.getDeclarations().get(0);
        Assertions.assertEquals(1, cls.getMetadata().size());
        Assertions.assertNotNull(
            cls.getMetadata().get(0).getArguments());
    }
}