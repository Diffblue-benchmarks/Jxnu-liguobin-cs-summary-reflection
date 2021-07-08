package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Flyweight;
import cn.edu.jxnu.design.FlyweightFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FlyweightFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b7f52f050bb63c1e() {

    // Act, creating object to test constructor
    final FlyweightFactory actual = new FlyweightFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFlyweightInputNotNullOutputNotNull999f636bded3d3e5b91() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final Flyweight actual = FlyweightFactory.getFlyweight(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
