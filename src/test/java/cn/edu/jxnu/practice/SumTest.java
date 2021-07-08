package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Sum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SumTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996bf82de5d9fd18f5() {

    // Act, creating object to test constructor
    final Sum actual = new Sum();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Sum_Solution2InputPositiveOutputPositive9997e7d56cb60cefa2a() {

    // Arrange
    final Sum thisObj = new Sum();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.Sum_Solution2(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sum_SolutionInputPositiveOutputPositive999e4d4ab510fd4a068() {

    // Arrange
    final Sum thisObj = new Sum();
    final int arg0 = 1;

    // Act
    final int actual = thisObj.sum_Solution(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
