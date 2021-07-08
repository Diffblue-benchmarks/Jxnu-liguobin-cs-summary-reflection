package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997ddd7fa2bf9db99c() {

    // Act, creating object to test constructor
    final Main3 actual = new Main3();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void workOutputZero99925774c28adc2b034() {

    // Act
    final int actual = Main3.work();

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
