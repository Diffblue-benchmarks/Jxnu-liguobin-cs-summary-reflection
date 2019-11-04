package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Compile;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CompileTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNull999c9732c8b5411e994() {
//
//    // Act, creating object to test constructor
//    final Compile actual = new Compile();
//
//    // Assert result
//    Assert.assertNull(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputClassFormatError9999f7eccc3be0ac062() throws Exception {

    // Arrange
    final String[] arg0 = { "Example", "Example", "Example" };

    // Act
    thrown.expect(ClassFormatError.class);
    Compile.main(arg0);

    // The method is not expected to return due to exception thrown

  }
}
