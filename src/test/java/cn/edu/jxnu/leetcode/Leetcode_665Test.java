package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_665;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_665Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void checkPossibilityInput8OutputArrayIndexOutOfBoundsException999848473c153d06979() {

    // Arrange
    final Leetcode_665 thisObj = new Leetcode_665();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.checkPossibility(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99912a60c7f52f3dcec() {

    // Act, creating object to test constructor
    final Leetcode_665 actual = new Leetcode_665();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
