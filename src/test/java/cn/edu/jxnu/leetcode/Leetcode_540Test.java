package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_540;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_540Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996e2116d1e758da43() {

    // Act, creating object to test constructor
    final Leetcode_540 actual = new Leetcode_540();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void singleNonDuplicateInput8OutputArrayIndexOutOfBoundsException9991dc5f7b45bb7b9d6() {

    // Arrange
    final Leetcode_540 thisObj = new Leetcode_540();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.singleNonDuplicate(arg0);

    // The method is not expected to return due to exception thrown

  }
}
