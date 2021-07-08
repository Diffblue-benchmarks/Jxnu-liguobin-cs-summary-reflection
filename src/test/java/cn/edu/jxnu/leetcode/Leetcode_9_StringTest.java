package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_9_String;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_9_StringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998d87061fea587bce() {

    // Act, creating object to test constructor
    final Leetcode_9_String actual = new Leetcode_9_String();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isPalindrome2InputZeroOutputTrue99966e4158b5a365933() {

    // Arrange
    final Leetcode_9_String thisObj = new Leetcode_9_String();
    final int arg0 = 0;

    // Act
    final boolean actual = thisObj.isPalindrome2(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isPalindromeInputZeroOutputTrue999a75fcc4c22c54289() {

    // Arrange
    final Leetcode_9_String thisObj = new Leetcode_9_String();
    final int arg0 = 0;

    // Act
    final boolean actual = thisObj.isPalindrome(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9992e36866431a6e707() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Leetcode_9_String.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
