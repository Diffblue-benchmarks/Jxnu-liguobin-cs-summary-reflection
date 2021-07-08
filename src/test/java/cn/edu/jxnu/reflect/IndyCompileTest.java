package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.IndyCompile.Add;
import cn.edu.jxnu.reflect.IndyCompile.And;
import cn.edu.jxnu.reflect.IndyCompile.Exp;
import cn.edu.jxnu.reflect.IndyCompile.GT;
import cn.edu.jxnu.reflect.IndyCompile.Mul;
import cn.edu.jxnu.reflect.IndyCompile.Not;
import cn.edu.jxnu.reflect.IndyCompile.Or;
import cn.edu.jxnu.reflect.IndyCompile.Var;
import cn.edu.jxnu.reflect.IndyCompile;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;



public class IndyCompileTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNullOutputNotNull999617b94c4d56d3733() {

    // Arrange
    final Exp arg0 = null;
    final Exp arg1 = null;

    // Act, creating object to test constructor
    final Add actual = new Add(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.e1);
    Assert.assertNull(actual.e2);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNullOutputNotNull999a51c2311a52bd8b0() {

    // Arrange
    final Exp arg0 = null;
    final Exp arg1 = null;

    // Act, creating object to test constructor
    final And actual = new And(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.e1);
    Assert.assertNull(actual.e2);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNullOutputNotNull9999dfd31e6c34dc2ce() {

    // Arrange
    final Exp arg0 = null;
    final Exp arg1 = null;

    // Act, creating object to test constructor
    final GT actual = new GT(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.e1);
    Assert.assertNull(actual.e2);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNull999185ea3c98254a419() {
//
//    // Act, creating object to test constructor
//    final IndyCompile actual = new IndyCompile();
//
//    // Assert result
//    Assert.assertNull(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNullOutputNotNull999902655f1ee606c79() {

    // Arrange
    final Exp arg0 = null;
    final Exp arg1 = null;

    // Act, creating object to test constructor
    final Mul actual = new Mul(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.e1);
    Assert.assertNull(actual.e2);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxVarIndexOutputNullPointerException999c00adcf9caee21f4() {

    // Arrange
    final Not thisObj = new Not(null);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getMaxVarIndex();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNullOutputNotNull99919fe74c19e25ec39() {

    // Arrange
    final Exp arg0 = null;
    final Exp arg1 = null;

    // Act, creating object to test constructor
    final Or actual = new Or(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.e1);
    Assert.assertNull(actual.e2);

  }

  // Test written by Diffblue Cover
  @Test
  public void compileInputNullOutputNullPointerException9997e978dfc6652bc4e() {

    // Arrange
    final Var thisObj = new Var(25);
    final MethodVisitor arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.compile(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull9992f9ecf3f084d118c() {

    // Arrange
    final int arg0 = 25;

    // Act, creating object to test constructor
    final Var actual = new Var(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(25, actual.getMaxVarIndex());

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxVarIndexOutputPositive999beb8c1511f5bd9f5() {

    // Arrange
    final Var thisObj = new Var(25);

    // Act
    final int actual = thisObj.getMaxVarIndex();

    // Assert result
    Assert.assertEquals(25, actual);

  }
}
