package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Get20Integers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Get20IntegersTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99921f8cd804df5a932() {

    // Act, creating object to test constructor
    final Get20Integers actual = new Get20Integers();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
