package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.SortDemo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SortDemoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99983c254ef0e48b870() {

    // Act, creating object to test constructor
    final SortDemo actual = new SortDemo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.bak);
    Assert.assertEquals(0, actual.count);

  }

  // Test written by Diffblue Cover
  @Test
  public void InversePairs2Input8OutputZero9995a0b16d71304f558() {

    // Arrange
    final SortDemo thisObj = new SortDemo();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.InversePairs2(arg0);

    // Assert side effects
    Assert.assertArrayEquals(new int[]{ 0, 0, 0, 0, 0, 0, 0, 0 }, thisObj.bak);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void InversePairsInput8OutputZero9995c16425d61acdfc4() {

    // Arrange
    final SortDemo thisObj = new SortDemo();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.InversePairs(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
