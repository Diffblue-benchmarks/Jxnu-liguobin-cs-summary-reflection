package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.DeleteDuplication;
import cn.edu.jxnu.practice.ListNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DeleteDuplicationTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995a849ae453a11d82() {

    // Act, creating object to test constructor
    final DeleteDuplication actual = new DeleteDuplication();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void deleteDuplicationInputNotNullOutputNotNull9997dc7f8e9ee04c948() {

    // Arrange
    final DeleteDuplication thisObj = new DeleteDuplication();
    final ListNode arg0 = new ListNode(0);

    // Act
    final ListNode actual = thisObj.deleteDuplication(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(0, actual.val);

  }
}
