package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999388981ab14f79e1c() {

    // Act, creating object to test constructor
    final TestJava1 actual = new TestJava1();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999e6ccf7cf91d2870e() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    TestJava1.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
