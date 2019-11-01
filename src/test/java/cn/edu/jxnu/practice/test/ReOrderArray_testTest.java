package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.ReOrderArray_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ReOrderArray_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994250bc3a892122d3() {

    // Act, creating object to test constructor
    final ReOrderArray_test actual = new ReOrderArray_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testReOrderArray2OutputVoid9992fb9fafa17bd6528() {

    // Arrange
    final ReOrderArray_test thisObj = new ReOrderArray_test();

    // Act
    thisObj.testReOrderArray2();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testReOrderArray3OutputVoid999864271848c94b4bc() {

    // Arrange
    final ReOrderArray_test thisObj = new ReOrderArray_test();

    // Act
    thisObj.testReOrderArray3();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testReOrderArrayOutputVoid99996e5b70d34580e37() {

    // Arrange
    final ReOrderArray_test thisObj = new ReOrderArray_test();

    // Act
    thisObj.testReOrderArray();

    // The method returns void, testing that no exception is thrown

  }
}
