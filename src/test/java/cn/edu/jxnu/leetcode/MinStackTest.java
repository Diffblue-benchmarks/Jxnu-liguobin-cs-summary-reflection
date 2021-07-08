//package cn.edu.jxnu.leetcode;
//
//import cn.edu.jxnu.leetcode.MinStack;
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
//public class MinStackTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9997a6714a3c9b8e09e() {
//
//    // Act, creating object to test constructor
//    final MinStack actual = new MinStack();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getMinOutputEmptyStackException99952a50acfe18ee3c2() {
//
//    // Arrange
//    final MinStack thisObj = new MinStack();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.getMin();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void popOutputEmptyStackException999470422011b5c62dd() {
//
//    // Arrange
//    final MinStack thisObj = new MinStack();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.pop();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
////failed_compile   // Test written by Diffblue Cover
////  @Test
////  public void pushInputPositiveOutputVoid9992103df400326cb11() {
////
////    // Arrange
////    final MinStack thisObj = new MinStack();
////    final int arg0 = 2_147_483_647;
////
////    // Act
////    thisObj.push(arg0);
////
////    // The method returns void, testing that no exception is thrown
////
////  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void topOutputEmptyStackException999ab3f0e0b15df4244() {
//
//    // Arrange
//    final MinStack thisObj = new MinStack();
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