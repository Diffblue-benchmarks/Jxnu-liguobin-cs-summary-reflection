package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.IsThePowerOf2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsThePowerOf2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e4962d5ae50a6cc8() {

    // Act, creating object to test constructor
    final IsThePowerOf2 actual = new IsThePowerOf2();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void powerOf2InputZeroOutputNegative9990cf9364de2bbd476() {

    // Arrange
    final long arg0 = 0L;

    // Act
    final int actual = IsThePowerOf2.powerOf2(arg0);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
