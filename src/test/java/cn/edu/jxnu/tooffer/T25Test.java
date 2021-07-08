package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.RandomListNode;
import cn.edu.jxnu.tooffer.T25;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T25Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void CloneInputNotNullOutputNotNull999d380560868ad6763() {

    // Arrange
    final T25 thisObj = new T25();
    final RandomListNode arg0 = new RandomListNode(1);

    // Act
    final RandomListNode actual = thisObj.Clone(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertNull(actual.random);
    Assert.assertEquals(1, actual.label);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a33142d7f8b24c1e() {

    // Act, creating object to test constructor
    final T25 actual = new T25();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
