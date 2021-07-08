//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T29;
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
//public class T29Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9995733cd10c2067421() {
//
//    // Act, creating object to test constructor
//    final T29 actual = new T29();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void GetLeastNumbers_SolutionInput8ZeroOutput0999f562c6aa7db5d0a6() {
//
//    // Arrange
//    final T29 thisObj = new T29();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int arg1 = 0;
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.GetLeastNumbers_Solution(arg0, arg1);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    Assert.assertEquals(arrayList, actual);
//
//  }
//}
//