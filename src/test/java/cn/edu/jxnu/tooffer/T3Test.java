//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.ListNode;
//import cn.edu.jxnu.tooffer.T3;
//import com.diffblue.deeptestutils.Reflector;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//import java.lang.reflect.InvocationTargetException;
//import java.util.ArrayList;
//
//
//
//public class T3Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99940a0336092a8ea49() {
//
//    // Act, creating object to test constructor
//    final T3 actual = new T3();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    Assert.assertEquals(arrayList, actual.arrayList);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9999e0359c73a138207() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    T3.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void printListFromTailToHead1InputNotNullOutput19996afc0f32675e1495() throws InvocationTargetException {
//
//    // Arrange
//    final ListNode arg0 = new ListNode(1);
//
//    // Act
//    final ArrayList<Integer> actual = T3.printListFromTailToHead1(arg0);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer);
//    Assert.assertEquals(arrayList, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void printListFromTailToHead2InputNotNullOutput19996c9a26fe2f010859() throws InvocationTargetException {
//
//    // Arrange
//    final T3 thisObj = new T3();
//    final ListNode arg0 = new ListNode(1);
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.printListFromTailToHead2(arg0);
//
//    // Assert side effects
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer);
//    Assert.assertEquals(arrayList, thisObj.arrayList);
//
//    // Assert result
//    final ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList1.add(integer1);
//    Assert.assertEquals(arrayList1, actual);
//
//  }
//}
//