package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_209_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_209_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999a89f4488a5691e0() {

    // Act, creating object to test constructor
    final Leetcode_209_Double_Pointer actual = new Leetcode_209_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minSubArrayLenInputZero8OutputNegative9991cb29bea0f0ebe46() {

    // Arrange
    final Leetcode_209_Double_Pointer thisObj = new Leetcode_209_Double_Pointer();
    final int arg0 = 0;
    final int[] arg1 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.minSubArrayLen(arg0, arg1);

    // Assert result
    Assert.assertEquals(-7, actual);

  }
}
