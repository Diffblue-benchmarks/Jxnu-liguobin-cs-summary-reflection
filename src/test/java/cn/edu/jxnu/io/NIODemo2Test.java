package cn.edu.jxnu.io;

import cn.edu.jxnu.io.NIODemo2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.nio.file.NoSuchFileException;



public class NIODemo2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bb2e9ffb5204285f() {

    // Act, creating object to test constructor
    final NIODemo2 actual = new NIODemo2();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void test2OutputNoSuchFileException99968787519da8b8525() throws IOException {

    // Arrange
    final NIODemo2 thisObj = new NIODemo2();

    // Act
    thrown.expect(NoSuchFileException.class);
    thisObj.test2();

    // The method is not expected to return due to exception thrown

  }
}
