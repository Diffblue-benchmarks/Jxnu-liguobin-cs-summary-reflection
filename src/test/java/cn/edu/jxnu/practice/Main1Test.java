package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;



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

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException9994b9aa0fc8dae997b() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    Main1.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

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
