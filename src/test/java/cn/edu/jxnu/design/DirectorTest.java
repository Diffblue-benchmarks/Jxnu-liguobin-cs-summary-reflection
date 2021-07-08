package cn.edu.jxnu.design;

import cn.edu.jxnu.design.BuilderPattern;
import cn.edu.jxnu.design.Director;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DirectorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995fc1e15aaaeaef35() {

    // Act, creating object to test constructor
    final Director actual = new Director();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void ConstructInputNullOutputNullPointerException999a5ffdc37f86e16a8() {

    // Arrange
    final Director thisObj = new Director();
    final BuilderPattern arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.Construct(arg0);

    // The method is not expected to return due to exception thrown

  }
}
