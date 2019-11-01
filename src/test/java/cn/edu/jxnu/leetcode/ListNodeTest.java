package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ListNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputNotNull9992e4f85474be6b215() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    final ListNode actual = new ListNode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(0, actual.value);

  }
}
