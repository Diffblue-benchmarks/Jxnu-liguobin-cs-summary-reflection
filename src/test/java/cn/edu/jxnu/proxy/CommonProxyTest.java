package cn.edu.jxnu.proxy;

import cn.edu.jxnu.proxy.CommonProxy;
import cn.edu.jxnu.proxy.Interceptor;
import cn.edu.jxnu.proxy.LoggerInterceptor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class CommonProxyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9990d481f79e1232c76() {

    // Arrange
    final Object arg0 = "aaa";

    // Act, creating object to test constructor
    final CommonProxy actual = new CommonProxy(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initInterceptorsInputNotNullOutputVoid9994ac68fd574ae1ef4() {

    // Arrange
    final ArrayList<Interceptor> arg0 = new ArrayList<Interceptor>();
    final LoggerInterceptor loggerInterceptor = new LoggerInterceptor();
    arg0.add(loggerInterceptor);

    // Act
    CommonProxy.initInterceptors(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
