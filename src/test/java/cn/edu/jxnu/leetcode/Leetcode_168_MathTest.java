package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_168_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_168_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d857fc2c84727859() {

    // Act, creating object to test constructor
    final Leetcode_168_Math actual = new Leetcode_168_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void convertToTitleInputPositiveOutputNotNull999d8cbb76c80049bde() {

    // Arrange
    final int arg0 = 1;

    // Act
    final String actual = Leetcode_168_Math.convertToTitle(arg0);

    // Assert result
    Assert.assertEquals("A", actual);

  }
}
