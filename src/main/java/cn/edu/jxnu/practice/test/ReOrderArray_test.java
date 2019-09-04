package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.ReOrderArray;
import org.junit.Assert;
import org.junit.Test;

public class ReOrderArray_test {

	@Test
	public void testReOrderArray3() {
		int[] array = {9, 0, -2, 9, 5};
		new ReOrderArray().reOrderArray3(array);

		Assert.assertArrayEquals(new int[] {9, 9, 5, 0, -2}, array);

		array = null;
		new ReOrderArray().reOrderArray3(array);

		Assert.assertNull(array);
	}

	@Test
	public void testReOrderArray2() {
		int[] array = {9, 0, -2, 9, 5};
		new ReOrderArray().reOrderArray2(array);

		Assert.assertArrayEquals(new int[] {9, 9, 5, 0, -2}, array);

		array = new int[0];
		new ReOrderArray().reOrderArray2(array);

		Assert.assertArrayEquals(new int[0], array);
	}

	@Test
	public void testReOrderArray() {
		int[] array = {9, 0, -2, 9, 5};
		new ReOrderArray().reOrderArray(array);

		Assert.assertArrayEquals(new int[] {9, 9, 5, 0, -2}, array);

		array = new int[0];
		new ReOrderArray().reOrderArray(array);

		Assert.assertArrayEquals(new int[0], array);
	}
}
