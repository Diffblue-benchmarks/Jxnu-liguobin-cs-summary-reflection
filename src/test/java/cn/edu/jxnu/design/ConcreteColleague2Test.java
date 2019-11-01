package cn.edu.jxnu.design;

import cn.edu.jxnu.design.ConcreteColleague2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteColleague2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fc90dfd747b34ea1() {

    // Act, creating object to test constructor
    final ConcreteColleague2 actual = new ConcreteColleague2();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
