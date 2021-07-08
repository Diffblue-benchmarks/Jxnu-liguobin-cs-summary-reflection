package cn.edu.jxnu.sql;

import cn.edu.jxnu.sql.ConnectionDriver.ConnectionHandler;
import cn.edu.jxnu.sql.ConnectionDriver;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;
import java.sql.Connection;



public class ConnectionDriverTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994ba0c692317da15b() {

    // Act, creating object to test constructor
    final ConnectionDriver actual = new ConnectionDriver();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createConnectionOutputNotNull9992a7aa5fbe37a75a9() {

    // Act
    final Connection actual = ConnectionDriver.createConnection();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "h"));

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990c3c5708f1c0f992() {

    // Act, creating object to test constructor
    final ConnectionDriver.ConnectionHandler actual = new ConnectionDriver.ConnectionHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void invokeInputNotNullNull3OutputNullPointerException9993f400a05b503e994() throws Throwable {

    // Arrange
    final ConnectionDriver.ConnectionHandler thisObj = new ConnectionDriver.ConnectionHandler();
    final Object arg0 = "commit";
    final Method arg1 = null;
    final Object[] arg2 = { "commit", "commit", "commit" };

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.invoke(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}
