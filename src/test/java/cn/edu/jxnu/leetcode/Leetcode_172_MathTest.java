package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_172_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_172_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999993e333a31f32f45() {

    // Act, creating object to test constructor
    final Leetcode_172_Math actual = new Leetcode_172_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void trailingZeroesInputPositiveOutputZero999d16d18bcc37a38e4() {

    // Arrange
    final Leetcode_172_Math thisObj = new Leetcode_172_Math();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.trailingZeroes(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
