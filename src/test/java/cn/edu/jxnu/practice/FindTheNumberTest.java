package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FindTheNumber;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FindTheNumberTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992d5bf6e8356118b0() {

    // Act, creating object to test constructor
    final FindTheNumber actual = new FindTheNumber();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
