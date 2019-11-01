package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava4;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava4Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99969680bb86069e9f1() {

    // Act, creating object to test constructor
    final TestJava4 actual = new TestJava4();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.mobUrlConfigVo);

  }

  // Test written by Diffblue Cover
  @Test
  public void testOutputVoid99973bc35af16cc05e8() {

    // Arrange
    final TestJava4 thisObj = new TestJava4();

    // Act
    thisObj.test();

    // Assert side effects
    Assert.assertNotNull(thisObj.mobUrlConfigVo);
    Assert.assertEquals("https://cmc.stu.126.net/u/json/cms/moocUrlRoutingConfigurationInfo.json", thisObj.mobUrlConfigVo.getResourceUrl());
    Assert.assertEquals("0", thisObj.mobUrlConfigVo.getVersion());

  }
}
