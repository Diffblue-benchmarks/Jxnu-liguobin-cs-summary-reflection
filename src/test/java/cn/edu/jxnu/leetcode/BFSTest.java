//package cn.edu.jxnu.leetcode;
//
//import cn.edu.jxnu.leetcode.BFS;
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
//public class BFSTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99996cf75606738b295() {
//
//    // Act, creating object to test constructor
//    final BFS actual = new BFS();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void minPathLengthInput3ZeroZeroOutputNegative9995ca5143c08f18d66() {
//
//    // Arrange
//    final BFS thisObj = new BFS();
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//    final int arg1 = 0;
//    final int arg2 = 0;
//
//    // Act
//    final int actual = thisObj.minPathLength(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertEquals(-1, actual);
//
//  }
//}
//