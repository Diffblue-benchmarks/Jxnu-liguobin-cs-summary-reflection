package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_650_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_650_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99967c6ef8c0ef1eabe() {

    // Act, creating object to test constructor
    final Leetcode_650_Dp actual = new Leetcode_650_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minSteps2InputPositiveOutputZero999ab40319648bd0a99() {

    // Arrange
    final int arg0 = 1;

    // Act
    final int actual = Leetcode_650_Dp.minSteps2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minStepsInputPositiveOutputZero999cf23ee32c2bd2e32() {

    // Arrange
    final int arg0 = 1;

    // Act
    final int actual = Leetcode_650_Dp.minSteps(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
