//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.BubbleSort;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class BubbleSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999c5bb3a66db07c2c7() {
//
//    // Act, creating object to test constructor
//    final BubbleSort actual = new BubbleSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid999f4d92830ac9a2d70() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "\u4f18\u5316\uff1a", "\u4f18\u5316\uff1a", "\u4f18\u5316\uff1a" };
//
//    // Act
//    BubbleSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sort2Input3ZeroOutputClassCastException9991f3f47cdfeefe195() {
//
//    // Arrange
//    final BubbleSort thisObj = new BubbleSort();
//    final Object[] arg0 = { "\u4f18\u5316\uff1a", "\u4f18\u5316\uff1a", "\u4f18\u5316\uff1a" };
//    final int arg1 = 0;
//
//    // Act
//    thrown.expect(ClassCastException.class);
//    thisObj.sort2(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sortInput3ZeroOutputClassCastException9992a26673f3cf77665() {
//
//    // Arrange
//    final BubbleSort thisObj = new BubbleSort();
//    final Object[] arg0 = { "\u4f18\u5316\uff1a", "\u4f18\u5316\uff1a", "\u4f18\u5316\uff1a" };
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