package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_139_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class Leetcode_139_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99912f288211afaaaad() {

    // Act, creating object to test constructor
    final Leetcode_139_Dp actual = new Leetcode_139_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void workBreakInputNotNullNotNullOutputFalse999ce7899dd59b41331() {

    // Arrange
    final Leetcode_139_Dp thisObj = new Leetcode_139_Dp();
    final String arg0 = "aaaaa";
    final ArrayList<String> arg1 = new ArrayList<String>();
    arg1.add("aaaaa");

    // Act
    final boolean actual = thisObj.workBreak(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }
}
