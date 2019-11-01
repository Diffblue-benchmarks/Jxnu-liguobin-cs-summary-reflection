package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain4;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestMain4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e68bdf843cd3f129() {

    // Act, creating object to test constructor
    final TestMain4 actual = new TestMain4();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
