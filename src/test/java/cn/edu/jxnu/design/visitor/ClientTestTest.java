package cn.edu.jxnu.design.visitor;

import cn.edu.jxnu.design.visitor.ClientTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ClientTestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e14d8480ffb9a88d() {

    // Act, creating object to test constructor
    final ClientTest actual = new ClientTest();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
