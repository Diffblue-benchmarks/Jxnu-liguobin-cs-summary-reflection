package cn.edu.jxnu.leetcode;

import cn.edu.jxnu.leetcode.Leetcode_93_DFS;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class Leetcode_93_DFSTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c337d0e49f5e9ef8() {

    // Act, creating object to test constructor
    final Leetcode_93_DFS actual = new Leetcode_93_DFS();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid999d90a22f51b126fa0() {

    // Arrange
    final String[] arg0 = { "0", "0", "0" };

    // Act
    Leetcode_93_DFS.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void restoreIpAddressesInputNotNullOutput09993f46b66de6d3a358() {

    // Arrange
    final Leetcode_93_DFS thisObj = new Leetcode_93_DFS();
    final String arg0 = "0";

    // Act
    final List<String> actual = thisObj.restoreIpAddresses(arg0);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);

  }
}
