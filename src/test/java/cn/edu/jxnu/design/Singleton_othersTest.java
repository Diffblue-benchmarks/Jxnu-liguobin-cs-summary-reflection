package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Singleton_others;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Singleton_othersTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void getInstanceOutputNotNull9999d390e6cc6959236() {

    // Act
    final Singleton_others actual = Singleton_others.getInstance();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
