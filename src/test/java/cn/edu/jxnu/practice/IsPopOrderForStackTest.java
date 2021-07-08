package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.IsPopOrderForStack;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsPopOrderForStackTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999c4bc88cfb0a74d1() {

    // Act, creating object to test constructor
    final IsPopOrderForStack actual = new IsPopOrderForStack();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isPopOrderInput88OutputTrue9995a4bb727a3a8ae6e() {

    // Arrange
    final IsPopOrderForStack thisObj = new IsPopOrderForStack();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int[] arg1 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.isPopOrder(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
