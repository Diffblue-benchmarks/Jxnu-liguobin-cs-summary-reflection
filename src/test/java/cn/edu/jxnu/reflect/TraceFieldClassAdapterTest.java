package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.DependencyVisitor;
import cn.edu.jxnu.reflect.TraceFieldClassAdapter;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



public class TraceFieldClassAdapterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull99941fb09d66e37dd42() {
//
//    // Arrange
//    final DependencyVisitor arg0 = new DependencyVisitor();
//
//    // Act, creating object to test constructor
//    final TraceFieldClassAdapter actual = new TraceFieldClassAdapter(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(262_144, Reflector.getInstanceField(actual, "api"));
//    Assert.assertNotNull(Reflector.getInstanceField(actual, "cv"));
//    final HashMap<String, Map<String, Integer>> hashMap = new HashMap<String, Map<String, Integer>>();
//    Assert.assertEquals(hashMap, ((DependencyVisitor) Reflector.getInstanceField(actual, "cv")).getGlobals());
//    Assert.assertNull(((DependencyVisitor) Reflector.getInstanceField(actual, "cv")).current);
//    final HashSet<String> hashSet = new HashSet<String>();
//    Assert.assertEquals(hashSet, ((DependencyVisitor) Reflector.getInstanceField(actual, "cv")).getPackages());
//    Assert.assertEquals(262_144, Reflector.getInstanceField(Reflector.getInstanceField(actual, "cv"), "api"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(actual, "cv"), "cv"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void visitFieldInputPositiveNotNullNotNullNotNullNotNullOutputStringIndexOutOfBoundsException9996dfd3ad7fe24140e() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final TraceFieldClassAdapter thisObj = new TraceFieldClassAdapter(dependencyVisitor);
    final int arg0 = 1;
    final String arg1 = ")V";
    final String arg2 = ")V";
    final String arg3 = ")V";
    final Object arg4 = ")V";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    thisObj.visitField(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitMethodInputPositiveNotNullNotNullNotNull3OutputStringIndexOutOfBoundsException99999d4858ee86a4898() {

    // Arrange
    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
    final TraceFieldClassAdapter thisObj = new TraceFieldClassAdapter(dependencyVisitor);
    final int arg0 = 1;
    final String arg1 = ")V";
    final String arg2 = ")V";
    final String arg3 = ")V";
    final String[] arg4 = { ")V", ")V", ")V" };

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    thisObj.visitMethod(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void visitInputPositivePositiveNotNullNotNullNotNull3OutputStringIndexOutOfBoundsException999b5451850b72b1b6e() {
//
//    // Arrange
//    final DependencyVisitor dependencyVisitor = new DependencyVisitor();
//    final TraceFieldClassAdapter thisObj = new TraceFieldClassAdapter(dependencyVisitor);
//    final int arg0 = 1;
//    final int arg1 = 1;
//    final String arg2 = ")V";
//    final String arg3 = ")V";
//    final String arg4 = ")V";
//    final String[] arg5 = { ")V", ")V", ")V" };
//    try {
//
//      // Act
//      thrown.expect(StringIndexOutOfBoundsException.class);
//      thisObj.visit(arg0, arg1, arg2, arg3, arg4, arg5);
//    } catch (StringIndexOutOfBoundsException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(Reflector.getInstanceField(thisObj, "cv"));
//      final HashMap<String, Map<String, Integer>> hashMap = new HashMap<String, Map<String, Integer>>();
//      final HashMap hashMap1 = new HashMap();
//      hashMap.put(")V", hashMap1);
//      Assert.assertEquals(hashMap, ((DependencyVisitor) Reflector.getInstanceField(thisObj, "cv")).getGlobals());
//      Assert.assertEquals(hashMap1, ((DependencyVisitor) Reflector.getInstanceField(thisObj, "cv")).current);
//      final HashSet<String> hashSet = new HashSet<String>();
//      hashSet.add(")V");
//      Assert.assertEquals(hashSet, ((DependencyVisitor) Reflector.getInstanceField(thisObj, "cv")).getPackages());
//      Assert.assertEquals(262_144, Reflector.getInstanceField(Reflector.getInstanceField(thisObj, "cv"), "api"));
//      Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(thisObj, "cv"), "cv"));
//      throw ex;
//    }
//
//  }
}
