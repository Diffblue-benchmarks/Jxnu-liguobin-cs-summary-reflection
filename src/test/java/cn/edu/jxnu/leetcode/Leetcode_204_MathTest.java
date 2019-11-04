package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_204_Math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Leetcode_204_MathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998478bd9140764950() {

    // Act, creating object to test constructor
    final Leetcode_204_Math actual = new Leetcode_204_Math();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void countPrimesInputPositiveOutputZero9991108945a91e8a89f() {

    // Arrange
    final int arg0 = 1;

    // Act
    final int actual = Leetcode_204_Math.countPrimes(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999c81590b6179a6c46() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Leetcode_204_Math.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
