package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_91_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_91_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990dd9db4403e12694() {

    // Act, creating object to test constructor
    final Leetcode_91_Dp actual = new Leetcode_91_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9991429d6b526188c84() {

    // Arrange
    final String[] arg0 = { "0", "0", "0" };

    // Act
    Leetcode_91_Dp.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void numDecodingsInputNotNullOutputZero99928749990df5de794() {

    // Arrange
    final String arg0 = "0";

    // Act
    final int actual = Leetcode_91_Dp.numDecodings(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
