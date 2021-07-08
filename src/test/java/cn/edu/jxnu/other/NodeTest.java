package cn.edu.jxnu.other;

import cn.edu.jxnu.other.Node;
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
  public void constructorInputPositivePositiveOutputNotNull99983eed374daa83347() {

    // Arrange
    final int arg0 = 1;
    final int arg1 = 1;

    // Act, creating object to test constructor
    final Node actual = new Node(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.next);
    Assert.assertEquals(1, actual.value);
    Assert.assertEquals(1, actual.key);
    Assert.assertNull(actual.pre);

  }
}
