package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f6d1a1fde72c4e9b() {

    // Act, creating object to test constructor
    final TestJava2 actual = new TestJava2();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testInputPositiveOutputVoid99971fc7a226cd3bef3() {

    // Arrange
    final int arg0 = 1;

    // Act
    TestJava2.test(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
