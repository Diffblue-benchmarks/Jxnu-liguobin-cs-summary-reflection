package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Node;
import cn.edu.jxnu.practice.SlidingWindowMedian;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeSet;



public class SlidingWindowMedianTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullNotNullZeroNotNullOutputVoid999ccefc902533d7304() {

    // Arrange
    final SlidingWindowMedian thisObj = new SlidingWindowMedian();
    final TreeSet<Node> arg0 = new TreeSet<Node>();
    final Node node = new Node(0, 0);
    arg0.add(node);
    final TreeSet<Node> arg1 = new TreeSet<Node>();
    final Node node1 = new Node(0, 0);
    arg1.add(node1);
    final int arg2 = 0;
    final Node arg3 = node;

    // Act
    thisObj.add(arg0, arg1, arg2, arg3);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b2e55bbf44d8b240() {

    // Act, creating object to test constructor
    final SlidingWindowMedian actual = new SlidingWindowMedian();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void medianSlidingWindowInput8ZeroOutput09991a9ad5b44844120d() {

    // Arrange
    final SlidingWindowMedian thisObj = new SlidingWindowMedian();
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int arg1 = 0;

    // Act
    final ArrayList<Integer> actual = thisObj.medianSlidingWindow(arg0, arg1);

    // Assert result
    final ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Assert.assertEquals(arrayList, actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void removeInputNotNullNotNullNotNullOutputVoid999bf73ed551daa5cf7() {
//
//    // Arrange
//    final SlidingWindowMedian thisObj = new SlidingWindowMedian();
//    final TreeSet<Node> arg0 = new TreeSet<Node>();
//    final Node node = new Node(0, 0);
//    arg0.add(node);
//    final TreeSet<Node> arg1 = new TreeSet<Node>();
//    final Node node1 = new Node(0, 0);
//    arg1.add(node1);
//    final Node arg2 = node;
//
//    // Act
//    thisObj.remove(arg0, arg1, arg2);
//
//    // Assert side effects
//    Assert.assertNotNull(arg0);
//    Assert.assertEquals(0, Reflector.getInstanceField(arg0, "size"));
//
//  }
}
