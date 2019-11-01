//package cn.edu.jxnu.other;
//
////import cn.edu.jxnu.other.LRU.;
//import cn.edu.jxnu.other.LRU;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.Iterator;
//
//
//
//public class LRUTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputPositiveOutputNotNull999b070a2c9a31ac6e1() {
//
//    // Arrange
//    final int arg0 = 1;
//
//    // Act, creating object to test constructor
//    final LRU<Object, Object> actual = new LRU<Object, Object>(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getInputNotNullOutputVoid999489705fb2229f85a() {
//
//    // Arrange
//    final LRU<Object, Object> thisObj = new LRU<Object, Object>(1);
//    final Object arg0 = "aaaaa";
//
//    // Act
//    final Object actual = thisObj.get(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void iteratorOutputNotNull999d0866d281f27304f() {
//
//    // Arrange
//    final LRU<Object, Object> thisObj = new LRU<Object, Object>(1);
//
//    // Act
//    final Iterator<Object> actual = thisObj.iterator();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void putInputNotNullNotNullOutputVoid999594e4bf8999ff867() {
//
//    // Arrange
//    final LRU<Object, Object> thisObj = new LRU<Object, Object>(1);
//    final Object arg0 = "aaaaa";
//    final Object arg1 = "aaaaa";
//
//    // Act
//    thisObj.put(arg0, arg1);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//