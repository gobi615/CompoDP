package com.comp.behaviroal;

import com.comp.observer.Observable;
import com.comp.observer.Observer;

public class RedHeadDuck implements Quackable{
	
	Observable observable = null;

	public RedHeadDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		
	}

}
