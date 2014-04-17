package cn.design.behavior.template;
//供用户自定义实现
public abstract class AbstractTemplate {

	public final int calculate(String str) {
		String[] array = split(str, ",");
		return calculate(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
	}

	public final String[] split(String str, String pat) {
		return str.split(pat);
	}

	abstract int calculate(int a, int b);
}
