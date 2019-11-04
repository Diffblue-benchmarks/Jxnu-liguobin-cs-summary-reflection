package cn.edu.jxnu.other;

import cn.edu.jxnu.other.MuchThreadDown;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.net.MalformedURLException;



public class MuchThreadDownTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullZeroOutputNotNull999608d3e627f5d110d() {

    // Arrange
    final String arg0 = ".";
    final String arg1 = ".";
    final int arg2 = 0;

    // Act, creating object to test constructor
    final MuchThreadDown actual = new MuchThreadDown(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void downloadOutputMalformedURLException9998fab13de8512e771() throws Exception {

    // Arrange
    final MuchThreadDown thisObj = new MuchThreadDown(".", ".", 0);

    // Act
    thrown.expect(MalformedURLException.class);
    thisObj.download();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999c0eacc6aef08a931() {

    // Arrange
    final String[] arg0 = { ".", ".", "." };

    // Act
    MuchThreadDown.main(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
