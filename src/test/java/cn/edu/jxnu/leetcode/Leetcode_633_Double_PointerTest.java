package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_633_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_633_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999e15c3f2b7c335a0() {

    // Act, creating object to test constructor
    final Leetcode_633_Double_Pointer actual = new Leetcode_633_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void judgeSquareSumInputPositiveOutputTrue999cb3691ce82733d0a() {

    // Arrange
    final Leetcode_633_Double_Pointer thisObj = new Leetcode_633_Double_Pointer();
    final int arg0 = 1;

    // Act
    final boolean actual = thisObj.judgeSquareSum(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
