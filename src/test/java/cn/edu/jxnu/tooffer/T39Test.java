package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T39;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T39Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a41d90adb0c8516a() {

    // Act, creating object to test constructor
    final T39 actual = new T39();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void IsBalanced_SolutionInputNotNullOutputTrue999c2708e9ead638329() {

    // Arrange
    final T39 thisObj = new T39();
    final TreeNode arg0 = new TreeNode(1);

    // Act
    final boolean actual = thisObj.IsBalanced_Solution(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}
