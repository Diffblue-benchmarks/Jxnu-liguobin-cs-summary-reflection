package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_200_DFS;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_200_DFSTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992bd838ecd0fd69a9() {

    // Act, creating object to test constructor
    final Leetcode_200_DFS actual = new Leetcode_200_DFS();

    // Assert result
    Assert.assertNotNull(actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void numIslandsInput3OutputZero999de661acc2512cef3() {
//
//    // Arrange
//    final Leetcode_200_DFS thisObj = new Leetcode_200_DFS();
//    final char[] myCharArray = { '0', '0', '0', '0', '0', '0', '0', '0' };
//    final char[] myCharArray1 = { '0', '0', '0', '0', '0', '0', '0', '0' };
//    final char[] myCharArray2 = { '0', '0', '0', '0', '0', '0', '0', '0' };
//    final char[] arg0 = { myCharArray, myCharArray1, myCharArray2 };
//
//    // Act
//    final int actual = thisObj.numIslands(arg0);
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
}
