package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Add;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;



public class AddTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void compileInputNullOutputNullPointerException999d3103bf8ce0d8ef3() {

    // Arrange
    final Add thisObj = new Add(null, null);
    final MethodVisitor arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.compile(arg0);

    // The method is not expected to return due to exception thrown

  }
}
