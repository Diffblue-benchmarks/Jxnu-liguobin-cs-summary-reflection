package cn.edu.jxnu.practice.test;

import cn.edu.jxnu.practice.StringDisplacement;
import org.junit.Assert;
import org.junit.Test;

public class StringDisplacement_test {

	@Test
	public void testStringDisplacement2() {
		Assert.assertFalse(StringDisplacement.stringDisplacement2(null, ""));
		Assert.assertFalse(StringDisplacement.stringDisplacement2("", null));
		Assert.assertFalse(
				StringDisplacement.stringDisplacement2("2", "a/b/c"));

		Assert.assertTrue(StringDisplacement.stringDisplacement2("1", "1"));
	}

	@Test
	public void stringDisplacement() {
		Assert.assertFalse(StringDisplacement.stringDisplacement(null, ""));
		Assert.assertFalse(StringDisplacement.stringDisplacement("", null));
		Assert.assertFalse(
				StringDisplacement.stringDisplacement("2", "a/b/c"));

		Assert.assertTrue(StringDisplacement.stringDisplacement("1", "1"));
	}
}
