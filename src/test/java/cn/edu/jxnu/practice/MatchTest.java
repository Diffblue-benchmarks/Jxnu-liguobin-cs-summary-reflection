package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Match;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MatchTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99967aca75212f07083() {

    // Act, creating object to test constructor
    final Match actual = new Match();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void matchInput88OutputTrue9993444cccaded2399d() {

    // Arrange
    final Match thisObj = new Match();
    final char[] arg0 = { '*', '*', '*', '*', '*', '*', '*', '*' };
    final char[] arg1 = { '*', '*', '*', '*', '*', '*', '*', '*' };

    // Act
    final boolean actual = thisObj.match(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }
}
