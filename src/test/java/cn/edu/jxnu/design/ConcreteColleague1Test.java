package cn.edu.jxnu.design;

import cn.edu.jxnu.design.ConcreteColleague1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteColleague1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99976fdd5050e8d460b() {

    // Act, creating object to test constructor
    final ConcreteColleague1 actual = new ConcreteColleague1();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
