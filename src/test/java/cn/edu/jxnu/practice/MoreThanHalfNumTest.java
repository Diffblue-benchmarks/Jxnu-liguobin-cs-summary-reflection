package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.MoreThanHalfNum;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MoreThanHalfNumTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995181609552676966() {

    // Act, creating object to test constructor
    final MoreThanHalfNum actual = new MoreThanHalfNum();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void MoreThanHalfNum_SolutionInput8OutputZero9993d9f153471376202() {

    // Arrange
    final MoreThanHalfNum thisObj = new MoreThanHalfNum();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };

    // Act
    final int actual = thisObj.MoreThanHalfNum_Solution(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
