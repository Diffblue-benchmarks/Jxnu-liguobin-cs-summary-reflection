package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_70_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_70_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void climbStairsInputPositiveOutputPositive999ef1dfb8a133b775a() {

    // Arrange
    final Leetcode_70_Dp thisObj = new Leetcode_70_Dp();
    final int arg0 = 2;

    // Act
    final int actual = thisObj.climbStairs(arg0);

    // Assert result
    Assert.assertEquals(2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9993e55dc3ac37d4fb1() {

    // Act, creating object to test constructor
    final Leetcode_70_Dp actual = new Leetcode_70_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99946c101d8032bf480() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Leetcode_70_Dp.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
