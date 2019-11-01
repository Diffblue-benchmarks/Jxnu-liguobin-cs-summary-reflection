package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T9;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T9Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999feddbf0a55369a19() {

    // Act, creating object to test constructor
    final T9 actual = new T9();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void JumpFloorII2InputPositiveOutputPositive9998ccc0fd74e5be7cc() {

    // Arrange
    final T9 thisObj = new T9();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.JumpFloorII2(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void JumpFloorIIInputPositiveOutputPositive999b5e5778547e053c9() {

    // Arrange
    final T9 thisObj = new T9();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.JumpFloorII(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
