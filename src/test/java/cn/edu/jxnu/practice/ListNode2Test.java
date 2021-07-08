//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.ListNode2;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class ListNode2Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputPositiveOutputNotNull9996af42d83f09c0a17() {
//
//    // Arrange
//    final int arg0 = 1;
//
//    // Act, creating object to test constructor
//    final ListNode2 actual = new ListNode2(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.next);
//    Assert.assertEquals(1, actual.val);
//
//  }
//}
//