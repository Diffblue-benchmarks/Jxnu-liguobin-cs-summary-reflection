package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Request;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RequestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995eee3d9981d72a5d() {

    // Act, creating object to test constructor
    final Request actual = new Request();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRequestLevelOutputVoid999c98432f70b3c3528() {

    // Arrange
    final Request thisObj = new Request();

    // Act
    final Object actual = thisObj.getRequestLevel();

    // The method returns void, testing that no exception is thrown

  }
}
