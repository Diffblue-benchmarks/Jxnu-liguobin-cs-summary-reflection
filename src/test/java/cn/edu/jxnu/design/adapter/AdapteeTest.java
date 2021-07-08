package cn.edu.jxnu.design.adapter;

import cn.edu.jxnu.design.adapter.Adaptee;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AdapteeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994d9e127f4fd95fd1() {

    // Act, creating object to test constructor
    final Adaptee actual = new Adaptee();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void specificApiForCurrentSystemOutputVoid999f39e2806021be1de() {

    // Arrange
    final Adaptee thisObj = new Adaptee();

    // Act
    thisObj.specificApiForCurrentSystem();

    // The method returns void, testing that no exception is thrown

  }
}
