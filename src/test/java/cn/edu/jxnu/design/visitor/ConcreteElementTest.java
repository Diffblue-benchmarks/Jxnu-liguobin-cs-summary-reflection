package cn.edu.jxnu.design.visitor;

import cn.edu.jxnu.design.visitor.ConcreteElement;
import cn.edu.jxnu.design.visitor.ConcreteVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteElementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999ed9673ba6ddb49c3() {

    // Arrange
    final ConcreteElement thisObj = new ConcreteElement();
    final ConcreteVisitor arg0 = new ConcreteVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cdc983a576c1cb4e() {

    // Act, creating object to test constructor
    final ConcreteElement actual = new ConcreteElement();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doSomeThingsOutputVoid999cd61f30014e49d57() {

    // Arrange
    final ConcreteElement thisObj = new ConcreteElement();

    // Act
    thisObj.doSomeThings();

    // The method returns void, testing that no exception is thrown

  }
}
