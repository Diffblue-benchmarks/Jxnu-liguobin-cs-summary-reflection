package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T6;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class T6Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994dc81f49f79d4ba0() {

    // Act, creating object to test constructor
    final T6 actual = new T6();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minNumberInRotateArrayInput8OutputZero999f440d06a9756a66d() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = T6.minNumberInRotateArray(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
