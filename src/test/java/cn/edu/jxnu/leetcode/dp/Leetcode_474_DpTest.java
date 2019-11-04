package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_474_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_474_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999989b2c1fda6df07f() {

    // Act, creating object to test constructor
    final Leetcode_474_Dp actual = new Leetcode_474_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findMaxFormInput3ZeroZeroOutputZero999cce1a98af04cc61c() {

    // Arrange
    final Leetcode_474_Dp thisObj = new Leetcode_474_Dp();
    final String[] arg0 = { "0", "0", "0" };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    final int actual = thisObj.findMaxForm(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
