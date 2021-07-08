package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.DumpMethods;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;



public class DumpMethodsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994fae32024cdf4288() {

    // Act, creating object to test constructor
    final DumpMethods actual = new DumpMethods();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9999baed36c9e8c9951() {

    // Arrange
    final String arg0 = "\u8bf7\u8f93\u5165\u5b8c\u6574\u7684\u7c7b\u540d\uff1a";

    // Act, creating object to test constructor
    final DumpMethods actual = new DumpMethods(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }
}
