//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.AddMinFunctionForStack;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.EmptyStackException;
//
//
//
//public class AddMinFunctionForStackTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999a2f84acc26fb1949() {
//
//    // Act, creating object to test constructor
//    final AddMinFunctionForStack actual = new AddMinFunctionForStack();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9995325c3ea16e3cb24() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    AddMinFunctionForStack.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void minOutputEmptyStackException9998be27982240695a7() {
//
//    // Arrange
//    final AddMinFunctionForStack thisObj = new AddMinFunctionForStack();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.min();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void popOutputEmptyStackException99982406e2469f3e0d0() {
//
//    // Arrange
//    final AddMinFunctionForStack thisObj = new AddMinFunctionForStack();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.pop();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void pushInputPositiveOutputVoid9994c602df585849c3b() {
//
//    // Arrange
//    final AddMinFunctionForStack thisObj = new AddMinFunctionForStack();
//    final int arg0 = 1;
//
//    // Act
//    thisObj.push(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void topOutputEmptyStackException999d5cbd3e7c8c6ab06() {
//
//    // Arrange
//    final AddMinFunctionForStack thisObj = new AddMinFunctionForStack();
//
//    // Act
//    thrown.expect(EmptyStackException.class);
//    thisObj.top();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//