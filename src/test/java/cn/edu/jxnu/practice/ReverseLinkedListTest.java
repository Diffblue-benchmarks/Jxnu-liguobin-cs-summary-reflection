package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.ListNode;
import cn.edu.jxnu.practice.ReverseLinkedList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReverseLinkedListTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f874ec3a702d7434() {

    // Act, creating object to test constructor
    final ReverseLinkedList actual = new ReverseLinkedList();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99980fd49857d9141ad() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    ReverseLinkedList.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseList2InputNotNullOutputNotNull9991a32d7471ec5d704() {

    // Arrange
    final ListNode arg0 = new ListNode(-1);

    // Act
    final ListNode actual = ReverseLinkedList.reverseList2(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(-1, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseList3InputNotNullOutputNotNull999c330c7fc44054379() {

    // Arrange
    final ListNode arg0 = new ListNode(-1);

    // Act
    final ListNode actual = ReverseLinkedList.reverseList3(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(-1, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseListInputNotNullOutputNotNull999468f805e0a0c2b02() {

    // Arrange
    final ListNode arg0 = new ListNode(-1);

    // Act
    final ListNode actual = ReverseLinkedList.reverseList(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(-1, actual.val);

  }
}
