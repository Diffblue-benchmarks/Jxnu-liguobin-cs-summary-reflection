package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T52;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T52Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bff01216187b840e() {

    // Act, creating object to test constructor
    final T52 actual = new T52();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void matchCoreInput8Zero8ZeroOutputTrue9994cd810fff9608bb3() {

    // Arrange
    final T52 thisObj = new T52();
    final char[] arg0 = { '*', '*', '*', '*', '*', '*', '*', '*' };
    final int arg1 = 0;
    final char[] arg2 = { '*', '*', '*', '*', '*', '*', '*', '*' };
    final int arg3 = 0;

    // Act
    final boolean actual = thisObj.matchCore(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void matchInput88OutputTrue999fb55afd4be26c7dc() {

    // Arrange
    final T52 thisObj = new T52();
    final char[] arg0 = { '*', '*', '*', '*', '*', '*', '*', '*' };
    final char[] arg1 = { '*', '*', '*', '*', '*', '*', '*', '*' };

    // Act
    final boolean actual = thisObj.match(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
