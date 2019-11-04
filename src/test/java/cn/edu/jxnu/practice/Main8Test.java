package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main8;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main8Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991a5be0c0de924e09() {

    // Act, creating object to test constructor
    final Main8 actual = new Main8();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9994522fe642502d598() {

    // Arrange
    final String[] arg0 = { "asd", "asd", "asd" };

    // Act
    Main8.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
