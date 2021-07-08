package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.RightShift_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class RightShift_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991eb52d626c3c0ee7() {

    // Act, creating object to test constructor
    final RightShift_test actual = new RightShift_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseArrayOutputVoid99920c4bd89a1f3249d() {

    // Arrange
    final RightShift_test thisObj = new RightShift_test();

    // Act
    thisObj.reverseArray();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testRightShift2OutputVoid999e885bafa1bf3aa4e() {

    // Arrange
    final RightShift_test thisObj = new RightShift_test();

    // Act
    thisObj.testRightShift2();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testRightShift3OutputVoid999c848489babc5fa78() {

    // Arrange
    final RightShift_test thisObj = new RightShift_test();

    // Act
    thisObj.testRightShift3();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testRightShiftOutputVoid99911a0dc3c151b36cb() {

    // Arrange
    final RightShift_test thisObj = new RightShift_test();

    // Act
    thisObj.testRightShift();

    // The method returns void, testing that no exception is thrown

  }
}
