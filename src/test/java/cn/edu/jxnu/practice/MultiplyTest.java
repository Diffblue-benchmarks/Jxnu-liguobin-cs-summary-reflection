package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Multiply;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class MultiplyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999f1c0106aab12237() {

    // Act, creating object to test constructor
    final Multiply actual = new Multiply();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void multiplyInput8Output8999f094e4c73de4c6a9() {

    // Arrange
    final Multiply thisObj = new Multiply();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int[] actual = thisObj.multiply(arg0);

    // Assert result
    Assert.assertArrayEquals(new int[]{ 1, 1, 1, 1, 1, 1, 1, 1 }, actual);

  }
}
