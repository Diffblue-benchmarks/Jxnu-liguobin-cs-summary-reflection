//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T5;
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
//public class T5Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999cbaf9e4944a2d5a3() {
//
//    // Act, creating object to test constructor
//    final T5 actual = new T5();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.stack1);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.stack1, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.stack1, "size"));
//    Assert.assertNotNull(actual.stack2);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.stack2, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.stack2, "size"));
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void popOutputEmptyStackException999801b3ae690530b52() {
//
//    // Arrange
//    final T5 thisObj = new T5();
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
//  public void pushInputPositiveOutputVoid99911ad2f587a259037() throws InvocationTargetException {
//
//    // Arrange
//    final T5 thisObj = new T5();
//    final int arg0 = 1;
//
//    // Act
//    thisObj.push(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.stack1);
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    Assert.assertArrayEquals(new Object[]{ integer }, ((Object[]) Reflector.getInstanceField(thisObj.stack1, "elementData")));
//    Assert.assertEquals(1, Reflector.getInstanceField(thisObj.stack1, "size"));
//
//  }
//}
//