package cn.edu.jxnu.other;

import cn.edu.jxnu.other.MD5Tool;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MD5ToolTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99975b3bd4cd7e8fe56() {

    // Act, creating object to test constructor
    final MD5Tool actual = new MD5Tool();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99904c2410432aaebae() {

    // Arrange
    final String[] arg0 = { "abcdefh", "abcdefh", "abcdefh" };

    // Act
    MD5Tool.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void MD5InputNotNullOutputNotNull999c0fc182078050b7e() {

    // Arrange
    final String arg0 = "abcdefh";

    // Act
    final String actual = MD5Tool.MD5(arg0);

    // Assert result
    Assert.assertEquals("432AECAD47AB93EEB7784678D56A2C8A", actual);

  }
}
