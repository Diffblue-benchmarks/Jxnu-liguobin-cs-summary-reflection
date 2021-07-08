package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T47;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T47Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a202266fc8deeb24() {

    // Act, creating object to test constructor
    final T47 actual = new T47();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Sum_SolutionInputPositiveOutputPositive9997e3de0998382a5d7() {

    // Arrange
    final T47 thisObj = new T47();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.Sum_Solution(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
