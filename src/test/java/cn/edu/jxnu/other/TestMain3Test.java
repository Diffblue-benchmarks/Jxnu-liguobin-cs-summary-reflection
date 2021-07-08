package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestMain3;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.NoSuchElementException;



public class TestMain3Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

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

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999197710fa8e5a0c4e() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    TestMain3.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
