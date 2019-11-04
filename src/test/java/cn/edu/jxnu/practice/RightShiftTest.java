package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.RightShift;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class RightShiftTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e46e6a2e2c7d139f() {

    // Act, creating object to test constructor
    final RightShift actual = new RightShift();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99963b2840142f7cfee() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    RightShift.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseArrayInput8ZeroZeroOutputVoid9997949c5ae0c1b617f() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    RightShift.reverseArray(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rightShift2Input8ZeroZeroOutputArithmeticException999fe3d3513813bc2b9() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    thrown.expect(ArithmeticException.class);
    RightShift.rightShift2(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rightShift3Input8ZeroZeroOutputArithmeticException9996899d9616d9f0992() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    thrown.expect(ArithmeticException.class);
    RightShift.rightShift3(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void rightShiftInput8ZeroZeroOutputVoid99992e9f2c59e37d4b3() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    RightShift.rightShift(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }
}
