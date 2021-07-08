package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FindGreatestSumOfSubArray;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class FindGreatestSumOfSubArrayTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bbe1a4d48e96f7f8() {

    // Act, creating object to test constructor
    final FindGreatestSumOfSubArray actual = new FindGreatestSumOfSubArray();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void FindGreatestSumOfSubArray2Input8OutputPositive99959b8497e56c62527() {

    // Arrange
    final FindGreatestSumOfSubArray thisObj = new FindGreatestSumOfSubArray();
    final int[] arg0 = { 2, 2, 2, 2, 2, 2, 2, 2 };

    // Act
    final int actual = thisObj.FindGreatestSumOfSubArray2(arg0);

    // Assert result
    Assert.assertEquals(16, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findGreatestSumOfSubArrayInput8OutputPositive9990bb46636d6f6676b() {

    // Arrange
    final FindGreatestSumOfSubArray thisObj = new FindGreatestSumOfSubArray();
    final int[] arg0 = { 2, 2, 2, 2, 2, 2, 2, 2 };

    // Act
    final int actual = thisObj.findGreatestSumOfSubArray(arg0);

    // Assert result
    Assert.assertEquals(16, actual);

  }
}
