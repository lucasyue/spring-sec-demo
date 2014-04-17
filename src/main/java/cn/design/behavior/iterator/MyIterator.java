package cn.design.behavior.iterator;

public class MyIterator implements Iterator {
	private Collection coll = new MyCollection();

	@Override
	public Object next() {
		return coll.next();
	}

	@Override
	public boolean hasNext() {
		return false;
	}

}
