package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.ArraySet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class ArraySetTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addInputZeroOutputVoid9990e2cabf433f94095() {

    // Arrange
    final ArraySet thisObj = new ArraySet();
    final int arg0 = 0;

    // Act
    thisObj.add(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999366d47c6c7e1158b() {

    // Act, creating object to test constructor
    final ArraySet actual = new ArraySet();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void containsInputZeroOutputFalse9994f9ae4074de1793c() {

    // Arrange
    final ArraySet thisObj = new ArraySet();
    final int arg0 = 0;

    // Act
    final boolean actual = thisObj.contains(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputZeroOutputVoid9994d5d7408185ec316() {

    // Arrange
    final ArraySet thisObj = new ArraySet();
    final int arg0 = 0;

    // Act
    thisObj.remove(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
