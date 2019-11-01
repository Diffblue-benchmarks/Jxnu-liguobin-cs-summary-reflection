package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T44;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T44Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ffb4a2a0d9239969() {

    // Act, creating object to test constructor
    final T44 actual = new T44();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void ReverseSentence2InputNotNullOutputNotNull999e5b45f809c2cfcbc() {

    // Arrange
    final T44 thisObj = new T44();
    final String arg0 = "";

    // Act
    final String actual = thisObj.ReverseSentence2(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void ReverseSentenceInputNotNullOutputNotNull999e346c1692e5dfffc() {

    // Arrange
    final T44 thisObj = new T44();
    final String arg0 = "";

    // Act
    final String actual = thisObj.ReverseSentence(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseInput8ZeroZeroOutputVoid999e6ed2ad6896a6a3b() {

    // Arrange
    final T44 thisObj = new T44();
    final char[] arg0 = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    thisObj.reverse(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }
}
