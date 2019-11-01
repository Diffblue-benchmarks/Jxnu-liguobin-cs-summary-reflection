package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T35;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T35Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999e081f0eb0e8283c() {

    // Act, creating object to test constructor
    final T35 actual = new T35();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.cnt);

  }

  // Test written by Diffblue Cover
  @Test
  public void InversePairsInput8OutputZero999b2b13a92bb64873b() {

    // Arrange
    final T35 thisObj = new T35();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.InversePairs(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mergeSortUp2DownInput8ZeroZeroOutputVoid9999413dba3425dfd9c() {

    // Arrange
    final T35 thisObj = new T35();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    thisObj.mergeSortUp2Down(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mergeInput8ZeroZeroZeroOutputVoid99910aa584cbb8f5577() {

    // Arrange
    final T35 thisObj = new T35();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int arg2 = 0;
    final int arg3 = 0;

    // Act
    thisObj.merge(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }
}
