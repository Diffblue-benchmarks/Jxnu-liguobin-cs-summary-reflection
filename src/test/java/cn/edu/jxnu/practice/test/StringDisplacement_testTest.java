package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.StringDisplacement_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StringDisplacement_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b80f33f82002f600() {

    // Act, creating object to test constructor
    final StringDisplacement_test actual = new StringDisplacement_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void stringDisplacementOutputVoid999d7263f443c0ba04d() {

    // Arrange
    final StringDisplacement_test thisObj = new StringDisplacement_test();

    // Act
    thisObj.stringDisplacement();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testStringDisplacement2OutputVoid999f039b542a31657f3() {

    // Arrange
    final StringDisplacement_test thisObj = new StringDisplacement_test();

    // Act
    thisObj.testStringDisplacement2();

    // The method returns void, testing that no exception is thrown

  }
}
