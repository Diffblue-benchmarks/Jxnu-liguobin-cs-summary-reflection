package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.IsBalanced_Solution;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class IsBalanced_SolutionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a6d5ae2dd45f817b() {

    // Act, creating object to test constructor
    final IsBalanced_Solution actual = new IsBalanced_Solution();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isBalanced_SolutionInputNotNullOutputTrue9992753251df74e8ce7() {

    // Arrange
    final IsBalanced_Solution thisObj = new IsBalanced_Solution();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final boolean actual = thisObj.isBalanced_Solution(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
