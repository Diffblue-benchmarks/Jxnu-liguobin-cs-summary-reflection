package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.AddMinFunctionForStack2;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.EmptyStackException;



public class AddMinFunctionForStack2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99911f46da0a82b93ff() {
//
//    // Act, creating object to test constructor
//    final AddMinFunctionForStack2 actual = new AddMinFunctionForStack2();
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

  // Test written by Diffblue Cover
  @Test
  public void minOutputEmptyStackException99966c2d9e268e43a56() {

    // Arrange
    final AddMinFunctionForStack2 thisObj = new AddMinFunctionForStack2();

    // Act
    thrown.expect(EmptyStackException.class);
    thisObj.min();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void popOutputEmptyStackException999776342891f6cf1ba() {

    // Arrange
    final AddMinFunctionForStack2 thisObj = new AddMinFunctionForStack2();

    // Act
    thrown.expect(EmptyStackException.class);
    thisObj.pop();

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void pushInputPositiveOutputVoid999cc9173e3f91de72d() throws InvocationTargetException {
//
//    // Arrange
//    final AddMinFunctionForStack2 thisObj = new AddMinFunctionForStack2();
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
//    Assert.assertNotNull(thisObj.stack2);
//    Assert.assertArrayEquals(new Object[]{ integer }, ((Object[]) Reflector.getInstanceField(thisObj.stack2, "elementData")));
//    Assert.assertEquals(1, Reflector.getInstanceField(thisObj.stack2, "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void topOutputEmptyStackException999e55580dcdb66cbf4() {

    // Arrange
    final AddMinFunctionForStack2 thisObj = new AddMinFunctionForStack2();

    // Act
    thrown.expect(EmptyStackException.class);
    thisObj.top();

    // The method is not expected to return due to exception thrown

  }
}
