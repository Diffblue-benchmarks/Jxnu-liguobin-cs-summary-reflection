package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.DifferentNumberOfBinaryBits_Java_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DifferentNumberOfBinaryBits_Java_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c892de3648b10bd3() {

    // Act, creating object to test constructor
    final DifferentNumberOfBinaryBits_Java_test actual = new DifferentNumberOfBinaryBits_Java_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testBitSwapRequiredOutputVoid99926481b670551774e() {

    // Arrange
    final DifferentNumberOfBinaryBits_Java_test thisObj = new DifferentNumberOfBinaryBits_Java_test();

    // Act
    thisObj.testBitSwapRequired();

    // The method returns void, testing that no exception is thrown

  }
}
