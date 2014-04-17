package cn.design.threadpool;

public class ThreadTest {
	public static void main(String[] args) {

	}

	class Thread1 extends Thread {

	}
}

class A {
	static A a;
	private A() {
	}

	public static A getInstance() {
		synchronized (a) {
			if (a == null) {
				a = new A();
				System.out.println("111");
			}
		}
		return a;
	}
}
