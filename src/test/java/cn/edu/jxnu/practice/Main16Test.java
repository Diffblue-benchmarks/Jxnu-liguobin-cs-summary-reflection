package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main16;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class Main16Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999f8fe1cd1b1e1596() {

    // Act, creating object to test constructor
    final Main16 actual = new Main16();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException99902de8ed40e6fc07a() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    Main16.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
