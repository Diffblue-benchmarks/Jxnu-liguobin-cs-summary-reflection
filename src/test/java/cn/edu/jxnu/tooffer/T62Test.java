package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T62;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T62Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e5ba55647da9b2dd() {

    // Act, creating object to test constructor
    final T62 actual = new T62();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.index);

  }

  // Test written by Diffblue Cover
  @Test
  public void KthNodeInputNotNullZeroOutputVoid999e7428860ab5b2db6() {

    // Arrange
    final T62 thisObj = new T62();
    final TreeNode arg0 = new TreeNode(0);
    final int arg1 = 0;

    // Act
    final TreeNode actual = thisObj.KthNode(arg0, arg1);

    // Assert side effects
    Assert.assertEquals(1, thisObj.index);

  }
}
