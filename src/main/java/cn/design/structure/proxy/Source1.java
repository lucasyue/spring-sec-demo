package cn.design.structure.proxy;

import cn.design.structure.bridge.Source;

public class Source1 implements Source {

	@Override
	public void method() {
		System.out.println(" do method ");
	}

}
