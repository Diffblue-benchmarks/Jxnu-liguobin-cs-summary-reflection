package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_27;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_27Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99903667269684b6845() {

    // Act, creating object to test constructor
    final Leetcode_27 actual = new Leetcode_27();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeElementInput8ZeroOutputZero999e2944ee025791f35() {

    // Arrange
    final Leetcode_27 thisObj = new Leetcode_27();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final int actual = thisObj.removeElement(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
