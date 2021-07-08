package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Exp;
import cn.edu.jxnu.reflect.Not;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;



public class NotTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void compileInputNullOutputNullPointerException999b086d1ce71b9ce32() {

    // Arrange
    final Not thisObj = new Not(null);
    final MethodVisitor arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.compile(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNotNull999992998a2bd2f1e77() {

    // Arrange
    final Exp arg0 = null;

    // Act, creating object to test constructor
    final Not actual = new Not(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.e);

  }
}
