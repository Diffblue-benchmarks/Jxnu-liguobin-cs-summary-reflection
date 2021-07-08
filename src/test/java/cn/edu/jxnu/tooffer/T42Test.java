//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T42;
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
//public class T42Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9991df2f6396fa43518() {
//
//    // Act, creating object to test constructor
//    final T42 actual = new T42();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void FindNumbersWithSumInput8PositiveOutput09998b1c02275385ac1d() {
//
//    // Arrange
//    final T42 thisObj = new T42();
//    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };
//    final int arg1 = 1;
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.FindNumbersWithSum(arg0, arg1);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    Assert.assertEquals(arrayList, actual);
//
//  }
//}
//