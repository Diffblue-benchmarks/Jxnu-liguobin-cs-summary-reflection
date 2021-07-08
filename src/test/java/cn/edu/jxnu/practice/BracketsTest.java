package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Brackets;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BracketsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999edcb3e473f6e15f3() {

    // Act, creating object to test constructor
    final Brackets actual = new Brackets();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void solveInputNotNullOutputNotNull999473a7d9495debc9e() {

    // Arrange
    final String arg0 = "(";

    // Act
    final String actual = Brackets.solve(arg0);

    // Assert result
    Assert.assertEquals("NO", actual);

  }
}
