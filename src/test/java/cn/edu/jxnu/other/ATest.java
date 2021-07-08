package cn.edu.jxnu.other;

import cn.edu.jxnu.other.A;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ATest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999987b65c6dcfa434c() {

    // Act, creating object to test constructor
    final A actual = new A();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
