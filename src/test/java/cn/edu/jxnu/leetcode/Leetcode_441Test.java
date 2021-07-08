package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_441;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_441Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void arrangeCoins2InputPositiveOutputPositive9997946e8ca4d50fc28() {

    // Arrange
    final Leetcode_441 thisObj = new Leetcode_441();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.arrangeCoins2(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void arrangeCoinsInputPositiveOutputPositive9994a2f41d2a4989196() {

    // Arrange
    final Leetcode_441 thisObj = new Leetcode_441();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.arrangeCoins(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99913df7631d5705da6() {

    // Act, creating object to test constructor
    final Leetcode_441 actual = new Leetcode_441();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
