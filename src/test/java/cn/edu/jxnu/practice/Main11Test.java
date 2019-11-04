package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main11;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class Main11Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fbfe54ba92b2a8c5() {

    // Act, creating object to test constructor
    final Main11 actual = new Main11();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999a7161e12eced9011() {
//
//    // Arrange
//    final String[] arg0 = { "d", "d", "d" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    Main11.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
