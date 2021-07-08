package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_845_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_845_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e59ac2d7f101d9d1() {

    // Act, creating object to test constructor
    final Leetcode_845_Dp actual = new Leetcode_845_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void longestMountain2Input8OutputZero9996bf43e92145b3241() {

    // Arrange
    final Leetcode_845_Dp thisObj = new Leetcode_845_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.longestMountain2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void longestMountain3Input8OutputZero9997516b0875988782f() {

    // Arrange
    final Leetcode_845_Dp thisObj = new Leetcode_845_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.longestMountain3(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void longestMountainInput8OutputZero9996afe0d343ff1b212() {

    // Arrange
    final Leetcode_845_Dp thisObj = new Leetcode_845_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.longestMountain(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
