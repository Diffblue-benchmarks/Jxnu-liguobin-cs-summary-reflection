package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Singleton_1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Singleton_1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void getInstanceOutputNotNull999bdd9a84186e04deb() {

    // Act
    final Singleton_1 actual = Singleton_1.getInstance();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
