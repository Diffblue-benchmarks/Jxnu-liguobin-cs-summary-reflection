package cn.edu.jxnu.design;

import cn.edu.jxnu.design.ConcreteClass_CaiXin;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteClass_CaiXinTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999caa14cf3ab5a0e79() {

    // Act, creating object to test constructor
    final ConcreteClass_CaiXin actual = new ConcreteClass_CaiXin();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void pourSauceOutputVoid99909a85f0475ae4746() {

    // Arrange
    final ConcreteClass_CaiXin thisObj = new ConcreteClass_CaiXin();

    // Act
    thisObj.pourSauce();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void pourVegetableOutputVoid9990ce26a228065cbdd() {

    // Arrange
    final ConcreteClass_CaiXin thisObj = new ConcreteClass_CaiXin();

    // Act
    thisObj.pourVegetable();

    // The method returns void, testing that no exception is thrown

  }
}
