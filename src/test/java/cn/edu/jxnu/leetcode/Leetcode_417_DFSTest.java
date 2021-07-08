package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_417_DFS;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.List;



public class Leetcode_417_DFSTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99928c0793f09abffbd() {

    // Act, creating object to test constructor
    final Leetcode_417_DFS actual = new Leetcode_417_DFS();

    // Assert result
    Assert.assertNotNull(actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void dfsInputNegativeNegative3OutputArrayIndexOutOfBoundsException99913f69760d2474579() {
//
//    // Arrange
//    final Leetcode_417_DFS thisObj = new Leetcode_417_DFS();
//    final int arg0 = -1;
//    final int arg1 = -1;
//    final boolean[] myBooleanArray = { true, true, true, true, true, true, true, true };
//    final boolean[] myBooleanArray1 = { true, true, true, true, true, true, true, true };
//    final boolean[] arg2 = { myBooleanArray, myBooleanArray1, myBooleanArray };
//
//    // Act
//    thrown.expect(ArrayIndexOutOfBoundsException.class);
//    thisObj.dfs(arg0, arg1, arg2);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void pacificAtlanticInput3Output249993e027a84445976dc() {
//
//    // Arrange
//    final Leetcode_417_DFS thisObj = new Leetcode_417_DFS();
//    final int[] myIntArray = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray1 = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray2 = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//
//    // Act
//    final List<int[]> actual = thisObj.pacificAtlantic(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(24, actual.size());
//    Assert.assertArrayEquals(new int[]{ 0, 0 }, actual.get(0));
//    Assert.assertArrayEquals(new int[]{ 0, 1 }, actual.get(1));
//    Assert.assertArrayEquals(new int[]{ 0, 2 }, actual.get(2));
//    Assert.assertArrayEquals(new int[]{ 0, 3 }, actual.get(3));
//    Assert.assertArrayEquals(new int[]{ 0, 4 }, actual.get(4));
//    Assert.assertArrayEquals(new int[]{ 0, 5 }, actual.get(5));
//    Assert.assertArrayEquals(new int[]{ 0, 6 }, actual.get(6));
//    Assert.assertArrayEquals(new int[]{ 0, 7 }, actual.get(7));
//    Assert.assertArrayEquals(new int[]{ 1, 0 }, actual.get(8));
//    Assert.assertArrayEquals(new int[]{ 1, 1 }, actual.get(9));
//    Assert.assertArrayEquals(new int[]{ 1, 2 }, actual.get(10));
//    Assert.assertArrayEquals(new int[]{ 1, 3 }, actual.get(11));
//    Assert.assertArrayEquals(new int[]{ 1, 4 }, actual.get(12));
//    Assert.assertArrayEquals(new int[]{ 1, 5 }, actual.get(13));
//    Assert.assertArrayEquals(new int[]{ 1, 6 }, actual.get(14));
//    Assert.assertArrayEquals(new int[]{ 1, 7 }, actual.get(15));
//    Assert.assertArrayEquals(new int[]{ 2, 0 }, actual.get(16));
//    Assert.assertArrayEquals(new int[]{ 2, 1 }, actual.get(17));
//    Assert.assertArrayEquals(new int[]{ 2, 2 }, actual.get(18));
//    Assert.assertArrayEquals(new int[]{ 2, 3 }, actual.get(19));
//    Assert.assertArrayEquals(new int[]{ 2, 4 }, actual.get(20));
//    Assert.assertArrayEquals(new int[]{ 2, 5 }, actual.get(21));
//    Assert.assertArrayEquals(new int[]{ 2, 6 }, actual.get(22));
//    Assert.assertArrayEquals(new int[]{ 2, 7 }, actual.get(23));
//
//  }
}
