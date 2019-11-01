package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.BinarySearch;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BinarySearchTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995da4480c8d377692() {

    // Act, creating object to test constructor
    final BinarySearch actual = new BinarySearch();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void searchInputPositive8OutputPositive9998a56b7227a8edaa7() {

    // Arrange
    final BinarySearch thisObj = new BinarySearch();
    final int arg0 = 1;
    final int[] arg1 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final int actual = thisObj.search(arg0, arg1);

    // Assert result
    Assert.assertEquals(3, actual);

  }
}
