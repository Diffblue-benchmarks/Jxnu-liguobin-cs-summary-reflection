package cn.edu.jxnu.design.adapter;

import cn.edu.jxnu.design.adapter.Adapter;
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
  public void constructorOutputNotNull99911676edd92725d9d() {

    // Act, creating object to test constructor
    final Adapter actual = new Adapter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void standardApiForCurrentSystemOutputVoid999d1c06fcd9f03190c() {

    // Arrange
    final Adapter thisObj = new Adapter();

    // Act
    thisObj.standardApiForCurrentSystem();

    // The method returns void, testing that no exception is thrown

  }
}
