package cn.edu.jxnu.other;

import cn.edu.jxnu.other.Children;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ChildrenTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void cloneOutputNotNull99941f7f78ab5263273() {

    // Arrange
    final Children thisObj = new Children();

    // Act
    final Object actual = thisObj.clone();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ea911fa1a449e1d3() {

    // Act, creating object to test constructor
    final Children actual = new Children();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
