package com.comp.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.comp.behaviroal.Quackable;
import com.comp.observer.Observer;

public class Flock implements Quackable {

	List<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> it = quackers.iterator();
		while(it.hasNext()) {
			Quackable quacker = it.next();
			quacker.quack();
		}

	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> it = quackers.iterator();
		while(it.hasNext()) {
			Quackable quacker = it.next();
			quacker.registerObserver(observer);
		}
		
	}

	@Override
	public void notifyObservers() {	}

}
