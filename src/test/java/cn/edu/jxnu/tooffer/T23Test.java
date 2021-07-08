package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T23;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T23Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996ad9bf4f37c61b21() {

    // Act, creating object to test constructor
    final T23 actual = new T23();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isBSTInput8ZeroZeroOutputTrue999276d117b1d0633d0() {

    // Arrange
    final T23 thisObj = new T23();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    final boolean actual = thisObj.isBST(arg0, arg1, arg2);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void VerifySquenceOfBSTInput8OutputTrue999a94bc320054c06c2() {

    // Arrange
    final T23 thisObj = new T23();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.VerifySquenceOfBST(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
