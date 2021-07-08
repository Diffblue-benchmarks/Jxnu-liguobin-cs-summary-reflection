package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_69;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_69Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994f05e7c6f1c863bb() {

    // Act, creating object to test constructor
    final Leetcode_69 actual = new Leetcode_69();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mySqrtInputPositiveOutputPositive99955babdd0f602e35f() {

    // Arrange
    final Leetcode_69 thisObj = new Leetcode_69();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.mySqrt(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
