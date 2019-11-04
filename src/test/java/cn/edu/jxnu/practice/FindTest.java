package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Find;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class FindTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99924cc5e82fd00d32b() {

    // Act, creating object to test constructor
    final Find actual = new Find();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void Find2Input3ZeroOutputTrue99997bf9035e05ddc05() {
//
//    // Arrange
//    final Find thisObj = new Find();
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//    final int arg1 = 0;
//
//    // Act
//    final boolean actual = thisObj.Find2(arg0, arg1);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void findInput3ZeroOutputTrue99947e45cdd3f043e68() {
//
//    // Arrange
//    final int[] myIntArray = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] myIntArray2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final int[] arg0 = { myIntArray, myIntArray1, myIntArray2 };
//    final int arg1 = 0;
//
//    // Act
//    final boolean actual = Find.find(arg0, arg1);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999b710a1fb3719b677() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Find.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
