package cn.edu.jxnu.io;

import cn.edu.jxnu.io.NIODemo5;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class NIODemo5Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f002d319d382db17() {

    // Act, creating object to test constructor
    final NIODemo5 actual = new NIODemo5();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void test5OutputVoid999539252bfaca54af4() {

    // Arrange
    final NIODemo5 thisObj = new NIODemo5();

    // Act
    thisObj.test5();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void test6OutputVoid999617e8c43d32c557f() throws IOException {

    // Arrange
    final NIODemo5 thisObj = new NIODemo5();

    // Act
    thisObj.test6();

    // The method returns void, testing that no exception is thrown

  }
}
