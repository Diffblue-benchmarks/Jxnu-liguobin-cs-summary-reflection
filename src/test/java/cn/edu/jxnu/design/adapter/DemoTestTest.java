package cn.edu.jxnu.design.adapter;

import cn.edu.jxnu.design.adapter.DemoTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DemoTestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999814a0b5692beeea4() {

    // Act, creating object to test constructor
    final DemoTest actual = new DemoTest();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9990e97b5f791202ae6() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    DemoTest.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
