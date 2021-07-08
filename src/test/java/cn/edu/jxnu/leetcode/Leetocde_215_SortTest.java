//package cn.edu.jxnu.leetcode;
//
//import cn.edu.jxnu.leetcode.Leetocde_215_Sort;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//
//
//
//public class Leetocde_215_SortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999cd14f90647170f66() {
//
//    // Act, creating object to test constructor
//    final Leetocde_215_Sort actual = new Leetocde_215_Sort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void findKthLargest1Input8ZeroOutputNullPointerException9998ae52b21cf426349() {
//
//    // Arrange
//    final Leetocde_215_Sort thisObj = new Leetocde_215_Sort();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int arg1 = 0;
//
//    // Act
//    thrown.expect(NullPointerException.class);
//    thisObj.findKthLargest1(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void findKthLargest2Input8ZeroOutputArrayIndexOutOfBoundsException99937ea3d7bc281a210() {
//
//    // Arrange
//    final Leetocde_215_Sort thisObj = new Leetocde_215_Sort();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int arg1 = 0;
//
//    // Act
//    thrown.expect(ArrayIndexOutOfBoundsException.class);
//    thisObj.findKthLargest2(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void findKthLargestInput8ZeroOutputArrayIndexOutOfBoundsException999efddddab020e22fe() {
//
//    // Arrange
//    final Leetocde_215_Sort thisObj = new Leetocde_215_Sort();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int arg1 = 0;
//
//    // Act
//    thrown.expect(ArrayIndexOutOfBoundsException.class);
//    thisObj.findKthLargest(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//