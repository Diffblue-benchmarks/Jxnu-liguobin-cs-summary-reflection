package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main4;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999399cd7f3bdfb4316() {

    // Act, creating object to test constructor
    final Main4 actual = new Main4();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isRightInput8OutputTrue999c6f0ee49eb57012c() {

    // Arrange
    final Main4 thisObj = new Main4();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.isRight(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
