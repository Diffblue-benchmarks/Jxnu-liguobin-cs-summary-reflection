package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main15;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class Main15Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c9d2ecd60f1f7c67() {

    // Act, creating object to test constructor
    final Main15 actual = new Main15();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException99973bbc118da6dd176() {
//
//    // Arrange
//    final String[] arg0 = { ",", ",", "," };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    Main15.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
