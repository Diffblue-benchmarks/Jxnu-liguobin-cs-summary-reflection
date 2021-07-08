package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_645_Array;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_645_ArrayTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fa3e3651d696a7ab() {

    // Act, creating object to test constructor
    final Leetcode_645_Array actual = new Leetcode_645_Array();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findErrorNumsInput8OutputArrayIndexOutOfBoundsException99940ab63a939b2b882() {

    // Arrange
    final Leetcode_645_Array thisObj = new Leetcode_645_Array();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.findErrorNums(arg0);

    // The method is not expected to return due to exception thrown

  }
}
