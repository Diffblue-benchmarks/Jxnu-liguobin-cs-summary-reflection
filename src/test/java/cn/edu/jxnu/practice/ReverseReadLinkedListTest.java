//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.ListNode2;
//import cn.edu.jxnu.practice.ListNode;
//import cn.edu.jxnu.practice.ReverseReadLinkedList;
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
//public class ReverseReadLinkedListTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999d344437b36d0cec8() {
//
//    // Act, creating object to test constructor
//    final ReverseReadLinkedList actual = new ReverseReadLinkedList();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void printListFromTailToHead2InputNotNullOutput1999cab14d4dc1d1f385() throws InvocationTargetException {
//
//    // Arrange
//    final ListNode2 arg0 = new ListNode2(1);
//
//    // Act
//    final ArrayList<Integer> actual = ReverseReadLinkedList.printListFromTailToHead2(arg0);
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
//  public void printListFromTailToHeadInputNotNullOutput199952bfd8fe0fe62f62() throws InvocationTargetException {
//
//    // Arrange
//    final ListNode arg0 = new ListNode(1);
//
//    // Act
//    final ArrayList<Integer> actual = ReverseReadLinkedList.printListFromTailToHead(arg0);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer);
//    Assert.assertEquals(arrayList, actual);
//
//  }
//}
//