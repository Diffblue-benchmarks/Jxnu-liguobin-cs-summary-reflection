package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_455;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_455Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999659e8c1acad64922() {

    // Act, creating object to test constructor
    final Leetcode_455 actual = new Leetcode_455();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findContentChildrenInput88OutputPositive999ca507bbf056e12f9() {

    // Arrange
    final Leetcode_455 thisObj = new Leetcode_455();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int[] arg1 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.findContentChildren(arg0, arg1);

    // Assert result
    Assert.assertEquals(8, actual);

  }
}
