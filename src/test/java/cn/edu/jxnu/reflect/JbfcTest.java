package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Jbfc;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class JbfcTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99953d27ebc682f57c5() {

    // Act, creating object to test constructor
    final Jbfc actual = new Jbfc();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputNullPointerException9997028d31992e6b8ff() throws IOException {

    // Arrange
    final String[] arg0 = { "-v", "-v", "-v" };

    // Act
    thrown.expect(NullPointerException.class);
    Jbfc.main(arg0);

    // The method is not expected to return due to exception thrown

  }
}
