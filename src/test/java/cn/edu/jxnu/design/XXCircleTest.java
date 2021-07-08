package cn.edu.jxnu.design;

import cn.edu.jxnu.design.XXCircle;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class XXCircleTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99924e29df9a92a5bca() {

    // Act, creating object to test constructor
    final XXCircle actual = new XXCircle();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void displayOutputVoid999e9726c1f997904a8() {

    // Arrange
    final XXCircle thisObj = new XXCircle();

    // Act
    thisObj.display();

    // The method returns void, testing that no exception is thrown

  }
}
