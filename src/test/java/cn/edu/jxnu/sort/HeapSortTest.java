//package cn.edu.jxnu.sort;
//
//import cn.edu.jxnu.sort.HeapSort;
//import com.diffblue.deeptestutils.Reflector;
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
//public class HeapSortTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9995f1bf8725d3643cb() {
//
//    // Act, creating object to test constructor
//    final HeapSort actual = new HeapSort();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.queue);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual.queue, "elementData")));
//    Assert.assertEquals(0, actual.queue.size());
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid999407c74e3e8274ddf() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a" };
//
//    // Act
//    HeapSort.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sort2Input3ZeroOutput3999571003358aaff3da() {
//
//    // Arrange
//    final HeapSort thisObj = new HeapSort();
//    final Object[] arg0 = { "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a" };
//    final int arg1 = 0;
//
//    // Act
//    final Object[] actual = thisObj.sort2(arg0, arg1);
//
//    // Assert result
//    Assert.assertArrayEquals(new Object[]{ "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a" }, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sortInput3ZeroOutputClassCastException99988dd47facde61c70() {
//
//    // Arrange
//    final HeapSort thisObj = new HeapSort();
//    final Object[] arg0 = { "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a", "\u4f18\u5316\u8017\u8d39\uff1a" };
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