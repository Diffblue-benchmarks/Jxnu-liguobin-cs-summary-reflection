package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_322_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_322_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void coinChangeInput8ZeroOutputZero999521d65d7d526611f() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final int actual = Leetcode_322_Dp.coinChange(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c3957f3ebf2b3070() {

    // Act, creating object to test constructor
    final Leetcode_322_Dp actual = new Leetcode_322_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
