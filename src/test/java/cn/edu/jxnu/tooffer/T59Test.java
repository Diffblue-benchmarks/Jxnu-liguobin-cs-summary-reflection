//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T59;
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
//public class T59Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999194fa92f3cafd931() {
//
//    // Act, creating object to test constructor
//    final T59 actual = new T59();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void PrintInputNotNullOutput1999e94146f5bd318088() throws InvocationTargetException {
//
//    // Arrange
//    final T59 thisObj = new T59();
//    final TreeNode arg0 = new TreeNode(0);
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