package cn.edu.jxnu.lambda;

import cn.edu.jxnu.lambda.StampedLockDemo1.Point;
import cn.edu.jxnu.lambda.StampedLockDemo1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class StampedLockDemo1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a5deaf270d864137() {

    // Act, creating object to test constructor
    final Point actual = new Point();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void distanceFromOriginOutputVoid999cc90498462d6db8b() {

    // Arrange
    final Point thisObj = new Point();

    // Act
    thisObj.distanceFromOrigin();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void moveInputPositivePositiveOutputVoid999ae7afb00b53b21d8() {

    // Arrange
    final Point thisObj = new Point();
    final double arg0 = 1.0;
    final double arg1 = 1.0;

    // Act
    thisObj.move(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995aa2e6881e13d429() {

    // Act, creating object to test constructor
    final StampedLockDemo1 actual = new StampedLockDemo1();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9997f3b7840cfbc350f() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    StampedLockDemo1.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
