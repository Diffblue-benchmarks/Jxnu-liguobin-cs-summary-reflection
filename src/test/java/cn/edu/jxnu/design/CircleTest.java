package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Circle;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CircleTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bfae9e65270aa98f() {

    // Act, creating object to test constructor
    final Circle actual = new Circle();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void displayOutputVoid999f9fc9288e1243f59() {

    // Arrange
    final Circle thisObj = new Circle();

    // Act
    thisObj.display();

    // The method returns void, testing that no exception is thrown

  }
}
