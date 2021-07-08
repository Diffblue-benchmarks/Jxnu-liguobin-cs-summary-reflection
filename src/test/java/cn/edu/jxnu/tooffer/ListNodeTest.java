package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.ListNode;
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
  public void constructorInputPositiveOutputNotNull9996417ab96360cad60() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final ListNode actual = new ListNode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(1, actual.val);

  }
}
