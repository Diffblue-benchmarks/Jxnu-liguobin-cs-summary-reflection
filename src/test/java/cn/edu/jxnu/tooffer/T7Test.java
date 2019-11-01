package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T7;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T7Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99963d351aadd203a15() {

    // Act, creating object to test constructor
    final T7 actual = new T7();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Fibonacci2InputZeroOutputZero999c08dacf94f967685() {

    // Arrange
    final T7 thisObj = new T7();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.Fibonacci2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Fibonacci3InputZeroZeroZeroOutputZero999114365328dd72b2a() {

    // Arrange
    final T7 thisObj = new T7();
    final int arg0 = 0;
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    final int actual = thisObj.Fibonacci3(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void FibonacciInputZeroOutputZero999ca75fbcdaec64d60() {

    // Arrange
    final T7 thisObj = new T7();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.Fibonacci(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
