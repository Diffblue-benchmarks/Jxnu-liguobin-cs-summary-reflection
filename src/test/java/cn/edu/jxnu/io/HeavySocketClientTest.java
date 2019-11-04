package cn.edu.jxnu.io;

import cn.edu.jxnu.io.HeavySocketClient.EchoClient;
import cn.edu.jxnu.io.HeavySocketClient;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class HeavySocketClientTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid99927b62fc5912ced03() {

    // Arrange
    final EchoClient thisObj = new EchoClient();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995e55ecb74de030bd() {

    // Act, creating object to test constructor
    final HeavySocketClient actual = new HeavySocketClient();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9994899cc77de0ec9c3() throws IOException {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    HeavySocketClient.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
