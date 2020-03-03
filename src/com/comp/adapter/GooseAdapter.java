package com.comp.adapter;

import com.comp.behaviroal.Quackable;
import com.comp.observer.Observable;
import com.comp.observer.Observer;

public class GooseAdapter implements Quackable{
	
	Observable observable = null;

	public GooseAdapter() {
		this.observable = new Observable(this);
	}
	
	Goose goose = null;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
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
