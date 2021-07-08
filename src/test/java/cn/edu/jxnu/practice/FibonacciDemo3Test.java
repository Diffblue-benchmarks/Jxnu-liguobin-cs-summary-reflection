package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FibonacciDemo3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FibonacciDemo3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999841793c86dfc0a9d() {

    // Act, creating object to test constructor
    final FibonacciDemo3 actual = new FibonacciDemo3();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void JumpFloorII2InputNegativeOutputNegative999f46922ad009351de() {

    // Arrange
    final FibonacciDemo3 thisObj = new FibonacciDemo3();
    final int arg0 = -1;

    // Act
    final int actual = thisObj.JumpFloorII2(arg0);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void jumpFloorIIInputNegativeOutputPositive9990249a1704117432a() {
//
//    // Arrange
//    final FibonacciDemo3 thisObj = new FibonacciDemo3();
//    final int arg0 = -1;
//
//    // Act
//    final int actual = thisObj.jumpFloorII(arg0);
//
//    // Assert result
//    Assert.assertEquals(1_073_741_824, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void jumpFloorInputNegativeOutputZero999c821823acfd726e6() {

    // Arrange
    final FibonacciDemo3 thisObj = new FibonacciDemo3();
    final int arg0 = -1;

    // Act
    final int actual = thisObj.jumpFloor(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void umpFloorInputNegativeOutputNegative99913943208c8090932() {

    // Arrange
    final FibonacciDemo3 thisObj = new FibonacciDemo3();
    final int arg0 = -1;

    // Act
    final int actual = thisObj.umpFloor(arg0);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
