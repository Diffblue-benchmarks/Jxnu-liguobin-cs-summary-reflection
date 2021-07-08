package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.ListNode;
import cn.edu.jxnu.tooffer.T15;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T15Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999faabc8dae0125640() {

    // Act, creating object to test constructor
    final T15 actual = new T15();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void ReverseListInputNotNullOutputNotNull999b0ff42d9d910e5da() {

    // Arrange
    final T15 thisObj = new T15();
    final ListNode arg0 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.ReverseList(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(1, actual.val);

  }
}
