package cn.edu.jxnu.encode;

import cn.edu.jxnu.encode.BASE64;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BASE64Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a7df88cbe10710cb() {

    // Act, creating object to test constructor
    final BASE64 actual = new BASE64();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void decodeStrInputNotNullOutputNotNull999d2a6e7c9caca7579() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = BASE64.decodeStr(arg0);

    // Assert result
    Assert.assertEquals("i\ufffd\ufffd", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void encodeStrInputNotNullOutputNotNull999c87d910f5a203762() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = BASE64.encodeStr(arg0);

    // Assert result
    Assert.assertEquals("YWFhYWE=", actual);

  }
}
