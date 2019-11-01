package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.IsContinuous;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsContinuousTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998b6792ff3e9ed12b() {

    // Act, creating object to test constructor
    final IsContinuous actual = new IsContinuous();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isContinuousInput8OutputTrue999a6b7a441ae5f0c2b() {

    // Arrange
    final IsContinuous thisObj = new IsContinuous();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.isContinuous(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
