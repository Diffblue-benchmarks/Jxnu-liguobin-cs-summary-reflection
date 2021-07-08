package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.HasPathInMatrix;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HasPathInMatrixTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99965edcea6612d9780() {

    // Act, creating object to test constructor
    final HasPathInMatrix actual = new HasPathInMatrix();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasPathInput8ZeroZero8OutputFalse999ae7b22cb0cc66465() {

    // Arrange
    final HasPathInMatrix thisObj = new HasPathInMatrix();
    final char[] arg0 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final int arg1 = 0;
    final int arg2 = 0;
    final char[] arg3 = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };

    // Act
    final boolean actual = thisObj.hasPath(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertFalse(actual);

  }
}
