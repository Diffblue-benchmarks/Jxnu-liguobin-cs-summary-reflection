package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Creator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CreatorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99922147c3a6760165c() {

    // Act, creating object to test constructor
    final Creator actual = new Creator();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
