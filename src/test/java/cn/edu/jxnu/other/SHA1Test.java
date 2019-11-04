package cn.edu.jxnu.other;

import cn.edu.jxnu.other.SHA1;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SHA1Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void bytes2hexInput24OutputNotNull9996b3eee7ead036acb() {

    // Arrange
    final byte[] arg0 = { (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7, (short) 7 };

    // Act
    final String actual = SHA1.bytes2hex(arg0);

    // Assert result
    Assert.assertEquals("070707070707070707070707070707070707070707070707", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void byteToBitInputPositiveOutputNotNull999b632d775f8221304() {

    // Arrange
    final byte arg0 = (short) 7;

    // Act
    final String actual = SHA1.byteToBit(arg0);

    // Assert result
    Assert.assertEquals("00000111", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b432a95765b88c3d() {

    // Act, creating object to test constructor
    final SHA1 actual = new SHA1();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBooleanArrayInputPositiveOutput89994f68740c375d0b40() {

    // Arrange
    final byte arg0 = (short) 7;

    // Act
    final byte[] actual = SHA1.getBooleanArray(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 1, (short) 1, (short) 1 }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSha1InputNotNullOutputVoid999cbe05f929018400a() {

    // Arrange
    final String arg0 = "";

    // Act
    final String actual = SHA1.getSha1(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9993d6ec64408334397() {

    // Arrange
    final String[] arg0 = { "", "", "" };

    // Act
    SHA1.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void toBytesInputNotNullOutput0999febdad0d6a6e904e() {

    // Arrange
    final String arg0 = "";

    // Act
    final byte[] actual = SHA1.toBytes(arg0);

    // Assert result
    Assert.assertArrayEquals(new byte[]{ }, actual);

  }
}
