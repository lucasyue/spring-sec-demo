package cn.design.behavior.visitor;

public class MyVistor implements Vistor {

	@Override
	public void visit(Subject subject) {
		System.out.println(subject.getSubject());
	}

}
