//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.RandomListDemo;
//import cn.edu.jxnu.practice.RandomListNode;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class RandomListDemoTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void Clone1InputNotNullOutputNotNull9999c03248e0fe348c6() {
//
//    // Arrange
//    final RandomListDemo thisObj = new RandomListDemo();
//    final RandomListNode arg0 = new RandomListNode(1);
//
//    // Act
//    final RandomListNode actual = thisObj.Clone1(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.next);
//    Assert.assertNull(actual.random);
//    Assert.assertEquals(1, actual.label);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void CloneInputNotNullOutputNotNull999d8e81c7522f1f444() {
//
//    // Arrange
//    final RandomListDemo thisObj = new RandomListDemo();
//    final RandomListNode arg0 = new RandomListNode(1);
//
//    // Act
//    final RandomListNode actual = thisObj.Clone(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.next);
//    Assert.assertNull(actual.random);
//    Assert.assertEquals(1, actual.label);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9992221679ea638b627() {
//
//    // Act, creating object to test constructor
//    final RandomListDemo actual = new RandomListDemo();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//}
//