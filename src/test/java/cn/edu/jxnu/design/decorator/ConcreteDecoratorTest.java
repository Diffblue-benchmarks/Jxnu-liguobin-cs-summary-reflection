package cn.edu.jxnu.design.decorator;

import cn.edu.jxnu.design.decorator.ConcreteComponent;
import cn.edu.jxnu.design.decorator.ConcreteDecorator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteDecoratorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a3b61c8f79be801a() {

    // Act, creating object to test constructor
    final ConcreteDecorator actual = new ConcreteDecorator();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getInstance());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99969b66e14a75f6f35() {

    // Arrange
    final ConcreteComponent arg0 = new ConcreteComponent();

    // Act, creating object to test constructor
    final ConcreteDecorator actual = new ConcreteDecorator(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getInstance());

  }

  // Test written by Diffblue Cover
  @Test
  public void methodAOutputNullPointerException9995dad6c5b6d1ebb19() {

    // Arrange
    final ConcreteDecorator thisObj = new ConcreteDecorator();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.methodA();

    // The method is not expected to return due to exception thrown

  }
}
