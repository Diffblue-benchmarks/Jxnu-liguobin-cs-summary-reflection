package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_713_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_713_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c912517909f26779() {

    // Act, creating object to test constructor
    final Leetcode_713_Double_Pointer actual = new Leetcode_713_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void numSubarrayProductLessThanKInput8ZeroOutputArithmeticException9998dc58e58c29162db() {

    // Arrange
    final Leetcode_713_Double_Pointer thisObj = new Leetcode_713_Double_Pointer();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    thrown.expect(ArithmeticException.class);
    thisObj.numSubarrayProductLessThanK(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
