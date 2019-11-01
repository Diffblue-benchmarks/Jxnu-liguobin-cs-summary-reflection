package cn.edu.jxnu.redis;

import cn.edu.jxnu.redis.RedisDemo8;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.net.Socket;
import java.net.SocketImpl;
import java.util.HashMap;



public class RedisDemo8Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void acquireLockWithTimeoutInputNotNullNotNullZeroZeroOutputVoid9995528dc56b4879d48() {

    // Arrange
    final RedisDemo8 thisObj = new RedisDemo8();
    final Jedis arg0 = new Jedis();
    final String arg1 = "\n----- testCreateUserAndStatus -----";
    final int arg2 = 0;
    final int arg3 = 0;

    // Act
    final String actual = thisObj.acquireLockWithTimeout(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void cleanTimelinesInputNotNullNegativeNegativePositiveTrueOutputJedisConnectionException999cc6c54a9999b4048() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final long arg2 = -1L;
//    final double arg3 = 1.0;
//    final boolean arg4 = true;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.cleanTimelines(arg0, arg1, arg2, arg3, arg4);
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
//
//  // Test written by Diffblue Cover
//  @Test
//  public void cleanTimelinesInputNotNullNegativeNegativeOutputJedisConnectionException99931df551fd5c6440d() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final long arg2 = -1L;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.cleanTimelines(arg0, arg1, arg2);
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
  public void constructorOutputNotNull999677e47b329ed6712() {

    // Act, creating object to test constructor
    final RedisDemo8 actual = new RedisDemo8();

    // Assert result
    Assert.assertNotNull(actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void createStatusInputNotNullNegativeNotNullNotNullOutputJedisConnectionException9997c4e156dcfde3223() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    final HashMap<String, String> arg3 = new HashMap<String, String>();
//    arg3.put("\n----- testCreateUserAndStatus -----", "\n----- testCreateUserAndStatus -----");
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.createStatus(arg0, arg1, arg2, arg3);
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
//  public void createStatusInputNotNullNegativeNotNullOutputJedisConnectionException99915ef492819050e8b() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.createStatus(arg0, arg1, arg2);
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
//  public void createUserInputNotNullNotNullNotNullOutputJedisConnectionException99932ed4264d6ad82a9() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testCreateUserAndStatus -----";
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.createUser(arg0, arg1, arg2);
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
//  public void deleteStatusInputNotNullNegativeNegativeOutputJedisConnectionException99920e7d668b3774384() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final long arg2 = -1L;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.deleteStatus(arg0, arg1, arg2);
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
//  public void followUserInputNotNullNegativeNegativeOutputJedisConnectionException9998e45704587fd8a43() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final long arg2 = -1L;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.followUser(arg0, arg1, arg2);
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
//  @Test
//  public void getStatusMessagesInputNotNullNegativeZeroZeroOutputJedisConnectionException99977f02e1cb6053c28() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final int arg2 = 0;
//    final int arg3 = 0;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.getStatusMessages(arg0, arg1, arg2, arg3);
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
//  public void getStatusMessagesInputNotNullNegativeOutputJedisConnectionException999919d91239305c667() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.getStatusMessages(arg0, arg1);
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
//  public void postStatusInputNotNullNegativeNotNullNotNullOutputJedisConnectionException999adefaa74390c5f17() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    final HashMap<String, String> arg3 = new HashMap<String, String>();
//    arg3.put("\n----- testCreateUserAndStatus -----", "\n----- testCreateUserAndStatus -----");
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.postStatus(arg0, arg1, arg2, arg3);
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
//  public void postStatusInputNotNullNegativeNotNullOutputJedisConnectionException99928f3e4b855cc7ad7() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.postStatus(arg0, arg1, arg2);
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
//  public void refillTimelineInputNotNullNotNullNotNullPositiveOutputJedisConnectionException999bf9800abdcda800e() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testCreateUserAndStatus -----";
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    final double arg3 = 1.0;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.refillTimeline(arg0, arg1, arg2, arg3);
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
//
//  // Test written by Diffblue Cover
//  @Test
//  public void refillTimelineInputNotNullNotNullNotNullOutputJedisConnectionException9994284cf1a701e3f30() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testCreateUserAndStatus -----";
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.refillTimeline(arg0, arg1, arg2);
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
//
//  // Test written by Diffblue Cover
//  @Test
//  public void releaseLockInputNotNullNotNullNotNullOutputJedisConnectionException999551d66a8069fdbb0() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testCreateUserAndStatus -----";
//    final String arg2 = "\n----- testCreateUserAndStatus -----";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.releaseLock(arg0, arg1, arg2);
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
  public void runOutputJedisConnectionException9996055174a48f0ed13() throws InterruptedException {

    // Arrange
    final RedisDemo8 thisObj = new RedisDemo8();

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.run();

    // The method is not expected to return due to exception thrown

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void syndicateStatusInputNotNullNegativeNegativeNegativePositiveOutputJedisConnectionException9998d698f75df72ca98() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final long arg2 = -1L;
//    final long arg3 = -1L;
//    final double arg4 = 1.0;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.syndicateStatus(arg0, arg1, arg2, arg3, arg4);
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

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void testCreateUserAndStatusInputNotNullOutputVoid99910d8ad6b90c327d3() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//
//    // Act
//    thisObj.testCreateUserAndStatus(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void testFollowUnfollowUserInputNotNullOutputVoid99929105d2cddabd8db() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//
//    // Act
//    thisObj.testFollowUnfollowUser(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//  // Test written by Diffblue Cover
//  @Test
//  public void testRefillTimelineInputNotNullOutputJedisConnectionException999686ddaaddc3ce9d3() throws InterruptedException {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testRefillTimeline(arg0);
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
//
//  // Test written by Diffblue Cover
//  @Test
//  public void testSyndicateStatusInputNotNullOutputJedisConnectionException9997ffd74c2e0d81d28() throws InterruptedException {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testSyndicateStatus(arg0);
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
//  public void unfollowUserInputNotNullNegativeNegativeOutputJedisConnectionException99965a71acbb2fc34ce() {
//
//    // Arrange
//    final RedisDemo8 thisObj = new RedisDemo8();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final long arg2 = -1L;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.unfollowUser(arg0, arg1, arg2);
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
