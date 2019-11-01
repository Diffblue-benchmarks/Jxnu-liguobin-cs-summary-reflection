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
//}
//