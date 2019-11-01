package cn.edu.jxnu.other;

import cn.edu.jxnu.other.MobUrlConfigVo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MobUrlConfigVoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998f0b830ea02615aa() {

    // Act, creating object to test constructor
    final MobUrlConfigVo actual = new MobUrlConfigVo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getResourceUrl());
    Assert.assertNull(actual.getVersion());

  }

  // Test written by Diffblue Cover
  @Test
  public void getResourceUrlOutputVoid9994217cde065aa71e2() {

    // Arrange
    final MobUrlConfigVo thisObj = new MobUrlConfigVo();

    // Act
    final String actual = thisObj.getResourceUrl();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getVersionOutputVoid999830abb7e2ba7c9be() {

    // Arrange
    final MobUrlConfigVo thisObj = new MobUrlConfigVo();

    // Act
    final String actual = thisObj.getVersion();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setResourceUrlInputNotNullOutputVoid9993e65bb05167f0ca9() {

    // Arrange
    final MobUrlConfigVo thisObj = new MobUrlConfigVo();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setResourceUrl(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getResourceUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void setVersionInputNotNullOutputVoid999e676f80af65de0be() {

    // Arrange
    final MobUrlConfigVo thisObj = new MobUrlConfigVo();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setVersion(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getVersion());

  }
}
