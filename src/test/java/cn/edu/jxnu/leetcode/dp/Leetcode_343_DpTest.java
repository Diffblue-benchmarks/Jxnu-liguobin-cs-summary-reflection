package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_343_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_343_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d57797a54f47bd03() {

    // Act, creating object to test constructor
    final Leetcode_343_Dp actual = new Leetcode_343_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void integerBreakInputPositiveOutputPositive999824f9e1f6e350cf1() {

    // Arrange
    final Leetcode_343_Dp thisObj = new Leetcode_343_Dp();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.integerBreak(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
