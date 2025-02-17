/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.asJava;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/asJava/lightClasses")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CompilerLightClassTestGenerated extends AbstractCompilerLightClassTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInLightClasses() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true, "local", "ideRegression");
    }

    @TestMetadata("AnnotatedParameterInEnumConstructor.kt")
    public void testAnnotatedParameterInEnumConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotatedParameterInEnumConstructor.kt");
    }

    @TestMetadata("AnnotatedParameterInInnerClassConstructor.kt")
    public void testAnnotatedParameterInInnerClassConstructor() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotatedParameterInInnerClassConstructor.kt");
    }

    @TestMetadata("AnnotatedPropertyWithSites.kt")
    public void testAnnotatedPropertyWithSites() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotatedPropertyWithSites.kt");
    }

    @TestMetadata("AnnotationClass.kt")
    public void testAnnotationClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotationClass.kt");
    }

    @TestMetadata("AnnotationJvmRepeatable.kt")
    public void testAnnotationJvmRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotationJvmRepeatable.kt");
    }

    @TestMetadata("AnnotationKotlinAndJavaRepeatable.kt")
    public void testAnnotationKotlinAndJavaRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotationKotlinAndJavaRepeatable.kt");
    }

    @TestMetadata("AnnotationKotlinAndJvmRepeatable.kt")
    public void testAnnotationKotlinAndJvmRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotationKotlinAndJvmRepeatable.kt");
    }

    @TestMetadata("AnnotationRepeatable.kt")
    public void testAnnotationRepeatable() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/AnnotationRepeatable.kt");
    }

    @TestMetadata("Constructors.kt")
    public void testConstructors() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/Constructors.kt");
    }

    @TestMetadata("DataClassWithCustomImplementedMembers.kt")
    public void testDataClassWithCustomImplementedMembers() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/DataClassWithCustomImplementedMembers.kt");
    }

    @TestMetadata("DelegatedNested.kt")
    public void testDelegatedNested() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/DelegatedNested.kt");
    }

    @TestMetadata("Delegation.kt")
    public void testDelegation() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/Delegation.kt");
    }

    @TestMetadata("DeprecatedEnumEntry.kt")
    public void testDeprecatedEnumEntry() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/DeprecatedEnumEntry.kt");
    }

    @TestMetadata("DeprecatedNotHiddenInClass.kt")
    public void testDeprecatedNotHiddenInClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/DeprecatedNotHiddenInClass.kt");
    }

    @TestMetadata("DollarsInName.kt")
    public void testDollarsInName() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/DollarsInName.kt");
    }

    @TestMetadata("DollarsInNameNoPackage.kt")
    public void testDollarsInNameNoPackage() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/DollarsInNameNoPackage.kt");
    }

    @TestMetadata("ExtendingInterfaceWithDefaultImpls.kt")
    public void testExtendingInterfaceWithDefaultImpls() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/ExtendingInterfaceWithDefaultImpls.kt");
    }

    @TestMetadata("HiddenDeprecated.kt")
    public void testHiddenDeprecated() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/HiddenDeprecated.kt");
    }

    @TestMetadata("HiddenDeprecatedInClass.kt")
    public void testHiddenDeprecatedInClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/HiddenDeprecatedInClass.kt");
    }

    @TestMetadata("InheritingInterfaceDefaultImpls.kt")
    public void testInheritingInterfaceDefaultImpls() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/InheritingInterfaceDefaultImpls.kt");
    }

    @TestMetadata("InlineReified.kt")
    public void testInlineReified() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/InlineReified.kt");
    }

    @TestMetadata("JvmNameOnMember.kt")
    public void testJvmNameOnMember() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/JvmNameOnMember.kt");
    }

    @TestMetadata("JvmStatic.kt")
    public void testJvmStatic() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/JvmStatic.kt");
    }

    @TestMetadata("LocalFunctions.kt")
    public void testLocalFunctions() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/LocalFunctions.kt");
    }

    @TestMetadata("NestedObjects.kt")
    public void testNestedObjects() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/NestedObjects.kt");
    }

    @TestMetadata("NonDataClassWithComponentFunctions.kt")
    public void testNonDataClassWithComponentFunctions() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/NonDataClassWithComponentFunctions.kt");
    }

    @TestMetadata("OnlySecondaryConstructors.kt")
    public void testOnlySecondaryConstructors() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/OnlySecondaryConstructors.kt");
    }

    @TestMetadata("PublishedApi.kt")
    public void testPublishedApi() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/PublishedApi.kt");
    }

    @TestMetadata("SpecialAnnotationsOnAnnotationClass.kt")
    public void testSpecialAnnotationsOnAnnotationClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/SpecialAnnotationsOnAnnotationClass.kt");
    }

    @TestMetadata("StubOrderForOverloads.kt")
    public void testStubOrderForOverloads() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/StubOrderForOverloads.kt");
    }

    @TestMetadata("TypePararametersInClass.kt")
    public void testTypePararametersInClass() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/TypePararametersInClass.kt");
    }

    @TestMetadata("VarArgs.kt")
    public void testVarArgs() throws Exception {
        runTest("compiler/testData/asJava/lightClasses/VarArgs.kt");
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/compilationErrors")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompilationErrors extends AbstractCompilerLightClassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("ActualClass.kt")
        public void testActualClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/ActualClass.kt");
        }

        @TestMetadata("ActualTypeAlias.kt")
        public void testActualTypeAlias() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/ActualTypeAlias.kt");
        }

        @TestMetadata("ActualTypeAliasCustomJvmPackageName.kt")
        public void testActualTypeAliasCustomJvmPackageName() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/ActualTypeAliasCustomJvmPackageName.kt");
        }

        public void testAllFilesPresentInCompilationErrors() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/compilationErrors"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("AllInlineOnly.kt")
        public void testAllInlineOnly() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/AllInlineOnly.kt");
        }

        @TestMetadata("AnnotationModifiers.kt")
        public void testAnnotationModifiers() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/AnnotationModifiers.kt");
        }

        @TestMetadata("EnumNameOverride.kt")
        public void testEnumNameOverride() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/EnumNameOverride.kt");
        }

        @TestMetadata("ExpectClass.kt")
        public void testExpectClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/ExpectClass.kt");
        }

        @TestMetadata("ExpectObject.kt")
        public void testExpectObject() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/ExpectObject.kt");
        }

        @TestMetadata("ExpectedNestedClass.kt")
        public void testExpectedNestedClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/ExpectedNestedClass.kt");
        }

        @TestMetadata("ExpectedNestedClassInObject.kt")
        public void testExpectedNestedClassInObject() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/ExpectedNestedClassInObject.kt");
        }

        @TestMetadata("JvmPackageName.kt")
        public void testJvmPackageName() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/JvmPackageName.kt");
        }

        @TestMetadata("LocalInAnnotation.kt")
        public void testLocalInAnnotation() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/LocalInAnnotation.kt");
        }

        @TestMetadata("PrivateInTrait.kt")
        public void testPrivateInTrait() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/PrivateInTrait.kt");
        }

        @TestMetadata("RepetableAnnotations.kt")
        public void testRepetableAnnotations() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/RepetableAnnotations.kt");
        }

        @TestMetadata("SameName.kt")
        public void testSameName() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/SameName.kt");
        }

        @TestMetadata("TopLevelDestructuring.kt")
        public void testTopLevelDestructuring() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/TopLevelDestructuring.kt");
        }

        @TestMetadata("TraitClassObjectField.kt")
        public void testTraitClassObjectField() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/TraitClassObjectField.kt");
        }

        @TestMetadata("TwoOverrides.kt")
        public void testTwoOverrides() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/TwoOverrides.kt");
        }

        @TestMetadata("WrongAnnotations.kt")
        public void testWrongAnnotations() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/compilationErrors/WrongAnnotations.kt");
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/delegation")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Delegation extends AbstractCompilerLightClassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInDelegation() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/delegation"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/delegation/Function.kt");
        }

        @TestMetadata("Property.kt")
        public void testProperty() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/delegation/Property.kt");
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/facades")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Facades extends AbstractCompilerLightClassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInFacades() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/facades"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("AllPrivate.kt")
        public void testAllPrivate() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/facades/AllPrivate.kt");
        }

        @TestMetadata("MultiFile.kt")
        public void testMultiFile() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/facades/MultiFile.kt");
        }

        @TestMetadata("SingleFile.kt")
        public void testSingleFile() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/facades/SingleFile.kt");
        }

        @TestMetadata("SingleJvmClassName.kt")
        public void testSingleJvmClassName() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/facades/SingleJvmClassName.kt");
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class NullabilityAnnotations extends AbstractCompilerLightClassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInNullabilityAnnotations() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/nullabilityAnnotations"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Class.kt");
        }

        @TestMetadata("ClassObjectField.kt")
        public void testClassObjectField() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassObjectField.kt");
        }

        @TestMetadata("ClassWithConstructor.kt")
        public void testClassWithConstructor() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassWithConstructor.kt");
        }

        @TestMetadata("ClassWithConstructorAndProperties.kt")
        public void testClassWithConstructorAndProperties() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassWithConstructorAndProperties.kt");
        }

        @TestMetadata("FileFacade.kt")
        public void testFileFacade() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/FileFacade.kt");
        }

        @TestMetadata("Generic.kt")
        public void testGeneric() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Generic.kt");
        }

        @TestMetadata("IntOverridesAny.kt")
        public void testIntOverridesAny() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/IntOverridesAny.kt");
        }

        @TestMetadata("JvmOverloads.kt")
        public void testJvmOverloads() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/JvmOverloads.kt");
        }

        @TestMetadata("NullableUnitReturn.kt")
        public void testNullableUnitReturn() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/NullableUnitReturn.kt");
        }

        @TestMetadata("OverrideAnyWithUnit.kt")
        public void testOverrideAnyWithUnit() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/OverrideAnyWithUnit.kt");
        }

        @TestMetadata("PlatformTypes.kt")
        public void testPlatformTypes() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PlatformTypes.kt");
        }

        @TestMetadata("Primitives.kt")
        public void testPrimitives() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Primitives.kt");
        }

        @TestMetadata("PrivateInClass.kt")
        public void testPrivateInClass() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PrivateInClass.kt");
        }

        @TestMetadata("Synthetic.kt")
        public void testSynthetic() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Synthetic.kt");
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Trait.kt");
        }

        @TestMetadata("UnitAsGenericArgument.kt")
        public void testUnitAsGenericArgument() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/UnitAsGenericArgument.kt");
        }

        @TestMetadata("UnitParameter.kt")
        public void testUnitParameter() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/UnitParameter.kt");
        }

        @TestMetadata("VoidReturn.kt")
        public void testVoidReturn() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/nullabilityAnnotations/VoidReturn.kt");
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/object")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Object extends AbstractCompilerLightClassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInObject() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/object"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("SimpleObject.kt")
        public void testSimpleObject() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/object/SimpleObject.kt");
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/publicField")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PublicField extends AbstractCompilerLightClassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInPublicField() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/publicField"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("CompanionObject.kt")
        public void testCompanionObject() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/publicField/CompanionObject.kt");
        }

        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/publicField/Simple.kt");
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/script")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Script extends AbstractCompilerLightClassTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInScript() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/asJava/lightClasses/script"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("HelloWorld.kts")
        public void testHelloWorld() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/script/HelloWorld.kts");
        }

        @TestMetadata("InnerClasses.kts")
        public void testInnerClasses() throws Exception {
            runTest("compiler/testData/asJava/lightClasses/script/InnerClasses.kts");
        }
    }
}
