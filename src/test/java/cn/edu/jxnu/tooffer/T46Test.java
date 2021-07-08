//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T46;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//
//
//public class T46Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  @Rule
//  public final ExpectedException thrown = ExpectedException.none();
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999e921d4d35f0ed674() {
//
//    // Act, creating object to test constructor
//    final T46 actual = new T46();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void LastRemaining_Solution2InputNegativeNegativeOutputNegative99932c0d70aca7b4fe9() {
//
//    // Arrange
//    final T46 thisObj = new T46();
//    final int arg0 = -1;
//    final int arg1 = -1;
//
//    // Act
//    final int actual = thisObj.LastRemaining_Solution2(arg0, arg1);
//
//    // Assert result
//    Assert.assertEquals(-1, actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void LastRemaining_SolutionInputNegativeNegativeOutputIndexOutOfBoundsException9995ef3d5e9201a3991() {
//
//    // Arrange
//    final T46 thisObj = new T46();
//    final int arg0 = -1;
//    final int arg1 = -1;
//
//    // Act
//    thrown.expect(IndexOutOfBoundsException.class);
//    thisObj.LastRemaining_Solution(arg0, arg1);
//
//    // The method is not expected to return due to exception thrown
//
//  }
//}
//