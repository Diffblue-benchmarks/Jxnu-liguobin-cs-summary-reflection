package cn.edu.jxnu.concurrent;

import cn.edu.jxnu.concurrent.ThreadSafeStop;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ThreadSafeStopTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99970d5572cd2cfdec0() {

    // Act, creating object to test constructor
    final ThreadSafeStop actual = new ThreadSafeStop();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
