package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_290_String;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_290_StringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999223b9720b2acec66() {

    // Act, creating object to test constructor
    final Leetcode_290_String actual = new Leetcode_290_String();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void wordPattern_MyInputNotNullNotNullOutputFalse999bd6c0ff44c1cbf5e() {

    // Arrange
    final String arg0 = " ";
    final String arg1 = " ";

    // Act
    final boolean actual = Leetcode_290_String.wordPattern_My(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void wordPatternInputNotNullNotNullOutputFalse9998d67cdd93c5e03e6() {

    // Arrange
    final String arg0 = " ";
    final String arg1 = " ";

    // Act
    final boolean actual = Leetcode_290_String.wordPattern(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }
}
