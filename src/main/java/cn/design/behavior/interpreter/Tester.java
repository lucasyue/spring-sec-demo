package cn.design.behavior.interpreter;

import org.junit.Assert;
import org.junit.Test;

public class Tester {
	@Test
	public void test() {
		// calculat 8.0+7.2-9.1
		double rs = new Minus().interpreter(new Context(new Plus()
				.interpreter(new Context(8.0, 7.2)), 9.1));
		Assert.assertTrue(rs == 6.1);
	}
}
