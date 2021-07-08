package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_28;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_28Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999795a232bad3cef2b() {

    // Act, creating object to test constructor
    final Leetcode_28 actual = new Leetcode_28();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void strStr2InputNotNullNotNullOutputNotNull9994f19a70fc0dc790c() {

    // Arrange
    final Leetcode_28 thisObj = new Leetcode_28();
    final String arg0 = "";
    final String arg1 = "";

    // Act
    final String actual = thisObj.strStr2(arg0, arg1);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void strStr3InputNotNullNotNullOutputZero9994aa446c98e45b9fa() {

    // Arrange
    final Leetcode_28 thisObj = new Leetcode_28();
    final String arg0 = "";
    final String arg1 = "";

    // Act
    final int actual = thisObj.strStr3(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void strStrInputNotNullNotNullOutputZero99997d97763f4e7d8fa() {

    // Arrange
    final Leetcode_28 thisObj = new Leetcode_28();
    final String arg0 = "";
    final String arg1 = "";

    // Act
    final int actual = thisObj.strStr(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
