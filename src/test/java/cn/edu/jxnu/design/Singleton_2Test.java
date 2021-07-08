package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Singleton_2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Singleton_2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void getInstanceOutputNotNull9997715fd870c8dfa34() {

    // Act
    final Singleton_2 actual = Singleton_2.getInstance();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
