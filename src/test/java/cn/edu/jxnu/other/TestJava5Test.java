package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava5;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava5Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99918b55343d2d6746c() {

    // Act, creating object to test constructor
    final TestJava5 actual = new TestJava5();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999c39add358c97be2a() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    TestJava5.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
