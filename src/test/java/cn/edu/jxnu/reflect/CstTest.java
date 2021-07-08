package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Cst;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;



public class CstTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void compileInputNullOutputNullPointerException999269b728be7cf851a() {

    // Arrange
    final Cst thisObj = new Cst(1);
    final MethodVisitor arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.compile(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull999fedc93e3028012a0() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final Cst actual = new Cst(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.value);

  }
}
