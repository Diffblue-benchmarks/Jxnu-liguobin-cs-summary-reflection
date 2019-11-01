package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.TreeNode;
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
  public void constructorInputPositiveOutputNotNull9992d84d541c86190ec() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final TreeNode actual = new TreeNode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(1, actual.val);

  }
}
