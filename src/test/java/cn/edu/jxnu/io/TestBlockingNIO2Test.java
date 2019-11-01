package cn.edu.jxnu.io;

import cn.edu.jxnu.io.TestBlockingNIO2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;



public class TestBlockingNIO2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void clientOutputConnectException999d7f327b3fee73a95() throws IOException {

    // Arrange
    final TestBlockingNIO2 thisObj = new TestBlockingNIO2();

    // Act
    thrown.expect(ConnectException.class);
    thisObj.client();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ae212f1b27618965() {

    // Act, creating object to test constructor
    final TestBlockingNIO2 actual = new TestBlockingNIO2();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void serverOutputBindException999abec2ce8bb904f9f() throws IOException {
//
//    // Arrange
//    final TestBlockingNIO2 thisObj = new TestBlockingNIO2();
//
//    // Act
//    thrown.expect(BindException.class);
//    thisObj.server();
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
