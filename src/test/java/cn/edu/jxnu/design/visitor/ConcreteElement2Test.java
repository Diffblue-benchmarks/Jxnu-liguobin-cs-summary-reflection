package cn.edu.jxnu.design.visitor;

import cn.edu.jxnu.design.visitor.ConcreteElement2;
import cn.edu.jxnu.design.visitor.ConcreteVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteElement2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d3b2071054aa972e() {

    // Arrange
    final ConcreteElement2 thisObj = new ConcreteElement2();
    final ConcreteVisitor arg0 = new ConcreteVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999227272b3a96ce392() {

    // Act, creating object to test constructor
    final ConcreteElement2 actual = new ConcreteElement2();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doSomeThingsOutputVoid9991c66bf68271ca778() {

    // Arrange
    final ConcreteElement2 thisObj = new ConcreteElement2();

    // Act
    thisObj.doSomeThings();

    // The method returns void, testing that no exception is thrown

  }
}
