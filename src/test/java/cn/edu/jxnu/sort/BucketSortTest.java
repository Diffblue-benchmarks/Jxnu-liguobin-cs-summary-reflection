//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.BucketSort;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class BucketSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void bucketSortInput3OutputClassCastException999a848cca1e7cdd732() {
//
//    // Arrange
//    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(ClassCastException.class);
//    BucketSort.bucketSort(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999e8813e789d05be39() {
//
//    // Act, creating object to test constructor
//    final BucketSort actual = new BucketSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid999844d7b9e1e12395c() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    BucketSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sortInput3ZeroOutputClassCastException9995fd86cb084ef129a() {
//
//    // Arrange
//    final BucketSort thisObj = new BucketSort();
//    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//    final int arg1 = 0;
//
//    // Act
//    thrown.expect(ClassCastException.class);
//    thisObj.sort(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//