package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.PalindromeArray;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;



public class PalindromeArrayTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99945e527515dd6c20c() {

    // Act, creating object to test constructor
    final PalindromeArray actual = new PalindromeArray();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9996d2bfb78e6740957() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    PalindromeArray.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void palindromeArrayHelperInput83ZeroZeroOutputZero999245a740056b9786e() throws InvocationTargetException {
//
//    // Arrange
//    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    final Integer integer1 = (Integer) Reflector.getInstance("java.lang.Integer");
//    final Integer integer2 = (Integer) Reflector.getInstance("java.lang.Integer");
//    final Integer[] integerArray = { integer, integer1, integer2 };
//    final Integer[] integerArray1 = { integer1, integer2, integer };
//    final Integer[] integerArray2 = { integer2, integer, integer1 };
//    final Integer[] arg1 = { integerArray, integerArray1, integerArray2 };
//    final int arg2 = 0;
//    final int arg3 = 0;
//
//    // Act
//    final int actual = PalindromeArray.palindromeArrayHelper(arg0, arg1, arg2, arg3);
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
}
