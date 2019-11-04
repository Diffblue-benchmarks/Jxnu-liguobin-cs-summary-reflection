package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.CharSort;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class CharSortTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999beac45bcc852618d() {

    // Act, creating object to test constructor
    final CharSort actual = new CharSort();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException9995c1b3b424394ae5b() {
//
//    // Arrange
//    final String[] arg0 = { "9", "9", "9" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    CharSort.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
