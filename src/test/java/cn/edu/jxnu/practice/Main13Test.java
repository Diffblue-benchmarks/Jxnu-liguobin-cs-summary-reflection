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
  public void constructorOutputNotNull9997e943a729b0d7886() {

    // Act, creating object to test constructor
    final ThreadRunnableSub actual = new ThreadRunnableSub();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid999daaccbd99b276322() {

    // Arrange
    final ThreadRunnableSub thisObj = new ThreadRunnableSub();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99925103879e9b4ea49() {

    // Act, creating object to test constructor
    final ThreadRunnableToAdd actual = new ThreadRunnableToAdd();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void runOutputVoid99956d1153143805bdc() {

    // Arrange
    final ThreadRunnableToAdd thisObj = new ThreadRunnableToAdd();

    // Act
    thisObj.run();

    // The method returns void, testing that no exception is thrown

  }
}
