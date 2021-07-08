//package cn.edu.jxnu.lambda;
//
//import cn.edu.jxnu.lambda.CompletableFutureDemo.AskThread;
//import cn.edu.jxnu.lambda.CompletableFutureDemo;
//import com.diffblue.deeptestutils.Reflector;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.concurrent.CompletableFuture;
//
//
//
//public class CompletableFutureDemoTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull99975960bac0391c90d() {
//
//    // Arrange
//    final CompletableFuture<Integer> arg0 = new CompletableFuture<Integer>();
//
//    // Act, creating object to test constructor
//    final AskThread actual = new AskThread(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.re);
//    Assert.assertNull(Reflector.getInstanceField(actual.re, "result"));
//    Assert.assertNull(Reflector.getInstanceField(actual.re, "stack"));
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999b886ea05f5aab76a() {
//
//    // Act, creating object to test constructor
//    final CompletableFutureDemo actual = new CompletableFutureDemo();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//}
//