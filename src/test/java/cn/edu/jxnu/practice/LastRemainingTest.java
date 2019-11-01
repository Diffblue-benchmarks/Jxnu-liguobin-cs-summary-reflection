package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.LastRemaining;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LastRemainingTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a00ce938edab4ee0() {

    // Act, creating object to test constructor
    final LastRemaining actual = new LastRemaining();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lastRemaining_Solution2InputNegativeNegativeOutputIndexOutOfBoundsException9992aa7e8ce5a9966e5() {

    // Arrange
    final LastRemaining thisObj = new LastRemaining();
    final int arg0 = -1;
    final int arg1 = -1;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.lastRemaining_Solution2(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void lastRemaining_SolutionInputNegativeNegativeOutputZero9998c7dcef9374f8204() {

    // Arrange
    final LastRemaining thisObj = new LastRemaining();
    final int arg0 = -1;
    final int arg1 = -1;

    // Act
    final int actual = thisObj.lastRemaining_Solution(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
