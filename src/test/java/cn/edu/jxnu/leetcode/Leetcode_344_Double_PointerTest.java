package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_344_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_344_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99973b1253149cc7a8b() {

    // Act, creating object to test constructor
    final Leetcode_344_Double_Pointer actual = new Leetcode_344_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseStringInputNotNullOutputNotNull99973d22c7ab0c1e651() {

    // Arrange
    final Leetcode_344_Double_Pointer thisObj = new Leetcode_344_Double_Pointer();
    final String arg0 = "aaaaa";

    // Act
    final String actual = thisObj.reverseString(arg0);

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }
}
