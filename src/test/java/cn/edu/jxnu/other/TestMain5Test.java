package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain5;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class TestMain5Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d0b7f73508367118() {

    // Act, creating object to test constructor
    final TestMain5 actual = new TestMain5();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void jumpInput8OutputPositive9990997f99e044d6ebb() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = TestMain5.jump(arg0);

    // Assert result
    Assert.assertEquals(7, actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException99994efc9b415d6e2e9() {
//
//    // Arrange
//    final String[] arg0 = { ",", ",", "," };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    TestMain5.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
