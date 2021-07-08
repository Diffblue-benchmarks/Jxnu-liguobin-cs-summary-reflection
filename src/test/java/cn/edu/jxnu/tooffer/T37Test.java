package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T37;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T37Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f21769affe54ab5c() {

    // Act, creating object to test constructor
    final T37 actual = new T37();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void GetNumberOfKInput8ZeroOutputPositive999a856ed0356ddebd2() {

    // Arrange
    final T37 thisObj = new T37();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final int actual = thisObj.GetNumberOfK(arg0, arg1);

    // Assert result
    Assert.assertEquals(8, actual);

  }
}
