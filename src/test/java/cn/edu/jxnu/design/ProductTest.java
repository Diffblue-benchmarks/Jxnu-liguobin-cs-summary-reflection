package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ProductTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996f102069bd96a5fa() {

    // Act, creating object to test constructor
    final Product actual = new Product();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
