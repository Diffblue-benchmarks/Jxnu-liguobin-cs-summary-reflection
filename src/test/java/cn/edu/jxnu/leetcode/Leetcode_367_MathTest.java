package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_367_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_367_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a38711994bc77a52() {

    // Act, creating object to test constructor
    final Leetcode_367_Math actual = new Leetcode_367_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isPerfectSquareInputPositiveOutputTrue999db4aa91497440668() {

    // Arrange
    final int arg0 = 1;

    // Act
    final boolean actual = Leetcode_367_Math.isPerfectSquare(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999a345a80e4ae29df9() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Leetcode_367_Math.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
