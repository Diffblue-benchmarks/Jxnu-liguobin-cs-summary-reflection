//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.RESULT;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class RESULTTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9992562909656b3868e() {
//
//    // Act, creating object to test constructor
//    final RESULT actual = new RESULT();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, actual.maxDepth);
//    Assert.assertEquals(0, actual.maxDistance);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputPositivePositiveOutputNotNull999b6798d701f8a0ed3() {
//
//    // Arrange
//    final int arg0 = 1;
//    final int arg1 = 1;
//
//    // Act, creating object to test constructor
//    final RESULT actual = new RESULT(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(1, actual.maxDepth);
//    Assert.assertEquals(1, actual.maxDistance);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getnMaxDepthOutputZero99970ffdf18b2069678() {
//
//    // Arrange
//    final RESULT thisObj = new RESULT();
//
//    // Act
//    final int actual = thisObj.getnMaxDepth();
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getnMaxDistanceOutputZero99955f6e7f2aaf0dfa5() {
//
//    // Arrange
//    final RESULT thisObj = new RESULT();
//
//    // Act
//    final int actual = thisObj.getnMaxDistance();
//
//    // Assert result
//    Assert.assertEquals(0, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void setnMaxDepthInputPositiveOutputVoid999153d18729af361af() {
//
//    // Arrange
//    final RESULT thisObj = new RESULT();
//    final int arg0 = 1;
//
//    // Act
//    thisObj.setnMaxDepth(arg0);
//
//    // Assert side effects
//    Assert.assertEquals(1, thisObj.maxDepth);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void setnMaxDistanceInputPositiveOutputVoid999aea337ff5597b39a() {
//
//    // Arrange
//    final RESULT thisObj = new RESULT();
//    final int arg0 = 1;
//
//    // Act
//    thisObj.setnMaxDistance(arg0);
//
//    // Assert side effects
//    Assert.assertEquals(1, thisObj.maxDistance);
//
//  }
//}
//