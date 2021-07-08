//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.PringTreeFromTopToBottom;
//import cn.edu.jxnu.practice.TreeNode;
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
//public class PringTreeFromTopToBottomTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9994c6758cf7a1ce238() {
//
//    // Act, creating object to test constructor
//    final PringTreeFromTopToBottom actual = new PringTreeFromTopToBottom();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void PrintFromTopToBottom2InputNotNullOutput0999952dc585d61f5a60() {
//
//    // Arrange
//    final PringTreeFromTopToBottom thisObj = new PringTreeFromTopToBottom();
//    final TreeNode arg0 = new TreeNode(1);
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.PrintFromTopToBottom2(arg0);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    Assert.assertEquals(arrayList, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void PrintFromTopToBottomInputNotNullOutput199980644fc1b402a2a7() throws InvocationTargetException {
//
//    // Arrange
//    final TreeNode arg0 = new TreeNode(1);
//
//    // Act
//    final ArrayList<Integer> actual = PringTreeFromTopToBottom.PrintFromTopToBottom(arg0);
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