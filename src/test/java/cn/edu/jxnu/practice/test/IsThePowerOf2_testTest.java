package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.IsThePowerOf2_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsThePowerOf2_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999adff9ac3bc5d9e3c() {

    // Act, creating object to test constructor
    final IsThePowerOf2_test actual = new IsThePowerOf2_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testPowerOf2OutputVoid999ac74c87f89c49fae() {

    // Arrange
    final IsThePowerOf2_test thisObj = new IsThePowerOf2_test();

    // Act
    thisObj.testPowerOf2();

    // The method returns void, testing that no exception is thrown

  }
}
