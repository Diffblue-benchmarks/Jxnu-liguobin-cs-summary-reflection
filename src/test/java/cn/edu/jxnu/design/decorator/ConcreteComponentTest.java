package cn.edu.jxnu.design.decorator;

import cn.edu.jxnu.design.decorator.ConcreteComponent;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteComponentTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999279a75922f6dce0() {

    // Act, creating object to test constructor
    final ConcreteComponent actual = new ConcreteComponent();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void methodAOutputVoid99965ee02c9f90d6793() {

    // Arrange
    final ConcreteComponent thisObj = new ConcreteComponent();

    // Act
    thisObj.methodA();

    // The method returns void, testing that no exception is thrown

  }
}
