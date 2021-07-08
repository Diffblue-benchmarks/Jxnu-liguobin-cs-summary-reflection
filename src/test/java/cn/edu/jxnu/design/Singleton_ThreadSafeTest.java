package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Singleton_ThreadSafe;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Singleton_ThreadSafeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void doSomethingOutputVoid999e3be7d44d1ec144b() {

    // Act
    Singleton_ThreadSafe.doSomething();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSingletonOutputNotNull999fa4de5a01b011ab5() {

    // Act
    final Singleton_ThreadSafe actual = Singleton_ThreadSafe.getSingleton();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
