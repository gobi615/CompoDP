package com.comp.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
	
	List<Observer> observers = new ArrayList();
	QuackObservable duck = null;

	
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			Observer obs = it.next();
			obs.update(duck);
		}
	}

	

}
