package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T33;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T33Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d38bd527535c93f0() {

    // Act, creating object to test constructor
    final T33 actual = new T33();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void GetUglyNumber_SolutionInputZeroOutputZero99997e083c8b2ae962f() {

    // Arrange
    final T33 thisObj = new T33();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.GetUglyNumber_Solution(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
