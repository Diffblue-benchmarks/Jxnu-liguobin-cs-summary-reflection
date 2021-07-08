package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_17_Backtracking;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Leetcode_17_BacktrackingTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void combineInputNotNullNotNullOutput0999494a969c1cec4881() {

    // Arrange
    final String arg0 = "";
    final ArrayList<String> arg1 = new ArrayList<String>();
    arg1.add("");

    // Act
    final List<String> actual = Leetcode_17_Backtracking.combine(arg0, arg1);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bc24cbd31d935c8c() {

    // Act, creating object to test constructor
    final Leetcode_17_Backtracking actual = new Leetcode_17_Backtracking();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void letterCombinations2InputNotNullOutput09991a8834236415c06f() {

    // Arrange
    final Leetcode_17_Backtracking thisObj = new Leetcode_17_Backtracking();
    final String arg0 = "";

    // Act
    final List<String> actual = thisObj.letterCombinations2(arg0);

    // Assert result
    final LinkedList<String> linkedList = new LinkedList<String>();
    Assert.assertEquals(linkedList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void letterCombinations3InputNotNullOutput0999d57a31eab4ec74ed() {

    // Arrange
    final String arg0 = "";

    // Act
    final List<String> actual = Leetcode_17_Backtracking.letterCombinations3(arg0);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void letterCombinationsInputNotNullOutput09992516cf306e98290d() {

    // Arrange
    final Leetcode_17_Backtracking thisObj = new Leetcode_17_Backtracking();
    final String arg0 = "";

    // Act
    final List<String> actual = thisObj.letterCombinations(arg0);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);

  }
}
