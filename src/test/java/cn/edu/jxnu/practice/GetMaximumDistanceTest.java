//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.GetMaximumDistance;
//import cn.edu.jxnu.practice.RESULT;
//import cn.edu.jxnu.practice.TreeNode;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class GetMaximumDistanceTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999ef4e6e109122fa50() {
//
//    // Act, creating object to test constructor
//    final GetMaximumDistance actual = new GetMaximumDistance();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getMaximumDistanceInputNotNullOutputNotNull999c523f40ba15ca61e() {
//
//    // Arrange
//    final TreeNode arg0 = new TreeNode(-1);
//
//    // Act
//    final RESULT actual = GetMaximumDistance.getMaximumDistance(arg0);
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
//  public void mainInput3OutputVoid999e59c6bdc8d039c73() {
//
//    // Arrange
//    final String[] arg0 = { "max distance-->", "max distance-->", "max distance-->" };
//
//    // Act
//    GetMaximumDistance.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//