package cn.design.behavior.visitor;

public class MySubject implements Subject {

	@Override
	public void accept(Vistor vistor) {
		vistor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
