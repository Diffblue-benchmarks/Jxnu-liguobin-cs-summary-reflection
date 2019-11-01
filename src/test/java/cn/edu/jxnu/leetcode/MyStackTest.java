//package cn.edu.jxnu.leetcode;
//
//import cn.edu.jxnu.leetcode.MyStack;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.NoSuchElementException;
//
//
//
//public class MyStackTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9998bb0788274814501() {
//
//    // Act, creating object to test constructor
//    final MyStack actual = new MyStack();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void emptyOutputTrue999f5ac5c5c757cde8b() {
//
//    // Arrange
//    final MyStack thisObj = new MyStack();
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
//  public void popOutputNoSuchElementException99950b02031aa3f68b7() {
//
//    // Arrange
//    final MyStack thisObj = new MyStack();
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    thisObj.pop();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void pushInputPositiveOutputVoid999321e4963fe967168() {
//
//    // Arrange
//    final MyStack thisObj = new MyStack();
//    final int arg0 = 1;
//
//    // Act
//    thisObj.push(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void topOutputNullPointerException9990bd27de61a9fc5a6() {
//
//    // Arrange
//    final MyStack thisObj = new MyStack();
//
//    // Act
//    thrown.expect(NullPointerException.class);
//    thisObj.top();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//