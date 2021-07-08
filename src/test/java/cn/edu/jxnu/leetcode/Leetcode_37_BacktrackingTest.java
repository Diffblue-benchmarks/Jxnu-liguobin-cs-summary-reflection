package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_37_Backtracking;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class Leetcode_37_BacktrackingTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9993c3bba8b8ec4c943() {

    // Act, creating object to test constructor
    final Leetcode_37_Backtracking actual = new Leetcode_37_Backtracking();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_compile   // Test written by Diffblue Cover
//  @Test
//  public void solveSudokuInput3OutputArrayIndexOutOfBoundsException999536a6f97b93201dc() {
//
//    // Arrange
//    final Leetcode_37_Backtracking thisObj = new Leetcode_37_Backtracking();
//    final char[] myCharArray = { '.', '.', '.', '.', '.', '.', '.', '.' };
//    final char[] myCharArray1 = { '.', '.', '.', '.', '.', '.', '.', '.' };
//    final char[] myCharArray2 = { '.', '.', '.', '.', '.', '.', '.', '.' };
//    final char[] arg0 = { myCharArray, myCharArray1, myCharArray2 };
//
//    // Act
//    thrown.expect(ArrayIndexOutOfBoundsException.class);
//    thisObj.solveSudoku(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
