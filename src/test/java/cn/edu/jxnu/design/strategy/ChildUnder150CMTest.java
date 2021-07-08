package cn.edu.jxnu.design.strategy;

import cn.edu.jxnu.design.strategy.ChildUnder150CM;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.math.BigDecimal;



public class ChildUnder150CMTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99966b536fecca4e97a() {

    // Act, creating object to test constructor
    final ChildUnder150CM actual = new ChildUnder150CM();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHeight());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeightOutputVoid999921a83e67bb20ce9() {

    // Arrange
    final ChildUnder150CM thisObj = new ChildUnder150CM();

    // Act
    final Integer actual = thisObj.getHeight();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeightInputNotNullOutputVoid99937dcb8eee3a2546d() {

    // Arrange
    final ChildUnder150CM thisObj = new ChildUnder150CM();
    final Integer arg0 = new Integer(0);

    // Act
    thisObj.setHeight(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHeight());

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullTrueOutputNullPointerException9996937c8d76a38ad91() {

    // Arrange
    final ChildUnder150CM thisObj = new ChildUnder150CM();
    final BigDecimal arg0 = new BigDecimal(0.5);
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.strategyInterface(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullOutputNotNull99989b6aaae85164062() {

    // Arrange
    final ChildUnder150CM thisObj = new ChildUnder150CM();
    final BigDecimal arg0 = new BigDecimal(0.5);

    // Act
    final BigDecimal actual = thisObj.strategyInterface(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
