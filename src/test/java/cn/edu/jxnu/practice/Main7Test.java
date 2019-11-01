package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main7;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main7Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999707ec3237434857b() {

    // Act, creating object to test constructor
    final Main7 actual = new Main7();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
