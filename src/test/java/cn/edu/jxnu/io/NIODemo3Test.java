package cn.edu.jxnu.io;

import cn.edu.jxnu.io.NIODemo3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.nio.file.NoSuchFileException;



public class NIODemo3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dd80d32ee8b693e0() {

    // Act, creating object to test constructor
    final NIODemo3 actual = new NIODemo3();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void test3OutputNoSuchFileException99969b849dde4fc6257() throws IOException {

    // Arrange
    final NIODemo3 thisObj = new NIODemo3();

    // Act
    thrown.expect(NoSuchFileException.class);
    thisObj.test3();

    // The method is not expected to return due to exception thrown

  }
}
