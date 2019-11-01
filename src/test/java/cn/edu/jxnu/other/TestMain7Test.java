package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain7.Dec;
import cn.edu.jxnu.other.TestMain7.Inc;
import cn.edu.jxnu.other.TestMain7;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestMain7Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid999c0d478110c4144c0() {

    // Arrange
    final TestMain7 testMain7 = new TestMain7();
    final Dec thisObj = testMain7.new Dec();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid99916111fcdb10c7a5e() {

    // Arrange
    final TestMain7 testMain7 = new TestMain7();
    final Inc thisObj = testMain7.new Inc();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999a1e7674b153e1c8() {

    // Act, creating object to test constructor
    final TestMain7 actual = new TestMain7();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
