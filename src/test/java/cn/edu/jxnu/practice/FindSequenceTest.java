package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.FindSequence;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class FindSequenceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992ec57d7d96e6566d() {

    // Act, creating object to test constructor
    final FindSequence actual = new FindSequence();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void FindContinuousSequenceInputPositiveOutput099923ea8f716a5e67ee() {

    // Arrange
    final FindSequence thisObj = new FindSequence();
    final int arg0 = 1;

    // Act
    final ArrayList<ArrayList<Integer>> actual = thisObj.FindContinuousSequence(arg0);

    // Assert result
    final ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999bc4159a01cdac73e() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    FindSequence.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
