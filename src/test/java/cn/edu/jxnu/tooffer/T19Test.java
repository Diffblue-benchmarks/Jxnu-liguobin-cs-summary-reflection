//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T19;
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
//public class T19Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999751b1e1169b3b305() {
//
//    // Act, creating object to test constructor
//    final T19 actual = new T19();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void printMatrix2Input3Output249999c7f562ba8d922f0() throws InvocationTargetException {
//
//    // Arrange
//    final T19 thisObj = new T19();
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.printMatrix2(arg0);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    Assert.assertEquals(arrayList, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void printMatrixInput3Output249998dbcc00508555d17() throws InvocationTargetException {
//
//    // Arrange
//    final T19 thisObj = new T19();
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//
//    // Act
//    final ArrayList<Integer> actual = thisObj.printMatrix(arg0);
//
//    // Assert result
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    arrayList.add(integer);
//    Assert.assertEquals(arrayList, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void printInput3ZeroZeroZeroZeroNotNullOutputVoid999e355d21b5b9e011a() throws InvocationTargetException {
//
//    // Arrange
//    final T19 thisObj = new T19();
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//    final int arg1 = 0;
//    final int arg2 = 0;
//    final int arg3 = 0;
//    final int arg4 = 0;
//    final ArrayList<Integer> arg5 = new ArrayList<Integer>();
//    final Integer integer = new Integer(0);
//    arg5.add(integer);
//
//    // Act
//    thisObj.print(arg0, arg1, arg2, arg3, arg4, arg5);
//
//    // Assert side effects
//    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer1);
//    final Integer integer2 = (Integer) Reflector.getInstance("java.lang.Integer");
//    arrayList.add(integer2);
//    Assert.assertEquals(arrayList, arg5);
//
//  }
//}
//