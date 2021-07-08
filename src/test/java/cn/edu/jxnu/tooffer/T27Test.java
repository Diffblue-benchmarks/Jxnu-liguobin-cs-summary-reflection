//package cn.edu.jxnu.tooffer;
//
//import cn.edu.jxnu.tooffer.T27;
//import org.junit.Assert;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.rules.Timeout;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//
//
//public class T27Test {
//
//  @Rule
//  public final Timeout globalTimeout = new Timeout(10000);
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999b626bec1051de468() {
//
//    // Act, creating object to test constructor
//    final T27 actual = new T27();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void PermutationInputNotNullOutput1999f6bf1d45418fd8d2() {
//
//    // Arrange
//    final T27 thisObj = new T27();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final ArrayList<String> actual = thisObj.Permutation(arg0);
//
//    // Assert result
//    final ArrayList<String> arrayList = new ArrayList<String>();
//    arrayList.add("aaaaa");
//    Assert.assertEquals(arrayList, actual);
//
//  }
//}
//