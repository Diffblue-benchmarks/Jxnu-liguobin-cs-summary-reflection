package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T30;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class T30Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9993b2fbd9c3b43f124() {

    // Act, creating object to test constructor
    final T30 actual = new T30();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void FindGreatestSumOfSubArrayInput8OutputPositive9992fde0bea0c3ce3de() {

    // Arrange
    final T30 thisObj = new T30();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.FindGreatestSumOfSubArray(arg0);

    // Assert result
    Assert.assertEquals(8, actual);

  }
}
