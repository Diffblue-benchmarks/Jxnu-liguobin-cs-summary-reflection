package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999df8b1d89399cf0c7() {

    // Act, creating object to test constructor
    final Main2 actual = new Main2();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLengthInputNotNullOutputPositive99932906a5f094ab565() {

    // Arrange
    final Main2 thisObj = new Main2();
    final String arg0 = "aaaaa";

    // Act
    final double actual = thisObj.getLength(arg0);

    // Assert result
    Assert.assertEquals(5.0, actual, 0.0);

  }
}
