package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T4;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997ee149e00824e0c7() {

    // Act, creating object to test constructor
    final T4 actual = new T4();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reConstructBinaryTreeInput88OutputNotNull999d905d5acc74dbc41() {

    // Arrange
    final T4 thisObj = new T4();
    final int[] arg0 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    final int[] arg1 = { 1, 1, 1, 1, 1, 1, 1, 1 };

    // Act
    final TreeNode actual = thisObj.reConstructBinaryTree(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.left);
    Assert.assertNotNull(actual.left.left);
    Assert.assertNotNull(actual.left.left.left);
    Assert.assertNotNull(actual.left.left.left.left);
    Assert.assertNotNull(actual.left.left.left.left.left);
    Assert.assertNotNull(actual.left.left.left.left.left.left);
    Assert.assertNotNull(actual.left.left.left.left.left.left.left);
    Assert.assertNull(actual.left.left.left.left.left.left.left.left);
    Assert.assertNull(actual.left.left.left.left.left.left.left.right);
    Assert.assertEquals(1, actual.left.left.left.left.left.left.left.val);
    Assert.assertNull(actual.left.left.left.left.left.left.right);
    Assert.assertEquals(1, actual.left.left.left.left.left.left.val);
    Assert.assertNull(actual.left.left.left.left.left.right);
    Assert.assertEquals(1, actual.left.left.left.left.left.val);
    Assert.assertNull(actual.left.left.left.left.right);
    Assert.assertEquals(1, actual.left.left.left.left.val);
    Assert.assertNull(actual.left.left.left.right);
    Assert.assertEquals(1, actual.left.left.left.val);
    Assert.assertNull(actual.left.left.right);
    Assert.assertEquals(1, actual.left.left.val);
    Assert.assertNull(actual.left.right);
    Assert.assertEquals(1, actual.left.val);
    Assert.assertNull(actual.right);
    Assert.assertEquals(1, actual.val);

  }
}
