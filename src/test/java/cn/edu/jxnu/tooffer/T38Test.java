package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T38;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T38Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d468f437b97c467c() {

    // Act, creating object to test constructor
    final T38 actual = new T38();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void TreeDepthInputNotNullOutputPositive999d2cd6640fbe0715f() {

    // Arrange
    final T38 thisObj = new T38();
    final TreeNode arg0 = new TreeNode(1);

    // Act
    final int actual = thisObj.TreeDepth(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
