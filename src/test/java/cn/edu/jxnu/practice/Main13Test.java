package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.Main13.ThreadRunnableSub;
import cn.edu.jxnu.practice.Main13.ThreadRunnableToAdd;
import cn.edu.jxnu.practice.Main13;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class Main13Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99941a01dd696858f21() {

    // Act, creating object to test constructor
    final Main13 actual = new Main13();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid99974299d814d26fdda() throws InterruptedException {

    // Arrange
    final String[] arg0 = { "add_1", "add_1", "add_1" };

    // Act
    Main13.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997e943a729b0d7886() {

    // Act, creating object to test constructor
    final Main13.ThreadRunnableSub actual = new Main13.ThreadRunnableSub();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid999daaccbd99b276322() {

    // Arrange
    final Main13.ThreadRunnableSub thisObj = new Main13.ThreadRunnableSub();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99925103879e9b4ea49() {

    // Act, creating object to test constructor
    final Main13.ThreadRunnableToAdd actual = new Main13.ThreadRunnableToAdd();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid99956d1153143805bdc() {

    // Arrange
    final Main13.ThreadRunnableToAdd thisObj = new Main13.ThreadRunnableToAdd();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }
}
