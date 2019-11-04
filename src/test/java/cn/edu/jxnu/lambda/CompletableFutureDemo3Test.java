//package cn.edu.jxnu.lambda;
//
//import cn.edu.jxnu.lambda.CompletableFutureDemo3;
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
//public class CompletableFutureDemo3Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void caluInputNotNullOutputNotNull9998ffcc88d916ea8db() {
//
//    // Arrange
//    final Integer arg0 = new Integer(1);
//
//    // Act
//    final Integer actual = CompletableFutureDemo3.calu(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999adbe9eddacb16358() {
//
//    // Act, creating object to test constructor
//    final CompletableFutureDemo3 actual = new CompletableFutureDemo3();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid99939463930e560c572() throws InterruptedException, ExecutionException {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    CompletableFutureDemo3.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
//}
//