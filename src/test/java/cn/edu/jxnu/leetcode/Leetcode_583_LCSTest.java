package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_583_LCS;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_583_LCSTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f38fb156b2b271bc() {

    // Act, creating object to test constructor
    final Leetcode_583_LCS actual = new Leetcode_583_LCS();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minDistanceInputNotNullNotNullOutputZero9990e1a35ff8c3dfe23() {

    // Arrange
    final Leetcode_583_LCS thisObj = new Leetcode_583_LCS();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final int actual = thisObj.minDistance(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
