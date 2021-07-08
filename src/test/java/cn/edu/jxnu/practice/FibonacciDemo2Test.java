package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FibonacciDemo2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FibonacciDemo2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ab241eac05982a8c() {

    // Act, creating object to test constructor
    final FibonacciDemo2 actual = new FibonacciDemo2();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void RectCoverInputZeroOutputZero999078772d9ea734b44() {

    // Arrange
    final FibonacciDemo2 thisObj = new FibonacciDemo2();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.RectCover(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
