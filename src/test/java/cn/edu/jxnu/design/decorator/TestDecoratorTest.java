package cn.edu.jxnu.design.decorator;

import cn.edu.jxnu.design.decorator.TestDecorator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestDecoratorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991fae4dcac32e7ea1() {

    // Act, creating object to test constructor
    final TestDecorator actual = new TestDecorator();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999db265b1950c0249c() {

    // Arrange
    final String[] arg0 = { "\u88c5\u9970\u540e\u7684\u529f\u80fd\u3002\u3002\u3002\u3002\u3002", "\u88c5\u9970\u540e\u7684\u529f\u80fd\u3002\u3002\u3002\u3002\u3002", "\u88c5\u9970\u540e\u7684\u529f\u80fd\u3002\u3002\u3002\u3002\u3002" };

    // Act
    TestDecorator.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
