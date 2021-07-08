package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_242_String;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_242_StringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999793446edb3c6edcf() {

    // Act, creating object to test constructor
    final Leetcode_242_String actual = new Leetcode_242_String();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isAnagramInputNotNullNotNullOutputTrue999a8568eff8f076139() {

    // Arrange
    final String arg0 = "bcda";
    final String arg1 = "bcda";

    // Act
    final boolean actual = Leetcode_242_String.isAnagram(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
