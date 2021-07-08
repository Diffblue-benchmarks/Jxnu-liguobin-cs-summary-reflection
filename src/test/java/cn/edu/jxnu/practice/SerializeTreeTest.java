package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.SerializeTree;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SerializeTreeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a967cf5e0f5aacee() {

    // Act, creating object to test constructor
    final SerializeTree actual = new SerializeTree();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void DeserializeInputNotNullOutputVoid999b79b17f899d36581() {

    // Arrange
    final SerializeTree thisObj = new SerializeTree();
    final String arg0 = "#";

    // Act
    final TreeNode actual = thisObj.Deserialize(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void serializeInputNotNullOutputNotNull9998a5886cbf5d6f386() {

    // Arrange
    final SerializeTree thisObj = new SerializeTree();
    final TreeNode arg0 = new TreeNode(-1);

    // Act
    final String actual = thisObj.serialize(arg0);

    // Assert result
    Assert.assertEquals("-1,#,#,", actual);

  }
}
