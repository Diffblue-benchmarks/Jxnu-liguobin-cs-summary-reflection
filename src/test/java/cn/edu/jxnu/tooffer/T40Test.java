//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T40;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class T40Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999403dbc9b84a9c8c8() {
//
//    // Act, creating object to test constructor
//    final T40 actual = new T40();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void FindNumsAppearOnceInput888OutputNumberFormatException999ff8fe12c98e246fe() {
//
//    // Arrange
//    final T40 thisObj = new T40();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//
//    // Act
//    thrown.expect(NumberFormatException.class);
//    thisObj.FindNumsAppearOnce(arg0, arg1, arg2);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//