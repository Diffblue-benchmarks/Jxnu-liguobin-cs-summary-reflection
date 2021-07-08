package cn.edu.jxnu.design;

import cn.edu.jxnu.design.FactoryMethod;
import cn.edu.jxnu.design.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;



public class FactoryMethodTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992555e181bafa2f63() {

    // Act, creating object to test constructor
    final FactoryMethod actual = new FactoryMethod();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createProductInputNullOutputVoid999d489b13ff0508f10() {

    // Arrange
    final FactoryMethod thisObj = new FactoryMethod();
    final Class<Product> arg0 = null;

    // Act
    final Product actual = thisObj.createProduct(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
