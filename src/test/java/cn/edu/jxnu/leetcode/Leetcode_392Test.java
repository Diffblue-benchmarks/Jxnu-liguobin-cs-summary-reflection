package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_392;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_392Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99909cbd097fb237cda() {

    // Act, creating object to test constructor
    final Leetcode_392 actual = new Leetcode_392();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSubsequenceInputNotNullNotNullOutputTrue999b00c23970396fff7() {

    // Arrange
    final Leetcode_392 thisObj = new Leetcode_392();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final boolean actual = thisObj.isSubsequence(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
