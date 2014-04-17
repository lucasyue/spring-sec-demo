package cn.design.structure.proxy;

import cn.design.structure.bridge.Source;

public class Proxy implements Source {
	private Source1 source;

	Proxy() {
		super();
		this.source = new Source1();
	}

	@Override
	public void method() {
		System.out.println("before proxy...");
		source.method();
		System.out.println("after proxy...");
	}

}
