package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain6;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class TestMain6Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998a1c9996878fc638() {

    // Act, creating object to test constructor
    final TestMain6 actual = new TestMain6();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void findInput8OutputArrayIndexOutOfBoundsException999d55d3a6937a499ac() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    TestMain6.find(arg0);

    // The method is not expected to return due to exception thrown

  }
}
