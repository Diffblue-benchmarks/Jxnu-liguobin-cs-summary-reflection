package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestMain3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d54ae4226d892124() {

    // Act, creating object to test constructor
    final TestMain3 actual = new TestMain3();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void dfsInputZeroZeroOutputVoid9995db6ba67e97ec406() {

    // Arrange
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    TestMain3.dfs(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
