package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Main1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99987045585f30b8c69() {

    // Act, creating object to test constructor
    final Main1 actual = new Main1();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseCharArrayInput8PositivePositiveOutputNumberFormatException999251e8e39aba468f2() {

    // Arrange
    final Main1 thisObj = new Main1();
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 1;
    final int arg2 = 1;

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.reverseCharArray(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
