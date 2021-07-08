package cn.edu.jxnu.io;

import cn.edu.jxnu.io.TestNonBlockingNIO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.net.ConnectException;



public class TestNonBlockingNIOTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void clientOutputConnectException99998734becbad4d152() throws IOException {

    // Arrange
    final TestNonBlockingNIO thisObj = new TestNonBlockingNIO();

    // Act
    thrown.expect(ConnectException.class);
    thisObj.client();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f0d8d4b19c3f3403() {

    // Act, creating object to test constructor
    final TestNonBlockingNIO actual = new TestNonBlockingNIO();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
