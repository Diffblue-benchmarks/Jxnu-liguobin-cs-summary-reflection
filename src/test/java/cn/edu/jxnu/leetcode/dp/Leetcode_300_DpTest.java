package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_300_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_300_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99904e5096dc4172028() {

    // Act, creating object to test constructor
    final Leetcode_300_Dp actual = new Leetcode_300_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lengthOfLIS2Input8OutputPositive999be7aafe67d1d6c1e() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = Leetcode_300_Dp.lengthOfLIS2(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lengthOfLISInput8OutputPositive9990308c3ccd79168af() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = Leetcode_300_Dp.lengthOfLIS(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
