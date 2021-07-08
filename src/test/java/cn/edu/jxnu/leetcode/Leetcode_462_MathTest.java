package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_462_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_462_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990c70b66ffff2a4b7() {

    // Act, creating object to test constructor
    final Leetcode_462_Math actual = new Leetcode_462_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minMoves2Input8OutputZero999a9c8b8e3c948f10e() {

    // Arrange
    final Leetcode_462_Math thisObj = new Leetcode_462_Math();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.minMoves2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minMovesInput8OutputZero9997b0c8d47e8cf0992() {

    // Arrange
    final Leetcode_462_Math thisObj = new Leetcode_462_Math();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.minMoves(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
