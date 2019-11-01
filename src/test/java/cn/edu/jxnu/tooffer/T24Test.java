//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T24;
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
//public class T24Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9992d39c2c48e252a58() {
//
//    // Act, creating object to test constructor
//    final T24 actual = new T24();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void FindPathInputNotNullPositiveOutput19994dcd3a7d3d68b5eb() throws InvocationTargetException {
//
//    // Arrange
//    final T24 thisObj = new T24();
//    final TreeNode arg0 = new TreeNode(1);
//    final int arg1 = 1;
//
//    // Act
//    final ArrayList<ArrayList<Integer>> actual = thisObj.FindPath(arg0, arg1);
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