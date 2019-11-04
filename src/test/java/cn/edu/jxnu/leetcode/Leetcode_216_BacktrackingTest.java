//package cn.edu.jxnu.leetcode;
//
//import cn.edu.jxnu.leetcode.Leetcode_216_Backtracking;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.util.NoSuchElementException;
//
//
//
//public class Leetcode_216_BacktrackingTest {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void combinationSum3InputPositivePositiveOutputIndexOutOfBoundsException999842f160db49b0888() {
//
//    // Arrange
//    final Leetcode_216_Backtracking thisObj = new Leetcode_216_Backtracking();
//    final int arg0 = 1;
//    final int arg1 = 1;
//
//    // Act
//    thrown.expect(IndexOutOfBoundsException.class);
//    thisObj.combinationSum3(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99911c3a2fd67dae37b() {
//
//    // Act, creating object to test constructor
//    final Leetcode_216_Backtracking actual = new Leetcode_216_Backtracking();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputNoSuchElementException9993d8405865e4ab6b7() {
//
//    // Arrange
//    final String[] arg0 = { ",", ",", "," };
//
//    // Act
//    thrown.expect(NoSuchElementException.class);
//    Leetcode_216_Backtracking.main(arg0);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//