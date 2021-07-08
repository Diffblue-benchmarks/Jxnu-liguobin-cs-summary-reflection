package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T57;
import cn.edu.jxnu.tooffer.TreeLinkNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T57Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99918e39036505a0285() {

    // Act, creating object to test constructor
    final T57 actual = new T57();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void GetNextInputNotNullOutputVoid999fff58a66e86b2e95() {

    // Arrange
    final T57 thisObj = new T57();
    final TreeLinkNode arg0 = new TreeLinkNode(1);

    // Act
    final TreeLinkNode actual = thisObj.GetNext(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
