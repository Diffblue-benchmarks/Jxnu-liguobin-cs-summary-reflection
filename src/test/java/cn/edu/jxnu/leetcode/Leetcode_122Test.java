package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_122;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_122Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999abb4f6bd78dd52fa() {

    // Act, creating object to test constructor
    final Leetcode_122 actual = new Leetcode_122();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProfitInput8OutputZero999717a54c6641181ba() {

    // Arrange
    final Leetcode_122 thisObj = new Leetcode_122();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.maxProfit(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
