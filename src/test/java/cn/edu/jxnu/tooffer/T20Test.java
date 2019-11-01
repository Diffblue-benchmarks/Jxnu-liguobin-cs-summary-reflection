//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T20;
//import com.diffblue.deeptestutils.Reflector;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//import java.lang.reflect.InvocationTargetException;
//import java.util.EmptyStackException;
//
//
//
//public class T20Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999de02de0d592eec23() {
//
//    // Act, creating object to test constructor
//    final T20 actual = new T20();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.stack);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.stack, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.stack, "size"));
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void minOutputEmptyStackException999e40cb4308897f174() {
//
//    // Arrange
//    final T20 thisObj = new T20();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.min();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void popOutputEmptyStackException999cae4cc9f747cd016() {
//
//    // Arrange
//    final T20 thisObj = new T20();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.pop();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void pushInputPositiveOutputVoid9993476ca0415bcec3c() throws InvocationTargetException {
//
//    // Arrange
//    final T20 thisObj = new T20();
//    final int arg0 = 1;
//
//    // Act
//    thisObj.push(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.stack);
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    Assert.assertArrayEquals(new Object[]{ integer }, ((Object[]) Reflector.getInstanceField(thisObj.stack, "elementData")));
//    Assert.assertEquals(1, Reflector.getInstanceField(thisObj.stack, "size"));
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void topOutputEmptyStackException999ad22ec158acd6b57() {
//
//    // Arrange
//    final T20 thisObj = new T20();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.top();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//