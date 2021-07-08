package cn.edu.jxnu.tooffer;

import cn.edu.jxnu.tooffer.T48;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class T48Test {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void Add1InputPositivePositiveOutputPositive99943c990408d1482ef() {

    // Arrange
    final T48 thisObj = new T48();
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = thisObj.Add1(arg0, arg1);

    // Assert result
    Assert.assertEquals(2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void AddInputPositivePositiveOutputPositive99941515e750f22f93a() {

    // Arrange
    final T48 thisObj = new T48();
    final int arg0 = 1;
    final int arg1 = 1;

    // Act
    final int actual = thisObj.Add(arg0, arg1);

    // Assert result
    Assert.assertEquals(2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f7368298ca166bf5() {

    // Act, creating object to test constructor
    final T48 actual = new T48();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
