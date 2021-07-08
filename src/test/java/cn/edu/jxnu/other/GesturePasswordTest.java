package cn.edu.jxnu.other;

import cn.edu.jxnu.other.GesturePassword;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GesturePasswordTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999dee186eafbdef4a() {

    // Act, creating object to test constructor
    final GesturePassword actual = new GesturePassword();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
