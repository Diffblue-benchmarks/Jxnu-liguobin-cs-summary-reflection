package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava6;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class TestJava6Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99902be047f762aa5f0() {

    // Act, creating object to test constructor
    final TestJava6 actual = new TestJava6();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void inspectInputNotNullOutputVoid999d5138bcd824ba500() {

    // Arrange
    final TestJava6 thisObj = new TestJava6();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaaa");

    // Act
    thisObj.inspect(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
