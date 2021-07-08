package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Adapter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AdapterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999283fc87bd3420b74() {

    // Act, creating object to test constructor
    final Adapter actual = new Adapter();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
