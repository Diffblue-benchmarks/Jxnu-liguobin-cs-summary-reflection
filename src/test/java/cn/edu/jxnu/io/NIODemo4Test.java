package cn.edu.jxnu.io;

import cn.edu.jxnu.io.NIODemo4;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class NIODemo4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990f73dab969eee988() {

    // Act, creating object to test constructor
    final NIODemo4 actual = new NIODemo4();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void test4OutputVoid99906dfae516e0c8672() throws IOException {

    // Arrange
    final NIODemo4 thisObj = new NIODemo4();

    // Act
    thisObj.test4();

    // The method returns void, testing that no exception is thrown

  }
}
