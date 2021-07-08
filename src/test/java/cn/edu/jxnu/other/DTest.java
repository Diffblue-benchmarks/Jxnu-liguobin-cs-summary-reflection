package cn.edu.jxnu.other;

import cn.edu.jxnu.other.D;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b8ac06d3fb6b4344() {

    // Act, creating object to test constructor
    final D actual = new D();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
