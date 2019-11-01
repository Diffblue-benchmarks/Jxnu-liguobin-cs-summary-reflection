package cn.edu.jxnu.redis;

import cn.edu.jxnu.redis.RedisDemo4;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.net.Socket;
import java.net.SocketImpl;



public class RedisDemo4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void benchmarkUpdateTokenInputNotNullZeroOutputRuntimeException999db9f60f829399bba() {

    // Arrange
    final RedisDemo4 thisObj = new RedisDemo4();
    final Jedis arg0 = new Jedis();
    final int arg1 = 0;

    // Act
    thrown.expect(RuntimeException.class);
    thisObj.benchmarkUpdateToken(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dbf250404994ac7b() {

    // Act, creating object to test constructor
    final RedisDemo4 actual = new RedisDemo4();

    // Assert result
    Assert.assertNotNull(actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void listItemInputNotNullNotNullNotNullNegativeOutputJedisConnectionException9992f13eb6ca8951013() {
//
//    // Arrange
//    final RedisDemo4 thisObj = new RedisDemo4();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".";
//    final String arg2 = ".";
//    final double arg3 = -1.0;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.listItem(arg0, arg1, arg2, arg3);
//    } catch (JedisConnectionException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertNull(Reflector.getInstanceField(arg0, "dataSource"));
//      Assert.assertNull(Reflector.getInstanceField(arg0, "pipeline"));
//      Assert.assertNotNull(arg0.getClient());
//      Assert.assertFalse(arg0.getClient().isInMulti());
//      Assert.assertFalse(arg0.getClient().isInWatch());
//      Assert.assertEquals(2000, arg0.getClient().getConnectionTimeout());
//      Assert.assertNotNull(arg0.getClient().getSocket());
//      Assert.assertNotNull(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdLock"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "closePending"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdUseCount"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "stream"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "timeout"));
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getFileDescriptor());
//      Assert.assertNotNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getInetAddress());
//      Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getLocalPort());
//      Assert.assertEquals(6379, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getPort());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getServerSocket());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getSocket());
//      Assert.assertFalse(arg0.getClient().getSocket().isClosed());
//      Assert.assertFalse(arg0.getClient().getSocket().isInputShutdown());
//      Assert.assertFalse(arg0.getClient().getSocket().isOutputShutdown());
//      Assert.assertTrue(arg0.getClient().isBroken());
//      Assert.assertEquals("localhost", arg0.getClient().getHost());
//      Assert.assertEquals(6379, arg0.getClient().getPort());
//      Assert.assertEquals(2000, arg0.getClient().getSoTimeout());
//      Assert.assertNull(Reflector.getInstanceField(arg0, "transaction"));
//      throw ex;
//    }
//
//  }

//  // Test written by Diffblue Cover
//  @Test
//  public void purchaseItemInputNotNullNotNullNotNullNotNullNegativeOutputJedisConnectionException999c18fac73b66726a2() {
//
//    // Arrange
//    final RedisDemo4 thisObj = new RedisDemo4();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".";
//    final String arg2 = ".";
//    final String arg3 = ".";
//    final double arg4 = -1.0;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.purchaseItem(arg0, arg1, arg2, arg3, arg4);
//    } catch (JedisConnectionException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertNull(Reflector.getInstanceField(arg0, "dataSource"));
//      Assert.assertNull(Reflector.getInstanceField(arg0, "pipeline"));
//      Assert.assertNotNull(arg0.getClient());
//      Assert.assertFalse(arg0.getClient().isInMulti());
//      Assert.assertFalse(arg0.getClient().isInWatch());
//      Assert.assertEquals(2000, arg0.getClient().getConnectionTimeout());
//      Assert.assertNotNull(arg0.getClient().getSocket());
//      Assert.assertNotNull(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdLock"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "closePending"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdUseCount"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "stream"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "timeout"));
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getFileDescriptor());
//      Assert.assertNotNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getInetAddress());
//      Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getLocalPort());
//      Assert.assertEquals(6379, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getPort());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getServerSocket());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getSocket());
//      Assert.assertFalse(arg0.getClient().getSocket().isClosed());
//      Assert.assertFalse(arg0.getClient().getSocket().isInputShutdown());
//      Assert.assertFalse(arg0.getClient().getSocket().isOutputShutdown());
//      Assert.assertTrue(arg0.getClient().isBroken());
//      Assert.assertEquals("localhost", arg0.getClient().getHost());
//      Assert.assertEquals(6379, arg0.getClient().getPort());
//      Assert.assertEquals(2000, arg0.getClient().getSoTimeout());
//      Assert.assertNull(Reflector.getInstanceField(arg0, "transaction"));
//      throw ex;
//    }
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputJedisConnectionException99980cafd0de213f14e() {

    // Arrange
    final RedisDemo4 thisObj = new RedisDemo4();

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.run();

    // The method is not expected to return due to exception thrown

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void testBenchmarkUpdateTokenInputNotNullOutputRuntimeException9994c404f126184b6e5() {
//
//    // Arrange
//    final RedisDemo4 thisObj = new RedisDemo4();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(RuntimeException.class);
//      thisObj.testBenchmarkUpdateToken(arg0);
//    } catch (RuntimeException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertNull(Reflector.getInstanceField(arg0, "dataSource"));
//      Assert.assertNull(Reflector.getInstanceField(arg0, "pipeline"));
//      Assert.assertNotNull(arg0.getClient());
//      Assert.assertFalse(arg0.getClient().isInMulti());
//      Assert.assertFalse(arg0.getClient().isInWatch());
//      Assert.assertEquals(2000, arg0.getClient().getConnectionTimeout());
//      Assert.assertNotNull(arg0.getClient().getSocket());
//      Assert.assertNotNull(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdLock"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "closePending"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdUseCount"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "stream"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "timeout"));
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getFileDescriptor());
//      Assert.assertNotNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getInetAddress());
//      Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getLocalPort());
//      Assert.assertEquals(6379, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getPort());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getServerSocket());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getSocket());
//      Assert.assertFalse(arg0.getClient().getSocket().isClosed());
//      Assert.assertFalse(arg0.getClient().getSocket().isInputShutdown());
//      Assert.assertFalse(arg0.getClient().getSocket().isOutputShutdown());
//      Assert.assertTrue(arg0.getClient().isBroken());
//      Assert.assertEquals("localhost", arg0.getClient().getHost());
//      Assert.assertEquals(6379, arg0.getClient().getPort());
//      Assert.assertEquals(2000, arg0.getClient().getSoTimeout());
//      Assert.assertNull(Reflector.getInstanceField(arg0, "transaction"));
//      throw ex;
//    }
//
//  }

//  // Test written by Diffblue Cover
//  @Test
//  public void testListItemInputNotNullTrueOutputJedisConnectionException99981a790eccdc939ab() {
//
//    // Arrange
//    final RedisDemo4 thisObj = new RedisDemo4();
//    final Jedis arg0 = new Jedis();
//    final boolean arg1 = true;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testListItem(arg0, arg1);
//    } catch (JedisConnectionException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertNull(Reflector.getInstanceField(arg0, "dataSource"));
//      Assert.assertNull(Reflector.getInstanceField(arg0, "pipeline"));
//      Assert.assertNotNull(arg0.getClient());
//      Assert.assertFalse(arg0.getClient().isInMulti());
//      Assert.assertFalse(arg0.getClient().isInWatch());
//      Assert.assertEquals(2000, arg0.getClient().getConnectionTimeout());
//      Assert.assertNotNull(arg0.getClient().getSocket());
//      Assert.assertNotNull(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdLock"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "closePending"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdUseCount"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "stream"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "timeout"));
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getFileDescriptor());
//      Assert.assertNotNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getInetAddress());
//      Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getLocalPort());
//      Assert.assertEquals(6379, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getPort());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getServerSocket());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getSocket());
//      Assert.assertFalse(arg0.getClient().getSocket().isClosed());
//      Assert.assertFalse(arg0.getClient().getSocket().isInputShutdown());
//      Assert.assertFalse(arg0.getClient().getSocket().isOutputShutdown());
//      Assert.assertTrue(arg0.getClient().isBroken());
//      Assert.assertEquals("localhost", arg0.getClient().getHost());
//      Assert.assertEquals(6379, arg0.getClient().getPort());
//      Assert.assertEquals(2000, arg0.getClient().getSoTimeout());
//      Assert.assertNull(Reflector.getInstanceField(arg0, "transaction"));
//      throw ex;
//    }
//
//  }

//  // Test written by Diffblue Cover
//  @Test
//  public void testPurchaseItemInputNotNullOutputJedisConnectionException999aa2ad4071ed2e124() {
//
//    // Arrange
//    final RedisDemo4 thisObj = new RedisDemo4();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testPurchaseItem(arg0);
//    } catch (JedisConnectionException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertNull(Reflector.getInstanceField(arg0, "dataSource"));
//      Assert.assertNull(Reflector.getInstanceField(arg0, "pipeline"));
//      Assert.assertNotNull(arg0.getClient());
//      Assert.assertFalse(arg0.getClient().isInMulti());
//      Assert.assertFalse(arg0.getClient().isInWatch());
//      Assert.assertEquals(2000, arg0.getClient().getConnectionTimeout());
//      Assert.assertNotNull(arg0.getClient().getSocket());
//      Assert.assertNotNull(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdLock"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "closePending"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdUseCount"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "stream"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "timeout"));
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getFileDescriptor());
//      Assert.assertNotNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getInetAddress());
//      Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getLocalPort());
//      Assert.assertEquals(6379, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getPort());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getServerSocket());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getSocket());
//      Assert.assertFalse(arg0.getClient().getSocket().isClosed());
//      Assert.assertFalse(arg0.getClient().getSocket().isInputShutdown());
//      Assert.assertFalse(arg0.getClient().getSocket().isOutputShutdown());
//      Assert.assertTrue(arg0.getClient().isBroken());
//      Assert.assertEquals("localhost", arg0.getClient().getHost());
//      Assert.assertEquals(6379, arg0.getClient().getPort());
//      Assert.assertEquals(2000, arg0.getClient().getSoTimeout());
//      Assert.assertNull(Reflector.getInstanceField(arg0, "transaction"));
//      throw ex;
//    }
//
//  }

//  // Test written by Diffblue Cover
//  @Test
//  public void updateTokenPipelineInputNotNullNotNullNotNullNotNullOutputJedisConnectionException999d77c5fc80b35fd86() {
//
//    // Arrange
//    final RedisDemo4 thisObj = new RedisDemo4();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".";
//    final String arg2 = ".";
//    final String arg3 = ".";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.updateTokenPipeline(arg0, arg1, arg2, arg3);
//    } catch (JedisConnectionException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertNull(Reflector.getInstanceField(arg0, "dataSource"));
//      Assert.assertNotNull(Reflector.getInstanceField(arg0, "pipeline"));
//      Assert.assertNotNull(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient());
//      Assert.assertFalse(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().isInMulti());
//      Assert.assertFalse(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().isInWatch());
//      Assert.assertEquals(2000, ((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getConnectionTimeout());
//      Assert.assertNotNull(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket());
//      Assert.assertNotNull(Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl"), "fdLock"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl"), "closePending"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl"), "fdUseCount"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl"), "stream"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl"), "timeout"));
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl")).getFileDescriptor());
//      Assert.assertNotNull(((SocketImpl) Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl")).getInetAddress());
//      Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl")).getLocalPort());
//      Assert.assertEquals(6379, ((SocketImpl) Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl")).getPort());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl")).getServerSocket());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket(), "impl")).getSocket());
//      Assert.assertFalse(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket().isClosed());
//      Assert.assertFalse(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket().isInputShutdown());
//      Assert.assertFalse(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSocket().isOutputShutdown());
//      Assert.assertTrue(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().isBroken());
//      Assert.assertEquals("localhost", ((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getHost());
//      Assert.assertEquals(6379, ((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getPort());
//      Assert.assertEquals(2000, ((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient().getSoTimeout());
//      Assert.assertEquals(((Pipeline) Reflector.getInstanceField(arg0, "pipeline")).getClient(), arg0.getClient());
//      Assert.assertNull(Reflector.getInstanceField(arg0, "transaction"));
//      throw ex;
//    }
//
//  }

//  // Test written by Diffblue Cover
//  @Test
//  public void updateTokenInputNotNullNotNullNotNullNotNullOutputJedisConnectionException999fcf1c1ad167b586d() {
//
//    // Arrange
//    final RedisDemo4 thisObj = new RedisDemo4();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".";
//    final String arg2 = ".";
//    final String arg3 = ".";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.updateToken(arg0, arg1, arg2, arg3);
//    } catch (JedisConnectionException ex) {
//
//      // Assert side effects
//      Assert.assertNotNull(arg0);
//      Assert.assertNull(Reflector.getInstanceField(arg0, "dataSource"));
//      Assert.assertNull(Reflector.getInstanceField(arg0, "pipeline"));
//      Assert.assertNotNull(arg0.getClient());
//      Assert.assertFalse(arg0.getClient().isInMulti());
//      Assert.assertFalse(arg0.getClient().isInWatch());
//      Assert.assertEquals(2000, arg0.getClient().getConnectionTimeout());
//      Assert.assertNotNull(arg0.getClient().getSocket());
//      Assert.assertNotNull(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"));
//      Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdLock"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "closePending"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "fdUseCount"));
//      Assert.assertTrue((boolean) Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "stream"));
//      Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(arg0.getClient().getSocket(), "impl"), "timeout"));
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getFileDescriptor());
//      Assert.assertNotNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getInetAddress());
//      Assert.assertEquals(0, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getLocalPort());
//      Assert.assertEquals(6379, ((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getPort());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getServerSocket());
//      Assert.assertNull(((SocketImpl) Reflector.getInstanceField(arg0.getClient().getSocket(), "impl")).getSocket());
//      Assert.assertFalse(arg0.getClient().getSocket().isClosed());
//      Assert.assertFalse(arg0.getClient().getSocket().isInputShutdown());
//      Assert.assertFalse(arg0.getClient().getSocket().isOutputShutdown());
//      Assert.assertTrue(arg0.getClient().isBroken());
//      Assert.assertEquals("localhost", arg0.getClient().getHost());
//      Assert.assertEquals(6379, arg0.getClient().getPort());
//      Assert.assertEquals(2000, arg0.getClient().getSoTimeout());
//      Assert.assertNull(Reflector.getInstanceField(arg0, "transaction"));
//      throw ex;
//    }
//
//  }
}
