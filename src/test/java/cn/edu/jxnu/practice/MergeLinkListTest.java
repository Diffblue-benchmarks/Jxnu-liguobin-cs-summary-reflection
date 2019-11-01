package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.ListNode;
import cn.edu.jxnu.practice.MergeLinkList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MergeLinkListTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fa5b01783a25e912() {

    // Act, creating object to test constructor
    final MergeLinkList actual = new MergeLinkList();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void Merge2InputNotNullNotNullOutputNotNull99950619076b7970533() {

    // Arrange
    final MergeLinkList thisObj = new MergeLinkList();
    final ListNode arg0 = new ListNode(1);
    final ListNode arg1 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.Merge2(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg1);
    Assert.assertNotNull(arg1.next);
    Assert.assertNull(arg1.next.next);
    Assert.assertEquals(1, arg1.next.val);
    Assert.assertEquals(1, arg1.val);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.next);
    Assert.assertNull(actual.next.next);
    Assert.assertEquals(1, actual.next.val);
    Assert.assertEquals(1, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void MergeInputNotNullNotNullOutputNotNull99941c98066d8b953a3() {

    // Arrange
    final MergeLinkList thisObj = new MergeLinkList();
    final ListNode arg0 = new ListNode(1);
    final ListNode arg1 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.Merge(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg0);
    Assert.assertNotNull(arg0.next);
    Assert.assertNull(arg0.next.next);
    Assert.assertEquals(1, arg0.next.val);
    Assert.assertEquals(1, arg0.val);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.next);
    Assert.assertNull(actual.next.next);
    Assert.assertEquals(1, actual.next.val);
    Assert.assertEquals(1, actual.val);

  }
}
