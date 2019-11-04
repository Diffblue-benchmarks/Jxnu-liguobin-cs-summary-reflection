package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_79_Backtracking;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_79_BacktrackingTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99996540c9a5eb20a21() {

    // Act, creating object to test constructor
    final Leetcode_79_Backtracking actual = new Leetcode_79_Backtracking();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void existInput3NotNullOutputFalse999f143d5db8dab21e0() {
//
//    // Arrange
//    final Leetcode_79_Backtracking thisObj = new Leetcode_79_Backtracking();
//    final char[] myCharArray = { 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E' };
//    final char[] myCharArray1 = { 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E' };
//    final char[] myCharArray2 = { 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E' };
//    final char[] arg0 = { myCharArray, myCharArray1, myCharArray2 };
//    final String arg1 = "SEEESSSSESEEEEEESEESESSEESEEESSSSESSSSSSESESSSSESEESESSSEEEEEESESESES";
//
//    // Act
//    final boolean actual = thisObj.exist(arg0, arg1);
//
//    // Assert result
//    Assert.assertFalse(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999ec55f15e829b04ae() {

    // Arrange
    final String[] arg0 = { "ABC", "ABC", "ABC" };

    // Act
    Leetcode_79_Backtracking.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
