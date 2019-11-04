package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain8;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class TestMain8Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void add2InputNotNullNotNullOutputNotNull999fb1081d87417d5b7() {

    // Arrange
    final String arg0 = "";
    final String arg1 = "";

    // Act
    final String actual = TestMain8.add2(arg0, arg1);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ebb0b50f57249429() {

    // Act, creating object to test constructor
    final TestMain8 actual = new TestMain8();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException99913867c0e47e120b0() {
//
//    // Arrange
//    final String[] arg0 = { "", "", "" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    TestMain8.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
