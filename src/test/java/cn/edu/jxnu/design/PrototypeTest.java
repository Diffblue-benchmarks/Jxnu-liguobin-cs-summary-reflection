package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Prototype;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PrototypeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void cloneOutputNotNull99974e722e05d01436d() {

    // Arrange
    final Prototype thisObj = new Prototype();

    // Act
    final Prototype actual = thisObj.clone();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996662cd2927a96541() {

    // Act, creating object to test constructor
    final Prototype actual = new Prototype();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
