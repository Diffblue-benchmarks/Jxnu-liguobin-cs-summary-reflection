//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T22;
//import cn.edu.jxnu.tooffer.TreeNode;
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
//public class T22Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999a3d555fa3a986401() {
//
//    // Act, creating object to test constructor
//    final T22 actual = new T22();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void PrintFromTopToBottom2InputNotNullOutput1999954560e1462426b9() throws InvocationTargetException {
//
//    // Arrange
//    final T22 thisObj = new T22();
//    final TreeNode arg0 = new TreeNode(1);
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.PrintFromTopToBottom2(arg0);
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
//  public void PrintFromTopToBottomInputNotNullOutput1999c13ccf22231e7d74() throws InvocationTargetException {
//
//    // Arrange
//    final T22 thisObj = new T22();
//    final TreeNode arg0 = new TreeNode(1);
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.PrintFromTopToBottom(arg0);
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