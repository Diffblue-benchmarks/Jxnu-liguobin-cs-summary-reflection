package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava8;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava8Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992dbab7194907f2da() {

    // Act, creating object to test constructor
    final TestJava8 actual = new TestJava8();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9999fd8993c6053e98a() {

    // Arrange
    final String[] arg0 = { "a", "a", "a" };

    // Act
    TestJava8.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
