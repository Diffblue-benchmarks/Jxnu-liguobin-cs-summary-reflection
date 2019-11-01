package cn.edu.jxnu.design.strategy;

import cn.edu.jxnu.design.strategy.ElderMoreThen60YearsOld;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.math.BigDecimal;



public class ElderMoreThen60YearsOldTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998428d75a115db2a4() {

    // Act, creating object to test constructor
    final ElderMoreThen60YearsOld actual = new ElderMoreThen60YearsOld();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getAge());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAgeOutputVoid999fc88b97dc68896ee() {

    // Arrange
    final ElderMoreThen60YearsOld thisObj = new ElderMoreThen60YearsOld();

    // Act
    final Integer actual = thisObj.getAge();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAgeInputNotNullOutputVoid9997773c18a1ca05ed0() {

    // Arrange
    final ElderMoreThen60YearsOld thisObj = new ElderMoreThen60YearsOld();
    final Integer arg0 = new Integer(60);

    // Act
    thisObj.setAge(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getAge());

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullTrueOutputNullPointerException999c5a667c68e80e2f6() {

    // Arrange
    final ElderMoreThen60YearsOld thisObj = new ElderMoreThen60YearsOld();
    final BigDecimal arg0 = new BigDecimal(0.2);
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.strategyInterface(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullOutputNotNull999be03d8a7d7c1c693() {

    // Arrange
    final ElderMoreThen60YearsOld thisObj = new ElderMoreThen60YearsOld();
    final BigDecimal arg0 = new BigDecimal(0.2);

    // Act
    final BigDecimal actual = thisObj.strategyInterface(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
