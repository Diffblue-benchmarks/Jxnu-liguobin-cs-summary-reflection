package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.LIS;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LISTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b0799140c790354b() {

    // Act, creating object to test constructor
    final LIS actual = new LIS();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lisInput8OutputPositive9994e1a983d6f1096d0() {

    // Arrange
    final LIS thisObj = new LIS();
    final int[] arg0 = { -5, -5, -5, -5, -5, -5, -5, -5 };

    // Act
    final int actual = thisObj.lis(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999ef863acfaa04b6cb() {

    // Arrange
    final String[] arg0 = { "\u6700\u5927\u9012\u589e\u5b50\u5e8f\u5217\u957f\u5ea6\u662f\uff1a", "\u6700\u5927\u9012\u589e\u5b50\u5e8f\u5217\u957f\u5ea6\u662f\uff1a", "\u6700\u5927\u9012\u589e\u5b50\u5e8f\u5217\u957f\u5ea6\u662f\uff1a" };

    // Act
    LIS.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
