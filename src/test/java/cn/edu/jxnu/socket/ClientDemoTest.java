package cn.edu.jxnu.socket;

import cn.edu.jxnu.socket.ClientDemo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ClientDemoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999de261fe7ff5a897f() {

    // Act, creating object to test constructor
    final ClientDemo actual = new ClientDemo();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
