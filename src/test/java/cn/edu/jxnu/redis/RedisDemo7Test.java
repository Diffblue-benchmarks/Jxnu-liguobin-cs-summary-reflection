package cn.edu.jxnu.redis;

import cn.edu.jxnu.redis.RedisDemo7.Ecpm;
import cn.edu.jxnu.redis.RedisDemo7.Query;
import cn.edu.jxnu.redis.RedisDemo7.WordScore;
import cn.edu.jxnu.redis.RedisDemo7;
import com.diffblue.deeptestutils.Reflector;
import org.javatuples.Pair;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.lang.reflect.Array;
import java.net.Socket;
import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class RedisDemo7Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputCpa999753a5890d18d5802() {

    // Arrange
    final String arg0 = "CPA";

    // Act
    final Ecpm actual = Ecpm.valueOf(arg0);

    // Assert result
    Assert.assertEquals(Ecpm.CPA, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999fc3ba5e15062a69d() {

    // Act
    final Ecpm[] actual = Ecpm.values();

    // Assert result
    Assert.assertArrayEquals(new Ecpm[]{ Ecpm.CPC, Ecpm.CPA, Ecpm.CPM }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f4d41c8e16231c26() {

    // Act, creating object to test constructor
    final RedisDemo7 actual = new RedisDemo7();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void finishScoringInputNotNullNotNullNotNullNotNullOutputNotNull999da0060dad2aeae69() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final Client client = new Client();
    final Transaction arg0 = new Transaction(client);
    final String arg1 = "";
    final String arg2 = "";
    final String arg3 = "";

    // Act
    final Pair<Set<String>, String> actual = thisObj.finishScoring(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    final HashSet<String> hashSet = new HashSet<String>();
    Assert.assertEquals(hashSet, actual.getValue0());
    Assert.assertEquals("", actual.getValue1());

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void indexDocumentInputNotNullNotNullNotNullOutputJedisConnectionException999daa79df7f6a075ec() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "";
//    final String arg2 = "";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.indexDocument(arg0, arg1, arg2);
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
  public void parseAndSearchInputNotNullNotNullNegativeOutputVoid999b773b2a298f84509() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final Jedis arg0 = new Jedis();
    final String arg1 = "";
    final int arg2 = -1;

    // Act
    final String actual = thisObj.parseAndSearch(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullOutputNotNull999a5ab5547eb0803fe() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final String arg0 = "";

    // Act
    final Query actual = thisObj.parse(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
    Assert.assertEquals(arrayList, actual.all);
    final HashSet<String> hashSet = new HashSet<String>();
    Assert.assertEquals(hashSet, actual.unwanted);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void recordClickInputNotNullNegativeNotNullTrueOutputJedisConnectionException999312cf4cb65356e5d() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final String arg2 = "";
//    final boolean arg3 = true;
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.recordClick(arg0, arg1, arg2, arg3);
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
//  public void recordTargetingResultInputNotNullNegativeNotNullNotNullOutputJedisConnectionException99983f4adc9f313e9aa() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    final long arg1 = -1L;
//    final String arg2 = "";
//    final HashSet<String> arg3 = new HashSet<String>();
//    arg3.add("");
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.recordTargetingResult(arg0, arg1, arg2, arg3);
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
  public void runOutputJedisConnectionException99951b9d22b165578b7() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();

    // Act
    thrown.expect(JedisConnectionException.class);
    thisObj.run();

    // The method is not expected to return due to exception thrown

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void searchAndSortInputNotNullNotNullNotNullOutputJedisConnectionException9998014feade1589300() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "";
//    final String arg2 = "";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.searchAndSort(arg0, arg1, arg2);
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
//  public void searchAndZsortInputNotNullNotNullTrueNotNullOutputJedisConnectionException9993741ad09ba0afd6c() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "";
//    final boolean arg2 = true;
//    final HashMap<String, Integer> arg3 = new HashMap<String, Integer>();
//    final Integer integer = new Integer(-1);
//    arg3.put("", integer);
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.searchAndZsort(arg0, arg1, arg2, arg3);
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
  public void stringToScoreInputNotNullTrueOutputZero9999529cbf43447372d() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final String arg0 = "";
    final boolean arg1 = true;

    // Act
    final long actual = thisObj.stringToScore(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringToScoreInputNotNullOutputZero9999223ee19d3b35d09() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final String arg0 = "";

    // Act
    final long actual = thisObj.stringToScore(arg0);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringToScoreGenericInputNotNullNotNullOutputZero9994d98f59b64ddc3d7() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final String arg0 = "";
    final HashMap<Integer, Integer> arg1 = new HashMap<Integer, Integer>();
    final Integer integer = new Integer(-1);
    final Integer integer1 = new Integer(-1);
    arg1.put(integer, integer1);

    // Act
    final long actual = thisObj.stringToScoreGeneric(arg0, arg1);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void testIndexAndFindJobsInputNotNullOutputJedisConnectionException9994bc5be533aa97031() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testIndexAndFindJobs(arg0);
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
//  public void testIndexAndTargetAdsInputNotNullOutputJedisConnectionException9999a9b285759af4b39() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testIndexAndTargetAds(arg0);
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
//  public void testIndexDocumentInputNotNullOutputJedisConnectionException9994413f079c0ef7c3b() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testIndexDocument(arg0);
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
//  public void testIsQualifiedForJobInputNotNullOutputJedisConnectionException999ff5813cc2e05b0c5() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testIsQualifiedForJob(arg0);
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
//  public void testParseAndSearchInputNotNullOutputJedisConnectionException9998c5270867960833b() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testParseAndSearch(arg0);
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
  public void testParseQueryInputNotNullOutputVoid9996519c11e56435f5d() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final Jedis arg0 = new Jedis();

    // Act
    thisObj.testParseQuery(arg0);

    // The method returns void, testing that no exception is thrown

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void testSearchWithSortInputNotNullOutputJedisConnectionException999e2f1472bff102b54() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testSearchWithSort(arg0);
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
//  public void testSearchWithZsortInputNotNullOutputJedisConnectionException999e0469d9ac36263b8() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testSearchWithZsort(arg0);
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
//  public void testSetOperationsInputNotNullOutputJedisConnectionException999c694d0c9904a5a03() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testSetOperations(arg0);
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
//  public void testStringToScoreInputNotNullOutputJedisConnectionException9997f1241bf00dc6dd0() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.testStringToScore(arg0);
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
  public void toEcpmInputCpcPositivePositivePositiveOutputPositive99996bdd29c66cff6d4() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final Ecpm arg0 = Ecpm.CPC;
    final double arg1 = 0.125;
    final double arg2 = 0.125;
    final double arg3 = 0.125;

    // Act
    final double actual = thisObj.toEcpm(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertEquals(125.0, actual, 0.0);

  }

  // Test written by Diffblue Cover
  @Test
  public void tokenizeInputNotNullOutput0999f2d1d278e4b6f8b8() {

    // Arrange
    final RedisDemo7 thisObj = new RedisDemo7();
    final String arg0 = "";

    // Act
    final Set<String> actual = thisObj.tokenize(arg0);

    // Assert result
    final HashSet<String> hashSet = new HashSet<String>();
    Assert.assertEquals(hashSet, actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void updateCpmsInputNotNullNotNullOutputJedisConnectionException999a300847f2b162e62() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "";
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.updateCpms(arg0, arg1);
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
//  public void zaddStringInputNotNullNotNullNotNullOutputJedisConnectionException99998a3b7652e1ba8c2() {
//
//    // Arrange
//    final RedisDemo7 thisObj = new RedisDemo7();
//    final Jedis arg0 = new Jedis();
//    final String arg1 = "";
//    final HashMap<String, String> arg2 = new HashMap<String, String>();
//    arg2.put("", "");
//    try {
//
//      // Act
//      thrown.expect(JedisConnectionException.class);
//      thisObj.zaddString(arg0, arg1, arg2);
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
  public void compareToInputNotNullOutputZero9990d8118924b01cfcd() {

    // Arrange
    final RedisDemo7 redisDemo7 = new RedisDemo7();
    final WordScore thisObj = redisDemo7.new WordScore("aaaaa", 0L);
    final WordScore arg0 = thisObj;

    // Act
    final int actual = thisObj.compareTo(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse999f10630bac430d881() {

    // Arrange
    final RedisDemo7 redisDemo7 = new RedisDemo7();
    final WordScore thisObj = redisDemo7.new WordScore("aaaaa", 0L);
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999b7e432776a340ac2() {

    // Arrange
    final RedisDemo7 redisDemo7 = new RedisDemo7();
    final WordScore thisObj = redisDemo7.new WordScore("aaaaa", 0L);

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("aaaaa=0", actual);

  }
}
