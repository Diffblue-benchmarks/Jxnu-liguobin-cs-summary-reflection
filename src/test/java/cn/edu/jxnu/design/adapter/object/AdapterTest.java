package cn.edu.jxnu.design.adapter.object;

import cn.edu.jxnu.design.adapter.Adaptee;
import cn.edu.jxnu.design.adapter.object.Adapter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AdapterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull99985a27adb64dec029() {

    // Arrange
    final Adaptee arg0 = new Adaptee();

    // Act, creating object to test constructor
    final Adapter actual = new Adapter(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.adaptee);

  }

  // Test written by Diffblue Cover
  @Test
  public void standardApiForCurrentSystemOutputVoid9993ce709243412aaea() {

    // Arrange
    final Adaptee adaptee = new Adaptee();
    final Adapter thisObj = new Adapter(adaptee);

    // Act
    thisObj.standardApiForCurrentSystem();

    // The method returns void, testing that no exception is thrown

  }
}
