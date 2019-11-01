package cn.edu.jxnu.design;

import cn.edu.jxnu.design.ConcreteSubject;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteSubjectTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99926f666b5665a25de() {

    // Act, creating object to test constructor
    final ConcreteSubject actual = new ConcreteSubject();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
