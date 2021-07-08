package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Node;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void compareToInputNotNullOutputZero9994b2bcd2e3545cad0() {

    // Arrange
    final Node thisObj = new Node(1, 1);
    final Node arg0 = new Node(1, 1);

    // Act
    final int actual = thisObj.compareTo(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositivePositiveOutputNotNull999a5673dad3b372b81() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act, creating object to test constructor
    final Node actual = new Node(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.id);
    Assert.assertEquals(1, actual.val);

  }
}
