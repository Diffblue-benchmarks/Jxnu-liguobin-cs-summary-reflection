package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T45;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T45Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990da308fe25b59b93() {

    // Act, creating object to test constructor
    final T45 actual = new T45();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isContinuousInput8OutputTrue99923391df0e9d52067() {

    // Arrange
    final T45 thisObj = new T45();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.isContinuous(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
