package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main14;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main14Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990ec25f508e123fab() {

    // Act, creating object to test constructor
    final Main14 actual = new Main14();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
