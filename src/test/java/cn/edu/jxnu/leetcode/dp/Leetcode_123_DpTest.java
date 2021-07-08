package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_123_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_123_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f9bc1fea2e37a339() {

    // Act, creating object to test constructor
    final Leetcode_123_Dp actual = new Leetcode_123_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProfit2Input8OutputZero999d3aaf8d2c5fc64f5() {

    // Arrange
    final Leetcode_123_Dp thisObj = new Leetcode_123_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.maxProfit2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProfitInput8OutputZero9999a810a205ca9b02a() {

    // Arrange
    final Leetcode_123_Dp thisObj = new Leetcode_123_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.maxProfit(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
