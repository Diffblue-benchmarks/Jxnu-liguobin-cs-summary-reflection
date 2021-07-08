package cn.edu.jxnu.proxy;

import cn.edu.jxnu.proxy.MyBusinessImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MyBusinessImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99988e4833c2c378ea6() {

    // Act, creating object to test constructor
    final MyBusinessImpl actual = new MyBusinessImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void xxx1InputNotNullOutputVoid999865333b0ce25e125() {

    // Arrange
    final MyBusinessImpl thisObj = new MyBusinessImpl();
    final String arg0 = "aaaaa";

    // Act
    thisObj.xxx1(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void xxx2InputPositiveOutputVoid999aa9dbf611a02174f() {

    // Arrange
    final MyBusinessImpl thisObj = new MyBusinessImpl();
    final int arg0 = 1;

    // Act
    thisObj.xxx2(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
