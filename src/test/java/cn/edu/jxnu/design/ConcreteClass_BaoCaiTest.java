package cn.edu.jxnu.design;

import cn.edu.jxnu.design.ConcreteClass_BaoCai;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteClass_BaoCaiTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ce85bc6bc6cba827() {

    // Act, creating object to test constructor
    final ConcreteClass_BaoCai actual = new ConcreteClass_BaoCai();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void pourSauceOutputVoid9996d84a4f021c12f56() {

    // Arrange
    final ConcreteClass_BaoCai thisObj = new ConcreteClass_BaoCai();

    // Act
    thisObj.pourSauce();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void pourVegetableOutputVoid9994727af3fb86c6d27() {

    // Arrange
    final ConcreteClass_BaoCai thisObj = new ConcreteClass_BaoCai();

    // Act
    thisObj.pourVegetable();

    // The method returns void, testing that no exception is thrown

  }
}
