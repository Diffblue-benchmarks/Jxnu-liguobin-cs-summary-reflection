package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.EntryNodeOfLoop;
import cn.edu.jxnu.practice.ListNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class EntryNodeOfLoopTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999be176bdd93e19371() {

    // Act, creating object to test constructor
    final EntryNodeOfLoop actual = new EntryNodeOfLoop();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void entryNodeOfLoopInputNotNullOutputVoid999d024f84962ff604e() {

    // Arrange
    final EntryNodeOfLoop thisObj = new EntryNodeOfLoop();
    final ListNode arg0 = new ListNode(1);

    // Act
    final ListNode actual = thisObj.entryNodeOfLoop(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
