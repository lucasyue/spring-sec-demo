package cn.design.behavior.iterator;

public interface Collection {
	public Iterator iterator();

	public boolean hasNext();

	Iterator next();

	Iterator first();
}
