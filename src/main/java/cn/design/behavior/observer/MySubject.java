package cn.design.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements Subject {
	List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.watch();
		}
	}

	@Override
	public void addObserver(Observer ob1) {
		observers.add(ob1);
	}

	@Override
	public void delObserver(Observer ob2) {
		observers.remove(ob2);
	}

	public void operator() {
		System.out.println("do something");
		notifyObserver();
	}
}
