//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.GetLeastNumbers;
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
//public class GetLeastNumbersTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9992a2e68af69f580c1() {
//
//    // Act, creating object to test constructor
//    final GetLeastNumbers actual = new GetLeastNumbers();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void GetLeastNumbers2_SolutionInput8ZeroOutput0999a082205de9a8a6cf() {
//
//    // Arrange
//    final GetLeastNumbers thisObj = new GetLeastNumbers();
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int arg1 = 0;
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.GetLeastNumbers2_Solution(arg0, arg1);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    Assert.assertEquals(arrayList, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void GetLeastNumbers_SolutionInput8ZeroOutput09992c67a4a8aa768feb() {
//
//    // Arrange
//    final GetLeastNumbers thisObj = new GetLeastNumbers();
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
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9995cf2920283a9542b() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    GetLeastNumbers.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//