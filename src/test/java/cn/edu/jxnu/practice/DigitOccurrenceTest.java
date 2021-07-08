package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.DigitOccurrence;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DigitOccurrenceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a443fe41edda42d6() {

    // Act, creating object to test constructor
    final DigitOccurrence actual = new DigitOccurrence();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findDigitOccurrenceInputZeroZeroOutputPositive999f75d28e7054ec281() {

    // Arrange
    final DigitOccurrence thisObj = new DigitOccurrence();
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    final int actual = thisObj.findDigitOccurrence(arg0, arg1);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
