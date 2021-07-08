package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_377_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_377_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void combinationSum4Input8ZeroOutputPositive999fef1d62ef8b2f665() {

    // Arrange
    final Leetcode_377_Dp thisObj = new Leetcode_377_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final int actual = thisObj.combinationSum4(arg0, arg1);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999266b8f8c4fc3a0d2() {

    // Act, creating object to test constructor
    final Leetcode_377_Dp actual = new Leetcode_377_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
