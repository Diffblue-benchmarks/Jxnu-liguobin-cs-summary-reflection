//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.PrintTreeByLevel;
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
//public class PrintTreeByLevelTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999554bea630de0c14a() {
//
//    // Act, creating object to test constructor
//    final PrintTreeByLevel actual = new PrintTreeByLevel();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void printInputNotNullOutput1999b3d07f949eb05b23() throws InvocationTargetException {
//
//    // Arrange
//    final PrintTreeByLevel thisObj = new PrintTreeByLevel();
//    final TreeNode arg0 = new TreeNode(1);
//
//    // Act
//    final ArrayList<ArrayList<Integer>> actual = thisObj.print(arg0);
//
//    // Assert result
//    final ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
//    final ArrayList arrayList1 = new ArrayList();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList1.add(integer);
//    arrayList.add(arrayList1);
//    Assert.assertEquals(arrayList, actual);
//
//  }
//}
//