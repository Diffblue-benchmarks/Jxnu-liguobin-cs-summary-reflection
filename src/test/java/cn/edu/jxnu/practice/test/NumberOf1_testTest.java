package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.NumberOf1_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NumberOf1_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999babcf73125fce4e3() {

    // Act, creating object to test constructor
    final NumberOf1_test actual = new NumberOf1_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1_2_lowOutputVoid999633e699012357033() {

    // Arrange
    final NumberOf1_test thisObj = new NumberOf1_test();

    // Act
    thisObj.NumberOf1_2_low();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1_2OutputVoid999ab9939f803704c16() {

    // Arrange
    final NumberOf1_test thisObj = new NumberOf1_test();

    // Act
    thisObj.NumberOf1_2();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testNumberOf1_1OutputVoid999e44718e75663355d() {

    // Arrange
    final NumberOf1_test thisObj = new NumberOf1_test();

    // Act
    thisObj.testNumberOf1_1();

    // The method returns void, testing that no exception is thrown

  }
}
