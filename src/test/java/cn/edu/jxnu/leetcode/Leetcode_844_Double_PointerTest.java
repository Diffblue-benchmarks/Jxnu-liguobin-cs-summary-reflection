package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_844_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_844_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void backspaceCompare2InputNotNullNotNullOutputTrue999fde4f1388eac53a3() {

    // Arrange
    final Leetcode_844_Double_Pointer thisObj = new Leetcode_844_Double_Pointer();
    final String arg0 = "#";
    final String arg1 = "#";

    // Act
    final boolean actual = thisObj.backspaceCompare2(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void backspaceCompareInputNotNullNotNullOutputTrue999f2fa55efe85dcac4() {

    // Arrange
    final Leetcode_844_Double_Pointer thisObj = new Leetcode_844_Double_Pointer();
    final String arg0 = "#";
    final String arg1 = "#";

    // Act
    final boolean actual = thisObj.backspaceCompare(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999928a2ec1cd1f8e37() {

    // Act, creating object to test constructor
    final Leetcode_844_Double_Pointer actual = new Leetcode_844_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
