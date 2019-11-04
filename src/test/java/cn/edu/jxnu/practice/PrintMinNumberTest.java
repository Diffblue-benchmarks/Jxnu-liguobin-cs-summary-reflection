package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.PrintMinNumber;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PrintMinNumberTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999111b918186564daa() {

    // Act, creating object to test constructor
    final PrintMinNumber actual = new PrintMinNumber();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999de83a89dd09e128e() {

    // Arrange
    final String[] arg0 = { " ", " ", " " };

    // Act
    PrintMinNumber.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void printMinNumberInput8OutputNotNull9991f41331253d62c8b() {

    // Arrange
    final PrintMinNumber thisObj = new PrintMinNumber();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final String actual = thisObj.printMinNumber(arg0);

    // Assert result
    Assert.assertEquals("00000000", actual);

  }
}
