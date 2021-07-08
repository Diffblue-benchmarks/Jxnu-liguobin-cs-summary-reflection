package cn.edu.jxnu.socket;

import cn.edu.jxnu.socket.ServerSocketDemo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ServerSocketDemoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b4ab0a8dc1e6871f() {

    // Act, creating object to test constructor
    final ServerSocketDemo actual = new ServerSocketDemo();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
