package cn.edu.jxnu.io;

import cn.edu.jxnu.io.TestNonBlockingNIO2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;



public class TestNonBlockingNIO2Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997564346d906be61f() {

    // Act, creating object to test constructor
    final TestNonBlockingNIO2 actual = new TestNonBlockingNIO2();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void sendOutputVoid999ca79e1340c664f58() throws IOException {
//
//    // Arrange
//    final TestNonBlockingNIO2 thisObj = new TestNonBlockingNIO2();
//
//    // Act
//    thisObj.send();
//
//    // The method returns void, testing that no exception is thrown
//
//  }
}
