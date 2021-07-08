package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_485_Array;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_485_ArrayTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d2d4101ba5e47228() {

    // Act, creating object to test constructor
    final Leetcode_485_Array actual = new Leetcode_485_Array();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findMaxConsecutiveOnesInput8OutputZero999df1aadf18230ff1d() {

    // Arrange
    final Leetcode_485_Array thisObj = new Leetcode_485_Array();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.findMaxConsecutiveOnes(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
