package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.User;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996c4caec9c736619e() {

    // Act, creating object to test constructor
    final User actual = new User();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getUserName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9996c77082114c8d513() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final User actual = new User(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getUserName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getUserNameOutputVoid999a3527e1729c11a8d() {

    // Arrange
    final User thisObj = new User();

    // Act
    final String actual = thisObj.getUserName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setUserNameInputNotNullOutputVoid9995290e2e4a791be7f() {

    // Arrange
    final User thisObj = new User();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setUserName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getUserName());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999e7e657322cd13dc2() {

    // Arrange
    final User thisObj = new User();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("User [userId=null, userName=null]", actual);

  }
}
