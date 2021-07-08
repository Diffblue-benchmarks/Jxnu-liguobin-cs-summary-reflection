package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.UpdateBits;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UpdateBitsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fdc54f558b7bf41c() {

    // Act, creating object to test constructor
    final UpdateBits actual = new UpdateBits();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void updateBitsInputNegativeNegativeNegativeNegativeOutputNegative9999aa0a271a52fc07b() {

    // Arrange
    final UpdateBits thisObj = new UpdateBits();
    final int arg0 = -1;
    final int arg1 = -1;
    final int arg2 = -1;
    final int arg3 = -1;

    // Act
    final int actual = thisObj.updateBits(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
