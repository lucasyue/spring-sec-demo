package cn.design.structure.bridge;
//抽象和实现独立分开，独立变化
public abstract class Bridge {
	private Source source;

	public void method() {
		source.method();
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}
}
