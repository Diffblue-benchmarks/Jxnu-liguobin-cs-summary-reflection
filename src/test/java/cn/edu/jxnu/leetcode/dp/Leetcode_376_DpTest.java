package cn.edu.jxnu.leetcode.dp;

import cn.edu.jxnu.leetcode.dp.Leetcode_376_Dp;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_376_DpTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996984ae4eea360437() {

    // Act, creating object to test constructor
    final Leetcode_376_Dp actual = new Leetcode_376_Dp();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999a078e3c03c5fb865() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Leetcode_376_Dp.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void wiggleMaxLength2Input8OutputPositive999f592c16e7a43e3af() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = Leetcode_376_Dp.wiggleMaxLength2(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void wiggleMaxLengthInput8OutputPositive9994bcf47c4217eaba8() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = Leetcode_376_Dp.wiggleMaxLength(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
