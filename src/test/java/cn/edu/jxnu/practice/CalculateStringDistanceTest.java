package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.CalculateStringDistance;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CalculateStringDistanceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void calculateStringDistanceInputNotNullPositivePositiveNotNullPositivePositiveOutputZero9997ed1f7694185cd6d() {

    // Arrange
    final CalculateStringDistance thisObj = new CalculateStringDistance();
    final String arg0 = "abcdef";
    final int arg1 = 1;
    final int arg2 = 1;
    final String arg3 = "abcdef";
    final int arg4 = 1;
    final int arg5 = 1;

    // Act
    final int actual = thisObj.calculateStringDistance(arg0, arg1, arg2, arg3, arg4, arg5);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995ccf7b9a8bf0f162() {

    // Act, creating object to test constructor
    final CalculateStringDistance actual = new CalculateStringDistance();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9996f20b0ea27276b01() {

    // Arrange
    final String[] arg0 = { "abcdef", "abcdef", "abcdef" };

    // Act
    CalculateStringDistance.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
