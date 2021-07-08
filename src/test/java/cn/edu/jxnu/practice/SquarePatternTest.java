package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.SquarePattern;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SquarePatternTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull999c182cd689e563a91() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final SquarePattern actual = new SquarePattern(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999e1ac1fcedff5a1a7() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    SquarePattern.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void squarePatternPrintOutputVoid99949bae261454d965e() {

    // Arrange
    final SquarePattern thisObj = new SquarePattern(1);

    // Act
    thisObj.squarePatternPrint();

    // The method returns void, testing that no exception is thrown

  }
}
