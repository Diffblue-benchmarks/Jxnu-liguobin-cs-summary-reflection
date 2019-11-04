package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Annotations;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AnnotationsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99971642f3650f43055() {

    // Act, creating object to test constructor
    final Annotations actual = new Annotations();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fooInputNotNullOutputVoid999008b86254d08bd6a() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    Annotations.foo(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9999b2212221eb7af09() throws Exception {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    Annotations.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
