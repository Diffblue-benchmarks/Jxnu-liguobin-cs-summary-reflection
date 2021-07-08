package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.GetNumberOfK_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GetNumberOfK_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990d9ce6525f743554() {

    // Act, creating object to test constructor
    final GetNumberOfK_test actual = new GetNumberOfK_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testGetFirstOutputVoid999a7055477aa1976c8() {

    // Arrange
    final GetNumberOfK_test thisObj = new GetNumberOfK_test();

    // Act
    thisObj.testGetFirst();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testGetLastOutputVoid999e043219cea550729() {

    // Arrange
    final GetNumberOfK_test thisObj = new GetNumberOfK_test();

    // Act
    thisObj.testGetLast();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testGetNumberOfK2OutputVoid999abf5b50ec1c761d4() {

    // Arrange
    final GetNumberOfK_test thisObj = new GetNumberOfK_test();

    // Act
    thisObj.testGetNumberOfK2();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testGetNumberOfKOutputVoid999a24e74e7f1045412() {

    // Arrange
    final GetNumberOfK_test thisObj = new GetNumberOfK_test();

    // Act
    thisObj.testGetNumberOfK();

    // The method returns void, testing that no exception is thrown

  }
}
