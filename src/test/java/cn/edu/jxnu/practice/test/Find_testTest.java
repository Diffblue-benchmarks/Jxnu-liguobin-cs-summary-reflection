package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.test.Find_test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Find_testTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995aac6ce7e49b350d() {

    // Act, creating object to test constructor
    final Find_test actual = new Find_test();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void testFind2OutputVoid999c90a77e499836034() {

    // Arrange
    final Find_test thisObj = new Find_test();

    // Act
    thisObj.testFind2();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void testFindOutputVoid999c16182e92bf8bb8d() {

    // Arrange
    final Find_test thisObj = new Find_test();

    // Act
    thisObj.testFind();

    // The method returns void, testing that no exception is thrown

  }
}
