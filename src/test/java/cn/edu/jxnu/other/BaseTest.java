package cn.edu.jxnu.other;

import cn.edu.jxnu.other.Base;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BaseTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void cloneOutputNotNull999f3690f3d7fb0e11e() {

    // Arrange
    final Base thisObj = new Base();

    // Act
    final Object actual = thisObj.clone();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999de83d43355627045() {

    // Act, creating object to test constructor
    final Base actual = new Base();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
