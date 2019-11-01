package cn.edu.jxnu.io;

import cn.edu.jxnu.io.TestBlockingNIO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.net.ConnectException;



public class TestBlockingNIOTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void clientOutputConnectException999c59ed3c5913df979() throws IOException {

    // Arrange
    final TestBlockingNIO thisObj = new TestBlockingNIO();

    // Act
    thrown.expect(ConnectException.class);
    thisObj.client();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997f2863fb282c53fe() {

    // Act, creating object to test constructor
    final TestBlockingNIO actual = new TestBlockingNIO();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
