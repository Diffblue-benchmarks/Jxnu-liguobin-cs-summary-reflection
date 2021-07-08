package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_409_String;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_409_StringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999443a3619409adb09() {

    // Act, creating object to test constructor
    final Leetcode_409_String actual = new Leetcode_409_String();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void longestPalindromeInputNotNullOutputPositive99991595fe9369c5285() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final int actual = Leetcode_409_String.longestPalindrome(arg0);

    // Assert result
    Assert.assertEquals(5, actual);

  }
}
