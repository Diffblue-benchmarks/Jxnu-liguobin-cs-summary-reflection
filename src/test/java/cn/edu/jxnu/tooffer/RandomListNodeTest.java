package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.RandomListNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RandomListNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull999e0caa7b5c4413271() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final RandomListNode actual = new RandomListNode(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertNull(actual.random);
    Assert.assertEquals(1, actual.label);

  }
}
