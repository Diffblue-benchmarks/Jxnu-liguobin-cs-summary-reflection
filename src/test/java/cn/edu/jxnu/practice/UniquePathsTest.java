package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.UniquePaths;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class UniquePathsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995c58b3ec2697cff5() {

    // Act, creating object to test constructor
    final UniquePaths actual = new UniquePaths();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void uniquePaths2InputZeroZeroOutputArrayIndexOutOfBoundsException999ee905a08535e83ad() {

    // Arrange
    final UniquePaths thisObj = new UniquePaths();
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.uniquePaths2(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void uniquePathsInputZeroZeroOutputPositive99925123409145f3b73() {

    // Arrange
    final UniquePaths thisObj = new UniquePaths();
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    final int actual = thisObj.uniquePaths(arg0, arg1);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
