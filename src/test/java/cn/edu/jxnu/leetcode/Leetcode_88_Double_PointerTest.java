package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_88_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_88_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99932c7c87dbc720d3d() {

    // Act, creating object to test constructor
    final Leetcode_88_Double_Pointer actual = new Leetcode_88_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mergeInput8Positive8PositiveOutputVoid9991eb9409543446acb() {

    // Arrange
    final Leetcode_88_Double_Pointer thisObj = new Leetcode_88_Double_Pointer();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int arg1 = 1;
    final int[] arg2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int arg3 = 1;

    // Act
    thisObj.merge(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }
}
