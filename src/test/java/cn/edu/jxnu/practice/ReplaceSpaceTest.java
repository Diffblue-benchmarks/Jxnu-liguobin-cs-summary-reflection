package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.ReplaceSpace;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReplaceSpaceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992885b644d6569243() {

    // Act, creating object to test constructor
    final ReplaceSpace actual = new ReplaceSpace();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void replaceSpaceInputNotNullOutputNotNull999a3718694c79792ff() {

    // Arrange
    final StringBuffer arg0 = new StringBuffer();

    // Act
    final String actual = ReplaceSpace.replaceSpace(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }
}
