package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.SearchMinInArray;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SearchMinInArrayTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999706b869c9bdd81d9() {

    // Act, creating object to test constructor
    final SearchMinInArray actual = new SearchMinInArray();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minNumberInRotateArray2Input8OutputZero999969acaa068551699() {

    // Arrange
    final SearchMinInArray thisObj = new SearchMinInArray();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.minNumberInRotateArray2(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void minNumberInRotateArrayInput8OutputZero9997f30cf6c6941176c() {

    // Arrange
    final SearchMinInArray thisObj = new SearchMinInArray();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.minNumberInRotateArray(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
