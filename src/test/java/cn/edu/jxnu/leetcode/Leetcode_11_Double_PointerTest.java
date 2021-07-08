package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_11_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_11_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99996c2673d6ff65a79() {

    // Act, creating object to test constructor
    final Leetcode_11_Double_Pointer actual = new Leetcode_11_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxAreaInput8OutputZero99940572f2c41e18943() {

    // Arrange
    final Leetcode_11_Double_Pointer thisObj = new Leetcode_11_Double_Pointer();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.maxArea(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
