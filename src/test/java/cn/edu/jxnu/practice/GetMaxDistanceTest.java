package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.GetMaxDistance.Result;
import cn.edu.jxnu.practice.GetMaxDistance;
import cn.edu.jxnu.practice.TreeNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class GetMaxDistanceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c4f26d936d1b43c3() {

    // Act, creating object to test constructor
    final GetMaxDistance actual = new GetMaxDistance();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaximumDistanceInputNotNullOutputNotNull999aea17d40fc7377e1() {

    // Arrange
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final Result actual = GetMaxDistance.getMaximumDistance(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.maxDepth);

  }

  // Test written by Diffblue Cover
  @Test
  public void TreeDepthInputNotNullOutputPositive99983e4b0f147eac243() {

    // Arrange
    final GetMaxDistance thisObj = new GetMaxDistance();
    final TreeNode arg0 = new TreeNode(0);

    // Act
    final int actual = thisObj.TreeDepth(arg0);

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991cf0240b76eccce9() {

    // Act, creating object to test constructor
    final Result actual = new Result();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.maxDepth);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveOutputNotNull99910cce037863bcbd7() {

    // Arrange
    final int arg0 = 1;

    // Act, creating object to test constructor
    final Result actual = new Result(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.maxDepth);

  }
}
