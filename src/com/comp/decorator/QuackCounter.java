package com.comp.decorator;

import com.comp.behaviroal.Quackable;
import com.comp.observer.Observable;
import com.comp.observer.Observer;

public class QuackCounter implements Quackable{
	
	Quackable duck = null;
	private static int numberOfQuack;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
		numberOfQuack = 0;
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuack++;
		notifyObservers();
	}
	
	public static int getQuackCount() {
		return numberOfQuack;
	}

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
		
	}

}
