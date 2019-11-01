package cn.edu.jxnu.other;

import cn.edu.jxnu.other.BB;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BBTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99983664d4b1af8e674() {

    // Act, creating object to test constructor
    final BB actual = new BB();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
