package cn.edu.jxnu.io;

import cn.edu.jxnu.io.NIODemo1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NIODemo1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e2b74b3380b8b0de() {

    // Act, creating object to test constructor
    final NIODemo1 actual = new NIODemo1();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void test1OutputVoid999a951bb7b10522c5c() {

    // Arrange
    final NIODemo1 thisObj = new NIODemo1();

    // Act
    thisObj.test1();

    // The method returns void, testing that no exception is thrown

  }
}
