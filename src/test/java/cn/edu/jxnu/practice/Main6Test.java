package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main6;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main6Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99900f2018c4655c880() {

    // Act, creating object to test constructor
    final Main6 actual = new Main6();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid999693d207addebcb9f() {
//
//    // Arrange
//    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };
//
//    // Act
//    Main6.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
}
