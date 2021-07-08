package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T53;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T53Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b35213cc96a7b919() {

    // Act, creating object to test constructor
    final T53 actual = new T53();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNumeric2Input8OutputFalse99924b85819d6324d7c() {

    // Arrange
    final T53 thisObj = new T53();
    final char[] arg0 = { '+', '+', '+', '+', '+', '+', '+', '+' };

    // Act
    final boolean actual = thisObj.isNumeric2(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNumericInput8OutputFalse999697e863be14b2c65() {

    // Arrange
    final T53 thisObj = new T53();
    final char[] arg0 = { '+', '+', '+', '+', '+', '+', '+', '+' };

    // Act
    final boolean actual = thisObj.isNumeric(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
