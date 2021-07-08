package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.RebuildBinaryTree;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class RebuildBinaryTreeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bbbf40029b3e34fe() {

    // Act, creating object to test constructor
    final RebuildBinaryTree actual = new RebuildBinaryTree();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reConstructBinaryTree2Input88OutputArrayIndexOutOfBoundsException999dd568b31cc62ddfc() {

    // Arrange
    final RebuildBinaryTree thisObj = new RebuildBinaryTree();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int[] arg1 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.reConstructBinaryTree2(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reConstructBinaryTreeInput88OutputNotNull999e6ca9ed5e7748ff2() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int[] arg1 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final TreeNode actual = RebuildBinaryTree.reConstructBinaryTree(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNotNull(actual.right);
    Assert.assertNull(actual.right.left);
    Assert.assertNotNull(actual.right.right);
    Assert.assertNull(actual.right.right.left);
    Assert.assertNotNull(actual.right.right.right);
    Assert.assertNull(actual.right.right.right.left);
    Assert.assertNotNull(actual.right.right.right.right);
    Assert.assertNull(actual.right.right.right.right.left);
    Assert.assertNotNull(actual.right.right.right.right.right);
    Assert.assertNull(actual.right.right.right.right.right.left);
    Assert.assertNotNull(actual.right.right.right.right.right.right);
    Assert.assertNull(actual.right.right.right.right.right.right.left);
    Assert.assertNotNull(actual.right.right.right.right.right.right.right);
    Assert.assertNull(actual.right.right.right.right.right.right.right.left);
    Assert.assertNull(actual.right.right.right.right.right.right.right.right);
    Assert.assertEquals(0, actual.right.right.right.right.right.right.right.val);
    Assert.assertEquals(0, actual.right.right.right.right.right.right.val);
    Assert.assertEquals(0, actual.right.right.right.right.right.val);
    Assert.assertEquals(0, actual.right.right.right.right.val);
    Assert.assertEquals(0, actual.right.right.right.val);
    Assert.assertEquals(0, actual.right.right.val);
    Assert.assertEquals(0, actual.right.val);
    Assert.assertEquals(0, actual.val);

  }
}
