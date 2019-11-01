package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.PowerTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PowerTestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999321539bf10b448b() {

    // Act, creating object to test constructor
    final PowerTest actual = new PowerTest();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Power2InputPositivePositiveOutputPositive99923f0060a06d8a362() {

    // Arrange
    final PowerTest thisObj = new PowerTest();
    final double arg0 = 1.0;
    final int arg1 = 1;

    // Act
    final double actual = thisObj.Power2(arg0, arg1);

    // Assert result
    Assert.assertEquals(1.0, actual, 0.0);

  }

  // Test written by Diffblue Cover
  @Test
  public void PowerInputPositivePositiveOutputPositive9995300bf5342e4362c() {

    // Arrange
    final PowerTest thisObj = new PowerTest();
    final double arg0 = 1.0;
    final int arg1 = 1;

    // Act
    final double actual = thisObj.Power(arg0, arg1);

    // Assert result
    Assert.assertEquals(1.0, actual, 0.0);

  }
}
