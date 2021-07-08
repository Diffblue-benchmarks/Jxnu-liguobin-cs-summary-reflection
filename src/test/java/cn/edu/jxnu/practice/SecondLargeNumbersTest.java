package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.SecondLargeNumbers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class SecondLargeNumbersTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99908432a270bc6b37a() {

    // Act, creating object to test constructor
    final SecondLargeNumbers actual = new SecondLargeNumbers();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999566621cb2e8303d8() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    SecondLargeNumbers.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
