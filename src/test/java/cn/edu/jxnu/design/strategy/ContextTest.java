package cn.edu.jxnu.design.strategy;

import cn.edu.jxnu.design.strategy.ChildUnder150CM;
import cn.edu.jxnu.design.strategy.Context;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ContextTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999662f40a6c61338b1() {

    // Arrange
    final ChildUnder150CM arg0 = new ChildUnder150CM();

    // Act, creating object to test constructor
    final Context actual = new Context(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void contextInterfaceOutputVoid99936f85bcccc42f0af() {

    // Arrange
    final ChildUnder150CM childUnder150CM = new ChildUnder150CM();
    final Context thisObj = new Context(childUnder150CM);

    // Act
    thisObj.contextInterface();

    // The method returns void, testing that no exception is thrown

  }
}
