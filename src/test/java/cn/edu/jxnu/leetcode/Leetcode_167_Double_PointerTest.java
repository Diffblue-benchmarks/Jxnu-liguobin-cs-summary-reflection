package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_167_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_167_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99904fa3b9f627c1f68() {

    // Act, creating object to test constructor
    final Leetcode_167_Double_Pointer actual = new Leetcode_167_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void twoSumInput8PositiveOutputVoid9996a2d762c50760e04() {

    // Arrange
    final Leetcode_167_Double_Pointer thisObj = new Leetcode_167_Double_Pointer();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int arg1 = 1;

    // Act
    final int[] actual = thisObj.twoSum(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
