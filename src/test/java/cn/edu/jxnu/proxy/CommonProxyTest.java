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
import java.lang.reflect.Method;
import java.util.ArrayList;



public class CommonProxyTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

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

  // Test written by Diffblue Cover
  @Test
  public void invokeInputNotNullNull3OutputNullPointerException999794a5d815d8373e1() throws Throwable {

    // Arrange
    final CommonProxy thisObj = new CommonProxy("aaa");
    final Object arg0 = "aaa";
    final Method arg1 = null;
    final Object[] arg2 = { "aaa", "aaa", "aaa" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.invoke(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999a50deba278fce85d() {

    // Arrange
    final String[] arg0 = { "aaa", "aaa", "aaa" };

    // Act
    CommonProxy.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
