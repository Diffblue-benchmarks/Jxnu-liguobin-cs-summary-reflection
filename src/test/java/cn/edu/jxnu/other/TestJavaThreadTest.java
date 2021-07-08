package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJavaThread.CallableThread;
import cn.edu.jxnu.other.TestJavaThread.ThreadB;
import cn.edu.jxnu.other.TestJavaThread;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJavaThreadTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void callOutputNotNull999c0b0868420f68e0b() {

    // Arrange
    final CallableThread thisObj = new CallableThread("H2_1\u4efb\u52a1");

    // Act
    final String actual = thisObj.call();

    // Assert result
    Assert.assertEquals("H2_1\u4efb\u52a1", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9991cc62d017228039c() {

    // Arrange
    final String arg0 = "H2_1\u4efb\u52a1";

    // Act, creating object to test constructor
    final CallableThread actual = new CallableThread(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998f5ff6f38eb29c8f() {

    // Act, creating object to test constructor
    final TestJavaThread actual = new TestJavaThread();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999e709564d3d3bb632() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final ThreadB actual = new ThreadB(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid999a7ee5c753226b11b() {

    // Arrange
    final ThreadB thisObj = new ThreadB("aaaaa");

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }
}
