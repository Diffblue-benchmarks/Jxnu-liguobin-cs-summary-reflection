package cn.edu.jxnu.io;

import cn.edu.jxnu.io.MultiThreadNIOEchoClient;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class MultiThreadNIOEchoClientTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999491b22070584c692() {

    // Act, creating object to test constructor
    final MultiThreadNIOEchoClient actual = new MultiThreadNIOEchoClient();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initInputNotNullZeroOutputVoid999443242e5c49c8604() throws IOException {

    // Arrange
    final MultiThreadNIOEchoClient thisObj = new MultiThreadNIOEchoClient();
    final String arg0 = "127.0.0.1";
    final int arg1 = 0;

    // Act
    thisObj.init(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void workOutputNullPointerException999e5ea3e26b58e86b8() throws IOException {

    // Arrange
    final MultiThreadNIOEchoClient thisObj = new MultiThreadNIOEchoClient();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.work();

    // The method is not expected to return due to exception thrown

  }
}
