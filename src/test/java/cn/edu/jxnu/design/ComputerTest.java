package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Computer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ComputerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void AddInputNotNullOutputVoid999154b0d850fe7f57f() {

    // Arrange
    final Computer thisObj = new Computer();
    final String arg0 = "\u7535\u8111\u7ec4\u88c5\u5b8c\u6210\uff0c\u8bf7\u9a8c\u6536";

    // Act
    thisObj.Add(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996327652c977c14a0() {

    // Act, creating object to test constructor
    final Computer actual = new Computer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void ShowOutputVoid999d8bb6f33207b44a3() {

    // Arrange
    final Computer thisObj = new Computer();

    // Act
    thisObj.Show();

    // The method returns void, testing that no exception is thrown

  }
}
