package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_567_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_567_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void checkInclusionInputNotNullNotNullOutputTrue9993ee6ed2303236297() {

    // Arrange
    final Leetcode_567_Double_Pointer thisObj = new Leetcode_567_Double_Pointer();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final boolean actual = thisObj.checkInclusion(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999021ced80e6fa95e0() {

    // Act, creating object to test constructor
    final Leetcode_567_Double_Pointer actual = new Leetcode_567_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
