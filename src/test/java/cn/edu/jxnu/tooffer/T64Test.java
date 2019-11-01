//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T64;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//
//
//public class T64Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9994ae4446ce02b82fa() {
//
//    // Act, creating object to test constructor
//    final T64 actual = new T64();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void maxInWindowsInput8ZeroOutput0999de806b89e79a857f() {
//
//    // Arrange
//    final T64 thisObj = new T64();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int arg1 = 0;
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.maxInWindows(arg0, arg1);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    Assert.assertEquals(arrayList, actual);
//
//  }
//}
//