package cn.edu.jxnu.other;

import cn.edu.jxnu.other.TestJava7;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TestJava7Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99943e55b3909e20d81() {
//
//    // Act, creating object to test constructor
//    final TestJava7 actual = new TestJava7();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(5, actual.getPriority());
//    Assert.assertNull(Reflector.getInstanceField(actual, "inheritableThreadLocals"));
//    Assert.assertNotNull(actual.getThreadGroup());
//    Assert.assertEquals(18, Reflector.getInstanceField(actual.getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", actual.getThreadGroup().getName());
//    Assert.assertEquals(10, actual.getThreadGroup().getMaxPriority());
//    Assert.assertFalse(actual.getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(actual.getThreadGroup(), "threads"));
//    Assert.assertEquals(8, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(10L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "item"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "waiter"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "mode"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals(5, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getPriority());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "inheritableThreadLocals"));
//    Assert.assertNull(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "parkBlocker"));
//    Assert.assertEquals("pool-1-thread-3", ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getName());
//    Assert.assertFalse(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).isDaemon());
//    Assert.assertEquals(1_013_904_242, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(-6_727_027_900_868_136_139L, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSeed"));
//    Assert.assertEquals(16L, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getId());
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocals"));
//    Assert.assertEquals("pool-1-thread-2", ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3].isDaemon());
//    Assert.assertEquals(-1_640_531_527, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "threadLocalRandomProbe"));
//    Assert.assertEquals(1_281_858_329, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(1_881_868_395_614_313_886L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "threadLocalRandomSeed"));
//    Assert.assertEquals(15L, ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "threadLocals"));
//    Assert.assertEquals(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), ((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[4]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[5]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[6]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(actual.getThreadGroup(), "threads"))[7]);
//    Assert.assertFalse(actual.getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(actual.getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual.getThreadGroup(), "ngroups"));
//    Assert.assertFalse((boolean) Reflector.getInstanceField(actual.getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(5, Reflector.getInstanceField(actual.getThreadGroup(), "nthreads"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "parkBlocker"));
//    Assert.assertEquals("Thread-17", actual.getName());
//    Assert.assertFalse(actual.isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(actual, "threadLocalRandomSeed"));
//    Assert.assertEquals(38L, actual.getId());
//    Assert.assertNull(Reflector.getInstanceField(actual, "threadLocals"));
//
//  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void runOutputVoid999ca6df97dd31f1ff4() {
//
//    // Arrange
//    final TestJava7 thisObj = new TestJava7();
//
//    // Act
//    thisObj.run();
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getThreadGroup());
//    Assert.assertEquals(6, Reflector.getInstanceField(thisObj.getThreadGroup(), "nUnstartedThreads"));
//    Assert.assertEquals("main", thisObj.getThreadGroup().getName());
//    Assert.assertEquals(10, thisObj.getThreadGroup().getMaxPriority());
//    Assert.assertFalse(thisObj.getThreadGroup().isDaemon());
//    Assert.assertNotNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"));
//    Assert.assertEquals(8, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads")).length);
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "parkBlocker"));
//    Assert.assertEquals("main", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocalRandomSeed"));
//    Assert.assertEquals(1L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[0], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1]);
//    Assert.assertEquals(10, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "parkBlocker"));
//    Assert.assertEquals("jnr.ffi.util.ref.internal.Finalizer", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getName());
//    Assert.assertTrue(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocalRandomSeed"));
//    Assert.assertEquals(10L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1].getId());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[1], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "parkBlocker"));
//    Assert.assertEquals("pool-1-thread-1", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocalRandomSeed"));
//    Assert.assertEquals(11L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[2], "threadLocals"));
//    Assert.assertNotNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3]);
//    Assert.assertEquals(5, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getPriority());
//    Assert.assertNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "inheritableThreadLocals"));
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getThreadGroup());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "item"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "match"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "item"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "next"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "mode"));
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "next"), "waiter"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "mode"));
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"));
//    Assert.assertEquals(5, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getPriority());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "inheritableThreadLocals"));
//    Assert.assertNull(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getThreadGroup());
//    Assert.assertNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "parkBlocker"));
//    Assert.assertEquals("pool-1-thread-3", ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getName());
//    Assert.assertFalse(((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocalRandomSeed"));
//    Assert.assertEquals(16L, ((Thread) Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter")).getId());
//    Assert.assertNotNull(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), "threadLocals"));
//    Assert.assertEquals("pool-1-thread-2", ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getName());
//    Assert.assertFalse(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].isDaemon());
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomProbe"));
//    Assert.assertEquals(0, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSecondarySeed"));
//    Assert.assertEquals(0L, Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocalRandomSeed"));
//    Assert.assertEquals(15L, ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3].getId());
//    Assert.assertNotNull(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "threadLocals"));
//    Assert.assertEquals(Reflector.getInstanceField(Reflector.getInstanceField(Reflector.getInstanceField(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[3], "parkBlocker"), "head"), "waiter"), ((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[4]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[5]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[6]);
//    Assert.assertNull(((Thread[]) Reflector.getInstanceField(thisObj.getThreadGroup(), "threads"))[7]);
//    Assert.assertFalse(thisObj.getThreadGroup().isDestroyed());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getThreadGroup(), "groups"));
//    Assert.assertEquals(0, Reflector.getInstanceField(thisObj.getThreadGroup(), "ngroups"));
//    Assert.assertFalse((boolean) Reflector.getInstanceField(thisObj.getThreadGroup(), "vmAllowSuspension"));
//    Assert.assertEquals(5, Reflector.getInstanceField(thisObj.getThreadGroup(), "nthreads"));
//
//  }
}
