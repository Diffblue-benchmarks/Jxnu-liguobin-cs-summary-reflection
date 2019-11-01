package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Jbfc;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class JbfcTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99953d27ebc682f57c5() {

    // Act, creating object to test constructor
    final Jbfc actual = new Jbfc();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
