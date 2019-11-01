package cn.edu.jxnu.design;

import cn.edu.jxnu.design.RealSubject;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RealSubjectTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buyMacOutputVoid9993ee4fbcc4c2fffed() {

    // Arrange
    final RealSubject thisObj = new RealSubject();

    // Act
    thisObj.buyMac();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f4bb1c84f1612cf8() {

    // Act, creating object to test constructor
    final RealSubject actual = new RealSubject();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
