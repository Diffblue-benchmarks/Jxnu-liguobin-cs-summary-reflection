//package cn.edu.jxnu.sql;
//
////import cn.edu.jxnu.sql.ConnectionPoolTest.ConnectionRunner;
//import cn.edu.jxnu.sql.ConnectionPoolTest;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.concurrent.atomic.AtomicInteger;
//
//
//
//public class ConnectionPoolTestTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99966c836d9fc41f4f5() {
//
//    // Act, creating object to test constructor
//    final ConnectionPoolTest actual = new ConnectionPoolTest();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
////  // Test written by Diffblue Cover
////  @Test
////  public void constructorInputPositiveNotNullNotNullOutputNotNull9998c16f998aa705a8d() {
////
////    // Arrange
////    final int arg0 = 1;
////    final AtomicInteger arg1 = new AtomicInteger();
////    final AtomicInteger arg2 = new AtomicInteger();
////
////    // Act, creating object to test constructor
////    final ConnectionPoolTest.ConnectionRunner actual = new ConnectionPoolTest.ConnectionRunner(arg0, arg1, arg2);
////
////    // Assert result
////    Assert.assertNotNull(actual);
////    Assert.assertNotNull(actual.got);
////    Assert.assertEquals(0, actual.got.get());
////    Assert.assertEquals(1, actual.count);
////    Assert.assertNotNull(actual.notGot);
////    Assert.assertEquals(0, actual.notGot.get());
////
////  }
//}
//