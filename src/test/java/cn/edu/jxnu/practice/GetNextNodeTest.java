package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.GetNextNode;
import cn.edu.jxnu.practice.TreeLinkNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GetNextNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e65f87ad75434c30() {

    // Act, creating object to test constructor
    final GetNextNode actual = new GetNextNode();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNextInputNotNullOutputVoid99982ca506ef34e3097() {

    // Arrange
    final GetNextNode thisObj = new GetNextNode();
    final TreeLinkNode arg0 = new TreeLinkNode(1);

    // Act
    final TreeLinkNode actual = thisObj.getNext(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
