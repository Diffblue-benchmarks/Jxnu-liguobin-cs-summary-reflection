package cn.edu.jxnu.other;

import cn.edu.jxnu.other.MyClient;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MyClientTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99944a2bdf9f7931869() {

    // Act, creating object to test constructor
    final MyClient actual = new MyClient();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999fc9678f3135254d7() {

    // Arrange
    final String[] arg0 = { "/tmp/src.data", "/tmp/src.data", "/tmp/src.data" };

    // Act
    MyClient.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void sendFileOutputVoid999004b62f1ed638a54() {

    // Arrange
    final MyClient thisObj = new MyClient();

    // Act
    thisObj.sendFile();

    // The method returns void, testing that no exception is thrown

  }
}
