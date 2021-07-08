package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TreeNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputNotNull9997a5fa79e5ef47a9b() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    final TreeNode actual = new TreeNode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.right);
    Assert.assertNull(actual.left);
    Assert.assertEquals(0, actual.value);

  }
}
