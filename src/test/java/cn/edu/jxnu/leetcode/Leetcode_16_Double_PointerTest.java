package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_16_Double_Pointer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_16_Double_PointerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b24e876c45972665() {

    // Act, creating object to test constructor
    final Leetcode_16_Double_Pointer actual = new Leetcode_16_Double_Pointer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void threeSumClosestInput8ZeroOutputZero9996d9bd91a944b257a() {

    // Arrange
    final Leetcode_16_Double_Pointer thisObj = new Leetcode_16_Double_Pointer();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final int actual = thisObj.threeSumClosest(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
