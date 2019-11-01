package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.GT;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;



public class GTTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void compileInputNullOutputNullPointerException99905329f5fab1f03d7() {

    // Arrange
    final GT thisObj = new GT(null, null);
    final MethodVisitor arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.compile(arg0);

    // The method is not expected to return due to exception thrown

  }
}
