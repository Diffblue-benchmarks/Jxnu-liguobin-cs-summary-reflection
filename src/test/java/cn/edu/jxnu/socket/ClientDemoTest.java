package cn.edu.jxnu.socket;

import cn.edu.jxnu.socket.ClientDemo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.net.UnknownHostException;



public class ClientDemoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999de261fe7ff5a897f() {

    // Act, creating object to test constructor
    final ClientDemo actual = new ClientDemo();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputIOException999497375147e92f58f() throws IOException, UnknownHostException {

    // Arrange
    final String[] arg0 = { "127.0.0.1", "127.0.0.1", "127.0.0.1" };

    // Act
    thrown.expect(IOException.class);
    ClientDemo.main(arg0);

    // The method is not expected to return due to exception thrown

  }
}
