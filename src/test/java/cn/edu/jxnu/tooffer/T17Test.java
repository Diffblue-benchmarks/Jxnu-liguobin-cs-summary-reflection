package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T17;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T17Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b807775bad0fc964() {

    // Act, creating object to test constructor
    final T17 actual = new T17();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void HasSubtreeInputNotNullNotNullOutputTrue999603d042cdfaa3a76() {

    // Arrange
    final T17 thisObj = new T17();
    final TreeNode arg0 = new TreeNode(0);
    final TreeNode arg1 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.HasSubtree(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSubTreeInputNotNullNotNullOutputTrue9991d2b5ee6fc7ba7c8() {

    // Arrange
    final TreeNode arg0 = new TreeNode(0);
    final TreeNode arg1 = new TreeNode(0);

    // Act
    final boolean actual = T17.isSubTree(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
