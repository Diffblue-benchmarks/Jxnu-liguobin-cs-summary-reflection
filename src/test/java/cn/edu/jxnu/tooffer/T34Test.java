//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T34;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class T34Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99982663fca15c83969() {
//
//    // Act, creating object to test constructor
//    final T34 actual = new T34();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void FirstNotRepeatingCharInputNotNullOutputNegative99989be9506245954bf() {
//
//    // Arrange
//    final T34 thisObj = new T34();
//    final String arg0 = " ";
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