package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_413_Interval;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_413_IntervalTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d6df1448ccc9e7c3() {

    // Act, creating object to test constructor
    final Leetcode_413_Interval actual = new Leetcode_413_Interval();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void numberOfArithmeticSlicesInput8OutputPositive999e6a1e8ef7320869c() {

    // Arrange
    final Leetcode_413_Interval thisObj = new Leetcode_413_Interval();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.numberOfArithmeticSlices(arg0);

    // Assert result
    Assert.assertEquals(21, actual);

  }
}
