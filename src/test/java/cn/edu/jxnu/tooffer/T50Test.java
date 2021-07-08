package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T50;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T50Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991ddd4bd0fc13329d() {

    // Act, creating object to test constructor
    final T50 actual = new T50();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void duplicateInput8Zero8OutputFalse999a2c529433e68709a() {

    // Arrange
    final T50 thisObj = new T50();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int[] arg2 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.duplicate(arg0, arg1, arg2);

    // Assert result
    Assert.assertFalse(actual);

  }
}
