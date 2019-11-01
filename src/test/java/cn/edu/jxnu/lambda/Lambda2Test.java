//package cn.edu.jxnu.lambda;
//
//import cn.edu.jxnu.lambda.Lambda2.Fibonacci;
//import cn.edu.jxnu.lambda.Lambda2;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.stream.IntStream;
//
//
//
//public class Lambda2Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9991f509eb3f97687e5() {
//
//    // Act, creating object to test constructor
//    final Fibonacci actual = new Fibonacci();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void fibonacciInputPositiveOutputPositive999442e1fbfb50611f8() {
//
//    // Arrange
//    final Fibonacci thisObj = new Fibonacci();
//    final int arg0 = 1;
//
//    // Act
//    final long actual = thisObj.fibonacci(arg0);
//
//    // Assert result
//    Assert.assertEquals(1L, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999c656d2a4e44acfda() {
//
//    // Act, creating object to test constructor
//    final Lambda2 actual = new Lambda2();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void fastSumOfSquaresOutputZero9990c49445070833759() {
//
//    // Arrange
//    final Lambda2 thisObj = new Lambda2();
//
//    // Act
//    final int actual = thisObj.fastSumOfSquares();
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void intermediateSumOfSquaresOutputZero999e04a8fbe0251dca7() {
//
//    // Arrange
//    final Lambda2 thisObj = new Lambda2();
//
//    // Act
//    final int actual = thisObj.intermediateSumOfSquares();
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void multiplyThroughInputNotNullOutputPositive999acfded2eff83f867() {
//
//    // Arrange
//    final ArrayList<Integer> arg0 = new ArrayList<Integer>();
//    final Integer integer = new Integer(1);
//    arg0.add(integer);
//
//    // Act
//    final int actual = Lambda2.multiplyThrough(arg0);
//
//    // Assert result
//    Assert.assertEquals(5, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void serialFastSumOfSquaresOutputZero999b15da72aa6fe8f5a() {
//
//    // Arrange
//    final Lambda2 thisObj = new Lambda2();
//
//    // Act
//    final int actual = thisObj.serialFastSumOfSquares();
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void serialSlowSumOfSquaresOutputZero999e8a001f7f286be1e() {
//
//    // Arrange
//    final Lambda2 thisObj = new Lambda2();
//
//    // Act
//    final int actual = thisObj.serialSlowSumOfSquares();
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void sumOfSquaresInputNullOutputNullPointerException999d3874545e0d23ae8() {
//
//    // Arrange
//    final IntStream arg0 = null;
//
//    // Act
//    thrown.expect(NullPointerException.class);
//    Lambda2.sumOfSquares(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void TestOutputVoid999072f85529c94233f() {
//
//    // Arrange
//    final Lambda2 thisObj = new Lambda2();
//
//    // Act
//    thisObj.Test();
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//