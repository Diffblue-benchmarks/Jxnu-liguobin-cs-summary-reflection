package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_67_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_67_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addBinaryInputNotNullNotNullOutputNotNull9992b1d6ff9c9ef2ddc() {

    // Arrange
    final Leetcode_67_Math thisObj = new Leetcode_67_Math();
    final String arg0 = "1";
    final String arg1 = "1";

    // Act
    final String actual = thisObj.addBinary(arg0, arg1);

    // Assert result
    Assert.assertEquals("10", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990b9b6e19dc72dd01() {

    // Act, creating object to test constructor
    final Leetcode_67_Math actual = new Leetcode_67_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
