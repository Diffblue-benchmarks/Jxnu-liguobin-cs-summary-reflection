package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.PublicTreePrint;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PublicTreePrintTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99976e1821aaea6f9bb() {

    // Act, creating object to test constructor
    final PublicTreePrint actual = new PublicTreePrint();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void inTraverseBinTreeInputNotNullOutputVoid9997d524917b114f66c() {

    // Arrange
    final TreeNode arg0 = new TreeNode(1);

    // Act
    PublicTreePrint.inTraverseBinTree(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void postTraverseBinTreeInputNotNullOutputVoid999e2159c6073b63a9f() {

    // Arrange
    final TreeNode arg0 = new TreeNode(1);

    // Act
    PublicTreePrint.postTraverseBinTree(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void preTraverseBinTreeInputNotNullOutputVoid999121dbdf5c092ed52() {

    // Arrange
    final TreeNode arg0 = new TreeNode(1);

    // Act
    PublicTreePrint.preTraverseBinTree(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
