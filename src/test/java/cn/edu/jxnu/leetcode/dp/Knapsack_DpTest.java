package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Knapsack_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Knapsack_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a496d9038e9db98d() {

    // Act, creating object to test constructor
    final Knapsack_Dp actual = new Knapsack_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void knapsack2InputPositivePositive88OutputPositive9993ee59ed46115ba70() {

    // Arrange
    final Knapsack_Dp thisObj = new Knapsack_Dp();
    final int arg0 = 1;
    final int arg1 = 1;
    final int[] arg2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int[] arg3 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.knapsack2(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void knapsackInputPositivePositive88OutputZero999cc50bc9363ae0fbf() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;
    final int[] arg2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int[] arg3 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = Knapsack_Dp.knapsack(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
