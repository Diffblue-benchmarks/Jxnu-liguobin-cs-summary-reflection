package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestMain2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999aa86ef6bc1f3768e() {

    // Act, creating object to test constructor
    final TestMain2 actual = new TestMain2();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
