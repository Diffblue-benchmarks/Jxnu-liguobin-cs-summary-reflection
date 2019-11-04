package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main10;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main10Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99960f8e3d6123ac67a() {

    // Act, creating object to test constructor
    final Main10 actual = new Main10();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99926c45e79f90f0ce1() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Main10.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}