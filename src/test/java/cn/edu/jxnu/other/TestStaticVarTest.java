package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestStaticVar;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestStaticVarTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d4ff5254843e9835() {

    // Act, creating object to test constructor
    final TestStaticVar actual = new TestStaticVar();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999fc18660e18ff5f7c() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    TestStaticVar.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
