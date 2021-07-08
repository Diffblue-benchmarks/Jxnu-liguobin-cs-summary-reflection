package cn.edu.jxnu.design.strategy;

import cn.edu.jxnu.design.strategy.PeopleComeTimeMoreThenThree;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.math.BigDecimal;



public class PeopleComeTimeMoreThenThreeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99966a27f2a151fc75f() {

    // Act, creating object to test constructor
    final PeopleComeTimeMoreThenThree actual = new PeopleComeTimeMoreThenThree();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getTime());

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeOutputNotNull999e3107521b88f98c8() {

    // Arrange
    final PeopleComeTimeMoreThenThree thisObj = new PeopleComeTimeMoreThenThree();

    // Act
    final Integer actual = thisObj.getTime();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setTimeInputNotNullOutputVoid9999bcd793b2d5964c8() {

    // Arrange
    final PeopleComeTimeMoreThenThree thisObj = new PeopleComeTimeMoreThenThree();
    final Integer arg0 = new Integer(0);

    // Act
    thisObj.setTime(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullTrueOutputNotNull999fc4422d9a0ff7f1b() {

    // Arrange
    final PeopleComeTimeMoreThenThree thisObj = new PeopleComeTimeMoreThenThree();
    final BigDecimal arg0 = new BigDecimal(0.8);
    final boolean arg1 = true;

    // Act
    final BigDecimal actual = thisObj.strategyInterface(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullOutputNotNull999987e1cf55cb35edd() {

    // Arrange
    final PeopleComeTimeMoreThenThree thisObj = new PeopleComeTimeMoreThenThree();
    final BigDecimal arg0 = new BigDecimal(0.8);

    // Act
    final BigDecimal actual = thisObj.strategyInterface(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
