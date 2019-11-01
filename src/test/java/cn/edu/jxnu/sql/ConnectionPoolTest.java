//package cn.edu.jxnu.sql;
//
//import cn.edu.jxnu.sql.ConnectionPool;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.sql.Connection;
//
//
//
//public class ConnectionPoolTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputZeroOutputNotNull999b365a113c176862c() {
//
//    // Arrange
//    final int arg0 = 0;
//
//    // Act, creating object to test constructor
//    final ConnectionPool actual = new ConnectionPool(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void releaseConnectionInputNullOutputVoid999cd4435ca8d5a5884() {
//
//    // Arrange
//    final ConnectionPool thisObj = new ConnectionPool(0);
//    final Connection arg0 = null;
//
//    // Act
//    thisObj.releaseConnection(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//