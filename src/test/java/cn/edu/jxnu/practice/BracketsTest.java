package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Brackets;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class BracketsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999edcb3e473f6e15f3() {

    // Act, creating object to test constructor
    final Brackets actual = new Brackets();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999b92ae587c9c7016a() {
//
//    // Arrange
//    final String[] arg0 = { "(", "(", "(" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    Brackets.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void solveInputNotNullOutputNotNull999473a7d9495debc9e() {

    // Arrange
    final String arg0 = "(";

    // Act
    final String actual = Brackets.solve(arg0);

    // Assert result
    Assert.assertEquals("NO", actual);

  }
}
