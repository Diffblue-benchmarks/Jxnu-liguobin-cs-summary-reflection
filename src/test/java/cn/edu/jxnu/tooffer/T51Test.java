package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T51;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class T51Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99982e8553af6898aff() {

    // Act, creating object to test constructor
    final T51 actual = new T51();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void multiplyInput8Output89999733bf7e533298a0() {

    // Arrange
    final T51 thisObj = new T51();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int[] actual = thisObj.multiply(arg0);

    // Assert result
    Assert.assertArrayEquals(new int[]{ 1, 1, 1, 1, 1, 1, 1, 1 }, actual);

  }
}
