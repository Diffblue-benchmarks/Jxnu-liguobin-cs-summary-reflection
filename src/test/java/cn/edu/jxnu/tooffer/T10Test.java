package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T10;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T10Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e0efc63a0c3e9851() {

    // Act, creating object to test constructor
    final T10 actual = new T10();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void RectCoverInputZeroOutputZero99919aafe2ce02f2321() {

    // Arrange
    final T10 thisObj = new T10();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.RectCover(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
