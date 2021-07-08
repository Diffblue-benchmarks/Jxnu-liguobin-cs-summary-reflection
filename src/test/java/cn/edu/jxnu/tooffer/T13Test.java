package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T13;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class T13Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990cf07b72bb1961bb() {

    // Act, creating object to test constructor
    final T13 actual = new T13();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reOrderArrayInput8OutputVoid99929c10ac774cc05df() {

    // Arrange
    final T13 thisObj = new T13();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thisObj.reOrderArray(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
