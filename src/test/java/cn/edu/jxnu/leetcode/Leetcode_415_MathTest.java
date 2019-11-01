package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_415_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_415_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addStringsInputNotNullNotNullOutputNotNull999fc50fadadd3346e1() {

    // Arrange
    final Leetcode_415_Math thisObj = new Leetcode_415_Math();
    final String arg0 = "0";
    final String arg1 = "0";

    // Act
    final String actual = thisObj.addStrings(arg0, arg1);

    // Assert result
    Assert.assertEquals("0", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99966d2d09dbd2d5057() {

    // Act, creating object to test constructor
    final Leetcode_415_Math actual = new Leetcode_415_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
