package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.KthNode;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class KthNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99973040d02256df64a() {

    // Act, creating object to test constructor
    final KthNode actual = new KthNode();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void kThNodeInputNotNullZeroOutputVoid99932372a0575f9e6a4() {

    // Arrange
    final KthNode thisObj = new KthNode();
    final TreeNode arg0 = new TreeNode(0);
    final int arg1 = 0;

    // Act
    final TreeNode actual = thisObj.kThNode(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
