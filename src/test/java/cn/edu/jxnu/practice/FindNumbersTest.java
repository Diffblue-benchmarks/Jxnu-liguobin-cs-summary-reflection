//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.FindNumbers;
//import com.diffblue.deeptestutils.Reflector;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//import java.lang.reflect.InvocationTargetException;
//import java.util.ArrayList;
//
//
//
//public class FindNumbersTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999c8f1feb2cafd747d() {
//
//    // Act, creating object to test constructor
//    final FindNumbers actual = new FindNumbers();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void FindNumbersWithSumInput8ZeroOutput2999211ff021eca9ed6a() throws InvocationTargetException {
//
//    // Arrange
//    final FindNumbers thisObj = new FindNumbers();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int arg1 = 0;
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.FindNumbersWithSum(arg0, arg1);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer);
//    arrayList.add(integer);
//    Assert.assertEquals(arrayList, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid99991f2f9dfb833e425() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    FindNumbers.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//