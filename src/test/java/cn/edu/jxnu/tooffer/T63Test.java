//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T63;
//import com.diffblue.deeptestutils.Reflector;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.LinkedList;
//
//
//
//public class T63Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999d627bf9fdf0d8444() {
//
//    // Act, creating object to test constructor
//    final T63 actual = new T63();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    final LinkedList<Integer> linkedList = new LinkedList<Integer>();
//    Assert.assertEquals(linkedList, actual.list);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void GetMedianOutputVoid999b3d9194393284350() {
//
//    // Arrange
//    final T63 thisObj = new T63();
//
//    // Act
//    final Double actual = thisObj.GetMedian();
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void InsertInputNotNullOutputVoid9999c14a8e71ad2acaa() throws InvocationTargetException {
//
//    // Arrange
//    final T63 thisObj = new T63();
//    final Integer arg0 = new Integer(2);
//
//    // Act
//    thisObj.Insert(arg0);
//
//    // Assert side effects
//    final LinkedList<Integer> linkedList = new LinkedList<Integer>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    linkedList.add(integer);
//    Assert.assertEquals(linkedList, thisObj.list);
//
//  }
//}
//