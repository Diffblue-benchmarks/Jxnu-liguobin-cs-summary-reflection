package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_42_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_42_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998a4b2dbb6dff956f() {

    // Act, creating object to test constructor
    final Leetcode_42_Double_Pointer actual = new Leetcode_42_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void trapInput8OutputZero999ca2719049e1f6881() {

    // Arrange
    final Leetcode_42_Double_Pointer thisObj = new Leetcode_42_Double_Pointer();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.trap(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
