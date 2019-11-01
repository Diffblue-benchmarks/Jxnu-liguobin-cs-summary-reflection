package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FirstAppearingOnce;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FirstAppearingOnceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995715d105b8037dd9() {

    // Act, creating object to test constructor
    final FirstAppearingOnce actual = new FirstAppearingOnce();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void firstAppearingOnceOutputNotNull9994678899c7cbc854d() {

    // Arrange
    final FirstAppearingOnce thisObj = new FirstAppearingOnce();

    // Act
    final char actual = thisObj.firstAppearingOnce();

    // Assert result
    Assert.assertEquals('#', actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void insertInputcOutputVoid999a0402613d68c70cd() {

    // Arrange
    final FirstAppearingOnce thisObj = new FirstAppearingOnce();
    final char arg0 = 'c';

    // Act
    thisObj.insert(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
