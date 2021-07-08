package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.ListNode;
import cn.edu.jxnu.tooffer.T56;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T56Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ed4470d35eb01fc8() {

    // Act, creating object to test constructor
    final T56 actual = new T56();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void deleteDuplicationInputNotNullOutputNotNull999f6963cc083f50557() {

    // Arrange
    final T56 thisObj = new T56();
    final ListNode arg0 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.deleteDuplication(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(1, actual.val);

  }
}
