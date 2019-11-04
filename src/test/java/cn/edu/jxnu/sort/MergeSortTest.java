//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.MergeSort;
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
//public class MergeSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999a3f845c3598d569f() {
//
//    // Act, creating object to test constructor
//    final MergeSort actual = new MergeSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid999173b7fdf17476a21() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    MergeSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mSortInput32ZeroZeroOutputVoid9990d03ec323bee89f9() {
//
//    // Arrange
//    final MergeSort thisObj = new MergeSort();
//    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//    final Object[] arg1 = { "aaaaa", "aaaaa" };
//    final int arg2 = 0;
//    final int arg3 = 0;
//
//    // Act
//    thisObj.mSort(arg0, arg1, arg2, arg3);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sortInput3ZeroOutput3999a3fb38d1f9482d28() {
//
//    // Arrange
//    final MergeSort thisObj = new MergeSort();
//    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//    final int arg1 = 0;
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