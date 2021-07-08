package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.BFCompiler;
import cn.edu.jxnu.reflect.DependencyVisitor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



public class BFCompilerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void compileInputNotNullNotNullNotNullNotNullOutputVoid99998912546591bd0cb() throws IOException, InvocationTargetException {
//
//    // Arrange
//    final BFCompiler thisObj = new BFCompiler();
//    final StringReader arg0 = new StringReader(":");
//    final String arg1 = ":";
//    final String arg2 = ":";
//    final DependencyVisitor arg3 = new DependencyVisitor();
//
//    // Act
//    thisObj.compile(arg0, arg1, arg2, arg3);
//
//    // Assert side effects
//    Assert.assertNotNull(arg3);
//    final HashMap<String, Map<String, Integer>> hashMap = new HashMap<String, Map<String, Integer>>();
//    final HashMap hashMap1 = new HashMap();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap1.put("java/io", integer);
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap1.put("java/lang", integer1);
//    hashMap.put(":", hashMap1);
//    Assert.assertEquals(hashMap, ((DependencyVisitor) arg3).getGlobals());
//    Assert.assertEquals(hashMap1, ((DependencyVisitor) arg3).current);
//    final HashSet<String> hashSet = new HashSet<String>();
//    hashSet.add("java/io");
//    hashSet.add(":");
//    hashSet.add("java/lang");
//    Assert.assertEquals(hashSet, ((DependencyVisitor) arg3).getPackages());
//    Assert.assertEquals(262_144, Reflector.getInstanceField(arg3, "api"));
//    Assert.assertNull(Reflector.getInstanceField(arg3, "cv"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999989b94942ff28b79() {

    // Act, creating object to test constructor
    final BFCompiler actual = new BFCompiler();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
