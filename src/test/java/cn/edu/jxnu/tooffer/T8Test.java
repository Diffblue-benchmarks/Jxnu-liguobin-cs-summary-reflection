//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T8;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.HashMap;
//
//
//
//public class T8Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99986d13ffc824a8c29() {
//
//    // Act, creating object to test constructor
//    final T8 actual = new T8();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void JumpFloor2InputPositiveOutputPositive999c2c397981ab55e7f() {
//
//    // Arrange
//    final T8 thisObj = new T8();
//    final int arg0 = 1;
//
//    // Act
//    final int actual = thisObj.JumpFloor2(arg0);
//
//    // Assert result
//    Assert.assertEquals(1, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void JumpFloor3InputPositiveNotNullOutputPositive9997b71dffb94f19fff() {
//
//    // Arrange
//    final T8 thisObj = new T8();
//    final int arg0 = 1;
//    final HashMap<Integer, Integer> arg1 = new HashMap<Integer, Integer>();
//    final Integer integer = new Integer(1);
//    final Integer integer1 = new Integer(1);
//    arg1.put(integer, integer1);
//
//    // Act
//    final int actual = thisObj.JumpFloor3(arg0, arg1);
//
//    // Assert result
//    Assert.assertEquals(1, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void JumpFloorInputPositiveOutputPositive999a21c5b74d87bb0a4() {
//
//    // Arrange
//    final T8 thisObj = new T8();
//    final int arg0 = 1;
//
//    // Act
//    final int actual = thisObj.JumpFloor(arg0);
//
//    // Assert result
//    Assert.assertEquals(1, actual);
//
//  }
//}
//