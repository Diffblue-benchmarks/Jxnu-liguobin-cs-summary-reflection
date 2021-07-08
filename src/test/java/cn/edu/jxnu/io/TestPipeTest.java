package cn.edu.jxnu.io;

import cn.edu.jxnu.io.TestPipe;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class TestPipeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e55a76776d98b3ea() {

    // Act, creating object to test constructor
    final TestPipe actual = new TestPipe();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void test1OutputVoid99982f36e9bffd7d806() throws IOException {

    // Arrange
    final TestPipe thisObj = new TestPipe();

    // Act
    thisObj.test1();

    // The method returns void, testing that no exception is thrown

  }
}
