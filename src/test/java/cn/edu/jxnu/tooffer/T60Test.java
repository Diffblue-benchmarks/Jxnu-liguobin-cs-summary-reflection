//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T60;
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
//public class T60Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99904d913069741e127() {
//
//    // Act, creating object to test constructor
//    final T60 actual = new T60();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void PrintInputNotNullOutput1999f9a108fffb2697be() throws InvocationTargetException {
//
//    // Arrange
//    final T60 thisObj = new T60();
//    final TreeNode arg0 = new TreeNode(1);
//
//    // Act
//    final ArrayList<ArrayList<Integer>> actual = thisObj.Print(arg0);
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