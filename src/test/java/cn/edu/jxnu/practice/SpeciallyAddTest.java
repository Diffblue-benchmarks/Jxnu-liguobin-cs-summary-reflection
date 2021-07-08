package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.SpeciallyAdd;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SpeciallyAddTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void Add2InputPositivePositiveOutputPositive999a54bbc07eec71b9d() {

    // Arrange
    final SpeciallyAdd thisObj = new SpeciallyAdd();
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = thisObj.Add2(arg0, arg1);

    // Assert result
    Assert.assertEquals(2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addInputPositivePositiveOutputPositive99977690b52eab90f4d() {

    // Arrange
    final SpeciallyAdd thisObj = new SpeciallyAdd();
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = thisObj.add(arg0, arg1);

    // Assert result
    Assert.assertEquals(2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e6cc759beb16bff1() {

    // Act, creating object to test constructor
    final SpeciallyAdd actual = new SpeciallyAdd();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
