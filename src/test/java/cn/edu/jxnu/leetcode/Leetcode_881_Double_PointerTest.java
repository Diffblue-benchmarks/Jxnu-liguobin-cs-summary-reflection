package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_881_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_881_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99991ecb1a9c21acefc() {

    // Act, creating object to test constructor
    final Leetcode_881_Double_Pointer actual = new Leetcode_881_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void numRescueBoatsInput8PositiveOutputPositive999a023946d5170577d() {

    // Arrange
    final Leetcode_881_Double_Pointer thisObj = new Leetcode_881_Double_Pointer();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int arg1 = 1;

    // Act
    final int actual = thisObj.numRescueBoats(arg0, arg1);

    // Assert result
    Assert.assertEquals(8, actual);

  }
}
