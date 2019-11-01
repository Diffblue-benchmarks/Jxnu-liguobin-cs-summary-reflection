package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_416_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_416_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void canPartitionInput8OutputTrue999a263167989519181() {

    // Arrange
    final Leetcode_416_Dp thisObj = new Leetcode_416_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.canPartition(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994d2cbb6823ac4b3d() {

    // Act, creating object to test constructor
    final Leetcode_416_Dp actual = new Leetcode_416_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
