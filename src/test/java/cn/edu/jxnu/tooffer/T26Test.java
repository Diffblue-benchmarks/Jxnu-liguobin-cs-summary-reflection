package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T26;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T26Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c2fcd6e36137d7f9() {

    // Act, creating object to test constructor
    final T26 actual = new T26();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void ConvertInputNotNullOutputNotNull999350da2bc02b07bcd() {

    // Arrange
    final T26 thisObj = new T26();
    final TreeNode arg0 = new TreeNode(1);

    // Act
    final TreeNode actual = thisObj.Convert(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(1, actual.val);

  }
}
