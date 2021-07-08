package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_303_Interval;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_303_IntervalTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a8a63ac9ca829f2d() {

    // Act, creating object to test constructor
    final Leetcode_303_Interval actual = new Leetcode_303_Interval();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumArrayInput8OutputVoid999633feed9d629920a() {

    // Arrange
    final Leetcode_303_Interval thisObj = new Leetcode_303_Interval();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thisObj.NumArray(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sumRangeInputZeroZeroOutputNullPointerException9998510700bfb607d77() {

    // Arrange
    final Leetcode_303_Interval thisObj = new Leetcode_303_Interval();
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.sumRange(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
