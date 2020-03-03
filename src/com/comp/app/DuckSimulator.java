package com.comp.app;

import com.comp.adapter.Goose;
import com.comp.adapter.GooseAdapter;
import com.comp.behaviroal.DuckCall;
import com.comp.behaviroal.MallardDuck;
import com.comp.behaviroal.Quackable;
import com.comp.behaviroal.RedHeadDuck;
import com.comp.behaviroal.RubberDuck;
import com.comp.composite.Flock;
import com.comp.decorator.QuackCounter;
import com.comp.factory.AbstractDuckFactory;
import com.comp.factory.CountingDuckFactory;
import com.comp.observer.Quackologist;
 
public class DuckSimulator {
	
	
	// in existing hierarchy if we want to add one property without changing it we go for decorator.  -- Decorator Pattern
	// we use geese in place of duck without going for a separate geese hierarchy as geese do same activity of duck. 
		//  so we can use geese in place of duck. -- Adapter Pattern
	// move all the duck creation inside factory. based on duck creation logic different types of factory. 
		// if one duck created then we use factory method. If multiple ducks created then use abstract factory. -- Abstract Factory and Factory Method 
	//to manage flock of ducks not ducks individually. Treat collection of ducks in same way as individual duck. -- Composite Pattern
	
	//keep track of individual duck in real time. -- Observer
	

	public static void main(String[] args) {		
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckfactory = new CountingDuckFactory();
		simulator.simulate(duckfactory);
	}

	private void simulate(AbstractDuckFactory duckfactory) {
		
		
		Quackable redheadduck = duckfactory.createRedHeadDuck();
		Quackable duckcall = duckfactory.createDuckCall();
		Quackable rubberduck = duckfactory.createRubberDuck();
		Quackable gooseduck = new GooseAdapter(new Goose());
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadduck);
		flockOfDucks.add(duckcall);
		flockOfDucks.add(rubberduck);
		flockOfDucks.add(gooseduck);
		
		Flock flockOfMallard = new Flock();
		
		Quackable mallardOne = duckfactory.createMallardDuck() ; 
		Quackable mallardTwo = duckfactory.createMallardDuck() ; 
		Quackable mallardThree = duckfactory.createMallardDuck() ; 
		Quackable mallardFour = duckfactory.createMallardDuck() ; 
		
		flockOfMallard.add(mallardOne);
		flockOfMallard.add(mallardTwo);
		flockOfMallard.add(mallardThree);
		flockOfMallard.add(mallardFour);
		
		flockOfDucks.add(flockOfMallard);
		
		System.out.println("Duck Simulator with Observer");
		Quackologist quackologist = new  Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		
		System.out.println("Whole Flock Simulation ");		
		simulate(flockOfDucks);
		
		System.out.println("Mallard Flock Simulation ");
		simulate(flockOfMallard);
		
		
		System.out.println("ducks quacks count: "+QuackCounter.getQuackCount());
	}

	private void simulate(Quackable duck) {
		duck.quack();		
	}

}
