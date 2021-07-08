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
}
