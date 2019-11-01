package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.MaximumProductSubarray;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class MaximumProductSubarrayTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b383a37d9c099df0() {

    // Act, creating object to test constructor
    final MaximumProductSubarray actual = new MaximumProductSubarray();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProduct2Input8OutputPositive99915c4ca29c60c5255() {

    // Arrange
    final MaximumProductSubarray thisObj = new MaximumProductSubarray();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.maxProduct2(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProduct3Input8OutputPositive99925a79e267217f936() {

    // Arrange
    final MaximumProductSubarray thisObj = new MaximumProductSubarray();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.maxProduct3(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void maxProductInputNotNullOutputPositive999779fbea42a88a7f4() {

    // Arrange
    final MaximumProductSubarray thisObj = new MaximumProductSubarray();
    final ArrayList<Integer> arg0 = new ArrayList<Integer>();
    final Integer integer = new Integer(1);
    arg0.add(integer);

    // Act
    final int actual = thisObj.maxProduct(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
