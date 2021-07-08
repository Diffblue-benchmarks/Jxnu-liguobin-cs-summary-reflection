package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.CharSort;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CharSortTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999beac45bcc852618d() {

    // Act, creating object to test constructor
    final CharSort actual = new CharSort();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
