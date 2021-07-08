package cn.edu.jxnu.design;

import cn.edu.jxnu.design.ConcreteFlyweight;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteFlyweightTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9993b9c4015d1a869a2() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final ConcreteFlyweight actual = new ConcreteFlyweight(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
