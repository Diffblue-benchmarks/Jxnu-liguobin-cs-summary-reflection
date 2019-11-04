package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.NumberOf1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NumberOf1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999af01767cfbcbb384() {

    // Act, creating object to test constructor
    final NumberOf1 actual = new NumberOf1();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999b42589bc5f6d5c3c() {

    // Arrange
    final String[] arg0 = { "1", "1", "1" };

    // Act
    NumberOf1.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1_1InputZeroOutputZero9999e7d0ecb47c98127() {

    // Arrange
    final NumberOf1 thisObj = new NumberOf1();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.NumberOf1_1(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1_2_lowInputZeroOutputZero999f1ec782cd9f806fa() {

    // Arrange
    final int arg0 = 0;

    // Act
    final int actual = NumberOf1.NumberOf1_2_low(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1_2InputZeroOutputZero999de42358066621de1() {

    // Arrange
    final NumberOf1 thisObj = new NumberOf1();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.NumberOf1_2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
