package cn.edu.jxnu.other;

import cn.edu.jxnu.other.AA;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AATest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999aaee393c4f0d973f() {

    // Act, creating object to test constructor
    final AA actual = new AA();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
