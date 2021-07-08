package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T58;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T58Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c871a0e273041e0e() {

    // Act, creating object to test constructor
    final T58 actual = new T58();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSymmetricalInputNotNullOutputTrue999a78fcd8dc7749147() {

    // Arrange
    final T58 thisObj = new T58();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.isSymmetrical(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
