package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.NumberOf0;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NumberOf0Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d5ecdd98ac3be82e() {

    // Act, creating object to test constructor
    final NumberOf0 actual = new NumberOf0();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf0_1InputZeroOutputZero999325567129d276fe9() {

    // Arrange
    final int arg0 = 0;

    // Act
    final int actual = NumberOf0.NumberOf0_1(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf0_2InputZeroOutputZero9996e555971ead34798() {

    // Arrange
    final int arg0 = 0;

    // Act
    final int actual = NumberOf0.NumberOf0_2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
