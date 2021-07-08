package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.ConvertBSTToList;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConvertBSTToListTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d401868530d06b49() {

    // Act, creating object to test constructor
    final ConvertBSTToList actual = new ConvertBSTToList();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.leftLast);
    Assert.assertNull(actual.head);
    Assert.assertNull(actual.realHead);

  }

  // Test written by Diffblue Cover
  @Test
  public void Convert1InputNotNullOutputNotNull999b419a2af3fb99763() {

    // Arrange
    final ConvertBSTToList thisObj = new ConvertBSTToList();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final TreeNode actual = thisObj.Convert1(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.realHead);
    Assert.assertNull(thisObj.realHead.left);
    Assert.assertNull(thisObj.realHead.right);
    Assert.assertEquals(0, thisObj.realHead.val);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(0, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void Convert2InputNotNullOutputNotNull999d25277b63be03986() {

    // Arrange
    final ConvertBSTToList thisObj = new ConvertBSTToList();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final TreeNode actual = thisObj.Convert2(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.leftLast);
    Assert.assertNull(thisObj.leftLast.left);
    Assert.assertNull(thisObj.leftLast.right);
    Assert.assertEquals(0, thisObj.leftLast.val);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(0, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void Convert3InputNotNullOutputNotNull9991fdd6de516df4ccc() {

    // Arrange
    final ConvertBSTToList thisObj = new ConvertBSTToList();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final TreeNode actual = thisObj.Convert3(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(0, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void ConvertBSTToBiListInputNotNullOutputNotNull99908e56d0b1d9ac95a() {

    // Arrange
    final ConvertBSTToList thisObj = new ConvertBSTToList();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final TreeNode actual = thisObj.ConvertBSTToBiList(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(0, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void ConvertInputNotNullOutputNotNull999b3d1aff066670541() {

    // Arrange
    final ConvertBSTToList thisObj = new ConvertBSTToList();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final TreeNode actual = thisObj.Convert(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.left);
    Assert.assertNull(actual.right);
    Assert.assertEquals(0, actual.val);

  }
}
