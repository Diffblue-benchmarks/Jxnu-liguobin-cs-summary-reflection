package cn.edu.jxnu.lambda;

import cn.edu.jxnu.lambda.LongAdderDemo.AtomicThread;
import cn.edu.jxnu.lambda.LongAdderDemo.LongAddrThread;
import cn.edu.jxnu.lambda.LongAdderDemo.SyncThread;
import cn.edu.jxnu.lambda.LongAdderDemo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LongAdderDemoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull9995f139926043eebeb() {
//
//    // Arrange
//    final Long arg0 = new Long(100_000_000L);
//
//    // Act, creating object to test constructor
//    final AtomicThread actual = new AtomicThread(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.name);
//    Assert.assertEquals(100_000_000L, actual.starttime);
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void runOutputVoid99975adaa321563d8b7() {
//
//    // Arrange
//    final Long long1 = new Long(100_000_000L);
//    final AtomicThread thisObj = new AtomicThread(long1);
//
//    // Act
//    thisObj.run();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ddc80152500869fb() {

    // Act, creating object to test constructor
    final LongAdderDemo actual = new LongAdderDemo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.getCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCountOutputZero999762466452fc48b48() {

    // Arrange
    final LongAdderDemo thisObj = new LongAdderDemo();

    // Act
    final long actual = thisObj.getCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void incOutputZero9996e017b60b2e07e5a() {

    // Arrange
    final LongAdderDemo thisObj = new LongAdderDemo();

    // Act
    final long actual = thisObj.inc();

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getCount());

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999320fcb80396113df() throws InterruptedException {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    LongAdderDemo.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullOutputNotNull999dc0c595c554a9204() {
//
//    // Arrange
//    final Long arg0 = new Long(100_000_000L);
//
//    // Act, creating object to test constructor
//    final LongAdderDemo.LongAddrThread actual = new LongAdderDemo.LongAddrThread(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.name);
//    Assert.assertEquals(100_000_000L, actual.starttime);
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void runOutputVoid9999391bdf67e5feb39() {
//
//    // Arrange
//    final Long long1 = new Long(100_000_000L);
//    final LongAdderDemo.LongAddrThread thisObj = new LongAdderDemo.LongAddrThread(long1);
//
//    // Act
//    thisObj.run();
//
//    // The method returns void, testing that no exception is thrown
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorInputNotNullNotNullOutputNotNull999aa5b683003ec7fc4() {
//
//    // Arrange
//    final LongAdderDemo arg0 = new LongAdderDemo();
//    final Long arg1 = new Long(100_000_000L);
//
//    // Act, creating object to test constructor
//    final LongAdderDemo.SyncThread actual = new LongAdderDemo.SyncThread(arg0, arg1);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.out);
//    Assert.assertEquals(0L, actual.out.getCount());
//    Assert.assertNull(actual.name);
//    Assert.assertEquals(100_000_000L, actual.starttime);
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void runOutputVoid999640c4b7dffa7afcb() {
//
//    // Arrange
//    final LongAdderDemo longAdderDemo = new LongAdderDemo();
//    final Long long1 = new Long(100_000_000L);
//    final LongAdderDemo.SyncThread thisObj = new LongAdderDemo.SyncThread(longAdderDemo, long1);
//
//    // Act
//    thisObj.run();
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.out);
//    Assert.assertEquals(100_000_001L, thisObj.out.getCount());
//
//  }
}
