package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_26_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_26_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d397319d4ce3e7ba() {

    // Act, creating object to test constructor
    final Leetcode_26_Double_Pointer actual = new Leetcode_26_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeDuplicatesInput8OutputPositive99990e22fb622f3c2aa() {

    // Arrange
    final Leetcode_26_Double_Pointer thisObj = new Leetcode_26_Double_Pointer();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.removeDuplicates(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
