package cn.edu.jxnu.design;

import cn.edu.jxnu.design.Composite;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.awt.Component;
import java.lang.reflect.Array;
import java.util.ArrayList;



public class CompositeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//  // Test written by Diffblue Cover
//  @Test
//  public void addInputNotNullOutputVoid999df508b316152ef10() {
//
//    // Arrange
//    final Composite thisObj = new Composite();
//    final Composite arg0 = new Composite();
//
//    // Act
//    thisObj.add(arg0);
//
//    // Assert side effects
//    Assert.assertNotNull(thisObj.getChildren());
//    Assert.assertEquals(1, thisObj.getChildren().size());
//    Assert.assertNotNull(thisObj.getChildren().get(0));
//    final ArrayList<Component> arrayList = new ArrayList<Component>();
//    Assert.assertEquals(arrayList, ((Composite) thisObj.getChildren().get(0)).getChildren());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "minSize"));
//    Assert.assertFalse(((Composite) thisObj.getChildren().get(0)).getIgnoreRepaint());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "foreground"));
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "locale"));
//    Assert.assertTrue(((Composite) thisObj.getChildren().get(0)).getFocusTraversalKeysEnabled());
//    Assert.assertEquals(4096L, Reflector.getInstanceField(thisObj.getChildren().get(0), "eventMask"));
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "font"));
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "cursor"));
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "maxSize"));
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "background"));
//    Assert.assertTrue(((Composite) thisObj.getChildren().get(0)).isEnabledImpl());
//    Assert.assertFalse((boolean) Reflector.getInstanceField(thisObj.getChildren().get(0), "newEventsOnly"));
//    Assert.assertEquals(0, ((Composite) thisObj.getChildren().get(0)).getHeight());
//    Assert.assertNull(((Composite) thisObj.getChildren().get(0)).getDropTarget());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "focusTraversalKeys"));
//    Assert.assertEquals(0, ((Composite) thisObj.getChildren().get(0)).getX());
//    Assert.assertFalse((boolean) Reflector.getInstanceField(thisObj.getChildren().get(0), "isPacked"));
//    Assert.assertNull(((Composite) thisObj.getChildren().get(0)).getAccessibleContext());
//    Assert.assertFalse(((Composite) thisObj.getChildren().get(0)).isMinimumSizeSet());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "popups"));
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "prefSize"));
//    Assert.assertTrue(((Composite) thisObj.getChildren().get(0)).isAutoFocusTransferOnDisposal());
//    Assert.assertFalse(((Composite) thisObj.getChildren().get(0)).isPreferredSizeSet());
//    Assert.assertFalse(((Composite) thisObj.getChildren().get(0)).isMaximumSizeSet());
//    Assert.assertNull(Reflector.getInstanceField(thisObj.getChildren().get(0), "peerFont"));
//    Assert.assertTrue(((Composite) thisObj.getChildren().get(0)).isVisible_NoClientCode());
//    Assert.assertEquals(0, ((Composite) thisObj.getChildren().get(0)).getWidth());
//    Assert.assertEquals(0, ((Composite) thisObj.getChildren().get(0)).getY());
//
//  }
//
//  // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull99943e473327586e766() {
//
//    // Act, creating object to test constructor
//    final Composite actual = new Composite();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    final ArrayList<Component> arrayList = new ArrayList<Component>();
//    Assert.assertEquals(arrayList, actual.getChildren());
//    Assert.assertNull(Reflector.getInstanceField(actual, "minSize"));
//    Assert.assertFalse(actual.getIgnoreRepaint());
//    Assert.assertNull(Reflector.getInstanceField(actual, "foreground"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "locale"));
//    Assert.assertTrue(actual.getFocusTraversalKeysEnabled());
//    Assert.assertEquals(4096L, Reflector.getInstanceField(actual, "eventMask"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "font"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "cursor"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "maxSize"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "background"));
//    Assert.assertTrue(actual.isEnabledImpl());
//    Assert.assertFalse((boolean) Reflector.getInstanceField(actual, "newEventsOnly"));
//    Assert.assertEquals(0, actual.getHeight());
//    Assert.assertNull(actual.getDropTarget());
//    Assert.assertNull(Reflector.getInstanceField(actual, "focusTraversalKeys"));
//    Assert.assertEquals(0, actual.getX());
//    Assert.assertFalse((boolean) Reflector.getInstanceField(actual, "isPacked"));
//    Assert.assertNull(actual.getAccessibleContext());
//    Assert.assertFalse(actual.isMinimumSizeSet());
//    Assert.assertNull(Reflector.getInstanceField(actual, "popups"));
//    Assert.assertNull(Reflector.getInstanceField(actual, "prefSize"));
//    Assert.assertTrue(actual.isAutoFocusTransferOnDisposal());
//    Assert.assertFalse(actual.isPreferredSizeSet());
//    Assert.assertFalse(actual.isMaximumSizeSet());
//    Assert.assertNull(Reflector.getInstanceField(actual, "peerFont"));
//    Assert.assertTrue(actual.isVisible_NoClientCode());
//    Assert.assertEquals(0, actual.getWidth());
//    Assert.assertEquals(0, actual.getY());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getChildrenOutput0999a9799caae812650f() {

    // Arrange
    final Composite thisObj = new Composite();

    // Act
    final ArrayList<Component> actual = thisObj.getChildren();

    // Assert result
    final ArrayList<Component> arrayList = new ArrayList<Component>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputNotNullOutputVoid999a7fb6f4694380ab9() {

    // Arrange
    final Composite thisObj = new Composite();
    final Composite arg0 = new Composite();

    // Act
    thisObj.remove(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
