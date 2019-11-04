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

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99960c812707f102d79() throws Exception {

    // Arrange
    final String[] arg0 = { "CountThread", "CountThread", "CountThread" };

    // Act
    ThreadSafeStop.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
