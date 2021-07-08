package cn.edu.jxnu.proxy;

import cn.edu.jxnu.proxy.LoggerInterceptor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LoggerInterceptorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cc27329e51e28023() {

    // Act, creating object to test constructor
    final LoggerInterceptor actual = new LoggerInterceptor();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
