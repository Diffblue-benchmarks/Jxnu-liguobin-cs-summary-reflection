package cn.edu.jxnu.concurrent;

import cn.edu.jxnu.concurrent.InterruptedThread;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class InterruptedThreadTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e1eae9ed0f24720d() {

    // Act, creating object to test constructor
    final InterruptedThread actual = new InterruptedThread();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
