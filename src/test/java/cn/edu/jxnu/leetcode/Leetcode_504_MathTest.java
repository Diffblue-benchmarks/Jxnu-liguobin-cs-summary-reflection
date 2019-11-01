package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_504_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_504_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b9b4f8b3d25f61a7() {

    // Act, creating object to test constructor
    final Leetcode_504_Math actual = new Leetcode_504_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToBase_7InputZeroOutputNotNull99996101d106322e678() {

    // Arrange
    final int arg0 = 0;

    // Act
    final String actual = Leetcode_504_Math.convertToBase_7(arg0);

    // Assert result
    Assert.assertEquals("0", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToBase7InputZeroOutputNotNull99918126cf039934575() {

    // Arrange
    final int arg0 = 0;

    // Act
    final String actual = Leetcode_504_Math.convertToBase7(arg0);

    // Assert result
    Assert.assertEquals("0", actual);

  }
}
