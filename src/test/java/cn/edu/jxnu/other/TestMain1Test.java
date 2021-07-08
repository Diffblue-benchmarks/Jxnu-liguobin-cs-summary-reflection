package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestMain1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ffd86915a288c2a0() {

    // Act, creating object to test constructor
    final TestMain1 actual = new TestMain1();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void longestPalindromeInputNotNullOutputNotNull999ee111677b3a9907e() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = TestMain1.longestPalindrome(arg0);

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseStringInputNotNullOutputNotNull999f1214af84fc2437e() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = TestMain1.reverseString(arg0);

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }
}
