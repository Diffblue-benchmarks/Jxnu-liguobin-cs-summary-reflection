//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.QuickSort;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//
//
//
//public class QuickSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9996677016720e90a3a() {
//
//    // Act, creating object to test constructor
//    final QuickSort actual = new QuickSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid99935e43dec281cdb58() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    QuickSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
////failed_compile   // Test written by Diffblue Cover
////  @Test
////  public void quickSortBy3IntegersInput3PositivePositiveOutputArrayIndexOutOfBoundsException999ad0e6a95c032bc0b() {
////
////    // Arrange
////    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
////    final int arg1 = 1;
////    final int arg2 = 655_361;
////
////    // Act
////    thrown.expect(ArrayIndexOutOfBoundsException.class);
////    QuickSort.quickSortBy3Integers(arg0, arg1, arg2);
////
////    // The method is not expected to return due to exception thrown
////
////  }
//
////failed_compile   // Test written by Diffblue Cover
////  @Test
////  public void quickSortInput3PositivePositiveOutputArrayIndexOutOfBoundsException9999547151bbf910b01() {
////
////    // Arrange
////    final QuickSort thisObj = new QuickSort();
////    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
////    final int arg1 = 655_361;
////    final int arg2 = 1;
////
////    // Act
////    thrown.expect(ArrayIndexOutOfBoundsException.class);
////    thisObj.quickSort(arg0, arg1, arg2);
////
////    // The method is not expected to return due to exception thrown
////
////  }
//
////failed_compile   // Test written by Diffblue Cover
////  @Test
////  public void quickInput3PositivePositiveOutput3999dce1cfa7e33e6d2a() {
////
////    // Arrange
////    final QuickSort thisObj = new QuickSort();
////    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
////    final int arg1 = 655_361;
////    final int arg2 = 1;
////
////    // Act
////    final Object[] actual = thisObj.quick(arg0, arg1, arg2);
////
////    // Assert result
////    Assert.assertArrayEquals(new Object[]{ "aaaaa", "aaaaa", "aaaaa" }, actual);
////
////  }
//
////failed_compile   // Test written by Diffblue Cover
////  @Test
////  public void sortInput3PositiveOutputArrayIndexOutOfBoundsException999aae8bef0bc34f11f() {
////
////    // Arrange
////    final QuickSort thisObj = new QuickSort();
////    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
////    final int arg1 = 655_361;
////
////    // Act
////    thrown.expect(ArrayIndexOutOfBoundsException.class);
////    thisObj.sort(arg0, arg1);
////
////    // The method is not expected to return due to exception thrown
////
////  }
//}
//