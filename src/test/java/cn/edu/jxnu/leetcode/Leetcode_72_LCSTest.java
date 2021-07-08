package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_72_LCS;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_72_LCSTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99932d4cc7865955090() {

    // Act, creating object to test constructor
    final Leetcode_72_LCS actual = new Leetcode_72_LCS();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minDistanceInputNotNullNotNullOutputZero9996a1b057e92d4ce04() {

    // Arrange
    final Leetcode_72_LCS thisObj = new Leetcode_72_LCS();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final int actual = thisObj.minDistance(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
