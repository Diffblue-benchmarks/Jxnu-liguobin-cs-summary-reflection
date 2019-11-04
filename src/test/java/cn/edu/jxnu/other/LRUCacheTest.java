package cn.edu.jxnu.other;

import cn.edu.jxnu.other.LRUCache;
import cn.edu.jxnu.other.Node;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;
import java.util.NoSuchElementException;



public class LRUCacheTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputNotNull999befd1f89601fd904() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    final LRUCache actual = new LRUCache(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.end);
    Assert.assertEquals(0, actual.capacity);
    Assert.assertNull(actual.head);
    final HashMap<Integer, Node> hashMap = new HashMap<Integer, Node>();
    Assert.assertEquals(hashMap, actual.map);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputZeroOutputNegative9993b07976381b56b61() {

    // Arrange
    final LRUCache thisObj = new LRUCache(0);
    final int arg0 = 0;

    // Act
    final int actual = thisObj.get(arg0);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException999851a9b87da6b0ab3() {
//
//    // Arrange
//    final String[] arg0 = { "\\ ", "\\ ", "\\ " };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    LRUCache.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void putInputZeroZeroOutputNullPointerException999570d751e99d83777() {

    // Arrange
    final LRUCache thisObj = new LRUCache(0);
    final int arg0 = 0;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.put(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputNotNullOutputVoid9990ecb53ae76a4ec4c() {

    // Arrange
    final LRUCache thisObj = new LRUCache(0);
    final Node arg0 = new Node(0, 0);

    // Act
    thisObj.remove(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadInputNotNullOutputVoid9998034c7fce57050cd() {

    // Arrange
    final LRUCache thisObj = new LRUCache(0);
    final Node arg0 = new Node(0, 0);

    // Act
    thisObj.setHead(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.end);
    Assert.assertNull(thisObj.end.next);
    Assert.assertEquals(0, thisObj.end.value);
    Assert.assertEquals(0, thisObj.end.key);
    Assert.assertNull(thisObj.end.pre);
    Assert.assertEquals(thisObj.end, thisObj.head);

  }
}
