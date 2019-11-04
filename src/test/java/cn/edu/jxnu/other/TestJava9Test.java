package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava9;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava9Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f88454f9678c18ad() {

    // Act, creating object to test constructor
    final TestJava9 actual = new TestJava9();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999f1a5a67dd5869d29() {

    // Arrange
    final String[] arg0 = { "", "", "" };

    // Act
    TestJava9.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}