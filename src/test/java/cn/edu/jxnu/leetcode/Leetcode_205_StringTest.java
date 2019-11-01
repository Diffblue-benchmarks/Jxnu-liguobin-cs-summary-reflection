package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_205_String;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_205_StringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99945dfa60b277b49c9() {

    // Act, creating object to test constructor
    final Leetcode_205_String actual = new Leetcode_205_String();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isIsomorphic2InputNotNullNotNullOutputTrue999ea18ec968af9e5af() {

    // Arrange
    final String arg0 = "add";
    final String arg1 = "add";

    // Act
    final boolean actual = Leetcode_205_String.isIsomorphic2(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isIsomorphicInputNotNullNotNullOutputTrue99911d6cf326904591f() {

    // Arrange
    final String arg0 = "add";
    final String arg1 = "add";

    // Act
    final boolean actual = Leetcode_205_String.isIsomorphic(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
