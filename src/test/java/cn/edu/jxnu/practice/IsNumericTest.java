package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.IsNumeric;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsNumericTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997453f22926365cd1() {

    // Act, creating object to test constructor
    final IsNumeric actual = new IsNumeric();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNumeric2Input8OutputFalse9997815e195299fac39() {

    // Arrange
    final IsNumeric thisObj = new IsNumeric();
    final char[] arg0 = { '+', '+', '+', '+', '+', '+', '+', '+' };

    // Act
    final boolean actual = thisObj.isNumeric2(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNumericInput8OutputFalse999f4ed5d46ba910642() {

    // Arrange
    final IsNumeric thisObj = new IsNumeric();
    final char[] arg0 = { '+', '+', '+', '+', '+', '+', '+', '+' };

    // Act
    final boolean actual = thisObj.isNumeric(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
