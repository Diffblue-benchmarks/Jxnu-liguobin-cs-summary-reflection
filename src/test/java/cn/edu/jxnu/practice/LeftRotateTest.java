package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.LeftRotate;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LeftRotateTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99991b227ef60075b58() {

    // Act, creating object to test constructor
    final LeftRotate actual = new LeftRotate();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void LeftRotateStringInputNotNullZeroOutputNotNull99912bb1b5d36131ba4() {

    // Arrange
    final LeftRotate thisObj = new LeftRotate();
    final String arg0 = "";
    final int arg1 = 0;

    // Act
    final String actual = thisObj.LeftRotateString(arg0, arg1);

    // Assert result
    Assert.assertEquals("", actual);

  }
}
