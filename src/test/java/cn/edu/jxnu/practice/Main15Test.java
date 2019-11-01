package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main15;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main15Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c9d2ecd60f1f7c67() {

    // Act, creating object to test constructor
    final Main15 actual = new Main15();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
