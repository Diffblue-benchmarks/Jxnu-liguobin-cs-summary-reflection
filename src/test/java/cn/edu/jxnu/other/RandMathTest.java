package cn.edu.jxnu.other;

import cn.edu.jxnu.other.RandMath;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class RandMathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99916674da172b80035() {

    // Act, creating object to test constructor
    final RandMath actual = new RandMath();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException99904e20b46f11cb15b() {
//
//    // Arrange
//    final String[] arg0 = { "1", "1", "1" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    RandMath.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
