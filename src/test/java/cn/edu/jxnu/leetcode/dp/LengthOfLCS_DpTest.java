package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.LengthOfLCS_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LengthOfLCS_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990218dad363b15f1b() {

    // Act, creating object to test constructor
    final LengthOfLCS_Dp actual = new LengthOfLCS_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lengthOfLCSInput88OutputZero999396e7bece82f3d90() {

    // Arrange
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int[] arg1 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = LengthOfLCS_Dp.lengthOfLCS(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
