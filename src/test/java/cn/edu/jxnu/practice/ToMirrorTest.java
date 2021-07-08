package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.ToMirror;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ToMirrorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999773b5f795a9da7c3() {

    // Act, creating object to test constructor
    final ToMirror actual = new ToMirror();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mirrorInputNotNullOutputVoid9992048e338722cf0e4() {

    // Arrange
    final ToMirror thisObj = new ToMirror();
    final TreeNode arg0 = new TreeNode(1);

    // Act
    thisObj.mirror(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
