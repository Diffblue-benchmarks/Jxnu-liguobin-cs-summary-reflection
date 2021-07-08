package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Duplicate;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DuplicateTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f75a7be9bff3775d() {

    // Act, creating object to test constructor
    final Duplicate actual = new Duplicate();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void duplicate2Input8Zero8OutputFalse999a4d108bbf110af34() {

    // Arrange
    final Duplicate thisObj = new Duplicate();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int[] arg2 = { 0, 0, 4, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.duplicate2(arg0, arg1, arg2);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void duplicateInput8Zero8OutputFalse999f8783d5aeed74367() {

    // Arrange
    final Duplicate thisObj = new Duplicate();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;
    final int[] arg2 = { 0, 0, 4, 0, 0, 0, 0, 0 };

    // Act
    final boolean actual = thisObj.duplicate(arg0, arg1, arg2);

    // Assert result
    Assert.assertFalse(actual);

  }
}
