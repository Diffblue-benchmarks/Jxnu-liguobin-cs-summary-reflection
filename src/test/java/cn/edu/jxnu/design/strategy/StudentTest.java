package cn.edu.jxnu.design.strategy;

import cn.edu.jxnu.design.strategy.Student;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.math.BigDecimal;



public class StudentTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997d97d8ccb7d7ec8e() {

    // Act, creating object to test constructor
    final Student actual = new Student();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHasIDCard());

  }

  // Test written by Diffblue Cover
  @Test
  public void getHasIDCardOutputVoid9990a782201b2533f3d() {

    // Arrange
    final Student thisObj = new Student();

    // Act
    final Boolean actual = thisObj.getHasIDCard();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHasIDCardInputNotNullOutputVoid9997982845d374fa5c8() {

    // Arrange
    final Student thisObj = new Student();
    final Boolean arg0 = new Boolean(true);

    // Act
    thisObj.setHasIDCard(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHasIDCard());

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullTrueOutputNullPointerException999a3fba7782748a8e5() {

    // Arrange
    final Student thisObj = new Student();
    final BigDecimal arg0 = new BigDecimal(0.5);
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.strategyInterface(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void strategyInterfaceInputNotNullOutputNotNull999c75ef70bbb7db69d() {

    // Arrange
    final Student thisObj = new Student();
    final BigDecimal arg0 = new BigDecimal(0.5);

    // Act
    final BigDecimal actual = thisObj.strategyInterface(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
