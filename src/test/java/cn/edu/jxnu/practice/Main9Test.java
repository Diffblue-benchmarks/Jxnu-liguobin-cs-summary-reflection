package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main9;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;



public class Main9Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addAllInputNotNullOutputFalse999469ba6a3defc5691() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("d");

    // Act
    final boolean actual = thisObj.addAll(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputFalse999ef334b26e9e02747() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final Object arg0 = "d";

    // Act
    final boolean actual = thisObj.add(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void clearOutputVoid999bc88e78edf99731c() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    thisObj.clear();

    // The method returns void, testing that no exception is thrown

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999308b4b0beab50e20() {
//
//    // Act, creating object to test constructor
//    final Main9<Object> actual = new Main9<Object>();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNull(actual.elementData);
//    Assert.assertEquals(0, actual.size);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void containsAllInputNotNullOutputFalse999e978e63c7b6b7e4d() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("d");

    // Act
    final boolean actual = thisObj.containsAll(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void containsInputNotNullOutputFalse9993eac6b2ef1182b5e() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final Object arg0 = "d";

    // Act
    final boolean actual = thisObj.contains(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void drainToInputNotNullPositiveOutputZero9991d20ad0becbf2c9c() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("d");
    final int arg1 = 1;

    // Act
    final int actual = thisObj.drainTo(arg0, arg1);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void drainToInputNotNullOutputZero999154eb80fad5861c6() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("d");

    // Act
    final int actual = thisObj.drainTo(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void elementOutputVoid999c03fd6d18a4cb86e() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final Object actual = thisObj.element();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isEmptyOutputFalse999d64018e0e9661272() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final boolean actual = thisObj.isEmpty();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void iteratorOutputVoid999471bf591df5736b5() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final Iterator<Object> actual = thisObj.iterator();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void offerInputNotNullPositiveNanosecondsOutputFalse9996fe3bd5d2297795c() throws InterruptedException {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final Object arg0 = "d";
    final long arg1 = 1L;
    final TimeUnit arg2 = TimeUnit.NANOSECONDS;

    // Act
    final boolean actual = thisObj.offer(arg0, arg1, arg2);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void offerInputNotNullOutputFalse9990dd1c62ad370b6f6() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final Object arg0 = "d";

    // Act
    final boolean actual = thisObj.offer(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void peekOutputVoid999941b443290cabab2() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final Object actual = thisObj.peek();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void pollOutputVoid999cb41c350fc0a657e() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final Object actual = thisObj.poll();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void pollInputPositiveNanosecondsOutputVoid999ca8b46c3802275c7() throws InterruptedException {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final long arg0 = 1L;
    final TimeUnit arg1 = TimeUnit.NANOSECONDS;

    // Act
    final Object actual = thisObj.poll(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void putInputNotNullOutputVoid999dede662c3528bbe8() throws InterruptedException {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final Object arg0 = "d";

    // Act
    thisObj.put(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void remainingCapacityOutputZero9990071024c037dde9d() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final int actual = thisObj.remainingCapacity();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeOutputVoid999c240c8efbcf7d02f() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final Object actual = thisObj.remove();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputNotNullOutputFalse99926d6e654522d6635() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final Object arg0 = "d";

    // Act
    final boolean actual = thisObj.remove(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeAllInputNotNullOutputFalse9996ab0531061d822b7() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("d");

    // Act
    final boolean actual = thisObj.removeAll(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void retainAllInputNotNullOutputFalse999fad9734c48ef984c() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("d");

    // Act
    final boolean actual = thisObj.retainAll(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void sizeOutputZero9995caa980668483c3c() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final int actual = thisObj.size();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void toArrayOutputVoid999cda82365b22ebdf0() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();

    // Act
    final Object[] actual = thisObj.toArray();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void toArrayInput3OutputVoid999fcf4287be6f93c90() {

    // Arrange
    final Main9<Object> thisObj = new Main9<Object>();
    final Object[] arg0 = { "d", "d", "d" };

    // Act
    final Object[] actual = thisObj.toArray(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
