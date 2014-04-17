package cn.design.behavior.interpreter;

public class Context {
	private double numb1;
	private double numb2;

	public Context(double numb1, double numb2) {
		this.numb1 = numb1;
		this.numb2 = numb2;
	}

	public double getNumb1() {
		return numb1;
	}

	public void setNumb1(double numb1) {
		this.numb1 = numb1;
	}

	public double getNumb2() {
		return numb2;
	}

	public void setNumb2(double numb2) {
		this.numb2 = numb2;
	}

}
