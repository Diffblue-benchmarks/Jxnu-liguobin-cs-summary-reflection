package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T61;
import cn.edu.jxnu.tooffer.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T61Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996955bcb52b6dc4ae() {

    // Act, creating object to test constructor
    final T61 actual = new T61();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(-1, actual.index);

  }

  // Test written by Diffblue Cover
  @Test
  public void DeserializeInputNotNullOutputVoid9995084a57675068579() {

    // Arrange
    final T61 thisObj = new T61();
    final String arg0 = "";

    // Act
    final TreeNode actual = thisObj.Deserialize(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void Serialize2InputNotNullNotNullOutputVoid99979d192a1cfcb6ee4() {

    // Arrange
    final T61 thisObj = new T61();
    final TreeNode arg0 = new TreeNode(-1);
    final StringBuffer arg1 = new StringBuffer();

    // Act
    thisObj.Serialize2(arg0, arg1);

    // Assert side effects
    Assert.assertNotNull(arg1);
    Assert.assertEquals("-1,#,#,", arg1.toString());

  }

  // Test written by Diffblue Cover
  @Test
  public void SerializeInputNotNullOutputNotNull999706daf846ae0c25e() {

    // Arrange
    final T61 thisObj = new T61();
    final TreeNode arg0 = new TreeNode(-1);

    // Act
    final String actual = thisObj.Serialize(arg0);

    // Assert result
    Assert.assertEquals("-1,#,#,", actual);

  }
}
