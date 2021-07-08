package cn.edu.jxnu.io;

import cn.edu.jxnu.io.MultiThreadEchoServer.HandleMsg;
import cn.edu.jxnu.io.MultiThreadEchoServer;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.net.Socket;
import java.net.SocketImpl;



public class MultiThreadEchoServerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull99963bb04495d235d28() {
//
//    // Arrange
//    final Socket arg0 = new Socket();
//
//    // Act, creating object to test constructor
//    final HandleMsg actual = new HandleMsg(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.clientSocket);
//    Assert.assertNotNull(Reflector.getInstanceField(actual.clientSocket, "impl"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(actual.clientSocket, "impl"), "fdLock"));
//    Assert.assertFalse((boolean) Reflector.getInstanceField(Reflector.getInstanceField(actual.clientSocket, "impl"), "closePending"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(actual.clientSocket, "impl"), "fdUseCount"));
//    Assert.assertFalse((boolean) Reflector.getInstanceField(Reflector.getInstanceField(actual.clientSocket, "impl"), "stream"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(actual.clientSocket, "impl"), "timeout"));
//    Assert.assertNull(((SocketImpl) Reflector.getInstanceField(actual.clientSocket, "impl")).getFileDescriptor());
//    Assert.assertNull(((SocketImpl) Reflector.getInstanceField(actual.clientSocket, "impl")).getInetAddress());
//    Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(actual.clientSocket, "impl")).getLocalPort());
//    Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(actual.clientSocket, "impl")).getPort());
//    Assert.assertNull(((SocketImpl) Reflector.getInstanceField(actual.clientSocket, "impl")).getServerSocket());
//    Assert.assertNull(((SocketImpl) Reflector.getInstanceField(actual.clientSocket, "impl")).getSocket());
//    Assert.assertFalse(actual.clientSocket.isClosed());
//    Assert.assertFalse(actual.clientSocket.isInputShutdown());
//    Assert.assertFalse(actual.clientSocket.isOutputShutdown());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999df40cc510bbb8d34() {

    // Act, creating object to test constructor
    final MultiThreadEchoServer actual = new MultiThreadEchoServer();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
