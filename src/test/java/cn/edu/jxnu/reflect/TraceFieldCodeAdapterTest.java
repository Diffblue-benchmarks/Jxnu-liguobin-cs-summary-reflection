package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.TraceFieldCodeAdapter;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;



public class TraceFieldCodeAdapterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNullNotNullOutputNotNull999962388eaf5c5a649() {
//
//    // Arrange
//    final MethodVisitor arg0 = null;
//    final String arg1 = ")V";
//
//    // Act, creating object to test constructor
//    final TraceFieldCodeAdapter actual = new TraceFieldCodeAdapter(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(262_144, Reflector.getInstanceField(actual, "api"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "mv"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void visitFieldInsnInputPositiveNotNullNotNullNotNullOutputVoid99963c931316f01928a() {

    // Arrange
    final TraceFieldCodeAdapter thisObj = new TraceFieldCodeAdapter(null, ")V");
    final int arg0 = 180;
    final String arg1 = ")V";
    final String arg2 = ")V";
    final String arg3 = ")V";

    // Act
    thisObj.visitFieldInsn(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }
}
