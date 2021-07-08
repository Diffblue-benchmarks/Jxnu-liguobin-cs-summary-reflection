package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_121_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_121_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f304293f40f3fba2() {

    // Act, creating object to test constructor
    final Leetcode_121_Dp actual = new Leetcode_121_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProfitInput8OutputZero999ad3131e5094f547e() {

    // Arrange
    final Leetcode_121_Dp thisObj = new Leetcode_121_Dp();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.maxProfit(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
