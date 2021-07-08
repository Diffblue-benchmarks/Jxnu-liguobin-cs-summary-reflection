package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FindFirstCommon;
import cn.edu.jxnu.practice.ListNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FindFirstCommonTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994ca6834cce90f36b() {

    // Act, creating object to test constructor
    final FindFirstCommon actual = new FindFirstCommon();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void FindFirstCommonNode2InputNotNullNotNullOutputVoid9994a887ea07b35f0e9() {

    // Arrange
    final FindFirstCommon thisObj = new FindFirstCommon();
    final ListNode arg0 = new ListNode(1);
    final ListNode arg1 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.FindFirstCommonNode2(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void FindFirstCommonNode3InputNotNullNotNullOutputVoid9993879ea38121ff848() {

    // Arrange
    final FindFirstCommon thisObj = new FindFirstCommon();
    final ListNode arg0 = new ListNode(1);
    final ListNode arg1 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.FindFirstCommonNode3(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void FindFirstCommonNodeInputNotNullNotNullOutputNotNull9990c116ad6a844769a() {

    // Arrange
    final FindFirstCommon thisObj = new FindFirstCommon();
    final ListNode arg0 = new ListNode(1);
    final ListNode arg1 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.FindFirstCommonNode(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(1, actual.val);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLengthInputNotNullOutputPositive999e432bd9d2b00e0cd() {

    // Arrange
    final FindFirstCommon thisObj = new FindFirstCommon();
    final ListNode arg0 = new ListNode(1);

    // Act
    final int actual = thisObj.getLength(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }
}
