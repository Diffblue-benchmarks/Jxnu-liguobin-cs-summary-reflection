package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.ReOrderArray;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ReOrderArrayTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f7359478bb3892fc() {

    // Act, creating object to test constructor
    final ReOrderArray actual = new ReOrderArray();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isEvenInputZeroOutputTrue999280a5674a790fb64() {

    // Arrange
    final ReOrderArray thisObj = new ReOrderArray();
    final int arg0 = 0;

    // Act
    final boolean actual = thisObj.isEven(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999455e6c64b014412c() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    ReOrderArray.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reOrderArray2Input8OutputVoid9995f860b13261b69d0() {

    // Arrange
    final ReOrderArray thisObj = new ReOrderArray();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thisObj.reOrderArray2(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reOrderArray3Input8OutputVoid99910cfe2482697e907() {

    // Arrange
    final ReOrderArray thisObj = new ReOrderArray();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thisObj.reOrderArray3(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reOrderArrayInput8OutputVoid999e5a112bf531d2e44() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    ReOrderArray.reOrderArray(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
