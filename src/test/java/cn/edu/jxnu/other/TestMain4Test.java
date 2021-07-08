package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain4;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class TestMain4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e68bdf843cd3f129() {

    // Act, creating object to test constructor
    final TestMain4 actual = new TestMain4();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999c63bdd5554cc4a4f() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    TestMain4.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
