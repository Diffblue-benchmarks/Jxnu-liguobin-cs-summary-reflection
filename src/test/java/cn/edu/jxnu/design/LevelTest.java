package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Level;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LevelTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992d90aee8a199ba5b() {

    // Act, creating object to test constructor
    final Level actual = new Level();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
