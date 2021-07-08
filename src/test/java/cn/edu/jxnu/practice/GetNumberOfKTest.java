package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.GetNumberOfK;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class GetNumberOfKTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cf8859894f5e0a10() {

    // Act, creating object to test constructor
    final GetNumberOfK actual = new GetNumberOfK();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getFirstInput8NegativeNegativeNegativeOutputArrayIndexOutOfBoundsException99927945ca43009605b() {

    // Arrange
    final int[] arg0 = { -1, -1, -1, -1, -1, -1, -1, -1 };
    final int arg1 = -1;
    final int arg2 = -1;
    final int arg3 = -1;

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    GetNumberOfK.getFirst(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLastInput8NegativeNegativeNegativeOutputArrayIndexOutOfBoundsException9993d34afaf43b9bc63() {

    // Arrange
    final int[] arg0 = { -1, -1, -1, -1, -1, -1, -1, -1 };
    final int arg1 = -1;
    final int arg2 = -1;
    final int arg3 = -1;

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    GetNumberOfK.getLast(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void GetNumberOfK2Input8NegativeOutputPositive9998c0e5d12656e84d5() {

    // Arrange
    final GetNumberOfK thisObj = new GetNumberOfK();
    final int[] arg0 = { -1, -1, -1, -1, -1, -1, -1, -1 };
    final int arg1 = -1;

    // Act
    final int actual = thisObj.GetNumberOfK2(arg0, arg1);

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getNumberOfKInput8NegativeOutputPositive9997e687e5d8c91a75f() {

    // Arrange
    final GetNumberOfK thisObj = new GetNumberOfK();
    final int[] arg0 = { -1, -1, -1, -1, -1, -1, -1, -1 };
    final int arg1 = -1;

    // Act
    final int actual = thisObj.getNumberOfK(arg0, arg1);

    // Assert result
    Assert.assertEquals(8, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999af1a06d734946e26() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    GetNumberOfK.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
