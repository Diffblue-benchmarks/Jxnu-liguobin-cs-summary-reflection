package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Resource;
import cn.edu.jxnu.design.Singleton;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SingletonTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void getInstanceOutputNotNull9999037b32b104f1e2d() {

    // Arrange
    final Singleton thisObj = Singleton.INSTANCE;

    // Act
    final Resource actual = thisObj.getInstance();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputInstance9994bc8720b3f8ddf4b() {

    // Arrange
    final String arg0 = "INSTANCE";

    // Act
    final Singleton actual = Singleton.valueOf(arg0);

    // Assert result
    Assert.assertEquals(Singleton.INSTANCE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput1999606529236fd26c08() {

    // Act
    final Singleton[] actual = Singleton.values();

    // Assert result
    Assert.assertArrayEquals(new Singleton[]{ Singleton.INSTANCE }, actual);

  }
}
