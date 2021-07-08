package cn.edu.jxnu.design;

import cn.edu.jxnu.design.AbstractProductB;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AbstractProductBTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99967de44e5a862887b() {

    // Act, creating object to test constructor
    final AbstractProductB actual = new AbstractProductB();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
