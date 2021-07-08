package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main0;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main0Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f727ba1334f25395() {

    // Act, creating object to test constructor
    final Main0 actual = new Main0();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputPositiveOutputNotNull999899686b6df0cb808() {

    // Arrange
    final Main0 thisObj = new Main0();
    final int arg0 = 1;

    // Act
    final String actual = thisObj.get(arg0);

    // Assert result
    Assert.assertEquals("1", actual);

  }
}
