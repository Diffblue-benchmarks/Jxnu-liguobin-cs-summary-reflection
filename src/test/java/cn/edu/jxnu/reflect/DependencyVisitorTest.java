package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.DependencyVisitor.AnnotationDependencyVisitor;
import cn.edu.jxnu.reflect.DependencyVisitor.FieldDependencyVisitor;
import cn.edu.jxnu.reflect.DependencyVisitor.MethodDependencyVisitor;
import cn.edu.jxnu.reflect.DependencyVisitor.SignatureDependencyVisitor;
import cn.edu.jxnu.reflect.DependencyVisitor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Type;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class DependencyVisitorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void visitAnnotationInputNotNullNotNullOutputStackOverflowError999add10988ed988bcd() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final AnnotationDependencyVisitor thisObj = dependencyVisitor.new AnnotationDependencyVisitor();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.visitAnnotation(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void visitArrayInputNotNullOutputNotNull999cfd038c22bfa4d15() {
//
//    // Arrange
//    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
//    final AnnotationDependencyVisitor thisObj = dependencyVisitor.new AnnotationDependencyVisitor();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final AnnotationVisitor actual = thisObj.visitArray(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(262_144, Reflector.getInstanceField(actual, "api"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "av"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void visitEnumInputNotNullNotNullNotNullOutputStackOverflowError9994979cf3090921249() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final AnnotationDependencyVisitor thisObj = dependencyVisitor.new AnnotationDependencyVisitor();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.visitEnum(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullNotNullOutputVoid999a3178d05128dc616() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final AnnotationDependencyVisitor thisObj = dependencyVisitor.new AnnotationDependencyVisitor();
    final String arg0 = "aaaaa";
    final Object arg1 = "aaaaa";

    // Act
    thisObj.visit(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addConstantInputNotNullOutputVoid9996398771db2e2e99e() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final Object arg0 = "/";

    // Act
    thisObj.addConstant(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addDescInputNotNullOutputStackOverflowError99988071afdf7c3f216() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final String arg0 = "/";

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.addDesc(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addInternalNameInputNotNullOutputNullPointerException999f5d07edb9aa8abe3() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final String arg0 = "/";
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.addInternalName(arg0);
    } catch (NullPointerException ex) {

      // Assert side effects
      final HashSet<String> hashSet = new HashSet<String>();
      hashSet.add("");
      Assert.assertEquals(hashSet, thisObj.getPackages());
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void addMethodDescInputNotNullOutputStackOverflowError9995684d89a2d00ff99() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final String arg0 = "/";

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.addMethodDesc(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addTypeSignatureInputNotNullOutputStringIndexOutOfBoundsException999b868e5b5c50712bd() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final String arg0 = "/";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    thisObj.addTypeSignature(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void addTypeInputNullOutputNullPointerException999dfce5b435c450a67() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final Type arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.addType(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99924460aaeaaccce4c() {
//
//    // Act, creating object to test constructor
//    final DependencyVisitor actual = new DependencyVisitor();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    final HashMap<String, Map<String, Integer>> hashMap = new HashMap<String, Map<String, Integer>>();
//    Assert.assertEquals(hashMap, actual.getGlobals());
//    Assert.assertNull(actual.current);
//    final HashSet<String> hashSet = new HashSet<String>();
//    Assert.assertEquals(hashSet, actual.getPackages());
//    Assert.assertEquals(262_144, Reflector.getInstanceField(actual, "api"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "cv"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getGlobalsOutput09996ae740041fcc0a5b() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();

    // Act
    final Map<String, Map<String, Integer>> actual = thisObj.getGlobals();

    // Assert result
    final HashMap<String, Map<String, Integer>> hashMap = new HashMap<String, Map<String, Integer>>();
    Assert.assertEquals(hashMap, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPackagesOutput0999d48a02cf74f5202e() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();

    // Act
    final Set<String> actual = thisObj.getPackages();

    // Assert result
    final HashSet<String> hashSet = new HashSet<String>();
    Assert.assertEquals(hashSet, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void visitAnnotationInputNotNullTrueOutputStackOverflowError999c2274bcd449a9c22() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final String arg0 = "/";
    final boolean arg1 = true;

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.visitAnnotation(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitFieldInputNegativeNotNullNotNullNotNullNotNullOutputStringIndexOutOfBoundsException99984f936eefe37bfac() {

    // Arrange
    final DependencyVisitor thisObj = new DependencyVisitor();
    final int arg0 = -1;
    final String arg1 = "/";
    final String arg2 = "/";
    final String arg3 = "/";
    final Object arg4 = "/";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    thisObj.visitField(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitAnnotationInputNotNullTrueOutputStackOverflowError999cbb9d676d0883939() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final FieldDependencyVisitor thisObj = dependencyVisitor.new FieldDependencyVisitor();
    final String arg0 = "aaaaa";
    final boolean arg1 = true;

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.visitAnnotation(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void visitAnnotationDefaultOutputNotNull99922f6c25cfb62d227() {
//
//    // Arrange
//    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
//    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
//
//    // Act
//    final AnnotationVisitor actual = thisObj.visitAnnotationDefault();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(262_144, Reflector.getInstanceField(actual, "api"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "av"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void visitAnnotationInputNotNullTrueOutputStackOverflowError99967adc7723dcf569f() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
    final String arg0 = "aaaaa";
    final boolean arg1 = true;

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.visitAnnotation(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitFieldInsnInputZeroNotNullNotNullNotNullOutputNullPointerException99980516e8eeeedc079() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
    final int arg0 = 0;
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";
    final String arg3 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visitFieldInsn(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitLdcInsnInputNotNullOutputVoid999425a15b75c8d9901() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
    final Object arg0 = "aaaaa";

    // Act
    thisObj.visitLdcInsn(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitMethodInsnInputZeroNotNullNotNullNotNullOutputNullPointerException999f5002058d87bb474() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
    final int arg0 = 0;
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";
    final String arg3 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visitMethodInsn(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitMultiANewArrayInsnInputNotNullZeroOutputStackOverflowError9996206df94808ffaac() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
    final String arg0 = "aaaaa";
    final int arg1 = 0;

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.visitMultiANewArrayInsn(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitParameterAnnotationInputZeroNotNullTrueOutputStackOverflowError9997ef4f487a939a5fa() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
    final int arg0 = 0;
    final String arg1 = "aaaaa";
    final boolean arg2 = true;

    // Act
    thrown.expect(StackOverflowError.class);
    thisObj.visitParameterAnnotation(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitTypeInsnInputZeroNotNullOutputNullPointerException999dd406bee554af8f6() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final MethodDependencyVisitor thisObj = dependencyVisitor.new MethodDependencyVisitor();
    final int arg0 = 0;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visitTypeInsn(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitClassTypeInputNotNullOutputNullPointerException999c9010d85ca70dfae() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final SignatureDependencyVisitor thisObj = dependencyVisitor.new SignatureDependencyVisitor();
    final String arg0 = "$";
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.visitClassType(arg0);
    } catch (NullPointerException ex) {

      // Assert side effects
      Assert.assertEquals("$", thisObj.signatureClassName);
      throw ex;
    }

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInnerClassTypeInputNotNullOutputNullPointerException999f208a2b48306d248() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final SignatureDependencyVisitor thisObj = dependencyVisitor.new SignatureDependencyVisitor();
    final String arg0 = "$";
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.visitInnerClassType(arg0);
    } catch (NullPointerException ex) {

      // Assert side effects
      Assert.assertEquals("null$$", thisObj.signatureClassName);
      throw ex;
    }

  }
}
