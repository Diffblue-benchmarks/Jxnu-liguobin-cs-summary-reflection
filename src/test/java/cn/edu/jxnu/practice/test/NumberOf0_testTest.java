package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.NumberOf0_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NumberOf0_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a9db87621c1cab3e() {

    // Act, creating object to test constructor
    final NumberOf0_test actual = new NumberOf0_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testNumberOf0_1OutputVoid99945d495fe53ecd1b5() {

    // Arrange
    final NumberOf0_test thisObj = new NumberOf0_test();

    // Act
    thisObj.testNumberOf0_1();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testNumberOf0_2OutputVoid99975cdddd4c19cf3ed() {

    // Arrange
    final NumberOf0_test thisObj = new NumberOf0_test();

    // Act
    thisObj.testNumberOf0_2();

    // The method returns void, testing that no exception is thrown

  }
}
