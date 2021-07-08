package cn.edu.jxnu.design.visitor;

import cn.edu.jxnu.design.visitor.ElementNode;
import cn.edu.jxnu.design.visitor.ObjectStruture;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.List;



public class ObjectStrutureTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994c83e66091140d63() {

    // Act, creating object to test constructor
    final ObjectStruture actual = new ObjectStruture();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getListOutput3999bc1ae85a3f50513b() {

    // Act
    final List<ElementNode> actual = ObjectStruture.getList();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertNotNull(actual.get(1));
    Assert.assertNotNull(actual.get(2));

  }
}
