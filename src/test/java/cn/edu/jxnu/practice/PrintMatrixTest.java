package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.PrintMatrix;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;



public class PrintMatrixTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995ae99ed316824ec0() {

    // Act, creating object to test constructor
    final PrintMatrix actual = new PrintMatrix();

    // Assert result
    Assert.assertNotNull(actual);

  }

//  // Test written by Diffblue Cover
//  @Test
//  public void printMatrix2Input3Output24999887ddf3ba80dd81a() throws InvocationTargetException {
//
//    // Arrange
//    final int[] myIntArray = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray1 = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray2 = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//
//    // Act
//    final ArrayList<Integer> actual = PrintMatrix.printMatrix2(arg0);
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
//  public void printMatrixInput3Output2499964dd88f0cc8ce35e() throws InvocationTargetException {
//
//    // Arrange
//    final PrintMatrix thisObj = new PrintMatrix();
//    final int[] myIntArray = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray1 = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray2 = { -1, -1, -1, -1, -1, -1, -1, -1 };
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
//  public void showInput3NegativeOutputVoid9991b4ac4c0c6ec5d63() {
//
//    // Arrange
//    final PrintMatrix thisObj = new PrintMatrix();
//    final int[] myIntArray = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray1 = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] myIntArray2 = { -1, -1, -1, -1, -1, -1, -1, -1 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//    final int arg1 = -1;
//
//    // Act
//    thisObj.show(arg0, arg1);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void showInputNotNullNegativeOutputVoid999f8b3e76d459225af() {

    // Arrange
    final PrintMatrix thisObj = new PrintMatrix();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaaa");
    final int arg1 = -1;

    // Act
    thisObj.show(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
