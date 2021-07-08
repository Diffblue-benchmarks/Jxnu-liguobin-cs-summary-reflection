package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T11;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T11Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99966ce7e20a63b9e68() {

    // Act, creating object to test constructor
    final T11 actual = new T11();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9994cb14f933a97cd91() {

    // Arrange
    final String[] arg0 = { "1", "1", "1" };

    // Act
    T11.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1InputNegativeOutputPositive9997d2bca422cf2b8fe() {

    // Arrange
    final T11 thisObj = new T11();
    final int arg0 = -11;

    // Act
    final int actual = thisObj.NumberOf1(arg0);

    // Assert result
    Assert.assertEquals(30, actual);

  }
}
