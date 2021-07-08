//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T32;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class T32Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999404a70a440b29aee() {
//
//    // Act, creating object to test constructor
//    final T32 actual = new T32();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void PrintMinNumberInput8OutputNotNull999a1ffd0a0c8b0d6dd() {
//
//    // Arrange
//    final T32 thisObj = new T32();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//
//    // Act
//    final String actual = thisObj.PrintMinNumber(arg0);
//
//    // Assert result
//    Assert.assertEquals("00000000", actual);
//
//  }
//}
//