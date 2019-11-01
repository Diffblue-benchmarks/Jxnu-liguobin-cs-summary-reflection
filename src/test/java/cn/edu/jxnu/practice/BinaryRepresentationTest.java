package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.BinaryRepresentation;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BinaryRepresentationTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void binaryRepresentationInputNotNullOutputNumberFormatException999b0b652ae00033324() {

    // Arrange
    final BinaryRepresentation thisObj = new BinaryRepresentation();
    final String arg0 = "";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.binaryRepresentation(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99918cfad0c662364a2() {

    // Act, creating object to test constructor
    final BinaryRepresentation actual = new BinaryRepresentation();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
