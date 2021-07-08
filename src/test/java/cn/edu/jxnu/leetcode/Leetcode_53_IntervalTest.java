package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_53_Interval;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_53_IntervalTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e264331464ae987f() {

    // Act, creating object to test constructor
    final Leetcode_53_Interval actual = new Leetcode_53_Interval();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxSubArrayInput8OutputPositive9991bc7f76c9d26a566() {

    // Arrange
    final Leetcode_53_Interval thisObj = new Leetcode_53_Interval();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.maxSubArray(arg0);

    // Assert result
    Assert.assertEquals(8, actual);

  }
}
