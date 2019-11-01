package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_169_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_169_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a5c892915cbfda56() {

    // Act, creating object to test constructor
    final Leetcode_169_Math actual = new Leetcode_169_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void majorityElement2Input8OutputZero9993eb8f94d096928c4() {

    // Arrange
    final Leetcode_169_Math thisObj = new Leetcode_169_Math();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.majorityElement2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void majorityElementInput8OutputZero9996630e4a1f6e660e7() {

    // Arrange
    final Leetcode_169_Math thisObj = new Leetcode_169_Math();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.majorityElement(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
