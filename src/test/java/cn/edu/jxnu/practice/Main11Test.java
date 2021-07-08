package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main11;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main11Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fbfe54ba92b2a8c5() {

    // Act, creating object to test constructor
    final Main11 actual = new Main11();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
