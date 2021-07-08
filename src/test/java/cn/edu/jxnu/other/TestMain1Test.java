package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class TestMain1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

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

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999da15c042ec8ea735() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    TestMain1.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

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
