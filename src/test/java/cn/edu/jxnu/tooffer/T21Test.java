//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T21;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class T21Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999a571fd5d4d402cf7() {
//
//    // Act, creating object to test constructor
//    final T21 actual = new T21();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void IsPopOrderInput88OutputTrue999df090044628848fa() {
//
//    // Arrange
//    final T21 thisObj = new T21();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//
//    // Act
//    final boolean actual = thisObj.IsPopOrder(arg0, arg1);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }
//}
//