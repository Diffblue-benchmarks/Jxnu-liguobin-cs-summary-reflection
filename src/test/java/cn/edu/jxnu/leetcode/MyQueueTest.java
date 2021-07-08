//package cn.edu.jxnu.leetcode;
//
//import cn.edu.jxnu.leetcode.MyQueue;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.EmptyStackException;
//
//
//
//public class MyQueueTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999a400c0e6bbd72a88() {
//
//    // Act, creating object to test constructor
//    final MyQueue actual = new MyQueue();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void emptyOutputTrue9995233dae6e0516d7d() {
//
//    // Arrange
//    final MyQueue thisObj = new MyQueue();
//
//    // Act
//    final boolean actual = thisObj.empty();
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void peekOutputEmptyStackException999c7492b9258af0ada() {
//
//    // Arrange
//    final MyQueue thisObj = new MyQueue();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.peek();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void popOutputEmptyStackException99955593297240b83bd() {
//
//    // Arrange
//    final MyQueue thisObj = new MyQueue();
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
//  public void pushInputPositiveOutputVoid999baf8f1c4ca1491a2() {
//
//    // Arrange
//    final MyQueue thisObj = new MyQueue();
//    final int arg0 = 1;
//
//    // Act
//    thisObj.push(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//