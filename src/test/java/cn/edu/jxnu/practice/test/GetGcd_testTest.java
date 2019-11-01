package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.GetGcd_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GetGcd_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994f44c6542db83eff() {

    // Act, creating object to test constructor
    final GetGcd_test actual = new GetGcd_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testGcd2OutputVoid9999ce88f09e109511f() {

    // Arrange
    final GetGcd_test thisObj = new GetGcd_test();

    // Act
    thisObj.testGcd2();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testGcd3OutputVoid999b5aa6aff31e31c0a() {

    // Arrange
    final GetGcd_test thisObj = new GetGcd_test();

    // Act
    thisObj.testGcd3();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testGcdOutputVoid999a9acd488165021eb() {

    // Arrange
    final GetGcd_test thisObj = new GetGcd_test();

    // Act
    thisObj.testGcd();

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testLcmOutputVoid999a893b8666850a14a() {
//
//    // Arrange
//    final GetGcd_test thisObj = new GetGcd_test();
//
//    // Act
//    thisObj.testLcm();
//
//    // The method returns void, testing that no exception is thrown
//
//  }
}
