package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Adapt;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AdaptTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNull99926ec83c585bcd128() {
//
//    // Act, creating object to test constructor
//    final Adapt actual = new Adapt();
//
//    // Assert result
//    Assert.assertNull(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputClassNotFoundException999b653616ba20db180() throws Exception {

    // Arrange
    final String[] arg0 = { "' with on the fly adaptation", "' with on the fly adaptation", "' with on the fly adaptation" };

    // Act
    thrown.expect(ClassNotFoundException.class);
    Adapt.main(arg0);

    // The method is not expected to return due to exception thrown

  }
}
