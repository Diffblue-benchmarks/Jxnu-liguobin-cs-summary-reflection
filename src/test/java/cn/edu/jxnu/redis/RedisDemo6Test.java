package cn.edu.jxnu.redis;

import cn.edu.jxnu.redis.RedisDemo6.RedisInputStream;
import cn.edu.jxnu.redis.RedisDemo6;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.HashSet;



public class RedisDemo6Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void acquireFairSemaphoreInputNotNullNotNullNegativeNegativeOutputJedisConnectionException99978c40c2280c7a9c2() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final int arg2 = -1;
//    final long arg3 = -1L;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.acquireFairSemaphore(arg0, arg1, arg2, arg3);
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
  public void acquireLockInputNotNullNotNullNegativeOutputVoid999491f5541aeef76a3() {

    // Arrange
    final RedisDemo6 thisObj = new RedisDemo6();
    final Jedis arg0 = new Jedis();
    final String arg1 = ".gz";
    final long arg2 = -1L;

    // Act
    final String actual = thisObj.acquireLock(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void acquireLockInputNotNullNotNullOutputJedisConnectionException9995eb66e4150733572() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.acquireLock(arg0, arg1);
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
  public void acquireLockWithTimeoutInputNotNullNotNullNegativeNegativeOutputVoid99901c00488d2861bd6() {

    // Arrange
    final RedisDemo6 thisObj = new RedisDemo6();
    final Jedis arg0 = new Jedis();
    final String arg1 = ".gz";
    final long arg2 = -1L;
    final long arg3 = -1L;

    // Act
    final String actual = thisObj.acquireLockWithTimeout(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void addUpdateContactInputNotNullNotNullNotNullOutputJedisConnectionException999aebee3e86a8e4fdd() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.addUpdateContact(arg0, arg1, arg2);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void autocompleteOnPrefixInputNotNullNotNullNotNullOutputJedisConnectionException999d61c61ed473d2db7() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.autocompleteOnPrefix(arg0, arg1, arg2);
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
  public void constructorOutputNotNull999320e2f22ffef8ccf() {

    // Act, creating object to test constructor
    final RedisDemo6 actual = new RedisDemo6();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void createChatInputNotNullNotNullNotNullNotNullNotNullOutputJedisConnectionException99992345d7300cf1819() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final HashSet<String> arg2 = new HashSet<String>();
//    arg2.add(".gz");
//    final String arg3 = ".gz";
//    final String arg4 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.createChat(arg0, arg1, arg2, arg3, arg4);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void createChatInputNotNullNotNullNotNullNotNullOutputJedisConnectionException9995515fcdd90a13444() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final HashSet<String> arg2 = new HashSet<String>();
//    arg2.add(".gz");
//    final String arg3 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.createChat(arg0, arg1, arg2, arg3);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void executeLaterInputNotNullNotNullNotNullNotNullNegativeOutputJedisConnectionException9992a45b2a9275d6101() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    final ArrayList<String> arg3 = new ArrayList<String>();
//    arg3.add(".gz");
//    final long arg4 = -1L;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.executeLater(arg0, arg1, arg2, arg3, arg4);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void fetchAutocompleteListInputNotNullNotNullNotNullOutputJedisConnectionException9991f207e8cb001c475() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.fetchAutocompleteList(arg0, arg1, arg2);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void fetchPendingMessagesInputNotNullNotNullOutputJedisConnectionException999178090c36b30291e() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.fetchPendingMessages(arg0, arg1);
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
  public void findPrefixRangeInputNotNullOutput2999a2e6a9568ec6e818() {

    // Arrange
    final RedisDemo6 thisObj = new RedisDemo6();
    final String arg0 = ".gz";

    // Act
    final String[] actual = thisObj.findPrefixRange(arg0);

    // Assert result
    Assert.assertArrayEquals(new String[]{ ".gy{", ".gz{" }, actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void joinGuildInputNotNullNotNullNotNullOutputJedisConnectionException999a7ddf75efa1cdfb2() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.joinGuild(arg0, arg1, arg2);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void leaveGuildInputNotNullNotNullNotNullOutputJedisConnectionException999d8507514788be341() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.leaveGuild(arg0, arg1, arg2);
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
  public void mainInput3OutputJedisConnectionException999c1fc1bd352d9f623() throws Exception {

    // Arrange
    final String[] arg0 = { ".gz", ".gz", ".gz" };

    // Act
    thrown.expect(JedisConnectionException.class);
    RedisDemo6.main(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void releaseFairSemaphoreInputNotNullNotNullNotNullOutputJedisConnectionException999369e01b8e7c4db75() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.releaseFairSemaphore(arg0, arg1, arg2);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void releaseLockInputNotNullNotNullNotNullOutputJedisConnectionException999ea478e71d47a5a3f() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void removeContactInputNotNullNotNullNotNullOutputJedisConnectionException9994004189faf70a25e() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.removeContact(arg0, arg1, arg2);
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
  public void runOutputJedisConnectionException9994095205484b59c67() throws IOException, InterruptedException {

    // Arrange
    final RedisDemo6 thisObj = new RedisDemo6();

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.run();

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void sendMessageInputNotNullNotNullNotNullNotNullOutputJedisConnectionException999adfb911abb6b84e9() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = ".gz";
//    final String arg2 = ".gz";
//    final String arg3 = ".gz";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.sendMessage(arg0, arg1, arg2, arg3);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testAddressBookAutocompleteInputNotNullOutputJedisConnectionException99922c3aa8e510e2721() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testAddressBookAutocomplete(arg0);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testAddUpdateContactInputNotNullOutputJedisConnectionException9997c3711d9e50772f7() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testAddUpdateContact(arg0);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testCountingSemaphoreInputNotNullOutputJedisConnectionException999418d5d80496d2241() throws InterruptedException {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testCountingSemaphore(arg0);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testDelayedTasksInputNotNullOutputJedisConnectionException9994daf8e24a38e74f8() throws InterruptedException {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testDelayedTasks(arg0);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testDistributedLockingInputNotNullOutputJedisConnectionException999ecbd8ee8dc8bed7c() throws InterruptedException {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testDistributedLocking(arg0);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testFileDistributionInputNotNullOutputJedisConnectionException999480359b6b375a355() throws IOException, InterruptedException {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testFileDistribution(arg0);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testMultiRecipientMessagingInputNotNullOutputJedisConnectionException99918aff51728d2f42d() {
//
//    // Arrange
//    final RedisDemo6 thisObj = new RedisDemo6();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testMultiRecipientMessaging(arg0);
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
  public void availableOutputJedisConnectionException999ff5e1167957eda13() throws IOException {

    // Arrange
    final RedisDemo6 redisDemo6 = new RedisDemo6();
    final Jedis jedis = new Jedis();
    final RedisDemo6.RedisInputStream thisObj = redisDemo6.new RedisInputStream(jedis, "aaaaa");

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.available();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readInput24PositivePositiveOutputJedisConnectionException999a9f331eaac2c9df1() throws IOException {

    // Arrange
    final RedisDemo6 redisDemo6 = new RedisDemo6();
    final Jedis jedis = new Jedis();
    final RedisDemo6.RedisInputStream thisObj = redisDemo6.new RedisInputStream(jedis, "aaaaa");
    final byte[] arg0 = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final int arg1 = 1;
    final int arg2 = 1;

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.read(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
