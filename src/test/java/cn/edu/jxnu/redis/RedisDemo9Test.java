package cn.edu.jxnu.redis;

import cn.edu.jxnu.redis.RedisDemo9.RedisInputStream;
import cn.edu.jxnu.redis.RedisDemo9;
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

import java.io.IOException;
import java.net.Socket;
import java.net.SocketImpl;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class RedisDemo9Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void aggregateLocationListInputNotNull8OutputJedisConnectionException999724185893cf84311() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    final long[] arg1 = { 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L };
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.aggregateLocationList(arg0, arg1);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void aggregateLocationInputNotNullOutputJedisConnectionException9995ce65f9c1ba0338f() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.aggregateLocation(arg0);
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
  public void constructorOutputNotNull999ebcd60aecf60baf0() {

    // Act, creating object to test constructor
    final RedisDemo9 actual = new RedisDemo9();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void countVisitInputNotNullNotNullOutputJedisConnectionException999ee71022fe7cfbbb6() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testShardKey -----";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.countVisit(arg0, arg1);
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
  public void getCodeInputNotNullNotNullOutputNotNull9998e0ecab0d3f86119() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();
    final String arg0 = "\n----- testShardKey -----";
    final String arg1 = "\n----- testShardKey -----";

    // Act
    final String actual = thisObj.getCode(arg0, arg1);

    // Assert result
    Assert.assertEquals("\u0000\u0000", actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void getExpectedInputNotNullNotNullNotNullOutputJedisConnectionException99904b84bed0a60c2e1() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testShardKey -----";
//    final GregorianCalendar arg2 = new GregorianCalendar(-1, -1, -1);
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.getExpected(arg0, arg1, arg2);
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
//  public void longZiplistPerformanceInputNotNullNotNullNegativeNegativeNegativeOutputJedisConnectionException999775542eb0fa424f9() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testShardKey -----";
//    final int arg2 = -1;
//    final int arg3 = -1;
//    final int arg4 = -1;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.longZiplistPerformance(arg0, arg1, arg2, arg3, arg4);
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
  public void mainInput3OutputJedisConnectionException999cc89da1a0b1217c1() {

    // Arrange
    final String[] arg0 = { "\n----- testShardKey -----", "\n----- testShardKey -----", "\n----- testShardKey -----" };

    // Act
    thrown.expect(JedisConnectionException.class);
    RedisDemo9.main(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputJedisConnectionException999e17d4710b403e658() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.run();

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void setLocationInputNotNullZeroNotNullNotNullOutputJedisConnectionException9990bd912f25d4ef857() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = 0L;
//    final String arg2 = "\n----- testShardKey -----";
//    final String arg3 = "\n----- testShardKey -----";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.setLocation(arg0, arg1, arg2, arg3);
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

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void shardHgetInputNotNullNotNullNotNullNegativeNegativeOutputJedisConnectionException99989cd1e1f29085c53() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "\n----- testShardKey -----";
//    final String arg2 = "\n----- testShardKey -----";
//    final int arg3 = -1;
//    final int arg4 = -1;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.shardHget(arg0, arg1, arg2, arg3, arg4);
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
  public void shardHsetInputNotNullNotNullNotNullNotNullZeroNegativeOutputArithmeticException999dfd4e85c4c6fb20d() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();
    final Jedis arg0 = new Jedis();
    final String arg1 = "\n----- testShardKey -----";
    final String arg2 = "\n----- testShardKey -----";
    final String arg3 = "\n----- testShardKey -----";
    final long arg4 = 0L;
    final int arg5 = -1;

    // Act
    thrown.expect(ArithmeticException.class);
    thisObj.shardHset(arg0, arg1, arg2, arg3, arg4, arg5);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void shardKeyInputNotNullNotNullZeroNegativeOutputArithmeticException99945e33722ffe44cf5() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();
    final String arg0 = "\n----- testShardKey -----";
    final String arg1 = "\n----- testShardKey -----";
    final long arg2 = 0L;
    final int arg3 = -1;

    // Act
    thrown.expect(ArithmeticException.class);
    thisObj.shardKey(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void shardSaddInputNotNullNotNullNotNullZeroNegativeOutputArithmeticException999231af025564afbc6() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();
    final Jedis arg0 = new Jedis();
    final String arg1 = "\n----- testShardKey -----";
    final String arg2 = "\n----- testShardKey -----";
    final long arg3 = 0L;
    final int arg4 = -1;

    // Act
    thrown.expect(ArithmeticException.class);
    thisObj.shardSadd(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testLongZiplistPerformanceInputNotNullOutputJedisConnectionException9997a04742296eeb5bc() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testLongZiplistPerformance(arg0);
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
//  public void testShardedHashInputNotNullOutputJedisConnectionException99917c457543405090b() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testShardedHash(arg0);
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
//  public void testShardedSaddInputNotNullOutputJedisConnectionException999c7282e6c1f7b5811() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testShardedSadd(arg0);
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
  public void testShardKeyInputNotNullOutputVoid9995820a78753ef4db8() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();
    final Jedis arg0 = new Jedis();

    // Act
    thisObj.testShardKey(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testUniqueVisitorsInputNotNullOutputJedisConnectionException99904d923bc29b74477() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testUniqueVisitors(arg0);
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
//  public void testUserLocationInputNotNullOutputJedisConnectionException99926425e27a5e01262() {
//
//    // Arrange
//    final RedisDemo9 thisObj = new RedisDemo9();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testUserLocation(arg0);
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

  // Test written by Diffblue Cover
  @Test
  public void updateAggregatesInputNotNullNotNullNotNullOutputVoid999aa42d78c8e5b9c6b() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();
    final HashMap<String, Long> arg0 = new HashMap<String, Long>();
    final Long long1 = new Long(0L);
    arg0.put("\n----- testShardKey -----", long1);
    final HashMap<String, Map<String, Long>> arg1 = new HashMap<String, Map<String, Long>>();
    final HashMap<String, Long> hashMap = new HashMap<String, Long>();
    final Long long2 = new Long(0L);
    hashMap.put("\n----- testShardKey -----", long2);
    arg1.put("\n----- testShardKey -----", hashMap);
    final String arg2 = "\n----- testShardKey -----";

    // Act
    thisObj.updateAggregates(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAggregatesInputNotNullNotNullNullOutputNullPointerException9990aab9efe2d1bc311() {

    // Arrange
    final RedisDemo9 thisObj = new RedisDemo9();
    final HashMap<String, Long> arg0 = new HashMap<String, Long>();
    final Long long1 = new Long(0L);
    arg0.put("\n----- testShardKey -----", long1);
    final HashMap<String, Map<String, Long>> arg1 = new HashMap<String, Map<String, Long>>();
    final HashMap<String, Long> hashMap = new HashMap<String, Long>();
    final Long long2 = new Long(0L);
    hashMap.put("\n----- testShardKey -----", long2);
    arg1.put("\n----- testShardKey -----", hashMap);
    final List<Object> arg2 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAggregates(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void closeOutputVoid9997b7246b82254c708() {

    // Arrange
    final RedisDemo9 redisDemo9 = new RedisDemo9();
    final Jedis jedis = new Jedis();
    final RedisDemo9.RedisInputStream thisObj = redisDemo9.new RedisInputStream(jedis, "aaaaa");

    // Act
    thisObj.close();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readOutputJedisConnectionException999be4b89d0d2ddc420() throws IOException {

    // Arrange
    final RedisDemo9 redisDemo9 = new RedisDemo9();
    final Jedis jedis = new Jedis();
    final RedisDemo9.RedisInputStream thisObj = redisDemo9.new RedisInputStream(jedis, "aaaaa");

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.read();

    // The method is not expected to return due to exception thrown

  }
}
