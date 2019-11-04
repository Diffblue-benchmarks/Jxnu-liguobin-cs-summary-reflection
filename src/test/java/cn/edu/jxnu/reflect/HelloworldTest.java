package cn.edu.jxnu.reflect;

import cn.edu.jxnu.reflect.Helloworld;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class HelloworldTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNull999cb341edd7445127a() {
//
//    // Act, creating object to test constructor
//    final Helloworld actual = new Helloworld();
//
//    // Assert result
//    Assert.assertNull(actual);
//
//  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void mainInput3OutputVoid999977a9f4db91debde() throws Exception {
//
//    // Arrange
//    final String[] arg0 = { "D:\\Scala\\scala_project\\Java-Learning-Summary\\Java-Learning-Summary\\Java-Learning-Summary\\src\\cn\\edu\\jxnu\\reflect\\asm\\Example.class", "D:\\Scala\\scala_project\\Java-Learning-Summary\\Java-Learning-Summary\\Java-Learning-Summary\\src\\cn\\edu\\jxnu\\reflect\\asm\\Example.class", "D:\\Scala\\scala_project\\Java-Learning-Summary\\Java-Learning-Summary\\Java-Learning-Summary\\src\\cn\\edu\\jxnu\\reflect\\asm\\Example.class" };
//
//    // Act
//    Helloworld.main(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }
}
