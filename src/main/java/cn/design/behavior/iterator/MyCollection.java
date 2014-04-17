package cn.design.behavior.iterator;

public class MyCollection implements Collection {
	private Object[] arrays = {};
	private int size = 0;
	
	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public Iterator first() {
		return (Iterator) (arrays.length > 0 ? arrays[0] : null);
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Iterator next() {
		return null;
	}

	public void add(Object o) {
		arrays[size++] = o;
	}

}
