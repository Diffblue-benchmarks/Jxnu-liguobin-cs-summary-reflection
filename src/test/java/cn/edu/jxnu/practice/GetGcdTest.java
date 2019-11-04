package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.GetGcd;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GetGcdTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999aa194e9c31a191ee() {

    // Act, creating object to test constructor
    final GetGcd actual = new GetGcd();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcd2InputPositivePositiveOutputPositive999991987a2daaf228c() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = GetGcd.gcd2(arg0, arg1);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcd3InputPositivePositiveOutputPositive9998b5f284723e31b7d() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = GetGcd.gcd3(arg0, arg1);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcdInputPositivePositiveOutputPositive99934a7db52eccc2e29() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = GetGcd.gcd(arg0, arg1);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lcmInputPositivePositiveOutputPositive99998b8433678005fb5() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = GetGcd.lcm(arg0, arg1);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999ee1fe15845e23079() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    GetGcd.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
