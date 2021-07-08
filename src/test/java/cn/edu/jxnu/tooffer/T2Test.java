package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999ec338378a35d1a0() {

    // Act, creating object to test constructor
    final T2 actual = new T2();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceSpace1InputNotNullOutputNotNull999ed6510218b46dfba() {

    // Arrange
    final StringBuffer arg0 = new StringBuffer();

    // Act
    final String actual = T2.replaceSpace1(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceSpace2InputNotNullOutputNotNull999e19d58c058b9e836() {

    // Arrange
    final StringBuffer arg0 = new StringBuffer();

    // Act
    final String actual = T2.replaceSpace2(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceSpace3InputNotNullOutputNotNull999397854716df786a8() {

    // Arrange
    final StringBuffer arg0 = new StringBuffer();

    // Act
    final String actual = T2.replaceSpace3(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }
}
