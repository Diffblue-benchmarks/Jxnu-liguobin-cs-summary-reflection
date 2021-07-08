package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.O1checkPowerOf2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class O1checkPowerOf2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void checkPowerOf2InputPositiveOutputTrue999893df901ad8955ae() {

    // Arrange
    final O1checkPowerOf2 thisObj = new O1checkPowerOf2();
    final int arg0 = 1;

    // Act
    final boolean actual = thisObj.checkPowerOf2(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999272f6937e0ae08e1() {

    // Act, creating object to test constructor
    final O1checkPowerOf2 actual = new O1checkPowerOf2();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
