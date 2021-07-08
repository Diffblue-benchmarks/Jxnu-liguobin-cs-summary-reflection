//package cn.edu.jxnu.lambda;
//
//import cn.edu.jxnu.lambda.Lambda.Student;
//import cn.edu.jxnu.lambda.Lambda.User;
//import cn.edu.jxnu.lambda.Lambda;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class LambdaTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull9991e48985003e3cff0() {
//
//    // Act, creating object to test constructor
//    final Lambda actual = new Lambda();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void isPrimeInputPositiveOutputFalse9992503654f922a1890() {
//
//    // Arrange
//    final int arg0 = 1;
//
//    // Act
//    final boolean actual = Lambda.isPrime(arg0);
//
//    // Assert result
//    Assert.assertFalse(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid999816df6c47719ee51() {
//
//    // Arrange
//    final String[] arg0 = { "\n************1-----\u904d\u5386\u6570\u7ec4\u5e76\u8fdb\u884c\u5904\u7406******************", "\n************1-----\u904d\u5386\u6570\u7ec4\u5e76\u8fdb\u884c\u5904\u7406******************", "\n************1-----\u904d\u5386\u6570\u7ec4\u5e76\u8fdb\u884c\u5904\u7406******************" };
//
//    // Act
//    Lambda.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull9995c97e809c4a83514() {
//
//    // Arrange
//    final Integer arg0 = new Integer(1);
//    final Double arg1 = new Double(1.0);
//
//    // Act, creating object to test constructor
//    final Lambda.Student actual = new Lambda.Student(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getIdInteger());
//    Assert.assertNotNull(actual.getScore());
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getIdIntegerOutputNotNull999c96a0c6c9b685dd6() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Double double1 = new Double(1.0);
//    final Lambda.Student thisObj = new Lambda.Student(integer, double1);
//
//    // Act
//    final Integer actual = thisObj.getIdInteger();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getScoreOutputNotNull999f0a6fd04ff2024b2() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Double double1 = new Double(1.0);
//    final Lambda.Student thisObj = new Lambda.Student(integer, double1);
//
//    // Act
//    final Double actual = thisObj.getScore();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void setIdIntegerInputNotNullOutputVoid999b2a8a042e878d03a() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Double double1 = new Double(1.0);
//    final Lambda.Student thisObj = new Lambda.Student(integer, double1);
//    final Integer arg0 = new Integer(1);
//
//    // Act
//    thisObj.setIdInteger(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void setScoreInputNotNullOutputVoid99921fcc546b82bb1e8() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Double double1 = new Double(1.0);
//    final Lambda.Student thisObj = new Lambda.Student(integer, double1);
//    final Double arg0 = new Double(1.0);
//
//    // Act
//    thisObj.setScore(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void toStringOutputNotNull99926df1947f24234bd() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Double double1 = new Double(1.0);
//    final Lambda.Student thisObj = new Lambda.Student(integer, double1);
//
//    // Act
//    final String actual = thisObj.toString();
//
//    // Assert result
//    Assert.assertEquals("Student [idInteger=1, score=1.0]", actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull9990c965c3f2ce08d23() {
//
//    // Arrange
//    final Integer arg0 = new Integer(1);
//    final String arg1 = "aaaaa";
//
//    // Act, creating object to test constructor
//    final Lambda.User actual = new Lambda.User(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getId());
//    Assert.assertEquals("aaaaa", actual.getName());
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getIdOutputNotNull999632aebdaed59e211() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Lambda.User thisObj = new Lambda.User(integer, "aaaaa");
//
//    // Act
//    final Integer actual = thisObj.getId();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void getNameOutputNotNull99970bad1287582d864() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Lambda.User thisObj = new Lambda.User(integer, "aaaaa");
//
//    // Act
//    final String actual = thisObj.getName();
//
//    // Assert result
//    Assert.assertEquals("aaaaa", actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void setIdInputNotNullOutputVoid999bed2aa018b4c1016() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Lambda.User thisObj = new Lambda.User(integer, "aaaaa");
//    final Integer arg0 = new Integer(1);
//
//    // Act
//    thisObj.setId(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void setNameInputNotNullOutputVoid999f1788ba85848fa91() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Lambda.User thisObj = new Lambda.User(integer, "aaaaa");
//    final String arg0 = "aaaaa";
//
//    // Act
//    thisObj.setName(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void toStringOutputNotNull9998745798d20e88c18() {
//
//    // Arrange
//    final Integer integer = new Integer(1);
//    final Lambda.User thisObj = new Lambda.User(integer, "aaaaa");
//
//    // Act
//    final String actual = thisObj.toString();
//
//    // Assert result
//    Assert.assertEquals("User [id=1, name=aaaaa]", actual);
//
//  }
//}
//