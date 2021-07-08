package cn.edu.jxnu.concurrent;

import cn.edu.jxnu.concurrent.InterruptedException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class InterruptedExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991d4107d4217a632d() {

    // Act, creating object to test constructor
    final InterruptedException actual = new InterruptedException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }
}
