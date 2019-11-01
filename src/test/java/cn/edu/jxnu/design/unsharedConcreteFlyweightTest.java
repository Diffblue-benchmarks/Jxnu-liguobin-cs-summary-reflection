package cn.edu.jxnu.design;

import cn.edu.jxnu.design.unsharedConcreteFlyweight;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class unsharedConcreteFlyweightTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999febedc690067f3fb() {

    // Act, creating object to test constructor
    final unsharedConcreteFlyweight actual = new unsharedConcreteFlyweight();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
