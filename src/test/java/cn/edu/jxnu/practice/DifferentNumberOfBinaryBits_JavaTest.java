package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.DifferentNumberOfBinaryBits_Java;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DifferentNumberOfBinaryBits_JavaTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void bitSwapRequiredInputPositivePositiveOutputZero99949c16311e529d03e() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = DifferentNumberOfBinaryBits_Java.bitSwapRequired(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999569108488ef297ac() {

    // Act, creating object to test constructor
    final DifferentNumberOfBinaryBits_Java actual = new DifferentNumberOfBinaryBits_Java();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
