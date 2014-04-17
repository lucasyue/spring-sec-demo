package cn.design.behavior.visitor;

public interface Subject {
	void accept(Vistor vistor);

	String getSubject();
}
