package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Proxy;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ProxyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buyMacOutputVoid99903e650e22875c22e() {

    // Arrange
    final Proxy thisObj = new Proxy();

    // Act
    thisObj.buyMac();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996e1077787852c242() {

    // Act, creating object to test constructor
    final Proxy actual = new Proxy();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
