//package cn.edu.jxnu.lambda;
//
//import cn.edu.jxnu.lambda.CompletableFutureDemo2;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.concurrent.ExecutionException;
//
//
//
//public class CompletableFutureDemo2Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void caluErrorInputNotNullOutputArithmeticException999927be310500a4064() {
//
//    // Arrange
//    final Integer arg0 = new Integer(1);
//
//    // Act
//    thrown.expect(ArithmeticException.class);
//    CompletableFutureDemo2.caluError(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void caluInputNotNullOutputPositive999fff2fe1b100bbb0a() {
//
//    // Arrange
//    final Integer arg0 = new Integer(1);
//
//    // Act
//    final int actual = CompletableFutureDemo2.calu(arg0);
//
//    // Assert result
//    Assert.assertEquals(1, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99911dfc54deed53fc5() {
//
//    // Act, creating object to test constructor
//    final CompletableFutureDemo2 actual = new CompletableFutureDemo2();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid9990af4955943a80eb0() throws InterruptedException, ExecutionException {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    CompletableFutureDemo2.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//