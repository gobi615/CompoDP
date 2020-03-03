package com.comp.factory;

import com.comp.behaviroal.DuckCall;
import com.comp.behaviroal.MallardDuck;
import com.comp.behaviroal.Quackable;
import com.comp.behaviroal.RedHeadDuck;
import com.comp.behaviroal.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}

}
