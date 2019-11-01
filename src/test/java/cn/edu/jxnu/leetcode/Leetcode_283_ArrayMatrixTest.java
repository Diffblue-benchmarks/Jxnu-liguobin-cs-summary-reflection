package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_283_ArrayMatrix;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_283_ArrayMatrixTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fc1a0681c303233c() {

    // Act, creating object to test constructor
    final Leetcode_283_ArrayMatrix actual = new Leetcode_283_ArrayMatrix();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void moveZeroesInput8OutputVoid999a06eaac717dc13ac() {

    // Arrange
    final Leetcode_283_ArrayMatrix thisObj = new Leetcode_283_ArrayMatrix();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thisObj.moveZeroes(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
