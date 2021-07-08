package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T18;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T18Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99959debfd9b49f297f() {

    // Act, creating object to test constructor
    final T18 actual = new T18();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void MirrorInputNotNullOutputVoid9999d6a8e169ea20eb0() {

    // Arrange
    final T18 thisObj = new T18();
    final TreeNode arg0 = new TreeNode(1);

    // Act
    thisObj.Mirror(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
