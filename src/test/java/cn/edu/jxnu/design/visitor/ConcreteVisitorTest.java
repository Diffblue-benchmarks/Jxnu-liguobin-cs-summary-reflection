package cn.edu.jxnu.design.visitor;

import cn.edu.jxnu.design.visitor.ConcreteElement2;
import cn.edu.jxnu.design.visitor.ConcreteElement;
import cn.edu.jxnu.design.visitor.ConcreteVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteVisitorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b3f0331589d75e87() {

    // Act, creating object to test constructor
    final ConcreteVisitor actual = new ConcreteVisitor();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999cbd8315860c78aa0() {

    // Arrange
    final ConcreteVisitor thisObj = new ConcreteVisitor();
    final ConcreteElement2 arg0 = new ConcreteElement2();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996ae1ec0cc00d2b26() {

    // Arrange
    final ConcreteVisitor thisObj = new ConcreteVisitor();
    final ConcreteElement arg0 = new ConcreteElement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
