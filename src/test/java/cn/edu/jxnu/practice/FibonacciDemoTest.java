package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FibonacciDemo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FibonacciDemoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99988734e3fc203bdd6() {

    // Act, creating object to test constructor
    final FibonacciDemo actual = new FibonacciDemo();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Fibonacci2InputZeroOutputZero9991f7c70113e0be7db() throws Exception {

    // Arrange
    final FibonacciDemo thisObj = new FibonacciDemo();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.Fibonacci2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Fibonacci3InputZeroOutputZero999bc07d6a1070f9520() {

    // Arrange
    final FibonacciDemo thisObj = new FibonacciDemo();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.Fibonacci3(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Fibonacci4InputZeroOutputZero999b968b0f60e771683() {

    // Arrange
    final FibonacciDemo thisObj = new FibonacciDemo();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.Fibonacci4(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void FibonacciInputZeroOutputZero999ff90fe213f96a668() throws Exception {

    // Arrange
    final FibonacciDemo thisObj = new FibonacciDemo();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.Fibonacci(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
