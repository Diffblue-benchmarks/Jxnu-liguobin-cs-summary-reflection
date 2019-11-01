package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Memento;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.HashMap;



public class MementoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void backupPropInputNotNullOutput2999f9a7642eaee0286b() {

    // Arrange
    final Object arg0 = "class";

    // Act
    final HashMap<String, Object> actual = Memento.backupProp(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(2, actual.size());
    Assert.assertArrayEquals(new byte[]{ (short) 99, (short) 108, (short) 97, (short) 115, (short) 115 }, ((byte[]) actual.get("bytes")));
    Assert.assertNotNull(actual.get("empty"));

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bc1223d20824e3a8() {

    // Act, creating object to test constructor
    final Memento actual = new Memento();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void restorePropInputNotNullNotNullOutputVoid999fe55c82727fd8536() {

    // Arrange
    final Object arg0 = "class";
    final HashMap<String, Object> arg1 = new HashMap<String, Object>();
    arg1.put("class", "class");

    // Act
    Memento.restoreProp(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }
}
