package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main5;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main5Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999700b6fa362a1c598() {

    // Act, creating object to test constructor
    final Main5 actual = new Main5();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void istrueInputNotNullOutputFalse9999f15d3ff2e223eb7() {

    // Arrange
    final String arg0 = "(";

    // Act
    final boolean actual = Main5.istrue(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}
