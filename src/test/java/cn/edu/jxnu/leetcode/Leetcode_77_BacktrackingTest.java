//package cn.edu.jxnu.leetcode;
//
//import cn.edu.jxnu.leetcode.Leetcode_77_Backtracking;
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
//import java.util.List;
//
//
//
//public class Leetcode_77_BacktrackingTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void combineInputPositivePositiveOutput199980b71bbb2aae7360() throws InvocationTargetException {
//
//    // Arrange
//    final Leetcode_77_Backtracking thisObj = new Leetcode_77_Backtracking();
//    final int arg0 = 1;
//    final int arg1 = 1;
//
//    // Act
//    final List<List<Integer>> actual = thisObj.combine(arg0, arg1);
//
//    // Assert result
//    final ArrayList<List<Integer>> arrayList = new ArrayList<List<Integer>>();
//    final ArrayList arrayList1 = new ArrayList();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList1.add(integer);
//    arrayList.add(arrayList1);
//    Assert.assertEquals(arrayList, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99953a6c13ec001327b() {
//
//    // Act, creating object to test constructor
//    final Leetcode_77_Backtracking actual = new Leetcode_77_Backtracking();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//}
//