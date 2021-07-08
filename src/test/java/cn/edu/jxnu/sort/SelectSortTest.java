//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.SelectSort;
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
//public class SelectSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999a69608fe46dda49a() {
//
//    // Act, creating object to test constructor
//    final SelectSort actual = new SelectSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9998978464583debc49() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    SelectSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void selectInput3ZeroOutputVoid9990829ae2db35a9769() {
//
//    // Arrange
//    final SelectSort thisObj = new SelectSort();
//    final Object[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//    final int arg1 = 0;
//
//    // Act
//    thisObj.select(arg0, arg1);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sortInput3ZeroOutput3999a9756139c2e62870() {
//
//    // Arrange
//    final SelectSort thisObj = new SelectSort();
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