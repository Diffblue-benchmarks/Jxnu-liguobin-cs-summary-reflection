package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_188_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_188_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d03544ce0c452eee() {

    // Act, creating object to test constructor
    final Leetcode_188_Dp actual = new Leetcode_188_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProfitInputPositive8OutputZero999eff6299bbd4f410a() {

    // Arrange
    final Leetcode_188_Dp thisObj = new Leetcode_188_Dp();
    final int arg0 = 1;
    final int[] arg1 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.maxProfit(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
