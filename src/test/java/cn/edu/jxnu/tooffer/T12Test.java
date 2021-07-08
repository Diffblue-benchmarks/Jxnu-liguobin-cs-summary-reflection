package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T12;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T12Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e13cc9032e6fc0d8() {

    // Act, creating object to test constructor
    final T12 actual = new T12();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Power1InputPositivePositiveOutputPositive9993166978cea685904() {

    // Arrange
    final T12 thisObj = new T12();
    final double arg0 = 1.0;
    final int arg1 = 1;

    // Act
    final double actual = thisObj.Power1(arg0, arg1);

    // Assert result
    Assert.assertEquals(1.0, actual, 0.0);

  }

  // Test written by Diffblue Cover
  @Test
  public void Power3InputPositivePositiveOutputPositive999d7d5e14c86e8c9a3() {

    // Arrange
    final T12 thisObj = new T12();
    final double arg0 = 1.0;
    final int arg1 = 1;

    // Act
    final double actual = thisObj.Power3(arg0, arg1);

    // Assert result
    Assert.assertEquals(1.0, actual, 0.0);

  }

  // Test written by Diffblue Cover
  @Test
  public void PowerInputPositivePositiveOutputPositive99935a42801c961abe7() {

    // Arrange
    final T12 thisObj = new T12();
    final double arg0 = 1.0;
    final int arg1 = 1;

    // Act
    final double actual = thisObj.Power(arg0, arg1);

    // Assert result
    Assert.assertEquals(1.0, actual, 0.0);

  }
}
