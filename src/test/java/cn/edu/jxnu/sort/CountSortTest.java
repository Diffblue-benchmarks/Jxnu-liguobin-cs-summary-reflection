//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.CountSort;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class CountSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999f8d565bb63413367() {
//
//    // Act, creating object to test constructor
//    final CountSort actual = new CountSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void countSortInput3OutputClassCastException99927fd5769f6c3b278() {
//
//    // Arrange
//    final Object[] arg0 = { "\u8017\u8d39\u65f6\u95f4\uff1a", "\u8017\u8d39\u65f6\u95f4\uff1a", "\u8017\u8d39\u65f6\u95f4\uff1a" };
//
//    // Act
//    thrown.expect(ClassCastException.class);
//    CountSort.countSort(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9999e99a9b32815b1df() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "\u8017\u8d39\u65f6\u95f4\uff1a", "\u8017\u8d39\u65f6\u95f4\uff1a", "\u8017\u8d39\u65f6\u95f4\uff1a" };
//
//    // Act
//    CountSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sortInput3ZeroOutputClassCastException99969443692c19bdee7() {
//
//    // Arrange
//    final CountSort thisObj = new CountSort();
//    final Object[] arg0 = { "\u8017\u8d39\u65f6\u95f4\uff1a", "\u8017\u8d39\u65f6\u95f4\uff1a", "\u8017\u8d39\u65f6\u95f4\uff1a" };
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