package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class T1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998f230c07d3b0983a() {

    // Act, creating object to test constructor
    final T1 actual = new T1();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void FindInputZero3OutputTrue999da195c7190dbfb7f() {
//
//    // Arrange
//    final int arg0 = 0;
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg1 = { myIntArray, myIntArray1, myIntArray2 };
//
//    // Act
//    final boolean actual = T1.Find(arg0, arg1);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999be11772ca7bd7e4f() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    T1.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
