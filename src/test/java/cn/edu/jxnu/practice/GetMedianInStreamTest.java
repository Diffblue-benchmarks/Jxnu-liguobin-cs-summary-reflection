//package cn.edu.jxnu.practice;
//
//import cn.edu.jxnu.practice.GetMedianInStream;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class GetMedianInStreamTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999deb7a9274b2a42be() {
//
//    // Act, creating object to test constructor
//    final GetMedianInStream actual = new GetMedianInStream();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getMedian2OutputNullPointerException999c438b68493f4dec7() {
//
//    // Arrange
//    final GetMedianInStream thisObj = new GetMedianInStream();
//
//    // Act
//    thrown.expect(NullPointerException.class);
//    thisObj.getMedian2();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getMedianOutputIndexOutOfBoundsException9998b4fcaea89ac7f9e() {
//
//    // Arrange
//    final GetMedianInStream thisObj = new GetMedianInStream();
//
//    // Act
//    thrown.expect(IndexOutOfBoundsException.class);
//    thisObj.getMedian();
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void Insert2InputNotNullOutputVoid99910f89bbe300abac7() {
//
//    // Arrange
//    final GetMedianInStream thisObj = new GetMedianInStream();
//    final Integer arg0 = new Integer(0);
//
//    // Act
//    thisObj.Insert2(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void InsertInputNotNullOutputVoid999c7db5d0fb07d13ae() {
//
//    // Arrange
//    final GetMedianInStream thisObj = new GetMedianInStream();
//    final Integer arg0 = new Integer(0);
//
//    // Act
//    thisObj.Insert(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//