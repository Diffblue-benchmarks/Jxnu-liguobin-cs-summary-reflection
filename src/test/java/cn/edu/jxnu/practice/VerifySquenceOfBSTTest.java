package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.VerifySquenceOfBST;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class VerifySquenceOfBSTTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999aa004e08b95c3c0d() {

    // Act, creating object to test constructor
    final VerifySquenceOfBST actual = new VerifySquenceOfBST();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void verifySquenceOfBSTInput8OutputTrue99959105615341fbe76() {

    // Arrange
    final VerifySquenceOfBST thisObj = new VerifySquenceOfBST();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.verifySquenceOfBST(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
