//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.LinkedHashMapDemo1;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class LinkedHashMapDemo1Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999ce36f660cbe5b507() {
//
//    // Act, creating object to test constructor
//    final LinkedHashMapDemo1 actual = new LinkedHashMapDemo1();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void FirstNotRepeatingCharInputNotNullOutputNegative9996ea16132420a4d84() {
//
//    // Arrange
//    final LinkedHashMapDemo1 thisObj = new LinkedHashMapDemo1();
//    final String arg0 = "";
//
//    // Act
//    final int actual = thisObj.FirstNotRepeatingChar(arg0);
//
//    // Assert result
//    Assert.assertEquals(-1, actual);
//
//  }
//}
//