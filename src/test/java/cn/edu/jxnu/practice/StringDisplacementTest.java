package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.StringDisplacement;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StringDisplacementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a54c01d70d1211dc() {

    // Act, creating object to test constructor
    final StringDisplacement actual = new StringDisplacement();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringDisplacement2InputNotNullNotNullOutputNotNull999b361c3377b7bcdd9() {

    // Arrange
    final String arg0 = "************************************";
    final String arg1 = "************************************";

    // Act
    final Boolean actual = StringDisplacement.stringDisplacement2(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringDisplacementInputNotNullNotNullOutputTrue9999c2757ec47244b3a() {

    // Arrange
    final String arg0 = "************************************";
    final String arg1 = "************************************";

    // Act
    final boolean actual = StringDisplacement.stringDisplacement(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
