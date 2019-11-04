package cn.edu.jxnu.design.visitor;

import cn.edu.jxnu.design.visitor.ClientTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ClientTestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e14d8480ffb9a88d() {

    // Act, creating object to test constructor
    final ClientTest actual = new ClientTest();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9996315cffbee6283a9() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    ClientTest.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
