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

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9995957843a074ee3e4() {

    // Arrange
    final String[] arg0 = { "\u7684\u9636\u4e58\u4e2d\u6700\u4f4e\u4f4d1\u7684\u4f4d\u7f6e\u662f\uff1a", "\u7684\u9636\u4e58\u4e2d\u6700\u4f4e\u4f4d1\u7684\u4f4d\u7f6e\u662f\uff1a", "\u7684\u9636\u4e58\u4e2d\u6700\u4f4e\u4f4d1\u7684\u4f4d\u7f6e\u662f\uff1a" };

    // Act
    LocationOf1FromRight.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
