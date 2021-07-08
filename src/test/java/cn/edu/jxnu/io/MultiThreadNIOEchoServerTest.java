package cn.edu.jxnu.io;

import cn.edu.jxnu.io.MultiThreadNIOEchoServer.EchoClient;
import cn.edu.jxnu.io.MultiThreadNIOEchoServer.HandleMsg;
import cn.edu.jxnu.io.MultiThreadNIOEchoServer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.ByteBuffer;
import java.util.LinkedList;



public class MultiThreadNIOEchoServerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void enqueueInputNullOutputVoid99917b2d3d9f316fef6() {

    // Arrange
    final MultiThreadNIOEchoServer multiThreadNIOEchoServer = new MultiThreadNIOEchoServer();
    final EchoClient thisObj = multiThreadNIOEchoServer.new EchoClient();
    final ByteBuffer arg0 = null;

    // Act
    thisObj.enqueue(arg0);

    // Assert side effects
    final LinkedList<ByteBuffer> linkedList = new LinkedList<ByteBuffer>();
    linkedList.add(null);
    Assert.assertEquals(linkedList, thisObj.getOutputQueue());

  }

  // Test written by Diffblue Cover
  @Test
  public void getOutputQueueOutput09997fa334f3cd1b4ebd() {

    // Arrange
    final MultiThreadNIOEchoServer multiThreadNIOEchoServer = new MultiThreadNIOEchoServer();
    final EchoClient thisObj = multiThreadNIOEchoServer.new EchoClient();

    // Act
    final LinkedList<ByteBuffer> actual = thisObj.getOutputQueue();

    // Assert result
    final LinkedList<ByteBuffer> linkedList = new LinkedList<ByteBuffer>();
    Assert.assertEquals(linkedList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputNullPointerException999ec46f4761ab35f38() {

    // Arrange
    final MultiThreadNIOEchoServer multiThreadNIOEchoServer = new MultiThreadNIOEchoServer();
    final HandleMsg thisObj = multiThreadNIOEchoServer.new HandleMsg(null, null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.run();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999524e73cbcdf3650f() {

    // Act, creating object to test constructor
    final MultiThreadNIOEchoServer actual = new MultiThreadNIOEchoServer();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
