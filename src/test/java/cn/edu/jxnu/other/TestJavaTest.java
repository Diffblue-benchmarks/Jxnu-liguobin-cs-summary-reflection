package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJavaTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void changeInputNotNullNotNullOutputVoid9997402b6039aad1fc4() {

    // Arrange
    final StringBuffer arg0 = new StringBuffer();
    final String arg1 = "A";

    // Act
    TestJava.change(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertEquals("A", arg0.toString());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dbf2902a786b9057() {

    // Act, creating object to test constructor
    final TestJava actual = new TestJava();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999db82838292554607() {

    // Arrange
    final String[] arg0 = { "A", "A", "A" };

    // Act
    TestJava.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
