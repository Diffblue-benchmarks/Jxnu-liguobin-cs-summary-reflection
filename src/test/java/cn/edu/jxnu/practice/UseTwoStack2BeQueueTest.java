package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.UseTwoStack2BeQueue;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;



public class UseTwoStack2BeQueueTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9991d6b3acf9c556326() {
//
//    // Act, creating object to test constructor
//    final UseTwoStack2BeQueue actual = new UseTwoStack2BeQueue();
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
  public void popOutputRuntimeException999f3c5e89c6905ad51() {

    // Arrange
    final UseTwoStack2BeQueue thisObj = new UseTwoStack2BeQueue();

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.pop();

    // The method is not expected to return due to exception thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void pushInputPositiveOutputVoid9991dcc11552676167b() throws InvocationTargetException {
//
//    // Arrange
//    final UseTwoStack2BeQueue thisObj = new UseTwoStack2BeQueue();
//    final int arg0 = 9;
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
}
