//package cn.edu.jxnu.io;
//
//import cn.edu.jxnu.io.AIOEchoServer;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.io.IOException;
//import java.net.BindException;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeoutException;
//
//
//
//public class AIOEchoServerTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputBindException99963d16de7ff3baba7() throws IOException {
//
//    // Act, creating object to test constructor
//    thrown.expect(BindException.class);
//    new AIOEchoServer();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void startOutputVoid999c83ff659220a33d2() throws IOException, InterruptedException, TimeoutException, ExecutionException {
//
//    // Arrange
//    final AIOEchoServer thisObj = new AIOEchoServer();
//
//    // Act
//    thisObj.start();
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//