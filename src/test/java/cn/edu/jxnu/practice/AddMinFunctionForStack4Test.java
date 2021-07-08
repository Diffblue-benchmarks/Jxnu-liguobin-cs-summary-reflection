package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.AddMinFunctionForStack4;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AddMinFunctionForStack4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d4dec0a898e913cd() {

    // Act, creating object to test constructor
    final AddMinFunctionForStack4 actual = new AddMinFunctionForStack4();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minOutputIndexOutOfBoundsException999171aaa4a2473df80() {

    // Arrange
    final AddMinFunctionForStack4 thisObj = new AddMinFunctionForStack4();

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.min();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void popOutputIndexOutOfBoundsException9994fa99332adc59778() {

    // Arrange
    final AddMinFunctionForStack4 thisObj = new AddMinFunctionForStack4();

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.pop();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void pushInputZeroOutputVoid999f6cb9e2a6d4a3425() {

    // Arrange
    final AddMinFunctionForStack4 thisObj = new AddMinFunctionForStack4();
    final int arg0 = 0;

    // Act
    thisObj.push(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void topOutputIndexOutOfBoundsException9999d835408d07fad8a() {

    // Arrange
    final AddMinFunctionForStack4 thisObj = new AddMinFunctionForStack4();

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    thisObj.top();

    // The method is not expected to return due to exception thrown

  }
}
