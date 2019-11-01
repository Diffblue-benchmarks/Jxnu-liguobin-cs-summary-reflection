package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main16;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main16Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999f8fe1cd1b1e1596() {

    // Act, creating object to test constructor
    final Main16 actual = new Main16();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
