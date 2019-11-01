package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.ListNode;
import cn.edu.jxnu.leetcode.ListNodeConstants;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ListNodeConstantsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c7e6a415f56005b5() {

    // Act, creating object to test constructor
    final ListNodeConstants actual = new ListNodeConstants();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHasDuplicateOutputNotNull9995a3674e4db9aa61f() {

    // Act
    final ListNode actual = ListNodeConstants.getHasDuplicate();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.next);
    Assert.assertNotNull(actual.next.next);
    Assert.assertNotNull(actual.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next.next);
    Assert.assertNull(actual.next.next.next.next.next.next);
    Assert.assertEquals(6, actual.next.next.next.next.next.value);
    Assert.assertEquals(6, actual.next.next.next.next.value);
    Assert.assertEquals(6, actual.next.next.next.value);
    Assert.assertEquals(4, actual.next.next.value);
    Assert.assertEquals(3, actual.next.value);
    Assert.assertEquals(1, actual.value);

  }

  // Test written by Diffblue Cover
  @Test
  public void getListNodeOneOutputNotNull999090ce69c5d058808() {

    // Act
    final ListNode actual = ListNodeConstants.getListNodeOne();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.next);
    Assert.assertNotNull(actual.next.next);
    Assert.assertNotNull(actual.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next.next.next.next);
    Assert.assertNull(actual.next.next.next.next.next.next.next.next);
    Assert.assertEquals(6, actual.next.next.next.next.next.next.next.value);
    Assert.assertEquals(2, actual.next.next.next.next.next.next.value);
    Assert.assertEquals(10, actual.next.next.next.next.next.value);
    Assert.assertEquals(4, actual.next.next.next.next.value);
    Assert.assertEquals(0, actual.next.next.next.value);
    Assert.assertEquals(90, actual.next.next.value);
    Assert.assertEquals(8, actual.next.value);
    Assert.assertEquals(7, actual.value);

  }

  // Test written by Diffblue Cover
  @Test
  public void getListNodeTwoOutputNotNull999029c63bb82bc59a6() {

    // Act
    final ListNode actual = ListNodeConstants.getListNodeTwo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.next);
    Assert.assertNotNull(actual.next.next);
    Assert.assertNotNull(actual.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next.next.next);
    Assert.assertNotNull(actual.next.next.next.next.next.next.next);
    Assert.assertNull(actual.next.next.next.next.next.next.next.next);
    Assert.assertEquals(6, actual.next.next.next.next.next.next.next.value);
    Assert.assertEquals(2, actual.next.next.next.next.next.next.value);
    Assert.assertEquals(10, actual.next.next.next.next.next.value);
    Assert.assertEquals(4, actual.next.next.next.next.value);
    Assert.assertEquals(0, actual.next.next.next.value);
    Assert.assertEquals(90, actual.next.next.value);
    Assert.assertEquals(8, actual.next.value);
    Assert.assertEquals(7, actual.value);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderListAOutputNotNull999a5102637737bdc04() {

    // Act
    final ListNode actual = ListNodeConstants.getOrderListA();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.next);
    Assert.assertNotNull(actual.next.next);
    Assert.assertNotNull(actual.next.next.next);
    Assert.assertNull(actual.next.next.next.next);
    Assert.assertEquals(10, actual.next.next.next.value);
    Assert.assertEquals(9, actual.next.next.value);
    Assert.assertEquals(8, actual.next.value);
    Assert.assertEquals(7, actual.value);

  }

  // Test written by Diffblue Cover
  @Test
  public void getOrderListBOutputNotNull9995c88e93dbdcd0257() {

    // Act
    final ListNode actual = ListNodeConstants.getOrderListB();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.next);
    Assert.assertNotNull(actual.next.next);
    Assert.assertNotNull(actual.next.next.next);
    Assert.assertNull(actual.next.next.next.next);
    Assert.assertEquals(6, actual.next.next.next.value);
    Assert.assertEquals(4, actual.next.next.value);
    Assert.assertEquals(3, actual.next.value);
    Assert.assertEquals(1, actual.value);

  }
}
