package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.IsSymmetrical;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsSymmetricalTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994c04cf08300673aa() {

    // Act, creating object to test constructor
    final IsSymmetrical actual = new IsSymmetrical();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSymmetricalInputNotNullNotNullOutputTrue999357fae9ac64a6998() {

    // Arrange
    final IsSymmetrical thisObj = new IsSymmetrical();
    final TreeNode arg0 = new TreeNode(0);
    final TreeNode arg1 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.isSymmetrical(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSymmetrical1InputNotNullOutputTrue99945e36ec95f9396de() {

    // Arrange
    final IsSymmetrical thisObj = new IsSymmetrical();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.isSymmetrical1(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSymmetrical2InputNotNullNotNullOutputTrue999b913ec273db2ac01() {

    // Arrange
    final IsSymmetrical thisObj = new IsSymmetrical();
    final TreeNode arg0 = new TreeNode(0);
    final TreeNode arg1 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.isSymmetrical2(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Mirror2InputNotNullOutputNotNull999f29bfa2eac777601() {

    // Arrange
    final IsSymmetrical thisObj = new IsSymmetrical();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final TreeNode actual = thisObj.Mirror2(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(0, actual.val);

  }
}
