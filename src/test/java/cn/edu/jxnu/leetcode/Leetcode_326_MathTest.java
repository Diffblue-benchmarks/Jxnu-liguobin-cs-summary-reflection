package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_326_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_326_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99950e48efa609089cc() {

    // Act, creating object to test constructor
    final Leetcode_326_Math actual = new Leetcode_326_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getMaxPowerOfThreeOutputPositive9992a0054e1cc96c580() {
//
//    // Act
//    final int actual = Leetcode_326_Math.getMaxPowerOfThree();
//
//    // Assert result
//    Assert.assertEquals(1_162_261_467, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void isPowerOfThreeInputPositiveOutputTrue99976cbac5de9351f25() {

    // Arrange
    final Leetcode_326_Math thisObj = new Leetcode_326_Math();
    final int arg0 = 1;

    // Act
    final boolean actual = thisObj.isPowerOfThree(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
