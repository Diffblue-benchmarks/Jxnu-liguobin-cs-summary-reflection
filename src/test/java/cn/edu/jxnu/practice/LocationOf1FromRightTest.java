package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.LocationOf1FromRight;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LocationOf1FromRightTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990f96acadabd03a14() {

    // Act, creating object to test constructor
    final LocationOf1FromRight actual = new LocationOf1FromRight();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lowestLocationOf1InputZeroOutputPositive9996cc6e3637ba10f9e() {

    // Arrange
    final int arg0 = 0;

    // Act
    final int actual = LocationOf1FromRight.lowestLocationOf1(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
