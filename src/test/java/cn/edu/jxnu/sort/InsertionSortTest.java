//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.InsertionSort;
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
//public class InsertionSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99968b9ef01a3c21191() {
//
//    // Act, creating object to test constructor
//    final InsertionSort actual = new InsertionSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid99959adc113b3593066() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    InsertionSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sortInput3PositiveOutput39997c9c5bf8b36deb44() {
//
//    // Arrange
//    final InsertionSort thisObj = new InsertionSort();
//    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//    final int arg1 = 1;
//
//    // Act
//    final Object[] actual = thisObj.sort(arg0, arg1);
//
//    // Assert result
//    Assert.assertArrayEquals(new Object[]{ "aaaaa", "aaaaa", "aaaaa" }, actual);
//
//  }
//}
//