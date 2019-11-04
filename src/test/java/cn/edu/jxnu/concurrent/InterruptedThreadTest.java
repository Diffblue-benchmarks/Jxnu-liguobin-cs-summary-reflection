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

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999e05b84f1cd7abaee() throws Exception {

    // Arrange
    final String[] arg0 = { "InterruptedThread", "InterruptedThread", "InterruptedThread" };

    // Act
    InterruptedThread.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
