package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_198_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_198_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f851f8ff3d67f1a5() {

    // Act, creating object to test constructor
    final Leetcode_198_Dp actual = new Leetcode_198_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void rob2Input8OutputZero99900aefa9a86e0f4a9() {

    // Arrange
    final Leetcode_198_Dp thisObj = new Leetcode_198_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.rob2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void robInput8OutputZero99950e58157da26bd68() {

    // Arrange
    final Leetcode_198_Dp thisObj = new Leetcode_198_Dp();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.rob(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
