package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.GetUglyNumber;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GetUglyNumberTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999055b264dabe04387() {

    // Act, creating object to test constructor
    final GetUglyNumber actual = new GetUglyNumber();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void GetUglyNumber_SolutionInputZeroOutputZero999e3d2bc7c80c8a094() {

    // Arrange
    final GetUglyNumber thisObj = new GetUglyNumber();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.GetUglyNumber_Solution(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
