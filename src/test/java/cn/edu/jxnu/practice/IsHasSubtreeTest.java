package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.IsHasSubtree;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsHasSubtreeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999267015ee98fc63b2() {

    // Act, creating object to test constructor
    final IsHasSubtree actual = new IsHasSubtree();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void HasSubtree2InputNotNullNotNullOutputTrue999cf1f3ebdc6d1af12() {

    // Arrange
    final IsHasSubtree thisObj = new IsHasSubtree();
    final TreeNode arg0 = new TreeNode(0);
    final TreeNode arg1 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.HasSubtree2(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hasSubtreeInputNotNullNotNullOutputTrue9990a242c158cc6da35() {

    // Arrange
    final IsHasSubtree thisObj = new IsHasSubtree();
    final TreeNode arg0 = new TreeNode(0);
    final TreeNode arg1 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.hasSubtree(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
