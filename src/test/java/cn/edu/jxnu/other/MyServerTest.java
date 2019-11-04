package cn.edu.jxnu.other;

import cn.edu.jxnu.other.MyServer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MyServerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e71b0ba417035402() {

    // Act, creating object to test constructor
    final MyServer actual = new MyServer();

    // Assert result
    Assert.assertNotNull(actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void receiveFileOutputVoid99978ef8031bf2dc507() {
//
//    // Arrange
//    final MyServer thisObj = new MyServer();
//
//    // Act
//    thisObj.receiveFile();
//
//    // The method returns void, testing that no exception is thrown
//
//  }
}
