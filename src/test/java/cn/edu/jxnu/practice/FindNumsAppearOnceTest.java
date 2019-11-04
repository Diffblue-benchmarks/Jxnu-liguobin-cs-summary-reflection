package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FindNumsAppearOnce;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FindNumsAppearOnceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990571e7e711c45f8f() {

    // Act, creating object to test constructor
    final FindNumsAppearOnce actual = new FindNumsAppearOnce();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findNumsAppearOnceInput888OutputVoid9993a5da518332313f4() {

    // Arrange
    final FindNumsAppearOnce thisObj = new FindNumsAppearOnce();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int[] arg1 = { 0, 0, 0, 7, 0, 0, 0, 0 };
    final int[] arg2 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thisObj.findNumsAppearOnce(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99924f86ab4b8e1594b() {

    // Arrange
    final String[] arg0 = { " ", " ", " " };

    // Act
    FindNumsAppearOnce.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
