package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.BFCompilerTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BFCompilerTestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void assertEqualsInputNotNullNotNullOutputVoid999f8e8e2da4e8a2a8b() {
//
//    // Arrange
//    final String arg0 = "";
//    final String arg1 = "";
//
//    // Act
//    BFCompilerTest.assertEquals(arg0, arg1);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a4be98b24931d480() throws Exception {

    // Act, creating object to test constructor
    final BFCompilerTest actual = new BFCompilerTest();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9997e0227ca07a756eb() throws Throwable {
//
//    // Arrange
//    final String[] arg0 = { "", "", "" };
//
//    // Act
//    BFCompilerTest.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testCompileEchoOutputVoid9991bed6787f978d23e() throws Throwable {
//
//    // Arrange
//    final BFCompilerTest thisObj = new BFCompilerTest();
//
//    // Act
//    thisObj.testCompileEcho();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testCompileHelloWorldOutputVoid9996005c8302f929d5d() throws Throwable {
//
//    // Arrange
//    final BFCompilerTest thisObj = new BFCompilerTest();
//
//    // Act
//    thisObj.testCompileHelloWorld();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testCompileTest1OutputVoid99913ed9422474804f5() throws Throwable {
//
//    // Arrange
//    final BFCompilerTest thisObj = new BFCompilerTest();
//
//    // Act
//    thisObj.testCompileTest1();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void testCompileYaPiOutputVoid99937b721cad3745b0d() throws Throwable {
//
//    // Arrange
//    final BFCompilerTest thisObj = new BFCompilerTest();
//
//    // Act
//    thisObj.testCompileYaPi();
//
//    // The method returns void, testing that no exception is thrown
//
//  }
}
