package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.Brackets_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Brackets_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999aad3f469d3917225() {

    // Act, creating object to test constructor
    final Brackets_test actual = new Brackets_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testSolveOutputVoid999337922aba337f90f() {

    // Arrange
    final Brackets_test thisObj = new Brackets_test();

    // Act
    thisObj.testSolve();

    // The method returns void, testing that no exception is thrown

  }
}
