package cn.edu.jxnu.concurrent;

import cn.edu.jxnu.concurrent.MyThreadBrother;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MyThreadBrotherTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b35f77d87d78e622() {

    // Act, creating object to test constructor
    final MyThreadBrother actual = new MyThreadBrother();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999880d2e15cb660d26() {

    // Arrange
    final String[] arg0 = { "MyThreadBrother \u7684\u7ebf\u7a0b\u5bf9\u8c61\u6b63\u5728\u6267\u884c\u4efb\u52a1", "MyThreadBrother \u7684\u7ebf\u7a0b\u5bf9\u8c61\u6b63\u5728\u6267\u884c\u4efb\u52a1", "MyThreadBrother \u7684\u7ebf\u7a0b\u5bf9\u8c61\u6b63\u5728\u6267\u884c\u4efb\u52a1" };

    // Act
    MyThreadBrother.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid9995221afe3d43c9211() {

    // Arrange
    final MyThreadBrother thisObj = new MyThreadBrother();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }
}
