package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Singleton_UnThreadSafe;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Singleton_UnThreadSafeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void getSingletonOutputNotNull9992fad4c7c7d6abcbd() {

    // Act
    final Singleton_UnThreadSafe actual = Singleton_UnThreadSafe.getSingleton();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
