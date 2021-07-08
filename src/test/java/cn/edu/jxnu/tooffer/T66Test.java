package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T66;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class T66Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void bitSumInputZeroOutputZero999737a8eab9a4d13ba() {

    // Arrange
    final T66 thisObj = new T66();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.bitSum(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999df645a9d290e818f() {

    // Act, creating object to test constructor
    final T66 actual = new T66();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void countingStepInputZeroZeroZeroZeroZero3OutputZero99909f92f3f59766ff4() {
//
//    // Arrange
//    final T66 thisObj = new T66();
//    final int arg0 = 0;
//    final int arg1 = 0;
//    final int arg2 = 0;
//    final int arg3 = 0;
//    final int arg4 = 0;
//    final boolean[] myBooleanArray = { true, true, true, true, true, true, true, true };
//    final boolean[] myBooleanArray1 = { true, true, true, true, true, true, true, true };
//    final boolean[] myBooleanArray2 = { true, true, true, true, true, true, true, true };
//    final boolean[] arg5 = { myBooleanArray, myBooleanArray1, myBooleanArray2 };
//
//    // Act
//    final int actual = thisObj.countingStep(arg0, arg1, arg2, arg3, arg4, arg5);
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void movingCountInputZeroZeroZeroOutputZero9997a3d7e889b3bb462() {

    // Arrange
    final T66 thisObj = new T66();
    final int arg0 = 0;
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    final int actual = thisObj.movingCount(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
