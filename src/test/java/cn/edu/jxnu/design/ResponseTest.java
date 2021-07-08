package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Response;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ResponseTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bbe5a12fe92eebd9() {

    // Act, creating object to test constructor
    final Response actual = new Response();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
