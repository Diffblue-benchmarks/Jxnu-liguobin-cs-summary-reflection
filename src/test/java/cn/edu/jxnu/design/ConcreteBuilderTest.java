package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Computer;
import cn.edu.jxnu.design.ConcreteBuilder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConcreteBuilderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void BuildCPUOutputVoid999ebf41a9ae7bc694c() {

    // Arrange
    final ConcreteBuilder thisObj = new ConcreteBuilder();

    // Act
    thisObj.BuildCPU();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void BuildHDOutputVoid99996023951d5fc39db() {

    // Arrange
    final ConcreteBuilder thisObj = new ConcreteBuilder();

    // Act
    thisObj.BuildHD();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void BuildMainboardOutputVoid999dae4b256767c0161() {

    // Arrange
    final ConcreteBuilder thisObj = new ConcreteBuilder();

    // Act
    thisObj.BuildMainboard();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99939d706723b7661b0() {

    // Act, creating object to test constructor
    final ConcreteBuilder actual = new ConcreteBuilder();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.computer);

  }

  // Test written by Diffblue Cover
  @Test
  public void GetComputerOutputNotNull999eb9fd5e6473dfa84() {

    // Arrange
    final ConcreteBuilder thisObj = new ConcreteBuilder();

    // Act
    final Computer actual = thisObj.GetComputer();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
