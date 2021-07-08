package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T65;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T65Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99936546b8e2037efb5() {

    // Act, creating object to test constructor
    final T65 actual = new T65();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasPathCoreInput8ZeroZero8ZeroZero88OutputFalse9993f97939b79a19157() {

    // Arrange
    final T65 thisObj = new T65();
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 0;
    final int arg2 = 0;
    final char[] arg3 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg4 = 0;
    final int arg5 = 0;
    final boolean[] arg6 = { true, true, true, true, true, true, true, true };
    final int[] arg7 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.hasPathCore(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasPathInput8ZeroZero8OutputFalse99954869e27966c8c8c() {

    // Arrange
    final T65 thisObj = new T65();
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 0;
    final int arg2 = 0;
    final char[] arg3 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };

    // Act
    final boolean actual = thisObj.hasPath(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertFalse(actual);

  }
}
