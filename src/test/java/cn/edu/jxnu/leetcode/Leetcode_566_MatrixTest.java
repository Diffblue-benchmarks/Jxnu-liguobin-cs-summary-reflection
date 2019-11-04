package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_566_Matrix;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_566_MatrixTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d31cc75b36eb2066() {

    // Act, creating object to test constructor
    final Leetcode_566_Matrix actual = new Leetcode_566_Matrix();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void matrixReshape2Input3ZeroZeroOutput3999140f2f432368cde3() {
//
//    // Arrange
//    final Leetcode_566_Matrix thisObj = new Leetcode_566_Matrix();
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//    final int arg1 = 0;
//    final int arg2 = 0;
//
//    // Act
//    final int[] actual = thisObj.matrixReshape2(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(3, actual.length);
//    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0, 0, 0 }, ((int[]) actual[0]));
//    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0, 0, 0 }, ((int[]) actual[1]));
//    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0, 0, 0 }, ((int[]) actual[2]));
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void matrixReshapeInput3ZeroZeroOutput399956374415affdd915() {
//
//    // Arrange
//    final Leetcode_566_Matrix thisObj = new Leetcode_566_Matrix();
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//    final int arg1 = 0;
//    final int arg2 = 0;
//
//    // Act
//    final int[] actual = thisObj.matrixReshape(arg0, arg1, arg2);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(3, actual.length);
//    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0, 0, 0 }, ((int[]) actual[0]));
//    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0, 0, 0 }, ((int[]) actual[1]));
//    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0, 0, 0 }, ((int[]) actual[2]));
//
//  }
}
