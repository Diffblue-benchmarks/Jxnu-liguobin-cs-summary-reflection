package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cd65e77cf8411160() {

    // Act, creating object to test constructor
    final TestJava3 actual = new TestJava3();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
