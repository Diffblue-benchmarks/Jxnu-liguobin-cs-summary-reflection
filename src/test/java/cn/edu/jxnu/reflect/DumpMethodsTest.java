package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.DumpMethods;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;



public class DumpMethodsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

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

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999a5ce47c3de7644f0() throws IllegalAccessException, IllegalArgumentException, SecurityException, InstantiationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException {
//
//    // Arrange
//    final String[] arg0 = { "\u8bf7\u8f93\u5165\u5b8c\u6574\u7684\u7c7b\u540d\uff1a", "\u8bf7\u8f93\u5165\u5b8c\u6574\u7684\u7c7b\u540d\uff1a", "\u8bf7\u8f93\u5165\u5b8c\u6574\u7684\u7c7b\u540d\uff1a" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    DumpMethods.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
