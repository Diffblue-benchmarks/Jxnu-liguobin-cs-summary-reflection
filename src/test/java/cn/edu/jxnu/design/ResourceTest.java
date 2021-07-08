package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Resource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ResourceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cb622c2a72fa3da9() {

    // Act, creating object to test constructor
    final Resource actual = new Resource();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
