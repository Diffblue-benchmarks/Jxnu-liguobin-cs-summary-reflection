package cn.edu.jxnu.design;

import cn.edu.jxnu.design.AbstractProductA;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AbstractProductATest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e41b7359f8d5709d() {

    // Act, creating object to test constructor
    final AbstractProductA actual = new AbstractProductA();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
