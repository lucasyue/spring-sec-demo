package cn.design.behavior.observer;

public interface Subject {
	public void notifyObserver();

	public void addObserver(Observer ob1);

	public void delObserver(Observer ob2);

	public void operator();
}
