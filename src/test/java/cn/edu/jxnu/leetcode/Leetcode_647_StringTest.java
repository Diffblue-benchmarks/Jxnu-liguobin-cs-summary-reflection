package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_647_String;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_647_StringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99947c19d81f53bf2b2() {

    // Act, creating object to test constructor
    final Leetcode_647_String actual = new Leetcode_647_String();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void countSubstringsInputNotNullOutputPositive9992c2ee591f87e00fd() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final int actual = Leetcode_647_String.countSubstrings(arg0);

    // Assert result
    Assert.assertEquals(15, actual);

  }
}
