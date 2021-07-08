package cn.edu.jxnu.design.adapter.object;

import cn.edu.jxnu.design.adapter.object.DemoTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DemoTestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c5dfa8c305b4cb34() {

    // Act, creating object to test constructor
    final DemoTest actual = new DemoTest();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
