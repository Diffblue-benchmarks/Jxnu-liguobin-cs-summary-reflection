package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.AddMinFunctionForStack3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AddMinFunctionForStack3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99992fca4cc5a6f4556() {

    // Act, creating object to test constructor
    final AddMinFunctionForStack3 actual = new AddMinFunctionForStack3();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void emptyOutputTrue999a12a174209113a47() {

    // Arrange
    final AddMinFunctionForStack3 thisObj = new AddMinFunctionForStack3();

    // Act
    final boolean actual = thisObj.empty();

    // Assert result
    Assert.assertTrue(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void minOutputPositive999da7e4480138a4c6e() {
//
//    // Arrange
//    final AddMinFunctionForStack3 thisObj = new AddMinFunctionForStack3();
//
//    // Act
//    final int actual = thisObj.min();
//
//    // Assert result
//    Assert.assertEquals(2_147_483_647, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void popOutputNullPointerException999fe3145608a077d0e() {

    // Arrange
    final AddMinFunctionForStack3 thisObj = new AddMinFunctionForStack3();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.pop();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void pushInputPositiveOutputVoid999101d0de30b6e56ed() {

    // Arrange
    final AddMinFunctionForStack3 thisObj = new AddMinFunctionForStack3();
    final int arg0 = 1;

    // Act
    thisObj.push(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void topOutputNullPointerException999590a7dc2b8bb177f() {

    // Arrange
    final AddMinFunctionForStack3 thisObj = new AddMinFunctionForStack3();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.top();

    // The method is not expected to return due to exception thrown

  }
}
