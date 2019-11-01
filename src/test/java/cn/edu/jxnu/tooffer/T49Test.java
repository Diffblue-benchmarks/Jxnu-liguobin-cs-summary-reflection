package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T49;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T49Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991a21e57d7029d011() {

    // Act, creating object to test constructor
    final T49 actual = new T49();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void StrToIntInputNotNullOutputZero999b1ed1414a6920b7d() {

    // Arrange
    final T49 thisObj = new T49();
    final String arg0 = "";

    // Act
    final int actual = thisObj.StrToInt(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
