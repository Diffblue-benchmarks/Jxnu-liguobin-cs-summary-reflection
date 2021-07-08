package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.SecondLargeNumbers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SecondLargeNumbersTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99908432a270bc6b37a() {

    // Act, creating object to test constructor
    final SecondLargeNumbers actual = new SecondLargeNumbers();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
