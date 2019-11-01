package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FindPath;
import cn.edu.jxnu.practice.TreeNode;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;



public class FindPathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997be083cfd636e524() {

    // Act, creating object to test constructor
    final FindPath actual = new FindPath();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void FindPath2InputNotNullPositiveOutput1999998ef25284959be6() throws InvocationTargetException {
//
//    // Arrange
//    final FindPath thisObj = new FindPath();
//    final TreeNode arg0 = new TreeNode(1);
//    final int arg1 = 1;
//
//    // Act
//    final ArrayList<ArrayList<Integer>> actual = thisObj.FindPath2(arg0, arg1);
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

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void findPathInputNotNullPositiveOutput199911f032527791ddcf() throws InvocationTargetException {
//
//    // Arrange
//    final FindPath thisObj = new FindPath();
//    final TreeNode arg0 = new TreeNode(1);
//    final int arg1 = 1;
//
//    // Act
//    final ArrayList<ArrayList<Integer>> actual = thisObj.findPath(arg0, arg1);
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
}
