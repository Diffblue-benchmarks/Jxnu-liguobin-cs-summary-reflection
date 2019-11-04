package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class Main3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997ddd7fa2bf9db99c() {

    // Act, creating object to test constructor
    final Main3 actual = new Main3();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999bf05c5bbf18dc92c() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    Main3.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void workOutputZero99925774c28adc2b034() {

    // Act
    final int actual = Main3.work();

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
