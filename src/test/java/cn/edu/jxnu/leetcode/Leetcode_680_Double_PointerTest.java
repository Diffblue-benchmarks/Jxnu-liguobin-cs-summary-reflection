package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_680_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_680_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d3a1e49b305ee0b1() {

    // Act, creating object to test constructor
    final Leetcode_680_Double_Pointer actual = new Leetcode_680_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void validPalindromeInputNotNullOutputTrue999fab34da994dfaa34() {

    // Arrange
    final Leetcode_680_Double_Pointer thisObj = new Leetcode_680_Double_Pointer();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.validPalindrome(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
