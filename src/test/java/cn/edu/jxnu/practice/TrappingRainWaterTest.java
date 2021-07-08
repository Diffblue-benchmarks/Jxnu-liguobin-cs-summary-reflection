package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.TrappingRainWater;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TrappingRainWaterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bb365d1e5f1dc30e() {

    // Act, creating object to test constructor
    final TrappingRainWater actual = new TrappingRainWater();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void trapRainWater2Input8OutputZero9992246bf03059844dc() {

    // Arrange
    final TrappingRainWater thisObj = new TrappingRainWater();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.trapRainWater2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void trapRainWaterInput8OutputZero999f76a135dd3d60477() {

    // Arrange
    final TrappingRainWater thisObj = new TrappingRainWater();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.trapRainWater(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
