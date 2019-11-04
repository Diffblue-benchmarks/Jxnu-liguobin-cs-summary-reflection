package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_494_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_494_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999685113155aedbecc() {

    // Act, creating object to test constructor
    final Leetcode_494_Dp actual = new Leetcode_494_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findTargetSumWaysInput8ZeroOutputPositive9995dae87b2927e6cae() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final int actual = Leetcode_494_Dp.findTargetSumWays(arg0, arg1);

    // Assert result
    Assert.assertEquals(256, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findTargetSumWays2Input8ZeroOutputPositive999cd0db9eb5335b6a4() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final int actual = Leetcode_494_Dp.findTargetSumWays2(arg0, arg1);

    // Assert result
    Assert.assertEquals(256, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9990e890a3a151808a1() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Leetcode_494_Dp.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
