package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T31;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T31Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999938a74a630dedc7() {

    // Act, creating object to test constructor
    final T31 actual = new T31();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1Between1AndN_SolutionInputZeroOutputZero99980aec5925ba443ff() {

    // Arrange
    final T31 thisObj = new T31();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.NumberOf1Between1AndN_Solution(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
