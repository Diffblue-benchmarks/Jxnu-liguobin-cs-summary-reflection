package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.StrToInt;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StrToIntTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b6f281474207d3ac() {

    // Act, creating object to test constructor
    final StrToInt actual = new StrToInt();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void strToIntInputNotNullOutputZero9993354aa63c9deb11e() {

    // Arrange
    final StrToInt thisObj = new StrToInt();
    final String arg0 = "";

    // Act
    final int actual = thisObj.strToInt(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
