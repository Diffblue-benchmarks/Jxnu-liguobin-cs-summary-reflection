package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.TreeLinkNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TreeLinkNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull999b452e4b40be4db7e() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final TreeLinkNode actual = new TreeLinkNode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(1, actual.val);

  }
}
