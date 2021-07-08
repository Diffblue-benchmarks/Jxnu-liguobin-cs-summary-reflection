package cn.edu.jxnu.design;

import cn.edu.jxnu.design.ConcreteObserver;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteObserverTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ddbeb39ef99f0d99() {

    // Act, creating object to test constructor
    final ConcreteObserver actual = new ConcreteObserver();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void updateOutputVoid9997efdf9d0e96063ed() {

    // Arrange
    final ConcreteObserver thisObj = new ConcreteObserver();

    // Act
    thisObj.update();

    // The method returns void, testing that no exception is thrown

  }
}
