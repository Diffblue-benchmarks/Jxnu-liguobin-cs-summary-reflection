package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.NumberOf1Between1AndN;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NumberOf1Between1AndNTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999e22671aa8e60646() {

    // Act, creating object to test constructor
    final NumberOf1Between1AndN actual = new NumberOf1Between1AndN();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isExistNumberOutputPositive99942b7dd63bdd0fe2f() {

    // Arrange
    final NumberOf1Between1AndN thisObj = new NumberOf1Between1AndN();

    // Act
    final long actual = thisObj.isExistNumber();

    // Assert result
    Assert.assertEquals(1757L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999e85686b4d22607fb() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    NumberOf1Between1AndN.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1Between1AndN_Solution2InputZeroOutputZero9999fd482c2337a48ff() {

    // Arrange
    final NumberOf1Between1AndN thisObj = new NumberOf1Between1AndN();
    final long arg0 = 0L;

    // Act
    final long actual = thisObj.NumberOf1Between1AndN_Solution2(arg0);

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void NumberOf1Between1AndN_SolutionInputZeroOutputZero9992430ac2ea9975d74() {

    // Arrange
    final NumberOf1Between1AndN thisObj = new NumberOf1Between1AndN();
    final int arg0 = 0;

    // Act
    final int actual = thisObj.NumberOf1Between1AndN_Solution(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
