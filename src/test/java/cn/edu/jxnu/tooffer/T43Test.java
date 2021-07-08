package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T43;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T43Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999172c92543f290af9() {

    // Act, creating object to test constructor
    final T43 actual = new T43();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void LeftRotateString2InputNotNullZeroOutputNotNull999d64f861524ce35f6() {

    // Arrange
    final T43 thisObj = new T43();
    final String arg0 = "aaaaa";
    final int arg1 = 0;

    // Act
    final String actual = thisObj.LeftRotateString2(arg0, arg1);

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void LeftRotateStringInputNotNullZeroOutputNotNull999c98eb49755ce4603() {

    // Arrange
    final T43 thisObj = new T43();
    final String arg0 = "aaaaa";
    final int arg1 = 0;

    // Act
    final String actual = thisObj.LeftRotateString(arg0, arg1);

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseInput8ZeroZeroOutputVoid999d21b3d281be0e23c() {

    // Arrange
    final T43 thisObj = new T43();
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    thisObj.reverse(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }
}
