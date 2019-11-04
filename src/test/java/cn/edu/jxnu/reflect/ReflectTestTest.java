package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.ReflectTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReflectTestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull9998e917394dab2d1fd() {

    // Arrange
    final String arg0 = "24";
    final String arg1 = "24";

    // Act, creating object to test constructor
    final ReflectTest actual = new ReflectTest(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("24", actual.getAge());
    Assert.assertEquals("24", actual.getName());

  }

  // Test written by Diffblue Cover
  @Test
  public void funInputNotNullOutputIllegalAccessException9993e7806817c47cb03() throws Exception {

    // Arrange
    final Object arg0 = "24";

    // Act
    thrown.expect(IllegalAccessException.class);
    ReflectTest.fun(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getAgeOutputNotNull999ca6f9debbd1563f0() {

    // Arrange
    final ReflectTest thisObj = new ReflectTest("24", "24");

    // Act
    final String actual = thisObj.getAge();

    // Assert result
    Assert.assertEquals("24", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNameOutputNotNull9990c1b795619de57d6() {

    // Arrange
    final ReflectTest thisObj = new ReflectTest("24", "24");

    // Act
    final String actual = thisObj.getName();

    // Assert result
    Assert.assertEquals("24", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99964cfa0081417c399() {

    // Arrange
    final String[] arg0 = { "24", "24", "24" };

    // Act
    ReflectTest.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setAgeInputNotNullOutputVoid999b1b72dadd340204e() {

    // Arrange
    final ReflectTest thisObj = new ReflectTest("24", "24");
    final String arg0 = "24";

    // Act
    thisObj.setAge(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setNameInputNotNullOutputVoid9990f24ab472ef2b344() {

    // Arrange
    final ReflectTest thisObj = new ReflectTest("24", "24");
    final String arg0 = "24";

    // Act
    thisObj.setName(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
