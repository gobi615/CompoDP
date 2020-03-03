package com.comp.factory;

import com.comp.behaviroal.DuckCall;
import com.comp.behaviroal.MallardDuck;
import com.comp.behaviroal.Quackable;
import com.comp.behaviroal.RedHeadDuck;
import com.comp.behaviroal.RubberDuck;
import com.comp.decorator.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RubberDuck());
	}

}
