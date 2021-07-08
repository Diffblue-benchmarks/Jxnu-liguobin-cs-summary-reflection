package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.ReverseSentence;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReverseSentenceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99953432c8623e6f4db() {

    // Act, creating object to test constructor
    final ReverseSentence actual = new ReverseSentence();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999ed9d31f42705b35a() {

    // Arrange
    final String[] arg0 = { "", "", "" };

    // Act
    ReverseSentence.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseSentenceInputNotNullOutputNotNull9996099b5209521850c() {

    // Arrange
    final ReverseSentence thisObj = new ReverseSentence();
    final String arg0 = "";

    // Act
    final String actual = thisObj.reverseSentence(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }
}
