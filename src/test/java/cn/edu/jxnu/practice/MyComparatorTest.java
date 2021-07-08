package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.MyComparator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MyComparatorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void compareInputNotNullNotNullOutputZero9997d16bee7c8659805() {

    // Arrange
    final MyComparator thisObj = new MyComparator();
    final Character arg0 = new Character('c');
    final Character arg1 = new Character('c');

    // Act
    final int actual = thisObj.compare(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99908aea0ff9e023a6e() {

    // Act, creating object to test constructor
    final MyComparator actual = new MyComparator();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
