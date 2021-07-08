//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.MaxInWindowSize;
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
//public class MaxInWindowSizeTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99918ac8ba0df4e418d() {
//
//    // Act, creating object to test constructor
//    final MaxInWindowSize actual = new MaxInWindowSize();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void maxInWindowsInput8ZeroOutput0999d471c557dc364a37() {
//
//    // Arrange
//    final MaxInWindowSize thisObj = new MaxInWindowSize();
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