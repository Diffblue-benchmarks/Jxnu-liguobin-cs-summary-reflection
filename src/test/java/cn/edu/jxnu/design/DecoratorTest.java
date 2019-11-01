package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Decorator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DecoratorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dc0f731e72ecc766() {

    // Act, creating object to test constructor
    final Decorator actual = new Decorator();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
