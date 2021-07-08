package cn.edu.jxnu.other;

import cn.edu.jxnu.other.RandMath;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RandMathTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99916674da172b80035() {

    // Act, creating object to test constructor
    final RandMath actual = new RandMath();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
